grammar Omtt;

options {
  output = AST;
  superClass = xxx;
}

tokens {
  PROGRAM;
  HEADER;
  PACKAGE;
  USE;
  
  DEFINITIONS;
  ASSIGN;

  OBJECT;  
  CLASS;
  IDENT;
  SELECTORS;
  TEMPLATE;
  TRANSFORMATION;
  ARGUMENTS;
  ARGUMENT;

  EXPRESSION;
  BLOCK;
  IF_ELSE;
  CALL;
  CAST;
  
  DATA;
  STRING;
  HASH_ARRAY;
  ARRAY;
  ARRAY_ITEM; 
  INT_NUMBER;
  REAL_NUMBER;
  
  TAG_END;
  TAG_CLOSE;
}

@header {
package pl.omtt.lang;

import pl.omtt.lang.nodes.*;
}
@lexer::header {
package pl.omtt.lang;
}

@lexer::members {
  // Hash helper flags
  boolean dataOnNewline = false;
  boolean endOnNewline = false;

  public Stack<Character> brackets = new Stack<Character> ();
  
  boolean insideData () {
    if (brackets.empty())
      return false;
    switch(brackets.peek()) {
      case 'd':
      case ']':
      case '"':
        return true;
      default:
        return false;
    }
  }
  boolean insideData (char bracket) {
    return insideData() && insideBracket(bracket);
  }

  boolean insideBracket (char bracket) {
    return !brackets.empty() && brackets.peek() == bracket;
  }
  void pushBracket (char bracket) {
    brackets.push (bracket);
  }
  void popBracket () {
    brackets.pop();
  }

  private Character bracket () {
    return brackets.empty() ? null : brackets.peek();
  }

  void popBracket (char bracket) throws RecognitionException {
    if (brackets.empty() || bracket != brackets.peek()) {
    System.out.println(bracket);
    System.out.println(brackets.empty() ? "empty" : brackets.peek());
      // Proba zdjecia ze stosu nawiasu, ktorego na nim nie ma.
      // Przypomnienie: litera a oznacza nawias tablicy (zapis: '}'). 
      throw new UnmatchedBracketException (input, bracket == 'a' ? '}' : bracket);
    }
    brackets.pop();
  }

  final public boolean isDataCharacter (int c) {
    return c >= 0 && c != '%' && c != '{'
      && (c != brackets.peek() || (c >= 'a' && c <= 'z'));
  }

  public final void mFIXED_DATA_CONTENT() throws RecognitionException {
    int la = input.LA(1);
    state.text = "";
    do {
      if (la == '\\') {
        // znaki eskejpowane traktuj, jak normalne znaki
        matchAny(); if (state.failed) return;
        state.text += (char)input.LA(1);
        matchAny(); if (state.failed) return;
      } else {
        matchAny(); if (state.failed) return;
        state.text += (char)la;
      }
      la = input.LA(1);
    } while (isDataCharacter(la));

    state.type = STRING_LITERAL;
    state.channel = DEFAULT_TOKEN_CHANNEL;
  }

  @Override
  public Token nextToken() {
    while (true) {
      state.token = null;
      state.channel = Token.DEFAULT_CHANNEL;
      state.tokenStartCharIndex = input.index();
      state.tokenStartCharPositionInLine = input.getCharPositionInLine();
      state.tokenStartLine = input.getLine();
      state.text = null;
      if ( input.LA(1)==CharStream.EOF ) {
        return Token.EOF_TOKEN;
      }
      try {
        int la = input.LA(1);
        if (insideData() && isDataCharacter(la))
          mFIXED_DATA_CONTENT();
        else
          mTokens();

        if ( state.token==null ) {
          emit();
        }
        else if ( state.token==Token.SKIP_TOKEN ) {
          continue;
        }
        return state.token;
      }
      catch (NoViableAltException nva) {
        reportError(nva);
        recover(nva); // throw out current char and try again
      }
      catch (RecognitionException re) {
        reportError(re);
        // match() routine has already called recover()
      }
    }
  }  
}

