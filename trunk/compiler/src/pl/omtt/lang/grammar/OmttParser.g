parser grammar OmttParser;

options {
  output = AST;
  tokenVocab = OmttLexer;
  superClass = AbstractOmttParser;
}

@header {
package pl.omtt.lang.grammar;

import pl.omtt.lang.model.ast.*;
}

// START: program
program
  : header definitions? EOF
    -> ^(PROGRAM<Program> header? definitions?)
  ;
// END: program


// START: header
header
  : module_declaration?
    use_declarations
    import_declarations
  ;

module_declaration
  : TAG_START MODULE module_id TAG_END
    -> ^(MODULE<ModuleDeclaration>[$MODULE] module_id)
  ;
use_declarations
  : ((TAG_START (use_declaration) TAG_END)+)?
    -> ^(USES use_declaration+)?
  ;
import_declarations
  : ((TAG_START (import_declaration) TAG_END)+)?
    -> ^(IMPORTS import_declaration+)?
  ;

import_declaration 
  : IMPORT ec=external_class_name
    -> ^(IMPORT<ImportDeclaration>[$IMPORT] $ec)
  ;
use_declaration
  : USE module_id AS VAR_ID
    -> ^(USE<UseDeclaration>[$USE, $VAR_ID] module_id)
  ;

fragment external_class_name
  : (VAR_ID DOT!)* (CLASS_ID | OP_MULTIPLY)
  ;
fragment module_id
  : (VAR_ID DOT!)* VAR_ID
  ;
// END: header


// START: definitions
definitions
  : tag_definition+
    -> tag_definition+
  ;

tag_definition :
  TAG_START DEF definition_signature
  content=tag_content
  TAG_END
  -> ^(DEF<TemplateDefinition> definition_signature $content)
  ;

fragment definition_signature
  : (VAR_ID|DEFAULT) (OP_LE it=single_type OP_GE)? definition_argument* (OP_FUNCTION_DEFINITION ret_type=type)?
    -> VAR_ID<Ident>? DEFAULT<Ident>? $it? ^(ARGUMENTS definition_argument*) ^(RETURNS $ret_type?)
  ;

fragment definition_argument
  : TILDE? id=VAR_ID (OP_ASSIGN type | OP_MULTIPLY)?
    -> ^(ARGUMENT<TemplateArgument> IDENT<Ident>[$id] type? TILDE? OP_MULTIPLY?)
  ;
// END: definitions


// START: tag content
tag_content
  : CONTENT
    data_body_atom*
    -> ^(CONTENT<Data> data_body_atom*)
  | OP_DATA_IS_EXPRESSION CONTENT
    expression
    -> expression
  ;

data_body_atom
  : STRING_LITERAL<Literal>^
  | expression_inside_data
  | tag_inside_data
  ;

fragment expression_inside_data
  : EXPRESSION_START! expression EXPRESSION_END!
  ;

fragment tag_inside_data
  : def_in_tag
  | if_tag
  | call_tag
  | map_tag
  ;
// END: tag content


// START: expressions
expression
  : lambda_expression
  | def_in_expression
  | concatence_expression
  ;


// START: def-in block
def_in_expression
  : DEF definition+=definition_inside_expression
    (AND definition+=definition_inside_expression)*
    IN COLON? content=expression
    -> ^(BLOCK<Block> $definition+ $content)
  ;
definition_inside_expression
  : definition_signature COLON
    expression
    -> ^(DEF<TemplateDefinition> definition_signature expression)
  | VAR_ID OP_ASSIGN
  	expression
    -> ^(DEF<TemplateDefinition> VAR_ID<Ident> expression)
  ;

def_in_tag
  : TAG_START DEF definition+=definition_inside_tag
    (TAG_START AND definition+=definition_inside_tag)*
    TAG_START IN content=tag_content
    TAG_END
    -> ^(BLOCK<Block> $definition+ $content)
  ;
