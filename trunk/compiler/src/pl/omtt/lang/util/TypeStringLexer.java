// $ANTLR 3.1.2 /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g 2009-07-24 01:29:12

package pl.omtt.lang.util;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TypeStringLexer extends Lexer {
    public static final int INTEGER=11;
    public static final int FUNCTION=4;
    public static final int GENERIC=8;
    public static final int EOF=-1;
    public static final int OPTIONAL=6;
    public static final int NAMECHAR=13;
    public static final int T__19=19;
    public static final int SEQUENCE=7;
    public static final int BIG_LETTER=12;
    public static final int T__16=16;
    public static final int WS=14;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int ARGUMENT=9;
    public static final int SCALAR=5;
    public static final int CLASS_ID=10;

    // delegates
    // delegators

    public TypeStringLexer() {;} 
    public TypeStringLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TypeStringLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g"; }

    // $ANTLR start "OPTIONAL"
    public final void mOPTIONAL() throws RecognitionException {
        try {
            int _type = OPTIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:7:10: ( '~' )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:7:12: '~'
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
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:8:10: ( '*' )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:8:12: '*'
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

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:9:7: ( '->' )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:9:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:10:7: ( '(' )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:10:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:11:7: ( ')' )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:11:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:12:7: ( '[' )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:12:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:13:7: ( ']' )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:13:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "CLASS_ID"
    public final void mCLASS_ID() throws RecognitionException {
        try {
            int _type = CLASS_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:68:2: ( BIG_LETTER ( NAMECHAR )* | '_' )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:68:4: BIG_LETTER ( NAMECHAR )*
                    {
                    mBIG_LETTER(); 
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:68:15: ( NAMECHAR )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='$'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:68:15: NAMECHAR
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:69:4: '_'
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

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:72:9: ( ( '0' .. '9' )+ )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:72:11: ( '0' .. '9' )+
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:72:11: ( '0' .. '9' )+
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
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:72:12: '0' .. '9'
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

    // $ANTLR start "BIG_LETTER"
    public final void mBIG_LETTER() throws RecognitionException {
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:74:21: ( 'A' .. 'Z' )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:74:23: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "BIG_LETTER"

    // $ANTLR start "NAMECHAR"
    public final void mNAMECHAR() throws RecognitionException {
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:75:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '_' )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:78:3: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\u000C' ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:78:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\u000C' )
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
        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:1:8: ( OPTIONAL | SEQUENCE | T__15 | T__16 | T__17 | T__18 | T__19 | CLASS_ID | INTEGER | WS )
        int alt4=10;
        switch ( input.LA(1) ) {
        case '~':
            {
            alt4=1;
            }
            break;
        case '*':
            {
            alt4=2;
            }
            break;
        case '-':
            {
            alt4=3;
            }
            break;
        case '(':
            {
            alt4=4;
            }
            break;
        case ')':
            {
            alt4=5;
            }
            break;
        case '[':
            {
            alt4=6;
            }
            break;
        case ']':
            {
            alt4=7;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
            {
            alt4=8;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt4=9;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt4=10;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;
        }

        switch (alt4) {
            case 1 :
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:1:10: OPTIONAL
                {
                mOPTIONAL(); 

                }
                break;
            case 2 :
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:1:19: SEQUENCE
                {
                mSEQUENCE(); 

                }
                break;
            case 3 :
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:1:58: CLASS_ID
                {
                mCLASS_ID(); 

                }
                break;
            case 9 :
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:1:67: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 10 :
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:1:75: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}