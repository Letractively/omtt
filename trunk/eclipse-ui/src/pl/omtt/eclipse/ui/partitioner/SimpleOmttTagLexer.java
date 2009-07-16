// $ANTLR 3.1.2 /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g 2009-07-14 17:27:15

package pl.omtt.eclipse.ui.partitioner;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SimpleOmttTagLexer extends Lexer {
    public static final int TAG_END=7;
    public static final int NEWLINE=12;
    public static final int TAG_SINGLE=5;
    public static final int RIGHT_DATA_PAREN=9;
    public static final int LETTER=13;
    public static final int DATA_PAREN=10;
    public static final int HIDDEN_CHAR=15;
    public static final int WHITESPACE=16;
    public static final int HIDDEN_SYMBOL=14;
    public static final int LEFT_DATA_PAREN=8;
    public static final int EXPRESSION_NEWLINE=11;
    public static final int TAG_INNER=6;
    public static final int EOF=-1;
    public static final int TAG=4;

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


    // delegates
    // delegators

    public SimpleOmttTagLexer() {;} 
    public SimpleOmttTagLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SimpleOmttTagLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g"; }

    // $ANTLR start "TAG"
    public final void mTAG() throws RecognitionException {
        try {
            int _type = TAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:23:5: ( '%' )
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:23:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TAG"

    // $ANTLR start "TAG_SINGLE"
    public final void mTAG_SINGLE() throws RecognitionException {
        try {
            int _type = TAG_SINGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:24:12: ( '%%' )
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:24:14: '%%'
            {
            match("%%"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TAG_SINGLE"

    // $ANTLR start "TAG_INNER"
    public final void mTAG_INNER() throws RecognitionException {
        try {
            int _type = TAG_INNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:26:11: ( 'in' | 'else' | 'case' | 'default' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt1=1;
                }
                break;
            case 'e':
                {
                alt1=2;
                }
                break;
            case 'c':
                {
                alt1=3;
                }
                break;
            case 'd':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:26:13: 'in'
                    {
                    match("in"); 


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:26:20: 'else'
                    {
                    match("else"); 


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:26:29: 'case'
                    {
                    match("case"); 


                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:26:38: 'default'
                    {
                    match("default"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TAG_INNER"

    // $ANTLR start "TAG_END"
    public final void mTAG_END() throws RecognitionException {
        try {
            int _type = TAG_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:27:9: ( 'end' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' | '\\r' '\\n' )? )
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:27:11: 'end' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' | '\\r' '\\n' )?
            {
            match("end"); 

            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:27:17: (~ ( '\\n' | '\\r' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:27:17: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:27:33: ( '\\n' | '\\r' | '\\r' '\\n' )?
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n') ) {
                alt3=1;
            }
            else if ( (LA3_0=='\r') ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='\n') ) {
                    alt3=3;
                }
            }
            switch (alt3) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:27:34: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:27:41: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:27:48: '\\r' '\\n'
                    {
                    match('\r'); 
                    match('\n'); 

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
    // $ANTLR end "TAG_END"

    // $ANTLR start "LEFT_DATA_PAREN"
    public final void mLEFT_DATA_PAREN() throws RecognitionException {
        try {
            int _type = LEFT_DATA_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:29:17: ( '{' )
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:29:19: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_DATA_PAREN"

    // $ANTLR start "RIGHT_DATA_PAREN"
    public final void mRIGHT_DATA_PAREN() throws RecognitionException {
        try {
            int _type = RIGHT_DATA_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:30:18: ( '}' )
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:30:20: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_DATA_PAREN"

    // $ANTLR start "DATA_PAREN"
    public final void mDATA_PAREN() throws RecognitionException {
        try {
            int _type = DATA_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:32:12: ( '\"' | '\\'' )
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:
            {
            if ( input.LA(1)=='\"'||input.LA(1)=='\'' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATA_PAREN"

    // $ANTLR start "EXPRESSION_NEWLINE"
    public final void mEXPRESSION_NEWLINE() throws RecognitionException {
        try {
            int _type = EXPRESSION_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:34:20: ( ( ':' | '=' ) ( '\\n' | '\\r' | '\\n' '\\r' ) )
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:34:22: ( ':' | '=' ) ( '\\n' | '\\r' | '\\n' '\\r' )
            {
            if ( input.LA(1)==':'||input.LA(1)=='=' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:34:32: ( '\\n' | '\\r' | '\\n' '\\r' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='\r') ) {
                    alt4=3;
                }
                else {
                    alt4=1;}
            }
            else if ( (LA4_0=='\r') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:34:33: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:34:40: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:34:47: '\\n' '\\r'
                    {
                    match('\n'); 
                    match('\r'); 

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
    // $ANTLR end "EXPRESSION_NEWLINE"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:35:9: ( '\\n' '\\r' | '\\n' | '\\r' )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='\r') ) {
                    alt5=1;
                }
                else {
                    alt5=2;}
            }
            else if ( (LA5_0=='\r') ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:35:11: '\\n' '\\r'
                    {
                    match('\n'); 
                    match('\r'); 

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:35:23: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:35:30: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "HIDDEN_CHAR"
    public final void mHIDDEN_CHAR() throws RecognitionException {
        try {
            int _type = HIDDEN_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:38:3: ( ( ( LETTER )+ | HIDDEN_SYMBOL ) )
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:38:5: ( ( LETTER )+ | HIDDEN_SYMBOL )
            {
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:38:5: ( ( LETTER )+ | HIDDEN_SYMBOL )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                alt7=1;
            }
            else if ( (LA7_0==':'||LA7_0=='=') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:38:6: ( LETTER )+
                    {
                    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:38:6: ( LETTER )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:38:6: LETTER
                    	    {
                    	    mLETTER(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:38:16: HIDDEN_SYMBOL
                    {
                    mHIDDEN_SYMBOL(); 

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
    // $ANTLR end "HIDDEN_CHAR"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:42:3: ( ( ' ' | '\\t' ) )
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:42:5: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "HIDDEN_SYMBOL"
    public final void mHIDDEN_SYMBOL() throws RecognitionException {
        try {
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:46:24: ( '=' | ':' )
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:
            {
            if ( input.LA(1)==':'||input.LA(1)=='=' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HIDDEN_SYMBOL"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:47:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    public void mTokens() throws RecognitionException {
        // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:1:8: ( TAG | TAG_SINGLE | TAG_INNER | TAG_END | LEFT_DATA_PAREN | RIGHT_DATA_PAREN | DATA_PAREN | EXPRESSION_NEWLINE | NEWLINE | HIDDEN_CHAR | WHITESPACE )
        int alt8=11;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:1:10: TAG
                {
                mTAG(); 

                }
                break;
            case 2 :
                // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:1:14: TAG_SINGLE
                {
                mTAG_SINGLE(); 

                }
                break;
            case 3 :
                // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:1:25: TAG_INNER
                {
                mTAG_INNER(); 

                }
                break;
            case 4 :
                // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:1:35: TAG_END
                {
                mTAG_END(); 

                }
                break;
            case 5 :
                // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:1:43: LEFT_DATA_PAREN
                {
                mLEFT_DATA_PAREN(); 

                }
                break;
            case 6 :
                // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:1:59: RIGHT_DATA_PAREN
                {
                mRIGHT_DATA_PAREN(); 

                }
                break;
            case 7 :
                // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:1:76: DATA_PAREN
                {
                mDATA_PAREN(); 

                }
                break;
            case 8 :
                // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:1:87: EXPRESSION_NEWLINE
                {
                mEXPRESSION_NEWLINE(); 

                }
                break;
            case 9 :
                // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:1:106: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 10 :
                // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:1:114: HIDDEN_CHAR
                {
                mHIDDEN_CHAR(); 

                }
                break;
            case 11 :
                // /home/endrju/.workspace/ObjectTemplates Eclipse UI/src/org/ot/eclipse/ui/partitioner/SimpleOtTagLexer.g:1:126: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\1\16\4\13\3\uffff\1\13\5\uffff\1\25\4\13\2\uffff\1\13\1"+
        "\34\2\13\1\25\1\34\1\uffff\1\25\3\13\1\25";
    static final String DFA8_eofS =
        "\42\uffff";
    static final String DFA8_minS =
        "\1\11\1\45\1\156\1\154\1\141\1\145\3\uffff\1\12\5\uffff\1\101\1"+
        "\163\1\144\1\163\1\146\2\uffff\1\145\1\101\1\145\1\141\2\101\1\uffff"+
        "\1\101\1\165\1\154\1\164\1\101";
    static final String DFA8_maxS =
        "\1\175\1\45\2\156\1\141\1\145\3\uffff\1\15\5\uffff\1\172\1\163\1"+
        "\144\1\163\1\146\2\uffff\1\145\1\172\1\145\1\141\2\172\1\uffff\1"+
        "\172\1\165\1\154\1\164\1\172";
    static final String DFA8_acceptS =
        "\6\uffff\1\5\1\6\1\7\1\uffff\1\11\1\12\1\13\1\2\1\1\5\uffff\1\10"+
        "\1\3\6\uffff\1\4\5\uffff";
    static final String DFA8_specialS =
        "\42\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\14\1\12\2\uffff\1\12\22\uffff\1\14\1\uffff\1\10\2\uffff\1"+
            "\1\1\uffff\1\10\22\uffff\1\11\2\uffff\1\11\3\uffff\32\13\4\uffff"+
            "\1\13\1\uffff\2\13\1\4\1\5\1\3\3\13\1\2\21\13\1\6\1\uffff\1"+
            "\7",
            "\1\15",
            "\1\17",
            "\1\20\1\uffff\1\21",
            "\1\22",
            "\1\23",
            "",
            "",
            "",
            "\1\24\2\uffff\1\24",
            "",
            "",
            "",
            "",
            "",
            "\32\13\4\uffff\1\13\1\uffff\32\13",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "",
            "\1\32",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\35",
            "\1\36",
            "\32\13\4\uffff\1\13\1\uffff\32\13",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\32\13\4\uffff\1\13\1\uffff\32\13",
            "\1\37",
            "\1\40",
            "\1\41",
            "\32\13\4\uffff\1\13\1\uffff\32\13"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( TAG | TAG_SINGLE | TAG_INNER | TAG_END | LEFT_DATA_PAREN | RIGHT_DATA_PAREN | DATA_PAREN | EXPRESSION_NEWLINE | NEWLINE | HIDDEN_CHAR | WHITESPACE );";
        }
    }
 

}