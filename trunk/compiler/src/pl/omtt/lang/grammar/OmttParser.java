// $ANTLR 3.1.2 /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g 2009-12-12 03:56:39

package pl.omtt.lang.grammar;

import pl.omtt.lang.model.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

@SuppressWarnings("all")
public class OmttParser extends AbstractOmttParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "HEADER", "USE", "USES", "IMPORT", "IMPORTS", "TYPE", "IDENT", "ATOM_SELECT", "PROPERTY_SELECT", "TYPE_SELECT", "SEQUENCE_SELECT", "ITERATE", "LAMBDA_MATCH", "ARGUMENTS", "ARGUMENT", "RETURNS", "BLOCK", "IF_ELSE", "CALL", "CAST", "SEQUENCE", "TUPLE", "RECORD", "FUNCTION", "STRING_LITERAL", "INT_NUMBER", "REAL_NUMBER", "CONTENT", "TAG_START", "TAG_END", "DATA_START", "DATA_END", "EXPRESSION_START", "EXPRESSION_END", "OP_DATA_IS_EXPRESSION", "IT", "ITEM", "COMMENT_SINGLE_LINE", "COMMENT_MULTI_LINE", "WS", "NEWLINE", "ACTION_ON_NEWLINE", "STRING_PARENS", "MODE_LEFT_PAREN", "MODE_RIGHT_PAREN", "MODULE", "DEF", "PARTIAL", "TOO", "IN", "IF", "THEN", "ELSE", "AS", "IS", "MAP", "APPLY", "MATCH", "WHERE", "ORDER", "BY", "FUN", "NULL", "TRUE", "FALSE", "INNER_TAG_KEYWORD", "SINGLE_TAG_KEYWORD", "OP_FOLLOW", "OP_REVERSE_FOLLOW", "OP_DOUBLE_FOLLOW", "COLON", "SEMICOLON", "DOT", "DOUBLE_DOT", "COMMA", "SLASH", "TILDE", "QUESTION_MARK", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_SQUARE_PAREN", "RIGHT_SQUARE_PAREN", "OP_PLUS", "OP_MINUS", "OP_MULTIPLY", "OP_MODULO", "OP_EQUAL", "OP_NOT_EQUAL", "OP_LEQ", "OP_LE", "OP_GEQ", "OP_GE", "OP_ASSIGN", "OP_AND", "OP_OR", "OP_NOT", "OP_CONTEXT", "OP_VIEW", "OP_CONCAT", "OP_GENERAL", "OP_DATA", "SMALL_LETTER", "NAMECHAR", "VAR_ID", "BIG_LETTER", "CLASS_ID", "DIGIT", "INT_OR_REAL_NUMBER", "LETTER", "NOT_NAME"
    };
    public static final int CAST=24;
    public static final int FUNCTION=28;
    public static final int OP_LE=94;
    public static final int INT_NUMBER=30;
    public static final int OP_REVERSE_FOLLOW=73;
    public static final int OP_AND=98;
    public static final int INT_OR_REAL_NUMBER=112;
    public static final int LETTER=113;
    public static final int OP_GEQ=95;
    public static final int OP_GE=96;
    public static final int EOF=-1;
    public static final int DOUBLE_DOT=78;
    public static final int TYPE=10;
    public static final int TUPLE=26;
    public static final int IMPORT=8;
    public static final int STRING_LITERAL=29;
    public static final int OP_MINUS=88;
    public static final int MODE_LEFT_PAREN=48;
    public static final int OP_NOT_EQUAL=92;
    public static final int QUESTION_MARK=82;
    public static final int SEQUENCE_SELECT=15;
    public static final int RECORD=27;
    public static final int VAR_ID=108;
    public static final int ARGUMENTS=18;
    public static final int NULL=67;
    public static final int ELSE=57;
    public static final int MATCH=62;
    public static final int SEMICOLON=76;
    public static final int SINGLE_TAG_KEYWORD=71;
    public static final int MODE_RIGHT_PAREN=49;
    public static final int CONTENT=32;
    public static final int DATA_START=35;
    public static final int EXPRESSION_START=37;
    public static final int NAMECHAR=107;
    public static final int SEQUENCE=25;
    public static final int INNER_TAG_KEYWORD=70;
    public static final int WS=44;
    public static final int OP_DATA=105;
    public static final int USES=7;
    public static final int REAL_NUMBER=31;
    public static final int LEFT_PAREN=83;
    public static final int IMPORTS=9;
    public static final int OP_EQUAL=91;
    public static final int CALL=23;
    public static final int OP_DATA_IS_EXPRESSION=39;
    public static final int USE=6;
    public static final int FUN=66;
    public static final int FALSE=69;
    public static final int STRING_PARENS=47;
    public static final int COMMENT_SINGLE_LINE=42;
    public static final int CLASS_ID=110;
    public static final int OP_CONCAT=103;
    public static final int SMALL_LETTER=106;
    public static final int APPLY=61;
    public static final int WHERE=63;
    public static final int DEF=51;
    public static final int OP_ASSIGN=97;
    public static final int OP_FOLLOW=72;
    public static final int OP_OR=99;
    public static final int EXPRESSION_END=38;
    public static final int ORDER=64;
    public static final int TYPE_SELECT=14;
    public static final int DATA_END=36;
    public static final int IF_ELSE=22;
    public static final int IF=55;
    public static final int COMMENT_MULTI_LINE=43;
    public static final int AS=58;
    public static final int RIGHT_PAREN=84;
    public static final int BIG_LETTER=109;
    public static final int SLASH=80;
    public static final int IN=54;
    public static final int THEN=56;
    public static final int LEFT_SQUARE_PAREN=85;
    public static final int COMMA=79;
    public static final int IS=59;
    public static final int IT=40;
    public static final int TAG_START=33;
    public static final int ARGUMENT=19;
    public static final int RIGHT_SQUARE_PAREN=86;
    public static final int TILDE=81;
    public static final int OP_GENERAL=104;
    public static final int IDENT=11;
    public static final int OP_NOT=100;
    public static final int OP_DOUBLE_FOLLOW=74;
    public static final int DIGIT=111;
    public static final int HEADER=5;
    public static final int DOT=77;
    public static final int NOT_NAME=114;
    public static final int OP_MULTIPLY=89;
    public static final int PARTIAL=52;
    public static final int RETURNS=20;
    public static final int BY=65;
    public static final int OP_PLUS=87;
    public static final int ITEM=41;
    public static final int ATOM_SELECT=12;
    public static final int MODULE=50;
    public static final int TRUE=68;
    public static final int OP_VIEW=102;
    public static final int OP_MODULO=90;
    public static final int COLON=75;
    public static final int ITERATE=16;
    public static final int TAG_END=34;
    public static final int NEWLINE=45;
    public static final int BLOCK=21;
    public static final int MAP=60;
    public static final int PROPERTY_SELECT=13;
    public static final int OP_CONTEXT=101;
    public static final int ACTION_ON_NEWLINE=46;
    public static final int PROGRAM=4;
    public static final int OP_LEQ=93;
    public static final int TOO=53;
    public static final int LAMBDA_MATCH=17;

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
    public String getGrammarFileName() { return "/home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:17:1: program : header ( definitions )? EOF -> ^( PROGRAM ( header )? ( definitions )? ) ;
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:18:3: ( header ( definitions )? EOF -> ^( PROGRAM ( header )? ( definitions )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:18:5: header ( definitions )? EOF
            {
            pushFollow(FOLLOW_header_in_program62);
            header1=header();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_header.add(header1.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:18:12: ( definitions )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==TAG_START) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: definitions
                    {
                    pushFollow(FOLLOW_definitions_in_program64);
                    definitions2=definitions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_definitions.add(definitions2.getTree());

                    }
                    break;

            }

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program67); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF3);



            // AST REWRITE
            // elements: definitions, header
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 19:5: -> ^( PROGRAM ( header )? ( definitions )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:19:8: ^( PROGRAM ( header )? ( definitions )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Program(PROGRAM), root_1);

                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:19:27: ( header )?
                if ( stream_header.hasNext() ) {
                    adaptor.addChild(root_1, stream_header.nextTree());

                }
                stream_header.reset();
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:19:35: ( definitions )?
                if ( stream_definitions.hasNext() ) {
                    adaptor.addChild(root_1, stream_definitions.nextTree());

                }
                stream_definitions.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:25:1: header : ( module_declaration )? import_declarations use_declarations ;
    public final OmttParser.header_return header() throws RecognitionException {
        OmttParser.header_return retval = new OmttParser.header_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.module_declaration_return module_declaration4 = null;

        OmttParser.import_declarations_return import_declarations5 = null;

        OmttParser.use_declarations_return use_declarations6 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:26:3: ( ( module_declaration )? import_declarations use_declarations )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:26:5: ( module_declaration )? import_declarations use_declarations
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:26:5: ( module_declaration )?
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: module_declaration
                    {
                    pushFollow(FOLLOW_module_declaration_in_header102);
                    module_declaration4=module_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, module_declaration4.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_import_declarations_in_header109);
            import_declarations5=import_declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, import_declarations5.getTree());
            pushFollow(FOLLOW_use_declarations_in_header115);
            use_declarations6=use_declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, use_declarations6.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:31:1: module_declaration : TAG_START MODULE module_id TAG_END -> ^( MODULE[$MODULE] module_id ) ;
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:32:3: ( TAG_START MODULE module_id TAG_END -> ^( MODULE[$MODULE] module_id ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:32:5: TAG_START MODULE module_id TAG_END
            {
            TAG_START7=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_module_declaration128); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START7);

            MODULE8=(Token)match(input,MODULE,FOLLOW_MODULE_in_module_declaration130); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE8);

            pushFollow(FOLLOW_module_id_in_module_declaration132);
            module_id9=module_id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_module_id.add(module_id9.getTree());
            TAG_END10=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_module_declaration134); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_END.add(TAG_END10);



            // AST REWRITE
            // elements: module_id, MODULE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 33:5: -> ^( MODULE[$MODULE] module_id )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:33:8: ^( MODULE[$MODULE] module_id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ModuleDeclaration(MODULE, MODULE8), root_1);

                adaptor.addChild(root_1, stream_module_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

    public static class import_declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "import_declarations"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:35:1: import_declarations : ( ( TAG_START ( import_declaration ) TAG_END )+ )? -> ( ^( IMPORTS ( import_declaration )+ ) )? ;
    public final OmttParser.import_declarations_return import_declarations() throws RecognitionException {
        OmttParser.import_declarations_return retval = new OmttParser.import_declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START11=null;
        Token TAG_END13=null;
        OmttParser.import_declaration_return import_declaration12 = null;


        Object TAG_START11_tree=null;
        Object TAG_END13_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_import_declaration=new RewriteRuleSubtreeStream(adaptor,"rule import_declaration");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:3: ( ( ( TAG_START ( import_declaration ) TAG_END )+ )? -> ( ^( IMPORTS ( import_declaration )+ ) )? )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:5: ( ( TAG_START ( import_declaration ) TAG_END )+ )?
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:5: ( ( TAG_START ( import_declaration ) TAG_END )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TAG_START) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==IMPORT) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:6: ( TAG_START ( import_declaration ) TAG_END )+
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:6: ( TAG_START ( import_declaration ) TAG_END )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==TAG_START) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==IMPORT) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:7: TAG_START ( import_declaration ) TAG_END
                    	    {
                    	    TAG_START11=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_import_declarations164); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START11);

                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:17: ( import_declaration )
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:18: import_declaration
                    	    {
                    	    pushFollow(FOLLOW_import_declaration_in_import_declarations167);
                    	    import_declaration12=import_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_import_declaration.add(import_declaration12.getTree());

                    	    }

                    	    TAG_END13=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_import_declarations170); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_TAG_END.add(TAG_END13);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
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
            // elements: import_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 37:5: -> ( ^( IMPORTS ( import_declaration )+ ) )?
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:37:8: ( ^( IMPORTS ( import_declaration )+ ) )?
                if ( stream_import_declaration.hasNext() ) {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:37:8: ^( IMPORTS ( import_declaration )+ )
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

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

    public static class use_declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "use_declarations"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:39:1: use_declarations : ( ( TAG_START ( use_declaration ) TAG_END )+ )? -> ( ^( USES ( use_declaration )+ ) )? ;
    public final OmttParser.use_declarations_return use_declarations() throws RecognitionException {
        OmttParser.use_declarations_return retval = new OmttParser.use_declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START14=null;
        Token TAG_END16=null;
        OmttParser.use_declaration_return use_declaration15 = null;


        Object TAG_START14_tree=null;
        Object TAG_END16_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_use_declaration=new RewriteRuleSubtreeStream(adaptor,"rule use_declaration");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:3: ( ( ( TAG_START ( use_declaration ) TAG_END )+ )? -> ( ^( USES ( use_declaration )+ ) )? )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:5: ( ( TAG_START ( use_declaration ) TAG_END )+ )?
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:5: ( ( TAG_START ( use_declaration ) TAG_END )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==TAG_START) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==USE) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:6: ( TAG_START ( use_declaration ) TAG_END )+
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:6: ( TAG_START ( use_declaration ) TAG_END )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==TAG_START) ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1==USE) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:7: TAG_START ( use_declaration ) TAG_END
                    	    {
                    	    TAG_START14=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_use_declarations202); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START14);

                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:17: ( use_declaration )
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:18: use_declaration
                    	    {
                    	    pushFollow(FOLLOW_use_declaration_in_use_declarations205);
                    	    use_declaration15=use_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_use_declaration.add(use_declaration15.getTree());

                    	    }

                    	    TAG_END16=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_use_declarations208); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_TAG_END.add(TAG_END16);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
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
            // elements: use_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 41:5: -> ( ^( USES ( use_declaration )+ ) )?
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:41:8: ( ^( USES ( use_declaration )+ ) )?
                if ( stream_use_declaration.hasNext() ) {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:41:8: ^( USES ( use_declaration )+ )
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

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

    public static class import_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "import_declaration"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:44:1: import_declaration : IMPORT module_id ( AS VAR_ID )? -> ^( IMPORT[$IMPORT] ^( MODULE module_id ) ( VAR_ID )? ) ;
    public final OmttParser.import_declaration_return import_declaration() throws RecognitionException {
        OmttParser.import_declaration_return retval = new OmttParser.import_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IMPORT17=null;
        Token AS19=null;
        Token VAR_ID20=null;
        OmttParser.module_id_return module_id18 = null;


        Object IMPORT17_tree=null;
        Object AS19_tree=null;
        Object VAR_ID20_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_IMPORT=new RewriteRuleTokenStream(adaptor,"token IMPORT");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleSubtreeStream stream_module_id=new RewriteRuleSubtreeStream(adaptor,"rule module_id");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:45:3: ( IMPORT module_id ( AS VAR_ID )? -> ^( IMPORT[$IMPORT] ^( MODULE module_id ) ( VAR_ID )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:45:5: IMPORT module_id ( AS VAR_ID )?
            {
            IMPORT17=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_declaration239); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPORT.add(IMPORT17);

            pushFollow(FOLLOW_module_id_in_import_declaration241);
            module_id18=module_id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_module_id.add(module_id18.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:45:22: ( AS VAR_ID )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==AS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:45:23: AS VAR_ID
                    {
                    AS19=(Token)match(input,AS,FOLLOW_AS_in_import_declaration244); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS19);

                    VAR_ID20=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_import_declaration246); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID20);


                    }
                    break;

            }



            // AST REWRITE
            // elements: IMPORT, module_id, VAR_ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 46:5: -> ^( IMPORT[$IMPORT] ^( MODULE module_id ) ( VAR_ID )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:46:8: ^( IMPORT[$IMPORT] ^( MODULE module_id ) ( VAR_ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ImportDeclaration(IMPORT, IMPORT17), root_1);

                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:46:45: ^( MODULE module_id )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MODULE, "MODULE"), root_2);

                adaptor.addChild(root_2, stream_module_id.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:46:65: ( VAR_ID )?
                if ( stream_VAR_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_VAR_ID.nextNode());

                }
                stream_VAR_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:48:1: use_declaration : USE ec= external_class_name -> ^( USE[$USE] $ec) ;
    public final OmttParser.use_declaration_return use_declaration() throws RecognitionException {
        OmttParser.use_declaration_return retval = new OmttParser.use_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token USE21=null;
        OmttParser.external_class_name_return ec = null;


        Object USE21_tree=null;
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleSubtreeStream stream_external_class_name=new RewriteRuleSubtreeStream(adaptor,"rule external_class_name");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:49:3: ( USE ec= external_class_name -> ^( USE[$USE] $ec) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:49:5: USE ec= external_class_name
            {
            USE21=(Token)match(input,USE,FOLLOW_USE_in_use_declaration283); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_USE.add(USE21);

            pushFollow(FOLLOW_external_class_name_in_use_declaration287);
            ec=external_class_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_external_class_name.add(ec.getTree());


            // AST REWRITE
            // elements: USE, ec
            // token labels: 
            // rule labels: retval, ec
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ec=new RewriteRuleSubtreeStream(adaptor,"rule ec",ec!=null?ec.tree:null);

            root_0 = (Object)adaptor.nil();
            // 50:5: -> ^( USE[$USE] $ec)
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:50:8: ^( USE[$USE] $ec)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new UseDeclaration(USE, USE21), root_1);

                adaptor.addChild(root_1, stream_ec.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:53:10: fragment external_class_name : ( VAR_ID DOT )* ( CLASS_ID | OP_GENERAL ) ;
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:54:3: ( ( VAR_ID DOT )* ( CLASS_ID | OP_GENERAL ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:54:5: ( VAR_ID DOT )* ( CLASS_ID | OP_GENERAL )
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:54:5: ( VAR_ID DOT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==VAR_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:54:6: VAR_ID DOT
            	    {
            	    VAR_ID22=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_external_class_name320); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    VAR_ID22_tree = (Object)adaptor.create(VAR_ID22);
            	    adaptor.addChild(root_0, VAR_ID22_tree);
            	    }
            	    DOT23=(Token)match(input,DOT,FOLLOW_DOT_in_external_class_name322); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            set24=(Token)input.LT(1);
            if ( input.LA(1)==OP_GENERAL||input.LA(1)==CLASS_ID ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set24));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:56:10: fragment module_id : ( VAR_ID DOT )* VAR_ID ;
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:57:3: ( ( VAR_ID DOT )* VAR_ID )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:57:5: ( VAR_ID DOT )* VAR_ID
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:57:5: ( VAR_ID DOT )*
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
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:57:6: VAR_ID DOT
            	    {
            	    VAR_ID25=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_module_id348); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    VAR_ID25_tree = (Object)adaptor.create(VAR_ID25);
            	    adaptor.addChild(root_0, VAR_ID25_tree);
            	    }
            	    DOT26=(Token)match(input,DOT,FOLLOW_DOT_in_module_id350); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            VAR_ID27=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_module_id355); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR_ID27_tree = (Object)adaptor.create(VAR_ID27);
            adaptor.addChild(root_0, VAR_ID27_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:63:1: definitions : ( tag_definition )+ -> ( tag_definition )+ ;
    public final OmttParser.definitions_return definitions() throws RecognitionException {
        OmttParser.definitions_return retval = new OmttParser.definitions_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.tag_definition_return tag_definition28 = null;


        RewriteRuleSubtreeStream stream_tag_definition=new RewriteRuleSubtreeStream(adaptor,"rule tag_definition");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:64:3: ( ( tag_definition )+ -> ( tag_definition )+ )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:64:5: ( tag_definition )+
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:64:5: ( tag_definition )+
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
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: tag_definition
            	    {
            	    pushFollow(FOLLOW_tag_definition_in_definitions371);
            	    tag_definition28=tag_definition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_tag_definition.add(tag_definition28.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
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
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 65:5: -> ( tag_definition )+
            {
                if ( !(stream_tag_definition.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_tag_definition.hasNext() ) {
                    adaptor.addChild(root_0, stream_tag_definition.nextTree());

                }
                stream_tag_definition.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:68:1: tag_definition : TAG_START DEF definition_signature content= tag_content TAG_END -> ^( DEF definition_signature $content) ;
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:68:16: ( TAG_START DEF definition_signature content= tag_content TAG_END -> ^( DEF definition_signature $content) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:69:3: TAG_START DEF definition_signature content= tag_content TAG_END
            {
            TAG_START29=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_tag_definition394); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START29);

            DEF30=(Token)match(input,DEF,FOLLOW_DEF_in_tag_definition396); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEF.add(DEF30);

            pushFollow(FOLLOW_definition_signature_in_tag_definition398);
            definition_signature31=definition_signature();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_definition_signature.add(definition_signature31.getTree());
            pushFollow(FOLLOW_tag_content_in_tag_definition404);
            content=tag_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tag_content.add(content.getTree());
            TAG_END32=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_tag_definition408); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_END.add(TAG_END32);



            // AST REWRITE
            // elements: DEF, content, definition_signature
            // token labels: 
            // rule labels: content, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"rule content",content!=null?content.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 72:3: -> ^( DEF definition_signature $content)
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:72:6: ^( DEF definition_signature $content)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TemplateDefinition(stream_DEF.nextToken()), root_1);

                adaptor.addChild(root_1, stream_definition_signature.nextTree());
                adaptor.addChild(root_1, stream_content.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:10: fragment definition_signature : ( ( PARTIAL )? VAR_ID definition_context | VAR_ID ) ( definition_argument )* ( OP_FOLLOW ret_type= type )? -> VAR_ID ( definition_context )? ( PARTIAL )? ^( ARGUMENTS ( definition_argument )* ) ^( RETURNS ( $ret_type)? ) ;
    public final OmttParser.definition_signature_return definition_signature() throws RecognitionException {
        OmttParser.definition_signature_return retval = new OmttParser.definition_signature_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PARTIAL33=null;
        Token VAR_ID34=null;
        Token VAR_ID36=null;
        Token OP_FOLLOW38=null;
        OmttParser.type_return ret_type = null;

        OmttParser.definition_context_return definition_context35 = null;

        OmttParser.definition_argument_return definition_argument37 = null;


        Object PARTIAL33_tree=null;
        Object VAR_ID34_tree=null;
        Object VAR_ID36_tree=null;
        Object OP_FOLLOW38_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_FOLLOW");
        RewriteRuleTokenStream stream_PARTIAL=new RewriteRuleTokenStream(adaptor,"token PARTIAL");
        RewriteRuleSubtreeStream stream_definition_context=new RewriteRuleSubtreeStream(adaptor,"rule definition_context");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_definition_argument=new RewriteRuleSubtreeStream(adaptor,"rule definition_argument");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:3: ( ( ( PARTIAL )? VAR_ID definition_context | VAR_ID ) ( definition_argument )* ( OP_FOLLOW ret_type= type )? -> VAR_ID ( definition_context )? ( PARTIAL )? ^( ARGUMENTS ( definition_argument )* ) ^( RETURNS ( $ret_type)? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:5: ( ( PARTIAL )? VAR_ID definition_context | VAR_ID ) ( definition_argument )* ( OP_FOLLOW ret_type= type )?
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:5: ( ( PARTIAL )? VAR_ID definition_context | VAR_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==PARTIAL) ) {
                alt12=1;
            }
            else if ( (LA12_0==VAR_ID) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==LEFT_SQUARE_PAREN) ) {
                    alt12=1;
                }
                else if ( (LA12_2==CONTENT||LA12_2==OP_DATA_IS_EXPRESSION||LA12_2==OP_FOLLOW||LA12_2==COLON||LA12_2==QUESTION_MARK||LA12_2==VAR_ID) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:6: ( PARTIAL )? VAR_ID definition_context
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:6: ( PARTIAL )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==PARTIAL) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: PARTIAL
                            {
                            PARTIAL33=(Token)match(input,PARTIAL,FOLLOW_PARTIAL_in_definition_signature440); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_PARTIAL.add(PARTIAL33);


                            }
                            break;

                    }

                    VAR_ID34=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_signature443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID34);

                    pushFollow(FOLLOW_definition_context_in_definition_signature445);
                    definition_context35=definition_context();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_definition_context.add(definition_context35.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:43: VAR_ID
                    {
                    VAR_ID36=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_signature449); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID36);


                    }
                    break;

            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:51: ( definition_argument )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==QUESTION_MARK||LA13_0==VAR_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: definition_argument
            	    {
            	    pushFollow(FOLLOW_definition_argument_in_definition_signature452);
            	    definition_argument37=definition_argument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_definition_argument.add(definition_argument37.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:72: ( OP_FOLLOW ret_type= type )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==OP_FOLLOW) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:73: OP_FOLLOW ret_type= type
                    {
                    OP_FOLLOW38=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_definition_signature456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_FOLLOW.add(OP_FOLLOW38);

                    pushFollow(FOLLOW_type_in_definition_signature460);
                    ret_type=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(ret_type.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ret_type, definition_argument, PARTIAL, definition_context, VAR_ID
            // token labels: 
            // rule labels: retval, ret_type
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ret_type=new RewriteRuleSubtreeStream(adaptor,"rule ret_type",ret_type!=null?ret_type.tree:null);

            root_0 = (Object)adaptor.nil();
            // 77:5: -> VAR_ID ( definition_context )? ( PARTIAL )? ^( ARGUMENTS ( definition_argument )* ) ^( RETURNS ( $ret_type)? )
            {
                adaptor.addChild(root_0, new Ident(stream_VAR_ID.nextToken()));
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:77:22: ( definition_context )?
                if ( stream_definition_context.hasNext() ) {
                    adaptor.addChild(root_0, stream_definition_context.nextTree());

                }
                stream_definition_context.reset();
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:77:42: ( PARTIAL )?
                if ( stream_PARTIAL.hasNext() ) {
                    adaptor.addChild(root_0, stream_PARTIAL.nextNode());

                }
                stream_PARTIAL.reset();
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:77:51: ^( ARGUMENTS ( definition_argument )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:77:63: ( definition_argument )*
                while ( stream_definition_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_definition_argument.nextTree());

                }
                stream_definition_argument.reset();

                adaptor.addChild(root_0, root_1);
                }
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:77:85: ^( RETURNS ( $ret_type)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURNS, "RETURNS"), root_1);

                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:77:95: ( $ret_type)?
                if ( stream_ret_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_ret_type.nextTree());

                }
                stream_ret_type.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:79:10: fragment definition_context : LEFT_SQUARE_PAREN single_type ( where_clause )? RIGHT_SQUARE_PAREN -> ^( ARGUMENT single_type ( where_clause )? ) ;
    public final OmttParser.definition_context_return definition_context() throws RecognitionException {
        OmttParser.definition_context_return retval = new OmttParser.definition_context_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE_PAREN39=null;
        Token RIGHT_SQUARE_PAREN42=null;
        OmttParser.single_type_return single_type40 = null;

        OmttParser.where_clause_return where_clause41 = null;


        Object LEFT_SQUARE_PAREN39_tree=null;
        Object RIGHT_SQUARE_PAREN42_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:2: ( LEFT_SQUARE_PAREN single_type ( where_clause )? RIGHT_SQUARE_PAREN -> ^( ARGUMENT single_type ( where_clause )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:4: LEFT_SQUARE_PAREN single_type ( where_clause )? RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN39=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_definition_context507); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN39);

            pushFollow(FOLLOW_single_type_in_definition_context509);
            single_type40=single_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_single_type.add(single_type40.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:34: ( where_clause )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==WHERE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_definition_context511);
                    where_clause41=where_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_where_clause.add(where_clause41.getTree());

                    }
                    break;

            }

            RIGHT_SQUARE_PAREN42=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_definition_context514); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN42);



            // AST REWRITE
            // elements: single_type, where_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 81:3: -> ^( ARGUMENT single_type ( where_clause )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:81:6: ^( ARGUMENT single_type ( where_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENT, "ARGUMENT"), root_1);

                adaptor.addChild(root_1, stream_single_type.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:81:29: ( where_clause )?
                if ( stream_where_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_where_clause.nextTree());

                }
                stream_where_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

    public static class where_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "where_clause"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:84:10: fragment where_clause : WHERE safe_expression ;
    public final OmttParser.where_clause_return where_clause() throws RecognitionException {
        OmttParser.where_clause_return retval = new OmttParser.where_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHERE43=null;
        OmttParser.safe_expression_return safe_expression44 = null;


        Object WHERE43_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:85:2: ( WHERE safe_expression )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:85:4: WHERE safe_expression
            {
            root_0 = (Object)adaptor.nil();

            WHERE43=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clause540); if (state.failed) return retval;
            pushFollow(FOLLOW_safe_expression_in_where_clause543);
            safe_expression44=safe_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, safe_expression44.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "where_clause"

    public static class definition_argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition_argument"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:88:10: fragment definition_argument : ( QUESTION_MARK )? id= VAR_ID ( OP_MULTIPLY )? ( DOT type )? -> ^( ARGUMENT IDENT[$id] ( type )? ( QUESTION_MARK )? ( OP_MULTIPLY )? ) ;
    public final OmttParser.definition_argument_return definition_argument() throws RecognitionException {
        OmttParser.definition_argument_return retval = new OmttParser.definition_argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        Token QUESTION_MARK45=null;
        Token OP_MULTIPLY46=null;
        Token DOT47=null;
        OmttParser.type_return type48 = null;


        Object id_tree=null;
        Object QUESTION_MARK45_tree=null;
        Object OP_MULTIPLY46_tree=null;
        Object DOT47_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_OP_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token OP_MULTIPLY");
        RewriteRuleTokenStream stream_QUESTION_MARK=new RewriteRuleTokenStream(adaptor,"token QUESTION_MARK");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:89:3: ( ( QUESTION_MARK )? id= VAR_ID ( OP_MULTIPLY )? ( DOT type )? -> ^( ARGUMENT IDENT[$id] ( type )? ( QUESTION_MARK )? ( OP_MULTIPLY )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:89:5: ( QUESTION_MARK )? id= VAR_ID ( OP_MULTIPLY )? ( DOT type )?
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:89:5: ( QUESTION_MARK )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==QUESTION_MARK) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: QUESTION_MARK
                    {
                    QUESTION_MARK45=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_definition_argument557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK45);


                    }
                    break;

            }

            id=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_argument562); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR_ID.add(id);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:89:30: ( OP_MULTIPLY )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==OP_MULTIPLY) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: OP_MULTIPLY
                    {
                    OP_MULTIPLY46=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_definition_argument564); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MULTIPLY.add(OP_MULTIPLY46);


                    }
                    break;

            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:89:43: ( DOT type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==DOT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:89:44: DOT type
                    {
                    DOT47=(Token)match(input,DOT,FOLLOW_DOT_in_definition_argument568); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT47);

                    pushFollow(FOLLOW_type_in_definition_argument570);
                    type48=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type48.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: QUESTION_MARK, OP_MULTIPLY, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 90:5: -> ^( ARGUMENT IDENT[$id] ( type )? ( QUESTION_MARK )? ( OP_MULTIPLY )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:90:8: ^( ARGUMENT IDENT[$id] ( type )? ( QUESTION_MARK )? ( OP_MULTIPLY )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TemplateArgument(ARGUMENT), root_1);

                adaptor.addChild(root_1, new Ident(IDENT, id));
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:90:55: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:90:61: ( QUESTION_MARK )?
                if ( stream_QUESTION_MARK.hasNext() ) {
                    adaptor.addChild(root_1, stream_QUESTION_MARK.nextNode());

                }
                stream_QUESTION_MARK.reset();
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:90:76: ( OP_MULTIPLY )?
                if ( stream_OP_MULTIPLY.hasNext() ) {
                    adaptor.addChild(root_1, stream_OP_MULTIPLY.nextNode());

                }
                stream_OP_MULTIPLY.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:96:1: tag_content : ( CONTENT ( data_body_atom )* -> ^( CONTENT ( data_body_atom )* ) | OP_DATA_IS_EXPRESSION CONTENT expression -> expression );
    public final OmttParser.tag_content_return tag_content() throws RecognitionException {
        OmttParser.tag_content_return retval = new OmttParser.tag_content_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONTENT49=null;
        Token OP_DATA_IS_EXPRESSION51=null;
        Token CONTENT52=null;
        OmttParser.data_body_atom_return data_body_atom50 = null;

        OmttParser.expression_return expression53 = null;


        Object CONTENT49_tree=null;
        Object OP_DATA_IS_EXPRESSION51_tree=null;
        Object CONTENT52_tree=null;
        RewriteRuleTokenStream stream_CONTENT=new RewriteRuleTokenStream(adaptor,"token CONTENT");
        RewriteRuleTokenStream stream_OP_DATA_IS_EXPRESSION=new RewriteRuleTokenStream(adaptor,"token OP_DATA_IS_EXPRESSION");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_data_body_atom=new RewriteRuleSubtreeStream(adaptor,"rule data_body_atom");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:97:3: ( CONTENT ( data_body_atom )* -> ^( CONTENT ( data_body_atom )* ) | OP_DATA_IS_EXPRESSION CONTENT expression -> expression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==CONTENT) ) {
                alt20=1;
            }
            else if ( (LA20_0==OP_DATA_IS_EXPRESSION) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:97:5: CONTENT ( data_body_atom )*
                    {
                    CONTENT49=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_tag_content616); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTENT.add(CONTENT49);

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:98:5: ( data_body_atom )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==TAG_START) ) {
                            int LA19_2 = input.LA(2);

                            if ( (LA19_2==DEF||LA19_2==IF||(LA19_2>=MAP && LA19_2<=APPLY)||LA19_2==OP_GENERAL||LA19_2==VAR_ID) ) {
                                alt19=1;
                            }


                        }
                        else if ( (LA19_0==STRING_LITERAL||LA19_0==EXPRESSION_START) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: data_body_atom
                    	    {
                    	    pushFollow(FOLLOW_data_body_atom_in_tag_content622);
                    	    data_body_atom50=data_body_atom();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_data_body_atom.add(data_body_atom50.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: data_body_atom, CONTENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 99:5: -> ^( CONTENT ( data_body_atom )* )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:99:8: ^( CONTENT ( data_body_atom )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Data(stream_CONTENT.nextToken()), root_1);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:99:24: ( data_body_atom )*
                        while ( stream_data_body_atom.hasNext() ) {
                            adaptor.addChild(root_1, stream_data_body_atom.nextTree());

                        }
                        stream_data_body_atom.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:100:5: OP_DATA_IS_EXPRESSION CONTENT expression
                    {
                    OP_DATA_IS_EXPRESSION51=(Token)match(input,OP_DATA_IS_EXPRESSION,FOLLOW_OP_DATA_IS_EXPRESSION_in_tag_content645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DATA_IS_EXPRESSION.add(OP_DATA_IS_EXPRESSION51);

                    CONTENT52=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_tag_content647); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTENT.add(CONTENT52);

                    pushFollow(FOLLOW_expression_in_tag_content653);
                    expression53=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression53.getTree());


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 102:5: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:105:1: data_body_atom : ( STRING_LITERAL | expression_inside_data | tag_inside_data );
    public final OmttParser.data_body_atom_return data_body_atom() throws RecognitionException {
        OmttParser.data_body_atom_return retval = new OmttParser.data_body_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING_LITERAL54=null;
        OmttParser.expression_inside_data_return expression_inside_data55 = null;

        OmttParser.tag_inside_data_return tag_inside_data56 = null;


        Object STRING_LITERAL54_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:106:3: ( STRING_LITERAL | expression_inside_data | tag_inside_data )
            int alt21=3;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
                {
                alt21=1;
                }
                break;
            case EXPRESSION_START:
                {
                alt21=2;
                }
                break;
            case TAG_START:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:106:5: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL54=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_data_body_atom674); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL54_tree = new Literal(STRING_LITERAL54) ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_LITERAL54_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:107:5: expression_inside_data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_inside_data_in_data_body_atom684);
                    expression_inside_data55=expression_inside_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_inside_data55.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:108:5: tag_inside_data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tag_inside_data_in_data_body_atom690);
                    tag_inside_data56=tag_inside_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tag_inside_data56.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:111:10: fragment expression_inside_data : EXPRESSION_START expression EXPRESSION_END ;
    public final OmttParser.expression_inside_data_return expression_inside_data() throws RecognitionException {
        OmttParser.expression_inside_data_return retval = new OmttParser.expression_inside_data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXPRESSION_START57=null;
        Token EXPRESSION_END59=null;
        OmttParser.expression_return expression58 = null;


        Object EXPRESSION_START57_tree=null;
        Object EXPRESSION_END59_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:112:3: ( EXPRESSION_START expression EXPRESSION_END )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:112:5: EXPRESSION_START expression EXPRESSION_END
            {
            root_0 = (Object)adaptor.nil();

            EXPRESSION_START57=(Token)match(input,EXPRESSION_START,FOLLOW_EXPRESSION_START_in_expression_inside_data705); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_expression_inside_data708);
            expression58=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression58.getTree());
            EXPRESSION_END59=(Token)match(input,EXPRESSION_END,FOLLOW_EXPRESSION_END_in_expression_inside_data710); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:115:10: fragment tag_inside_data : ( def_in_tag | if_tag | call_tag | map_tag | apply_tag );
    public final OmttParser.tag_inside_data_return tag_inside_data() throws RecognitionException {
        OmttParser.tag_inside_data_return retval = new OmttParser.tag_inside_data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.def_in_tag_return def_in_tag60 = null;

        OmttParser.if_tag_return if_tag61 = null;

        OmttParser.call_tag_return call_tag62 = null;

        OmttParser.map_tag_return map_tag63 = null;

        OmttParser.apply_tag_return apply_tag64 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:116:3: ( def_in_tag | if_tag | call_tag | map_tag | apply_tag )
            int alt22=5;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==TAG_START) ) {
                switch ( input.LA(2) ) {
                case DEF:
                    {
                    alt22=1;
                    }
                    break;
                case MAP:
                    {
                    alt22=4;
                    }
                    break;
                case APPLY:
                    {
                    alt22=5;
                    }
                    break;
                case IF:
                    {
                    alt22=2;
                    }
                    break;
                case OP_GENERAL:
                case VAR_ID:
                    {
                    alt22=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:116:5: def_in_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_def_in_tag_in_tag_inside_data726);
                    def_in_tag60=def_in_tag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, def_in_tag60.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:117:5: if_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_tag_in_tag_inside_data732);
                    if_tag61=if_tag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_tag61.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:118:5: call_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_tag_in_tag_inside_data738);
                    call_tag62=call_tag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call_tag62.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:119:5: map_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_tag_in_tag_inside_data744);
                    map_tag63=map_tag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_tag63.getTree());

                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:120:5: apply_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_apply_tag_in_tag_inside_data750);
                    apply_tag64=apply_tag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, apply_tag64.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:126:1: expression : ( def_in_expression | if_expression | map_expression | match_expression | function_expression | context_expression );
    public final OmttParser.expression_return expression() throws RecognitionException {
        OmttParser.expression_return retval = new OmttParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.def_in_expression_return def_in_expression65 = null;

        OmttParser.if_expression_return if_expression66 = null;

        OmttParser.map_expression_return map_expression67 = null;

        OmttParser.match_expression_return match_expression68 = null;

        OmttParser.function_expression_return function_expression69 = null;

        OmttParser.context_expression_return context_expression70 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:127:3: ( def_in_expression | if_expression | map_expression | match_expression | function_expression | context_expression )
            int alt23=6;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:127:5: def_in_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_def_in_expression_in_expression766);
                    def_in_expression65=def_in_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, def_in_expression65.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:128:5: if_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_expression_in_expression772);
                    if_expression66=if_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expression66.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:129:5: map_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_expression_in_expression778);
                    map_expression67=map_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_expression67.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:130:5: match_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_match_expression_in_expression784);
                    match_expression68=match_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, match_expression68.getTree());

                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:131:5: function_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_expression_in_expression790);
                    function_expression69=function_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_expression69.getTree());

                    }
                    break;
                case 6 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:132:5: context_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_context_expression_in_expression796);
                    context_expression70=context_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, context_expression70.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:135:1: safe_expression : ( safe_def_in_expression | safe_if_expression | safe_map_expression | strict_expression );
    public final OmttParser.safe_expression_return safe_expression() throws RecognitionException {
        OmttParser.safe_expression_return retval = new OmttParser.safe_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.safe_def_in_expression_return safe_def_in_expression71 = null;

        OmttParser.safe_if_expression_return safe_if_expression72 = null;

        OmttParser.safe_map_expression_return safe_map_expression73 = null;

        OmttParser.strict_expression_return strict_expression74 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:136:3: ( safe_def_in_expression | safe_if_expression | safe_map_expression | strict_expression )
            int alt24=4;
            switch ( input.LA(1) ) {
            case DEF:
                {
                alt24=1;
                }
                break;
            case IF:
                {
                alt24=2;
                }
                break;
            case MAP:
                {
                alt24=3;
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
            case LEFT_SQUARE_PAREN:
            case OP_MINUS:
            case OP_NOT:
            case OP_GENERAL:
            case VAR_ID:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:136:5: safe_def_in_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safe_def_in_expression_in_safe_expression809);
                    safe_def_in_expression71=safe_def_in_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safe_def_in_expression71.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:137:5: safe_if_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safe_if_expression_in_safe_expression815);
                    safe_if_expression72=safe_if_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safe_if_expression72.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:138:5: safe_map_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safe_map_expression_in_safe_expression821);
                    safe_map_expression73=safe_map_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safe_map_expression73.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:139:5: strict_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_strict_expression_in_safe_expression827);
                    strict_expression74=strict_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, strict_expression74.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:143:1: def_in_expression : DEF definition+= definition_inside_expression ( TOO definition+= definition_inside_expression )* IN ( COLON )? content= expression -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.def_in_expression_return def_in_expression() throws RecognitionException {
        OmttParser.def_in_expression_return retval = new OmttParser.def_in_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEF75=null;
        Token TOO76=null;
        Token IN77=null;
        Token COLON78=null;
        List list_definition=null;
        OmttParser.expression_return content = null;

        OmttParser.definition_inside_expression_return definition = null;
         definition = null;
        Object DEF75_tree=null;
        Object TOO76_tree=null;
        Object IN77_tree=null;
        Object COLON78_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_TOO=new RewriteRuleTokenStream(adaptor,"token TOO");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_inside_expression=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:144:3: ( DEF definition+= definition_inside_expression ( TOO definition+= definition_inside_expression )* IN ( COLON )? content= expression -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:144:5: DEF definition+= definition_inside_expression ( TOO definition+= definition_inside_expression )* IN ( COLON )? content= expression
            {
            DEF75=(Token)match(input,DEF,FOLLOW_DEF_in_def_in_expression841); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEF.add(DEF75);

            pushFollow(FOLLOW_definition_inside_expression_in_def_in_expression845);
            definition=definition_inside_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_definition_inside_expression.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:145:5: ( TOO definition+= definition_inside_expression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==TOO) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:145:6: TOO definition+= definition_inside_expression
            	    {
            	    TOO76=(Token)match(input,TOO,FOLLOW_TOO_in_def_in_expression852); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_TOO.add(TOO76);

            	    pushFollow(FOLLOW_definition_inside_expression_in_def_in_expression856);
            	    definition=definition_inside_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_definition_inside_expression.add(definition.getTree());
            	    if (list_definition==null) list_definition=new ArrayList();
            	    list_definition.add(definition.getTree());


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            IN77=(Token)match(input,IN,FOLLOW_IN_in_def_in_expression864); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IN.add(IN77);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:146:8: ( COLON )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==COLON) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: COLON
                    {
                    COLON78=(Token)match(input,COLON,FOLLOW_COLON_in_def_in_expression866); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON78);


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_def_in_expression871);
            content=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(content.getTree());


            // AST REWRITE
            // elements: definition, content
            // token labels: 
            // rule labels: content, retval
            // token list labels: 
            // rule list labels: definition
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"rule content",content!=null?content.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"token definition",list_definition);
            root_0 = (Object)adaptor.nil();
            // 147:5: -> ^( BLOCK ( $definition)+ $content)
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:147:8: ^( BLOCK ( $definition)+ $content)
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

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:149:1: safe_def_in_expression : DEF definition+= definition_inside_expression ( TOO definition+= definition_inside_expression )* IN ( COLON )? content= safe_expression -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.safe_def_in_expression_return safe_def_in_expression() throws RecognitionException {
        OmttParser.safe_def_in_expression_return retval = new OmttParser.safe_def_in_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEF79=null;
        Token TOO80=null;
        Token IN81=null;
        Token COLON82=null;
        List list_definition=null;
        OmttParser.safe_expression_return content = null;

        OmttParser.definition_inside_expression_return definition = null;
         definition = null;
        Object DEF79_tree=null;
        Object TOO80_tree=null;
        Object IN81_tree=null;
        Object COLON82_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_TOO=new RewriteRuleTokenStream(adaptor,"token TOO");
        RewriteRuleSubtreeStream stream_safe_expression=new RewriteRuleSubtreeStream(adaptor,"rule safe_expression");
        RewriteRuleSubtreeStream stream_definition_inside_expression=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:150:3: ( DEF definition+= definition_inside_expression ( TOO definition+= definition_inside_expression )* IN ( COLON )? content= safe_expression -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:150:5: DEF definition+= definition_inside_expression ( TOO definition+= definition_inside_expression )* IN ( COLON )? content= safe_expression
            {
            DEF79=(Token)match(input,DEF,FOLLOW_DEF_in_safe_def_in_expression903); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEF.add(DEF79);

            pushFollow(FOLLOW_definition_inside_expression_in_safe_def_in_expression907);
            definition=definition_inside_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_definition_inside_expression.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:151:5: ( TOO definition+= definition_inside_expression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==TOO) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:151:6: TOO definition+= definition_inside_expression
            	    {
            	    TOO80=(Token)match(input,TOO,FOLLOW_TOO_in_safe_def_in_expression914); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_TOO.add(TOO80);

            	    pushFollow(FOLLOW_definition_inside_expression_in_safe_def_in_expression918);
            	    definition=definition_inside_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_definition_inside_expression.add(definition.getTree());
            	    if (list_definition==null) list_definition=new ArrayList();
            	    list_definition.add(definition.getTree());


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            IN81=(Token)match(input,IN,FOLLOW_IN_in_safe_def_in_expression926); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IN.add(IN81);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:152:8: ( COLON )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==COLON) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: COLON
                    {
                    COLON82=(Token)match(input,COLON,FOLLOW_COLON_in_safe_def_in_expression928); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON82);


                    }
                    break;

            }

            pushFollow(FOLLOW_safe_expression_in_safe_def_in_expression933);
            content=safe_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_safe_expression.add(content.getTree());


            // AST REWRITE
            // elements: definition, content
            // token labels: 
            // rule labels: content, retval
            // token list labels: 
            // rule list labels: definition
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"rule content",content!=null?content.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"token definition",list_definition);
            root_0 = (Object)adaptor.nil();
            // 153:5: -> ^( BLOCK ( $definition)+ $content)
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:153:8: ^( BLOCK ( $definition)+ $content)
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

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:155:1: definition_inside_expression : ( definition_signature COLON expression -> ^( DEF definition_signature expression ) | VAR_ID OP_ASSIGN expression -> ^( DEF VAR_ID expression ) );
    public final OmttParser.definition_inside_expression_return definition_inside_expression() throws RecognitionException {
        OmttParser.definition_inside_expression_return retval = new OmttParser.definition_inside_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON84=null;
        Token VAR_ID86=null;
        Token OP_ASSIGN87=null;
        OmttParser.definition_signature_return definition_signature83 = null;

        OmttParser.expression_return expression85 = null;

        OmttParser.expression_return expression88 = null;


        Object COLON84_tree=null;
        Object VAR_ID86_tree=null;
        Object OP_ASSIGN87_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_signature=new RewriteRuleSubtreeStream(adaptor,"rule definition_signature");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:156:3: ( definition_signature COLON expression -> ^( DEF definition_signature expression ) | VAR_ID OP_ASSIGN expression -> ^( DEF VAR_ID expression ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==PARTIAL) ) {
                alt29=1;
            }
            else if ( (LA29_0==VAR_ID) ) {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==OP_ASSIGN) ) {
                    alt29=2;
                }
                else if ( (LA29_2==OP_FOLLOW||LA29_2==COLON||LA29_2==QUESTION_MARK||LA29_2==LEFT_SQUARE_PAREN||LA29_2==VAR_ID) ) {
                    alt29=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:156:5: definition_signature COLON expression
                    {
                    pushFollow(FOLLOW_definition_signature_in_definition_inside_expression965);
                    definition_signature83=definition_signature();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_definition_signature.add(definition_signature83.getTree());
                    COLON84=(Token)match(input,COLON,FOLLOW_COLON_in_definition_inside_expression967); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON84);

                    pushFollow(FOLLOW_expression_in_definition_inside_expression973);
                    expression85=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression85.getTree());


                    // AST REWRITE
                    // elements: expression, definition_signature
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:5: -> ^( DEF definition_signature expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:158:8: ^( DEF definition_signature expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new TemplateDefinition(DEF), root_1);

                        adaptor.addChild(root_1, stream_definition_signature.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:159:5: VAR_ID OP_ASSIGN expression
                    {
                    VAR_ID86=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_inside_expression996); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID86);

                    OP_ASSIGN87=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_inside_expression998); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_ASSIGN.add(OP_ASSIGN87);

                    pushFollow(FOLLOW_expression_in_definition_inside_expression1003);
                    expression88=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression88.getTree());


                    // AST REWRITE
                    // elements: VAR_ID, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 161:5: -> ^( DEF VAR_ID expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:161:8: ^( DEF VAR_ID expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new TemplateDefinition(DEF), root_1);

                        adaptor.addChild(root_1, new Ident(stream_VAR_ID.nextToken()));
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:164:1: def_in_tag : TAG_START DEF definition+= definition_inside_tag ( TAG_START TOO definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.def_in_tag_return def_in_tag() throws RecognitionException {
        OmttParser.def_in_tag_return retval = new OmttParser.def_in_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START89=null;
        Token DEF90=null;
        Token TAG_START91=null;
        Token TOO92=null;
        Token TAG_START93=null;
        Token IN94=null;
        Token TAG_END95=null;
        List list_definition=null;
        OmttParser.tag_content_return content = null;

        OmttParser.definition_inside_tag_return definition = null;
         definition = null;
        Object TAG_START89_tree=null;
        Object DEF90_tree=null;
        Object TAG_START91_tree=null;
        Object TOO92_tree=null;
        Object TAG_START93_tree=null;
        Object IN94_tree=null;
        Object TAG_END95_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_TOO=new RewriteRuleTokenStream(adaptor,"token TOO");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_definition_inside_tag=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_tag");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:165:3: ( TAG_START DEF definition+= definition_inside_tag ( TAG_START TOO definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:165:5: TAG_START DEF definition+= definition_inside_tag ( TAG_START TOO definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END
            {
            TAG_START89=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag1036); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START89);

            DEF90=(Token)match(input,DEF,FOLLOW_DEF_in_def_in_tag1038); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEF.add(DEF90);

            pushFollow(FOLLOW_definition_inside_tag_in_def_in_tag1042);
            definition=definition_inside_tag();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_definition_inside_tag.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:166:5: ( TAG_START TOO definition+= definition_inside_tag )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==TAG_START) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==TOO) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:166:6: TAG_START TOO definition+= definition_inside_tag
            	    {
            	    TAG_START91=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag1049); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START91);

            	    TOO92=(Token)match(input,TOO,FOLLOW_TOO_in_def_in_tag1051); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_TOO.add(TOO92);

            	    pushFollow(FOLLOW_definition_inside_tag_in_def_in_tag1055);
            	    definition=definition_inside_tag();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_definition_inside_tag.add(definition.getTree());
            	    if (list_definition==null) list_definition=new ArrayList();
            	    list_definition.add(definition.getTree());


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            TAG_START93=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag1063); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START93);

            IN94=(Token)match(input,IN,FOLLOW_IN_in_def_in_tag1065); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IN.add(IN94);

            pushFollow(FOLLOW_tag_content_in_def_in_tag1069);
            content=tag_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tag_content.add(content.getTree());
            TAG_END95=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_def_in_tag1075); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_END.add(TAG_END95);



            // AST REWRITE
            // elements: definition, content
            // token labels: 
            // rule labels: content, retval
            // token list labels: 
            // rule list labels: definition
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"rule content",content!=null?content.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"token definition",list_definition);
            root_0 = (Object)adaptor.nil();
            // 169:5: -> ^( BLOCK ( $definition)+ $content)
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:169:8: ^( BLOCK ( $definition)+ $content)
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

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:171:1: definition_inside_tag : ( definition_signature content= tag_content -> ^( DEF definition_signature $content) | VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )? -> ^( DEF VAR_ID expression ) );
    public final OmttParser.definition_inside_tag_return definition_inside_tag() throws RecognitionException {
        OmttParser.definition_inside_tag_return retval = new OmttParser.definition_inside_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID97=null;
        Token OP_ASSIGN98=null;
        Token CONTENT100=null;
        Token STRING_LITERAL101=null;
        OmttParser.tag_content_return content = null;

        OmttParser.definition_signature_return definition_signature96 = null;

        OmttParser.expression_return expression99 = null;


        Object VAR_ID97_tree=null;
        Object OP_ASSIGN98_tree=null;
        Object CONTENT100_tree=null;
        Object STRING_LITERAL101_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_CONTENT=new RewriteRuleTokenStream(adaptor,"token CONTENT");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_signature=new RewriteRuleSubtreeStream(adaptor,"rule definition_signature");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:172:3: ( definition_signature content= tag_content -> ^( DEF definition_signature $content) | VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )? -> ^( DEF VAR_ID expression ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==PARTIAL) ) {
                alt33=1;
            }
            else if ( (LA33_0==VAR_ID) ) {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==OP_ASSIGN) ) {
                    alt33=2;
                }
                else if ( (LA33_2==CONTENT||LA33_2==OP_DATA_IS_EXPRESSION||LA33_2==OP_FOLLOW||LA33_2==QUESTION_MARK||LA33_2==LEFT_SQUARE_PAREN||LA33_2==VAR_ID) ) {
                    alt33=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:172:5: definition_signature content= tag_content
                    {
                    pushFollow(FOLLOW_definition_signature_in_definition_inside_tag1107);
                    definition_signature96=definition_signature();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_definition_signature.add(definition_signature96.getTree());
                    pushFollow(FOLLOW_tag_content_in_definition_inside_tag1111);
                    content=tag_content();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tag_content.add(content.getTree());


                    // AST REWRITE
                    // elements: content, definition_signature
                    // token labels: 
                    // rule labels: content, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"rule content",content!=null?content.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 173:5: -> ^( DEF definition_signature $content)
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:173:8: ^( DEF definition_signature $content)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new TemplateDefinition(DEF), root_1);

                        adaptor.addChild(root_1, stream_definition_signature.nextTree());
                        adaptor.addChild(root_1, stream_content.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:174:5: VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )?
                    {
                    VAR_ID97=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_inside_tag1135); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID97);

                    OP_ASSIGN98=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_inside_tag1137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_ASSIGN.add(OP_ASSIGN98);

                    pushFollow(FOLLOW_expression_in_definition_inside_tag1139);
                    expression99=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression99.getTree());
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:174:33: ( CONTENT ( STRING_LITERAL )? )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==CONTENT) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:174:34: CONTENT ( STRING_LITERAL )?
                            {
                            CONTENT100=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_definition_inside_tag1142); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_CONTENT.add(CONTENT100);

                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:174:42: ( STRING_LITERAL )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==STRING_LITERAL) ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: STRING_LITERAL
                                    {
                                    STRING_LITERAL101=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_definition_inside_tag1144); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL101);


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
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 175:5: -> ^( DEF VAR_ID expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:175:8: ^( DEF VAR_ID expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new TemplateDefinition(DEF), root_1);

                        adaptor.addChild(root_1, new Ident(stream_VAR_ID.nextToken()));
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

    public static class function_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_expression"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:181:1: function_expression : ( FUN ( definition_argument )* COLON expression -> ^( FUN ^( ARGUMENTS ( definition_argument )* ) expression ) | ( definition_argument )* OP_FOLLOW expression -> ^( FUN ^( ARGUMENTS ( definition_argument )* ) expression ) | lambda_match_expression );
    public final OmttParser.function_expression_return function_expression() throws RecognitionException {
        OmttParser.function_expression_return retval = new OmttParser.function_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUN102=null;
        Token COLON104=null;
        Token OP_FOLLOW107=null;
        OmttParser.definition_argument_return definition_argument103 = null;

        OmttParser.expression_return expression105 = null;

        OmttParser.definition_argument_return definition_argument106 = null;

        OmttParser.expression_return expression108 = null;

        OmttParser.lambda_match_expression_return lambda_match_expression109 = null;


        Object FUN102_tree=null;
        Object COLON104_tree=null;
        Object OP_FOLLOW107_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_OP_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_FOLLOW");
        RewriteRuleTokenStream stream_FUN=new RewriteRuleTokenStream(adaptor,"token FUN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_argument=new RewriteRuleSubtreeStream(adaptor,"rule definition_argument");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:182:3: ( FUN ( definition_argument )* COLON expression -> ^( FUN ^( ARGUMENTS ( definition_argument )* ) expression ) | ( definition_argument )* OP_FOLLOW expression -> ^( FUN ^( ARGUMENTS ( definition_argument )* ) expression ) | lambda_match_expression )
            int alt36=3;
            switch ( input.LA(1) ) {
            case FUN:
                {
                alt36=1;
                }
                break;
            case OP_FOLLOW:
            case QUESTION_MARK:
            case VAR_ID:
                {
                alt36=2;
                }
                break;
            case LEFT_PAREN:
            case LEFT_SQUARE_PAREN:
            case OP_GENERAL:
            case CLASS_ID:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:182:5: FUN ( definition_argument )* COLON expression
                    {
                    FUN102=(Token)match(input,FUN,FOLLOW_FUN_in_function_expression1183); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUN.add(FUN102);

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:182:9: ( definition_argument )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==QUESTION_MARK||LA34_0==VAR_ID) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_function_expression1185);
                    	    definition_argument103=definition_argument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_definition_argument.add(definition_argument103.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    COLON104=(Token)match(input,COLON,FOLLOW_COLON_in_function_expression1188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON104);

                    pushFollow(FOLLOW_expression_in_function_expression1190);
                    expression105=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression105.getTree());


                    // AST REWRITE
                    // elements: expression, definition_argument, FUN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:5: -> ^( FUN ^( ARGUMENTS ( definition_argument )* ) expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:183:8: ^( FUN ^( ARGUMENTS ( definition_argument )* ) expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunExpression(stream_FUN.nextToken()), root_1);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:183:29: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:183:41: ( definition_argument )*
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

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:184:5: ( definition_argument )* OP_FOLLOW expression
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:184:5: ( definition_argument )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==QUESTION_MARK||LA35_0==VAR_ID) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_function_expression1218);
                    	    definition_argument106=definition_argument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_definition_argument.add(definition_argument106.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    OP_FOLLOW107=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_function_expression1221); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_FOLLOW.add(OP_FOLLOW107);

                    pushFollow(FOLLOW_expression_in_function_expression1223);
                    expression108=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression108.getTree());


                    // AST REWRITE
                    // elements: definition_argument, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 185:4: -> ^( FUN ^( ARGUMENTS ( definition_argument )* ) expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:185:7: ^( FUN ^( ARGUMENTS ( definition_argument )* ) expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunExpression(FUN), root_1);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:185:28: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:185:40: ( definition_argument )*
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

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:186:5: lambda_match_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lambda_match_expression_in_function_expression1250);
                    lambda_match_expression109=lambda_match_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_match_expression109.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_expression"

    public static class lambda_match_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lambda_match_expression"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:188:10: fragment lambda_match_expression : single_lambda_match ( SEMICOLON single_lambda_match )* -> ^( LAMBDA_MATCH ( single_lambda_match )+ ) ;
    public final OmttParser.lambda_match_expression_return lambda_match_expression() throws RecognitionException {
        OmttParser.lambda_match_expression_return retval = new OmttParser.lambda_match_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON111=null;
        OmttParser.single_lambda_match_return single_lambda_match110 = null;

        OmttParser.single_lambda_match_return single_lambda_match112 = null;


        Object SEMICOLON111_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_single_lambda_match=new RewriteRuleSubtreeStream(adaptor,"rule single_lambda_match");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:2: ( single_lambda_match ( SEMICOLON single_lambda_match )* -> ^( LAMBDA_MATCH ( single_lambda_match )+ ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:4: single_lambda_match ( SEMICOLON single_lambda_match )*
            {
            pushFollow(FOLLOW_single_lambda_match_in_lambda_match_expression1263);
            single_lambda_match110=single_lambda_match();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_single_lambda_match.add(single_lambda_match110.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:24: ( SEMICOLON single_lambda_match )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==SEMICOLON) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:25: SEMICOLON single_lambda_match
            	    {
            	    SEMICOLON111=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_lambda_match_expression1266); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON111);

            	    pushFollow(FOLLOW_single_lambda_match_in_lambda_match_expression1268);
            	    single_lambda_match112=single_lambda_match();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_single_lambda_match.add(single_lambda_match112.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);



            // AST REWRITE
            // elements: single_lambda_match
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 190:3: -> ^( LAMBDA_MATCH ( single_lambda_match )+ )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:190:6: ^( LAMBDA_MATCH ( single_lambda_match )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new LambdaMatch(LAMBDA_MATCH), root_1);

                if ( !(stream_single_lambda_match.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_single_lambda_match.hasNext() ) {
                    adaptor.addChild(root_1, stream_single_lambda_match.nextTree());

                }
                stream_single_lambda_match.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:192:10: fragment single_lambda_match : single_type ( where_clause )? OP_FOLLOW safe_expression -> ^( ITEM single_type safe_expression ( where_clause )? ) ;
    public final OmttParser.single_lambda_match_return single_lambda_match() throws RecognitionException {
        OmttParser.single_lambda_match_return retval = new OmttParser.single_lambda_match_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_FOLLOW115=null;
        OmttParser.single_type_return single_type113 = null;

        OmttParser.where_clause_return where_clause114 = null;

        OmttParser.safe_expression_return safe_expression116 = null;


        Object OP_FOLLOW115_tree=null;
        RewriteRuleTokenStream stream_OP_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_FOLLOW");
        RewriteRuleSubtreeStream stream_safe_expression=new RewriteRuleSubtreeStream(adaptor,"rule safe_expression");
        RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:193:2: ( single_type ( where_clause )? OP_FOLLOW safe_expression -> ^( ITEM single_type safe_expression ( where_clause )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:193:4: single_type ( where_clause )? OP_FOLLOW safe_expression
            {
            pushFollow(FOLLOW_single_type_in_single_lambda_match1296);
            single_type113=single_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_single_type.add(single_type113.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:193:16: ( where_clause )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==WHERE) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_single_lambda_match1298);
                    where_clause114=where_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_where_clause.add(where_clause114.getTree());

                    }
                    break;

            }

            OP_FOLLOW115=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_single_lambda_match1301); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_FOLLOW.add(OP_FOLLOW115);

            pushFollow(FOLLOW_safe_expression_in_single_lambda_match1303);
            safe_expression116=safe_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_safe_expression.add(safe_expression116.getTree());


            // AST REWRITE
            // elements: single_type, where_clause, safe_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 194:3: -> ^( ITEM single_type safe_expression ( where_clause )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:194:6: ^( ITEM single_type safe_expression ( where_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new LambdaMatchItem(ITEM), root_1);

                adaptor.addChild(root_1, stream_single_type.nextTree());
                adaptor.addChild(root_1, stream_safe_expression.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:194:58: ( where_clause )?
                if ( stream_where_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_where_clause.nextTree());

                }
                stream_where_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:197:1: type : type_content ( OP_MULTIPLY )? -> ^( TYPE type_content ( OP_MULTIPLY )? ) ;
    public final OmttParser.type_return type() throws RecognitionException {
        OmttParser.type_return retval = new OmttParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MULTIPLY118=null;
        OmttParser.type_content_return type_content117 = null;


        Object OP_MULTIPLY118_tree=null;
        RewriteRuleTokenStream stream_OP_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token OP_MULTIPLY");
        RewriteRuleSubtreeStream stream_type_content=new RewriteRuleSubtreeStream(adaptor,"rule type_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:198:3: ( type_content ( OP_MULTIPLY )? -> ^( TYPE type_content ( OP_MULTIPLY )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:198:5: type_content ( OP_MULTIPLY )?
            {
            pushFollow(FOLLOW_type_content_in_type1333);
            type_content117=type_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_content.add(type_content117.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:198:18: ( OP_MULTIPLY )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==OP_MULTIPLY) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: OP_MULTIPLY
                    {
                    OP_MULTIPLY118=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_type1335); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MULTIPLY.add(OP_MULTIPLY118);


                    }
                    break;

            }



            // AST REWRITE
            // elements: OP_MULTIPLY, type_content
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 199:4: -> ^( TYPE type_content ( OP_MULTIPLY )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:199:7: ^( TYPE type_content ( OP_MULTIPLY )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TypeReference(TYPE), root_1);

                adaptor.addChild(root_1, stream_type_content.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:199:42: ( OP_MULTIPLY )?
                if ( stream_OP_MULTIPLY.hasNext() ) {
                    adaptor.addChild(root_1, stream_OP_MULTIPLY.nextNode());

                }
                stream_OP_MULTIPLY.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:201:1: single_type : type_content -> ^( TYPE type_content ) ;
    public final OmttParser.single_type_return single_type() throws RecognitionException {
        OmttParser.single_type_return retval = new OmttParser.single_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.type_content_return type_content119 = null;


        RewriteRuleSubtreeStream stream_type_content=new RewriteRuleSubtreeStream(adaptor,"rule type_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:202:3: ( type_content -> ^( TYPE type_content ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:202:5: type_content
            {
            pushFollow(FOLLOW_type_content_in_single_type1365);
            type_content119=type_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_content.add(type_content119.getTree());


            // AST REWRITE
            // elements: type_content
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 203:4: -> ^( TYPE type_content )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:203:7: ^( TYPE type_content )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TypeReference(TYPE), root_1);

                adaptor.addChild(root_1, stream_type_content.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

    public static class type_content_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_content"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:206:10: fragment type_content : ( CLASS_ID | OP_GENERAL | LEFT_PAREN ( argument_type )+ OP_FOLLOW type RIGHT_PAREN -> ^( FUNCTION type ( argument_type )+ ) | LEFT_SQUARE_PAREN tuple_types+= type ( COMMA tuple_types+= type )+ RIGHT_SQUARE_PAREN -> ^( TUPLE ( $tuple_types)* ) | LEFT_SQUARE_PAREN record_types+= record_item_type ( COMMA record_types+= record_item_type )* RIGHT_SQUARE_PAREN -> ^( RECORD ( $record_types)* ) );
    public final OmttParser.type_content_return type_content() throws RecognitionException {
        OmttParser.type_content_return retval = new OmttParser.type_content_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS_ID120=null;
        Token OP_GENERAL121=null;
        Token LEFT_PAREN122=null;
        Token OP_FOLLOW124=null;
        Token RIGHT_PAREN126=null;
        Token LEFT_SQUARE_PAREN127=null;
        Token COMMA128=null;
        Token RIGHT_SQUARE_PAREN129=null;
        Token LEFT_SQUARE_PAREN130=null;
        Token COMMA131=null;
        Token RIGHT_SQUARE_PAREN132=null;
        List list_tuple_types=null;
        List list_record_types=null;
        OmttParser.argument_type_return argument_type123 = null;

        OmttParser.type_return type125 = null;

        OmttParser.type_return tuple_types = null;
         tuple_types = null;
        OmttParser.record_item_type_return record_types = null;
         record_types = null;
        Object CLASS_ID120_tree=null;
        Object OP_GENERAL121_tree=null;
        Object LEFT_PAREN122_tree=null;
        Object OP_FOLLOW124_tree=null;
        Object RIGHT_PAREN126_tree=null;
        Object LEFT_SQUARE_PAREN127_tree=null;
        Object COMMA128_tree=null;
        Object RIGHT_SQUARE_PAREN129_tree=null;
        Object LEFT_SQUARE_PAREN130_tree=null;
        Object COMMA131_tree=null;
        Object RIGHT_SQUARE_PAREN132_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_OP_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_FOLLOW");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_argument_type=new RewriteRuleSubtreeStream(adaptor,"rule argument_type");
        RewriteRuleSubtreeStream stream_record_item_type=new RewriteRuleSubtreeStream(adaptor,"rule record_item_type");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:207:3: ( CLASS_ID | OP_GENERAL | LEFT_PAREN ( argument_type )+ OP_FOLLOW type RIGHT_PAREN -> ^( FUNCTION type ( argument_type )+ ) | LEFT_SQUARE_PAREN tuple_types+= type ( COMMA tuple_types+= type )+ RIGHT_SQUARE_PAREN -> ^( TUPLE ( $tuple_types)* ) | LEFT_SQUARE_PAREN record_types+= record_item_type ( COMMA record_types+= record_item_type )* RIGHT_SQUARE_PAREN -> ^( RECORD ( $record_types)* ) )
            int alt43=5;
            switch ( input.LA(1) ) {
            case CLASS_ID:
                {
                alt43=1;
                }
                break;
            case OP_GENERAL:
                {
                alt43=2;
                }
                break;
            case LEFT_PAREN:
                {
                alt43=3;
                }
                break;
            case LEFT_SQUARE_PAREN:
                {
                int LA43_4 = input.LA(2);

                if ( (LA43_4==LEFT_PAREN||LA43_4==LEFT_SQUARE_PAREN||LA43_4==OP_GENERAL||LA43_4==CLASS_ID) ) {
                    alt43=4;
                }
                else if ( (LA43_4==VAR_ID) ) {
                    alt43=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:207:5: CLASS_ID
                    {
                    root_0 = (Object)adaptor.nil();

                    CLASS_ID120=(Token)match(input,CLASS_ID,FOLLOW_CLASS_ID_in_type_content1394); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLASS_ID120_tree = (Object)adaptor.create(CLASS_ID120);
                    adaptor.addChild(root_0, CLASS_ID120_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:208:5: OP_GENERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GENERAL121=(Token)match(input,OP_GENERAL,FOLLOW_OP_GENERAL_in_type_content1400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_GENERAL121_tree = (Object)adaptor.create(OP_GENERAL121);
                    adaptor.addChild(root_0, OP_GENERAL121_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:209:5: LEFT_PAREN ( argument_type )+ OP_FOLLOW type RIGHT_PAREN
                    {
                    LEFT_PAREN122=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_type_content1406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN122);

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:209:16: ( argument_type )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( ((LA40_0>=QUESTION_MARK && LA40_0<=LEFT_PAREN)||LA40_0==LEFT_SQUARE_PAREN||LA40_0==OP_GENERAL||LA40_0==VAR_ID||LA40_0==CLASS_ID) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: argument_type
                    	    {
                    	    pushFollow(FOLLOW_argument_type_in_type_content1408);
                    	    argument_type123=argument_type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_argument_type.add(argument_type123.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt40 >= 1 ) break loop40;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
                    } while (true);

                    OP_FOLLOW124=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_type_content1411); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_FOLLOW.add(OP_FOLLOW124);

                    pushFollow(FOLLOW_type_in_type_content1413);
                    type125=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type125.getTree());
                    RIGHT_PAREN126=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_type_content1415); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN126);



                    // AST REWRITE
                    // elements: argument_type, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 210:4: -> ^( FUNCTION type ( argument_type )+ )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:210:7: ^( FUNCTION type ( argument_type )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        if ( !(stream_argument_type.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_argument_type.hasNext() ) {
                            adaptor.addChild(root_1, stream_argument_type.nextTree());

                        }
                        stream_argument_type.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:211:5: LEFT_SQUARE_PAREN tuple_types+= type ( COMMA tuple_types+= type )+ RIGHT_SQUARE_PAREN
                    {
                    LEFT_SQUARE_PAREN127=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_type_content1435); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN127);

                    pushFollow(FOLLOW_type_in_type_content1439);
                    tuple_types=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(tuple_types.getTree());
                    if (list_tuple_types==null) list_tuple_types=new ArrayList();
                    list_tuple_types.add(tuple_types.getTree());

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:211:41: ( COMMA tuple_types+= type )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==COMMA) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:211:42: COMMA tuple_types+= type
                    	    {
                    	    COMMA128=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_content1442); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA128);

                    	    pushFollow(FOLLOW_type_in_type_content1446);
                    	    tuple_types=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_type.add(tuple_types.getTree());
                    	    if (list_tuple_types==null) list_tuple_types=new ArrayList();
                    	    list_tuple_types.add(tuple_types.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);

                    RIGHT_SQUARE_PAREN129=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_type_content1450); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN129);

                    if ( state.backtracking==0 ) {
                      reportNotImplemented("tuples");
                    }


                    // AST REWRITE
                    // elements: tuple_types
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: tuple_types
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_tuple_types=new RewriteRuleSubtreeStream(adaptor,"token tuple_types",list_tuple_types);
                    root_0 = (Object)adaptor.nil();
                    // 213:4: -> ^( TUPLE ( $tuple_types)* )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:213:7: ^( TUPLE ( $tuple_types)* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TUPLE, "TUPLE"), root_1);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:213:15: ( $tuple_types)*
                        while ( stream_tuple_types.hasNext() ) {
                            adaptor.addChild(root_1, stream_tuple_types.nextTree());

                        }
                        stream_tuple_types.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:5: LEFT_SQUARE_PAREN record_types+= record_item_type ( COMMA record_types+= record_item_type )* RIGHT_SQUARE_PAREN
                    {
                    LEFT_SQUARE_PAREN130=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_type_content1473); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN130);

                    pushFollow(FOLLOW_record_item_type_in_type_content1477);
                    record_types=record_item_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_record_item_type.add(record_types.getTree());
                    if (list_record_types==null) list_record_types=new ArrayList();
                    list_record_types.add(record_types.getTree());

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:54: ( COMMA record_types+= record_item_type )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==COMMA) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:55: COMMA record_types+= record_item_type
                    	    {
                    	    COMMA131=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_content1480); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA131);

                    	    pushFollow(FOLLOW_record_item_type_in_type_content1484);
                    	    record_types=record_item_type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_record_item_type.add(record_types.getTree());
                    	    if (list_record_types==null) list_record_types=new ArrayList();
                    	    list_record_types.add(record_types.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    RIGHT_SQUARE_PAREN132=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_type_content1488); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN132);

                    if ( state.backtracking==0 ) {
                      reportNotImplemented("records");
                    }


                    // AST REWRITE
                    // elements: record_types
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: record_types
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_record_types=new RewriteRuleSubtreeStream(adaptor,"token record_types",list_record_types);
                    root_0 = (Object)adaptor.nil();
                    // 216:4: -> ^( RECORD ( $record_types)* )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:216:7: ^( RECORD ( $record_types)* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RECORD, "RECORD"), root_1);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:216:16: ( $record_types)*
                        while ( stream_record_types.hasNext() ) {
                            adaptor.addChild(root_1, stream_record_types.nextTree());

                        }
                        stream_record_types.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_content"

    public static class argument_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argument_type"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:218:10: fragment argument_type : ( QUESTION_MARK )? ( VAR_ID DOT )? type -> ^( ARGUMENT type ( VAR_ID )? ( QUESTION_MARK )? ) ;
    public final OmttParser.argument_type_return argument_type() throws RecognitionException {
        OmttParser.argument_type_return retval = new OmttParser.argument_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUESTION_MARK133=null;
        Token VAR_ID134=null;
        Token DOT135=null;
        OmttParser.type_return type136 = null;


        Object QUESTION_MARK133_tree=null;
        Object VAR_ID134_tree=null;
        Object DOT135_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_QUESTION_MARK=new RewriteRuleTokenStream(adaptor,"token QUESTION_MARK");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:219:2: ( ( QUESTION_MARK )? ( VAR_ID DOT )? type -> ^( ARGUMENT type ( VAR_ID )? ( QUESTION_MARK )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:219:4: ( QUESTION_MARK )? ( VAR_ID DOT )? type
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:219:4: ( QUESTION_MARK )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==QUESTION_MARK) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: QUESTION_MARK
                    {
                    QUESTION_MARK133=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_argument_type1517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK133);


                    }
                    break;

            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:219:19: ( VAR_ID DOT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==VAR_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:219:20: VAR_ID DOT
                    {
                    VAR_ID134=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_argument_type1521); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID134);

                    DOT135=(Token)match(input,DOT,FOLLOW_DOT_in_argument_type1523); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT135);


                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_argument_type1527);
            type136=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type136.getTree());


            // AST REWRITE
            // elements: type, VAR_ID, QUESTION_MARK
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 220:3: -> ^( ARGUMENT type ( VAR_ID )? ( QUESTION_MARK )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:220:6: ^( ARGUMENT type ( VAR_ID )? ( QUESTION_MARK )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENT, "ARGUMENT"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:220:22: ( VAR_ID )?
                if ( stream_VAR_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_VAR_ID.nextNode());

                }
                stream_VAR_ID.reset();
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:220:30: ( QUESTION_MARK )?
                if ( stream_QUESTION_MARK.hasNext() ) {
                    adaptor.addChild(root_1, stream_QUESTION_MARK.nextNode());

                }
                stream_QUESTION_MARK.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argument_type"

    public static class record_item_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "record_item_type"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:222:10: fragment record_item_type : VAR_ID DOT type ;
    public final OmttParser.record_item_type_return record_item_type() throws RecognitionException {
        OmttParser.record_item_type_return retval = new OmttParser.record_item_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID137=null;
        Token DOT138=null;
        OmttParser.type_return type139 = null;


        Object VAR_ID137_tree=null;
        Object DOT138_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:223:2: ( VAR_ID DOT type )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:223:4: VAR_ID DOT type
            {
            root_0 = (Object)adaptor.nil();

            VAR_ID137=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_record_item_type1555); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR_ID137_tree = (Object)adaptor.create(VAR_ID137);
            adaptor.addChild(root_0, VAR_ID137_tree);
            }
            DOT138=(Token)match(input,DOT,FOLLOW_DOT_in_record_item_type1557); if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_record_item_type1560);
            type139=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type139.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "record_item_type"

    public static class if_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_expression"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:229:1: if_expression : IF condition= context_expression COLON part_if= expression ELSE ( COLON )? part_else= expression -> ^( IF_ELSE $condition $part_if $part_else) ;
    public final OmttParser.if_expression_return if_expression() throws RecognitionException {
        OmttParser.if_expression_return retval = new OmttParser.if_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF140=null;
        Token COLON141=null;
        Token ELSE142=null;
        Token COLON143=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.expression_return part_if = null;

        OmttParser.expression_return part_else = null;


        Object IF140_tree=null;
        Object COLON141_tree=null;
        Object ELSE142_tree=null;
        Object COLON143_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:230:3: ( IF condition= context_expression COLON part_if= expression ELSE ( COLON )? part_else= expression -> ^( IF_ELSE $condition $part_if $part_else) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:230:5: IF condition= context_expression COLON part_if= expression ELSE ( COLON )? part_else= expression
            {
            IF140=(Token)match(input,IF,FOLLOW_IF_in_if_expression1575); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF140);

            pushFollow(FOLLOW_context_expression_in_if_expression1579);
            condition=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(condition.getTree());
            COLON141=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1581); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON141);

            pushFollow(FOLLOW_expression_in_if_expression1589);
            part_if=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(part_if.getTree());
            ELSE142=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_expression1595); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(ELSE142);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:232:10: ( COLON )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==COLON) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: COLON
                    {
                    COLON143=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1597); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON143);


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_if_expression1606);
            part_else=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(part_else.getTree());


            // AST REWRITE
            // elements: part_if, part_else, condition
            // token labels: 
            // rule labels: retval, part_else, condition, part_if
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_part_else=new RewriteRuleSubtreeStream(adaptor,"rule part_else",part_else!=null?part_else.tree:null);
            RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition",condition!=null?condition.tree:null);
            RewriteRuleSubtreeStream stream_part_if=new RewriteRuleSubtreeStream(adaptor,"rule part_if",part_if!=null?part_if.tree:null);

            root_0 = (Object)adaptor.nil();
            // 234:5: -> ^( IF_ELSE $condition $part_if $part_else)
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:234:8: ^( IF_ELSE $condition $part_if $part_else)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new IfElse(IF_ELSE), root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());
                adaptor.addChild(root_1, stream_part_if.nextTree());
                adaptor.addChild(root_1, stream_part_else.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:236:1: safe_if_expression : IF condition= context_expression COLON part_if= safe_expression ELSE ( COLON )? part_else= safe_expression -> ^( IF_ELSE $condition $part_if $part_else) ;
    public final OmttParser.safe_if_expression_return safe_if_expression() throws RecognitionException {
        OmttParser.safe_if_expression_return retval = new OmttParser.safe_if_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF144=null;
        Token COLON145=null;
        Token ELSE146=null;
        Token COLON147=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.safe_expression_return part_if = null;

        OmttParser.safe_expression_return part_else = null;


        Object IF144_tree=null;
        Object COLON145_tree=null;
        Object ELSE146_tree=null;
        Object COLON147_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_safe_expression=new RewriteRuleSubtreeStream(adaptor,"rule safe_expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:237:3: ( IF condition= context_expression COLON part_if= safe_expression ELSE ( COLON )? part_else= safe_expression -> ^( IF_ELSE $condition $part_if $part_else) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:237:5: IF condition= context_expression COLON part_if= safe_expression ELSE ( COLON )? part_else= safe_expression
            {
            IF144=(Token)match(input,IF,FOLLOW_IF_in_safe_if_expression1640); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF144);

            pushFollow(FOLLOW_context_expression_in_safe_if_expression1644);
            condition=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(condition.getTree());
            COLON145=(Token)match(input,COLON,FOLLOW_COLON_in_safe_if_expression1646); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON145);

            pushFollow(FOLLOW_safe_expression_in_safe_if_expression1654);
            part_if=safe_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_safe_expression.add(part_if.getTree());
            ELSE146=(Token)match(input,ELSE,FOLLOW_ELSE_in_safe_if_expression1660); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(ELSE146);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:239:10: ( COLON )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==COLON) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: COLON
                    {
                    COLON147=(Token)match(input,COLON,FOLLOW_COLON_in_safe_if_expression1662); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON147);


                    }
                    break;

            }

            pushFollow(FOLLOW_safe_expression_in_safe_if_expression1671);
            part_else=safe_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_safe_expression.add(part_else.getTree());


            // AST REWRITE
            // elements: part_if, condition, part_else
            // token labels: 
            // rule labels: retval, part_else, condition, part_if
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_part_else=new RewriteRuleSubtreeStream(adaptor,"rule part_else",part_else!=null?part_else.tree:null);
            RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition",condition!=null?condition.tree:null);
            RewriteRuleSubtreeStream stream_part_if=new RewriteRuleSubtreeStream(adaptor,"rule part_if",part_if!=null?part_if.tree:null);

            root_0 = (Object)adaptor.nil();
            // 241:5: -> ^( IF_ELSE $condition $part_if $part_else)
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:241:8: ^( IF_ELSE $condition $part_if $part_else)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new IfElse(IF_ELSE), root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());
                adaptor.addChild(root_1, stream_part_if.nextTree());
                adaptor.addChild(root_1, stream_part_else.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:243:1: if_tag : TAG_START if_subtag TAG_END ;
    public final OmttParser.if_tag_return if_tag() throws RecognitionException {
        OmttParser.if_tag_return retval = new OmttParser.if_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START148=null;
        Token TAG_END150=null;
        OmttParser.if_subtag_return if_subtag149 = null;


        Object TAG_START148_tree=null;
        Object TAG_END150_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:244:3: ( TAG_START if_subtag TAG_END )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:244:5: TAG_START if_subtag TAG_END
            {
            root_0 = (Object)adaptor.nil();

            TAG_START148=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_tag1705); if (state.failed) return retval;
            pushFollow(FOLLOW_if_subtag_in_if_tag1711);
            if_subtag149=if_subtag();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, if_subtag149.getTree());
            TAG_END150=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_if_tag1717); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:248:10: fragment if_subtag : ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )? -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? ) ;
    public final OmttParser.if_subtag_return if_subtag() throws RecognitionException {
        OmttParser.if_subtag_return retval = new OmttParser.if_subtag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF151=null;
        Token TAG_START152=null;
        Token ELSE153=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.tag_content_return part_if = null;

        OmttParser.tag_content_return part_else = null;

        OmttParser.if_subtag_return subtag = null;


        Object IF151_tree=null;
        Object TAG_START152_tree=null;
        Object ELSE153_tree=null;
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_if_subtag=new RewriteRuleSubtreeStream(adaptor,"rule if_subtag");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:249:2: ( ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )? -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:249:4: ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )?
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:249:4: ( IF condition= context_expression part_if= tag_content )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:249:6: IF condition= context_expression part_if= tag_content
            {
            IF151=(Token)match(input,IF,FOLLOW_IF_in_if_subtag1733); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF151);

            pushFollow(FOLLOW_context_expression_in_if_subtag1737);
            condition=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(condition.getTree());
            pushFollow(FOLLOW_tag_content_in_if_subtag1745);
            part_if=tag_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tag_content.add(part_if.getTree());

            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:252:3: ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==TAG_START) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:252:5: TAG_START ELSE (part_else= tag_content | subtag= if_subtag )
                    {
                    TAG_START152=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_subtag1755); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START152);

                    ELSE153=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_subtag1757); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE153);

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:253:4: (part_else= tag_content | subtag= if_subtag )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==CONTENT||LA48_0==OP_DATA_IS_EXPRESSION) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==IF) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:253:5: part_else= tag_content
                            {
                            pushFollow(FOLLOW_tag_content_in_if_subtag1765);
                            part_else=tag_content();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tag_content.add(part_else.getTree());

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:253:29: subtag= if_subtag
                            {
                            pushFollow(FOLLOW_if_subtag_in_if_subtag1771);
                            subtag=if_subtag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_if_subtag.add(subtag.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: condition, part_if, part_else, subtag
            // token labels: 
            // rule labels: subtag, retval, part_else, condition, part_if
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_subtag=new RewriteRuleSubtreeStream(adaptor,"rule subtag",subtag!=null?subtag.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_part_else=new RewriteRuleSubtreeStream(adaptor,"rule part_else",part_else!=null?part_else.tree:null);
            RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition",condition!=null?condition.tree:null);
            RewriteRuleSubtreeStream stream_part_if=new RewriteRuleSubtreeStream(adaptor,"rule part_if",part_if!=null?part_if.tree:null);

            root_0 = (Object)adaptor.nil();
            // 255:3: -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:255:6: ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new IfElse(IF_ELSE), root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());
                adaptor.addChild(root_1, stream_part_if.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:255:44: ( $part_else)?
                if ( stream_part_else.hasNext() ) {
                    adaptor.addChild(root_1, stream_part_else.nextTree());

                }
                stream_part_else.reset();
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:255:56: ( $subtag)?
                if ( stream_subtag.hasNext() ) {
                    adaptor.addChild(root_1, stream_subtag.nextTree());

                }
                stream_subtag.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:258:1: map_expression : MAP ( item_alias )? iter= context_expression COLON expr= expression -> ^( MAP $iter $expr ( item_alias )? ) ;
    public final OmttParser.map_expression_return map_expression() throws RecognitionException {
        OmttParser.map_expression_return retval = new OmttParser.map_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MAP154=null;
        Token COLON156=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.expression_return expr = null;

        OmttParser.item_alias_return item_alias155 = null;


        Object MAP154_tree=null;
        Object COLON156_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_item_alias=new RewriteRuleSubtreeStream(adaptor,"rule item_alias");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:259:3: ( MAP ( item_alias )? iter= context_expression COLON expr= expression -> ^( MAP $iter $expr ( item_alias )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:259:5: MAP ( item_alias )? iter= context_expression COLON expr= expression
            {
            MAP154=(Token)match(input,MAP,FOLLOW_MAP_in_map_expression1814); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MAP.add(MAP154);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:259:9: ( item_alias )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==VAR_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==OP_REVERSE_FOLLOW) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: item_alias
                    {
                    pushFollow(FOLLOW_item_alias_in_map_expression1816);
                    item_alias155=item_alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_item_alias.add(item_alias155.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_context_expression_in_map_expression1821);
            iter=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(iter.getTree());
            COLON156=(Token)match(input,COLON,FOLLOW_COLON_in_map_expression1823); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON156);

            pushFollow(FOLLOW_expression_in_map_expression1831);
            expr=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expr.getTree());


            // AST REWRITE
            // elements: expr, item_alias, MAP, iter
            // token labels: 
            // rule labels: retval, expr, iter
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.tree:null);
            RewriteRuleSubtreeStream stream_iter=new RewriteRuleSubtreeStream(adaptor,"rule iter",iter!=null?iter.tree:null);

            root_0 = (Object)adaptor.nil();
            // 261:5: -> ^( MAP $iter $expr ( item_alias )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:261:8: ^( MAP $iter $expr ( item_alias )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_MAP.nextToken()), root_1);

                adaptor.addChild(root_1, stream_iter.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:261:42: ( item_alias )?
                if ( stream_item_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_item_alias.nextTree());

                }
                stream_item_alias.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:263:1: safe_map_expression : MAP ( item_alias )? iter= context_expression COLON expr= safe_expression -> ^( MAP $iter $expr ( item_alias )? ) ;
    public final OmttParser.safe_map_expression_return safe_map_expression() throws RecognitionException {
        OmttParser.safe_map_expression_return retval = new OmttParser.safe_map_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MAP157=null;
        Token COLON159=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.safe_expression_return expr = null;

        OmttParser.item_alias_return item_alias158 = null;


        Object MAP157_tree=null;
        Object COLON159_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_safe_expression=new RewriteRuleSubtreeStream(adaptor,"rule safe_expression");
        RewriteRuleSubtreeStream stream_item_alias=new RewriteRuleSubtreeStream(adaptor,"rule item_alias");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:264:3: ( MAP ( item_alias )? iter= context_expression COLON expr= safe_expression -> ^( MAP $iter $expr ( item_alias )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:264:5: MAP ( item_alias )? iter= context_expression COLON expr= safe_expression
            {
            MAP157=(Token)match(input,MAP,FOLLOW_MAP_in_safe_map_expression1865); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MAP.add(MAP157);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:264:9: ( item_alias )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==VAR_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==OP_REVERSE_FOLLOW) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: item_alias
                    {
                    pushFollow(FOLLOW_item_alias_in_safe_map_expression1867);
                    item_alias158=item_alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_item_alias.add(item_alias158.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_context_expression_in_safe_map_expression1872);
            iter=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(iter.getTree());
            COLON159=(Token)match(input,COLON,FOLLOW_COLON_in_safe_map_expression1874); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON159);

            pushFollow(FOLLOW_safe_expression_in_safe_map_expression1882);
            expr=safe_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_safe_expression.add(expr.getTree());


            // AST REWRITE
            // elements: item_alias, iter, expr, MAP
            // token labels: 
            // rule labels: retval, expr, iter
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.tree:null);
            RewriteRuleSubtreeStream stream_iter=new RewriteRuleSubtreeStream(adaptor,"rule iter",iter!=null?iter.tree:null);

            root_0 = (Object)adaptor.nil();
            // 266:5: -> ^( MAP $iter $expr ( item_alias )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:266:8: ^( MAP $iter $expr ( item_alias )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_MAP.nextToken()), root_1);

                adaptor.addChild(root_1, stream_iter.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:266:42: ( item_alias )?
                if ( stream_item_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_item_alias.nextTree());

                }
                stream_item_alias.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:268:1: map_tag : TAG_START MAP ( item_alias )? iter= context_expression expr= tag_content TAG_END -> ^( MAP $iter $expr ( item_alias )? ) ;
    public final OmttParser.map_tag_return map_tag() throws RecognitionException {
        OmttParser.map_tag_return retval = new OmttParser.map_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START160=null;
        Token MAP161=null;
        Token TAG_END163=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.tag_content_return expr = null;

        OmttParser.item_alias_return item_alias162 = null;


        Object TAG_START160_tree=null;
        Object MAP161_tree=null;
        Object TAG_END163_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_item_alias=new RewriteRuleSubtreeStream(adaptor,"rule item_alias");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:269:3: ( TAG_START MAP ( item_alias )? iter= context_expression expr= tag_content TAG_END -> ^( MAP $iter $expr ( item_alias )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:269:5: TAG_START MAP ( item_alias )? iter= context_expression expr= tag_content TAG_END
            {
            TAG_START160=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_map_tag1916); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START160);

            MAP161=(Token)match(input,MAP,FOLLOW_MAP_in_map_tag1918); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MAP.add(MAP161);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:269:19: ( item_alias )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==VAR_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==OP_REVERSE_FOLLOW) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: item_alias
                    {
                    pushFollow(FOLLOW_item_alias_in_map_tag1920);
                    item_alias162=item_alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_item_alias.add(item_alias162.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_context_expression_in_map_tag1925);
            iter=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(iter.getTree());
            pushFollow(FOLLOW_tag_content_in_map_tag1933);
            expr=tag_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tag_content.add(expr.getTree());
            TAG_END163=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_map_tag1939); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_END.add(TAG_END163);



            // AST REWRITE
            // elements: expr, MAP, iter, item_alias
            // token labels: 
            // rule labels: retval, expr, iter
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.tree:null);
            RewriteRuleSubtreeStream stream_iter=new RewriteRuleSubtreeStream(adaptor,"rule iter",iter!=null?iter.tree:null);

            root_0 = (Object)adaptor.nil();
            // 272:5: -> ^( MAP $iter $expr ( item_alias )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:272:8: ^( MAP $iter $expr ( item_alias )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_MAP.nextToken()), root_1);

                adaptor.addChild(root_1, stream_iter.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:272:42: ( item_alias )?
                if ( stream_item_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_item_alias.nextTree());

                }
                stream_item_alias.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:275:10: fragment item_alias : VAR_ID OP_REVERSE_FOLLOW -> ^( AS VAR_ID ) ;
    public final OmttParser.item_alias_return item_alias() throws RecognitionException {
        OmttParser.item_alias_return retval = new OmttParser.item_alias_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID164=null;
        Token OP_REVERSE_FOLLOW165=null;

        Object VAR_ID164_tree=null;
        Object OP_REVERSE_FOLLOW165_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_REVERSE_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_REVERSE_FOLLOW");

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:276:2: ( VAR_ID OP_REVERSE_FOLLOW -> ^( AS VAR_ID ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:276:4: VAR_ID OP_REVERSE_FOLLOW
            {
            VAR_ID164=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_item_alias1975); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID164);

            OP_REVERSE_FOLLOW165=(Token)match(input,OP_REVERSE_FOLLOW,FOLLOW_OP_REVERSE_FOLLOW_in_item_alias1977); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_REVERSE_FOLLOW.add(OP_REVERSE_FOLLOW165);



            // AST REWRITE
            // elements: VAR_ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 277:3: -> ^( AS VAR_ID )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:277:6: ^( AS VAR_ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AS, "AS"), root_1);

                adaptor.addChild(root_1, stream_VAR_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:280:1: match_expression : MATCH iter= context_expression COLON expr= lambda_match_expression -> ^( CALL[true] $expr ^( ARGUMENT $iter) ) ;
    public final OmttParser.match_expression_return match_expression() throws RecognitionException {
        OmttParser.match_expression_return retval = new OmttParser.match_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MATCH166=null;
        Token COLON167=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.lambda_match_expression_return expr = null;


        Object MATCH166_tree=null;
        Object COLON167_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MATCH=new RewriteRuleTokenStream(adaptor,"token MATCH");
        RewriteRuleSubtreeStream stream_lambda_match_expression=new RewriteRuleSubtreeStream(adaptor,"rule lambda_match_expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:281:3: ( MATCH iter= context_expression COLON expr= lambda_match_expression -> ^( CALL[true] $expr ^( ARGUMENT $iter) ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:281:5: MATCH iter= context_expression COLON expr= lambda_match_expression
            {
            MATCH166=(Token)match(input,MATCH,FOLLOW_MATCH_in_match_expression1999); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MATCH.add(MATCH166);

            pushFollow(FOLLOW_context_expression_in_match_expression2003);
            iter=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(iter.getTree());
            COLON167=(Token)match(input,COLON,FOLLOW_COLON_in_match_expression2005); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON167);

            pushFollow(FOLLOW_lambda_match_expression_in_match_expression2013);
            expr=lambda_match_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_match_expression.add(expr.getTree());


            // AST REWRITE
            // elements: iter, expr
            // token labels: 
            // rule labels: retval, expr, iter
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.tree:null);
            RewriteRuleSubtreeStream stream_iter=new RewriteRuleSubtreeStream(adaptor,"rule iter",iter!=null?iter.tree:null);

            root_0 = (Object)adaptor.nil();
            // 283:5: -> ^( CALL[true] $expr ^( ARGUMENT $iter) )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:283:8: ^( CALL[true] $expr ^( ARGUMENT $iter) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:283:33: ^( ARGUMENT $iter)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

                adaptor.addChild(root_2, stream_iter.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:288:1: context_expression : (base= strict_expression -> $base) ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_map ce= safe_expression -> ^( op_map $context_expression $ce) | WHERE safe_expression -> ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) ) | ORDER BY safe_expression -> ^( ORDER $context_expression safe_expression ) | MATCH lambda_match_expression -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) ) )* ;
    public final OmttParser.context_expression_return context_expression() throws RecognitionException {
        OmttParser.context_expression_return retval = new OmttParser.context_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHERE171=null;
        Token ORDER173=null;
        Token BY174=null;
        Token MATCH176=null;
        OmttParser.strict_expression_return base = null;

        OmttParser.function_arguments_return arguments = null;

        OmttParser.safe_expression_return ce = null;

        OmttParser.op_apply_return op_apply168 = null;

        OmttParser.atom_expression_return atom_expression169 = null;

        OmttParser.op_map_return op_map170 = null;

        OmttParser.safe_expression_return safe_expression172 = null;

        OmttParser.safe_expression_return safe_expression175 = null;

        OmttParser.lambda_match_expression_return lambda_match_expression177 = null;


        Object WHERE171_tree=null;
        Object ORDER173_tree=null;
        Object BY174_tree=null;
        Object MATCH176_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_MATCH=new RewriteRuleTokenStream(adaptor,"token MATCH");
        RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_safe_expression=new RewriteRuleSubtreeStream(adaptor,"rule safe_expression");
        RewriteRuleSubtreeStream stream_op_apply=new RewriteRuleSubtreeStream(adaptor,"rule op_apply");
        RewriteRuleSubtreeStream stream_lambda_match_expression=new RewriteRuleSubtreeStream(adaptor,"rule lambda_match_expression");
        RewriteRuleSubtreeStream stream_function_arguments=new RewriteRuleSubtreeStream(adaptor,"rule function_arguments");
        RewriteRuleSubtreeStream stream_op_map=new RewriteRuleSubtreeStream(adaptor,"rule op_map");
        RewriteRuleSubtreeStream stream_strict_expression=new RewriteRuleSubtreeStream(adaptor,"rule strict_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:289:3: ( (base= strict_expression -> $base) ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_map ce= safe_expression -> ^( op_map $context_expression $ce) | WHERE safe_expression -> ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) ) | ORDER BY safe_expression -> ^( ORDER $context_expression safe_expression ) | MATCH lambda_match_expression -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) ) )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:289:5: (base= strict_expression -> $base) ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_map ce= safe_expression -> ^( op_map $context_expression $ce) | WHERE safe_expression -> ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) ) | ORDER BY safe_expression -> ^( ORDER $context_expression safe_expression ) | MATCH lambda_match_expression -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) ) )*
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:289:5: (base= strict_expression -> $base)
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:289:6: base= strict_expression
            {
            pushFollow(FOLLOW_strict_expression_in_context_expression2058);
            base=strict_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_strict_expression.add(base.getTree());


            // AST REWRITE
            // elements: base
            // token labels: 
            // rule labels: retval, base
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_base=new RewriteRuleSubtreeStream(adaptor,"rule base",base!=null?base.tree:null);

            root_0 = (Object)adaptor.nil();
            // 289:29: -> $base
            {
                adaptor.addChild(root_0, stream_base.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:290:3: ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_map ce= safe_expression -> ^( op_map $context_expression $ce) | WHERE safe_expression -> ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) ) | ORDER BY safe_expression -> ^( ORDER $context_expression safe_expression ) | MATCH lambda_match_expression -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) ) )*
            loop53:
            do {
                int alt53=6;
                switch ( input.LA(1) ) {
                case APPLY:
                case OP_CONTEXT:
                    {
                    alt53=1;
                    }
                    break;
                case MAP:
                    {
                    alt53=2;
                    }
                    break;
                case WHERE:
                    {
                    alt53=3;
                    }
                    break;
                case ORDER:
                    {
                    alt53=4;
                    }
                    break;
                case MATCH:
                    {
                    alt53=5;
                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:290:5: op_apply atom_expression arguments= function_arguments
            	    {
            	    pushFollow(FOLLOW_op_apply_in_context_expression2070);
            	    op_apply168=op_apply();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_op_apply.add(op_apply168.getTree());
            	    pushFollow(FOLLOW_atom_expression_in_context_expression2072);
            	    atom_expression169=atom_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_atom_expression.add(atom_expression169.getTree());
            	    pushFollow(FOLLOW_function_arguments_in_context_expression2076);
            	    arguments=function_arguments();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function_arguments.add(arguments.getTree());


            	    // AST REWRITE
            	    // elements: atom_expression, arguments, context_expression
            	    // token labels: 
            	    // rule labels: retval, arguments
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments",arguments!=null?arguments.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 291:7: -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? )
            	    {
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:291:10: ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

            	        adaptor.addChild(root_1, stream_atom_expression.nextTree());
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:291:45: ^( ARGUMENT $context_expression)
            	        {
            	        Object root_2 = (Object)adaptor.nil();
            	        root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:291:95: ( $arguments)?
            	        if ( stream_arguments.hasNext() ) {
            	            adaptor.addChild(root_1, stream_arguments.nextTree());

            	        }
            	        stream_arguments.reset();

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 2 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:292:5: op_map ce= safe_expression
            	    {
            	    pushFollow(FOLLOW_op_map_in_context_expression2114);
            	    op_map170=op_map();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_op_map.add(op_map170.getTree());
            	    pushFollow(FOLLOW_safe_expression_in_context_expression2118);
            	    ce=safe_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_safe_expression.add(ce.getTree());


            	    // AST REWRITE
            	    // elements: op_map, ce, context_expression
            	    // token labels: 
            	    // rule labels: retval, ce
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_ce=new RewriteRuleSubtreeStream(adaptor,"rule ce",ce!=null?ce.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 293:6: -> ^( op_map $context_expression $ce)
            	    {
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:293:9: ^( op_map $context_expression $ce)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_op_map.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_ce.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 3 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:294:5: WHERE safe_expression
            	    {
            	    WHERE171=(Token)match(input,WHERE,FOLLOW_WHERE_in_context_expression2141); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_WHERE.add(WHERE171);

            	    pushFollow(FOLLOW_safe_expression_in_context_expression2143);
            	    safe_expression172=safe_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_safe_expression.add(safe_expression172.getTree());


            	    // AST REWRITE
            	    // elements: safe_expression, context_expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 295:4: -> ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) )
            	    {
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:295:7: ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new AtomSelect(ATOM_SELECT), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:295:53: ^( SEQUENCE_SELECT safe_expression )
            	        {
            	        Object root_2 = (Object)adaptor.nil();
            	        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEQUENCE_SELECT, "SEQUENCE_SELECT"), root_2);

            	        adaptor.addChild(root_2, stream_safe_expression.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 4 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:296:7: ORDER BY safe_expression
            	    {
            	    ORDER173=(Token)match(input,ORDER,FOLLOW_ORDER_in_context_expression2172); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ORDER.add(ORDER173);

            	    BY174=(Token)match(input,BY,FOLLOW_BY_in_context_expression2174); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_BY.add(BY174);

            	    pushFollow(FOLLOW_safe_expression_in_context_expression2176);
            	    safe_expression175=safe_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_safe_expression.add(safe_expression175.getTree());
            	    if ( state.backtracking==0 ) {
            	       reportNotImplemented("order by operation"); 
            	    }


            	    // AST REWRITE
            	    // elements: ORDER, safe_expression, context_expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 298:6: -> ^( ORDER $context_expression safe_expression )
            	    {
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:298:9: ^( ORDER $context_expression safe_expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_ORDER.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_safe_expression.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 5 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:299:5: MATCH lambda_match_expression
            	    {
            	    MATCH176=(Token)match(input,MATCH,FOLLOW_MATCH_in_context_expression2205); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_MATCH.add(MATCH176);

            	    pushFollow(FOLLOW_lambda_match_expression_in_context_expression2207);
            	    lambda_match_expression177=lambda_match_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_lambda_match_expression.add(lambda_match_expression177.getTree());


            	    // AST REWRITE
            	    // elements: context_expression, lambda_match_expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 300:6: -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) )
            	    {
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:300:9: ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

            	        adaptor.addChild(root_1, stream_lambda_match_expression.nextTree());
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:300:52: ^( ARGUMENT $context_expression)
            	        {
            	        Object root_2 = (Object)adaptor.nil();
            	        root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:303:10: fragment op_apply : ( OP_CONTEXT | APPLY );
    public final OmttParser.op_apply_return op_apply() throws RecognitionException {
        OmttParser.op_apply_return retval = new OmttParser.op_apply_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_CONTEXT178=null;
        Token APPLY179=null;

        Object OP_CONTEXT178_tree=null;
        Object APPLY179_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:304:2: ( OP_CONTEXT | APPLY )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==OP_CONTEXT) ) {
                alt54=1;
            }
            else if ( (LA54_0==APPLY) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:304:4: OP_CONTEXT
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_CONTEXT178=(Token)match(input,OP_CONTEXT,FOLLOW_OP_CONTEXT_in_op_apply2254); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_CONTEXT178_tree = (Object)adaptor.create(OP_CONTEXT178);
                    root_0 = (Object)adaptor.becomeRoot(OP_CONTEXT178_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:305:4: APPLY
                    {
                    root_0 = (Object)adaptor.nil();

                    APPLY179=(Token)match(input,APPLY,FOLLOW_APPLY_in_op_apply2260); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    APPLY179_tree = (Object)adaptor.create(APPLY179);
                    root_0 = (Object)adaptor.becomeRoot(APPLY179_tree, root_0);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:307:10: fragment op_map : MAP ;
    public final OmttParser.op_map_return op_map() throws RecognitionException {
        OmttParser.op_map_return retval = new OmttParser.op_map_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MAP180=null;

        Object MAP180_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:308:2: ( MAP )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:308:4: MAP
            {
            root_0 = (Object)adaptor.nil();

            MAP180=(Token)match(input,MAP,FOLLOW_MAP_in_op_map2273); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MAP180_tree = new Transformation(MAP180) ;
            root_0 = (Object)adaptor.becomeRoot(MAP180_tree, root_0);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:311:1: apply_expression : APPLY atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT OP_GENERAL ) ( $arguments)? ) ;
    public final OmttParser.apply_expression_return apply_expression() throws RecognitionException {
        OmttParser.apply_expression_return retval = new OmttParser.apply_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token APPLY181=null;
        OmttParser.function_arguments_return arguments = null;

        OmttParser.atom_expression_return atom_expression182 = null;


        Object APPLY181_tree=null;
        RewriteRuleTokenStream stream_APPLY=new RewriteRuleTokenStream(adaptor,"token APPLY");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_function_arguments=new RewriteRuleSubtreeStream(adaptor,"rule function_arguments");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:312:2: ( APPLY atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT OP_GENERAL ) ( $arguments)? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:312:4: APPLY atom_expression arguments= function_arguments
            {
            APPLY181=(Token)match(input,APPLY,FOLLOW_APPLY_in_apply_expression2288); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_APPLY.add(APPLY181);

            pushFollow(FOLLOW_atom_expression_in_apply_expression2290);
            atom_expression182=atom_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom_expression.add(atom_expression182.getTree());
            pushFollow(FOLLOW_function_arguments_in_apply_expression2294);
            arguments=function_arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function_arguments.add(arguments.getTree());


            // AST REWRITE
            // elements: arguments, atom_expression
            // token labels: 
            // rule labels: retval, arguments
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments",arguments!=null?arguments.tree:null);

            root_0 = (Object)adaptor.nil();
            // 313:5: -> ^( CALL[true] atom_expression ^( ARGUMENT OP_GENERAL ) ( $arguments)? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:313:8: ^( CALL[true] atom_expression ^( ARGUMENT OP_GENERAL ) ( $arguments)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

                adaptor.addChild(root_1, stream_atom_expression.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:313:43: ^( ARGUMENT OP_GENERAL )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

                adaptor.addChild(root_2, new Ident(OP_GENERAL));

                adaptor.addChild(root_1, root_2);
                }
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:313:91: ( $arguments)?
                if ( stream_arguments.hasNext() ) {
                    adaptor.addChild(root_1, stream_arguments.nextTree());

                }
                stream_arguments.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:316:1: apply_tag : TAG_START apply_expression TAG_END ;
    public final OmttParser.apply_tag_return apply_tag() throws RecognitionException {
        OmttParser.apply_tag_return retval = new OmttParser.apply_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START183=null;
        Token TAG_END185=null;
        OmttParser.apply_expression_return apply_expression184 = null;


        Object TAG_START183_tree=null;
        Object TAG_END185_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:317:2: ( TAG_START apply_expression TAG_END )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:317:4: TAG_START apply_expression TAG_END
            {
            root_0 = (Object)adaptor.nil();

            TAG_START183=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_apply_tag2337); if (state.failed) return retval;
            pushFollow(FOLLOW_apply_expression_in_apply_tag2340);
            apply_expression184=apply_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, apply_expression184.getTree());
            TAG_END185=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_apply_tag2342); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:322:1: strict_expression : (expr= concatence_expression -> $expr) ( AS VAR_ID -> ^( AS $expr VAR_ID ) )? ;
    public final OmttParser.strict_expression_return strict_expression() throws RecognitionException {
        OmttParser.strict_expression_return retval = new OmttParser.strict_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AS186=null;
        Token VAR_ID187=null;
        OmttParser.concatence_expression_return expr = null;


        Object AS186_tree=null;
        Object VAR_ID187_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleSubtreeStream stream_concatence_expression=new RewriteRuleSubtreeStream(adaptor,"rule concatence_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:323:2: ( (expr= concatence_expression -> $expr) ( AS VAR_ID -> ^( AS $expr VAR_ID ) )? )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:323:4: (expr= concatence_expression -> $expr) ( AS VAR_ID -> ^( AS $expr VAR_ID ) )?
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:323:4: (expr= concatence_expression -> $expr)
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:323:5: expr= concatence_expression
            {
            pushFollow(FOLLOW_concatence_expression_in_strict_expression2359);
            expr=concatence_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_concatence_expression.add(expr.getTree());


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval, expr
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.tree:null);

            root_0 = (Object)adaptor.nil();
            // 323:32: -> $expr
            {
                adaptor.addChild(root_0, stream_expr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:324:3: ( AS VAR_ID -> ^( AS $expr VAR_ID ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==AS) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:324:5: AS VAR_ID
                    {
                    AS186=(Token)match(input,AS,FOLLOW_AS_in_strict_expression2371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS186);

                    VAR_ID187=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_strict_expression2373); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID187);



                    // AST REWRITE
                    // elements: AS, VAR_ID, expr
                    // token labels: 
                    // rule labels: retval, expr
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 325:4: -> ^( AS $expr VAR_ID )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:325:7: ^( AS $expr VAR_ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Alias(stream_AS.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        adaptor.addChild(root_1, stream_VAR_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:329:1: concatence_expression : ( (expr+= boolean_expression -> $expr) ( ( OP_CONCAT expr+= boolean_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )? | apply_expression );
    public final OmttParser.concatence_expression_return concatence_expression() throws RecognitionException {
        OmttParser.concatence_expression_return retval = new OmttParser.concatence_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_CONCAT188=null;
        List list_expr=null;
        OmttParser.apply_expression_return apply_expression189 = null;

        OmttParser.boolean_expression_return expr = null;
         expr = null;
        Object OP_CONCAT188_tree=null;
        RewriteRuleTokenStream stream_OP_CONCAT=new RewriteRuleTokenStream(adaptor,"token OP_CONCAT");
        RewriteRuleSubtreeStream stream_boolean_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:330:3: ( (expr+= boolean_expression -> $expr) ( ( OP_CONCAT expr+= boolean_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )? | apply_expression )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=STRING_LITERAL && LA58_0<=REAL_NUMBER)||LA58_0==DATA_START||(LA58_0>=NULL && LA58_0<=FALSE)||LA58_0==TILDE||LA58_0==LEFT_PAREN||LA58_0==LEFT_SQUARE_PAREN||LA58_0==OP_MINUS||LA58_0==OP_NOT||LA58_0==OP_GENERAL||LA58_0==VAR_ID) ) {
                alt58=1;
            }
            else if ( (LA58_0==APPLY) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:330:5: (expr+= boolean_expression -> $expr) ( ( OP_CONCAT expr+= boolean_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )?
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:330:5: (expr+= boolean_expression -> $expr)
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:330:6: expr+= boolean_expression
                    {
                    pushFollow(FOLLOW_boolean_expression_in_concatence_expression2410);
                    expr=boolean_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_boolean_expression.add(expr.getTree());
                    if (list_expr==null) list_expr=new ArrayList();
                    list_expr.add(expr.getTree());



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: expr
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"token expr",list_expr);
                    root_0 = (Object)adaptor.nil();
                    // 330:31: -> $expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:331:5: ( ( OP_CONCAT expr+= boolean_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==OP_CONCAT) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:331:6: ( OP_CONCAT expr+= boolean_expression )+
                            {
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:331:6: ( OP_CONCAT expr+= boolean_expression )+
                            int cnt56=0;
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==OP_CONCAT) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:331:7: OP_CONCAT expr+= boolean_expression
                            	    {
                            	    OP_CONCAT188=(Token)match(input,OP_CONCAT,FOLLOW_OP_CONCAT_in_concatence_expression2424); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_OP_CONCAT.add(OP_CONCAT188);

                            	    pushFollow(FOLLOW_boolean_expression_in_concatence_expression2428);
                            	    expr=boolean_expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_boolean_expression.add(expr.getTree());
                            	    if (list_expr==null) list_expr=new ArrayList();
                            	    list_expr.add(expr.getTree());


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt56 >= 1 ) break loop56;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(56, input);
                                        throw eee;
                                }
                                cnt56++;
                            } while (true);



                            // AST REWRITE
                            // elements: OP_CONCAT, expr
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: expr
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"token expr",list_expr);
                            root_0 = (Object)adaptor.nil();
                            // 331:44: -> ^( OP_CONCAT ( $expr)+ )
                            {
                                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:331:47: ^( OP_CONCAT ( $expr)+ )
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

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:332:4: apply_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_apply_expression_in_concatence_expression2450);
                    apply_expression189=apply_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, apply_expression189.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:336:1: boolean_expression : boolean_binary_expression ;
    public final OmttParser.boolean_expression_return boolean_expression() throws RecognitionException {
        OmttParser.boolean_expression_return retval = new OmttParser.boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_binary_expression_return boolean_binary_expression190 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:337:2: ( boolean_binary_expression )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:337:4: boolean_binary_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_binary_expression_in_boolean_expression2463);
            boolean_binary_expression190=boolean_binary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_binary_expression190.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:339:10: fragment boolean_binary_expression : boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )* ;
    public final OmttParser.boolean_binary_expression_return boolean_binary_expression() throws RecognitionException {
        OmttParser.boolean_binary_expression_return retval = new OmttParser.boolean_binary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_unary_expression_return boolean_unary_expression191 = null;

        OmttParser.boolean_binary_operator_return boolean_binary_operator192 = null;

        OmttParser.boolean_unary_expression_return boolean_unary_expression193 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:340:3: ( boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:340:5: boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression2476);
            boolean_unary_expression191=boolean_unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_unary_expression191.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:340:30: ( boolean_binary_operator boolean_unary_expression )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=OP_AND && LA59_0<=OP_OR)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:340:31: boolean_binary_operator boolean_unary_expression
            	    {
            	    pushFollow(FOLLOW_boolean_binary_operator_in_boolean_binary_expression2479);
            	    boolean_binary_operator192=boolean_binary_operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(boolean_binary_operator192.getTree(), root_0);
            	    pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression2482);
            	    boolean_unary_expression193=boolean_unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_unary_expression193.getTree());

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:342:10: fragment boolean_unary_expression : ( boolean_unary_operator boolean_comparsion_expression | boolean_comparsion_expression );
    public final OmttParser.boolean_unary_expression_return boolean_unary_expression() throws RecognitionException {
        OmttParser.boolean_unary_expression_return retval = new OmttParser.boolean_unary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_unary_operator_return boolean_unary_operator194 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression195 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression196 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:343:3: ( boolean_unary_operator boolean_comparsion_expression | boolean_comparsion_expression )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==OP_NOT) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=STRING_LITERAL && LA60_0<=REAL_NUMBER)||LA60_0==DATA_START||(LA60_0>=NULL && LA60_0<=FALSE)||LA60_0==TILDE||LA60_0==LEFT_PAREN||LA60_0==LEFT_SQUARE_PAREN||LA60_0==OP_MINUS||LA60_0==OP_GENERAL||LA60_0==VAR_ID) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:343:5: boolean_unary_operator boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_unary_operator_in_boolean_unary_expression2498);
                    boolean_unary_operator194=boolean_unary_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(boolean_unary_operator194.getTree(), root_0);
                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression2501);
                    boolean_comparsion_expression195=boolean_comparsion_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_comparsion_expression195.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:344:5: boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression2507);
                    boolean_comparsion_expression196=boolean_comparsion_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_comparsion_expression196.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:347:10: fragment boolean_binary_operator : ( OP_AND | OP_OR );
    public final OmttParser.boolean_binary_operator_return boolean_binary_operator() throws RecognitionException {
        OmttParser.boolean_binary_operator_return retval = new OmttParser.boolean_binary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_AND197=null;
        Token OP_OR198=null;

        Object OP_AND197_tree=null;
        Object OP_OR198_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:348:3: ( OP_AND | OP_OR )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==OP_AND) ) {
                alt61=1;
            }
            else if ( (LA61_0==OP_OR) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:348:5: OP_AND
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_AND197=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_boolean_binary_operator2522); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_AND197_tree = new BooleanExpression(OP_AND197) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_AND197_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:349:5: OP_OR
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_OR198=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_boolean_binary_operator2532); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_OR198_tree = new BooleanExpression(OP_OR198) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_OR198_tree, root_0);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:351:10: fragment boolean_unary_operator : OP_NOT ;
    public final OmttParser.boolean_unary_operator_return boolean_unary_operator() throws RecognitionException {
        OmttParser.boolean_unary_operator_return retval = new OmttParser.boolean_unary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_NOT199=null;

        Object OP_NOT199_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:352:3: ( OP_NOT )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:352:5: OP_NOT
            {
            root_0 = (Object)adaptor.nil();

            OP_NOT199=(Token)match(input,OP_NOT,FOLLOW_OP_NOT_in_boolean_unary_operator2550); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_NOT199_tree = new BooleanExpression(OP_NOT199) ;
            root_0 = (Object)adaptor.becomeRoot(OP_NOT199_tree, root_0);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:355:1: boolean_comparsion_expression : additive_expression ( boolean_comparsion_operator additive_expression )* ;
    public final OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression() throws RecognitionException {
        OmttParser.boolean_comparsion_expression_return retval = new OmttParser.boolean_comparsion_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.additive_expression_return additive_expression200 = null;

        OmttParser.boolean_comparsion_operator_return boolean_comparsion_operator201 = null;

        OmttParser.additive_expression_return additive_expression202 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:356:3: ( additive_expression ( boolean_comparsion_operator additive_expression )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:356:5: additive_expression ( boolean_comparsion_operator additive_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression2567);
            additive_expression200=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression200.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:356:25: ( boolean_comparsion_operator additive_expression )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=OP_EQUAL && LA62_0<=OP_GE)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:356:26: boolean_comparsion_operator additive_expression
            	    {
            	    pushFollow(FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression2570);
            	    boolean_comparsion_operator201=boolean_comparsion_operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(boolean_comparsion_operator201.getTree(), root_0);
            	    pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression2573);
            	    additive_expression202=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression202.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:10: fragment boolean_comparsion_operator : ( OP_EQUAL | OP_NOT_EQUAL | OP_LE | OP_LEQ | OP_GE | OP_GEQ );
    public final OmttParser.boolean_comparsion_operator_return boolean_comparsion_operator() throws RecognitionException {
        OmttParser.boolean_comparsion_operator_return retval = new OmttParser.boolean_comparsion_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_EQUAL203=null;
        Token OP_NOT_EQUAL204=null;
        Token OP_LE205=null;
        Token OP_LEQ206=null;
        Token OP_GE207=null;
        Token OP_GEQ208=null;

        Object OP_EQUAL203_tree=null;
        Object OP_NOT_EQUAL204_tree=null;
        Object OP_LE205_tree=null;
        Object OP_LEQ206_tree=null;
        Object OP_GE207_tree=null;
        Object OP_GEQ208_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:359:3: ( OP_EQUAL | OP_NOT_EQUAL | OP_LE | OP_LEQ | OP_GE | OP_GEQ )
            int alt63=6;
            switch ( input.LA(1) ) {
            case OP_EQUAL:
                {
                alt63=1;
                }
                break;
            case OP_NOT_EQUAL:
                {
                alt63=2;
                }
                break;
            case OP_LE:
                {
                alt63=3;
                }
                break;
            case OP_LEQ:
                {
                alt63=4;
                }
                break;
            case OP_GE:
                {
                alt63=5;
                }
                break;
            case OP_GEQ:
                {
                alt63=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:359:5: OP_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_EQUAL203=(Token)match(input,OP_EQUAL,FOLLOW_OP_EQUAL_in_boolean_comparsion_operator2589); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_EQUAL203_tree = new BooleanExpression(OP_EQUAL203) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_EQUAL203_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:360:5: OP_NOT_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_NOT_EQUAL204=(Token)match(input,OP_NOT_EQUAL,FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator2599); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_NOT_EQUAL204_tree = new BooleanExpression(OP_NOT_EQUAL204) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_NOT_EQUAL204_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:361:5: OP_LE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LE205=(Token)match(input,OP_LE,FOLLOW_OP_LE_in_boolean_comparsion_operator2609); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_LE205_tree = new BooleanExpression(OP_LE205) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LE205_tree, root_0);
                    }

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:362:5: OP_LEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LEQ206=(Token)match(input,OP_LEQ,FOLLOW_OP_LEQ_in_boolean_comparsion_operator2619); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_LEQ206_tree = new BooleanExpression(OP_LEQ206) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LEQ206_tree, root_0);
                    }

                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:363:5: OP_GE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GE207=(Token)match(input,OP_GE,FOLLOW_OP_GE_in_boolean_comparsion_operator2629); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_GE207_tree = new BooleanExpression(OP_GE207) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GE207_tree, root_0);
                    }

                    }
                    break;
                case 6 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:364:5: OP_GEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GEQ208=(Token)match(input,OP_GEQ,FOLLOW_OP_GEQ_in_boolean_comparsion_operator2639); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_GEQ208_tree = new BooleanExpression(OP_GEQ208) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GEQ208_tree, root_0);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:370:1: additive_expression : multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )* ;
    public final OmttParser.additive_expression_return additive_expression() throws RecognitionException {
        OmttParser.additive_expression_return retval = new OmttParser.additive_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_PLUS210=null;
        Token OP_MINUS211=null;
        OmttParser.multiplicative_expression_return multiplicative_expression209 = null;

        OmttParser.multiplicative_expression_return multiplicative_expression212 = null;


        Object OP_PLUS210_tree=null;
        Object OP_MINUS211_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:371:3: ( multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:371:5: multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2659);
            multiplicative_expression209=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression209.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:372:5: ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=OP_PLUS && LA65_0<=OP_MINUS)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:373:7: ( OP_PLUS | OP_MINUS ) multiplicative_expression
            	    {
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:373:7: ( OP_PLUS | OP_MINUS )
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==OP_PLUS) ) {
            	        alt64=1;
            	    }
            	    else if ( (LA64_0==OP_MINUS) ) {
            	        alt64=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 64, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:373:9: OP_PLUS
            	            {
            	            OP_PLUS210=(Token)match(input,OP_PLUS,FOLLOW_OP_PLUS_in_additive_expression2675); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            OP_PLUS210_tree = new ArithmeticExpression(OP_PLUS210) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_PLUS210_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:374:9: OP_MINUS
            	            {
            	            OP_MINUS211=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_additive_expression2689); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            OP_MINUS211_tree = new ArithmeticExpression(OP_MINUS211) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MINUS211_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2709);
            	    multiplicative_expression212=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression212.getTree());

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:380:1: multiplicative_expression : negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )* ;
    public final OmttParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        OmttParser.multiplicative_expression_return retval = new OmttParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MULTIPLY214=null;
        Token SLASH215=null;
        Token OP_MODULO216=null;
        OmttParser.negative_expression_return negative_expression213 = null;

        OmttParser.negative_expression_return negative_expression217 = null;


        Object OP_MULTIPLY214_tree=null;
        Object SLASH215_tree=null;
        Object OP_MODULO216_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:381:3: ( negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:381:5: negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_negative_expression_in_multiplicative_expression2729);
            negative_expression213=negative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, negative_expression213.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:382:5: ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==SLASH||(LA67_0>=OP_MULTIPLY && LA67_0<=OP_MODULO)) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:382:7: ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression
            	    {
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:382:7: ( OP_MULTIPLY | SLASH | OP_MODULO )
            	    int alt66=3;
            	    switch ( input.LA(1) ) {
            	    case OP_MULTIPLY:
            	        {
            	        alt66=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt66=2;
            	        }
            	        break;
            	    case OP_MODULO:
            	        {
            	        alt66=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 66, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt66) {
            	        case 1 :
            	            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:382:9: OP_MULTIPLY
            	            {
            	            OP_MULTIPLY214=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_multiplicative_expression2739); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            OP_MULTIPLY214_tree = new ArithmeticExpression(OP_MULTIPLY214) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MULTIPLY214_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:383:9: SLASH
            	            {
            	            SLASH215=(Token)match(input,SLASH,FOLLOW_SLASH_in_multiplicative_expression2753); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH215_tree = new ArithmeticExpression(SLASH215) ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH215_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:384:9: OP_MODULO
            	            {
            	            OP_MODULO216=(Token)match(input,OP_MODULO,FOLLOW_OP_MODULO_in_multiplicative_expression2767); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            OP_MODULO216_tree = new ArithmeticExpression(OP_MODULO216) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MODULO216_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_negative_expression_in_multiplicative_expression2787);
            	    negative_expression217=negative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, negative_expression217.getTree());

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:390:1: negative_expression : ( OP_MINUS functional_expression -> ^( OP_MINUS functional_expression ) | functional_expression );
    public final OmttParser.negative_expression_return negative_expression() throws RecognitionException {
        OmttParser.negative_expression_return retval = new OmttParser.negative_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MINUS218=null;
        OmttParser.functional_expression_return functional_expression219 = null;

        OmttParser.functional_expression_return functional_expression220 = null;


        Object OP_MINUS218_tree=null;
        RewriteRuleTokenStream stream_OP_MINUS=new RewriteRuleTokenStream(adaptor,"token OP_MINUS");
        RewriteRuleSubtreeStream stream_functional_expression=new RewriteRuleSubtreeStream(adaptor,"rule functional_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:391:2: ( OP_MINUS functional_expression -> ^( OP_MINUS functional_expression ) | functional_expression )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==OP_MINUS) ) {
                alt68=1;
            }
            else if ( ((LA68_0>=STRING_LITERAL && LA68_0<=REAL_NUMBER)||LA68_0==DATA_START||(LA68_0>=NULL && LA68_0<=FALSE)||LA68_0==TILDE||LA68_0==LEFT_PAREN||LA68_0==LEFT_SQUARE_PAREN||LA68_0==OP_GENERAL||LA68_0==VAR_ID) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:391:4: OP_MINUS functional_expression
                    {
                    OP_MINUS218=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_negative_expression2806); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MINUS.add(OP_MINUS218);

                    pushFollow(FOLLOW_functional_expression_in_negative_expression2808);
                    functional_expression219=functional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functional_expression.add(functional_expression219.getTree());


                    // AST REWRITE
                    // elements: functional_expression, OP_MINUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 392:3: -> ^( OP_MINUS functional_expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:392:6: ^( OP_MINUS functional_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ArithmeticMinus(stream_OP_MINUS.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_functional_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:393:4: functional_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functional_expression_in_negative_expression2826);
                    functional_expression220=functional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functional_expression220.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:398:1: functional_expression : call_expression ;
    public final OmttParser.functional_expression_return functional_expression() throws RecognitionException {
        OmttParser.functional_expression_return retval = new OmttParser.functional_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.call_expression_return call_expression221 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:399:3: ( call_expression )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:399:5: call_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_call_expression_in_functional_expression2840);
            call_expression221=call_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, call_expression221.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:1: call_expression : atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) ) ;
    public final OmttParser.call_expression_return call_expression() throws RecognitionException {
        OmttParser.call_expression_return retval = new OmttParser.call_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.atom_expression_return atom_expression222 = null;

        OmttParser.function_argument_return function_argument223 = null;


        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_function_argument=new RewriteRuleSubtreeStream(adaptor,"rule function_argument");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:403:3: ( atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:403:5: atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            {
            pushFollow(FOLLOW_atom_expression_in_call_expression2853);
            atom_expression222=atom_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom_expression.add(atom_expression222.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:404:5: ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=STRING_LITERAL && LA70_0<=REAL_NUMBER)||LA70_0==DATA_START||(LA70_0>=NULL && LA70_0<=FALSE)||LA70_0==TILDE||LA70_0==LEFT_PAREN||LA70_0==LEFT_SQUARE_PAREN||LA70_0==OP_GENERAL||LA70_0==VAR_ID) ) {
                alt70=1;
            }
            else if ( (LA70_0==EOF||(LA70_0>=CONTENT && LA70_0<=TAG_END)||(LA70_0>=EXPRESSION_END && LA70_0<=OP_DATA_IS_EXPRESSION)||(LA70_0>=TOO && LA70_0<=IN)||(LA70_0>=ELSE && LA70_0<=AS)||(LA70_0>=MAP && LA70_0<=ORDER)||LA70_0==OP_FOLLOW||(LA70_0>=COLON && LA70_0<=SEMICOLON)||(LA70_0>=COMMA && LA70_0<=SLASH)||LA70_0==RIGHT_PAREN||(LA70_0>=RIGHT_SQUARE_PAREN && LA70_0<=OP_GE)||(LA70_0>=OP_AND && LA70_0<=OP_OR)||LA70_0==OP_CONTEXT||LA70_0==OP_CONCAT) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:404:7: ( function_argument )+
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:404:7: ( function_argument )+
                    int cnt69=0;
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( ((LA69_0>=STRING_LITERAL && LA69_0<=REAL_NUMBER)||LA69_0==DATA_START||(LA69_0>=NULL && LA69_0<=FALSE)||LA69_0==TILDE||LA69_0==LEFT_PAREN||LA69_0==LEFT_SQUARE_PAREN||LA69_0==OP_GENERAL||LA69_0==VAR_ID) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: function_argument
                    	    {
                    	    pushFollow(FOLLOW_function_argument_in_call_expression2861);
                    	    function_argument223=function_argument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_function_argument.add(function_argument223.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt69 >= 1 ) break loop69;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(69, input);
                                throw eee;
                        }
                        cnt69++;
                    } while (true);



                    // AST REWRITE
                    // elements: function_argument, atom_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 405:7: -> ^( CALL[false] atom_expression ( function_argument )+ )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:405:10: ^( CALL[false] atom_expression ( function_argument )+ )
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

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:406:7: 
                    {
                    if ( state.backtracking==0 ) {
                      /* no arguments */
                    }


                    // AST REWRITE
                    // elements: atom_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 407:7: -> ^( atom_expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:407:10: ^( atom_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_atom_expression.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:410:1: call_tag : TAG_START ident= namespace_id ( (content= tag_content | (args+= function_argument )+ (content= tag_content )? ) -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* ) | -> $ident) TAG_END ;
    public final OmttParser.call_tag_return call_tag() throws RecognitionException {
        OmttParser.call_tag_return retval = new OmttParser.call_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START224=null;
        Token TAG_END225=null;
        List list_args=null;
        OmttParser.namespace_id_return ident = null;

        OmttParser.tag_content_return content = null;

        OmttParser.function_argument_return args = null;
         args = null;
        Object TAG_START224_tree=null;
        Object TAG_END225_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_function_argument=new RewriteRuleSubtreeStream(adaptor,"rule function_argument");
        RewriteRuleSubtreeStream stream_namespace_id=new RewriteRuleSubtreeStream(adaptor,"rule namespace_id");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:411:3: ( TAG_START ident= namespace_id ( (content= tag_content | (args+= function_argument )+ (content= tag_content )? ) -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* ) | -> $ident) TAG_END )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:411:5: TAG_START ident= namespace_id ( (content= tag_content | (args+= function_argument )+ (content= tag_content )? ) -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* ) | -> $ident) TAG_END
            {
            TAG_START224=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_call_tag2921); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START224);

            pushFollow(FOLLOW_namespace_id_in_call_tag2925);
            ident=namespace_id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_namespace_id.add(ident.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:412:4: ( (content= tag_content | (args+= function_argument )+ (content= tag_content )? ) -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* ) | -> $ident)
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=STRING_LITERAL && LA74_0<=CONTENT)||LA74_0==DATA_START||LA74_0==OP_DATA_IS_EXPRESSION||(LA74_0>=NULL && LA74_0<=FALSE)||LA74_0==TILDE||LA74_0==LEFT_PAREN||LA74_0==LEFT_SQUARE_PAREN||LA74_0==OP_GENERAL||LA74_0==VAR_ID) ) {
                alt74=1;
            }
            else if ( (LA74_0==TAG_END) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:412:6: (content= tag_content | (args+= function_argument )+ (content= tag_content )? )
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:412:6: (content= tag_content | (args+= function_argument )+ (content= tag_content )? )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==CONTENT||LA73_0==OP_DATA_IS_EXPRESSION) ) {
                        alt73=1;
                    }
                    else if ( ((LA73_0>=STRING_LITERAL && LA73_0<=REAL_NUMBER)||LA73_0==DATA_START||(LA73_0>=NULL && LA73_0<=FALSE)||LA73_0==TILDE||LA73_0==LEFT_PAREN||LA73_0==LEFT_SQUARE_PAREN||LA73_0==OP_GENERAL||LA73_0==VAR_ID) ) {
                        alt73=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:412:7: content= tag_content
                            {
                            pushFollow(FOLLOW_tag_content_in_call_tag2935);
                            content=tag_content();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tag_content.add(content.getTree());

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:412:29: (args+= function_argument )+ (content= tag_content )?
                            {
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:412:33: (args+= function_argument )+
                            int cnt71=0;
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( ((LA71_0>=STRING_LITERAL && LA71_0<=REAL_NUMBER)||LA71_0==DATA_START||(LA71_0>=NULL && LA71_0<=FALSE)||LA71_0==TILDE||LA71_0==LEFT_PAREN||LA71_0==LEFT_SQUARE_PAREN||LA71_0==OP_GENERAL||LA71_0==VAR_ID) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: args+= function_argument
                            	    {
                            	    pushFollow(FOLLOW_function_argument_in_call_tag2941);
                            	    args=function_argument();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_function_argument.add(args.getTree());
                            	    if (list_args==null) list_args=new ArrayList();
                            	    list_args.add(args.getTree());


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt71 >= 1 ) break loop71;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(71, input);
                                        throw eee;
                                }
                                cnt71++;
                            } while (true);

                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:412:54: (content= tag_content )?
                            int alt72=2;
                            int LA72_0 = input.LA(1);

                            if ( (LA72_0==CONTENT||LA72_0==OP_DATA_IS_EXPRESSION) ) {
                                alt72=1;
                            }
                            switch (alt72) {
                                case 1 :
                                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:412:55: content= tag_content
                                    {
                                    pushFollow(FOLLOW_tag_content_in_call_tag2947);
                                    content=tag_content();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tag_content.add(content.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: content, ident, args
                    // token labels: 
                    // rule labels: content, retval, ident
                    // token list labels: 
                    // rule list labels: args
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"rule content",content!=null?content.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident",ident!=null?ident.tree:null);
                    RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"token args",list_args);
                    root_0 = (Object)adaptor.nil();
                    // 413:4: -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:413:7: ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, false), root_1);

                        adaptor.addChild(root_1, stream_ident.nextTree());
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:413:34: ( ^( ARGUMENT $content) )?
                        if ( stream_content.hasNext() ) {
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:413:34: ^( ARGUMENT $content)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

                            adaptor.addChild(root_2, stream_content.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_content.reset();
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:413:74: ( $args)*
                        while ( stream_args.hasNext() ) {
                            adaptor.addChild(root_1, stream_args.nextTree());

                        }
                        stream_args.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:414:6: 
                    {

                    // AST REWRITE
                    // elements: ident
                    // token labels: 
                    // rule labels: retval, ident
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident",ident!=null?ident.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 414:6: -> $ident
                    {
                        adaptor.addChild(root_0, stream_ident.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }

            TAG_END225=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_call_tag3002); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_END.add(TAG_END225);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:418:10: fragment function_arguments : ( function_argument )* ;
    public final OmttParser.function_arguments_return function_arguments() throws RecognitionException {
        OmttParser.function_arguments_return retval = new OmttParser.function_arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.function_argument_return function_argument226 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:419:3: ( ( function_argument )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:419:5: ( function_argument )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:419:5: ( function_argument )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=STRING_LITERAL && LA75_0<=REAL_NUMBER)||LA75_0==DATA_START||(LA75_0>=NULL && LA75_0<=FALSE)||LA75_0==TILDE||LA75_0==LEFT_PAREN||LA75_0==LEFT_SQUARE_PAREN||LA75_0==OP_GENERAL||LA75_0==VAR_ID) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: function_argument
            	    {
            	    pushFollow(FOLLOW_function_argument_in_function_arguments3016);
            	    function_argument226=function_argument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_argument226.getTree());

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:421:10: fragment function_argument : ( VAR_ID OP_ASSIGN )? atom_expression -> ^( ARGUMENT atom_expression ( VAR_ID )? ) ;
    public final OmttParser.function_argument_return function_argument() throws RecognitionException {
        OmttParser.function_argument_return retval = new OmttParser.function_argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID227=null;
        Token OP_ASSIGN228=null;
        OmttParser.atom_expression_return atom_expression229 = null;


        Object VAR_ID227_tree=null;
        Object OP_ASSIGN228_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:422:3: ( ( VAR_ID OP_ASSIGN )? atom_expression -> ^( ARGUMENT atom_expression ( VAR_ID )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:422:5: ( VAR_ID OP_ASSIGN )? atom_expression
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:422:5: ( VAR_ID OP_ASSIGN )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==VAR_ID) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==OP_ASSIGN) ) {
                    alt76=1;
                }
            }
            switch (alt76) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:422:6: VAR_ID OP_ASSIGN
                    {
                    VAR_ID227=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_function_argument3032); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID227);

                    OP_ASSIGN228=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_function_argument3034); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_ASSIGN.add(OP_ASSIGN228);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_expression_in_function_argument3038);
            atom_expression229=atom_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom_expression.add(atom_expression229.getTree());


            // AST REWRITE
            // elements: atom_expression, VAR_ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 423:5: -> ^( ARGUMENT atom_expression ( VAR_ID )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:423:8: ^( ARGUMENT atom_expression ( VAR_ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_1);

                adaptor.addChild(root_1, stream_atom_expression.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:423:53: ( VAR_ID )?
                if ( stream_VAR_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_VAR_ID.nextNode());

                }
                stream_VAR_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:428:1: atom_expression : (a= atom_with_selectors -> $a) ( DOT es= expression_select -> ^( DOT $atom_expression $es) | DOT ps= property_select -> ^( DOT $atom_expression $ps) )* ;
    public final OmttParser.atom_expression_return atom_expression() throws RecognitionException {
        OmttParser.atom_expression_return retval = new OmttParser.atom_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT230=null;
        Token DOT231=null;
        OmttParser.atom_with_selectors_return a = null;

        OmttParser.expression_select_return es = null;

        OmttParser.property_select_return ps = null;


        Object DOT230_tree=null;
        Object DOT231_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_expression_select=new RewriteRuleSubtreeStream(adaptor,"rule expression_select");
        RewriteRuleSubtreeStream stream_property_select=new RewriteRuleSubtreeStream(adaptor,"rule property_select");
        RewriteRuleSubtreeStream stream_atom_with_selectors=new RewriteRuleSubtreeStream(adaptor,"rule atom_with_selectors");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:429:3: ( (a= atom_with_selectors -> $a) ( DOT es= expression_select -> ^( DOT $atom_expression $es) | DOT ps= property_select -> ^( DOT $atom_expression $ps) )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:429:5: (a= atom_with_selectors -> $a) ( DOT es= expression_select -> ^( DOT $atom_expression $es) | DOT ps= property_select -> ^( DOT $atom_expression $ps) )*
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:429:5: (a= atom_with_selectors -> $a)
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:429:6: a= atom_with_selectors
            {
            pushFollow(FOLLOW_atom_with_selectors_in_atom_expression3074);
            a=atom_with_selectors();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom_with_selectors.add(a.getTree());


            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (Object)adaptor.nil();
            // 429:28: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:430:4: ( DOT es= expression_select -> ^( DOT $atom_expression $es) | DOT ps= property_select -> ^( DOT $atom_expression $ps) )*
            loop77:
            do {
                int alt77=3;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==DOT) ) {
                    int LA77_2 = input.LA(2);

                    if ( (LA77_2==VAR_ID) ) {
                        alt77=2;
                    }
                    else if ( ((LA77_2>=STRING_LITERAL && LA77_2<=REAL_NUMBER)||LA77_2==DATA_START||(LA77_2>=NULL && LA77_2<=FALSE)||LA77_2==TILDE||LA77_2==LEFT_PAREN||LA77_2==LEFT_SQUARE_PAREN) ) {
                        alt77=1;
                    }


                }


                switch (alt77) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:430:6: DOT es= expression_select
            	    {
            	    DOT230=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expression3087); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT230);

            	    pushFollow(FOLLOW_expression_select_in_atom_expression3091);
            	    es=expression_select();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression_select.add(es.getTree());


            	    // AST REWRITE
            	    // elements: es, DOT, atom_expression
            	    // token labels: 
            	    // rule labels: retval, es
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_es=new RewriteRuleSubtreeStream(adaptor,"rule es",es!=null?es.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 431:6: -> ^( DOT $atom_expression $es)
            	    {
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:431:9: ^( DOT $atom_expression $es)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_DOT.nextToken()), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_es.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 2 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:432:6: DOT ps= property_select
            	    {
            	    DOT231=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expression3118); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT231);

            	    pushFollow(FOLLOW_property_select_in_atom_expression3122);
            	    ps=property_select();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_property_select.add(ps.getTree());


            	    // AST REWRITE
            	    // elements: DOT, ps, atom_expression
            	    // token labels: 
            	    // rule labels: retval, ps
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_ps=new RewriteRuleSubtreeStream(adaptor,"rule ps",ps!=null?ps.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 433:5: -> ^( DOT $atom_expression $ps)
            	    {
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:433:8: ^( DOT $atom_expression $ps)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new PropertySelect(stream_DOT.nextToken()), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_ps.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:436:10: fragment atom_with_selectors : atom ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom ) ;
    public final OmttParser.atom_with_selectors_return atom_with_selectors() throws RecognitionException {
        OmttParser.atom_with_selectors_return retval = new OmttParser.atom_with_selectors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.atom_return atom232 = null;

        OmttParser.sequence_selectors_return sequence_selectors233 = null;


        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_sequence_selectors=new RewriteRuleSubtreeStream(adaptor,"rule sequence_selectors");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:437:2: ( atom ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:437:4: atom ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom )
            {
            pushFollow(FOLLOW_atom_in_atom_with_selectors3160);
            atom232=atom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom.add(atom232.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:438:3: ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom )
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:438:5: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_atom_with_selectors3166);
                    sequence_selectors233=sequence_selectors();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sequence_selectors.add(sequence_selectors233.getTree());


                    // AST REWRITE
                    // elements: sequence_selectors, atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 439:4: -> ^( ATOM_SELECT atom sequence_selectors )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:439:7: ^( ATOM_SELECT atom sequence_selectors )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new AtomSelect(ATOM_SELECT), root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());
                        adaptor.addChild(root_1, stream_sequence_selectors.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:440:5: 
                    {

                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 440:5: -> atom
                    {
                        adaptor.addChild(root_0, stream_atom.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:443:10: fragment expression_select : object ( sequence_selectors -> ^( ATOM_SELECT object sequence_selectors ) | -> object ) ;
    public final OmttParser.expression_select_return expression_select() throws RecognitionException {
        OmttParser.expression_select_return retval = new OmttParser.expression_select_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.object_return object234 = null;

        OmttParser.sequence_selectors_return sequence_selectors235 = null;


        RewriteRuleSubtreeStream stream_sequence_selectors=new RewriteRuleSubtreeStream(adaptor,"rule sequence_selectors");
        RewriteRuleSubtreeStream stream_object=new RewriteRuleSubtreeStream(adaptor,"rule object");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:444:2: ( object ( sequence_selectors -> ^( ATOM_SELECT object sequence_selectors ) | -> object ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:444:4: object ( sequence_selectors -> ^( ATOM_SELECT object sequence_selectors ) | -> object )
            {
            pushFollow(FOLLOW_object_in_expression_select3206);
            object234=object();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_object.add(object234.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:445:3: ( sequence_selectors -> ^( ATOM_SELECT object sequence_selectors ) | -> object )
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:445:5: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_expression_select3212);
                    sequence_selectors235=sequence_selectors();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sequence_selectors.add(sequence_selectors235.getTree());


                    // AST REWRITE
                    // elements: sequence_selectors, object
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 446:4: -> ^( ATOM_SELECT object sequence_selectors )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:446:7: ^( ATOM_SELECT object sequence_selectors )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new AtomSelect(ATOM_SELECT), root_1);

                        adaptor.addChild(root_1, stream_object.nextTree());
                        adaptor.addChild(root_1, stream_sequence_selectors.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:447:5: 
                    {

                    // AST REWRITE
                    // elements: object
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 447:5: -> object
                    {
                        adaptor.addChild(root_0, stream_object.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:450:10: fragment property_select : VAR_ID ( sequence_selectors )? ;
    public final OmttParser.property_select_return property_select() throws RecognitionException {
        OmttParser.property_select_return retval = new OmttParser.property_select_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID236=null;
        OmttParser.sequence_selectors_return sequence_selectors237 = null;


        Object VAR_ID236_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:451:2: ( VAR_ID ( sequence_selectors )? )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:451:4: VAR_ID ( sequence_selectors )?
            {
            root_0 = (Object)adaptor.nil();

            VAR_ID236=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_property_select3252); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR_ID236_tree = (Object)adaptor.create(VAR_ID236);
            adaptor.addChild(root_0, VAR_ID236_tree);
            }
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:451:11: ( sequence_selectors )?
            int alt80=2;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_property_select3254);
                    sequence_selectors237=sequence_selectors();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence_selectors237.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:453:10: fragment sequence_selectors : ( type_selector ( sequence_selector )? | sequence_selector );
    public final OmttParser.sequence_selectors_return sequence_selectors() throws RecognitionException {
        OmttParser.sequence_selectors_return retval = new OmttParser.sequence_selectors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.type_selector_return type_selector238 = null;

        OmttParser.sequence_selector_return sequence_selector239 = null;

        OmttParser.sequence_selector_return sequence_selector240 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:454:2: ( type_selector ( sequence_selector )? | sequence_selector )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==DOT) ) {
                alt82=1;
            }
            else if ( (LA82_0==LEFT_SQUARE_PAREN) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:454:4: type_selector ( sequence_selector )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_selector_in_sequence_selectors3267);
                    type_selector238=type_selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_selector238.getTree());
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:454:18: ( sequence_selector )?
                    int alt81=2;
                    alt81 = dfa81.predict(input);
                    switch (alt81) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: sequence_selector
                            {
                            pushFollow(FOLLOW_sequence_selector_in_sequence_selectors3269);
                            sequence_selector239=sequence_selector();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence_selector239.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:455:4: sequence_selector
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_sequence_selector_in_sequence_selectors3275);
                    sequence_selector240=sequence_selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence_selector240.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:457:10: fragment type_selector : DOT single_type -> ^( TYPE_SELECT single_type ) ;
    public final OmttParser.type_selector_return type_selector() throws RecognitionException {
        OmttParser.type_selector_return retval = new OmttParser.type_selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT241=null;
        OmttParser.single_type_return single_type242 = null;


        Object DOT241_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:458:3: ( DOT single_type -> ^( TYPE_SELECT single_type ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:458:5: DOT single_type
            {
            DOT241=(Token)match(input,DOT,FOLLOW_DOT_in_type_selector3288); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT241);

            pushFollow(FOLLOW_single_type_in_type_selector3290);
            single_type242=single_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_single_type.add(single_type242.getTree());


            // AST REWRITE
            // elements: single_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 459:4: -> ^( TYPE_SELECT single_type )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:459:7: ^( TYPE_SELECT single_type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_SELECT, "TYPE_SELECT"), root_1);

                adaptor.addChild(root_1, stream_single_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:461:10: fragment sequence_selector : LEFT_SQUARE_PAREN expression RIGHT_SQUARE_PAREN -> ^( SEQUENCE_SELECT expression ) ;
    public final OmttParser.sequence_selector_return sequence_selector() throws RecognitionException {
        OmttParser.sequence_selector_return retval = new OmttParser.sequence_selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE_PAREN243=null;
        Token RIGHT_SQUARE_PAREN245=null;
        OmttParser.expression_return expression244 = null;


        Object LEFT_SQUARE_PAREN243_tree=null;
        Object RIGHT_SQUARE_PAREN245_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:462:3: ( LEFT_SQUARE_PAREN expression RIGHT_SQUARE_PAREN -> ^( SEQUENCE_SELECT expression ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:462:5: LEFT_SQUARE_PAREN expression RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN243=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector3315); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN243);

            pushFollow(FOLLOW_expression_in_sequence_selector3317);
            expression244=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression244.getTree());
            RIGHT_SQUARE_PAREN245=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector3319); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN245);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 463:4: -> ^( SEQUENCE_SELECT expression )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:463:7: ^( SEQUENCE_SELECT expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEQUENCE_SELECT, "SEQUENCE_SELECT"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

    public static class data_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "data_expression"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:466:1: data_expression : DATA_START ( data_body_atom )* DATA_END -> ^( DATA_START ( data_body_atom )* ) ;
    public final OmttParser.data_expression_return data_expression() throws RecognitionException {
        OmttParser.data_expression_return retval = new OmttParser.data_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DATA_START246=null;
        Token DATA_END248=null;
        OmttParser.data_body_atom_return data_body_atom247 = null;


        Object DATA_START246_tree=null;
        Object DATA_END248_tree=null;
        RewriteRuleTokenStream stream_DATA_END=new RewriteRuleTokenStream(adaptor,"token DATA_END");
        RewriteRuleTokenStream stream_DATA_START=new RewriteRuleTokenStream(adaptor,"token DATA_START");
        RewriteRuleSubtreeStream stream_data_body_atom=new RewriteRuleSubtreeStream(adaptor,"rule data_body_atom");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:467:3: ( DATA_START ( data_body_atom )* DATA_END -> ^( DATA_START ( data_body_atom )* ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:467:5: DATA_START ( data_body_atom )* DATA_END
            {
            DATA_START246=(Token)match(input,DATA_START,FOLLOW_DATA_START_in_data_expression3343); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DATA_START.add(DATA_START246);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:467:16: ( data_body_atom )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==STRING_LITERAL||LA83_0==TAG_START||LA83_0==EXPRESSION_START) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: data_body_atom
            	    {
            	    pushFollow(FOLLOW_data_body_atom_in_data_expression3345);
            	    data_body_atom247=data_body_atom();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_data_body_atom.add(data_body_atom247.getTree());

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            DATA_END248=(Token)match(input,DATA_END,FOLLOW_DATA_END_in_data_expression3348); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DATA_END.add(DATA_END248);



            // AST REWRITE
            // elements: data_body_atom, DATA_START
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 468:5: -> ^( DATA_START ( data_body_atom )* )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:468:8: ^( DATA_START ( data_body_atom )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Data(stream_DATA_START.nextToken()), root_1);

                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:468:27: ( data_body_atom )*
                while ( stream_data_body_atom.hasNext() ) {
                    adaptor.addChild(root_1, stream_data_body_atom.nextTree());

                }
                stream_data_body_atom.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:471:1: atom : selectable_atom ( DOUBLE_DOT selectable_atom )? ;
    public final OmttParser.atom_return atom() throws RecognitionException {
        OmttParser.atom_return retval = new OmttParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_DOT250=null;
        OmttParser.selectable_atom_return selectable_atom249 = null;

        OmttParser.selectable_atom_return selectable_atom251 = null;


        Object DOUBLE_DOT250_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:472:2: ( selectable_atom ( DOUBLE_DOT selectable_atom )? )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:472:4: selectable_atom ( DOUBLE_DOT selectable_atom )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_selectable_atom_in_atom3376);
            selectable_atom249=selectable_atom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selectable_atom249.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:473:3: ( DOUBLE_DOT selectable_atom )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==DOUBLE_DOT) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:473:4: DOUBLE_DOT selectable_atom
                    {
                    DOUBLE_DOT250=(Token)match(input,DOUBLE_DOT,FOLLOW_DOUBLE_DOT_in_atom3381); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_DOT250_tree = new Range(DOUBLE_DOT250) ;
                    root_0 = (Object)adaptor.becomeRoot(DOUBLE_DOT250_tree, root_0);
                    }
                    pushFollow(FOLLOW_selectable_atom_in_atom3387);
                    selectable_atom251=selectable_atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selectable_atom251.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:476:1: selectable_atom : ( namespace_id | object );
    public final OmttParser.selectable_atom_return selectable_atom() throws RecognitionException {
        OmttParser.selectable_atom_return retval = new OmttParser.selectable_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.namespace_id_return namespace_id252 = null;

        OmttParser.object_return object253 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:477:3: ( namespace_id | object )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==OP_GENERAL||LA85_0==VAR_ID) ) {
                alt85=1;
            }
            else if ( ((LA85_0>=STRING_LITERAL && LA85_0<=REAL_NUMBER)||LA85_0==DATA_START||(LA85_0>=NULL && LA85_0<=FALSE)||LA85_0==TILDE||LA85_0==LEFT_PAREN||LA85_0==LEFT_SQUARE_PAREN) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:477:5: namespace_id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespace_id_in_selectable_atom3401);
                    namespace_id252=namespace_id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace_id252.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:478:5: object
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_object_in_selectable_atom3407);
                    object253=object();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, object253.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

    public static class object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "object"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:480:10: fragment object : ( object_atom | data_expression | tuple | record | LEFT_PAREN sequence_expression RIGHT_PAREN );
    public final OmttParser.object_return object() throws RecognitionException {
        OmttParser.object_return retval = new OmttParser.object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN258=null;
        Token RIGHT_PAREN260=null;
        OmttParser.object_atom_return object_atom254 = null;

        OmttParser.data_expression_return data_expression255 = null;

        OmttParser.tuple_return tuple256 = null;

        OmttParser.record_return record257 = null;

        OmttParser.sequence_expression_return sequence_expression259 = null;


        Object LEFT_PAREN258_tree=null;
        Object RIGHT_PAREN260_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:481:2: ( object_atom | data_expression | tuple | record | LEFT_PAREN sequence_expression RIGHT_PAREN )
            int alt86=5;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
            case INT_NUMBER:
            case REAL_NUMBER:
            case NULL:
            case TRUE:
            case FALSE:
            case TILDE:
                {
                alt86=1;
                }
                break;
            case DATA_START:
                {
                alt86=2;
                }
                break;
            case LEFT_SQUARE_PAREN:
                {
                int LA86_3 = input.LA(2);

                if ( (LA86_3==VAR_ID) ) {
                    int LA86_5 = input.LA(3);

                    if ( (LA86_5==COLON) ) {
                        alt86=4;
                    }
                    else if ( ((LA86_5>=STRING_LITERAL && LA86_5<=REAL_NUMBER)||LA86_5==DATA_START||LA86_5==AS||(LA86_5>=MAP && LA86_5<=ORDER)||(LA86_5>=NULL && LA86_5<=FALSE)||LA86_5==OP_FOLLOW||(LA86_5>=DOT && LA86_5<=LEFT_PAREN)||(LA86_5>=LEFT_SQUARE_PAREN && LA86_5<=OP_GE)||(LA86_5>=OP_AND && LA86_5<=OP_OR)||(LA86_5>=OP_CONTEXT && LA86_5<=OP_GENERAL)||LA86_5==VAR_ID) ) {
                        alt86=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 5, input);

                        throw nvae;
                    }
                }
                else if ( ((LA86_3>=STRING_LITERAL && LA86_3<=REAL_NUMBER)||LA86_3==DATA_START||LA86_3==DEF||LA86_3==IF||(LA86_3>=MAP && LA86_3<=MATCH)||(LA86_3>=FUN && LA86_3<=FALSE)||LA86_3==OP_FOLLOW||(LA86_3>=TILDE && LA86_3<=LEFT_PAREN)||LA86_3==LEFT_SQUARE_PAREN||LA86_3==OP_MINUS||LA86_3==OP_NOT||LA86_3==OP_GENERAL||LA86_3==CLASS_ID) ) {
                    alt86=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 3, input);

                    throw nvae;
                }
                }
                break;
            case LEFT_PAREN:
                {
                alt86=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:481:4: object_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_object_atom_in_object3420);
                    object_atom254=object_atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, object_atom254.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:482:5: data_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_data_expression_in_object3426);
                    data_expression255=data_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_expression255.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:483:4: tuple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tuple_in_object3431);
                    tuple256=tuple();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tuple256.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:484:5: record
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_record_in_object3437);
                    record257=record();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, record257.getTree());

                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:485:5: LEFT_PAREN sequence_expression RIGHT_PAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LEFT_PAREN258=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_object3443); if (state.failed) return retval;
                    pushFollow(FOLLOW_sequence_expression_in_object3446);
                    sequence_expression259=sequence_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence_expression259.getTree());
                    RIGHT_PAREN260=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_object3448); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "object"

    public static class namespace_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespace_id"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:488:10: fragment namespace_id : ( (ns= VAR_ID OP_VIEW )? id= VAR_ID -> ^( IDENT[$id] ( $ns)? ) | (ns= VAR_ID OP_VIEW )? id= OP_GENERAL -> ^( IDENT[$id] ( $ns)? ) );
    public final OmttParser.namespace_id_return namespace_id() throws RecognitionException {
        OmttParser.namespace_id_return retval = new OmttParser.namespace_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ns=null;
        Token id=null;
        Token OP_VIEW261=null;
        Token OP_VIEW262=null;

        Object ns_tree=null;
        Object id_tree=null;
        Object OP_VIEW261_tree=null;
        Object OP_VIEW262_tree=null;
        RewriteRuleTokenStream stream_OP_GENERAL=new RewriteRuleTokenStream(adaptor,"token OP_GENERAL");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_VIEW=new RewriteRuleTokenStream(adaptor,"token OP_VIEW");

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:489:3: ( (ns= VAR_ID OP_VIEW )? id= VAR_ID -> ^( IDENT[$id] ( $ns)? ) | (ns= VAR_ID OP_VIEW )? id= OP_GENERAL -> ^( IDENT[$id] ( $ns)? ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==VAR_ID) ) {
                int LA89_1 = input.LA(2);

                if ( (LA89_1==OP_VIEW) ) {
                    int LA89_3 = input.LA(3);

                    if ( (LA89_3==OP_GENERAL) ) {
                        alt89=2;
                    }
                    else if ( (LA89_3==VAR_ID) ) {
                        alt89=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA89_1==EOF||(LA89_1>=STRING_LITERAL && LA89_1<=DATA_START)||(LA89_1>=EXPRESSION_END && LA89_1<=OP_DATA_IS_EXPRESSION)||(LA89_1>=TOO && LA89_1<=IN)||(LA89_1>=ELSE && LA89_1<=AS)||(LA89_1>=MAP && LA89_1<=ORDER)||(LA89_1>=NULL && LA89_1<=FALSE)||LA89_1==OP_FOLLOW||(LA89_1>=COLON && LA89_1<=TILDE)||(LA89_1>=LEFT_PAREN && LA89_1<=OP_GE)||(LA89_1>=OP_AND && LA89_1<=OP_OR)||LA89_1==OP_CONTEXT||(LA89_1>=OP_CONCAT && LA89_1<=OP_GENERAL)||LA89_1==VAR_ID) ) {
                    alt89=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA89_0==OP_GENERAL) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:489:5: (ns= VAR_ID OP_VIEW )? id= VAR_ID
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:489:5: (ns= VAR_ID OP_VIEW )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==VAR_ID) ) {
                        int LA87_1 = input.LA(2);

                        if ( (LA87_1==OP_VIEW) ) {
                            alt87=1;
                        }
                    }
                    switch (alt87) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:489:6: ns= VAR_ID OP_VIEW
                            {
                            ns=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id3466); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_VAR_ID.add(ns);

                            OP_VIEW261=(Token)match(input,OP_VIEW,FOLLOW_OP_VIEW_in_namespace_id3468); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_VIEW.add(OP_VIEW261);


                            }
                            break;

                    }

                    id=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id3474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(id);



                    // AST REWRITE
                    // elements: ns
                    // token labels: ns
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_ns=new RewriteRuleTokenStream(adaptor,"token ns",ns);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 490:5: -> ^( IDENT[$id] ( $ns)? )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:490:8: ^( IDENT[$id] ( $ns)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Ident(IDENT, id), root_1);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:490:28: ( $ns)?
                        if ( stream_ns.hasNext() ) {
                            adaptor.addChild(root_1, stream_ns.nextNode());

                        }
                        stream_ns.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:491:5: (ns= VAR_ID OP_VIEW )? id= OP_GENERAL
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:491:5: (ns= VAR_ID OP_VIEW )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==VAR_ID) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:491:6: ns= VAR_ID OP_VIEW
                            {
                            ns=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id3501); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_VAR_ID.add(ns);

                            OP_VIEW262=(Token)match(input,OP_VIEW,FOLLOW_OP_VIEW_in_namespace_id3503); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_VIEW.add(OP_VIEW262);


                            }
                            break;

                    }

                    id=(Token)match(input,OP_GENERAL,FOLLOW_OP_GENERAL_in_namespace_id3509); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_GENERAL.add(id);



                    // AST REWRITE
                    // elements: ns
                    // token labels: ns
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_ns=new RewriteRuleTokenStream(adaptor,"token ns",ns);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 492:5: -> ^( IDENT[$id] ( $ns)? )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:492:8: ^( IDENT[$id] ( $ns)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Ident(IDENT, id), root_1);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:492:28: ( $ns)?
                        if ( stream_ns.hasNext() ) {
                            adaptor.addChild(root_1, stream_ns.nextNode());

                        }
                        stream_ns.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

    public static class tuple_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tuple"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:495:1: tuple : LEFT_SQUARE_PAREN expr+= expression ( COMMA expr+= expression )* RIGHT_SQUARE_PAREN -> ^( TUPLE ( $expr)+ ) ;
    public final OmttParser.tuple_return tuple() throws RecognitionException {
        OmttParser.tuple_return retval = new OmttParser.tuple_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE_PAREN263=null;
        Token COMMA264=null;
        Token RIGHT_SQUARE_PAREN265=null;
        List list_expr=null;
        OmttParser.expression_return expr = null;
         expr = null;
        Object LEFT_SQUARE_PAREN263_tree=null;
        Object COMMA264_tree=null;
        Object RIGHT_SQUARE_PAREN265_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:496:2: ( LEFT_SQUARE_PAREN expr+= expression ( COMMA expr+= expression )* RIGHT_SQUARE_PAREN -> ^( TUPLE ( $expr)+ ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:496:4: LEFT_SQUARE_PAREN expr+= expression ( COMMA expr+= expression )* RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN263=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_tuple3539); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN263);

            pushFollow(FOLLOW_expression_in_tuple3543);
            expr=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expr.getTree());
            if (list_expr==null) list_expr=new ArrayList();
            list_expr.add(expr.getTree());

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:496:39: ( COMMA expr+= expression )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==COMMA) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:496:40: COMMA expr+= expression
            	    {
            	    COMMA264=(Token)match(input,COMMA,FOLLOW_COMMA_in_tuple3546); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA264);

            	    pushFollow(FOLLOW_expression_in_tuple3550);
            	    expr=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expr.getTree());
            	    if (list_expr==null) list_expr=new ArrayList();
            	    list_expr.add(expr.getTree());


            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            RIGHT_SQUARE_PAREN265=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_tuple3554); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN265);

            if ( state.backtracking==0 ) {
              reportNotImplemented("tuples");
            }


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: expr
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"token expr",list_expr);
            root_0 = (Object)adaptor.nil();
            // 498:3: -> ^( TUPLE ( $expr)+ )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:498:6: ^( TUPLE ( $expr)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TUPLE, "TUPLE"), root_1);

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

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tuple"

    public static class record_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "record"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:500:1: record : LEFT_SQUARE_PAREN expr+= record_item ( COMMA expr+= record_item )* RIGHT_SQUARE_PAREN -> ^( RECORD ( $expr)* ) ;
    public final OmttParser.record_return record() throws RecognitionException {
        OmttParser.record_return retval = new OmttParser.record_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE_PAREN266=null;
        Token COMMA267=null;
        Token RIGHT_SQUARE_PAREN268=null;
        List list_expr=null;
        OmttParser.record_item_return expr = null;
         expr = null;
        Object LEFT_SQUARE_PAREN266_tree=null;
        Object COMMA267_tree=null;
        Object RIGHT_SQUARE_PAREN268_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_record_item=new RewriteRuleSubtreeStream(adaptor,"rule record_item");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:501:2: ( LEFT_SQUARE_PAREN expr+= record_item ( COMMA expr+= record_item )* RIGHT_SQUARE_PAREN -> ^( RECORD ( $expr)* ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:501:4: LEFT_SQUARE_PAREN expr+= record_item ( COMMA expr+= record_item )* RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN266=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_record3580); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN266);

            pushFollow(FOLLOW_record_item_in_record3584);
            expr=record_item();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_record_item.add(expr.getTree());
            if (list_expr==null) list_expr=new ArrayList();
            list_expr.add(expr.getTree());

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:501:40: ( COMMA expr+= record_item )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==COMMA) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:501:41: COMMA expr+= record_item
            	    {
            	    COMMA267=(Token)match(input,COMMA,FOLLOW_COMMA_in_record3587); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA267);

            	    pushFollow(FOLLOW_record_item_in_record3591);
            	    expr=record_item();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_record_item.add(expr.getTree());
            	    if (list_expr==null) list_expr=new ArrayList();
            	    list_expr.add(expr.getTree());


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            RIGHT_SQUARE_PAREN268=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_record3595); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN268);

            if ( state.backtracking==0 ) {
              reportNotImplemented("records");
            }


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: expr
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"token expr",list_expr);
            root_0 = (Object)adaptor.nil();
            // 503:3: -> ^( RECORD ( $expr)* )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:503:6: ^( RECORD ( $expr)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RECORD, "RECORD"), root_1);

                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:503:15: ( $expr)*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "record"

    public static class record_item_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "record_item"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:505:10: fragment record_item : VAR_ID COLON expression ;
    public final OmttParser.record_item_return record_item() throws RecognitionException {
        OmttParser.record_item_return retval = new OmttParser.record_item_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID269=null;
        Token COLON270=null;
        OmttParser.expression_return expression271 = null;


        Object VAR_ID269_tree=null;
        Object COLON270_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:506:2: ( VAR_ID COLON expression )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:506:4: VAR_ID COLON expression
            {
            root_0 = (Object)adaptor.nil();

            VAR_ID269=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_record_item3622); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR_ID269_tree = (Object)adaptor.create(VAR_ID269);
            adaptor.addChild(root_0, VAR_ID269_tree);
            }
            COLON270=(Token)match(input,COLON,FOLLOW_COLON_in_record_item3624); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_record_item3627);
            expression271=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression271.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "record_item"

    public static class sequence_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sequence_expression"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:509:1: sequence_expression : ( (expr= expression -> $expr) ( ( COMMA rexpr+= expression )+ -> ^( SEQUENCE $sequence_expression ( $rexpr)+ ) | -> $sequence_expression) | -> SEQUENCE );
    public final OmttParser.sequence_expression_return sequence_expression() throws RecognitionException {
        OmttParser.sequence_expression_return retval = new OmttParser.sequence_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA272=null;
        List list_rexpr=null;
        OmttParser.expression_return expr = null;

        OmttParser.expression_return rexpr = null;
         rexpr = null;
        Object COMMA272_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:510:2: ( (expr= expression -> $expr) ( ( COMMA rexpr+= expression )+ -> ^( SEQUENCE $sequence_expression ( $rexpr)+ ) | -> $sequence_expression) | -> SEQUENCE )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=STRING_LITERAL && LA94_0<=REAL_NUMBER)||LA94_0==DATA_START||LA94_0==DEF||LA94_0==IF||(LA94_0>=MAP && LA94_0<=MATCH)||(LA94_0>=FUN && LA94_0<=FALSE)||LA94_0==OP_FOLLOW||(LA94_0>=TILDE && LA94_0<=LEFT_PAREN)||LA94_0==LEFT_SQUARE_PAREN||LA94_0==OP_MINUS||LA94_0==OP_NOT||LA94_0==OP_GENERAL||LA94_0==VAR_ID||LA94_0==CLASS_ID) ) {
                alt94=1;
            }
            else if ( (LA94_0==RIGHT_PAREN) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:510:4: (expr= expression -> $expr) ( ( COMMA rexpr+= expression )+ -> ^( SEQUENCE $sequence_expression ( $rexpr)+ ) | -> $sequence_expression)
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:510:4: (expr= expression -> $expr)
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:510:5: expr= expression
                    {
                    pushFollow(FOLLOW_expression_in_sequence_expression3641);
                    expr=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expr.getTree());


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval, expr
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 510:21: -> $expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:511:3: ( ( COMMA rexpr+= expression )+ -> ^( SEQUENCE $sequence_expression ( $rexpr)+ ) | -> $sequence_expression)
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==COMMA) ) {
                        alt93=1;
                    }
                    else if ( (LA93_0==RIGHT_PAREN) ) {
                        alt93=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;
                    }
                    switch (alt93) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:511:5: ( COMMA rexpr+= expression )+
                            {
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:511:5: ( COMMA rexpr+= expression )+
                            int cnt92=0;
                            loop92:
                            do {
                                int alt92=2;
                                int LA92_0 = input.LA(1);

                                if ( (LA92_0==COMMA) ) {
                                    alt92=1;
                                }


                                switch (alt92) {
                            	case 1 :
                            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:511:6: COMMA rexpr+= expression
                            	    {
                            	    COMMA272=(Token)match(input,COMMA,FOLLOW_COMMA_in_sequence_expression3654); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA272);

                            	    pushFollow(FOLLOW_expression_in_sequence_expression3658);
                            	    rexpr=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_expression.add(rexpr.getTree());
                            	    if (list_rexpr==null) list_rexpr=new ArrayList();
                            	    list_rexpr.add(rexpr.getTree());


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt92 >= 1 ) break loop92;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(92, input);
                                        throw eee;
                                }
                                cnt92++;
                            } while (true);



                            // AST REWRITE
                            // elements: rexpr, sequence_expression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: rexpr
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_rexpr=new RewriteRuleSubtreeStream(adaptor,"token rexpr",list_rexpr);
                            root_0 = (Object)adaptor.nil();
                            // 512:4: -> ^( SEQUENCE $sequence_expression ( $rexpr)+ )
                            {
                                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:512:7: ^( SEQUENCE $sequence_expression ( $rexpr)+ )
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

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:513:5: 
                            {

                            // AST REWRITE
                            // elements: sequence_expression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 513:5: -> $sequence_expression
                            {
                                adaptor.addChild(root_0, stream_retval.nextTree());

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:516:4: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 516:4: -> SEQUENCE
                    {
                        adaptor.addChild(root_0, new Sequence(SEQUENCE));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:520:1: object_atom : ( number_atom | STRING_LITERAL | ( NULL | TILDE ) | ( TRUE | FALSE ) );
    public final OmttParser.object_atom_return object_atom() throws RecognitionException {
        OmttParser.object_atom_return retval = new OmttParser.object_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING_LITERAL274=null;
        Token NULL275=null;
        Token TILDE276=null;
        Token TRUE277=null;
        Token FALSE278=null;
        OmttParser.number_atom_return number_atom273 = null;


        Object STRING_LITERAL274_tree=null;
        Object NULL275_tree=null;
        Object TILDE276_tree=null;
        Object TRUE277_tree=null;
        Object FALSE278_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:521:3: ( number_atom | STRING_LITERAL | ( NULL | TILDE ) | ( TRUE | FALSE ) )
            int alt97=4;
            switch ( input.LA(1) ) {
            case INT_NUMBER:
            case REAL_NUMBER:
                {
                alt97=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt97=2;
                }
                break;
            case NULL:
            case TILDE:
                {
                alt97=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt97=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:521:5: number_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_atom_in_object_atom3719);
                    number_atom273=number_atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number_atom273.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:522:5: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL274=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_object_atom3725); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL274_tree = new Literal(STRING_LITERAL274) ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_LITERAL274_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:523:5: ( NULL | TILDE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:523:5: ( NULL | TILDE )
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==NULL) ) {
                        alt95=1;
                    }
                    else if ( (LA95_0==TILDE) ) {
                        alt95=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 0, input);

                        throw nvae;
                    }
                    switch (alt95) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:523:6: NULL
                            {
                            NULL275=(Token)match(input,NULL,FOLLOW_NULL_in_object_atom3736); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NULL275_tree = new Literal(NULL275) ;
                            root_0 = (Object)adaptor.becomeRoot(NULL275_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:523:23: TILDE
                            {
                            TILDE276=(Token)match(input,TILDE,FOLLOW_TILDE_in_object_atom3744); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TILDE276_tree = new Literal(TILDE276) ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE276_tree, root_0);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:524:5: ( TRUE | FALSE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:524:5: ( TRUE | FALSE )
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==TRUE) ) {
                        alt96=1;
                    }
                    else if ( (LA96_0==FALSE) ) {
                        alt96=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 0, input);

                        throw nvae;
                    }
                    switch (alt96) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:524:6: TRUE
                            {
                            TRUE277=(Token)match(input,TRUE,FOLLOW_TRUE_in_object_atom3757); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TRUE277_tree = new Literal(TRUE277) ;
                            root_0 = (Object)adaptor.becomeRoot(TRUE277_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:524:23: FALSE
                            {
                            FALSE278=(Token)match(input,FALSE,FOLLOW_FALSE_in_object_atom3765); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            FALSE278_tree = new Literal(FALSE278) ;
                            root_0 = (Object)adaptor.becomeRoot(FALSE278_tree, root_0);
                            }

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:527:1: number_atom : ( INT_NUMBER | REAL_NUMBER );
    public final OmttParser.number_atom_return number_atom() throws RecognitionException {
        OmttParser.number_atom_return retval = new OmttParser.number_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_NUMBER279=null;
        Token REAL_NUMBER280=null;

        Object INT_NUMBER279_tree=null;
        Object REAL_NUMBER280_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:528:3: ( INT_NUMBER | REAL_NUMBER )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==INT_NUMBER) ) {
                alt98=1;
            }
            else if ( (LA98_0==REAL_NUMBER) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:528:5: INT_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    INT_NUMBER279=(Token)match(input,INT_NUMBER,FOLLOW_INT_NUMBER_in_number_atom3783); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT_NUMBER279_tree = new Literal(INT_NUMBER279) ;
                    root_0 = (Object)adaptor.becomeRoot(INT_NUMBER279_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:529:5: REAL_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    REAL_NUMBER280=(Token)match(input,REAL_NUMBER,FOLLOW_REAL_NUMBER_in_number_atom3793); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REAL_NUMBER280_tree = new Literal(REAL_NUMBER280) ;
                    root_0 = (Object)adaptor.becomeRoot(REAL_NUMBER280_tree, root_0);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

    // $ANTLR start synpred32_OmttParser
    public final void synpred32_OmttParser_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:131:5: ( function_expression )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:131:5: function_expression
        {
        pushFollow(FOLLOW_function_expression_in_synpred32_OmttParser790);
        function_expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_OmttParser

    // $ANTLR start synpred103_OmttParser
    public final void synpred103_OmttParser_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:438:5: ( sequence_selectors )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:438:5: sequence_selectors
        {
        pushFollow(FOLLOW_sequence_selectors_in_synpred103_OmttParser3166);
        sequence_selectors();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred103_OmttParser

    // $ANTLR start synpred104_OmttParser
    public final void synpred104_OmttParser_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:445:5: ( sequence_selectors )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:445:5: sequence_selectors
        {
        pushFollow(FOLLOW_sequence_selectors_in_synpred104_OmttParser3212);
        sequence_selectors();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_OmttParser

    // $ANTLR start synpred105_OmttParser
    public final void synpred105_OmttParser_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:451:11: ( sequence_selectors )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:451:11: sequence_selectors
        {
        pushFollow(FOLLOW_sequence_selectors_in_synpred105_OmttParser3254);
        sequence_selectors();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_OmttParser

    // $ANTLR start synpred106_OmttParser
    public final void synpred106_OmttParser_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:454:18: ( sequence_selector )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:454:18: sequence_selector
        {
        pushFollow(FOLLOW_sequence_selector_in_synpred106_OmttParser3269);
        sequence_selector();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_OmttParser

    // Delegated rules

    public final boolean synpred103_OmttParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred103_OmttParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred104_OmttParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_OmttParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred105_OmttParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred105_OmttParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_OmttParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_OmttParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_OmttParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_OmttParser_fragment(); // can never throw exception
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
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA81 dfa81 = new DFA81(this);
    static final String DFA23_eotS =
        "\30\uffff";
    static final String DFA23_eofS =
        "\30\uffff";
    static final String DFA23_minS =
        "\1\35\6\uffff\1\0\2\uffff\3\0\13\uffff";
    static final String DFA23_maxS =
        "\1\156\6\uffff\1\0\2\uffff\3\0\13\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\7\uffff\1\6\12\uffff";
    static final String DFA23_specialS =
        "\7\uffff\1\0\2\uffff\1\1\1\2\1\3\13\uffff}>";
    static final String[] DFA23_transitionS = {
            "\3\15\3\uffff\1\15\17\uffff\1\1\3\uffff\1\2\4\uffff\1\3\1\15"+
            "\1\4\3\uffff\1\5\3\15\2\uffff\1\5\10\uffff\1\15\1\5\1\13\1\uffff"+
            "\1\14\2\uffff\1\15\13\uffff\1\15\3\uffff\1\12\3\uffff\1\7\1"+
            "\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "126:1: expression : ( def_in_expression | if_expression | map_expression | match_expression | function_expression | context_expression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_7 = input.LA(1);

                         
                        int index23_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_OmttParser()) ) {s = 5;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index23_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_10 = input.LA(1);

                         
                        int index23_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_OmttParser()) ) {s = 5;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index23_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_11 = input.LA(1);

                         
                        int index23_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_OmttParser()) ) {s = 5;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index23_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_12 = input.LA(1);

                         
                        int index23_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_OmttParser()) ) {s = 5;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index23_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\63\uffff";
    static final String DFA78_eofS =
        "\1\3\62\uffff";
    static final String DFA78_minS =
        "\1\35\2\0\60\uffff";
    static final String DFA78_maxS =
        "\1\154\2\0\60\uffff";
    static final String DFA78_acceptS =
        "\3\uffff\1\2\56\uffff\1\1";
    static final String DFA78_specialS =
        "\1\uffff\1\0\1\1\60\uffff}>";
    static final String[] DFA78_transitionS = {
            "\7\3\2\uffff\2\3\15\uffff\2\3\2\uffff\2\3\1\uffff\5\3\2\uffff"+
            "\3\3\2\uffff\1\3\2\uffff\2\3\1\1\1\uffff\3\3\1\uffff\2\3\1\2"+
            "\13\3\1\uffff\2\3\1\uffff\1\3\1\uffff\2\3\3\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "438:3: ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_1 = input.LA(1);

                         
                        int index78_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_OmttParser()) ) {s = 50;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index78_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA78_2 = input.LA(1);

                         
                        int index78_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_OmttParser()) ) {s = 50;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index78_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA79_eotS =
        "\63\uffff";
    static final String DFA79_eofS =
        "\1\3\62\uffff";
    static final String DFA79_minS =
        "\1\35\2\0\60\uffff";
    static final String DFA79_maxS =
        "\1\154\2\0\60\uffff";
    static final String DFA79_acceptS =
        "\3\uffff\1\2\56\uffff\1\1";
    static final String DFA79_specialS =
        "\1\uffff\1\0\1\1\60\uffff}>";
    static final String[] DFA79_transitionS = {
            "\7\3\2\uffff\2\3\15\uffff\2\3\2\uffff\2\3\1\uffff\5\3\2\uffff"+
            "\3\3\2\uffff\1\3\2\uffff\2\3\1\1\1\uffff\3\3\1\uffff\2\3\1\2"+
            "\13\3\1\uffff\2\3\1\uffff\1\3\1\uffff\2\3\3\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "445:3: ( sequence_selectors -> ^( ATOM_SELECT object sequence_selectors ) | -> object )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_OmttParser()) ) {s = 50;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_2 = input.LA(1);

                         
                        int index79_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_OmttParser()) ) {s = 50;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index79_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA80_eotS =
        "\63\uffff";
    static final String DFA80_eofS =
        "\1\3\62\uffff";
    static final String DFA80_minS =
        "\1\35\2\0\60\uffff";
    static final String DFA80_maxS =
        "\1\154\2\0\60\uffff";
    static final String DFA80_acceptS =
        "\3\uffff\1\2\56\uffff\1\1";
    static final String DFA80_specialS =
        "\1\uffff\1\0\1\1\60\uffff}>";
    static final String[] DFA80_transitionS = {
            "\7\3\2\uffff\2\3\15\uffff\2\3\2\uffff\2\3\1\uffff\5\3\2\uffff"+
            "\3\3\2\uffff\1\3\2\uffff\2\3\1\1\1\uffff\3\3\1\uffff\2\3\1\2"+
            "\13\3\1\uffff\2\3\1\uffff\1\3\1\uffff\2\3\3\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "451:11: ( sequence_selectors )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_1 = input.LA(1);

                         
                        int index80_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_OmttParser()) ) {s = 50;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index80_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA80_2 = input.LA(1);

                         
                        int index80_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_OmttParser()) ) {s = 50;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index80_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA81_eotS =
        "\63\uffff";
    static final String DFA81_eofS =
        "\1\2\62\uffff";
    static final String DFA81_minS =
        "\1\35\1\0\61\uffff";
    static final String DFA81_maxS =
        "\1\154\1\0\61\uffff";
    static final String DFA81_acceptS =
        "\2\uffff\1\2\57\uffff\1\1";
    static final String DFA81_specialS =
        "\1\uffff\1\0\61\uffff}>";
    static final String[] DFA81_transitionS = {
            "\7\2\2\uffff\2\2\15\uffff\2\2\2\uffff\2\2\1\uffff\5\2\2\uffff"+
            "\3\2\2\uffff\1\2\2\uffff\3\2\1\uffff\3\2\1\uffff\2\2\1\1\13"+
            "\2\1\uffff\2\2\1\uffff\1\2\1\uffff\2\2\3\uffff\1\2",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "454:18: ( sequence_selector )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_1 = input.LA(1);

                         
                        int index81_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_OmttParser()) ) {s = 50;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index81_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_header_in_program62 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_definitions_in_program64 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_declaration_in_header102 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_import_declarations_in_header109 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_use_declarations_in_header115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_module_declaration128 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_MODULE_in_module_declaration130 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_module_id_in_module_declaration132 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_module_declaration134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_import_declarations164 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_import_declaration_in_import_declarations167 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_import_declarations170 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_TAG_START_in_use_declarations202 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_use_declaration_in_use_declarations205 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_use_declarations208 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_declaration239 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_module_id_in_import_declaration241 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_AS_in_import_declaration244 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_import_declaration246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_use_declaration283 = new BitSet(new long[]{0x0000000000000000L,0x0000510000000000L});
    public static final BitSet FOLLOW_external_class_name_in_use_declaration287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_external_class_name320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_external_class_name322 = new BitSet(new long[]{0x0000000000000000L,0x0000510000000000L});
    public static final BitSet FOLLOW_set_in_external_class_name327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_module_id348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_module_id350 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_module_id355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_definition_in_definitions371 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_TAG_START_in_tag_definition394 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_DEF_in_tag_definition396 = new BitSet(new long[]{0x0010000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_definition_signature_in_tag_definition398 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_tag_content_in_tag_definition404 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_tag_definition408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARTIAL_in_definition_signature440 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_signature443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_definition_context_in_definition_signature445 = new BitSet(new long[]{0x0000000000000002L,0x0000100000040100L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_signature449 = new BitSet(new long[]{0x0000000000000002L,0x0000100000040100L});
    public static final BitSet FOLLOW_definition_argument_in_definition_signature452 = new BitSet(new long[]{0x0000000000000002L,0x0000100000040100L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_definition_signature456 = new BitSet(new long[]{0x0000000000000000L,0x0000410000280000L});
    public static final BitSet FOLLOW_type_in_definition_signature460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_definition_context507 = new BitSet(new long[]{0x0000000000000000L,0x0000410000280000L});
    public static final BitSet FOLLOW_single_type_in_definition_context509 = new BitSet(new long[]{0x8000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_where_clause_in_definition_context511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_definition_context514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where_clause540 = new BitSet(new long[]{0x30880008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_safe_expression_in_where_clause543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_definition_argument557 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_argument562 = new BitSet(new long[]{0x0000000000000002L,0x0000000002002000L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_definition_argument564 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_definition_argument568 = new BitSet(new long[]{0x0000000000000000L,0x0000410000280000L});
    public static final BitSet FOLLOW_type_in_definition_argument570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content616 = new BitSet(new long[]{0x0000002220000002L});
    public static final BitSet FOLLOW_data_body_atom_in_tag_content622 = new BitSet(new long[]{0x0000002220000002L});
    public static final BitSet FOLLOW_OP_DATA_IS_EXPRESSION_in_tag_content645 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content647 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_expression_in_tag_content653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_data_body_atom674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_inside_data_in_data_body_atom684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_inside_data_in_data_body_atom690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_START_in_expression_inside_data705 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_expression_in_expression_inside_data708 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EXPRESSION_END_in_expression_inside_data710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_tag_in_tag_inside_data726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_tag_in_tag_inside_data732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_tag_in_tag_inside_data738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_tag_in_tag_inside_data744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_apply_tag_in_tag_inside_data750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_expression_in_expression766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expression_in_expression772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_expression_in_expression778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expression_in_expression784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_expression_in_expression790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_context_expression_in_expression796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safe_def_in_expression_in_safe_expression809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safe_if_expression_in_safe_expression815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safe_map_expression_in_safe_expression821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strict_expression_in_safe_expression827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_def_in_expression841 = new BitSet(new long[]{0x0010000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression845 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_TOO_in_def_in_expression852 = new BitSet(new long[]{0x0010000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression856 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_expression864 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E093CL});
    public static final BitSet FOLLOW_COLON_in_def_in_expression866 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_expression_in_def_in_expression871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_safe_def_in_expression903 = new BitSet(new long[]{0x0010000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_safe_def_in_expression907 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_TOO_in_safe_def_in_expression914 = new BitSet(new long[]{0x0010000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_safe_def_in_expression918 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_IN_in_safe_def_in_expression926 = new BitSet(new long[]{0x30880008E0000000L,0x00001110012A0838L});
    public static final BitSet FOLLOW_COLON_in_safe_def_in_expression928 = new BitSet(new long[]{0x30880008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_safe_expression_in_safe_def_in_expression933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_expression965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COLON_in_definition_inside_expression967 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_expression996 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_expression998 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag1036 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_DEF_in_def_in_tag1038 = new BitSet(new long[]{0x0010000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag1042 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag1049 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOO_in_def_in_tag1051 = new BitSet(new long[]{0x0010000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag1055 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag1063 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_tag1065 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_tag_content_in_def_in_tag1069 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_def_in_tag1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_tag1107 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_tag_content_in_definition_inside_tag1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_tag1135 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_tag1137 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_expression_in_definition_inside_tag1139 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_CONTENT_in_definition_inside_tag1142 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_definition_inside_tag1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUN_in_function_expression1183 = new BitSet(new long[]{0x0000000000000000L,0x0000100000040800L});
    public static final BitSet FOLLOW_definition_argument_in_function_expression1185 = new BitSet(new long[]{0x0000000000000000L,0x0000100000040800L});
    public static final BitSet FOLLOW_COLON_in_function_expression1188 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_expression_in_function_expression1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_argument_in_function_expression1218 = new BitSet(new long[]{0x0000000000000000L,0x0000100000040100L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_function_expression1221 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_expression_in_function_expression1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_match_expression_in_function_expression1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_lambda_match_in_lambda_match_expression1263 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMICOLON_in_lambda_match_expression1266 = new BitSet(new long[]{0x0000000000000000L,0x00005100002C0104L});
    public static final BitSet FOLLOW_single_lambda_match_in_lambda_match_expression1268 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_single_type_in_single_lambda_match1296 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_where_clause_in_single_lambda_match1298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_single_lambda_match1301 = new BitSet(new long[]{0x30880008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_safe_expression_in_single_lambda_match1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_content_in_type1333 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_type1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_content_in_single_type1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_ID_in_type_content1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GENERAL_in_type_content1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_type_content1406 = new BitSet(new long[]{0x0000000000000000L,0x00005100002C0000L});
    public static final BitSet FOLLOW_argument_type_in_type_content1408 = new BitSet(new long[]{0x0000000000000000L,0x00005100002C0100L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_type_content1411 = new BitSet(new long[]{0x0000000000000000L,0x0000410000280000L});
    public static final BitSet FOLLOW_type_in_type_content1413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_type_content1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_type_content1435 = new BitSet(new long[]{0x0000000000000000L,0x0000410000280000L});
    public static final BitSet FOLLOW_type_in_type_content1439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_type_content1442 = new BitSet(new long[]{0x0000000000000000L,0x0000410000280000L});
    public static final BitSet FOLLOW_type_in_type_content1446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000408000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_type_content1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_type_content1473 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_record_item_type_in_type_content1477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000408000L});
    public static final BitSet FOLLOW_COMMA_in_type_content1480 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_record_item_type_in_type_content1484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000408000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_type_content1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_argument_type1517 = new BitSet(new long[]{0x0000000000000000L,0x0000510000280000L});
    public static final BitSet FOLLOW_VAR_ID_in_argument_type1521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_argument_type1523 = new BitSet(new long[]{0x0000000000000000L,0x0000410000280000L});
    public static final BitSet FOLLOW_type_in_argument_type1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_record_item_type1555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_record_item_type1557 = new BitSet(new long[]{0x0000000000000000L,0x0000410000280000L});
    public static final BitSet FOLLOW_type_in_record_item_type1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_expression1575 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_context_expression_in_if_expression1579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COLON_in_if_expression1581 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_expression_in_if_expression1589 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_expression1595 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E093CL});
    public static final BitSet FOLLOW_COLON_in_if_expression1597 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_expression_in_if_expression1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_safe_if_expression1640 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_context_expression_in_safe_if_expression1644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COLON_in_safe_if_expression1646 = new BitSet(new long[]{0x30880008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_safe_expression_in_safe_if_expression1654 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ELSE_in_safe_if_expression1660 = new BitSet(new long[]{0x30880008E0000000L,0x00001110012A0838L});
    public static final BitSet FOLLOW_COLON_in_safe_if_expression1662 = new BitSet(new long[]{0x30880008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_safe_expression_in_safe_if_expression1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_if_tag1705 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_if_subtag_in_if_tag1711 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_if_tag1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_subtag1733 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_context_expression_in_if_subtag1737 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_tag_content_in_if_subtag1745 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_TAG_START_in_if_subtag1755 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_subtag1757 = new BitSet(new long[]{0x0080008100000000L});
    public static final BitSet FOLLOW_tag_content_in_if_subtag1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_subtag_in_if_subtag1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_map_expression1814 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_item_alias_in_map_expression1816 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_context_expression_in_map_expression1821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COLON_in_map_expression1823 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_expression_in_map_expression1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_safe_map_expression1865 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_item_alias_in_safe_map_expression1867 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_context_expression_in_safe_map_expression1872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COLON_in_safe_map_expression1874 = new BitSet(new long[]{0x30880008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_safe_expression_in_safe_map_expression1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_map_tag1916 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_MAP_in_map_tag1918 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_item_alias_in_map_tag1920 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_context_expression_in_map_tag1925 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_tag_content_in_map_tag1933 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_map_tag1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_item_alias1975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_OP_REVERSE_FOLLOW_in_item_alias1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_match_expression1999 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_context_expression_in_match_expression2003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COLON_in_match_expression2005 = new BitSet(new long[]{0x0000000000000000L,0x00005100002C0104L});
    public static final BitSet FOLLOW_lambda_match_expression_in_match_expression2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strict_expression_in_context_expression2058 = new BitSet(new long[]{0xF000000000000002L,0x0000002000000001L});
    public static final BitSet FOLLOW_op_apply_in_context_expression2070 = new BitSet(new long[]{0x00000008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_atom_expression_in_context_expression2072 = new BitSet(new long[]{0xF0000008E0000000L,0x00001130012A0039L});
    public static final BitSet FOLLOW_function_arguments_in_context_expression2076 = new BitSet(new long[]{0xF000000000000002L,0x0000002000000001L});
    public static final BitSet FOLLOW_op_map_in_context_expression2114 = new BitSet(new long[]{0x30880008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_safe_expression_in_context_expression2118 = new BitSet(new long[]{0xF000000000000002L,0x0000002000000001L});
    public static final BitSet FOLLOW_WHERE_in_context_expression2141 = new BitSet(new long[]{0x30880008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_safe_expression_in_context_expression2143 = new BitSet(new long[]{0xF000000000000002L,0x0000002000000001L});
    public static final BitSet FOLLOW_ORDER_in_context_expression2172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_BY_in_context_expression2174 = new BitSet(new long[]{0x30880008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_safe_expression_in_context_expression2176 = new BitSet(new long[]{0xF000000000000002L,0x0000002000000001L});
    public static final BitSet FOLLOW_MATCH_in_context_expression2205 = new BitSet(new long[]{0x0000000000000000L,0x00005100002C0104L});
    public static final BitSet FOLLOW_lambda_match_expression_in_context_expression2207 = new BitSet(new long[]{0xF000000000000002L,0x0000002000000001L});
    public static final BitSet FOLLOW_OP_CONTEXT_in_op_apply2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_op_apply2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_op_map2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_apply_expression2288 = new BitSet(new long[]{0x00000008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_atom_expression_in_apply_expression2290 = new BitSet(new long[]{0x00000008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_function_arguments_in_apply_expression2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_apply_tag2337 = new BitSet(new long[]{0x30880008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_apply_expression_in_apply_tag2340 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_apply_tag2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concatence_expression_in_strict_expression2359 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_AS_in_strict_expression2371 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_strict_expression2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_concatence_expression2410 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_OP_CONCAT_in_concatence_expression2424 = new BitSet(new long[]{0x00000008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_boolean_expression_in_concatence_expression2428 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_apply_expression_in_concatence_expression2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_binary_expression_in_boolean_expression2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression2476 = new BitSet(new long[]{0x0000000000000002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_boolean_binary_operator_in_boolean_binary_expression2479 = new BitSet(new long[]{0x00000008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression2482 = new BitSet(new long[]{0x0000000000000002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_boolean_unary_operator_in_boolean_unary_expression2498 = new BitSet(new long[]{0x00000008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_AND_in_boolean_binary_operator2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_OR_in_boolean_binary_operator2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_in_boolean_unary_operator2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression2567 = new BitSet(new long[]{0x0000000000000002L,0x00000001F8000000L});
    public static final BitSet FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression2570 = new BitSet(new long[]{0x00000008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression2573 = new BitSet(new long[]{0x0000000000000002L,0x00000001F8000000L});
    public static final BitSet FOLLOW_OP_EQUAL_in_boolean_comparsion_operator2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LE_in_boolean_comparsion_operator2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LEQ_in_boolean_comparsion_operator2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GE_in_boolean_comparsion_operator2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GEQ_in_boolean_comparsion_operator2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2659 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_OP_PLUS_in_additive_expression2675 = new BitSet(new long[]{0x00000008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_OP_MINUS_in_additive_expression2689 = new BitSet(new long[]{0x00000008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2709 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression2729 = new BitSet(new long[]{0x0000000000000002L,0x0000000006010000L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_multiplicative_expression2739 = new BitSet(new long[]{0x00000008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_SLASH_in_multiplicative_expression2753 = new BitSet(new long[]{0x00000008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_OP_MODULO_in_multiplicative_expression2767 = new BitSet(new long[]{0x00000008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression2787 = new BitSet(new long[]{0x0000000000000002L,0x0000000006010000L});
    public static final BitSet FOLLOW_OP_MINUS_in_negative_expression2806 = new BitSet(new long[]{0x00000008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_functional_expression_in_negative_expression2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functional_expression_in_negative_expression2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_expression_in_functional_expression2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expression_in_call_expression2853 = new BitSet(new long[]{0x00000008E0000002L,0x00001110012A0038L});
    public static final BitSet FOLLOW_function_argument_in_call_expression2861 = new BitSet(new long[]{0x00000008E0000002L,0x00001110012A0038L});
    public static final BitSet FOLLOW_TAG_START_in_call_tag2921 = new BitSet(new long[]{0x0000000000000000L,0x0000110000000000L});
    public static final BitSet FOLLOW_namespace_id_in_call_tag2925 = new BitSet(new long[]{0x0000008DE0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_tag_content_in_call_tag2935 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_function_argument_in_call_tag2941 = new BitSet(new long[]{0x0000008DE0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_tag_content_in_call_tag2947 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_call_tag3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_argument_in_function_arguments3016 = new BitSet(new long[]{0x00000008E0000002L,0x00001110012A0038L});
    public static final BitSet FOLLOW_VAR_ID_in_function_argument3032 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_function_argument3034 = new BitSet(new long[]{0x00000008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_atom_expression_in_function_argument3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_with_selectors_in_atom_expression3074 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_atom_expression3087 = new BitSet(new long[]{0x00000008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_expression_select_in_atom_expression3091 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_atom_expression3118 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_property_select_in_atom_expression3122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_atom_in_atom_with_selectors3160 = new BitSet(new long[]{0x0000000000000002L,0x0000000000202000L});
    public static final BitSet FOLLOW_sequence_selectors_in_atom_with_selectors3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_expression_select3206 = new BitSet(new long[]{0x0000000000000002L,0x0000000000202000L});
    public static final BitSet FOLLOW_sequence_selectors_in_expression_select3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_property_select3252 = new BitSet(new long[]{0x0000000000000002L,0x0000000000202000L});
    public static final BitSet FOLLOW_sequence_selectors_in_property_select3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_selector_in_sequence_selectors3267 = new BitSet(new long[]{0x0000000000000002L,0x0000000000202000L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_type_selector3288 = new BitSet(new long[]{0x0000000000000000L,0x0000410000280000L});
    public static final BitSet FOLLOW_single_type_in_type_selector3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector3315 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_expression_in_sequence_selector3317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_START_in_data_expression3343 = new BitSet(new long[]{0x0000003220000000L});
    public static final BitSet FOLLOW_data_body_atom_in_data_expression3345 = new BitSet(new long[]{0x0000003220000000L});
    public static final BitSet FOLLOW_DATA_END_in_data_expression3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectable_atom_in_atom3376 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_DOUBLE_DOT_in_atom3381 = new BitSet(new long[]{0x00000008E0000000L,0x00001110012A0038L});
    public static final BitSet FOLLOW_selectable_atom_in_atom3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_id_in_selectable_atom3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_selectable_atom3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_atom_in_object3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_expression_in_object3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tuple_in_object3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_record_in_object3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_object3443 = new BitSet(new long[]{0x70880008E0000000L,0x00005110013E013CL});
    public static final BitSet FOLLOW_sequence_expression_in_object3446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_object3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id3466 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_OP_VIEW_in_namespace_id3468 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id3501 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_OP_VIEW_in_namespace_id3503 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_OP_GENERAL_in_namespace_id3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_tuple3539 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_expression_in_tuple3543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000408000L});
    public static final BitSet FOLLOW_COMMA_in_tuple3546 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_expression_in_tuple3550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000408000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_tuple3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_record3580 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_record_item_in_record3584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000408000L});
    public static final BitSet FOLLOW_COMMA_in_record3587 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_record_item_in_record3591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000408000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_record3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_record_item3622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COLON_in_record_item3624 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_expression_in_record_item3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_sequence_expression3641 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_sequence_expression3654 = new BitSet(new long[]{0x70880008E0000000L,0x00005110012E013CL});
    public static final BitSet FOLLOW_expression_in_sequence_expression3658 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_number_atom_in_object_atom3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_object_atom3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_object_atom3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_object_atom3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_object_atom3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_object_atom3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_NUMBER_in_number_atom3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_NUMBER_in_number_atom3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_expression_in_synpred32_OmttParser790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selectors_in_synpred103_OmttParser3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selectors_in_synpred104_OmttParser3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selectors_in_synpred105_OmttParser3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selector_in_synpred106_OmttParser3269 = new BitSet(new long[]{0x0000000000000002L});

}