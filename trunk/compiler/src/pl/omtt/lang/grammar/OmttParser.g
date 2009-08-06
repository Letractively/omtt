parser grammar OmttParser;

options {
  output = AST;
  tokenVocab = OmttLexer;
  superClass = AbstractOmttParser;
  backtrack = true;
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
  : USE module_id (AS VAR_ID)?
    -> ^(USE<UseDeclaration>[$USE] ^(MODULE module_id) VAR_ID?)
  ;

fragment external_class_name
  : (VAR_ID DOT!)* (CLASS_ID | OP_GENERAL)
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
  : VAR_ID definition_context? definition_argument* (OP_FOLLOW ret_type=type)?
    -> VAR_ID<Ident> definition_context? ^(ARGUMENTS definition_argument*) ^(RETURNS $ret_type?)
  ;
fragment definition_context
	: LEFT_SQUARE_PAREN single_type where_clause? RIGHT_SQUARE_PAREN
		-> ^(ARGUMENT single_type where_clause?)
	;

fragment where_clause
	: WHERE! safe_expression
	;

fragment definition_argument
  : TILDE? id=VAR_ID OP_MULTIPLY? (DOT type)?
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
  | apply_tag
  ;
// END: tag content


// START: expressions
expression
  : def_in_expression
  | if_expression
  | map_expression
  | match_expression
  | function_expression
  | context_expression
  ;

safe_expression
  : safe_def_in_expression
  | safe_if_expression
  | safe_map_expression
  | strict_expression
  ;

// START: def-in block
def_in_expression
  : DEF definition+=definition_inside_expression
    (AND definition+=definition_inside_expression)*
    IN COLON? content=expression
    -> ^(BLOCK<Block> $definition+ $content)
  ;
safe_def_in_expression
  : DEF definition+=definition_inside_expression
    (AND definition+=definition_inside_expression)*
    IN COLON? content=safe_expression
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


// START: function expressions
function_expression
  : FUN definition_argument* COLON expression
    -> ^(FUN<FunExpression> ^(ARGUMENTS definition_argument*) expression)
  | definition_argument* OP_FOLLOW expression
  	-> ^(FUN<FunExpression> ^(ARGUMENTS definition_argument*) expression)
  | lambda_match_expression
  ;
fragment lambda_match_expression
	: single_lambda_match (SEMICOLON single_lambda_match)*
		-> ^(LAMBDA_MATCH<LambdaMatch> single_lambda_match+)
	;
fragment single_lambda_match
	: single_type where_clause? OP_FOLLOW safe_expression
		-> ^(ITEM<LambdaMatchItem> single_type safe_expression where_clause?)
	;

type
  : type_content OP_MULTIPLY?
  	-> ^(TYPE<TypeReference> type_content OP_MULTIPLY?)
  ;
single_type
  : type_content
  	-> ^(TYPE<TypeReference> type_content)
  ;

fragment type_content
  : CLASS_ID
  | OP_GENERAL
  | LEFT_PAREN argument_type+ OP_FOLLOW type RIGHT_PAREN
  	-> ^(FUNCTION type argument_type+)
  | LEFT_SQUARE_PAREN tuple_types+=type (COMMA tuple_types+=type)+ RIGHT_SQUARE_PAREN
		{reportNotImplemented("tuples");}
  	-> ^(TUPLE $tuple_types*)
  | LEFT_SQUARE_PAREN record_types+=record_item_type (COMMA record_types+=record_item_type)* RIGHT_SQUARE_PAREN
		{reportNotImplemented("records");}
  	-> ^(RECORD $record_types*)
	;
fragment argument_type
	: TILDE? (VAR_ID DOT)? type
		-> ^(ARGUMENT type VAR_ID? TILDE?)
	;
fragment record_item_type
	: VAR_ID DOT! type
	;
// END: template expressions


// START: control expressions
if_expression
  : IF condition=context_expression COLON
    part_if=expression
    ELSE COLON?
    part_else=expression
    -> ^(IF_ELSE<IfElse> $condition $part_if $part_else)
  ;
safe_if_expression
  : IF condition=context_expression COLON
    part_if=safe_expression
    ELSE COLON?
    part_else=safe_expression
    -> ^(IF_ELSE<IfElse> $condition $part_if $part_else)
  ;
if_tag
  : TAG_START!
  	if_subtag
    TAG_END!
  ;
fragment if_subtag
	: ( IF condition=context_expression
		  part_if=tag_content
		)
		( TAG_START ELSE
			(part_else=tag_content | subtag=if_subtag)
		)?
		-> ^(IF_ELSE<IfElse> $condition $part_if $part_else? $subtag?)
	;

map_expression
  : MAP item_alias? iter=context_expression COLON
    expr=expression
    -> ^(MAP<Transformation> $iter $expr item_alias?)
  ;
safe_map_expression
  : MAP item_alias? iter=context_expression COLON
    expr=safe_expression
    -> ^(MAP<Transformation> $iter $expr item_alias?)
  ;
map_tag
  : TAG_START MAP item_alias? iter=context_expression
    expr=tag_content
    TAG_END
    -> ^(MAP<Transformation> $iter $expr item_alias?)
  ;
// should be replaced by records in future
fragment item_alias
	: VAR_ID OP_REVERSE_FOLLOW
		-> ^(AS VAR_ID)
	;

match_expression
  : MATCH iter=context_expression COLON
    expr=lambda_match_expression
    -> ^(CALL<Call>[true] $expr ^(ARGUMENT<FunctionArgument> $iter))
  ;
// END: control expressions

// START: transformation expressions
context_expression
  : (base=strict_expression -> $base)
		( op_apply atom_expression arguments=function_arguments
      -> ^(CALL<Call>[true] atom_expression ^(ARGUMENT<FunctionArgument> $context_expression) $arguments?)
		| op_map ce=safe_expression
    	-> ^(op_map $context_expression $ce)
		| WHERE safe_expression
			-> ^(ATOM_SELECT<AtomSelect> $context_expression ^(SEQUENCE_SELECT safe_expression))
    | ORDER BY safe_expression
    	{ reportNotImplemented("order by operation"); }
    	-> ^(ORDER $context_expression safe_expression)
		| MATCH lambda_match_expression
    	-> ^(CALL<Call>[true] lambda_match_expression ^(ARGUMENT<FunctionArgument> $context_expression))
    )*
  ;
fragment op_apply
	: OP_CONTEXT^
	| APPLY^
	;
fragment op_map
	: MAP<Transformation>^
	;

apply_expression
	: APPLY atom_expression arguments=function_arguments
    -> ^(CALL<Call>[true] atom_expression ^(ARGUMENT<FunctionArgument> OP_GENERAL<Ident>) $arguments?)
	;

apply_tag
	: TAG_START! apply_expression TAG_END!
	;
// END: transformation expressions


strict_expression
	: concatence_expression
	| apply_expression
	;

concatence_expression
  : (expr+=boolean_expression -> $expr)
    ((OP_CONCAT expr+=boolean_expression)+ -> ^(OP_CONCAT<Data> $expr+))?
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
	: OP_MINUS functional_expression
		-> ^(OP_MINUS<ArithmeticMinus> functional_expression)
	| functional_expression
	;
// END: arithmetic expressions

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
  : TAG_START ident=namespace_id
  	(	(content=tag_content | args+=function_argument+ (content=tag_content)?)
			-> ^(CALL<Call>[false] $ident ^(ARGUMENT<FunctionArgument> $content)? $args*)
  	|	-> $ident
  	)
    TAG_END
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
  : (a=atom_with_selectors -> $a)
  	( DOT es=expression_select
  	  -> ^(DOT<Transformation> $atom_expression $es)
  	| DOT ps=property_select
  		-> ^(DOT<PropertySelect> $atom_expression $ps)
  	)*
  ;
fragment atom_with_selectors
	: atom
		( sequence_selectors
			-> ^(ATOM_SELECT<AtomSelect> atom sequence_selectors)
		| -> atom
		)
	;
fragment expression_select
	: object
		( sequence_selectors
			-> ^(ATOM_SELECT<AtomSelect> object sequence_selectors)
		| -> object
		)
	;
fragment property_select
	: VAR_ID sequence_selectors?
	;
fragment sequence_selectors
	: type_selector sequence_selector? alias?
	| sequence_selector alias?
	| alias
	;
fragment type_selector
  : DOT single_type
  	-> ^(TYPE_SELECT single_type)
  ;
fragment sequence_selector
  : LEFT_SQUARE_PAREN expression RIGHT_SQUARE_PAREN
  	-> ^(SEQUENCE_SELECT expression)
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
  : namespace_id
  | object
  ;
fragment object
	: object_atom
  | data_expression
	| tuple
  | record
  | LEFT_PAREN! sequence_expression RIGHT_PAREN!
	;

fragment namespace_id
  : (ns=VAR_ID OP_VIEW)? id=VAR_ID
    -> ^(IDENT<Ident>[$id] $ns?)
  | (ns=VAR_ID OP_VIEW)? id=OP_GENERAL
    -> ^(IDENT<Ident>[$id] $ns?)
  ;

tuple
	: LEFT_SQUARE_PAREN expr+=expression (COMMA expr+=expression)* RIGHT_SQUARE_PAREN
		{reportNotImplemented("tuples");}
		-> ^(TUPLE $expr+)
	;
record
	:	LEFT_SQUARE_PAREN expr+=record_item (COMMA expr+=record_item)* RIGHT_SQUARE_PAREN
	{reportNotImplemented("records");}
		-> ^(RECORD $expr*)
	;
fragment record_item
	: VAR_ID COLON! expression
	;

sequence_expression
	: (expr=expression -> $expr)
		( (COMMA rexpr+=expression)+
			-> ^(SEQUENCE<Sequence> $sequence_expression $rexpr+)
		|	-> $sequence_expression
		)
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
