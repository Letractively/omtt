// $ANTLR 3.1.2 /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g 2009-07-30 04:21:55

package pl.omtt.lang.grammar;

import pl.omtt.lang.model.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class OmttParser extends AbstractOmttParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "HEADER", "USE", "USES", "IMPORT", "IMPORTS", "CLASS", "IDENT", "ATOM_SELECT", "PROPERTY_SELECT", "TYPE_SELECT", "SEQUENCE_SELECT", "ITERATE", "ARGUMENTS", "ARGUMENT", "RETURNS", "BLOCK", "IF_ELSE", "CALL", "CAST", "SEQUENCE", "STRING_LITERAL", "INT_NUMBER", "REAL_NUMBER", "CONTENT", "TAG_START", "TAG_END", "DATA_START", "DATA_END", "EXPRESSION_START", "EXPRESSION_END", "OP_DATA_IS_EXPRESSION", "IT", "ITEM", "COMMENT_SINGLE_LINE", "COMMENT_MULTI_LINE", "WS", "NEWLINE", "ACTION_ON_NEWLINE", "STRING_PARENS", "MODE_LEFT_PAREN", "MODE_RIGHT_PAREN", "MODULE", "DEF", "AND", "IN", "IF", "THEN", "ELSE", "AS", "IS", "MAP", "APPLY", "MATCH", "WHERE", "LAMBDA", "NULL", "TRUE", "FALSE", "INNER_TAG_KEYWORD", "SINGLE_TAG_KEYWORD", "OP_FOLLOW", "OP_REVERSE_FOLLOW", "OP_DOUBLE_FOLLOW", "COLON", "SEMICOLON", "DOT", "DOUBLE_DOT", "COMA", "SLASH", "TILDE", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_SQUARE_PAREN", "RIGHT_SQUARE_PAREN", "OP_PLUS", "OP_MINUS", "OP_MULTIPLY", "OP_MODULO", "OP_EQUAL", "OP_NOT_EQUAL", "OP_LEQ", "OP_LE", "OP_GEQ", "OP_GE", "OP_ASSIGN", "OP_AND", "OP_OR", "OP_NOT", "OP_CONTEXT", "OP_EXPRESSION_CONTEXT", "OP_VIEW", "OP_CONCAT", "OP_GENERAL", "OP_DATA", "SMALL_LETTER", "NAMECHAR", "VAR_ID", "BIG_LETTER", "CLASS_ID", "DIGIT", "INT_OR_REAL_NUMBER", "LETTER", "NOT_NAME"
    };
    public static final int CAST=23;
    public static final int OP_LE=86;
    public static final int OP_REVERSE_FOLLOW=66;
    public static final int INT_NUMBER=26;
    public static final int OP_AND=90;
    public static final int INT_OR_REAL_NUMBER=105;
    public static final int LETTER=106;
    public static final int OP_GEQ=87;
    public static final int OP_GE=88;
    public static final int EOF=-1;
    public static final int DOUBLE_DOT=71;
    public static final int IMPORT=8;
    public static final int STRING_LITERAL=25;
    public static final int MODE_LEFT_PAREN=44;
    public static final int OP_MINUS=80;
    public static final int OP_NOT_EQUAL=84;
    public static final int SEQUENCE_SELECT=15;
    public static final int OP_EXPRESSION_CONTEXT=94;
    public static final int VAR_ID=101;
    public static final int ARGUMENTS=17;
    public static final int NULL=60;
    public static final int ELSE=52;
    public static final int MATCH=57;
    public static final int SEMICOLON=69;
    public static final int SINGLE_TAG_KEYWORD=64;
    public static final int MODE_RIGHT_PAREN=45;
    public static final int CONTENT=28;
    public static final int DATA_START=31;
    public static final int EXPRESSION_START=33;
    public static final int NAMECHAR=100;
    public static final int SEQUENCE=24;
    public static final int INNER_TAG_KEYWORD=63;
    public static final int WS=40;
    public static final int OP_DATA=98;
    public static final int USES=7;
    public static final int REAL_NUMBER=27;
    public static final int LEFT_PAREN=75;
    public static final int OP_EQUAL=83;
    public static final int IMPORTS=9;
    public static final int CALL=22;
    public static final int OP_DATA_IS_EXPRESSION=35;
    public static final int USE=6;
    public static final int FALSE=62;
    public static final int STRING_PARENS=43;
    public static final int COMMENT_SINGLE_LINE=38;
    public static final int CLASS_ID=103;
    public static final int OP_CONCAT=96;
    public static final int SMALL_LETTER=99;
    public static final int APPLY=56;
    public static final int WHERE=58;
    public static final int CLASS=10;
    public static final int DEF=47;
    public static final int OP_FOLLOW=65;
    public static final int OP_ASSIGN=89;
    public static final int EXPRESSION_END=34;
    public static final int OP_OR=91;
    public static final int TYPE_SELECT=14;
    public static final int AND=48;
    public static final int DATA_END=32;
    public static final int IF_ELSE=21;
    public static final int IF=50;
    public static final int COMMENT_MULTI_LINE=39;
    public static final int AS=53;
    public static final int RIGHT_PAREN=76;
    public static final int BIG_LETTER=102;
    public static final int SLASH=73;
    public static final int IN=49;
    public static final int THEN=51;
    public static final int LEFT_SQUARE_PAREN=77;
    public static final int IS=54;
    public static final int IT=36;
    public static final int TAG_START=29;
    public static final int ARGUMENT=18;
    public static final int RIGHT_SQUARE_PAREN=78;
    public static final int TILDE=74;
    public static final int OP_GENERAL=97;
    public static final int IDENT=11;
    public static final int OP_NOT=92;
    public static final int OP_DOUBLE_FOLLOW=67;
    public static final int DIGIT=104;
    public static final int LAMBDA=59;
    public static final int HEADER=5;
    public static final int DOT=70;
    public static final int NOT_NAME=107;
    public static final int OP_MULTIPLY=81;
    public static final int RETURNS=19;
    public static final int ITEM=37;
    public static final int OP_PLUS=79;
    public static final int ATOM_SELECT=12;
    public static final int MODULE=46;
    public static final int COMA=72;
    public static final int TRUE=61;
    public static final int OP_VIEW=95;
    public static final int OP_MODULO=82;
    public static final int COLON=68;
    public static final int ITERATE=16;
    public static final int TAG_END=30;
    public static final int NEWLINE=41;
    public static final int BLOCK=20;
    public static final int MAP=55;
    public static final int PROPERTY_SELECT=13;
    public static final int OP_CONTEXT=93;
    public static final int ACTION_ON_NEWLINE=42;
    public static final int PROGRAM=4;
    public static final int OP_LEQ=85;

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
            IMPORT17=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_declaration230);  
            stream_IMPORT.add(IMPORT17);

            pushFollow(FOLLOW_external_class_name_in_import_declaration234);
            ec=external_class_name();

            state._fsp--;

            stream_external_class_name.add(ec.getTree());


            // AST REWRITE
            // elements: IMPORT, ec
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
            // elements: module_id, VAR_ID, USE
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:74:10: fragment definition_signature : VAR_ID ( definition_context )? ( definition_argument )* ( OP_FOLLOW ret_type= type )? -> VAR_ID ( definition_context )? ^( ARGUMENTS ( definition_argument )* ) ^( RETURNS ( $ret_type)? ) ;
    public final OmttParser.definition_signature_return definition_signature() throws RecognitionException {
        OmttParser.definition_signature_return retval = new OmttParser.definition_signature_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID33=null;
        Token OP_FOLLOW36=null;
        OmttParser.type_return ret_type = null;

        OmttParser.definition_context_return definition_context34 = null;

        OmttParser.definition_argument_return definition_argument35 = null;


        Object VAR_ID33_tree=null;
        Object OP_FOLLOW36_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_FOLLOW");
        RewriteRuleSubtreeStream stream_definition_context=new RewriteRuleSubtreeStream(adaptor,"rule definition_context");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_definition_argument=new RewriteRuleSubtreeStream(adaptor,"rule definition_argument");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:3: ( VAR_ID ( definition_context )? ( definition_argument )* ( OP_FOLLOW ret_type= type )? -> VAR_ID ( definition_context )? ^( ARGUMENTS ( definition_argument )* ) ^( RETURNS ( $ret_type)? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:5: VAR_ID ( definition_context )? ( definition_argument )* ( OP_FOLLOW ret_type= type )?
            {
            VAR_ID33=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_signature430);  
            stream_VAR_ID.add(VAR_ID33);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:12: ( definition_context )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==OP_REVERSE_FOLLOW) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:12: definition_context
                    {
                    pushFollow(FOLLOW_definition_context_in_definition_signature432);
                    definition_context34=definition_context();

                    state._fsp--;

                    stream_definition_context.add(definition_context34.getTree());

                    }
                    break;

            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:32: ( definition_argument )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==TILDE||LA12_0==VAR_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:32: definition_argument
            	    {
            	    pushFollow(FOLLOW_definition_argument_in_definition_signature435);
            	    definition_argument35=definition_argument();

            	    state._fsp--;

            	    stream_definition_argument.add(definition_argument35.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:53: ( OP_FOLLOW ret_type= type )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==OP_FOLLOW) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:54: OP_FOLLOW ret_type= type
                    {
                    OP_FOLLOW36=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_definition_signature439);  
                    stream_OP_FOLLOW.add(OP_FOLLOW36);

                    pushFollow(FOLLOW_type_in_definition_signature443);
                    ret_type=type();

                    state._fsp--;

                    stream_type.add(ret_type.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: definition_context, ret_type, VAR_ID, definition_argument
            // token labels: 
            // rule labels: retval, ret_type
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ret_type=new RewriteRuleSubtreeStream(adaptor,"rule ret_type",ret_type!=null?ret_type.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:5: -> VAR_ID ( definition_context )? ^( ARGUMENTS ( definition_argument )* ) ^( RETURNS ( $ret_type)? )
            {
                adaptor.addChild(root_0, new Ident(stream_VAR_ID.nextToken()));
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:22: ( definition_context )?
                if ( stream_definition_context.hasNext() ) {
                    adaptor.addChild(root_0, stream_definition_context.nextTree());

                }
                stream_definition_context.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:42: ^( ARGUMENTS ( definition_argument )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:54: ( definition_argument )*
                while ( stream_definition_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_definition_argument.nextTree());

                }
                stream_definition_argument.reset();

                adaptor.addChild(root_0, root_1);
                }
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:76: ^( RETURNS ( $ret_type)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURNS, "RETURNS"), root_1);

                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:86: ( $ret_type)?
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

        Token OP_REVERSE_FOLLOW37=null;
        OmttParser.single_type_return single_type38 = null;


        Object OP_REVERSE_FOLLOW37_tree=null;
        RewriteRuleTokenStream stream_OP_REVERSE_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_REVERSE_FOLLOW");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:79:2: ( OP_REVERSE_FOLLOW single_type -> ^( ARGUMENT single_type ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:79:4: OP_REVERSE_FOLLOW single_type
            {
            OP_REVERSE_FOLLOW37=(Token)match(input,OP_REVERSE_FOLLOW,FOLLOW_OP_REVERSE_FOLLOW_in_definition_context487);  
            stream_OP_REVERSE_FOLLOW.add(OP_REVERSE_FOLLOW37);

            pushFollow(FOLLOW_single_type_in_definition_context489);
            single_type38=single_type();

            state._fsp--;

            stream_single_type.add(single_type38.getTree());


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
        Token TILDE39=null;
        Token OP_MULTIPLY40=null;
        Token DOT41=null;
        OmttParser.type_return type42 = null;


        Object id_tree=null;
        Object TILDE39_tree=null;
        Object OP_MULTIPLY40_tree=null;
        Object DOT41_tree=null;
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
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==TILDE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:84:5: TILDE
                    {
                    TILDE39=(Token)match(input,TILDE,FOLLOW_TILDE_in_definition_argument513);  
                    stream_TILDE.add(TILDE39);


                    }
                    break;

            }

            id=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_argument518);  
            stream_VAR_ID.add(id);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:84:22: ( OP_MULTIPLY )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==OP_MULTIPLY) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:84:22: OP_MULTIPLY
                    {
                    OP_MULTIPLY40=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_definition_argument520);  
                    stream_OP_MULTIPLY.add(OP_MULTIPLY40);


                    }
                    break;

            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:84:35: ( DOT type )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==DOT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:84:36: DOT type
                    {
                    DOT41=(Token)match(input,DOT,FOLLOW_DOT_in_definition_argument524);  
                    stream_DOT.add(DOT41);

                    pushFollow(FOLLOW_type_in_definition_argument526);
                    type42=type();

                    state._fsp--;

                    stream_type.add(type42.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: TILDE, OP_MULTIPLY, type
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
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:92:3: ( CONTENT ( data_body_atom )* -> ^( CONTENT ( data_body_atom )* ) | OP_DATA_IS_EXPRESSION CONTENT expression -> expression )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==CONTENT) ) {
                alt18=1;
            }
            else if ( (LA18_0==OP_DATA_IS_EXPRESSION) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:92:5: CONTENT ( data_body_atom )*
                    {
                    CONTENT43=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_tag_content572);  
                    stream_CONTENT.add(CONTENT43);

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:93:5: ( data_body_atom )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==TAG_START) ) {
                            int LA17_2 = input.LA(2);

                            if ( (LA17_2==DEF||LA17_2==IF||(LA17_2>=MAP && LA17_2<=APPLY)||LA17_2==OP_GENERAL||LA17_2==VAR_ID) ) {
                                alt17=1;
                            }


                        }
                        else if ( (LA17_0==STRING_LITERAL||LA17_0==EXPRESSION_START) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:93:5: data_body_atom
                    	    {
                    	    pushFollow(FOLLOW_data_body_atom_in_tag_content578);
                    	    data_body_atom44=data_body_atom();

                    	    state._fsp--;

                    	    stream_data_body_atom.add(data_body_atom44.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
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
                    OP_DATA_IS_EXPRESSION45=(Token)match(input,OP_DATA_IS_EXPRESSION,FOLLOW_OP_DATA_IS_EXPRESSION_in_tag_content601);  
                    stream_OP_DATA_IS_EXPRESSION.add(OP_DATA_IS_EXPRESSION45);

                    CONTENT46=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_tag_content603);  
                    stream_CONTENT.add(CONTENT46);

                    pushFollow(FOLLOW_expression_in_tag_content609);
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

        Token STRING_LITERAL48=null;
        OmttParser.expression_inside_data_return expression_inside_data49 = null;

        OmttParser.tag_inside_data_return tag_inside_data50 = null;


        Object STRING_LITERAL48_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:101:3: ( STRING_LITERAL | expression_inside_data | tag_inside_data )
            int alt19=3;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
                {
                alt19=1;
                }
                break;
            case EXPRESSION_START:
                {
                alt19=2;
                }
                break;
            case TAG_START:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:101:5: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL48=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_data_body_atom630); 
                    STRING_LITERAL48_tree = new Literal(STRING_LITERAL48) ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_LITERAL48_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:102:5: expression_inside_data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_inside_data_in_data_body_atom640);
                    expression_inside_data49=expression_inside_data();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_inside_data49.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:103:5: tag_inside_data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tag_inside_data_in_data_body_atom646);
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:106:10: fragment expression_inside_data : EXPRESSION_START expression EXPRESSION_END ;
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
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:107:3: ( EXPRESSION_START expression EXPRESSION_END )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:107:5: EXPRESSION_START expression EXPRESSION_END
            {
            root_0 = (Object)adaptor.nil();

            EXPRESSION_START51=(Token)match(input,EXPRESSION_START,FOLLOW_EXPRESSION_START_in_expression_inside_data661); 
            pushFollow(FOLLOW_expression_in_expression_inside_data664);
            expression52=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression52.getTree());
            EXPRESSION_END53=(Token)match(input,EXPRESSION_END,FOLLOW_EXPRESSION_END_in_expression_inside_data666); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

        OmttParser.def_in_tag_return def_in_tag54 = null;

        OmttParser.if_tag_return if_tag55 = null;

        OmttParser.call_tag_return call_tag56 = null;

        OmttParser.map_tag_return map_tag57 = null;

        OmttParser.apply_tag_return apply_tag58 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:111:3: ( def_in_tag | if_tag | call_tag | map_tag | apply_tag )
            int alt20=5;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==TAG_START) ) {
                switch ( input.LA(2) ) {
                case DEF:
                    {
                    alt20=1;
                    }
                    break;
                case MAP:
                    {
                    alt20=4;
                    }
                    break;
                case IF:
                    {
                    alt20=2;
                    }
                    break;
                case APPLY:
                    {
                    alt20=5;
                    }
                    break;
                case OP_GENERAL:
                case VAR_ID:
                    {
                    alt20=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:111:5: def_in_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_def_in_tag_in_tag_inside_data682);
                    def_in_tag54=def_in_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, def_in_tag54.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:112:5: if_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_tag_in_tag_inside_data688);
                    if_tag55=if_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, if_tag55.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:113:5: call_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_tag_in_tag_inside_data694);
                    call_tag56=call_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, call_tag56.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:114:5: map_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_tag_in_tag_inside_data700);
                    map_tag57=map_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, map_tag57.getTree());

                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:115:5: apply_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_apply_tag_in_tag_inside_data706);
                    apply_tag58=apply_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, apply_tag58.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:121:1: expression : ( def_in_expression | if_expression | map_expression | match_expression | lambda_expression | context_expression );
    public final OmttParser.expression_return expression() throws RecognitionException {
        OmttParser.expression_return retval = new OmttParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.def_in_expression_return def_in_expression59 = null;

        OmttParser.if_expression_return if_expression60 = null;

        OmttParser.map_expression_return map_expression61 = null;

        OmttParser.match_expression_return match_expression62 = null;

        OmttParser.lambda_expression_return lambda_expression63 = null;

        OmttParser.context_expression_return context_expression64 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:122:3: ( def_in_expression | if_expression | map_expression | match_expression | lambda_expression | context_expression )
            int alt21=6;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:122:5: def_in_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_def_in_expression_in_expression722);
                    def_in_expression59=def_in_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, def_in_expression59.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:123:5: if_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_expression_in_expression728);
                    if_expression60=if_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, if_expression60.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:124:5: map_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_expression_in_expression734);
                    map_expression61=map_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, map_expression61.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:125:5: match_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_match_expression_in_expression740);
                    match_expression62=match_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, match_expression62.getTree());

                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:126:5: lambda_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expression_in_expression746);
                    lambda_expression63=lambda_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, lambda_expression63.getTree());

                    }
                    break;
                case 6 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:127:5: context_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_context_expression_in_expression752);
                    context_expression64=context_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, context_expression64.getTree());

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

    public static class safe_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safe_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:130:1: safe_expression : ( safe_def_in_expression | safe_if_expression | safe_map_expression | strict_expression );
    public final OmttParser.safe_expression_return safe_expression() throws RecognitionException {
        OmttParser.safe_expression_return retval = new OmttParser.safe_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.safe_def_in_expression_return safe_def_in_expression65 = null;

        OmttParser.safe_if_expression_return safe_if_expression66 = null;

        OmttParser.safe_map_expression_return safe_map_expression67 = null;

        OmttParser.strict_expression_return strict_expression68 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:131:3: ( safe_def_in_expression | safe_if_expression | safe_map_expression | strict_expression )
            int alt22=4;
            switch ( input.LA(1) ) {
            case DEF:
                {
                alt22=1;
                }
                break;
            case IF:
                {
                alt22=2;
                }
                break;
            case MAP:
                {
                alt22=3;
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
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:131:5: safe_def_in_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safe_def_in_expression_in_safe_expression765);
                    safe_def_in_expression65=safe_def_in_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, safe_def_in_expression65.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:132:5: safe_if_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safe_if_expression_in_safe_expression771);
                    safe_if_expression66=safe_if_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, safe_if_expression66.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:133:5: safe_map_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safe_map_expression_in_safe_expression777);
                    safe_map_expression67=safe_map_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, safe_map_expression67.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:134:5: strict_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_strict_expression_in_safe_expression783);
                    strict_expression68=strict_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, strict_expression68.getTree());

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
    // $ANTLR end "safe_expression"

    public static class def_in_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "def_in_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:138:1: def_in_expression : DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.def_in_expression_return def_in_expression() throws RecognitionException {
        OmttParser.def_in_expression_return retval = new OmttParser.def_in_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEF69=null;
        Token AND70=null;
        Token IN71=null;
        Token COLON72=null;
        List list_definition=null;
        OmttParser.expression_return content = null;

        OmttParser.definition_inside_expression_return definition = null;
         definition = null;
        Object DEF69_tree=null;
        Object AND70_tree=null;
        Object IN71_tree=null;
        Object COLON72_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_inside_expression=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:139:3: ( DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:139:5: DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression
            {
            DEF69=(Token)match(input,DEF,FOLLOW_DEF_in_def_in_expression797);  
            stream_DEF.add(DEF69);

            pushFollow(FOLLOW_definition_inside_expression_in_def_in_expression801);
            definition=definition_inside_expression();

            state._fsp--;

            stream_definition_inside_expression.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:140:5: ( AND definition+= definition_inside_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:140:6: AND definition+= definition_inside_expression
            	    {
            	    AND70=(Token)match(input,AND,FOLLOW_AND_in_def_in_expression808);  
            	    stream_AND.add(AND70);

            	    pushFollow(FOLLOW_definition_inside_expression_in_def_in_expression812);
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

            IN71=(Token)match(input,IN,FOLLOW_IN_in_def_in_expression820);  
            stream_IN.add(IN71);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:141:8: ( COLON )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==COLON) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:141:8: COLON
                    {
                    COLON72=(Token)match(input,COLON,FOLLOW_COLON_in_def_in_expression822);  
                    stream_COLON.add(COLON72);


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_def_in_expression827);
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
            // 142:5: -> ^( BLOCK ( $definition)+ $content)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:142:8: ^( BLOCK ( $definition)+ $content)
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

    public static class safe_def_in_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safe_def_in_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:144:1: safe_def_in_expression : DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= safe_expression -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.safe_def_in_expression_return safe_def_in_expression() throws RecognitionException {
        OmttParser.safe_def_in_expression_return retval = new OmttParser.safe_def_in_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEF73=null;
        Token AND74=null;
        Token IN75=null;
        Token COLON76=null;
        List list_definition=null;
        OmttParser.safe_expression_return content = null;

        OmttParser.definition_inside_expression_return definition = null;
         definition = null;
        Object DEF73_tree=null;
        Object AND74_tree=null;
        Object IN75_tree=null;
        Object COLON76_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_safe_expression=new RewriteRuleSubtreeStream(adaptor,"rule safe_expression");
        RewriteRuleSubtreeStream stream_definition_inside_expression=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:145:3: ( DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= safe_expression -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:145:5: DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= safe_expression
            {
            DEF73=(Token)match(input,DEF,FOLLOW_DEF_in_safe_def_in_expression859);  
            stream_DEF.add(DEF73);

            pushFollow(FOLLOW_definition_inside_expression_in_safe_def_in_expression863);
            definition=definition_inside_expression();

            state._fsp--;

            stream_definition_inside_expression.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:146:5: ( AND definition+= definition_inside_expression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==AND) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:146:6: AND definition+= definition_inside_expression
            	    {
            	    AND74=(Token)match(input,AND,FOLLOW_AND_in_safe_def_in_expression870);  
            	    stream_AND.add(AND74);

            	    pushFollow(FOLLOW_definition_inside_expression_in_safe_def_in_expression874);
            	    definition=definition_inside_expression();

            	    state._fsp--;

            	    stream_definition_inside_expression.add(definition.getTree());
            	    if (list_definition==null) list_definition=new ArrayList();
            	    list_definition.add(definition.getTree());


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            IN75=(Token)match(input,IN,FOLLOW_IN_in_safe_def_in_expression882);  
            stream_IN.add(IN75);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:147:8: ( COLON )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==COLON) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:147:8: COLON
                    {
                    COLON76=(Token)match(input,COLON,FOLLOW_COLON_in_safe_def_in_expression884);  
                    stream_COLON.add(COLON76);


                    }
                    break;

            }

            pushFollow(FOLLOW_safe_expression_in_safe_def_in_expression889);
            content=safe_expression();

            state._fsp--;

            stream_safe_expression.add(content.getTree());


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
            // 148:5: -> ^( BLOCK ( $definition)+ $content)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:148:8: ^( BLOCK ( $definition)+ $content)
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
    // $ANTLR end "safe_def_in_expression"

    public static class definition_inside_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition_inside_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:150:1: definition_inside_expression : ( definition_signature COLON expression -> ^( DEF definition_signature expression ) | VAR_ID OP_ASSIGN expression -> ^( DEF VAR_ID expression ) );
    public final OmttParser.definition_inside_expression_return definition_inside_expression() throws RecognitionException {
        OmttParser.definition_inside_expression_return retval = new OmttParser.definition_inside_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON78=null;
        Token VAR_ID80=null;
        Token OP_ASSIGN81=null;
        OmttParser.definition_signature_return definition_signature77 = null;

        OmttParser.expression_return expression79 = null;

        OmttParser.expression_return expression82 = null;


        Object COLON78_tree=null;
        Object VAR_ID80_tree=null;
        Object OP_ASSIGN81_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_signature=new RewriteRuleSubtreeStream(adaptor,"rule definition_signature");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:151:3: ( definition_signature COLON expression -> ^( DEF definition_signature expression ) | VAR_ID OP_ASSIGN expression -> ^( DEF VAR_ID expression ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==VAR_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==OP_ASSIGN) ) {
                    alt27=2;
                }
                else if ( ((LA27_1>=OP_FOLLOW && LA27_1<=OP_REVERSE_FOLLOW)||LA27_1==COLON||LA27_1==TILDE||LA27_1==VAR_ID) ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:151:5: definition_signature COLON expression
                    {
                    pushFollow(FOLLOW_definition_signature_in_definition_inside_expression921);
                    definition_signature77=definition_signature();

                    state._fsp--;

                    stream_definition_signature.add(definition_signature77.getTree());
                    COLON78=(Token)match(input,COLON,FOLLOW_COLON_in_definition_inside_expression923);  
                    stream_COLON.add(COLON78);

                    pushFollow(FOLLOW_expression_in_definition_inside_expression929);
                    expression79=expression();

                    state._fsp--;

                    stream_expression.add(expression79.getTree());


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
                    // 153:5: -> ^( DEF definition_signature expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:153:8: ^( DEF definition_signature expression )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:154:5: VAR_ID OP_ASSIGN expression
                    {
                    VAR_ID80=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_inside_expression952);  
                    stream_VAR_ID.add(VAR_ID80);

                    OP_ASSIGN81=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_inside_expression954);  
                    stream_OP_ASSIGN.add(OP_ASSIGN81);

                    pushFollow(FOLLOW_expression_in_definition_inside_expression959);
                    expression82=expression();

                    state._fsp--;

                    stream_expression.add(expression82.getTree());


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
    // $ANTLR end "definition_inside_expression"

    public static class def_in_tag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "def_in_tag"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:159:1: def_in_tag : TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.def_in_tag_return def_in_tag() throws RecognitionException {
        OmttParser.def_in_tag_return retval = new OmttParser.def_in_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START83=null;
        Token DEF84=null;
        Token TAG_START85=null;
        Token AND86=null;
        Token TAG_START87=null;
        Token IN88=null;
        Token TAG_END89=null;
        List list_definition=null;
        OmttParser.tag_content_return content = null;

        OmttParser.definition_inside_tag_return definition = null;
         definition = null;
        Object TAG_START83_tree=null;
        Object DEF84_tree=null;
        Object TAG_START85_tree=null;
        Object AND86_tree=null;
        Object TAG_START87_tree=null;
        Object IN88_tree=null;
        Object TAG_END89_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_definition_inside_tag=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_tag");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:160:3: ( TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:160:5: TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END
            {
            TAG_START83=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag992);  
            stream_TAG_START.add(TAG_START83);

            DEF84=(Token)match(input,DEF,FOLLOW_DEF_in_def_in_tag994);  
            stream_DEF.add(DEF84);

            pushFollow(FOLLOW_definition_inside_tag_in_def_in_tag998);
            definition=definition_inside_tag();

            state._fsp--;

            stream_definition_inside_tag.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:161:5: ( TAG_START AND definition+= definition_inside_tag )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==TAG_START) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==AND) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:161:6: TAG_START AND definition+= definition_inside_tag
            	    {
            	    TAG_START85=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag1005);  
            	    stream_TAG_START.add(TAG_START85);

            	    AND86=(Token)match(input,AND,FOLLOW_AND_in_def_in_tag1007);  
            	    stream_AND.add(AND86);

            	    pushFollow(FOLLOW_definition_inside_tag_in_def_in_tag1011);
            	    definition=definition_inside_tag();

            	    state._fsp--;

            	    stream_definition_inside_tag.add(definition.getTree());
            	    if (list_definition==null) list_definition=new ArrayList();
            	    list_definition.add(definition.getTree());


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            TAG_START87=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag1019);  
            stream_TAG_START.add(TAG_START87);

            IN88=(Token)match(input,IN,FOLLOW_IN_in_def_in_tag1021);  
            stream_IN.add(IN88);

            pushFollow(FOLLOW_tag_content_in_def_in_tag1025);
            content=tag_content();

            state._fsp--;

            stream_tag_content.add(content.getTree());
            TAG_END89=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_def_in_tag1031);  
            stream_TAG_END.add(TAG_END89);



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
            // 164:5: -> ^( BLOCK ( $definition)+ $content)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:164:8: ^( BLOCK ( $definition)+ $content)
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:166:1: definition_inside_tag : ( definition_signature content= tag_content -> ^( DEF definition_signature $content) | VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )? -> ^( DEF VAR_ID expression ) );
    public final OmttParser.definition_inside_tag_return definition_inside_tag() throws RecognitionException {
        OmttParser.definition_inside_tag_return retval = new OmttParser.definition_inside_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID91=null;
        Token OP_ASSIGN92=null;
        Token CONTENT94=null;
        Token STRING_LITERAL95=null;
        OmttParser.tag_content_return content = null;

        OmttParser.definition_signature_return definition_signature90 = null;

        OmttParser.expression_return expression93 = null;


        Object VAR_ID91_tree=null;
        Object OP_ASSIGN92_tree=null;
        Object CONTENT94_tree=null;
        Object STRING_LITERAL95_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_CONTENT=new RewriteRuleTokenStream(adaptor,"token CONTENT");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_signature=new RewriteRuleSubtreeStream(adaptor,"rule definition_signature");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:167:3: ( definition_signature content= tag_content -> ^( DEF definition_signature $content) | VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )? -> ^( DEF VAR_ID expression ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==VAR_ID) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==OP_ASSIGN) ) {
                    alt31=2;
                }
                else if ( (LA31_1==CONTENT||LA31_1==OP_DATA_IS_EXPRESSION||(LA31_1>=OP_FOLLOW && LA31_1<=OP_REVERSE_FOLLOW)||LA31_1==TILDE||LA31_1==VAR_ID) ) {
                    alt31=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:167:5: definition_signature content= tag_content
                    {
                    pushFollow(FOLLOW_definition_signature_in_definition_inside_tag1063);
                    definition_signature90=definition_signature();

                    state._fsp--;

                    stream_definition_signature.add(definition_signature90.getTree());
                    pushFollow(FOLLOW_tag_content_in_definition_inside_tag1067);
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
                    // 168:5: -> ^( DEF definition_signature $content)
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:168:8: ^( DEF definition_signature $content)
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:169:5: VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )?
                    {
                    VAR_ID91=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_inside_tag1091);  
                    stream_VAR_ID.add(VAR_ID91);

                    OP_ASSIGN92=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_inside_tag1093);  
                    stream_OP_ASSIGN.add(OP_ASSIGN92);

                    pushFollow(FOLLOW_expression_in_definition_inside_tag1095);
                    expression93=expression();

                    state._fsp--;

                    stream_expression.add(expression93.getTree());
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:169:33: ( CONTENT ( STRING_LITERAL )? )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==CONTENT) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:169:34: CONTENT ( STRING_LITERAL )?
                            {
                            CONTENT94=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_definition_inside_tag1098);  
                            stream_CONTENT.add(CONTENT94);

                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:169:42: ( STRING_LITERAL )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==STRING_LITERAL) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:169:42: STRING_LITERAL
                                    {
                                    STRING_LITERAL95=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_definition_inside_tag1100);  
                                    stream_STRING_LITERAL.add(STRING_LITERAL95);


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
                    // 170:5: -> ^( DEF VAR_ID expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:170:8: ^( DEF VAR_ID expression )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:176:1: lambda_expression : ( LAMBDA ( definition_argument )* COLON expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | ( definition_argument )* OP_FOLLOW expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | lambda_match_expression );
    public final OmttParser.lambda_expression_return lambda_expression() throws RecognitionException {
        OmttParser.lambda_expression_return retval = new OmttParser.lambda_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAMBDA96=null;
        Token COLON98=null;
        Token OP_FOLLOW101=null;
        OmttParser.definition_argument_return definition_argument97 = null;

        OmttParser.expression_return expression99 = null;

        OmttParser.definition_argument_return definition_argument100 = null;

        OmttParser.expression_return expression102 = null;

        OmttParser.lambda_match_expression_return lambda_match_expression103 = null;


        Object LAMBDA96_tree=null;
        Object COLON98_tree=null;
        Object OP_FOLLOW101_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_LAMBDA=new RewriteRuleTokenStream(adaptor,"token LAMBDA");
        RewriteRuleTokenStream stream_OP_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_FOLLOW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_argument=new RewriteRuleSubtreeStream(adaptor,"rule definition_argument");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:177:3: ( LAMBDA ( definition_argument )* COLON expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | ( definition_argument )* OP_FOLLOW expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | lambda_match_expression )
            int alt34=3;
            switch ( input.LA(1) ) {
            case LAMBDA:
                {
                alt34=1;
                }
                break;
            case OP_FOLLOW:
            case TILDE:
            case VAR_ID:
                {
                alt34=2;
                }
                break;
            case CLASS_ID:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:177:5: LAMBDA ( definition_argument )* COLON expression
                    {
                    LAMBDA96=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambda_expression1139);  
                    stream_LAMBDA.add(LAMBDA96);

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:177:12: ( definition_argument )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==TILDE||LA32_0==VAR_ID) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:177:12: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_lambda_expression1141);
                    	    definition_argument97=definition_argument();

                    	    state._fsp--;

                    	    stream_definition_argument.add(definition_argument97.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    COLON98=(Token)match(input,COLON,FOLLOW_COLON_in_lambda_expression1144);  
                    stream_COLON.add(COLON98);

                    pushFollow(FOLLOW_expression_in_lambda_expression1146);
                    expression99=expression();

                    state._fsp--;

                    stream_expression.add(expression99.getTree());


                    // AST REWRITE
                    // elements: definition_argument, expression, LAMBDA
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 178:5: -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:178:8: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(stream_LAMBDA.nextToken()), root_1);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:178:35: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:178:47: ( definition_argument )*
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:179:5: ( definition_argument )* OP_FOLLOW expression
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:179:5: ( definition_argument )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==TILDE||LA33_0==VAR_ID) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:179:5: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_lambda_expression1174);
                    	    definition_argument100=definition_argument();

                    	    state._fsp--;

                    	    stream_definition_argument.add(definition_argument100.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    OP_FOLLOW101=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_lambda_expression1177);  
                    stream_OP_FOLLOW.add(OP_FOLLOW101);

                    pushFollow(FOLLOW_expression_in_lambda_expression1179);
                    expression102=expression();

                    state._fsp--;

                    stream_expression.add(expression102.getTree());


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
                    // 180:4: -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:180:7: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(LAMBDA), root_1);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:180:34: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:180:46: ( definition_argument )*
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:181:5: lambda_match_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lambda_match_expression_in_lambda_expression1206);
                    lambda_match_expression103=lambda_match_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, lambda_match_expression103.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:183:10: fragment lambda_match_expression : single_lambda_match ( SEMICOLON single_lambda_match )* ;
    public final OmttParser.lambda_match_expression_return lambda_match_expression() throws RecognitionException {
        OmttParser.lambda_match_expression_return retval = new OmttParser.lambda_match_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON105=null;
        OmttParser.single_lambda_match_return single_lambda_match104 = null;

        OmttParser.single_lambda_match_return single_lambda_match106 = null;


        Object SEMICOLON105_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:184:2: ( single_lambda_match ( SEMICOLON single_lambda_match )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:184:4: single_lambda_match ( SEMICOLON single_lambda_match )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_lambda_match_in_lambda_match_expression1219);
            single_lambda_match104=single_lambda_match();

            state._fsp--;

            adaptor.addChild(root_0, single_lambda_match104.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:184:24: ( SEMICOLON single_lambda_match )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==SEMICOLON) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:184:25: SEMICOLON single_lambda_match
            	    {
            	    SEMICOLON105=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_lambda_match_expression1222); 
            	    SEMICOLON105_tree = (Object)adaptor.create(SEMICOLON105);
            	    adaptor.addChild(root_0, SEMICOLON105_tree);

            	    pushFollow(FOLLOW_single_lambda_match_in_lambda_match_expression1224);
            	    single_lambda_match106=single_lambda_match();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_lambda_match106.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:186:10: fragment single_lambda_match : type OP_FOLLOW safe_expression ;
    public final OmttParser.single_lambda_match_return single_lambda_match() throws RecognitionException {
        OmttParser.single_lambda_match_return retval = new OmttParser.single_lambda_match_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_FOLLOW108=null;
        OmttParser.type_return type107 = null;

        OmttParser.safe_expression_return safe_expression109 = null;


        Object OP_FOLLOW108_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:187:2: ( type OP_FOLLOW safe_expression )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:187:4: type OP_FOLLOW safe_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_single_lambda_match1238);
            type107=type();

            state._fsp--;

            adaptor.addChild(root_0, type107.getTree());
            OP_FOLLOW108=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_single_lambda_match1240); 
            OP_FOLLOW108_tree = (Object)adaptor.create(OP_FOLLOW108);
            adaptor.addChild(root_0, OP_FOLLOW108_tree);

            pushFollow(FOLLOW_safe_expression_in_single_lambda_match1242);
            safe_expression109=safe_expression();

            state._fsp--;

            adaptor.addChild(root_0, safe_expression109.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:190:10: fragment type : CLASS_ID ( OP_MULTIPLY )? -> ^( CLASS_ID ( OP_MULTIPLY )? ) ;
    public final OmttParser.type_return type() throws RecognitionException {
        OmttParser.type_return retval = new OmttParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS_ID110=null;
        Token OP_MULTIPLY111=null;

        Object CLASS_ID110_tree=null;
        Object OP_MULTIPLY111_tree=null;
        RewriteRuleTokenStream stream_OP_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token OP_MULTIPLY");
        RewriteRuleTokenStream stream_CLASS_ID=new RewriteRuleTokenStream(adaptor,"token CLASS_ID");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:191:3: ( CLASS_ID ( OP_MULTIPLY )? -> ^( CLASS_ID ( OP_MULTIPLY )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:191:5: CLASS_ID ( OP_MULTIPLY )?
            {
            CLASS_ID110=(Token)match(input,CLASS_ID,FOLLOW_CLASS_ID_in_type1256);  
            stream_CLASS_ID.add(CLASS_ID110);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:191:14: ( OP_MULTIPLY )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==OP_MULTIPLY) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:191:14: OP_MULTIPLY
                    {
                    OP_MULTIPLY111=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_type1258);  
                    stream_OP_MULTIPLY.add(OP_MULTIPLY111);


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
            // 192:4: -> ^( CLASS_ID ( OP_MULTIPLY )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:192:7: ^( CLASS_ID ( OP_MULTIPLY )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TypeReference(stream_CLASS_ID.nextToken()), root_1);

                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:192:33: ( OP_MULTIPLY )?
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:194:10: fragment single_type : CLASS_ID -> ^( CLASS_ID ) ;
    public final OmttParser.single_type_return single_type() throws RecognitionException {
        OmttParser.single_type_return retval = new OmttParser.single_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS_ID112=null;

        Object CLASS_ID112_tree=null;
        RewriteRuleTokenStream stream_CLASS_ID=new RewriteRuleTokenStream(adaptor,"token CLASS_ID");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:195:3: ( CLASS_ID -> ^( CLASS_ID ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:195:5: CLASS_ID
            {
            CLASS_ID112=(Token)match(input,CLASS_ID,FOLLOW_CLASS_ID_in_single_type1288);  
            stream_CLASS_ID.add(CLASS_ID112);



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
            // 196:4: -> ^( CLASS_ID )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:196:7: ^( CLASS_ID )
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

    public static class if_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:202:1: if_expression : IF condition= context_expression COLON part_if= expression ELSE ( COLON )? part_else= expression -> ^( IF_ELSE $condition $part_if $part_else) ;
    public final OmttParser.if_expression_return if_expression() throws RecognitionException {
        OmttParser.if_expression_return retval = new OmttParser.if_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF113=null;
        Token COLON114=null;
        Token ELSE115=null;
        Token COLON116=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.expression_return part_if = null;

        OmttParser.expression_return part_else = null;


        Object IF113_tree=null;
        Object COLON114_tree=null;
        Object ELSE115_tree=null;
        Object COLON116_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:203:3: ( IF condition= context_expression COLON part_if= expression ELSE ( COLON )? part_else= expression -> ^( IF_ELSE $condition $part_if $part_else) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:203:5: IF condition= context_expression COLON part_if= expression ELSE ( COLON )? part_else= expression
            {
            IF113=(Token)match(input,IF,FOLLOW_IF_in_if_expression1315);  
            stream_IF.add(IF113);

            pushFollow(FOLLOW_context_expression_in_if_expression1319);
            condition=context_expression();

            state._fsp--;

            stream_context_expression.add(condition.getTree());
            COLON114=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1321);  
            stream_COLON.add(COLON114);

            pushFollow(FOLLOW_expression_in_if_expression1329);
            part_if=expression();

            state._fsp--;

            stream_expression.add(part_if.getTree());
            ELSE115=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_expression1335);  
            stream_ELSE.add(ELSE115);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:205:10: ( COLON )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==COLON) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:205:10: COLON
                    {
                    COLON116=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1337);  
                    stream_COLON.add(COLON116);


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_if_expression1346);
            part_else=expression();

            state._fsp--;

            stream_expression.add(part_else.getTree());


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
            // 207:5: -> ^( IF_ELSE $condition $part_if $part_else)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:207:8: ^( IF_ELSE $condition $part_if $part_else)
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

    public static class safe_if_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safe_if_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:209:1: safe_if_expression : IF condition= context_expression COLON part_if= safe_expression ELSE ( COLON )? part_else= safe_expression -> ^( IF_ELSE $condition $part_if $part_else) ;
    public final OmttParser.safe_if_expression_return safe_if_expression() throws RecognitionException {
        OmttParser.safe_if_expression_return retval = new OmttParser.safe_if_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF117=null;
        Token COLON118=null;
        Token ELSE119=null;
        Token COLON120=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.safe_expression_return part_if = null;

        OmttParser.safe_expression_return part_else = null;


        Object IF117_tree=null;
        Object COLON118_tree=null;
        Object ELSE119_tree=null;
        Object COLON120_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_safe_expression=new RewriteRuleSubtreeStream(adaptor,"rule safe_expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:210:3: ( IF condition= context_expression COLON part_if= safe_expression ELSE ( COLON )? part_else= safe_expression -> ^( IF_ELSE $condition $part_if $part_else) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:210:5: IF condition= context_expression COLON part_if= safe_expression ELSE ( COLON )? part_else= safe_expression
            {
            IF117=(Token)match(input,IF,FOLLOW_IF_in_safe_if_expression1380);  
            stream_IF.add(IF117);

            pushFollow(FOLLOW_context_expression_in_safe_if_expression1384);
            condition=context_expression();

            state._fsp--;

            stream_context_expression.add(condition.getTree());
            COLON118=(Token)match(input,COLON,FOLLOW_COLON_in_safe_if_expression1386);  
            stream_COLON.add(COLON118);

            pushFollow(FOLLOW_safe_expression_in_safe_if_expression1394);
            part_if=safe_expression();

            state._fsp--;

            stream_safe_expression.add(part_if.getTree());
            ELSE119=(Token)match(input,ELSE,FOLLOW_ELSE_in_safe_if_expression1400);  
            stream_ELSE.add(ELSE119);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:212:10: ( COLON )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==COLON) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:212:10: COLON
                    {
                    COLON120=(Token)match(input,COLON,FOLLOW_COLON_in_safe_if_expression1402);  
                    stream_COLON.add(COLON120);


                    }
                    break;

            }

            pushFollow(FOLLOW_safe_expression_in_safe_if_expression1411);
            part_else=safe_expression();

            state._fsp--;

            stream_safe_expression.add(part_else.getTree());


            // AST REWRITE
            // elements: part_if, condition, part_else
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
            // 214:5: -> ^( IF_ELSE $condition $part_if $part_else)
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:8: ^( IF_ELSE $condition $part_if $part_else)
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
    // $ANTLR end "safe_if_expression"

    public static class if_tag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_tag"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:216:1: if_tag : TAG_START if_subtag TAG_END ;
    public final OmttParser.if_tag_return if_tag() throws RecognitionException {
        OmttParser.if_tag_return retval = new OmttParser.if_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START121=null;
        Token TAG_END123=null;
        OmttParser.if_subtag_return if_subtag122 = null;


        Object TAG_START121_tree=null;
        Object TAG_END123_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:217:3: ( TAG_START if_subtag TAG_END )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:217:5: TAG_START if_subtag TAG_END
            {
            root_0 = (Object)adaptor.nil();

            TAG_START121=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_tag1445); 
            pushFollow(FOLLOW_if_subtag_in_if_tag1451);
            if_subtag122=if_subtag();

            state._fsp--;

            adaptor.addChild(root_0, if_subtag122.getTree());
            TAG_END123=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_if_tag1457); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:221:10: fragment if_subtag : ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )? -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? ) ;
    public final OmttParser.if_subtag_return if_subtag() throws RecognitionException {
        OmttParser.if_subtag_return retval = new OmttParser.if_subtag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF124=null;
        Token TAG_START125=null;
        Token ELSE126=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.tag_content_return part_if = null;

        OmttParser.tag_content_return part_else = null;

        OmttParser.if_subtag_return subtag = null;


        Object IF124_tree=null;
        Object TAG_START125_tree=null;
        Object ELSE126_tree=null;
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_if_subtag=new RewriteRuleSubtreeStream(adaptor,"rule if_subtag");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:222:2: ( ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )? -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:222:4: ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:222:4: ( IF condition= context_expression part_if= tag_content )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:222:6: IF condition= context_expression part_if= tag_content
            {
            IF124=(Token)match(input,IF,FOLLOW_IF_in_if_subtag1473);  
            stream_IF.add(IF124);

            pushFollow(FOLLOW_context_expression_in_if_subtag1477);
            condition=context_expression();

            state._fsp--;

            stream_context_expression.add(condition.getTree());
            pushFollow(FOLLOW_tag_content_in_if_subtag1485);
            part_if=tag_content();

            state._fsp--;

            stream_tag_content.add(part_if.getTree());

            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:225:3: ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==TAG_START) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:225:5: TAG_START ELSE (part_else= tag_content | subtag= if_subtag )
                    {
                    TAG_START125=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_subtag1495);  
                    stream_TAG_START.add(TAG_START125);

                    ELSE126=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_subtag1497);  
                    stream_ELSE.add(ELSE126);

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:226:4: (part_else= tag_content | subtag= if_subtag )
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
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:226:5: part_else= tag_content
                            {
                            pushFollow(FOLLOW_tag_content_in_if_subtag1505);
                            part_else=tag_content();

                            state._fsp--;

                            stream_tag_content.add(part_else.getTree());

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:226:29: subtag= if_subtag
                            {
                            pushFollow(FOLLOW_if_subtag_in_if_subtag1511);
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
            // elements: part_if, subtag, part_else, condition
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
            // 228:3: -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:228:6: ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new IfElse(IF_ELSE), root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());
                adaptor.addChild(root_1, stream_part_if.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:228:44: ( $part_else)?
                if ( stream_part_else.hasNext() ) {
                    adaptor.addChild(root_1, stream_part_else.nextTree());

                }
                stream_part_else.reset();
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:228:56: ( $subtag)?
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:231:1: map_expression : MAP ( item_alias )? iter= context_expression COLON expr= expression -> ^( MAP $iter $expr ( item_alias )? ) ;
    public final OmttParser.map_expression_return map_expression() throws RecognitionException {
        OmttParser.map_expression_return retval = new OmttParser.map_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MAP127=null;
        Token COLON129=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.expression_return expr = null;

        OmttParser.item_alias_return item_alias128 = null;


        Object MAP127_tree=null;
        Object COLON129_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_item_alias=new RewriteRuleSubtreeStream(adaptor,"rule item_alias");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:232:3: ( MAP ( item_alias )? iter= context_expression COLON expr= expression -> ^( MAP $iter $expr ( item_alias )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:232:5: MAP ( item_alias )? iter= context_expression COLON expr= expression
            {
            MAP127=(Token)match(input,MAP,FOLLOW_MAP_in_map_expression1554);  
            stream_MAP.add(MAP127);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:232:9: ( item_alias )?
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:232:9: item_alias
                    {
                    pushFollow(FOLLOW_item_alias_in_map_expression1556);
                    item_alias128=item_alias();

                    state._fsp--;

                    stream_item_alias.add(item_alias128.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_context_expression_in_map_expression1561);
            iter=context_expression();

            state._fsp--;

            stream_context_expression.add(iter.getTree());
            COLON129=(Token)match(input,COLON,FOLLOW_COLON_in_map_expression1563);  
            stream_COLON.add(COLON129);

            pushFollow(FOLLOW_expression_in_map_expression1571);
            expr=expression();

            state._fsp--;

            stream_expression.add(expr.getTree());


            // AST REWRITE
            // elements: iter, item_alias, MAP, expr
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
            // 234:5: -> ^( MAP $iter $expr ( item_alias )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:234:8: ^( MAP $iter $expr ( item_alias )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_MAP.nextToken()), root_1);

                adaptor.addChild(root_1, stream_iter.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:234:42: ( item_alias )?
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

    public static class safe_map_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safe_map_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:236:1: safe_map_expression : MAP ( item_alias )? iter= context_expression COLON expr= safe_expression -> ^( MAP $iter $expr ( item_alias )? ) ;
    public final OmttParser.safe_map_expression_return safe_map_expression() throws RecognitionException {
        OmttParser.safe_map_expression_return retval = new OmttParser.safe_map_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MAP130=null;
        Token COLON132=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.safe_expression_return expr = null;

        OmttParser.item_alias_return item_alias131 = null;


        Object MAP130_tree=null;
        Object COLON132_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_safe_expression=new RewriteRuleSubtreeStream(adaptor,"rule safe_expression");
        RewriteRuleSubtreeStream stream_item_alias=new RewriteRuleSubtreeStream(adaptor,"rule item_alias");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:237:3: ( MAP ( item_alias )? iter= context_expression COLON expr= safe_expression -> ^( MAP $iter $expr ( item_alias )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:237:5: MAP ( item_alias )? iter= context_expression COLON expr= safe_expression
            {
            MAP130=(Token)match(input,MAP,FOLLOW_MAP_in_safe_map_expression1605);  
            stream_MAP.add(MAP130);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:237:9: ( item_alias )?
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:237:9: item_alias
                    {
                    pushFollow(FOLLOW_item_alias_in_safe_map_expression1607);
                    item_alias131=item_alias();

                    state._fsp--;

                    stream_item_alias.add(item_alias131.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_context_expression_in_safe_map_expression1612);
            iter=context_expression();

            state._fsp--;

            stream_context_expression.add(iter.getTree());
            COLON132=(Token)match(input,COLON,FOLLOW_COLON_in_safe_map_expression1614);  
            stream_COLON.add(COLON132);

            pushFollow(FOLLOW_safe_expression_in_safe_map_expression1622);
            expr=safe_expression();

            state._fsp--;

            stream_safe_expression.add(expr.getTree());


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
            // 239:5: -> ^( MAP $iter $expr ( item_alias )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:239:8: ^( MAP $iter $expr ( item_alias )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_MAP.nextToken()), root_1);

                adaptor.addChild(root_1, stream_iter.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:239:42: ( item_alias )?
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
    // $ANTLR end "safe_map_expression"

    public static class map_tag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "map_tag"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:241:1: map_tag : TAG_START MAP ( item_alias )? iter= context_expression expr= tag_content TAG_END -> ^( MAP $iter $expr ( item_alias )? ) ;
    public final OmttParser.map_tag_return map_tag() throws RecognitionException {
        OmttParser.map_tag_return retval = new OmttParser.map_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START133=null;
        Token MAP134=null;
        Token TAG_END136=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.tag_content_return expr = null;

        OmttParser.item_alias_return item_alias135 = null;


        Object TAG_START133_tree=null;
        Object MAP134_tree=null;
        Object TAG_END136_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_item_alias=new RewriteRuleSubtreeStream(adaptor,"rule item_alias");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:242:3: ( TAG_START MAP ( item_alias )? iter= context_expression expr= tag_content TAG_END -> ^( MAP $iter $expr ( item_alias )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:242:5: TAG_START MAP ( item_alias )? iter= context_expression expr= tag_content TAG_END
            {
            TAG_START133=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_map_tag1656);  
            stream_TAG_START.add(TAG_START133);

            MAP134=(Token)match(input,MAP,FOLLOW_MAP_in_map_tag1658);  
            stream_MAP.add(MAP134);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:242:19: ( item_alias )?
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:242:19: item_alias
                    {
                    pushFollow(FOLLOW_item_alias_in_map_tag1660);
                    item_alias135=item_alias();

                    state._fsp--;

                    stream_item_alias.add(item_alias135.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_context_expression_in_map_tag1665);
            iter=context_expression();

            state._fsp--;

            stream_context_expression.add(iter.getTree());
            pushFollow(FOLLOW_tag_content_in_map_tag1673);
            expr=tag_content();

            state._fsp--;

            stream_tag_content.add(expr.getTree());
            TAG_END136=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_map_tag1679);  
            stream_TAG_END.add(TAG_END136);



            // AST REWRITE
            // elements: expr, iter, item_alias, MAP
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
            // 245:5: -> ^( MAP $iter $expr ( item_alias )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:245:8: ^( MAP $iter $expr ( item_alias )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_MAP.nextToken()), root_1);

                adaptor.addChild(root_1, stream_iter.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:245:42: ( item_alias )?
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:248:10: fragment item_alias : VAR_ID OP_REVERSE_FOLLOW -> ^( AS VAR_ID ) ;
    public final OmttParser.item_alias_return item_alias() throws RecognitionException {
        OmttParser.item_alias_return retval = new OmttParser.item_alias_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID137=null;
        Token OP_REVERSE_FOLLOW138=null;

        Object VAR_ID137_tree=null;
        Object OP_REVERSE_FOLLOW138_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_REVERSE_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_REVERSE_FOLLOW");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:249:2: ( VAR_ID OP_REVERSE_FOLLOW -> ^( AS VAR_ID ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:249:4: VAR_ID OP_REVERSE_FOLLOW
            {
            VAR_ID137=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_item_alias1715);  
            stream_VAR_ID.add(VAR_ID137);

            OP_REVERSE_FOLLOW138=(Token)match(input,OP_REVERSE_FOLLOW,FOLLOW_OP_REVERSE_FOLLOW_in_item_alias1717);  
            stream_OP_REVERSE_FOLLOW.add(OP_REVERSE_FOLLOW138);



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
            // 250:3: -> ^( AS VAR_ID )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:250:6: ^( AS VAR_ID )
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

    public static class match_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "match_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:253:1: match_expression : MATCH iter= context_expression COLON expr= lambda_match_expression -> ^( CALL[true] $expr ^( ARGUMENT $iter) ) ;
    public final OmttParser.match_expression_return match_expression() throws RecognitionException {
        OmttParser.match_expression_return retval = new OmttParser.match_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MATCH139=null;
        Token COLON140=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.lambda_match_expression_return expr = null;


        Object MATCH139_tree=null;
        Object COLON140_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MATCH=new RewriteRuleTokenStream(adaptor,"token MATCH");
        RewriteRuleSubtreeStream stream_lambda_match_expression=new RewriteRuleSubtreeStream(adaptor,"rule lambda_match_expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:254:3: ( MATCH iter= context_expression COLON expr= lambda_match_expression -> ^( CALL[true] $expr ^( ARGUMENT $iter) ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:254:5: MATCH iter= context_expression COLON expr= lambda_match_expression
            {
            MATCH139=(Token)match(input,MATCH,FOLLOW_MATCH_in_match_expression1739);  
            stream_MATCH.add(MATCH139);

            pushFollow(FOLLOW_context_expression_in_match_expression1743);
            iter=context_expression();

            state._fsp--;

            stream_context_expression.add(iter.getTree());
            COLON140=(Token)match(input,COLON,FOLLOW_COLON_in_match_expression1745);  
            stream_COLON.add(COLON140);

            pushFollow(FOLLOW_lambda_match_expression_in_match_expression1753);
            expr=lambda_match_expression();

            state._fsp--;

            stream_lambda_match_expression.add(expr.getTree());


            // AST REWRITE
            // elements: iter, expr
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
            // 256:5: -> ^( CALL[true] $expr ^( ARGUMENT $iter) )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:256:8: ^( CALL[true] $expr ^( ARGUMENT $iter) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:256:33: ^( ARGUMENT $iter)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

                adaptor.addChild(root_2, stream_iter.nextTree());

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

    public static class context_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "context_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:261:1: context_expression : (base= strict_expression -> $base) ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_map ce= safe_expression -> ^( op_map $context_expression $ce) | MATCH LEFT_PAREN lambda_match_expression RIGHT_PAREN -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) ) | WHERE safe_expression -> ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) ) )* ;
    public final OmttParser.context_expression_return context_expression() throws RecognitionException {
        OmttParser.context_expression_return retval = new OmttParser.context_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MATCH144=null;
        Token LEFT_PAREN145=null;
        Token RIGHT_PAREN147=null;
        Token WHERE148=null;
        OmttParser.strict_expression_return base = null;

        OmttParser.function_arguments_return arguments = null;

        OmttParser.safe_expression_return ce = null;

        OmttParser.op_apply_return op_apply141 = null;

        OmttParser.atom_expression_return atom_expression142 = null;

        OmttParser.op_map_return op_map143 = null;

        OmttParser.lambda_match_expression_return lambda_match_expression146 = null;

        OmttParser.safe_expression_return safe_expression149 = null;


        Object MATCH144_tree=null;
        Object LEFT_PAREN145_tree=null;
        Object RIGHT_PAREN147_tree=null;
        Object WHERE148_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_MATCH=new RewriteRuleTokenStream(adaptor,"token MATCH");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_safe_expression=new RewriteRuleSubtreeStream(adaptor,"rule safe_expression");
        RewriteRuleSubtreeStream stream_op_apply=new RewriteRuleSubtreeStream(adaptor,"rule op_apply");
        RewriteRuleSubtreeStream stream_lambda_match_expression=new RewriteRuleSubtreeStream(adaptor,"rule lambda_match_expression");
        RewriteRuleSubtreeStream stream_function_arguments=new RewriteRuleSubtreeStream(adaptor,"rule function_arguments");
        RewriteRuleSubtreeStream stream_op_map=new RewriteRuleSubtreeStream(adaptor,"rule op_map");
        RewriteRuleSubtreeStream stream_strict_expression=new RewriteRuleSubtreeStream(adaptor,"rule strict_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:262:3: ( (base= strict_expression -> $base) ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_map ce= safe_expression -> ^( op_map $context_expression $ce) | MATCH LEFT_PAREN lambda_match_expression RIGHT_PAREN -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) ) | WHERE safe_expression -> ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) ) )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:262:5: (base= strict_expression -> $base) ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_map ce= safe_expression -> ^( op_map $context_expression $ce) | MATCH LEFT_PAREN lambda_match_expression RIGHT_PAREN -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) ) | WHERE safe_expression -> ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) ) )*
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:262:5: (base= strict_expression -> $base)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:262:6: base= strict_expression
            {
            pushFollow(FOLLOW_strict_expression_in_context_expression1798);
            base=strict_expression();

            state._fsp--;

            stream_strict_expression.add(base.getTree());


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
            // 262:29: -> $base
            {
                adaptor.addChild(root_0, stream_base.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:263:3: ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_map ce= safe_expression -> ^( op_map $context_expression $ce) | MATCH LEFT_PAREN lambda_match_expression RIGHT_PAREN -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) ) | WHERE safe_expression -> ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) ) )*
            loop44:
            do {
                int alt44=5;
                switch ( input.LA(1) ) {
                case APPLY:
                case OP_CONTEXT:
                    {
                    alt44=1;
                    }
                    break;
                case MAP:
                case OP_EXPRESSION_CONTEXT:
                    {
                    alt44=2;
                    }
                    break;
                case MATCH:
                    {
                    alt44=3;
                    }
                    break;
                case WHERE:
                    {
                    alt44=4;
                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:263:5: op_apply atom_expression arguments= function_arguments
            	    {
            	    pushFollow(FOLLOW_op_apply_in_context_expression1810);
            	    op_apply141=op_apply();

            	    state._fsp--;

            	    stream_op_apply.add(op_apply141.getTree());
            	    pushFollow(FOLLOW_atom_expression_in_context_expression1812);
            	    atom_expression142=atom_expression();

            	    state._fsp--;

            	    stream_atom_expression.add(atom_expression142.getTree());
            	    pushFollow(FOLLOW_function_arguments_in_context_expression1816);
            	    arguments=function_arguments();

            	    state._fsp--;

            	    stream_function_arguments.add(arguments.getTree());


            	    // AST REWRITE
            	    // elements: atom_expression, arguments, context_expression
            	    // token labels: 
            	    // rule labels: retval, arguments
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments",arguments!=null?arguments.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 264:7: -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? )
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:264:10: ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

            	        adaptor.addChild(root_1, stream_atom_expression.nextTree());
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:264:45: ^( ARGUMENT $context_expression)
            	        {
            	        Object root_2 = (Object)adaptor.nil();
            	        root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:264:95: ( $arguments)?
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
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:265:5: op_map ce= safe_expression
            	    {
            	    pushFollow(FOLLOW_op_map_in_context_expression1854);
            	    op_map143=op_map();

            	    state._fsp--;

            	    stream_op_map.add(op_map143.getTree());
            	    pushFollow(FOLLOW_safe_expression_in_context_expression1858);
            	    ce=safe_expression();

            	    state._fsp--;

            	    stream_safe_expression.add(ce.getTree());


            	    // AST REWRITE
            	    // elements: op_map, ce, context_expression
            	    // token labels: 
            	    // rule labels: retval, ce
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_ce=new RewriteRuleSubtreeStream(adaptor,"rule ce",ce!=null?ce.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 266:6: -> ^( op_map $context_expression $ce)
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:266:9: ^( op_map $context_expression $ce)
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
            	case 3 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:267:5: MATCH LEFT_PAREN lambda_match_expression RIGHT_PAREN
            	    {
            	    MATCH144=(Token)match(input,MATCH,FOLLOW_MATCH_in_context_expression1881);  
            	    stream_MATCH.add(MATCH144);

            	    LEFT_PAREN145=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_context_expression1883);  
            	    stream_LEFT_PAREN.add(LEFT_PAREN145);

            	    pushFollow(FOLLOW_lambda_match_expression_in_context_expression1885);
            	    lambda_match_expression146=lambda_match_expression();

            	    state._fsp--;

            	    stream_lambda_match_expression.add(lambda_match_expression146.getTree());
            	    RIGHT_PAREN147=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_context_expression1887);  
            	    stream_RIGHT_PAREN.add(RIGHT_PAREN147);



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
            	    // 268:6: -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) )
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:268:9: ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

            	        adaptor.addChild(root_1, stream_lambda_match_expression.nextTree());
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:268:52: ^( ARGUMENT $context_expression)
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
            	case 4 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:269:5: WHERE safe_expression
            	    {
            	    WHERE148=(Token)match(input,WHERE,FOLLOW_WHERE_in_context_expression1920);  
            	    stream_WHERE.add(WHERE148);

            	    pushFollow(FOLLOW_safe_expression_in_context_expression1922);
            	    safe_expression149=safe_expression();

            	    state._fsp--;

            	    stream_safe_expression.add(safe_expression149.getTree());


            	    // AST REWRITE
            	    // elements: context_expression, safe_expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 270:4: -> ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) )
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:270:7: ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new AtomSelect(ATOM_SELECT), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:270:53: ^( SEQUENCE_SELECT safe_expression )
            	        {
            	        Object root_2 = (Object)adaptor.nil();
            	        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEQUENCE_SELECT, "SEQUENCE_SELECT"), root_2);

            	        adaptor.addChild(root_2, stream_safe_expression.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:273:10: fragment op_apply : ( OP_CONTEXT | APPLY );
    public final OmttParser.op_apply_return op_apply() throws RecognitionException {
        OmttParser.op_apply_return retval = new OmttParser.op_apply_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_CONTEXT150=null;
        Token APPLY151=null;

        Object OP_CONTEXT150_tree=null;
        Object APPLY151_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:274:2: ( OP_CONTEXT | APPLY )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:274:4: OP_CONTEXT
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_CONTEXT150=(Token)match(input,OP_CONTEXT,FOLLOW_OP_CONTEXT_in_op_apply1963); 
                    OP_CONTEXT150_tree = (Object)adaptor.create(OP_CONTEXT150);
                    root_0 = (Object)adaptor.becomeRoot(OP_CONTEXT150_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:275:4: APPLY
                    {
                    root_0 = (Object)adaptor.nil();

                    APPLY151=(Token)match(input,APPLY,FOLLOW_APPLY_in_op_apply1969); 
                    APPLY151_tree = (Object)adaptor.create(APPLY151);
                    root_0 = (Object)adaptor.becomeRoot(APPLY151_tree, root_0);


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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:277:10: fragment op_map : ( OP_EXPRESSION_CONTEXT | MAP );
    public final OmttParser.op_map_return op_map() throws RecognitionException {
        OmttParser.op_map_return retval = new OmttParser.op_map_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_EXPRESSION_CONTEXT152=null;
        Token MAP153=null;

        Object OP_EXPRESSION_CONTEXT152_tree=null;
        Object MAP153_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:278:2: ( OP_EXPRESSION_CONTEXT | MAP )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:278:4: OP_EXPRESSION_CONTEXT
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_EXPRESSION_CONTEXT152=(Token)match(input,OP_EXPRESSION_CONTEXT,FOLLOW_OP_EXPRESSION_CONTEXT_in_op_map1982); 
                    OP_EXPRESSION_CONTEXT152_tree = new Transformation(OP_EXPRESSION_CONTEXT152) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_EXPRESSION_CONTEXT152_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:279:4: MAP
                    {
                    root_0 = (Object)adaptor.nil();

                    MAP153=(Token)match(input,MAP,FOLLOW_MAP_in_op_map1991); 
                    MAP153_tree = new Transformation(MAP153) ;
                    root_0 = (Object)adaptor.becomeRoot(MAP153_tree, root_0);


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

    public static class apply_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "apply_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:282:1: apply_expression : APPLY atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT OP_GENERAL ) ( $arguments)? ) ;
    public final OmttParser.apply_expression_return apply_expression() throws RecognitionException {
        OmttParser.apply_expression_return retval = new OmttParser.apply_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token APPLY154=null;
        OmttParser.function_arguments_return arguments = null;

        OmttParser.atom_expression_return atom_expression155 = null;


        Object APPLY154_tree=null;
        RewriteRuleTokenStream stream_APPLY=new RewriteRuleTokenStream(adaptor,"token APPLY");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_function_arguments=new RewriteRuleSubtreeStream(adaptor,"rule function_arguments");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:283:2: ( APPLY atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT OP_GENERAL ) ( $arguments)? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:283:4: APPLY atom_expression arguments= function_arguments
            {
            APPLY154=(Token)match(input,APPLY,FOLLOW_APPLY_in_apply_expression2006);  
            stream_APPLY.add(APPLY154);

            pushFollow(FOLLOW_atom_expression_in_apply_expression2008);
            atom_expression155=atom_expression();

            state._fsp--;

            stream_atom_expression.add(atom_expression155.getTree());
            pushFollow(FOLLOW_function_arguments_in_apply_expression2012);
            arguments=function_arguments();

            state._fsp--;

            stream_function_arguments.add(arguments.getTree());


            // AST REWRITE
            // elements: atom_expression, arguments
            // token labels: 
            // rule labels: retval, arguments
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments",arguments!=null?arguments.tree:null);

            root_0 = (Object)adaptor.nil();
            // 284:5: -> ^( CALL[true] atom_expression ^( ARGUMENT OP_GENERAL ) ( $arguments)? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:284:8: ^( CALL[true] atom_expression ^( ARGUMENT OP_GENERAL ) ( $arguments)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

                adaptor.addChild(root_1, stream_atom_expression.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:284:43: ^( ARGUMENT OP_GENERAL )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

                adaptor.addChild(root_2, new Ident(OP_GENERAL));

                adaptor.addChild(root_1, root_2);
                }
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:284:91: ( $arguments)?
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:287:1: apply_tag : TAG_START apply_expression TAG_END ;
    public final OmttParser.apply_tag_return apply_tag() throws RecognitionException {
        OmttParser.apply_tag_return retval = new OmttParser.apply_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START156=null;
        Token TAG_END158=null;
        OmttParser.apply_expression_return apply_expression157 = null;


        Object TAG_START156_tree=null;
        Object TAG_END158_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:288:2: ( TAG_START apply_expression TAG_END )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:288:4: TAG_START apply_expression TAG_END
            {
            root_0 = (Object)adaptor.nil();

            TAG_START156=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_apply_tag2055); 
            pushFollow(FOLLOW_apply_expression_in_apply_tag2058);
            apply_expression157=apply_expression();

            state._fsp--;

            adaptor.addChild(root_0, apply_expression157.getTree());
            TAG_END158=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_apply_tag2060); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class strict_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "strict_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:293:1: strict_expression : ( concatence_expression | apply_expression );
    public final OmttParser.strict_expression_return strict_expression() throws RecognitionException {
        OmttParser.strict_expression_return retval = new OmttParser.strict_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.concatence_expression_return concatence_expression159 = null;

        OmttParser.apply_expression_return apply_expression160 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:294:2: ( concatence_expression | apply_expression )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=STRING_LITERAL && LA47_0<=REAL_NUMBER)||LA47_0==DATA_START||(LA47_0>=NULL && LA47_0<=FALSE)||(LA47_0>=TILDE && LA47_0<=LEFT_PAREN)||LA47_0==OP_MINUS||LA47_0==OP_NOT||LA47_0==OP_GENERAL||LA47_0==VAR_ID) ) {
                alt47=1;
            }
            else if ( (LA47_0==APPLY) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:294:4: concatence_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_concatence_expression_in_strict_expression2074);
                    concatence_expression159=concatence_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, concatence_expression159.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:295:4: apply_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_apply_expression_in_strict_expression2079);
                    apply_expression160=apply_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, apply_expression160.getTree());

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
    // $ANTLR end "strict_expression"

    public static class concatence_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "concatence_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:298:1: concatence_expression : (expr+= boolean_expression -> $expr) ( ( OP_CONCAT expr+= boolean_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )? ;
    public final OmttParser.concatence_expression_return concatence_expression() throws RecognitionException {
        OmttParser.concatence_expression_return retval = new OmttParser.concatence_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_CONCAT161=null;
        List list_expr=null;
        OmttParser.boolean_expression_return expr = null;
         expr = null;
        Object OP_CONCAT161_tree=null;
        RewriteRuleTokenStream stream_OP_CONCAT=new RewriteRuleTokenStream(adaptor,"token OP_CONCAT");
        RewriteRuleSubtreeStream stream_boolean_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:299:3: ( (expr+= boolean_expression -> $expr) ( ( OP_CONCAT expr+= boolean_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:299:5: (expr+= boolean_expression -> $expr) ( ( OP_CONCAT expr+= boolean_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )?
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:299:5: (expr+= boolean_expression -> $expr)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:299:6: expr+= boolean_expression
            {
            pushFollow(FOLLOW_boolean_expression_in_concatence_expression2094);
            expr=boolean_expression();

            state._fsp--;

            stream_boolean_expression.add(expr.getTree());
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
            // 299:31: -> $expr
            {
                adaptor.addChild(root_0, stream_expr.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:300:5: ( ( OP_CONCAT expr+= boolean_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==OP_CONCAT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:300:6: ( OP_CONCAT expr+= boolean_expression )+
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:300:6: ( OP_CONCAT expr+= boolean_expression )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==OP_CONCAT) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:300:7: OP_CONCAT expr+= boolean_expression
                    	    {
                    	    OP_CONCAT161=(Token)match(input,OP_CONCAT,FOLLOW_OP_CONCAT_in_concatence_expression2108);  
                    	    stream_OP_CONCAT.add(OP_CONCAT161);

                    	    pushFollow(FOLLOW_boolean_expression_in_concatence_expression2112);
                    	    expr=boolean_expression();

                    	    state._fsp--;

                    	    stream_boolean_expression.add(expr.getTree());
                    	    if (list_expr==null) list_expr=new ArrayList();
                    	    list_expr.add(expr.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
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
                    // 300:44: -> ^( OP_CONCAT ( $expr)+ )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:300:47: ^( OP_CONCAT ( $expr)+ )
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

    public static class boolean_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:304:1: boolean_expression : boolean_binary_expression ;
    public final OmttParser.boolean_expression_return boolean_expression() throws RecognitionException {
        OmttParser.boolean_expression_return retval = new OmttParser.boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_binary_expression_return boolean_binary_expression162 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:305:2: ( boolean_binary_expression )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:305:4: boolean_binary_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_binary_expression_in_boolean_expression2142);
            boolean_binary_expression162=boolean_binary_expression();

            state._fsp--;

            adaptor.addChild(root_0, boolean_binary_expression162.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:307:10: fragment boolean_binary_expression : boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )* ;
    public final OmttParser.boolean_binary_expression_return boolean_binary_expression() throws RecognitionException {
        OmttParser.boolean_binary_expression_return retval = new OmttParser.boolean_binary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_unary_expression_return boolean_unary_expression163 = null;

        OmttParser.boolean_binary_operator_return boolean_binary_operator164 = null;

        OmttParser.boolean_unary_expression_return boolean_unary_expression165 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:308:3: ( boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:308:5: boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression2155);
            boolean_unary_expression163=boolean_unary_expression();

            state._fsp--;

            adaptor.addChild(root_0, boolean_unary_expression163.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:308:30: ( boolean_binary_operator boolean_unary_expression )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=OP_AND && LA50_0<=OP_OR)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:308:31: boolean_binary_operator boolean_unary_expression
            	    {
            	    pushFollow(FOLLOW_boolean_binary_operator_in_boolean_binary_expression2158);
            	    boolean_binary_operator164=boolean_binary_operator();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(boolean_binary_operator164.getTree(), root_0);
            	    pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression2161);
            	    boolean_unary_expression165=boolean_unary_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolean_unary_expression165.getTree());

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
    // $ANTLR end "boolean_binary_expression"

    public static class boolean_unary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_unary_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:310:10: fragment boolean_unary_expression : ( boolean_unary_operator boolean_comparsion_expression | boolean_comparsion_expression );
    public final OmttParser.boolean_unary_expression_return boolean_unary_expression() throws RecognitionException {
        OmttParser.boolean_unary_expression_return retval = new OmttParser.boolean_unary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_unary_operator_return boolean_unary_operator166 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression167 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression168 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:311:3: ( boolean_unary_operator boolean_comparsion_expression | boolean_comparsion_expression )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==OP_NOT) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=STRING_LITERAL && LA51_0<=REAL_NUMBER)||LA51_0==DATA_START||(LA51_0>=NULL && LA51_0<=FALSE)||(LA51_0>=TILDE && LA51_0<=LEFT_PAREN)||LA51_0==OP_MINUS||LA51_0==OP_GENERAL||LA51_0==VAR_ID) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:311:5: boolean_unary_operator boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_unary_operator_in_boolean_unary_expression2177);
                    boolean_unary_operator166=boolean_unary_operator();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(boolean_unary_operator166.getTree(), root_0);
                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression2180);
                    boolean_comparsion_expression167=boolean_comparsion_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_comparsion_expression167.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:312:5: boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression2186);
                    boolean_comparsion_expression168=boolean_comparsion_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_comparsion_expression168.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:315:10: fragment boolean_binary_operator : ( OP_AND | OP_OR );
    public final OmttParser.boolean_binary_operator_return boolean_binary_operator() throws RecognitionException {
        OmttParser.boolean_binary_operator_return retval = new OmttParser.boolean_binary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_AND169=null;
        Token OP_OR170=null;

        Object OP_AND169_tree=null;
        Object OP_OR170_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:316:3: ( OP_AND | OP_OR )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==OP_AND) ) {
                alt52=1;
            }
            else if ( (LA52_0==OP_OR) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:316:5: OP_AND
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_AND169=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_boolean_binary_operator2201); 
                    OP_AND169_tree = new BooleanExpression(OP_AND169) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_AND169_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:317:5: OP_OR
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_OR170=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_boolean_binary_operator2211); 
                    OP_OR170_tree = new BooleanExpression(OP_OR170) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_OR170_tree, root_0);


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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:319:10: fragment boolean_unary_operator : OP_NOT ;
    public final OmttParser.boolean_unary_operator_return boolean_unary_operator() throws RecognitionException {
        OmttParser.boolean_unary_operator_return retval = new OmttParser.boolean_unary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_NOT171=null;

        Object OP_NOT171_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:320:3: ( OP_NOT )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:320:5: OP_NOT
            {
            root_0 = (Object)adaptor.nil();

            OP_NOT171=(Token)match(input,OP_NOT,FOLLOW_OP_NOT_in_boolean_unary_operator2229); 
            OP_NOT171_tree = new BooleanExpression(OP_NOT171) ;
            root_0 = (Object)adaptor.becomeRoot(OP_NOT171_tree, root_0);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:323:1: boolean_comparsion_expression : additive_expression ( boolean_comparsion_operator additive_expression )* ;
    public final OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression() throws RecognitionException {
        OmttParser.boolean_comparsion_expression_return retval = new OmttParser.boolean_comparsion_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.additive_expression_return additive_expression172 = null;

        OmttParser.boolean_comparsion_operator_return boolean_comparsion_operator173 = null;

        OmttParser.additive_expression_return additive_expression174 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:324:3: ( additive_expression ( boolean_comparsion_operator additive_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:324:5: additive_expression ( boolean_comparsion_operator additive_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression2246);
            additive_expression172=additive_expression();

            state._fsp--;

            adaptor.addChild(root_0, additive_expression172.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:324:25: ( boolean_comparsion_operator additive_expression )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=OP_EQUAL && LA53_0<=OP_GE)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:324:26: boolean_comparsion_operator additive_expression
            	    {
            	    pushFollow(FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression2249);
            	    boolean_comparsion_operator173=boolean_comparsion_operator();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(boolean_comparsion_operator173.getTree(), root_0);
            	    pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression2252);
            	    additive_expression174=additive_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, additive_expression174.getTree());

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
    // $ANTLR end "boolean_comparsion_expression"

    public static class boolean_comparsion_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_comparsion_operator"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:326:10: fragment boolean_comparsion_operator : ( OP_EQUAL | OP_NOT_EQUAL | OP_LE | OP_LEQ | OP_GE | OP_GEQ );
    public final OmttParser.boolean_comparsion_operator_return boolean_comparsion_operator() throws RecognitionException {
        OmttParser.boolean_comparsion_operator_return retval = new OmttParser.boolean_comparsion_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_EQUAL175=null;
        Token OP_NOT_EQUAL176=null;
        Token OP_LE177=null;
        Token OP_LEQ178=null;
        Token OP_GE179=null;
        Token OP_GEQ180=null;

        Object OP_EQUAL175_tree=null;
        Object OP_NOT_EQUAL176_tree=null;
        Object OP_LE177_tree=null;
        Object OP_LEQ178_tree=null;
        Object OP_GE179_tree=null;
        Object OP_GEQ180_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:327:3: ( OP_EQUAL | OP_NOT_EQUAL | OP_LE | OP_LEQ | OP_GE | OP_GEQ )
            int alt54=6;
            switch ( input.LA(1) ) {
            case OP_EQUAL:
                {
                alt54=1;
                }
                break;
            case OP_NOT_EQUAL:
                {
                alt54=2;
                }
                break;
            case OP_LE:
                {
                alt54=3;
                }
                break;
            case OP_LEQ:
                {
                alt54=4;
                }
                break;
            case OP_GE:
                {
                alt54=5;
                }
                break;
            case OP_GEQ:
                {
                alt54=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:327:5: OP_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_EQUAL175=(Token)match(input,OP_EQUAL,FOLLOW_OP_EQUAL_in_boolean_comparsion_operator2268); 
                    OP_EQUAL175_tree = new BooleanExpression(OP_EQUAL175) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_EQUAL175_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:328:5: OP_NOT_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_NOT_EQUAL176=(Token)match(input,OP_NOT_EQUAL,FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator2278); 
                    OP_NOT_EQUAL176_tree = new BooleanExpression(OP_NOT_EQUAL176) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_NOT_EQUAL176_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:329:5: OP_LE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LE177=(Token)match(input,OP_LE,FOLLOW_OP_LE_in_boolean_comparsion_operator2288); 
                    OP_LE177_tree = new BooleanExpression(OP_LE177) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LE177_tree, root_0);


                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:330:5: OP_LEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LEQ178=(Token)match(input,OP_LEQ,FOLLOW_OP_LEQ_in_boolean_comparsion_operator2298); 
                    OP_LEQ178_tree = new BooleanExpression(OP_LEQ178) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LEQ178_tree, root_0);


                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:331:5: OP_GE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GE179=(Token)match(input,OP_GE,FOLLOW_OP_GE_in_boolean_comparsion_operator2308); 
                    OP_GE179_tree = new BooleanExpression(OP_GE179) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GE179_tree, root_0);


                    }
                    break;
                case 6 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:332:5: OP_GEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GEQ180=(Token)match(input,OP_GEQ,FOLLOW_OP_GEQ_in_boolean_comparsion_operator2318); 
                    OP_GEQ180_tree = new BooleanExpression(OP_GEQ180) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GEQ180_tree, root_0);


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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:338:1: additive_expression : multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )* ;
    public final OmttParser.additive_expression_return additive_expression() throws RecognitionException {
        OmttParser.additive_expression_return retval = new OmttParser.additive_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_PLUS182=null;
        Token OP_MINUS183=null;
        OmttParser.multiplicative_expression_return multiplicative_expression181 = null;

        OmttParser.multiplicative_expression_return multiplicative_expression184 = null;


        Object OP_PLUS182_tree=null;
        Object OP_MINUS183_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:339:3: ( multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:339:5: multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2338);
            multiplicative_expression181=multiplicative_expression();

            state._fsp--;

            adaptor.addChild(root_0, multiplicative_expression181.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:340:5: ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=OP_PLUS && LA56_0<=OP_MINUS)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:341:7: ( OP_PLUS | OP_MINUS ) multiplicative_expression
            	    {
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:341:7: ( OP_PLUS | OP_MINUS )
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==OP_PLUS) ) {
            	        alt55=1;
            	    }
            	    else if ( (LA55_0==OP_MINUS) ) {
            	        alt55=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 55, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:341:9: OP_PLUS
            	            {
            	            OP_PLUS182=(Token)match(input,OP_PLUS,FOLLOW_OP_PLUS_in_additive_expression2354); 
            	            OP_PLUS182_tree = new ArithmeticExpression(OP_PLUS182) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_PLUS182_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:342:9: OP_MINUS
            	            {
            	            OP_MINUS183=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_additive_expression2368); 
            	            OP_MINUS183_tree = new ArithmeticExpression(OP_MINUS183) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MINUS183_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2388);
            	    multiplicative_expression184=multiplicative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicative_expression184.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:348:1: multiplicative_expression : negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )* ;
    public final OmttParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        OmttParser.multiplicative_expression_return retval = new OmttParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MULTIPLY186=null;
        Token SLASH187=null;
        Token OP_MODULO188=null;
        OmttParser.negative_expression_return negative_expression185 = null;

        OmttParser.negative_expression_return negative_expression189 = null;


        Object OP_MULTIPLY186_tree=null;
        Object SLASH187_tree=null;
        Object OP_MODULO188_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:349:3: ( negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:349:5: negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_negative_expression_in_multiplicative_expression2408);
            negative_expression185=negative_expression();

            state._fsp--;

            adaptor.addChild(root_0, negative_expression185.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:350:5: ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==SLASH||(LA58_0>=OP_MULTIPLY && LA58_0<=OP_MODULO)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:350:7: ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression
            	    {
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:350:7: ( OP_MULTIPLY | SLASH | OP_MODULO )
            	    int alt57=3;
            	    switch ( input.LA(1) ) {
            	    case OP_MULTIPLY:
            	        {
            	        alt57=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt57=2;
            	        }
            	        break;
            	    case OP_MODULO:
            	        {
            	        alt57=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 57, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt57) {
            	        case 1 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:350:9: OP_MULTIPLY
            	            {
            	            OP_MULTIPLY186=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_multiplicative_expression2418); 
            	            OP_MULTIPLY186_tree = new ArithmeticExpression(OP_MULTIPLY186) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MULTIPLY186_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:351:9: SLASH
            	            {
            	            SLASH187=(Token)match(input,SLASH,FOLLOW_SLASH_in_multiplicative_expression2432); 
            	            SLASH187_tree = new ArithmeticExpression(SLASH187) ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH187_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:352:9: OP_MODULO
            	            {
            	            OP_MODULO188=(Token)match(input,OP_MODULO,FOLLOW_OP_MODULO_in_multiplicative_expression2446); 
            	            OP_MODULO188_tree = new ArithmeticExpression(OP_MODULO188) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MODULO188_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_negative_expression_in_multiplicative_expression2466);
            	    negative_expression189=negative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, negative_expression189.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:1: negative_expression : ( OP_MINUS functional_expression -> ^( OP_MINUS functional_expression ) | functional_expression );
    public final OmttParser.negative_expression_return negative_expression() throws RecognitionException {
        OmttParser.negative_expression_return retval = new OmttParser.negative_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MINUS190=null;
        OmttParser.functional_expression_return functional_expression191 = null;

        OmttParser.functional_expression_return functional_expression192 = null;


        Object OP_MINUS190_tree=null;
        RewriteRuleTokenStream stream_OP_MINUS=new RewriteRuleTokenStream(adaptor,"token OP_MINUS");
        RewriteRuleSubtreeStream stream_functional_expression=new RewriteRuleSubtreeStream(adaptor,"rule functional_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:359:2: ( OP_MINUS functional_expression -> ^( OP_MINUS functional_expression ) | functional_expression )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==OP_MINUS) ) {
                alt59=1;
            }
            else if ( ((LA59_0>=STRING_LITERAL && LA59_0<=REAL_NUMBER)||LA59_0==DATA_START||(LA59_0>=NULL && LA59_0<=FALSE)||(LA59_0>=TILDE && LA59_0<=LEFT_PAREN)||LA59_0==OP_GENERAL||LA59_0==VAR_ID) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:359:4: OP_MINUS functional_expression
                    {
                    OP_MINUS190=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_negative_expression2485);  
                    stream_OP_MINUS.add(OP_MINUS190);

                    pushFollow(FOLLOW_functional_expression_in_negative_expression2487);
                    functional_expression191=functional_expression();

                    state._fsp--;

                    stream_functional_expression.add(functional_expression191.getTree());


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
                    // 360:3: -> ^( OP_MINUS functional_expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:360:6: ^( OP_MINUS functional_expression )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:361:4: functional_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functional_expression_in_negative_expression2505);
                    functional_expression192=functional_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, functional_expression192.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:366:1: functional_expression : call_expression ;
    public final OmttParser.functional_expression_return functional_expression() throws RecognitionException {
        OmttParser.functional_expression_return retval = new OmttParser.functional_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.call_expression_return call_expression193 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:367:3: ( call_expression )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:367:5: call_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_call_expression_in_functional_expression2519);
            call_expression193=call_expression();

            state._fsp--;

            adaptor.addChild(root_0, call_expression193.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:370:1: call_expression : atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) ) ;
    public final OmttParser.call_expression_return call_expression() throws RecognitionException {
        OmttParser.call_expression_return retval = new OmttParser.call_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.atom_expression_return atom_expression194 = null;

        OmttParser.function_argument_return function_argument195 = null;


        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_function_argument=new RewriteRuleSubtreeStream(adaptor,"rule function_argument");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:371:3: ( atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:371:5: atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            {
            pushFollow(FOLLOW_atom_expression_in_call_expression2532);
            atom_expression194=atom_expression();

            state._fsp--;

            stream_atom_expression.add(atom_expression194.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:372:5: ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=STRING_LITERAL && LA61_0<=REAL_NUMBER)||LA61_0==DATA_START||(LA61_0>=NULL && LA61_0<=FALSE)||(LA61_0>=TILDE && LA61_0<=LEFT_PAREN)||LA61_0==OP_GENERAL||LA61_0==VAR_ID) ) {
                alt61=1;
            }
            else if ( ((LA61_0>=CONTENT && LA61_0<=TAG_END)||(LA61_0>=EXPRESSION_END && LA61_0<=OP_DATA_IS_EXPRESSION)||(LA61_0>=AND && LA61_0<=IN)||LA61_0==ELSE||(LA61_0>=MAP && LA61_0<=WHERE)||(LA61_0>=COLON && LA61_0<=SEMICOLON)||(LA61_0>=COMA && LA61_0<=SLASH)||LA61_0==RIGHT_PAREN||(LA61_0>=RIGHT_SQUARE_PAREN && LA61_0<=OP_GE)||(LA61_0>=OP_AND && LA61_0<=OP_OR)||(LA61_0>=OP_CONTEXT && LA61_0<=OP_EXPRESSION_CONTEXT)||LA61_0==OP_CONCAT) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:372:7: ( function_argument )+
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:372:7: ( function_argument )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( ((LA60_0>=STRING_LITERAL && LA60_0<=REAL_NUMBER)||LA60_0==DATA_START||(LA60_0>=NULL && LA60_0<=FALSE)||(LA60_0>=TILDE && LA60_0<=LEFT_PAREN)||LA60_0==OP_GENERAL||LA60_0==VAR_ID) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:372:7: function_argument
                    	    {
                    	    pushFollow(FOLLOW_function_argument_in_call_expression2540);
                    	    function_argument195=function_argument();

                    	    state._fsp--;

                    	    stream_function_argument.add(function_argument195.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt60 >= 1 ) break loop60;
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
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
                    // 373:7: -> ^( CALL[false] atom_expression ( function_argument )+ )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:373:10: ^( CALL[false] atom_expression ( function_argument )+ )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:374:7: 
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
                    // 375:7: -> ^( atom_expression )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:375:10: ^( atom_expression )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:378:1: call_tag : TAG_START ident= namespace_id ( (content= tag_content | (args+= function_argument )+ (content= tag_content )? ) -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* ) | -> $ident) TAG_END ;
    public final OmttParser.call_tag_return call_tag() throws RecognitionException {
        OmttParser.call_tag_return retval = new OmttParser.call_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START196=null;
        Token TAG_END197=null;
        List list_args=null;
        OmttParser.namespace_id_return ident = null;

        OmttParser.tag_content_return content = null;

        OmttParser.function_argument_return args = null;
         args = null;
        Object TAG_START196_tree=null;
        Object TAG_END197_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_function_argument=new RewriteRuleSubtreeStream(adaptor,"rule function_argument");
        RewriteRuleSubtreeStream stream_namespace_id=new RewriteRuleSubtreeStream(adaptor,"rule namespace_id");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:379:3: ( TAG_START ident= namespace_id ( (content= tag_content | (args+= function_argument )+ (content= tag_content )? ) -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* ) | -> $ident) TAG_END )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:379:5: TAG_START ident= namespace_id ( (content= tag_content | (args+= function_argument )+ (content= tag_content )? ) -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* ) | -> $ident) TAG_END
            {
            TAG_START196=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_call_tag2600);  
            stream_TAG_START.add(TAG_START196);

            pushFollow(FOLLOW_namespace_id_in_call_tag2604);
            ident=namespace_id();

            state._fsp--;

            stream_namespace_id.add(ident.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:380:4: ( (content= tag_content | (args+= function_argument )+ (content= tag_content )? ) -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* ) | -> $ident)
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=STRING_LITERAL && LA65_0<=CONTENT)||LA65_0==DATA_START||LA65_0==OP_DATA_IS_EXPRESSION||(LA65_0>=NULL && LA65_0<=FALSE)||(LA65_0>=TILDE && LA65_0<=LEFT_PAREN)||LA65_0==OP_GENERAL||LA65_0==VAR_ID) ) {
                alt65=1;
            }
            else if ( (LA65_0==TAG_END) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:380:6: (content= tag_content | (args+= function_argument )+ (content= tag_content )? )
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:380:6: (content= tag_content | (args+= function_argument )+ (content= tag_content )? )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==CONTENT||LA64_0==OP_DATA_IS_EXPRESSION) ) {
                        alt64=1;
                    }
                    else if ( ((LA64_0>=STRING_LITERAL && LA64_0<=REAL_NUMBER)||LA64_0==DATA_START||(LA64_0>=NULL && LA64_0<=FALSE)||(LA64_0>=TILDE && LA64_0<=LEFT_PAREN)||LA64_0==OP_GENERAL||LA64_0==VAR_ID) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:380:7: content= tag_content
                            {
                            pushFollow(FOLLOW_tag_content_in_call_tag2614);
                            content=tag_content();

                            state._fsp--;

                            stream_tag_content.add(content.getTree());

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:380:29: (args+= function_argument )+ (content= tag_content )?
                            {
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:380:33: (args+= function_argument )+
                            int cnt62=0;
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( ((LA62_0>=STRING_LITERAL && LA62_0<=REAL_NUMBER)||LA62_0==DATA_START||(LA62_0>=NULL && LA62_0<=FALSE)||(LA62_0>=TILDE && LA62_0<=LEFT_PAREN)||LA62_0==OP_GENERAL||LA62_0==VAR_ID) ) {
                                    alt62=1;
                                }


                                switch (alt62) {
                            	case 1 :
                            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:380:33: args+= function_argument
                            	    {
                            	    pushFollow(FOLLOW_function_argument_in_call_tag2620);
                            	    args=function_argument();

                            	    state._fsp--;

                            	    stream_function_argument.add(args.getTree());
                            	    if (list_args==null) list_args=new ArrayList();
                            	    list_args.add(args.getTree());


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

                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:380:54: (content= tag_content )?
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==CONTENT||LA63_0==OP_DATA_IS_EXPRESSION) ) {
                                alt63=1;
                            }
                            switch (alt63) {
                                case 1 :
                                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:380:55: content= tag_content
                                    {
                                    pushFollow(FOLLOW_tag_content_in_call_tag2626);
                                    content=tag_content();

                                    state._fsp--;

                                    stream_tag_content.add(content.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: args, content, ident
                    // token labels: 
                    // rule labels: content, retval, ident
                    // token list labels: 
                    // rule list labels: args
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"rule content",content!=null?content.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident",ident!=null?ident.tree:null);
                    RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"token args",list_args);
                    root_0 = (Object)adaptor.nil();
                    // 381:4: -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:381:7: ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, false), root_1);

                        adaptor.addChild(root_1, stream_ident.nextTree());
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:381:34: ( ^( ARGUMENT $content) )?
                        if ( stream_content.hasNext() ) {
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:381:34: ^( ARGUMENT $content)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

                            adaptor.addChild(root_2, stream_content.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_content.reset();
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:381:74: ( $args)*
                        while ( stream_args.hasNext() ) {
                            adaptor.addChild(root_1, stream_args.nextTree());

                        }
                        stream_args.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:382:6: 
                    {

                    // AST REWRITE
                    // elements: ident
                    // token labels: 
                    // rule labels: retval, ident
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident",ident!=null?ident.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 382:6: -> $ident
                    {
                        adaptor.addChild(root_0, stream_ident.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }

            TAG_END197=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_call_tag2681);  
            stream_TAG_END.add(TAG_END197);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:386:10: fragment function_arguments : ( function_argument )* ;
    public final OmttParser.function_arguments_return function_arguments() throws RecognitionException {
        OmttParser.function_arguments_return retval = new OmttParser.function_arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.function_argument_return function_argument198 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:387:3: ( ( function_argument )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:387:5: ( function_argument )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:387:5: ( function_argument )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=STRING_LITERAL && LA66_0<=REAL_NUMBER)||LA66_0==DATA_START||(LA66_0>=NULL && LA66_0<=FALSE)||(LA66_0>=TILDE && LA66_0<=LEFT_PAREN)||LA66_0==OP_GENERAL||LA66_0==VAR_ID) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:387:5: function_argument
            	    {
            	    pushFollow(FOLLOW_function_argument_in_function_arguments2695);
            	    function_argument198=function_argument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function_argument198.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:389:10: fragment function_argument : ( VAR_ID OP_ASSIGN )? atom_expression -> ^( ARGUMENT atom_expression ( VAR_ID )? ) ;
    public final OmttParser.function_argument_return function_argument() throws RecognitionException {
        OmttParser.function_argument_return retval = new OmttParser.function_argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID199=null;
        Token OP_ASSIGN200=null;
        OmttParser.atom_expression_return atom_expression201 = null;


        Object VAR_ID199_tree=null;
        Object OP_ASSIGN200_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:390:3: ( ( VAR_ID OP_ASSIGN )? atom_expression -> ^( ARGUMENT atom_expression ( VAR_ID )? ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:390:5: ( VAR_ID OP_ASSIGN )? atom_expression
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:390:5: ( VAR_ID OP_ASSIGN )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==VAR_ID) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==OP_ASSIGN) ) {
                    alt67=1;
                }
            }
            switch (alt67) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:390:6: VAR_ID OP_ASSIGN
                    {
                    VAR_ID199=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_function_argument2711);  
                    stream_VAR_ID.add(VAR_ID199);

                    OP_ASSIGN200=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_function_argument2713);  
                    stream_OP_ASSIGN.add(OP_ASSIGN200);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_expression_in_function_argument2717);
            atom_expression201=atom_expression();

            state._fsp--;

            stream_atom_expression.add(atom_expression201.getTree());


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
            // 391:5: -> ^( ARGUMENT atom_expression ( VAR_ID )? )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:391:8: ^( ARGUMENT atom_expression ( VAR_ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_1);

                adaptor.addChild(root_1, stream_atom_expression.nextTree());
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:391:53: ( VAR_ID )?
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:396:1: atom_expression : (a= atom_with_selectors -> $a) ( DOT es= expression_select -> ^( DOT $atom_expression $es) | DOT ps= property_select -> ^( DOT $atom_expression $ps) )* ;
    public final OmttParser.atom_expression_return atom_expression() throws RecognitionException {
        OmttParser.atom_expression_return retval = new OmttParser.atom_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT202=null;
        Token DOT203=null;
        OmttParser.atom_with_selectors_return a = null;

        OmttParser.expression_select_return es = null;

        OmttParser.property_select_return ps = null;


        Object DOT202_tree=null;
        Object DOT203_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_expression_select=new RewriteRuleSubtreeStream(adaptor,"rule expression_select");
        RewriteRuleSubtreeStream stream_property_select=new RewriteRuleSubtreeStream(adaptor,"rule property_select");
        RewriteRuleSubtreeStream stream_atom_with_selectors=new RewriteRuleSubtreeStream(adaptor,"rule atom_with_selectors");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:397:3: ( (a= atom_with_selectors -> $a) ( DOT es= expression_select -> ^( DOT $atom_expression $es) | DOT ps= property_select -> ^( DOT $atom_expression $ps) )* )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:397:5: (a= atom_with_selectors -> $a) ( DOT es= expression_select -> ^( DOT $atom_expression $es) | DOT ps= property_select -> ^( DOT $atom_expression $ps) )*
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:397:5: (a= atom_with_selectors -> $a)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:397:6: a= atom_with_selectors
            {
            pushFollow(FOLLOW_atom_with_selectors_in_atom_expression2753);
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
            // 397:28: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:398:4: ( DOT es= expression_select -> ^( DOT $atom_expression $es) | DOT ps= property_select -> ^( DOT $atom_expression $ps) )*
            loop68:
            do {
                int alt68=3;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==DOT) ) {
                    int LA68_2 = input.LA(2);

                    if ( (LA68_2==VAR_ID) ) {
                        alt68=2;
                    }
                    else if ( (LA68_2==LEFT_PAREN) ) {
                        alt68=1;
                    }


                }


                switch (alt68) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:398:6: DOT es= expression_select
            	    {
            	    DOT202=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expression2766);  
            	    stream_DOT.add(DOT202);

            	    pushFollow(FOLLOW_expression_select_in_atom_expression2770);
            	    es=expression_select();

            	    state._fsp--;

            	    stream_expression_select.add(es.getTree());


            	    // AST REWRITE
            	    // elements: es, DOT, atom_expression
            	    // token labels: 
            	    // rule labels: retval, es
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_es=new RewriteRuleSubtreeStream(adaptor,"rule es",es!=null?es.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 399:6: -> ^( DOT $atom_expression $es)
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:399:9: ^( DOT $atom_expression $es)
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
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:400:6: DOT ps= property_select
            	    {
            	    DOT203=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expression2797);  
            	    stream_DOT.add(DOT203);

            	    pushFollow(FOLLOW_property_select_in_atom_expression2801);
            	    ps=property_select();

            	    state._fsp--;

            	    stream_property_select.add(ps.getTree());


            	    // AST REWRITE
            	    // elements: DOT, ps, atom_expression
            	    // token labels: 
            	    // rule labels: retval, ps
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_ps=new RewriteRuleSubtreeStream(adaptor,"rule ps",ps!=null?ps.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 401:5: -> ^( DOT $atom_expression $ps)
            	    {
            	        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:401:8: ^( DOT $atom_expression $ps)
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
            	    break loop68;
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
    // $ANTLR end "atom_expression"

    public static class atom_with_selectors_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom_with_selectors"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:404:10: fragment atom_with_selectors : atom ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom ) ;
    public final OmttParser.atom_with_selectors_return atom_with_selectors() throws RecognitionException {
        OmttParser.atom_with_selectors_return retval = new OmttParser.atom_with_selectors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.atom_return atom204 = null;

        OmttParser.sequence_selectors_return sequence_selectors205 = null;


        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_sequence_selectors=new RewriteRuleSubtreeStream(adaptor,"rule sequence_selectors");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:405:2: ( atom ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:405:4: atom ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom )
            {
            pushFollow(FOLLOW_atom_in_atom_with_selectors2839);
            atom204=atom();

            state._fsp--;

            stream_atom.add(atom204.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:406:3: ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom )
            int alt69=2;
            switch ( input.LA(1) ) {
            case DOT:
                {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==LEFT_PAREN||LA69_1==VAR_ID) ) {
                    alt69=2;
                }
                else if ( (LA69_1==CLASS_ID) ) {
                    alt69=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;
                }
                }
                break;
            case AS:
            case LEFT_SQUARE_PAREN:
                {
                alt69=1;
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
            case WHERE:
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
                alt69=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:406:5: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_atom_with_selectors2845);
                    sequence_selectors205=sequence_selectors();

                    state._fsp--;

                    stream_sequence_selectors.add(sequence_selectors205.getTree());


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
                    // 407:4: -> ^( ATOM_SELECT atom sequence_selectors )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:407:7: ^( ATOM_SELECT atom sequence_selectors )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:408:5: 
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
                    // 408:5: -> atom
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:411:10: fragment expression_select : LEFT_PAREN expression RIGHT_PAREN ( sequence_selectors -> ^( ATOM_SELECT expression sequence_selectors ) | -> expression ) ;
    public final OmttParser.expression_select_return expression_select() throws RecognitionException {
        OmttParser.expression_select_return retval = new OmttParser.expression_select_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN206=null;
        Token RIGHT_PAREN208=null;
        OmttParser.expression_return expression207 = null;

        OmttParser.sequence_selectors_return sequence_selectors209 = null;


        Object LEFT_PAREN206_tree=null;
        Object RIGHT_PAREN208_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_sequence_selectors=new RewriteRuleSubtreeStream(adaptor,"rule sequence_selectors");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:412:2: ( LEFT_PAREN expression RIGHT_PAREN ( sequence_selectors -> ^( ATOM_SELECT expression sequence_selectors ) | -> expression ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:412:4: LEFT_PAREN expression RIGHT_PAREN ( sequence_selectors -> ^( ATOM_SELECT expression sequence_selectors ) | -> expression )
            {
            LEFT_PAREN206=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_expression_select2885);  
            stream_LEFT_PAREN.add(LEFT_PAREN206);

            pushFollow(FOLLOW_expression_in_expression_select2887);
            expression207=expression();

            state._fsp--;

            stream_expression.add(expression207.getTree());
            RIGHT_PAREN208=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_expression_select2889);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN208);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:413:3: ( sequence_selectors -> ^( ATOM_SELECT expression sequence_selectors ) | -> expression )
            int alt70=2;
            switch ( input.LA(1) ) {
            case DOT:
                {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==LEFT_PAREN||LA70_1==VAR_ID) ) {
                    alt70=2;
                }
                else if ( (LA70_1==CLASS_ID) ) {
                    alt70=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    throw nvae;
                }
                }
                break;
            case AS:
            case LEFT_SQUARE_PAREN:
                {
                alt70=1;
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
            case WHERE:
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
                alt70=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:413:5: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_expression_select2895);
                    sequence_selectors209=sequence_selectors();

                    state._fsp--;

                    stream_sequence_selectors.add(sequence_selectors209.getTree());


                    // AST REWRITE
                    // elements: expression, sequence_selectors
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 414:4: -> ^( ATOM_SELECT expression sequence_selectors )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:414:7: ^( ATOM_SELECT expression sequence_selectors )
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:415:5: 
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
                    // 415:5: -> expression
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:418:10: fragment property_select : VAR_ID ( sequence_selectors )? ;
    public final OmttParser.property_select_return property_select() throws RecognitionException {
        OmttParser.property_select_return retval = new OmttParser.property_select_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID210=null;
        OmttParser.sequence_selectors_return sequence_selectors211 = null;


        Object VAR_ID210_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:419:2: ( VAR_ID ( sequence_selectors )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:419:4: VAR_ID ( sequence_selectors )?
            {
            root_0 = (Object)adaptor.nil();

            VAR_ID210=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_property_select2935); 
            VAR_ID210_tree = (Object)adaptor.create(VAR_ID210);
            adaptor.addChild(root_0, VAR_ID210_tree);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:419:11: ( sequence_selectors )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==DOT) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==CLASS_ID) ) {
                    alt71=1;
                }
            }
            else if ( (LA71_0==AS||LA71_0==LEFT_SQUARE_PAREN) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:419:11: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_property_select2937);
                    sequence_selectors211=sequence_selectors();

                    state._fsp--;

                    adaptor.addChild(root_0, sequence_selectors211.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:421:10: fragment sequence_selectors : ( type_selector ( sequence_selector )? ( alias )? | sequence_selector ( alias )? | alias );
    public final OmttParser.sequence_selectors_return sequence_selectors() throws RecognitionException {
        OmttParser.sequence_selectors_return retval = new OmttParser.sequence_selectors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.type_selector_return type_selector212 = null;

        OmttParser.sequence_selector_return sequence_selector213 = null;

        OmttParser.alias_return alias214 = null;

        OmttParser.sequence_selector_return sequence_selector215 = null;

        OmttParser.alias_return alias216 = null;

        OmttParser.alias_return alias217 = null;



        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:422:2: ( type_selector ( sequence_selector )? ( alias )? | sequence_selector ( alias )? | alias )
            int alt75=3;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt75=1;
                }
                break;
            case LEFT_SQUARE_PAREN:
                {
                alt75=2;
                }
                break;
            case AS:
                {
                alt75=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:422:4: type_selector ( sequence_selector )? ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_selector_in_sequence_selectors2950);
                    type_selector212=type_selector();

                    state._fsp--;

                    adaptor.addChild(root_0, type_selector212.getTree());
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:422:18: ( sequence_selector )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==LEFT_SQUARE_PAREN) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:422:18: sequence_selector
                            {
                            pushFollow(FOLLOW_sequence_selector_in_sequence_selectors2952);
                            sequence_selector213=sequence_selector();

                            state._fsp--;

                            adaptor.addChild(root_0, sequence_selector213.getTree());

                            }
                            break;

                    }

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:422:37: ( alias )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==AS) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:422:37: alias
                            {
                            pushFollow(FOLLOW_alias_in_sequence_selectors2955);
                            alias214=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias214.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:423:4: sequence_selector ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_sequence_selector_in_sequence_selectors2961);
                    sequence_selector215=sequence_selector();

                    state._fsp--;

                    adaptor.addChild(root_0, sequence_selector215.getTree());
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:423:22: ( alias )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==AS) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:423:22: alias
                            {
                            pushFollow(FOLLOW_alias_in_sequence_selectors2963);
                            alias216=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias216.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:424:4: alias
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alias_in_sequence_selectors2969);
                    alias217=alias();

                    state._fsp--;

                    adaptor.addChild(root_0, alias217.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:426:10: fragment type_selector : DOT single_type -> ^( TYPE_SELECT single_type ) ;
    public final OmttParser.type_selector_return type_selector() throws RecognitionException {
        OmttParser.type_selector_return retval = new OmttParser.type_selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT218=null;
        OmttParser.single_type_return single_type219 = null;


        Object DOT218_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:427:3: ( DOT single_type -> ^( TYPE_SELECT single_type ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:427:5: DOT single_type
            {
            DOT218=(Token)match(input,DOT,FOLLOW_DOT_in_type_selector2982);  
            stream_DOT.add(DOT218);

            pushFollow(FOLLOW_single_type_in_type_selector2984);
            single_type219=single_type();

            state._fsp--;

            stream_single_type.add(single_type219.getTree());


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
            // 428:4: -> ^( TYPE_SELECT single_type )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:428:7: ^( TYPE_SELECT single_type )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:430:10: fragment sequence_selector : LEFT_SQUARE_PAREN expression RIGHT_SQUARE_PAREN -> ^( SEQUENCE_SELECT expression ) ;
    public final OmttParser.sequence_selector_return sequence_selector() throws RecognitionException {
        OmttParser.sequence_selector_return retval = new OmttParser.sequence_selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE_PAREN220=null;
        Token RIGHT_SQUARE_PAREN222=null;
        OmttParser.expression_return expression221 = null;


        Object LEFT_SQUARE_PAREN220_tree=null;
        Object RIGHT_SQUARE_PAREN222_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:431:3: ( LEFT_SQUARE_PAREN expression RIGHT_SQUARE_PAREN -> ^( SEQUENCE_SELECT expression ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:431:5: LEFT_SQUARE_PAREN expression RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN220=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector3009);  
            stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN220);

            pushFollow(FOLLOW_expression_in_sequence_selector3011);
            expression221=expression();

            state._fsp--;

            stream_expression.add(expression221.getTree());
            RIGHT_SQUARE_PAREN222=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector3013);  
            stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN222);



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
            // 432:4: -> ^( SEQUENCE_SELECT expression )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:432:7: ^( SEQUENCE_SELECT expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEQUENCE_SELECT, "SEQUENCE_SELECT"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:434:10: fragment alias : AS VAR_ID -> ^( AS VAR_ID ) ;
    public final OmttParser.alias_return alias() throws RecognitionException {
        OmttParser.alias_return retval = new OmttParser.alias_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AS223=null;
        Token VAR_ID224=null;

        Object AS223_tree=null;
        Object VAR_ID224_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:435:2: ( AS VAR_ID -> ^( AS VAR_ID ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:435:4: AS VAR_ID
            {
            AS223=(Token)match(input,AS,FOLLOW_AS_in_alias3037);  
            stream_AS.add(AS223);

            VAR_ID224=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_alias3039);  
            stream_VAR_ID.add(VAR_ID224);



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
            // 436:3: -> ^( AS VAR_ID )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:436:6: ^( AS VAR_ID )
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:439:1: data_expression : DATA_START ( data_body_atom )* DATA_END -> ^( DATA_START ( data_body_atom )* ) ;
    public final OmttParser.data_expression_return data_expression() throws RecognitionException {
        OmttParser.data_expression_return retval = new OmttParser.data_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DATA_START225=null;
        Token DATA_END227=null;
        OmttParser.data_body_atom_return data_body_atom226 = null;


        Object DATA_START225_tree=null;
        Object DATA_END227_tree=null;
        RewriteRuleTokenStream stream_DATA_END=new RewriteRuleTokenStream(adaptor,"token DATA_END");
        RewriteRuleTokenStream stream_DATA_START=new RewriteRuleTokenStream(adaptor,"token DATA_START");
        RewriteRuleSubtreeStream stream_data_body_atom=new RewriteRuleSubtreeStream(adaptor,"rule data_body_atom");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:440:3: ( DATA_START ( data_body_atom )* DATA_END -> ^( DATA_START ( data_body_atom )* ) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:440:5: DATA_START ( data_body_atom )* DATA_END
            {
            DATA_START225=(Token)match(input,DATA_START,FOLLOW_DATA_START_in_data_expression3061);  
            stream_DATA_START.add(DATA_START225);

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:440:16: ( data_body_atom )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==STRING_LITERAL||LA76_0==TAG_START||LA76_0==EXPRESSION_START) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:440:16: data_body_atom
            	    {
            	    pushFollow(FOLLOW_data_body_atom_in_data_expression3063);
            	    data_body_atom226=data_body_atom();

            	    state._fsp--;

            	    stream_data_body_atom.add(data_body_atom226.getTree());

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            DATA_END227=(Token)match(input,DATA_END,FOLLOW_DATA_END_in_data_expression3066);  
            stream_DATA_END.add(DATA_END227);



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
            // 441:5: -> ^( DATA_START ( data_body_atom )* )
            {
                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:441:8: ^( DATA_START ( data_body_atom )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Data(stream_DATA_START.nextToken()), root_1);

                // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:441:27: ( data_body_atom )*
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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:444:1: atom : selectable_atom ( DOUBLE_DOT selectable_atom )? ;
    public final OmttParser.atom_return atom() throws RecognitionException {
        OmttParser.atom_return retval = new OmttParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_DOT229=null;
        OmttParser.selectable_atom_return selectable_atom228 = null;

        OmttParser.selectable_atom_return selectable_atom230 = null;


        Object DOUBLE_DOT229_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:445:2: ( selectable_atom ( DOUBLE_DOT selectable_atom )? )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:445:4: selectable_atom ( DOUBLE_DOT selectable_atom )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_selectable_atom_in_atom3094);
            selectable_atom228=selectable_atom();

            state._fsp--;

            adaptor.addChild(root_0, selectable_atom228.getTree());
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:446:3: ( DOUBLE_DOT selectable_atom )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==DOUBLE_DOT) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:446:4: DOUBLE_DOT selectable_atom
                    {
                    DOUBLE_DOT229=(Token)match(input,DOUBLE_DOT,FOLLOW_DOUBLE_DOT_in_atom3099); 
                    DOUBLE_DOT229_tree = new Range(DOUBLE_DOT229) ;
                    root_0 = (Object)adaptor.becomeRoot(DOUBLE_DOT229_tree, root_0);

                    pushFollow(FOLLOW_selectable_atom_in_atom3105);
                    selectable_atom230=selectable_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, selectable_atom230.getTree());

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:449:1: selectable_atom : ( object_atom | data_expression | namespace_id | LEFT_PAREN sequence_expression RIGHT_PAREN );
    public final OmttParser.selectable_atom_return selectable_atom() throws RecognitionException {
        OmttParser.selectable_atom_return retval = new OmttParser.selectable_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN234=null;
        Token RIGHT_PAREN236=null;
        OmttParser.object_atom_return object_atom231 = null;

        OmttParser.data_expression_return data_expression232 = null;

        OmttParser.namespace_id_return namespace_id233 = null;

        OmttParser.sequence_expression_return sequence_expression235 = null;


        Object LEFT_PAREN234_tree=null;
        Object RIGHT_PAREN236_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:450:3: ( object_atom | data_expression | namespace_id | LEFT_PAREN sequence_expression RIGHT_PAREN )
            int alt78=4;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
            case INT_NUMBER:
            case REAL_NUMBER:
            case NULL:
            case TRUE:
            case FALSE:
            case TILDE:
                {
                alt78=1;
                }
                break;
            case DATA_START:
                {
                alt78=2;
                }
                break;
            case OP_GENERAL:
            case VAR_ID:
                {
                alt78=3;
                }
                break;
            case LEFT_PAREN:
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:450:5: object_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_object_atom_in_selectable_atom3119);
                    object_atom231=object_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, object_atom231.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:451:5: data_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_data_expression_in_selectable_atom3125);
                    data_expression232=data_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, data_expression232.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:452:5: namespace_id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespace_id_in_selectable_atom3131);
                    namespace_id233=namespace_id();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace_id233.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:453:5: LEFT_PAREN sequence_expression RIGHT_PAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LEFT_PAREN234=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_selectable_atom3137); 
                    pushFollow(FOLLOW_sequence_expression_in_selectable_atom3140);
                    sequence_expression235=sequence_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, sequence_expression235.getTree());
                    RIGHT_PAREN236=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_selectable_atom3142); 

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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:455:10: fragment namespace_id : ( (ns= VAR_ID OP_VIEW )? id= VAR_ID -> ^( IDENT[$id] ( $ns)? ) | id= OP_GENERAL -> ^( IDENT[$id] ) );
    public final OmttParser.namespace_id_return namespace_id() throws RecognitionException {
        OmttParser.namespace_id_return retval = new OmttParser.namespace_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ns=null;
        Token id=null;
        Token OP_VIEW237=null;

        Object ns_tree=null;
        Object id_tree=null;
        Object OP_VIEW237_tree=null;
        RewriteRuleTokenStream stream_OP_GENERAL=new RewriteRuleTokenStream(adaptor,"token OP_GENERAL");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_VIEW=new RewriteRuleTokenStream(adaptor,"token OP_VIEW");

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:456:3: ( (ns= VAR_ID OP_VIEW )? id= VAR_ID -> ^( IDENT[$id] ( $ns)? ) | id= OP_GENERAL -> ^( IDENT[$id] ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==VAR_ID) ) {
                alt80=1;
            }
            else if ( (LA80_0==OP_GENERAL) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:456:5: (ns= VAR_ID OP_VIEW )? id= VAR_ID
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:456:5: (ns= VAR_ID OP_VIEW )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==VAR_ID) ) {
                        int LA79_1 = input.LA(2);

                        if ( (LA79_1==OP_VIEW) ) {
                            alt79=1;
                        }
                    }
                    switch (alt79) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:456:6: ns= VAR_ID OP_VIEW
                            {
                            ns=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id3160);  
                            stream_VAR_ID.add(ns);

                            OP_VIEW237=(Token)match(input,OP_VIEW,FOLLOW_OP_VIEW_in_namespace_id3162);  
                            stream_OP_VIEW.add(OP_VIEW237);


                            }
                            break;

                    }

                    id=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id3168);  
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
                    // 457:5: -> ^( IDENT[$id] ( $ns)? )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:457:8: ^( IDENT[$id] ( $ns)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Ident(IDENT, id), root_1);

                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:457:28: ( $ns)?
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
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:458:5: id= OP_GENERAL
                    {
                    id=(Token)match(input,OP_GENERAL,FOLLOW_OP_GENERAL_in_namespace_id3194);  
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
                    // 459:4: -> ^( IDENT[$id] )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:459:7: ^( IDENT[$id] )
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

    public static class sequence_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sequence_expression"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:462:1: sequence_expression : (expr= expression -> $expr) ( ( COMA rexpr+= expression )+ -> ^( SEQUENCE $sequence_expression ( $rexpr)+ ) | -> $sequence_expression) ;
    public final OmttParser.sequence_expression_return sequence_expression() throws RecognitionException {
        OmttParser.sequence_expression_return retval = new OmttParser.sequence_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMA238=null;
        List list_rexpr=null;
        OmttParser.expression_return expr = null;

        OmttParser.expression_return rexpr = null;
         rexpr = null;
        Object COMA238_tree=null;
        RewriteRuleTokenStream stream_COMA=new RewriteRuleTokenStream(adaptor,"token COMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:463:2: ( (expr= expression -> $expr) ( ( COMA rexpr+= expression )+ -> ^( SEQUENCE $sequence_expression ( $rexpr)+ ) | -> $sequence_expression) )
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:463:4: (expr= expression -> $expr) ( ( COMA rexpr+= expression )+ -> ^( SEQUENCE $sequence_expression ( $rexpr)+ ) | -> $sequence_expression)
            {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:463:4: (expr= expression -> $expr)
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:463:5: expr= expression
            {
            pushFollow(FOLLOW_expression_in_sequence_expression3222);
            expr=expression();

            state._fsp--;

            stream_expression.add(expr.getTree());


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval, expr
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.tree:null);

            root_0 = (Object)adaptor.nil();
            // 463:21: -> $expr
            {
                adaptor.addChild(root_0, stream_expr.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:464:3: ( ( COMA rexpr+= expression )+ -> ^( SEQUENCE $sequence_expression ( $rexpr)+ ) | -> $sequence_expression)
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==COMA) ) {
                alt82=1;
            }
            else if ( (LA82_0==RIGHT_PAREN) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:464:5: ( COMA rexpr+= expression )+
                    {
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:464:5: ( COMA rexpr+= expression )+
                    int cnt81=0;
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==COMA) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:464:6: COMA rexpr+= expression
                    	    {
                    	    COMA238=(Token)match(input,COMA,FOLLOW_COMA_in_sequence_expression3235);  
                    	    stream_COMA.add(COMA238);

                    	    pushFollow(FOLLOW_expression_in_sequence_expression3239);
                    	    rexpr=expression();

                    	    state._fsp--;

                    	    stream_expression.add(rexpr.getTree());
                    	    if (list_rexpr==null) list_rexpr=new ArrayList();
                    	    list_rexpr.add(rexpr.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt81 >= 1 ) break loop81;
                                EarlyExitException eee =
                                    new EarlyExitException(81, input);
                                throw eee;
                        }
                        cnt81++;
                    } while (true);



                    // AST REWRITE
                    // elements: rexpr, sequence_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: rexpr
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_rexpr=new RewriteRuleSubtreeStream(adaptor,"token rexpr",list_rexpr);
                    root_0 = (Object)adaptor.nil();
                    // 465:4: -> ^( SEQUENCE $sequence_expression ( $rexpr)+ )
                    {
                        // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:465:7: ^( SEQUENCE $sequence_expression ( $rexpr)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Sequence(SEQUENCE), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());
                        if ( !(stream_rexpr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_rexpr.hasNext() ) {
                            adaptor.addChild(root_1, stream_rexpr.nextTree());

                        }
                        stream_rexpr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:466:5: 
                    {

                    // AST REWRITE
                    // elements: sequence_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 466:5: -> $sequence_expression
                    {
                        adaptor.addChild(root_0, stream_retval.nextTree());

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
    // $ANTLR end "sequence_expression"

    public static class object_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "object_atom"
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:471:1: object_atom : ( number_atom | STRING_LITERAL | ( NULL | TILDE ) | ( TRUE | FALSE ) );
    public final OmttParser.object_atom_return object_atom() throws RecognitionException {
        OmttParser.object_atom_return retval = new OmttParser.object_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING_LITERAL240=null;
        Token NULL241=null;
        Token TILDE242=null;
        Token TRUE243=null;
        Token FALSE244=null;
        OmttParser.number_atom_return number_atom239 = null;


        Object STRING_LITERAL240_tree=null;
        Object NULL241_tree=null;
        Object TILDE242_tree=null;
        Object TRUE243_tree=null;
        Object FALSE244_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:472:3: ( number_atom | STRING_LITERAL | ( NULL | TILDE ) | ( TRUE | FALSE ) )
            int alt85=4;
            switch ( input.LA(1) ) {
            case INT_NUMBER:
            case REAL_NUMBER:
                {
                alt85=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt85=2;
                }
                break;
            case NULL:
            case TILDE:
                {
                alt85=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt85=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:472:5: number_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_atom_in_object_atom3286);
                    number_atom239=number_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, number_atom239.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:473:5: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL240=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_object_atom3292); 
                    STRING_LITERAL240_tree = new Literal(STRING_LITERAL240) ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_LITERAL240_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:474:5: ( NULL | TILDE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:474:5: ( NULL | TILDE )
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==NULL) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==TILDE) ) {
                        alt83=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        throw nvae;
                    }
                    switch (alt83) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:474:6: NULL
                            {
                            NULL241=(Token)match(input,NULL,FOLLOW_NULL_in_object_atom3303); 
                            NULL241_tree = new Literal(NULL241) ;
                            root_0 = (Object)adaptor.becomeRoot(NULL241_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:474:23: TILDE
                            {
                            TILDE242=(Token)match(input,TILDE,FOLLOW_TILDE_in_object_atom3311); 
                            TILDE242_tree = new Literal(TILDE242) ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE242_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:475:5: ( TRUE | FALSE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:475:5: ( TRUE | FALSE )
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==TRUE) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==FALSE) ) {
                        alt84=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;
                    }
                    switch (alt84) {
                        case 1 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:475:6: TRUE
                            {
                            TRUE243=(Token)match(input,TRUE,FOLLOW_TRUE_in_object_atom3324); 
                            TRUE243_tree = new Literal(TRUE243) ;
                            root_0 = (Object)adaptor.becomeRoot(TRUE243_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:475:23: FALSE
                            {
                            FALSE244=(Token)match(input,FALSE,FOLLOW_FALSE_in_object_atom3332); 
                            FALSE244_tree = new Literal(FALSE244) ;
                            root_0 = (Object)adaptor.becomeRoot(FALSE244_tree, root_0);


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
    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:478:1: number_atom : ( INT_NUMBER | REAL_NUMBER );
    public final OmttParser.number_atom_return number_atom() throws RecognitionException {
        OmttParser.number_atom_return retval = new OmttParser.number_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_NUMBER245=null;
        Token REAL_NUMBER246=null;

        Object INT_NUMBER245_tree=null;
        Object REAL_NUMBER246_tree=null;

        try {
            // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:479:3: ( INT_NUMBER | REAL_NUMBER )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==INT_NUMBER) ) {
                alt86=1;
            }
            else if ( (LA86_0==REAL_NUMBER) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:479:5: INT_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    INT_NUMBER245=(Token)match(input,INT_NUMBER,FOLLOW_INT_NUMBER_in_number_atom3350); 
                    INT_NUMBER245_tree = new Literal(INT_NUMBER245) ;
                    root_0 = (Object)adaptor.becomeRoot(INT_NUMBER245_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/OMTT Compiler/src/pl/omtt/lang/grammar/OmttParser.g:480:5: REAL_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    REAL_NUMBER246=(Token)match(input,REAL_NUMBER,FOLLOW_REAL_NUMBER_in_number_atom3360); 
                    REAL_NUMBER246_tree = new Literal(REAL_NUMBER246) ;
                    root_0 = (Object)adaptor.becomeRoot(REAL_NUMBER246_tree, root_0);


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


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\31\uffff";
    static final String DFA21_eofS =
        "\31\uffff";
    static final String DFA21_minS =
        "\1\31\5\uffff\2\31\1\uffff\2\31\1\113\1\31\1\113\5\31\1\113\2\31"+
        "\1\113\2\31";
    static final String DFA21_maxS =
        "\1\147\5\uffff\2\145\1\uffff\2\145\1\147\1\145\1\147\5\145\1\147"+
        "\2\145\1\147\2\145";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\6\20\uffff";
    static final String DFA21_specialS =
        "\31\uffff}>";
    static final String[] DFA21_transitionS = {
            "\3\10\3\uffff\1\10\17\uffff\1\1\2\uffff\1\2\4\uffff\1\3\1\10"+
            "\1\4\1\uffff\1\5\3\10\2\uffff\1\5\10\uffff\1\6\1\10\4\uffff"+
            "\1\10\13\uffff\1\10\4\uffff\1\10\3\uffff\1\7\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "\7\10\2\uffff\1\10\15\uffff\2\10\2\uffff\2\10\1\uffff\4\10"+
            "\1\uffff\3\10\7\uffff\23\10\1\uffff\2\10\1\uffff\2\10\1\uffff"+
            "\2\10\3\uffff\1\11",
            "\7\10\2\uffff\1\10\15\uffff\2\10\2\uffff\2\10\1\uffff\4\10"+
            "\1\uffff\3\10\2\uffff\1\5\4\uffff\1\13\3\10\1\14\6\10\1\12\7"+
            "\10\1\uffff\2\10\1\uffff\5\10\3\uffff\1\11",
            "",
            "\7\10\2\uffff\1\10\15\uffff\2\10\2\uffff\2\10\1\uffff\4\10"+
            "\1\uffff\3\10\2\uffff\1\5\4\uffff\1\15\3\10\1\14\6\10\1\12\12"+
            "\10\1\uffff\5\10\3\uffff\1\11",
            "\3\10\3\uffff\1\10\34\uffff\3\10\2\uffff\1\5\4\uffff\1\5\3"+
            "\uffff\1\16\1\10\4\uffff\1\10\20\uffff\1\10\3\uffff\1\17",
            "\1\10\31\uffff\1\10\1\uffff\1\20",
            "\7\10\2\uffff\1\10\15\uffff\2\10\2\uffff\2\10\1\uffff\4\10"+
            "\1\uffff\3\10\7\uffff\23\10\1\uffff\2\10\1\uffff\2\10\1\uffff"+
            "\2\10\3\uffff\1\11",
            "\1\10\31\uffff\1\10\1\uffff\1\21",
            "\7\10\2\uffff\1\10\15\uffff\2\10\2\uffff\2\10\1\uffff\4\10"+
            "\1\uffff\3\10\7\uffff\23\10\1\uffff\2\10\1\uffff\2\10\1\uffff"+
            "\2\10\3\uffff\1\22",
            "\7\10\2\uffff\1\10\15\uffff\2\10\2\uffff\2\10\1\uffff\4\10"+
            "\1\uffff\3\10\2\uffff\1\5\4\uffff\1\23\3\10\1\24\6\10\1\12\7"+
            "\10\1\uffff\2\10\1\uffff\5\10\3\uffff\1\22",
            "\7\10\2\uffff\1\10\15\uffff\2\10\2\uffff\2\10\1\uffff\4\10"+
            "\1\uffff\3\10\2\uffff\1\5\4\uffff\1\10\1\uffff\2\10\1\14\6\10"+
            "\1\25\7\10\1\uffff\2\10\1\uffff\2\10\1\uffff\2\10\3\uffff\1"+
            "\11",
            "\7\10\2\uffff\1\10\15\uffff\2\10\2\uffff\2\10\1\uffff\4\10"+
            "\1\uffff\3\10\2\uffff\1\5\4\uffff\1\10\1\uffff\2\10\1\14\6\10"+
            "\1\25\7\10\1\uffff\2\10\1\uffff\2\10\1\uffff\2\10\3\uffff\1"+
            "\11",
            "\7\10\2\uffff\1\10\15\uffff\2\10\2\uffff\2\10\1\uffff\4\10"+
            "\1\uffff\3\10\2\uffff\1\5\4\uffff\1\26\3\10\1\24\6\10\1\12\12"+
            "\10\1\uffff\5\10\3\uffff\1\22",
            "\1\10\31\uffff\1\10\1\uffff\1\27",
            "\7\10\2\uffff\1\10\15\uffff\2\10\2\uffff\2\10\1\uffff\4\10"+
            "\1\uffff\3\10\7\uffff\23\10\1\uffff\2\10\1\uffff\2\10\1\uffff"+
            "\2\10\3\uffff\1\22",
            "\3\10\3\uffff\1\10\34\uffff\3\10\2\uffff\1\5\10\uffff\1\16"+
            "\1\10\4\uffff\1\10\20\uffff\1\10\3\uffff\1\17",
            "\1\10\31\uffff\1\10\1\uffff\1\30",
            "\7\10\2\uffff\1\10\15\uffff\2\10\2\uffff\2\10\1\uffff\4\10"+
            "\1\uffff\3\10\2\uffff\1\5\4\uffff\1\10\1\uffff\2\10\1\24\6\10"+
            "\1\25\7\10\1\uffff\2\10\1\uffff\2\10\1\uffff\2\10\3\uffff\1"+
            "\22",
            "\7\10\2\uffff\1\10\15\uffff\2\10\2\uffff\2\10\1\uffff\4\10"+
            "\1\uffff\3\10\2\uffff\1\5\4\uffff\1\10\1\uffff\2\10\1\24\6\10"+
            "\1\25\7\10\1\uffff\2\10\1\uffff\2\10\1\uffff\2\10\3\uffff\1"+
            "\22"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "121:1: expression : ( def_in_expression | if_expression | map_expression | match_expression | lambda_expression | context_expression );";
        }
    }
 

    public static final BitSet FOLLOW_header_in_program53 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_definitions_in_program55 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_declaration_in_header93 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_use_declarations_in_header100 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_import_declarations_in_header106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_module_declaration119 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_MODULE_in_module_declaration121 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_module_id_in_module_declaration123 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_module_declaration125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_use_declarations155 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_use_declaration_in_use_declarations158 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_use_declarations161 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TAG_START_in_import_declarations193 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_import_declaration_in_import_declarations196 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_import_declarations199 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_declaration230 = new BitSet(new long[]{0x0000000000000000L,0x000000A200000000L});
    public static final BitSet FOLLOW_external_class_name_in_import_declaration234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_use_declaration263 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_module_id_in_use_declaration265 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_AS_in_use_declaration268 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_use_declaration270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_external_class_name311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_DOT_in_external_class_name313 = new BitSet(new long[]{0x0000000000000000L,0x000000A200000000L});
    public static final BitSet FOLLOW_set_in_external_class_name318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_module_id339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_DOT_in_module_id341 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_module_id346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_definition_in_definitions362 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TAG_START_in_tag_definition385 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DEF_in_tag_definition387 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_definition_signature_in_tag_definition389 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_tag_definition395 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_tag_definition399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_signature430 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000406L});
    public static final BitSet FOLLOW_definition_context_in_definition_signature432 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000402L});
    public static final BitSet FOLLOW_definition_argument_in_definition_signature435 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000402L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_definition_signature439 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_type_in_definition_signature443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_REVERSE_FOLLOW_in_definition_context487 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_single_type_in_definition_context489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_definition_argument513 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_argument518 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020040L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_definition_argument520 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_DOT_in_definition_argument524 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_type_in_definition_argument526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content572 = new BitSet(new long[]{0x0000000222000002L});
    public static final BitSet FOLLOW_data_body_atom_in_tag_content578 = new BitSet(new long[]{0x0000000222000002L});
    public static final BitSet FOLLOW_OP_DATA_IS_EXPRESSION_in_tag_content601 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content603 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_expression_in_tag_content609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_data_body_atom630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_inside_data_in_data_body_atom640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_inside_data_in_data_body_atom646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_START_in_expression_inside_data661 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_expression_in_expression_inside_data664 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_EXPRESSION_END_in_expression_inside_data666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_tag_in_tag_inside_data682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_tag_in_tag_inside_data688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_tag_in_tag_inside_data694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_tag_in_tag_inside_data700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_apply_tag_in_tag_inside_data706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_expression_in_expression722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expression_in_expression728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_expression_in_expression734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expression_in_expression740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expression_in_expression746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_context_expression_in_expression752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safe_def_in_expression_in_safe_expression765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safe_if_expression_in_safe_expression771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safe_map_expression_in_safe_expression777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strict_expression_in_safe_expression783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_def_in_expression797 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression801 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_AND_in_def_in_expression808 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression812 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_expression820 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C12L});
    public static final BitSet FOLLOW_COLON_in_def_in_expression822 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_expression_in_def_in_expression827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_safe_def_in_expression859 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_safe_def_in_expression863 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_AND_in_safe_def_in_expression870 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_safe_def_in_expression874 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_IN_in_safe_def_in_expression882 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C12L});
    public static final BitSet FOLLOW_COLON_in_safe_def_in_expression884 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C12L});
    public static final BitSet FOLLOW_safe_expression_in_safe_def_in_expression889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_expression921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_definition_inside_expression923 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_expression952 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_expression954 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag992 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DEF_in_def_in_tag994 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag998 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag1005 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_AND_in_def_in_tag1007 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag1011 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag1019 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_tag1021 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_def_in_tag1025 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_def_in_tag1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_tag1063 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_definition_inside_tag1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_tag1091 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_tag1093 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_expression_in_definition_inside_tag1095 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_CONTENT_in_definition_inside_tag1098 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_definition_inside_tag1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAMBDA_in_lambda_expression1139 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000410L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression1141 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000410L});
    public static final BitSet FOLLOW_COLON_in_lambda_expression1144 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_expression_in_lambda_expression1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression1174 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000402L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_lambda_expression1177 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_expression_in_lambda_expression1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_match_expression_in_lambda_expression1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_lambda_match_in_lambda_match_expression1219 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_SEMICOLON_in_lambda_match_expression1222 = new BitSet(new long[]{0x0800000000000000L,0x000000A000000402L});
    public static final BitSet FOLLOW_single_lambda_match_in_lambda_match_expression1224 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_single_lambda_match1238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_single_lambda_match1240 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C12L});
    public static final BitSet FOLLOW_safe_expression_in_single_lambda_match1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_ID_in_type1256 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_type1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_ID_in_single_type1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_expression1315 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_context_expression_in_if_expression1319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_if_expression1321 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_expression_in_if_expression1329 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_expression1335 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C12L});
    public static final BitSet FOLLOW_COLON_in_if_expression1337 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_expression_in_if_expression1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_safe_if_expression1380 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_context_expression_in_safe_if_expression1384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_safe_if_expression1386 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C12L});
    public static final BitSet FOLLOW_safe_expression_in_safe_if_expression1394 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ELSE_in_safe_if_expression1400 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C12L});
    public static final BitSet FOLLOW_COLON_in_safe_if_expression1402 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C12L});
    public static final BitSet FOLLOW_safe_expression_in_safe_if_expression1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_if_tag1445 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_if_subtag_in_if_tag1451 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_if_tag1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_subtag1473 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_context_expression_in_if_subtag1477 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_if_subtag1485 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TAG_START_in_if_subtag1495 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_subtag1497 = new BitSet(new long[]{0x0004000810000000L});
    public static final BitSet FOLLOW_tag_content_in_if_subtag1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_subtag_in_if_subtag1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_map_expression1554 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_item_alias_in_map_expression1556 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_context_expression_in_map_expression1561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_map_expression1563 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_expression_in_map_expression1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_safe_map_expression1605 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_item_alias_in_safe_map_expression1607 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_context_expression_in_safe_map_expression1612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_safe_map_expression1614 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C12L});
    public static final BitSet FOLLOW_safe_expression_in_safe_map_expression1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_map_tag1656 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_MAP_in_map_tag1658 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_item_alias_in_map_tag1660 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_context_expression_in_map_tag1665 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_map_tag1673 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_map_tag1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_item_alias1715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_OP_REVERSE_FOLLOW_in_item_alias1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_match_expression1739 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_context_expression_in_match_expression1743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_match_expression1745 = new BitSet(new long[]{0x0800000000000000L,0x000000A000000402L});
    public static final BitSet FOLLOW_lambda_match_expression_in_match_expression1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strict_expression_in_context_expression1798 = new BitSet(new long[]{0x0780000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_op_apply_in_context_expression1810 = new BitSet(new long[]{0x700000008E000000L,0x0000002210010C00L});
    public static final BitSet FOLLOW_atom_expression_in_context_expression1812 = new BitSet(new long[]{0x778000008E000000L,0x0000002270010C00L});
    public static final BitSet FOLLOW_function_arguments_in_context_expression1816 = new BitSet(new long[]{0x0780000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_op_map_in_context_expression1854 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C12L});
    public static final BitSet FOLLOW_safe_expression_in_context_expression1858 = new BitSet(new long[]{0x0780000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_MATCH_in_context_expression1881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_context_expression1883 = new BitSet(new long[]{0x0800000000000000L,0x000000A000000402L});
    public static final BitSet FOLLOW_lambda_match_expression_in_context_expression1885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_context_expression1887 = new BitSet(new long[]{0x0780000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_WHERE_in_context_expression1920 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C12L});
    public static final BitSet FOLLOW_safe_expression_in_context_expression1922 = new BitSet(new long[]{0x0780000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_OP_CONTEXT_in_op_apply1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_op_apply1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_EXPRESSION_CONTEXT_in_op_map1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_op_map1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_apply_expression2006 = new BitSet(new long[]{0x700000008E000000L,0x0000002210010C00L});
    public static final BitSet FOLLOW_atom_expression_in_apply_expression2008 = new BitSet(new long[]{0x700000008E000000L,0x0000002210010C00L});
    public static final BitSet FOLLOW_function_arguments_in_apply_expression2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_apply_tag2055 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_apply_expression_in_apply_tag2058 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_apply_tag2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concatence_expression_in_strict_expression2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_apply_expression_in_strict_expression2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_concatence_expression2094 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OP_CONCAT_in_concatence_expression2108 = new BitSet(new long[]{0x700000008E000000L,0x0000002210010C00L});
    public static final BitSet FOLLOW_boolean_expression_in_concatence_expression2112 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_boolean_binary_expression_in_boolean_expression2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression2155 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_boolean_binary_operator_in_boolean_binary_expression2158 = new BitSet(new long[]{0x700000008E000000L,0x0000002210010C00L});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression2161 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_boolean_unary_operator_in_boolean_unary_expression2177 = new BitSet(new long[]{0x700000008E000000L,0x0000002210010C00L});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_AND_in_boolean_binary_operator2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_OR_in_boolean_binary_operator2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_in_boolean_unary_operator2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression2246 = new BitSet(new long[]{0x0000000000000002L,0x0000000001F80000L});
    public static final BitSet FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression2249 = new BitSet(new long[]{0x700000008E000000L,0x0000002210010C00L});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression2252 = new BitSet(new long[]{0x0000000000000002L,0x0000000001F80000L});
    public static final BitSet FOLLOW_OP_EQUAL_in_boolean_comparsion_operator2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LE_in_boolean_comparsion_operator2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LEQ_in_boolean_comparsion_operator2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GE_in_boolean_comparsion_operator2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GEQ_in_boolean_comparsion_operator2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2338 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_OP_PLUS_in_additive_expression2354 = new BitSet(new long[]{0x700000008E000000L,0x0000002210010C00L});
    public static final BitSet FOLLOW_OP_MINUS_in_additive_expression2368 = new BitSet(new long[]{0x700000008E000000L,0x0000002210010C00L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2388 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression2408 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060200L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_multiplicative_expression2418 = new BitSet(new long[]{0x700000008E000000L,0x0000002210010C00L});
    public static final BitSet FOLLOW_SLASH_in_multiplicative_expression2432 = new BitSet(new long[]{0x700000008E000000L,0x0000002210010C00L});
    public static final BitSet FOLLOW_OP_MODULO_in_multiplicative_expression2446 = new BitSet(new long[]{0x700000008E000000L,0x0000002210010C00L});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression2466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060200L});
    public static final BitSet FOLLOW_OP_MINUS_in_negative_expression2485 = new BitSet(new long[]{0x700000008E000000L,0x0000002210010C00L});
    public static final BitSet FOLLOW_functional_expression_in_negative_expression2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functional_expression_in_negative_expression2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_expression_in_functional_expression2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expression_in_call_expression2532 = new BitSet(new long[]{0x700000008E000002L,0x0000002210010C00L});
    public static final BitSet FOLLOW_function_argument_in_call_expression2540 = new BitSet(new long[]{0x700000008E000002L,0x0000002210010C00L});
    public static final BitSet FOLLOW_TAG_START_in_call_tag2600 = new BitSet(new long[]{0x0000000000000000L,0x0000002200000000L});
    public static final BitSet FOLLOW_namespace_id_in_call_tag2604 = new BitSet(new long[]{0x70000008DE000000L,0x0000002210010C00L});
    public static final BitSet FOLLOW_tag_content_in_call_tag2614 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_function_argument_in_call_tag2620 = new BitSet(new long[]{0x70000008DE000000L,0x0000002210010C00L});
    public static final BitSet FOLLOW_tag_content_in_call_tag2626 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_call_tag2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_argument_in_function_arguments2695 = new BitSet(new long[]{0x700000008E000002L,0x0000002210010C00L});
    public static final BitSet FOLLOW_VAR_ID_in_function_argument2711 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_function_argument2713 = new BitSet(new long[]{0x700000008E000000L,0x0000002210010C00L});
    public static final BitSet FOLLOW_atom_expression_in_function_argument2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_with_selectors_in_atom_expression2753 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_DOT_in_atom_expression2766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_expression_select_in_atom_expression2770 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_DOT_in_atom_expression2797 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_property_select_in_atom_expression2801 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_atom_in_atom_with_selectors2839 = new BitSet(new long[]{0x0020000000000002L,0x0000000000002040L});
    public static final BitSet FOLLOW_sequence_selectors_in_atom_with_selectors2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_expression_select2885 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_expression_in_expression_select2887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_expression_select2889 = new BitSet(new long[]{0x0020000000000002L,0x0000000000002040L});
    public static final BitSet FOLLOW_sequence_selectors_in_expression_select2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_property_select2935 = new BitSet(new long[]{0x0020000000000002L,0x0000000000002040L});
    public static final BitSet FOLLOW_sequence_selectors_in_property_select2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_selector_in_sequence_selectors2950 = new BitSet(new long[]{0x0020000000000002L,0x0000000000002040L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors2952 = new BitSet(new long[]{0x0020000000000002L,0x0000000000002040L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors2961 = new BitSet(new long[]{0x0020000000000002L,0x0000000000002040L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_type_selector2982 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_single_type_in_type_selector2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector3009 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_expression_in_sequence_selector3011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_alias3037 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_alias3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_START_in_data_expression3061 = new BitSet(new long[]{0x0000000322000000L});
    public static final BitSet FOLLOW_data_body_atom_in_data_expression3063 = new BitSet(new long[]{0x0000000322000000L});
    public static final BitSet FOLLOW_DATA_END_in_data_expression3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectable_atom_in_atom3094 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_DOUBLE_DOT_in_atom3099 = new BitSet(new long[]{0x700000008E000000L,0x0000002210010C00L});
    public static final BitSet FOLLOW_selectable_atom_in_atom3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_atom_in_selectable_atom3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_expression_in_selectable_atom3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_id_in_selectable_atom3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_selectable_atom3137 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_sequence_expression_in_selectable_atom3140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_selectable_atom3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id3160 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_OP_VIEW_in_namespace_id3162 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GENERAL_in_namespace_id3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_sequence_expression3222 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_COMA_in_sequence_expression3235 = new BitSet(new long[]{0x7B8480008E000000L,0x000000A210010C02L});
    public static final BitSet FOLLOW_expression_in_sequence_expression3239 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_number_atom_in_object_atom3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_object_atom3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_object_atom3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_object_atom3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_object_atom3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_object_atom3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_NUMBER_in_number_atom3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_NUMBER_in_number_atom3360 = new BitSet(new long[]{0x0000000000000002L});

}