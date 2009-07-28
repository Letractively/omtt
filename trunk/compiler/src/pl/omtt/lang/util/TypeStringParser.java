// $ANTLR 3.1.2 /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g 2009-07-28 04:12:40

package pl.omtt.lang.util;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

@SuppressWarnings("all")
public class TypeStringParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCTION", "SCALAR", "OPTIONAL", "SEQUENCE", "GENERIC", "ARGUMENT", "CLASS_ID", "INTEGER", "BIG_LETTER", "NAMECHAR", "WS", "'->'", "'('", "')'", "'['", "']'"
    };
    public static final int FUNCTION=4;
    public static final int INTEGER=11;
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


        public TypeStringParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TypeStringParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return TypeStringParser.tokenNames; }
    public String getGrammarFileName() { return "/home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g"; }


    	public static Tree parse(String string) throws RecognitionException {
    		ANTLRStringStream stream = new ANTLRStringStream(string);
    		TypeStringLexer lexer = new TypeStringLexer(stream);
    		CommonTokenStream tokens = new CommonTokenStream(lexer);
    		TypeStringParser parser = new TypeStringParser(tokens);
    		return (Tree) parser.root().getTree();
    	}


    public static class root_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "root"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:34:1: root : type EOF ;
    public final TypeStringParser.root_return root() throws RecognitionException {
        TypeStringParser.root_return retval = new TypeStringParser.root_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF2=null;
        TypeStringParser.type_return type1 = null;


        Object EOF2_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:35:2: ( type EOF )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:35:4: type EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_root82);
            type1=type();

            state._fsp--;

            adaptor.addChild(root_0, type1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_root84); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "root"

    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:37:1: function : ( argument )+ '->' ret= type -> $ret ( argument )+ ;
    public final TypeStringParser.function_return function() throws RecognitionException {
        TypeStringParser.function_return retval = new TypeStringParser.function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal4=null;
        TypeStringParser.type_return ret = null;

        TypeStringParser.argument_return argument3 = null;


        Object string_literal4_tree=null;
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:38:2: ( ( argument )+ '->' ret= type -> $ret ( argument )+ )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:38:4: ( argument )+ '->' ret= type
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:38:4: ( argument )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==OPTIONAL||LA1_0==CLASS_ID||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:38:4: argument
            	    {
            	    pushFollow(FOLLOW_argument_in_function94);
            	    argument3=argument();

            	    state._fsp--;

            	    stream_argument.add(argument3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            string_literal4=(Token)match(input,15,FOLLOW_15_in_function97);  
            stream_15.add(string_literal4);

            pushFollow(FOLLOW_type_in_function101);
            ret=type();

            state._fsp--;

            stream_type.add(ret.getTree());


            // AST REWRITE
            // elements: ret, argument
            // token labels: 
            // rule labels: ret, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_ret=new RewriteRuleSubtreeStream(adaptor,"rule ret",ret!=null?ret.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 39:3: -> $ret ( argument )+
            {
                adaptor.addChild(root_0, stream_ret.nextTree());
                if ( !(stream_argument.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_argument.hasNext() ) {
                    adaptor.addChild(root_0, stream_argument.nextTree());

                }
                stream_argument.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function"

    public static class argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argument"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:42:1: argument : ( OPTIONAL )? type -> ^( ARGUMENT type ( OPTIONAL )? ) ;
    public final TypeStringParser.argument_return argument() throws RecognitionException {
        TypeStringParser.argument_return retval = new TypeStringParser.argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPTIONAL5=null;
        TypeStringParser.type_return type6 = null;


        Object OPTIONAL5_tree=null;
        RewriteRuleTokenStream stream_OPTIONAL=new RewriteRuleTokenStream(adaptor,"token OPTIONAL");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:43:2: ( ( OPTIONAL )? type -> ^( ARGUMENT type ( OPTIONAL )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:43:4: ( OPTIONAL )? type
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:43:4: ( OPTIONAL )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==OPTIONAL) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:43:4: OPTIONAL
                    {
                    OPTIONAL5=(Token)match(input,OPTIONAL,FOLLOW_OPTIONAL_in_argument122);  
                    stream_OPTIONAL.add(OPTIONAL5);


                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_argument125);
            type6=type();

            state._fsp--;

            stream_type.add(type6.getTree());


            // AST REWRITE
            // elements: OPTIONAL, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 44:3: -> ^( ARGUMENT type ( OPTIONAL )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:44:6: ^( ARGUMENT type ( OPTIONAL )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENT, "ARGUMENT"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:44:22: ( OPTIONAL )?
                if ( stream_OPTIONAL.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPTIONAL.nextNode());

                }
                stream_OPTIONAL.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argument"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:47:1: type : ( CLASS_ID modifiers -> ^( SCALAR CLASS_ID ( modifiers )? ) | '(' function ')' modifiers -> ^( FUNCTION function ( modifiers )? ) );
    public final TypeStringParser.type_return type() throws RecognitionException {
        TypeStringParser.type_return retval = new TypeStringParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS_ID7=null;
        Token char_literal9=null;
        Token char_literal11=null;
        TypeStringParser.modifiers_return modifiers8 = null;

        TypeStringParser.function_return function10 = null;

        TypeStringParser.modifiers_return modifiers12 = null;


        Object CLASS_ID7_tree=null;
        Object char_literal9_tree=null;
        Object char_literal11_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_CLASS_ID=new RewriteRuleTokenStream(adaptor,"token CLASS_ID");
        RewriteRuleSubtreeStream stream_modifiers=new RewriteRuleSubtreeStream(adaptor,"rule modifiers");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:48:2: ( CLASS_ID modifiers -> ^( SCALAR CLASS_ID ( modifiers )? ) | '(' function ')' modifiers -> ^( FUNCTION function ( modifiers )? ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CLASS_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:48:4: CLASS_ID modifiers
                    {
                    CLASS_ID7=(Token)match(input,CLASS_ID,FOLLOW_CLASS_ID_in_type149);  
                    stream_CLASS_ID.add(CLASS_ID7);

                    pushFollow(FOLLOW_modifiers_in_type151);
                    modifiers8=modifiers();

                    state._fsp--;

                    stream_modifiers.add(modifiers8.getTree());


                    // AST REWRITE
                    // elements: CLASS_ID, modifiers
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 49:3: -> ^( SCALAR CLASS_ID ( modifiers )? )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:49:6: ^( SCALAR CLASS_ID ( modifiers )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SCALAR, "SCALAR"), root_1);

                        adaptor.addChild(root_1, stream_CLASS_ID.nextNode());
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:49:24: ( modifiers )?
                        if ( stream_modifiers.hasNext() ) {
                            adaptor.addChild(root_1, stream_modifiers.nextTree());

                        }
                        stream_modifiers.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:50:4: '(' function ')' modifiers
                    {
                    char_literal9=(Token)match(input,16,FOLLOW_16_in_type169);  
                    stream_16.add(char_literal9);

                    pushFollow(FOLLOW_function_in_type171);
                    function10=function();

                    state._fsp--;

                    stream_function.add(function10.getTree());
                    char_literal11=(Token)match(input,17,FOLLOW_17_in_type173);  
                    stream_17.add(char_literal11);

                    pushFollow(FOLLOW_modifiers_in_type175);
                    modifiers12=modifiers();

                    state._fsp--;

                    stream_modifiers.add(modifiers12.getTree());


                    // AST REWRITE
                    // elements: modifiers, function
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 51:3: -> ^( FUNCTION function ( modifiers )? )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:51:6: ^( FUNCTION function ( modifiers )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                        adaptor.addChild(root_1, stream_function.nextTree());
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:51:26: ( modifiers )?
                        if ( stream_modifiers.hasNext() ) {
                            adaptor.addChild(root_1, stream_modifiers.nextTree());

                        }
                        stream_modifiers.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class modifiers_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifiers"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:54:1: modifiers : ( generic )? ( sequence )? ;
    public final TypeStringParser.modifiers_return modifiers() throws RecognitionException {
        TypeStringParser.modifiers_return retval = new TypeStringParser.modifiers_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TypeStringParser.generic_return generic13 = null;

        TypeStringParser.sequence_return sequence14 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:55:2: ( ( generic )? ( sequence )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:55:4: ( generic )? ( sequence )?
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:55:4: ( generic )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:55:4: generic
                    {
                    pushFollow(FOLLOW_generic_in_modifiers199);
                    generic13=generic();

                    state._fsp--;

                    adaptor.addChild(root_0, generic13.getTree());

                    }
                    break;

            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:55:13: ( sequence )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==SEQUENCE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:55:13: sequence
                    {
                    pushFollow(FOLLOW_sequence_in_modifiers202);
                    sequence14=sequence();

                    state._fsp--;

                    adaptor.addChild(root_0, sequence14.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "modifiers"

    public static class generic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "generic"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:58:1: generic : '[' INTEGER ']' -> ^( GENERIC INTEGER ) ;
    public final TypeStringParser.generic_return generic() throws RecognitionException {
        TypeStringParser.generic_return retval = new TypeStringParser.generic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal15=null;
        Token INTEGER16=null;
        Token char_literal17=null;

        Object char_literal15_tree=null;
        Object INTEGER16_tree=null;
        Object char_literal17_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:59:2: ( '[' INTEGER ']' -> ^( GENERIC INTEGER ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:59:4: '[' INTEGER ']'
            {
            char_literal15=(Token)match(input,18,FOLLOW_18_in_generic214);  
            stream_18.add(char_literal15);

            INTEGER16=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_generic216);  
            stream_INTEGER.add(INTEGER16);

            char_literal17=(Token)match(input,19,FOLLOW_19_in_generic218);  
            stream_19.add(char_literal17);



            // AST REWRITE
            // elements: INTEGER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 60:3: -> ^( GENERIC INTEGER )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:60:6: ^( GENERIC INTEGER )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(GENERIC, "GENERIC"), root_1);

                adaptor.addChild(root_1, stream_INTEGER.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "generic"

    public static class sequence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sequence"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:63:1: sequence : SEQUENCE ;
    public final TypeStringParser.sequence_return sequence() throws RecognitionException {
        TypeStringParser.sequence_return retval = new TypeStringParser.sequence_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEQUENCE18=null;

        Object SEQUENCE18_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:64:2: ( SEQUENCE )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/util/TypeString.g:64:4: SEQUENCE
            {
            root_0 = (Object)adaptor.nil();

            SEQUENCE18=(Token)match(input,SEQUENCE,FOLLOW_SEQUENCE_in_sequence239); 
            SEQUENCE18_tree = (Object)adaptor.create(SEQUENCE18);
            adaptor.addChild(root_0, SEQUENCE18_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sequence"

    // Delegated rules


 

    public static final BitSet FOLLOW_type_in_root82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_root84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_function94 = new BitSet(new long[]{0x0000000000018440L});
    public static final BitSet FOLLOW_15_in_function97 = new BitSet(new long[]{0x0000000000018440L});
    public static final BitSet FOLLOW_type_in_function101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONAL_in_argument122 = new BitSet(new long[]{0x0000000000018440L});
    public static final BitSet FOLLOW_type_in_argument125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_ID_in_type149 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_modifiers_in_type151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_type169 = new BitSet(new long[]{0x0000000000018440L});
    public static final BitSet FOLLOW_function_in_type171 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_type173 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_modifiers_in_type175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_generic_in_modifiers199 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_sequence_in_modifiers202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_generic214 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INTEGER_in_generic216 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_generic218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEQUENCE_in_sequence239 = new BitSet(new long[]{0x0000000000000002L});

}