definition_inside_tag
  : definition_signature content=tag_content
    -> ^(DEF<TemplateDefinition> definition_signature $content)
  | VAR_ID OP_ASSIGN expression (CONTENT STRING_LITERAL?)?
    -> ^(DEF<TemplateDefinition> VAR_ID<Ident> expression)
  ;
// END: def-in block


// START: lambda expressions
lambda_expression
  : LAMBDA definition_argument* COLON expression
    -> ^(LAMBDA<LambdaExpression> ^(ARGUMENTS definition_argument*) expression)
  | definition_argument* OP_FUNCTION_DEFINITION expression
  	-> ^(LAMBDA<LambdaExpression> ^(ARGUMENTS definition_argument*) expression)
  ;
lambda_expression_no_context
  : LAMBDA definition_argument COLON atom_expression
  	-> ^(LAMBDA<LambdaExpression> ^(ARGUMENTS definition_argument*) atom_expression)
  | definition_argument* OP_FUNCTION_DEFINITION atom_expression
  	-> ^(LAMBDA<LambdaExpression> ^(ARGUMENTS definition_argument*) atom_expression)
  ;

fragment type
  : CLASS_ID OP_MULTIPLY?
  	-> ^(CLASS_ID<TypeReference> OP_MULTIPLY?)
  ;
fragment single_type
  : CLASS_ID
  	-> ^(CLASS_ID<TypeReference>)
	;
// END: template expressions


concatence_expression
  : (expr+=control_expression -> $expr)
    ((OP_CONCAT expr+=control_expression)+ -> ^(OP_CONCAT<Data> $expr+))?
  ;

control_expression
  : if_expression
  | map_expression
  | boolean_expression
  ;

if_expression
  : IF condition=boolean_expression COLON
    part_if=control_expression
    ELSE COLON?
    part_else=control_expression
    -> ^(IF_ELSE<IfElse> $condition $part_if $part_else)
  ;
if_tag
  : TAG_START!
  	if_subtag
    TAG_END!
  ;
fragment if_subtag
	: ( IF condition=boolean_expression
		  part_if=tag_content
		)
		( TAG_START ELSE
			(part_else=tag_content | subtag=if_subtag)
		)?
		-> ^(IF_ELSE<IfElse> $condition $part_if $part_else? $subtag?)
	;

map_expression
  : MAP iter=boolean_expression COLON
    expr=control_expression
    -> ^(MAP<Transformation> $iter $expr)
  ;
map_tag
  : TAG_START MAP iter=expression
    expr=tag_content
    TAG_END
    -> ^(MAP<Transformation> $iter $expr)
  ;

// BEGIN: boolean expressions
boolean_expression
	: boolean_binary_expression
	;
fragment boolean_binary_expression
  : boolean_unary_expression (boolean_binary_operator^ boolean_unary_expression)*
  ;
fragment boolean_unary_expression
  : boolean_unary_operator^ boolean_comparsion_expression
  | boolean_comparsion_expression
  ;

fragment boolean_binary_operator
  : OP_AND<BooleanExpression>^
  | OP_OR<BooleanExpression>^
  | OP_XOR<BooleanExpression>^
  ;
fragment boolean_unary_operator
  : OP_NOT<BooleanExpression>^
  ;

boolean_comparsion_expression
  : additive_expression (boolean_comparsion_operator^ additive_expression)*
  ;
fragment boolean_comparsion_operator
  : OP_EQUAL<BooleanExpression>^
  | OP_NOT_EQUAL<BooleanExpression>^
  | OP_LE<BooleanExpression>^
  | OP_LEQ<BooleanExpression>^
  | OP_GE<BooleanExpression>^
  | OP_GEQ<BooleanExpression>^
  ;
// END: boolean expressions
// END: wyrazenia

// START: arithmetic expressions
additive_expression
  : multiplicative_expression
    (
      ( OP_PLUS<ArithmeticExpression>^
      | OP_MINUS<ArithmeticExpression>^
      )
      multiplicative_expression
    )*
  ;

multiplicative_expression
  : negative_expression
    ( ( OP_MULTIPLY<ArithmeticExpression>^
      | SLASH<ArithmeticExpression>^
      | OP_MODULO<ArithmeticExpression>^
      )
      negative_expression
    )*
  ;

