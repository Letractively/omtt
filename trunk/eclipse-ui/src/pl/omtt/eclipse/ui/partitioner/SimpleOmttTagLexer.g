lexer grammar SimpleOmttTagLexer;

@header {
package pl.omtt.eclipse.ui.partitioner;
}

@members {
@Override
public void reportError (RecognitionException e) {
}

@SuppressWarnings("unused")
/*
 * Just prevent from showing warnings in Antlr-generated code.
 * I's Antlr problem.
 */
private void supressWarnings () {
  Stack<Integer> stack;
  List<Integer> someList = new ArrayList<Integer>();
}
}

TAG : '%';
TAG_SINGLE : '%%';

TAG_INNER : 'in' | 'else' | 'case' | 'default';
TAG_END : 'end' ~('\n' | '\r')* ('\n' | '\r' | '\r' '\n')?;

LEFT_DATA_PAREN : '{';
RIGHT_DATA_PAREN : '}';

DATA_PAREN : '"' | '\'';

EXPRESSION_NEWLINE : (':'|'=') ('\n' | '\r' | '\n' '\r');
NEWLINE : '\n' '\r' | '\n' | '\r';

HIDDEN_CHAR
  : (LETTER+ | HIDDEN_SYMBOL)
  ;

WHITESPACE
  : (' ' | '\t')
    { skip(); }
  ;

fragment HIDDEN_SYMBOL : '=' | ':';
fragment LETTER : 'a' .. 'z' | 'A' .. 'Z' | '_';