// START: program
program
  : header definitions? EOF
    -> ^(PROGRAM header definitions?)
  ;
// END: program

// START: header
header :
  (package_declaration SEMICOLON)?
  ((import_declaration | use_declaration) SEMICOLON)*
    -> ^(HEADER package_declaration? import_declaration* use_declaration*)
  ;

package_declaration
  : PACKAGE package_id
    -> ^(PACKAGE<PackageDeclaration>[$PACKAGE] package_id)
  ;
import_declaration 
  : IMPORT ec=external_class
    -> ^(IMPORT<ImportDeclaration>[$IMPORT] $ec)
  ;
use_declaration
  : USE package_id AS VAR_ID
    -> ^(USE<UseDeclaration>[$USE, $VAR_ID] package_id)
  ;

fragment external_class
  : (VAR_ID DOT!)* (CLASS_ID | '*')
  ;
fragment package_id
  : (VAR_ID DOT!)* VAR_ID
  ;
// END: header


// START: definition
definitions
  : (LET definition SEMICOLON)+
    -> ^(DEFINITIONS definition+)
  ;

definition :
  definition_signature OP_ASSIGN expression
  -> ^(ASSIGN definition_signature expression)
  ;

fragment definition_signature
  : class_id OP_CONTEXT VAR_ID
    -> VAR_ID CLASS_ID
  | VAR_ID
    -> VAR_ID
  ;
// END: definition


// START: data tag
data_tag
  : DATA_LEFT_PAREN data_body_atom* DATA_RIGHT_PAREN
    -> ^(DATA data_body_atom*)
  ;
data_body_atom
  : STRING_LITERAL
  | expression_tag
  ;

fragment expression_tag
  : EXPRESSION_LEFT_PAREN! expression EXPRESSION_RIGHT_PAREN!
  ;
// END: data tag


// START: wyrazenia
expression
  : template_expression
  | let_in_expression
  | context_expression
  ;
expression_no_context
  : template_expression_no_context
  | let_in_expression_no_context
  | concatence_expression
  ;

// START: blok let-in
let_in_expression
  : LET definition (AND definition)* IN expression
    -> ^(BLOCK definition+ expression)
  ;
let_in_expression_no_context
  : LET definition (AND definition)* IN expression_no_context
    -> ^(BLOCK definition+ expression_no_context)
  ;
// END: blok let-in

// START: wyrazenia funkcji szablonow
template_expression
  : template_signature OP_FUNCTION_DEFINITION expression
    -> ^(template_signature expression)
  | CLASS_ID OP_CONTEXT expression
    -> ^(TRANSFORMATION CLASS_ID expression)
  ;
template_expression_no_context
  : template_signature OP_FUNCTION_DEFINITION expression_no_context 
    -> ^(template_signature expression_no_context)
  ;
template_signature
  : TEMPLATE template_argument*
    -> ^(TEMPLATE ^(ARGUMENTS template_argument*))
  ;
fragment template_argument
  : OP_OPTIONAL? VAR_ID (COLON argument)?
    -> ^(ARGUMENT VAR_ID OP_OPTIONAL? argument?)
  ;
fragment argument
  : class_id
  | LEFT_PAREN template_signature RIGHT_PAREN
  ;

fragment class_id
  : OP_ARRAY? CLASS_ID
  ;
// END: wyrazenia funkcji szablonow

// START: wyrazenie transformacji
context_expression
  : concatence_expression
    ( context_op^ expression_no_context  // transformacja
    | OP_CONTEXT^ CLASS_ID                      // rzutowanie typow
    )*
  ;
fragment context_op
  : OP_CONTEXT
  | OP_CONTEXT_ITERATE
  ;
// END: wyrazenie transformacji

concatence_expression
  : additive_expression
    ( (OP_CONCAT additive_expression)+
        -> ^(DATA additive_expression+)
    |   -> additive_expression
    )
  ;

