// $ANTLR 3.1.2 /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g 2009-08-06 17:20:57

package pl.omtt.lang.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class OmttLexer extends AbstractOmttLexer {
    public static final int FUNCTION=28;
    public static final int CAST=24;
    public static final int OP_LE=92;
    public static final int INT_NUMBER=30;
    public static final int OP_REVERSE_FOLLOW=72;
    public static final int OP_AND=96;
    public static final int INT_OR_REAL_NUMBER=110;
    public static final int LETTER=111;
    public static final int OP_GEQ=93;
    public static final int OP_GE=94;
    public static final int EOF=-1;
    public static final int DOUBLE_DOT=77;
    public static final int TYPE=10;
    public static final int TUPLE=26;
    public static final int IMPORT=8;
    public static final int STRING_LITERAL=29;
    public static final int MODE_LEFT_PAREN=48;
    public static final int OP_MINUS=86;
    public static final int OP_NOT_EQUAL=90;
    public static final int RECORD=27;
    public static final int SEQUENCE_SELECT=15;
    public static final int VAR_ID=106;
    public static final int ARGUMENTS=18;
    public static final int NULL=66;
    public static final int ELSE=56;
    public static final int MATCH=61;
    public static final int SEMICOLON=75;
    public static final int CONTENT=32;
    public static final int MODE_RIGHT_PAREN=49;
    public static final int SINGLE_TAG_KEYWORD=70;
    public static final int DATA_START=35;
    public static final int EXPRESSION_START=37;
    public static final int NAMECHAR=105;
    public static final int SEQUENCE=25;
    public static final int INNER_TAG_KEYWORD=69;
    public static final int WS=44;
    public static final int OP_DATA=103;
    public static final int USES=7;
    public static final int REAL_NUMBER=31;
    public static final int LEFT_PAREN=81;
    public static final int IMPORTS=9;
    public static final int OP_EQUAL=89;
    public static final int CALL=23;
    public static final int OP_DATA_IS_EXPRESSION=39;
    public static final int USE=6;
    public static final int FUN=65;
    public static final int FALSE=68;
    public static final int STRING_PARENS=47;
    public static final int COMMENT_SINGLE_LINE=42;
    public static final int CLASS_ID=108;
    public static final int OP_CONCAT=101;
    public static final int SMALL_LETTER=104;
    public static final int APPLY=60;
    public static final int WHERE=62;
    public static final int DEF=51;
    public static final int OP_ASSIGN=95;
    public static final int OP_FOLLOW=71;
    public static final int OP_OR=97;
    public static final int EXPRESSION_END=38;
    public static final int ORDER=63;
    public static final int TYPE_SELECT=14;
    public static final int AND=52;
    public static final int DATA_END=36;
    public static final int IF_ELSE=22;
    public static final int IF=54;
    public static final int COMMENT_MULTI_LINE=43;
    public static final int AS=57;
    public static final int RIGHT_PAREN=82;
    public static final int BIG_LETTER=107;
    public static final int SLASH=79;
    public static final int IN=53;
    public static final int THEN=55;
    public static final int LEFT_SQUARE_PAREN=83;
    public static final int COMMA=78;
    public static final int IS=58;
    public static final int IT=40;
    public static final int TAG_START=33;
    public static final int ARGUMENT=19;
    public static final int RIGHT_SQUARE_PAREN=84;
    public static final int TILDE=80;
    public static final int OP_GENERAL=102;
    public static final int IDENT=11;
    public static final int OP_NOT=98;
    public static final int OP_DOUBLE_FOLLOW=73;
    public static final int DIGIT=109;
    public static final int HEADER=5;
    public static final int DOT=76;
    public static final int NOT_NAME=112;
    public static final int OP_MULTIPLY=87;
    public static final int RETURNS=20;
    public static final int BY=64;
    public static final int ITEM=41;
    public static final int OP_PLUS=85;
    public static final int ATOM_SELECT=12;
    public static final int MODULE=50;
    public static final int OP_VIEW=100;
    public static final int TRUE=67;
    public static final int OP_MODULO=88;
    public static final int COLON=74;
    public static final int ITERATE=16;
    public static final int TAG_END=34;
    public static final int NEWLINE=45;
    public static final int BLOCK=21;
    public static final int PROPERTY_SELECT=13;
    public static final int MAP=59;
    public static final int OP_CONTEXT=99;
    public static final int ACTION_ON_NEWLINE=46;
    public static final int PROGRAM=4;
    public static final int OP_LEQ=91;
    public static final int LAMBDA_MATCH=17;

      protected int getStringLiteralType () {
        return STRING_LITERAL;
      }


    // delegates
    // delegators

    public OmttLexer() {;} 
    public OmttLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public OmttLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g"; }

    // $ANTLR start "COMMENT_SINGLE_LINE"
    public final void mCOMMENT_SINGLE_LINE() throws RecognitionException {
        try {
            int _type = COMMENT_SINGLE_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:75:3: ( '//' (~ ( '\\n' | '\\r' ) )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:75:5: '//' (~ ( '\\n' | '\\r' ) )*
            {
            match("//"); if (state.failed) return ;

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:75:10: (~ ( '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:75:10: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               _channel = HIDDEN; 
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT_SINGLE_LINE"

    // $ANTLR start "COMMENT_MULTI_LINE"
    public final void mCOMMENT_MULTI_LINE() throws RecognitionException {
        try {
            int _type = COMMENT_MULTI_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:81:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:81:5: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); if (state.failed) return ;

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:81:10: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:81:37: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("*/"); if (state.failed) return ;

            if ( state.backtracking==0 ) {
               _channel = HIDDEN; 
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT_MULTI_LINE"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:86:3: ( '\\'' ( options {greedy=false; } : . )* '\\'' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:86:5: '\\'' ( options {greedy=false; } : . )* '\\''
            {
            match('\''); if (state.failed) return ;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:86:10: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\'') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:86:37: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\''); if (state.failed) return ;
            if ( state.backtracking==0 ) {
              setText(getText().substring(1, getText().length() - 1));
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "TAG_START"
    public final void mTAG_START() throws RecognitionException {
        try {
            int _type = TAG_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:91:3: ( ( '%' ( WS )* 'end' NOT_NAME )=> '%' ( WS )* 'end' (~ ( '\\n' | '\\r' ) )* | '%' ( ( ( WS )* INNER_TAG_KEYWORD NOT_NAME )=> | ) | '%%' )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='%') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='%') ) {
                    alt7=3;
                }
                else if ( (LA7_1=='\t'||LA7_1=='\f'||LA7_1==' ') && (synpred1_OmttLexer())) {
                    alt7=1;
                }
                else if ( (LA7_1=='e') && (synpred1_OmttLexer())) {
                    alt7=1;
                }
                else {
                    alt7=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:91:5: ( '%' ( WS )* 'end' NOT_NAME )=> '%' ( WS )* 'end' (~ ( '\\n' | '\\r' ) )*
                    {
                    match('%'); if (state.failed) return ;
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:91:36: ( WS )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\t'||LA4_0=='\f'||LA4_0==' ') ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:91:36: WS
                    	    {
                    	    mWS(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match("end"); if (state.failed) return ;

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:91:46: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:91:47: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       _type = TAG_END;
                            popBracket();
                            popBracket('%');
                          
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:96:5: '%' ( ( ( WS )* INNER_TAG_KEYWORD NOT_NAME )=> | )
                    {
                    match('%'); if (state.failed) return ;
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:97:5: ( ( ( WS )* INNER_TAG_KEYWORD NOT_NAME )=> | )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (synpred2_OmttLexer()) ) {
                        alt6=1;
                    }
                    else if ( (true) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:97:7: ( ( WS )* INNER_TAG_KEYWORD NOT_NAME )=>
                            {
                            if ( state.backtracking==0 ) {
                              popBracket(); dataOnNewline = 'd';
                            }

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:100:9: 
                            {
                            if ( state.backtracking==0 ) {
                              pushBracket('%'); dataOnNewline = 'd';
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       endOnNewline = true; 
                    }

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:103:5: '%%'
                    {
                    match("%%"); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                       _type = TAG_START;
                            dataOnNewline = null;
                            endOnNewline = true;
                            pushBracket('%');
                          
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TAG_START"

    // $ANTLR start "ACTION_ON_NEWLINE"
    public final void mACTION_ON_NEWLINE() throws RecognitionException {
        try {
            int _type = ACTION_ON_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:113:3: ({...}? NEWLINE | NEWLINE )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                int LA8_1 = input.LA(2);

                if ( ((endOnNewline)) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0=='\n') ) {
                int LA8_2 = input.LA(2);

                if ( ((endOnNewline)) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:113:5: {...}? NEWLINE
                    {
                    if ( !((endOnNewline)) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "ACTION_ON_NEWLINE", "endOnNewline");
                    }
                    mNEWLINE(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       if (dataOnNewline != null) {
                              pushBracket(dataOnNewline);
                              _type = CONTENT;
                            }
                            else {
                              popBracket('%');
                              _type = TAG_END;
                            }
                          
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:123:5: NEWLINE
                    {
                    mNEWLINE(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                            if (insideBracket ('%'))
                              popBracket();
                         		_channel = HIDDEN;
                          
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              dataOnNewline = null; endOnNewline = false;
            }    }
        finally {
        }
    }
    // $ANTLR end "ACTION_ON_NEWLINE"

    // $ANTLR start "STRING_PARENS"
    public final void mSTRING_PARENS() throws RecognitionException {
        try {
            int _type = STRING_PARENS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:132:3: ({...}? '\"' | {...}? '\"' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                int LA9_1 = input.LA(2);

                if ( ((!insideData())) ) {
                    alt9=1;
                }
                else if ( ((insideData())) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:132:5: {...}? '\"'
                    {
                    if ( !((!insideData())) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "STRING_PARENS", "!insideData()");
                    }
                    match('\"'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = DATA_START; pushBracket('"');
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:135:5: {...}? '\"'
                    {
                    if ( !((insideData())) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "STRING_PARENS", "insideData()");
                    }
                    match('\"'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = DATA_END; popBracket('"');
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_PARENS"

    // $ANTLR start "MODE_LEFT_PAREN"
    public final void mMODE_LEFT_PAREN() throws RecognitionException {
        try {
            int _type = MODE_LEFT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:141:3: ( '{' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:141:5: '{'
            {
            match('{'); if (state.failed) return ;
            if ( state.backtracking==0 ) {

                    if (insideData()) {
                      pushBracket('x');
                      _type = EXPRESSION_START;
                    } else {
                      pushBracket('}');
                      _type = DATA_START;
                    }
                  
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODE_LEFT_PAREN"

    // $ANTLR start "MODE_RIGHT_PAREN"
    public final void mMODE_RIGHT_PAREN() throws RecognitionException {
        try {
            int _type = MODE_RIGHT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:153:3: ( '}' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:153:5: '}'
            {
            match('}'); if (state.failed) return ;
            if ( state.backtracking==0 ) {

                    if (insideData()) {
                      popBracket('}');
                      _type = DATA_END;
                    } else {
                      popBracket('x');
                      _type = EXPRESSION_END;
                    }
                  
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODE_RIGHT_PAREN"

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:165:10: ( 'module' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:165:12: 'module'
            {
            match("module"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODULE"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:166:10: ( 'import' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:166:12: 'import'
            {
            match("import"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "USE"
    public final void mUSE() throws RecognitionException {
        try {
            int _type = USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:167:10: ( 'use' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:167:12: 'use'
            {
            match("use"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USE"

    // $ANTLR start "DEF"
    public final void mDEF() throws RecognitionException {
        try {
            int _type = DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:169:6: ( 'def' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:169:8: 'def'
            {
            match("def"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEF"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:170:6: ( 'and' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:170:8: 'and'
            {
            match("and"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:171:6: ( 'in' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:171:8: 'in'
            {
            match("in"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:173:6: ( 'if' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:173:8: 'if'
            {
            match("if"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:174:6: ( 'then' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:174:8: 'then'
            {
            match("then"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:175:6: ( 'else' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:175:8: 'else'
            {
            match("else"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:177:6: ( 'as' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:177:8: 'as'
            {
            match("as"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:178:6: ( 'is' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:178:8: 'is'
            {
            match("is"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "MAP"
    public final void mMAP() throws RecognitionException {
        try {
            int _type = MAP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:180:8: ( 'map' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:180:10: 'map'
            {
            match("map"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAP"

    // $ANTLR start "APPLY"
    public final void mAPPLY() throws RecognitionException {
        try {
            int _type = APPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:181:8: ( 'apply' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:181:10: 'apply'
            {
            match("apply"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "APPLY"

    // $ANTLR start "MATCH"
    public final void mMATCH() throws RecognitionException {
        try {
            int _type = MATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:182:8: ( 'match' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:182:10: 'match'
            {
            match("match"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MATCH"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:183:8: ( 'where' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:183:10: 'where'
            {
            match("where"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:184:8: ( 'order' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:184:10: 'order'
            {
            match("order"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:185:8: ( 'by' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:185:10: 'by'
            {
            match("by"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "FUN"
    public final void mFUN() throws RecognitionException {
        try {
            int _type = FUN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:187:8: ( 'fun' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:187:10: 'fun'
            {
            match("fun"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUN"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:189:8: ( 'null' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:189:10: 'null'
            {
            match("null"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:190:8: ( 'true' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:190:10: 'true'
            {
            match("true"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:191:8: ( 'false' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:191:10: 'false'
            {
            match("false"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "INNER_TAG_KEYWORD"
    public final void mINNER_TAG_KEYWORD() throws RecognitionException {
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:193:28: ( 'in' | 'and' | 'else' | 'case' | 'default' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt10=1;
                }
                break;
            case 'a':
                {
                alt10=2;
                }
                break;
            case 'e':
                {
                alt10=3;
                }
                break;
            case 'c':
                {
                alt10=4;
                }
                break;
            case 'd':
                {
                alt10=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:193:30: 'in'
                    {
                    match("in"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:193:37: 'and'
                    {
                    match("and"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:193:45: 'else'
                    {
                    match("else"); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:193:54: 'case'
                    {
                    match("case"); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:193:63: 'default'
                    {
                    match("default"); if (state.failed) return ;


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "INNER_TAG_KEYWORD"

    // $ANTLR start "SINGLE_TAG_KEYWORD"
    public final void mSINGLE_TAG_KEYWORD() throws RecognitionException {
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:194:29: ( 'module' | 'use' | 'import' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 'm':
                {
                alt11=1;
                }
                break;
            case 'u':
                {
                alt11=2;
                }
                break;
            case 'i':
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:194:31: 'module'
                    {
                    match("module"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:194:42: 'use'
                    {
                    match("use"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:194:50: 'import'
                    {
                    match("import"); if (state.failed) return ;


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "SINGLE_TAG_KEYWORD"

    // $ANTLR start "OP_FOLLOW"
    public final void mOP_FOLLOW() throws RecognitionException {
        try {
            int _type = OP_FOLLOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:196:19: ( '->' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:196:21: '->'
            {
            match("->"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_FOLLOW"

    // $ANTLR start "OP_REVERSE_FOLLOW"
    public final void mOP_REVERSE_FOLLOW() throws RecognitionException {
        try {
            int _type = OP_REVERSE_FOLLOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:197:19: ( '<-' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:197:21: '<-'
            {
            match("<-"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_REVERSE_FOLLOW"

    // $ANTLR start "OP_DOUBLE_FOLLOW"
    public final void mOP_DOUBLE_FOLLOW() throws RecognitionException {
        try {
            int _type = OP_DOUBLE_FOLLOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:198:19: ( '=>' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:198:21: '=>'
            {
            match("=>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_DOUBLE_FOLLOW"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:202:2: ( ( ( ':' NEWLINE )=> ':' | ':' ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:202:4: ( ( ':' NEWLINE )=> ':' | ':' )
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:202:4: ( ( ':' NEWLINE )=> ':' | ':' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==':') ) {
                int LA12_1 = input.LA(2);

                if ( (synpred3_OmttLexer()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:202:6: ( ':' NEWLINE )=> ':'
                    {
                    match(':'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      	if (insideBracket('%')) {
                      					_type = OP_DATA_IS_EXPRESSION;
                      					dataOnNewline = 'e';
                      				}
                      			
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:208:5: ':'
                    {
                    match(':'); if (state.failed) return ;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:212:11: ( ';' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:212:13: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:213:5: ( '.' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:213:7: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "DOUBLE_DOT"
    public final void mDOUBLE_DOT() throws RecognitionException {
        try {
            int _type = DOUBLE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:214:12: ( '..' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:214:14: '..'
            {
            match(".."); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:215:7: ( ',' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:215:9: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:216:7: ( '/' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:216:9: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:217:7: ( '~' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:217:9: '~'
            {
            match('~'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "LEFT_PAREN"
    public final void mLEFT_PAREN() throws RecognitionException {
        try {
            int _type = LEFT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:219:12: ( '(' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:219:14: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_PAREN"

    // $ANTLR start "RIGHT_PAREN"
    public final void mRIGHT_PAREN() throws RecognitionException {
        try {
            int _type = RIGHT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:220:13: ( ')' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:220:15: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_PAREN"

    // $ANTLR start "LEFT_SQUARE_PAREN"
    public final void mLEFT_SQUARE_PAREN() throws RecognitionException {
        try {
            int _type = LEFT_SQUARE_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:221:19: ( '[' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:221:21: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_SQUARE_PAREN"

    // $ANTLR start "RIGHT_SQUARE_PAREN"
    public final void mRIGHT_SQUARE_PAREN() throws RecognitionException {
        try {
            int _type = RIGHT_SQUARE_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:222:20: ( ']' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:222:22: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_SQUARE_PAREN"

    // $ANTLR start "OP_PLUS"
    public final void mOP_PLUS() throws RecognitionException {
        try {
            int _type = OP_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:224:9: ( '+' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:224:11: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_PLUS"

    // $ANTLR start "OP_MINUS"
    public final void mOP_MINUS() throws RecognitionException {
        try {
            int _type = OP_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:225:10: ( '-' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:225:12: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_MINUS"

    // $ANTLR start "OP_MULTIPLY"
    public final void mOP_MULTIPLY() throws RecognitionException {
        try {
            int _type = OP_MULTIPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:226:13: ( '*' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:226:15: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_MULTIPLY"

    // $ANTLR start "OP_MODULO"
    public final void mOP_MODULO() throws RecognitionException {
        try {
            int _type = OP_MODULO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:227:11: ( 'mod' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:227:13: 'mod'
            {
            match("mod"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_MODULO"

    // $ANTLR start "OP_EQUAL"
    public final void mOP_EQUAL() throws RecognitionException {
        try {
            int _type = OP_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:229:10: ( '==' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:229:12: '=='
            {
            match("=="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_EQUAL"

    // $ANTLR start "OP_NOT_EQUAL"
    public final void mOP_NOT_EQUAL() throws RecognitionException {
        try {
            int _type = OP_NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:230:14: ( '!=' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:230:16: '!='
            {
            match("!="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_NOT_EQUAL"

    // $ANTLR start "OP_LEQ"
    public final void mOP_LEQ() throws RecognitionException {
        try {
            int _type = OP_LEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:231:8: ( '<=' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:231:10: '<='
            {
            match("<="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_LEQ"

    // $ANTLR start "OP_LE"
    public final void mOP_LE() throws RecognitionException {
        try {
            int _type = OP_LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:232:7: ( '<' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:232:9: '<'
            {
            match('<'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_LE"

    // $ANTLR start "OP_GEQ"
    public final void mOP_GEQ() throws RecognitionException {
        try {
            int _type = OP_GEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:233:8: ( '>=' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:233:10: '>='
            {
            match(">="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_GEQ"

    // $ANTLR start "OP_GE"
    public final void mOP_GE() throws RecognitionException {
        try {
            int _type = OP_GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:234:7: ( '>' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:234:9: '>'
            {
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_GE"

    // $ANTLR start "OP_ASSIGN"
    public final void mOP_ASSIGN() throws RecognitionException {
        try {
            int _type = OP_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:237:2: ( ( ( '=' NEWLINE )=> '=' | '=' ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:237:4: ( ( '=' NEWLINE )=> '=' | '=' )
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:237:4: ( ( '=' NEWLINE )=> '=' | '=' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='=') ) {
                int LA13_1 = input.LA(2);

                if ( (synpred4_OmttLexer()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:237:6: ( '=' NEWLINE )=> '='
                    {
                    match('='); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      	if (insideBracket('%')) {
                      					_type = OP_DATA_IS_EXPRESSION;
                      					dataOnNewline = 'e';
                      				}
                      			
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:243:5: '='
                    {
                    match('='); if (state.failed) return ;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_ASSIGN"

    // $ANTLR start "OP_AND"
    public final void mOP_AND() throws RecognitionException {
        try {
            int _type = OP_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:247:8: ( '&' | '&&' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='&') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='&') ) {
                    alt14=2;
                }
                else {
                    alt14=1;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:247:10: '&'
                    {
                    match('&'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:247:16: '&&'
                    {
                    match("&&"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_AND"

    // $ANTLR start "OP_OR"
    public final void mOP_OR() throws RecognitionException {
        try {
            int _type = OP_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:248:8: ( 'or' | '||' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='o') ) {
                alt15=1;
            }
            else if ( (LA15_0=='|') ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:248:10: 'or'
                    {
                    match("or"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:248:17: '||'
                    {
                    match("||"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_OR"

    // $ANTLR start "OP_NOT"
    public final void mOP_NOT() throws RecognitionException {
        try {
            int _type = OP_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:249:8: ( 'not' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:249:10: 'not'
            {
            match("not"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_NOT"

    // $ANTLR start "OP_CONTEXT"
    public final void mOP_CONTEXT() throws RecognitionException {
        try {
            int _type = OP_CONTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:251:12: ( '|' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:251:14: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_CONTEXT"

    // $ANTLR start "OP_VIEW"
    public final void mOP_VIEW() throws RecognitionException {
        try {
            int _type = OP_VIEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:252:9: ( '::' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:252:11: '::'
            {
            match("::"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_VIEW"

    // $ANTLR start "OP_CONCAT"
    public final void mOP_CONCAT() throws RecognitionException {
        try {
            int _type = OP_CONCAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:253:11: ( '^' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:253:13: '^'
            {
            match('^'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_CONCAT"

    // $ANTLR start "OP_GENERAL"
    public final void mOP_GENERAL() throws RecognitionException {
        try {
            int _type = OP_GENERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:255:12: ( '_' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:255:14: '_'
            {
            match('_'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_GENERAL"

    // $ANTLR start "OP_DATA"
    public final void mOP_DATA() throws RecognitionException {
        try {
            int _type = OP_DATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:256:12: ( '$' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:256:14: '$'
            {
            match('$'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_DATA"

    // $ANTLR start "VAR_ID"
    public final void mVAR_ID() throws RecognitionException {
        try {
            int _type = VAR_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:259:3: ( ( SMALL_LETTER | '_' | '@' ) ( NAMECHAR )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:259:5: ( SMALL_LETTER | '_' | '@' ) ( NAMECHAR )*
            {
            if ( input.LA(1)=='@'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:259:32: ( NAMECHAR )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:259:32: NAMECHAR
            	    {
            	    mNAMECHAR(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR_ID"

    // $ANTLR start "CLASS_ID"
    public final void mCLASS_ID() throws RecognitionException {
        try {
            int _type = CLASS_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:262:3: ( BIG_LETTER ( NAMECHAR )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:262:5: BIG_LETTER ( NAMECHAR )*
            {
            mBIG_LETTER(); if (state.failed) return ;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:262:16: ( NAMECHAR )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:262:16: NAMECHAR
            	    {
            	    mNAMECHAR(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS_ID"

    // $ANTLR start "INT_OR_REAL_NUMBER"
    public final void mINT_OR_REAL_NUMBER() throws RecognitionException {
        try {
            int _type = INT_OR_REAL_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:266:3: ( ( DIGIT )+ ( ( '.' DIGIT )=> '.' ( DIGIT )+ | ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:266:5: ( DIGIT )+ ( ( '.' DIGIT )=> '.' ( DIGIT )+ | )
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:266:5: ( DIGIT )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:266:5: DIGIT
            	    {
            	    mDIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:267:5: ( ( '.' DIGIT )=> '.' ( DIGIT )+ | )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='.') && (synpred5_OmttLexer())) {
                alt20=1;
            }
            else {
                alt20=2;}
            switch (alt20) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:267:7: ( '.' DIGIT )=> '.' ( DIGIT )+
                    {
                    match('.'); if (state.failed) return ;
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:267:25: ( DIGIT )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:267:25: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    if ( state.backtracking==0 ) {
                      _type = REAL_NUMBER;
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:269:7: 
                    {
                    if ( state.backtracking==0 ) {
                      _type = INT_NUMBER;
                    }

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_OR_REAL_NUMBER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:274:3: ( '0' .. '9' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:274:5: '0' .. '9'
            {
            matchRange('0','9'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "NAMECHAR"
    public final void mNAMECHAR() throws RecognitionException {
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:278:3: ( LETTER | DIGIT | '_' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "NAMECHAR"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:284:3: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "BIG_LETTER"
    public final void mBIG_LETTER() throws RecognitionException {
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:288:3: ( 'A' .. 'Z' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:288:5: 'A' .. 'Z'
            {
            matchRange('A','Z'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "BIG_LETTER"

    // $ANTLR start "SMALL_LETTER"
    public final void mSMALL_LETTER() throws RecognitionException {
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:291:3: ( 'a' .. 'z' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:291:5: 'a' .. 'z'
            {
            matchRange('a','z'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "SMALL_LETTER"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:295:3: ( ( ' ' | '\\t' | '\\u000C' ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:295:5: ( ' ' | '\\t' | '\\u000C' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( state.backtracking==0 ) {
              _channel = HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NOT_NAME"
    public final void mNOT_NAME() throws RecognitionException {
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:298:3: (~ NAMECHAR | EOF )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>='\u0000' && LA21_0<='/')||(LA21_0>=':' && LA21_0<='@')||(LA21_0>='[' && LA21_0<='^')||LA21_0=='`'||(LA21_0>='{' && LA21_0<='\uFFFF')) ) {
                alt21=1;
            }
            else {
                alt21=2;}
            switch (alt21) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:298:5: ~ NAMECHAR
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='h')||(input.LA(1)>='j' && input.LA(1)<='\uFFFF') ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:298:17: EOF
                    {
                    match(EOF); if (state.failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "NOT_NAME"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:301:3: ( '\\r' '\\n' | '\\r' | '\\n' )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\r') ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1=='\n') ) {
                    alt22=1;
                }
                else {
                    alt22=2;}
            }
            else if ( (LA22_0=='\n') ) {
                alt22=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:301:5: '\\r' '\\n'
                    {
                    match('\r'); if (state.failed) return ;
                    match('\n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:302:5: '\\r'
                    {
                    match('\r'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:303:5: '\\n'
                    {
                    match('\n'); if (state.failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:8: ( COMMENT_SINGLE_LINE | COMMENT_MULTI_LINE | STRING_LITERAL | TAG_START | ACTION_ON_NEWLINE | STRING_PARENS | MODE_LEFT_PAREN | MODE_RIGHT_PAREN | MODULE | IMPORT | USE | DEF | AND | IN | IF | THEN | ELSE | AS | IS | MAP | APPLY | MATCH | WHERE | ORDER | BY | FUN | NULL | TRUE | FALSE | OP_FOLLOW | OP_REVERSE_FOLLOW | OP_DOUBLE_FOLLOW | COLON | SEMICOLON | DOT | DOUBLE_DOT | COMMA | SLASH | TILDE | LEFT_PAREN | RIGHT_PAREN | LEFT_SQUARE_PAREN | RIGHT_SQUARE_PAREN | OP_PLUS | OP_MINUS | OP_MULTIPLY | OP_MODULO | OP_EQUAL | OP_NOT_EQUAL | OP_LEQ | OP_LE | OP_GEQ | OP_GE | OP_ASSIGN | OP_AND | OP_OR | OP_NOT | OP_CONTEXT | OP_VIEW | OP_CONCAT | OP_GENERAL | OP_DATA | VAR_ID | CLASS_ID | INT_OR_REAL_NUMBER | WS )
        int alt23=66;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:10: COMMENT_SINGLE_LINE
                {
                mCOMMENT_SINGLE_LINE(); if (state.failed) return ;

                }
                break;
            case 2 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:30: COMMENT_MULTI_LINE
                {
                mCOMMENT_MULTI_LINE(); if (state.failed) return ;

                }
                break;
            case 3 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:49: STRING_LITERAL
                {
                mSTRING_LITERAL(); if (state.failed) return ;

                }
                break;
            case 4 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:64: TAG_START
                {
                mTAG_START(); if (state.failed) return ;

                }
                break;
            case 5 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:74: ACTION_ON_NEWLINE
                {
                mACTION_ON_NEWLINE(); if (state.failed) return ;

                }
                break;
            case 6 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:92: STRING_PARENS
                {
                mSTRING_PARENS(); if (state.failed) return ;

                }
                break;
            case 7 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:106: MODE_LEFT_PAREN
                {
                mMODE_LEFT_PAREN(); if (state.failed) return ;

                }
                break;
            case 8 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:122: MODE_RIGHT_PAREN
                {
                mMODE_RIGHT_PAREN(); if (state.failed) return ;

                }
                break;
            case 9 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:139: MODULE
                {
                mMODULE(); if (state.failed) return ;

                }
                break;
            case 10 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:146: IMPORT
                {
                mIMPORT(); if (state.failed) return ;

                }
                break;
            case 11 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:153: USE
                {
                mUSE(); if (state.failed) return ;

                }
                break;
            case 12 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:157: DEF
                {
                mDEF(); if (state.failed) return ;

                }
                break;
            case 13 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:161: AND
                {
                mAND(); if (state.failed) return ;

                }
                break;
            case 14 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:165: IN
                {
                mIN(); if (state.failed) return ;

                }
                break;
            case 15 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:168: IF
                {
                mIF(); if (state.failed) return ;

                }
                break;
            case 16 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:171: THEN
                {
                mTHEN(); if (state.failed) return ;

                }
                break;
            case 17 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:176: ELSE
                {
                mELSE(); if (state.failed) return ;

                }
                break;
            case 18 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:181: AS
                {
                mAS(); if (state.failed) return ;

                }
                break;
            case 19 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:184: IS
                {
                mIS(); if (state.failed) return ;

                }
                break;
            case 20 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:187: MAP
                {
                mMAP(); if (state.failed) return ;

                }
                break;
            case 21 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:191: APPLY
                {
                mAPPLY(); if (state.failed) return ;

                }
                break;
            case 22 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:197: MATCH
                {
                mMATCH(); if (state.failed) return ;

                }
                break;
            case 23 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:203: WHERE
                {
                mWHERE(); if (state.failed) return ;

                }
                break;
            case 24 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:209: ORDER
                {
                mORDER(); if (state.failed) return ;

                }
                break;
            case 25 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:215: BY
                {
                mBY(); if (state.failed) return ;

                }
                break;
            case 26 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:218: FUN
                {
                mFUN(); if (state.failed) return ;

                }
                break;
            case 27 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:222: NULL
                {
                mNULL(); if (state.failed) return ;

                }
                break;
            case 28 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:227: TRUE
                {
                mTRUE(); if (state.failed) return ;

                }
                break;
            case 29 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:232: FALSE
                {
                mFALSE(); if (state.failed) return ;

                }
                break;
            case 30 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:238: OP_FOLLOW
                {
                mOP_FOLLOW(); if (state.failed) return ;

                }
                break;
            case 31 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:248: OP_REVERSE_FOLLOW
                {
                mOP_REVERSE_FOLLOW(); if (state.failed) return ;

                }
                break;
            case 32 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:266: OP_DOUBLE_FOLLOW
                {
                mOP_DOUBLE_FOLLOW(); if (state.failed) return ;

                }
                break;
            case 33 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:283: COLON
                {
                mCOLON(); if (state.failed) return ;

                }
                break;
            case 34 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:289: SEMICOLON
                {
                mSEMICOLON(); if (state.failed) return ;

                }
                break;
            case 35 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:299: DOT
                {
                mDOT(); if (state.failed) return ;

                }
                break;
            case 36 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:303: DOUBLE_DOT
                {
                mDOUBLE_DOT(); if (state.failed) return ;

                }
                break;
            case 37 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:314: COMMA
                {
                mCOMMA(); if (state.failed) return ;

                }
                break;
            case 38 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:320: SLASH
                {
                mSLASH(); if (state.failed) return ;

                }
                break;
            case 39 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:326: TILDE
                {
                mTILDE(); if (state.failed) return ;

                }
                break;
            case 40 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:332: LEFT_PAREN
                {
                mLEFT_PAREN(); if (state.failed) return ;

                }
                break;
            case 41 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:343: RIGHT_PAREN
                {
                mRIGHT_PAREN(); if (state.failed) return ;

                }
                break;
            case 42 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:355: LEFT_SQUARE_PAREN
                {
                mLEFT_SQUARE_PAREN(); if (state.failed) return ;

                }
                break;
            case 43 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:373: RIGHT_SQUARE_PAREN
                {
                mRIGHT_SQUARE_PAREN(); if (state.failed) return ;

                }
                break;
            case 44 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:392: OP_PLUS
                {
                mOP_PLUS(); if (state.failed) return ;

                }
                break;
            case 45 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:400: OP_MINUS
                {
                mOP_MINUS(); if (state.failed) return ;

                }
                break;
            case 46 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:409: OP_MULTIPLY
                {
                mOP_MULTIPLY(); if (state.failed) return ;

                }
                break;
            case 47 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:421: OP_MODULO
                {
                mOP_MODULO(); if (state.failed) return ;

                }
                break;
            case 48 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:431: OP_EQUAL
                {
                mOP_EQUAL(); if (state.failed) return ;

                }
                break;
            case 49 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:440: OP_NOT_EQUAL
                {
                mOP_NOT_EQUAL(); if (state.failed) return ;

                }
                break;
            case 50 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:453: OP_LEQ
                {
                mOP_LEQ(); if (state.failed) return ;

                }
                break;
            case 51 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:460: OP_LE
                {
                mOP_LE(); if (state.failed) return ;

                }
                break;
            case 52 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:466: OP_GEQ
                {
                mOP_GEQ(); if (state.failed) return ;

                }
                break;
            case 53 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:473: OP_GE
                {
                mOP_GE(); if (state.failed) return ;

                }
                break;
            case 54 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:479: OP_ASSIGN
                {
                mOP_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 55 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:489: OP_AND
                {
                mOP_AND(); if (state.failed) return ;

                }
                break;
            case 56 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:496: OP_OR
                {
                mOP_OR(); if (state.failed) return ;

                }
                break;
            case 57 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:502: OP_NOT
                {
                mOP_NOT(); if (state.failed) return ;

                }
                break;
            case 58 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:509: OP_CONTEXT
                {
                mOP_CONTEXT(); if (state.failed) return ;

                }
                break;
            case 59 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:520: OP_VIEW
                {
                mOP_VIEW(); if (state.failed) return ;

                }
                break;
            case 60 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:528: OP_CONCAT
                {
                mOP_CONCAT(); if (state.failed) return ;

                }
                break;
            case 61 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:538: OP_GENERAL
                {
                mOP_GENERAL(); if (state.failed) return ;

                }
                break;
            case 62 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:549: OP_DATA
                {
                mOP_DATA(); if (state.failed) return ;

                }
                break;
            case 63 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:557: VAR_ID
                {
                mVAR_ID(); if (state.failed) return ;

                }
                break;
            case 64 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:564: CLASS_ID
                {
                mCLASS_ID(); if (state.failed) return ;

                }
                break;
            case 65 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:573: INT_OR_REAL_NUMBER
                {
                mINT_OR_REAL_NUMBER(); if (state.failed) return ;

                }
                break;
            case 66 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:1:592: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_OmttLexer
    public final void synpred1_OmttLexer_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:91:5: ( '%' ( WS )* 'end' NOT_NAME )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:91:6: '%' ( WS )* 'end' NOT_NAME
        {
        match('%'); if (state.failed) return ;
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:91:10: ( WS )*
        loop24:
        do {
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\t'||LA24_0=='\f'||LA24_0==' ') ) {
                alt24=1;
            }


            switch (alt24) {
        	case 1 :
        	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:91:10: WS
        	    {
        	    mWS(); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop24;
            }
        } while (true);

        match("end"); if (state.failed) return ;

        mNOT_NAME(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_OmttLexer

    // $ANTLR start synpred2_OmttLexer
    public final void synpred2_OmttLexer_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:97:7: ( ( WS )* INNER_TAG_KEYWORD NOT_NAME )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:97:8: ( WS )* INNER_TAG_KEYWORD NOT_NAME
        {
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:97:8: ( WS )*
        loop25:
        do {
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\t'||LA25_0=='\f'||LA25_0==' ') ) {
                alt25=1;
            }


            switch (alt25) {
        	case 1 :
        	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:97:8: WS
        	    {
        	    mWS(); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop25;
            }
        } while (true);

        mINNER_TAG_KEYWORD(); if (state.failed) return ;
        mNOT_NAME(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_OmttLexer

    // $ANTLR start synpred3_OmttLexer
    public final void synpred3_OmttLexer_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:202:6: ( ':' NEWLINE )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:202:7: ':' NEWLINE
        {
        match(':'); if (state.failed) return ;
        mNEWLINE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_OmttLexer

    // $ANTLR start synpred4_OmttLexer
    public final void synpred4_OmttLexer_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:237:6: ( '=' NEWLINE )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:237:7: '=' NEWLINE
        {
        match('='); if (state.failed) return ;
        mNEWLINE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_OmttLexer

    // $ANTLR start synpred5_OmttLexer
    public final void synpred5_OmttLexer_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:267:7: ( '.' DIGIT )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttLexer.g:267:8: '.' DIGIT
        {
        match('.'); if (state.failed) return ;
        mDIGIT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_OmttLexer

    public final boolean synpred5_OmttLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_OmttLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_OmttLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_OmttLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_OmttLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_OmttLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_OmttLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_OmttLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_OmttLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_OmttLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\1\uffff\1\57\6\uffff\14\51\1\106\1\111\1\114\1\116\1\uffff\1\120"+
        "\11\uffff\1\122\1\uffff\1\124\1\uffff\1\125\10\uffff\3\51\1\132"+
        "\1\133\1\134\3\51\1\140\5\51\1\123\1\147\4\51\21\uffff\1\155\1\156"+
        "\2\51\3\uffff\1\161\1\162\1\163\1\uffff\6\51\1\uffff\1\172\2\51"+
        "\1\175\1\51\2\uffff\2\51\3\uffff\1\51\1\u0082\1\u0083\1\u0084\2"+
        "\51\1\uffff\1\51\1\u0088\1\uffff\1\51\1\u008a\1\51\1\u008c\3\uffff"+
        "\1\u008d\1\u008e\1\u008f\1\uffff\1\u0090\1\uffff\1\u0091\6\uffff";
    static final String DFA23_eofS =
        "\u0092\uffff";
    static final String DFA23_minS =
        "\1\11\1\52\6\uffff\1\141\1\146\1\163\1\145\1\156\1\150\1\154\1\150"+
        "\1\162\1\171\1\141\1\157\1\76\1\55\1\75\1\72\1\uffff\1\56\11\uffff"+
        "\1\75\1\uffff\1\174\1\uffff\1\60\10\uffff\1\144\2\160\3\60\1\145"+
        "\1\146\1\144\1\60\1\160\1\145\1\165\1\163\1\145\2\60\1\156\2\154"+
        "\1\164\21\uffff\2\60\1\143\1\157\3\uffff\3\60\1\uffff\1\154\1\156"+
        "\2\145\1\162\1\145\1\uffff\1\60\1\163\1\154\1\60\1\154\2\uffff\1"+
        "\150\1\162\3\uffff\1\171\3\60\1\145\1\162\1\uffff\1\145\1\60\1\uffff"+
        "\1\145\1\60\1\164\1\60\3\uffff\3\60\1\uffff\1\60\1\uffff\1\60\6"+
        "\uffff";
    static final String DFA23_maxS =
        "\1\176\1\57\6\uffff\1\157\2\163\1\145\1\163\1\162\1\154\1\150\1"+
        "\162\1\171\2\165\1\76\1\75\1\76\1\72\1\uffff\1\56\11\uffff\1\75"+
        "\1\uffff\1\174\1\uffff\1\172\10\uffff\1\144\1\164\1\160\3\172\1"+
        "\145\1\146\1\144\1\172\1\160\1\145\1\165\1\163\1\145\2\172\1\156"+
        "\2\154\1\164\21\uffff\2\172\1\143\1\157\3\uffff\3\172\1\uffff\1"+
        "\154\1\156\2\145\1\162\1\145\1\uffff\1\172\1\163\1\154\1\172\1\154"+
        "\2\uffff\1\150\1\162\3\uffff\1\171\3\172\1\145\1\162\1\uffff\1\145"+
        "\1\172\1\uffff\1\145\1\172\1\164\1\172\3\uffff\3\172\1\uffff\1\172"+
        "\1\uffff\1\172\6\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\20\uffff\1\42\1\uffff\1\45\1\47"+
        "\1\50\1\51\1\52\1\53\1\54\1\56\1\61\1\uffff\1\67\1\uffff\1\74\1"+
        "\uffff\1\76\1\77\1\100\1\101\1\102\1\1\1\2\1\46\25\uffff\1\36\1"+
        "\55\1\37\1\62\1\63\1\40\1\60\1\66\1\73\1\41\1\44\1\43\1\64\1\65"+
        "\1\70\1\72\1\75\4\uffff\1\16\1\17\1\23\3\uffff\1\22\6\uffff\1\31"+
        "\5\uffff\1\57\1\24\2\uffff\1\13\1\14\1\15\6\uffff\1\32\2\uffff\1"+
        "\71\4\uffff\1\20\1\34\1\21\3\uffff\1\33\1\uffff\1\26\1\uffff\1\25"+
        "\1\27\1\30\1\35\1\11\1\12";
    static final String DFA23_specialS =
        "\u0092\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\54\1\4\1\uffff\1\54\1\4\22\uffff\1\54\1\42\1\5\1\uffff\1"+
            "\50\1\3\1\44\1\2\1\34\1\35\1\41\1\40\1\32\1\24\1\31\1\1\12\53"+
            "\1\27\1\30\1\25\1\26\1\43\1\uffff\1\51\32\52\1\36\1\uffff\1"+
            "\37\1\46\1\47\1\uffff\1\14\1\21\1\51\1\13\1\16\1\22\2\51\1\11"+
            "\3\51\1\10\1\23\1\20\4\51\1\15\1\12\1\51\1\17\3\51\1\6\1\45"+
            "\1\7\1\33",
            "\1\56\4\uffff\1\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\61\15\uffff\1\60",
            "\1\64\6\uffff\1\62\1\63\4\uffff\1\65",
            "\1\66",
            "\1\67",
            "\1\70\1\uffff\1\72\2\uffff\1\71",
            "\1\73\11\uffff\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\102\23\uffff\1\101",
            "\1\104\5\uffff\1\103",
            "\1\105",
            "\1\107\17\uffff\1\110",
            "\1\113\1\112",
            "\1\115",
            "",
            "\1\117",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\121",
            "",
            "\1\123",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\126",
            "\1\127\3\uffff\1\130",
            "\1\131",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\3\51\1\146\26\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\24\51\1\154\5\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\157",
            "\1\160",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\173",
            "\1\174",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\176",
            "",
            "",
            "\1\177",
            "\1\u0080",
            "",
            "",
            "",
            "\1\u0081",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0085",
            "\1\u0086",
            "",
            "\1\u0087",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0089",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u008b",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( COMMENT_SINGLE_LINE | COMMENT_MULTI_LINE | STRING_LITERAL | TAG_START | ACTION_ON_NEWLINE | STRING_PARENS | MODE_LEFT_PAREN | MODE_RIGHT_PAREN | MODULE | IMPORT | USE | DEF | AND | IN | IF | THEN | ELSE | AS | IS | MAP | APPLY | MATCH | WHERE | ORDER | BY | FUN | NULL | TRUE | FALSE | OP_FOLLOW | OP_REVERSE_FOLLOW | OP_DOUBLE_FOLLOW | COLON | SEMICOLON | DOT | DOUBLE_DOT | COMMA | SLASH | TILDE | LEFT_PAREN | RIGHT_PAREN | LEFT_SQUARE_PAREN | RIGHT_SQUARE_PAREN | OP_PLUS | OP_MINUS | OP_MULTIPLY | OP_MODULO | OP_EQUAL | OP_NOT_EQUAL | OP_LEQ | OP_LE | OP_GEQ | OP_GE | OP_ASSIGN | OP_AND | OP_OR | OP_NOT | OP_CONTEXT | OP_VIEW | OP_CONCAT | OP_GENERAL | OP_DATA | VAR_ID | CLASS_ID | INT_OR_REAL_NUMBER | WS );";
        }
    }
 

}