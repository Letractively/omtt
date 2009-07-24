// $ANTLR 3.1.2 /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g 2009-07-24 15:06:44

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
            // elements: module_id, USE, VAR_ID
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
            // elements: definition_signature, DEF, content
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

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:22: ( OP_LE it= single_type OP_GE )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==OP_LE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:23: OP_LE it= single_type OP_GE
                    {
                    OP_LE35=(Token)match(input,OP_LE,FOLLOW_OP_LE_in_definition_signature437);  
                    stream_OP_LE.add(OP_LE35);

                    pushFollow(FOLLOW_single_type_in_definition_signature441);
                    it=single_type();

                    state._fsp--;

                    stream_single_type.add(it.getTree());
                    OP_GE36=(Token)match(input,OP_GE,FOLLOW_OP_GE_in_definition_signature443);  
                    stream_OP_GE.add(OP_GE36);


                    }
                    break;

            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:52: ( definition_argument )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==TILDE||LA13_0==VAR_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:52: definition_argument
            	    {
            	    pushFollow(FOLLOW_definition_argument_in_definition_signature447);
            	    definition_argument37=definition_argument();

            	    state._fsp--;

            	    stream_definition_argument.add(definition_argument37.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:73: ( OP_FUNCTION_DEFINITION ret_type= type )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==OP_FUNCTION_DEFINITION) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:74: OP_FUNCTION_DEFINITION ret_type= type
                    {
                    OP_FUNCTION_DEFINITION38=(Token)match(input,OP_FUNCTION_DEFINITION,FOLLOW_OP_FUNCTION_DEFINITION_in_definition_signature451);  
                    stream_OP_FUNCTION_DEFINITION.add(OP_FUNCTION_DEFINITION38);

                    pushFollow(FOLLOW_type_in_definition_signature455);
                    ret_type=type();

                    state._fsp--;

                    stream_type.add(ret_type.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ret_type, DEFAULT, VAR_ID, definition_argument, it
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:79:10: fragment definition_argument : ( TILDE )? id= VAR_ID ( OP_MULTIPLY )? ( LEFT_SQUARE_PAREN single_type RIGHT_SQUARE_PAREN )? -> ^( ARGUMENT IDENT[$id] ( single_type )? ( TILDE )? ( OP_MULTIPLY )? ) ;
    public final OmttParser.definition_argument_return definition_argument() throws RecognitionException {
        OmttParser.definition_argument_return retval = new OmttParser.definition_argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        Token TILDE39=null;
        Token OP_MULTIPLY40=null;
        Token LEFT_SQUARE_PAREN41=null;
        Token RIGHT_SQUARE_PAREN43=null;
        OmttParser.single_type_return single_type42 = null;


        Object id_tree=null;
        Object TILDE39_tree=null;
        Object OP_MULTIPLY40_tree=null;
        Object LEFT_SQUARE_PAREN41_tree=null;
        Object RIGHT_SQUARE_PAREN43_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_OP_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token OP_MULTIPLY");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_TILDE=new RewriteRuleTokenStream(adaptor,"token TILDE");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:3: ( ( TILDE )? id= VAR_ID ( OP_MULTIPLY )? ( LEFT_SQUARE_PAREN single_type RIGHT_SQUARE_PAREN )? -> ^( ARGUMENT IDENT[$id] ( single_type )? ( TILDE )? ( OP_MULTIPLY )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:5: ( TILDE )? id= VAR_ID ( OP_MULTIPLY )? ( LEFT_SQUARE_PAREN single_type RIGHT_SQUARE_PAREN )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:5: ( TILDE )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==TILDE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:5: TILDE
                    {
                    TILDE39=(Token)match(input,TILDE,FOLLOW_TILDE_in_definition_argument509);  
                    stream_TILDE.add(TILDE39);


                    }
                    break;

            }

            id=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_argument514);  
            stream_VAR_ID.add(id);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:22: ( OP_MULTIPLY )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==OP_MULTIPLY) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:22: OP_MULTIPLY
                    {
                    OP_MULTIPLY40=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_definition_argument516);  
                    stream_OP_MULTIPLY.add(OP_MULTIPLY40);


                    }
                    break;

            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:35: ( LEFT_SQUARE_PAREN single_type RIGHT_SQUARE_PAREN )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LEFT_SQUARE_PAREN) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:36: LEFT_SQUARE_PAREN single_type RIGHT_SQUARE_PAREN
                    {
                    LEFT_SQUARE_PAREN41=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_definition_argument520);  
                    stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN41);

                    pushFollow(FOLLOW_single_type_in_definition_argument522);
                    single_type42=single_type();

                    state._fsp--;

                    stream_single_type.add(single_type42.getTree());
                    RIGHT_SQUARE_PAREN43=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_definition_argument524);  
                    stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN43);


                    }
                    break;

            }



            // AST REWRITE
            // elements: OP_MULTIPLY, TILDE, single_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 81:5: -> ^( ARGUMENT IDENT[$id] ( single_type )? ( TILDE )? ( OP_MULTIPLY )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:81:8: ^( ARGUMENT IDENT[$id] ( single_type )? ( TILDE )? ( OP_MULTIPLY )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TemplateArgument(ARGUMENT), root_1);

                adaptor.addChild(root_1, new Ident(IDENT, id));
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:81:55: ( single_type )?
                if ( stream_single_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_single_type.nextTree());

                }
                stream_single_type.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:81:68: ( TILDE )?
                if ( stream_TILDE.hasNext() ) {
                    adaptor.addChild(root_1, stream_TILDE.nextNode());

                }
                stream_TILDE.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:81:75: ( OP_MULTIPLY )?
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
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:88:3: ( CONTENT ( data_body_atom )* -> ^( CONTENT ( data_body_atom )* ) | OP_DATA_IS_EXPRESSION CONTENT expression -> expression )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:88:5: CONTENT ( data_body_atom )*
                    {
                    CONTENT44=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_tag_content570);  
                    stream_CONTENT.add(CONTENT44);

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:89:5: ( data_body_atom )*
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
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:89:5: data_body_atom
                    	    {
                    	    pushFollow(FOLLOW_data_body_atom_in_tag_content576);
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
                    OP_DATA_IS_EXPRESSION46=(Token)match(input,OP_DATA_IS_EXPRESSION,FOLLOW_OP_DATA_IS_EXPRESSION_in_tag_content599);  
                    stream_OP_DATA_IS_EXPRESSION.add(OP_DATA_IS_EXPRESSION46);

                    CONTENT47=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_tag_content601);  
                    stream_CONTENT.add(CONTENT47);

                    pushFollow(FOLLOW_expression_in_tag_content607);
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

        Token STRING_LITERAL49=null;
        OmttParser.expression_inside_data_return expression_inside_data50 = null;

        OmttParser.tag_inside_data_return tag_inside_data51 = null;


        Object STRING_LITERAL49_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:97:3: ( STRING_LITERAL | expression_inside_data | tag_inside_data )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:97:5: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL49=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_data_body_atom628); 
                    STRING_LITERAL49_tree = new Literal(STRING_LITERAL49) ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_LITERAL49_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:98:5: expression_inside_data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_inside_data_in_data_body_atom638);
                    expression_inside_data50=expression_inside_data();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_inside_data50.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:99:5: tag_inside_data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tag_inside_data_in_data_body_atom644);
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:102:10: fragment expression_inside_data : EXPRESSION_START expression EXPRESSION_END ;
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
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:103:3: ( EXPRESSION_START expression EXPRESSION_END )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:103:5: EXPRESSION_START expression EXPRESSION_END
            {
            root_0 = (Object)adaptor.nil();

            EXPRESSION_START52=(Token)match(input,EXPRESSION_START,FOLLOW_EXPRESSION_START_in_expression_inside_data659); 
            pushFollow(FOLLOW_expression_in_expression_inside_data662);
            expression53=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression53.getTree());
            EXPRESSION_END54=(Token)match(input,EXPRESSION_END,FOLLOW_EXPRESSION_END_in_expression_inside_data664); 

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

        OmttParser.def_in_tag_return def_in_tag55 = null;

        OmttParser.if_tag_return if_tag56 = null;

        OmttParser.call_tag_return call_tag57 = null;

        OmttParser.map_tag_return map_tag58 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:107:3: ( def_in_tag | if_tag | call_tag | map_tag )
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
                case IF:
                    {
                    alt21=2;
                    }
                    break;
                case OP_GENERAL:
                case VAR_ID:
                    {
                    alt21=3;
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:107:5: def_in_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_def_in_tag_in_tag_inside_data680);
                    def_in_tag55=def_in_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, def_in_tag55.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:108:5: if_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_tag_in_tag_inside_data686);
                    if_tag56=if_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, if_tag56.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:109:5: call_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_tag_in_tag_inside_data692);
                    call_tag57=call_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, call_tag57.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:110:5: map_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_tag_in_tag_inside_data698);
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:116:1: expression : ( lambda_expression | def_in_expression | concatence_expression );
    public final OmttParser.expression_return expression() throws RecognitionException {
        OmttParser.expression_return retval = new OmttParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.lambda_expression_return lambda_expression59 = null;

        OmttParser.def_in_expression_return def_in_expression60 = null;

        OmttParser.concatence_expression_return concatence_expression61 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:117:3: ( lambda_expression | def_in_expression | concatence_expression )
            int alt22=3;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:117:5: lambda_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expression_in_expression714);
                    lambda_expression59=lambda_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, lambda_expression59.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:118:5: def_in_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_def_in_expression_in_expression720);
                    def_in_expression60=def_in_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, def_in_expression60.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:119:5: concatence_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_concatence_expression_in_expression726);
                    concatence_expression61=concatence_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, concatence_expression61.getTree());

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

        Token DEF62=null;
        Token AND63=null;
        Token IN64=null;
        Token COLON65=null;
        List list_definition=null;
        OmttParser.expression_return content = null;

        OmttParser.definition_inside_expression_return definition = null;
         definition = null;
        Object DEF62_tree=null;
        Object AND63_tree=null;
        Object IN64_tree=null;
        Object COLON65_tree=null;
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
            DEF62=(Token)match(input,DEF,FOLLOW_DEF_in_def_in_expression741);  
            stream_DEF.add(DEF62);

            pushFollow(FOLLOW_definition_inside_expression_in_def_in_expression745);
            definition=definition_inside_expression();

            state._fsp--;

            stream_definition_inside_expression.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:126:5: ( AND definition+= definition_inside_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:126:6: AND definition+= definition_inside_expression
            	    {
            	    AND63=(Token)match(input,AND,FOLLOW_AND_in_def_in_expression752);  
            	    stream_AND.add(AND63);

            	    pushFollow(FOLLOW_definition_inside_expression_in_def_in_expression756);
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

            IN64=(Token)match(input,IN,FOLLOW_IN_in_def_in_expression764);  
            stream_IN.add(IN64);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:127:8: ( COLON )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==COLON) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:127:8: COLON
                    {
                    COLON65=(Token)match(input,COLON,FOLLOW_COLON_in_def_in_expression766);  
                    stream_COLON.add(COLON65);


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_def_in_expression771);
            content=expression();

            state._fsp--;

            stream_expression.add(content.getTree());


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

        Token COLON67=null;
        Token VAR_ID69=null;
        Token OP_ASSIGN70=null;
        OmttParser.definition_signature_return definition_signature66 = null;

        OmttParser.expression_return expression68 = null;

        OmttParser.expression_return expression71 = null;


        Object COLON67_tree=null;
        Object VAR_ID69_tree=null;
        Object OP_ASSIGN70_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_signature=new RewriteRuleSubtreeStream(adaptor,"rule definition_signature");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:131:3: ( definition_signature COLON expression -> ^( DEF definition_signature expression ) | VAR_ID OP_ASSIGN expression -> ^( DEF VAR_ID expression ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==VAR_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==OP_ASSIGN) ) {
                    alt25=2;
                }
                else if ( ((LA25_1>=OP_FUNCTION_DEFINITION && LA25_1<=COLON)||LA25_1==TILDE||LA25_1==OP_LE||LA25_1==VAR_ID) ) {
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:131:5: definition_signature COLON expression
                    {
                    pushFollow(FOLLOW_definition_signature_in_definition_inside_expression803);
                    definition_signature66=definition_signature();

                    state._fsp--;

                    stream_definition_signature.add(definition_signature66.getTree());
                    COLON67=(Token)match(input,COLON,FOLLOW_COLON_in_definition_inside_expression805);  
                    stream_COLON.add(COLON67);

                    pushFollow(FOLLOW_expression_in_definition_inside_expression811);
                    expression68=expression();

                    state._fsp--;

                    stream_expression.add(expression68.getTree());


                    // AST REWRITE
                    // elements: definition_signature, expression
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
                    VAR_ID69=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_inside_expression834);  
                    stream_VAR_ID.add(VAR_ID69);

                    OP_ASSIGN70=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_inside_expression836);  
                    stream_OP_ASSIGN.add(OP_ASSIGN70);

                    pushFollow(FOLLOW_expression_in_definition_inside_expression841);
                    expression71=expression();

                    state._fsp--;

                    stream_expression.add(expression71.getTree());


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

        Token TAG_START72=null;
        Token DEF73=null;
        Token TAG_START74=null;
        Token AND75=null;
        Token TAG_START76=null;
        Token IN77=null;
        Token TAG_END78=null;
        List list_definition=null;
        OmttParser.tag_content_return content = null;

        OmttParser.definition_inside_tag_return definition = null;
         definition = null;
        Object TAG_START72_tree=null;
        Object DEF73_tree=null;
        Object TAG_START74_tree=null;
        Object AND75_tree=null;
        Object TAG_START76_tree=null;
        Object IN77_tree=null;
        Object TAG_END78_tree=null;
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
            TAG_START72=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag874);  
            stream_TAG_START.add(TAG_START72);

            DEF73=(Token)match(input,DEF,FOLLOW_DEF_in_def_in_tag876);  
            stream_DEF.add(DEF73);

            pushFollow(FOLLOW_definition_inside_tag_in_def_in_tag880);
            definition=definition_inside_tag();

            state._fsp--;

            stream_definition_inside_tag.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:141:5: ( TAG_START AND definition+= definition_inside_tag )*
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
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:141:6: TAG_START AND definition+= definition_inside_tag
            	    {
            	    TAG_START74=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag887);  
            	    stream_TAG_START.add(TAG_START74);

            	    AND75=(Token)match(input,AND,FOLLOW_AND_in_def_in_tag889);  
            	    stream_AND.add(AND75);

            	    pushFollow(FOLLOW_definition_inside_tag_in_def_in_tag893);
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

            TAG_START76=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag901);  
            stream_TAG_START.add(TAG_START76);

            IN77=(Token)match(input,IN,FOLLOW_IN_in_def_in_tag903);  
            stream_IN.add(IN77);

            pushFollow(FOLLOW_tag_content_in_def_in_tag907);
            content=tag_content();

            state._fsp--;

            stream_tag_content.add(content.getTree());
            TAG_END78=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_def_in_tag913);  
            stream_TAG_END.add(TAG_END78);



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

        Token VAR_ID80=null;
        Token OP_ASSIGN81=null;
        Token CONTENT83=null;
        Token STRING_LITERAL84=null;
        OmttParser.tag_content_return content = null;

        OmttParser.definition_signature_return definition_signature79 = null;

        OmttParser.expression_return expression82 = null;


        Object VAR_ID80_tree=null;
        Object OP_ASSIGN81_tree=null;
        Object CONTENT83_tree=null;
        Object STRING_LITERAL84_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_CONTENT=new RewriteRuleTokenStream(adaptor,"token CONTENT");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_signature=new RewriteRuleSubtreeStream(adaptor,"rule definition_signature");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:147:3: ( definition_signature content= tag_content -> ^( DEF definition_signature $content) | VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )? -> ^( DEF VAR_ID expression ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==VAR_ID) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==OP_ASSIGN) ) {
                    alt29=2;
                }
                else if ( (LA29_1==CONTENT||LA29_1==OP_DATA_IS_EXPRESSION||LA29_1==OP_FUNCTION_DEFINITION||LA29_1==TILDE||LA29_1==OP_LE||LA29_1==VAR_ID) ) {
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:147:5: definition_signature content= tag_content
                    {
                    pushFollow(FOLLOW_definition_signature_in_definition_inside_tag945);
                    definition_signature79=definition_signature();

                    state._fsp--;

                    stream_definition_signature.add(definition_signature79.getTree());
                    pushFollow(FOLLOW_tag_content_in_definition_inside_tag949);
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
                    VAR_ID80=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_inside_tag973);  
                    stream_VAR_ID.add(VAR_ID80);

                    OP_ASSIGN81=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_inside_tag975);  
                    stream_OP_ASSIGN.add(OP_ASSIGN81);

                    pushFollow(FOLLOW_expression_in_definition_inside_tag977);
                    expression82=expression();

                    state._fsp--;

                    stream_expression.add(expression82.getTree());
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:149:33: ( CONTENT ( STRING_LITERAL )? )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==CONTENT) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:149:34: CONTENT ( STRING_LITERAL )?
                            {
                            CONTENT83=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_definition_inside_tag980);  
                            stream_CONTENT.add(CONTENT83);

                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:149:42: ( STRING_LITERAL )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==STRING_LITERAL) ) {
                                alt27=1;
                            }
                            switch (alt27) {
                                case 1 :
                                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:149:42: STRING_LITERAL
                                    {
                                    STRING_LITERAL84=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_definition_inside_tag982);  
                                    stream_STRING_LITERAL.add(STRING_LITERAL84);


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

        Token LAMBDA85=null;
        Token COLON87=null;
        Token OP_FUNCTION_DEFINITION90=null;
        OmttParser.definition_argument_return definition_argument86 = null;

        OmttParser.expression_return expression88 = null;

        OmttParser.definition_argument_return definition_argument89 = null;

        OmttParser.expression_return expression91 = null;

        OmttParser.lambda_match_expression_return lambda_match_expression92 = null;


        Object LAMBDA85_tree=null;
        Object COLON87_tree=null;
        Object OP_FUNCTION_DEFINITION90_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_LAMBDA=new RewriteRuleTokenStream(adaptor,"token LAMBDA");
        RewriteRuleTokenStream stream_OP_FUNCTION_DEFINITION=new RewriteRuleTokenStream(adaptor,"token OP_FUNCTION_DEFINITION");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_argument=new RewriteRuleSubtreeStream(adaptor,"rule definition_argument");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:157:3: ( LAMBDA ( definition_argument )* COLON expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | ( definition_argument )* OP_FUNCTION_DEFINITION expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | lambda_match_expression )
            int alt32=3;
            switch ( input.LA(1) ) {
            case LAMBDA:
                {
                alt32=1;
                }
                break;
            case OP_FUNCTION_DEFINITION:
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:157:5: LAMBDA ( definition_argument )* COLON expression
                    {
                    LAMBDA85=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambda_expression1021);  
                    stream_LAMBDA.add(LAMBDA85);

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:157:12: ( definition_argument )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==TILDE||LA30_0==VAR_ID) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:157:12: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_lambda_expression1023);
                    	    definition_argument86=definition_argument();

                    	    state._fsp--;

                    	    stream_definition_argument.add(definition_argument86.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    COLON87=(Token)match(input,COLON,FOLLOW_COLON_in_lambda_expression1026);  
                    stream_COLON.add(COLON87);

                    pushFollow(FOLLOW_expression_in_lambda_expression1028);
                    expression88=expression();

                    state._fsp--;

                    stream_expression.add(expression88.getTree());


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
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==TILDE||LA31_0==VAR_ID) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:159:5: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_lambda_expression1056);
                    	    definition_argument89=definition_argument();

                    	    state._fsp--;

                    	    stream_definition_argument.add(definition_argument89.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    OP_FUNCTION_DEFINITION90=(Token)match(input,OP_FUNCTION_DEFINITION,FOLLOW_OP_FUNCTION_DEFINITION_in_lambda_expression1059);  
                    stream_OP_FUNCTION_DEFINITION.add(OP_FUNCTION_DEFINITION90);

                    pushFollow(FOLLOW_expression_in_lambda_expression1061);
                    expression91=expression();

                    state._fsp--;

                    stream_expression.add(expression91.getTree());


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

                    pushFollow(FOLLOW_lambda_match_expression_in_lambda_expression1088);
                    lambda_match_expression92=lambda_match_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, lambda_match_expression92.getTree());

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

        Token SEMICOLON94=null;
        OmttParser.single_lambda_match_return single_lambda_match93 = null;

        OmttParser.single_lambda_match_return single_lambda_match95 = null;


        Object SEMICOLON94_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:164:2: ( single_lambda_match ( SEMICOLON single_lambda_match )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:164:4: single_lambda_match ( SEMICOLON single_lambda_match )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_lambda_match_in_lambda_match_expression1101);
            single_lambda_match93=single_lambda_match();

            state._fsp--;

            adaptor.addChild(root_0, single_lambda_match93.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:164:24: ( SEMICOLON single_lambda_match )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==SEMICOLON) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:164:25: SEMICOLON single_lambda_match
            	    {
            	    SEMICOLON94=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_lambda_match_expression1104); 
            	    SEMICOLON94_tree = (Object)adaptor.create(SEMICOLON94);
            	    adaptor.addChild(root_0, SEMICOLON94_tree);

            	    pushFollow(FOLLOW_single_lambda_match_in_lambda_match_expression1106);
            	    single_lambda_match95=single_lambda_match();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_lambda_match95.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:166:10: fragment single_lambda_match : type OP_FUNCTION_DEFINITION concatence_expression ;
    public final OmttParser.single_lambda_match_return single_lambda_match() throws RecognitionException {
        OmttParser.single_lambda_match_return retval = new OmttParser.single_lambda_match_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_FUNCTION_DEFINITION97=null;
        OmttParser.type_return type96 = null;

        OmttParser.concatence_expression_return concatence_expression98 = null;


        Object OP_FUNCTION_DEFINITION97_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:167:2: ( type OP_FUNCTION_DEFINITION concatence_expression )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:167:4: type OP_FUNCTION_DEFINITION concatence_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_single_lambda_match1120);
            type96=type();

            state._fsp--;

            adaptor.addChild(root_0, type96.getTree());
            OP_FUNCTION_DEFINITION97=(Token)match(input,OP_FUNCTION_DEFINITION,FOLLOW_OP_FUNCTION_DEFINITION_in_single_lambda_match1122); 
            OP_FUNCTION_DEFINITION97_tree = (Object)adaptor.create(OP_FUNCTION_DEFINITION97);
            adaptor.addChild(root_0, OP_FUNCTION_DEFINITION97_tree);

            pushFollow(FOLLOW_concatence_expression_in_single_lambda_match1124);
            concatence_expression98=concatence_expression();

            state._fsp--;

            adaptor.addChild(root_0, concatence_expression98.getTree());

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

        Token LAMBDA99=null;
        Token COLON101=null;
        Token OP_FUNCTION_DEFINITION104=null;
        OmttParser.definition_argument_return definition_argument100 = null;

        OmttParser.atom_expression_return atom_expression102 = null;

        OmttParser.definition_argument_return definition_argument103 = null;

        OmttParser.atom_expression_return atom_expression105 = null;


        Object LAMBDA99_tree=null;
        Object COLON101_tree=null;
        Object OP_FUNCTION_DEFINITION104_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_LAMBDA=new RewriteRuleTokenStream(adaptor,"token LAMBDA");
        RewriteRuleTokenStream stream_OP_FUNCTION_DEFINITION=new RewriteRuleTokenStream(adaptor,"token OP_FUNCTION_DEFINITION");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_definition_argument=new RewriteRuleSubtreeStream(adaptor,"rule definition_argument");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:170:3: ( LAMBDA definition_argument COLON atom_expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression ) | ( definition_argument )* OP_FUNCTION_DEFINITION atom_expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LAMBDA) ) {
                alt35=1;
            }
            else if ( (LA35_0==OP_FUNCTION_DEFINITION||LA35_0==TILDE||LA35_0==VAR_ID) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:170:5: LAMBDA definition_argument COLON atom_expression
                    {
                    LAMBDA99=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambda_expression_no_context1135);  
                    stream_LAMBDA.add(LAMBDA99);

                    pushFollow(FOLLOW_definition_argument_in_lambda_expression_no_context1137);
                    definition_argument100=definition_argument();

                    state._fsp--;

                    stream_definition_argument.add(definition_argument100.getTree());
                    COLON101=(Token)match(input,COLON,FOLLOW_COLON_in_lambda_expression_no_context1139);  
                    stream_COLON.add(COLON101);

                    pushFollow(FOLLOW_atom_expression_in_lambda_expression_no_context1141);
                    atom_expression102=atom_expression();

                    state._fsp--;

                    stream_atom_expression.add(atom_expression102.getTree());


                    // AST REWRITE
                    // elements: LAMBDA, atom_expression, definition_argument
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
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==TILDE||LA34_0==VAR_ID) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:172:5: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_lambda_expression_no_context1168);
                    	    definition_argument103=definition_argument();

                    	    state._fsp--;

                    	    stream_definition_argument.add(definition_argument103.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    OP_FUNCTION_DEFINITION104=(Token)match(input,OP_FUNCTION_DEFINITION,FOLLOW_OP_FUNCTION_DEFINITION_in_lambda_expression_no_context1171);  
                    stream_OP_FUNCTION_DEFINITION.add(OP_FUNCTION_DEFINITION104);

                    pushFollow(FOLLOW_atom_expression_in_lambda_expression_no_context1173);
                    atom_expression105=atom_expression();

                    state._fsp--;

                    stream_atom_expression.add(atom_expression105.getTree());


                    // AST REWRITE
                    // elements: definition_argument, atom_expression
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

        Token CLASS_ID106=null;
        Token OP_MULTIPLY107=null;

        Object CLASS_ID106_tree=null;
        Object OP_MULTIPLY107_tree=null;
        RewriteRuleTokenStream stream_OP_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token OP_MULTIPLY");
        RewriteRuleTokenStream stream_CLASS_ID=new RewriteRuleTokenStream(adaptor,"token CLASS_ID");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:177:3: ( CLASS_ID ( OP_MULTIPLY )? -> ^( CLASS_ID ( OP_MULTIPLY )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:177:5: CLASS_ID ( OP_MULTIPLY )?
            {
            CLASS_ID106=(Token)match(input,CLASS_ID,FOLLOW_CLASS_ID_in_type1209);  
            stream_CLASS_ID.add(CLASS_ID106);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:177:14: ( OP_MULTIPLY )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==OP_MULTIPLY) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:177:14: OP_MULTIPLY
                    {
                    OP_MULTIPLY107=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_type1211);  
                    stream_OP_MULTIPLY.add(OP_MULTIPLY107);


                    }
                    break;

            }



            // AST REWRITE
            // elements: OP_MULTIPLY, CLASS_ID
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

        Token CLASS_ID108=null;

        Object CLASS_ID108_tree=null;
        RewriteRuleTokenStream stream_CLASS_ID=new RewriteRuleTokenStream(adaptor,"token CLASS_ID");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:181:3: ( CLASS_ID -> ^( CLASS_ID ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:181:5: CLASS_ID
            {
            CLASS_ID108=(Token)match(input,CLASS_ID,FOLLOW_CLASS_ID_in_single_type1241);  
            stream_CLASS_ID.add(CLASS_ID108);



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

        Token OP_CONCAT109=null;
        List list_expr=null;
        OmttParser.control_expression_return expr = null;
         expr = null;
        Object OP_CONCAT109_tree=null;
        RewriteRuleTokenStream stream_OP_CONCAT=new RewriteRuleTokenStream(adaptor,"token OP_CONCAT");
        RewriteRuleSubtreeStream stream_control_expression=new RewriteRuleSubtreeStream(adaptor,"rule control_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:188:3: ( (expr+= control_expression -> $expr) ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:188:5: (expr+= control_expression -> $expr) ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:188:5: (expr+= control_expression -> $expr)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:188:6: expr+= control_expression
            {
            pushFollow(FOLLOW_control_expression_in_concatence_expression1270);
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
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==OP_CONCAT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:6: ( OP_CONCAT expr+= control_expression )+
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:6: ( OP_CONCAT expr+= control_expression )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==OP_CONCAT) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:7: OP_CONCAT expr+= control_expression
                    	    {
                    	    OP_CONCAT109=(Token)match(input,OP_CONCAT,FOLLOW_OP_CONCAT_in_concatence_expression1284);  
                    	    stream_OP_CONCAT.add(OP_CONCAT109);

                    	    pushFollow(FOLLOW_control_expression_in_concatence_expression1288);
                    	    expr=control_expression();

                    	    state._fsp--;

                    	    stream_control_expression.add(expr.getTree());
                    	    if (list_expr==null) list_expr=new ArrayList();
                    	    list_expr.add(expr.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);



                    // AST REWRITE
                    // elements: OP_CONCAT, expr
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

        OmttParser.if_expression_return if_expression110 = null;

        OmttParser.map_expression_return map_expression111 = null;

        OmttParser.context_expression_return context_expression112 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:193:3: ( if_expression | map_expression | context_expression )
            int alt39=3;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt39=1;
                }
                break;
            case MAP:
                {
                alt39=2;
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
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:193:5: if_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_expression_in_control_expression1318);
                    if_expression110=if_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, if_expression110.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:194:5: map_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_expression_in_control_expression1324);
                    map_expression111=map_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, map_expression111.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:195:5: context_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_context_expression_in_control_expression1330);
                    context_expression112=context_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, context_expression112.getTree());

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

        Token IF113=null;
        Token COLON114=null;
        Token ELSE115=null;
        Token COLON116=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.control_expression_return part_if = null;

        OmttParser.control_expression_return part_else = null;


        Object IF113_tree=null;
        Object COLON114_tree=null;
        Object ELSE115_tree=null;
        Object COLON116_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_control_expression=new RewriteRuleSubtreeStream(adaptor,"rule control_expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:199:3: ( IF condition= context_expression COLON part_if= control_expression ELSE ( COLON )? part_else= control_expression -> ^( IF_ELSE $condition $part_if $part_else) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:199:5: IF condition= context_expression COLON part_if= control_expression ELSE ( COLON )? part_else= control_expression
            {
            IF113=(Token)match(input,IF,FOLLOW_IF_in_if_expression1343);  
            stream_IF.add(IF113);

            pushFollow(FOLLOW_context_expression_in_if_expression1347);
            condition=context_expression();

            state._fsp--;

            stream_context_expression.add(condition.getTree());
            COLON114=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1349);  
            stream_COLON.add(COLON114);

            pushFollow(FOLLOW_control_expression_in_if_expression1357);
            part_if=control_expression();

            state._fsp--;

            stream_control_expression.add(part_if.getTree());
            ELSE115=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_expression1363);  
            stream_ELSE.add(ELSE115);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:201:10: ( COLON )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==COLON) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:201:10: COLON
                    {
                    COLON116=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1365);  
                    stream_COLON.add(COLON116);


                    }
                    break;

            }

            pushFollow(FOLLOW_control_expression_in_if_expression1374);
            part_else=control_expression();

            state._fsp--;

            stream_control_expression.add(part_else.getTree());


            // AST REWRITE
            // elements: part_else, condition, part_if
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

        Token TAG_START117=null;
        Token TAG_END119=null;
        OmttParser.if_subtag_return if_subtag118 = null;


        Object TAG_START117_tree=null;
        Object TAG_END119_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:206:3: ( TAG_START if_subtag TAG_END )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:206:5: TAG_START if_subtag TAG_END
            {
            root_0 = (Object)adaptor.nil();

            TAG_START117=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_tag1408); 
            pushFollow(FOLLOW_if_subtag_in_if_tag1414);
            if_subtag118=if_subtag();

            state._fsp--;

            adaptor.addChild(root_0, if_subtag118.getTree());
            TAG_END119=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_if_tag1420); 

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

        Token IF120=null;
        Token TAG_START121=null;
        Token ELSE122=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.tag_content_return part_if = null;

        OmttParser.tag_content_return part_else = null;

        OmttParser.if_subtag_return subtag = null;


        Object IF120_tree=null;
        Object TAG_START121_tree=null;
        Object ELSE122_tree=null;
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
            IF120=(Token)match(input,IF,FOLLOW_IF_in_if_subtag1436);  
            stream_IF.add(IF120);

            pushFollow(FOLLOW_context_expression_in_if_subtag1440);
            condition=context_expression();

            state._fsp--;

            stream_context_expression.add(condition.getTree());
            pushFollow(FOLLOW_tag_content_in_if_subtag1448);
            part_if=tag_content();

            state._fsp--;

            stream_tag_content.add(part_if.getTree());

            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:3: ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==TAG_START) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:5: TAG_START ELSE (part_else= tag_content | subtag= if_subtag )
                    {
                    TAG_START121=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_subtag1458);  
                    stream_TAG_START.add(TAG_START121);

                    ELSE122=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_subtag1460);  
                    stream_ELSE.add(ELSE122);

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:215:4: (part_else= tag_content | subtag= if_subtag )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==CONTENT||LA41_0==OP_DATA_IS_EXPRESSION) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==IF) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:215:5: part_else= tag_content
                            {
                            pushFollow(FOLLOW_tag_content_in_if_subtag1468);
                            part_else=tag_content();

                            state._fsp--;

                            stream_tag_content.add(part_else.getTree());

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:215:29: subtag= if_subtag
                            {
                            pushFollow(FOLLOW_if_subtag_in_if_subtag1474);
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
            // elements: part_if, part_else, condition, subtag
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

        Token MAP123=null;
        Token COLON124=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.control_expression_return expr = null;


        Object MAP123_tree=null;
        Object COLON124_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_control_expression=new RewriteRuleSubtreeStream(adaptor,"rule control_expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:221:3: ( MAP iter= context_expression COLON expr= control_expression -> ^( MAP $iter $expr) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:221:5: MAP iter= context_expression COLON expr= control_expression
            {
            MAP123=(Token)match(input,MAP,FOLLOW_MAP_in_map_expression1517);  
            stream_MAP.add(MAP123);

            pushFollow(FOLLOW_context_expression_in_map_expression1521);
            iter=context_expression();

            state._fsp--;

            stream_context_expression.add(iter.getTree());
            COLON124=(Token)match(input,COLON,FOLLOW_COLON_in_map_expression1523);  
            stream_COLON.add(COLON124);

            pushFollow(FOLLOW_control_expression_in_map_expression1531);
            expr=control_expression();

            state._fsp--;

            stream_control_expression.add(expr.getTree());


            // AST REWRITE
            // elements: iter, expr, MAP
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

        Token TAG_START125=null;
        Token MAP126=null;
        Token TAG_END127=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.tag_content_return expr = null;


        Object TAG_START125_tree=null;
        Object MAP126_tree=null;
        Object TAG_END127_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:226:3: ( TAG_START MAP iter= context_expression expr= tag_content TAG_END -> ^( MAP $iter $expr) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:226:5: TAG_START MAP iter= context_expression expr= tag_content TAG_END
            {
            TAG_START125=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_map_tag1562);  
            stream_TAG_START.add(TAG_START125);

            MAP126=(Token)match(input,MAP,FOLLOW_MAP_in_map_tag1564);  
            stream_MAP.add(MAP126);

            pushFollow(FOLLOW_context_expression_in_map_tag1568);
            iter=context_expression();

            state._fsp--;

            stream_context_expression.add(iter.getTree());
            pushFollow(FOLLOW_tag_content_in_map_tag1576);
            expr=tag_content();

            state._fsp--;

            stream_tag_content.add(expr.getTree());
            TAG_END127=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_map_tag1582);  
            stream_TAG_END.add(TAG_END127);



            // AST REWRITE
            // elements: MAP, expr, iter
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

        Token OP_CONTEXT128=null;
        Token OP_CONTEXT130=null;
        Token OP_EXPRESSION_CONTEXT132=null;
        OmttParser.boolean_expression_return fe = null;

        OmttParser.function_arguments_return arguments = null;

        OmttParser.functional_expression_return ce = null;

        OmttParser.atom_expression_return atom_expression129 = null;

        OmttParser.lambda_expression_no_context_return lambda_expression_no_context131 = null;


        Object OP_CONTEXT128_tree=null;
        Object OP_CONTEXT130_tree=null;
        Object OP_EXPRESSION_CONTEXT132_tree=null;
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
            pushFollow(FOLLOW_boolean_expression_in_context_expression1618);
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
            loop43:
            do {
                int alt43=4;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:235:7: OP_CONTEXT atom_expression arguments= function_arguments
            	    {
            	    OP_CONTEXT128=(Token)match(input,OP_CONTEXT,FOLLOW_OP_CONTEXT_in_context_expression1632);  
            	    stream_OP_CONTEXT.add(OP_CONTEXT128);

            	    pushFollow(FOLLOW_atom_expression_in_context_expression1634);
            	    atom_expression129=atom_expression();

            	    state._fsp--;

            	    stream_atom_expression.add(atom_expression129.getTree());
            	    pushFollow(FOLLOW_function_arguments_in_context_expression1638);
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
            	    OP_CONTEXT130=(Token)match(input,OP_CONTEXT,FOLLOW_OP_CONTEXT_in_context_expression1678);  
            	    stream_OP_CONTEXT.add(OP_CONTEXT130);

            	    pushFollow(FOLLOW_lambda_expression_no_context_in_context_expression1680);
            	    lambda_expression_no_context131=lambda_expression_no_context();

            	    state._fsp--;

            	    stream_lambda_expression_no_context.add(lambda_expression_no_context131.getTree());


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
            	    OP_EXPRESSION_CONTEXT132=(Token)match(input,OP_EXPRESSION_CONTEXT,FOLLOW_OP_EXPRESSION_CONTEXT_in_context_expression1716);  
            	    stream_OP_EXPRESSION_CONTEXT.add(OP_EXPRESSION_CONTEXT132);

            	    pushFollow(FOLLOW_functional_expression_in_context_expression1720);
            	    ce=functional_expression();

            	    state._fsp--;

            	    stream_functional_expression.add(ce.getTree());


            	    // AST REWRITE
            	    // elements: ce, OP_EXPRESSION_CONTEXT, context_expression
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
            	    break loop43;
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

        OmttParser.boolean_binary_expression_return boolean_binary_expression133 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:247:2: ( boolean_binary_expression )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:247:4: boolean_binary_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_binary_expression_in_boolean_expression1761);
            boolean_binary_expression133=boolean_binary_expression();

            state._fsp--;

            adaptor.addChild(root_0, boolean_binary_expression133.getTree());

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

        OmttParser.boolean_unary_expression_return boolean_unary_expression134 = null;

        OmttParser.boolean_binary_operator_return boolean_binary_operator135 = null;

        OmttParser.boolean_unary_expression_return boolean_unary_expression136 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:250:3: ( boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:250:5: boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression1774);
            boolean_unary_expression134=boolean_unary_expression();

            state._fsp--;

            adaptor.addChild(root_0, boolean_unary_expression134.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:250:30: ( boolean_binary_operator boolean_unary_expression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=OP_AND && LA44_0<=OP_OR)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:250:31: boolean_binary_operator boolean_unary_expression
            	    {
            	    pushFollow(FOLLOW_boolean_binary_operator_in_boolean_binary_expression1777);
            	    boolean_binary_operator135=boolean_binary_operator();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(boolean_binary_operator135.getTree(), root_0);
            	    pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression1780);
            	    boolean_unary_expression136=boolean_unary_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolean_unary_expression136.getTree());

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

        OmttParser.boolean_unary_operator_return boolean_unary_operator137 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression138 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression139 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:253:3: ( boolean_unary_operator boolean_comparsion_expression | boolean_comparsion_expression )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==OP_NOT) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=STRING_LITERAL && LA45_0<=REAL_NUMBER)||LA45_0==DATA_START||LA45_0==NULL||(LA45_0>=TRUE && LA45_0<=FALSE)||(LA45_0>=TILDE && LA45_0<=LEFT_PAREN)||LA45_0==OP_MINUS||LA45_0==OP_GENERAL||LA45_0==VAR_ID) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:253:5: boolean_unary_operator boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_unary_operator_in_boolean_unary_expression1796);
                    boolean_unary_operator137=boolean_unary_operator();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(boolean_unary_operator137.getTree(), root_0);
                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1799);
                    boolean_comparsion_expression138=boolean_comparsion_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_comparsion_expression138.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:254:5: boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1805);
                    boolean_comparsion_expression139=boolean_comparsion_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_comparsion_expression139.getTree());

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

        Token OP_AND140=null;
        Token OP_OR141=null;

        Object OP_AND140_tree=null;
        Object OP_OR141_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:258:3: ( OP_AND | OP_OR )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==OP_AND) ) {
                alt46=1;
            }
            else if ( (LA46_0==OP_OR) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:258:5: OP_AND
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_AND140=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_boolean_binary_operator1820); 
                    OP_AND140_tree = new BooleanExpression(OP_AND140) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_AND140_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:259:5: OP_OR
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_OR141=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_boolean_binary_operator1830); 
                    OP_OR141_tree = new BooleanExpression(OP_OR141) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_OR141_tree, root_0);


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

        Token OP_NOT142=null;

        Object OP_NOT142_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:262:3: ( OP_NOT )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:262:5: OP_NOT
            {
            root_0 = (Object)adaptor.nil();

            OP_NOT142=(Token)match(input,OP_NOT,FOLLOW_OP_NOT_in_boolean_unary_operator1848); 
            OP_NOT142_tree = new BooleanExpression(OP_NOT142) ;
            root_0 = (Object)adaptor.becomeRoot(OP_NOT142_tree, root_0);


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

        OmttParser.additive_expression_return additive_expression143 = null;

        OmttParser.boolean_comparsion_operator_return boolean_comparsion_operator144 = null;

        OmttParser.additive_expression_return additive_expression145 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:266:3: ( additive_expression ( boolean_comparsion_operator additive_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:266:5: additive_expression ( boolean_comparsion_operator additive_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression1865);
            additive_expression143=additive_expression();

            state._fsp--;

            adaptor.addChild(root_0, additive_expression143.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:266:25: ( boolean_comparsion_operator additive_expression )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=OP_EQUAL && LA47_0<=OP_GE)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:266:26: boolean_comparsion_operator additive_expression
            	    {
            	    pushFollow(FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression1868);
            	    boolean_comparsion_operator144=boolean_comparsion_operator();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(boolean_comparsion_operator144.getTree(), root_0);
            	    pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression1871);
            	    additive_expression145=additive_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, additive_expression145.getTree());

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

        Token OP_EQUAL146=null;
        Token OP_NOT_EQUAL147=null;
        Token OP_LE148=null;
        Token OP_LEQ149=null;
        Token OP_GE150=null;
        Token OP_GEQ151=null;

        Object OP_EQUAL146_tree=null;
        Object OP_NOT_EQUAL147_tree=null;
        Object OP_LE148_tree=null;
        Object OP_LEQ149_tree=null;
        Object OP_GE150_tree=null;
        Object OP_GEQ151_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:269:3: ( OP_EQUAL | OP_NOT_EQUAL | OP_LE | OP_LEQ | OP_GE | OP_GEQ )
            int alt48=6;
            switch ( input.LA(1) ) {
            case OP_EQUAL:
                {
                alt48=1;
                }
                break;
            case OP_NOT_EQUAL:
                {
                alt48=2;
                }
                break;
            case OP_LE:
                {
                alt48=3;
                }
                break;
            case OP_LEQ:
                {
                alt48=4;
                }
                break;
            case OP_GE:
                {
                alt48=5;
                }
                break;
            case OP_GEQ:
                {
                alt48=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:269:5: OP_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_EQUAL146=(Token)match(input,OP_EQUAL,FOLLOW_OP_EQUAL_in_boolean_comparsion_operator1887); 
                    OP_EQUAL146_tree = new BooleanExpression(OP_EQUAL146) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_EQUAL146_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:270:5: OP_NOT_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_NOT_EQUAL147=(Token)match(input,OP_NOT_EQUAL,FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator1897); 
                    OP_NOT_EQUAL147_tree = new BooleanExpression(OP_NOT_EQUAL147) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_NOT_EQUAL147_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:271:5: OP_LE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LE148=(Token)match(input,OP_LE,FOLLOW_OP_LE_in_boolean_comparsion_operator1907); 
                    OP_LE148_tree = new BooleanExpression(OP_LE148) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LE148_tree, root_0);


                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:272:5: OP_LEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LEQ149=(Token)match(input,OP_LEQ,FOLLOW_OP_LEQ_in_boolean_comparsion_operator1917); 
                    OP_LEQ149_tree = new BooleanExpression(OP_LEQ149) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LEQ149_tree, root_0);


                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:273:5: OP_GE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GE150=(Token)match(input,OP_GE,FOLLOW_OP_GE_in_boolean_comparsion_operator1927); 
                    OP_GE150_tree = new BooleanExpression(OP_GE150) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GE150_tree, root_0);


                    }
                    break;
                case 6 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:274:5: OP_GEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GEQ151=(Token)match(input,OP_GEQ,FOLLOW_OP_GEQ_in_boolean_comparsion_operator1937); 
                    OP_GEQ151_tree = new BooleanExpression(OP_GEQ151) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GEQ151_tree, root_0);


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

        Token OP_PLUS153=null;
        Token OP_MINUS154=null;
        OmttParser.multiplicative_expression_return multiplicative_expression152 = null;

        OmttParser.multiplicative_expression_return multiplicative_expression155 = null;


        Object OP_PLUS153_tree=null;
        Object OP_MINUS154_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:281:3: ( multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:281:5: multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1957);
            multiplicative_expression152=multiplicative_expression();

            state._fsp--;

            adaptor.addChild(root_0, multiplicative_expression152.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:282:5: ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=OP_PLUS && LA50_0<=OP_MINUS)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:283:7: ( OP_PLUS | OP_MINUS ) multiplicative_expression
            	    {
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:283:7: ( OP_PLUS | OP_MINUS )
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==OP_PLUS) ) {
            	        alt49=1;
            	    }
            	    else if ( (LA49_0==OP_MINUS) ) {
            	        alt49=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 49, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:283:9: OP_PLUS
            	            {
            	            OP_PLUS153=(Token)match(input,OP_PLUS,FOLLOW_OP_PLUS_in_additive_expression1973); 
            	            OP_PLUS153_tree = new ArithmeticExpression(OP_PLUS153) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_PLUS153_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:284:9: OP_MINUS
            	            {
            	            OP_MINUS154=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_additive_expression1987); 
            	            OP_MINUS154_tree = new ArithmeticExpression(OP_MINUS154) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MINUS154_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2007);
            	    multiplicative_expression155=multiplicative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicative_expression155.getTree());

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

        Token OP_MULTIPLY157=null;
        Token SLASH158=null;
        Token OP_MODULO159=null;
        OmttParser.negative_expression_return negative_expression156 = null;

        OmttParser.negative_expression_return negative_expression160 = null;


        Object OP_MULTIPLY157_tree=null;
        Object SLASH158_tree=null;
        Object OP_MODULO159_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:291:3: ( negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:291:5: negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_negative_expression_in_multiplicative_expression2027);
            negative_expression156=negative_expression();

            state._fsp--;

            adaptor.addChild(root_0, negative_expression156.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:292:5: ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==SLASH||(LA52_0>=OP_MULTIPLY && LA52_0<=OP_MODULO)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:292:7: ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression
            	    {
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:292:7: ( OP_MULTIPLY | SLASH | OP_MODULO )
            	    int alt51=3;
            	    switch ( input.LA(1) ) {
            	    case OP_MULTIPLY:
            	        {
            	        alt51=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt51=2;
            	        }
            	        break;
            	    case OP_MODULO:
            	        {
            	        alt51=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 51, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt51) {
            	        case 1 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:292:9: OP_MULTIPLY
            	            {
            	            OP_MULTIPLY157=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_multiplicative_expression2037); 
            	            OP_MULTIPLY157_tree = new ArithmeticExpression(OP_MULTIPLY157) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MULTIPLY157_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:293:9: SLASH
            	            {
            	            SLASH158=(Token)match(input,SLASH,FOLLOW_SLASH_in_multiplicative_expression2051); 
            	            SLASH158_tree = new ArithmeticExpression(SLASH158) ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH158_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:294:9: OP_MODULO
            	            {
            	            OP_MODULO159=(Token)match(input,OP_MODULO,FOLLOW_OP_MODULO_in_multiplicative_expression2065); 
            	            OP_MODULO159_tree = new ArithmeticExpression(OP_MODULO159) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MODULO159_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_negative_expression_in_multiplicative_expression2085);
            	    negative_expression160=negative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, negative_expression160.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
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

        Token OP_MINUS161=null;
        OmttParser.functional_expression_return functional_expression162 = null;

        OmttParser.functional_expression_return functional_expression163 = null;


        Object OP_MINUS161_tree=null;
        RewriteRuleTokenStream stream_OP_MINUS=new RewriteRuleTokenStream(adaptor,"token OP_MINUS");
        RewriteRuleSubtreeStream stream_functional_expression=new RewriteRuleSubtreeStream(adaptor,"rule functional_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:301:2: ( OP_MINUS functional_expression -> ^( OP_MINUS functional_expression ) | functional_expression )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==OP_MINUS) ) {
                alt53=1;
            }
            else if ( ((LA53_0>=STRING_LITERAL && LA53_0<=REAL_NUMBER)||LA53_0==DATA_START||LA53_0==NULL||(LA53_0>=TRUE && LA53_0<=FALSE)||(LA53_0>=TILDE && LA53_0<=LEFT_PAREN)||LA53_0==OP_GENERAL||LA53_0==VAR_ID) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:301:4: OP_MINUS functional_expression
                    {
                    OP_MINUS161=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_negative_expression2104);  
                    stream_OP_MINUS.add(OP_MINUS161);

                    pushFollow(FOLLOW_functional_expression_in_negative_expression2106);
                    functional_expression162=functional_expression();

                    state._fsp--;

                    stream_functional_expression.add(functional_expression162.getTree());


                    // AST REWRITE
                    // elements: OP_MINUS, functional_expression
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

                    pushFollow(FOLLOW_functional_expression_in_negative_expression2124);
                    functional_expression163=functional_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, functional_expression163.getTree());

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

        OmttParser.call_expression_return call_expression164 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:309:3: ( call_expression )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:309:5: call_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_call_expression_in_functional_expression2138);
            call_expression164=call_expression();

            state._fsp--;

            adaptor.addChild(root_0, call_expression164.getTree());

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

        OmttParser.atom_expression_return atom_expression165 = null;

        OmttParser.function_argument_return function_argument166 = null;


        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_function_argument=new RewriteRuleSubtreeStream(adaptor,"rule function_argument");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:313:3: ( atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:313:5: atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            {
            pushFollow(FOLLOW_atom_expression_in_call_expression2151);
            atom_expression165=atom_expression();

            state._fsp--;

            stream_atom_expression.add(atom_expression165.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:314:5: ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=STRING_LITERAL && LA55_0<=REAL_NUMBER)||LA55_0==DATA_START||LA55_0==NULL||(LA55_0>=TRUE && LA55_0<=FALSE)||(LA55_0>=TILDE && LA55_0<=LEFT_PAREN)||LA55_0==OP_GENERAL||LA55_0==VAR_ID) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=CONTENT && LA55_0<=TAG_END)||(LA55_0>=EXPRESSION_END && LA55_0<=OP_DATA_IS_EXPRESSION)||(LA55_0>=AND && LA55_0<=IN)||LA55_0==ELSE||(LA55_0>=COLON && LA55_0<=SEMICOLON)||LA55_0==SLASH||LA55_0==RIGHT_PAREN||(LA55_0>=RIGHT_SQUARE_PAREN && LA55_0<=OP_GE)||(LA55_0>=OP_AND && LA55_0<=OP_OR)||(LA55_0>=OP_CONTEXT && LA55_0<=OP_EXPRESSION_CONTEXT)||LA55_0==OP_CONCAT) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:314:7: ( function_argument )+
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:314:7: ( function_argument )+
                    int cnt54=0;
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( ((LA54_0>=STRING_LITERAL && LA54_0<=REAL_NUMBER)||LA54_0==DATA_START||LA54_0==NULL||(LA54_0>=TRUE && LA54_0<=FALSE)||(LA54_0>=TILDE && LA54_0<=LEFT_PAREN)||LA54_0==OP_GENERAL||LA54_0==VAR_ID) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:314:7: function_argument
                    	    {
                    	    pushFollow(FOLLOW_function_argument_in_call_expression2159);
                    	    function_argument166=function_argument();

                    	    state._fsp--;

                    	    stream_function_argument.add(function_argument166.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt54 >= 1 ) break loop54;
                                EarlyExitException eee =
                                    new EarlyExitException(54, input);
                                throw eee;
                        }
                        cnt54++;
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

        Token TAG_START167=null;
        Token TAG_END169=null;
        OmttParser.namespace_id_return ident = null;

        OmttParser.tag_content_return content = null;

        OmttParser.function_arguments_return function_arguments168 = null;


        Object TAG_START167_tree=null;
        Object TAG_END169_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_namespace_id=new RewriteRuleSubtreeStream(adaptor,"rule namespace_id");
        RewriteRuleSubtreeStream stream_function_arguments=new RewriteRuleSubtreeStream(adaptor,"rule function_arguments");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:321:3: ( TAG_START ident= namespace_id function_arguments (content= tag_content )? TAG_END -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( function_arguments )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:321:5: TAG_START ident= namespace_id function_arguments (content= tag_content )? TAG_END
            {
            TAG_START167=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_call_tag2219);  
            stream_TAG_START.add(TAG_START167);

            pushFollow(FOLLOW_namespace_id_in_call_tag2223);
            ident=namespace_id();

            state._fsp--;

            stream_namespace_id.add(ident.getTree());
            pushFollow(FOLLOW_function_arguments_in_call_tag2225);
            function_arguments168=function_arguments();

            state._fsp--;

            stream_function_arguments.add(function_arguments168.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:322:5: (content= tag_content )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==CONTENT||LA56_0==OP_DATA_IS_EXPRESSION) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:322:6: content= tag_content
                    {
                    pushFollow(FOLLOW_tag_content_in_call_tag2234);
                    content=tag_content();

                    state._fsp--;

                    stream_tag_content.add(content.getTree());

                    }
                    break;

            }

            TAG_END169=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_call_tag2242);  
            stream_TAG_END.add(TAG_END169);



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

        OmttParser.function_argument_return function_argument170 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:327:3: ( ( function_argument )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:327:5: ( function_argument )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:327:5: ( function_argument )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=STRING_LITERAL && LA57_0<=REAL_NUMBER)||LA57_0==DATA_START||LA57_0==NULL||(LA57_0>=TRUE && LA57_0<=FALSE)||(LA57_0>=TILDE && LA57_0<=LEFT_PAREN)||LA57_0==OP_GENERAL||LA57_0==VAR_ID) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:327:5: function_argument
            	    {
            	    pushFollow(FOLLOW_function_argument_in_function_arguments2287);
            	    function_argument170=function_argument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function_argument170.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
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

        Token VAR_ID171=null;
        Token OP_ASSIGN172=null;
        OmttParser.atom_expression_return atom_expression173 = null;


        Object VAR_ID171_tree=null;
        Object OP_ASSIGN172_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:330:3: ( ( VAR_ID OP_ASSIGN )? atom_expression -> ^( ARGUMENT atom_expression ( VAR_ID )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:330:5: ( VAR_ID OP_ASSIGN )? atom_expression
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:330:5: ( VAR_ID OP_ASSIGN )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==VAR_ID) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==OP_ASSIGN) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:330:6: VAR_ID OP_ASSIGN
                    {
                    VAR_ID171=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_function_argument2303);  
                    stream_VAR_ID.add(VAR_ID171);

                    OP_ASSIGN172=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_function_argument2305);  
                    stream_OP_ASSIGN.add(OP_ASSIGN172);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_expression_in_function_argument2309);
            atom_expression173=atom_expression();

            state._fsp--;

            stream_atom_expression.add(atom_expression173.getTree());


            // AST REWRITE
            // elements: atom_expression, VAR_ID
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

        Token COMA174=null;
        OmttParser.atom_with_properties_return a = null;

        OmttParser.atom_with_properties_return atom_with_properties175 = null;


        Object COMA174_tree=null;
        RewriteRuleTokenStream stream_COMA=new RewriteRuleTokenStream(adaptor,"token COMA");
        RewriteRuleSubtreeStream stream_atom_with_properties=new RewriteRuleSubtreeStream(adaptor,"rule atom_with_properties");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:337:2: ( (a= atom_with_properties -> $a) ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:337:4: (a= atom_with_properties -> $a) ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:337:4: (a= atom_with_properties -> $a)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:337:5: a= atom_with_properties
            {
            pushFollow(FOLLOW_atom_with_properties_in_atom_expression2344);
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
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==COMA) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:338:5: ( COMA atom_with_properties )+
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:338:5: ( COMA atom_with_properties )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==COMA) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:338:6: COMA atom_with_properties
                    	    {
                    	    COMA174=(Token)match(input,COMA,FOLLOW_COMA_in_atom_expression2357);  
                    	    stream_COMA.add(COMA174);

                    	    pushFollow(FOLLOW_atom_with_properties_in_atom_expression2359);
                    	    atom_with_properties175=atom_with_properties();

                    	    state._fsp--;

                    	    stream_atom_with_properties.add(atom_with_properties175.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt59 >= 1 ) break loop59;
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
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
            pushFollow(FOLLOW_atom_with_selectors_in_atom_with_properties2391);
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
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==DOT) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:343:6: ps= property_selector
            	    {
            	    pushFollow(FOLLOW_property_selector_in_atom_with_properties2406);
            	    ps=property_selector();

            	    state._fsp--;

            	    stream_property_selector.add(ps.getTree());


            	    // AST REWRITE
            	    // elements: ps, atom_with_properties
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
            	    break loop61;
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

        OmttParser.atom_return atom176 = null;

        OmttParser.sequence_selectors_return sequence_selectors177 = null;


        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_sequence_selectors=new RewriteRuleSubtreeStream(adaptor,"rule sequence_selectors");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:348:2: ( atom ( sequence_selectors -> ^( ATOM_SELECT atom ( sequence_selectors )? ) | -> atom ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:348:4: atom ( sequence_selectors -> ^( ATOM_SELECT atom ( sequence_selectors )? ) | -> atom )
            {
            pushFollow(FOLLOW_atom_in_atom_with_selectors2445);
            atom176=atom();

            state._fsp--;

            stream_atom.add(atom176.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:349:3: ( sequence_selectors -> ^( ATOM_SELECT atom ( sequence_selectors )? ) | -> atom )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==AS||LA62_0==LEFT_SQUARE_PAREN) ) {
                alt62=1;
            }
            else if ( ((LA62_0>=STRING_LITERAL && LA62_0<=DATA_START)||(LA62_0>=EXPRESSION_END && LA62_0<=OP_DATA_IS_EXPRESSION)||(LA62_0>=AND && LA62_0<=IN)||LA62_0==ELSE||LA62_0==NULL||(LA62_0>=TRUE && LA62_0<=FALSE)||(LA62_0>=COLON && LA62_0<=DOT)||(LA62_0>=COMA && LA62_0<=RIGHT_PAREN)||(LA62_0>=RIGHT_SQUARE_PAREN && LA62_0<=OP_GE)||(LA62_0>=OP_AND && LA62_0<=OP_OR)||(LA62_0>=OP_CONTEXT && LA62_0<=OP_EXPRESSION_CONTEXT)||(LA62_0>=OP_CONCAT && LA62_0<=OP_GENERAL)||LA62_0==VAR_ID) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:349:5: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_atom_with_selectors2451);
                    sequence_selectors177=sequence_selectors();

                    state._fsp--;

                    stream_sequence_selectors.add(sequence_selectors177.getTree());


                    // AST REWRITE
                    // elements: atom, sequence_selectors
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

        Token DOT178=null;
        Token VAR_ID179=null;
        OmttParser.sequence_selectors_return sequence_selectors180 = null;


        Object DOT178_tree=null;
        Object VAR_ID179_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:355:3: ( DOT VAR_ID ( sequence_selectors )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:355:5: DOT VAR_ID ( sequence_selectors )?
            {
            root_0 = (Object)adaptor.nil();

            DOT178=(Token)match(input,DOT,FOLLOW_DOT_in_property_selector2493); 
            VAR_ID179=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_property_selector2496); 
            VAR_ID179_tree = (Object)adaptor.create(VAR_ID179);
            adaptor.addChild(root_0, VAR_ID179_tree);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:355:17: ( sequence_selectors )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==AS||LA63_0==LEFT_SQUARE_PAREN) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:355:17: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_property_selector2498);
                    sequence_selectors180=sequence_selectors();

                    state._fsp--;

                    adaptor.addChild(root_0, sequence_selectors180.getTree());

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

        OmttParser.type_selector_return type_selector181 = null;

        OmttParser.sequence_selector_return sequence_selector182 = null;

        OmttParser.alias_return alias183 = null;

        OmttParser.sequence_selector_return sequence_selector184 = null;

        OmttParser.alias_return alias185 = null;

        OmttParser.alias_return alias186 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:2: ( type_selector ( sequence_selector )? ( alias )? | sequence_selector ( alias )? | alias )
            int alt67=3;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==LEFT_SQUARE_PAREN) ) {
                int LA67_1 = input.LA(2);

                if ( ((LA67_1>=STRING_LITERAL && LA67_1<=REAL_NUMBER)||LA67_1==DATA_START||LA67_1==NULL||(LA67_1>=TRUE && LA67_1<=FALSE)||(LA67_1>=TILDE && LA67_1<=LEFT_PAREN)||LA67_1==OP_MINUS||LA67_1==OP_NOT||LA67_1==OP_GENERAL||LA67_1==VAR_ID) ) {
                    alt67=2;
                }
                else if ( (LA67_1==CLASS_ID) ) {
                    alt67=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA67_0==AS) ) {
                alt67=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:4: type_selector ( sequence_selector )? ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_selector_in_sequence_selectors2512);
                    type_selector181=type_selector();

                    state._fsp--;

                    adaptor.addChild(root_0, type_selector181.getTree());
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:18: ( sequence_selector )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==LEFT_SQUARE_PAREN) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:18: sequence_selector
                            {
                            pushFollow(FOLLOW_sequence_selector_in_sequence_selectors2514);
                            sequence_selector182=sequence_selector();

                            state._fsp--;

                            adaptor.addChild(root_0, sequence_selector182.getTree());

                            }
                            break;

                    }

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:37: ( alias )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==AS) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:37: alias
                            {
                            pushFollow(FOLLOW_alias_in_sequence_selectors2517);
                            alias183=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias183.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:359:4: sequence_selector ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_sequence_selector_in_sequence_selectors2523);
                    sequence_selector184=sequence_selector();

                    state._fsp--;

                    adaptor.addChild(root_0, sequence_selector184.getTree());
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:359:22: ( alias )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==AS) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:359:22: alias
                            {
                            pushFollow(FOLLOW_alias_in_sequence_selectors2525);
                            alias185=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias185.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:360:4: alias
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alias_in_sequence_selectors2531);
                    alias186=alias();

                    state._fsp--;

                    adaptor.addChild(root_0, alias186.getTree());

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

        Token LEFT_SQUARE_PAREN187=null;
        Token RIGHT_SQUARE_PAREN189=null;
        OmttParser.type_return type188 = null;


        Object LEFT_SQUARE_PAREN187_tree=null;
        Object RIGHT_SQUARE_PAREN189_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:363:3: ( LEFT_SQUARE_PAREN type RIGHT_SQUARE_PAREN -> ^( TYPE_SELECT type ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:363:5: LEFT_SQUARE_PAREN type RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN187=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_type_selector2544);  
            stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN187);

            pushFollow(FOLLOW_type_in_type_selector2546);
            type188=type();

            state._fsp--;

            stream_type.add(type188.getTree());
            RIGHT_SQUARE_PAREN189=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_type_selector2548);  
            stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN189);



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

        Token LEFT_SQUARE_PAREN190=null;
        Token RIGHT_SQUARE_PAREN192=null;
        OmttParser.boolean_expression_return boolean_expression191 = null;


        Object LEFT_SQUARE_PAREN190_tree=null;
        Object RIGHT_SQUARE_PAREN192_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_boolean_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:367:3: ( LEFT_SQUARE_PAREN boolean_expression RIGHT_SQUARE_PAREN -> ^( SEQUENCE_SELECT boolean_expression ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:367:5: LEFT_SQUARE_PAREN boolean_expression RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN190=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector2573);  
            stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN190);

            pushFollow(FOLLOW_boolean_expression_in_sequence_selector2575);
            boolean_expression191=boolean_expression();

            state._fsp--;

            stream_boolean_expression.add(boolean_expression191.getTree());
            RIGHT_SQUARE_PAREN192=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector2577);  
            stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN192);



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

        Token AS193=null;
        Token VAR_ID194=null;

        Object AS193_tree=null;
        Object VAR_ID194_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:371:2: ( AS VAR_ID -> ^( AS VAR_ID ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:371:4: AS VAR_ID
            {
            AS193=(Token)match(input,AS,FOLLOW_AS_in_alias2601);  
            stream_AS.add(AS193);

            VAR_ID194=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_alias2603);  
            stream_VAR_ID.add(VAR_ID194);



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

        Token DATA_START195=null;
        Token DATA_END197=null;
        OmttParser.data_body_atom_return data_body_atom196 = null;


        Object DATA_START195_tree=null;
        Object DATA_END197_tree=null;
        RewriteRuleTokenStream stream_DATA_END=new RewriteRuleTokenStream(adaptor,"token DATA_END");
        RewriteRuleTokenStream stream_DATA_START=new RewriteRuleTokenStream(adaptor,"token DATA_START");
        RewriteRuleSubtreeStream stream_data_body_atom=new RewriteRuleSubtreeStream(adaptor,"rule data_body_atom");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:376:3: ( DATA_START ( data_body_atom )* DATA_END -> ^( DATA_START ( data_body_atom )* ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:376:5: DATA_START ( data_body_atom )* DATA_END
            {
            DATA_START195=(Token)match(input,DATA_START,FOLLOW_DATA_START_in_data_expression2625);  
            stream_DATA_START.add(DATA_START195);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:376:16: ( data_body_atom )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==STRING_LITERAL||LA68_0==TAG_START||LA68_0==EXPRESSION_START) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:376:16: data_body_atom
            	    {
            	    pushFollow(FOLLOW_data_body_atom_in_data_expression2627);
            	    data_body_atom196=data_body_atom();

            	    state._fsp--;

            	    stream_data_body_atom.add(data_body_atom196.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            DATA_END197=(Token)match(input,DATA_END,FOLLOW_DATA_END_in_data_expression2630);  
            stream_DATA_END.add(DATA_END197);



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

        Token DOUBLE_DOT199=null;
        OmttParser.selectable_atom_return selectable_atom198 = null;

        OmttParser.selectable_atom_return selectable_atom200 = null;


        Object DOUBLE_DOT199_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:381:2: ( selectable_atom ( DOUBLE_DOT selectable_atom )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:381:4: selectable_atom ( DOUBLE_DOT selectable_atom )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_selectable_atom_in_atom2658);
            selectable_atom198=selectable_atom();

            state._fsp--;

            adaptor.addChild(root_0, selectable_atom198.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:382:3: ( DOUBLE_DOT selectable_atom )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==DOUBLE_DOT) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:382:4: DOUBLE_DOT selectable_atom
                    {
                    DOUBLE_DOT199=(Token)match(input,DOUBLE_DOT,FOLLOW_DOUBLE_DOT_in_atom2663); 
                    DOUBLE_DOT199_tree = new Range(DOUBLE_DOT199) ;
                    root_0 = (Object)adaptor.becomeRoot(DOUBLE_DOT199_tree, root_0);

                    pushFollow(FOLLOW_selectable_atom_in_atom2669);
                    selectable_atom200=selectable_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, selectable_atom200.getTree());

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

        Token LEFT_PAREN204=null;
        Token RIGHT_PAREN206=null;
        OmttParser.object_atom_return object_atom201 = null;

        OmttParser.data_expression_return data_expression202 = null;

        OmttParser.namespace_id_return namespace_id203 = null;

        OmttParser.expression_return expression205 = null;


        Object LEFT_PAREN204_tree=null;
        Object RIGHT_PAREN206_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:386:3: ( object_atom | data_expression | namespace_id | LEFT_PAREN expression RIGHT_PAREN )
            int alt70=4;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
            case INT_NUMBER:
            case REAL_NUMBER:
            case NULL:
            case TRUE:
            case FALSE:
            case TILDE:
                {
                alt70=1;
                }
                break;
            case DATA_START:
                {
                alt70=2;
                }
                break;
            case OP_GENERAL:
            case VAR_ID:
                {
                alt70=3;
                }
                break;
            case LEFT_PAREN:
                {
                alt70=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:386:5: object_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_object_atom_in_selectable_atom2683);
                    object_atom201=object_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, object_atom201.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:387:5: data_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_data_expression_in_selectable_atom2689);
                    data_expression202=data_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, data_expression202.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:388:5: namespace_id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespace_id_in_selectable_atom2695);
                    namespace_id203=namespace_id();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace_id203.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:389:5: LEFT_PAREN expression RIGHT_PAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LEFT_PAREN204=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_selectable_atom2701); 
                    pushFollow(FOLLOW_expression_in_selectable_atom2704);
                    expression205=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression205.getTree());
                    RIGHT_PAREN206=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_selectable_atom2706); 

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
        Token OP_VIEW207=null;

        Object ns_tree=null;
        Object id_tree=null;
        Object OP_VIEW207_tree=null;
        RewriteRuleTokenStream stream_OP_GENERAL=new RewriteRuleTokenStream(adaptor,"token OP_GENERAL");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_VIEW=new RewriteRuleTokenStream(adaptor,"token OP_VIEW");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:392:3: ( (ns= VAR_ID OP_VIEW )? id= VAR_ID -> ^( IDENT[$id] ( $ns)? ) | id= OP_GENERAL -> ^( IDENT[$id] ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==VAR_ID) ) {
                alt72=1;
            }
            else if ( (LA72_0==OP_GENERAL) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:392:5: (ns= VAR_ID OP_VIEW )? id= VAR_ID
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:392:5: (ns= VAR_ID OP_VIEW )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==VAR_ID) ) {
                        int LA71_1 = input.LA(2);

                        if ( (LA71_1==OP_VIEW) ) {
                            alt71=1;
                        }
                    }
                    switch (alt71) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:392:6: ns= VAR_ID OP_VIEW
                            {
                            ns=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id2724);  
                            stream_VAR_ID.add(ns);

                            OP_VIEW207=(Token)match(input,OP_VIEW,FOLLOW_OP_VIEW_in_namespace_id2726);  
                            stream_OP_VIEW.add(OP_VIEW207);


                            }
                            break;

                    }

                    id=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id2732);  
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
                    id=(Token)match(input,OP_GENERAL,FOLLOW_OP_GENERAL_in_namespace_id2758);  
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

        Token STRING_LITERAL209=null;
        Token NULL210=null;
        Token TILDE211=null;
        Token TRUE212=null;
        Token FALSE213=null;
        OmttParser.number_atom_return number_atom208 = null;


        Object STRING_LITERAL209_tree=null;
        Object NULL210_tree=null;
        Object TILDE211_tree=null;
        Object TRUE212_tree=null;
        Object FALSE213_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:400:3: ( number_atom | STRING_LITERAL | ( NULL | TILDE ) | ( TRUE | FALSE ) )
            int alt75=4;
            switch ( input.LA(1) ) {
            case INT_NUMBER:
            case REAL_NUMBER:
                {
                alt75=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt75=2;
                }
                break;
            case NULL:
            case TILDE:
                {
                alt75=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt75=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:400:5: number_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_atom_in_object_atom2785);
                    number_atom208=number_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, number_atom208.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:401:5: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL209=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_object_atom2791); 
                    STRING_LITERAL209_tree = new Literal(STRING_LITERAL209) ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_LITERAL209_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:5: ( NULL | TILDE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:5: ( NULL | TILDE )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==NULL) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==TILDE) ) {
                        alt73=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:6: NULL
                            {
                            NULL210=(Token)match(input,NULL,FOLLOW_NULL_in_object_atom2802); 
                            NULL210_tree = new Literal(NULL210) ;
                            root_0 = (Object)adaptor.becomeRoot(NULL210_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:23: TILDE
                            {
                            TILDE211=(Token)match(input,TILDE,FOLLOW_TILDE_in_object_atom2810); 
                            TILDE211_tree = new Literal(TILDE211) ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE211_tree, root_0);


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
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==TRUE) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==FALSE) ) {
                        alt74=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:403:6: TRUE
                            {
                            TRUE212=(Token)match(input,TRUE,FOLLOW_TRUE_in_object_atom2823); 
                            TRUE212_tree = new Literal(TRUE212) ;
                            root_0 = (Object)adaptor.becomeRoot(TRUE212_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:403:23: FALSE
                            {
                            FALSE213=(Token)match(input,FALSE,FOLLOW_FALSE_in_object_atom2831); 
                            FALSE213_tree = new Literal(FALSE213) ;
                            root_0 = (Object)adaptor.becomeRoot(FALSE213_tree, root_0);


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

        Token INT_NUMBER214=null;
        Token REAL_NUMBER215=null;

        Object INT_NUMBER214_tree=null;
        Object REAL_NUMBER215_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:407:3: ( INT_NUMBER | REAL_NUMBER )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==INT_NUMBER) ) {
                alt76=1;
            }
            else if ( (LA76_0==REAL_NUMBER) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:407:5: INT_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    INT_NUMBER214=(Token)match(input,INT_NUMBER,FOLLOW_INT_NUMBER_in_number_atom2849); 
                    INT_NUMBER214_tree = new Literal(INT_NUMBER214) ;
                    root_0 = (Object)adaptor.becomeRoot(INT_NUMBER214_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:408:5: REAL_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    REAL_NUMBER215=(Token)match(input,REAL_NUMBER,FOLLOW_REAL_NUMBER_in_number_atom2859); 
                    REAL_NUMBER215_tree = new Literal(REAL_NUMBER215) ;
                    root_0 = (Object)adaptor.becomeRoot(REAL_NUMBER215_tree, root_0);


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
    protected DFA43 dfa43 = new DFA43(this);
    static final String DFA22_eotS =
        "\31\uffff";
    static final String DFA22_eofS =
        "\31\uffff";
    static final String DFA22_minS =
        "\1\31\1\uffff\2\31\2\uffff\5\31\1\115\2\31\1\115\6\31\2\115\2\31";
    static final String DFA22_maxS =
        "\1\146\1\uffff\2\144\2\uffff\1\144\1\146\2\144\1\146\1\120\2\144"+
        "\1\120\2\144\1\146\2\144\1\146\2\120\2\144";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\23\uffff";
    static final String DFA22_specialS =
        "\31\uffff}>";
    static final String[] DFA22_transitionS = {
            "\3\5\3\uffff\1\5\17\uffff\1\4\2\uffff\1\5\7\uffff\1\5\1\uffff"+
            "\1\5\1\1\2\5\2\uffff\1\1\6\uffff\1\2\1\5\4\uffff\1\5\13\uffff"+
            "\1\5\4\uffff\1\5\3\uffff\1\3\1\uffff\1\1",
            "",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\5\uffff\10\5\1\uffff\12\5\1\uffff\2\5\1\uffff\2\5\1\uffff"+
            "\2\5\3\uffff\1\6",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\2\uffff\1\1\2\uffff\4\5\1\10\2\5\1\7\1\uffff\2\5\1\11\7"+
            "\5\1\uffff\2\5\1\uffff\5\5\3\uffff\1\6",
            "",
            "",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\2\uffff\1\1\2\uffff\4\5\1\10\2\5\1\12\1\uffff\2\5\1\11"+
            "\12\5\1\uffff\5\5\3\uffff\1\6",
            "\3\5\3\uffff\1\5\34\uffff\1\5\1\uffff\2\5\11\uffff\2\5\4\uffff"+
            "\1\5\13\uffff\1\5\4\uffff\1\5\3\uffff\1\5\1\uffff\1\13",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\5\uffff\10\5\1\uffff\12\5\1\uffff\2\5\1\uffff\2\5\1\uffff"+
            "\2\5\3\uffff\1\6",
            "\3\5\3\uffff\1\5\34\uffff\1\5\1\uffff\2\5\2\uffff\1\1\6\uffff"+
            "\1\14\1\5\1\uffff\1\1\2\uffff\1\5\20\uffff\1\5\3\uffff\1\15",
            "\3\5\3\uffff\1\5\34\uffff\1\5\1\uffff\2\5\11\uffff\2\5\4\uffff"+
            "\1\5\13\uffff\1\5\4\uffff\1\5\3\uffff\1\5\1\uffff\1\16",
            "\1\17\2\uffff\1\5",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\5\uffff\10\5\1\uffff\12\5\1\uffff\2\5\1\uffff\2\5\1\uffff"+
            "\2\5\3\uffff\1\20",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\2\uffff\1\1\2\uffff\4\5\1\22\2\5\1\21\1\uffff\2\5\1\11"+
            "\7\5\1\uffff\2\5\1\uffff\5\5\3\uffff\1\20",
            "\1\23\2\uffff\1\5",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\2\uffff\1\1\2\uffff\1\5\1\uffff\2\5\1\10\3\5\1\uffff\12"+
            "\5\1\uffff\2\5\1\uffff\2\5\1\uffff\2\5\3\uffff\1\6",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\2\uffff\1\1\2\uffff\4\5\1\22\2\5\1\24\1\uffff\2\5\1\11"+
            "\12\5\1\uffff\5\5\3\uffff\1\20",
            "\3\5\3\uffff\1\5\34\uffff\1\5\1\uffff\2\5\11\uffff\2\5\4\uffff"+
            "\1\5\13\uffff\1\5\4\uffff\1\5\3\uffff\1\5\1\uffff\1\25",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\5\uffff\10\5\1\uffff\12\5\1\uffff\2\5\1\uffff\2\5\1\uffff"+
            "\2\5\3\uffff\1\20",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\2\uffff\1\1\2\uffff\1\5\1\uffff\2\5\1\10\3\5\1\uffff\12"+
            "\5\1\uffff\2\5\1\uffff\2\5\1\uffff\2\5\3\uffff\1\6",
            "\3\5\3\uffff\1\5\34\uffff\1\5\1\uffff\2\5\11\uffff\2\5\4\uffff"+
            "\1\5\13\uffff\1\5\4\uffff\1\5\3\uffff\1\5\1\uffff\1\26",
            "\1\27\2\uffff\1\5",
            "\1\30\2\uffff\1\5",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\2\uffff\1\1\2\uffff\1\5\1\uffff\2\5\1\22\3\5\1\uffff\12"+
            "\5\1\uffff\2\5\1\uffff\2\5\1\uffff\2\5\3\uffff\1\20",
            "\7\5\2\uffff\1\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\2\uffff\1\1\2\uffff\1\5\1\uffff\2\5\1\22\3\5\1\uffff\12"+
            "\5\1\uffff\2\5\1\uffff\2\5\1\uffff\2\5\3\uffff\1\20"
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
            return "116:1: expression : ( lambda_expression | def_in_expression | concatence_expression );";
        }
    }
    static final String DFA43_eotS =
        "\20\uffff";
    static final String DFA43_eofS =
        "\20\uffff";
    static final String DFA43_minS =
        "\1\34\1\uffff\1\31\2\uffff\2\31\1\uffff\4\31\2\115\2\31";
    static final String DFA43_maxS =
        "\1\137\1\uffff\1\144\2\uffff\2\144\1\uffff\1\144\1\146\1\144\1\146"+
        "\2\120\2\144";
    static final String DFA43_acceptS =
        "\1\uffff\1\4\1\uffff\1\3\1\2\2\uffff\1\1\10\uffff";
    static final String DFA43_specialS =
        "\20\uffff}>";
    static final String[] DFA43_transitionS = {
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
            "\1\7\1\uffff\2\7\2\uffff\1\4\5\7\1\uffff\1\12\2\7\1\11\3\uffff"+
            "\1\4\13\uffff\5\7\3\uffff\1\10",
            "",
            "\7\7\2\uffff\2\7\14\uffff\2\7\2\uffff\1\7\3\uffff\1\7\3\uffff"+
            "\1\7\1\uffff\2\7\2\uffff\1\4\5\7\1\uffff\1\12\2\7\1\13\3\uffff"+
            "\1\4\7\uffff\1\7\3\uffff\5\7\3\uffff\1\10",
            "\3\7\3\uffff\1\7\34\uffff\1\7\1\uffff\2\7\11\uffff\2\7\4\uffff"+
            "\1\7\13\uffff\1\7\4\uffff\1\7\3\uffff\1\7\1\uffff\1\14",
            "\7\7\2\uffff\2\7\14\uffff\2\7\2\uffff\1\7\3\uffff\1\7\3\uffff"+
            "\1\7\1\uffff\2\7\3\uffff\5\7\1\uffff\4\7\17\uffff\2\7\1\uffff"+
            "\2\7\3\uffff\1\10",
            "\3\7\3\uffff\1\7\34\uffff\1\7\1\uffff\2\7\11\uffff\2\7\4\uffff"+
            "\1\7\13\uffff\1\7\4\uffff\1\7\3\uffff\1\7\1\uffff\1\15",
            "\1\16\2\uffff\1\7",
            "\1\17\2\uffff\1\7",
            "\7\7\2\uffff\2\7\14\uffff\2\7\2\uffff\1\7\3\uffff\1\7\3\uffff"+
            "\1\7\1\uffff\2\7\2\uffff\1\4\3\7\1\uffff\1\7\1\uffff\1\12\3"+
            "\7\17\uffff\2\7\1\uffff\2\7\3\uffff\1\10",
            "\7\7\2\uffff\2\7\14\uffff\2\7\2\uffff\1\7\3\uffff\1\7\3\uffff"+
            "\1\7\1\uffff\2\7\2\uffff\1\4\3\7\1\uffff\1\7\1\uffff\1\12\3"+
            "\7\17\uffff\2\7\1\uffff\2\7\3\uffff\1\10"
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
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
    public static final BitSet FOLLOW_IMPORT_in_import_declaration230 = new BitSet(new long[]{0x0000000000000000L,0x0000005100000000L});
    public static final BitSet FOLLOW_external_class_name_in_import_declaration234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_use_declaration263 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_module_id_in_use_declaration265 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_AS_in_use_declaration268 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_use_declaration270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_external_class_name311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DOT_in_external_class_name313 = new BitSet(new long[]{0x0000000000000000L,0x0000005100000000L});
    public static final BitSet FOLLOW_set_in_external_class_name318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_module_id339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DOT_in_module_id341 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_module_id346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_definition_in_definitions362 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TAG_START_in_tag_definition385 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DEF_in_tag_definition387 = new BitSet(new long[]{0x0080000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_definition_signature_in_tag_definition389 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_tag_definition395 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_tag_definition399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_signature431 = new BitSet(new long[]{0x0000000000000002L,0x0000001000200204L});
    public static final BitSet FOLLOW_DEFAULT_in_definition_signature433 = new BitSet(new long[]{0x0000000000000002L,0x0000001000200204L});
    public static final BitSet FOLLOW_OP_LE_in_definition_signature437 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_single_type_in_definition_signature441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_OP_GE_in_definition_signature443 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000204L});
    public static final BitSet FOLLOW_definition_argument_in_definition_signature447 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000204L});
    public static final BitSet FOLLOW_OP_FUNCTION_DEFINITION_in_definition_signature451 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_type_in_definition_signature455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_definition_argument509 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_argument514 = new BitSet(new long[]{0x0000000000000002L,0x0000000000011000L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_definition_argument516 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_definition_argument520 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_single_type_in_definition_argument522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_definition_argument524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content570 = new BitSet(new long[]{0x0000000222000002L});
    public static final BitSet FOLLOW_data_body_atom_in_tag_content576 = new BitSet(new long[]{0x0000000222000002L});
    public static final BitSet FOLLOW_OP_DATA_IS_EXPRESSION_in_tag_content599 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content601 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_tag_content607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_data_body_atom628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_inside_data_in_data_body_atom638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_inside_data_in_data_body_atom644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_START_in_expression_inside_data659 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_expression_inside_data662 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_EXPRESSION_END_in_expression_inside_data664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_tag_in_tag_inside_data680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_tag_in_tag_inside_data686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_tag_in_tag_inside_data692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_tag_in_tag_inside_data698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expression_in_expression714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_expression_in_expression720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concatence_expression_in_expression726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_def_in_expression741 = new BitSet(new long[]{0x0080000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression745 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_AND_in_def_in_expression752 = new BitSet(new long[]{0x0080000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression756 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_expression764 = new BitSet(new long[]{0xF40480008E000000L,0x000000510800860CL});
    public static final BitSet FOLLOW_COLON_in_def_in_expression766 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_def_in_expression771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_expression803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COLON_in_definition_inside_expression805 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_expression834 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_expression836 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag874 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DEF_in_def_in_tag876 = new BitSet(new long[]{0x0080000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag880 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag887 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_AND_in_def_in_tag889 = new BitSet(new long[]{0x0080000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag893 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag901 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_tag903 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_def_in_tag907 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_def_in_tag913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_tag945 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_definition_inside_tag949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_tag973 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_tag975 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_definition_inside_tag977 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_CONTENT_in_definition_inside_tag980 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_definition_inside_tag982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAMBDA_in_lambda_expression1021 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000208L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression1023 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000208L});
    public static final BitSet FOLLOW_COLON_in_lambda_expression1026 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_lambda_expression1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression1056 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000204L});
    public static final BitSet FOLLOW_OP_FUNCTION_DEFINITION_in_lambda_expression1059 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_lambda_expression1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_match_expression_in_lambda_expression1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_lambda_match_in_lambda_match_expression1101 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMICOLON_in_lambda_match_expression1104 = new BitSet(new long[]{0x2000000000000000L,0x0000005000000204L});
    public static final BitSet FOLLOW_single_lambda_match_in_lambda_match_expression1106 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_type_in_single_lambda_match1120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_OP_FUNCTION_DEFINITION_in_single_lambda_match1122 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_concatence_expression_in_single_lambda_match1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAMBDA_in_lambda_expression_no_context1135 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000200L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression_no_context1137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COLON_in_lambda_expression_no_context1139 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_atom_expression_in_lambda_expression_no_context1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression_no_context1168 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000204L});
    public static final BitSet FOLLOW_OP_FUNCTION_DEFINITION_in_lambda_expression_no_context1171 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_atom_expression_in_lambda_expression_no_context1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_ID_in_type1209 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_type1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_ID_in_single_type1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expression_in_concatence_expression1270 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_OP_CONCAT_in_concatence_expression1284 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_control_expression_in_concatence_expression1288 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_if_expression_in_control_expression1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_expression_in_control_expression1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_context_expression_in_control_expression1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_expression1343 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_context_expression_in_if_expression1347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COLON_in_if_expression1349 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_control_expression_in_if_expression1357 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_expression1363 = new BitSet(new long[]{0xF40480008E000000L,0x000000510800860CL});
    public static final BitSet FOLLOW_COLON_in_if_expression1365 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_control_expression_in_if_expression1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_if_tag1408 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_if_subtag_in_if_tag1414 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_if_tag1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_subtag1436 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_context_expression_in_if_subtag1440 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_if_subtag1448 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TAG_START_in_if_subtag1458 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_subtag1460 = new BitSet(new long[]{0x0004000810000000L});
    public static final BitSet FOLLOW_tag_content_in_if_subtag1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_subtag_in_if_subtag1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_map_expression1517 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_context_expression_in_map_expression1521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COLON_in_map_expression1523 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_control_expression_in_map_expression1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_map_tag1562 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_MAP_in_map_tag1564 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_context_expression_in_map_tag1568 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_map_tag1576 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_map_tag1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_context_expression1618 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_OP_CONTEXT_in_context_expression1632 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_atom_expression_in_context_expression1634 = new BitSet(new long[]{0xF40480008E000000L,0x0000005138008604L});
    public static final BitSet FOLLOW_function_arguments_in_context_expression1638 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_OP_CONTEXT_in_context_expression1678 = new BitSet(new long[]{0x2000000000000000L,0x0000001000000204L});
    public static final BitSet FOLLOW_lambda_expression_no_context_in_context_expression1680 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_OP_EXPRESSION_CONTEXT_in_context_expression1716 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_functional_expression_in_context_expression1720 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_boolean_binary_expression_in_boolean_expression1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression1774 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_boolean_binary_operator_in_boolean_binary_expression1777 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression1780 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_boolean_unary_operator_in_boolean_unary_expression1796 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_AND_in_boolean_binary_operator1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_OR_in_boolean_binary_operator1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_in_boolean_unary_operator1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression1865 = new BitSet(new long[]{0x0000000000000002L,0x0000000000FC0000L});
    public static final BitSet FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression1868 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression1871 = new BitSet(new long[]{0x0000000000000002L,0x0000000000FC0000L});
    public static final BitSet FOLLOW_OP_EQUAL_in_boolean_comparsion_operator1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LE_in_boolean_comparsion_operator1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LEQ_in_boolean_comparsion_operator1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GE_in_boolean_comparsion_operator1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GEQ_in_boolean_comparsion_operator1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1957 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_OP_PLUS_in_additive_expression1973 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_OP_MINUS_in_additive_expression1987 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2007 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression2027 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030100L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_multiplicative_expression2037 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_SLASH_in_multiplicative_expression2051 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_OP_MODULO_in_multiplicative_expression2065 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression2085 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030100L});
    public static final BitSet FOLLOW_OP_MINUS_in_negative_expression2104 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_functional_expression_in_negative_expression2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functional_expression_in_negative_expression2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_expression_in_functional_expression2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expression_in_call_expression2151 = new BitSet(new long[]{0xF40480008E000002L,0x0000005108008604L});
    public static final BitSet FOLLOW_function_argument_in_call_expression2159 = new BitSet(new long[]{0xF40480008E000002L,0x0000005108008604L});
    public static final BitSet FOLLOW_TAG_START_in_call_tag2219 = new BitSet(new long[]{0x0000000000000000L,0x0000001100000000L});
    public static final BitSet FOLLOW_namespace_id_in_call_tag2223 = new BitSet(new long[]{0xF4048008DE000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_function_arguments_in_call_tag2225 = new BitSet(new long[]{0x0000000850000000L});
    public static final BitSet FOLLOW_tag_content_in_call_tag2234 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_call_tag2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_argument_in_function_arguments2287 = new BitSet(new long[]{0xF40480008E000002L,0x0000005108008604L});
    public static final BitSet FOLLOW_VAR_ID_in_function_argument2303 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_function_argument2305 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_atom_expression_in_function_argument2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_with_properties_in_atom_expression2344 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMA_in_atom_expression2357 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_atom_with_properties_in_atom_expression2359 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_atom_with_selectors_in_atom_with_properties2391 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_property_selector_in_atom_with_properties2406 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_atom_in_atom_with_selectors2445 = new BitSet(new long[]{0x0100000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_sequence_selectors_in_atom_with_selectors2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_property_selector2493 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_property_selector2496 = new BitSet(new long[]{0x0100000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_sequence_selectors_in_property_selector2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_selector_in_sequence_selectors2512 = new BitSet(new long[]{0x0100000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors2514 = new BitSet(new long[]{0x0100000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors2523 = new BitSet(new long[]{0x0100000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_type_selector2544 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_type_in_type_selector2546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_type_selector2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector2573 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_boolean_expression_in_sequence_selector2575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_alias2601 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_alias2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_START_in_data_expression2625 = new BitSet(new long[]{0x0000000322000000L});
    public static final BitSet FOLLOW_data_body_atom_in_data_expression2627 = new BitSet(new long[]{0x0000000322000000L});
    public static final BitSet FOLLOW_DATA_END_in_data_expression2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectable_atom_in_atom2658 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_DOUBLE_DOT_in_atom2663 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_selectable_atom_in_atom2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_atom_in_selectable_atom2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_expression_in_selectable_atom2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_id_in_selectable_atom2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_selectable_atom2701 = new BitSet(new long[]{0xF40480008E000000L,0x0000005108008604L});
    public static final BitSet FOLLOW_expression_in_selectable_atom2704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_selectable_atom2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id2724 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_OP_VIEW_in_namespace_id2726 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GENERAL_in_namespace_id2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_atom_in_object_atom2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_object_atom2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_object_atom2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_object_atom2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_object_atom2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_object_atom2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_NUMBER_in_number_atom2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_NUMBER_in_number_atom2859 = new BitSet(new long[]{0x0000000000000002L});

}