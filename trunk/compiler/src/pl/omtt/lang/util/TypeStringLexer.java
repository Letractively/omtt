// $ANTLR 3.1.2 /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g 2009-08-10 14:48:41

package pl.omtt.lang.util;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TypeStringLexer extends Lexer {
    public static final int INTEGER=13;
    public static final int FUNCTION=4;
    public static final int SMALL_LETTER=16;
    public static final int VAR_ID=10;
    public static final int GENERIC=8;
    public static final int T__24=24;
    public static final int LETTER=17;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int GENERIC_VAR=12;
    public static final int OPTIONAL=6;
    public static final int NAMECHAR=15;
    public static final int T__19=19;
    public static final int SEQUENCE=7;
    public static final int BIG_LETTER=14;
    public static final int WS=18;
    public static final int ARGUMENT=9;
    public static final int SCALAR=5;
    public static final int CLASS_ID=11;

    // delegates
    // delegators

    public TypeStringLexer() {;} 
    public TypeStringLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TypeStringLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g"; }

    // $ANTLR start "OPTIONAL"
    public final void mOPTIONAL() throws RecognitionException {
        try {
            int _type = OPTIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:7:10: ( '~' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:7:12: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPTIONAL"

    // $ANTLR start "SEQUENCE"
    public final void mSEQUENCE() throws RecognitionException {
        try {
            int _type = SEQUENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:8:10: ( '*' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:8:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEQUENCE"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:9:7: ( '->' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:9:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:10:7: ( '.' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:10:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:11:7: ( '(' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:12:7: ( ')' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:13:7: ( '[' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:13:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:14:7: ( ']' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:14:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "CLASS_ID"
    public final void mCLASS_ID() throws RecognitionException {
        try {
            int _type = CLASS_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:70:2: ( BIG_LETTER ( NAMECHAR )* | '_' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='A' && LA2_0<='Z')) ) {
                alt2=1;
            }
            else if ( (LA2_0=='_') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:70:4: BIG_LETTER ( NAMECHAR )*
                    {
                    mBIG_LETTER(); 
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:70:15: ( NAMECHAR )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='$'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:70:15: NAMECHAR
                    	    {
                    	    mNAMECHAR(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:71:4: '_'
                    {
                    match('_'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS_ID"

    // $ANTLR start "NAMECHAR"
    public final void mNAMECHAR() throws RecognitionException {
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:74:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '_' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "NAMECHAR"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:76:9: ( ( '0' .. '9' )+ )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:76:11: ( '0' .. '9' )+
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:76:11: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:76:12: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "GENERIC_VAR"
    public final void mGENERIC_VAR() throws RecognitionException {
        try {
            int _type = GENERIC_VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int l;

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:78:2: ( '`' l= ( 'a' .. 'z' ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:78:4: '`' l= ( 'a' .. 'z' )
            {
            match('`'); 
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:78:10: ( 'a' .. 'z' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:78:11: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

            setText(getText().substring(1));

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GENERIC_VAR"

    // $ANTLR start "VAR_ID"
    public final void mVAR_ID() throws RecognitionException {
        try {
            int _type = VAR_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:83:3: ( ( SMALL_LETTER | '_' | '@' ) ( NAMECHAR )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:83:5: ( SMALL_LETTER | '_' | '@' ) ( NAMECHAR )*
            {
            if ( input.LA(1)=='@'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:83:32: ( NAMECHAR )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='$'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:83:32: NAMECHAR
            	    {
            	    mNAMECHAR(); 

            	    }
            	    break;

            	default :
            	    break loop4;
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

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:87:3: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

    // $ANTLR start "BIG_LETTER"
    public final void mBIG_LETTER() throws RecognitionException {
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:91:3: ( 'A' .. 'Z' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:91:5: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "BIG_LETTER"

    // $ANTLR start "SMALL_LETTER"
    public final void mSMALL_LETTER() throws RecognitionException {
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:94:3: ( 'a' .. 'z' )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:94:5: 'a' .. 'z'
            {
            matchRange('a','z'); 

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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:98:3: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\u000C' ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:98:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\u000C' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:1:8: ( OPTIONAL | SEQUENCE | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | CLASS_ID | INTEGER | GENERIC_VAR | VAR_ID | WS )
        int alt5=13;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:1:10: OPTIONAL
                {
                mOPTIONAL(); 

                }
                break;
            case 2 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:1:19: SEQUENCE
                {
                mSEQUENCE(); 

                }
                break;
            case 3 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:1:64: CLASS_ID
                {
                mCLASS_ID(); 

                }
                break;
            case 10 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:1:73: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 11 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:1:81: GENERIC_VAR
                {
                mGENERIC_VAR(); 

                }
                break;
            case 12 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:1:93: VAR_ID
                {
                mVAR_ID(); 

                }
                break;
            case 13 :
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/util/TypeString.g:1:100: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\12\uffff\1\11\4\uffff";
    static final String DFA5_eofS =
        "\17\uffff";
    static final String DFA5_minS =
        "\1\11\11\uffff\1\44\4\uffff";
    static final String DFA5_maxS =
        "\1\176\11\uffff\1\172\4\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\1\13"+
        "\1\14\1\15";
    static final String DFA5_specialS =
        "\17\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\16\1\uffff\2\16\22\uffff\1\16\7\uffff\1\5\1\6\1\2\2\uffff"+
            "\1\3\1\4\1\uffff\12\13\6\uffff\1\15\32\11\1\7\1\uffff\1\10\1"+
            "\uffff\1\12\1\14\32\15\3\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\13\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32"+
            "\15",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( OPTIONAL | SEQUENCE | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | CLASS_ID | INTEGER | GENERIC_VAR | VAR_ID | WS );";
        }
    }
 

}