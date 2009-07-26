// $ANTLR 3.1.2 /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g 2009-07-27 00:21:56

package pl.omtt.lang.grammar;

import pl.omtt.lang.model.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;
@SuppressWarnings("all")
public class OmttParser extends AbstractOmttParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "HEADER", "USE", "USES", "IMPORT", "IMPORTS", "CLASS", "IDENT", "ATOM_SELECT", "PROPERTY_SELECT", "TYPE_SELECT", "SEQUENCE_SELECT", "ITERATE", "ARGUMENTS", "ARGUMENT", "RETURNS", "BLOCK", "IF_ELSE", "CALL", "CAST", "SEQUENCE", "STRING_LITERAL", "INT_NUMBER", "REAL_NUMBER", "CONTENT", "TAG_START", "TAG_END", "DATA_START", "DATA_END", "EXPRESSION_START", "EXPRESSION_END", "OP_DATA_IS_EXPRESSION", "IT", "ITEM", "COMMENT_SINGLE_LINE", "COMMENT_MULTI_LINE", "WS", "NEWLINE", "ACTION_ON_NEWLINE", "STRING_PARENS", "MODE_LEFT_PAREN", "MODE_RIGHT_PAREN", "MODULE", "DEF", "AND", "IN", "IF", "THEN", "ELSE", "MATCH", "CASE", "DEFAULT", "AS", "IS", "MAP", "APPLY", "LAMBDA", "NULL", "TRUE", "FALSE", "INNER_TAG_KEYWORD", "SINGLE_TAG_KEYWORD", "OP_FOLLOW", "OP_REVERSE_FOLLOW", "OP_DOUBLE_FOLLOW", "COLON", "SEMICOLON", "DOT", "DOUBLE_DOT", "COMA", "SLASH", "TILDE", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_SQUARE_PAREN", "RIGHT_SQUARE_PAREN", "OP_PLUS", "OP_MINUS", "OP_MULTIPLY", "OP_MODULO", "OP_EQUAL", "OP_NOT_EQUAL", "OP_LEQ", "OP_LE", "OP_GEQ", "OP_GE", "OP_ASSIGN", "OP_AND", "OP_OR", "OP_NOT", "OP_CONTEXT", "OP_EXPRESSION_CONTEXT", "OP_VIEW", "OP_CONCAT", "OP_GENERAL", "OP_DATA", "SMALL_LETTER", "NAMECHAR", "VAR_ID", "BIG_LETTER", "CLASS_ID", "DIGIT", "INT_OR_REAL_NUMBER", "LETTER", "NOT_NAME"
    };
    public static final int CAST=23;
    public static final int OP_LE=87;
    public static final int OP_REVERSE_FOLLOW=67;
    public static final int INT_NUMBER=26;
    public static final int OP_AND=91;
    public static final int INT_OR_REAL_NUMBER=106;
    public static final int LETTER=107;
    public static final int OP_GEQ=88;
    public static final int CASE=54;
    public static final int OP_GE=89;
    public static final int EOF=-1;
    public static final int DOUBLE_DOT=72;
    public static final int IMPORT=8;
    public static final int STRING_LITERAL=25;
    public static final int MODE_LEFT_PAREN=44;
    public static final int OP_MINUS=81;
    public static final int OP_NOT_EQUAL=85;
    public static final int SEQUENCE_SELECT=15;
    public static final int OP_EXPRESSION_CONTEXT=95;
    public static final int VAR_ID=102;
    public static final int ARGUMENTS=17;
    public static final int NULL=61;
    public static final int ELSE=52;
    public static final int MATCH=53;
    public static final int SEMICOLON=70;
    public static final int SINGLE_TAG_KEYWORD=65;
    public static final int MODE_RIGHT_PAREN=45;
    public static final int CONTENT=28;
    public static final int DATA_START=31;
    public static final int EXPRESSION_START=33;
    public static final int NAMECHAR=101;
    public static final int SEQUENCE=24;
    public static final int INNER_TAG_KEYWORD=64;
    public static final int WS=40;
    public static final int OP_DATA=99;
    public static final int USES=7;
    public static final int REAL_NUMBER=27;
    public static final int LEFT_PAREN=76;
    public static final int OP_EQUAL=84;
    public static final int IMPORTS=9;
    public static final int CALL=22;
    public static final int OP_DATA_IS_EXPRESSION=35;
    public static final int USE=6;
    public static final int FALSE=63;
    public static final int STRING_PARENS=43;
    public static final int COMMENT_SINGLE_LINE=38;
    public static final int CLASS_ID=104;
    public static final int OP_CONCAT=97;
    public static final int SMALL_LETTER=100;
    public static final int APPLY=59;
    public static final int CLASS=10;
    public static final int DEF=47;
    public static final int OP_FOLLOW=66;
    public static final int OP_ASSIGN=90;
    public static final int OP_OR=92;
    public static final int EXPRESSION_END=34;
    public static final int TYPE_SELECT=14;
    public static final int AND=48;
    public static final int DATA_END=32;
    public static final int IF_ELSE=21;
    public static final int IF=50;
    public static final int COMMENT_MULTI_LINE=39;
    public static final int AS=56;
    public static final int RIGHT_PAREN=77;
    public static final int BIG_LETTER=103;
    public static final int SLASH=74;
    public static final int IN=49;
    public static final int THEN=51;
    public static final int LEFT_SQUARE_PAREN=78;
    public static final int IS=57;
    public static final int IT=36;
    public static final int TAG_START=29;
    public static final int ARGUMENT=18;
    public static final int RIGHT_SQUARE_PAREN=79;
    public static final int TILDE=75;
    public static final int OP_GENERAL=98;
    public static final int IDENT=11;
    public static final int OP_NOT=93;
    public static final int OP_DOUBLE_FOLLOW=68;
    public static final int DIGIT=105;
    public static final int LAMBDA=60;
    public static final int HEADER=5;
    public static final int DOT=71;
    public static final int NOT_NAME=108;
    public static final int OP_MULTIPLY=82;
    public static final int RETURNS=19;
    public static final int ITEM=37;
    public static final int OP_PLUS=80;
    public static final int DEFAULT=55;
    public static final int ATOM_SELECT=12;
    public static final int MODULE=46;
    public static final int COMA=73;
    public static final int TRUE=62;
    public static final int OP_VIEW=96;
    public static final int OP_MODULO=83;
    public static final int COLON=69;
    public static final int ITERATE=16;
    public static final int TAG_END=30;
    public static final int NEWLINE=41;
    public static final int BLOCK=20;
    public static final int MAP=58;
    public static final int PROPERTY_SELECT=13;
    public static final int OP_CONTEXT=94;
    public static final int ACTION_ON_NEWLINE=42;
    public static final int PROGRAM=4;
    public static final int OP_LEQ=86;

    // delegates
    // delegators


        public OmttParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public OmttParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return OmttParser.tokenNames; }
    public String getGrammarFileName() { return "/home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:16:1: program : header ( definitions )? EOF -> ^( PROGRAM ( header )? ( definitions )? ) ;
    public final OmttParser.program_return program() throws RecognitionException {
        OmttParser.program_return retval = new OmttParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF3=null;
        OmttParser.header_return header1 = null;

        OmttParser.definitions_return definitions2 = null;


        Object EOF3_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_definitions=new RewriteRuleSubtreeStream(adaptor,"rule definitions");
        RewriteRuleSubtreeStream stream_header=new RewriteRuleSubtreeStream(adaptor,"rule header");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:17:3: ( header ( definitions )? EOF -> ^( PROGRAM ( header )? ( definitions )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:17:5: header ( definitions )? EOF
            {
            pushFollow(FOLLOW_header_in_program53);
            header1=header();

            state._fsp--;

            stream_header.add(header1.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:17:12: ( definitions )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==TAG_START) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:17:12: definitions
                    {
                    pushFollow(FOLLOW_definitions_in_program55);
                    definitions2=definitions();

                    state._fsp--;

                    stream_definitions.add(definitions2.getTree());

                    }
                    break;

            }

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program58);  
            stream_EOF.add(EOF3);



            // AST REWRITE
            // elements: header, definitions
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 18:5: -> ^( PROGRAM ( header )? ( definitions )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:18:8: ^( PROGRAM ( header )? ( definitions )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Program(PROGRAM), root_1);

                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:18:27: ( header )?
                if ( stream_header.hasNext() ) {
                    adaptor.addChild(root_1, stream_header.nextTree());

                }
                stream_header.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:18:35: ( definitions )?
                if ( stream_definitions.hasNext() ) {
                    adaptor.addChild(root_1, stream_definitions.nextTree());

                }
                stream_definitions.reset();

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
    // $ANTLR end "program"

    public static class header_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "header"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:24:1: header : ( module_declaration )? use_declarations import_declarations ;
    public final OmttParser.header_return header() throws RecognitionException {
        OmttParser.header_return retval = new OmttParser.header_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.module_declaration_return module_declaration4 = null;

        OmttParser.use_declarations_return use_declarations5 = null;

        OmttParser.import_declarations_return import_declarations6 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:25:3: ( ( module_declaration )? use_declarations import_declarations )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:25:5: ( module_declaration )? use_declarations import_declarations
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:25:5: ( module_declaration )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==TAG_START) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==MODULE) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:25:5: module_declaration
                    {
                    pushFollow(FOLLOW_module_declaration_in_header93);
                    module_declaration4=module_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, module_declaration4.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_use_declarations_in_header100);
            use_declarations5=use_declarations();

            state._fsp--;

            adaptor.addChild(root_0, use_declarations5.getTree());
            pushFollow(FOLLOW_import_declarations_in_header106);
            import_declarations6=import_declarations();

            state._fsp--;

            adaptor.addChild(root_0, import_declarations6.getTree());

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
    // $ANTLR end "header"

    public static class module_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module_declaration"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:30:1: module_declaration : TAG_START MODULE module_id TAG_END -> ^( MODULE[$MODULE] module_id ) ;
    public final OmttParser.module_declaration_return module_declaration() throws RecognitionException {
        OmttParser.module_declaration_return retval = new OmttParser.module_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START7=null;
        Token MODULE8=null;
        Token TAG_END10=null;
        OmttParser.module_id_return module_id9 = null;


        Object TAG_START7_tree=null;
        Object MODULE8_tree=null;
        Object TAG_END10_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_module_id=new RewriteRuleSubtreeStream(adaptor,"rule module_id");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:31:3: ( TAG_START MODULE module_id TAG_END -> ^( MODULE[$MODULE] module_id ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:31:5: TAG_START MODULE module_id TAG_END
            {
            TAG_START7=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_module_declaration119);  
            stream_TAG_START.add(TAG_START7);

            MODULE8=(Token)match(input,MODULE,FOLLOW_MODULE_in_module_declaration121);  
            stream_MODULE.add(MODULE8);

            pushFollow(FOLLOW_module_id_in_module_declaration123);
            module_id9=module_id();

            state._fsp--;

            stream_module_id.add(module_id9.getTree());
            TAG_END10=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_module_declaration125);  
            stream_TAG_END.add(TAG_END10);



            // AST REWRITE
            // elements: module_id, MODULE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 32:5: -> ^( MODULE[$MODULE] module_id )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:32:8: ^( MODULE[$MODULE] module_id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ModuleDeclaration(MODULE, MODULE8), root_1);

                adaptor.addChild(root_1, stream_module_id.nextTree());

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
    // $ANTLR end "module_declaration"

    public static class use_declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "use_declarations"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:34:1: use_declarations : ( ( TAG_START ( use_declaration ) TAG_END )+ )? -> ( ^( USES ( use_declaration )+ ) )? ;
    public final OmttParser.use_declarations_return use_declarations() throws RecognitionException {
        OmttParser.use_declarations_return retval = new OmttParser.use_declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START11=null;
        Token TAG_END13=null;
        OmttParser.use_declaration_return use_declaration12 = null;


        Object TAG_START11_tree=null;
        Object TAG_END13_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_use_declaration=new RewriteRuleSubtreeStream(adaptor,"rule use_declaration");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:35:3: ( ( ( TAG_START ( use_declaration ) TAG_END )+ )? -> ( ^( USES ( use_declaration )+ ) )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:35:5: ( ( TAG_START ( use_declaration ) TAG_END )+ )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:35:5: ( ( TAG_START ( use_declaration ) TAG_END )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TAG_START) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==USE) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:35:6: ( TAG_START ( use_declaration ) TAG_END )+
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:35:6: ( TAG_START ( use_declaration ) TAG_END )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==TAG_START) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==USE) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:35:7: TAG_START ( use_declaration ) TAG_END
                    	    {
                    	    TAG_START11=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_use_declarations155);  
                    	    stream_TAG_START.add(TAG_START11);

                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:35:17: ( use_declaration )
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:35:18: use_declaration
                    	    {
                    	    pushFollow(FOLLOW_use_declaration_in_use_declarations158);
                    	    use_declaration12=use_declaration();

                    	    state._fsp--;

                    	    stream_use_declaration.add(use_declaration12.getTree());

                    	    }

                    	    TAG_END13=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_use_declarations161);  
                    	    stream_TAG_END.add(TAG_END13);


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
                    break;

            }



            // AST REWRITE
            // elements: use_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 36:5: -> ( ^( USES ( use_declaration )+ ) )?
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:8: ( ^( USES ( use_declaration )+ ) )?
                if ( stream_use_declaration.hasNext() ) {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:8: ^( USES ( use_declaration )+ )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(USES, "USES"), root_1);

                    if ( !(stream_use_declaration.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_use_declaration.hasNext() ) {
                        adaptor.addChild(root_1, stream_use_declaration.nextTree());

                    }
                    stream_use_declaration.reset();

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_use_declaration.reset();

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
    // $ANTLR end "use_declarations"

    public static class import_declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "import_declarations"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:38:1: import_declarations : ( ( TAG_START ( import_declaration ) TAG_END )+ )? -> ( ^( IMPORTS ( import_declaration )+ ) )? ;
    public final OmttParser.import_declarations_return import_declarations() throws RecognitionException {
        OmttParser.import_declarations_return retval = new OmttParser.import_declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START14=null;
        Token TAG_END16=null;
        OmttParser.import_declaration_return import_declaration15 = null;


        Object TAG_START14_tree=null;
        Object TAG_END16_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_import_declaration=new RewriteRuleSubtreeStream(adaptor,"rule import_declaration");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:39:3: ( ( ( TAG_START ( import_declaration ) TAG_END )+ )? -> ( ^( IMPORTS ( import_declaration )+ ) )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:39:5: ( ( TAG_START ( import_declaration ) TAG_END )+ )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:39:5: ( ( TAG_START ( import_declaration ) TAG_END )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==TAG_START) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==IMPORT) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:39:6: ( TAG_START ( import_declaration ) TAG_END )+
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:39:6: ( TAG_START ( import_declaration ) TAG_END )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==TAG_START) ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1==IMPORT) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:39:7: TAG_START ( import_declaration ) TAG_END
                    	    {
                    	    TAG_START14=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_import_declarations193);  
                    	    stream_TAG_START.add(TAG_START14);

                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:39:17: ( import_declaration )
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:39:18: import_declaration
                    	    {
                    	    pushFollow(FOLLOW_import_declaration_in_import_declarations196);
                    	    import_declaration15=import_declaration();

                    	    state._fsp--;

                    	    stream_import_declaration.add(import_declaration15.getTree());

                    	    }

                    	    TAG_END16=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_import_declarations199);  
                    	    stream_TAG_END.add(TAG_END16);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }



            // AST REWRITE
            // elements: import_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 40:5: -> ( ^( IMPORTS ( import_declaration )+ ) )?
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:8: ( ^( IMPORTS ( import_declaration )+ ) )?
                if ( stream_import_declaration.hasNext() ) {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:8: ^( IMPORTS ( import_declaration )+ )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IMPORTS, "IMPORTS"), root_1);

                    if ( !(stream_import_declaration.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_import_declaration.hasNext() ) {
                        adaptor.addChild(root_1, stream_import_declaration.nextTree());

                    }
                    stream_import_declaration.reset();

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_import_declaration.reset();

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
    // $ANTLR end "import_declarations"

    public static class import_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "import_declaration"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:43:1: import_declaration : IMPORT ec= external_class_name -> ^( IMPORT[$IMPORT] $ec) ;
    public final OmttParser.import_declaration_return import_declaration() throws RecognitionException {
        OmttParser.import_declaration_return retval = new OmttParser.import_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IMPORT17=null;
        OmttParser.external_class_name_return ec = null;


        Object IMPORT17_tree=null;
        RewriteRuleTokenStream stream_IMPORT=new RewriteRuleTokenStream(adaptor,"token IMPORT");
        RewriteRuleSubtreeStream stream_external_class_name=new RewriteRuleSubtreeStream(adaptor,"rule external_class_name");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:44:3: ( IMPORT ec= external_class_name -> ^( IMPORT[$IMPORT] $ec) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:44:5: IMPORT ec= external_class_name
            {
            IMPORT17=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_declaration230);  
            stream_IMPORT.add(IMPORT17);

            pushFollow(FOLLOW_external_class_name_in_import_declaration234);
            ec=external_class_name();

            state._fsp--;

            stream_external_class_name.add(ec.getTree());


            // AST REWRITE
            // elements: ec, IMPORT
            // token labels: 
            // rule labels: retval, ec
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ec=new RewriteRuleSubtreeStream(adaptor,"rule ec",ec!=null?ec.tree:null);

            root_0 = (Object)adaptor.nil();
            // 45:5: -> ^( IMPORT[$IMPORT] $ec)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:45:8: ^( IMPORT[$IMPORT] $ec)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ImportDeclaration(IMPORT, IMPORT17), root_1);

                adaptor.addChild(root_1, stream_ec.nextTree());

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
    // $ANTLR end "import_declaration"

    public static class use_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "use_declaration"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:47:1: use_declaration : USE module_id ( AS VAR_ID )? -> ^( USE[$USE] ^( MODULE module_id ) ( VAR_ID )? ) ;
    public final OmttParser.use_declaration_return use_declaration() throws RecognitionException {
        OmttParser.use_declaration_return retval = new OmttParser.use_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token USE18=null;
        Token AS20=null;
        Token VAR_ID21=null;
        OmttParser.module_id_return module_id19 = null;


        Object USE18_tree=null;
        Object AS20_tree=null;
        Object VAR_ID21_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleSubtreeStream stream_module_id=new RewriteRuleSubtreeStream(adaptor,"rule module_id");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:48:3: ( USE module_id ( AS VAR_ID )? -> ^( USE[$USE] ^( MODULE module_id ) ( VAR_ID )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:48:5: USE module_id ( AS VAR_ID )?
            {
            USE18=(Token)match(input,USE,FOLLOW_USE_in_use_declaration263);  
            stream_USE.add(USE18);

            pushFollow(FOLLOW_module_id_in_use_declaration265);
            module_id19=module_id();

            state._fsp--;

            stream_module_id.add(module_id19.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:48:19: ( AS VAR_ID )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==AS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:48:20: AS VAR_ID
                    {
                    AS20=(Token)match(input,AS,FOLLOW_AS_in_use_declaration268);  
                    stream_AS.add(AS20);

                    VAR_ID21=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_use_declaration270);  
                    stream_VAR_ID.add(VAR_ID21);


                    }
                    break;

            }



            // AST REWRITE
            // elements: USE, module_id, VAR_ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 49:5: -> ^( USE[$USE] ^( MODULE module_id ) ( VAR_ID )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:49:8: ^( USE[$USE] ^( MODULE module_id ) ( VAR_ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new UseDeclaration(USE, USE18), root_1);

                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:49:36: ^( MODULE module_id )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MODULE, "MODULE"), root_2);

                adaptor.addChild(root_2, stream_module_id.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:49:56: ( VAR_ID )?
                if ( stream_VAR_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_VAR_ID.nextNode());

                }
                stream_VAR_ID.reset();

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
    // $ANTLR end "use_declaration"

    public static class external_class_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "external_class_name"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:52:10: fragment external_class_name : ( VAR_ID DOT )* ( CLASS_ID | OP_GENERAL ) ;
    public final OmttParser.external_class_name_return external_class_name() throws RecognitionException {
        OmttParser.external_class_name_return retval = new OmttParser.external_class_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID22=null;
        Token DOT23=null;
        Token set24=null;

        Object VAR_ID22_tree=null;
        Object DOT23_tree=null;
        Object set24_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:53:3: ( ( VAR_ID DOT )* ( CLASS_ID | OP_GENERAL ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:53:5: ( VAR_ID DOT )* ( CLASS_ID | OP_GENERAL )
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:53:5: ( VAR_ID DOT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==VAR_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:53:6: VAR_ID DOT
            	    {
            	    VAR_ID22=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_external_class_name311); 
            	    VAR_ID22_tree = (Object)adaptor.create(VAR_ID22);
            	    adaptor.addChild(root_0, VAR_ID22_tree);

            	    DOT23=(Token)match(input,DOT,FOLLOW_DOT_in_external_class_name313); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            set24=(Token)input.LT(1);
            if ( input.LA(1)==OP_GENERAL||input.LA(1)==CLASS_ID ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set24));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "external_class_name"

    public static class module_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module_id"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:55:10: fragment module_id : ( VAR_ID DOT )* VAR_ID ;
    public final OmttParser.module_id_return module_id() throws RecognitionException {
        OmttParser.module_id_return retval = new OmttParser.module_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID25=null;
        Token DOT26=null;
        Token VAR_ID27=null;

        Object VAR_ID25_tree=null;
        Object DOT26_tree=null;
        Object VAR_ID27_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:56:3: ( ( VAR_ID DOT )* VAR_ID )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:56:5: ( VAR_ID DOT )* VAR_ID
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:56:5: ( VAR_ID DOT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==VAR_ID) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==DOT) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:56:6: VAR_ID DOT
            	    {
            	    VAR_ID25=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_module_id339); 
            	    VAR_ID25_tree = (Object)adaptor.create(VAR_ID25);
            	    adaptor.addChild(root_0, VAR_ID25_tree);

            	    DOT26=(Token)match(input,DOT,FOLLOW_DOT_in_module_id341); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            VAR_ID27=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_module_id346); 
            VAR_ID27_tree = (Object)adaptor.create(VAR_ID27);
            adaptor.addChild(root_0, VAR_ID27_tree);


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
    // $ANTLR end "module_id"

    public static class definitions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definitions"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:62:1: definitions : ( tag_definition )+ -> ( tag_definition )+ ;
    public final OmttParser.definitions_return definitions() throws RecognitionException {
        OmttParser.definitions_return retval = new OmttParser.definitions_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.tag_definition_return tag_definition28 = null;


        RewriteRuleSubtreeStream stream_tag_definition=new RewriteRuleSubtreeStream(adaptor,"rule tag_definition");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:63:3: ( ( tag_definition )+ -> ( tag_definition )+ )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:63:5: ( tag_definition )+
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:63:5: ( tag_definition )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==TAG_START) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:63:5: tag_definition
            	    {
            	    pushFollow(FOLLOW_tag_definition_in_definitions362);
            	    tag_definition28=tag_definition();

            	    state._fsp--;

            	    stream_tag_definition.add(tag_definition28.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);



            // AST REWRITE
            // elements: tag_definition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 64:5: -> ( tag_definition )+
            {
                if ( !(stream_tag_definition.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_tag_definition.hasNext() ) {
                    adaptor.addChild(root_0, stream_tag_definition.nextTree());

                }
                stream_tag_definition.reset();

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
    // $ANTLR end "definitions"

    public static class tag_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tag_definition"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:67:1: tag_definition : TAG_START DEF definition_signature content= tag_content TAG_END -> ^( DEF definition_signature $content) ;
    public final OmttParser.tag_definition_return tag_definition() throws RecognitionException {
        OmttParser.tag_definition_return retval = new OmttParser.tag_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START29=null;
        Token DEF30=null;
        Token TAG_END32=null;
        OmttParser.tag_content_return content = null;

        OmttParser.definition_signature_return definition_signature31 = null;


        Object TAG_START29_tree=null;
        Object DEF30_tree=null;
        Object TAG_END32_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_definition_signature=new RewriteRuleSubtreeStream(adaptor,"rule definition_signature");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:67:16: ( TAG_START DEF definition_signature content= tag_content TAG_END -> ^( DEF definition_signature $content) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:68:3: TAG_START DEF definition_signature content= tag_content TAG_END
            {
            TAG_START29=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_tag_definition385);  
            stream_TAG_START.add(TAG_START29);

            DEF30=(Token)match(input,DEF,FOLLOW_DEF_in_tag_definition387);  
            stream_DEF.add(DEF30);

            pushFollow(FOLLOW_definition_signature_in_tag_definition389);
            definition_signature31=definition_signature();

            state._fsp--;

            stream_definition_signature.add(definition_signature31.getTree());
            pushFollow(FOLLOW_tag_content_in_tag_definition395);
            content=tag_content();

            state._fsp--;

            stream_tag_content.add(content.getTree());
            TAG_END32=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_tag_definition399);  
            stream_TAG_END.add(TAG_END32);



            // AST REWRITE
            // elements: definition_signature, content, DEF
            // token labels: 
            // rule labels: content, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"rule content",content!=null?content.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 71:3: -> ^( DEF definition_signature $content)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:71:6: ^( DEF definition_signature $content)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TemplateDefinition(stream_DEF.nextToken()), root_1);

                adaptor.addChild(root_1, stream_definition_signature.nextTree());
                adaptor.addChild(root_1, stream_content.nextTree());

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
    // $ANTLR end "tag_definition"

    public static class definition_signature_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition_signature"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:74:10: fragment definition_signature : ( VAR_ID | DEFAULT ) ( definition_context )? ( definition_argument )* ( OP_FOLLOW ret_type= type )? -> ( VAR_ID )? ( DEFAULT )? ( definition_context )? ^( ARGUMENTS ( definition_argument )* ) ^( RETURNS ( $ret_type)? ) ;
    public final OmttParser.definition_signature_return definition_signature() throws RecognitionException {
        OmttParser.definition_signature_return retval = new OmttParser.definition_signature_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID33=null;
        Token DEFAULT34=null;
        Token OP_FOLLOW37=null;
        OmttParser.type_return ret_type = null;

        OmttParser.definition_context_return definition_context35 = null;

        OmttParser.definition_argument_return definition_argument36 = null;


        Object VAR_ID33_tree=null;
        Object DEFAULT34_tree=null;
        Object OP_FOLLOW37_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_FOLLOW");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleSubtreeStream stream_definition_context=new RewriteRuleSubtreeStream(adaptor,"rule definition_context");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_definition_argument=new RewriteRuleSubtreeStream(adaptor,"rule definition_argument");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:3: ( ( VAR_ID | DEFAULT ) ( definition_context )? ( definition_argument )* ( OP_FOLLOW ret_type= type )? -> ( VAR_ID )? ( DEFAULT )? ( definition_context )? ^( ARGUMENTS ( definition_argument )* ) ^( RETURNS ( $ret_type)? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:5: ( VAR_ID | DEFAULT ) ( definition_context )? ( definition_argument )* ( OP_FOLLOW ret_type= type )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:5: ( VAR_ID | DEFAULT )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==VAR_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==DEFAULT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:6: VAR_ID
                    {
                    VAR_ID33=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_signature431);  
                    stream_VAR_ID.add(VAR_ID33);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:13: DEFAULT
                    {
                    DEFAULT34=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_definition_signature433);  
                    stream_DEFAULT.add(DEFAULT34);


                    }
                    break;

            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:22: ( definition_context )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==OP_REVERSE_FOLLOW) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:22: definition_context
                    {
                    pushFollow(FOLLOW_definition_context_in_definition_signature436);
                    definition_context35=definition_context();

                    state._fsp--;

                    stream_definition_context.add(definition_context35.getTree());

                    }
                    break;

            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:42: ( definition_argument )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==TILDE||LA13_0==VAR_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:42: definition_argument
            	    {
            	    pushFollow(FOLLOW_definition_argument_in_definition_signature439);
            	    definition_argument36=definition_argument();

            	    state._fsp--;

            	    stream_definition_argument.add(definition_argument36.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:63: ( OP_FOLLOW ret_type= type )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==OP_FOLLOW) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:64: OP_FOLLOW ret_type= type
                    {
                    OP_FOLLOW37=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_definition_signature443);  
                    stream_OP_FOLLOW.add(OP_FOLLOW37);

                    pushFollow(FOLLOW_type_in_definition_signature447);
                    ret_type=type();

                    state._fsp--;

                    stream_type.add(ret_type.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: definition_context, DEFAULT, definition_argument, ret_type, VAR_ID
            // token labels: 
            // rule labels: retval, ret_type
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ret_type=new RewriteRuleSubtreeStream(adaptor,"rule ret_type",ret_type!=null?ret_type.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:5: -> ( VAR_ID )? ( DEFAULT )? ( definition_context )? ^( ARGUMENTS ( definition_argument )* ) ^( RETURNS ( $ret_type)? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:8: ( VAR_ID )?
                if ( stream_VAR_ID.hasNext() ) {
                    adaptor.addChild(root_0, new Ident(stream_VAR_ID.nextToken()));

                }
                stream_VAR_ID.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:23: ( DEFAULT )?
                if ( stream_DEFAULT.hasNext() ) {
                    adaptor.addChild(root_0, new Ident(stream_DEFAULT.nextToken()));

                }
                stream_DEFAULT.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:39: ( definition_context )?
                if ( stream_definition_context.hasNext() ) {
                    adaptor.addChild(root_0, stream_definition_context.nextTree());

                }
                stream_definition_context.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:59: ^( ARGUMENTS ( definition_argument )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:71: ( definition_argument )*
                while ( stream_definition_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_definition_argument.nextTree());

                }
                stream_definition_argument.reset();

                adaptor.addChild(root_0, root_1);
                }
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:93: ^( RETURNS ( $ret_type)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURNS, "RETURNS"), root_1);

                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:103: ( $ret_type)?
                if ( stream_ret_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_ret_type.nextTree());

                }
                stream_ret_type.reset();

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
    // $ANTLR end "definition_signature"

    public static class definition_context_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition_context"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:78:10: fragment definition_context : OP_REVERSE_FOLLOW single_type -> ^( ARGUMENT single_type ) ;
    public final OmttParser.definition_context_return definition_context() throws RecognitionException {
        OmttParser.definition_context_return retval = new OmttParser.definition_context_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_REVERSE_FOLLOW38=null;
        OmttParser.single_type_return single_type39 = null;


        Object OP_REVERSE_FOLLOW38_tree=null;
        RewriteRuleTokenStream stream_OP_REVERSE_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_REVERSE_FOLLOW");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:79:2: ( OP_REVERSE_FOLLOW single_type -> ^( ARGUMENT single_type ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:79:4: OP_REVERSE_FOLLOW single_type
            {
            OP_REVERSE_FOLLOW38=(Token)match(input,OP_REVERSE_FOLLOW,FOLLOW_OP_REVERSE_FOLLOW_in_definition_context498);  
            stream_OP_REVERSE_FOLLOW.add(OP_REVERSE_FOLLOW38);

            pushFollow(FOLLOW_single_type_in_definition_context500);
            single_type39=single_type();

            state._fsp--;

            stream_single_type.add(single_type39.getTree());


            // AST REWRITE
            // elements: single_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 80:3: -> ^( ARGUMENT single_type )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:6: ^( ARGUMENT single_type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENT, "ARGUMENT"), root_1);

                adaptor.addChild(root_1, stream_single_type.nextTree());

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
    // $ANTLR end "definition_context"

    public static class definition_argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition_argument"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:83:10: fragment definition_argument : ( TILDE )? id= VAR_ID ( OP_MULTIPLY )? ( DOT type )? -> ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? ) ;
    public final OmttParser.definition_argument_return definition_argument() throws RecognitionException {
        OmttParser.definition_argument_return retval = new OmttParser.definition_argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        Token TILDE40=null;
        Token OP_MULTIPLY41=null;
        Token DOT42=null;
        OmttParser.type_return type43 = null;


        Object id_tree=null;
        Object TILDE40_tree=null;
        Object OP_MULTIPLY41_tree=null;
        Object DOT42_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_OP_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token OP_MULTIPLY");
        RewriteRuleTokenStream stream_TILDE=new RewriteRuleTokenStream(adaptor,"token TILDE");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:84:3: ( ( TILDE )? id= VAR_ID ( OP_MULTIPLY )? ( DOT type )? -> ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:84:5: ( TILDE )? id= VAR_ID ( OP_MULTIPLY )? ( DOT type )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:84:5: ( TILDE )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==TILDE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:84:5: TILDE
                    {
                    TILDE40=(Token)match(input,TILDE,FOLLOW_TILDE_in_definition_argument524);  
                    stream_TILDE.add(TILDE40);


                    }
                    break;

            }

            id=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_argument529);  
            stream_VAR_ID.add(id);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:84:22: ( OP_MULTIPLY )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==OP_MULTIPLY) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:84:22: OP_MULTIPLY
                    {
                    OP_MULTIPLY41=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_definition_argument531);  
                    stream_OP_MULTIPLY.add(OP_MULTIPLY41);


                    }
                    break;

            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:84:35: ( DOT type )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==DOT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:84:36: DOT type
                    {
                    DOT42=(Token)match(input,DOT,FOLLOW_DOT_in_definition_argument535);  
                    stream_DOT.add(DOT42);

                    pushFollow(FOLLOW_type_in_definition_argument537);
                    type43=type();

                    state._fsp--;

                    stream_type.add(type43.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: OP_MULTIPLY, TILDE, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 85:5: -> ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:85:8: ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TemplateArgument(ARGUMENT), root_1);

                adaptor.addChild(root_1, new Ident(IDENT, id));
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:85:55: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:85:61: ( TILDE )?
                if ( stream_TILDE.hasNext() ) {
                    adaptor.addChild(root_1, stream_TILDE.nextNode());

                }
                stream_TILDE.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:85:68: ( OP_MULTIPLY )?
                if ( stream_OP_MULTIPLY.hasNext() ) {
                    adaptor.addChild(root_1, stream_OP_MULTIPLY.nextNode());

                }
                stream_OP_MULTIPLY.reset();

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
    // $ANTLR end "definition_argument"

    public static class tag_content_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tag_content"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:91:1: tag_content : ( CONTENT ( data_body_atom )* -> ^( CONTENT ( data_body_atom )* ) | OP_DATA_IS_EXPRESSION CONTENT expression -> expression );
    public final OmttParser.tag_content_return tag_content() throws RecognitionException {
        OmttParser.tag_content_return retval = new OmttParser.tag_content_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONTENT44=null;
        Token OP_DATA_IS_EXPRESSION46=null;
        Token CONTENT47=null;
        OmttParser.data_body_atom_return data_body_atom45 = null;

        OmttParser.expression_return expression48 = null;


        Object CONTENT44_tree=null;
        Object OP_DATA_IS_EXPRESSION46_tree=null;
        Object CONTENT47_tree=null;
        RewriteRuleTokenStream stream_CONTENT=new RewriteRuleTokenStream(adaptor,"token CONTENT");
        RewriteRuleTokenStream stream_OP_DATA_IS_EXPRESSION=new RewriteRuleTokenStream(adaptor,"token OP_DATA_IS_EXPRESSION");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_data_body_atom=new RewriteRuleSubtreeStream(adaptor,"rule data_body_atom");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:92:3: ( CONTENT ( data_body_atom )* -> ^( CONTENT ( data_body_atom )* ) | OP_DATA_IS_EXPRESSION CONTENT expression -> expression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==CONTENT) ) {
                alt19=1;
            }
            else if ( (LA19_0==OP_DATA_IS_EXPRESSION) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:92:5: CONTENT ( data_body_atom )*
                    {
                    CONTENT44=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_tag_content583);  
                    stream_CONTENT.add(CONTENT44);

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:93:5: ( data_body_atom )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==TAG_START) ) {
                            int LA18_2 = input.LA(2);

                            if ( (LA18_2==DEF||LA18_2==IF||LA18_2==MAP||LA18_2==OP_GENERAL||LA18_2==VAR_ID) ) {
                                alt18=1;
                            }


                        }
                        else if ( (LA18_0==STRING_LITERAL||LA18_0==EXPRESSION_START) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:93:5: data_body_atom
                    	    {
                    	    pushFollow(FOLLOW_data_body_atom_in_tag_content589);
                    	    data_body_atom45=data_body_atom();

                    	    state._fsp--;

                    	    stream_data_body_atom.add(data_body_atom45.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: CONTENT, data_body_atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 94:5: -> ^( CONTENT ( data_body_atom )* )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:94:8: ^( CONTENT ( data_body_atom )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Data(stream_CONTENT.nextToken()), root_1);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:94:24: ( data_body_atom )*
                        while ( stream_data_body_atom.hasNext() ) {
                            adaptor.addChild(root_1, stream_data_body_atom.nextTree());

                        }
                        stream_data_body_atom.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:95:5: OP_DATA_IS_EXPRESSION CONTENT expression
                    {
                    OP_DATA_IS_EXPRESSION46=(Token)match(input,OP_DATA_IS_EXPRESSION,FOLLOW_OP_DATA_IS_EXPRESSION_in_tag_content612);  
                    stream_OP_DATA_IS_EXPRESSION.add(OP_DATA_IS_EXPRESSION46);

                    CONTENT47=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_tag_content614);  
                    stream_CONTENT.add(CONTENT47);

                    pushFollow(FOLLOW_expression_in_tag_content620);
                    expression48=expression();

                    state._fsp--;

                    stream_expression.add(expression48.getTree());


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 97:5: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

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
    // $ANTLR end "tag_content"

    public static class data_body_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "data_body_atom"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:100:1: data_body_atom : ( STRING_LITERAL | expression_inside_data | tag_inside_data );
    public final OmttParser.data_body_atom_return data_body_atom() throws RecognitionException {
        OmttParser.data_body_atom_return retval = new OmttParser.data_body_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING_LITERAL49=null;
        OmttParser.expression_inside_data_return expression_inside_data50 = null;

        OmttParser.tag_inside_data_return tag_inside_data51 = null;


        Object STRING_LITERAL49_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:101:3: ( STRING_LITERAL | expression_inside_data | tag_inside_data )
            int alt20=3;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
                {
                alt20=1;
                }
                break;
            case EXPRESSION_START:
                {
                alt20=2;
                }
                break;
            case TAG_START:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:101:5: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL49=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_data_body_atom641); 
                    STRING_LITERAL49_tree = new Literal(STRING_LITERAL49) ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_LITERAL49_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:102:5: expression_inside_data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_inside_data_in_data_body_atom651);
                    expression_inside_data50=expression_inside_data();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_inside_data50.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:103:5: tag_inside_data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tag_inside_data_in_data_body_atom657);
                    tag_inside_data51=tag_inside_data();

                    state._fsp--;

                    adaptor.addChild(root_0, tag_inside_data51.getTree());

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
    // $ANTLR end "data_body_atom"

    public static class expression_inside_data_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression_inside_data"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:106:10: fragment expression_inside_data : EXPRESSION_START expression EXPRESSION_END ;
    public final OmttParser.expression_inside_data_return expression_inside_data() throws RecognitionException {
        OmttParser.expression_inside_data_return retval = new OmttParser.expression_inside_data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXPRESSION_START52=null;
        Token EXPRESSION_END54=null;
        OmttParser.expression_return expression53 = null;


        Object EXPRESSION_START52_tree=null;
        Object EXPRESSION_END54_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:107:3: ( EXPRESSION_START expression EXPRESSION_END )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:107:5: EXPRESSION_START expression EXPRESSION_END
            {
            root_0 = (Object)adaptor.nil();

            EXPRESSION_START52=(Token)match(input,EXPRESSION_START,FOLLOW_EXPRESSION_START_in_expression_inside_data672); 
            pushFollow(FOLLOW_expression_in_expression_inside_data675);
            expression53=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression53.getTree());
            EXPRESSION_END54=(Token)match(input,EXPRESSION_END,FOLLOW_EXPRESSION_END_in_expression_inside_data677); 

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
    // $ANTLR end "expression_inside_data"

    public static class tag_inside_data_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tag_inside_data"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:110:10: fragment tag_inside_data : ( def_in_tag | if_tag | call_tag | map_tag );
    public final OmttParser.tag_inside_data_return tag_inside_data() throws RecognitionException {
        OmttParser.tag_inside_data_return retval = new OmttParser.tag_inside_data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.def_in_tag_return def_in_tag55 = null;

        OmttParser.if_tag_return if_tag56 = null;

        OmttParser.call_tag_return call_tag57 = null;

        OmttParser.map_tag_return map_tag58 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:111:3: ( def_in_tag | if_tag | call_tag | map_tag )
            int alt21=4;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==TAG_START) ) {
                switch ( input.LA(2) ) {
                case DEF:
                    {
                    alt21=1;
                    }
                    break;
                case MAP:
                    {
                    alt21=4;
                    }
                    break;
                case OP_GENERAL:
                case VAR_ID:
                    {
                    alt21=3;
                    }
                    break;
                case IF:
                    {
                    alt21=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:111:5: def_in_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_def_in_tag_in_tag_inside_data693);
                    def_in_tag55=def_in_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, def_in_tag55.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:112:5: if_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_tag_in_tag_inside_data699);
                    if_tag56=if_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, if_tag56.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:113:5: call_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_tag_in_tag_inside_data705);
                    call_tag57=call_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, call_tag57.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:114:5: map_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_tag_in_tag_inside_data711);
                    map_tag58=map_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, map_tag58.getTree());

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
    // $ANTLR end "tag_inside_data"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:120:1: expression : ( lambda_expression | def_in_expression | apply_expression | concatence_expression );
    public final OmttParser.expression_return expression() throws RecognitionException {
        OmttParser.expression_return retval = new OmttParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.lambda_expression_return lambda_expression59 = null;

        OmttParser.def_in_expression_return def_in_expression60 = null;

        OmttParser.apply_expression_return apply_expression61 = null;

        OmttParser.concatence_expression_return concatence_expression62 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:121:3: ( lambda_expression | def_in_expression | apply_expression | concatence_expression )
            int alt22=4;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:121:5: lambda_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expression_in_expression727);
                    lambda_expression59=lambda_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, lambda_expression59.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:122:5: def_in_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_def_in_expression_in_expression733);
                    def_in_expression60=def_in_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, def_in_expression60.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:123:5: apply_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_apply_expression_in_expression739);
                    apply_expression61=apply_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, apply_expression61.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:124:5: concatence_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_concatence_expression_in_expression745);
                    concatence_expression62=concatence_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, concatence_expression62.getTree());

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
    // $ANTLR end "expression"

    public static class def_in_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "def_in_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:129:1: def_in_expression : DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.def_in_expression_return def_in_expression() throws RecognitionException {
        OmttParser.def_in_expression_return retval = new OmttParser.def_in_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEF63=null;
        Token AND64=null;
        Token IN65=null;
        Token COLON66=null;
        List list_definition=null;
        OmttParser.expression_return content = null;

        OmttParser.definition_inside_expression_return definition = null;
         definition = null;
        Object DEF63_tree=null;
        Object AND64_tree=null;
        Object IN65_tree=null;
        Object COLON66_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_inside_expression=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:130:3: ( DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:130:5: DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression
            {
            DEF63=(Token)match(input,DEF,FOLLOW_DEF_in_def_in_expression760);  
            stream_DEF.add(DEF63);

            pushFollow(FOLLOW_definition_inside_expression_in_def_in_expression764);
            definition=definition_inside_expression();

            state._fsp--;

            stream_definition_inside_expression.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:131:5: ( AND definition+= definition_inside_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:131:6: AND definition+= definition_inside_expression
            	    {
            	    AND64=(Token)match(input,AND,FOLLOW_AND_in_def_in_expression771);  
            	    stream_AND.add(AND64);

            	    pushFollow(FOLLOW_definition_inside_expression_in_def_in_expression775);
            	    definition=definition_inside_expression();

            	    state._fsp--;

            	    stream_definition_inside_expression.add(definition.getTree());
            	    if (list_definition==null) list_definition=new ArrayList();
            	    list_definition.add(definition.getTree());


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            IN65=(Token)match(input,IN,FOLLOW_IN_in_def_in_expression783);  
            stream_IN.add(IN65);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:132:8: ( COLON )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==COLON) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:132:8: COLON
                    {
                    COLON66=(Token)match(input,COLON,FOLLOW_COLON_in_def_in_expression785);  
                    stream_COLON.add(COLON66);


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_def_in_expression790);
            content=expression();

            state._fsp--;

            stream_expression.add(content.getTree());


            // AST REWRITE
            // elements: content, definition
            // token labels: 
            // rule labels: content, retval
            // token list labels: 
            // rule list labels: definition
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"rule content",content!=null?content.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"token definition",list_definition);
            root_0 = (Object)adaptor.nil();
            // 133:5: -> ^( BLOCK ( $definition)+ $content)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:133:8: ^( BLOCK ( $definition)+ $content)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Block(BLOCK), root_1);

                if ( !(stream_definition.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_definition.hasNext() ) {
                    adaptor.addChild(root_1, stream_definition.nextTree());

                }
                stream_definition.reset();
                adaptor.addChild(root_1, stream_content.nextTree());

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
    // $ANTLR end "def_in_expression"

    public static class definition_inside_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition_inside_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:135:1: definition_inside_expression : ( definition_signature COLON expression -> ^( DEF definition_signature expression ) | VAR_ID OP_ASSIGN expression -> ^( DEF VAR_ID expression ) );
    public final OmttParser.definition_inside_expression_return definition_inside_expression() throws RecognitionException {
        OmttParser.definition_inside_expression_return retval = new OmttParser.definition_inside_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON68=null;
        Token VAR_ID70=null;
        Token OP_ASSIGN71=null;
        OmttParser.definition_signature_return definition_signature67 = null;

        OmttParser.expression_return expression69 = null;

        OmttParser.expression_return expression72 = null;


        Object COLON68_tree=null;
        Object VAR_ID70_tree=null;
        Object OP_ASSIGN71_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_signature=new RewriteRuleSubtreeStream(adaptor,"rule definition_signature");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:136:3: ( definition_signature COLON expression -> ^( DEF definition_signature expression ) | VAR_ID OP_ASSIGN expression -> ^( DEF VAR_ID expression ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==VAR_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==OP_ASSIGN) ) {
                    alt25=2;
                }
                else if ( ((LA25_1>=OP_FOLLOW && LA25_1<=OP_REVERSE_FOLLOW)||LA25_1==COLON||LA25_1==TILDE||LA25_1==VAR_ID) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA25_0==DEFAULT) ) {
                alt25=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:136:5: definition_signature COLON expression
                    {
                    pushFollow(FOLLOW_definition_signature_in_definition_inside_expression822);
                    definition_signature67=definition_signature();

                    state._fsp--;

                    stream_definition_signature.add(definition_signature67.getTree());
                    COLON68=(Token)match(input,COLON,FOLLOW_COLON_in_definition_inside_expression824);  
                    stream_COLON.add(COLON68);

                    pushFollow(FOLLOW_expression_in_definition_inside_expression830);
                    expression69=expression();

                    state._fsp--;

                    stream_expression.add(expression69.getTree());


                    // AST REWRITE
                    // elements: expression, definition_signature
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 138:5: -> ^( DEF definition_signature expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:138:8: ^( DEF definition_signature expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new TemplateDefinition(DEF), root_1);

                        adaptor.addChild(root_1, stream_definition_signature.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:139:5: VAR_ID OP_ASSIGN expression
                    {
                    VAR_ID70=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_inside_expression853);  
                    stream_VAR_ID.add(VAR_ID70);

                    OP_ASSIGN71=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_inside_expression855);  
                    stream_OP_ASSIGN.add(OP_ASSIGN71);

                    pushFollow(FOLLOW_expression_in_definition_inside_expression860);
                    expression72=expression();

                    state._fsp--;

                    stream_expression.add(expression72.getTree());


                    // AST REWRITE
                    // elements: expression, VAR_ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 141:5: -> ^( DEF VAR_ID expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:141:8: ^( DEF VAR_ID expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new TemplateDefinition(DEF), root_1);

                        adaptor.addChild(root_1, new Ident(stream_VAR_ID.nextToken()));
                        adaptor.addChild(root_1, stream_expression.nextTree());

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
    // $ANTLR end "definition_inside_expression"

    public static class def_in_tag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "def_in_tag"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:144:1: def_in_tag : TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.def_in_tag_return def_in_tag() throws RecognitionException {
        OmttParser.def_in_tag_return retval = new OmttParser.def_in_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START73=null;
        Token DEF74=null;
        Token TAG_START75=null;
        Token AND76=null;
        Token TAG_START77=null;
        Token IN78=null;
        Token TAG_END79=null;
        List list_definition=null;
        OmttParser.tag_content_return content = null;

        OmttParser.definition_inside_tag_return definition = null;
         definition = null;
        Object TAG_START73_tree=null;
        Object DEF74_tree=null;
        Object TAG_START75_tree=null;
        Object AND76_tree=null;
        Object TAG_START77_tree=null;
        Object IN78_tree=null;
        Object TAG_END79_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_definition_inside_tag=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_tag");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:145:3: ( TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:145:5: TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END
            {
            TAG_START73=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag893);  
            stream_TAG_START.add(TAG_START73);

            DEF74=(Token)match(input,DEF,FOLLOW_DEF_in_def_in_tag895);  
            stream_DEF.add(DEF74);

            pushFollow(FOLLOW_definition_inside_tag_in_def_in_tag899);
            definition=definition_inside_tag();

            state._fsp--;

            stream_definition_inside_tag.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:146:5: ( TAG_START AND definition+= definition_inside_tag )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==TAG_START) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==AND) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:146:6: TAG_START AND definition+= definition_inside_tag
            	    {
            	    TAG_START75=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag906);  
            	    stream_TAG_START.add(TAG_START75);

            	    AND76=(Token)match(input,AND,FOLLOW_AND_in_def_in_tag908);  
            	    stream_AND.add(AND76);

            	    pushFollow(FOLLOW_definition_inside_tag_in_def_in_tag912);
            	    definition=definition_inside_tag();

            	    state._fsp--;

            	    stream_definition_inside_tag.add(definition.getTree());
            	    if (list_definition==null) list_definition=new ArrayList();
            	    list_definition.add(definition.getTree());


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            TAG_START77=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag920);  
            stream_TAG_START.add(TAG_START77);

            IN78=(Token)match(input,IN,FOLLOW_IN_in_def_in_tag922);  
            stream_IN.add(IN78);

            pushFollow(FOLLOW_tag_content_in_def_in_tag926);
            content=tag_content();

            state._fsp--;

            stream_tag_content.add(content.getTree());
            TAG_END79=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_def_in_tag932);  
            stream_TAG_END.add(TAG_END79);



            // AST REWRITE
            // elements: content, definition
            // token labels: 
            // rule labels: content, retval
            // token list labels: 
            // rule list labels: definition
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"rule content",content!=null?content.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"token definition",list_definition);
            root_0 = (Object)adaptor.nil();
            // 149:5: -> ^( BLOCK ( $definition)+ $content)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:149:8: ^( BLOCK ( $definition)+ $content)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Block(BLOCK), root_1);

                if ( !(stream_definition.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_definition.hasNext() ) {
                    adaptor.addChild(root_1, stream_definition.nextTree());

                }
                stream_definition.reset();
                adaptor.addChild(root_1, stream_content.nextTree());

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
    // $ANTLR end "def_in_tag"

    public static class definition_inside_tag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition_inside_tag"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:151:1: definition_inside_tag : ( definition_signature content= tag_content -> ^( DEF definition_signature $content) | VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )? -> ^( DEF VAR_ID expression ) );
    public final OmttParser.definition_inside_tag_return definition_inside_tag() throws RecognitionException {
        OmttParser.definition_inside_tag_return retval = new OmttParser.definition_inside_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID81=null;
        Token OP_ASSIGN82=null;
        Token CONTENT84=null;
        Token STRING_LITERAL85=null;
        OmttParser.tag_content_return content = null;

        OmttParser.definition_signature_return definition_signature80 = null;

        OmttParser.expression_return expression83 = null;


        Object VAR_ID81_tree=null;
        Object OP_ASSIGN82_tree=null;
        Object CONTENT84_tree=null;
        Object STRING_LITERAL85_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_CONTENT=new RewriteRuleTokenStream(adaptor,"token CONTENT");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_signature=new RewriteRuleSubtreeStream(adaptor,"rule definition_signature");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:152:3: ( definition_signature content= tag_content -> ^( DEF definition_signature $content) | VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )? -> ^( DEF VAR_ID expression ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==VAR_ID) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==OP_ASSIGN) ) {
                    alt29=2;
                }
                else if ( (LA29_1==CONTENT||LA29_1==OP_DATA_IS_EXPRESSION||(LA29_1>=OP_FOLLOW && LA29_1<=OP_REVERSE_FOLLOW)||LA29_1==TILDE||LA29_1==VAR_ID) ) {
                    alt29=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA29_0==DEFAULT) ) {
                alt29=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:152:5: definition_signature content= tag_content
                    {
                    pushFollow(FOLLOW_definition_signature_in_definition_inside_tag964);
                    definition_signature80=definition_signature();

                    state._fsp--;

                    stream_definition_signature.add(definition_signature80.getTree());
                    pushFollow(FOLLOW_tag_content_in_definition_inside_tag968);
                    content=tag_content();

                    state._fsp--;

                    stream_tag_content.add(content.getTree());


                    // AST REWRITE
                    // elements: definition_signature, content
                    // token labels: 
                    // rule labels: content, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"rule content",content!=null?content.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 153:5: -> ^( DEF definition_signature $content)
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:153:8: ^( DEF definition_signature $content)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new TemplateDefinition(DEF), root_1);

                        adaptor.addChild(root_1, stream_definition_signature.nextTree());
                        adaptor.addChild(root_1, stream_content.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:154:5: VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )?
                    {
                    VAR_ID81=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_inside_tag992);  
                    stream_VAR_ID.add(VAR_ID81);

                    OP_ASSIGN82=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_inside_tag994);  
                    stream_OP_ASSIGN.add(OP_ASSIGN82);

                    pushFollow(FOLLOW_expression_in_definition_inside_tag996);
                    expression83=expression();

                    state._fsp--;

                    stream_expression.add(expression83.getTree());
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:154:33: ( CONTENT ( STRING_LITERAL )? )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==CONTENT) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:154:34: CONTENT ( STRING_LITERAL )?
                            {
                            CONTENT84=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_definition_inside_tag999);  
                            stream_CONTENT.add(CONTENT84);

                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:154:42: ( STRING_LITERAL )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==STRING_LITERAL) ) {
                                alt27=1;
                            }
                            switch (alt27) {
                                case 1 :
                                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:154:42: STRING_LITERAL
                                    {
                                    STRING_LITERAL85=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_definition_inside_tag1001);  
                                    stream_STRING_LITERAL.add(STRING_LITERAL85);


                                    }
                                    break;

                            }


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expression, VAR_ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 155:5: -> ^( DEF VAR_ID expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:155:8: ^( DEF VAR_ID expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new TemplateDefinition(DEF), root_1);

                        adaptor.addChild(root_1, new Ident(stream_VAR_ID.nextToken()));
                        adaptor.addChild(root_1, stream_expression.nextTree());

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
    // $ANTLR end "definition_inside_tag"

    public static class lambda_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lambda_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:161:1: lambda_expression : ( LAMBDA ( definition_argument )* COLON expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | ( definition_argument )* OP_FOLLOW expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | lambda_match_expression );
    public final OmttParser.lambda_expression_return lambda_expression() throws RecognitionException {
        OmttParser.lambda_expression_return retval = new OmttParser.lambda_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAMBDA86=null;
        Token COLON88=null;
        Token OP_FOLLOW91=null;
        OmttParser.definition_argument_return definition_argument87 = null;

        OmttParser.expression_return expression89 = null;

        OmttParser.definition_argument_return definition_argument90 = null;

        OmttParser.expression_return expression92 = null;

        OmttParser.lambda_match_expression_return lambda_match_expression93 = null;


        Object LAMBDA86_tree=null;
        Object COLON88_tree=null;
        Object OP_FOLLOW91_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_LAMBDA=new RewriteRuleTokenStream(adaptor,"token LAMBDA");
        RewriteRuleTokenStream stream_OP_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_FOLLOW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_argument=new RewriteRuleSubtreeStream(adaptor,"rule definition_argument");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:162:3: ( LAMBDA ( definition_argument )* COLON expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | ( definition_argument )* OP_FOLLOW expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | lambda_match_expression )
            int alt32=3;
            switch ( input.LA(1) ) {
            case LAMBDA:
                {
                alt32=1;
                }
                break;
            case OP_FOLLOW:
            case TILDE:
            case VAR_ID:
                {
                alt32=2;
                }
                break;
            case CLASS_ID:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:162:5: LAMBDA ( definition_argument )* COLON expression
                    {
                    LAMBDA86=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambda_expression1040);  
                    stream_LAMBDA.add(LAMBDA86);

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:162:12: ( definition_argument )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==TILDE||LA30_0==VAR_ID) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:162:12: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_lambda_expression1042);
                    	    definition_argument87=definition_argument();

                    	    state._fsp--;

                    	    stream_definition_argument.add(definition_argument87.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    COLON88=(Token)match(input,COLON,FOLLOW_COLON_in_lambda_expression1045);  
                    stream_COLON.add(COLON88);

                    pushFollow(FOLLOW_expression_in_lambda_expression1047);
                    expression89=expression();

                    state._fsp--;

                    stream_expression.add(expression89.getTree());


                    // AST REWRITE
                    // elements: expression, definition_argument, LAMBDA
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 163:5: -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:163:8: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(stream_LAMBDA.nextToken()), root_1);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:163:35: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:163:47: ( definition_argument )*
                        while ( stream_definition_argument.hasNext() ) {
                            adaptor.addChild(root_2, stream_definition_argument.nextTree());

                        }
                        stream_definition_argument.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:164:5: ( definition_argument )* OP_FOLLOW expression
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:164:5: ( definition_argument )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==TILDE||LA31_0==VAR_ID) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:164:5: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_lambda_expression1075);
                    	    definition_argument90=definition_argument();

                    	    state._fsp--;

                    	    stream_definition_argument.add(definition_argument90.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    OP_FOLLOW91=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_lambda_expression1078);  
                    stream_OP_FOLLOW.add(OP_FOLLOW91);

                    pushFollow(FOLLOW_expression_in_lambda_expression1080);
                    expression92=expression();

                    state._fsp--;

                    stream_expression.add(expression92.getTree());


                    // AST REWRITE
                    // elements: definition_argument, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 165:4: -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:165:7: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(LAMBDA), root_1);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:165:34: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:165:46: ( definition_argument )*
                        while ( stream_definition_argument.hasNext() ) {
                            adaptor.addChild(root_2, stream_definition_argument.nextTree());

                        }
                        stream_definition_argument.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:166:5: lambda_match_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lambda_match_expression_in_lambda_expression1107);
                    lambda_match_expression93=lambda_match_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, lambda_match_expression93.getTree());

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
    // $ANTLR end "lambda_expression"

    public static class lambda_match_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lambda_match_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:168:10: fragment lambda_match_expression : single_lambda_match ( SEMICOLON single_lambda_match )* ;
    public final OmttParser.lambda_match_expression_return lambda_match_expression() throws RecognitionException {
        OmttParser.lambda_match_expression_return retval = new OmttParser.lambda_match_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON95=null;
        OmttParser.single_lambda_match_return single_lambda_match94 = null;

        OmttParser.single_lambda_match_return single_lambda_match96 = null;


        Object SEMICOLON95_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:169:2: ( single_lambda_match ( SEMICOLON single_lambda_match )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:169:4: single_lambda_match ( SEMICOLON single_lambda_match )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_lambda_match_in_lambda_match_expression1120);
            single_lambda_match94=single_lambda_match();

            state._fsp--;

            adaptor.addChild(root_0, single_lambda_match94.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:169:24: ( SEMICOLON single_lambda_match )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==SEMICOLON) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:169:25: SEMICOLON single_lambda_match
            	    {
            	    SEMICOLON95=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_lambda_match_expression1123); 
            	    SEMICOLON95_tree = (Object)adaptor.create(SEMICOLON95);
            	    adaptor.addChild(root_0, SEMICOLON95_tree);

            	    pushFollow(FOLLOW_single_lambda_match_in_lambda_match_expression1125);
            	    single_lambda_match96=single_lambda_match();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_lambda_match96.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


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
    // $ANTLR end "lambda_match_expression"

    public static class single_lambda_match_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "single_lambda_match"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:171:10: fragment single_lambda_match : type OP_FOLLOW concatence_expression ;
    public final OmttParser.single_lambda_match_return single_lambda_match() throws RecognitionException {
        OmttParser.single_lambda_match_return retval = new OmttParser.single_lambda_match_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_FOLLOW98=null;
        OmttParser.type_return type97 = null;

        OmttParser.concatence_expression_return concatence_expression99 = null;


        Object OP_FOLLOW98_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:172:2: ( type OP_FOLLOW concatence_expression )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:172:4: type OP_FOLLOW concatence_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_single_lambda_match1139);
            type97=type();

            state._fsp--;

            adaptor.addChild(root_0, type97.getTree());
            OP_FOLLOW98=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_single_lambda_match1141); 
            OP_FOLLOW98_tree = (Object)adaptor.create(OP_FOLLOW98);
            adaptor.addChild(root_0, OP_FOLLOW98_tree);

            pushFollow(FOLLOW_concatence_expression_in_single_lambda_match1143);
            concatence_expression99=concatence_expression();

            state._fsp--;

            adaptor.addChild(root_0, concatence_expression99.getTree());

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
    // $ANTLR end "single_lambda_match"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:175:10: fragment type : CLASS_ID ( OP_MULTIPLY )? -> ^( CLASS_ID ( OP_MULTIPLY )? ) ;
    public final OmttParser.type_return type() throws RecognitionException {
        OmttParser.type_return retval = new OmttParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS_ID100=null;
        Token OP_MULTIPLY101=null;

        Object CLASS_ID100_tree=null;
        Object OP_MULTIPLY101_tree=null;
        RewriteRuleTokenStream stream_OP_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token OP_MULTIPLY");
        RewriteRuleTokenStream stream_CLASS_ID=new RewriteRuleTokenStream(adaptor,"token CLASS_ID");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:176:3: ( CLASS_ID ( OP_MULTIPLY )? -> ^( CLASS_ID ( OP_MULTIPLY )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:176:5: CLASS_ID ( OP_MULTIPLY )?
            {
            CLASS_ID100=(Token)match(input,CLASS_ID,FOLLOW_CLASS_ID_in_type1157);  
            stream_CLASS_ID.add(CLASS_ID100);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:176:14: ( OP_MULTIPLY )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==OP_MULTIPLY) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:176:14: OP_MULTIPLY
                    {
                    OP_MULTIPLY101=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_type1159);  
                    stream_OP_MULTIPLY.add(OP_MULTIPLY101);


                    }
                    break;

            }



            // AST REWRITE
            // elements: CLASS_ID, OP_MULTIPLY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 177:4: -> ^( CLASS_ID ( OP_MULTIPLY )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:177:7: ^( CLASS_ID ( OP_MULTIPLY )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TypeReference(stream_CLASS_ID.nextToken()), root_1);

                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:177:33: ( OP_MULTIPLY )?
                if ( stream_OP_MULTIPLY.hasNext() ) {
                    adaptor.addChild(root_1, stream_OP_MULTIPLY.nextNode());

                }
                stream_OP_MULTIPLY.reset();

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
    // $ANTLR end "type"

    public static class single_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "single_type"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:179:10: fragment single_type : CLASS_ID -> ^( CLASS_ID ) ;
    public final OmttParser.single_type_return single_type() throws RecognitionException {
        OmttParser.single_type_return retval = new OmttParser.single_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS_ID102=null;

        Object CLASS_ID102_tree=null;
        RewriteRuleTokenStream stream_CLASS_ID=new RewriteRuleTokenStream(adaptor,"token CLASS_ID");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:180:3: ( CLASS_ID -> ^( CLASS_ID ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:180:5: CLASS_ID
            {
            CLASS_ID102=(Token)match(input,CLASS_ID,FOLLOW_CLASS_ID_in_single_type1189);  
            stream_CLASS_ID.add(CLASS_ID102);



            // AST REWRITE
            // elements: CLASS_ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 181:4: -> ^( CLASS_ID )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:181:7: ^( CLASS_ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TypeReference(stream_CLASS_ID.nextToken()), root_1);

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
    // $ANTLR end "single_type"

    public static class concatence_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "concatence_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:186:1: concatence_expression : (expr+= control_expression -> $expr) ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )? ;
    public final OmttParser.concatence_expression_return concatence_expression() throws RecognitionException {
        OmttParser.concatence_expression_return retval = new OmttParser.concatence_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_CONCAT103=null;
        List list_expr=null;
        OmttParser.control_expression_return expr = null;
         expr = null;
        Object OP_CONCAT103_tree=null;
        RewriteRuleTokenStream stream_OP_CONCAT=new RewriteRuleTokenStream(adaptor,"token OP_CONCAT");
        RewriteRuleSubtreeStream stream_control_expression=new RewriteRuleSubtreeStream(adaptor,"rule control_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:187:3: ( (expr+= control_expression -> $expr) ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:187:5: (expr+= control_expression -> $expr) ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:187:5: (expr+= control_expression -> $expr)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:187:6: expr+= control_expression
            {
            pushFollow(FOLLOW_control_expression_in_concatence_expression1218);
            expr=control_expression();

            state._fsp--;

            stream_control_expression.add(expr.getTree());
            if (list_expr==null) list_expr=new ArrayList();
            list_expr.add(expr.getTree());



            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: expr
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"token expr",list_expr);
            root_0 = (Object)adaptor.nil();
            // 187:31: -> $expr
            {
                adaptor.addChild(root_0, stream_expr.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:188:5: ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==OP_CONCAT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:188:6: ( OP_CONCAT expr+= control_expression )+
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:188:6: ( OP_CONCAT expr+= control_expression )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==OP_CONCAT) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:188:7: OP_CONCAT expr+= control_expression
                    	    {
                    	    OP_CONCAT103=(Token)match(input,OP_CONCAT,FOLLOW_OP_CONCAT_in_concatence_expression1232);  
                    	    stream_OP_CONCAT.add(OP_CONCAT103);

                    	    pushFollow(FOLLOW_control_expression_in_concatence_expression1236);
                    	    expr=control_expression();

                    	    state._fsp--;

                    	    stream_control_expression.add(expr.getTree());
                    	    if (list_expr==null) list_expr=new ArrayList();
                    	    list_expr.add(expr.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);



                    // AST REWRITE
                    // elements: expr, OP_CONCAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: expr
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"token expr",list_expr);
                    root_0 = (Object)adaptor.nil();
                    // 188:44: -> ^( OP_CONCAT ( $expr)+ )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:188:47: ^( OP_CONCAT ( $expr)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Data(stream_OP_CONCAT.nextToken()), root_1);

                        if ( !(stream_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
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
    // $ANTLR end "concatence_expression"

    public static class control_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "control_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:191:1: control_expression : ( if_expression | map_expression | context_expression );
    public final OmttParser.control_expression_return control_expression() throws RecognitionException {
        OmttParser.control_expression_return retval = new OmttParser.control_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.if_expression_return if_expression104 = null;

        OmttParser.map_expression_return map_expression105 = null;

        OmttParser.context_expression_return context_expression106 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:192:3: ( if_expression | map_expression | context_expression )
            int alt37=3;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt37=1;
                }
                break;
            case MAP:
                {
                alt37=2;
                }
                break;
            case STRING_LITERAL:
            case INT_NUMBER:
            case REAL_NUMBER:
            case DATA_START:
            case NULL:
            case TRUE:
            case FALSE:
            case TILDE:
            case LEFT_PAREN:
            case OP_MINUS:
            case OP_NOT:
            case OP_GENERAL:
            case VAR_ID:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:192:5: if_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_expression_in_control_expression1266);
                    if_expression104=if_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, if_expression104.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:193:5: map_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_expression_in_control_expression1272);
                    map_expression105=map_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, map_expression105.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:194:5: context_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_context_expression_in_control_expression1278);
                    context_expression106=context_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, context_expression106.getTree());

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
    // $ANTLR end "control_expression"

    public static class if_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:197:1: if_expression : IF condition= context_expression COLON part_if= control_expression ELSE ( COLON )? part_else= control_expression -> ^( IF_ELSE $condition $part_if $part_else) ;
    public final OmttParser.if_expression_return if_expression() throws RecognitionException {
        OmttParser.if_expression_return retval = new OmttParser.if_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF107=null;
        Token COLON108=null;
        Token ELSE109=null;
        Token COLON110=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.control_expression_return part_if = null;

        OmttParser.control_expression_return part_else = null;


        Object IF107_tree=null;
        Object COLON108_tree=null;
        Object ELSE109_tree=null;
        Object COLON110_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_control_expression=new RewriteRuleSubtreeStream(adaptor,"rule control_expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:198:3: ( IF condition= context_expression COLON part_if= control_expression ELSE ( COLON )? part_else= control_expression -> ^( IF_ELSE $condition $part_if $part_else) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:198:5: IF condition= context_expression COLON part_if= control_expression ELSE ( COLON )? part_else= control_expression
            {
            IF107=(Token)match(input,IF,FOLLOW_IF_in_if_expression1291);  
            stream_IF.add(IF107);

            pushFollow(FOLLOW_context_expression_in_if_expression1295);
            condition=context_expression();

            state._fsp--;

            stream_context_expression.add(condition.getTree());
            COLON108=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1297);  
            stream_COLON.add(COLON108);

            pushFollow(FOLLOW_control_expression_in_if_expression1305);
            part_if=control_expression();

            state._fsp--;

            stream_control_expression.add(part_if.getTree());
            ELSE109=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_expression1311);  
            stream_ELSE.add(ELSE109);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:200:10: ( COLON )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==COLON) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:200:10: COLON
                    {
                    COLON110=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1313);  
                    stream_COLON.add(COLON110);


                    }
                    break;

            }

            pushFollow(FOLLOW_control_expression_in_if_expression1322);
            part_else=control_expression();

            state._fsp--;

            stream_control_expression.add(part_else.getTree());


            // AST REWRITE
            // elements: condition, part_if, part_else
            // token labels: 
            // rule labels: retval, part_else, condition, part_if
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_part_else=new RewriteRuleSubtreeStream(adaptor,"rule part_else",part_else!=null?part_else.tree:null);
            RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition",condition!=null?condition.tree:null);
            RewriteRuleSubtreeStream stream_part_if=new RewriteRuleSubtreeStream(adaptor,"rule part_if",part_if!=null?part_if.tree:null);

            root_0 = (Object)adaptor.nil();
            // 202:5: -> ^( IF_ELSE $condition $part_if $part_else)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:202:8: ^( IF_ELSE $condition $part_if $part_else)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new IfElse(IF_ELSE), root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());
                adaptor.addChild(root_1, stream_part_if.nextTree());
                adaptor.addChild(root_1, stream_part_else.nextTree());

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
    // $ANTLR end "if_expression"

    public static class if_tag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_tag"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:204:1: if_tag : TAG_START if_subtag TAG_END ;
    public final OmttParser.if_tag_return if_tag() throws RecognitionException {
        OmttParser.if_tag_return retval = new OmttParser.if_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START111=null;
        Token TAG_END113=null;
        OmttParser.if_subtag_return if_subtag112 = null;


        Object TAG_START111_tree=null;
        Object TAG_END113_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:205:3: ( TAG_START if_subtag TAG_END )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:205:5: TAG_START if_subtag TAG_END
            {
            root_0 = (Object)adaptor.nil();

            TAG_START111=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_tag1356); 
            pushFollow(FOLLOW_if_subtag_in_if_tag1362);
            if_subtag112=if_subtag();

            state._fsp--;

            adaptor.addChild(root_0, if_subtag112.getTree());
            TAG_END113=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_if_tag1368); 

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
    // $ANTLR end "if_tag"

    public static class if_subtag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_subtag"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:209:10: fragment if_subtag : ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )? -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? ) ;
    public final OmttParser.if_subtag_return if_subtag() throws RecognitionException {
        OmttParser.if_subtag_return retval = new OmttParser.if_subtag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF114=null;
        Token TAG_START115=null;
        Token ELSE116=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.tag_content_return part_if = null;

        OmttParser.tag_content_return part_else = null;

        OmttParser.if_subtag_return subtag = null;


        Object IF114_tree=null;
        Object TAG_START115_tree=null;
        Object ELSE116_tree=null;
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_if_subtag=new RewriteRuleSubtreeStream(adaptor,"rule if_subtag");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:210:2: ( ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )? -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:210:4: ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:210:4: ( IF condition= context_expression part_if= tag_content )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:210:6: IF condition= context_expression part_if= tag_content
            {
            IF114=(Token)match(input,IF,FOLLOW_IF_in_if_subtag1384);  
            stream_IF.add(IF114);

            pushFollow(FOLLOW_context_expression_in_if_subtag1388);
            condition=context_expression();

            state._fsp--;

            stream_context_expression.add(condition.getTree());
            pushFollow(FOLLOW_tag_content_in_if_subtag1396);
            part_if=tag_content();

            state._fsp--;

            stream_tag_content.add(part_if.getTree());

            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:213:3: ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==TAG_START) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:213:5: TAG_START ELSE (part_else= tag_content | subtag= if_subtag )
                    {
                    TAG_START115=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_subtag1406);  
                    stream_TAG_START.add(TAG_START115);

                    ELSE116=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_subtag1408);  
                    stream_ELSE.add(ELSE116);

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:4: (part_else= tag_content | subtag= if_subtag )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==CONTENT||LA39_0==OP_DATA_IS_EXPRESSION) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==IF) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:5: part_else= tag_content
                            {
                            pushFollow(FOLLOW_tag_content_in_if_subtag1416);
                            part_else=tag_content();

                            state._fsp--;

                            stream_tag_content.add(part_else.getTree());

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:29: subtag= if_subtag
                            {
                            pushFollow(FOLLOW_if_subtag_in_if_subtag1422);
                            subtag=if_subtag();

                            state._fsp--;

                            stream_if_subtag.add(subtag.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: part_else, subtag, condition, part_if
            // token labels: 
            // rule labels: subtag, retval, part_else, condition, part_if
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_subtag=new RewriteRuleSubtreeStream(adaptor,"rule subtag",subtag!=null?subtag.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_part_else=new RewriteRuleSubtreeStream(adaptor,"rule part_else",part_else!=null?part_else.tree:null);
            RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition",condition!=null?condition.tree:null);
            RewriteRuleSubtreeStream stream_part_if=new RewriteRuleSubtreeStream(adaptor,"rule part_if",part_if!=null?part_if.tree:null);

            root_0 = (Object)adaptor.nil();
            // 216:3: -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:216:6: ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new IfElse(IF_ELSE), root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());
                adaptor.addChild(root_1, stream_part_if.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:216:44: ( $part_else)?
                if ( stream_part_else.hasNext() ) {
                    adaptor.addChild(root_1, stream_part_else.nextTree());

                }
                stream_part_else.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:216:56: ( $subtag)?
                if ( stream_subtag.hasNext() ) {
                    adaptor.addChild(root_1, stream_subtag.nextTree());

                }
                stream_subtag.reset();

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
    // $ANTLR end "if_subtag"

    public static class map_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "map_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:219:1: map_expression : MAP ( item_alias )? iter= context_expression COLON expr= control_expression -> ^( MAP $iter $expr ( item_alias )? ) ;
    public final OmttParser.map_expression_return map_expression() throws RecognitionException {
        OmttParser.map_expression_return retval = new OmttParser.map_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MAP117=null;
        Token COLON119=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.control_expression_return expr = null;

        OmttParser.item_alias_return item_alias118 = null;


        Object MAP117_tree=null;
        Object COLON119_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_control_expression=new RewriteRuleSubtreeStream(adaptor,"rule control_expression");
        RewriteRuleSubtreeStream stream_item_alias=new RewriteRuleSubtreeStream(adaptor,"rule item_alias");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:220:3: ( MAP ( item_alias )? iter= context_expression COLON expr= control_expression -> ^( MAP $iter $expr ( item_alias )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:220:5: MAP ( item_alias )? iter= context_expression COLON expr= control_expression
            {
            MAP117=(Token)match(input,MAP,FOLLOW_MAP_in_map_expression1465);  
            stream_MAP.add(MAP117);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:220:9: ( item_alias )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==VAR_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==OP_REVERSE_FOLLOW) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:220:9: item_alias
                    {
                    pushFollow(FOLLOW_item_alias_in_map_expression1467);
                    item_alias118=item_alias();

                    state._fsp--;

                    stream_item_alias.add(item_alias118.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_context_expression_in_map_expression1472);
            iter=context_expression();

            state._fsp--;

            stream_context_expression.add(iter.getTree());
            COLON119=(Token)match(input,COLON,FOLLOW_COLON_in_map_expression1474);  
            stream_COLON.add(COLON119);

            pushFollow(FOLLOW_control_expression_in_map_expression1482);
            expr=control_expression();

            state._fsp--;

            stream_control_expression.add(expr.getTree());


            // AST REWRITE
            // elements: item_alias, iter, MAP, expr
            // token labels: 
            // rule labels: retval, expr, iter
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.tree:null);
            RewriteRuleSubtreeStream stream_iter=new RewriteRuleSubtreeStream(adaptor,"rule iter",iter!=null?iter.tree:null);

            root_0 = (Object)adaptor.nil();
            // 222:5: -> ^( MAP $iter $expr ( item_alias )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:222:8: ^( MAP $iter $expr ( item_alias )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_MAP.nextToken()), root_1);

                adaptor.addChild(root_1, stream_iter.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:222:42: ( item_alias )?
                if ( stream_item_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_item_alias.nextTree());

                }
                stream_item_alias.reset();

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
    // $ANTLR end "map_expression"

    public static class map_tag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "map_tag"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:224:1: map_tag : TAG_START MAP ( item_alias )? iter= context_expression expr= tag_content TAG_END -> ^( MAP $iter $expr ( item_alias )? ) ;
    public final OmttParser.map_tag_return map_tag() throws RecognitionException {
        OmttParser.map_tag_return retval = new OmttParser.map_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START120=null;
        Token MAP121=null;
        Token TAG_END123=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.tag_content_return expr = null;

        OmttParser.item_alias_return item_alias122 = null;


        Object TAG_START120_tree=null;
        Object MAP121_tree=null;
        Object TAG_END123_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_item_alias=new RewriteRuleSubtreeStream(adaptor,"rule item_alias");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:225:3: ( TAG_START MAP ( item_alias )? iter= context_expression expr= tag_content TAG_END -> ^( MAP $iter $expr ( item_alias )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:225:5: TAG_START MAP ( item_alias )? iter= context_expression expr= tag_content TAG_END
            {
            TAG_START120=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_map_tag1516);  
            stream_TAG_START.add(TAG_START120);

            MAP121=(Token)match(input,MAP,FOLLOW_MAP_in_map_tag1518);  
            stream_MAP.add(MAP121);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:225:19: ( item_alias )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==VAR_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==OP_REVERSE_FOLLOW) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:225:19: item_alias
                    {
                    pushFollow(FOLLOW_item_alias_in_map_tag1520);
                    item_alias122=item_alias();

                    state._fsp--;

                    stream_item_alias.add(item_alias122.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_context_expression_in_map_tag1525);
            iter=context_expression();

            state._fsp--;

            stream_context_expression.add(iter.getTree());
            pushFollow(FOLLOW_tag_content_in_map_tag1533);
            expr=tag_content();

            state._fsp--;

            stream_tag_content.add(expr.getTree());
            TAG_END123=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_map_tag1539);  
            stream_TAG_END.add(TAG_END123);



            // AST REWRITE
            // elements: expr, MAP, iter, item_alias
            // token labels: 
            // rule labels: retval, expr, iter
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.tree:null);
            RewriteRuleSubtreeStream stream_iter=new RewriteRuleSubtreeStream(adaptor,"rule iter",iter!=null?iter.tree:null);

            root_0 = (Object)adaptor.nil();
            // 228:5: -> ^( MAP $iter $expr ( item_alias )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:228:8: ^( MAP $iter $expr ( item_alias )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_MAP.nextToken()), root_1);

                adaptor.addChild(root_1, stream_iter.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:228:42: ( item_alias )?
                if ( stream_item_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_item_alias.nextTree());

                }
                stream_item_alias.reset();

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
    // $ANTLR end "map_tag"

    public static class apply_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "apply_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:231:1: apply_expression : APPLY ( item_alias )? expression COLON expr= lambda_expression -> ^( CALL[true] $expr ^( ARGUMENT expression ) ( item_alias )? ) ;
    public final OmttParser.apply_expression_return apply_expression() throws RecognitionException {
        OmttParser.apply_expression_return retval = new OmttParser.apply_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token APPLY124=null;
        Token COLON127=null;
        OmttParser.lambda_expression_return expr = null;

        OmttParser.item_alias_return item_alias125 = null;

        OmttParser.expression_return expression126 = null;


        Object APPLY124_tree=null;
        Object COLON127_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_APPLY=new RewriteRuleTokenStream(adaptor,"token APPLY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_lambda_expression=new RewriteRuleSubtreeStream(adaptor,"rule lambda_expression");
        RewriteRuleSubtreeStream stream_item_alias=new RewriteRuleSubtreeStream(adaptor,"rule item_alias");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:232:3: ( APPLY ( item_alias )? expression COLON expr= lambda_expression -> ^( CALL[true] $expr ^( ARGUMENT expression ) ( item_alias )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:232:5: APPLY ( item_alias )? expression COLON expr= lambda_expression
            {
            APPLY124=(Token)match(input,APPLY,FOLLOW_APPLY_in_apply_expression1574);  
            stream_APPLY.add(APPLY124);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:232:11: ( item_alias )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==VAR_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==OP_REVERSE_FOLLOW) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:232:11: item_alias
                    {
                    pushFollow(FOLLOW_item_alias_in_apply_expression1576);
                    item_alias125=item_alias();

                    state._fsp--;

                    stream_item_alias.add(item_alias125.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_apply_expression1579);
            expression126=expression();

            state._fsp--;

            stream_expression.add(expression126.getTree());
            COLON127=(Token)match(input,COLON,FOLLOW_COLON_in_apply_expression1581);  
            stream_COLON.add(COLON127);

            pushFollow(FOLLOW_lambda_expression_in_apply_expression1589);
            expr=lambda_expression();

            state._fsp--;

            stream_lambda_expression.add(expr.getTree());


            // AST REWRITE
            // elements: expression, expr, item_alias
            // token labels: 
            // rule labels: retval, expr
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.tree:null);

            root_0 = (Object)adaptor.nil();
            // 234:5: -> ^( CALL[true] $expr ^( ARGUMENT expression ) ( item_alias )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:234:8: ^( CALL[true] $expr ^( ARGUMENT expression ) ( item_alias )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:234:33: ^( ARGUMENT expression )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:234:74: ( item_alias )?
                if ( stream_item_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_item_alias.nextTree());

                }
                stream_item_alias.reset();

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
    // $ANTLR end "apply_expression"

    public static class item_alias_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "item_alias"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:237:10: fragment item_alias : VAR_ID OP_REVERSE_FOLLOW -> ^( AS VAR_ID ) ;
    public final OmttParser.item_alias_return item_alias() throws RecognitionException {
        OmttParser.item_alias_return retval = new OmttParser.item_alias_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID128=null;
        Token OP_REVERSE_FOLLOW129=null;

        Object VAR_ID128_tree=null;
        Object OP_REVERSE_FOLLOW129_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_REVERSE_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_REVERSE_FOLLOW");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:238:2: ( VAR_ID OP_REVERSE_FOLLOW -> ^( AS VAR_ID ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:238:4: VAR_ID OP_REVERSE_FOLLOW
            {
            VAR_ID128=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_item_alias1632);  
            stream_VAR_ID.add(VAR_ID128);

            OP_REVERSE_FOLLOW129=(Token)match(input,OP_REVERSE_FOLLOW,FOLLOW_OP_REVERSE_FOLLOW_in_item_alias1634);  
            stream_OP_REVERSE_FOLLOW.add(OP_REVERSE_FOLLOW129);



            // AST REWRITE
            // elements: VAR_ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 239:3: -> ^( AS VAR_ID )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:239:6: ^( AS VAR_ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AS, "AS"), root_1);

                adaptor.addChild(root_1, stream_VAR_ID.nextNode());

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
    // $ANTLR end "item_alias"

    public static class context_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "context_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:243:1: context_expression : (fe= boolean_expression -> $fe) ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_map ce= boolean_expression -> ^( op_map $context_expression $ce) )* ;
    public final OmttParser.context_expression_return context_expression() throws RecognitionException {
        OmttParser.context_expression_return retval = new OmttParser.context_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_expression_return fe = null;

        OmttParser.function_arguments_return arguments = null;

        OmttParser.boolean_expression_return ce = null;

        OmttParser.op_apply_return op_apply130 = null;

        OmttParser.atom_expression_return atom_expression131 = null;

        OmttParser.op_map_return op_map132 = null;


        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_op_apply=new RewriteRuleSubtreeStream(adaptor,"rule op_apply");
        RewriteRuleSubtreeStream stream_boolean_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expression");
        RewriteRuleSubtreeStream stream_function_arguments=new RewriteRuleSubtreeStream(adaptor,"rule function_arguments");
        RewriteRuleSubtreeStream stream_op_map=new RewriteRuleSubtreeStream(adaptor,"rule op_map");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:244:3: ( (fe= boolean_expression -> $fe) ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_map ce= boolean_expression -> ^( op_map $context_expression $ce) )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:244:5: (fe= boolean_expression -> $fe) ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_map ce= boolean_expression -> ^( op_map $context_expression $ce) )*
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:244:5: (fe= boolean_expression -> $fe)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:244:6: fe= boolean_expression
            {
            pushFollow(FOLLOW_boolean_expression_in_context_expression1660);
            fe=boolean_expression();

            state._fsp--;

            stream_boolean_expression.add(fe.getTree());


            // AST REWRITE
            // elements: fe
            // token labels: 
            // rule labels: retval, fe
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_fe=new RewriteRuleSubtreeStream(adaptor,"rule fe",fe!=null?fe.tree:null);

            root_0 = (Object)adaptor.nil();
            // 244:28: -> $fe
            {
                adaptor.addChild(root_0, stream_fe.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:245:5: ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_map ce= boolean_expression -> ^( op_map $context_expression $ce) )*
            loop44:
            do {
                int alt44=3;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==APPLY||LA44_0==OP_CONTEXT) ) {
                    alt44=1;
                }
                else if ( (LA44_0==MAP||LA44_0==OP_EXPRESSION_CONTEXT) ) {
                    alt44=2;
                }


                switch (alt44) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:245:7: op_apply atom_expression arguments= function_arguments
            	    {
            	    pushFollow(FOLLOW_op_apply_in_context_expression1674);
            	    op_apply130=op_apply();

            	    state._fsp--;

            	    stream_op_apply.add(op_apply130.getTree());
            	    pushFollow(FOLLOW_atom_expression_in_context_expression1676);
            	    atom_expression131=atom_expression();

            	    state._fsp--;

            	    stream_atom_expression.add(atom_expression131.getTree());
            	    pushFollow(FOLLOW_function_arguments_in_context_expression1680);
            	    arguments=function_arguments();

            	    state._fsp--;

            	    stream_function_arguments.add(arguments.getTree());


            	    // AST REWRITE
            	    // elements: atom_expression, context_expression, arguments
            	    // token labels: 
            	    // rule labels: retval, arguments
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments",arguments!=null?arguments.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 246:7: -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? )
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:246:10: ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

            	        adaptor.addChild(root_1, stream_atom_expression.nextTree());
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:246:45: ^( ARGUMENT $context_expression)
            	        {
            	        Object root_2 = (Object)adaptor.nil();
            	        root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:246:95: ( $arguments)?
            	        if ( stream_arguments.hasNext() ) {
            	            adaptor.addChild(root_1, stream_arguments.nextTree());

            	        }
            	        stream_arguments.reset();

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 2 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:247:7: op_map ce= boolean_expression
            	    {
            	    pushFollow(FOLLOW_op_map_in_context_expression1720);
            	    op_map132=op_map();

            	    state._fsp--;

            	    stream_op_map.add(op_map132.getTree());
            	    pushFollow(FOLLOW_boolean_expression_in_context_expression1724);
            	    ce=boolean_expression();

            	    state._fsp--;

            	    stream_boolean_expression.add(ce.getTree());


            	    // AST REWRITE
            	    // elements: ce, op_map, context_expression
            	    // token labels: 
            	    // rule labels: retval, ce
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_ce=new RewriteRuleSubtreeStream(adaptor,"rule ce",ce!=null?ce.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 248:6: -> ^( op_map $context_expression $ce)
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:248:9: ^( op_map $context_expression $ce)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_op_map.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_ce.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


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
    // $ANTLR end "context_expression"

    public static class op_apply_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "op_apply"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:251:10: fragment op_apply : ( OP_CONTEXT | APPLY );
    public final OmttParser.op_apply_return op_apply() throws RecognitionException {
        OmttParser.op_apply_return retval = new OmttParser.op_apply_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_CONTEXT133=null;
        Token APPLY134=null;

        Object OP_CONTEXT133_tree=null;
        Object APPLY134_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:252:2: ( OP_CONTEXT | APPLY )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==OP_CONTEXT) ) {
                alt45=1;
            }
            else if ( (LA45_0==APPLY) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:252:4: OP_CONTEXT
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_CONTEXT133=(Token)match(input,OP_CONTEXT,FOLLOW_OP_CONTEXT_in_op_apply1761); 
                    OP_CONTEXT133_tree = (Object)adaptor.create(OP_CONTEXT133);
                    root_0 = (Object)adaptor.becomeRoot(OP_CONTEXT133_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:253:4: APPLY
                    {
                    root_0 = (Object)adaptor.nil();

                    APPLY134=(Token)match(input,APPLY,FOLLOW_APPLY_in_op_apply1767); 
                    APPLY134_tree = (Object)adaptor.create(APPLY134);
                    root_0 = (Object)adaptor.becomeRoot(APPLY134_tree, root_0);


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
    // $ANTLR end "op_apply"

    public static class op_map_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "op_map"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:255:10: fragment op_map : ( OP_EXPRESSION_CONTEXT | MAP );
    public final OmttParser.op_map_return op_map() throws RecognitionException {
        OmttParser.op_map_return retval = new OmttParser.op_map_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_EXPRESSION_CONTEXT135=null;
        Token MAP136=null;

        Object OP_EXPRESSION_CONTEXT135_tree=null;
        Object MAP136_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:256:2: ( OP_EXPRESSION_CONTEXT | MAP )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==OP_EXPRESSION_CONTEXT) ) {
                alt46=1;
            }
            else if ( (LA46_0==MAP) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:256:4: OP_EXPRESSION_CONTEXT
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_EXPRESSION_CONTEXT135=(Token)match(input,OP_EXPRESSION_CONTEXT,FOLLOW_OP_EXPRESSION_CONTEXT_in_op_map1780); 
                    OP_EXPRESSION_CONTEXT135_tree = new Transformation(OP_EXPRESSION_CONTEXT135) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_EXPRESSION_CONTEXT135_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:257:4: MAP
                    {
                    root_0 = (Object)adaptor.nil();

                    MAP136=(Token)match(input,MAP,FOLLOW_MAP_in_op_map1789); 
                    MAP136_tree = new Transformation(MAP136) ;
                    root_0 = (Object)adaptor.becomeRoot(MAP136_tree, root_0);


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
    // $ANTLR end "op_map"

    public static class boolean_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:262:1: boolean_expression : boolean_binary_expression ;
    public final OmttParser.boolean_expression_return boolean_expression() throws RecognitionException {
        OmttParser.boolean_expression_return retval = new OmttParser.boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_binary_expression_return boolean_binary_expression137 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:263:2: ( boolean_binary_expression )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:263:4: boolean_binary_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_binary_expression_in_boolean_expression1806);
            boolean_binary_expression137=boolean_binary_expression();

            state._fsp--;

            adaptor.addChild(root_0, boolean_binary_expression137.getTree());

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
    // $ANTLR end "boolean_expression"

    public static class boolean_binary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_binary_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:265:10: fragment boolean_binary_expression : boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )* ;
    public final OmttParser.boolean_binary_expression_return boolean_binary_expression() throws RecognitionException {
        OmttParser.boolean_binary_expression_return retval = new OmttParser.boolean_binary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_unary_expression_return boolean_unary_expression138 = null;

        OmttParser.boolean_binary_operator_return boolean_binary_operator139 = null;

        OmttParser.boolean_unary_expression_return boolean_unary_expression140 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:266:3: ( boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:266:5: boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression1819);
            boolean_unary_expression138=boolean_unary_expression();

            state._fsp--;

            adaptor.addChild(root_0, boolean_unary_expression138.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:266:30: ( boolean_binary_operator boolean_unary_expression )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=OP_AND && LA47_0<=OP_OR)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:266:31: boolean_binary_operator boolean_unary_expression
            	    {
            	    pushFollow(FOLLOW_boolean_binary_operator_in_boolean_binary_expression1822);
            	    boolean_binary_operator139=boolean_binary_operator();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(boolean_binary_operator139.getTree(), root_0);
            	    pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression1825);
            	    boolean_unary_expression140=boolean_unary_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolean_unary_expression140.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


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
    // $ANTLR end "boolean_binary_expression"

    public static class boolean_unary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_unary_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:268:10: fragment boolean_unary_expression : ( boolean_unary_operator boolean_comparsion_expression | boolean_comparsion_expression );
    public final OmttParser.boolean_unary_expression_return boolean_unary_expression() throws RecognitionException {
        OmttParser.boolean_unary_expression_return retval = new OmttParser.boolean_unary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_unary_operator_return boolean_unary_operator141 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression142 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression143 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:269:3: ( boolean_unary_operator boolean_comparsion_expression | boolean_comparsion_expression )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==OP_NOT) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=STRING_LITERAL && LA48_0<=REAL_NUMBER)||LA48_0==DATA_START||(LA48_0>=NULL && LA48_0<=FALSE)||(LA48_0>=TILDE && LA48_0<=LEFT_PAREN)||LA48_0==OP_MINUS||LA48_0==OP_GENERAL||LA48_0==VAR_ID) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:269:5: boolean_unary_operator boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_unary_operator_in_boolean_unary_expression1841);
                    boolean_unary_operator141=boolean_unary_operator();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(boolean_unary_operator141.getTree(), root_0);
                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1844);
                    boolean_comparsion_expression142=boolean_comparsion_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_comparsion_expression142.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:270:5: boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1850);
                    boolean_comparsion_expression143=boolean_comparsion_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_comparsion_expression143.getTree());

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
    // $ANTLR end "boolean_unary_expression"

    public static class boolean_binary_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_binary_operator"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:273:10: fragment boolean_binary_operator : ( OP_AND | OP_OR );
    public final OmttParser.boolean_binary_operator_return boolean_binary_operator() throws RecognitionException {
        OmttParser.boolean_binary_operator_return retval = new OmttParser.boolean_binary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_AND144=null;
        Token OP_OR145=null;

        Object OP_AND144_tree=null;
        Object OP_OR145_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:274:3: ( OP_AND | OP_OR )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==OP_AND) ) {
                alt49=1;
            }
            else if ( (LA49_0==OP_OR) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:274:5: OP_AND
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_AND144=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_boolean_binary_operator1865); 
                    OP_AND144_tree = new BooleanExpression(OP_AND144) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_AND144_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:275:5: OP_OR
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_OR145=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_boolean_binary_operator1875); 
                    OP_OR145_tree = new BooleanExpression(OP_OR145) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_OR145_tree, root_0);


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
    // $ANTLR end "boolean_binary_operator"

    public static class boolean_unary_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_unary_operator"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:277:10: fragment boolean_unary_operator : OP_NOT ;
    public final OmttParser.boolean_unary_operator_return boolean_unary_operator() throws RecognitionException {
        OmttParser.boolean_unary_operator_return retval = new OmttParser.boolean_unary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_NOT146=null;

        Object OP_NOT146_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:278:3: ( OP_NOT )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:278:5: OP_NOT
            {
            root_0 = (Object)adaptor.nil();

            OP_NOT146=(Token)match(input,OP_NOT,FOLLOW_OP_NOT_in_boolean_unary_operator1893); 
            OP_NOT146_tree = new BooleanExpression(OP_NOT146) ;
            root_0 = (Object)adaptor.becomeRoot(OP_NOT146_tree, root_0);


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
    // $ANTLR end "boolean_unary_operator"

    public static class boolean_comparsion_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_comparsion_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:281:1: boolean_comparsion_expression : additive_expression ( boolean_comparsion_operator additive_expression )* ;
    public final OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression() throws RecognitionException {
        OmttParser.boolean_comparsion_expression_return retval = new OmttParser.boolean_comparsion_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.additive_expression_return additive_expression147 = null;

        OmttParser.boolean_comparsion_operator_return boolean_comparsion_operator148 = null;

        OmttParser.additive_expression_return additive_expression149 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:282:3: ( additive_expression ( boolean_comparsion_operator additive_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:282:5: additive_expression ( boolean_comparsion_operator additive_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression1910);
            additive_expression147=additive_expression();

            state._fsp--;

            adaptor.addChild(root_0, additive_expression147.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:282:25: ( boolean_comparsion_operator additive_expression )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=OP_EQUAL && LA50_0<=OP_GE)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:282:26: boolean_comparsion_operator additive_expression
            	    {
            	    pushFollow(FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression1913);
            	    boolean_comparsion_operator148=boolean_comparsion_operator();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(boolean_comparsion_operator148.getTree(), root_0);
            	    pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression1916);
            	    additive_expression149=additive_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, additive_expression149.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


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
    // $ANTLR end "boolean_comparsion_expression"

    public static class boolean_comparsion_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_comparsion_operator"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:284:10: fragment boolean_comparsion_operator : ( OP_EQUAL | OP_NOT_EQUAL | OP_LE | OP_LEQ | OP_GE | OP_GEQ );
    public final OmttParser.boolean_comparsion_operator_return boolean_comparsion_operator() throws RecognitionException {
        OmttParser.boolean_comparsion_operator_return retval = new OmttParser.boolean_comparsion_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_EQUAL150=null;
        Token OP_NOT_EQUAL151=null;
        Token OP_LE152=null;
        Token OP_LEQ153=null;
        Token OP_GE154=null;
        Token OP_GEQ155=null;

        Object OP_EQUAL150_tree=null;
        Object OP_NOT_EQUAL151_tree=null;
        Object OP_LE152_tree=null;
        Object OP_LEQ153_tree=null;
        Object OP_GE154_tree=null;
        Object OP_GEQ155_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:285:3: ( OP_EQUAL | OP_NOT_EQUAL | OP_LE | OP_LEQ | OP_GE | OP_GEQ )
            int alt51=6;
            switch ( input.LA(1) ) {
            case OP_EQUAL:
                {
                alt51=1;
                }
                break;
            case OP_NOT_EQUAL:
                {
                alt51=2;
                }
                break;
            case OP_LE:
                {
                alt51=3;
                }
                break;
            case OP_LEQ:
                {
                alt51=4;
                }
                break;
            case OP_GE:
                {
                alt51=5;
                }
                break;
            case OP_GEQ:
                {
                alt51=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:285:5: OP_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_EQUAL150=(Token)match(input,OP_EQUAL,FOLLOW_OP_EQUAL_in_boolean_comparsion_operator1932); 
                    OP_EQUAL150_tree = new BooleanExpression(OP_EQUAL150) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_EQUAL150_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:286:5: OP_NOT_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_NOT_EQUAL151=(Token)match(input,OP_NOT_EQUAL,FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator1942); 
                    OP_NOT_EQUAL151_tree = new BooleanExpression(OP_NOT_EQUAL151) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_NOT_EQUAL151_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:287:5: OP_LE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LE152=(Token)match(input,OP_LE,FOLLOW_OP_LE_in_boolean_comparsion_operator1952); 
                    OP_LE152_tree = new BooleanExpression(OP_LE152) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LE152_tree, root_0);


                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:288:5: OP_LEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LEQ153=(Token)match(input,OP_LEQ,FOLLOW_OP_LEQ_in_boolean_comparsion_operator1962); 
                    OP_LEQ153_tree = new BooleanExpression(OP_LEQ153) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LEQ153_tree, root_0);


                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:289:5: OP_GE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GE154=(Token)match(input,OP_GE,FOLLOW_OP_GE_in_boolean_comparsion_operator1972); 
                    OP_GE154_tree = new BooleanExpression(OP_GE154) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GE154_tree, root_0);


                    }
                    break;
                case 6 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:290:5: OP_GEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GEQ155=(Token)match(input,OP_GEQ,FOLLOW_OP_GEQ_in_boolean_comparsion_operator1982); 
                    OP_GEQ155_tree = new BooleanExpression(OP_GEQ155) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GEQ155_tree, root_0);


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
    // $ANTLR end "boolean_comparsion_operator"

    public static class additive_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additive_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:296:1: additive_expression : multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )* ;
    public final OmttParser.additive_expression_return additive_expression() throws RecognitionException {
        OmttParser.additive_expression_return retval = new OmttParser.additive_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_PLUS157=null;
        Token OP_MINUS158=null;
        OmttParser.multiplicative_expression_return multiplicative_expression156 = null;

        OmttParser.multiplicative_expression_return multiplicative_expression159 = null;


        Object OP_PLUS157_tree=null;
        Object OP_MINUS158_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:297:3: ( multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:297:5: multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2002);
            multiplicative_expression156=multiplicative_expression();

            state._fsp--;

            adaptor.addChild(root_0, multiplicative_expression156.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:298:5: ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=OP_PLUS && LA53_0<=OP_MINUS)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:299:7: ( OP_PLUS | OP_MINUS ) multiplicative_expression
            	    {
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:299:7: ( OP_PLUS | OP_MINUS )
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==OP_PLUS) ) {
            	        alt52=1;
            	    }
            	    else if ( (LA52_0==OP_MINUS) ) {
            	        alt52=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 52, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:299:9: OP_PLUS
            	            {
            	            OP_PLUS157=(Token)match(input,OP_PLUS,FOLLOW_OP_PLUS_in_additive_expression2018); 
            	            OP_PLUS157_tree = new ArithmeticExpression(OP_PLUS157) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_PLUS157_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:300:9: OP_MINUS
            	            {
            	            OP_MINUS158=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_additive_expression2032); 
            	            OP_MINUS158_tree = new ArithmeticExpression(OP_MINUS158) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MINUS158_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2052);
            	    multiplicative_expression159=multiplicative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicative_expression159.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


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
    // $ANTLR end "additive_expression"

    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicative_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:306:1: multiplicative_expression : negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )* ;
    public final OmttParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        OmttParser.multiplicative_expression_return retval = new OmttParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MULTIPLY161=null;
        Token SLASH162=null;
        Token OP_MODULO163=null;
        OmttParser.negative_expression_return negative_expression160 = null;

        OmttParser.negative_expression_return negative_expression164 = null;


        Object OP_MULTIPLY161_tree=null;
        Object SLASH162_tree=null;
        Object OP_MODULO163_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:307:3: ( negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:307:5: negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_negative_expression_in_multiplicative_expression2072);
            negative_expression160=negative_expression();

            state._fsp--;

            adaptor.addChild(root_0, negative_expression160.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:308:5: ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==SLASH||(LA55_0>=OP_MULTIPLY && LA55_0<=OP_MODULO)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:308:7: ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression
            	    {
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:308:7: ( OP_MULTIPLY | SLASH | OP_MODULO )
            	    int alt54=3;
            	    switch ( input.LA(1) ) {
            	    case OP_MULTIPLY:
            	        {
            	        alt54=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt54=2;
            	        }
            	        break;
            	    case OP_MODULO:
            	        {
            	        alt54=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 54, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt54) {
            	        case 1 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:308:9: OP_MULTIPLY
            	            {
            	            OP_MULTIPLY161=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_multiplicative_expression2082); 
            	            OP_MULTIPLY161_tree = new ArithmeticExpression(OP_MULTIPLY161) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MULTIPLY161_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:309:9: SLASH
            	            {
            	            SLASH162=(Token)match(input,SLASH,FOLLOW_SLASH_in_multiplicative_expression2096); 
            	            SLASH162_tree = new ArithmeticExpression(SLASH162) ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH162_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:310:9: OP_MODULO
            	            {
            	            OP_MODULO163=(Token)match(input,OP_MODULO,FOLLOW_OP_MODULO_in_multiplicative_expression2110); 
            	            OP_MODULO163_tree = new ArithmeticExpression(OP_MODULO163) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MODULO163_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_negative_expression_in_multiplicative_expression2130);
            	    negative_expression164=negative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, negative_expression164.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


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
    // $ANTLR end "multiplicative_expression"

    public static class negative_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negative_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:316:1: negative_expression : ( OP_MINUS functional_expression -> ^( OP_MINUS functional_expression ) | functional_expression );
    public final OmttParser.negative_expression_return negative_expression() throws RecognitionException {
        OmttParser.negative_expression_return retval = new OmttParser.negative_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MINUS165=null;
        OmttParser.functional_expression_return functional_expression166 = null;

        OmttParser.functional_expression_return functional_expression167 = null;


        Object OP_MINUS165_tree=null;
        RewriteRuleTokenStream stream_OP_MINUS=new RewriteRuleTokenStream(adaptor,"token OP_MINUS");
        RewriteRuleSubtreeStream stream_functional_expression=new RewriteRuleSubtreeStream(adaptor,"rule functional_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:317:2: ( OP_MINUS functional_expression -> ^( OP_MINUS functional_expression ) | functional_expression )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==OP_MINUS) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=STRING_LITERAL && LA56_0<=REAL_NUMBER)||LA56_0==DATA_START||(LA56_0>=NULL && LA56_0<=FALSE)||(LA56_0>=TILDE && LA56_0<=LEFT_PAREN)||LA56_0==OP_GENERAL||LA56_0==VAR_ID) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:317:4: OP_MINUS functional_expression
                    {
                    OP_MINUS165=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_negative_expression2149);  
                    stream_OP_MINUS.add(OP_MINUS165);

                    pushFollow(FOLLOW_functional_expression_in_negative_expression2151);
                    functional_expression166=functional_expression();

                    state._fsp--;

                    stream_functional_expression.add(functional_expression166.getTree());


                    // AST REWRITE
                    // elements: functional_expression, OP_MINUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 318:3: -> ^( OP_MINUS functional_expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:318:6: ^( OP_MINUS functional_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ArithmeticMinus(stream_OP_MINUS.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_functional_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:319:4: functional_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functional_expression_in_negative_expression2169);
                    functional_expression167=functional_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, functional_expression167.getTree());

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
    // $ANTLR end "negative_expression"

    public static class functional_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functional_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:324:1: functional_expression : call_expression ;
    public final OmttParser.functional_expression_return functional_expression() throws RecognitionException {
        OmttParser.functional_expression_return retval = new OmttParser.functional_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.call_expression_return call_expression168 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:325:3: ( call_expression )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:325:5: call_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_call_expression_in_functional_expression2183);
            call_expression168=call_expression();

            state._fsp--;

            adaptor.addChild(root_0, call_expression168.getTree());

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
    // $ANTLR end "functional_expression"

    public static class call_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:328:1: call_expression : atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) ) ;
    public final OmttParser.call_expression_return call_expression() throws RecognitionException {
        OmttParser.call_expression_return retval = new OmttParser.call_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.atom_expression_return atom_expression169 = null;

        OmttParser.function_argument_return function_argument170 = null;


        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_function_argument=new RewriteRuleSubtreeStream(adaptor,"rule function_argument");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:329:3: ( atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:329:5: atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            {
            pushFollow(FOLLOW_atom_expression_in_call_expression2196);
            atom_expression169=atom_expression();

            state._fsp--;

            stream_atom_expression.add(atom_expression169.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:330:5: ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=STRING_LITERAL && LA58_0<=REAL_NUMBER)||LA58_0==DATA_START||(LA58_0>=NULL && LA58_0<=FALSE)||(LA58_0>=TILDE && LA58_0<=LEFT_PAREN)||LA58_0==OP_GENERAL||LA58_0==VAR_ID) ) {
                alt58=1;
            }
            else if ( ((LA58_0>=CONTENT && LA58_0<=TAG_END)||(LA58_0>=EXPRESSION_END && LA58_0<=OP_DATA_IS_EXPRESSION)||(LA58_0>=AND && LA58_0<=IN)||LA58_0==ELSE||(LA58_0>=MAP && LA58_0<=APPLY)||(LA58_0>=COLON && LA58_0<=SEMICOLON)||LA58_0==SLASH||LA58_0==RIGHT_PAREN||(LA58_0>=RIGHT_SQUARE_PAREN && LA58_0<=OP_GE)||(LA58_0>=OP_AND && LA58_0<=OP_OR)||(LA58_0>=OP_CONTEXT && LA58_0<=OP_EXPRESSION_CONTEXT)||LA58_0==OP_CONCAT) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:330:7: ( function_argument )+
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:330:7: ( function_argument )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( ((LA57_0>=STRING_LITERAL && LA57_0<=REAL_NUMBER)||LA57_0==DATA_START||(LA57_0>=NULL && LA57_0<=FALSE)||(LA57_0>=TILDE && LA57_0<=LEFT_PAREN)||LA57_0==OP_GENERAL||LA57_0==VAR_ID) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:330:7: function_argument
                    	    {
                    	    pushFollow(FOLLOW_function_argument_in_call_expression2204);
                    	    function_argument170=function_argument();

                    	    state._fsp--;

                    	    stream_function_argument.add(function_argument170.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt57 >= 1 ) break loop57;
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);



                    // AST REWRITE
                    // elements: function_argument, atom_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 331:7: -> ^( CALL[false] atom_expression ( function_argument )+ )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:331:10: ^( CALL[false] atom_expression ( function_argument )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, false), root_1);

                        adaptor.addChild(root_1, stream_atom_expression.nextTree());
                        if ( !(stream_function_argument.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_function_argument.hasNext() ) {
                            adaptor.addChild(root_1, stream_function_argument.nextTree());

                        }
                        stream_function_argument.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:332:7: 
                    {
                    /* no arguments */


                    // AST REWRITE
                    // elements: atom_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 333:7: -> ^( atom_expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:333:10: ^( atom_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_atom_expression.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
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
    // $ANTLR end "call_expression"

    public static class call_tag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call_tag"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:336:1: call_tag : TAG_START ident= namespace_id function_arguments (content= tag_content )? TAG_END -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( function_arguments )? ) ;
    public final OmttParser.call_tag_return call_tag() throws RecognitionException {
        OmttParser.call_tag_return retval = new OmttParser.call_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START171=null;
        Token TAG_END173=null;
        OmttParser.namespace_id_return ident = null;

        OmttParser.tag_content_return content = null;

        OmttParser.function_arguments_return function_arguments172 = null;


        Object TAG_START171_tree=null;
        Object TAG_END173_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_namespace_id=new RewriteRuleSubtreeStream(adaptor,"rule namespace_id");
        RewriteRuleSubtreeStream stream_function_arguments=new RewriteRuleSubtreeStream(adaptor,"rule function_arguments");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:337:3: ( TAG_START ident= namespace_id function_arguments (content= tag_content )? TAG_END -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( function_arguments )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:337:5: TAG_START ident= namespace_id function_arguments (content= tag_content )? TAG_END
            {
            TAG_START171=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_call_tag2264);  
            stream_TAG_START.add(TAG_START171);

            pushFollow(FOLLOW_namespace_id_in_call_tag2268);
            ident=namespace_id();

            state._fsp--;

            stream_namespace_id.add(ident.getTree());
            pushFollow(FOLLOW_function_arguments_in_call_tag2270);
            function_arguments172=function_arguments();

            state._fsp--;

            stream_function_arguments.add(function_arguments172.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:338:5: (content= tag_content )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==CONTENT||LA59_0==OP_DATA_IS_EXPRESSION) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:338:6: content= tag_content
                    {
                    pushFollow(FOLLOW_tag_content_in_call_tag2279);
                    content=tag_content();

                    state._fsp--;

                    stream_tag_content.add(content.getTree());

                    }
                    break;

            }

            TAG_END173=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_call_tag2287);  
            stream_TAG_END.add(TAG_END173);



            // AST REWRITE
            // elements: content, ident, function_arguments
            // token labels: 
            // rule labels: content, retval, ident
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"rule content",content!=null?content.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident",ident!=null?ident.tree:null);

            root_0 = (Object)adaptor.nil();
            // 340:5: -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( function_arguments )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:340:8: ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( function_arguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Call(CALL, false), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:340:35: ( ^( ARGUMENT $content) )?
                if ( stream_content.hasNext() ) {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:340:35: ^( ARGUMENT $content)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

                    adaptor.addChild(root_2, stream_content.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_content.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:340:75: ( function_arguments )?
                if ( stream_function_arguments.hasNext() ) {
                    adaptor.addChild(root_1, stream_function_arguments.nextTree());

                }
                stream_function_arguments.reset();

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
    // $ANTLR end "call_tag"

    public static class function_arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_arguments"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:342:10: fragment function_arguments : ( function_argument )* ;
    public final OmttParser.function_arguments_return function_arguments() throws RecognitionException {
        OmttParser.function_arguments_return retval = new OmttParser.function_arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.function_argument_return function_argument174 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:343:3: ( ( function_argument )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:343:5: ( function_argument )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:343:5: ( function_argument )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=STRING_LITERAL && LA60_0<=REAL_NUMBER)||LA60_0==DATA_START||(LA60_0>=NULL && LA60_0<=FALSE)||(LA60_0>=TILDE && LA60_0<=LEFT_PAREN)||LA60_0==OP_GENERAL||LA60_0==VAR_ID) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:343:5: function_argument
            	    {
            	    pushFollow(FOLLOW_function_argument_in_function_arguments2332);
            	    function_argument174=function_argument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function_argument174.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


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
    // $ANTLR end "function_arguments"

    public static class function_argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_argument"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:345:10: fragment function_argument : ( VAR_ID OP_ASSIGN )? atom_expression -> ^( ARGUMENT atom_expression ( VAR_ID )? ) ;
    public final OmttParser.function_argument_return function_argument() throws RecognitionException {
        OmttParser.function_argument_return retval = new OmttParser.function_argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID175=null;
        Token OP_ASSIGN176=null;
        OmttParser.atom_expression_return atom_expression177 = null;


        Object VAR_ID175_tree=null;
        Object OP_ASSIGN176_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:346:3: ( ( VAR_ID OP_ASSIGN )? atom_expression -> ^( ARGUMENT atom_expression ( VAR_ID )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:346:5: ( VAR_ID OP_ASSIGN )? atom_expression
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:346:5: ( VAR_ID OP_ASSIGN )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==VAR_ID) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==OP_ASSIGN) ) {
                    alt61=1;
                }
            }
            switch (alt61) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:346:6: VAR_ID OP_ASSIGN
                    {
                    VAR_ID175=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_function_argument2348);  
                    stream_VAR_ID.add(VAR_ID175);

                    OP_ASSIGN176=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_function_argument2350);  
                    stream_OP_ASSIGN.add(OP_ASSIGN176);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_expression_in_function_argument2354);
            atom_expression177=atom_expression();

            state._fsp--;

            stream_atom_expression.add(atom_expression177.getTree());


            // AST REWRITE
            // elements: VAR_ID, atom_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 347:5: -> ^( ARGUMENT atom_expression ( VAR_ID )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:347:8: ^( ARGUMENT atom_expression ( VAR_ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_1);

                adaptor.addChild(root_1, stream_atom_expression.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:347:53: ( VAR_ID )?
                if ( stream_VAR_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_VAR_ID.nextNode());

                }
                stream_VAR_ID.reset();

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
    // $ANTLR end "function_argument"

    public static class atom_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:352:1: atom_expression : (a= atom_with_properties -> $a) ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )? ;
    public final OmttParser.atom_expression_return atom_expression() throws RecognitionException {
        OmttParser.atom_expression_return retval = new OmttParser.atom_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMA178=null;
        OmttParser.atom_with_properties_return a = null;

        OmttParser.atom_with_properties_return atom_with_properties179 = null;


        Object COMA178_tree=null;
        RewriteRuleTokenStream stream_COMA=new RewriteRuleTokenStream(adaptor,"token COMA");
        RewriteRuleSubtreeStream stream_atom_with_properties=new RewriteRuleSubtreeStream(adaptor,"rule atom_with_properties");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:353:2: ( (a= atom_with_properties -> $a) ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:353:4: (a= atom_with_properties -> $a) ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:353:4: (a= atom_with_properties -> $a)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:353:5: a= atom_with_properties
            {
            pushFollow(FOLLOW_atom_with_properties_in_atom_expression2389);
            a=atom_with_properties();

            state._fsp--;

            stream_atom_with_properties.add(a.getTree());


            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (Object)adaptor.nil();
            // 353:28: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:354:4: ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==COMA) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:354:5: ( COMA atom_with_properties )+
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:354:5: ( COMA atom_with_properties )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==COMA) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:354:6: COMA atom_with_properties
                    	    {
                    	    COMA178=(Token)match(input,COMA,FOLLOW_COMA_in_atom_expression2402);  
                    	    stream_COMA.add(COMA178);

                    	    pushFollow(FOLLOW_atom_with_properties_in_atom_expression2404);
                    	    atom_with_properties179=atom_with_properties();

                    	    state._fsp--;

                    	    stream_atom_with_properties.add(atom_with_properties179.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt62 >= 1 ) break loop62;
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
                    } while (true);



                    // AST REWRITE
                    // elements: atom_with_properties
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 354:34: -> ^( SEQUENCE ( atom_with_properties )+ )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:354:37: ^( SEQUENCE ( atom_with_properties )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Sequence(SEQUENCE), root_1);

                        if ( !(stream_atom_with_properties.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_atom_with_properties.hasNext() ) {
                            adaptor.addChild(root_1, stream_atom_with_properties.nextTree());

                        }
                        stream_atom_with_properties.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
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
    // $ANTLR end "atom_expression"

    public static class atom_with_properties_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom_with_properties"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:357:1: atom_with_properties : (a= atom_with_selectors -> $a) ( DOT ps= atom_with_selectors -> ^( DOT $atom_with_properties $ps) )* ;
    public final OmttParser.atom_with_properties_return atom_with_properties() throws RecognitionException {
        OmttParser.atom_with_properties_return retval = new OmttParser.atom_with_properties_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT180=null;
        OmttParser.atom_with_selectors_return a = null;

        OmttParser.atom_with_selectors_return ps = null;


        Object DOT180_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_atom_with_selectors=new RewriteRuleSubtreeStream(adaptor,"rule atom_with_selectors");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:3: ( (a= atom_with_selectors -> $a) ( DOT ps= atom_with_selectors -> ^( DOT $atom_with_properties $ps) )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:5: (a= atom_with_selectors -> $a) ( DOT ps= atom_with_selectors -> ^( DOT $atom_with_properties $ps) )*
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:5: (a= atom_with_selectors -> $a)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:6: a= atom_with_selectors
            {
            pushFollow(FOLLOW_atom_with_selectors_in_atom_with_properties2436);
            a=atom_with_selectors();

            state._fsp--;

            stream_atom_with_selectors.add(a.getTree());


            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (Object)adaptor.nil();
            // 358:28: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:359:4: ( DOT ps= atom_with_selectors -> ^( DOT $atom_with_properties $ps) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==DOT) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:359:6: DOT ps= atom_with_selectors
            	    {
            	    DOT180=(Token)match(input,DOT,FOLLOW_DOT_in_atom_with_properties2449);  
            	    stream_DOT.add(DOT180);

            	    pushFollow(FOLLOW_atom_with_selectors_in_atom_with_properties2453);
            	    ps=atom_with_selectors();

            	    state._fsp--;

            	    stream_atom_with_selectors.add(ps.getTree());


            	    // AST REWRITE
            	    // elements: DOT, atom_with_properties, ps
            	    // token labels: 
            	    // rule labels: retval, ps
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_ps=new RewriteRuleSubtreeStream(adaptor,"rule ps",ps!=null?ps.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 360:6: -> ^( DOT $atom_with_properties $ps)
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:360:9: ^( DOT $atom_with_properties $ps)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_DOT.nextToken()), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_ps.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


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
    // $ANTLR end "atom_with_properties"

    public static class atom_with_selectors_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom_with_selectors"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:363:10: fragment atom_with_selectors : atom ( sequence_selectors -> ^( ATOM_SELECT atom ( sequence_selectors )? ) | -> atom ) ;
    public final OmttParser.atom_with_selectors_return atom_with_selectors() throws RecognitionException {
        OmttParser.atom_with_selectors_return retval = new OmttParser.atom_with_selectors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.atom_return atom181 = null;

        OmttParser.sequence_selectors_return sequence_selectors182 = null;


        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_sequence_selectors=new RewriteRuleSubtreeStream(adaptor,"rule sequence_selectors");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:364:2: ( atom ( sequence_selectors -> ^( ATOM_SELECT atom ( sequence_selectors )? ) | -> atom ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:364:4: atom ( sequence_selectors -> ^( ATOM_SELECT atom ( sequence_selectors )? ) | -> atom )
            {
            pushFollow(FOLLOW_atom_in_atom_with_selectors2492);
            atom181=atom();

            state._fsp--;

            stream_atom.add(atom181.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:365:3: ( sequence_selectors -> ^( ATOM_SELECT atom ( sequence_selectors )? ) | -> atom )
            int alt65=2;
            switch ( input.LA(1) ) {
            case DOT:
                {
                int LA65_1 = input.LA(2);

                if ( ((LA65_1>=STRING_LITERAL && LA65_1<=REAL_NUMBER)||LA65_1==DATA_START||(LA65_1>=NULL && LA65_1<=FALSE)||(LA65_1>=TILDE && LA65_1<=LEFT_PAREN)||LA65_1==OP_GENERAL||LA65_1==VAR_ID) ) {
                    alt65=2;
                }
                else if ( (LA65_1==CLASS_ID) ) {
                    alt65=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;
                }
                }
                break;
            case AS:
            case LEFT_SQUARE_PAREN:
                {
                alt65=1;
                }
                break;
            case STRING_LITERAL:
            case INT_NUMBER:
            case REAL_NUMBER:
            case CONTENT:
            case TAG_START:
            case TAG_END:
            case DATA_START:
            case EXPRESSION_END:
            case OP_DATA_IS_EXPRESSION:
            case AND:
            case IN:
            case ELSE:
            case MAP:
            case APPLY:
            case NULL:
            case TRUE:
            case FALSE:
            case COLON:
            case SEMICOLON:
            case COMA:
            case SLASH:
            case TILDE:
            case LEFT_PAREN:
            case RIGHT_PAREN:
            case RIGHT_SQUARE_PAREN:
            case OP_PLUS:
            case OP_MINUS:
            case OP_MULTIPLY:
            case OP_MODULO:
            case OP_EQUAL:
            case OP_NOT_EQUAL:
            case OP_LEQ:
            case OP_LE:
            case OP_GEQ:
            case OP_GE:
            case OP_AND:
            case OP_OR:
            case OP_CONTEXT:
            case OP_EXPRESSION_CONTEXT:
            case OP_CONCAT:
            case OP_GENERAL:
            case VAR_ID:
                {
                alt65=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:365:5: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_atom_with_selectors2498);
                    sequence_selectors182=sequence_selectors();

                    state._fsp--;

                    stream_sequence_selectors.add(sequence_selectors182.getTree());


                    // AST REWRITE
                    // elements: sequence_selectors, atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 366:4: -> ^( ATOM_SELECT atom ( sequence_selectors )? )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:366:7: ^( ATOM_SELECT atom ( sequence_selectors )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new AtomSelect(ATOM_SELECT), root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:366:38: ( sequence_selectors )?
                        if ( stream_sequence_selectors.hasNext() ) {
                            adaptor.addChild(root_1, stream_sequence_selectors.nextTree());

                        }
                        stream_sequence_selectors.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:367:5: 
                    {

                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 367:5: -> atom
                    {
                        adaptor.addChild(root_0, stream_atom.nextTree());

                    }

                    retval.tree = root_0;
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
    // $ANTLR end "atom_with_selectors"

    public static class property_selector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "property_selector"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:370:10: fragment property_selector : DOT VAR_ID ( sequence_selectors )? ;
    public final OmttParser.property_selector_return property_selector() throws RecognitionException {
        OmttParser.property_selector_return retval = new OmttParser.property_selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT183=null;
        Token VAR_ID184=null;
        OmttParser.sequence_selectors_return sequence_selectors185 = null;


        Object DOT183_tree=null;
        Object VAR_ID184_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:371:3: ( DOT VAR_ID ( sequence_selectors )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:371:5: DOT VAR_ID ( sequence_selectors )?
            {
            root_0 = (Object)adaptor.nil();

            DOT183=(Token)match(input,DOT,FOLLOW_DOT_in_property_selector2540); 
            VAR_ID184=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_property_selector2543); 
            VAR_ID184_tree = (Object)adaptor.create(VAR_ID184);
            adaptor.addChild(root_0, VAR_ID184_tree);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:371:17: ( sequence_selectors )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==AS||LA66_0==DOT||LA66_0==LEFT_SQUARE_PAREN) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:371:17: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_property_selector2545);
                    sequence_selectors185=sequence_selectors();

                    state._fsp--;

                    adaptor.addChild(root_0, sequence_selectors185.getTree());

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
    // $ANTLR end "property_selector"

    public static class sequence_selectors_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sequence_selectors"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:373:10: fragment sequence_selectors : ( type_selector ( sequence_selector )? ( alias )? | sequence_selector ( alias )? | alias );
    public final OmttParser.sequence_selectors_return sequence_selectors() throws RecognitionException {
        OmttParser.sequence_selectors_return retval = new OmttParser.sequence_selectors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.type_selector_return type_selector186 = null;

        OmttParser.sequence_selector_return sequence_selector187 = null;

        OmttParser.alias_return alias188 = null;

        OmttParser.sequence_selector_return sequence_selector189 = null;

        OmttParser.alias_return alias190 = null;

        OmttParser.alias_return alias191 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:374:2: ( type_selector ( sequence_selector )? ( alias )? | sequence_selector ( alias )? | alias )
            int alt70=3;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt70=1;
                }
                break;
            case LEFT_SQUARE_PAREN:
                {
                alt70=2;
                }
                break;
            case AS:
                {
                alt70=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:374:4: type_selector ( sequence_selector )? ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_selector_in_sequence_selectors2559);
                    type_selector186=type_selector();

                    state._fsp--;

                    adaptor.addChild(root_0, type_selector186.getTree());
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:374:18: ( sequence_selector )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==LEFT_SQUARE_PAREN) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:374:18: sequence_selector
                            {
                            pushFollow(FOLLOW_sequence_selector_in_sequence_selectors2561);
                            sequence_selector187=sequence_selector();

                            state._fsp--;

                            adaptor.addChild(root_0, sequence_selector187.getTree());

                            }
                            break;

                    }

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:374:37: ( alias )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==AS) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:374:37: alias
                            {
                            pushFollow(FOLLOW_alias_in_sequence_selectors2564);
                            alias188=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias188.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:375:4: sequence_selector ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_sequence_selector_in_sequence_selectors2570);
                    sequence_selector189=sequence_selector();

                    state._fsp--;

                    adaptor.addChild(root_0, sequence_selector189.getTree());
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:375:22: ( alias )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==AS) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:375:22: alias
                            {
                            pushFollow(FOLLOW_alias_in_sequence_selectors2572);
                            alias190=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias190.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:376:4: alias
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alias_in_sequence_selectors2578);
                    alias191=alias();

                    state._fsp--;

                    adaptor.addChild(root_0, alias191.getTree());

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
    // $ANTLR end "sequence_selectors"

    public static class type_selector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_selector"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:378:10: fragment type_selector : DOT single_type -> ^( TYPE_SELECT single_type ) ;
    public final OmttParser.type_selector_return type_selector() throws RecognitionException {
        OmttParser.type_selector_return retval = new OmttParser.type_selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT192=null;
        OmttParser.single_type_return single_type193 = null;


        Object DOT192_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:379:3: ( DOT single_type -> ^( TYPE_SELECT single_type ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:379:5: DOT single_type
            {
            DOT192=(Token)match(input,DOT,FOLLOW_DOT_in_type_selector2591);  
            stream_DOT.add(DOT192);

            pushFollow(FOLLOW_single_type_in_type_selector2593);
            single_type193=single_type();

            state._fsp--;

            stream_single_type.add(single_type193.getTree());


            // AST REWRITE
            // elements: single_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 380:4: -> ^( TYPE_SELECT single_type )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:380:7: ^( TYPE_SELECT single_type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_SELECT, "TYPE_SELECT"), root_1);

                adaptor.addChild(root_1, stream_single_type.nextTree());

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
    // $ANTLR end "type_selector"

    public static class sequence_selector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sequence_selector"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:382:10: fragment sequence_selector : LEFT_SQUARE_PAREN boolean_expression RIGHT_SQUARE_PAREN -> ^( SEQUENCE_SELECT boolean_expression ) ;
    public final OmttParser.sequence_selector_return sequence_selector() throws RecognitionException {
        OmttParser.sequence_selector_return retval = new OmttParser.sequence_selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE_PAREN194=null;
        Token RIGHT_SQUARE_PAREN196=null;
        OmttParser.boolean_expression_return boolean_expression195 = null;


        Object LEFT_SQUARE_PAREN194_tree=null;
        Object RIGHT_SQUARE_PAREN196_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_boolean_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:383:3: ( LEFT_SQUARE_PAREN boolean_expression RIGHT_SQUARE_PAREN -> ^( SEQUENCE_SELECT boolean_expression ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:383:5: LEFT_SQUARE_PAREN boolean_expression RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN194=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector2618);  
            stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN194);

            pushFollow(FOLLOW_boolean_expression_in_sequence_selector2620);
            boolean_expression195=boolean_expression();

            state._fsp--;

            stream_boolean_expression.add(boolean_expression195.getTree());
            RIGHT_SQUARE_PAREN196=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector2622);  
            stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN196);



            // AST REWRITE
            // elements: boolean_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 384:4: -> ^( SEQUENCE_SELECT boolean_expression )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:384:7: ^( SEQUENCE_SELECT boolean_expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEQUENCE_SELECT, "SEQUENCE_SELECT"), root_1);

                adaptor.addChild(root_1, stream_boolean_expression.nextTree());

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
    // $ANTLR end "sequence_selector"

    public static class alias_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "alias"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:386:10: fragment alias : AS VAR_ID -> ^( AS VAR_ID ) ;
    public final OmttParser.alias_return alias() throws RecognitionException {
        OmttParser.alias_return retval = new OmttParser.alias_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AS197=null;
        Token VAR_ID198=null;

        Object AS197_tree=null;
        Object VAR_ID198_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:387:2: ( AS VAR_ID -> ^( AS VAR_ID ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:387:4: AS VAR_ID
            {
            AS197=(Token)match(input,AS,FOLLOW_AS_in_alias2646);  
            stream_AS.add(AS197);

            VAR_ID198=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_alias2648);  
            stream_VAR_ID.add(VAR_ID198);



            // AST REWRITE
            // elements: VAR_ID, AS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 388:3: -> ^( AS VAR_ID )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:388:6: ^( AS VAR_ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_AS.nextNode(), root_1);

                adaptor.addChild(root_1, stream_VAR_ID.nextNode());

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
    // $ANTLR end "alias"

    public static class data_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "data_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:391:1: data_expression : DATA_START ( data_body_atom )* DATA_END -> ^( DATA_START ( data_body_atom )* ) ;
    public final OmttParser.data_expression_return data_expression() throws RecognitionException {
        OmttParser.data_expression_return retval = new OmttParser.data_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DATA_START199=null;
        Token DATA_END201=null;
        OmttParser.data_body_atom_return data_body_atom200 = null;


        Object DATA_START199_tree=null;
        Object DATA_END201_tree=null;
        RewriteRuleTokenStream stream_DATA_END=new RewriteRuleTokenStream(adaptor,"token DATA_END");
        RewriteRuleTokenStream stream_DATA_START=new RewriteRuleTokenStream(adaptor,"token DATA_START");
        RewriteRuleSubtreeStream stream_data_body_atom=new RewriteRuleSubtreeStream(adaptor,"rule data_body_atom");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:392:3: ( DATA_START ( data_body_atom )* DATA_END -> ^( DATA_START ( data_body_atom )* ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:392:5: DATA_START ( data_body_atom )* DATA_END
            {
            DATA_START199=(Token)match(input,DATA_START,FOLLOW_DATA_START_in_data_expression2670);  
            stream_DATA_START.add(DATA_START199);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:392:16: ( data_body_atom )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==STRING_LITERAL||LA71_0==TAG_START||LA71_0==EXPRESSION_START) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:392:16: data_body_atom
            	    {
            	    pushFollow(FOLLOW_data_body_atom_in_data_expression2672);
            	    data_body_atom200=data_body_atom();

            	    state._fsp--;

            	    stream_data_body_atom.add(data_body_atom200.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            DATA_END201=(Token)match(input,DATA_END,FOLLOW_DATA_END_in_data_expression2675);  
            stream_DATA_END.add(DATA_END201);



            // AST REWRITE
            // elements: data_body_atom, DATA_START
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 393:5: -> ^( DATA_START ( data_body_atom )* )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:393:8: ^( DATA_START ( data_body_atom )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Data(stream_DATA_START.nextToken()), root_1);

                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:393:27: ( data_body_atom )*
                while ( stream_data_body_atom.hasNext() ) {
                    adaptor.addChild(root_1, stream_data_body_atom.nextTree());

                }
                stream_data_body_atom.reset();

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
    // $ANTLR end "data_expression"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:396:1: atom : selectable_atom ( DOUBLE_DOT selectable_atom )? ;
    public final OmttParser.atom_return atom() throws RecognitionException {
        OmttParser.atom_return retval = new OmttParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_DOT203=null;
        OmttParser.selectable_atom_return selectable_atom202 = null;

        OmttParser.selectable_atom_return selectable_atom204 = null;


        Object DOUBLE_DOT203_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:397:2: ( selectable_atom ( DOUBLE_DOT selectable_atom )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:397:4: selectable_atom ( DOUBLE_DOT selectable_atom )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_selectable_atom_in_atom2703);
            selectable_atom202=selectable_atom();

            state._fsp--;

            adaptor.addChild(root_0, selectable_atom202.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:398:3: ( DOUBLE_DOT selectable_atom )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==DOUBLE_DOT) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:398:4: DOUBLE_DOT selectable_atom
                    {
                    DOUBLE_DOT203=(Token)match(input,DOUBLE_DOT,FOLLOW_DOUBLE_DOT_in_atom2708); 
                    DOUBLE_DOT203_tree = new Range(DOUBLE_DOT203) ;
                    root_0 = (Object)adaptor.becomeRoot(DOUBLE_DOT203_tree, root_0);

                    pushFollow(FOLLOW_selectable_atom_in_atom2714);
                    selectable_atom204=selectable_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, selectable_atom204.getTree());

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
    // $ANTLR end "atom"

    public static class selectable_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selectable_atom"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:401:1: selectable_atom : ( object_atom | data_expression | namespace_id | LEFT_PAREN expression RIGHT_PAREN );
    public final OmttParser.selectable_atom_return selectable_atom() throws RecognitionException {
        OmttParser.selectable_atom_return retval = new OmttParser.selectable_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN208=null;
        Token RIGHT_PAREN210=null;
        OmttParser.object_atom_return object_atom205 = null;

        OmttParser.data_expression_return data_expression206 = null;

        OmttParser.namespace_id_return namespace_id207 = null;

        OmttParser.expression_return expression209 = null;


        Object LEFT_PAREN208_tree=null;
        Object RIGHT_PAREN210_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:3: ( object_atom | data_expression | namespace_id | LEFT_PAREN expression RIGHT_PAREN )
            int alt73=4;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
            case INT_NUMBER:
            case REAL_NUMBER:
            case NULL:
            case TRUE:
            case FALSE:
            case TILDE:
                {
                alt73=1;
                }
                break;
            case DATA_START:
                {
                alt73=2;
                }
                break;
            case OP_GENERAL:
            case VAR_ID:
                {
                alt73=3;
                }
                break;
            case LEFT_PAREN:
                {
                alt73=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:5: object_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_object_atom_in_selectable_atom2728);
                    object_atom205=object_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, object_atom205.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:403:5: data_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_data_expression_in_selectable_atom2734);
                    data_expression206=data_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, data_expression206.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:404:5: namespace_id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespace_id_in_selectable_atom2740);
                    namespace_id207=namespace_id();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace_id207.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:405:5: LEFT_PAREN expression RIGHT_PAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LEFT_PAREN208=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_selectable_atom2746); 
                    pushFollow(FOLLOW_expression_in_selectable_atom2749);
                    expression209=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression209.getTree());
                    RIGHT_PAREN210=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_selectable_atom2751); 

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
    // $ANTLR end "selectable_atom"

    public static class namespace_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespace_id"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:407:10: fragment namespace_id : ( (ns= VAR_ID OP_VIEW )? id= VAR_ID -> ^( IDENT[$id] ( $ns)? ) | id= OP_GENERAL -> ^( IDENT[$id] ) );
    public final OmttParser.namespace_id_return namespace_id() throws RecognitionException {
        OmttParser.namespace_id_return retval = new OmttParser.namespace_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ns=null;
        Token id=null;
        Token OP_VIEW211=null;

        Object ns_tree=null;
        Object id_tree=null;
        Object OP_VIEW211_tree=null;
        RewriteRuleTokenStream stream_OP_GENERAL=new RewriteRuleTokenStream(adaptor,"token OP_GENERAL");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_VIEW=new RewriteRuleTokenStream(adaptor,"token OP_VIEW");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:408:3: ( (ns= VAR_ID OP_VIEW )? id= VAR_ID -> ^( IDENT[$id] ( $ns)? ) | id= OP_GENERAL -> ^( IDENT[$id] ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==VAR_ID) ) {
                alt75=1;
            }
            else if ( (LA75_0==OP_GENERAL) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:408:5: (ns= VAR_ID OP_VIEW )? id= VAR_ID
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:408:5: (ns= VAR_ID OP_VIEW )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==VAR_ID) ) {
                        int LA74_1 = input.LA(2);

                        if ( (LA74_1==OP_VIEW) ) {
                            alt74=1;
                        }
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:408:6: ns= VAR_ID OP_VIEW
                            {
                            ns=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id2769);  
                            stream_VAR_ID.add(ns);

                            OP_VIEW211=(Token)match(input,OP_VIEW,FOLLOW_OP_VIEW_in_namespace_id2771);  
                            stream_OP_VIEW.add(OP_VIEW211);


                            }
                            break;

                    }

                    id=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id2777);  
                    stream_VAR_ID.add(id);



                    // AST REWRITE
                    // elements: ns
                    // token labels: ns
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_ns=new RewriteRuleTokenStream(adaptor,"token ns",ns);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 409:5: -> ^( IDENT[$id] ( $ns)? )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:409:8: ^( IDENT[$id] ( $ns)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Ident(IDENT, id), root_1);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:409:28: ( $ns)?
                        if ( stream_ns.hasNext() ) {
                            adaptor.addChild(root_1, stream_ns.nextNode());

                        }
                        stream_ns.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:410:5: id= OP_GENERAL
                    {
                    id=(Token)match(input,OP_GENERAL,FOLLOW_OP_GENERAL_in_namespace_id2803);  
                    stream_OP_GENERAL.add(id);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 411:4: -> ^( IDENT[$id] )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:411:7: ^( IDENT[$id] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Ident(IDENT, id), root_1);

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
    // $ANTLR end "namespace_id"

    public static class object_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "object_atom"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:415:1: object_atom : ( number_atom | STRING_LITERAL | ( NULL | TILDE ) | ( TRUE | FALSE ) );
    public final OmttParser.object_atom_return object_atom() throws RecognitionException {
        OmttParser.object_atom_return retval = new OmttParser.object_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING_LITERAL213=null;
        Token NULL214=null;
        Token TILDE215=null;
        Token TRUE216=null;
        Token FALSE217=null;
        OmttParser.number_atom_return number_atom212 = null;


        Object STRING_LITERAL213_tree=null;
        Object NULL214_tree=null;
        Object TILDE215_tree=null;
        Object TRUE216_tree=null;
        Object FALSE217_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:416:3: ( number_atom | STRING_LITERAL | ( NULL | TILDE ) | ( TRUE | FALSE ) )
            int alt78=4;
            switch ( input.LA(1) ) {
            case INT_NUMBER:
            case REAL_NUMBER:
                {
                alt78=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt78=2;
                }
                break;
            case NULL:
            case TILDE:
                {
                alt78=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt78=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:416:5: number_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_atom_in_object_atom2830);
                    number_atom212=number_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, number_atom212.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:417:5: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL213=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_object_atom2836); 
                    STRING_LITERAL213_tree = new Literal(STRING_LITERAL213) ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_LITERAL213_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:418:5: ( NULL | TILDE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:418:5: ( NULL | TILDE )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NULL) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==TILDE) ) {
                        alt76=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:418:6: NULL
                            {
                            NULL214=(Token)match(input,NULL,FOLLOW_NULL_in_object_atom2847); 
                            NULL214_tree = new Literal(NULL214) ;
                            root_0 = (Object)adaptor.becomeRoot(NULL214_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:418:23: TILDE
                            {
                            TILDE215=(Token)match(input,TILDE,FOLLOW_TILDE_in_object_atom2855); 
                            TILDE215_tree = new Literal(TILDE215) ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE215_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:419:5: ( TRUE | FALSE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:419:5: ( TRUE | FALSE )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==TRUE) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==FALSE) ) {
                        alt77=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }
                    switch (alt77) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:419:6: TRUE
                            {
                            TRUE216=(Token)match(input,TRUE,FOLLOW_TRUE_in_object_atom2868); 
                            TRUE216_tree = new Literal(TRUE216) ;
                            root_0 = (Object)adaptor.becomeRoot(TRUE216_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:419:23: FALSE
                            {
                            FALSE217=(Token)match(input,FALSE,FOLLOW_FALSE_in_object_atom2876); 
                            FALSE217_tree = new Literal(FALSE217) ;
                            root_0 = (Object)adaptor.becomeRoot(FALSE217_tree, root_0);


                            }
                            break;

                    }


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
    // $ANTLR end "object_atom"

    public static class number_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number_atom"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:422:1: number_atom : ( INT_NUMBER | REAL_NUMBER );
    public final OmttParser.number_atom_return number_atom() throws RecognitionException {
        OmttParser.number_atom_return retval = new OmttParser.number_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_NUMBER218=null;
        Token REAL_NUMBER219=null;

        Object INT_NUMBER218_tree=null;
        Object REAL_NUMBER219_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:423:3: ( INT_NUMBER | REAL_NUMBER )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==INT_NUMBER) ) {
                alt79=1;
            }
            else if ( (LA79_0==REAL_NUMBER) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:423:5: INT_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    INT_NUMBER218=(Token)match(input,INT_NUMBER,FOLLOW_INT_NUMBER_in_number_atom2894); 
                    INT_NUMBER218_tree = new Literal(INT_NUMBER218) ;
                    root_0 = (Object)adaptor.becomeRoot(INT_NUMBER218_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:424:5: REAL_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    REAL_NUMBER219=(Token)match(input,REAL_NUMBER,FOLLOW_REAL_NUMBER_in_number_atom2904); 
                    REAL_NUMBER219_tree = new Literal(REAL_NUMBER219) ;
                    root_0 = (Object)adaptor.becomeRoot(REAL_NUMBER219_tree, root_0);


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
    // $ANTLR end "number_atom"

    // Delegated rules


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\27\uffff";
    static final String DFA22_eofS =
        "\27\uffff";
    static final String DFA22_minS =
        "\1\31\1\uffff\2\31\3\uffff\20\31";
    static final String DFA22_maxS =
        "\1\150\1\uffff\2\146\3\uffff\1\146\1\150\2\146\1\150\6\146\1\150"+
        "\1\146\1\150\2\146";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\4\20\uffff";
    static final String DFA22_specialS =
        "\27\uffff}>";
    static final String[] DFA22_transitionS = {
            "\3\6\3\uffff\1\6\17\uffff\1\4\2\uffff\1\6\7\uffff\1\6\1\5\1"+
            "\1\3\6\2\uffff\1\1\10\uffff\1\2\1\6\4\uffff\1\6\13\uffff\1\6"+
            "\4\uffff\1\6\3\uffff\1\3\1\uffff\1\1",
            "",
            "\7\6\2\uffff\1\6\15\uffff\2\6\6\uffff\1\6\1\uffff\2\6\1\uffff"+
            "\3\6\5\uffff\1\6\1\uffff\10\6\1\uffff\12\6\1\uffff\2\6\1\uffff"+
            "\2\6\1\uffff\2\6\3\uffff\1\7",
            "\7\6\2\uffff\1\6\15\uffff\2\6\6\uffff\1\6\1\uffff\2\6\1\uffff"+
            "\3\6\2\uffff\1\1\2\uffff\1\6\1\uffff\1\10\3\6\1\11\3\6\1\uffff"+
            "\2\6\1\12\7\6\1\uffff\2\6\1\uffff\5\6\3\uffff\1\7",
            "",
            "",
            "",
            "\7\6\2\uffff\1\6\15\uffff\2\6\6\uffff\1\6\1\uffff\2\6\1\uffff"+
            "\3\6\2\uffff\1\1\2\uffff\1\6\1\uffff\1\13\3\6\1\11\3\6\1\uffff"+
            "\2\6\1\12\12\6\1\uffff\5\6\3\uffff\1\7",
            "\3\6\3\uffff\1\6\35\uffff\3\6\13\uffff\2\6\25\uffff\1\6\3\uffff"+
            "\1\6\1\uffff\1\14",
            "\7\6\2\uffff\1\6\15\uffff\2\6\6\uffff\1\6\1\uffff\2\6\1\uffff"+
            "\3\6\5\uffff\1\6\1\uffff\10\6\1\uffff\12\6\1\uffff\2\6\1\uffff"+
            "\2\6\1\uffff\2\6\3\uffff\1\7",
            "\3\6\3\uffff\1\6\35\uffff\3\6\2\uffff\1\1\4\uffff\1\1\3\uffff"+
            "\1\15\1\6\4\uffff\1\6\20\uffff\1\6\3\uffff\1\16",
            "\3\6\3\uffff\1\6\35\uffff\3\6\13\uffff\2\6\25\uffff\1\6\3\uffff"+
            "\1\6\1\uffff\1\17",
            "\7\6\2\uffff\1\6\15\uffff\2\6\6\uffff\1\6\1\uffff\2\6\1\uffff"+
            "\3\6\2\uffff\1\1\2\uffff\1\6\1\uffff\1\6\1\uffff\2\6\1\11\3"+
            "\6\1\uffff\2\6\1\20\7\6\1\uffff\2\6\1\uffff\2\6\1\uffff\2\6"+
            "\3\uffff\1\7",
            "\7\6\2\uffff\1\6\15\uffff\2\6\6\uffff\1\6\1\uffff\2\6\1\uffff"+
            "\3\6\5\uffff\1\6\1\uffff\10\6\1\uffff\12\6\1\uffff\2\6\1\uffff"+
            "\2\6\1\uffff\2\6\3\uffff\1\21",
            "\7\6\2\uffff\1\6\15\uffff\2\6\6\uffff\1\6\1\uffff\2\6\1\uffff"+
            "\3\6\2\uffff\1\1\2\uffff\1\6\1\uffff\1\22\3\6\1\23\3\6\1\uffff"+
            "\2\6\1\12\7\6\1\uffff\2\6\1\uffff\5\6\3\uffff\1\21",
            "\7\6\2\uffff\1\6\15\uffff\2\6\6\uffff\1\6\1\uffff\2\6\1\uffff"+
            "\3\6\2\uffff\1\1\2\uffff\1\6\1\uffff\1\6\1\uffff\2\6\1\11\3"+
            "\6\1\uffff\2\6\1\20\7\6\1\uffff\2\6\1\uffff\2\6\1\uffff\2\6"+
            "\3\uffff\1\7",
            "\3\6\3\uffff\1\6\35\uffff\3\6\2\uffff\1\1\10\uffff\1\15\1\6"+
            "\4\uffff\1\6\20\uffff\1\6\3\uffff\1\16",
            "\7\6\2\uffff\1\6\15\uffff\2\6\6\uffff\1\6\1\uffff\2\6\1\uffff"+
            "\3\6\2\uffff\1\1\2\uffff\1\6\1\uffff\1\24\3\6\1\23\3\6\1\uffff"+
            "\2\6\1\12\12\6\1\uffff\5\6\3\uffff\1\21",
            "\3\6\3\uffff\1\6\35\uffff\3\6\13\uffff\2\6\25\uffff\1\6\3\uffff"+
            "\1\6\1\uffff\1\25",
            "\7\6\2\uffff\1\6\15\uffff\2\6\6\uffff\1\6\1\uffff\2\6\1\uffff"+
            "\3\6\5\uffff\1\6\1\uffff\10\6\1\uffff\12\6\1\uffff\2\6\1\uffff"+
            "\2\6\1\uffff\2\6\3\uffff\1\21",
            "\3\6\3\uffff\1\6\35\uffff\3\6\13\uffff\2\6\25\uffff\1\6\3\uffff"+
            "\1\6\1\uffff\1\26",
            "\7\6\2\uffff\1\6\15\uffff\2\6\6\uffff\1\6\1\uffff\2\6\1\uffff"+
            "\3\6\2\uffff\1\1\2\uffff\1\6\1\uffff\1\6\1\uffff\2\6\1\23\3"+
            "\6\1\uffff\2\6\1\20\7\6\1\uffff\2\6\1\uffff\2\6\1\uffff\2\6"+
            "\3\uffff\1\21",
            "\7\6\2\uffff\1\6\15\uffff\2\6\6\uffff\1\6\1\uffff\2\6\1\uffff"+
            "\3\6\2\uffff\1\1\2\uffff\1\6\1\uffff\1\6\1\uffff\2\6\1\23\3"+
            "\6\1\uffff\2\6\1\20\7\6\1\uffff\2\6\1\uffff\2\6\1\uffff\2\6"+
            "\3\uffff\1\21"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "120:1: expression : ( lambda_expression | def_in_expression | apply_expression | concatence_expression );";
        }
    }
 

    public static final BitSet FOLLOW_header_in_program53 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_definitions_in_program55 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_declaration_in_header93 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_use_declarations_in_header100 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_import_declarations_in_header106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_module_declaration119 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_MODULE_in_module_declaration121 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_module_id_in_module_declaration123 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_module_declaration125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_use_declarations155 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_use_declaration_in_use_declarations158 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_use_declarations161 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TAG_START_in_import_declarations193 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_import_declaration_in_import_declarations196 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_import_declarations199 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_declaration230 = new BitSet(new long[]{0x0000000000000000L,0x0000014400000000L});
    public static final BitSet FOLLOW_external_class_name_in_import_declaration234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_use_declaration263 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_module_id_in_use_declaration265 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_AS_in_use_declaration268 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_use_declaration270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_external_class_name311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_DOT_in_external_class_name313 = new BitSet(new long[]{0x0000000000000000L,0x0000014400000000L});
    public static final BitSet FOLLOW_set_in_external_class_name318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_module_id339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_DOT_in_module_id341 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_module_id346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_definition_in_definitions362 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TAG_START_in_tag_definition385 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DEF_in_tag_definition387 = new BitSet(new long[]{0x0080000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_definition_signature_in_tag_definition389 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_tag_definition395 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_tag_definition399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_signature431 = new BitSet(new long[]{0x0000000000000002L,0x000000400000080CL});
    public static final BitSet FOLLOW_DEFAULT_in_definition_signature433 = new BitSet(new long[]{0x0000000000000002L,0x000000400000080CL});
    public static final BitSet FOLLOW_definition_context_in_definition_signature436 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000804L});
    public static final BitSet FOLLOW_definition_argument_in_definition_signature439 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000804L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_definition_signature443 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_type_in_definition_signature447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_REVERSE_FOLLOW_in_definition_context498 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_single_type_in_definition_context500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_definition_argument524 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_argument529 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040080L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_definition_argument531 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_DOT_in_definition_argument535 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_type_in_definition_argument537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content583 = new BitSet(new long[]{0x0000000222000002L});
    public static final BitSet FOLLOW_data_body_atom_in_tag_content589 = new BitSet(new long[]{0x0000000222000002L});
    public static final BitSet FOLLOW_OP_DATA_IS_EXPRESSION_in_tag_content612 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content614 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_expression_in_tag_content620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_data_body_atom641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_inside_data_in_data_body_atom651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_inside_data_in_data_body_atom657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_START_in_expression_inside_data672 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_expression_in_expression_inside_data675 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_EXPRESSION_END_in_expression_inside_data677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_tag_in_tag_inside_data693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_tag_in_tag_inside_data699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_tag_in_tag_inside_data705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_tag_in_tag_inside_data711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expression_in_expression727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_expression_in_expression733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_apply_expression_in_expression739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concatence_expression_in_expression745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_def_in_expression760 = new BitSet(new long[]{0x0080000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression764 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_AND_in_def_in_expression771 = new BitSet(new long[]{0x0080000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression775 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_expression783 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021824L});
    public static final BitSet FOLLOW_COLON_in_def_in_expression785 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_expression_in_def_in_expression790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_expression822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_in_definition_inside_expression824 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_expression853 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_expression855 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag893 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DEF_in_def_in_tag895 = new BitSet(new long[]{0x0080000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag899 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag906 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_AND_in_def_in_tag908 = new BitSet(new long[]{0x0080000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag912 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag920 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_tag922 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_def_in_tag926 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_def_in_tag932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_tag964 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_definition_inside_tag968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_tag992 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_tag994 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_expression_in_definition_inside_tag996 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_CONTENT_in_definition_inside_tag999 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_definition_inside_tag1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAMBDA_in_lambda_expression1040 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000820L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression1042 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000820L});
    public static final BitSet FOLLOW_COLON_in_lambda_expression1045 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_expression_in_lambda_expression1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression1075 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000804L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_lambda_expression1078 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_expression_in_lambda_expression1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_match_expression_in_lambda_expression1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_lambda_match_in_lambda_match_expression1120 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICOLON_in_lambda_match_expression1123 = new BitSet(new long[]{0x1000000000000000L,0x0000014000000804L});
    public static final BitSet FOLLOW_single_lambda_match_in_lambda_match_expression1125 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_type_in_single_lambda_match1139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_single_lambda_match1141 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_concatence_expression_in_single_lambda_match1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_ID_in_type1157 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_type1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_ID_in_single_type1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expression_in_concatence_expression1218 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_OP_CONCAT_in_concatence_expression1232 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_control_expression_in_concatence_expression1236 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_if_expression_in_control_expression1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_expression_in_control_expression1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_context_expression_in_control_expression1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_expression1291 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_context_expression_in_if_expression1295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_in_if_expression1297 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_control_expression_in_if_expression1305 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_expression1311 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021824L});
    public static final BitSet FOLLOW_COLON_in_if_expression1313 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_control_expression_in_if_expression1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_if_tag1356 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_if_subtag_in_if_tag1362 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_if_tag1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_subtag1384 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_context_expression_in_if_subtag1388 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_if_subtag1396 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TAG_START_in_if_subtag1406 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_subtag1408 = new BitSet(new long[]{0x0004000810000000L});
    public static final BitSet FOLLOW_tag_content_in_if_subtag1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_subtag_in_if_subtag1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_map_expression1465 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_item_alias_in_map_expression1467 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_context_expression_in_map_expression1472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_in_map_expression1474 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_control_expression_in_map_expression1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_map_tag1516 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_MAP_in_map_tag1518 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_item_alias_in_map_tag1520 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_context_expression_in_map_tag1525 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_map_tag1533 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_map_tag1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_apply_expression1574 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_item_alias_in_apply_expression1576 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_expression_in_apply_expression1579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_in_apply_expression1581 = new BitSet(new long[]{0x1000000000000000L,0x0000014000000804L});
    public static final BitSet FOLLOW_lambda_expression_in_apply_expression1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_item_alias1632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_OP_REVERSE_FOLLOW_in_item_alias1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_context_expression1660 = new BitSet(new long[]{0x0C00000000000002L,0x00000000C0000000L});
    public static final BitSet FOLLOW_op_apply_in_context_expression1674 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_atom_expression_in_context_expression1676 = new BitSet(new long[]{0xFC0480008E000000L,0x00000144E0021804L});
    public static final BitSet FOLLOW_function_arguments_in_context_expression1680 = new BitSet(new long[]{0x0C00000000000002L,0x00000000C0000000L});
    public static final BitSet FOLLOW_op_map_in_context_expression1720 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_boolean_expression_in_context_expression1724 = new BitSet(new long[]{0x0C00000000000002L,0x00000000C0000000L});
    public static final BitSet FOLLOW_OP_CONTEXT_in_op_apply1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_op_apply1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_EXPRESSION_CONTEXT_in_op_map1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_op_map1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_binary_expression_in_boolean_expression1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression1819 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_boolean_binary_operator_in_boolean_binary_expression1822 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression1825 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_boolean_unary_operator_in_boolean_unary_expression1841 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_AND_in_boolean_binary_operator1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_OR_in_boolean_binary_operator1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_in_boolean_unary_operator1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression1910 = new BitSet(new long[]{0x0000000000000002L,0x0000000003F00000L});
    public static final BitSet FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression1913 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression1916 = new BitSet(new long[]{0x0000000000000002L,0x0000000003F00000L});
    public static final BitSet FOLLOW_OP_EQUAL_in_boolean_comparsion_operator1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LE_in_boolean_comparsion_operator1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LEQ_in_boolean_comparsion_operator1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GE_in_boolean_comparsion_operator1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GEQ_in_boolean_comparsion_operator1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2002 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_OP_PLUS_in_additive_expression2018 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_OP_MINUS_in_additive_expression2032 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2052 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression2072 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0400L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_multiplicative_expression2082 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_SLASH_in_multiplicative_expression2096 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_OP_MODULO_in_multiplicative_expression2110 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression2130 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0400L});
    public static final BitSet FOLLOW_OP_MINUS_in_negative_expression2149 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_functional_expression_in_negative_expression2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functional_expression_in_negative_expression2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_expression_in_functional_expression2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expression_in_call_expression2196 = new BitSet(new long[]{0xFC0480008E000002L,0x0000014420021804L});
    public static final BitSet FOLLOW_function_argument_in_call_expression2204 = new BitSet(new long[]{0xFC0480008E000002L,0x0000014420021804L});
    public static final BitSet FOLLOW_TAG_START_in_call_tag2264 = new BitSet(new long[]{0x0000000000000000L,0x0000004400000000L});
    public static final BitSet FOLLOW_namespace_id_in_call_tag2268 = new BitSet(new long[]{0xFC048008DE000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_function_arguments_in_call_tag2270 = new BitSet(new long[]{0x0000000850000000L});
    public static final BitSet FOLLOW_tag_content_in_call_tag2279 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_call_tag2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_argument_in_function_arguments2332 = new BitSet(new long[]{0xFC0480008E000002L,0x0000014420021804L});
    public static final BitSet FOLLOW_VAR_ID_in_function_argument2348 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_function_argument2350 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_atom_expression_in_function_argument2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_with_properties_in_atom_expression2389 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMA_in_atom_expression2402 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_atom_with_properties_in_atom_expression2404 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_atom_with_selectors_in_atom_with_properties2436 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_DOT_in_atom_with_properties2449 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_atom_with_selectors_in_atom_with_properties2453 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_atom_in_atom_with_selectors2492 = new BitSet(new long[]{0x0100000000000002L,0x0000000000004080L});
    public static final BitSet FOLLOW_sequence_selectors_in_atom_with_selectors2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_property_selector2540 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_property_selector2543 = new BitSet(new long[]{0x0100000000000002L,0x0000000000004080L});
    public static final BitSet FOLLOW_sequence_selectors_in_property_selector2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_selector_in_sequence_selectors2559 = new BitSet(new long[]{0x0100000000000002L,0x0000000000004080L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors2561 = new BitSet(new long[]{0x0100000000000002L,0x0000000000004080L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors2570 = new BitSet(new long[]{0x0100000000000002L,0x0000000000004080L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_type_selector2591 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_single_type_in_type_selector2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector2618 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_boolean_expression_in_sequence_selector2620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_alias2646 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_alias2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_START_in_data_expression2670 = new BitSet(new long[]{0x0000000322000000L});
    public static final BitSet FOLLOW_data_body_atom_in_data_expression2672 = new BitSet(new long[]{0x0000000322000000L});
    public static final BitSet FOLLOW_DATA_END_in_data_expression2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectable_atom_in_atom2703 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_DOUBLE_DOT_in_atom2708 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_selectable_atom_in_atom2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_atom_in_selectable_atom2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_expression_in_selectable_atom2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_id_in_selectable_atom2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_selectable_atom2746 = new BitSet(new long[]{0xFC0480008E000000L,0x0000014420021804L});
    public static final BitSet FOLLOW_expression_in_selectable_atom2749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_selectable_atom2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id2769 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_OP_VIEW_in_namespace_id2771 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GENERAL_in_namespace_id2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_atom_in_object_atom2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_object_atom2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_object_atom2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_object_atom2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_object_atom2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_object_atom2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_NUMBER_in_number_atom2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_NUMBER_in_number_atom2904 = new BitSet(new long[]{0x0000000000000002L});

}