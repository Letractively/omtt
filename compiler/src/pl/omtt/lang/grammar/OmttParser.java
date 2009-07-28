// $ANTLR 3.1.2 /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g 2009-07-28 21:37:06

package pl.omtt.lang.grammar;

import pl.omtt.lang.model.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class OmttParser extends AbstractOmttParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "HEADER", "USE", "USES", "IMPORT", "IMPORTS", "CLASS", "IDENT", "ATOM_SELECT", "PROPERTY_SELECT", "TYPE_SELECT", "SEQUENCE_SELECT", "ITERATE", "ARGUMENTS", "ARGUMENT", "RETURNS", "BLOCK", "IF_ELSE", "CALL", "CAST", "SEQUENCE", "STRING_LITERAL", "INT_NUMBER", "REAL_NUMBER", "CONTENT", "TAG_START", "TAG_END", "DATA_START", "DATA_END", "EXPRESSION_START", "EXPRESSION_END", "OP_DATA_IS_EXPRESSION", "IT", "ITEM", "COMMENT_SINGLE_LINE", "COMMENT_MULTI_LINE", "WS", "NEWLINE", "ACTION_ON_NEWLINE", "STRING_PARENS", "MODE_LEFT_PAREN", "MODE_RIGHT_PAREN", "MODULE", "DEF", "AND", "IN", "IF", "THEN", "ELSE", "AS", "IS", "MAP", "APPLY", "MATCH", "LAMBDA", "NULL", "TRUE", "FALSE", "INNER_TAG_KEYWORD", "SINGLE_TAG_KEYWORD", "OP_FOLLOW", "OP_REVERSE_FOLLOW", "OP_DOUBLE_FOLLOW", "COLON", "SEMICOLON", "DOT", "DOUBLE_DOT", "COMA", "SLASH", "TILDE", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_SQUARE_PAREN", "RIGHT_SQUARE_PAREN", "OP_PLUS", "OP_MINUS", "OP_MULTIPLY", "OP_MODULO", "OP_EQUAL", "OP_NOT_EQUAL", "OP_LEQ", "OP_LE", "OP_GEQ", "OP_GE", "OP_ASSIGN", "OP_AND", "OP_OR", "OP_NOT", "OP_CONTEXT", "OP_EXPRESSION_CONTEXT", "OP_VIEW", "OP_CONCAT", "OP_GENERAL", "OP_DATA", "SMALL_LETTER", "NAMECHAR", "VAR_ID", "BIG_LETTER", "CLASS_ID", "DIGIT", "INT_OR_REAL_NUMBER", "LETTER", "NOT_NAME", "DEFAULT"
    };
    public static final int CAST=23;
    public static final int OP_LE=85;
    public static final int OP_REVERSE_FOLLOW=65;
    public static final int INT_NUMBER=26;
    public static final int OP_AND=89;
    public static final int INT_OR_REAL_NUMBER=104;
    public static final int LETTER=105;
    public static final int OP_GEQ=86;
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
    public static final int NULL=59;
    public static final int ELSE=52;
    public static final int MATCH=57;
    public static final int SEMICOLON=68;
    public static final int SINGLE_TAG_KEYWORD=63;
    public static final int MODE_RIGHT_PAREN=45;
    public static final int CONTENT=28;
    public static final int DATA_START=31;
    public static final int EXPRESSION_START=33;
    public static final int NAMECHAR=99;
    public static final int SEQUENCE=24;
    public static final int INNER_TAG_KEYWORD=62;
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
    public static final int FALSE=61;
    public static final int STRING_PARENS=43;
    public static final int COMMENT_SINGLE_LINE=38;
    public static final int CLASS_ID=102;
    public static final int OP_CONCAT=95;
    public static final int SMALL_LETTER=98;
    public static final int APPLY=56;
    public static final int CLASS=10;
    public static final int DEF=47;
    public static final int OP_FOLLOW=64;
    public static final int OP_ASSIGN=88;
    public static final int EXPRESSION_END=34;
    public static final int OP_OR=90;
    public static final int TYPE_SELECT=14;
    public static final int AND=48;
    public static final int DATA_END=32;
    public static final int IF_ELSE=21;
    public static final int IF=50;
    public static final int COMMENT_MULTI_LINE=39;
    public static final int AS=53;
    public static final int RIGHT_PAREN=75;
    public static final int BIG_LETTER=101;
    public static final int SLASH=72;
    public static final int IN=49;
    public static final int THEN=51;
    public static final int LEFT_SQUARE_PAREN=76;
    public static final int IS=54;
    public static final int IT=36;
    public static final int TAG_START=29;
    public static final int ARGUMENT=18;
    public static final int RIGHT_SQUARE_PAREN=77;
    public static final int TILDE=73;
    public static final int OP_GENERAL=96;
    public static final int IDENT=11;
    public static final int OP_NOT=91;
    public static final int OP_DOUBLE_FOLLOW=66;
    public static final int DIGIT=103;
    public static final int LAMBDA=58;
    public static final int HEADER=5;
    public static final int DOT=69;
    public static final int NOT_NAME=106;
    public static final int OP_MULTIPLY=80;
    public static final int RETURNS=19;
    public static final int ITEM=37;
    public static final int OP_PLUS=78;
    public static final int DEFAULT=107;
    public static final int ATOM_SELECT=12;
    public static final int MODULE=46;
    public static final int COMA=71;
    public static final int TRUE=60;
    public static final int OP_VIEW=94;
    public static final int OP_MODULO=81;
    public static final int COLON=67;
    public static final int ITERATE=16;
    public static final int TAG_END=30;
    public static final int NEWLINE=41;
    public static final int BLOCK=20;
    public static final int MAP=55;
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
            // elements: VAR_ID, module_id, USE
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
            // elements: definition_context, ret_type, definition_argument, VAR_ID, DEFAULT
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
            // elements: OP_MULTIPLY, type, TILDE
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

                            if ( (LA18_2==DEF||LA18_2==IF||(LA18_2>=MAP && LA18_2<=APPLY)||LA18_2==OP_GENERAL||LA18_2==VAR_ID) ) {
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:110:10: fragment tag_inside_data : ( def_in_tag | if_tag | call_tag | map_tag | apply_tag );
    public final OmttParser.tag_inside_data_return tag_inside_data() throws RecognitionException {
        OmttParser.tag_inside_data_return retval = new OmttParser.tag_inside_data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.def_in_tag_return def_in_tag55 = null;

        OmttParser.if_tag_return if_tag56 = null;

        OmttParser.call_tag_return call_tag57 = null;

        OmttParser.map_tag_return map_tag58 = null;

        OmttParser.apply_tag_return apply_tag59 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:111:3: ( def_in_tag | if_tag | call_tag | map_tag | apply_tag )
            int alt21=5;
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
                case APPLY:
                    {
                    alt21=5;
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
                case 5 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:115:5: apply_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_apply_tag_in_tag_inside_data717);
                    apply_tag59=apply_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, apply_tag59.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:121:1: expression : ( lambda_expression | def_in_expression | match_expression | concatence_expression );
    public final OmttParser.expression_return expression() throws RecognitionException {
        OmttParser.expression_return retval = new OmttParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.lambda_expression_return lambda_expression60 = null;

        OmttParser.def_in_expression_return def_in_expression61 = null;

        OmttParser.match_expression_return match_expression62 = null;

        OmttParser.concatence_expression_return concatence_expression63 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:122:3: ( lambda_expression | def_in_expression | match_expression | concatence_expression )
            int alt22=4;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:122:5: lambda_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expression_in_expression733);
                    lambda_expression60=lambda_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, lambda_expression60.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:123:5: def_in_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_def_in_expression_in_expression739);
                    def_in_expression61=def_in_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, def_in_expression61.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:124:5: match_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_match_expression_in_expression745);
                    match_expression62=match_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, match_expression62.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:125:5: concatence_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_concatence_expression_in_expression751);
                    concatence_expression63=concatence_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, concatence_expression63.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:130:1: def_in_expression : DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.def_in_expression_return def_in_expression() throws RecognitionException {
        OmttParser.def_in_expression_return retval = new OmttParser.def_in_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEF64=null;
        Token AND65=null;
        Token IN66=null;
        Token COLON67=null;
        List list_definition=null;
        OmttParser.expression_return content = null;

        OmttParser.definition_inside_expression_return definition = null;
         definition = null;
        Object DEF64_tree=null;
        Object AND65_tree=null;
        Object IN66_tree=null;
        Object COLON67_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_inside_expression=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:131:3: ( DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:131:5: DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression
            {
            DEF64=(Token)match(input,DEF,FOLLOW_DEF_in_def_in_expression766);  
            stream_DEF.add(DEF64);

            pushFollow(FOLLOW_definition_inside_expression_in_def_in_expression770);
            definition=definition_inside_expression();

            state._fsp--;

            stream_definition_inside_expression.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:132:5: ( AND definition+= definition_inside_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:132:6: AND definition+= definition_inside_expression
            	    {
            	    AND65=(Token)match(input,AND,FOLLOW_AND_in_def_in_expression777);  
            	    stream_AND.add(AND65);

            	    pushFollow(FOLLOW_definition_inside_expression_in_def_in_expression781);
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

            IN66=(Token)match(input,IN,FOLLOW_IN_in_def_in_expression789);  
            stream_IN.add(IN66);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:133:8: ( COLON )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==COLON) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:133:8: COLON
                    {
                    COLON67=(Token)match(input,COLON,FOLLOW_COLON_in_def_in_expression791);  
                    stream_COLON.add(COLON67);


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_def_in_expression796);
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
            // 134:5: -> ^( BLOCK ( $definition)+ $content)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:134:8: ^( BLOCK ( $definition)+ $content)
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:136:1: definition_inside_expression : ( definition_signature COLON expression -> ^( DEF definition_signature expression ) | VAR_ID OP_ASSIGN expression -> ^( DEF VAR_ID expression ) );
    public final OmttParser.definition_inside_expression_return definition_inside_expression() throws RecognitionException {
        OmttParser.definition_inside_expression_return retval = new OmttParser.definition_inside_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON69=null;
        Token VAR_ID71=null;
        Token OP_ASSIGN72=null;
        OmttParser.definition_signature_return definition_signature68 = null;

        OmttParser.expression_return expression70 = null;

        OmttParser.expression_return expression73 = null;


        Object COLON69_tree=null;
        Object VAR_ID71_tree=null;
        Object OP_ASSIGN72_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_signature=new RewriteRuleSubtreeStream(adaptor,"rule definition_signature");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:137:3: ( definition_signature COLON expression -> ^( DEF definition_signature expression ) | VAR_ID OP_ASSIGN expression -> ^( DEF VAR_ID expression ) )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:137:5: definition_signature COLON expression
                    {
                    pushFollow(FOLLOW_definition_signature_in_definition_inside_expression828);
                    definition_signature68=definition_signature();

                    state._fsp--;

                    stream_definition_signature.add(definition_signature68.getTree());
                    COLON69=(Token)match(input,COLON,FOLLOW_COLON_in_definition_inside_expression830);  
                    stream_COLON.add(COLON69);

                    pushFollow(FOLLOW_expression_in_definition_inside_expression836);
                    expression70=expression();

                    state._fsp--;

                    stream_expression.add(expression70.getTree());


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
                    // 139:5: -> ^( DEF definition_signature expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:139:8: ^( DEF definition_signature expression )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:140:5: VAR_ID OP_ASSIGN expression
                    {
                    VAR_ID71=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_inside_expression859);  
                    stream_VAR_ID.add(VAR_ID71);

                    OP_ASSIGN72=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_inside_expression861);  
                    stream_OP_ASSIGN.add(OP_ASSIGN72);

                    pushFollow(FOLLOW_expression_in_definition_inside_expression866);
                    expression73=expression();

                    state._fsp--;

                    stream_expression.add(expression73.getTree());


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
                    // 142:5: -> ^( DEF VAR_ID expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:142:8: ^( DEF VAR_ID expression )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:145:1: def_in_tag : TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.def_in_tag_return def_in_tag() throws RecognitionException {
        OmttParser.def_in_tag_return retval = new OmttParser.def_in_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START74=null;
        Token DEF75=null;
        Token TAG_START76=null;
        Token AND77=null;
        Token TAG_START78=null;
        Token IN79=null;
        Token TAG_END80=null;
        List list_definition=null;
        OmttParser.tag_content_return content = null;

        OmttParser.definition_inside_tag_return definition = null;
         definition = null;
        Object TAG_START74_tree=null;
        Object DEF75_tree=null;
        Object TAG_START76_tree=null;
        Object AND77_tree=null;
        Object TAG_START78_tree=null;
        Object IN79_tree=null;
        Object TAG_END80_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_definition_inside_tag=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_tag");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:146:3: ( TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:146:5: TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END
            {
            TAG_START74=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag899);  
            stream_TAG_START.add(TAG_START74);

            DEF75=(Token)match(input,DEF,FOLLOW_DEF_in_def_in_tag901);  
            stream_DEF.add(DEF75);

            pushFollow(FOLLOW_definition_inside_tag_in_def_in_tag905);
            definition=definition_inside_tag();

            state._fsp--;

            stream_definition_inside_tag.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:147:5: ( TAG_START AND definition+= definition_inside_tag )*
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
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:147:6: TAG_START AND definition+= definition_inside_tag
            	    {
            	    TAG_START76=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag912);  
            	    stream_TAG_START.add(TAG_START76);

            	    AND77=(Token)match(input,AND,FOLLOW_AND_in_def_in_tag914);  
            	    stream_AND.add(AND77);

            	    pushFollow(FOLLOW_definition_inside_tag_in_def_in_tag918);
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

            TAG_START78=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag926);  
            stream_TAG_START.add(TAG_START78);

            IN79=(Token)match(input,IN,FOLLOW_IN_in_def_in_tag928);  
            stream_IN.add(IN79);

            pushFollow(FOLLOW_tag_content_in_def_in_tag932);
            content=tag_content();

            state._fsp--;

            stream_tag_content.add(content.getTree());
            TAG_END80=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_def_in_tag938);  
            stream_TAG_END.add(TAG_END80);



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
            // 150:5: -> ^( BLOCK ( $definition)+ $content)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:150:8: ^( BLOCK ( $definition)+ $content)
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:152:1: definition_inside_tag : ( definition_signature content= tag_content -> ^( DEF definition_signature $content) | VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )? -> ^( DEF VAR_ID expression ) );
    public final OmttParser.definition_inside_tag_return definition_inside_tag() throws RecognitionException {
        OmttParser.definition_inside_tag_return retval = new OmttParser.definition_inside_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID82=null;
        Token OP_ASSIGN83=null;
        Token CONTENT85=null;
        Token STRING_LITERAL86=null;
        OmttParser.tag_content_return content = null;

        OmttParser.definition_signature_return definition_signature81 = null;

        OmttParser.expression_return expression84 = null;


        Object VAR_ID82_tree=null;
        Object OP_ASSIGN83_tree=null;
        Object CONTENT85_tree=null;
        Object STRING_LITERAL86_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_CONTENT=new RewriteRuleTokenStream(adaptor,"token CONTENT");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_signature=new RewriteRuleSubtreeStream(adaptor,"rule definition_signature");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:153:3: ( definition_signature content= tag_content -> ^( DEF definition_signature $content) | VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )? -> ^( DEF VAR_ID expression ) )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:153:5: definition_signature content= tag_content
                    {
                    pushFollow(FOLLOW_definition_signature_in_definition_inside_tag970);
                    definition_signature81=definition_signature();

                    state._fsp--;

                    stream_definition_signature.add(definition_signature81.getTree());
                    pushFollow(FOLLOW_tag_content_in_definition_inside_tag974);
                    content=tag_content();

                    state._fsp--;

                    stream_tag_content.add(content.getTree());


                    // AST REWRITE
                    // elements: content, definition_signature
                    // token labels: 
                    // rule labels: content, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"rule content",content!=null?content.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 154:5: -> ^( DEF definition_signature $content)
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:154:8: ^( DEF definition_signature $content)
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:155:5: VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )?
                    {
                    VAR_ID82=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_inside_tag998);  
                    stream_VAR_ID.add(VAR_ID82);

                    OP_ASSIGN83=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_inside_tag1000);  
                    stream_OP_ASSIGN.add(OP_ASSIGN83);

                    pushFollow(FOLLOW_expression_in_definition_inside_tag1002);
                    expression84=expression();

                    state._fsp--;

                    stream_expression.add(expression84.getTree());
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:155:33: ( CONTENT ( STRING_LITERAL )? )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==CONTENT) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:155:34: CONTENT ( STRING_LITERAL )?
                            {
                            CONTENT85=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_definition_inside_tag1005);  
                            stream_CONTENT.add(CONTENT85);

                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:155:42: ( STRING_LITERAL )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==STRING_LITERAL) ) {
                                alt27=1;
                            }
                            switch (alt27) {
                                case 1 :
                                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:155:42: STRING_LITERAL
                                    {
                                    STRING_LITERAL86=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_definition_inside_tag1007);  
                                    stream_STRING_LITERAL.add(STRING_LITERAL86);


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
                    // 156:5: -> ^( DEF VAR_ID expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:156:8: ^( DEF VAR_ID expression )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:162:1: lambda_expression : ( LAMBDA ( definition_argument )* COLON expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | ( definition_argument )* OP_FOLLOW expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | lambda_match_expression );
    public final OmttParser.lambda_expression_return lambda_expression() throws RecognitionException {
        OmttParser.lambda_expression_return retval = new OmttParser.lambda_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAMBDA87=null;
        Token COLON89=null;
        Token OP_FOLLOW92=null;
        OmttParser.definition_argument_return definition_argument88 = null;

        OmttParser.expression_return expression90 = null;

        OmttParser.definition_argument_return definition_argument91 = null;

        OmttParser.expression_return expression93 = null;

        OmttParser.lambda_match_expression_return lambda_match_expression94 = null;


        Object LAMBDA87_tree=null;
        Object COLON89_tree=null;
        Object OP_FOLLOW92_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_LAMBDA=new RewriteRuleTokenStream(adaptor,"token LAMBDA");
        RewriteRuleTokenStream stream_OP_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_FOLLOW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_argument=new RewriteRuleSubtreeStream(adaptor,"rule definition_argument");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:163:3: ( LAMBDA ( definition_argument )* COLON expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | ( definition_argument )* OP_FOLLOW expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | lambda_match_expression )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:163:5: LAMBDA ( definition_argument )* COLON expression
                    {
                    LAMBDA87=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambda_expression1046);  
                    stream_LAMBDA.add(LAMBDA87);

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:163:12: ( definition_argument )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==TILDE||LA30_0==VAR_ID) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:163:12: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_lambda_expression1048);
                    	    definition_argument88=definition_argument();

                    	    state._fsp--;

                    	    stream_definition_argument.add(definition_argument88.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    COLON89=(Token)match(input,COLON,FOLLOW_COLON_in_lambda_expression1051);  
                    stream_COLON.add(COLON89);

                    pushFollow(FOLLOW_expression_in_lambda_expression1053);
                    expression90=expression();

                    state._fsp--;

                    stream_expression.add(expression90.getTree());


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
                    // 164:5: -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:164:8: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(stream_LAMBDA.nextToken()), root_1);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:164:35: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:164:47: ( definition_argument )*
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:165:5: ( definition_argument )* OP_FOLLOW expression
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:165:5: ( definition_argument )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==TILDE||LA31_0==VAR_ID) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:165:5: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_lambda_expression1081);
                    	    definition_argument91=definition_argument();

                    	    state._fsp--;

                    	    stream_definition_argument.add(definition_argument91.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    OP_FOLLOW92=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_lambda_expression1084);  
                    stream_OP_FOLLOW.add(OP_FOLLOW92);

                    pushFollow(FOLLOW_expression_in_lambda_expression1086);
                    expression93=expression();

                    state._fsp--;

                    stream_expression.add(expression93.getTree());


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
                    // 166:4: -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:166:7: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(LAMBDA), root_1);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:166:34: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:166:46: ( definition_argument )*
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:167:5: lambda_match_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lambda_match_expression_in_lambda_expression1113);
                    lambda_match_expression94=lambda_match_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, lambda_match_expression94.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:169:10: fragment lambda_match_expression : single_lambda_match ( SEMICOLON single_lambda_match )* ;
    public final OmttParser.lambda_match_expression_return lambda_match_expression() throws RecognitionException {
        OmttParser.lambda_match_expression_return retval = new OmttParser.lambda_match_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON96=null;
        OmttParser.single_lambda_match_return single_lambda_match95 = null;

        OmttParser.single_lambda_match_return single_lambda_match97 = null;


        Object SEMICOLON96_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:170:2: ( single_lambda_match ( SEMICOLON single_lambda_match )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:170:4: single_lambda_match ( SEMICOLON single_lambda_match )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_lambda_match_in_lambda_match_expression1126);
            single_lambda_match95=single_lambda_match();

            state._fsp--;

            adaptor.addChild(root_0, single_lambda_match95.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:170:24: ( SEMICOLON single_lambda_match )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==SEMICOLON) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:170:25: SEMICOLON single_lambda_match
            	    {
            	    SEMICOLON96=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_lambda_match_expression1129); 
            	    SEMICOLON96_tree = (Object)adaptor.create(SEMICOLON96);
            	    adaptor.addChild(root_0, SEMICOLON96_tree);

            	    pushFollow(FOLLOW_single_lambda_match_in_lambda_match_expression1131);
            	    single_lambda_match97=single_lambda_match();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_lambda_match97.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:172:10: fragment single_lambda_match : type OP_FOLLOW concatence_expression ;
    public final OmttParser.single_lambda_match_return single_lambda_match() throws RecognitionException {
        OmttParser.single_lambda_match_return retval = new OmttParser.single_lambda_match_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_FOLLOW99=null;
        OmttParser.type_return type98 = null;

        OmttParser.concatence_expression_return concatence_expression100 = null;


        Object OP_FOLLOW99_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:173:2: ( type OP_FOLLOW concatence_expression )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:173:4: type OP_FOLLOW concatence_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_single_lambda_match1145);
            type98=type();

            state._fsp--;

            adaptor.addChild(root_0, type98.getTree());
            OP_FOLLOW99=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_single_lambda_match1147); 
            OP_FOLLOW99_tree = (Object)adaptor.create(OP_FOLLOW99);
            adaptor.addChild(root_0, OP_FOLLOW99_tree);

            pushFollow(FOLLOW_concatence_expression_in_single_lambda_match1149);
            concatence_expression100=concatence_expression();

            state._fsp--;

            adaptor.addChild(root_0, concatence_expression100.getTree());

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

    public static class match_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "match_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:176:1: match_expression : MATCH expression COLON expr= lambda_match_expression -> ^( CALL[true] $expr ^( ARGUMENT expression ) ) ;
    public final OmttParser.match_expression_return match_expression() throws RecognitionException {
        OmttParser.match_expression_return retval = new OmttParser.match_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MATCH101=null;
        Token COLON103=null;
        OmttParser.lambda_match_expression_return expr = null;

        OmttParser.expression_return expression102 = null;


        Object MATCH101_tree=null;
        Object COLON103_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MATCH=new RewriteRuleTokenStream(adaptor,"token MATCH");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_lambda_match_expression=new RewriteRuleSubtreeStream(adaptor,"rule lambda_match_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:177:3: ( MATCH expression COLON expr= lambda_match_expression -> ^( CALL[true] $expr ^( ARGUMENT expression ) ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:177:5: MATCH expression COLON expr= lambda_match_expression
            {
            MATCH101=(Token)match(input,MATCH,FOLLOW_MATCH_in_match_expression1161);  
            stream_MATCH.add(MATCH101);

            pushFollow(FOLLOW_expression_in_match_expression1163);
            expression102=expression();

            state._fsp--;

            stream_expression.add(expression102.getTree());
            COLON103=(Token)match(input,COLON,FOLLOW_COLON_in_match_expression1165);  
            stream_COLON.add(COLON103);

            pushFollow(FOLLOW_lambda_match_expression_in_match_expression1173);
            expr=lambda_match_expression();

            state._fsp--;

            stream_lambda_match_expression.add(expr.getTree());


            // AST REWRITE
            // elements: expr, expression
            // token labels: 
            // rule labels: retval, expr
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.tree:null);

            root_0 = (Object)adaptor.nil();
            // 179:5: -> ^( CALL[true] $expr ^( ARGUMENT expression ) )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:179:8: ^( CALL[true] $expr ^( ARGUMENT expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:179:33: ^( ARGUMENT expression )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
    // $ANTLR end "match_expression"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:182:10: fragment type : CLASS_ID ( OP_MULTIPLY )? -> ^( CLASS_ID ( OP_MULTIPLY )? ) ;
    public final OmttParser.type_return type() throws RecognitionException {
        OmttParser.type_return retval = new OmttParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS_ID104=null;
        Token OP_MULTIPLY105=null;

        Object CLASS_ID104_tree=null;
        Object OP_MULTIPLY105_tree=null;
        RewriteRuleTokenStream stream_OP_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token OP_MULTIPLY");
        RewriteRuleTokenStream stream_CLASS_ID=new RewriteRuleTokenStream(adaptor,"token CLASS_ID");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:183:3: ( CLASS_ID ( OP_MULTIPLY )? -> ^( CLASS_ID ( OP_MULTIPLY )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:183:5: CLASS_ID ( OP_MULTIPLY )?
            {
            CLASS_ID104=(Token)match(input,CLASS_ID,FOLLOW_CLASS_ID_in_type1214);  
            stream_CLASS_ID.add(CLASS_ID104);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:183:14: ( OP_MULTIPLY )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==OP_MULTIPLY) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:183:14: OP_MULTIPLY
                    {
                    OP_MULTIPLY105=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_type1216);  
                    stream_OP_MULTIPLY.add(OP_MULTIPLY105);


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
            // 184:4: -> ^( CLASS_ID ( OP_MULTIPLY )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:184:7: ^( CLASS_ID ( OP_MULTIPLY )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TypeReference(stream_CLASS_ID.nextToken()), root_1);

                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:184:33: ( OP_MULTIPLY )?
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:186:10: fragment single_type : CLASS_ID -> ^( CLASS_ID ) ;
    public final OmttParser.single_type_return single_type() throws RecognitionException {
        OmttParser.single_type_return retval = new OmttParser.single_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS_ID106=null;

        Object CLASS_ID106_tree=null;
        RewriteRuleTokenStream stream_CLASS_ID=new RewriteRuleTokenStream(adaptor,"token CLASS_ID");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:187:3: ( CLASS_ID -> ^( CLASS_ID ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:187:5: CLASS_ID
            {
            CLASS_ID106=(Token)match(input,CLASS_ID,FOLLOW_CLASS_ID_in_single_type1246);  
            stream_CLASS_ID.add(CLASS_ID106);



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
            // 188:4: -> ^( CLASS_ID )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:188:7: ^( CLASS_ID )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:193:1: concatence_expression : (expr+= control_expression -> $expr) ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )? ;
    public final OmttParser.concatence_expression_return concatence_expression() throws RecognitionException {
        OmttParser.concatence_expression_return retval = new OmttParser.concatence_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_CONCAT107=null;
        List list_expr=null;
        OmttParser.control_expression_return expr = null;
         expr = null;
        Object OP_CONCAT107_tree=null;
        RewriteRuleTokenStream stream_OP_CONCAT=new RewriteRuleTokenStream(adaptor,"token OP_CONCAT");
        RewriteRuleSubtreeStream stream_control_expression=new RewriteRuleSubtreeStream(adaptor,"rule control_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:194:3: ( (expr+= control_expression -> $expr) ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:194:5: (expr+= control_expression -> $expr) ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:194:5: (expr+= control_expression -> $expr)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:194:6: expr+= control_expression
            {
            pushFollow(FOLLOW_control_expression_in_concatence_expression1275);
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
            // 194:31: -> $expr
            {
                adaptor.addChild(root_0, stream_expr.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:195:5: ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==OP_CONCAT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:195:6: ( OP_CONCAT expr+= control_expression )+
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:195:6: ( OP_CONCAT expr+= control_expression )+
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
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:195:7: OP_CONCAT expr+= control_expression
                    	    {
                    	    OP_CONCAT107=(Token)match(input,OP_CONCAT,FOLLOW_OP_CONCAT_in_concatence_expression1289);  
                    	    stream_OP_CONCAT.add(OP_CONCAT107);

                    	    pushFollow(FOLLOW_control_expression_in_concatence_expression1293);
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
                    // 195:44: -> ^( OP_CONCAT ( $expr)+ )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:195:47: ^( OP_CONCAT ( $expr)+ )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:198:1: control_expression : ( if_expression | map_expression | context_expression );
    public final OmttParser.control_expression_return control_expression() throws RecognitionException {
        OmttParser.control_expression_return retval = new OmttParser.control_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.if_expression_return if_expression108 = null;

        OmttParser.map_expression_return map_expression109 = null;

        OmttParser.context_expression_return context_expression110 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:199:3: ( if_expression | map_expression | context_expression )
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
            case APPLY:
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:199:5: if_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_expression_in_control_expression1323);
                    if_expression108=if_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, if_expression108.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:200:5: map_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_expression_in_control_expression1329);
                    map_expression109=map_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, map_expression109.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:201:5: context_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_context_expression_in_control_expression1335);
                    context_expression110=context_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, context_expression110.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:204:1: if_expression : IF condition= context_expression COLON part_if= control_expression ELSE ( COLON )? part_else= control_expression -> ^( IF_ELSE $condition $part_if $part_else) ;
    public final OmttParser.if_expression_return if_expression() throws RecognitionException {
        OmttParser.if_expression_return retval = new OmttParser.if_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF111=null;
        Token COLON112=null;
        Token ELSE113=null;
        Token COLON114=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.control_expression_return part_if = null;

        OmttParser.control_expression_return part_else = null;


        Object IF111_tree=null;
        Object COLON112_tree=null;
        Object ELSE113_tree=null;
        Object COLON114_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_control_expression=new RewriteRuleSubtreeStream(adaptor,"rule control_expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:205:3: ( IF condition= context_expression COLON part_if= control_expression ELSE ( COLON )? part_else= control_expression -> ^( IF_ELSE $condition $part_if $part_else) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:205:5: IF condition= context_expression COLON part_if= control_expression ELSE ( COLON )? part_else= control_expression
            {
            IF111=(Token)match(input,IF,FOLLOW_IF_in_if_expression1348);  
            stream_IF.add(IF111);

            pushFollow(FOLLOW_context_expression_in_if_expression1352);
            condition=context_expression();

            state._fsp--;

            stream_context_expression.add(condition.getTree());
            COLON112=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1354);  
            stream_COLON.add(COLON112);

            pushFollow(FOLLOW_control_expression_in_if_expression1362);
            part_if=control_expression();

            state._fsp--;

            stream_control_expression.add(part_if.getTree());
            ELSE113=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_expression1368);  
            stream_ELSE.add(ELSE113);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:207:10: ( COLON )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==COLON) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:207:10: COLON
                    {
                    COLON114=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1370);  
                    stream_COLON.add(COLON114);


                    }
                    break;

            }

            pushFollow(FOLLOW_control_expression_in_if_expression1379);
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
            // 209:5: -> ^( IF_ELSE $condition $part_if $part_else)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:209:8: ^( IF_ELSE $condition $part_if $part_else)
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:211:1: if_tag : TAG_START if_subtag TAG_END ;
    public final OmttParser.if_tag_return if_tag() throws RecognitionException {
        OmttParser.if_tag_return retval = new OmttParser.if_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START115=null;
        Token TAG_END117=null;
        OmttParser.if_subtag_return if_subtag116 = null;


        Object TAG_START115_tree=null;
        Object TAG_END117_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:212:3: ( TAG_START if_subtag TAG_END )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:212:5: TAG_START if_subtag TAG_END
            {
            root_0 = (Object)adaptor.nil();

            TAG_START115=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_tag1413); 
            pushFollow(FOLLOW_if_subtag_in_if_tag1419);
            if_subtag116=if_subtag();

            state._fsp--;

            adaptor.addChild(root_0, if_subtag116.getTree());
            TAG_END117=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_if_tag1425); 

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:216:10: fragment if_subtag : ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )? -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? ) ;
    public final OmttParser.if_subtag_return if_subtag() throws RecognitionException {
        OmttParser.if_subtag_return retval = new OmttParser.if_subtag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF118=null;
        Token TAG_START119=null;
        Token ELSE120=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.tag_content_return part_if = null;

        OmttParser.tag_content_return part_else = null;

        OmttParser.if_subtag_return subtag = null;


        Object IF118_tree=null;
        Object TAG_START119_tree=null;
        Object ELSE120_tree=null;
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_if_subtag=new RewriteRuleSubtreeStream(adaptor,"rule if_subtag");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:217:2: ( ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )? -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:217:4: ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:217:4: ( IF condition= context_expression part_if= tag_content )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:217:6: IF condition= context_expression part_if= tag_content
            {
            IF118=(Token)match(input,IF,FOLLOW_IF_in_if_subtag1441);  
            stream_IF.add(IF118);

            pushFollow(FOLLOW_context_expression_in_if_subtag1445);
            condition=context_expression();

            state._fsp--;

            stream_context_expression.add(condition.getTree());
            pushFollow(FOLLOW_tag_content_in_if_subtag1453);
            part_if=tag_content();

            state._fsp--;

            stream_tag_content.add(part_if.getTree());

            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:220:3: ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==TAG_START) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:220:5: TAG_START ELSE (part_else= tag_content | subtag= if_subtag )
                    {
                    TAG_START119=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_subtag1463);  
                    stream_TAG_START.add(TAG_START119);

                    ELSE120=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_subtag1465);  
                    stream_ELSE.add(ELSE120);

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:221:4: (part_else= tag_content | subtag= if_subtag )
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
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:221:5: part_else= tag_content
                            {
                            pushFollow(FOLLOW_tag_content_in_if_subtag1473);
                            part_else=tag_content();

                            state._fsp--;

                            stream_tag_content.add(part_else.getTree());

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:221:29: subtag= if_subtag
                            {
                            pushFollow(FOLLOW_if_subtag_in_if_subtag1479);
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
            // elements: subtag, part_if, part_else, condition
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
            // 223:3: -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:223:6: ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new IfElse(IF_ELSE), root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());
                adaptor.addChild(root_1, stream_part_if.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:223:44: ( $part_else)?
                if ( stream_part_else.hasNext() ) {
                    adaptor.addChild(root_1, stream_part_else.nextTree());

                }
                stream_part_else.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:223:56: ( $subtag)?
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:226:1: map_expression : MAP ( item_alias )? iter= context_expression COLON expr= control_expression -> ^( MAP $iter $expr ( item_alias )? ) ;
    public final OmttParser.map_expression_return map_expression() throws RecognitionException {
        OmttParser.map_expression_return retval = new OmttParser.map_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MAP121=null;
        Token COLON123=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.control_expression_return expr = null;

        OmttParser.item_alias_return item_alias122 = null;


        Object MAP121_tree=null;
        Object COLON123_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_control_expression=new RewriteRuleSubtreeStream(adaptor,"rule control_expression");
        RewriteRuleSubtreeStream stream_item_alias=new RewriteRuleSubtreeStream(adaptor,"rule item_alias");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:227:3: ( MAP ( item_alias )? iter= context_expression COLON expr= control_expression -> ^( MAP $iter $expr ( item_alias )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:227:5: MAP ( item_alias )? iter= context_expression COLON expr= control_expression
            {
            MAP121=(Token)match(input,MAP,FOLLOW_MAP_in_map_expression1522);  
            stream_MAP.add(MAP121);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:227:9: ( item_alias )?
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:227:9: item_alias
                    {
                    pushFollow(FOLLOW_item_alias_in_map_expression1524);
                    item_alias122=item_alias();

                    state._fsp--;

                    stream_item_alias.add(item_alias122.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_context_expression_in_map_expression1529);
            iter=context_expression();

            state._fsp--;

            stream_context_expression.add(iter.getTree());
            COLON123=(Token)match(input,COLON,FOLLOW_COLON_in_map_expression1531);  
            stream_COLON.add(COLON123);

            pushFollow(FOLLOW_control_expression_in_map_expression1539);
            expr=control_expression();

            state._fsp--;

            stream_control_expression.add(expr.getTree());


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
            // 229:5: -> ^( MAP $iter $expr ( item_alias )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:229:8: ^( MAP $iter $expr ( item_alias )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_MAP.nextToken()), root_1);

                adaptor.addChild(root_1, stream_iter.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:229:42: ( item_alias )?
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:231:1: map_tag : TAG_START MAP ( item_alias )? iter= context_expression expr= tag_content TAG_END -> ^( MAP $iter $expr ( item_alias )? ) ;
    public final OmttParser.map_tag_return map_tag() throws RecognitionException {
        OmttParser.map_tag_return retval = new OmttParser.map_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START124=null;
        Token MAP125=null;
        Token TAG_END127=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.tag_content_return expr = null;

        OmttParser.item_alias_return item_alias126 = null;


        Object TAG_START124_tree=null;
        Object MAP125_tree=null;
        Object TAG_END127_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_item_alias=new RewriteRuleSubtreeStream(adaptor,"rule item_alias");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:232:3: ( TAG_START MAP ( item_alias )? iter= context_expression expr= tag_content TAG_END -> ^( MAP $iter $expr ( item_alias )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:232:5: TAG_START MAP ( item_alias )? iter= context_expression expr= tag_content TAG_END
            {
            TAG_START124=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_map_tag1573);  
            stream_TAG_START.add(TAG_START124);

            MAP125=(Token)match(input,MAP,FOLLOW_MAP_in_map_tag1575);  
            stream_MAP.add(MAP125);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:232:19: ( item_alias )?
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:232:19: item_alias
                    {
                    pushFollow(FOLLOW_item_alias_in_map_tag1577);
                    item_alias126=item_alias();

                    state._fsp--;

                    stream_item_alias.add(item_alias126.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_context_expression_in_map_tag1582);
            iter=context_expression();

            state._fsp--;

            stream_context_expression.add(iter.getTree());
            pushFollow(FOLLOW_tag_content_in_map_tag1590);
            expr=tag_content();

            state._fsp--;

            stream_tag_content.add(expr.getTree());
            TAG_END127=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_map_tag1596);  
            stream_TAG_END.add(TAG_END127);



            // AST REWRITE
            // elements: expr, MAP, item_alias, iter
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
            // 235:5: -> ^( MAP $iter $expr ( item_alias )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:235:8: ^( MAP $iter $expr ( item_alias )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_MAP.nextToken()), root_1);

                adaptor.addChild(root_1, stream_iter.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:235:42: ( item_alias )?
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

    public static class item_alias_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "item_alias"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:238:10: fragment item_alias : VAR_ID OP_REVERSE_FOLLOW -> ^( AS VAR_ID ) ;
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
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:239:2: ( VAR_ID OP_REVERSE_FOLLOW -> ^( AS VAR_ID ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:239:4: VAR_ID OP_REVERSE_FOLLOW
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
            // 240:3: -> ^( AS VAR_ID )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:240:6: ^( AS VAR_ID )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:244:1: context_expression : (base= base_context_expression -> $base) ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_match LEFT_PAREN lambda_match_expression RIGHT_PAREN -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) ) | op_map ce= boolean_expression -> ^( op_map $context_expression $ce) )* ;
    public final OmttParser.context_expression_return context_expression() throws RecognitionException {
        OmttParser.context_expression_return retval = new OmttParser.context_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN133=null;
        Token RIGHT_PAREN135=null;
        OmttParser.base_context_expression_return base = null;

        OmttParser.function_arguments_return arguments = null;

        OmttParser.boolean_expression_return ce = null;

        OmttParser.op_apply_return op_apply130 = null;

        OmttParser.atom_expression_return atom_expression131 = null;

        OmttParser.op_match_return op_match132 = null;

        OmttParser.lambda_match_expression_return lambda_match_expression134 = null;

        OmttParser.op_map_return op_map136 = null;


        Object LEFT_PAREN133_tree=null;
        Object RIGHT_PAREN135_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_op_apply=new RewriteRuleSubtreeStream(adaptor,"rule op_apply");
        RewriteRuleSubtreeStream stream_lambda_match_expression=new RewriteRuleSubtreeStream(adaptor,"rule lambda_match_expression");
        RewriteRuleSubtreeStream stream_function_arguments=new RewriteRuleSubtreeStream(adaptor,"rule function_arguments");
        RewriteRuleSubtreeStream stream_op_map=new RewriteRuleSubtreeStream(adaptor,"rule op_map");
        RewriteRuleSubtreeStream stream_boolean_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expression");
        RewriteRuleSubtreeStream stream_op_match=new RewriteRuleSubtreeStream(adaptor,"rule op_match");
        RewriteRuleSubtreeStream stream_base_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule base_context_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:245:3: ( (base= base_context_expression -> $base) ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_match LEFT_PAREN lambda_match_expression RIGHT_PAREN -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) ) | op_map ce= boolean_expression -> ^( op_map $context_expression $ce) )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:245:5: (base= base_context_expression -> $base) ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_match LEFT_PAREN lambda_match_expression RIGHT_PAREN -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) ) | op_map ce= boolean_expression -> ^( op_map $context_expression $ce) )*
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:245:5: (base= base_context_expression -> $base)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:245:6: base= base_context_expression
            {
            pushFollow(FOLLOW_base_context_expression_in_context_expression1660);
            base=base_context_expression();

            state._fsp--;

            stream_base_context_expression.add(base.getTree());


            // AST REWRITE
            // elements: base
            // token labels: 
            // rule labels: retval, base
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_base=new RewriteRuleSubtreeStream(adaptor,"rule base",base!=null?base.tree:null);

            root_0 = (Object)adaptor.nil();
            // 245:35: -> $base
            {
                adaptor.addChild(root_0, stream_base.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:246:5: ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_match LEFT_PAREN lambda_match_expression RIGHT_PAREN -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) ) | op_map ce= boolean_expression -> ^( op_map $context_expression $ce) )*
            loop43:
            do {
                int alt43=4;
                switch ( input.LA(1) ) {
                case APPLY:
                case OP_CONTEXT:
                    {
                    alt43=1;
                    }
                    break;
                case MATCH:
                    {
                    alt43=2;
                    }
                    break;
                case MAP:
                case OP_EXPRESSION_CONTEXT:
                    {
                    alt43=3;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:246:7: op_apply atom_expression arguments= function_arguments
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
            	    // 247:7: -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? )
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:247:10: ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

            	        adaptor.addChild(root_1, stream_atom_expression.nextTree());
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:247:45: ^( ARGUMENT $context_expression)
            	        {
            	        Object root_2 = (Object)adaptor.nil();
            	        root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:247:95: ( $arguments)?
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
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:248:7: op_match LEFT_PAREN lambda_match_expression RIGHT_PAREN
            	    {
            	    pushFollow(FOLLOW_op_match_in_context_expression1720);
            	    op_match132=op_match();

            	    state._fsp--;

            	    stream_op_match.add(op_match132.getTree());
            	    LEFT_PAREN133=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_context_expression1722);  
            	    stream_LEFT_PAREN.add(LEFT_PAREN133);

            	    pushFollow(FOLLOW_lambda_match_expression_in_context_expression1724);
            	    lambda_match_expression134=lambda_match_expression();

            	    state._fsp--;

            	    stream_lambda_match_expression.add(lambda_match_expression134.getTree());
            	    RIGHT_PAREN135=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_context_expression1726);  
            	    stream_RIGHT_PAREN.add(RIGHT_PAREN135);



            	    // AST REWRITE
            	    // elements: context_expression, lambda_match_expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 249:6: -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) )
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:249:9: ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

            	        adaptor.addChild(root_1, stream_lambda_match_expression.nextTree());
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:249:52: ^( ARGUMENT $context_expression)
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
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:250:7: op_map ce= boolean_expression
            	    {
            	    pushFollow(FOLLOW_op_map_in_context_expression1761);
            	    op_map136=op_map();

            	    state._fsp--;

            	    stream_op_map.add(op_map136.getTree());
            	    pushFollow(FOLLOW_boolean_expression_in_context_expression1765);
            	    ce=boolean_expression();

            	    state._fsp--;

            	    stream_boolean_expression.add(ce.getTree());


            	    // AST REWRITE
            	    // elements: context_expression, op_map, ce
            	    // token labels: 
            	    // rule labels: retval, ce
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_ce=new RewriteRuleSubtreeStream(adaptor,"rule ce",ce!=null?ce.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 251:6: -> ^( op_map $context_expression $ce)
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:251:9: ^( op_map $context_expression $ce)
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

    public static class op_apply_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "op_apply"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:254:10: fragment op_apply : ( OP_CONTEXT | APPLY );
    public final OmttParser.op_apply_return op_apply() throws RecognitionException {
        OmttParser.op_apply_return retval = new OmttParser.op_apply_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_CONTEXT137=null;
        Token APPLY138=null;

        Object OP_CONTEXT137_tree=null;
        Object APPLY138_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:255:2: ( OP_CONTEXT | APPLY )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==OP_CONTEXT) ) {
                alt44=1;
            }
            else if ( (LA44_0==APPLY) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:255:4: OP_CONTEXT
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_CONTEXT137=(Token)match(input,OP_CONTEXT,FOLLOW_OP_CONTEXT_in_op_apply1802); 
                    OP_CONTEXT137_tree = (Object)adaptor.create(OP_CONTEXT137);
                    root_0 = (Object)adaptor.becomeRoot(OP_CONTEXT137_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:256:4: APPLY
                    {
                    root_0 = (Object)adaptor.nil();

                    APPLY138=(Token)match(input,APPLY,FOLLOW_APPLY_in_op_apply1808); 
                    APPLY138_tree = (Object)adaptor.create(APPLY138);
                    root_0 = (Object)adaptor.becomeRoot(APPLY138_tree, root_0);


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

    public static class op_match_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "op_match"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:258:10: fragment op_match : MATCH ;
    public final OmttParser.op_match_return op_match() throws RecognitionException {
        OmttParser.op_match_return retval = new OmttParser.op_match_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MATCH139=null;

        Object MATCH139_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:259:2: ( MATCH )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:259:4: MATCH
            {
            root_0 = (Object)adaptor.nil();

            MATCH139=(Token)match(input,MATCH,FOLLOW_MATCH_in_op_match1821); 
            MATCH139_tree = (Object)adaptor.create(MATCH139);
            root_0 = (Object)adaptor.becomeRoot(MATCH139_tree, root_0);


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
    // $ANTLR end "op_match"

    public static class op_map_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "op_map"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:261:10: fragment op_map : ( OP_EXPRESSION_CONTEXT | MAP );
    public final OmttParser.op_map_return op_map() throws RecognitionException {
        OmttParser.op_map_return retval = new OmttParser.op_map_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_EXPRESSION_CONTEXT140=null;
        Token MAP141=null;

        Object OP_EXPRESSION_CONTEXT140_tree=null;
        Object MAP141_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:262:2: ( OP_EXPRESSION_CONTEXT | MAP )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==OP_EXPRESSION_CONTEXT) ) {
                alt45=1;
            }
            else if ( (LA45_0==MAP) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:262:4: OP_EXPRESSION_CONTEXT
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_EXPRESSION_CONTEXT140=(Token)match(input,OP_EXPRESSION_CONTEXT,FOLLOW_OP_EXPRESSION_CONTEXT_in_op_map1834); 
                    OP_EXPRESSION_CONTEXT140_tree = new Transformation(OP_EXPRESSION_CONTEXT140) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_EXPRESSION_CONTEXT140_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:263:4: MAP
                    {
                    root_0 = (Object)adaptor.nil();

                    MAP141=(Token)match(input,MAP,FOLLOW_MAP_in_op_map1843); 
                    MAP141_tree = new Transformation(MAP141) ;
                    root_0 = (Object)adaptor.becomeRoot(MAP141_tree, root_0);


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

    public static class base_context_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "base_context_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:266:10: fragment base_context_expression : ( boolean_expression | apply_expression );
    public final OmttParser.base_context_expression_return base_context_expression() throws RecognitionException {
        OmttParser.base_context_expression_return retval = new OmttParser.base_context_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_expression_return boolean_expression142 = null;

        OmttParser.apply_expression_return apply_expression143 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:267:2: ( boolean_expression | apply_expression )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=STRING_LITERAL && LA46_0<=REAL_NUMBER)||LA46_0==DATA_START||(LA46_0>=NULL && LA46_0<=FALSE)||(LA46_0>=TILDE && LA46_0<=LEFT_PAREN)||LA46_0==OP_MINUS||LA46_0==OP_NOT||LA46_0==OP_GENERAL||LA46_0==VAR_ID) ) {
                alt46=1;
            }
            else if ( (LA46_0==APPLY) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:267:4: boolean_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_expression_in_base_context_expression1860);
                    boolean_expression142=boolean_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_expression142.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:268:4: apply_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_apply_expression_in_base_context_expression1865);
                    apply_expression143=apply_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, apply_expression143.getTree());

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
    // $ANTLR end "base_context_expression"

    public static class apply_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "apply_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:271:1: apply_expression : APPLY atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT IT ) ( $arguments)? ) ;
    public final OmttParser.apply_expression_return apply_expression() throws RecognitionException {
        OmttParser.apply_expression_return retval = new OmttParser.apply_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token APPLY144=null;
        OmttParser.function_arguments_return arguments = null;

        OmttParser.atom_expression_return atom_expression145 = null;


        Object APPLY144_tree=null;
        RewriteRuleTokenStream stream_APPLY=new RewriteRuleTokenStream(adaptor,"token APPLY");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_function_arguments=new RewriteRuleSubtreeStream(adaptor,"rule function_arguments");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:272:2: ( APPLY atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT IT ) ( $arguments)? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:272:4: APPLY atom_expression arguments= function_arguments
            {
            APPLY144=(Token)match(input,APPLY,FOLLOW_APPLY_in_apply_expression1876);  
            stream_APPLY.add(APPLY144);

            pushFollow(FOLLOW_atom_expression_in_apply_expression1878);
            atom_expression145=atom_expression();

            state._fsp--;

            stream_atom_expression.add(atom_expression145.getTree());
            pushFollow(FOLLOW_function_arguments_in_apply_expression1882);
            arguments=function_arguments();

            state._fsp--;

            stream_function_arguments.add(arguments.getTree());


            // AST REWRITE
            // elements: arguments, atom_expression
            // token labels: 
            // rule labels: retval, arguments
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments",arguments!=null?arguments.tree:null);

            root_0 = (Object)adaptor.nil();
            // 273:5: -> ^( CALL[true] atom_expression ^( ARGUMENT IT ) ( $arguments)? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:273:8: ^( CALL[true] atom_expression ^( ARGUMENT IT ) ( $arguments)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

                adaptor.addChild(root_1, stream_atom_expression.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:273:43: ^( ARGUMENT IT )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

                adaptor.addChild(root_2, new Ident(IT));

                adaptor.addChild(root_1, root_2);
                }
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:273:83: ( $arguments)?
                if ( stream_arguments.hasNext() ) {
                    adaptor.addChild(root_1, stream_arguments.nextTree());

                }
                stream_arguments.reset();

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

    public static class apply_tag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "apply_tag"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:275:1: apply_tag : TAG_START apply_expression TAG_END ;
    public final OmttParser.apply_tag_return apply_tag() throws RecognitionException {
        OmttParser.apply_tag_return retval = new OmttParser.apply_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START146=null;
        Token TAG_END148=null;
        OmttParser.apply_expression_return apply_expression147 = null;


        Object TAG_START146_tree=null;
        Object TAG_END148_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:276:2: ( TAG_START apply_expression TAG_END )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:276:4: TAG_START apply_expression TAG_END
            {
            root_0 = (Object)adaptor.nil();

            TAG_START146=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_apply_tag1924); 
            pushFollow(FOLLOW_apply_expression_in_apply_tag1927);
            apply_expression147=apply_expression();

            state._fsp--;

            adaptor.addChild(root_0, apply_expression147.getTree());
            TAG_END148=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_apply_tag1929); 

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
    // $ANTLR end "apply_tag"

    public static class boolean_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:281:1: boolean_expression : boolean_binary_expression ;
    public final OmttParser.boolean_expression_return boolean_expression() throws RecognitionException {
        OmttParser.boolean_expression_return retval = new OmttParser.boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_binary_expression_return boolean_binary_expression149 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:282:2: ( boolean_binary_expression )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:282:4: boolean_binary_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_binary_expression_in_boolean_expression1943);
            boolean_binary_expression149=boolean_binary_expression();

            state._fsp--;

            adaptor.addChild(root_0, boolean_binary_expression149.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:284:10: fragment boolean_binary_expression : boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )* ;
    public final OmttParser.boolean_binary_expression_return boolean_binary_expression() throws RecognitionException {
        OmttParser.boolean_binary_expression_return retval = new OmttParser.boolean_binary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_unary_expression_return boolean_unary_expression150 = null;

        OmttParser.boolean_binary_operator_return boolean_binary_operator151 = null;

        OmttParser.boolean_unary_expression_return boolean_unary_expression152 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:285:3: ( boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:285:5: boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression1956);
            boolean_unary_expression150=boolean_unary_expression();

            state._fsp--;

            adaptor.addChild(root_0, boolean_unary_expression150.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:285:30: ( boolean_binary_operator boolean_unary_expression )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=OP_AND && LA47_0<=OP_OR)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:285:31: boolean_binary_operator boolean_unary_expression
            	    {
            	    pushFollow(FOLLOW_boolean_binary_operator_in_boolean_binary_expression1959);
            	    boolean_binary_operator151=boolean_binary_operator();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(boolean_binary_operator151.getTree(), root_0);
            	    pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression1962);
            	    boolean_unary_expression152=boolean_unary_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolean_unary_expression152.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:287:10: fragment boolean_unary_expression : ( boolean_unary_operator boolean_comparsion_expression | boolean_comparsion_expression );
    public final OmttParser.boolean_unary_expression_return boolean_unary_expression() throws RecognitionException {
        OmttParser.boolean_unary_expression_return retval = new OmttParser.boolean_unary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_unary_operator_return boolean_unary_operator153 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression154 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression155 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:288:3: ( boolean_unary_operator boolean_comparsion_expression | boolean_comparsion_expression )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:288:5: boolean_unary_operator boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_unary_operator_in_boolean_unary_expression1978);
                    boolean_unary_operator153=boolean_unary_operator();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(boolean_unary_operator153.getTree(), root_0);
                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1981);
                    boolean_comparsion_expression154=boolean_comparsion_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_comparsion_expression154.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:289:5: boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1987);
                    boolean_comparsion_expression155=boolean_comparsion_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_comparsion_expression155.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:292:10: fragment boolean_binary_operator : ( OP_AND | OP_OR );
    public final OmttParser.boolean_binary_operator_return boolean_binary_operator() throws RecognitionException {
        OmttParser.boolean_binary_operator_return retval = new OmttParser.boolean_binary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_AND156=null;
        Token OP_OR157=null;

        Object OP_AND156_tree=null;
        Object OP_OR157_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:293:3: ( OP_AND | OP_OR )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:293:5: OP_AND
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_AND156=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_boolean_binary_operator2002); 
                    OP_AND156_tree = new BooleanExpression(OP_AND156) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_AND156_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:294:5: OP_OR
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_OR157=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_boolean_binary_operator2012); 
                    OP_OR157_tree = new BooleanExpression(OP_OR157) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_OR157_tree, root_0);


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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:296:10: fragment boolean_unary_operator : OP_NOT ;
    public final OmttParser.boolean_unary_operator_return boolean_unary_operator() throws RecognitionException {
        OmttParser.boolean_unary_operator_return retval = new OmttParser.boolean_unary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_NOT158=null;

        Object OP_NOT158_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:297:3: ( OP_NOT )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:297:5: OP_NOT
            {
            root_0 = (Object)adaptor.nil();

            OP_NOT158=(Token)match(input,OP_NOT,FOLLOW_OP_NOT_in_boolean_unary_operator2030); 
            OP_NOT158_tree = new BooleanExpression(OP_NOT158) ;
            root_0 = (Object)adaptor.becomeRoot(OP_NOT158_tree, root_0);


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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:300:1: boolean_comparsion_expression : additive_expression ( boolean_comparsion_operator additive_expression )* ;
    public final OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression() throws RecognitionException {
        OmttParser.boolean_comparsion_expression_return retval = new OmttParser.boolean_comparsion_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.additive_expression_return additive_expression159 = null;

        OmttParser.boolean_comparsion_operator_return boolean_comparsion_operator160 = null;

        OmttParser.additive_expression_return additive_expression161 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:301:3: ( additive_expression ( boolean_comparsion_operator additive_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:301:5: additive_expression ( boolean_comparsion_operator additive_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression2047);
            additive_expression159=additive_expression();

            state._fsp--;

            adaptor.addChild(root_0, additive_expression159.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:301:25: ( boolean_comparsion_operator additive_expression )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=OP_EQUAL && LA50_0<=OP_GE)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:301:26: boolean_comparsion_operator additive_expression
            	    {
            	    pushFollow(FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression2050);
            	    boolean_comparsion_operator160=boolean_comparsion_operator();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(boolean_comparsion_operator160.getTree(), root_0);
            	    pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression2053);
            	    additive_expression161=additive_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, additive_expression161.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:303:10: fragment boolean_comparsion_operator : ( OP_EQUAL | OP_NOT_EQUAL | OP_LE | OP_LEQ | OP_GE | OP_GEQ );
    public final OmttParser.boolean_comparsion_operator_return boolean_comparsion_operator() throws RecognitionException {
        OmttParser.boolean_comparsion_operator_return retval = new OmttParser.boolean_comparsion_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_EQUAL162=null;
        Token OP_NOT_EQUAL163=null;
        Token OP_LE164=null;
        Token OP_LEQ165=null;
        Token OP_GE166=null;
        Token OP_GEQ167=null;

        Object OP_EQUAL162_tree=null;
        Object OP_NOT_EQUAL163_tree=null;
        Object OP_LE164_tree=null;
        Object OP_LEQ165_tree=null;
        Object OP_GE166_tree=null;
        Object OP_GEQ167_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:304:3: ( OP_EQUAL | OP_NOT_EQUAL | OP_LE | OP_LEQ | OP_GE | OP_GEQ )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:304:5: OP_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_EQUAL162=(Token)match(input,OP_EQUAL,FOLLOW_OP_EQUAL_in_boolean_comparsion_operator2069); 
                    OP_EQUAL162_tree = new BooleanExpression(OP_EQUAL162) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_EQUAL162_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:305:5: OP_NOT_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_NOT_EQUAL163=(Token)match(input,OP_NOT_EQUAL,FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator2079); 
                    OP_NOT_EQUAL163_tree = new BooleanExpression(OP_NOT_EQUAL163) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_NOT_EQUAL163_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:306:5: OP_LE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LE164=(Token)match(input,OP_LE,FOLLOW_OP_LE_in_boolean_comparsion_operator2089); 
                    OP_LE164_tree = new BooleanExpression(OP_LE164) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LE164_tree, root_0);


                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:307:5: OP_LEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LEQ165=(Token)match(input,OP_LEQ,FOLLOW_OP_LEQ_in_boolean_comparsion_operator2099); 
                    OP_LEQ165_tree = new BooleanExpression(OP_LEQ165) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LEQ165_tree, root_0);


                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:308:5: OP_GE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GE166=(Token)match(input,OP_GE,FOLLOW_OP_GE_in_boolean_comparsion_operator2109); 
                    OP_GE166_tree = new BooleanExpression(OP_GE166) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GE166_tree, root_0);


                    }
                    break;
                case 6 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:309:5: OP_GEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GEQ167=(Token)match(input,OP_GEQ,FOLLOW_OP_GEQ_in_boolean_comparsion_operator2119); 
                    OP_GEQ167_tree = new BooleanExpression(OP_GEQ167) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GEQ167_tree, root_0);


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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:315:1: additive_expression : multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )* ;
    public final OmttParser.additive_expression_return additive_expression() throws RecognitionException {
        OmttParser.additive_expression_return retval = new OmttParser.additive_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_PLUS169=null;
        Token OP_MINUS170=null;
        OmttParser.multiplicative_expression_return multiplicative_expression168 = null;

        OmttParser.multiplicative_expression_return multiplicative_expression171 = null;


        Object OP_PLUS169_tree=null;
        Object OP_MINUS170_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:316:3: ( multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:316:5: multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2139);
            multiplicative_expression168=multiplicative_expression();

            state._fsp--;

            adaptor.addChild(root_0, multiplicative_expression168.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:317:5: ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=OP_PLUS && LA53_0<=OP_MINUS)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:318:7: ( OP_PLUS | OP_MINUS ) multiplicative_expression
            	    {
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:318:7: ( OP_PLUS | OP_MINUS )
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
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:318:9: OP_PLUS
            	            {
            	            OP_PLUS169=(Token)match(input,OP_PLUS,FOLLOW_OP_PLUS_in_additive_expression2155); 
            	            OP_PLUS169_tree = new ArithmeticExpression(OP_PLUS169) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_PLUS169_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:319:9: OP_MINUS
            	            {
            	            OP_MINUS170=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_additive_expression2169); 
            	            OP_MINUS170_tree = new ArithmeticExpression(OP_MINUS170) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MINUS170_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2189);
            	    multiplicative_expression171=multiplicative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicative_expression171.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:325:1: multiplicative_expression : negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )* ;
    public final OmttParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        OmttParser.multiplicative_expression_return retval = new OmttParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MULTIPLY173=null;
        Token SLASH174=null;
        Token OP_MODULO175=null;
        OmttParser.negative_expression_return negative_expression172 = null;

        OmttParser.negative_expression_return negative_expression176 = null;


        Object OP_MULTIPLY173_tree=null;
        Object SLASH174_tree=null;
        Object OP_MODULO175_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:326:3: ( negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:326:5: negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_negative_expression_in_multiplicative_expression2209);
            negative_expression172=negative_expression();

            state._fsp--;

            adaptor.addChild(root_0, negative_expression172.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:327:5: ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==SLASH||(LA55_0>=OP_MULTIPLY && LA55_0<=OP_MODULO)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:327:7: ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression
            	    {
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:327:7: ( OP_MULTIPLY | SLASH | OP_MODULO )
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
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:327:9: OP_MULTIPLY
            	            {
            	            OP_MULTIPLY173=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_multiplicative_expression2219); 
            	            OP_MULTIPLY173_tree = new ArithmeticExpression(OP_MULTIPLY173) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MULTIPLY173_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:328:9: SLASH
            	            {
            	            SLASH174=(Token)match(input,SLASH,FOLLOW_SLASH_in_multiplicative_expression2233); 
            	            SLASH174_tree = new ArithmeticExpression(SLASH174) ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH174_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:329:9: OP_MODULO
            	            {
            	            OP_MODULO175=(Token)match(input,OP_MODULO,FOLLOW_OP_MODULO_in_multiplicative_expression2247); 
            	            OP_MODULO175_tree = new ArithmeticExpression(OP_MODULO175) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MODULO175_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_negative_expression_in_multiplicative_expression2267);
            	    negative_expression176=negative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, negative_expression176.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:335:1: negative_expression : ( OP_MINUS functional_expression -> ^( OP_MINUS functional_expression ) | functional_expression );
    public final OmttParser.negative_expression_return negative_expression() throws RecognitionException {
        OmttParser.negative_expression_return retval = new OmttParser.negative_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MINUS177=null;
        OmttParser.functional_expression_return functional_expression178 = null;

        OmttParser.functional_expression_return functional_expression179 = null;


        Object OP_MINUS177_tree=null;
        RewriteRuleTokenStream stream_OP_MINUS=new RewriteRuleTokenStream(adaptor,"token OP_MINUS");
        RewriteRuleSubtreeStream stream_functional_expression=new RewriteRuleSubtreeStream(adaptor,"rule functional_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:336:2: ( OP_MINUS functional_expression -> ^( OP_MINUS functional_expression ) | functional_expression )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:336:4: OP_MINUS functional_expression
                    {
                    OP_MINUS177=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_negative_expression2286);  
                    stream_OP_MINUS.add(OP_MINUS177);

                    pushFollow(FOLLOW_functional_expression_in_negative_expression2288);
                    functional_expression178=functional_expression();

                    state._fsp--;

                    stream_functional_expression.add(functional_expression178.getTree());


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
                    // 337:3: -> ^( OP_MINUS functional_expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:337:6: ^( OP_MINUS functional_expression )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:338:4: functional_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functional_expression_in_negative_expression2306);
                    functional_expression179=functional_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, functional_expression179.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:343:1: functional_expression : call_expression ;
    public final OmttParser.functional_expression_return functional_expression() throws RecognitionException {
        OmttParser.functional_expression_return retval = new OmttParser.functional_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.call_expression_return call_expression180 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:344:3: ( call_expression )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:344:5: call_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_call_expression_in_functional_expression2320);
            call_expression180=call_expression();

            state._fsp--;

            adaptor.addChild(root_0, call_expression180.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:347:1: call_expression : atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) ) ;
    public final OmttParser.call_expression_return call_expression() throws RecognitionException {
        OmttParser.call_expression_return retval = new OmttParser.call_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.atom_expression_return atom_expression181 = null;

        OmttParser.function_argument_return function_argument182 = null;


        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_function_argument=new RewriteRuleSubtreeStream(adaptor,"rule function_argument");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:348:3: ( atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:348:5: atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            {
            pushFollow(FOLLOW_atom_expression_in_call_expression2333);
            atom_expression181=atom_expression();

            state._fsp--;

            stream_atom_expression.add(atom_expression181.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:349:5: ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=STRING_LITERAL && LA58_0<=REAL_NUMBER)||LA58_0==DATA_START||(LA58_0>=NULL && LA58_0<=FALSE)||(LA58_0>=TILDE && LA58_0<=LEFT_PAREN)||LA58_0==OP_GENERAL||LA58_0==VAR_ID) ) {
                alt58=1;
            }
            else if ( ((LA58_0>=CONTENT && LA58_0<=TAG_END)||(LA58_0>=EXPRESSION_END && LA58_0<=OP_DATA_IS_EXPRESSION)||(LA58_0>=AND && LA58_0<=IN)||LA58_0==ELSE||(LA58_0>=MAP && LA58_0<=MATCH)||(LA58_0>=COLON && LA58_0<=SEMICOLON)||LA58_0==SLASH||LA58_0==RIGHT_PAREN||(LA58_0>=RIGHT_SQUARE_PAREN && LA58_0<=OP_GE)||(LA58_0>=OP_AND && LA58_0<=OP_OR)||(LA58_0>=OP_CONTEXT && LA58_0<=OP_EXPRESSION_CONTEXT)||LA58_0==OP_CONCAT) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:349:7: ( function_argument )+
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:349:7: ( function_argument )+
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
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:349:7: function_argument
                    	    {
                    	    pushFollow(FOLLOW_function_argument_in_call_expression2341);
                    	    function_argument182=function_argument();

                    	    state._fsp--;

                    	    stream_function_argument.add(function_argument182.getTree());

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
                    // 350:7: -> ^( CALL[false] atom_expression ( function_argument )+ )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:350:10: ^( CALL[false] atom_expression ( function_argument )+ )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:351:7: 
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
                    // 352:7: -> ^( atom_expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:352:10: ^( atom_expression )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:355:1: call_tag : TAG_START ident= namespace_id function_arguments (content= tag_content )? TAG_END -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( function_arguments )? ) ;
    public final OmttParser.call_tag_return call_tag() throws RecognitionException {
        OmttParser.call_tag_return retval = new OmttParser.call_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START183=null;
        Token TAG_END185=null;
        OmttParser.namespace_id_return ident = null;

        OmttParser.tag_content_return content = null;

        OmttParser.function_arguments_return function_arguments184 = null;


        Object TAG_START183_tree=null;
        Object TAG_END185_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_namespace_id=new RewriteRuleSubtreeStream(adaptor,"rule namespace_id");
        RewriteRuleSubtreeStream stream_function_arguments=new RewriteRuleSubtreeStream(adaptor,"rule function_arguments");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:356:3: ( TAG_START ident= namespace_id function_arguments (content= tag_content )? TAG_END -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( function_arguments )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:356:5: TAG_START ident= namespace_id function_arguments (content= tag_content )? TAG_END
            {
            TAG_START183=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_call_tag2401);  
            stream_TAG_START.add(TAG_START183);

            pushFollow(FOLLOW_namespace_id_in_call_tag2405);
            ident=namespace_id();

            state._fsp--;

            stream_namespace_id.add(ident.getTree());
            pushFollow(FOLLOW_function_arguments_in_call_tag2407);
            function_arguments184=function_arguments();

            state._fsp--;

            stream_function_arguments.add(function_arguments184.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:357:5: (content= tag_content )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==CONTENT||LA59_0==OP_DATA_IS_EXPRESSION) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:357:6: content= tag_content
                    {
                    pushFollow(FOLLOW_tag_content_in_call_tag2416);
                    content=tag_content();

                    state._fsp--;

                    stream_tag_content.add(content.getTree());

                    }
                    break;

            }

            TAG_END185=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_call_tag2424);  
            stream_TAG_END.add(TAG_END185);



            // AST REWRITE
            // elements: content, function_arguments, ident
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
            // 359:5: -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( function_arguments )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:359:8: ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( function_arguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Call(CALL, false), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:359:35: ( ^( ARGUMENT $content) )?
                if ( stream_content.hasNext() ) {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:359:35: ^( ARGUMENT $content)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

                    adaptor.addChild(root_2, stream_content.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_content.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:359:75: ( function_arguments )?
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:361:10: fragment function_arguments : ( function_argument )* ;
    public final OmttParser.function_arguments_return function_arguments() throws RecognitionException {
        OmttParser.function_arguments_return retval = new OmttParser.function_arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.function_argument_return function_argument186 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:362:3: ( ( function_argument )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:362:5: ( function_argument )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:362:5: ( function_argument )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=STRING_LITERAL && LA60_0<=REAL_NUMBER)||LA60_0==DATA_START||(LA60_0>=NULL && LA60_0<=FALSE)||(LA60_0>=TILDE && LA60_0<=LEFT_PAREN)||LA60_0==OP_GENERAL||LA60_0==VAR_ID) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:362:5: function_argument
            	    {
            	    pushFollow(FOLLOW_function_argument_in_function_arguments2469);
            	    function_argument186=function_argument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function_argument186.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:364:10: fragment function_argument : ( VAR_ID OP_ASSIGN )? atom_expression -> ^( ARGUMENT atom_expression ( VAR_ID )? ) ;
    public final OmttParser.function_argument_return function_argument() throws RecognitionException {
        OmttParser.function_argument_return retval = new OmttParser.function_argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID187=null;
        Token OP_ASSIGN188=null;
        OmttParser.atom_expression_return atom_expression189 = null;


        Object VAR_ID187_tree=null;
        Object OP_ASSIGN188_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:365:3: ( ( VAR_ID OP_ASSIGN )? atom_expression -> ^( ARGUMENT atom_expression ( VAR_ID )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:365:5: ( VAR_ID OP_ASSIGN )? atom_expression
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:365:5: ( VAR_ID OP_ASSIGN )?
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:365:6: VAR_ID OP_ASSIGN
                    {
                    VAR_ID187=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_function_argument2485);  
                    stream_VAR_ID.add(VAR_ID187);

                    OP_ASSIGN188=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_function_argument2487);  
                    stream_OP_ASSIGN.add(OP_ASSIGN188);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_expression_in_function_argument2491);
            atom_expression189=atom_expression();

            state._fsp--;

            stream_atom_expression.add(atom_expression189.getTree());


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
            // 366:5: -> ^( ARGUMENT atom_expression ( VAR_ID )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:366:8: ^( ARGUMENT atom_expression ( VAR_ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_1);

                adaptor.addChild(root_1, stream_atom_expression.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:366:53: ( VAR_ID )?
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:371:1: atom_expression : (a= atom_with_properties -> $a) ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )? ;
    public final OmttParser.atom_expression_return atom_expression() throws RecognitionException {
        OmttParser.atom_expression_return retval = new OmttParser.atom_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMA190=null;
        OmttParser.atom_with_properties_return a = null;

        OmttParser.atom_with_properties_return atom_with_properties191 = null;


        Object COMA190_tree=null;
        RewriteRuleTokenStream stream_COMA=new RewriteRuleTokenStream(adaptor,"token COMA");
        RewriteRuleSubtreeStream stream_atom_with_properties=new RewriteRuleSubtreeStream(adaptor,"rule atom_with_properties");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:372:2: ( (a= atom_with_properties -> $a) ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:372:4: (a= atom_with_properties -> $a) ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:372:4: (a= atom_with_properties -> $a)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:372:5: a= atom_with_properties
            {
            pushFollow(FOLLOW_atom_with_properties_in_atom_expression2526);
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
            // 372:28: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:373:4: ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==COMA) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:373:5: ( COMA atom_with_properties )+
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:373:5: ( COMA atom_with_properties )+
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
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:373:6: COMA atom_with_properties
                    	    {
                    	    COMA190=(Token)match(input,COMA,FOLLOW_COMA_in_atom_expression2539);  
                    	    stream_COMA.add(COMA190);

                    	    pushFollow(FOLLOW_atom_with_properties_in_atom_expression2541);
                    	    atom_with_properties191=atom_with_properties();

                    	    state._fsp--;

                    	    stream_atom_with_properties.add(atom_with_properties191.getTree());

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
                    // 373:34: -> ^( SEQUENCE ( atom_with_properties )+ )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:373:37: ^( SEQUENCE ( atom_with_properties )+ )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:376:1: atom_with_properties : (a= atom_with_selectors -> $a) ( DOT es= expression_select -> ^( DOT $atom_with_properties $es) | DOT ps= property_select -> ^( DOT $atom_with_properties $ps) )* ;
    public final OmttParser.atom_with_properties_return atom_with_properties() throws RecognitionException {
        OmttParser.atom_with_properties_return retval = new OmttParser.atom_with_properties_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT192=null;
        Token DOT193=null;
        OmttParser.atom_with_selectors_return a = null;

        OmttParser.expression_select_return es = null;

        OmttParser.property_select_return ps = null;


        Object DOT192_tree=null;
        Object DOT193_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_expression_select=new RewriteRuleSubtreeStream(adaptor,"rule expression_select");
        RewriteRuleSubtreeStream stream_property_select=new RewriteRuleSubtreeStream(adaptor,"rule property_select");
        RewriteRuleSubtreeStream stream_atom_with_selectors=new RewriteRuleSubtreeStream(adaptor,"rule atom_with_selectors");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:377:3: ( (a= atom_with_selectors -> $a) ( DOT es= expression_select -> ^( DOT $atom_with_properties $es) | DOT ps= property_select -> ^( DOT $atom_with_properties $ps) )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:377:5: (a= atom_with_selectors -> $a) ( DOT es= expression_select -> ^( DOT $atom_with_properties $es) | DOT ps= property_select -> ^( DOT $atom_with_properties $ps) )*
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:377:5: (a= atom_with_selectors -> $a)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:377:6: a= atom_with_selectors
            {
            pushFollow(FOLLOW_atom_with_selectors_in_atom_with_properties2573);
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
            // 377:28: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:378:4: ( DOT es= expression_select -> ^( DOT $atom_with_properties $es) | DOT ps= property_select -> ^( DOT $atom_with_properties $ps) )*
            loop64:
            do {
                int alt64=3;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==DOT) ) {
                    int LA64_2 = input.LA(2);

                    if ( (LA64_2==LEFT_PAREN) ) {
                        alt64=1;
                    }
                    else if ( (LA64_2==VAR_ID) ) {
                        alt64=2;
                    }


                }


                switch (alt64) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:378:6: DOT es= expression_select
            	    {
            	    DOT192=(Token)match(input,DOT,FOLLOW_DOT_in_atom_with_properties2586);  
            	    stream_DOT.add(DOT192);

            	    pushFollow(FOLLOW_expression_select_in_atom_with_properties2590);
            	    es=expression_select();

            	    state._fsp--;

            	    stream_expression_select.add(es.getTree());


            	    // AST REWRITE
            	    // elements: DOT, es, atom_with_properties
            	    // token labels: 
            	    // rule labels: retval, es
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_es=new RewriteRuleSubtreeStream(adaptor,"rule es",es!=null?es.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 379:6: -> ^( DOT $atom_with_properties $es)
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:379:9: ^( DOT $atom_with_properties $es)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_DOT.nextToken()), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_es.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 2 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:380:6: DOT ps= property_select
            	    {
            	    DOT193=(Token)match(input,DOT,FOLLOW_DOT_in_atom_with_properties2617);  
            	    stream_DOT.add(DOT193);

            	    pushFollow(FOLLOW_property_select_in_atom_with_properties2621);
            	    ps=property_select();

            	    state._fsp--;

            	    stream_property_select.add(ps.getTree());


            	    // AST REWRITE
            	    // elements: ps, atom_with_properties, DOT
            	    // token labels: 
            	    // rule labels: retval, ps
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_ps=new RewriteRuleSubtreeStream(adaptor,"rule ps",ps!=null?ps.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 381:5: -> ^( DOT $atom_with_properties $ps)
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:381:8: ^( DOT $atom_with_properties $ps)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new PropertySelect(stream_DOT.nextToken()), root_1);

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:384:10: fragment atom_with_selectors : atom ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom ) ;
    public final OmttParser.atom_with_selectors_return atom_with_selectors() throws RecognitionException {
        OmttParser.atom_with_selectors_return retval = new OmttParser.atom_with_selectors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.atom_return atom194 = null;

        OmttParser.sequence_selectors_return sequence_selectors195 = null;


        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_sequence_selectors=new RewriteRuleSubtreeStream(adaptor,"rule sequence_selectors");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:385:2: ( atom ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:385:4: atom ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom )
            {
            pushFollow(FOLLOW_atom_in_atom_with_selectors2659);
            atom194=atom();

            state._fsp--;

            stream_atom.add(atom194.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:386:3: ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom )
            int alt65=2;
            switch ( input.LA(1) ) {
            case DOT:
                {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==CLASS_ID) ) {
                    alt65=1;
                }
                else if ( (LA65_1==LEFT_PAREN||LA65_1==VAR_ID) ) {
                    alt65=2;
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
            case MATCH:
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:386:5: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_atom_with_selectors2665);
                    sequence_selectors195=sequence_selectors();

                    state._fsp--;

                    stream_sequence_selectors.add(sequence_selectors195.getTree());


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
                    // 387:4: -> ^( ATOM_SELECT atom sequence_selectors )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:387:7: ^( ATOM_SELECT atom sequence_selectors )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new AtomSelect(ATOM_SELECT), root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());
                        adaptor.addChild(root_1, stream_sequence_selectors.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:388:5: 
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
                    // 388:5: -> atom
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

    public static class expression_select_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression_select"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:391:10: fragment expression_select : LEFT_PAREN expression RIGHT_PAREN ( sequence_selectors -> ^( ATOM_SELECT expression sequence_selectors ) | -> expression ) ;
    public final OmttParser.expression_select_return expression_select() throws RecognitionException {
        OmttParser.expression_select_return retval = new OmttParser.expression_select_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN196=null;
        Token RIGHT_PAREN198=null;
        OmttParser.expression_return expression197 = null;

        OmttParser.sequence_selectors_return sequence_selectors199 = null;


        Object LEFT_PAREN196_tree=null;
        Object RIGHT_PAREN198_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_sequence_selectors=new RewriteRuleSubtreeStream(adaptor,"rule sequence_selectors");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:392:2: ( LEFT_PAREN expression RIGHT_PAREN ( sequence_selectors -> ^( ATOM_SELECT expression sequence_selectors ) | -> expression ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:392:4: LEFT_PAREN expression RIGHT_PAREN ( sequence_selectors -> ^( ATOM_SELECT expression sequence_selectors ) | -> expression )
            {
            LEFT_PAREN196=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_expression_select2705);  
            stream_LEFT_PAREN.add(LEFT_PAREN196);

            pushFollow(FOLLOW_expression_in_expression_select2707);
            expression197=expression();

            state._fsp--;

            stream_expression.add(expression197.getTree());
            RIGHT_PAREN198=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_expression_select2709);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN198);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:393:3: ( sequence_selectors -> ^( ATOM_SELECT expression sequence_selectors ) | -> expression )
            int alt66=2;
            switch ( input.LA(1) ) {
            case DOT:
                {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==CLASS_ID) ) {
                    alt66=1;
                }
                else if ( (LA66_1==LEFT_PAREN||LA66_1==VAR_ID) ) {
                    alt66=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;
                }
                }
                break;
            case AS:
            case LEFT_SQUARE_PAREN:
                {
                alt66=1;
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
            case MATCH:
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
                alt66=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:393:5: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_expression_select2715);
                    sequence_selectors199=sequence_selectors();

                    state._fsp--;

                    stream_sequence_selectors.add(sequence_selectors199.getTree());


                    // AST REWRITE
                    // elements: sequence_selectors, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 394:4: -> ^( ATOM_SELECT expression sequence_selectors )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:394:7: ^( ATOM_SELECT expression sequence_selectors )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new AtomSelect(ATOM_SELECT), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_sequence_selectors.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:395:5: 
                    {

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
                    // 395:5: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

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
    // $ANTLR end "expression_select"

    public static class property_select_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "property_select"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:398:10: fragment property_select : VAR_ID ( sequence_selectors )? ;
    public final OmttParser.property_select_return property_select() throws RecognitionException {
        OmttParser.property_select_return retval = new OmttParser.property_select_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID200=null;
        OmttParser.sequence_selectors_return sequence_selectors201 = null;


        Object VAR_ID200_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:399:2: ( VAR_ID ( sequence_selectors )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:399:4: VAR_ID ( sequence_selectors )?
            {
            root_0 = (Object)adaptor.nil();

            VAR_ID200=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_property_select2755); 
            VAR_ID200_tree = (Object)adaptor.create(VAR_ID200);
            adaptor.addChild(root_0, VAR_ID200_tree);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:399:11: ( sequence_selectors )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==DOT) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==CLASS_ID) ) {
                    alt67=1;
                }
            }
            else if ( (LA67_0==AS||LA67_0==LEFT_SQUARE_PAREN) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:399:11: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_property_select2757);
                    sequence_selectors201=sequence_selectors();

                    state._fsp--;

                    adaptor.addChild(root_0, sequence_selectors201.getTree());

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
    // $ANTLR end "property_select"

    public static class sequence_selectors_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sequence_selectors"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:401:10: fragment sequence_selectors : ( type_selector ( sequence_selector )? ( alias )? | sequence_selector ( alias )? | alias );
    public final OmttParser.sequence_selectors_return sequence_selectors() throws RecognitionException {
        OmttParser.sequence_selectors_return retval = new OmttParser.sequence_selectors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.type_selector_return type_selector202 = null;

        OmttParser.sequence_selector_return sequence_selector203 = null;

        OmttParser.alias_return alias204 = null;

        OmttParser.sequence_selector_return sequence_selector205 = null;

        OmttParser.alias_return alias206 = null;

        OmttParser.alias_return alias207 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:2: ( type_selector ( sequence_selector )? ( alias )? | sequence_selector ( alias )? | alias )
            int alt71=3;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt71=1;
                }
                break;
            case LEFT_SQUARE_PAREN:
                {
                alt71=2;
                }
                break;
            case AS:
                {
                alt71=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:4: type_selector ( sequence_selector )? ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_selector_in_sequence_selectors2770);
                    type_selector202=type_selector();

                    state._fsp--;

                    adaptor.addChild(root_0, type_selector202.getTree());
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:18: ( sequence_selector )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==LEFT_SQUARE_PAREN) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:18: sequence_selector
                            {
                            pushFollow(FOLLOW_sequence_selector_in_sequence_selectors2772);
                            sequence_selector203=sequence_selector();

                            state._fsp--;

                            adaptor.addChild(root_0, sequence_selector203.getTree());

                            }
                            break;

                    }

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:37: ( alias )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==AS) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:37: alias
                            {
                            pushFollow(FOLLOW_alias_in_sequence_selectors2775);
                            alias204=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias204.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:403:4: sequence_selector ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_sequence_selector_in_sequence_selectors2781);
                    sequence_selector205=sequence_selector();

                    state._fsp--;

                    adaptor.addChild(root_0, sequence_selector205.getTree());
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:403:22: ( alias )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==AS) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:403:22: alias
                            {
                            pushFollow(FOLLOW_alias_in_sequence_selectors2783);
                            alias206=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias206.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:404:4: alias
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alias_in_sequence_selectors2789);
                    alias207=alias();

                    state._fsp--;

                    adaptor.addChild(root_0, alias207.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:406:10: fragment type_selector : DOT single_type -> ^( TYPE_SELECT single_type ) ;
    public final OmttParser.type_selector_return type_selector() throws RecognitionException {
        OmttParser.type_selector_return retval = new OmttParser.type_selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT208=null;
        OmttParser.single_type_return single_type209 = null;


        Object DOT208_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:407:3: ( DOT single_type -> ^( TYPE_SELECT single_type ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:407:5: DOT single_type
            {
            DOT208=(Token)match(input,DOT,FOLLOW_DOT_in_type_selector2802);  
            stream_DOT.add(DOT208);

            pushFollow(FOLLOW_single_type_in_type_selector2804);
            single_type209=single_type();

            state._fsp--;

            stream_single_type.add(single_type209.getTree());


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
            // 408:4: -> ^( TYPE_SELECT single_type )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:408:7: ^( TYPE_SELECT single_type )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:410:10: fragment sequence_selector : LEFT_SQUARE_PAREN boolean_expression RIGHT_SQUARE_PAREN -> ^( SEQUENCE_SELECT boolean_expression ) ;
    public final OmttParser.sequence_selector_return sequence_selector() throws RecognitionException {
        OmttParser.sequence_selector_return retval = new OmttParser.sequence_selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE_PAREN210=null;
        Token RIGHT_SQUARE_PAREN212=null;
        OmttParser.boolean_expression_return boolean_expression211 = null;


        Object LEFT_SQUARE_PAREN210_tree=null;
        Object RIGHT_SQUARE_PAREN212_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_boolean_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:411:3: ( LEFT_SQUARE_PAREN boolean_expression RIGHT_SQUARE_PAREN -> ^( SEQUENCE_SELECT boolean_expression ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:411:5: LEFT_SQUARE_PAREN boolean_expression RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN210=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector2829);  
            stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN210);

            pushFollow(FOLLOW_boolean_expression_in_sequence_selector2831);
            boolean_expression211=boolean_expression();

            state._fsp--;

            stream_boolean_expression.add(boolean_expression211.getTree());
            RIGHT_SQUARE_PAREN212=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector2833);  
            stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN212);



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
            // 412:4: -> ^( SEQUENCE_SELECT boolean_expression )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:412:7: ^( SEQUENCE_SELECT boolean_expression )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:414:10: fragment alias : AS VAR_ID -> ^( AS VAR_ID ) ;
    public final OmttParser.alias_return alias() throws RecognitionException {
        OmttParser.alias_return retval = new OmttParser.alias_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AS213=null;
        Token VAR_ID214=null;

        Object AS213_tree=null;
        Object VAR_ID214_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:415:2: ( AS VAR_ID -> ^( AS VAR_ID ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:415:4: AS VAR_ID
            {
            AS213=(Token)match(input,AS,FOLLOW_AS_in_alias2857);  
            stream_AS.add(AS213);

            VAR_ID214=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_alias2859);  
            stream_VAR_ID.add(VAR_ID214);



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
            // 416:3: -> ^( AS VAR_ID )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:416:6: ^( AS VAR_ID )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:419:1: data_expression : DATA_START ( data_body_atom )* DATA_END -> ^( DATA_START ( data_body_atom )* ) ;
    public final OmttParser.data_expression_return data_expression() throws RecognitionException {
        OmttParser.data_expression_return retval = new OmttParser.data_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DATA_START215=null;
        Token DATA_END217=null;
        OmttParser.data_body_atom_return data_body_atom216 = null;


        Object DATA_START215_tree=null;
        Object DATA_END217_tree=null;
        RewriteRuleTokenStream stream_DATA_END=new RewriteRuleTokenStream(adaptor,"token DATA_END");
        RewriteRuleTokenStream stream_DATA_START=new RewriteRuleTokenStream(adaptor,"token DATA_START");
        RewriteRuleSubtreeStream stream_data_body_atom=new RewriteRuleSubtreeStream(adaptor,"rule data_body_atom");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:420:3: ( DATA_START ( data_body_atom )* DATA_END -> ^( DATA_START ( data_body_atom )* ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:420:5: DATA_START ( data_body_atom )* DATA_END
            {
            DATA_START215=(Token)match(input,DATA_START,FOLLOW_DATA_START_in_data_expression2881);  
            stream_DATA_START.add(DATA_START215);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:420:16: ( data_body_atom )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==STRING_LITERAL||LA72_0==TAG_START||LA72_0==EXPRESSION_START) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:420:16: data_body_atom
            	    {
            	    pushFollow(FOLLOW_data_body_atom_in_data_expression2883);
            	    data_body_atom216=data_body_atom();

            	    state._fsp--;

            	    stream_data_body_atom.add(data_body_atom216.getTree());

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            DATA_END217=(Token)match(input,DATA_END,FOLLOW_DATA_END_in_data_expression2886);  
            stream_DATA_END.add(DATA_END217);



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
            // 421:5: -> ^( DATA_START ( data_body_atom )* )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:421:8: ^( DATA_START ( data_body_atom )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Data(stream_DATA_START.nextToken()), root_1);

                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:421:27: ( data_body_atom )*
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:424:1: atom : selectable_atom ( DOUBLE_DOT selectable_atom )? ;
    public final OmttParser.atom_return atom() throws RecognitionException {
        OmttParser.atom_return retval = new OmttParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_DOT219=null;
        OmttParser.selectable_atom_return selectable_atom218 = null;

        OmttParser.selectable_atom_return selectable_atom220 = null;


        Object DOUBLE_DOT219_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:425:2: ( selectable_atom ( DOUBLE_DOT selectable_atom )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:425:4: selectable_atom ( DOUBLE_DOT selectable_atom )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_selectable_atom_in_atom2914);
            selectable_atom218=selectable_atom();

            state._fsp--;

            adaptor.addChild(root_0, selectable_atom218.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:426:3: ( DOUBLE_DOT selectable_atom )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==DOUBLE_DOT) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:426:4: DOUBLE_DOT selectable_atom
                    {
                    DOUBLE_DOT219=(Token)match(input,DOUBLE_DOT,FOLLOW_DOUBLE_DOT_in_atom2919); 
                    DOUBLE_DOT219_tree = new Range(DOUBLE_DOT219) ;
                    root_0 = (Object)adaptor.becomeRoot(DOUBLE_DOT219_tree, root_0);

                    pushFollow(FOLLOW_selectable_atom_in_atom2925);
                    selectable_atom220=selectable_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, selectable_atom220.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:429:1: selectable_atom : ( object_atom | data_expression | namespace_id | LEFT_PAREN expression RIGHT_PAREN );
    public final OmttParser.selectable_atom_return selectable_atom() throws RecognitionException {
        OmttParser.selectable_atom_return retval = new OmttParser.selectable_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN224=null;
        Token RIGHT_PAREN226=null;
        OmttParser.object_atom_return object_atom221 = null;

        OmttParser.data_expression_return data_expression222 = null;

        OmttParser.namespace_id_return namespace_id223 = null;

        OmttParser.expression_return expression225 = null;


        Object LEFT_PAREN224_tree=null;
        Object RIGHT_PAREN226_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:430:3: ( object_atom | data_expression | namespace_id | LEFT_PAREN expression RIGHT_PAREN )
            int alt74=4;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
            case INT_NUMBER:
            case REAL_NUMBER:
            case NULL:
            case TRUE:
            case FALSE:
            case TILDE:
                {
                alt74=1;
                }
                break;
            case DATA_START:
                {
                alt74=2;
                }
                break;
            case OP_GENERAL:
            case VAR_ID:
                {
                alt74=3;
                }
                break;
            case LEFT_PAREN:
                {
                alt74=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:430:5: object_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_object_atom_in_selectable_atom2939);
                    object_atom221=object_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, object_atom221.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:431:5: data_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_data_expression_in_selectable_atom2945);
                    data_expression222=data_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, data_expression222.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:432:5: namespace_id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespace_id_in_selectable_atom2951);
                    namespace_id223=namespace_id();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace_id223.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:433:5: LEFT_PAREN expression RIGHT_PAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LEFT_PAREN224=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_selectable_atom2957); 
                    pushFollow(FOLLOW_expression_in_selectable_atom2960);
                    expression225=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression225.getTree());
                    RIGHT_PAREN226=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_selectable_atom2962); 

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:435:10: fragment namespace_id : ( (ns= VAR_ID OP_VIEW )? id= VAR_ID -> ^( IDENT[$id] ( $ns)? ) | id= OP_GENERAL -> ^( IDENT[$id] ) );
    public final OmttParser.namespace_id_return namespace_id() throws RecognitionException {
        OmttParser.namespace_id_return retval = new OmttParser.namespace_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ns=null;
        Token id=null;
        Token OP_VIEW227=null;

        Object ns_tree=null;
        Object id_tree=null;
        Object OP_VIEW227_tree=null;
        RewriteRuleTokenStream stream_OP_GENERAL=new RewriteRuleTokenStream(adaptor,"token OP_GENERAL");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_VIEW=new RewriteRuleTokenStream(adaptor,"token OP_VIEW");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:436:3: ( (ns= VAR_ID OP_VIEW )? id= VAR_ID -> ^( IDENT[$id] ( $ns)? ) | id= OP_GENERAL -> ^( IDENT[$id] ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==VAR_ID) ) {
                alt76=1;
            }
            else if ( (LA76_0==OP_GENERAL) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:436:5: (ns= VAR_ID OP_VIEW )? id= VAR_ID
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:436:5: (ns= VAR_ID OP_VIEW )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==VAR_ID) ) {
                        int LA75_1 = input.LA(2);

                        if ( (LA75_1==OP_VIEW) ) {
                            alt75=1;
                        }
                    }
                    switch (alt75) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:436:6: ns= VAR_ID OP_VIEW
                            {
                            ns=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id2980);  
                            stream_VAR_ID.add(ns);

                            OP_VIEW227=(Token)match(input,OP_VIEW,FOLLOW_OP_VIEW_in_namespace_id2982);  
                            stream_OP_VIEW.add(OP_VIEW227);


                            }
                            break;

                    }

                    id=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id2988);  
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
                    // 437:5: -> ^( IDENT[$id] ( $ns)? )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:437:8: ^( IDENT[$id] ( $ns)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Ident(IDENT, id), root_1);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:437:28: ( $ns)?
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:438:5: id= OP_GENERAL
                    {
                    id=(Token)match(input,OP_GENERAL,FOLLOW_OP_GENERAL_in_namespace_id3014);  
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
                    // 439:4: -> ^( IDENT[$id] )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:439:7: ^( IDENT[$id] )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:443:1: object_atom : ( number_atom | STRING_LITERAL | ( NULL | TILDE ) | ( TRUE | FALSE ) );
    public final OmttParser.object_atom_return object_atom() throws RecognitionException {
        OmttParser.object_atom_return retval = new OmttParser.object_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING_LITERAL229=null;
        Token NULL230=null;
        Token TILDE231=null;
        Token TRUE232=null;
        Token FALSE233=null;
        OmttParser.number_atom_return number_atom228 = null;


        Object STRING_LITERAL229_tree=null;
        Object NULL230_tree=null;
        Object TILDE231_tree=null;
        Object TRUE232_tree=null;
        Object FALSE233_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:444:3: ( number_atom | STRING_LITERAL | ( NULL | TILDE ) | ( TRUE | FALSE ) )
            int alt79=4;
            switch ( input.LA(1) ) {
            case INT_NUMBER:
            case REAL_NUMBER:
                {
                alt79=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt79=2;
                }
                break;
            case NULL:
            case TILDE:
                {
                alt79=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt79=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:444:5: number_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_atom_in_object_atom3041);
                    number_atom228=number_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, number_atom228.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:445:5: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL229=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_object_atom3047); 
                    STRING_LITERAL229_tree = new Literal(STRING_LITERAL229) ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_LITERAL229_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:446:5: ( NULL | TILDE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:446:5: ( NULL | TILDE )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==NULL) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==TILDE) ) {
                        alt77=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }
                    switch (alt77) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:446:6: NULL
                            {
                            NULL230=(Token)match(input,NULL,FOLLOW_NULL_in_object_atom3058); 
                            NULL230_tree = new Literal(NULL230) ;
                            root_0 = (Object)adaptor.becomeRoot(NULL230_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:446:23: TILDE
                            {
                            TILDE231=(Token)match(input,TILDE,FOLLOW_TILDE_in_object_atom3066); 
                            TILDE231_tree = new Literal(TILDE231) ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE231_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:447:5: ( TRUE | FALSE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:447:5: ( TRUE | FALSE )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==TRUE) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==FALSE) ) {
                        alt78=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }
                    switch (alt78) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:447:6: TRUE
                            {
                            TRUE232=(Token)match(input,TRUE,FOLLOW_TRUE_in_object_atom3079); 
                            TRUE232_tree = new Literal(TRUE232) ;
                            root_0 = (Object)adaptor.becomeRoot(TRUE232_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:447:23: FALSE
                            {
                            FALSE233=(Token)match(input,FALSE,FOLLOW_FALSE_in_object_atom3087); 
                            FALSE233_tree = new Literal(FALSE233) ;
                            root_0 = (Object)adaptor.becomeRoot(FALSE233_tree, root_0);


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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:450:1: number_atom : ( INT_NUMBER | REAL_NUMBER );
    public final OmttParser.number_atom_return number_atom() throws RecognitionException {
        OmttParser.number_atom_return retval = new OmttParser.number_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_NUMBER234=null;
        Token REAL_NUMBER235=null;

        Object INT_NUMBER234_tree=null;
        Object REAL_NUMBER235_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:451:3: ( INT_NUMBER | REAL_NUMBER )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==INT_NUMBER) ) {
                alt80=1;
            }
            else if ( (LA80_0==REAL_NUMBER) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:451:5: INT_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    INT_NUMBER234=(Token)match(input,INT_NUMBER,FOLLOW_INT_NUMBER_in_number_atom3105); 
                    INT_NUMBER234_tree = new Literal(INT_NUMBER234) ;
                    root_0 = (Object)adaptor.becomeRoot(INT_NUMBER234_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:452:5: REAL_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    REAL_NUMBER235=(Token)match(input,REAL_NUMBER,FOLLOW_REAL_NUMBER_in_number_atom3115); 
                    REAL_NUMBER235_tree = new Literal(REAL_NUMBER235) ;
                    root_0 = (Object)adaptor.becomeRoot(REAL_NUMBER235_tree, root_0);


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
        "\1\31\1\uffff\2\31\3\uffff\2\31\1\112\1\31\1\112\5\31\1\112\2\31"+
        "\1\112\2\31";
    static final String DFA22_maxS =
        "\1\146\1\uffff\2\144\3\uffff\2\144\1\146\1\144\1\146\5\144\1\146"+
        "\2\144\1\146\2\144";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\4\20\uffff";
    static final String DFA22_specialS =
        "\27\uffff}>";
    static final String[] DFA22_transitionS = {
            "\3\6\3\uffff\1\6\17\uffff\1\4\2\uffff\1\6\4\uffff\2\6\1\5\1"+
            "\1\3\6\2\uffff\1\1\10\uffff\1\2\1\6\4\uffff\1\6\13\uffff\1\6"+
            "\4\uffff\1\6\3\uffff\1\3\1\uffff\1\1",
            "",
            "\7\6\2\uffff\1\6\15\uffff\2\6\3\uffff\1\6\1\uffff\3\6\1\uffff"+
            "\3\6\5\uffff\1\6\1\uffff\10\6\1\uffff\12\6\1\uffff\2\6\1\uffff"+
            "\2\6\1\uffff\2\6\3\uffff\1\7",
            "\7\6\2\uffff\1\6\15\uffff\2\6\3\uffff\1\6\1\uffff\3\6\1\uffff"+
            "\3\6\2\uffff\1\1\2\uffff\1\6\1\uffff\1\11\3\6\1\12\3\6\1\uffff"+
            "\2\6\1\10\7\6\1\uffff\2\6\1\uffff\5\6\3\uffff\1\7",
            "",
            "",
            "",
            "\7\6\2\uffff\1\6\15\uffff\2\6\3\uffff\1\6\1\uffff\3\6\1\uffff"+
            "\3\6\2\uffff\1\1\2\uffff\1\6\1\uffff\1\13\3\6\1\12\3\6\1\uffff"+
            "\2\6\1\10\12\6\1\uffff\5\6\3\uffff\1\7",
            "\3\6\3\uffff\1\6\33\uffff\3\6\2\uffff\1\1\4\uffff\1\1\3\uffff"+
            "\1\14\1\6\4\uffff\1\6\20\uffff\1\6\3\uffff\1\15",
            "\1\6\31\uffff\1\6\1\uffff\1\16",
            "\7\6\2\uffff\1\6\15\uffff\2\6\3\uffff\1\6\1\uffff\3\6\1\uffff"+
            "\3\6\5\uffff\1\6\1\uffff\10\6\1\uffff\12\6\1\uffff\2\6\1\uffff"+
            "\2\6\1\uffff\2\6\3\uffff\1\7",
            "\1\6\31\uffff\1\6\1\uffff\1\17",
            "\7\6\2\uffff\1\6\15\uffff\2\6\3\uffff\1\6\1\uffff\3\6\1\uffff"+
            "\3\6\5\uffff\1\6\1\uffff\10\6\1\uffff\12\6\1\uffff\2\6\1\uffff"+
            "\2\6\1\uffff\2\6\3\uffff\1\20",
            "\7\6\2\uffff\1\6\15\uffff\2\6\3\uffff\1\6\1\uffff\3\6\1\uffff"+
            "\3\6\2\uffff\1\1\2\uffff\1\6\1\uffff\1\21\3\6\1\22\3\6\1\uffff"+
            "\2\6\1\10\7\6\1\uffff\2\6\1\uffff\5\6\3\uffff\1\20",
            "\7\6\2\uffff\1\6\15\uffff\2\6\3\uffff\1\6\1\uffff\3\6\1\uffff"+
            "\3\6\2\uffff\1\1\2\uffff\1\6\1\uffff\1\6\1\uffff\2\6\1\12\3"+
            "\6\1\uffff\2\6\1\23\7\6\1\uffff\2\6\1\uffff\2\6\1\uffff\2\6"+
            "\3\uffff\1\7",
            "\7\6\2\uffff\1\6\15\uffff\2\6\3\uffff\1\6\1\uffff\3\6\1\uffff"+
            "\3\6\2\uffff\1\1\2\uffff\1\6\1\uffff\1\6\1\uffff\2\6\1\12\3"+
            "\6\1\uffff\2\6\1\23\7\6\1\uffff\2\6\1\uffff\2\6\1\uffff\2\6"+
            "\3\uffff\1\7",
            "\7\6\2\uffff\1\6\15\uffff\2\6\3\uffff\1\6\1\uffff\3\6\1\uffff"+
            "\3\6\2\uffff\1\1\2\uffff\1\6\1\uffff\1\24\3\6\1\22\3\6\1\uffff"+
            "\2\6\1\10\12\6\1\uffff\5\6\3\uffff\1\20",
            "\1\6\31\uffff\1\6\1\uffff\1\25",
            "\7\6\2\uffff\1\6\15\uffff\2\6\3\uffff\1\6\1\uffff\3\6\1\uffff"+
            "\3\6\5\uffff\1\6\1\uffff\10\6\1\uffff\12\6\1\uffff\2\6\1\uffff"+
            "\2\6\1\uffff\2\6\3\uffff\1\20",
            "\3\6\3\uffff\1\6\33\uffff\3\6\2\uffff\1\1\10\uffff\1\14\1\6"+
            "\4\uffff\1\6\20\uffff\1\6\3\uffff\1\15",
            "\1\6\31\uffff\1\6\1\uffff\1\26",
            "\7\6\2\uffff\1\6\15\uffff\2\6\3\uffff\1\6\1\uffff\3\6\1\uffff"+
            "\3\6\2\uffff\1\1\2\uffff\1\6\1\uffff\1\6\1\uffff\2\6\1\22\3"+
            "\6\1\uffff\2\6\1\23\7\6\1\uffff\2\6\1\uffff\2\6\1\uffff\2\6"+
            "\3\uffff\1\20",
            "\7\6\2\uffff\1\6\15\uffff\2\6\3\uffff\1\6\1\uffff\3\6\1\uffff"+
            "\3\6\2\uffff\1\1\2\uffff\1\6\1\uffff\1\6\1\uffff\2\6\1\22\3"+
            "\6\1\uffff\2\6\1\23\7\6\1\uffff\2\6\1\uffff\2\6\1\uffff\2\6"+
            "\3\uffff\1\20"
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
            return "121:1: expression : ( lambda_expression | def_in_expression | match_expression | concatence_expression );";
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
    public static final BitSet FOLLOW_module_id_in_use_declaration265 = new BitSet(new long[]{0x0020000000000002L});
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
    public static final BitSet FOLLOW_DEF_in_tag_definition387 = new BitSet(new long[]{0x0000000000000000L,0x0000081000000000L});
    public static final BitSet FOLLOW_definition_signature_in_tag_definition389 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_tag_definition395 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_tag_definition399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_signature431 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000203L});
    public static final BitSet FOLLOW_DEFAULT_in_definition_signature433 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000203L});
    public static final BitSet FOLLOW_definition_context_in_definition_signature436 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000201L});
    public static final BitSet FOLLOW_definition_argument_in_definition_signature439 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000201L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_definition_signature443 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_type_in_definition_signature447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_REVERSE_FOLLOW_in_definition_context498 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_single_type_in_definition_context500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_definition_argument524 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_argument529 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010020L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_definition_argument531 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_DOT_in_definition_argument535 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_type_in_definition_argument537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content583 = new BitSet(new long[]{0x0000000222000002L});
    public static final BitSet FOLLOW_data_body_atom_in_tag_content589 = new BitSet(new long[]{0x0000000222000002L});
    public static final BitSet FOLLOW_OP_DATA_IS_EXPRESSION_in_tag_content612 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content614 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_expression_in_tag_content620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_data_body_atom641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_inside_data_in_data_body_atom651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_inside_data_in_data_body_atom657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_START_in_expression_inside_data672 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_expression_in_expression_inside_data675 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_EXPRESSION_END_in_expression_inside_data677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_tag_in_tag_inside_data693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_tag_in_tag_inside_data699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_tag_in_tag_inside_data705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_tag_in_tag_inside_data711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_apply_tag_in_tag_inside_data717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expression_in_expression733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_expression_in_expression739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expression_in_expression745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concatence_expression_in_expression751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_def_in_expression766 = new BitSet(new long[]{0x0000000000000000L,0x0000081000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression770 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_AND_in_def_in_expression777 = new BitSet(new long[]{0x0000000000000000L,0x0000081000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression781 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_expression789 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008609L});
    public static final BitSet FOLLOW_COLON_in_def_in_expression791 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_expression_in_def_in_expression796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_expression828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COLON_in_definition_inside_expression830 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_expression859 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_expression861 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag899 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DEF_in_def_in_tag901 = new BitSet(new long[]{0x0000000000000000L,0x0000081000000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag905 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag912 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_AND_in_def_in_tag914 = new BitSet(new long[]{0x0000000000000000L,0x0000081000000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag918 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag926 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_tag928 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_def_in_tag932 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_def_in_tag938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_tag970 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_definition_inside_tag974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_tag998 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_tag1000 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_expression_in_definition_inside_tag1002 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_CONTENT_in_definition_inside_tag1005 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_definition_inside_tag1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAMBDA_in_lambda_expression1046 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000208L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression1048 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000208L});
    public static final BitSet FOLLOW_COLON_in_lambda_expression1051 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_expression_in_lambda_expression1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression1081 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000201L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_lambda_expression1084 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_expression_in_lambda_expression1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_match_expression_in_lambda_expression1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_lambda_match_in_lambda_match_expression1126 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMICOLON_in_lambda_match_expression1129 = new BitSet(new long[]{0x0400000000000000L,0x0000005000000201L});
    public static final BitSet FOLLOW_single_lambda_match_in_lambda_match_expression1131 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_type_in_single_lambda_match1145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_single_lambda_match1147 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_concatence_expression_in_single_lambda_match1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_match_expression1161 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_expression_in_match_expression1163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COLON_in_match_expression1165 = new BitSet(new long[]{0x0400000000000000L,0x0000005000000201L});
    public static final BitSet FOLLOW_lambda_match_expression_in_match_expression1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_ID_in_type1214 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_type1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_ID_in_single_type1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expression_in_concatence_expression1275 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_OP_CONCAT_in_concatence_expression1289 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_control_expression_in_concatence_expression1293 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_if_expression_in_control_expression1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_expression_in_control_expression1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_context_expression_in_control_expression1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_expression1348 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_context_expression_in_if_expression1352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COLON_in_if_expression1354 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_control_expression_in_if_expression1362 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_expression1368 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008609L});
    public static final BitSet FOLLOW_COLON_in_if_expression1370 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_control_expression_in_if_expression1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_if_tag1413 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_if_subtag_in_if_tag1419 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_if_tag1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_subtag1441 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_context_expression_in_if_subtag1445 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_if_subtag1453 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TAG_START_in_if_subtag1463 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_subtag1465 = new BitSet(new long[]{0x0004000810000000L});
    public static final BitSet FOLLOW_tag_content_in_if_subtag1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_subtag_in_if_subtag1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_map_expression1522 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_item_alias_in_map_expression1524 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_context_expression_in_map_expression1529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COLON_in_map_expression1531 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_control_expression_in_map_expression1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_map_tag1573 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_MAP_in_map_tag1575 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_item_alias_in_map_tag1577 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_context_expression_in_map_tag1582 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_map_tag1590 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_map_tag1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_item_alias1632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_OP_REVERSE_FOLLOW_in_item_alias1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_context_expression_in_context_expression1660 = new BitSet(new long[]{0x0380000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_op_apply_in_context_expression1674 = new BitSet(new long[]{0x380000008E000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_atom_expression_in_context_expression1676 = new BitSet(new long[]{0x3B8000008E000000L,0x0000001138008600L});
    public static final BitSet FOLLOW_function_arguments_in_context_expression1680 = new BitSet(new long[]{0x0380000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_op_match_in_context_expression1720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_context_expression1722 = new BitSet(new long[]{0x0400000000000000L,0x0000005000000201L});
    public static final BitSet FOLLOW_lambda_match_expression_in_context_expression1724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_context_expression1726 = new BitSet(new long[]{0x0380000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_op_map_in_context_expression1761 = new BitSet(new long[]{0x380000008E000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_boolean_expression_in_context_expression1765 = new BitSet(new long[]{0x0380000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_OP_CONTEXT_in_op_apply1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_op_apply1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_op_match1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_EXPRESSION_CONTEXT_in_op_map1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_op_map1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_base_context_expression1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_apply_expression_in_base_context_expression1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_apply_expression1876 = new BitSet(new long[]{0x380000008E000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_atom_expression_in_apply_expression1878 = new BitSet(new long[]{0x380000008E000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_function_arguments_in_apply_expression1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_apply_tag1924 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_apply_expression_in_apply_tag1927 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_apply_tag1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_binary_expression_in_boolean_expression1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression1956 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_boolean_binary_operator_in_boolean_binary_expression1959 = new BitSet(new long[]{0x380000008E000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression1962 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_boolean_unary_operator_in_boolean_unary_expression1978 = new BitSet(new long[]{0x380000008E000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_AND_in_boolean_binary_operator2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_OR_in_boolean_binary_operator2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_in_boolean_unary_operator2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression2047 = new BitSet(new long[]{0x0000000000000002L,0x0000000000FC0000L});
    public static final BitSet FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression2050 = new BitSet(new long[]{0x380000008E000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression2053 = new BitSet(new long[]{0x0000000000000002L,0x0000000000FC0000L});
    public static final BitSet FOLLOW_OP_EQUAL_in_boolean_comparsion_operator2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LE_in_boolean_comparsion_operator2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LEQ_in_boolean_comparsion_operator2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GE_in_boolean_comparsion_operator2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GEQ_in_boolean_comparsion_operator2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2139 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_OP_PLUS_in_additive_expression2155 = new BitSet(new long[]{0x380000008E000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_OP_MINUS_in_additive_expression2169 = new BitSet(new long[]{0x380000008E000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2189 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression2209 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030100L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_multiplicative_expression2219 = new BitSet(new long[]{0x380000008E000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_SLASH_in_multiplicative_expression2233 = new BitSet(new long[]{0x380000008E000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_OP_MODULO_in_multiplicative_expression2247 = new BitSet(new long[]{0x380000008E000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression2267 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030100L});
    public static final BitSet FOLLOW_OP_MINUS_in_negative_expression2286 = new BitSet(new long[]{0x380000008E000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_functional_expression_in_negative_expression2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functional_expression_in_negative_expression2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_expression_in_functional_expression2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expression_in_call_expression2333 = new BitSet(new long[]{0x380000008E000002L,0x0000001108008600L});
    public static final BitSet FOLLOW_function_argument_in_call_expression2341 = new BitSet(new long[]{0x380000008E000002L,0x0000001108008600L});
    public static final BitSet FOLLOW_TAG_START_in_call_tag2401 = new BitSet(new long[]{0x0000000000000000L,0x0000001100000000L});
    public static final BitSet FOLLOW_namespace_id_in_call_tag2405 = new BitSet(new long[]{0x38000008DE000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_function_arguments_in_call_tag2407 = new BitSet(new long[]{0x0000000850000000L});
    public static final BitSet FOLLOW_tag_content_in_call_tag2416 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_call_tag2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_argument_in_function_arguments2469 = new BitSet(new long[]{0x380000008E000002L,0x0000001108008600L});
    public static final BitSet FOLLOW_VAR_ID_in_function_argument2485 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_function_argument2487 = new BitSet(new long[]{0x380000008E000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_atom_expression_in_function_argument2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_with_properties_in_atom_expression2526 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMA_in_atom_expression2539 = new BitSet(new long[]{0x380000008E000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_atom_with_properties_in_atom_expression2541 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_atom_with_selectors_in_atom_with_properties2573 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_DOT_in_atom_with_properties2586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_expression_select_in_atom_with_properties2590 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_DOT_in_atom_with_properties2617 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_property_select_in_atom_with_properties2621 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_atom_in_atom_with_selectors2659 = new BitSet(new long[]{0x0020000000000002L,0x0000000000001020L});
    public static final BitSet FOLLOW_sequence_selectors_in_atom_with_selectors2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_expression_select2705 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_expression_in_expression_select2707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_expression_select2709 = new BitSet(new long[]{0x0020000000000002L,0x0000000000001020L});
    public static final BitSet FOLLOW_sequence_selectors_in_expression_select2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_property_select2755 = new BitSet(new long[]{0x0020000000000002L,0x0000000000001020L});
    public static final BitSet FOLLOW_sequence_selectors_in_property_select2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_selector_in_sequence_selectors2770 = new BitSet(new long[]{0x0020000000000002L,0x0000000000001020L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors2772 = new BitSet(new long[]{0x0020000000000002L,0x0000000000001020L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors2781 = new BitSet(new long[]{0x0020000000000002L,0x0000000000001020L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_type_selector2802 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_single_type_in_type_selector2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector2829 = new BitSet(new long[]{0x380000008E000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_boolean_expression_in_sequence_selector2831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_alias2857 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_alias2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_START_in_data_expression2881 = new BitSet(new long[]{0x0000000322000000L});
    public static final BitSet FOLLOW_data_body_atom_in_data_expression2883 = new BitSet(new long[]{0x0000000322000000L});
    public static final BitSet FOLLOW_DATA_END_in_data_expression2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectable_atom_in_atom2914 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_DOUBLE_DOT_in_atom2919 = new BitSet(new long[]{0x380000008E000000L,0x0000001108008600L});
    public static final BitSet FOLLOW_selectable_atom_in_atom2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_atom_in_selectable_atom2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_expression_in_selectable_atom2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_id_in_selectable_atom2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_selectable_atom2957 = new BitSet(new long[]{0x3F8480008E000000L,0x0000005108008601L});
    public static final BitSet FOLLOW_expression_in_selectable_atom2960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_selectable_atom2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id2980 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_OP_VIEW_in_namespace_id2982 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GENERAL_in_namespace_id3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_atom_in_object_atom3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_object_atom3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_object_atom3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_object_atom3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_object_atom3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_object_atom3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_NUMBER_in_number_atom3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_NUMBER_in_number_atom3115 = new BitSet(new long[]{0x0000000000000002L});

}