additive_expression
  : multiplicative_expression (additive_op^ multiplicative_expression)*
  ;
fragment additive_op
  : OP_PLUS
  | OP_MINUS
  ;

multiplicative_expression
  : functional_expression (multiplicative_op^ functional_expression)*
  ;
fragment multiplicative_op
  : OP_MULTIPLY
  | SLASH
  | OP_MODULO
  ;

functional_expression
  : if_expression
  | call
  ;
fragment call
  : atom_expression
    ( function_arguments
      -> ^(CALL ^(atom_expression) function_arguments)
    | {/* no arguments */}
      -> ^(atom_expression)
    )
  ;
fragment function_arguments
  : function_argument+
    -> ^(ARGUMENTS ^(function_argument)+)
  ;
fragment function_argument
  : (OP_OPTIONAL? VAR_ID COLON)? atom_expression
    -> ^(ARGUMENT VAR_ID? atom_expression)
  ;

if_expression
  : IF boolean_expression THEN
    part_if=functional_expression
    ELSE
    part_else=functional_expression
    -> ^(IF_ELSE $part_if $part_else)
  ;

atom_expression
  : selectable_atom (selector+)?
    -> ^(selectable_atom (^(SELECTORS selector+))?)
  ;
selector
  : DOT! VAR_ID
  ;

fragment selectable_atom
  : object_atom
  | data_tag
  | namespace_id
  | LEFT_PAREN! expression RIGHT_PAREN!
  ;
fragment namespace_id
  : (ns=VAR_ID '::')? id=VAR_ID
    -> ^(IDENT $id $ns?)
  ;
// START: atom objects
object_atom
  : number_atom
  | array_atom
  | STRING_LITERAL^
  | NULL^
  ;

number_atom
  : INT_NUMBER^
  | REAL_NUMBER^
  ;

array_atom
  : ARRAY_LEFT_PAREN hash_array_item (COMA hash_array_item)* ARRAY_RIGHT_PAREN
    -> ^(HASH_ARRAY hash_array_item+)
  | ARRAY_LEFT_PAREN array_item? (COMA array_item)* ARRAY_RIGHT_PAREN
    -> ^(ARRAY array_item*)
  ;
hash_array_item
  : VAR_ID COLON expression
    -> ^(ARRAY_ITEM VAR_ID expression)
  ;
array_item
  : expression
    -> ^(ARRAY_ITEM expression)
  ;
// END: atom objects

// BEGIN: boolean expressions
boolean_expression
  : context_expression (boolean_operator^ context_expression)*
  ;
fragment boolean_operator
  : OP_EQUAL
  | OP_LE
  | OP_LEQ
  | OP_GE
  | OP_GEQ
  ;
// END: boolean expressions
// END: wyrazenia


// START: tokeny

// Wlasciwa regula dla STRING_LITERAL zostala zakodowana w @lexer::members.
// Przyczyny leza w naturze ANTLR - zapis {insideData}? (~(...))*
// zupelnie oglupia generator.

COMMENT_SINGLE_LINE
  options{ k = 2; }
  : '//' (options{greedy=false;}: .) NEWLINE
    { $channel = HIDDEN; }
  ;

COMMENT_MULTI_LINE
  options{ k = 2; }
  : '/*' (options{greedy = false;}: .)* '*/'
    { $channel = HIDDEN; }
  ;

STRING_LITERAL
  : '\'' (options{greedy = false;}: .)* '\''
    {setText($text.substring(1, $text.length() - 1));}
  ;

TAG_START
  : ('%' WS* 'end')=> '%' WS* 'end' (~('\n' | '\r'))*
    { $type = TAG_CLOSE;
      popBracket();
      popBracket('%');
    }
  | '%%'
  | '%'
    ( (WS* INNER_TAG_KEYWORD) =>
        {popBracket(); dataOnNewline = true;}
    | (WS* SINGLE_TAG_KEYWORD) =>
        {dataOnNewline = false;}
    | /* standard opening tag */
        {dataOnNewline = true;}
    )
    { endOnNewline = true;
      pushBracket('%');
    }
  ;

