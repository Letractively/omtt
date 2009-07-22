// $ANTLR 3.1.2 /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g 2009-07-18 03:38:42

package pl.omtt.lang.grammar;

import pl.omtt.lang.model.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class OmttParser extends AbstractOmttParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "HEADER", "USE", "USES", "IMPORT", "IMPORTS", "CLASS", "IDENT", "ATOM_SELECT", "PROPERTY_SELECT", "TYPE_SELECT", "SEQUENCE_SELECT", "ITERATE", "ARGUMENTS", "ARGUMENT", "RETURNS", "BLOCK", "IF_ELSE", "CALL", "CAST", "SEQUENCE", "STRING_LITERAL", "INT_NUMBER", "REAL_NUMBER", "CONTENT", "TAG_START", "TAG_END", "DATA_START", "DATA_END", "EXPRESSION_START", "EXPRESSION_END", "OP_DATA_IS_EXPRESSION", "IT", "ITEM", "COMMENT_SINGLE_LINE", "COMMENT_MULTI_LINE", "WS", "NEWLINE", "ACTION_ON_NEWLINE", "STRING_PARENS", "MODE_LEFT_PAREN", "MODE_RIGHT_PAREN", "MODULE", "DEF", "AND", "IN", "IF", "THEN", "ELSE", "MATCH", "CASE", "DEFAULT", "AS", "IS", "MAP", "TO", "NULL", "LAMBDA", "TRUE", "FALSE", "INNER_TAG_KEYWORD", "SINGLE_TAG_KEYWORD", "OP_FUNCTION_DEFINITION", "COLON", "SEMICOLON", "DOT", "DOUBLE_DOT", "COMA", "SLASH", "TILDE", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_SQUARE_PAREN", "RIGHT_SQUARE_PAREN", "OP_PLUS", "OP_MINUS", "OP_MULTIPLY", "OP_MODULO", "OP_EQUAL", "OP_NOT_EQUAL", "OP_LEQ", "OP_LE", "OP_GEQ", "OP_GE", "OP_ASSIGN", "OP_AND", "OP_OR", "OP_NOT", "OP_CONTEXT", "OP_EXPRESSION_CONTEXT", "OP_VIEW", "OP_CONCAT", "OP_GENERAL", "OP_DATA", "SMALL_LETTER", "NAMECHAR", "VAR_ID", "BIG_LETTER", "CLASS_ID", "DIGIT", "INT_OR_REAL_NUMBER", "LETTER", "NOT_NAME"
    };
    public static final int CAST=23;
    public static final int OP_LE=85;
    public static final int INT_NUMBER=26;
    public static final int OP_AND=89;
    public static final int INT_OR_REAL_NUMBER=104;
    public static final int LETTER=105;
    public static final int OP_GEQ=86;
    public static final int CASE=54;
    public static final int OP_GE=87;
    public static final int EOF=-1;
    public static final int DOUBLE_DOT=70;
    public static final int IMPORT=8;
    public static final int STRING_LITERAL=25;
    public static final int MODE_LEFT_PAREN=44;
    public static final int OP_MINUS=79;
    public static final int OP_NOT_EQUAL=83;
    public static final int SEQUENCE_SELECT=15;
    public static final int OP_EXPRESSION_CONTEXT=93;
    public static final int VAR_ID=100;
    public static final int ARGUMENTS=17;
    public static final int NULL=60;
    public static final int ELSE=52;
    public static final int MATCH=53;
    public static final int SEMICOLON=68;
    public static final int SINGLE_TAG_KEYWORD=65;
    public static final int MODE_RIGHT_PAREN=45;
    public static final int CONTENT=28;
    public static final int OP_FUNCTION_DEFINITION=66;
    public static final int DATA_START=31;
    public static final int EXPRESSION_START=33;
    public static final int NAMECHAR=99;
    public static final int SEQUENCE=24;
    public static final int INNER_TAG_KEYWORD=64;
    public static final int WS=40;
    public static final int OP_DATA=97;
    public static final int USES=7;
    public static final int REAL_NUMBER=27;
    public static final int LEFT_PAREN=74;
    public static final int OP_EQUAL=82;
    public static final int IMPORTS=9;
    public static final int CALL=22;
    public static final int OP_DATA_IS_EXPRESSION=35;
    public static final int USE=6;
    public static final int FALSE=63;
    public static final int STRING_PARENS=43;
    public static final int COMMENT_SINGLE_LINE=38;
    public static final int CLASS_ID=102;
    public static final int OP_CONCAT=95;
    public static final int SMALL_LETTER=98;
    public static final int CLASS=10;
    public static final int DEF=47;
    public static final int OP_ASSIGN=88;
    public static final int EXPRESSION_END=34;
    public static final int OP_OR=90;
    public static final int TYPE_SELECT=14;
    public static final int AND=48;
    public static final int DATA_END=32;
    public static final int IF_ELSE=21;
    public static final int IF=50;
    public static final int COMMENT_MULTI_LINE=39;
    public static final int AS=56;
    public static final int RIGHT_PAREN=75;
    public static final int BIG_LETTER=101;
    public static final int SLASH=72;
    public static final int IN=49;
    public static final int THEN=51;
    public static final int LEFT_SQUARE_PAREN=76;
    public static final int IS=57;
    public static final int IT=36;
    public static final int TAG_START=29;
    public static final int ARGUMENT=18;
    public static final int RIGHT_SQUARE_PAREN=77;
    public static final int TILDE=73;
    public static final int OP_GENERAL=96;
    public static final int IDENT=11;
    public static final int OP_NOT=91;
    public static final int DIGIT=103;
    public static final int LAMBDA=61;
    public static final int HEADER=5;
    public static final int DOT=69;
    public static final int NOT_NAME=106;
    public static final int OP_MULTIPLY=80;
    public static final int RETURNS=19;
    public static final int ITEM=37;
    public static final int OP_PLUS=78;
    public static final int TO=59;
    public static final int DEFAULT=55;
    public static final int ATOM_SELECT=12;
    public static final int MODULE=46;
    public static final int COMA=71;
    public static final int TRUE=62;
    public static final int OP_VIEW=94;
    public static final int OP_MODULO=81;
    public static final int COLON=67;
    public static final int ITERATE=16;
    public static final int TAG_END=30;
    public static final int NEWLINE=41;
    public static final int BLOCK=20;
    public static final int MAP=58;
    public static final int PROPERTY_SELECT=13;
    public static final int OP_CONTEXT=92;
    public static final int ACTION_ON_NEWLINE=42;
    public static final int PROGRAM=4;
    public static final int OP_LEQ=84;

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
            // elements: MODULE, module_id
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
            IMPORT17=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_declaration231);  
            stream_IMPORT.add(IMPORT17);

            pushFollow(FOLLOW_external_class_name_in_import_declaration235);
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:47:1: use_declaration : USE module_id AS VAR_ID -> ^( USE[$USE, $VAR_ID] module_id ) ;
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
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:48:3: ( USE module_id AS VAR_ID -> ^( USE[$USE, $VAR_ID] module_id ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:48:5: USE module_id AS VAR_ID
            {
            USE18=(Token)match(input,USE,FOLLOW_USE_in_use_declaration264);  
            stream_USE.add(USE18);

            pushFollow(FOLLOW_module_id_in_use_declaration266);
            module_id19=module_id();

            state._fsp--;

            stream_module_id.add(module_id19.getTree());
            AS20=(Token)match(input,AS,FOLLOW_AS_in_use_declaration268);  
            stream_AS.add(AS20);

            VAR_ID21=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_use_declaration270);  
            stream_VAR_ID.add(VAR_ID21);



            // AST REWRITE
            // elements: USE, module_id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 49:5: -> ^( USE[$USE, $VAR_ID] module_id )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:49:8: ^( USE[$USE, $VAR_ID] module_id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new UseDeclaration(USE, USE18, VAR_ID21), root_1);

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
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==VAR_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:53:6: VAR_ID DOT
            	    {
            	    VAR_ID22=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_external_class_name302); 
            	    VAR_ID22_tree = (Object)adaptor.create(VAR_ID22);
            	    adaptor.addChild(root_0, VAR_ID22_tree);

            	    DOT23=(Token)match(input,DOT,FOLLOW_DOT_in_external_class_name304); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==VAR_ID) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==DOT) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:56:6: VAR_ID DOT
            	    {
            	    VAR_ID25=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_module_id330); 
            	    VAR_ID25_tree = (Object)adaptor.create(VAR_ID25);
            	    adaptor.addChild(root_0, VAR_ID25_tree);

            	    DOT26=(Token)match(input,DOT,FOLLOW_DOT_in_module_id332); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            VAR_ID27=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_module_id337); 
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
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==TAG_START) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:63:5: tag_definition
            	    {
            	    pushFollow(FOLLOW_tag_definition_in_definitions353);
            	    tag_definition28=tag_definition();

            	    state._fsp--;

            	    stream_tag_definition.add(tag_definition28.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            TAG_START29=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_tag_definition376);  
            stream_TAG_START.add(TAG_START29);

            DEF30=(Token)match(input,DEF,FOLLOW_DEF_in_tag_definition378);  
            stream_DEF.add(DEF30);

            pushFollow(FOLLOW_definition_signature_in_tag_definition380);
            definition_signature31=definition_signature();

            state._fsp--;

            stream_definition_signature.add(definition_signature31.getTree());
            pushFollow(FOLLOW_tag_content_in_tag_definition386);
            content=tag_content();

            state._fsp--;

            stream_tag_content.add(content.getTree());
            TAG_END32=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_tag_definition390);  
            stream_TAG_END.add(TAG_END32);



            // AST REWRITE
            // elements: DEF, content, definition_signature
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:74:10: fragment definition_signature : ( VAR_ID | DEFAULT ) ( OP_LE it= single_type OP_GE )? ( definition_argument )* ( OP_FUNCTION_DEFINITION ret_type= type )? -> ( VAR_ID )? ( DEFAULT )? ( $it)? ^( ARGUMENTS ( definition_argument )* ) ^( RETURNS ( $ret_type)? ) ;
    public final OmttParser.definition_signature_return definition_signature() throws RecognitionException {
        OmttParser.definition_signature_return retval = new OmttParser.definition_signature_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID33=null;
        Token DEFAULT34=null;
        Token OP_LE35=null;
        Token OP_GE36=null;
        Token OP_FUNCTION_DEFINITION38=null;
        OmttParser.single_type_return it = null;

        OmttParser.type_return ret_type = null;

        OmttParser.definition_argument_return definition_argument37 = null;


        Object VAR_ID33_tree=null;
        Object DEFAULT34_tree=null;
        Object OP_LE35_tree=null;
        Object OP_GE36_tree=null;
        Object OP_FUNCTION_DEFINITION38_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_LE=new RewriteRuleTokenStream(adaptor,"token OP_LE");
        RewriteRuleTokenStream stream_OP_GE=new RewriteRuleTokenStream(adaptor,"token OP_GE");
        RewriteRuleTokenStream stream_OP_FUNCTION_DEFINITION=new RewriteRuleTokenStream(adaptor,"token OP_FUNCTION_DEFINITION");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_definition_argument=new RewriteRuleSubtreeStream(adaptor,"rule definition_argument");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:3: ( ( VAR_ID | DEFAULT ) ( OP_LE it= single_type OP_GE )? ( definition_argument )* ( OP_FUNCTION_DEFINITION ret_type= type )? -> ( VAR_ID )? ( DEFAULT )? ( $it)? ^( ARGUMENTS ( definition_argument )* ) ^( RETURNS ( $ret_type)? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:5: ( VAR_ID | DEFAULT ) ( OP_LE it= single_type OP_GE )? ( definition_argument )* ( OP_FUNCTION_DEFINITION ret_type= type )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:5: ( VAR_ID | DEFAULT )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==VAR_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==DEFAULT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:6: VAR_ID
                    {
                    VAR_ID33=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_signature422);  
                    stream_VAR_ID.add(VAR_ID33);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:13: DEFAULT
                    {
                    DEFAULT34=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_definition_signature424);  
                    stream_DEFAULT.add(DEFAULT34);


                    }
                    break;

            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:22: ( OP_LE it= single_type OP_GE )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==OP_LE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:23: OP_LE it= single_type OP_GE
                    {
                    OP_LE35=(Token)match(input,OP_LE,FOLLOW_OP_LE_in_definition_signature428);  
                    stream_OP_LE.add(OP_LE35);

                    pushFollow(FOLLOW_single_type_in_definition_signature432);
                    it=single_type();

                    state._fsp--;

                    stream_single_type.add(it.getTree());
                    OP_GE36=(Token)match(input,OP_GE,FOLLOW_OP_GE_in_definition_signature434);  
                    stream_OP_GE.add(OP_GE36);


                    }
                    break;

            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:52: ( definition_argument )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==TILDE||LA12_0==VAR_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:52: definition_argument
            	    {
            	    pushFollow(FOLLOW_definition_argument_in_definition_signature438);
            	    definition_argument37=definition_argument();

            	    state._fsp--;

            	    stream_definition_argument.add(definition_argument37.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:73: ( OP_FUNCTION_DEFINITION ret_type= type )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==OP_FUNCTION_DEFINITION) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:74: OP_FUNCTION_DEFINITION ret_type= type
                    {
                    OP_FUNCTION_DEFINITION38=(Token)match(input,OP_FUNCTION_DEFINITION,FOLLOW_OP_FUNCTION_DEFINITION_in_definition_signature442);  
                    stream_OP_FUNCTION_DEFINITION.add(OP_FUNCTION_DEFINITION38);

                    pushFollow(FOLLOW_type_in_definition_signature446);
                    ret_type=type();

                    state._fsp--;

                    stream_type.add(ret_type.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ret_type, it, definition_argument, DEFAULT, VAR_ID
            // token labels: 
            // rule labels: retval, it, ret_type
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_it=new RewriteRuleSubtreeStream(adaptor,"rule it",it!=null?it.tree:null);
            RewriteRuleSubtreeStream stream_ret_type=new RewriteRuleSubtreeStream(adaptor,"rule ret_type",ret_type!=null?ret_type.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:5: -> ( VAR_ID )? ( DEFAULT )? ( $it)? ^( ARGUMENTS ( definition_argument )* ) ^( RETURNS ( $ret_type)? )
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
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:39: ( $it)?
                if ( stream_it.hasNext() ) {
                    adaptor.addChild(root_0, stream_it.nextTree());

                }
                stream_it.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:44: ^( ARGUMENTS ( definition_argument )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:56: ( definition_argument )*
                while ( stream_definition_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_definition_argument.nextTree());

                }
                stream_definition_argument.reset();

                adaptor.addChild(root_0, root_1);
                }
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:78: ^( RETURNS ( $ret_type)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURNS, "RETURNS"), root_1);

                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:88: ( $ret_type)?
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

    public static class definition_argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition_argument"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:79:10: fragment definition_argument : ( TILDE )? id= VAR_ID ( OP_ASSIGN type | OP_MULTIPLY )? -> ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? ) ;
    public final OmttParser.definition_argument_return definition_argument() throws RecognitionException {
        OmttParser.definition_argument_return retval = new OmttParser.definition_argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        Token TILDE39=null;
        Token OP_ASSIGN40=null;
        Token OP_MULTIPLY42=null;
        OmttParser.type_return type41 = null;


        Object id_tree=null;
        Object TILDE39_tree=null;
        Object OP_ASSIGN40_tree=null;
        Object OP_MULTIPLY42_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleTokenStream stream_OP_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token OP_MULTIPLY");
        RewriteRuleTokenStream stream_TILDE=new RewriteRuleTokenStream(adaptor,"token TILDE");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:3: ( ( TILDE )? id= VAR_ID ( OP_ASSIGN type | OP_MULTIPLY )? -> ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:5: ( TILDE )? id= VAR_ID ( OP_ASSIGN type | OP_MULTIPLY )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:5: ( TILDE )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==TILDE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:5: TILDE
                    {
                    TILDE39=(Token)match(input,TILDE,FOLLOW_TILDE_in_definition_argument500);  
                    stream_TILDE.add(TILDE39);


                    }
                    break;

            }

            id=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_argument505);  
            stream_VAR_ID.add(id);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:22: ( OP_ASSIGN type | OP_MULTIPLY )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==OP_ASSIGN) ) {
                alt15=1;
            }
            else if ( (LA15_0==OP_MULTIPLY) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:23: OP_ASSIGN type
                    {
                    OP_ASSIGN40=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_argument508);  
                    stream_OP_ASSIGN.add(OP_ASSIGN40);

                    pushFollow(FOLLOW_type_in_definition_argument510);
                    type41=type();

                    state._fsp--;

                    stream_type.add(type41.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:40: OP_MULTIPLY
                    {
                    OP_MULTIPLY42=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_definition_argument514);  
                    stream_OP_MULTIPLY.add(OP_MULTIPLY42);


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
            // 81:5: -> ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:81:8: ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TemplateArgument(ARGUMENT), root_1);

                adaptor.addChild(root_1, new Ident(IDENT, id));
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:81:55: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:81:61: ( TILDE )?
                if ( stream_TILDE.hasNext() ) {
                    adaptor.addChild(root_1, stream_TILDE.nextNode());

                }
                stream_TILDE.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:81:68: ( OP_MULTIPLY )?
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:87:1: tag_content : ( CONTENT ( data_body_atom )* -> ^( CONTENT ( data_body_atom )* ) | OP_DATA_IS_EXPRESSION CONTENT expression -> expression );
    public final OmttParser.tag_content_return tag_content() throws RecognitionException {
        OmttParser.tag_content_return retval = new OmttParser.tag_content_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONTENT43=null;
        Token OP_DATA_IS_EXPRESSION45=null;
        Token CONTENT46=null;
        OmttParser.data_body_atom_return data_body_atom44 = null;

        OmttParser.expression_return expression47 = null;


        Object CONTENT43_tree=null;
        Object OP_DATA_IS_EXPRESSION45_tree=null;
        Object CONTENT46_tree=null;
        RewriteRuleTokenStream stream_CONTENT=new RewriteRuleTokenStream(adaptor,"token CONTENT");
        RewriteRuleTokenStream stream_OP_DATA_IS_EXPRESSION=new RewriteRuleTokenStream(adaptor,"token OP_DATA_IS_EXPRESSION");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_data_body_atom=new RewriteRuleSubtreeStream(adaptor,"rule data_body_atom");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:88:3: ( CONTENT ( data_body_atom )* -> ^( CONTENT ( data_body_atom )* ) | OP_DATA_IS_EXPRESSION CONTENT expression -> expression )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==CONTENT) ) {
                alt17=1;
            }
            else if ( (LA17_0==OP_DATA_IS_EXPRESSION) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:88:5: CONTENT ( data_body_atom )*
                    {
                    CONTENT43=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_tag_content560);  
                    stream_CONTENT.add(CONTENT43);

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:89:5: ( data_body_atom )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==TAG_START) ) {
                            int LA16_2 = input.LA(2);

                            if ( (LA16_2==DEF||LA16_2==IF||LA16_2==MAP||LA16_2==OP_GENERAL||LA16_2==VAR_ID) ) {
                                alt16=1;
                            }


                        }
                        else if ( (LA16_0==STRING_LITERAL||LA16_0==EXPRESSION_START) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:89:5: data_body_atom
                    	    {
                    	    pushFollow(FOLLOW_data_body_atom_in_tag_content566);
                    	    data_body_atom44=data_body_atom();

                    	    state._fsp--;

                    	    stream_data_body_atom.add(data_body_atom44.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: data_body_atom, CONTENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 90:5: -> ^( CONTENT ( data_body_atom )* )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:90:8: ^( CONTENT ( data_body_atom )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Data(stream_CONTENT.nextToken()), root_1);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:90:24: ( data_body_atom )*
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:91:5: OP_DATA_IS_EXPRESSION CONTENT expression
                    {
                    OP_DATA_IS_EXPRESSION45=(Token)match(input,OP_DATA_IS_EXPRESSION,FOLLOW_OP_DATA_IS_EXPRESSION_in_tag_content589);  
                    stream_OP_DATA_IS_EXPRESSION.add(OP_DATA_IS_EXPRESSION45);

                    CONTENT46=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_tag_content591);  
                    stream_CONTENT.add(CONTENT46);

                    pushFollow(FOLLOW_expression_in_tag_content597);
                    expression47=expression();

                    state._fsp--;

                    stream_expression.add(expression47.getTree());


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
                    // 93:5: -> expression
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:96:1: data_body_atom : ( STRING_LITERAL | expression_inside_data | tag_inside_data );
    public final OmttParser.data_body_atom_return data_body_atom() throws RecognitionException {
        OmttParser.data_body_atom_return retval = new OmttParser.data_body_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING_LITERAL48=null;
        OmttParser.expression_inside_data_return expression_inside_data49 = null;

        OmttParser.tag_inside_data_return tag_inside_data50 = null;


        Object STRING_LITERAL48_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:97:3: ( STRING_LITERAL | expression_inside_data | tag_inside_data )
            int alt18=3;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
                {
                alt18=1;
                }
                break;
            case EXPRESSION_START:
                {
                alt18=2;
                }
                break;
            case TAG_START:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:97:5: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL48=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_data_body_atom618); 
                    STRING_LITERAL48_tree = new Literal(STRING_LITERAL48) ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_LITERAL48_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:98:5: expression_inside_data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_inside_data_in_data_body_atom628);
                    expression_inside_data49=expression_inside_data();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_inside_data49.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:99:5: tag_inside_data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tag_inside_data_in_data_body_atom634);
                    tag_inside_data50=tag_inside_data();

                    state._fsp--;

                    adaptor.addChild(root_0, tag_inside_data50.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:102:10: fragment expression_inside_data : EXPRESSION_START expression EXPRESSION_END ;
    public final OmttParser.expression_inside_data_return expression_inside_data() throws RecognitionException {
        OmttParser.expression_inside_data_return retval = new OmttParser.expression_inside_data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXPRESSION_START51=null;
        Token EXPRESSION_END53=null;
        OmttParser.expression_return expression52 = null;


        Object EXPRESSION_START51_tree=null;
        Object EXPRESSION_END53_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:103:3: ( EXPRESSION_START expression EXPRESSION_END )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:103:5: EXPRESSION_START expression EXPRESSION_END
            {
            root_0 = (Object)adaptor.nil();

            EXPRESSION_START51=(Token)match(input,EXPRESSION_START,FOLLOW_EXPRESSION_START_in_expression_inside_data649); 
            pushFollow(FOLLOW_expression_in_expression_inside_data652);
            expression52=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression52.getTree());
            EXPRESSION_END53=(Token)match(input,EXPRESSION_END,FOLLOW_EXPRESSION_END_in_expression_inside_data654); 

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:106:10: fragment tag_inside_data : ( def_in_tag | if_tag | call_tag | map_tag );
    public final OmttParser.tag_inside_data_return tag_inside_data() throws RecognitionException {
        OmttParser.tag_inside_data_return retval = new OmttParser.tag_inside_data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.def_in_tag_return def_in_tag54 = null;

        OmttParser.if_tag_return if_tag55 = null;

        OmttParser.call_tag_return call_tag56 = null;

        OmttParser.map_tag_return map_tag57 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:107:3: ( def_in_tag | if_tag | call_tag | map_tag )
            int alt19=4;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==TAG_START) ) {
                switch ( input.LA(2) ) {
                case DEF:
                    {
                    alt19=1;
                    }
                    break;
                case MAP:
                    {
                    alt19=4;
                    }
                    break;
                case IF:
                    {
                    alt19=2;
                    }
                    break;
                case OP_GENERAL:
                case VAR_ID:
                    {
                    alt19=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:107:5: def_in_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_def_in_tag_in_tag_inside_data670);
                    def_in_tag54=def_in_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, def_in_tag54.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:108:5: if_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_tag_in_tag_inside_data676);
                    if_tag55=if_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, if_tag55.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:109:5: call_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_tag_in_tag_inside_data682);
                    call_tag56=call_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, call_tag56.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:110:5: map_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_tag_in_tag_inside_data688);
                    map_tag57=map_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, map_tag57.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:116:1: expression : ( lambda_expression | def_in_expression | concatence_expression );
    public final OmttParser.expression_return expression() throws RecognitionException {
        OmttParser.expression_return retval = new OmttParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.lambda_expression_return lambda_expression58 = null;

        OmttParser.def_in_expression_return def_in_expression59 = null;

        OmttParser.concatence_expression_return concatence_expression60 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:117:3: ( lambda_expression | def_in_expression | concatence_expression )
            int alt20=3;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:117:5: lambda_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expression_in_expression704);
                    lambda_expression58=lambda_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, lambda_expression58.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:118:5: def_in_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_def_in_expression_in_expression710);
                    def_in_expression59=def_in_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, def_in_expression59.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:119:5: concatence_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_concatence_expression_in_expression716);
                    concatence_expression60=concatence_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, concatence_expression60.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:124:1: def_in_expression : DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.def_in_expression_return def_in_expression() throws RecognitionException {
        OmttParser.def_in_expression_return retval = new OmttParser.def_in_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEF61=null;
        Token AND62=null;
        Token IN63=null;
        Token COLON64=null;
        List list_definition=null;
        OmttParser.expression_return content = null;

        OmttParser.definition_inside_expression_return definition = null;
         definition = null;
        Object DEF61_tree=null;
        Object AND62_tree=null;
        Object IN63_tree=null;
        Object COLON64_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_inside_expression=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:125:3: ( DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:125:5: DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression
            {
            DEF61=(Token)match(input,DEF,FOLLOW_DEF_in_def_in_expression731);  
            stream_DEF.add(DEF61);

            pushFollow(FOLLOW_definition_inside_expression_in_def_in_expression735);
            definition=definition_inside_expression();

            state._fsp--;

            stream_definition_inside_expression.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:126:5: ( AND definition+= definition_inside_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==AND) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:126:6: AND definition+= definition_inside_expression
            	    {
            	    AND62=(Token)match(input,AND,FOLLOW_AND_in_def_in_expression742);  
            	    stream_AND.add(AND62);

            	    pushFollow(FOLLOW_definition_inside_expression_in_def_in_expression746);
            	    definition=definition_inside_expression();

            	    state._fsp--;

            	    stream_definition_inside_expression.add(definition.getTree());
            	    if (list_definition==null) list_definition=new ArrayList();
            	    list_definition.add(definition.getTree());


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            IN63=(Token)match(input,IN,FOLLOW_IN_in_def_in_expression754);  
            stream_IN.add(IN63);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:127:8: ( COLON )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==COLON) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:127:8: COLON
                    {
                    COLON64=(Token)match(input,COLON,FOLLOW_COLON_in_def_in_expression756);  
                    stream_COLON.add(COLON64);


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_def_in_expression761);
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
            // 128:5: -> ^( BLOCK ( $definition)+ $content)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:128:8: ^( BLOCK ( $definition)+ $content)
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:130:1: definition_inside_expression : ( definition_signature COLON expression -> ^( DEF definition_signature expression ) | VAR_ID OP_ASSIGN expression -> ^( DEF VAR_ID expression ) );
    public final OmttParser.definition_inside_expression_return definition_inside_expression() throws RecognitionException {
        OmttParser.definition_inside_expression_return retval = new OmttParser.definition_inside_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON66=null;
        Token VAR_ID68=null;
        Token OP_ASSIGN69=null;
        OmttParser.definition_signature_return definition_signature65 = null;

        OmttParser.expression_return expression67 = null;

        OmttParser.expression_return expression70 = null;


        Object COLON66_tree=null;
        Object VAR_ID68_tree=null;
        Object OP_ASSIGN69_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_signature=new RewriteRuleSubtreeStream(adaptor,"rule definition_signature");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:131:3: ( definition_signature COLON expression -> ^( DEF definition_signature expression ) | VAR_ID OP_ASSIGN expression -> ^( DEF VAR_ID expression ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==VAR_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==OP_ASSIGN) ) {
                    alt23=2;
                }
                else if ( ((LA23_1>=OP_FUNCTION_DEFINITION && LA23_1<=COLON)||LA23_1==TILDE||LA23_1==OP_LE||LA23_1==VAR_ID) ) {
                    alt23=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0==DEFAULT) ) {
                alt23=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:131:5: definition_signature COLON expression
                    {
                    pushFollow(FOLLOW_definition_signature_in_definition_inside_expression793);
                    definition_signature65=definition_signature();

                    state._fsp--;

                    stream_definition_signature.add(definition_signature65.getTree());
                    COLON66=(Token)match(input,COLON,FOLLOW_COLON_in_definition_inside_expression795);  
                    stream_COLON.add(COLON66);

                    pushFollow(FOLLOW_expression_in_definition_inside_expression801);
                    expression67=expression();

                    state._fsp--;

                    stream_expression.add(expression67.getTree());


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
                    // 133:5: -> ^( DEF definition_signature expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:133:8: ^( DEF definition_signature expression )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:134:5: VAR_ID OP_ASSIGN expression
                    {
                    VAR_ID68=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_inside_expression824);  
                    stream_VAR_ID.add(VAR_ID68);

                    OP_ASSIGN69=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_inside_expression826);  
                    stream_OP_ASSIGN.add(OP_ASSIGN69);

                    pushFollow(FOLLOW_expression_in_definition_inside_expression831);
                    expression70=expression();

                    state._fsp--;

                    stream_expression.add(expression70.getTree());


                    // AST REWRITE
                    // elements: VAR_ID, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 136:5: -> ^( DEF VAR_ID expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:136:8: ^( DEF VAR_ID expression )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:139:1: def_in_tag : TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.def_in_tag_return def_in_tag() throws RecognitionException {
        OmttParser.def_in_tag_return retval = new OmttParser.def_in_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START71=null;
        Token DEF72=null;
        Token TAG_START73=null;
        Token AND74=null;
        Token TAG_START75=null;
        Token IN76=null;
        Token TAG_END77=null;
        List list_definition=null;
        OmttParser.tag_content_return content = null;

        OmttParser.definition_inside_tag_return definition = null;
         definition = null;
        Object TAG_START71_tree=null;
        Object DEF72_tree=null;
        Object TAG_START73_tree=null;
        Object AND74_tree=null;
        Object TAG_START75_tree=null;
        Object IN76_tree=null;
        Object TAG_END77_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_definition_inside_tag=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_tag");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:140:3: ( TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:140:5: TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END
            {
            TAG_START71=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag864);  
            stream_TAG_START.add(TAG_START71);

            DEF72=(Token)match(input,DEF,FOLLOW_DEF_in_def_in_tag866);  
            stream_DEF.add(DEF72);

            pushFollow(FOLLOW_definition_inside_tag_in_def_in_tag870);
            definition=definition_inside_tag();

            state._fsp--;

            stream_definition_inside_tag.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:141:5: ( TAG_START AND definition+= definition_inside_tag )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==TAG_START) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==AND) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:141:6: TAG_START AND definition+= definition_inside_tag
            	    {
            	    TAG_START73=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag877);  
            	    stream_TAG_START.add(TAG_START73);

            	    AND74=(Token)match(input,AND,FOLLOW_AND_in_def_in_tag879);  
            	    stream_AND.add(AND74);

            	    pushFollow(FOLLOW_definition_inside_tag_in_def_in_tag883);
            	    definition=definition_inside_tag();

            	    state._fsp--;

            	    stream_definition_inside_tag.add(definition.getTree());
            	    if (list_definition==null) list_definition=new ArrayList();
            	    list_definition.add(definition.getTree());


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            TAG_START75=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag891);  
            stream_TAG_START.add(TAG_START75);

            IN76=(Token)match(input,IN,FOLLOW_IN_in_def_in_tag893);  
            stream_IN.add(IN76);

            pushFollow(FOLLOW_tag_content_in_def_in_tag897);
            content=tag_content();

            state._fsp--;

            stream_tag_content.add(content.getTree());
            TAG_END77=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_def_in_tag903);  
            stream_TAG_END.add(TAG_END77);



            // AST REWRITE
            // elements: definition, content
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
            // 144:5: -> ^( BLOCK ( $definition)+ $content)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:144:8: ^( BLOCK ( $definition)+ $content)
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:146:1: definition_inside_tag : ( definition_signature content= tag_content -> ^( DEF definition_signature $content) | VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )? -> ^( DEF VAR_ID expression ) );
    public final OmttParser.definition_inside_tag_return definition_inside_tag() throws RecognitionException {
        OmttParser.definition_inside_tag_return retval = new OmttParser.definition_inside_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID79=null;
        Token OP_ASSIGN80=null;
        Token CONTENT82=null;
        Token STRING_LITERAL83=null;
        OmttParser.tag_content_return content = null;

        OmttParser.definition_signature_return definition_signature78 = null;

        OmttParser.expression_return expression81 = null;


        Object VAR_ID79_tree=null;
        Object OP_ASSIGN80_tree=null;
        Object CONTENT82_tree=null;
        Object STRING_LITERAL83_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_CONTENT=new RewriteRuleTokenStream(adaptor,"token CONTENT");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_signature=new RewriteRuleSubtreeStream(adaptor,"rule definition_signature");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:147:3: ( definition_signature content= tag_content -> ^( DEF definition_signature $content) | VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )? -> ^( DEF VAR_ID expression ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==VAR_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==OP_ASSIGN) ) {
                    alt27=2;
                }
                else if ( (LA27_1==CONTENT||LA27_1==OP_DATA_IS_EXPRESSION||LA27_1==OP_FUNCTION_DEFINITION||LA27_1==TILDE||LA27_1==OP_LE||LA27_1==VAR_ID) ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0==DEFAULT) ) {
                alt27=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:147:5: definition_signature content= tag_content
                    {
                    pushFollow(FOLLOW_definition_signature_in_definition_inside_tag935);
                    definition_signature78=definition_signature();

                    state._fsp--;

                    stream_definition_signature.add(definition_signature78.getTree());
                    pushFollow(FOLLOW_tag_content_in_definition_inside_tag939);
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
                    // 148:5: -> ^( DEF definition_signature $content)
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:148:8: ^( DEF definition_signature $content)
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:149:5: VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )?
                    {
                    VAR_ID79=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_inside_tag963);  
                    stream_VAR_ID.add(VAR_ID79);

                    OP_ASSIGN80=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_inside_tag965);  
                    stream_OP_ASSIGN.add(OP_ASSIGN80);

                    pushFollow(FOLLOW_expression_in_definition_inside_tag967);
                    expression81=expression();

                    state._fsp--;

                    stream_expression.add(expression81.getTree());
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:149:33: ( CONTENT ( STRING_LITERAL )? )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==CONTENT) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:149:34: CONTENT ( STRING_LITERAL )?
                            {
                            CONTENT82=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_definition_inside_tag970);  
                            stream_CONTENT.add(CONTENT82);

                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:149:42: ( STRING_LITERAL )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==STRING_LITERAL) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:149:42: STRING_LITERAL
                                    {
                                    STRING_LITERAL83=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_definition_inside_tag972);  
                                    stream_STRING_LITERAL.add(STRING_LITERAL83);


                                    }
                                    break;

                            }


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: VAR_ID, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 150:5: -> ^( DEF VAR_ID expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:150:8: ^( DEF VAR_ID expression )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:156:1: lambda_expression : ( LAMBDA ( definition_argument )* COLON expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | ( definition_argument )* OP_FUNCTION_DEFINITION expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | lambda_match_expression );
    public final OmttParser.lambda_expression_return lambda_expression() throws RecognitionException {
        OmttParser.lambda_expression_return retval = new OmttParser.lambda_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAMBDA84=null;
        Token COLON86=null;
        Token OP_FUNCTION_DEFINITION89=null;
        OmttParser.definition_argument_return definition_argument85 = null;

        OmttParser.expression_return expression87 = null;

        OmttParser.definition_argument_return definition_argument88 = null;

        OmttParser.expression_return expression90 = null;

        OmttParser.lambda_match_expression_return lambda_match_expression91 = null;


        Object LAMBDA84_tree=null;
        Object COLON86_tree=null;
        Object OP_FUNCTION_DEFINITION89_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_LAMBDA=new RewriteRuleTokenStream(adaptor,"token LAMBDA");
        RewriteRuleTokenStream stream_OP_FUNCTION_DEFINITION=new RewriteRuleTokenStream(adaptor,"token OP_FUNCTION_DEFINITION");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_argument=new RewriteRuleSubtreeStream(adaptor,"rule definition_argument");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:157:3: ( LAMBDA ( definition_argument )* COLON expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | ( definition_argument )* OP_FUNCTION_DEFINITION expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | lambda_match_expression )
            int alt30=3;
            switch ( input.LA(1) ) {
            case LAMBDA:
                {
                alt30=1;
                }
                break;
            case OP_FUNCTION_DEFINITION:
            case TILDE:
            case VAR_ID:
                {
                alt30=2;
                }
                break;
            case CLASS_ID:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:157:5: LAMBDA ( definition_argument )* COLON expression
                    {
                    LAMBDA84=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambda_expression1011);  
                    stream_LAMBDA.add(LAMBDA84);

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:157:12: ( definition_argument )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==TILDE||LA28_0==VAR_ID) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:157:12: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_lambda_expression1013);
                    	    definition_argument85=definition_argument();

                    	    state._fsp--;

                    	    stream_definition_argument.add(definition_argument85.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    COLON86=(Token)match(input,COLON,FOLLOW_COLON_in_lambda_expression1016);  
                    stream_COLON.add(COLON86);

                    pushFollow(FOLLOW_expression_in_lambda_expression1018);
                    expression87=expression();

                    state._fsp--;

                    stream_expression.add(expression87.getTree());


                    // AST REWRITE
                    // elements: definition_argument, LAMBDA, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:5: -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:158:8: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(stream_LAMBDA.nextToken()), root_1);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:158:35: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:158:47: ( definition_argument )*
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:159:5: ( definition_argument )* OP_FUNCTION_DEFINITION expression
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:159:5: ( definition_argument )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==TILDE||LA29_0==VAR_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:159:5: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_lambda_expression1046);
                    	    definition_argument88=definition_argument();

                    	    state._fsp--;

                    	    stream_definition_argument.add(definition_argument88.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    OP_FUNCTION_DEFINITION89=(Token)match(input,OP_FUNCTION_DEFINITION,FOLLOW_OP_FUNCTION_DEFINITION_in_lambda_expression1049);  
                    stream_OP_FUNCTION_DEFINITION.add(OP_FUNCTION_DEFINITION89);

                    pushFollow(FOLLOW_expression_in_lambda_expression1051);
                    expression90=expression();

                    state._fsp--;

                    stream_expression.add(expression90.getTree());


                    // AST REWRITE
                    // elements: expression, definition_argument
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 160:4: -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:160:7: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(LAMBDA), root_1);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:160:34: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:160:46: ( definition_argument )*
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:161:5: lambda_match_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lambda_match_expression_in_lambda_expression1078);
                    lambda_match_expression91=lambda_match_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, lambda_match_expression91.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:163:10: fragment lambda_match_expression : single_lambda_match ( SEMICOLON single_lambda_match )* ;
    public final OmttParser.lambda_match_expression_return lambda_match_expression() throws RecognitionException {
        OmttParser.lambda_match_expression_return retval = new OmttParser.lambda_match_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON93=null;
        OmttParser.single_lambda_match_return single_lambda_match92 = null;

        OmttParser.single_lambda_match_return single_lambda_match94 = null;


        Object SEMICOLON93_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:164:2: ( single_lambda_match ( SEMICOLON single_lambda_match )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:164:4: single_lambda_match ( SEMICOLON single_lambda_match )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_lambda_match_in_lambda_match_expression1091);
            single_lambda_match92=single_lambda_match();

            state._fsp--;

            adaptor.addChild(root_0, single_lambda_match92.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:164:24: ( SEMICOLON single_lambda_match )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==SEMICOLON) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:164:25: SEMICOLON single_lambda_match
            	    {
            	    SEMICOLON93=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_lambda_match_expression1094); 
            	    SEMICOLON93_tree = (Object)adaptor.create(SEMICOLON93);
            	    adaptor.addChild(root_0, SEMICOLON93_tree);

            	    pushFollow(FOLLOW_single_lambda_match_in_lambda_match_expression1096);
            	    single_lambda_match94=single_lambda_match();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_lambda_match94.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:166:10: fragment single_lambda_match : type OP_FUNCTION_DEFINITION concatence_expression ;
    public final OmttParser.single_lambda_match_return single_lambda_match() throws RecognitionException {
        OmttParser.single_lambda_match_return retval = new OmttParser.single_lambda_match_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_FUNCTION_DEFINITION96=null;
        OmttParser.type_return type95 = null;

        OmttParser.concatence_expression_return concatence_expression97 = null;


        Object OP_FUNCTION_DEFINITION96_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:167:2: ( type OP_FUNCTION_DEFINITION concatence_expression )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:167:4: type OP_FUNCTION_DEFINITION concatence_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_single_lambda_match1110);
            type95=type();

            state._fsp--;

            adaptor.addChild(root_0, type95.getTree());
            OP_FUNCTION_DEFINITION96=(Token)match(input,OP_FUNCTION_DEFINITION,FOLLOW_OP_FUNCTION_DEFINITION_in_single_lambda_match1112); 
            OP_FUNCTION_DEFINITION96_tree = (Object)adaptor.create(OP_FUNCTION_DEFINITION96);
            adaptor.addChild(root_0, OP_FUNCTION_DEFINITION96_tree);

            pushFollow(FOLLOW_concatence_expression_in_single_lambda_match1114);
            concatence_expression97=concatence_expression();

            state._fsp--;

            adaptor.addChild(root_0, concatence_expression97.getTree());

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

    public static class lambda_expression_no_context_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lambda_expression_no_context"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:169:1: lambda_expression_no_context : ( LAMBDA definition_argument COLON atom_expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression ) | ( definition_argument )* OP_FUNCTION_DEFINITION atom_expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression ) );
    public final OmttParser.lambda_expression_no_context_return lambda_expression_no_context() throws RecognitionException {
        OmttParser.lambda_expression_no_context_return retval = new OmttParser.lambda_expression_no_context_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAMBDA98=null;
        Token COLON100=null;
        Token OP_FUNCTION_DEFINITION103=null;
        OmttParser.definition_argument_return definition_argument99 = null;

        OmttParser.atom_expression_return atom_expression101 = null;

        OmttParser.definition_argument_return definition_argument102 = null;

        OmttParser.atom_expression_return atom_expression104 = null;


        Object LAMBDA98_tree=null;
        Object COLON100_tree=null;
        Object OP_FUNCTION_DEFINITION103_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_LAMBDA=new RewriteRuleTokenStream(adaptor,"token LAMBDA");
        RewriteRuleTokenStream stream_OP_FUNCTION_DEFINITION=new RewriteRuleTokenStream(adaptor,"token OP_FUNCTION_DEFINITION");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_definition_argument=new RewriteRuleSubtreeStream(adaptor,"rule definition_argument");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:170:3: ( LAMBDA definition_argument COLON atom_expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression ) | ( definition_argument )* OP_FUNCTION_DEFINITION atom_expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==LAMBDA) ) {
                alt33=1;
            }
            else if ( (LA33_0==OP_FUNCTION_DEFINITION||LA33_0==TILDE||LA33_0==VAR_ID) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:170:5: LAMBDA definition_argument COLON atom_expression
                    {
                    LAMBDA98=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambda_expression_no_context1125);  
                    stream_LAMBDA.add(LAMBDA98);

                    pushFollow(FOLLOW_definition_argument_in_lambda_expression_no_context1127);
                    definition_argument99=definition_argument();

                    state._fsp--;

                    stream_definition_argument.add(definition_argument99.getTree());
                    COLON100=(Token)match(input,COLON,FOLLOW_COLON_in_lambda_expression_no_context1129);  
                    stream_COLON.add(COLON100);

                    pushFollow(FOLLOW_atom_expression_in_lambda_expression_no_context1131);
                    atom_expression101=atom_expression();

                    state._fsp--;

                    stream_atom_expression.add(atom_expression101.getTree());


                    // AST REWRITE
                    // elements: definition_argument, LAMBDA, atom_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 171:4: -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:171:7: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(stream_LAMBDA.nextToken()), root_1);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:171:34: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:171:46: ( definition_argument )*
                        while ( stream_definition_argument.hasNext() ) {
                            adaptor.addChild(root_2, stream_definition_argument.nextTree());

                        }
                        stream_definition_argument.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_atom_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:172:5: ( definition_argument )* OP_FUNCTION_DEFINITION atom_expression
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:172:5: ( definition_argument )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==TILDE||LA32_0==VAR_ID) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:172:5: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_lambda_expression_no_context1158);
                    	    definition_argument102=definition_argument();

                    	    state._fsp--;

                    	    stream_definition_argument.add(definition_argument102.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    OP_FUNCTION_DEFINITION103=(Token)match(input,OP_FUNCTION_DEFINITION,FOLLOW_OP_FUNCTION_DEFINITION_in_lambda_expression_no_context1161);  
                    stream_OP_FUNCTION_DEFINITION.add(OP_FUNCTION_DEFINITION103);

                    pushFollow(FOLLOW_atom_expression_in_lambda_expression_no_context1163);
                    atom_expression104=atom_expression();

                    state._fsp--;

                    stream_atom_expression.add(atom_expression104.getTree());


                    // AST REWRITE
                    // elements: atom_expression, definition_argument
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 173:4: -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:173:7: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(LAMBDA), root_1);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:173:34: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:173:46: ( definition_argument )*
                        while ( stream_definition_argument.hasNext() ) {
                            adaptor.addChild(root_2, stream_definition_argument.nextTree());

                        }
                        stream_definition_argument.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_atom_expression.nextTree());

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
    // $ANTLR end "lambda_expression_no_context"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:176:10: fragment type : CLASS_ID ( OP_MULTIPLY )? -> ^( CLASS_ID ( OP_MULTIPLY )? ) ;
    public final OmttParser.type_return type() throws RecognitionException {
        OmttParser.type_return retval = new OmttParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS_ID105=null;
        Token OP_MULTIPLY106=null;

        Object CLASS_ID105_tree=null;
        Object OP_MULTIPLY106_tree=null;
        RewriteRuleTokenStream stream_OP_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token OP_MULTIPLY");
        RewriteRuleTokenStream stream_CLASS_ID=new RewriteRuleTokenStream(adaptor,"token CLASS_ID");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:177:3: ( CLASS_ID ( OP_MULTIPLY )? -> ^( CLASS_ID ( OP_MULTIPLY )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:177:5: CLASS_ID ( OP_MULTIPLY )?
            {
            CLASS_ID105=(Token)match(input,CLASS_ID,FOLLOW_CLASS_ID_in_type1199);  
            stream_CLASS_ID.add(CLASS_ID105);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:177:14: ( OP_MULTIPLY )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==OP_MULTIPLY) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:177:14: OP_MULTIPLY
                    {
                    OP_MULTIPLY106=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_type1201);  
                    stream_OP_MULTIPLY.add(OP_MULTIPLY106);


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
            // 178:4: -> ^( CLASS_ID ( OP_MULTIPLY )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:178:7: ^( CLASS_ID ( OP_MULTIPLY )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TypeReference(stream_CLASS_ID.nextToken()), root_1);

                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:178:33: ( OP_MULTIPLY )?
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:180:10: fragment single_type : CLASS_ID -> ^( CLASS_ID ) ;
    public final OmttParser.single_type_return single_type() throws RecognitionException {
        OmttParser.single_type_return retval = new OmttParser.single_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS_ID107=null;

        Object CLASS_ID107_tree=null;
        RewriteRuleTokenStream stream_CLASS_ID=new RewriteRuleTokenStream(adaptor,"token CLASS_ID");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:181:3: ( CLASS_ID -> ^( CLASS_ID ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:181:5: CLASS_ID
            {
            CLASS_ID107=(Token)match(input,CLASS_ID,FOLLOW_CLASS_ID_in_single_type1231);  
            stream_CLASS_ID.add(CLASS_ID107);



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
            // 182:4: -> ^( CLASS_ID )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:182:7: ^( CLASS_ID )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:187:1: concatence_expression : (expr+= control_expression -> $expr) ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )? ;
    public final OmttParser.concatence_expression_return concatence_expression() throws RecognitionException {
        OmttParser.concatence_expression_return retval = new OmttParser.concatence_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_CONCAT108=null;
        List list_expr=null;
        OmttParser.control_expression_return expr = null;
         expr = null;
        Object OP_CONCAT108_tree=null;
        RewriteRuleTokenStream stream_OP_CONCAT=new RewriteRuleTokenStream(adaptor,"token OP_CONCAT");
        RewriteRuleSubtreeStream stream_control_expression=new RewriteRuleSubtreeStream(adaptor,"rule control_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:188:3: ( (expr+= control_expression -> $expr) ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:188:5: (expr+= control_expression -> $expr) ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:188:5: (expr+= control_expression -> $expr)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:188:6: expr+= control_expression
            {
            pushFollow(FOLLOW_control_expression_in_concatence_expression1260);
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
            // 188:31: -> $expr
            {
                adaptor.addChild(root_0, stream_expr.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:5: ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==OP_CONCAT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:6: ( OP_CONCAT expr+= control_expression )+
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:6: ( OP_CONCAT expr+= control_expression )+
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
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:7: OP_CONCAT expr+= control_expression
                    	    {
                    	    OP_CONCAT108=(Token)match(input,OP_CONCAT,FOLLOW_OP_CONCAT_in_concatence_expression1274);  
                    	    stream_OP_CONCAT.add(OP_CONCAT108);

                    	    pushFollow(FOLLOW_control_expression_in_concatence_expression1278);
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
                    // 189:44: -> ^( OP_CONCAT ( $expr)+ )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:47: ^( OP_CONCAT ( $expr)+ )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:192:1: control_expression : ( if_expression | map_expression | context_expression );
    public final OmttParser.control_expression_return control_expression() throws RecognitionException {
        OmttParser.control_expression_return retval = new OmttParser.control_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.if_expression_return if_expression109 = null;

        OmttParser.map_expression_return map_expression110 = null;

        OmttParser.context_expression_return context_expression111 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:193:3: ( if_expression | map_expression | context_expression )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:193:5: if_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_expression_in_control_expression1308);
                    if_expression109=if_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, if_expression109.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:194:5: map_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_expression_in_control_expression1314);
                    map_expression110=map_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, map_expression110.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:195:5: context_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_context_expression_in_control_expression1320);
                    context_expression111=context_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, context_expression111.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:198:1: if_expression : IF condition= context_expression COLON part_if= control_expression ELSE ( COLON )? part_else= control_expression -> ^( IF_ELSE $condition $part_if $part_else) ;
    public final OmttParser.if_expression_return if_expression() throws RecognitionException {
        OmttParser.if_expression_return retval = new OmttParser.if_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF112=null;
        Token COLON113=null;
        Token ELSE114=null;
        Token COLON115=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.control_expression_return part_if = null;

        OmttParser.control_expression_return part_else = null;


        Object IF112_tree=null;
        Object COLON113_tree=null;
        Object ELSE114_tree=null;
        Object COLON115_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_control_expression=new RewriteRuleSubtreeStream(adaptor,"rule control_expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:199:3: ( IF condition= context_expression COLON part_if= control_expression ELSE ( COLON )? part_else= control_expression -> ^( IF_ELSE $condition $part_if $part_else) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:199:5: IF condition= context_expression COLON part_if= control_expression ELSE ( COLON )? part_else= control_expression
            {
            IF112=(Token)match(input,IF,FOLLOW_IF_in_if_expression1333);  
            stream_IF.add(IF112);

            pushFollow(FOLLOW_context_expression_in_if_expression1337);
            condition=context_expression();

            state._fsp--;

            stream_context_expression.add(condition.getTree());
            COLON113=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1339);  
            stream_COLON.add(COLON113);

            pushFollow(FOLLOW_control_expression_in_if_expression1347);
            part_if=control_expression();

            state._fsp--;

            stream_control_expression.add(part_if.getTree());
            ELSE114=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_expression1353);  
            stream_ELSE.add(ELSE114);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:201:10: ( COLON )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==COLON) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:201:10: COLON
                    {
                    COLON115=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1355);  
                    stream_COLON.add(COLON115);


                    }
                    break;

            }

            pushFollow(FOLLOW_control_expression_in_if_expression1364);
            part_else=control_expression();

            state._fsp--;

            stream_control_expression.add(part_else.getTree());


            // AST REWRITE
            // elements: condition, part_else, part_if
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
            // 203:5: -> ^( IF_ELSE $condition $part_if $part_else)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:203:8: ^( IF_ELSE $condition $part_if $part_else)
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:205:1: if_tag : TAG_START if_subtag TAG_END ;
    public final OmttParser.if_tag_return if_tag() throws RecognitionException {
        OmttParser.if_tag_return retval = new OmttParser.if_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START116=null;
        Token TAG_END118=null;
        OmttParser.if_subtag_return if_subtag117 = null;


        Object TAG_START116_tree=null;
        Object TAG_END118_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:206:3: ( TAG_START if_subtag TAG_END )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:206:5: TAG_START if_subtag TAG_END
            {
            root_0 = (Object)adaptor.nil();

            TAG_START116=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_tag1398); 
            pushFollow(FOLLOW_if_subtag_in_if_tag1404);
            if_subtag117=if_subtag();

            state._fsp--;

            adaptor.addChild(root_0, if_subtag117.getTree());
            TAG_END118=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_if_tag1410); 

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:210:10: fragment if_subtag : ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )? -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? ) ;
    public final OmttParser.if_subtag_return if_subtag() throws RecognitionException {
        OmttParser.if_subtag_return retval = new OmttParser.if_subtag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF119=null;
        Token TAG_START120=null;
        Token ELSE121=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.tag_content_return part_if = null;

        OmttParser.tag_content_return part_else = null;

        OmttParser.if_subtag_return subtag = null;


        Object IF119_tree=null;
        Object TAG_START120_tree=null;
        Object ELSE121_tree=null;
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_if_subtag=new RewriteRuleSubtreeStream(adaptor,"rule if_subtag");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:211:2: ( ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )? -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:211:4: ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:211:4: ( IF condition= context_expression part_if= tag_content )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:211:6: IF condition= context_expression part_if= tag_content
            {
            IF119=(Token)match(input,IF,FOLLOW_IF_in_if_subtag1426);  
            stream_IF.add(IF119);

            pushFollow(FOLLOW_context_expression_in_if_subtag1430);
            condition=context_expression();

            state._fsp--;

            stream_context_expression.add(condition.getTree());
            pushFollow(FOLLOW_tag_content_in_if_subtag1438);
            part_if=tag_content();

            state._fsp--;

            stream_tag_content.add(part_if.getTree());

            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:3: ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==TAG_START) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:5: TAG_START ELSE (part_else= tag_content | subtag= if_subtag )
                    {
                    TAG_START120=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_subtag1448);  
                    stream_TAG_START.add(TAG_START120);

                    ELSE121=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_subtag1450);  
                    stream_ELSE.add(ELSE121);

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:215:4: (part_else= tag_content | subtag= if_subtag )
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
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:215:5: part_else= tag_content
                            {
                            pushFollow(FOLLOW_tag_content_in_if_subtag1458);
                            part_else=tag_content();

                            state._fsp--;

                            stream_tag_content.add(part_else.getTree());

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:215:29: subtag= if_subtag
                            {
                            pushFollow(FOLLOW_if_subtag_in_if_subtag1464);
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
            // elements: part_else, condition, subtag, part_if
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
            // 217:3: -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:217:6: ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new IfElse(IF_ELSE), root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());
                adaptor.addChild(root_1, stream_part_if.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:217:44: ( $part_else)?
                if ( stream_part_else.hasNext() ) {
                    adaptor.addChild(root_1, stream_part_else.nextTree());

                }
                stream_part_else.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:217:56: ( $subtag)?
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:220:1: map_expression : MAP iter= context_expression COLON expr= control_expression -> ^( MAP $iter $expr) ;
    public final OmttParser.map_expression_return map_expression() throws RecognitionException {
        OmttParser.map_expression_return retval = new OmttParser.map_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MAP122=null;
        Token COLON123=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.control_expression_return expr = null;


        Object MAP122_tree=null;
        Object COLON123_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_control_expression=new RewriteRuleSubtreeStream(adaptor,"rule control_expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:221:3: ( MAP iter= context_expression COLON expr= control_expression -> ^( MAP $iter $expr) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:221:5: MAP iter= context_expression COLON expr= control_expression
            {
            MAP122=(Token)match(input,MAP,FOLLOW_MAP_in_map_expression1507);  
            stream_MAP.add(MAP122);

            pushFollow(FOLLOW_context_expression_in_map_expression1511);
            iter=context_expression();

            state._fsp--;

            stream_context_expression.add(iter.getTree());
            COLON123=(Token)match(input,COLON,FOLLOW_COLON_in_map_expression1513);  
            stream_COLON.add(COLON123);

            pushFollow(FOLLOW_control_expression_in_map_expression1521);
            expr=control_expression();

            state._fsp--;

            stream_control_expression.add(expr.getTree());


            // AST REWRITE
            // elements: MAP, iter, expr
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
            // 223:5: -> ^( MAP $iter $expr)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:223:8: ^( MAP $iter $expr)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_MAP.nextToken()), root_1);

                adaptor.addChild(root_1, stream_iter.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:225:1: map_tag : TAG_START MAP iter= context_expression expr= tag_content TAG_END -> ^( MAP $iter $expr) ;
    public final OmttParser.map_tag_return map_tag() throws RecognitionException {
        OmttParser.map_tag_return retval = new OmttParser.map_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START124=null;
        Token MAP125=null;
        Token TAG_END126=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.tag_content_return expr = null;


        Object TAG_START124_tree=null;
        Object MAP125_tree=null;
        Object TAG_END126_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:226:3: ( TAG_START MAP iter= context_expression expr= tag_content TAG_END -> ^( MAP $iter $expr) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:226:5: TAG_START MAP iter= context_expression expr= tag_content TAG_END
            {
            TAG_START124=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_map_tag1552);  
            stream_TAG_START.add(TAG_START124);

            MAP125=(Token)match(input,MAP,FOLLOW_MAP_in_map_tag1554);  
            stream_MAP.add(MAP125);

            pushFollow(FOLLOW_context_expression_in_map_tag1558);
            iter=context_expression();

            state._fsp--;

            stream_context_expression.add(iter.getTree());
            pushFollow(FOLLOW_tag_content_in_map_tag1566);
            expr=tag_content();

            state._fsp--;

            stream_tag_content.add(expr.getTree());
            TAG_END126=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_map_tag1572);  
            stream_TAG_END.add(TAG_END126);



            // AST REWRITE
            // elements: expr, iter, MAP
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
            // 229:5: -> ^( MAP $iter $expr)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:229:8: ^( MAP $iter $expr)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_MAP.nextToken()), root_1);

                adaptor.addChild(root_1, stream_iter.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());

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

    public static class context_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "context_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:233:1: context_expression : (fe= boolean_expression -> $fe) ( OP_CONTEXT atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | OP_CONTEXT lambda_expression_no_context -> ^( CALL[true] lambda_expression_no_context ^( ARGUMENT $context_expression) ) | OP_EXPRESSION_CONTEXT ce= functional_expression -> ^( OP_EXPRESSION_CONTEXT $context_expression $ce) )* ;
    public final OmttParser.context_expression_return context_expression() throws RecognitionException {
        OmttParser.context_expression_return retval = new OmttParser.context_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_CONTEXT127=null;
        Token OP_CONTEXT129=null;
        Token OP_EXPRESSION_CONTEXT131=null;
        OmttParser.boolean_expression_return fe = null;

        OmttParser.function_arguments_return arguments = null;

        OmttParser.functional_expression_return ce = null;

        OmttParser.atom_expression_return atom_expression128 = null;

        OmttParser.lambda_expression_no_context_return lambda_expression_no_context130 = null;


        Object OP_CONTEXT127_tree=null;
        Object OP_CONTEXT129_tree=null;
        Object OP_EXPRESSION_CONTEXT131_tree=null;
        RewriteRuleTokenStream stream_OP_CONTEXT=new RewriteRuleTokenStream(adaptor,"token OP_CONTEXT");
        RewriteRuleTokenStream stream_OP_EXPRESSION_CONTEXT=new RewriteRuleTokenStream(adaptor,"token OP_EXPRESSION_CONTEXT");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_lambda_expression_no_context=new RewriteRuleSubtreeStream(adaptor,"rule lambda_expression_no_context");
        RewriteRuleSubtreeStream stream_functional_expression=new RewriteRuleSubtreeStream(adaptor,"rule functional_expression");
        RewriteRuleSubtreeStream stream_boolean_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expression");
        RewriteRuleSubtreeStream stream_function_arguments=new RewriteRuleSubtreeStream(adaptor,"rule function_arguments");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:234:3: ( (fe= boolean_expression -> $fe) ( OP_CONTEXT atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | OP_CONTEXT lambda_expression_no_context -> ^( CALL[true] lambda_expression_no_context ^( ARGUMENT $context_expression) ) | OP_EXPRESSION_CONTEXT ce= functional_expression -> ^( OP_EXPRESSION_CONTEXT $context_expression $ce) )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:234:5: (fe= boolean_expression -> $fe) ( OP_CONTEXT atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | OP_CONTEXT lambda_expression_no_context -> ^( CALL[true] lambda_expression_no_context ^( ARGUMENT $context_expression) ) | OP_EXPRESSION_CONTEXT ce= functional_expression -> ^( OP_EXPRESSION_CONTEXT $context_expression $ce) )*
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:234:5: (fe= boolean_expression -> $fe)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:234:6: fe= boolean_expression
            {
            pushFollow(FOLLOW_boolean_expression_in_context_expression1608);
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
            // 234:28: -> $fe
            {
                adaptor.addChild(root_0, stream_fe.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:235:5: ( OP_CONTEXT atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | OP_CONTEXT lambda_expression_no_context -> ^( CALL[true] lambda_expression_no_context ^( ARGUMENT $context_expression) ) | OP_EXPRESSION_CONTEXT ce= functional_expression -> ^( OP_EXPRESSION_CONTEXT $context_expression $ce) )*
            loop41:
            do {
                int alt41=4;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:235:7: OP_CONTEXT atom_expression arguments= function_arguments
            	    {
            	    OP_CONTEXT127=(Token)match(input,OP_CONTEXT,FOLLOW_OP_CONTEXT_in_context_expression1622);  
            	    stream_OP_CONTEXT.add(OP_CONTEXT127);

            	    pushFollow(FOLLOW_atom_expression_in_context_expression1624);
            	    atom_expression128=atom_expression();

            	    state._fsp--;

            	    stream_atom_expression.add(atom_expression128.getTree());
            	    pushFollow(FOLLOW_function_arguments_in_context_expression1628);
            	    arguments=function_arguments();

            	    state._fsp--;

            	    stream_function_arguments.add(arguments.getTree());


            	    // AST REWRITE
            	    // elements: arguments, context_expression, atom_expression
            	    // token labels: 
            	    // rule labels: retval, arguments
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments",arguments!=null?arguments.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 236:7: -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? )
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:236:10: ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

            	        adaptor.addChild(root_1, stream_atom_expression.nextTree());
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:236:45: ^( ARGUMENT $context_expression)
            	        {
            	        Object root_2 = (Object)adaptor.nil();
            	        root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:236:95: ( $arguments)?
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
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:237:7: OP_CONTEXT lambda_expression_no_context
            	    {
            	    OP_CONTEXT129=(Token)match(input,OP_CONTEXT,FOLLOW_OP_CONTEXT_in_context_expression1668);  
            	    stream_OP_CONTEXT.add(OP_CONTEXT129);

            	    pushFollow(FOLLOW_lambda_expression_no_context_in_context_expression1670);
            	    lambda_expression_no_context130=lambda_expression_no_context();

            	    state._fsp--;

            	    stream_lambda_expression_no_context.add(lambda_expression_no_context130.getTree());


            	    // AST REWRITE
            	    // elements: context_expression, lambda_expression_no_context
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 238:7: -> ^( CALL[true] lambda_expression_no_context ^( ARGUMENT $context_expression) )
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:238:10: ^( CALL[true] lambda_expression_no_context ^( ARGUMENT $context_expression) )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

            	        adaptor.addChild(root_1, stream_lambda_expression_no_context.nextTree());
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:238:58: ^( ARGUMENT $context_expression)
            	        {
            	        Object root_2 = (Object)adaptor.nil();
            	        root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 3 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:239:7: OP_EXPRESSION_CONTEXT ce= functional_expression
            	    {
            	    OP_EXPRESSION_CONTEXT131=(Token)match(input,OP_EXPRESSION_CONTEXT,FOLLOW_OP_EXPRESSION_CONTEXT_in_context_expression1706);  
            	    stream_OP_EXPRESSION_CONTEXT.add(OP_EXPRESSION_CONTEXT131);

            	    pushFollow(FOLLOW_functional_expression_in_context_expression1710);
            	    ce=functional_expression();

            	    state._fsp--;

            	    stream_functional_expression.add(ce.getTree());


            	    // AST REWRITE
            	    // elements: ce, context_expression, OP_EXPRESSION_CONTEXT
            	    // token labels: 
            	    // rule labels: retval, ce
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_ce=new RewriteRuleSubtreeStream(adaptor,"rule ce",ce!=null?ce.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 240:6: -> ^( OP_EXPRESSION_CONTEXT $context_expression $ce)
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:240:9: ^( OP_EXPRESSION_CONTEXT $context_expression $ce)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_OP_EXPRESSION_CONTEXT.nextToken()), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_ce.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop41;
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

    public static class boolean_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:246:1: boolean_expression : boolean_binary_expression ;
    public final OmttParser.boolean_expression_return boolean_expression() throws RecognitionException {
        OmttParser.boolean_expression_return retval = new OmttParser.boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_binary_expression_return boolean_binary_expression132 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:247:2: ( boolean_binary_expression )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:247:4: boolean_binary_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_binary_expression_in_boolean_expression1751);
            boolean_binary_expression132=boolean_binary_expression();

            state._fsp--;

            adaptor.addChild(root_0, boolean_binary_expression132.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:249:10: fragment boolean_binary_expression : boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )* ;
    public final OmttParser.boolean_binary_expression_return boolean_binary_expression() throws RecognitionException {
        OmttParser.boolean_binary_expression_return retval = new OmttParser.boolean_binary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_unary_expression_return boolean_unary_expression133 = null;

        OmttParser.boolean_binary_operator_return boolean_binary_operator134 = null;

        OmttParser.boolean_unary_expression_return boolean_unary_expression135 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:250:3: ( boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:250:5: boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression1764);
            boolean_unary_expression133=boolean_unary_expression();

            state._fsp--;

            adaptor.addChild(root_0, boolean_unary_expression133.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:250:30: ( boolean_binary_operator boolean_unary_expression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=OP_AND && LA42_0<=OP_OR)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:250:31: boolean_binary_operator boolean_unary_expression
            	    {
            	    pushFollow(FOLLOW_boolean_binary_operator_in_boolean_binary_expression1767);
            	    boolean_binary_operator134=boolean_binary_operator();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(boolean_binary_operator134.getTree(), root_0);
            	    pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression1770);
            	    boolean_unary_expression135=boolean_unary_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolean_unary_expression135.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:252:10: fragment boolean_unary_expression : ( boolean_unary_operator boolean_comparsion_expression | boolean_comparsion_expression );
    public final OmttParser.boolean_unary_expression_return boolean_unary_expression() throws RecognitionException {
        OmttParser.boolean_unary_expression_return retval = new OmttParser.boolean_unary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_unary_operator_return boolean_unary_operator136 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression137 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression138 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:253:3: ( boolean_unary_operator boolean_comparsion_expression | boolean_comparsion_expression )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==OP_NOT) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=STRING_LITERAL && LA43_0<=REAL_NUMBER)||LA43_0==DATA_START||LA43_0==NULL||(LA43_0>=TRUE && LA43_0<=FALSE)||(LA43_0>=TILDE && LA43_0<=LEFT_PAREN)||LA43_0==OP_MINUS||LA43_0==OP_GENERAL||LA43_0==VAR_ID) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:253:5: boolean_unary_operator boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_unary_operator_in_boolean_unary_expression1786);
                    boolean_unary_operator136=boolean_unary_operator();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(boolean_unary_operator136.getTree(), root_0);
                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1789);
                    boolean_comparsion_expression137=boolean_comparsion_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_comparsion_expression137.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:254:5: boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1795);
                    boolean_comparsion_expression138=boolean_comparsion_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_comparsion_expression138.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:257:10: fragment boolean_binary_operator : ( OP_AND | OP_OR );
    public final OmttParser.boolean_binary_operator_return boolean_binary_operator() throws RecognitionException {
        OmttParser.boolean_binary_operator_return retval = new OmttParser.boolean_binary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_AND139=null;
        Token OP_OR140=null;

        Object OP_AND139_tree=null;
        Object OP_OR140_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:258:3: ( OP_AND | OP_OR )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==OP_AND) ) {
                alt44=1;
            }
            else if ( (LA44_0==OP_OR) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:258:5: OP_AND
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_AND139=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_boolean_binary_operator1810); 
                    OP_AND139_tree = new BooleanExpression(OP_AND139) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_AND139_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:259:5: OP_OR
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_OR140=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_boolean_binary_operator1820); 
                    OP_OR140_tree = new BooleanExpression(OP_OR140) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_OR140_tree, root_0);


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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:261:10: fragment boolean_unary_operator : OP_NOT ;
    public final OmttParser.boolean_unary_operator_return boolean_unary_operator() throws RecognitionException {
        OmttParser.boolean_unary_operator_return retval = new OmttParser.boolean_unary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_NOT141=null;

        Object OP_NOT141_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:262:3: ( OP_NOT )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:262:5: OP_NOT
            {
            root_0 = (Object)adaptor.nil();

            OP_NOT141=(Token)match(input,OP_NOT,FOLLOW_OP_NOT_in_boolean_unary_operator1838); 
            OP_NOT141_tree = new BooleanExpression(OP_NOT141) ;
            root_0 = (Object)adaptor.becomeRoot(OP_NOT141_tree, root_0);


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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:265:1: boolean_comparsion_expression : additive_expression ( boolean_comparsion_operator additive_expression )* ;
    public final OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression() throws RecognitionException {
        OmttParser.boolean_comparsion_expression_return retval = new OmttParser.boolean_comparsion_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.additive_expression_return additive_expression142 = null;

        OmttParser.boolean_comparsion_operator_return boolean_comparsion_operator143 = null;

        OmttParser.additive_expression_return additive_expression144 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:266:3: ( additive_expression ( boolean_comparsion_operator additive_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:266:5: additive_expression ( boolean_comparsion_operator additive_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression1855);
            additive_expression142=additive_expression();

            state._fsp--;

            adaptor.addChild(root_0, additive_expression142.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:266:25: ( boolean_comparsion_operator additive_expression )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=OP_EQUAL && LA45_0<=OP_GE)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:266:26: boolean_comparsion_operator additive_expression
            	    {
            	    pushFollow(FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression1858);
            	    boolean_comparsion_operator143=boolean_comparsion_operator();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(boolean_comparsion_operator143.getTree(), root_0);
            	    pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression1861);
            	    additive_expression144=additive_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, additive_expression144.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:268:10: fragment boolean_comparsion_operator : ( OP_EQUAL | OP_NOT_EQUAL | OP_LE | OP_LEQ | OP_GE | OP_GEQ );
    public final OmttParser.boolean_comparsion_operator_return boolean_comparsion_operator() throws RecognitionException {
        OmttParser.boolean_comparsion_operator_return retval = new OmttParser.boolean_comparsion_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_EQUAL145=null;
        Token OP_NOT_EQUAL146=null;
        Token OP_LE147=null;
        Token OP_LEQ148=null;
        Token OP_GE149=null;
        Token OP_GEQ150=null;

        Object OP_EQUAL145_tree=null;
        Object OP_NOT_EQUAL146_tree=null;
        Object OP_LE147_tree=null;
        Object OP_LEQ148_tree=null;
        Object OP_GE149_tree=null;
        Object OP_GEQ150_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:269:3: ( OP_EQUAL | OP_NOT_EQUAL | OP_LE | OP_LEQ | OP_GE | OP_GEQ )
            int alt46=6;
            switch ( input.LA(1) ) {
            case OP_EQUAL:
                {
                alt46=1;
                }
                break;
            case OP_NOT_EQUAL:
                {
                alt46=2;
                }
                break;
            case OP_LE:
                {
                alt46=3;
                }
                break;
            case OP_LEQ:
                {
                alt46=4;
                }
                break;
            case OP_GE:
                {
                alt46=5;
                }
                break;
            case OP_GEQ:
                {
                alt46=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:269:5: OP_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_EQUAL145=(Token)match(input,OP_EQUAL,FOLLOW_OP_EQUAL_in_boolean_comparsion_operator1877); 
                    OP_EQUAL145_tree = new BooleanExpression(OP_EQUAL145) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_EQUAL145_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:270:5: OP_NOT_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_NOT_EQUAL146=(Token)match(input,OP_NOT_EQUAL,FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator1887); 
                    OP_NOT_EQUAL146_tree = new BooleanExpression(OP_NOT_EQUAL146) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_NOT_EQUAL146_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:271:5: OP_LE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LE147=(Token)match(input,OP_LE,FOLLOW_OP_LE_in_boolean_comparsion_operator1897); 
                    OP_LE147_tree = new BooleanExpression(OP_LE147) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LE147_tree, root_0);


                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:272:5: OP_LEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LEQ148=(Token)match(input,OP_LEQ,FOLLOW_OP_LEQ_in_boolean_comparsion_operator1907); 
                    OP_LEQ148_tree = new BooleanExpression(OP_LEQ148) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LEQ148_tree, root_0);


                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:273:5: OP_GE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GE149=(Token)match(input,OP_GE,FOLLOW_OP_GE_in_boolean_comparsion_operator1917); 
                    OP_GE149_tree = new BooleanExpression(OP_GE149) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GE149_tree, root_0);


                    }
                    break;
                case 6 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:274:5: OP_GEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GEQ150=(Token)match(input,OP_GEQ,FOLLOW_OP_GEQ_in_boolean_comparsion_operator1927); 
                    OP_GEQ150_tree = new BooleanExpression(OP_GEQ150) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GEQ150_tree, root_0);


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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:280:1: additive_expression : multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )* ;
    public final OmttParser.additive_expression_return additive_expression() throws RecognitionException {
        OmttParser.additive_expression_return retval = new OmttParser.additive_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_PLUS152=null;
        Token OP_MINUS153=null;
        OmttParser.multiplicative_expression_return multiplicative_expression151 = null;

        OmttParser.multiplicative_expression_return multiplicative_expression154 = null;


        Object OP_PLUS152_tree=null;
        Object OP_MINUS153_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:281:3: ( multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:281:5: multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1947);
            multiplicative_expression151=multiplicative_expression();

            state._fsp--;

            adaptor.addChild(root_0, multiplicative_expression151.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:282:5: ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=OP_PLUS && LA48_0<=OP_MINUS)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:283:7: ( OP_PLUS | OP_MINUS ) multiplicative_expression
            	    {
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:283:7: ( OP_PLUS | OP_MINUS )
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==OP_PLUS) ) {
            	        alt47=1;
            	    }
            	    else if ( (LA47_0==OP_MINUS) ) {
            	        alt47=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 47, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:283:9: OP_PLUS
            	            {
            	            OP_PLUS152=(Token)match(input,OP_PLUS,FOLLOW_OP_PLUS_in_additive_expression1963); 
            	            OP_PLUS152_tree = new ArithmeticExpression(OP_PLUS152) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_PLUS152_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:284:9: OP_MINUS
            	            {
            	            OP_MINUS153=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_additive_expression1977); 
            	            OP_MINUS153_tree = new ArithmeticExpression(OP_MINUS153) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MINUS153_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1997);
            	    multiplicative_expression154=multiplicative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicative_expression154.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:290:1: multiplicative_expression : negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )* ;
    public final OmttParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        OmttParser.multiplicative_expression_return retval = new OmttParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MULTIPLY156=null;
        Token SLASH157=null;
        Token OP_MODULO158=null;
        OmttParser.negative_expression_return negative_expression155 = null;

        OmttParser.negative_expression_return negative_expression159 = null;


        Object OP_MULTIPLY156_tree=null;
        Object SLASH157_tree=null;
        Object OP_MODULO158_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:291:3: ( negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:291:5: negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_negative_expression_in_multiplicative_expression2017);
            negative_expression155=negative_expression();

            state._fsp--;

            adaptor.addChild(root_0, negative_expression155.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:292:5: ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==SLASH||(LA50_0>=OP_MULTIPLY && LA50_0<=OP_MODULO)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:292:7: ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression
            	    {
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:292:7: ( OP_MULTIPLY | SLASH | OP_MODULO )
            	    int alt49=3;
            	    switch ( input.LA(1) ) {
            	    case OP_MULTIPLY:
            	        {
            	        alt49=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt49=2;
            	        }
            	        break;
            	    case OP_MODULO:
            	        {
            	        alt49=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 49, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt49) {
            	        case 1 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:292:9: OP_MULTIPLY
            	            {
            	            OP_MULTIPLY156=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_multiplicative_expression2027); 
            	            OP_MULTIPLY156_tree = new ArithmeticExpression(OP_MULTIPLY156) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MULTIPLY156_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:293:9: SLASH
            	            {
            	            SLASH157=(Token)match(input,SLASH,FOLLOW_SLASH_in_multiplicative_expression2041); 
            	            SLASH157_tree = new ArithmeticExpression(SLASH157) ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH157_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:294:9: OP_MODULO
            	            {
            	            OP_MODULO158=(Token)match(input,OP_MODULO,FOLLOW_OP_MODULO_in_multiplicative_expression2055); 
            	            OP_MODULO158_tree = new ArithmeticExpression(OP_MODULO158) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MODULO158_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_negative_expression_in_multiplicative_expression2075);
            	    negative_expression159=negative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, negative_expression159.getTree());

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
    // $ANTLR end "multiplicative_expression"

    public static class negative_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negative_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:300:1: negative_expression : ( OP_MINUS functional_expression -> ^( OP_MINUS functional_expression ) | functional_expression );
    public final OmttParser.negative_expression_return negative_expression() throws RecognitionException {
        OmttParser.negative_expression_return retval = new OmttParser.negative_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MINUS160=null;
        OmttParser.functional_expression_return functional_expression161 = null;

        OmttParser.functional_expression_return functional_expression162 = null;


        Object OP_MINUS160_tree=null;
        RewriteRuleTokenStream stream_OP_MINUS=new RewriteRuleTokenStream(adaptor,"token OP_MINUS");
        RewriteRuleSubtreeStream stream_functional_expression=new RewriteRuleSubtreeStream(adaptor,"rule functional_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:301:2: ( OP_MINUS functional_expression -> ^( OP_MINUS functional_expression ) | functional_expression )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==OP_MINUS) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=STRING_LITERAL && LA51_0<=REAL_NUMBER)||LA51_0==DATA_START||LA51_0==NULL||(LA51_0>=TRUE && LA51_0<=FALSE)||(LA51_0>=TILDE && LA51_0<=LEFT_PAREN)||LA51_0==OP_GENERAL||LA51_0==VAR_ID) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:301:4: OP_MINUS functional_expression
                    {
                    OP_MINUS160=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_negative_expression2094);  
                    stream_OP_MINUS.add(OP_MINUS160);

                    pushFollow(FOLLOW_functional_expression_in_negative_expression2096);
                    functional_expression161=functional_expression();

                    state._fsp--;

                    stream_functional_expression.add(functional_expression161.getTree());


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
                    // 302:3: -> ^( OP_MINUS functional_expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:302:6: ^( OP_MINUS functional_expression )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:303:4: functional_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functional_expression_in_negative_expression2114);
                    functional_expression162=functional_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, functional_expression162.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:308:1: functional_expression : call_expression ;
    public final OmttParser.functional_expression_return functional_expression() throws RecognitionException {
        OmttParser.functional_expression_return retval = new OmttParser.functional_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.call_expression_return call_expression163 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:309:3: ( call_expression )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:309:5: call_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_call_expression_in_functional_expression2128);
            call_expression163=call_expression();

            state._fsp--;

            adaptor.addChild(root_0, call_expression163.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:312:1: call_expression : atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) ) ;
    public final OmttParser.call_expression_return call_expression() throws RecognitionException {
        OmttParser.call_expression_return retval = new OmttParser.call_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.atom_expression_return atom_expression164 = null;

        OmttParser.function_argument_return function_argument165 = null;


        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_function_argument=new RewriteRuleSubtreeStream(adaptor,"rule function_argument");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:313:3: ( atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:313:5: atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            {
            pushFollow(FOLLOW_atom_expression_in_call_expression2141);
            atom_expression164=atom_expression();

            state._fsp--;

            stream_atom_expression.add(atom_expression164.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:314:5: ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=STRING_LITERAL && LA53_0<=REAL_NUMBER)||LA53_0==DATA_START||LA53_0==NULL||(LA53_0>=TRUE && LA53_0<=FALSE)||(LA53_0>=TILDE && LA53_0<=LEFT_PAREN)||LA53_0==OP_GENERAL||LA53_0==VAR_ID) ) {
                alt53=1;
            }
            else if ( ((LA53_0>=CONTENT && LA53_0<=TAG_END)||(LA53_0>=EXPRESSION_END && LA53_0<=OP_DATA_IS_EXPRESSION)||(LA53_0>=AND && LA53_0<=IN)||LA53_0==ELSE||(LA53_0>=COLON && LA53_0<=SEMICOLON)||LA53_0==SLASH||LA53_0==RIGHT_PAREN||(LA53_0>=RIGHT_SQUARE_PAREN && LA53_0<=OP_GE)||(LA53_0>=OP_AND && LA53_0<=OP_OR)||(LA53_0>=OP_CONTEXT && LA53_0<=OP_EXPRESSION_CONTEXT)||LA53_0==OP_CONCAT) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:314:7: ( function_argument )+
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:314:7: ( function_argument )+
                    int cnt52=0;
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( ((LA52_0>=STRING_LITERAL && LA52_0<=REAL_NUMBER)||LA52_0==DATA_START||LA52_0==NULL||(LA52_0>=TRUE && LA52_0<=FALSE)||(LA52_0>=TILDE && LA52_0<=LEFT_PAREN)||LA52_0==OP_GENERAL||LA52_0==VAR_ID) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:314:7: function_argument
                    	    {
                    	    pushFollow(FOLLOW_function_argument_in_call_expression2149);
                    	    function_argument165=function_argument();

                    	    state._fsp--;

                    	    stream_function_argument.add(function_argument165.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt52 >= 1 ) break loop52;
                                EarlyExitException eee =
                                    new EarlyExitException(52, input);
                                throw eee;
                        }
                        cnt52++;
                    } while (true);



                    // AST REWRITE
                    // elements: atom_expression, function_argument
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 315:7: -> ^( CALL[false] atom_expression ( function_argument )+ )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:315:10: ^( CALL[false] atom_expression ( function_argument )+ )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:316:7: 
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
                    // 317:7: -> ^( atom_expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:317:10: ^( atom_expression )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:320:1: call_tag : TAG_START ident= namespace_id function_arguments (content= tag_content )? TAG_END -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( function_arguments )? ) ;
    public final OmttParser.call_tag_return call_tag() throws RecognitionException {
        OmttParser.call_tag_return retval = new OmttParser.call_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START166=null;
        Token TAG_END168=null;
        OmttParser.namespace_id_return ident = null;

        OmttParser.tag_content_return content = null;

        OmttParser.function_arguments_return function_arguments167 = null;


        Object TAG_START166_tree=null;
        Object TAG_END168_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_namespace_id=new RewriteRuleSubtreeStream(adaptor,"rule namespace_id");
        RewriteRuleSubtreeStream stream_function_arguments=new RewriteRuleSubtreeStream(adaptor,"rule function_arguments");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:321:3: ( TAG_START ident= namespace_id function_arguments (content= tag_content )? TAG_END -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( function_arguments )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:321:5: TAG_START ident= namespace_id function_arguments (content= tag_content )? TAG_END
            {
            TAG_START166=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_call_tag2209);  
            stream_TAG_START.add(TAG_START166);

            pushFollow(FOLLOW_namespace_id_in_call_tag2213);
            ident=namespace_id();

            state._fsp--;

            stream_namespace_id.add(ident.getTree());
            pushFollow(FOLLOW_function_arguments_in_call_tag2215);
            function_arguments167=function_arguments();

            state._fsp--;

            stream_function_arguments.add(function_arguments167.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:322:5: (content= tag_content )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==CONTENT||LA54_0==OP_DATA_IS_EXPRESSION) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:322:6: content= tag_content
                    {
                    pushFollow(FOLLOW_tag_content_in_call_tag2224);
                    content=tag_content();

                    state._fsp--;

                    stream_tag_content.add(content.getTree());

                    }
                    break;

            }

            TAG_END168=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_call_tag2232);  
            stream_TAG_END.add(TAG_END168);



            // AST REWRITE
            // elements: ident, content, function_arguments
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
            // 324:5: -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( function_arguments )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:324:8: ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( function_arguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Call(CALL, false), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:324:35: ( ^( ARGUMENT $content) )?
                if ( stream_content.hasNext() ) {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:324:35: ^( ARGUMENT $content)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

                    adaptor.addChild(root_2, stream_content.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_content.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:324:75: ( function_arguments )?
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:326:10: fragment function_arguments : ( function_argument )* ;
    public final OmttParser.function_arguments_return function_arguments() throws RecognitionException {
        OmttParser.function_arguments_return retval = new OmttParser.function_arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.function_argument_return function_argument169 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:327:3: ( ( function_argument )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:327:5: ( function_argument )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:327:5: ( function_argument )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=STRING_LITERAL && LA55_0<=REAL_NUMBER)||LA55_0==DATA_START||LA55_0==NULL||(LA55_0>=TRUE && LA55_0<=FALSE)||(LA55_0>=TILDE && LA55_0<=LEFT_PAREN)||LA55_0==OP_GENERAL||LA55_0==VAR_ID) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:327:5: function_argument
            	    {
            	    pushFollow(FOLLOW_function_argument_in_function_arguments2277);
            	    function_argument169=function_argument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function_argument169.getTree());

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
    // $ANTLR end "function_arguments"

    public static class function_argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_argument"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:329:10: fragment function_argument : ( VAR_ID OP_ASSIGN )? atom_expression -> ^( ARGUMENT atom_expression ( VAR_ID )? ) ;
    public final OmttParser.function_argument_return function_argument() throws RecognitionException {
        OmttParser.function_argument_return retval = new OmttParser.function_argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID170=null;
        Token OP_ASSIGN171=null;
        OmttParser.atom_expression_return atom_expression172 = null;


        Object VAR_ID170_tree=null;
        Object OP_ASSIGN171_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:330:3: ( ( VAR_ID OP_ASSIGN )? atom_expression -> ^( ARGUMENT atom_expression ( VAR_ID )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:330:5: ( VAR_ID OP_ASSIGN )? atom_expression
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:330:5: ( VAR_ID OP_ASSIGN )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==VAR_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==OP_ASSIGN) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:330:6: VAR_ID OP_ASSIGN
                    {
                    VAR_ID170=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_function_argument2293);  
                    stream_VAR_ID.add(VAR_ID170);

                    OP_ASSIGN171=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_function_argument2295);  
                    stream_OP_ASSIGN.add(OP_ASSIGN171);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_expression_in_function_argument2299);
            atom_expression172=atom_expression();

            state._fsp--;

            stream_atom_expression.add(atom_expression172.getTree());


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
            // 331:5: -> ^( ARGUMENT atom_expression ( VAR_ID )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:331:8: ^( ARGUMENT atom_expression ( VAR_ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_1);

                adaptor.addChild(root_1, stream_atom_expression.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:331:53: ( VAR_ID )?
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:336:1: atom_expression : (a= atom_with_properties -> $a) ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )? ;
    public final OmttParser.atom_expression_return atom_expression() throws RecognitionException {
        OmttParser.atom_expression_return retval = new OmttParser.atom_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMA173=null;
        OmttParser.atom_with_properties_return a = null;

        OmttParser.atom_with_properties_return atom_with_properties174 = null;


        Object COMA173_tree=null;
        RewriteRuleTokenStream stream_COMA=new RewriteRuleTokenStream(adaptor,"token COMA");
        RewriteRuleSubtreeStream stream_atom_with_properties=new RewriteRuleSubtreeStream(adaptor,"rule atom_with_properties");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:337:2: ( (a= atom_with_properties -> $a) ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:337:4: (a= atom_with_properties -> $a) ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:337:4: (a= atom_with_properties -> $a)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:337:5: a= atom_with_properties
            {
            pushFollow(FOLLOW_atom_with_properties_in_atom_expression2334);
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
            // 337:28: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:338:4: ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==COMA) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:338:5: ( COMA atom_with_properties )+
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:338:5: ( COMA atom_with_properties )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==COMA) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:338:6: COMA atom_with_properties
                    	    {
                    	    COMA173=(Token)match(input,COMA,FOLLOW_COMA_in_atom_expression2347);  
                    	    stream_COMA.add(COMA173);

                    	    pushFollow(FOLLOW_atom_with_properties_in_atom_expression2349);
                    	    atom_with_properties174=atom_with_properties();

                    	    state._fsp--;

                    	    stream_atom_with_properties.add(atom_with_properties174.getTree());

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
                    // elements: atom_with_properties
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 338:34: -> ^( SEQUENCE ( atom_with_properties )+ )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:338:37: ^( SEQUENCE ( atom_with_properties )+ )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:341:1: atom_with_properties : (a= atom_with_selectors -> $a) (ps= property_selector -> ^( PROPERTY_SELECT $atom_with_properties $ps) )* ;
    public final OmttParser.atom_with_properties_return atom_with_properties() throws RecognitionException {
        OmttParser.atom_with_properties_return retval = new OmttParser.atom_with_properties_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.atom_with_selectors_return a = null;

        OmttParser.property_selector_return ps = null;


        RewriteRuleSubtreeStream stream_atom_with_selectors=new RewriteRuleSubtreeStream(adaptor,"rule atom_with_selectors");
        RewriteRuleSubtreeStream stream_property_selector=new RewriteRuleSubtreeStream(adaptor,"rule property_selector");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:342:3: ( (a= atom_with_selectors -> $a) (ps= property_selector -> ^( PROPERTY_SELECT $atom_with_properties $ps) )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:342:5: (a= atom_with_selectors -> $a) (ps= property_selector -> ^( PROPERTY_SELECT $atom_with_properties $ps) )*
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:342:5: (a= atom_with_selectors -> $a)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:342:6: a= atom_with_selectors
            {
            pushFollow(FOLLOW_atom_with_selectors_in_atom_with_properties2381);
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
            // 342:28: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:343:4: (ps= property_selector -> ^( PROPERTY_SELECT $atom_with_properties $ps) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==DOT) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:343:6: ps= property_selector
            	    {
            	    pushFollow(FOLLOW_property_selector_in_atom_with_properties2396);
            	    ps=property_selector();

            	    state._fsp--;

            	    stream_property_selector.add(ps.getTree());


            	    // AST REWRITE
            	    // elements: atom_with_properties, ps
            	    // token labels: 
            	    // rule labels: retval, ps
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_ps=new RewriteRuleSubtreeStream(adaptor,"rule ps",ps!=null?ps.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 344:6: -> ^( PROPERTY_SELECT $atom_with_properties $ps)
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:344:9: ^( PROPERTY_SELECT $atom_with_properties $ps)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new PropertySelect(PROPERTY_SELECT), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_ps.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop59;
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:347:10: fragment atom_with_selectors : atom ( sequence_selectors -> ^( ATOM_SELECT atom ( sequence_selectors )? ) | -> atom ) ;
    public final OmttParser.atom_with_selectors_return atom_with_selectors() throws RecognitionException {
        OmttParser.atom_with_selectors_return retval = new OmttParser.atom_with_selectors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.atom_return atom175 = null;

        OmttParser.sequence_selectors_return sequence_selectors176 = null;


        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_sequence_selectors=new RewriteRuleSubtreeStream(adaptor,"rule sequence_selectors");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:348:2: ( atom ( sequence_selectors -> ^( ATOM_SELECT atom ( sequence_selectors )? ) | -> atom ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:348:4: atom ( sequence_selectors -> ^( ATOM_SELECT atom ( sequence_selectors )? ) | -> atom )
            {
            pushFollow(FOLLOW_atom_in_atom_with_selectors2435);
            atom175=atom();

            state._fsp--;

            stream_atom.add(atom175.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:349:3: ( sequence_selectors -> ^( ATOM_SELECT atom ( sequence_selectors )? ) | -> atom )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==AS||LA60_0==LEFT_SQUARE_PAREN) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=STRING_LITERAL && LA60_0<=DATA_START)||(LA60_0>=EXPRESSION_END && LA60_0<=OP_DATA_IS_EXPRESSION)||(LA60_0>=AND && LA60_0<=IN)||LA60_0==ELSE||LA60_0==NULL||(LA60_0>=TRUE && LA60_0<=FALSE)||(LA60_0>=COLON && LA60_0<=DOT)||(LA60_0>=COMA && LA60_0<=RIGHT_PAREN)||(LA60_0>=RIGHT_SQUARE_PAREN && LA60_0<=OP_GE)||(LA60_0>=OP_AND && LA60_0<=OP_OR)||(LA60_0>=OP_CONTEXT && LA60_0<=OP_EXPRESSION_CONTEXT)||(LA60_0>=OP_CONCAT && LA60_0<=OP_GENERAL)||LA60_0==VAR_ID) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:349:5: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_atom_with_selectors2441);
                    sequence_selectors176=sequence_selectors();

                    state._fsp--;

                    stream_sequence_selectors.add(sequence_selectors176.getTree());


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
                    // 350:4: -> ^( ATOM_SELECT atom ( sequence_selectors )? )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:350:7: ^( ATOM_SELECT atom ( sequence_selectors )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new AtomSelect(ATOM_SELECT), root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:350:38: ( sequence_selectors )?
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:351:5: 
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
                    // 351:5: -> atom
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:354:10: fragment property_selector : DOT VAR_ID ( sequence_selectors )? ;
    public final OmttParser.property_selector_return property_selector() throws RecognitionException {
        OmttParser.property_selector_return retval = new OmttParser.property_selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT177=null;
        Token VAR_ID178=null;
        OmttParser.sequence_selectors_return sequence_selectors179 = null;


        Object DOT177_tree=null;
        Object VAR_ID178_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:355:3: ( DOT VAR_ID ( sequence_selectors )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:355:5: DOT VAR_ID ( sequence_selectors )?
            {
            root_0 = (Object)adaptor.nil();

            DOT177=(Token)match(input,DOT,FOLLOW_DOT_in_property_selector2483); 
            VAR_ID178=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_property_selector2486); 
            VAR_ID178_tree = (Object)adaptor.create(VAR_ID178);
            adaptor.addChild(root_0, VAR_ID178_tree);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:355:17: ( sequence_selectors )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==AS||LA61_0==LEFT_SQUARE_PAREN) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:355:17: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_property_selector2488);
                    sequence_selectors179=sequence_selectors();

                    state._fsp--;

                    adaptor.addChild(root_0, sequence_selectors179.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:357:10: fragment sequence_selectors : ( type_selector ( sequence_selector )? ( alias )? | sequence_selector ( alias )? | alias );
    public final OmttParser.sequence_selectors_return sequence_selectors() throws RecognitionException {
        OmttParser.sequence_selectors_return retval = new OmttParser.sequence_selectors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.type_selector_return type_selector180 = null;

        OmttParser.sequence_selector_return sequence_selector181 = null;

        OmttParser.alias_return alias182 = null;

        OmttParser.sequence_selector_return sequence_selector183 = null;

        OmttParser.alias_return alias184 = null;

        OmttParser.alias_return alias185 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:2: ( type_selector ( sequence_selector )? ( alias )? | sequence_selector ( alias )? | alias )
            int alt65=3;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LEFT_SQUARE_PAREN) ) {
                int LA65_1 = input.LA(2);

                if ( ((LA65_1>=STRING_LITERAL && LA65_1<=REAL_NUMBER)||LA65_1==DATA_START||LA65_1==NULL||(LA65_1>=TRUE && LA65_1<=FALSE)||(LA65_1>=TILDE && LA65_1<=LEFT_PAREN)||LA65_1==OP_MINUS||LA65_1==OP_NOT||LA65_1==OP_GENERAL||LA65_1==VAR_ID) ) {
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
            else if ( (LA65_0==AS) ) {
                alt65=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:4: type_selector ( sequence_selector )? ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_selector_in_sequence_selectors2502);
                    type_selector180=type_selector();

                    state._fsp--;

                    adaptor.addChild(root_0, type_selector180.getTree());
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:18: ( sequence_selector )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==LEFT_SQUARE_PAREN) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:18: sequence_selector
                            {
                            pushFollow(FOLLOW_sequence_selector_in_sequence_selectors2504);
                            sequence_selector181=sequence_selector();

                            state._fsp--;

                            adaptor.addChild(root_0, sequence_selector181.getTree());

                            }
                            break;

                    }

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:37: ( alias )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==AS) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:37: alias
                            {
                            pushFollow(FOLLOW_alias_in_sequence_selectors2507);
                            alias182=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias182.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:359:4: sequence_selector ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_sequence_selector_in_sequence_selectors2513);
                    sequence_selector183=sequence_selector();

                    state._fsp--;

                    adaptor.addChild(root_0, sequence_selector183.getTree());
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:359:22: ( alias )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==AS) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:359:22: alias
                            {
                            pushFollow(FOLLOW_alias_in_sequence_selectors2515);
                            alias184=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias184.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:360:4: alias
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alias_in_sequence_selectors2521);
                    alias185=alias();

                    state._fsp--;

                    adaptor.addChild(root_0, alias185.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:362:10: fragment type_selector : LEFT_SQUARE_PAREN type RIGHT_SQUARE_PAREN -> ^( TYPE_SELECT type ) ;
    public final OmttParser.type_selector_return type_selector() throws RecognitionException {
        OmttParser.type_selector_return retval = new OmttParser.type_selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE_PAREN186=null;
        Token RIGHT_SQUARE_PAREN188=null;
        OmttParser.type_return type187 = null;


        Object LEFT_SQUARE_PAREN186_tree=null;
        Object RIGHT_SQUARE_PAREN188_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:363:3: ( LEFT_SQUARE_PAREN type RIGHT_SQUARE_PAREN -> ^( TYPE_SELECT type ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:363:5: LEFT_SQUARE_PAREN type RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN186=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_type_selector2534);  
            stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN186);

            pushFollow(FOLLOW_type_in_type_selector2536);
            type187=type();

            state._fsp--;

            stream_type.add(type187.getTree());
            RIGHT_SQUARE_PAREN188=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_type_selector2538);  
            stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN188);



            // AST REWRITE
            // elements: type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 364:4: -> ^( TYPE_SELECT type )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:364:7: ^( TYPE_SELECT type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_SELECT, "TYPE_SELECT"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:366:10: fragment sequence_selector : LEFT_SQUARE_PAREN boolean_expression RIGHT_SQUARE_PAREN -> ^( SEQUENCE_SELECT boolean_expression ) ;
    public final OmttParser.sequence_selector_return sequence_selector() throws RecognitionException {
        OmttParser.sequence_selector_return retval = new OmttParser.sequence_selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE_PAREN189=null;
        Token RIGHT_SQUARE_PAREN191=null;
        OmttParser.boolean_expression_return boolean_expression190 = null;


        Object LEFT_SQUARE_PAREN189_tree=null;
        Object RIGHT_SQUARE_PAREN191_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_boolean_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:367:3: ( LEFT_SQUARE_PAREN boolean_expression RIGHT_SQUARE_PAREN -> ^( SEQUENCE_SELECT boolean_expression ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:367:5: LEFT_SQUARE_PAREN boolean_expression RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN189=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector2563);  
            stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN189);

            pushFollow(FOLLOW_boolean_expression_in_sequence_selector2565);
            boolean_expression190=boolean_expression();

            state._fsp--;

            stream_boolean_expression.add(boolean_expression190.getTree());
            RIGHT_SQUARE_PAREN191=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector2567);  
            stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN191);



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
            // 368:4: -> ^( SEQUENCE_SELECT boolean_expression )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:368:7: ^( SEQUENCE_SELECT boolean_expression )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:370:10: fragment alias : AS VAR_ID -> ^( AS VAR_ID ) ;
    public final OmttParser.alias_return alias() throws RecognitionException {
        OmttParser.alias_return retval = new OmttParser.alias_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AS192=null;
        Token VAR_ID193=null;

        Object AS192_tree=null;
        Object VAR_ID193_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:371:2: ( AS VAR_ID -> ^( AS VAR_ID ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:371:4: AS VAR_ID
            {
            AS192=(Token)match(input,AS,FOLLOW_AS_in_alias2591);  
            stream_AS.add(AS192);

            VAR_ID193=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_alias2593);  
            stream_VAR_ID.add(VAR_ID193);



            // AST REWRITE
            // elements: AS, VAR_ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 372:3: -> ^( AS VAR_ID )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:372:6: ^( AS VAR_ID )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:375:1: data_expression : DATA_START ( data_body_atom )* DATA_END -> ^( DATA_START ( data_body_atom )* ) ;
    public final OmttParser.data_expression_return data_expression() throws RecognitionException {
        OmttParser.data_expression_return retval = new OmttParser.data_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DATA_START194=null;
        Token DATA_END196=null;
        OmttParser.data_body_atom_return data_body_atom195 = null;


        Object DATA_START194_tree=null;
        Object DATA_END196_tree=null;
        RewriteRuleTokenStream stream_DATA_END=new RewriteRuleTokenStream(adaptor,"token DATA_END");
        RewriteRuleTokenStream stream_DATA_START=new RewriteRuleTokenStream(adaptor,"token DATA_START");
        RewriteRuleSubtreeStream stream_data_body_atom=new RewriteRuleSubtreeStream(adaptor,"rule data_body_atom");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:376:3: ( DATA_START ( data_body_atom )* DATA_END -> ^( DATA_START ( data_body_atom )* ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:376:5: DATA_START ( data_body_atom )* DATA_END
            {
            DATA_START194=(Token)match(input,DATA_START,FOLLOW_DATA_START_in_data_expression2615);  
            stream_DATA_START.add(DATA_START194);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:376:16: ( data_body_atom )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==STRING_LITERAL||LA66_0==TAG_START||LA66_0==EXPRESSION_START) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:376:16: data_body_atom
            	    {
            	    pushFollow(FOLLOW_data_body_atom_in_data_expression2617);
            	    data_body_atom195=data_body_atom();

            	    state._fsp--;

            	    stream_data_body_atom.add(data_body_atom195.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            DATA_END196=(Token)match(input,DATA_END,FOLLOW_DATA_END_in_data_expression2620);  
            stream_DATA_END.add(DATA_END196);



            // AST REWRITE
            // elements: DATA_START, data_body_atom
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 377:5: -> ^( DATA_START ( data_body_atom )* )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:377:8: ^( DATA_START ( data_body_atom )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Data(stream_DATA_START.nextToken()), root_1);

                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:377:27: ( data_body_atom )*
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:380:1: atom : selectable_atom ( DOUBLE_DOT selectable_atom )? ;
    public final OmttParser.atom_return atom() throws RecognitionException {
        OmttParser.atom_return retval = new OmttParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_DOT198=null;
        OmttParser.selectable_atom_return selectable_atom197 = null;

        OmttParser.selectable_atom_return selectable_atom199 = null;


        Object DOUBLE_DOT198_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:381:2: ( selectable_atom ( DOUBLE_DOT selectable_atom )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:381:4: selectable_atom ( DOUBLE_DOT selectable_atom )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_selectable_atom_in_atom2648);
            selectable_atom197=selectable_atom();

            state._fsp--;

            adaptor.addChild(root_0, selectable_atom197.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:382:3: ( DOUBLE_DOT selectable_atom )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==DOUBLE_DOT) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:382:4: DOUBLE_DOT selectable_atom
                    {
                    DOUBLE_DOT198=(Token)match(input,DOUBLE_DOT,FOLLOW_DOUBLE_DOT_in_atom2653); 
                    DOUBLE_DOT198_tree = new Range(DOUBLE_DOT198) ;
                    root_0 = (Object)adaptor.becomeRoot(DOUBLE_DOT198_tree, root_0);

                    pushFollow(FOLLOW_selectable_atom_in_atom2659);
                    selectable_atom199=selectable_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, selectable_atom199.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:385:1: selectable_atom : ( object_atom | data_expression | namespace_id | LEFT_PAREN expression RIGHT_PAREN );
    public final OmttParser.selectable_atom_return selectable_atom() throws RecognitionException {
        OmttParser.selectable_atom_return retval = new OmttParser.selectable_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN203=null;
        Token RIGHT_PAREN205=null;
        OmttParser.object_atom_return object_atom200 = null;

        OmttParser.data_expression_return data_expression201 = null;

        OmttParser.namespace_id_return namespace_id202 = null;

        OmttParser.expression_return expression204 = null;


        Object LEFT_PAREN203_tree=null;
        Object RIGHT_PAREN205_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:386:3: ( object_atom | data_expression | namespace_id | LEFT_PAREN expression RIGHT_PAREN )
            int alt68=4;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
            case INT_NUMBER:
            case REAL_NUMBER:
            case NULL:
            case TRUE:
            case FALSE:
            case TILDE:
                {
                alt68=1;
                }
                break;
            case DATA_START:
                {
                alt68=2;
                }
                break;
            case OP_GENERAL:
            case VAR_ID:
                {
                alt68=3;
                }
                break;
            case LEFT_PAREN:
                {
                alt68=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:386:5: object_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_object_atom_in_selectable_atom2673);
                    object_atom200=object_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, object_atom200.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:387:5: data_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_data_expression_in_selectable_atom2679);
                    data_expression201=data_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, data_expression201.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:388:5: namespace_id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespace_id_in_selectable_atom2685);
                    namespace_id202=namespace_id();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace_id202.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:389:5: LEFT_PAREN expression RIGHT_PAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LEFT_PAREN203=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_selectable_atom2691); 
                    pushFollow(FOLLOW_expression_in_selectable_atom2694);
                    expression204=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression204.getTree());
                    RIGHT_PAREN205=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_selectable_atom2696); 

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:391:10: fragment namespace_id : ( (ns= VAR_ID OP_VIEW )? id= VAR_ID -> ^( IDENT[$id] ( $ns)? ) | id= OP_GENERAL -> ^( IDENT[$id] ) );
    public final OmttParser.namespace_id_return namespace_id() throws RecognitionException {
        OmttParser.namespace_id_return retval = new OmttParser.namespace_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ns=null;
        Token id=null;
        Token OP_VIEW206=null;

        Object ns_tree=null;
        Object id_tree=null;
        Object OP_VIEW206_tree=null;
        RewriteRuleTokenStream stream_OP_GENERAL=new RewriteRuleTokenStream(adaptor,"token OP_GENERAL");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_VIEW=new RewriteRuleTokenStream(adaptor,"token OP_VIEW");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:392:3: ( (ns= VAR_ID OP_VIEW )? id= VAR_ID -> ^( IDENT[$id] ( $ns)? ) | id= OP_GENERAL -> ^( IDENT[$id] ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==VAR_ID) ) {
                alt70=1;
            }
            else if ( (LA70_0==OP_GENERAL) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:392:5: (ns= VAR_ID OP_VIEW )? id= VAR_ID
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:392:5: (ns= VAR_ID OP_VIEW )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==VAR_ID) ) {
                        int LA69_1 = input.LA(2);

                        if ( (LA69_1==OP_VIEW) ) {
                            alt69=1;
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:392:6: ns= VAR_ID OP_VIEW
                            {
                            ns=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id2714);  
                            stream_VAR_ID.add(ns);

                            OP_VIEW206=(Token)match(input,OP_VIEW,FOLLOW_OP_VIEW_in_namespace_id2716);  
                            stream_OP_VIEW.add(OP_VIEW206);


                            }
                            break;

                    }

                    id=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id2722);  
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
                    // 393:5: -> ^( IDENT[$id] ( $ns)? )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:393:8: ^( IDENT[$id] ( $ns)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Ident(IDENT, id), root_1);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:393:28: ( $ns)?
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:394:5: id= OP_GENERAL
                    {
                    id=(Token)match(input,OP_GENERAL,FOLLOW_OP_GENERAL_in_namespace_id2748);  
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
                    // 395:4: -> ^( IDENT[$id] )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:395:7: ^( IDENT[$id] )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:399:1: object_atom : ( number_atom | STRING_LITERAL | ( NULL | TILDE ) | ( TRUE | FALSE ) );
    public final OmttParser.object_atom_return object_atom() throws RecognitionException {
        OmttParser.object_atom_return retval = new OmttParser.object_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING_LITERAL208=null;
        Token NULL209=null;
        Token TILDE210=null;
        Token TRUE211=null;
        Token FALSE212=null;
        OmttParser.number_atom_return number_atom207 = null;


        Object STRING_LITERAL208_tree=null;
        Object NULL209_tree=null;
        Object TILDE210_tree=null;
        Object TRUE211_tree=null;
        Object FALSE212_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:400:3: ( number_atom | STRING_LITERAL | ( NULL | TILDE ) | ( TRUE | FALSE ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case INT_NUMBER:
            case REAL_NUMBER:
                {
                alt73=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt73=2;
                }
                break;
            case NULL:
            case TILDE:
                {
                alt73=3;
                }
                break;
            case TRUE:
            case FALSE:
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:400:5: number_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_atom_in_object_atom2775);
                    number_atom207=number_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, number_atom207.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:401:5: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL208=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_object_atom2781); 
                    STRING_LITERAL208_tree = new Literal(STRING_LITERAL208) ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_LITERAL208_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:5: ( NULL | TILDE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:5: ( NULL | TILDE )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==NULL) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==TILDE) ) {
                        alt71=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:6: NULL
                            {
                            NULL209=(Token)match(input,NULL,FOLLOW_NULL_in_object_atom2792); 
                            NULL209_tree = new Literal(NULL209) ;
                            root_0 = (Object)adaptor.becomeRoot(NULL209_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:23: TILDE
                            {
                            TILDE210=(Token)match(input,TILDE,FOLLOW_TILDE_in_object_atom2800); 
                            TILDE210_tree = new Literal(TILDE210) ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE210_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:403:5: ( TRUE | FALSE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:403:5: ( TRUE | FALSE )
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==TRUE) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==FALSE) ) {
                        alt72=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        throw nvae;
                    }
                    switch (alt72) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:403:6: TRUE
                            {
                            TRUE211=(Token)match(input,TRUE,FOLLOW_TRUE_in_object_atom2813); 
                            TRUE211_tree = new Literal(TRUE211) ;
                            root_0 = (Object)adaptor.becomeRoot(TRUE211_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:403:23: FALSE
                            {
                            FALSE212=(Token)match(input,FALSE,FOLLOW_FALSE_in_object_atom2821); 
                            FALSE212_tree = new Literal(FALSE212) ;
                            root_0 = (Object)adaptor.becomeRoot(FALSE212_tree, root_0);


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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:406:1: number_atom : ( INT_NUMBER | REAL_NUMBER );
    public final OmttParser.number_atom_return number_atom() throws RecognitionException {
        OmttParser.number_atom_return retval = new OmttParser.number_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_NUMBER213=null;
        Token REAL_NUMBER214=null;

        Object INT_NUMBER213_tree=null;
        Object REAL_NUMBER214_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:407:3: ( INT_NUMBER | REAL_NUMBER )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==INT_NUMBER) ) {
                alt74=1;
            }
            else if ( (LA74_0==REAL_NUMBER) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:407:5: INT_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    INT_NUMBER213=(Token)match(input,INT_NUMBER,FOLLOW_INT_NUMBER_in_number_atom2839); 
                    INT_NUMBER213_tree = new Literal(INT_NUMBER213) ;
                    root_0 = (Object)adaptor.becomeRoot(INT_NUMBER213_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:408:5: REAL_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    REAL_NUMBER214=(Token)match(input,REAL_NUMBER,FOLLOW_REAL_NUMBER_in_number_atom2849); 
                    REAL_NUMBER214_tree = new Literal(REAL_NUMBER214) ;
                    root_0 = (Object)adaptor.becomeRoot(REAL_NUMBER214_tree, root_0);


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


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA20_eotS =
        "\17\uffff";
    static final String DFA20_eofS =
        "\17\uffff";
    static final String DFA20_minS =
        "\1\31\1\uffff\2\31\2\uffff\11\31";
    static final String DFA20_maxS =
        "\1\146\1\uffff\2\144\2\uffff\3\144\1\146\4\144\1\146";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\11\uffff";
    static final String DFA20_specialS =
        "\17\uffff}>";
    static final String[] DFA20_transitionS = {
            "\3\5\3\uffff\1\5\17\uffff\1\4\2\uffff\1\5\7\uffff\1\5\1\uffff"+
            "\1\5\1\1\2\5\2\uffff\1\1\6\uffff\1\2\1\5\4\uffff\1\5\13\uffff"+
            "\1\5\4\uffff\1\5\3\uffff\1\3\1\uffff\1\1",
            "",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\5\uffff\10\5\1\uffff\12\5\1\uffff\2\5\1\uffff\2\5\1\uffff"+
            "\2\5\3\uffff\1\6",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\2\uffff\1\1\2\uffff\4\5\1\7\3\5\1\uffff\2\5\1\10\7\5\1"+
            "\1\2\5\1\uffff\5\5\3\uffff\1\6",
            "",
            "",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\2\uffff\1\1\2\uffff\4\5\1\7\3\5\1\uffff\2\5\1\10\7\5\1"+
            "\11\2\5\1\uffff\5\5\3\uffff\1\6",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\5\uffff\10\5\1\uffff\12\5\1\uffff\2\5\1\uffff\2\5\1\uffff"+
            "\2\5\3\uffff\1\6",
            "\3\5\3\uffff\1\5\34\uffff\1\5\1\uffff\2\5\2\uffff\1\1\6\uffff"+
            "\1\12\1\5\4\uffff\1\5\20\uffff\1\5\3\uffff\1\13",
            "\3\5\3\uffff\1\5\34\uffff\1\5\1\uffff\2\5\11\uffff\2\5\25\uffff"+
            "\1\5\3\uffff\1\5\1\uffff\1\1",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\5\uffff\10\5\1\uffff\12\5\1\uffff\2\5\1\uffff\2\5\1\uffff"+
            "\2\5\3\uffff\1\14",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\2\uffff\1\1\2\uffff\4\5\1\15\3\5\1\uffff\2\5\1\10\7\5\1"+
            "\1\2\5\1\uffff\5\5\3\uffff\1\14",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\2\uffff\1\1\2\uffff\4\5\1\15\3\5\1\uffff\2\5\1\10\7\5\1"+
            "\16\2\5\1\uffff\5\5\3\uffff\1\14",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\5\uffff\10\5\1\uffff\12\5\1\uffff\2\5\1\uffff\2\5\1\uffff"+
            "\2\5\3\uffff\1\14",
            "\3\5\3\uffff\1\5\34\uffff\1\5\1\uffff\2\5\11\uffff\2\5\25\uffff"+
            "\1\5\3\uffff\1\5\1\uffff\1\1"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "116:1: expression : ( lambda_expression | def_in_expression | concatence_expression );";
        }
    }
    static final String DFA41_eotS =
        "\13\uffff";
    static final String DFA41_eofS =
        "\13\uffff";
    static final String DFA41_minS =
        "\1\34\1\uffff\1\31\2\uffff\2\31\1\uffff\3\31";
    static final String DFA41_maxS =
        "\1\137\1\uffff\1\144\2\uffff\2\144\1\uffff\2\144\1\146";
    static final String DFA41_acceptS =
        "\1\uffff\1\4\1\uffff\1\3\1\2\2\uffff\1\1\3\uffff";
    static final String DFA41_specialS =
        "\13\uffff}>";
    static final String[] DFA41_transitionS = {
            "\3\1\3\uffff\2\1\14\uffff\2\1\2\uffff\1\1\16\uffff\2\1\6\uffff"+
            "\1\1\20\uffff\1\2\1\3\1\uffff\1\1",
            "",
            "\3\7\3\uffff\1\7\34\uffff\1\7\1\4\2\7\2\uffff\1\4\6\uffff\1"+
            "\5\1\7\25\uffff\1\7\3\uffff\1\6",
            "",
            "",
            "\7\7\2\uffff\2\7\14\uffff\2\7\2\uffff\1\7\3\uffff\1\7\3\uffff"+
            "\1\7\1\uffff\2\7\3\uffff\5\7\1\uffff\4\7\17\uffff\2\7\1\uffff"+
            "\2\7\3\uffff\1\10",
            "\7\7\2\uffff\2\7\14\uffff\2\7\2\uffff\1\7\3\uffff\1\7\3\uffff"+
            "\1\7\1\uffff\2\7\2\uffff\1\4\5\7\1\uffff\1\11\3\7\3\uffff\1"+
            "\4\7\uffff\1\4\3\uffff\5\7\3\uffff\1\10",
            "",
            "\7\7\2\uffff\2\7\14\uffff\2\7\2\uffff\1\7\3\uffff\1\7\3\uffff"+
            "\1\7\1\uffff\2\7\2\uffff\1\4\5\7\1\uffff\1\11\3\7\3\uffff\1"+
            "\4\7\uffff\1\12\3\uffff\5\7\3\uffff\1\10",
            "\7\7\2\uffff\2\7\14\uffff\2\7\2\uffff\1\7\3\uffff\1\7\3\uffff"+
            "\1\7\1\uffff\2\7\3\uffff\5\7\1\uffff\4\7\17\uffff\2\7\1\uffff"+
            "\2\7\3\uffff\1\10",
            "\3\7\3\uffff\1\7\34\uffff\1\7\1\uffff\2\7\11\uffff\2\7\25\uffff"+
            "\1\7\3\uffff\1\7\1\uffff\1\4"
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "()* loopback of 235:5: ( OP_CONTEXT atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | OP_CONTEXT lambda_expression_no_context -> ^( CALL[true] lambda_expression_no_context ^( ARGUMENT $context_expression) ) | OP_EXPRESSION_CONTEXT ce= functional_expression -> ^( OP_EXPRESSION_CONTEXT $context_expression $ce) )*";
        }
    }
 

    public static final BitSet FOLLOW_header_in_program53 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_definitions_in_program55 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_declaration_in_header93 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_use_declarations_in_header100 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_import_declarations_in_header106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_module_declaration119 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_MODULE_in_module_declaration121 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_module_id_in_module_declaration123 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_module_declaration125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_use_declarations155 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_use_declaration_in_use_declarations158 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_use_declarations161 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TAG_START_in_import_declarations193 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_import_declaration_in_import_declarations196 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_import_declarations199 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_declaration231 = new BitSet(new long[]{0x0000000000000000L,0x0000005100000000L});
    public static final BitSet FOLLOW_external_class_name_in_import_declaration235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_use_declaration264 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_module_id_in_use_declaration266 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_AS_in_use_declaration268 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_use_declaration270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_external_class_name302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DOT_in_external_class_name304 = new BitSet(new long[]{0x0000000000000000L,0x0000005100000000L});
    public static final BitSet FOLLOW_set_in_external_class_name309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_module_id330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DOT_in_module_id332 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_module_id337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_definition_in_definitions353 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TAG_START_in_tag_definition376 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DEF_in_tag_definition378 = new BitSet(new long[]{0x0080000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_definition_signature_in_tag_definition380 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_tag_definition386 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_tag_definition390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_signature422 = new BitSet(new long[]{0x0000000000000002L,0x0000001000200204L});
    public static final BitSet FOLLOW_DEFAULT_in_definition_signature424 = new BitSet(new long[]{0x0000000000000002L,0x0000001000200204L});
    public static final BitSet FOLLOW_OP_LE_in_definition_signature428 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_single_type_in_definition_signature432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_OP_GE_in_definition_signature434 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000204L});
    public static final BitSet FOLLOW_definition_argument_in_definition_signature438 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000204L});
    public static final BitSet FOLLOW_OP_FUNCTION_DEFINITION_in_definition_signature442 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_type_in_definition_signature446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_definition_argument500 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_argument505 = new BitSet(new long[]{0x0000000000000002L,0x0000000001010000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_argument508 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_type_in_definition_argument510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_definition_argument514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content560 = new BitSet(new long[]{0x0000000222000002L});
    public static final BitSet FOLLOW_data_body_atom_in_tag_content566 = new BitSet(new long[]{0x0000000222000002L});
    public static final BitSet FOLLOW_OP_DATA_IS_EXPRESSION_in_tag_content589 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content591 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_tag_content597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_data_body_atom618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_inside_data_in_data_body_atom628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_inside_data_in_data_body_atom634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_START_in_expression_inside_data649 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_expression_inside_data652 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_EXPRESSION_END_in_expression_inside_data654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_tag_in_tag_inside_data670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_tag_in_tag_inside_data676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_tag_in_tag_inside_data682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_tag_in_tag_inside_data688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expression_in_expression704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_expression_in_expression710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concatence_expression_in_expression716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_def_in_expression731 = new BitSet(new long[]{0x0080000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression735 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_AND_in_def_in_expression742 = new BitSet(new long[]{0x0080000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression746 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_expression754 = new BitSet(new long[]{0xF40480008E000000L,0x000000510800860CL});
    public static final BitSet FOLLOW_COLON_in_def_in_expression756 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_def_in_expression761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_expression793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COLON_in_definition_inside_expression795 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_expression824 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_expression826 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag864 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DEF_in_def_in_tag866 = new BitSet(new long[]{0x0080000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag870 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag877 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_AND_in_def_in_tag879 = new BitSet(new long[]{0x0080000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag883 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag891 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_tag893 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_def_in_tag897 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_def_in_tag903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_tag935 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_definition_inside_tag939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_tag963 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_tag965 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_definition_inside_tag967 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_CONTENT_in_definition_inside_tag970 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_definition_inside_tag972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAMBDA_in_lambda_expression1011 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000208L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression1013 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000208L});
    public static final BitSet FOLLOW_COLON_in_lambda_expression1016 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_lambda_expression1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression1046 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000204L});
    public static final BitSet FOLLOW_OP_FUNCTION_DEFINITION_in_lambda_expression1049 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_lambda_expression1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_match_expression_in_lambda_expression1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_lambda_match_in_lambda_match_expression1091 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMICOLON_in_lambda_match_expression1094 = new BitSet(new long[]{0x2000000000000000L,0x0000005000000204L});
    public static final BitSet FOLLOW_single_lambda_match_in_lambda_match_expression1096 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_type_in_single_lambda_match1110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_OP_FUNCTION_DEFINITION_in_single_lambda_match1112 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_concatence_expression_in_single_lambda_match1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAMBDA_in_lambda_expression_no_context1125 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000200L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression_no_context1127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COLON_in_lambda_expression_no_context1129 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_atom_expression_in_lambda_expression_no_context1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression_no_context1158 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000204L});
    public static final BitSet FOLLOW_OP_FUNCTION_DEFINITION_in_lambda_expression_no_context1161 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_atom_expression_in_lambda_expression_no_context1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_ID_in_type1199 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_type1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_ID_in_single_type1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expression_in_concatence_expression1260 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_OP_CONCAT_in_concatence_expression1274 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_control_expression_in_concatence_expression1278 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_if_expression_in_control_expression1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_expression_in_control_expression1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_context_expression_in_control_expression1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_expression1333 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_context_expression_in_if_expression1337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COLON_in_if_expression1339 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_control_expression_in_if_expression1347 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_expression1353 = new BitSet(new long[]{0xF40480008E000000L,0x000000510800860CL});
    public static final BitSet FOLLOW_COLON_in_if_expression1355 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_control_expression_in_if_expression1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_if_tag1398 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_if_subtag_in_if_tag1404 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_if_tag1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_subtag1426 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_context_expression_in_if_subtag1430 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_if_subtag1438 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TAG_START_in_if_subtag1448 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_subtag1450 = new BitSet(new long[]{0x0004000810000000L});
    public static final BitSet FOLLOW_tag_content_in_if_subtag1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_subtag_in_if_subtag1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_map_expression1507 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_context_expression_in_map_expression1511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COLON_in_map_expression1513 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_control_expression_in_map_expression1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_map_tag1552 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_MAP_in_map_tag1554 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_context_expression_in_map_tag1558 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_map_tag1566 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_map_tag1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_context_expression1608 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_OP_CONTEXT_in_context_expression1622 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_atom_expression_in_context_expression1624 = new BitSet(new long[]{0xF40480008E000000L,0x0000005138008604L});
    public static final BitSet FOLLOW_function_arguments_in_context_expression1628 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_OP_CONTEXT_in_context_expression1668 = new BitSet(new long[]{0x2000000000000000L,0x0000001000000204L});
    public static final BitSet FOLLOW_lambda_expression_no_context_in_context_expression1670 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_OP_EXPRESSION_CONTEXT_in_context_expression1706 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_functional_expression_in_context_expression1710 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_boolean_binary_expression_in_boolean_expression1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression1764 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_boolean_binary_operator_in_boolean_binary_expression1767 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression1770 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_boolean_unary_operator_in_boolean_unary_expression1786 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_AND_in_boolean_binary_operator1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_OR_in_boolean_binary_operator1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_in_boolean_unary_operator1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression1855 = new BitSet(new long[]{0x0000000000000002L,0x0000000000FC0000L});
    public static final BitSet FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression1858 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression1861 = new BitSet(new long[]{0x0000000000000002L,0x0000000000FC0000L});
    public static final BitSet FOLLOW_OP_EQUAL_in_boolean_comparsion_operator1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LE_in_boolean_comparsion_operator1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LEQ_in_boolean_comparsion_operator1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GE_in_boolean_comparsion_operator1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GEQ_in_boolean_comparsion_operator1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1947 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_OP_PLUS_in_additive_expression1963 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_OP_MINUS_in_additive_expression1977 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1997 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression2017 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030100L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_multiplicative_expression2027 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_SLASH_in_multiplicative_expression2041 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_OP_MODULO_in_multiplicative_expression2055 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression2075 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030100L});
    public static final BitSet FOLLOW_OP_MINUS_in_negative_expression2094 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_functional_expression_in_negative_expression2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functional_expression_in_negative_expression2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_expression_in_functional_expression2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expression_in_call_expression2141 = new BitSet(new long[]{0xF40480008E000002L,0x0000005108008604L});
    public static final BitSet FOLLOW_function_argument_in_call_expression2149 = new BitSet(new long[]{0xF40480008E000002L,0x0000005108008604L});
    public static final BitSet FOLLOW_TAG_START_in_call_tag2209 = new BitSet(new long[]{0x0000000000000000L,0x0000001100000000L});
    public static final BitSet FOLLOW_namespace_id_in_call_tag2213 = new BitSet(new long[]{0xF4048008DE000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_function_arguments_in_call_tag2215 = new BitSet(new long[]{0x0000000850000000L});
    public static final BitSet FOLLOW_tag_content_in_call_tag2224 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_call_tag2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_argument_in_function_arguments2277 = new BitSet(new long[]{0xF40480008E000002L,0x0000005108008604L});
    public static final BitSet FOLLOW_VAR_ID_in_function_argument2293 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_function_argument2295 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_atom_expression_in_function_argument2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_with_properties_in_atom_expression2334 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMA_in_atom_expression2347 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_atom_with_properties_in_atom_expression2349 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_atom_with_selectors_in_atom_with_properties2381 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_property_selector_in_atom_with_properties2396 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_atom_in_atom_with_selectors2435 = new BitSet(new long[]{0x0100000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_sequence_selectors_in_atom_with_selectors2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_property_selector2483 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_property_selector2486 = new BitSet(new long[]{0x0100000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_sequence_selectors_in_property_selector2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_selector_in_sequence_selectors2502 = new BitSet(new long[]{0x0100000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors2504 = new BitSet(new long[]{0x0100000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors2513 = new BitSet(new long[]{0x0100000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_type_selector2534 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_type_in_type_selector2536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_type_selector2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector2563 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_boolean_expression_in_sequence_selector2565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_alias2591 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_alias2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_START_in_data_expression2615 = new BitSet(new long[]{0x0000000322000000L});
    public static final BitSet FOLLOW_data_body_atom_in_data_expression2617 = new BitSet(new long[]{0x0000000322000000L});
    public static final BitSet FOLLOW_DATA_END_in_data_expression2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectable_atom_in_atom2648 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_DOUBLE_DOT_in_atom2653 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_selectable_atom_in_atom2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_atom_in_selectable_atom2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_expression_in_selectable_atom2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_id_in_selectable_atom2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_selectable_atom2691 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_selectable_atom2694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_selectable_atom2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id2714 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_OP_VIEW_in_namespace_id2716 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GENERAL_in_namespace_id2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_atom_in_object_atom2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_object_atom2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_object_atom2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_object_atom2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_object_atom2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_object_atom2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_NUMBER_in_number_atom2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_NUMBER_in_number_atom2849 = new BitSet(new long[]{0x0000000000000002L});

}