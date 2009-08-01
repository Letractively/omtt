grammar TypeString;

options {
	output = AST;
}

tokens {
	FUNCTION;
	SCALAR;
	OPTIONAL = '~';
	SEQUENCE = '*';
	GENERIC;
	ARGUMENT;
}

@lexer::header {
package pl.omtt.lang.util;
}

@header {
package pl.omtt.lang.util;
}

@members {
	public static Tree parse(String string) throws RecognitionException {
		ANTLRStringStream stream = new ANTLRStringStream(string);
		TypeStringLexer lexer = new TypeStringLexer(stream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		TypeStringParser parser = new TypeStringParser(tokens);
		return (Tree) parser.root().getTree();
	}
}

root
	: type EOF!;

function
	: argument+ '->' ret=type
		-> $ret argument+
	;

argument
	: OPTIONAL? type
		-> ^(ARGUMENT type OPTIONAL?)
	;

type
	: CLASS_ID modifiers
		-> ^(SCALAR CLASS_ID modifiers?)
	| '(' function ')' modifiers
		-> ^(FUNCTION function modifiers?)
	;

modifiers
	: generic? sequence?
	;

generic
	: '[' INTEGER ']'
		-> ^(GENERIC INTEGER)
	;

sequence
	: SEQUENCE
	;

CLASS_ID
	: BIG_LETTER NAMECHAR*
	| '_'
	;

INTEGER : ('0'..'9')+;

fragment BIG_LETTER : 'A'..'Z';
fragment NAMECHAR   : 'a'..'z' | 'A'..'Z' | '0'..'9' | '$' | '_';

WS
  : (' ' | '\t' | '\n' | '\r' | '\u000C') {$channel = HIDDEN;}
  ;