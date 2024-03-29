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
  
  TYPE;

  IDENT;
  ATOM_SELECT;
  PROPERTY_SELECT;
  TYPE_SELECT;
  SEQUENCE_SELECT;
  ITERATE;
  LAMBDA_MATCH;

  ARGUMENTS;
  ARGUMENT;
  RETURNS;

  BLOCK;
  IF_ELSE;
  CALL;
  CAST;

  SEQUENCE;
  TUPLE;
  RECORD;
  FUNCTION;
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
  
  INT_NUMBER;
  REAL_NUMBER;
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
        {pushBracket('\%'); dataOnNewline = 'd';}
    )
    { endOnNewline = true; }
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
		(	{insideData()}?=>
			'='
			{
				pushBracket('x');
				$type = EXPRESSION_START;
			}
		|	{
  	    if (insideData()) {
    	    pushBracket('f');
      	  $type = STRING_LITERAL;
	      } else {
  	      pushBracket('}');
    	    $type = DATA_START;
      	}
	    }
    )
  ;
MODE_RIGHT_PAREN
  : '}'
    {
      if (insideData()) {
				if(popBracket() == 'f')
					$type = STRING_LITERAL;
				else
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

DEF      : 'def';
PARTIAL  : 'partial';
TOO      : 'too';
IN       : 'in';

IF   : 'if';
THEN : 'then';
ELSE : 'else';

AS   : 'as';
IS   : 'is';

MAP    : 'map';
APPLY  : 'apply';
MATCH  : 'match';
WHERE  : 'where';
ORDER  : 'order';
BY     : 'by';

FUN    : 'fun';

NULL   : 'null';
TRUE   : 'true';
FALSE  : 'false';

fragment INNER_TAG_KEYWORD : 'in' | 'too' | 'else' | 'case' | 'default';
fragment SINGLE_TAG_KEYWORD : 'module' | 'use' | 'import';

OP_FOLLOW         : '->';
OP_REVERSE_FOLLOW : '<-';
OP_DOUBLE_FOLLOW  : '=>';


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
DOUBLE_DOT : '..';
COMMA : ',';
SLASH : '/';
TILDE : '~';
QUESTION_MARK : '?';

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

OP_AND : 'and' | '&&';
OP_OR  : 'or' | '||';
OP_NOT : 'not';

OP_CONTEXT : '|';
OP_VIEW : '::';
OP_CONCAT : '^';

OP_GENERAL : '_';
OP_DATA    : '$';

VAR_ID
  : (SMALL_LETTER | '_' | '@') NAMECHAR*
  ;
CLASS_ID
  : BIG_LETTER NAMECHAR*
  ;

INT_OR_REAL_NUMBER
  : DIGIT+
    ( ('.' DIGIT)=> '.' DIGIT+
    	{$type = REAL_NUMBER;}
    | {$type = INT_NUMBER;}
    )
  ;

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