negative_expression
	: OP_MINUS context_expression
		-> ^(OP_MINUS<ArithmeticMinus> context_expression)
	| context_expression
	;
// END: arithmetic expressions

// START: transformation expressions
context_expression
  : (fe=functional_expression -> $fe)
    ( OP_CONTEXT atom_expression arguments=function_arguments
      -> ^(CALL<Call>[true] atom_expression ^(ARGUMENT<FunctionArgument> $context_expression) $arguments?)
    | OP_CONTEXT lambda_expression_no_context
      -> ^(CALL<Call>[true] lambda_expression_no_context ^(ARGUMENT<FunctionArgument> $context_expression))
    | OP_CONTEXT single_type
      -> ^(CAST<Cast> single_type $context_expression)
    | OP_EXPRESSION_CONTEXT ce=functional_expression
    	-> ^(OP_EXPRESSION_CONTEXT<Transformation> $context_expression $ce)
    )*
  ;
// END: transformation expressions

// START: functional expressions
functional_expression
  : call_expression
  ;

call_expression
  : atom_expression
    ( function_argument+
      -> ^(CALL<Call>[false] atom_expression function_argument+)
    | {/* no arguments */}
      -> ^(atom_expression)
    )
  ;
call_tag
  : TAG_START ident=namespace_id function_arguments
    (content=tag_content)?
    TAG_END
    -> ^(CALL<Call>[false] $ident ^(ARGUMENT<FunctionArgument> $content)? function_arguments?)
  ;
fragment function_arguments
  : function_argument*
  ;
fragment function_argument
  : (VAR_ID OP_ASSIGN)? atom_expression
    -> ^(ARGUMENT<FunctionArgument> atom_expression VAR_ID?)
  ;
// END: functional expressions

// START: atoms
atom_expression
	: (a=atom_with_properties -> $a)
	  ((COMA atom_with_properties)+ -> ^(SEQUENCE<Sequence> atom_with_properties+))?
  ;

atom_with_properties
  : (a=atom_with_selectors -> $a)
  	( ps=property_selector
  	  -> ^(PROPERTY_SELECT<PropertySelect> $atom_with_properties $ps)
  	)*
  ;
fragment atom_with_selectors
	: atom
		( sequence_selectors
			-> ^(ATOM_SELECT<AtomSelect> atom sequence_selectors?)
		| -> atom
		)
	;
fragment property_selector
  : DOT! VAR_ID sequence_selectors?
  ;
fragment sequence_selectors
	: type_selector sequence_selector? alias?
	| sequence_selector alias?
	| alias
	;
fragment type_selector
  : LEFT_SQUARE_PAREN type RIGHT_SQUARE_PAREN
  	-> ^(TYPE_SELECT type)
  ;
fragment sequence_selector
  : LEFT_SQUARE_PAREN boolean_expression RIGHT_SQUARE_PAREN
  	-> ^(SEQUENCE_SELECT boolean_expression)
  ;
fragment alias
	: AS VAR_ID
		-> ^(AS VAR_ID)
	;

data_expression
  : DATA_START data_body_atom* DATA_END
    -> ^(DATA_START<Data> data_body_atom*)
  ;

atom
	: selectable_atom
		(DOUBLE_DOT<Range>^ selectable_atom)?
	;

selectable_atom
  : object_atom
  | data_expression
  | namespace_id
  | LEFT_PAREN! expression RIGHT_PAREN!
  ;
fragment namespace_id
  : (ns=VAR_ID OP_VIEW)? id=VAR_ID
    -> ^(IDENT<Ident>[$id] $ns?)
  ;

// START: atom objects
object_atom
  : number_atom
  | STRING_LITERAL<Literal>^
  | (NULL<Literal>^ | TILDE<Literal>^) // both null
  | (TRUE<Literal>^ | FALSE<Literal>^)
  ;

number_atom
  : INT_NUMBER<Literal>^
  | REAL_NUMBER<Literal>^
  ;
// END: atom objects
// END: atoms