ACTION_ON_NEWLINE
  @after {dataOnNewline = endOnNewline = false;}
  : {endOnNewline}? NEWLINE
    { $type = TAG_END;
      if (dataOnNewline == true)
        pushBracket('d');
    }
  | NEWLINE /* white char */
    { $channel = HIDDEN;
      if (insideBracket ('%'))
        popBracket();
    }
  ;

DATA_LEFT_PAREN
  : '['
    {pushBracket(']');}
  ;
DATA_RIGHT_PAREN
  : ']'
    {popBracket(']');}
  ;
STRING_PARENS
  : {!insideData()}?
    '"'
    {$type = DATA_LEFT_PAREN; pushBracket('"');}
  | {insideData()}?
    '"'
    {$type = DATA_RIGHT_PAREN; popBracket('"');}
  ;

EXPRESSION_LEFT_PAREN
  : {insideData()}?
    '{'
    {pushBracket('}');}
  ;
EXPRESSION_RIGHT_PAREN
  : {insideBracket('}')}?
    '}'
    {popBracket('}');}
  ;

ARRAY_LEFT_PAREN
  : {!insideData()}?
    '{'
    {pushBracket('a');}
  ;
ARRAY_RIGHT_PAREN
  : {!insideBracket('}')}?
    '}'
    {popBracket('a');}
  ;

PACKAGE : 'package';
IMPORT  : 'import';

TEMPLATE : 'template';
FUNCTION : 'function';

USE  : 'use';
AS   : 'as';

LET  : 'let';
AND  : 'and';
IN   : 'in';
IF   : 'if';
THEN : 'then';
ELSE : 'else';
NULL : 'null';

fragment INNER_TAG_KEYWORD : 'in' | 'else';
fragment SINGLE_TAG_KEYWORD : 'space' | 'use' | 'import';

OP_FUNCTION_DEFINITION : '->';

SEMICOLON : ';';
COLON : ':';
DOT : '.';
COMA : ',';
SLASH : '/';

LEFT_PAREN : '(';
RIGHT_PAREN : ')';

OP_PLUS : '+';
OP_MINUS : '-';
OP_MULTIPLY : '*';
OP_MODULO : 'mod';

OP_EQUAL : '==';
OP_LEQ : '<=';
OP_LE : '<';
OP_GEQ : '>=';
OP_GE : '>';
OP_ASSIGN : '=';

OP_CONTEXT_ITERATE : '||';
OP_CONTEXT : '|';

OP_CONCAT : '~';

OP_OPTIONAL : '^';
OP_ARRAY : '@';

OP_DATA_IS_EXPRESSION : '!';
OP_DATA_IS_RAW : '$';

VAR_ID
  : (SMALL_LETTER | '_') NAMECHAR*
  ;
CLASS_ID
  : BIG_LETTER NAMECHAR*
  ;

fragment INT_NUMBER : DIGIT+;
fragment REAL_NUMBER : DIGIT+ '.' DIGIT+;

INT_OR_REAL_NUMBER
  : DIGIT+
    ( '.' DIGIT+  {$type = REAL_NUMBER;}
    |             {$type = INT_NUMBER;}
    )
  ;

fragment DIGIT
  : '0' .. '9'
  ;

fragment NAMECHAR
  : LETTER
  | DIGIT
  | '-'
  | '_'
  ;

fragment LETTER
  : 'a' .. 'z'
  | 'A' .. 'Z'
  ;
fragment BIG_LETTER
  : 'A' .. 'Z'
  ;
fragment SMALL_LETTER
  : 'a' .. 'z'
  ;

WS
  : (' ' | '\t' | '\u000C') {$channel = HIDDEN;}
  ;
fragment NEWLINE
  : '\r' '\n'
  | '\r'
  | '\n'
  ;

fragment NON_NEWLINE
  : ~('\n' | '\r')
  ;
// KONIEC: tokeny
