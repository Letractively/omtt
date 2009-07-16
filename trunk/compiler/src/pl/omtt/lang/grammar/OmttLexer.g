lexer grammar OmttLexer;

options {
  superClass = AbstractOmttLexer;
}

tokens {
  PROGRAM;
  HEADER;
  USE;
  USES;
  IMPORT;
  IMPORTS;
  
  CLASS;
  IDENT;
  ATOM_SELECT;
  PROPERTY_SELECT;
  TYPE_SELECT;
  SEQUENCE_SELECT;
  ITERATE;

  ARGUMENTS;
  ARGUMENT;
  RETURNS;

  BLOCK;
  IF_ELSE;
  CALL;
  CAST;

  SEQUENCE;
  STRING_LITERAL;
  INT_NUMBER;
  REAL_NUMBER;

  CONTENT;
  TAG_START;
  TAG_END;
  DATA_START;
  DATA_END;
  EXPRESSION_START;
  EXPRESSION_END;

	OP_DATA_IS_EXPRESSION;

  IT;
  ITEM;
}

@header {
package pl.omtt.lang.grammar;
}

@members {
  protected int getStringLiteralType () {
    return STRING_LITERAL;
  }
}

// Wlasciwa regula dla STRING_LITERAL zostala zakodowana w @lexer::members.
// Przyczyny leza w naturze ANTLR - zapis {insideData}? (~(...))*
// zupelnie oglupia generator.

COMMENT_SINGLE_LINE
  options{ k = 2; }
  : '//' ~('\n' | '\r')*
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
  : ('%' WS* 'end' NOT_NAME)=> '%' WS* 'end' (~('\n' | '\r'))*
    { $type = TAG_END;
      popBracket();
      popBracket('\%');
    }
  | '%'
    ( (WS* INNER_TAG_KEYWORD NOT_NAME) =>
        {popBracket(); dataOnNewline = 'd';}
    | /* standard opening tag */
        {dataOnNewline = 'd';}
    )
    { endOnNewline = true;
      pushBracket('\%');
    }
  | '%%'
    { $type = TAG_START;
      dataOnNewline = null;
      endOnNewline = true;
      pushBracket('\%');
    }
  ;

ACTION_ON_NEWLINE
  @after {dataOnNewline = null; endOnNewline = false;}
  : {endOnNewline}? NEWLINE
    { if (dataOnNewline != null) {
        pushBracket(dataOnNewline);
        $type = CONTENT;
      }
      else {
        popBracket('\%');
        $type = TAG_END;
      }
    }
  | NEWLINE /* white char */
    {
      if (insideBracket ('\%'))
        popBracket();
   		$channel = HIDDEN;
    }
  ;

OP_DATA_IS_RAW
  : ('$' NEWLINE) => '$'
  ;

STRING_PARENS
  : {!insideData()}?
    '"'
    {$type = DATA_START; pushBracket('"');}
  | {insideData()}?
    '"'
    {$type = DATA_END; popBracket('"');}
  ;

MODE_LEFT_PAREN
  : '{'
    {
      if (insideData()) {
        pushBracket('x');
        $type = EXPRESSION_START;
      } else {
        pushBracket('}');
        $type = DATA_START;
      }
    }
  ;
MODE_RIGHT_PAREN
  : '}'
    {
      if (insideData()) {
        popBracket('}');
        $type = DATA_END;
      } else {
        popBracket('x');
        $type = EXPRESSION_END;
      }
    }
  ;

MODULE   : 'module';
IMPORT   : 'import';
USE      : 'use';

DEF  : 'def';
AND  : 'and';
IN   : 'in';

IF   : 'if';
THEN : 'then';
ELSE : 'else';

MATCH   : 'match';
CASE    : 'case';
DEFAULT : 'default';

AS   : 'as';
IS   : 'is';

MAP    : 'map';
TO     : 'to';

NULL   : 'null';

LAMBDA : 'lambda';

TRUE  : 'true';
FALSE : 'false';

fragment INNER_TAG_KEYWORD : 'in' | 'else' | 'case' | 'default';
fragment SINGLE_TAG_KEYWORD : 'module' | 'use' | 'import';

OP_FUNCTION_DEFINITION : '->';

COLON
	: ( (':' NEWLINE) => ':'
			{	if (insideBracket('\%')) {
					$type = OP_DATA_IS_EXPRESSION;
					dataOnNewline = 'e';
				}
			}
		| ':'
		)
	;

SEMICOLON : ';';
DOT : '.';
COMA : ',';
SLASH : '/';
TILDE : '~';

LEFT_PAREN : '(';
RIGHT_PAREN : ')';
LEFT_SQUARE_PAREN : '[';
RIGHT_SQUARE_PAREN : ']';

OP_PLUS : '+';
OP_MINUS : '-';
OP_MULTIPLY : '*';
OP_MODULO : 'mod';

OP_EQUAL : '==';
OP_NOT_EQUAL : '!=';
OP_LEQ : '<=';
OP_LE : '<';
OP_GEQ : '>=';
OP_GE : '>';

OP_ASSIGN
	: ( ('=' NEWLINE) => '='
			{	if (insideBracket('\%')) {
					$type = OP_DATA_IS_EXPRESSION;
					dataOnNewline = 'e';
				}
			}
		| '='
		)
	;

OP_AND : '&' | '&&';
OP_OR  : 'or' | '||';
OP_XOR : 'xor';
OP_NOT : 'not';

OP_CONTEXT : '|';
OP_EXPRESSION_CONTEXT : '!';
OP_VIEW : '::';
OP_CONCAT : '^';

VAR_ID
  : (SMALL_LETTER | '_') NAMECHAR*
  ;
CLASS_ID
  : BIG_LETTER NAMECHAR*
  ;


INT_OR_REAL_NUMBER
  : DIGIT+
    ( '.' DIGIT+  {$type = REAL_NUMBER;}
    |             {$type = INT_NUMBER;}
    )
  ;

fragment INT_NUMBER : DIGIT+;
fragment REAL_NUMBER : DIGIT+ '.' DIGIT+;

fragment DIGIT
  : '0' .. '9'
  ;

fragment NAMECHAR
  : LETTER
  | DIGIT
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
fragment NOT_NAME
  : ~NAMECHAR | EOF
  ;
fragment NEWLINE
  : '\r' '\n'
  | '\r'
  | '\n'
  ;
