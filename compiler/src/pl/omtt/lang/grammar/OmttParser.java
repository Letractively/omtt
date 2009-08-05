// $ANTLR 3.1.2 /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g 2009-08-04 10:21:05

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "HEADER", "USE", "USES", "IMPORT", "IMPORTS", "TYPE", "IDENT", "ATOM_SELECT", "PROPERTY_SELECT", "TYPE_SELECT", "SEQUENCE_SELECT", "ITERATE", "LAMBDA_MATCH", "ARGUMENTS", "ARGUMENT", "RETURNS", "BLOCK", "IF_ELSE", "CALL", "CAST", "SEQUENCE", "TUPLE", "RECORD", "FUNCTION", "STRING_LITERAL", "INT_NUMBER", "REAL_NUMBER", "CONTENT", "TAG_START", "TAG_END", "DATA_START", "DATA_END", "EXPRESSION_START", "EXPRESSION_END", "OP_DATA_IS_EXPRESSION", "IT", "ITEM", "COMMENT_SINGLE_LINE", "COMMENT_MULTI_LINE", "WS", "NEWLINE", "ACTION_ON_NEWLINE", "STRING_PARENS", "MODE_LEFT_PAREN", "MODE_RIGHT_PAREN", "MODULE", "DEF", "AND", "IN", "IF", "THEN", "ELSE", "AS", "IS", "MAP", "APPLY", "MATCH", "WHERE", "ORDER", "BY", "LAMBDA", "NULL", "TRUE", "FALSE", "INNER_TAG_KEYWORD", "SINGLE_TAG_KEYWORD", "OP_FOLLOW", "OP_REVERSE_FOLLOW", "OP_DOUBLE_FOLLOW", "COLON", "SEMICOLON", "DOT", "DOUBLE_DOT", "COMMA", "SLASH", "TILDE", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_SQUARE_PAREN", "RIGHT_SQUARE_PAREN", "OP_PLUS", "OP_MINUS", "OP_MULTIPLY", "OP_MODULO", "OP_EQUAL", "OP_NOT_EQUAL", "OP_LEQ", "OP_LE", "OP_GEQ", "OP_GE", "OP_ASSIGN", "OP_AND", "OP_OR", "OP_NOT", "OP_CONTEXT", "OP_VIEW", "OP_CONCAT", "OP_GENERAL", "OP_DATA", "SMALL_LETTER", "NAMECHAR", "VAR_ID", "BIG_LETTER", "CLASS_ID", "DIGIT", "INT_OR_REAL_NUMBER", "LETTER", "NOT_NAME"
    };
    public static final int CAST=24;
    public static final int FUNCTION=28;
    public static final int OP_LE=92;
    public static final int INT_NUMBER=30;
    public static final int OP_REVERSE_FOLLOW=72;
    public static final int OP_AND=96;
    public static final int INT_OR_REAL_NUMBER=110;
    public static final int LETTER=111;
    public static final int OP_GEQ=93;
    public static final int OP_GE=94;
    public static final int EOF=-1;
    public static final int DOUBLE_DOT=77;
    public static final int TYPE=10;
    public static final int TUPLE=26;
    public static final int IMPORT=8;
    public static final int STRING_LITERAL=29;
    public static final int OP_MINUS=86;
    public static final int MODE_LEFT_PAREN=48;
    public static final int OP_NOT_EQUAL=90;
    public static final int SEQUENCE_SELECT=15;
    public static final int RECORD=27;
    public static final int VAR_ID=106;
    public static final int ARGUMENTS=18;
    public static final int NULL=66;
    public static final int ELSE=56;
    public static final int MATCH=61;
    public static final int SEMICOLON=75;
    public static final int SINGLE_TAG_KEYWORD=70;
    public static final int MODE_RIGHT_PAREN=49;
    public static final int CONTENT=32;
    public static final int DATA_START=35;
    public static final int EXPRESSION_START=37;
    public static final int NAMECHAR=105;
    public static final int SEQUENCE=25;
    public static final int INNER_TAG_KEYWORD=69;
    public static final int WS=44;
    public static final int OP_DATA=103;
    public static final int USES=7;
    public static final int REAL_NUMBER=31;
    public static final int LEFT_PAREN=81;
    public static final int IMPORTS=9;
    public static final int OP_EQUAL=89;
    public static final int CALL=23;
    public static final int OP_DATA_IS_EXPRESSION=39;
    public static final int USE=6;
    public static final int FALSE=68;
    public static final int STRING_PARENS=47;
    public static final int COMMENT_SINGLE_LINE=42;
    public static final int CLASS_ID=108;
    public static final int OP_CONCAT=101;
    public static final int SMALL_LETTER=104;
    public static final int APPLY=60;
    public static final int WHERE=62;
    public static final int DEF=51;
    public static final int OP_ASSIGN=95;
    public static final int OP_FOLLOW=71;
    public static final int OP_OR=97;
    public static final int EXPRESSION_END=38;
    public static final int ORDER=63;
    public static final int TYPE_SELECT=14;
    public static final int AND=52;
    public static final int DATA_END=36;
    public static final int IF_ELSE=22;
    public static final int IF=54;
    public static final int COMMENT_MULTI_LINE=43;
    public static final int AS=57;
    public static final int RIGHT_PAREN=82;
    public static final int BIG_LETTER=107;
    public static final int SLASH=79;
    public static final int IN=53;
    public static final int THEN=55;
    public static final int LEFT_SQUARE_PAREN=83;
    public static final int COMMA=78;
    public static final int IS=58;
    public static final int IT=40;
    public static final int TAG_START=33;
    public static final int ARGUMENT=19;
    public static final int RIGHT_SQUARE_PAREN=84;
    public static final int TILDE=80;
    public static final int OP_GENERAL=102;
    public static final int IDENT=11;
    public static final int OP_NOT=98;
    public static final int OP_DOUBLE_FOLLOW=73;
    public static final int DIGIT=109;
    public static final int LAMBDA=65;
    public static final int HEADER=5;
    public static final int DOT=76;
    public static final int NOT_NAME=112;
    public static final int OP_MULTIPLY=87;
    public static final int RETURNS=20;
    public static final int BY=64;
    public static final int OP_PLUS=85;
    public static final int ITEM=41;
    public static final int ATOM_SELECT=12;
    public static final int MODULE=50;
    public static final int TRUE=67;
    public static final int OP_VIEW=100;
    public static final int OP_MODULO=88;
    public static final int COLON=74;
    public static final int ITERATE=16;
    public static final int TAG_END=34;
    public static final int NEWLINE=45;
    public static final int BLOCK=21;
    public static final int MAP=59;
    public static final int PROPERTY_SELECT=13;
    public static final int OP_CONTEXT=99;
    public static final int ACTION_ON_NEWLINE=46;
    public static final int PROGRAM=4;
    public static final int OP_LEQ=91;
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
            // elements: header, definitions
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:25:1: header : ( module_declaration )? use_declarations import_declarations ;
    public final OmttParser.header_return header() throws RecognitionException {
        OmttParser.header_return retval = new OmttParser.header_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.module_declaration_return module_declaration4 = null;

        OmttParser.use_declarations_return use_declarations5 = null;

        OmttParser.import_declarations_return import_declarations6 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:26:3: ( ( module_declaration )? use_declarations import_declarations )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:26:5: ( module_declaration )? use_declarations import_declarations
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

            pushFollow(FOLLOW_use_declarations_in_header109);
            use_declarations5=use_declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, use_declarations5.getTree());
            pushFollow(FOLLOW_import_declarations_in_header115);
            import_declarations6=import_declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, import_declarations6.getTree());

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

    public static class use_declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "use_declarations"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:35:1: use_declarations : ( ( TAG_START ( use_declaration ) TAG_END )+ )? -> ( ^( USES ( use_declaration )+ ) )? ;
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:3: ( ( ( TAG_START ( use_declaration ) TAG_END )+ )? -> ( ^( USES ( use_declaration )+ ) )? )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:5: ( ( TAG_START ( use_declaration ) TAG_END )+ )?
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:5: ( ( TAG_START ( use_declaration ) TAG_END )+ )?
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:6: ( TAG_START ( use_declaration ) TAG_END )+
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:6: ( TAG_START ( use_declaration ) TAG_END )+
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
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:7: TAG_START ( use_declaration ) TAG_END
                    	    {
                    	    TAG_START11=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_use_declarations164); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START11);

                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:17: ( use_declaration )
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:36:18: use_declaration
                    	    {
                    	    pushFollow(FOLLOW_use_declaration_in_use_declarations167);
                    	    use_declaration12=use_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_use_declaration.add(use_declaration12.getTree());

                    	    }

                    	    TAG_END13=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_use_declarations170); if (state.failed) return retval; 
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
            // 37:5: -> ( ^( USES ( use_declaration )+ ) )?
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:37:8: ( ^( USES ( use_declaration )+ ) )?
                if ( stream_use_declaration.hasNext() ) {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:37:8: ^( USES ( use_declaration )+ )
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

    public static class import_declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "import_declarations"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:39:1: import_declarations : ( ( TAG_START ( import_declaration ) TAG_END )+ )? -> ( ^( IMPORTS ( import_declaration )+ ) )? ;
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:3: ( ( ( TAG_START ( import_declaration ) TAG_END )+ )? -> ( ^( IMPORTS ( import_declaration )+ ) )? )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:5: ( ( TAG_START ( import_declaration ) TAG_END )+ )?
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:5: ( ( TAG_START ( import_declaration ) TAG_END )+ )?
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:6: ( TAG_START ( import_declaration ) TAG_END )+
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:6: ( TAG_START ( import_declaration ) TAG_END )+
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
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:7: TAG_START ( import_declaration ) TAG_END
                    	    {
                    	    TAG_START14=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_import_declarations202); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START14);

                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:17: ( import_declaration )
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:40:18: import_declaration
                    	    {
                    	    pushFollow(FOLLOW_import_declaration_in_import_declarations205);
                    	    import_declaration15=import_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_import_declaration.add(import_declaration15.getTree());

                    	    }

                    	    TAG_END16=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_import_declarations208); if (state.failed) return retval; 
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
            // 41:5: -> ( ^( IMPORTS ( import_declaration )+ ) )?
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:41:8: ( ^( IMPORTS ( import_declaration )+ ) )?
                if ( stream_import_declaration.hasNext() ) {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:41:8: ^( IMPORTS ( import_declaration )+ )
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

    public static class import_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "import_declaration"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:44:1: import_declaration : IMPORT ec= external_class_name -> ^( IMPORT[$IMPORT] $ec) ;
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:45:3: ( IMPORT ec= external_class_name -> ^( IMPORT[$IMPORT] $ec) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:45:5: IMPORT ec= external_class_name
            {
            IMPORT17=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_declaration239); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPORT.add(IMPORT17);

            pushFollow(FOLLOW_external_class_name_in_import_declaration243);
            ec=external_class_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_external_class_name.add(ec.getTree());


            // AST REWRITE
            // elements: IMPORT, ec
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
            // 46:5: -> ^( IMPORT[$IMPORT] $ec)
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:46:8: ^( IMPORT[$IMPORT] $ec)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ImportDeclaration(IMPORT, IMPORT17), root_1);

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
    // $ANTLR end "import_declaration"

    public static class use_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "use_declaration"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:48:1: use_declaration : USE module_id ( AS VAR_ID )? -> ^( USE[$USE] ^( MODULE module_id ) ( VAR_ID )? ) ;
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:49:3: ( USE module_id ( AS VAR_ID )? -> ^( USE[$USE] ^( MODULE module_id ) ( VAR_ID )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:49:5: USE module_id ( AS VAR_ID )?
            {
            USE18=(Token)match(input,USE,FOLLOW_USE_in_use_declaration272); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_USE.add(USE18);

            pushFollow(FOLLOW_module_id_in_use_declaration274);
            module_id19=module_id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_module_id.add(module_id19.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:49:19: ( AS VAR_ID )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==AS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:49:20: AS VAR_ID
                    {
                    AS20=(Token)match(input,AS,FOLLOW_AS_in_use_declaration277); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS20);

                    VAR_ID21=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_use_declaration279); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID21);


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
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 50:5: -> ^( USE[$USE] ^( MODULE module_id ) ( VAR_ID )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:50:8: ^( USE[$USE] ^( MODULE module_id ) ( VAR_ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new UseDeclaration(USE, USE18), root_1);

                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:50:36: ^( MODULE module_id )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MODULE, "MODULE"), root_2);

                adaptor.addChild(root_2, stream_module_id.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:50:56: ( VAR_ID )?
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
            // elements: definition_signature, content, DEF
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:75:10: fragment definition_signature : VAR_ID ( definition_context )? ( definition_argument )* ( OP_FOLLOW ret_type= type )? -> VAR_ID ( definition_context )? ^( ARGUMENTS ( definition_argument )* ) ^( RETURNS ( $ret_type)? ) ;
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:3: ( VAR_ID ( definition_context )? ( definition_argument )* ( OP_FOLLOW ret_type= type )? -> VAR_ID ( definition_context )? ^( ARGUMENTS ( definition_argument )* ) ^( RETURNS ( $ret_type)? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:5: VAR_ID ( definition_context )? ( definition_argument )* ( OP_FOLLOW ret_type= type )?
            {
            VAR_ID33=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_signature439); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID33);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:12: ( definition_context )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LEFT_SQUARE_PAREN) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: definition_context
                    {
                    pushFollow(FOLLOW_definition_context_in_definition_signature441);
                    definition_context34=definition_context();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_definition_context.add(definition_context34.getTree());

                    }
                    break;

            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:32: ( definition_argument )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==TILDE||LA12_0==VAR_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: definition_argument
            	    {
            	    pushFollow(FOLLOW_definition_argument_in_definition_signature444);
            	    definition_argument35=definition_argument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_definition_argument.add(definition_argument35.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:53: ( OP_FOLLOW ret_type= type )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==OP_FOLLOW) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:76:54: OP_FOLLOW ret_type= type
                    {
                    OP_FOLLOW36=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_definition_signature448); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_FOLLOW.add(OP_FOLLOW36);

                    pushFollow(FOLLOW_type_in_definition_signature452);
                    ret_type=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(ret_type.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: definition_argument, definition_context, ret_type, VAR_ID
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
            // 77:5: -> VAR_ID ( definition_context )? ^( ARGUMENTS ( definition_argument )* ) ^( RETURNS ( $ret_type)? )
            {
                adaptor.addChild(root_0, new Ident(stream_VAR_ID.nextToken()));
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:77:22: ( definition_context )?
                if ( stream_definition_context.hasNext() ) {
                    adaptor.addChild(root_0, stream_definition_context.nextTree());

                }
                stream_definition_context.reset();
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:77:42: ^( ARGUMENTS ( definition_argument )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:77:54: ( definition_argument )*
                while ( stream_definition_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_definition_argument.nextTree());

                }
                stream_definition_argument.reset();

                adaptor.addChild(root_0, root_1);
                }
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:77:76: ^( RETURNS ( $ret_type)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURNS, "RETURNS"), root_1);

                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:77:86: ( $ret_type)?
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

        Token LEFT_SQUARE_PAREN37=null;
        Token RIGHT_SQUARE_PAREN40=null;
        OmttParser.single_type_return single_type38 = null;

        OmttParser.where_clause_return where_clause39 = null;


        Object LEFT_SQUARE_PAREN37_tree=null;
        Object RIGHT_SQUARE_PAREN40_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:2: ( LEFT_SQUARE_PAREN single_type ( where_clause )? RIGHT_SQUARE_PAREN -> ^( ARGUMENT single_type ( where_clause )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:4: LEFT_SQUARE_PAREN single_type ( where_clause )? RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN37=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_definition_context496); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN37);

            pushFollow(FOLLOW_single_type_in_definition_context498);
            single_type38=single_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_single_type.add(single_type38.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:34: ( where_clause )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==WHERE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_definition_context500);
                    where_clause39=where_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_where_clause.add(where_clause39.getTree());

                    }
                    break;

            }

            RIGHT_SQUARE_PAREN40=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_definition_context503); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN40);



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

        Token WHERE41=null;
        OmttParser.safe_expression_return safe_expression42 = null;


        Object WHERE41_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:85:2: ( WHERE safe_expression )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:85:4: WHERE safe_expression
            {
            root_0 = (Object)adaptor.nil();

            WHERE41=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clause529); if (state.failed) return retval;
            pushFollow(FOLLOW_safe_expression_in_where_clause532);
            safe_expression42=safe_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, safe_expression42.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:88:10: fragment definition_argument : ( TILDE )? id= VAR_ID ( OP_MULTIPLY )? ( DOT type )? -> ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? ) ;
    public final OmttParser.definition_argument_return definition_argument() throws RecognitionException {
        OmttParser.definition_argument_return retval = new OmttParser.definition_argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        Token TILDE43=null;
        Token OP_MULTIPLY44=null;
        Token DOT45=null;
        OmttParser.type_return type46 = null;


        Object id_tree=null;
        Object TILDE43_tree=null;
        Object OP_MULTIPLY44_tree=null;
        Object DOT45_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_OP_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token OP_MULTIPLY");
        RewriteRuleTokenStream stream_TILDE=new RewriteRuleTokenStream(adaptor,"token TILDE");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:89:3: ( ( TILDE )? id= VAR_ID ( OP_MULTIPLY )? ( DOT type )? -> ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:89:5: ( TILDE )? id= VAR_ID ( OP_MULTIPLY )? ( DOT type )?
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:89:5: ( TILDE )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==TILDE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: TILDE
                    {
                    TILDE43=(Token)match(input,TILDE,FOLLOW_TILDE_in_definition_argument546); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TILDE.add(TILDE43);


                    }
                    break;

            }

            id=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_argument551); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR_ID.add(id);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:89:22: ( OP_MULTIPLY )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==OP_MULTIPLY) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: OP_MULTIPLY
                    {
                    OP_MULTIPLY44=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_definition_argument553); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MULTIPLY.add(OP_MULTIPLY44);


                    }
                    break;

            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:89:35: ( DOT type )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==DOT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:89:36: DOT type
                    {
                    DOT45=(Token)match(input,DOT,FOLLOW_DOT_in_definition_argument557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT45);

                    pushFollow(FOLLOW_type_in_definition_argument559);
                    type46=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type46.getTree());

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
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 90:5: -> ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:90:8: ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TemplateArgument(ARGUMENT), root_1);

                adaptor.addChild(root_1, new Ident(IDENT, id));
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:90:55: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:90:61: ( TILDE )?
                if ( stream_TILDE.hasNext() ) {
                    adaptor.addChild(root_1, stream_TILDE.nextNode());

                }
                stream_TILDE.reset();
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:90:68: ( OP_MULTIPLY )?
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

        Token CONTENT47=null;
        Token OP_DATA_IS_EXPRESSION49=null;
        Token CONTENT50=null;
        OmttParser.data_body_atom_return data_body_atom48 = null;

        OmttParser.expression_return expression51 = null;


        Object CONTENT47_tree=null;
        Object OP_DATA_IS_EXPRESSION49_tree=null;
        Object CONTENT50_tree=null;
        RewriteRuleTokenStream stream_CONTENT=new RewriteRuleTokenStream(adaptor,"token CONTENT");
        RewriteRuleTokenStream stream_OP_DATA_IS_EXPRESSION=new RewriteRuleTokenStream(adaptor,"token OP_DATA_IS_EXPRESSION");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_data_body_atom=new RewriteRuleSubtreeStream(adaptor,"rule data_body_atom");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:97:3: ( CONTENT ( data_body_atom )* -> ^( CONTENT ( data_body_atom )* ) | OP_DATA_IS_EXPRESSION CONTENT expression -> expression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==CONTENT) ) {
                alt19=1;
            }
            else if ( (LA19_0==OP_DATA_IS_EXPRESSION) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:97:5: CONTENT ( data_body_atom )*
                    {
                    CONTENT47=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_tag_content605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTENT.add(CONTENT47);

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:98:5: ( data_body_atom )*
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
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: data_body_atom
                    	    {
                    	    pushFollow(FOLLOW_data_body_atom_in_tag_content611);
                    	    data_body_atom48=data_body_atom();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_data_body_atom.add(data_body_atom48.getTree());

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
                    OP_DATA_IS_EXPRESSION49=(Token)match(input,OP_DATA_IS_EXPRESSION,FOLLOW_OP_DATA_IS_EXPRESSION_in_tag_content634); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DATA_IS_EXPRESSION.add(OP_DATA_IS_EXPRESSION49);

                    CONTENT50=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_tag_content636); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTENT.add(CONTENT50);

                    pushFollow(FOLLOW_expression_in_tag_content642);
                    expression51=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression51.getTree());


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

        Token STRING_LITERAL52=null;
        OmttParser.expression_inside_data_return expression_inside_data53 = null;

        OmttParser.tag_inside_data_return tag_inside_data54 = null;


        Object STRING_LITERAL52_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:106:3: ( STRING_LITERAL | expression_inside_data | tag_inside_data )
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:106:5: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL52=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_data_body_atom663); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL52_tree = new Literal(STRING_LITERAL52) ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_LITERAL52_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:107:5: expression_inside_data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_inside_data_in_data_body_atom673);
                    expression_inside_data53=expression_inside_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_inside_data53.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:108:5: tag_inside_data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tag_inside_data_in_data_body_atom679);
                    tag_inside_data54=tag_inside_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tag_inside_data54.getTree());

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

        Token EXPRESSION_START55=null;
        Token EXPRESSION_END57=null;
        OmttParser.expression_return expression56 = null;


        Object EXPRESSION_START55_tree=null;
        Object EXPRESSION_END57_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:112:3: ( EXPRESSION_START expression EXPRESSION_END )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:112:5: EXPRESSION_START expression EXPRESSION_END
            {
            root_0 = (Object)adaptor.nil();

            EXPRESSION_START55=(Token)match(input,EXPRESSION_START,FOLLOW_EXPRESSION_START_in_expression_inside_data694); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_expression_inside_data697);
            expression56=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression56.getTree());
            EXPRESSION_END57=(Token)match(input,EXPRESSION_END,FOLLOW_EXPRESSION_END_in_expression_inside_data699); if (state.failed) return retval;

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

        OmttParser.def_in_tag_return def_in_tag58 = null;

        OmttParser.if_tag_return if_tag59 = null;

        OmttParser.call_tag_return call_tag60 = null;

        OmttParser.map_tag_return map_tag61 = null;

        OmttParser.apply_tag_return apply_tag62 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:116:3: ( def_in_tag | if_tag | call_tag | map_tag | apply_tag )
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
                case APPLY:
                    {
                    alt21=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:116:5: def_in_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_def_in_tag_in_tag_inside_data715);
                    def_in_tag58=def_in_tag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, def_in_tag58.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:117:5: if_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_tag_in_tag_inside_data721);
                    if_tag59=if_tag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_tag59.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:118:5: call_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_tag_in_tag_inside_data727);
                    call_tag60=call_tag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call_tag60.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:119:5: map_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_tag_in_tag_inside_data733);
                    map_tag61=map_tag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_tag61.getTree());

                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:120:5: apply_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_apply_tag_in_tag_inside_data739);
                    apply_tag62=apply_tag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, apply_tag62.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:126:1: expression : ( def_in_expression | if_expression | map_expression | match_expression | lambda_expression | context_expression );
    public final OmttParser.expression_return expression() throws RecognitionException {
        OmttParser.expression_return retval = new OmttParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.def_in_expression_return def_in_expression63 = null;

        OmttParser.if_expression_return if_expression64 = null;

        OmttParser.map_expression_return map_expression65 = null;

        OmttParser.match_expression_return match_expression66 = null;

        OmttParser.lambda_expression_return lambda_expression67 = null;

        OmttParser.context_expression_return context_expression68 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:127:3: ( def_in_expression | if_expression | map_expression | match_expression | lambda_expression | context_expression )
            int alt22=6;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:127:5: def_in_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_def_in_expression_in_expression755);
                    def_in_expression63=def_in_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, def_in_expression63.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:128:5: if_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_expression_in_expression761);
                    if_expression64=if_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expression64.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:129:5: map_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_expression_in_expression767);
                    map_expression65=map_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_expression65.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:130:5: match_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_match_expression_in_expression773);
                    match_expression66=match_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, match_expression66.getTree());

                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:131:5: lambda_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expression_in_expression779);
                    lambda_expression67=lambda_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expression67.getTree());

                    }
                    break;
                case 6 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:132:5: context_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_context_expression_in_expression785);
                    context_expression68=context_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, context_expression68.getTree());

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

        OmttParser.safe_def_in_expression_return safe_def_in_expression69 = null;

        OmttParser.safe_if_expression_return safe_if_expression70 = null;

        OmttParser.safe_map_expression_return safe_map_expression71 = null;

        OmttParser.strict_expression_return strict_expression72 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:136:3: ( safe_def_in_expression | safe_if_expression | safe_map_expression | strict_expression )
            int alt23=4;
            switch ( input.LA(1) ) {
            case DEF:
                {
                alt23=1;
                }
                break;
            case IF:
                {
                alt23=2;
                }
                break;
            case MAP:
                {
                alt23=3;
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
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:136:5: safe_def_in_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safe_def_in_expression_in_safe_expression798);
                    safe_def_in_expression69=safe_def_in_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safe_def_in_expression69.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:137:5: safe_if_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safe_if_expression_in_safe_expression804);
                    safe_if_expression70=safe_if_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safe_if_expression70.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:138:5: safe_map_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safe_map_expression_in_safe_expression810);
                    safe_map_expression71=safe_map_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safe_map_expression71.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:139:5: strict_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_strict_expression_in_safe_expression816);
                    strict_expression72=strict_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, strict_expression72.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:143:1: def_in_expression : DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.def_in_expression_return def_in_expression() throws RecognitionException {
        OmttParser.def_in_expression_return retval = new OmttParser.def_in_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEF73=null;
        Token AND74=null;
        Token IN75=null;
        Token COLON76=null;
        List list_definition=null;
        OmttParser.expression_return content = null;

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
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_inside_expression=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:144:3: ( DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:144:5: DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression
            {
            DEF73=(Token)match(input,DEF,FOLLOW_DEF_in_def_in_expression830); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEF.add(DEF73);

            pushFollow(FOLLOW_definition_inside_expression_in_def_in_expression834);
            definition=definition_inside_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_definition_inside_expression.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:145:5: ( AND definition+= definition_inside_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:145:6: AND definition+= definition_inside_expression
            	    {
            	    AND74=(Token)match(input,AND,FOLLOW_AND_in_def_in_expression841); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND74);

            	    pushFollow(FOLLOW_definition_inside_expression_in_def_in_expression845);
            	    definition=definition_inside_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_definition_inside_expression.add(definition.getTree());
            	    if (list_definition==null) list_definition=new ArrayList();
            	    list_definition.add(definition.getTree());


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            IN75=(Token)match(input,IN,FOLLOW_IN_in_def_in_expression853); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IN.add(IN75);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:146:8: ( COLON )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==COLON) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: COLON
                    {
                    COLON76=(Token)match(input,COLON,FOLLOW_COLON_in_def_in_expression855); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON76);


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_def_in_expression860);
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:149:1: safe_def_in_expression : DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= safe_expression -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.safe_def_in_expression_return safe_def_in_expression() throws RecognitionException {
        OmttParser.safe_def_in_expression_return retval = new OmttParser.safe_def_in_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEF77=null;
        Token AND78=null;
        Token IN79=null;
        Token COLON80=null;
        List list_definition=null;
        OmttParser.safe_expression_return content = null;

        OmttParser.definition_inside_expression_return definition = null;
         definition = null;
        Object DEF77_tree=null;
        Object AND78_tree=null;
        Object IN79_tree=null;
        Object COLON80_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_safe_expression=new RewriteRuleSubtreeStream(adaptor,"rule safe_expression");
        RewriteRuleSubtreeStream stream_definition_inside_expression=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:150:3: ( DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= safe_expression -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:150:5: DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= safe_expression
            {
            DEF77=(Token)match(input,DEF,FOLLOW_DEF_in_safe_def_in_expression892); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEF.add(DEF77);

            pushFollow(FOLLOW_definition_inside_expression_in_safe_def_in_expression896);
            definition=definition_inside_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_definition_inside_expression.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:151:5: ( AND definition+= definition_inside_expression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==AND) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:151:6: AND definition+= definition_inside_expression
            	    {
            	    AND78=(Token)match(input,AND,FOLLOW_AND_in_safe_def_in_expression903); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND78);

            	    pushFollow(FOLLOW_definition_inside_expression_in_safe_def_in_expression907);
            	    definition=definition_inside_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_definition_inside_expression.add(definition.getTree());
            	    if (list_definition==null) list_definition=new ArrayList();
            	    list_definition.add(definition.getTree());


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            IN79=(Token)match(input,IN,FOLLOW_IN_in_safe_def_in_expression915); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IN.add(IN79);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:152:8: ( COLON )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==COLON) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: COLON
                    {
                    COLON80=(Token)match(input,COLON,FOLLOW_COLON_in_safe_def_in_expression917); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON80);


                    }
                    break;

            }

            pushFollow(FOLLOW_safe_expression_in_safe_def_in_expression922);
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

        Token COLON82=null;
        Token VAR_ID84=null;
        Token OP_ASSIGN85=null;
        OmttParser.definition_signature_return definition_signature81 = null;

        OmttParser.expression_return expression83 = null;

        OmttParser.expression_return expression86 = null;


        Object COLON82_tree=null;
        Object VAR_ID84_tree=null;
        Object OP_ASSIGN85_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_signature=new RewriteRuleSubtreeStream(adaptor,"rule definition_signature");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:156:3: ( definition_signature COLON expression -> ^( DEF definition_signature expression ) | VAR_ID OP_ASSIGN expression -> ^( DEF VAR_ID expression ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==VAR_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==OP_ASSIGN) ) {
                    alt28=2;
                }
                else if ( (LA28_1==OP_FOLLOW||LA28_1==COLON||LA28_1==TILDE||LA28_1==LEFT_SQUARE_PAREN||LA28_1==VAR_ID) ) {
                    alt28=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:156:5: definition_signature COLON expression
                    {
                    pushFollow(FOLLOW_definition_signature_in_definition_inside_expression954);
                    definition_signature81=definition_signature();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_definition_signature.add(definition_signature81.getTree());
                    COLON82=(Token)match(input,COLON,FOLLOW_COLON_in_definition_inside_expression956); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON82);

                    pushFollow(FOLLOW_expression_in_definition_inside_expression962);
                    expression83=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression83.getTree());


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
                    VAR_ID84=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_inside_expression985); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID84);

                    OP_ASSIGN85=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_inside_expression987); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_ASSIGN.add(OP_ASSIGN85);

                    pushFollow(FOLLOW_expression_in_definition_inside_expression992);
                    expression86=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression86.getTree());


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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:164:1: def_in_tag : TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.def_in_tag_return def_in_tag() throws RecognitionException {
        OmttParser.def_in_tag_return retval = new OmttParser.def_in_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START87=null;
        Token DEF88=null;
        Token TAG_START89=null;
        Token AND90=null;
        Token TAG_START91=null;
        Token IN92=null;
        Token TAG_END93=null;
        List list_definition=null;
        OmttParser.tag_content_return content = null;

        OmttParser.definition_inside_tag_return definition = null;
         definition = null;
        Object TAG_START87_tree=null;
        Object DEF88_tree=null;
        Object TAG_START89_tree=null;
        Object AND90_tree=null;
        Object TAG_START91_tree=null;
        Object IN92_tree=null;
        Object TAG_END93_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_definition_inside_tag=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_tag");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:165:3: ( TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:165:5: TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END
            {
            TAG_START87=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag1025); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START87);

            DEF88=(Token)match(input,DEF,FOLLOW_DEF_in_def_in_tag1027); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEF.add(DEF88);

            pushFollow(FOLLOW_definition_inside_tag_in_def_in_tag1031);
            definition=definition_inside_tag();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_definition_inside_tag.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:166:5: ( TAG_START AND definition+= definition_inside_tag )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==TAG_START) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==AND) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:166:6: TAG_START AND definition+= definition_inside_tag
            	    {
            	    TAG_START89=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag1038); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START89);

            	    AND90=(Token)match(input,AND,FOLLOW_AND_in_def_in_tag1040); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND90);

            	    pushFollow(FOLLOW_definition_inside_tag_in_def_in_tag1044);
            	    definition=definition_inside_tag();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_definition_inside_tag.add(definition.getTree());
            	    if (list_definition==null) list_definition=new ArrayList();
            	    list_definition.add(definition.getTree());


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            TAG_START91=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag1052); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START91);

            IN92=(Token)match(input,IN,FOLLOW_IN_in_def_in_tag1054); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IN.add(IN92);

            pushFollow(FOLLOW_tag_content_in_def_in_tag1058);
            content=tag_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tag_content.add(content.getTree());
            TAG_END93=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_def_in_tag1064); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_END.add(TAG_END93);



            // AST REWRITE
            // elements: content, definition
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

        Token VAR_ID95=null;
        Token OP_ASSIGN96=null;
        Token CONTENT98=null;
        Token STRING_LITERAL99=null;
        OmttParser.tag_content_return content = null;

        OmttParser.definition_signature_return definition_signature94 = null;

        OmttParser.expression_return expression97 = null;


        Object VAR_ID95_tree=null;
        Object OP_ASSIGN96_tree=null;
        Object CONTENT98_tree=null;
        Object STRING_LITERAL99_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_CONTENT=new RewriteRuleTokenStream(adaptor,"token CONTENT");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_signature=new RewriteRuleSubtreeStream(adaptor,"rule definition_signature");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:172:3: ( definition_signature content= tag_content -> ^( DEF definition_signature $content) | VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )? -> ^( DEF VAR_ID expression ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==VAR_ID) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==OP_ASSIGN) ) {
                    alt32=2;
                }
                else if ( (LA32_1==CONTENT||LA32_1==OP_DATA_IS_EXPRESSION||LA32_1==OP_FOLLOW||LA32_1==TILDE||LA32_1==LEFT_SQUARE_PAREN||LA32_1==VAR_ID) ) {
                    alt32=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:172:5: definition_signature content= tag_content
                    {
                    pushFollow(FOLLOW_definition_signature_in_definition_inside_tag1096);
                    definition_signature94=definition_signature();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_definition_signature.add(definition_signature94.getTree());
                    pushFollow(FOLLOW_tag_content_in_definition_inside_tag1100);
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
                    VAR_ID95=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_inside_tag1124); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID95);

                    OP_ASSIGN96=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_inside_tag1126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_ASSIGN.add(OP_ASSIGN96);

                    pushFollow(FOLLOW_expression_in_definition_inside_tag1128);
                    expression97=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression97.getTree());
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:174:33: ( CONTENT ( STRING_LITERAL )? )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==CONTENT) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:174:34: CONTENT ( STRING_LITERAL )?
                            {
                            CONTENT98=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_definition_inside_tag1131); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_CONTENT.add(CONTENT98);

                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:174:42: ( STRING_LITERAL )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==STRING_LITERAL) ) {
                                alt30=1;
                            }
                            switch (alt30) {
                                case 1 :
                                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: STRING_LITERAL
                                    {
                                    STRING_LITERAL99=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_definition_inside_tag1133); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL99);


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

    public static class lambda_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lambda_expression"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:181:1: lambda_expression : ( LAMBDA ( definition_argument )* COLON expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | ( definition_argument )* OP_FOLLOW expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | lambda_match_expression );
    public final OmttParser.lambda_expression_return lambda_expression() throws RecognitionException {
        OmttParser.lambda_expression_return retval = new OmttParser.lambda_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAMBDA100=null;
        Token COLON102=null;
        Token OP_FOLLOW105=null;
        OmttParser.definition_argument_return definition_argument101 = null;

        OmttParser.expression_return expression103 = null;

        OmttParser.definition_argument_return definition_argument104 = null;

        OmttParser.expression_return expression106 = null;

        OmttParser.lambda_match_expression_return lambda_match_expression107 = null;


        Object LAMBDA100_tree=null;
        Object COLON102_tree=null;
        Object OP_FOLLOW105_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_LAMBDA=new RewriteRuleTokenStream(adaptor,"token LAMBDA");
        RewriteRuleTokenStream stream_OP_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_FOLLOW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_argument=new RewriteRuleSubtreeStream(adaptor,"rule definition_argument");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:182:3: ( LAMBDA ( definition_argument )* COLON expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | ( definition_argument )* OP_FOLLOW expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | lambda_match_expression )
            int alt35=3;
            switch ( input.LA(1) ) {
            case LAMBDA:
                {
                alt35=1;
                }
                break;
            case OP_FOLLOW:
            case TILDE:
            case VAR_ID:
                {
                alt35=2;
                }
                break;
            case LEFT_PAREN:
            case LEFT_SQUARE_PAREN:
            case OP_GENERAL:
            case CLASS_ID:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:182:5: LAMBDA ( definition_argument )* COLON expression
                    {
                    LAMBDA100=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambda_expression1172); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LAMBDA.add(LAMBDA100);

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:182:12: ( definition_argument )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==TILDE||LA33_0==VAR_ID) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_lambda_expression1174);
                    	    definition_argument101=definition_argument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_definition_argument.add(definition_argument101.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    COLON102=(Token)match(input,COLON,FOLLOW_COLON_in_lambda_expression1177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON102);

                    pushFollow(FOLLOW_expression_in_lambda_expression1179);
                    expression103=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression103.getTree());


                    // AST REWRITE
                    // elements: LAMBDA, expression, definition_argument
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:5: -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:183:8: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(stream_LAMBDA.nextToken()), root_1);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:183:35: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:183:47: ( definition_argument )*
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
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==TILDE||LA34_0==VAR_ID) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_lambda_expression1207);
                    	    definition_argument104=definition_argument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_definition_argument.add(definition_argument104.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    OP_FOLLOW105=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_lambda_expression1210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_FOLLOW.add(OP_FOLLOW105);

                    pushFollow(FOLLOW_expression_in_lambda_expression1212);
                    expression106=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression106.getTree());


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
                    // 185:4: -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:185:7: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(LAMBDA), root_1);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:185:34: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:185:46: ( definition_argument )*
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

                    pushFollow(FOLLOW_lambda_match_expression_in_lambda_expression1239);
                    lambda_match_expression107=lambda_match_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_match_expression107.getTree());

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
    // $ANTLR end "lambda_expression"

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

        Token SEMICOLON109=null;
        OmttParser.single_lambda_match_return single_lambda_match108 = null;

        OmttParser.single_lambda_match_return single_lambda_match110 = null;


        Object SEMICOLON109_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_single_lambda_match=new RewriteRuleSubtreeStream(adaptor,"rule single_lambda_match");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:2: ( single_lambda_match ( SEMICOLON single_lambda_match )* -> ^( LAMBDA_MATCH ( single_lambda_match )+ ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:4: single_lambda_match ( SEMICOLON single_lambda_match )*
            {
            pushFollow(FOLLOW_single_lambda_match_in_lambda_match_expression1252);
            single_lambda_match108=single_lambda_match();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_single_lambda_match.add(single_lambda_match108.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:24: ( SEMICOLON single_lambda_match )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==SEMICOLON) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:25: SEMICOLON single_lambda_match
            	    {
            	    SEMICOLON109=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_lambda_match_expression1255); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON109);

            	    pushFollow(FOLLOW_single_lambda_match_in_lambda_match_expression1257);
            	    single_lambda_match110=single_lambda_match();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_single_lambda_match.add(single_lambda_match110.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
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

        Token OP_FOLLOW113=null;
        OmttParser.single_type_return single_type111 = null;

        OmttParser.where_clause_return where_clause112 = null;

        OmttParser.safe_expression_return safe_expression114 = null;


        Object OP_FOLLOW113_tree=null;
        RewriteRuleTokenStream stream_OP_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_FOLLOW");
        RewriteRuleSubtreeStream stream_safe_expression=new RewriteRuleSubtreeStream(adaptor,"rule safe_expression");
        RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:193:2: ( single_type ( where_clause )? OP_FOLLOW safe_expression -> ^( ITEM single_type safe_expression ( where_clause )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:193:4: single_type ( where_clause )? OP_FOLLOW safe_expression
            {
            pushFollow(FOLLOW_single_type_in_single_lambda_match1285);
            single_type111=single_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_single_type.add(single_type111.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:193:16: ( where_clause )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==WHERE) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_single_lambda_match1287);
                    where_clause112=where_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_where_clause.add(where_clause112.getTree());

                    }
                    break;

            }

            OP_FOLLOW113=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_single_lambda_match1290); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_FOLLOW.add(OP_FOLLOW113);

            pushFollow(FOLLOW_safe_expression_in_single_lambda_match1292);
            safe_expression114=safe_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_safe_expression.add(safe_expression114.getTree());


            // AST REWRITE
            // elements: where_clause, safe_expression, single_type
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

        Token OP_MULTIPLY116=null;
        OmttParser.type_content_return type_content115 = null;


        Object OP_MULTIPLY116_tree=null;
        RewriteRuleTokenStream stream_OP_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token OP_MULTIPLY");
        RewriteRuleSubtreeStream stream_type_content=new RewriteRuleSubtreeStream(adaptor,"rule type_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:198:3: ( type_content ( OP_MULTIPLY )? -> ^( TYPE type_content ( OP_MULTIPLY )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:198:5: type_content ( OP_MULTIPLY )?
            {
            pushFollow(FOLLOW_type_content_in_type1322);
            type_content115=type_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_content.add(type_content115.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:198:18: ( OP_MULTIPLY )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==OP_MULTIPLY) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: OP_MULTIPLY
                    {
                    OP_MULTIPLY116=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_type1324); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MULTIPLY.add(OP_MULTIPLY116);


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

        OmttParser.type_content_return type_content117 = null;


        RewriteRuleSubtreeStream stream_type_content=new RewriteRuleSubtreeStream(adaptor,"rule type_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:202:3: ( type_content -> ^( TYPE type_content ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:202:5: type_content
            {
            pushFollow(FOLLOW_type_content_in_single_type1354);
            type_content117=type_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_content.add(type_content117.getTree());


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

        Token CLASS_ID118=null;
        Token OP_GENERAL119=null;
        Token LEFT_PAREN120=null;
        Token OP_FOLLOW122=null;
        Token RIGHT_PAREN124=null;
        Token LEFT_SQUARE_PAREN125=null;
        Token COMMA126=null;
        Token RIGHT_SQUARE_PAREN127=null;
        Token LEFT_SQUARE_PAREN128=null;
        Token COMMA129=null;
        Token RIGHT_SQUARE_PAREN130=null;
        List list_tuple_types=null;
        List list_record_types=null;
        OmttParser.argument_type_return argument_type121 = null;

        OmttParser.type_return type123 = null;

        OmttParser.type_return tuple_types = null;
         tuple_types = null;
        OmttParser.record_item_type_return record_types = null;
         record_types = null;
        Object CLASS_ID118_tree=null;
        Object OP_GENERAL119_tree=null;
        Object LEFT_PAREN120_tree=null;
        Object OP_FOLLOW122_tree=null;
        Object RIGHT_PAREN124_tree=null;
        Object LEFT_SQUARE_PAREN125_tree=null;
        Object COMMA126_tree=null;
        Object RIGHT_SQUARE_PAREN127_tree=null;
        Object LEFT_SQUARE_PAREN128_tree=null;
        Object COMMA129_tree=null;
        Object RIGHT_SQUARE_PAREN130_tree=null;
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
            int alt42=5;
            switch ( input.LA(1) ) {
            case CLASS_ID:
                {
                alt42=1;
                }
                break;
            case OP_GENERAL:
                {
                alt42=2;
                }
                break;
            case LEFT_PAREN:
                {
                alt42=3;
                }
                break;
            case LEFT_SQUARE_PAREN:
                {
                int LA42_4 = input.LA(2);

                if ( (LA42_4==LEFT_PAREN||LA42_4==LEFT_SQUARE_PAREN||LA42_4==OP_GENERAL||LA42_4==CLASS_ID) ) {
                    alt42=4;
                }
                else if ( (LA42_4==VAR_ID) ) {
                    alt42=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:207:5: CLASS_ID
                    {
                    root_0 = (Object)adaptor.nil();

                    CLASS_ID118=(Token)match(input,CLASS_ID,FOLLOW_CLASS_ID_in_type_content1383); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLASS_ID118_tree = (Object)adaptor.create(CLASS_ID118);
                    adaptor.addChild(root_0, CLASS_ID118_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:208:5: OP_GENERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GENERAL119=(Token)match(input,OP_GENERAL,FOLLOW_OP_GENERAL_in_type_content1389); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_GENERAL119_tree = (Object)adaptor.create(OP_GENERAL119);
                    adaptor.addChild(root_0, OP_GENERAL119_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:209:5: LEFT_PAREN ( argument_type )+ OP_FOLLOW type RIGHT_PAREN
                    {
                    LEFT_PAREN120=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_type_content1395); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN120);

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:209:16: ( argument_type )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( ((LA39_0>=TILDE && LA39_0<=LEFT_PAREN)||LA39_0==LEFT_SQUARE_PAREN||LA39_0==OP_GENERAL||LA39_0==VAR_ID||LA39_0==CLASS_ID) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: argument_type
                    	    {
                    	    pushFollow(FOLLOW_argument_type_in_type_content1397);
                    	    argument_type121=argument_type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_argument_type.add(argument_type121.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);

                    OP_FOLLOW122=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_type_content1400); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_FOLLOW.add(OP_FOLLOW122);

                    pushFollow(FOLLOW_type_in_type_content1402);
                    type123=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type123.getTree());
                    RIGHT_PAREN124=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_type_content1404); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN124);



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
                    LEFT_SQUARE_PAREN125=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_type_content1424); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN125);

                    pushFollow(FOLLOW_type_in_type_content1428);
                    tuple_types=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(tuple_types.getTree());
                    if (list_tuple_types==null) list_tuple_types=new ArrayList();
                    list_tuple_types.add(tuple_types.getTree());

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:211:41: ( COMMA tuple_types+= type )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==COMMA) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:211:42: COMMA tuple_types+= type
                    	    {
                    	    COMMA126=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_content1431); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA126);

                    	    pushFollow(FOLLOW_type_in_type_content1435);
                    	    tuple_types=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_type.add(tuple_types.getTree());
                    	    if (list_tuple_types==null) list_tuple_types=new ArrayList();
                    	    list_tuple_types.add(tuple_types.getTree());


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

                    RIGHT_SQUARE_PAREN127=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_type_content1439); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN127);

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
                    LEFT_SQUARE_PAREN128=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_type_content1462); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN128);

                    pushFollow(FOLLOW_record_item_type_in_type_content1466);
                    record_types=record_item_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_record_item_type.add(record_types.getTree());
                    if (list_record_types==null) list_record_types=new ArrayList();
                    list_record_types.add(record_types.getTree());

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:54: ( COMMA record_types+= record_item_type )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==COMMA) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:55: COMMA record_types+= record_item_type
                    	    {
                    	    COMMA129=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_content1469); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA129);

                    	    pushFollow(FOLLOW_record_item_type_in_type_content1473);
                    	    record_types=record_item_type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_record_item_type.add(record_types.getTree());
                    	    if (list_record_types==null) list_record_types=new ArrayList();
                    	    list_record_types.add(record_types.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    RIGHT_SQUARE_PAREN130=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_type_content1477); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN130);

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:218:10: fragment argument_type : ( TILDE )? ( VAR_ID DOT )? type -> ^( ARGUMENT type ( VAR_ID )? ( TILDE )? ) ;
    public final OmttParser.argument_type_return argument_type() throws RecognitionException {
        OmttParser.argument_type_return retval = new OmttParser.argument_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TILDE131=null;
        Token VAR_ID132=null;
        Token DOT133=null;
        OmttParser.type_return type134 = null;


        Object TILDE131_tree=null;
        Object VAR_ID132_tree=null;
        Object DOT133_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_TILDE=new RewriteRuleTokenStream(adaptor,"token TILDE");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:219:2: ( ( TILDE )? ( VAR_ID DOT )? type -> ^( ARGUMENT type ( VAR_ID )? ( TILDE )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:219:4: ( TILDE )? ( VAR_ID DOT )? type
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:219:4: ( TILDE )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==TILDE) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: TILDE
                    {
                    TILDE131=(Token)match(input,TILDE,FOLLOW_TILDE_in_argument_type1506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TILDE.add(TILDE131);


                    }
                    break;

            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:219:11: ( VAR_ID DOT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==VAR_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:219:12: VAR_ID DOT
                    {
                    VAR_ID132=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_argument_type1510); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID132);

                    DOT133=(Token)match(input,DOT,FOLLOW_DOT_in_argument_type1512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT133);


                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_argument_type1516);
            type134=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type134.getTree());


            // AST REWRITE
            // elements: TILDE, type, VAR_ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 220:3: -> ^( ARGUMENT type ( VAR_ID )? ( TILDE )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:220:6: ^( ARGUMENT type ( VAR_ID )? ( TILDE )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENT, "ARGUMENT"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:220:22: ( VAR_ID )?
                if ( stream_VAR_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_VAR_ID.nextNode());

                }
                stream_VAR_ID.reset();
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:220:30: ( TILDE )?
                if ( stream_TILDE.hasNext() ) {
                    adaptor.addChild(root_1, stream_TILDE.nextNode());

                }
                stream_TILDE.reset();

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

        Token VAR_ID135=null;
        Token DOT136=null;
        OmttParser.type_return type137 = null;


        Object VAR_ID135_tree=null;
        Object DOT136_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:223:2: ( VAR_ID DOT type )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:223:4: VAR_ID DOT type
            {
            root_0 = (Object)adaptor.nil();

            VAR_ID135=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_record_item_type1544); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR_ID135_tree = (Object)adaptor.create(VAR_ID135);
            adaptor.addChild(root_0, VAR_ID135_tree);
            }
            DOT136=(Token)match(input,DOT,FOLLOW_DOT_in_record_item_type1546); if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_record_item_type1549);
            type137=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type137.getTree());

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

        Token IF138=null;
        Token COLON139=null;
        Token ELSE140=null;
        Token COLON141=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.expression_return part_if = null;

        OmttParser.expression_return part_else = null;


        Object IF138_tree=null;
        Object COLON139_tree=null;
        Object ELSE140_tree=null;
        Object COLON141_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:230:3: ( IF condition= context_expression COLON part_if= expression ELSE ( COLON )? part_else= expression -> ^( IF_ELSE $condition $part_if $part_else) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:230:5: IF condition= context_expression COLON part_if= expression ELSE ( COLON )? part_else= expression
            {
            IF138=(Token)match(input,IF,FOLLOW_IF_in_if_expression1564); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF138);

            pushFollow(FOLLOW_context_expression_in_if_expression1568);
            condition=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(condition.getTree());
            COLON139=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1570); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON139);

            pushFollow(FOLLOW_expression_in_if_expression1578);
            part_if=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(part_if.getTree());
            ELSE140=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_expression1584); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(ELSE140);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:232:10: ( COLON )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==COLON) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: COLON
                    {
                    COLON141=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON141);


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_if_expression1595);
            part_else=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(part_else.getTree());


            // AST REWRITE
            // elements: condition, part_else, part_if
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

        Token IF142=null;
        Token COLON143=null;
        Token ELSE144=null;
        Token COLON145=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.safe_expression_return part_if = null;

        OmttParser.safe_expression_return part_else = null;


        Object IF142_tree=null;
        Object COLON143_tree=null;
        Object ELSE144_tree=null;
        Object COLON145_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_safe_expression=new RewriteRuleSubtreeStream(adaptor,"rule safe_expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:237:3: ( IF condition= context_expression COLON part_if= safe_expression ELSE ( COLON )? part_else= safe_expression -> ^( IF_ELSE $condition $part_if $part_else) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:237:5: IF condition= context_expression COLON part_if= safe_expression ELSE ( COLON )? part_else= safe_expression
            {
            IF142=(Token)match(input,IF,FOLLOW_IF_in_safe_if_expression1629); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF142);

            pushFollow(FOLLOW_context_expression_in_safe_if_expression1633);
            condition=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(condition.getTree());
            COLON143=(Token)match(input,COLON,FOLLOW_COLON_in_safe_if_expression1635); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON143);

            pushFollow(FOLLOW_safe_expression_in_safe_if_expression1643);
            part_if=safe_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_safe_expression.add(part_if.getTree());
            ELSE144=(Token)match(input,ELSE,FOLLOW_ELSE_in_safe_if_expression1649); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(ELSE144);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:239:10: ( COLON )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==COLON) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: COLON
                    {
                    COLON145=(Token)match(input,COLON,FOLLOW_COLON_in_safe_if_expression1651); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON145);


                    }
                    break;

            }

            pushFollow(FOLLOW_safe_expression_in_safe_if_expression1660);
            part_else=safe_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_safe_expression.add(part_else.getTree());


            // AST REWRITE
            // elements: part_else, part_if, condition
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

        Token TAG_START146=null;
        Token TAG_END148=null;
        OmttParser.if_subtag_return if_subtag147 = null;


        Object TAG_START146_tree=null;
        Object TAG_END148_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:244:3: ( TAG_START if_subtag TAG_END )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:244:5: TAG_START if_subtag TAG_END
            {
            root_0 = (Object)adaptor.nil();

            TAG_START146=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_tag1694); if (state.failed) return retval;
            pushFollow(FOLLOW_if_subtag_in_if_tag1700);
            if_subtag147=if_subtag();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, if_subtag147.getTree());
            TAG_END148=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_if_tag1706); if (state.failed) return retval;

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

        Token IF149=null;
        Token TAG_START150=null;
        Token ELSE151=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.tag_content_return part_if = null;

        OmttParser.tag_content_return part_else = null;

        OmttParser.if_subtag_return subtag = null;


        Object IF149_tree=null;
        Object TAG_START150_tree=null;
        Object ELSE151_tree=null;
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
            IF149=(Token)match(input,IF,FOLLOW_IF_in_if_subtag1722); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF149);

            pushFollow(FOLLOW_context_expression_in_if_subtag1726);
            condition=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(condition.getTree());
            pushFollow(FOLLOW_tag_content_in_if_subtag1734);
            part_if=tag_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tag_content.add(part_if.getTree());

            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:252:3: ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==TAG_START) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:252:5: TAG_START ELSE (part_else= tag_content | subtag= if_subtag )
                    {
                    TAG_START150=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_subtag1744); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START150);

                    ELSE151=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_subtag1746); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE151);

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:253:4: (part_else= tag_content | subtag= if_subtag )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==CONTENT||LA47_0==OP_DATA_IS_EXPRESSION) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==IF) ) {
                        alt47=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:253:5: part_else= tag_content
                            {
                            pushFollow(FOLLOW_tag_content_in_if_subtag1754);
                            part_else=tag_content();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tag_content.add(part_else.getTree());

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:253:29: subtag= if_subtag
                            {
                            pushFollow(FOLLOW_if_subtag_in_if_subtag1760);
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
            // elements: subtag, part_else, part_if, condition
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

        Token MAP152=null;
        Token COLON154=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.expression_return expr = null;

        OmttParser.item_alias_return item_alias153 = null;


        Object MAP152_tree=null;
        Object COLON154_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_item_alias=new RewriteRuleSubtreeStream(adaptor,"rule item_alias");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:259:3: ( MAP ( item_alias )? iter= context_expression COLON expr= expression -> ^( MAP $iter $expr ( item_alias )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:259:5: MAP ( item_alias )? iter= context_expression COLON expr= expression
            {
            MAP152=(Token)match(input,MAP,FOLLOW_MAP_in_map_expression1803); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MAP.add(MAP152);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:259:9: ( item_alias )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==VAR_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==OP_REVERSE_FOLLOW) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: item_alias
                    {
                    pushFollow(FOLLOW_item_alias_in_map_expression1805);
                    item_alias153=item_alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_item_alias.add(item_alias153.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_context_expression_in_map_expression1810);
            iter=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(iter.getTree());
            COLON154=(Token)match(input,COLON,FOLLOW_COLON_in_map_expression1812); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON154);

            pushFollow(FOLLOW_expression_in_map_expression1820);
            expr=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expr.getTree());


            // AST REWRITE
            // elements: item_alias, expr, MAP, iter
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

        Token MAP155=null;
        Token COLON157=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.safe_expression_return expr = null;

        OmttParser.item_alias_return item_alias156 = null;


        Object MAP155_tree=null;
        Object COLON157_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_safe_expression=new RewriteRuleSubtreeStream(adaptor,"rule safe_expression");
        RewriteRuleSubtreeStream stream_item_alias=new RewriteRuleSubtreeStream(adaptor,"rule item_alias");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:264:3: ( MAP ( item_alias )? iter= context_expression COLON expr= safe_expression -> ^( MAP $iter $expr ( item_alias )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:264:5: MAP ( item_alias )? iter= context_expression COLON expr= safe_expression
            {
            MAP155=(Token)match(input,MAP,FOLLOW_MAP_in_safe_map_expression1854); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MAP.add(MAP155);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:264:9: ( item_alias )?
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
                    pushFollow(FOLLOW_item_alias_in_safe_map_expression1856);
                    item_alias156=item_alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_item_alias.add(item_alias156.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_context_expression_in_safe_map_expression1861);
            iter=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(iter.getTree());
            COLON157=(Token)match(input,COLON,FOLLOW_COLON_in_safe_map_expression1863); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON157);

            pushFollow(FOLLOW_safe_expression_in_safe_map_expression1871);
            expr=safe_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_safe_expression.add(expr.getTree());


            // AST REWRITE
            // elements: expr, item_alias, iter, MAP
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

        Token TAG_START158=null;
        Token MAP159=null;
        Token TAG_END161=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.tag_content_return expr = null;

        OmttParser.item_alias_return item_alias160 = null;


        Object TAG_START158_tree=null;
        Object MAP159_tree=null;
        Object TAG_END161_tree=null;
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
            TAG_START158=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_map_tag1905); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START158);

            MAP159=(Token)match(input,MAP,FOLLOW_MAP_in_map_tag1907); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MAP.add(MAP159);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:269:19: ( item_alias )?
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
                    pushFollow(FOLLOW_item_alias_in_map_tag1909);
                    item_alias160=item_alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_item_alias.add(item_alias160.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_context_expression_in_map_tag1914);
            iter=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(iter.getTree());
            pushFollow(FOLLOW_tag_content_in_map_tag1922);
            expr=tag_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tag_content.add(expr.getTree());
            TAG_END161=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_map_tag1928); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_END.add(TAG_END161);



            // AST REWRITE
            // elements: iter, item_alias, MAP, expr
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

        Token VAR_ID162=null;
        Token OP_REVERSE_FOLLOW163=null;

        Object VAR_ID162_tree=null;
        Object OP_REVERSE_FOLLOW163_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_REVERSE_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_REVERSE_FOLLOW");

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:276:2: ( VAR_ID OP_REVERSE_FOLLOW -> ^( AS VAR_ID ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:276:4: VAR_ID OP_REVERSE_FOLLOW
            {
            VAR_ID162=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_item_alias1964); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID162);

            OP_REVERSE_FOLLOW163=(Token)match(input,OP_REVERSE_FOLLOW,FOLLOW_OP_REVERSE_FOLLOW_in_item_alias1966); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_REVERSE_FOLLOW.add(OP_REVERSE_FOLLOW163);



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

        Token MATCH164=null;
        Token COLON165=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.lambda_match_expression_return expr = null;


        Object MATCH164_tree=null;
        Object COLON165_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MATCH=new RewriteRuleTokenStream(adaptor,"token MATCH");
        RewriteRuleSubtreeStream stream_lambda_match_expression=new RewriteRuleSubtreeStream(adaptor,"rule lambda_match_expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:281:3: ( MATCH iter= context_expression COLON expr= lambda_match_expression -> ^( CALL[true] $expr ^( ARGUMENT $iter) ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:281:5: MATCH iter= context_expression COLON expr= lambda_match_expression
            {
            MATCH164=(Token)match(input,MATCH,FOLLOW_MATCH_in_match_expression1988); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MATCH.add(MATCH164);

            pushFollow(FOLLOW_context_expression_in_match_expression1992);
            iter=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(iter.getTree());
            COLON165=(Token)match(input,COLON,FOLLOW_COLON_in_match_expression1994); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON165);

            pushFollow(FOLLOW_lambda_match_expression_in_match_expression2002);
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

        Token WHERE169=null;
        Token ORDER171=null;
        Token BY172=null;
        Token MATCH174=null;
        OmttParser.strict_expression_return base = null;

        OmttParser.function_arguments_return arguments = null;

        OmttParser.safe_expression_return ce = null;

        OmttParser.op_apply_return op_apply166 = null;

        OmttParser.atom_expression_return atom_expression167 = null;

        OmttParser.op_map_return op_map168 = null;

        OmttParser.safe_expression_return safe_expression170 = null;

        OmttParser.safe_expression_return safe_expression173 = null;

        OmttParser.lambda_match_expression_return lambda_match_expression175 = null;


        Object WHERE169_tree=null;
        Object ORDER171_tree=null;
        Object BY172_tree=null;
        Object MATCH174_tree=null;
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
            pushFollow(FOLLOW_strict_expression_in_context_expression2047);
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
            loop52:
            do {
                int alt52=6;
                switch ( input.LA(1) ) {
                case APPLY:
                case OP_CONTEXT:
                    {
                    alt52=1;
                    }
                    break;
                case MAP:
                    {
                    alt52=2;
                    }
                    break;
                case WHERE:
                    {
                    alt52=3;
                    }
                    break;
                case ORDER:
                    {
                    alt52=4;
                    }
                    break;
                case MATCH:
                    {
                    alt52=5;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:290:5: op_apply atom_expression arguments= function_arguments
            	    {
            	    pushFollow(FOLLOW_op_apply_in_context_expression2059);
            	    op_apply166=op_apply();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_op_apply.add(op_apply166.getTree());
            	    pushFollow(FOLLOW_atom_expression_in_context_expression2061);
            	    atom_expression167=atom_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_atom_expression.add(atom_expression167.getTree());
            	    pushFollow(FOLLOW_function_arguments_in_context_expression2065);
            	    arguments=function_arguments();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function_arguments.add(arguments.getTree());


            	    // AST REWRITE
            	    // elements: context_expression, atom_expression, arguments
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
            	    pushFollow(FOLLOW_op_map_in_context_expression2103);
            	    op_map168=op_map();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_op_map.add(op_map168.getTree());
            	    pushFollow(FOLLOW_safe_expression_in_context_expression2107);
            	    ce=safe_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_safe_expression.add(ce.getTree());


            	    // AST REWRITE
            	    // elements: context_expression, ce, op_map
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
            	    WHERE169=(Token)match(input,WHERE,FOLLOW_WHERE_in_context_expression2130); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_WHERE.add(WHERE169);

            	    pushFollow(FOLLOW_safe_expression_in_context_expression2132);
            	    safe_expression170=safe_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_safe_expression.add(safe_expression170.getTree());


            	    // AST REWRITE
            	    // elements: context_expression, safe_expression
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
            	    ORDER171=(Token)match(input,ORDER,FOLLOW_ORDER_in_context_expression2161); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ORDER.add(ORDER171);

            	    BY172=(Token)match(input,BY,FOLLOW_BY_in_context_expression2163); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_BY.add(BY172);

            	    pushFollow(FOLLOW_safe_expression_in_context_expression2165);
            	    safe_expression173=safe_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_safe_expression.add(safe_expression173.getTree());
            	    if ( state.backtracking==0 ) {
            	       reportNotImplemented("order by operation"); 
            	    }


            	    // AST REWRITE
            	    // elements: context_expression, safe_expression, ORDER
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
            	    MATCH174=(Token)match(input,MATCH,FOLLOW_MATCH_in_context_expression2194); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_MATCH.add(MATCH174);

            	    pushFollow(FOLLOW_lambda_match_expression_in_context_expression2196);
            	    lambda_match_expression175=lambda_match_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_lambda_match_expression.add(lambda_match_expression175.getTree());


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
            	    break loop52;
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

        Token OP_CONTEXT176=null;
        Token APPLY177=null;

        Object OP_CONTEXT176_tree=null;
        Object APPLY177_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:304:2: ( OP_CONTEXT | APPLY )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==OP_CONTEXT) ) {
                alt53=1;
            }
            else if ( (LA53_0==APPLY) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:304:4: OP_CONTEXT
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_CONTEXT176=(Token)match(input,OP_CONTEXT,FOLLOW_OP_CONTEXT_in_op_apply2243); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_CONTEXT176_tree = (Object)adaptor.create(OP_CONTEXT176);
                    root_0 = (Object)adaptor.becomeRoot(OP_CONTEXT176_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:305:4: APPLY
                    {
                    root_0 = (Object)adaptor.nil();

                    APPLY177=(Token)match(input,APPLY,FOLLOW_APPLY_in_op_apply2249); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    APPLY177_tree = (Object)adaptor.create(APPLY177);
                    root_0 = (Object)adaptor.becomeRoot(APPLY177_tree, root_0);
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

        Token MAP178=null;

        Object MAP178_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:308:2: ( MAP )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:308:4: MAP
            {
            root_0 = (Object)adaptor.nil();

            MAP178=(Token)match(input,MAP,FOLLOW_MAP_in_op_map2262); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MAP178_tree = new Transformation(MAP178) ;
            root_0 = (Object)adaptor.becomeRoot(MAP178_tree, root_0);
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

        Token APPLY179=null;
        OmttParser.function_arguments_return arguments = null;

        OmttParser.atom_expression_return atom_expression180 = null;


        Object APPLY179_tree=null;
        RewriteRuleTokenStream stream_APPLY=new RewriteRuleTokenStream(adaptor,"token APPLY");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_function_arguments=new RewriteRuleSubtreeStream(adaptor,"rule function_arguments");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:312:2: ( APPLY atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT OP_GENERAL ) ( $arguments)? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:312:4: APPLY atom_expression arguments= function_arguments
            {
            APPLY179=(Token)match(input,APPLY,FOLLOW_APPLY_in_apply_expression2277); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_APPLY.add(APPLY179);

            pushFollow(FOLLOW_atom_expression_in_apply_expression2279);
            atom_expression180=atom_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom_expression.add(atom_expression180.getTree());
            pushFollow(FOLLOW_function_arguments_in_apply_expression2283);
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

        Token TAG_START181=null;
        Token TAG_END183=null;
        OmttParser.apply_expression_return apply_expression182 = null;


        Object TAG_START181_tree=null;
        Object TAG_END183_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:317:2: ( TAG_START apply_expression TAG_END )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:317:4: TAG_START apply_expression TAG_END
            {
            root_0 = (Object)adaptor.nil();

            TAG_START181=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_apply_tag2326); if (state.failed) return retval;
            pushFollow(FOLLOW_apply_expression_in_apply_tag2329);
            apply_expression182=apply_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, apply_expression182.getTree());
            TAG_END183=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_apply_tag2331); if (state.failed) return retval;

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:322:1: strict_expression : ( concatence_expression | apply_expression );
    public final OmttParser.strict_expression_return strict_expression() throws RecognitionException {
        OmttParser.strict_expression_return retval = new OmttParser.strict_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.concatence_expression_return concatence_expression184 = null;

        OmttParser.apply_expression_return apply_expression185 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:323:2: ( concatence_expression | apply_expression )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=STRING_LITERAL && LA54_0<=REAL_NUMBER)||LA54_0==DATA_START||(LA54_0>=NULL && LA54_0<=FALSE)||(LA54_0>=TILDE && LA54_0<=LEFT_PAREN)||LA54_0==LEFT_SQUARE_PAREN||LA54_0==OP_MINUS||LA54_0==OP_NOT||LA54_0==OP_GENERAL||LA54_0==VAR_ID) ) {
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:323:4: concatence_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_concatence_expression_in_strict_expression2345);
                    concatence_expression184=concatence_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, concatence_expression184.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:324:4: apply_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_apply_expression_in_strict_expression2350);
                    apply_expression185=apply_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, apply_expression185.getTree());

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
    // $ANTLR end "strict_expression"

    public static class concatence_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "concatence_expression"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:327:1: concatence_expression : (expr+= boolean_expression -> $expr) ( ( OP_CONCAT expr+= boolean_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )? ;
    public final OmttParser.concatence_expression_return concatence_expression() throws RecognitionException {
        OmttParser.concatence_expression_return retval = new OmttParser.concatence_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_CONCAT186=null;
        List list_expr=null;
        OmttParser.boolean_expression_return expr = null;
         expr = null;
        Object OP_CONCAT186_tree=null;
        RewriteRuleTokenStream stream_OP_CONCAT=new RewriteRuleTokenStream(adaptor,"token OP_CONCAT");
        RewriteRuleSubtreeStream stream_boolean_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:328:3: ( (expr+= boolean_expression -> $expr) ( ( OP_CONCAT expr+= boolean_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )? )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:328:5: (expr+= boolean_expression -> $expr) ( ( OP_CONCAT expr+= boolean_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )?
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:328:5: (expr+= boolean_expression -> $expr)
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:328:6: expr+= boolean_expression
            {
            pushFollow(FOLLOW_boolean_expression_in_concatence_expression2365);
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
            // 328:31: -> $expr
            {
                adaptor.addChild(root_0, stream_expr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:329:5: ( ( OP_CONCAT expr+= boolean_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==OP_CONCAT) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:329:6: ( OP_CONCAT expr+= boolean_expression )+
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:329:6: ( OP_CONCAT expr+= boolean_expression )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==OP_CONCAT) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:329:7: OP_CONCAT expr+= boolean_expression
                    	    {
                    	    OP_CONCAT186=(Token)match(input,OP_CONCAT,FOLLOW_OP_CONCAT_in_concatence_expression2379); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_CONCAT.add(OP_CONCAT186);

                    	    pushFollow(FOLLOW_boolean_expression_in_concatence_expression2383);
                    	    expr=boolean_expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_boolean_expression.add(expr.getTree());
                    	    if (list_expr==null) list_expr=new ArrayList();
                    	    list_expr.add(expr.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt55 >= 1 ) break loop55;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
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
                    // 329:44: -> ^( OP_CONCAT ( $expr)+ )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:329:47: ^( OP_CONCAT ( $expr)+ )
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:333:1: boolean_expression : boolean_binary_expression ;
    public final OmttParser.boolean_expression_return boolean_expression() throws RecognitionException {
        OmttParser.boolean_expression_return retval = new OmttParser.boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_binary_expression_return boolean_binary_expression187 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:334:2: ( boolean_binary_expression )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:334:4: boolean_binary_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_binary_expression_in_boolean_expression2413);
            boolean_binary_expression187=boolean_binary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_binary_expression187.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:336:10: fragment boolean_binary_expression : boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )* ;
    public final OmttParser.boolean_binary_expression_return boolean_binary_expression() throws RecognitionException {
        OmttParser.boolean_binary_expression_return retval = new OmttParser.boolean_binary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_unary_expression_return boolean_unary_expression188 = null;

        OmttParser.boolean_binary_operator_return boolean_binary_operator189 = null;

        OmttParser.boolean_unary_expression_return boolean_unary_expression190 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:337:3: ( boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:337:5: boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression2426);
            boolean_unary_expression188=boolean_unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_unary_expression188.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:337:30: ( boolean_binary_operator boolean_unary_expression )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=OP_AND && LA57_0<=OP_OR)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:337:31: boolean_binary_operator boolean_unary_expression
            	    {
            	    pushFollow(FOLLOW_boolean_binary_operator_in_boolean_binary_expression2429);
            	    boolean_binary_operator189=boolean_binary_operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(boolean_binary_operator189.getTree(), root_0);
            	    pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression2432);
            	    boolean_unary_expression190=boolean_unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_unary_expression190.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:339:10: fragment boolean_unary_expression : ( boolean_unary_operator boolean_comparsion_expression | boolean_comparsion_expression );
    public final OmttParser.boolean_unary_expression_return boolean_unary_expression() throws RecognitionException {
        OmttParser.boolean_unary_expression_return retval = new OmttParser.boolean_unary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_unary_operator_return boolean_unary_operator191 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression192 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression193 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:340:3: ( boolean_unary_operator boolean_comparsion_expression | boolean_comparsion_expression )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==OP_NOT) ) {
                alt58=1;
            }
            else if ( ((LA58_0>=STRING_LITERAL && LA58_0<=REAL_NUMBER)||LA58_0==DATA_START||(LA58_0>=NULL && LA58_0<=FALSE)||(LA58_0>=TILDE && LA58_0<=LEFT_PAREN)||LA58_0==LEFT_SQUARE_PAREN||LA58_0==OP_MINUS||LA58_0==OP_GENERAL||LA58_0==VAR_ID) ) {
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:340:5: boolean_unary_operator boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_unary_operator_in_boolean_unary_expression2448);
                    boolean_unary_operator191=boolean_unary_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(boolean_unary_operator191.getTree(), root_0);
                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression2451);
                    boolean_comparsion_expression192=boolean_comparsion_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_comparsion_expression192.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:341:5: boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression2457);
                    boolean_comparsion_expression193=boolean_comparsion_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_comparsion_expression193.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:344:10: fragment boolean_binary_operator : ( OP_AND | OP_OR );
    public final OmttParser.boolean_binary_operator_return boolean_binary_operator() throws RecognitionException {
        OmttParser.boolean_binary_operator_return retval = new OmttParser.boolean_binary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_AND194=null;
        Token OP_OR195=null;

        Object OP_AND194_tree=null;
        Object OP_OR195_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:345:3: ( OP_AND | OP_OR )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==OP_AND) ) {
                alt59=1;
            }
            else if ( (LA59_0==OP_OR) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:345:5: OP_AND
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_AND194=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_boolean_binary_operator2472); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_AND194_tree = new BooleanExpression(OP_AND194) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_AND194_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:346:5: OP_OR
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_OR195=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_boolean_binary_operator2482); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_OR195_tree = new BooleanExpression(OP_OR195) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_OR195_tree, root_0);
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:348:10: fragment boolean_unary_operator : OP_NOT ;
    public final OmttParser.boolean_unary_operator_return boolean_unary_operator() throws RecognitionException {
        OmttParser.boolean_unary_operator_return retval = new OmttParser.boolean_unary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_NOT196=null;

        Object OP_NOT196_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:349:3: ( OP_NOT )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:349:5: OP_NOT
            {
            root_0 = (Object)adaptor.nil();

            OP_NOT196=(Token)match(input,OP_NOT,FOLLOW_OP_NOT_in_boolean_unary_operator2500); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_NOT196_tree = new BooleanExpression(OP_NOT196) ;
            root_0 = (Object)adaptor.becomeRoot(OP_NOT196_tree, root_0);
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:352:1: boolean_comparsion_expression : additive_expression ( boolean_comparsion_operator additive_expression )* ;
    public final OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression() throws RecognitionException {
        OmttParser.boolean_comparsion_expression_return retval = new OmttParser.boolean_comparsion_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.additive_expression_return additive_expression197 = null;

        OmttParser.boolean_comparsion_operator_return boolean_comparsion_operator198 = null;

        OmttParser.additive_expression_return additive_expression199 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:353:3: ( additive_expression ( boolean_comparsion_operator additive_expression )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:353:5: additive_expression ( boolean_comparsion_operator additive_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression2517);
            additive_expression197=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression197.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:353:25: ( boolean_comparsion_operator additive_expression )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=OP_EQUAL && LA60_0<=OP_GE)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:353:26: boolean_comparsion_operator additive_expression
            	    {
            	    pushFollow(FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression2520);
            	    boolean_comparsion_operator198=boolean_comparsion_operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(boolean_comparsion_operator198.getTree(), root_0);
            	    pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression2523);
            	    additive_expression199=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression199.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:355:10: fragment boolean_comparsion_operator : ( OP_EQUAL | OP_NOT_EQUAL | OP_LE | OP_LEQ | OP_GE | OP_GEQ );
    public final OmttParser.boolean_comparsion_operator_return boolean_comparsion_operator() throws RecognitionException {
        OmttParser.boolean_comparsion_operator_return retval = new OmttParser.boolean_comparsion_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_EQUAL200=null;
        Token OP_NOT_EQUAL201=null;
        Token OP_LE202=null;
        Token OP_LEQ203=null;
        Token OP_GE204=null;
        Token OP_GEQ205=null;

        Object OP_EQUAL200_tree=null;
        Object OP_NOT_EQUAL201_tree=null;
        Object OP_LE202_tree=null;
        Object OP_LEQ203_tree=null;
        Object OP_GE204_tree=null;
        Object OP_GEQ205_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:356:3: ( OP_EQUAL | OP_NOT_EQUAL | OP_LE | OP_LEQ | OP_GE | OP_GEQ )
            int alt61=6;
            switch ( input.LA(1) ) {
            case OP_EQUAL:
                {
                alt61=1;
                }
                break;
            case OP_NOT_EQUAL:
                {
                alt61=2;
                }
                break;
            case OP_LE:
                {
                alt61=3;
                }
                break;
            case OP_LEQ:
                {
                alt61=4;
                }
                break;
            case OP_GE:
                {
                alt61=5;
                }
                break;
            case OP_GEQ:
                {
                alt61=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:356:5: OP_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_EQUAL200=(Token)match(input,OP_EQUAL,FOLLOW_OP_EQUAL_in_boolean_comparsion_operator2539); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_EQUAL200_tree = new BooleanExpression(OP_EQUAL200) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_EQUAL200_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:357:5: OP_NOT_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_NOT_EQUAL201=(Token)match(input,OP_NOT_EQUAL,FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator2549); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_NOT_EQUAL201_tree = new BooleanExpression(OP_NOT_EQUAL201) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_NOT_EQUAL201_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:358:5: OP_LE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LE202=(Token)match(input,OP_LE,FOLLOW_OP_LE_in_boolean_comparsion_operator2559); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_LE202_tree = new BooleanExpression(OP_LE202) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LE202_tree, root_0);
                    }

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:359:5: OP_LEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LEQ203=(Token)match(input,OP_LEQ,FOLLOW_OP_LEQ_in_boolean_comparsion_operator2569); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_LEQ203_tree = new BooleanExpression(OP_LEQ203) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LEQ203_tree, root_0);
                    }

                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:360:5: OP_GE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GE204=(Token)match(input,OP_GE,FOLLOW_OP_GE_in_boolean_comparsion_operator2579); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_GE204_tree = new BooleanExpression(OP_GE204) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GE204_tree, root_0);
                    }

                    }
                    break;
                case 6 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:361:5: OP_GEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GEQ205=(Token)match(input,OP_GEQ,FOLLOW_OP_GEQ_in_boolean_comparsion_operator2589); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_GEQ205_tree = new BooleanExpression(OP_GEQ205) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GEQ205_tree, root_0);
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:367:1: additive_expression : multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )* ;
    public final OmttParser.additive_expression_return additive_expression() throws RecognitionException {
        OmttParser.additive_expression_return retval = new OmttParser.additive_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_PLUS207=null;
        Token OP_MINUS208=null;
        OmttParser.multiplicative_expression_return multiplicative_expression206 = null;

        OmttParser.multiplicative_expression_return multiplicative_expression209 = null;


        Object OP_PLUS207_tree=null;
        Object OP_MINUS208_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:368:3: ( multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:368:5: multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2609);
            multiplicative_expression206=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression206.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:369:5: ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=OP_PLUS && LA63_0<=OP_MINUS)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:370:7: ( OP_PLUS | OP_MINUS ) multiplicative_expression
            	    {
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:370:7: ( OP_PLUS | OP_MINUS )
            	    int alt62=2;
            	    int LA62_0 = input.LA(1);

            	    if ( (LA62_0==OP_PLUS) ) {
            	        alt62=1;
            	    }
            	    else if ( (LA62_0==OP_MINUS) ) {
            	        alt62=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 62, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt62) {
            	        case 1 :
            	            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:370:9: OP_PLUS
            	            {
            	            OP_PLUS207=(Token)match(input,OP_PLUS,FOLLOW_OP_PLUS_in_additive_expression2625); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            OP_PLUS207_tree = new ArithmeticExpression(OP_PLUS207) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_PLUS207_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:371:9: OP_MINUS
            	            {
            	            OP_MINUS208=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_additive_expression2639); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            OP_MINUS208_tree = new ArithmeticExpression(OP_MINUS208) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MINUS208_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2659);
            	    multiplicative_expression209=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression209.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:377:1: multiplicative_expression : negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )* ;
    public final OmttParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        OmttParser.multiplicative_expression_return retval = new OmttParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MULTIPLY211=null;
        Token SLASH212=null;
        Token OP_MODULO213=null;
        OmttParser.negative_expression_return negative_expression210 = null;

        OmttParser.negative_expression_return negative_expression214 = null;


        Object OP_MULTIPLY211_tree=null;
        Object SLASH212_tree=null;
        Object OP_MODULO213_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:378:3: ( negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:378:5: negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_negative_expression_in_multiplicative_expression2679);
            negative_expression210=negative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, negative_expression210.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:379:5: ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==SLASH||(LA65_0>=OP_MULTIPLY && LA65_0<=OP_MODULO)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:379:7: ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression
            	    {
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:379:7: ( OP_MULTIPLY | SLASH | OP_MODULO )
            	    int alt64=3;
            	    switch ( input.LA(1) ) {
            	    case OP_MULTIPLY:
            	        {
            	        alt64=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt64=2;
            	        }
            	        break;
            	    case OP_MODULO:
            	        {
            	        alt64=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 64, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt64) {
            	        case 1 :
            	            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:379:9: OP_MULTIPLY
            	            {
            	            OP_MULTIPLY211=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_multiplicative_expression2689); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            OP_MULTIPLY211_tree = new ArithmeticExpression(OP_MULTIPLY211) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MULTIPLY211_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:380:9: SLASH
            	            {
            	            SLASH212=(Token)match(input,SLASH,FOLLOW_SLASH_in_multiplicative_expression2703); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH212_tree = new ArithmeticExpression(SLASH212) ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH212_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:381:9: OP_MODULO
            	            {
            	            OP_MODULO213=(Token)match(input,OP_MODULO,FOLLOW_OP_MODULO_in_multiplicative_expression2717); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            OP_MODULO213_tree = new ArithmeticExpression(OP_MODULO213) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MODULO213_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_negative_expression_in_multiplicative_expression2737);
            	    negative_expression214=negative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, negative_expression214.getTree());

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
    // $ANTLR end "multiplicative_expression"

    public static class negative_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negative_expression"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:387:1: negative_expression : ( OP_MINUS functional_expression -> ^( OP_MINUS functional_expression ) | functional_expression );
    public final OmttParser.negative_expression_return negative_expression() throws RecognitionException {
        OmttParser.negative_expression_return retval = new OmttParser.negative_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MINUS215=null;
        OmttParser.functional_expression_return functional_expression216 = null;

        OmttParser.functional_expression_return functional_expression217 = null;


        Object OP_MINUS215_tree=null;
        RewriteRuleTokenStream stream_OP_MINUS=new RewriteRuleTokenStream(adaptor,"token OP_MINUS");
        RewriteRuleSubtreeStream stream_functional_expression=new RewriteRuleSubtreeStream(adaptor,"rule functional_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:388:2: ( OP_MINUS functional_expression -> ^( OP_MINUS functional_expression ) | functional_expression )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==OP_MINUS) ) {
                alt66=1;
            }
            else if ( ((LA66_0>=STRING_LITERAL && LA66_0<=REAL_NUMBER)||LA66_0==DATA_START||(LA66_0>=NULL && LA66_0<=FALSE)||(LA66_0>=TILDE && LA66_0<=LEFT_PAREN)||LA66_0==LEFT_SQUARE_PAREN||LA66_0==OP_GENERAL||LA66_0==VAR_ID) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:388:4: OP_MINUS functional_expression
                    {
                    OP_MINUS215=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_negative_expression2756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MINUS.add(OP_MINUS215);

                    pushFollow(FOLLOW_functional_expression_in_negative_expression2758);
                    functional_expression216=functional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functional_expression.add(functional_expression216.getTree());


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
                    // 389:3: -> ^( OP_MINUS functional_expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:389:6: ^( OP_MINUS functional_expression )
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:390:4: functional_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functional_expression_in_negative_expression2776);
                    functional_expression217=functional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functional_expression217.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:395:1: functional_expression : call_expression ;
    public final OmttParser.functional_expression_return functional_expression() throws RecognitionException {
        OmttParser.functional_expression_return retval = new OmttParser.functional_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.call_expression_return call_expression218 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:396:3: ( call_expression )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:396:5: call_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_call_expression_in_functional_expression2790);
            call_expression218=call_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, call_expression218.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:399:1: call_expression : atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) ) ;
    public final OmttParser.call_expression_return call_expression() throws RecognitionException {
        OmttParser.call_expression_return retval = new OmttParser.call_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.atom_expression_return atom_expression219 = null;

        OmttParser.function_argument_return function_argument220 = null;


        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_function_argument=new RewriteRuleSubtreeStream(adaptor,"rule function_argument");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:400:3: ( atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:400:5: atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            {
            pushFollow(FOLLOW_atom_expression_in_call_expression2803);
            atom_expression219=atom_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom_expression.add(atom_expression219.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:401:5: ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=STRING_LITERAL && LA68_0<=REAL_NUMBER)||LA68_0==DATA_START||(LA68_0>=NULL && LA68_0<=FALSE)||(LA68_0>=TILDE && LA68_0<=LEFT_PAREN)||LA68_0==LEFT_SQUARE_PAREN||LA68_0==OP_GENERAL||LA68_0==VAR_ID) ) {
                alt68=1;
            }
            else if ( (LA68_0==EOF||(LA68_0>=CONTENT && LA68_0<=TAG_END)||(LA68_0>=EXPRESSION_END && LA68_0<=OP_DATA_IS_EXPRESSION)||(LA68_0>=AND && LA68_0<=IN)||LA68_0==ELSE||(LA68_0>=MAP && LA68_0<=ORDER)||LA68_0==OP_FOLLOW||(LA68_0>=COLON && LA68_0<=SEMICOLON)||(LA68_0>=COMMA && LA68_0<=SLASH)||LA68_0==RIGHT_PAREN||(LA68_0>=RIGHT_SQUARE_PAREN && LA68_0<=OP_GE)||(LA68_0>=OP_AND && LA68_0<=OP_OR)||LA68_0==OP_CONTEXT||LA68_0==OP_CONCAT) ) {
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:401:7: ( function_argument )+
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:401:7: ( function_argument )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( ((LA67_0>=STRING_LITERAL && LA67_0<=REAL_NUMBER)||LA67_0==DATA_START||(LA67_0>=NULL && LA67_0<=FALSE)||(LA67_0>=TILDE && LA67_0<=LEFT_PAREN)||LA67_0==LEFT_SQUARE_PAREN||LA67_0==OP_GENERAL||LA67_0==VAR_ID) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: function_argument
                    	    {
                    	    pushFollow(FOLLOW_function_argument_in_call_expression2811);
                    	    function_argument220=function_argument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_function_argument.add(function_argument220.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt67 >= 1 ) break loop67;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(67, input);
                                throw eee;
                        }
                        cnt67++;
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
                    // 402:7: -> ^( CALL[false] atom_expression ( function_argument )+ )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:10: ^( CALL[false] atom_expression ( function_argument )+ )
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:403:7: 
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
                    // 404:7: -> ^( atom_expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:404:10: ^( atom_expression )
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:407:1: call_tag : TAG_START ident= namespace_id ( (content= tag_content | (args+= function_argument )+ (content= tag_content )? ) -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* ) | -> $ident) TAG_END ;
    public final OmttParser.call_tag_return call_tag() throws RecognitionException {
        OmttParser.call_tag_return retval = new OmttParser.call_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START221=null;
        Token TAG_END222=null;
        List list_args=null;
        OmttParser.namespace_id_return ident = null;

        OmttParser.tag_content_return content = null;

        OmttParser.function_argument_return args = null;
         args = null;
        Object TAG_START221_tree=null;
        Object TAG_END222_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_function_argument=new RewriteRuleSubtreeStream(adaptor,"rule function_argument");
        RewriteRuleSubtreeStream stream_namespace_id=new RewriteRuleSubtreeStream(adaptor,"rule namespace_id");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:408:3: ( TAG_START ident= namespace_id ( (content= tag_content | (args+= function_argument )+ (content= tag_content )? ) -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* ) | -> $ident) TAG_END )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:408:5: TAG_START ident= namespace_id ( (content= tag_content | (args+= function_argument )+ (content= tag_content )? ) -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* ) | -> $ident) TAG_END
            {
            TAG_START221=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_call_tag2871); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START221);

            pushFollow(FOLLOW_namespace_id_in_call_tag2875);
            ident=namespace_id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_namespace_id.add(ident.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:409:4: ( (content= tag_content | (args+= function_argument )+ (content= tag_content )? ) -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* ) | -> $ident)
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=STRING_LITERAL && LA72_0<=CONTENT)||LA72_0==DATA_START||LA72_0==OP_DATA_IS_EXPRESSION||(LA72_0>=NULL && LA72_0<=FALSE)||(LA72_0>=TILDE && LA72_0<=LEFT_PAREN)||LA72_0==LEFT_SQUARE_PAREN||LA72_0==OP_GENERAL||LA72_0==VAR_ID) ) {
                alt72=1;
            }
            else if ( (LA72_0==TAG_END) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:409:6: (content= tag_content | (args+= function_argument )+ (content= tag_content )? )
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:409:6: (content= tag_content | (args+= function_argument )+ (content= tag_content )? )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==CONTENT||LA71_0==OP_DATA_IS_EXPRESSION) ) {
                        alt71=1;
                    }
                    else if ( ((LA71_0>=STRING_LITERAL && LA71_0<=REAL_NUMBER)||LA71_0==DATA_START||(LA71_0>=NULL && LA71_0<=FALSE)||(LA71_0>=TILDE && LA71_0<=LEFT_PAREN)||LA71_0==LEFT_SQUARE_PAREN||LA71_0==OP_GENERAL||LA71_0==VAR_ID) ) {
                        alt71=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:409:7: content= tag_content
                            {
                            pushFollow(FOLLOW_tag_content_in_call_tag2885);
                            content=tag_content();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tag_content.add(content.getTree());

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:409:29: (args+= function_argument )+ (content= tag_content )?
                            {
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:409:33: (args+= function_argument )+
                            int cnt69=0;
                            loop69:
                            do {
                                int alt69=2;
                                int LA69_0 = input.LA(1);

                                if ( ((LA69_0>=STRING_LITERAL && LA69_0<=REAL_NUMBER)||LA69_0==DATA_START||(LA69_0>=NULL && LA69_0<=FALSE)||(LA69_0>=TILDE && LA69_0<=LEFT_PAREN)||LA69_0==LEFT_SQUARE_PAREN||LA69_0==OP_GENERAL||LA69_0==VAR_ID) ) {
                                    alt69=1;
                                }


                                switch (alt69) {
                            	case 1 :
                            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: args+= function_argument
                            	    {
                            	    pushFollow(FOLLOW_function_argument_in_call_tag2891);
                            	    args=function_argument();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_function_argument.add(args.getTree());
                            	    if (list_args==null) list_args=new ArrayList();
                            	    list_args.add(args.getTree());


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

                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:409:54: (content= tag_content )?
                            int alt70=2;
                            int LA70_0 = input.LA(1);

                            if ( (LA70_0==CONTENT||LA70_0==OP_DATA_IS_EXPRESSION) ) {
                                alt70=1;
                            }
                            switch (alt70) {
                                case 1 :
                                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:409:55: content= tag_content
                                    {
                                    pushFollow(FOLLOW_tag_content_in_call_tag2897);
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
                    // elements: content, args, ident
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
                    // 410:4: -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:410:7: ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, false), root_1);

                        adaptor.addChild(root_1, stream_ident.nextTree());
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:410:34: ( ^( ARGUMENT $content) )?
                        if ( stream_content.hasNext() ) {
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:410:34: ^( ARGUMENT $content)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

                            adaptor.addChild(root_2, stream_content.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_content.reset();
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:410:74: ( $args)*
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:411:6: 
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
                    // 411:6: -> $ident
                    {
                        adaptor.addChild(root_0, stream_ident.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }

            TAG_END222=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_call_tag2952); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_END.add(TAG_END222);


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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:415:10: fragment function_arguments : ( function_argument )* ;
    public final OmttParser.function_arguments_return function_arguments() throws RecognitionException {
        OmttParser.function_arguments_return retval = new OmttParser.function_arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.function_argument_return function_argument223 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:416:3: ( ( function_argument )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:416:5: ( function_argument )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:416:5: ( function_argument )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( ((LA73_0>=STRING_LITERAL && LA73_0<=REAL_NUMBER)||LA73_0==DATA_START||(LA73_0>=NULL && LA73_0<=FALSE)||(LA73_0>=TILDE && LA73_0<=LEFT_PAREN)||LA73_0==LEFT_SQUARE_PAREN||LA73_0==OP_GENERAL||LA73_0==VAR_ID) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: function_argument
            	    {
            	    pushFollow(FOLLOW_function_argument_in_function_arguments2966);
            	    function_argument223=function_argument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_argument223.getTree());

            	    }
            	    break;

            	default :
            	    break loop73;
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:418:10: fragment function_argument : ( VAR_ID OP_ASSIGN )? atom_expression -> ^( ARGUMENT atom_expression ( VAR_ID )? ) ;
    public final OmttParser.function_argument_return function_argument() throws RecognitionException {
        OmttParser.function_argument_return retval = new OmttParser.function_argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID224=null;
        Token OP_ASSIGN225=null;
        OmttParser.atom_expression_return atom_expression226 = null;


        Object VAR_ID224_tree=null;
        Object OP_ASSIGN225_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:419:3: ( ( VAR_ID OP_ASSIGN )? atom_expression -> ^( ARGUMENT atom_expression ( VAR_ID )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:419:5: ( VAR_ID OP_ASSIGN )? atom_expression
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:419:5: ( VAR_ID OP_ASSIGN )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==VAR_ID) ) {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==OP_ASSIGN) ) {
                    alt74=1;
                }
            }
            switch (alt74) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:419:6: VAR_ID OP_ASSIGN
                    {
                    VAR_ID224=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_function_argument2982); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID224);

                    OP_ASSIGN225=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_function_argument2984); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_ASSIGN.add(OP_ASSIGN225);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_expression_in_function_argument2988);
            atom_expression226=atom_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom_expression.add(atom_expression226.getTree());


            // AST REWRITE
            // elements: VAR_ID, atom_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 420:5: -> ^( ARGUMENT atom_expression ( VAR_ID )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:420:8: ^( ARGUMENT atom_expression ( VAR_ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_1);

                adaptor.addChild(root_1, stream_atom_expression.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:420:53: ( VAR_ID )?
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:425:1: atom_expression : (a= atom_with_selectors -> $a) ( DOT es= expression_select -> ^( DOT $atom_expression $es) | DOT ps= property_select -> ^( DOT $atom_expression $ps) )* ;
    public final OmttParser.atom_expression_return atom_expression() throws RecognitionException {
        OmttParser.atom_expression_return retval = new OmttParser.atom_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT227=null;
        Token DOT228=null;
        OmttParser.atom_with_selectors_return a = null;

        OmttParser.expression_select_return es = null;

        OmttParser.property_select_return ps = null;


        Object DOT227_tree=null;
        Object DOT228_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_expression_select=new RewriteRuleSubtreeStream(adaptor,"rule expression_select");
        RewriteRuleSubtreeStream stream_property_select=new RewriteRuleSubtreeStream(adaptor,"rule property_select");
        RewriteRuleSubtreeStream stream_atom_with_selectors=new RewriteRuleSubtreeStream(adaptor,"rule atom_with_selectors");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:426:3: ( (a= atom_with_selectors -> $a) ( DOT es= expression_select -> ^( DOT $atom_expression $es) | DOT ps= property_select -> ^( DOT $atom_expression $ps) )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:426:5: (a= atom_with_selectors -> $a) ( DOT es= expression_select -> ^( DOT $atom_expression $es) | DOT ps= property_select -> ^( DOT $atom_expression $ps) )*
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:426:5: (a= atom_with_selectors -> $a)
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:426:6: a= atom_with_selectors
            {
            pushFollow(FOLLOW_atom_with_selectors_in_atom_expression3024);
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
            // 426:28: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:427:4: ( DOT es= expression_select -> ^( DOT $atom_expression $es) | DOT ps= property_select -> ^( DOT $atom_expression $ps) )*
            loop75:
            do {
                int alt75=3;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==DOT) ) {
                    int LA75_2 = input.LA(2);

                    if ( (LA75_2==VAR_ID) ) {
                        alt75=2;
                    }
                    else if ( ((LA75_2>=STRING_LITERAL && LA75_2<=REAL_NUMBER)||LA75_2==DATA_START||(LA75_2>=NULL && LA75_2<=FALSE)||(LA75_2>=TILDE && LA75_2<=LEFT_PAREN)||LA75_2==LEFT_SQUARE_PAREN) ) {
                        alt75=1;
                    }


                }


                switch (alt75) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:427:6: DOT es= expression_select
            	    {
            	    DOT227=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expression3037); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT227);

            	    pushFollow(FOLLOW_expression_select_in_atom_expression3041);
            	    es=expression_select();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression_select.add(es.getTree());


            	    // AST REWRITE
            	    // elements: DOT, es, atom_expression
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
            	    // 428:6: -> ^( DOT $atom_expression $es)
            	    {
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:428:9: ^( DOT $atom_expression $es)
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
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:429:6: DOT ps= property_select
            	    {
            	    DOT228=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expression3068); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT228);

            	    pushFollow(FOLLOW_property_select_in_atom_expression3072);
            	    ps=property_select();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_property_select.add(ps.getTree());


            	    // AST REWRITE
            	    // elements: atom_expression, DOT, ps
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
            	    // 430:5: -> ^( DOT $atom_expression $ps)
            	    {
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:430:8: ^( DOT $atom_expression $ps)
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
    // $ANTLR end "atom_expression"

    public static class atom_with_selectors_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom_with_selectors"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:433:10: fragment atom_with_selectors : atom ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom ) ;
    public final OmttParser.atom_with_selectors_return atom_with_selectors() throws RecognitionException {
        OmttParser.atom_with_selectors_return retval = new OmttParser.atom_with_selectors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.atom_return atom229 = null;

        OmttParser.sequence_selectors_return sequence_selectors230 = null;


        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_sequence_selectors=new RewriteRuleSubtreeStream(adaptor,"rule sequence_selectors");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:434:2: ( atom ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:434:4: atom ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom )
            {
            pushFollow(FOLLOW_atom_in_atom_with_selectors3110);
            atom229=atom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom.add(atom229.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:435:3: ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom )
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:435:5: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_atom_with_selectors3116);
                    sequence_selectors230=sequence_selectors();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sequence_selectors.add(sequence_selectors230.getTree());


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
                    // 436:4: -> ^( ATOM_SELECT atom sequence_selectors )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:436:7: ^( ATOM_SELECT atom sequence_selectors )
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:437:5: 
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
                    // 437:5: -> atom
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:440:10: fragment expression_select : object ( sequence_selectors -> ^( ATOM_SELECT object sequence_selectors ) | -> object ) ;
    public final OmttParser.expression_select_return expression_select() throws RecognitionException {
        OmttParser.expression_select_return retval = new OmttParser.expression_select_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.object_return object231 = null;

        OmttParser.sequence_selectors_return sequence_selectors232 = null;


        RewriteRuleSubtreeStream stream_sequence_selectors=new RewriteRuleSubtreeStream(adaptor,"rule sequence_selectors");
        RewriteRuleSubtreeStream stream_object=new RewriteRuleSubtreeStream(adaptor,"rule object");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:441:2: ( object ( sequence_selectors -> ^( ATOM_SELECT object sequence_selectors ) | -> object ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:441:4: object ( sequence_selectors -> ^( ATOM_SELECT object sequence_selectors ) | -> object )
            {
            pushFollow(FOLLOW_object_in_expression_select3156);
            object231=object();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_object.add(object231.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:442:3: ( sequence_selectors -> ^( ATOM_SELECT object sequence_selectors ) | -> object )
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:442:5: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_expression_select3162);
                    sequence_selectors232=sequence_selectors();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sequence_selectors.add(sequence_selectors232.getTree());


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
                    // 443:4: -> ^( ATOM_SELECT object sequence_selectors )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:443:7: ^( ATOM_SELECT object sequence_selectors )
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:444:5: 
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
                    // 444:5: -> object
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:447:10: fragment property_select : VAR_ID ( sequence_selectors )? ;
    public final OmttParser.property_select_return property_select() throws RecognitionException {
        OmttParser.property_select_return retval = new OmttParser.property_select_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID233=null;
        OmttParser.sequence_selectors_return sequence_selectors234 = null;


        Object VAR_ID233_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:448:2: ( VAR_ID ( sequence_selectors )? )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:448:4: VAR_ID ( sequence_selectors )?
            {
            root_0 = (Object)adaptor.nil();

            VAR_ID233=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_property_select3202); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR_ID233_tree = (Object)adaptor.create(VAR_ID233);
            adaptor.addChild(root_0, VAR_ID233_tree);
            }
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:448:11: ( sequence_selectors )?
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_property_select3204);
                    sequence_selectors234=sequence_selectors();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence_selectors234.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:450:10: fragment sequence_selectors : ( type_selector ( sequence_selector )? ( alias )? | sequence_selector ( alias )? | alias );
    public final OmttParser.sequence_selectors_return sequence_selectors() throws RecognitionException {
        OmttParser.sequence_selectors_return retval = new OmttParser.sequence_selectors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.type_selector_return type_selector235 = null;

        OmttParser.sequence_selector_return sequence_selector236 = null;

        OmttParser.alias_return alias237 = null;

        OmttParser.sequence_selector_return sequence_selector238 = null;

        OmttParser.alias_return alias239 = null;

        OmttParser.alias_return alias240 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:451:2: ( type_selector ( sequence_selector )? ( alias )? | sequence_selector ( alias )? | alias )
            int alt82=3;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt82=1;
                }
                break;
            case LEFT_SQUARE_PAREN:
                {
                alt82=2;
                }
                break;
            case AS:
                {
                alt82=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:451:4: type_selector ( sequence_selector )? ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_selector_in_sequence_selectors3217);
                    type_selector235=type_selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_selector235.getTree());
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:451:18: ( sequence_selector )?
                    int alt79=2;
                    alt79 = dfa79.predict(input);
                    switch (alt79) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: sequence_selector
                            {
                            pushFollow(FOLLOW_sequence_selector_in_sequence_selectors3219);
                            sequence_selector236=sequence_selector();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence_selector236.getTree());

                            }
                            break;

                    }

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:451:37: ( alias )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==AS) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: alias
                            {
                            pushFollow(FOLLOW_alias_in_sequence_selectors3222);
                            alias237=alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, alias237.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:452:4: sequence_selector ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_sequence_selector_in_sequence_selectors3228);
                    sequence_selector238=sequence_selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence_selector238.getTree());
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:452:22: ( alias )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==AS) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: alias
                            {
                            pushFollow(FOLLOW_alias_in_sequence_selectors3230);
                            alias239=alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, alias239.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:453:4: alias
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alias_in_sequence_selectors3236);
                    alias240=alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alias240.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:455:10: fragment type_selector : DOT single_type -> ^( TYPE_SELECT single_type ) ;
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:456:3: ( DOT single_type -> ^( TYPE_SELECT single_type ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:456:5: DOT single_type
            {
            DOT241=(Token)match(input,DOT,FOLLOW_DOT_in_type_selector3249); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT241);

            pushFollow(FOLLOW_single_type_in_type_selector3251);
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
            // 457:4: -> ^( TYPE_SELECT single_type )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:457:7: ^( TYPE_SELECT single_type )
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:459:10: fragment sequence_selector : LEFT_SQUARE_PAREN expression RIGHT_SQUARE_PAREN -> ^( SEQUENCE_SELECT expression ) ;
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:460:3: ( LEFT_SQUARE_PAREN expression RIGHT_SQUARE_PAREN -> ^( SEQUENCE_SELECT expression ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:460:5: LEFT_SQUARE_PAREN expression RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN243=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector3276); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN243);

            pushFollow(FOLLOW_expression_in_sequence_selector3278);
            expression244=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression244.getTree());
            RIGHT_SQUARE_PAREN245=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector3280); if (state.failed) return retval; 
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
            // 461:4: -> ^( SEQUENCE_SELECT expression )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:461:7: ^( SEQUENCE_SELECT expression )
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

    public static class alias_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "alias"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:463:10: fragment alias : AS VAR_ID -> ^( AS VAR_ID ) ;
    public final OmttParser.alias_return alias() throws RecognitionException {
        OmttParser.alias_return retval = new OmttParser.alias_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AS246=null;
        Token VAR_ID247=null;

        Object AS246_tree=null;
        Object VAR_ID247_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:464:2: ( AS VAR_ID -> ^( AS VAR_ID ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:464:4: AS VAR_ID
            {
            AS246=(Token)match(input,AS,FOLLOW_AS_in_alias3304); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AS.add(AS246);

            VAR_ID247=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_alias3306); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID247);



            // AST REWRITE
            // elements: AS, VAR_ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 465:3: -> ^( AS VAR_ID )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:465:6: ^( AS VAR_ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_AS.nextNode(), root_1);

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
    // $ANTLR end "alias"

    public static class data_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "data_expression"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:468:1: data_expression : DATA_START ( data_body_atom )* DATA_END -> ^( DATA_START ( data_body_atom )* ) ;
    public final OmttParser.data_expression_return data_expression() throws RecognitionException {
        OmttParser.data_expression_return retval = new OmttParser.data_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DATA_START248=null;
        Token DATA_END250=null;
        OmttParser.data_body_atom_return data_body_atom249 = null;


        Object DATA_START248_tree=null;
        Object DATA_END250_tree=null;
        RewriteRuleTokenStream stream_DATA_END=new RewriteRuleTokenStream(adaptor,"token DATA_END");
        RewriteRuleTokenStream stream_DATA_START=new RewriteRuleTokenStream(adaptor,"token DATA_START");
        RewriteRuleSubtreeStream stream_data_body_atom=new RewriteRuleSubtreeStream(adaptor,"rule data_body_atom");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:469:3: ( DATA_START ( data_body_atom )* DATA_END -> ^( DATA_START ( data_body_atom )* ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:469:5: DATA_START ( data_body_atom )* DATA_END
            {
            DATA_START248=(Token)match(input,DATA_START,FOLLOW_DATA_START_in_data_expression3328); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DATA_START.add(DATA_START248);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:469:16: ( data_body_atom )*
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
            	    pushFollow(FOLLOW_data_body_atom_in_data_expression3330);
            	    data_body_atom249=data_body_atom();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_data_body_atom.add(data_body_atom249.getTree());

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            DATA_END250=(Token)match(input,DATA_END,FOLLOW_DATA_END_in_data_expression3333); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DATA_END.add(DATA_END250);



            // AST REWRITE
            // elements: DATA_START, data_body_atom
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 470:5: -> ^( DATA_START ( data_body_atom )* )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:470:8: ^( DATA_START ( data_body_atom )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Data(stream_DATA_START.nextToken()), root_1);

                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:470:27: ( data_body_atom )*
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:473:1: atom : selectable_atom ( DOUBLE_DOT selectable_atom )? ;
    public final OmttParser.atom_return atom() throws RecognitionException {
        OmttParser.atom_return retval = new OmttParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_DOT252=null;
        OmttParser.selectable_atom_return selectable_atom251 = null;

        OmttParser.selectable_atom_return selectable_atom253 = null;


        Object DOUBLE_DOT252_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:474:2: ( selectable_atom ( DOUBLE_DOT selectable_atom )? )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:474:4: selectable_atom ( DOUBLE_DOT selectable_atom )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_selectable_atom_in_atom3361);
            selectable_atom251=selectable_atom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selectable_atom251.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:475:3: ( DOUBLE_DOT selectable_atom )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==DOUBLE_DOT) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:475:4: DOUBLE_DOT selectable_atom
                    {
                    DOUBLE_DOT252=(Token)match(input,DOUBLE_DOT,FOLLOW_DOUBLE_DOT_in_atom3366); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_DOT252_tree = new Range(DOUBLE_DOT252) ;
                    root_0 = (Object)adaptor.becomeRoot(DOUBLE_DOT252_tree, root_0);
                    }
                    pushFollow(FOLLOW_selectable_atom_in_atom3372);
                    selectable_atom253=selectable_atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selectable_atom253.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:478:1: selectable_atom : ( namespace_id | object );
    public final OmttParser.selectable_atom_return selectable_atom() throws RecognitionException {
        OmttParser.selectable_atom_return retval = new OmttParser.selectable_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.namespace_id_return namespace_id254 = null;

        OmttParser.object_return object255 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:479:3: ( namespace_id | object )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==OP_GENERAL||LA85_0==VAR_ID) ) {
                alt85=1;
            }
            else if ( ((LA85_0>=STRING_LITERAL && LA85_0<=REAL_NUMBER)||LA85_0==DATA_START||(LA85_0>=NULL && LA85_0<=FALSE)||(LA85_0>=TILDE && LA85_0<=LEFT_PAREN)||LA85_0==LEFT_SQUARE_PAREN) ) {
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:479:5: namespace_id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespace_id_in_selectable_atom3386);
                    namespace_id254=namespace_id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace_id254.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:480:5: object
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_object_in_selectable_atom3392);
                    object255=object();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, object255.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:482:10: fragment object : ( object_atom | data_expression | tuple | record | LEFT_PAREN sequence_expression RIGHT_PAREN );
    public final OmttParser.object_return object() throws RecognitionException {
        OmttParser.object_return retval = new OmttParser.object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN260=null;
        Token RIGHT_PAREN262=null;
        OmttParser.object_atom_return object_atom256 = null;

        OmttParser.data_expression_return data_expression257 = null;

        OmttParser.tuple_return tuple258 = null;

        OmttParser.record_return record259 = null;

        OmttParser.sequence_expression_return sequence_expression261 = null;


        Object LEFT_PAREN260_tree=null;
        Object RIGHT_PAREN262_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:483:2: ( object_atom | data_expression | tuple | record | LEFT_PAREN sequence_expression RIGHT_PAREN )
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
                else if ( ((LA86_3>=STRING_LITERAL && LA86_3<=REAL_NUMBER)||LA86_3==DATA_START||LA86_3==DEF||LA86_3==IF||(LA86_3>=MAP && LA86_3<=MATCH)||(LA86_3>=LAMBDA && LA86_3<=FALSE)||LA86_3==OP_FOLLOW||(LA86_3>=TILDE && LA86_3<=LEFT_PAREN)||LA86_3==LEFT_SQUARE_PAREN||LA86_3==OP_MINUS||LA86_3==OP_NOT||LA86_3==OP_GENERAL||LA86_3==CLASS_ID) ) {
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:483:4: object_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_object_atom_in_object3405);
                    object_atom256=object_atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, object_atom256.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:484:5: data_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_data_expression_in_object3411);
                    data_expression257=data_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_expression257.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:485:4: tuple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tuple_in_object3416);
                    tuple258=tuple();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tuple258.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:486:5: record
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_record_in_object3422);
                    record259=record();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, record259.getTree());

                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:487:5: LEFT_PAREN sequence_expression RIGHT_PAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LEFT_PAREN260=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_object3428); if (state.failed) return retval;
                    pushFollow(FOLLOW_sequence_expression_in_object3431);
                    sequence_expression261=sequence_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence_expression261.getTree());
                    RIGHT_PAREN262=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_object3433); if (state.failed) return retval;

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:490:10: fragment namespace_id : ( (ns= VAR_ID OP_VIEW )? id= VAR_ID -> ^( IDENT[$id] ( $ns)? ) | (ns= VAR_ID OP_VIEW )? id= OP_GENERAL -> ^( IDENT[$id] ( $ns)? ) );
    public final OmttParser.namespace_id_return namespace_id() throws RecognitionException {
        OmttParser.namespace_id_return retval = new OmttParser.namespace_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ns=null;
        Token id=null;
        Token OP_VIEW263=null;
        Token OP_VIEW264=null;

        Object ns_tree=null;
        Object id_tree=null;
        Object OP_VIEW263_tree=null;
        Object OP_VIEW264_tree=null;
        RewriteRuleTokenStream stream_OP_GENERAL=new RewriteRuleTokenStream(adaptor,"token OP_GENERAL");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_VIEW=new RewriteRuleTokenStream(adaptor,"token OP_VIEW");

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:491:3: ( (ns= VAR_ID OP_VIEW )? id= VAR_ID -> ^( IDENT[$id] ( $ns)? ) | (ns= VAR_ID OP_VIEW )? id= OP_GENERAL -> ^( IDENT[$id] ( $ns)? ) )
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
                else if ( (LA89_1==EOF||(LA89_1>=STRING_LITERAL && LA89_1<=DATA_START)||(LA89_1>=EXPRESSION_END && LA89_1<=OP_DATA_IS_EXPRESSION)||(LA89_1>=AND && LA89_1<=IN)||(LA89_1>=ELSE && LA89_1<=AS)||(LA89_1>=MAP && LA89_1<=ORDER)||(LA89_1>=NULL && LA89_1<=FALSE)||LA89_1==OP_FOLLOW||(LA89_1>=COLON && LA89_1<=OP_GE)||(LA89_1>=OP_AND && LA89_1<=OP_OR)||LA89_1==OP_CONTEXT||(LA89_1>=OP_CONCAT && LA89_1<=OP_GENERAL)||LA89_1==VAR_ID) ) {
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:491:5: (ns= VAR_ID OP_VIEW )? id= VAR_ID
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:491:5: (ns= VAR_ID OP_VIEW )?
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
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:491:6: ns= VAR_ID OP_VIEW
                            {
                            ns=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id3451); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_VAR_ID.add(ns);

                            OP_VIEW263=(Token)match(input,OP_VIEW,FOLLOW_OP_VIEW_in_namespace_id3453); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_VIEW.add(OP_VIEW263);


                            }
                            break;

                    }

                    id=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id3459); if (state.failed) return retval; 
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
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:493:5: (ns= VAR_ID OP_VIEW )? id= OP_GENERAL
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:493:5: (ns= VAR_ID OP_VIEW )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==VAR_ID) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:493:6: ns= VAR_ID OP_VIEW
                            {
                            ns=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id3486); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_VAR_ID.add(ns);

                            OP_VIEW264=(Token)match(input,OP_VIEW,FOLLOW_OP_VIEW_in_namespace_id3488); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_VIEW.add(OP_VIEW264);


                            }
                            break;

                    }

                    id=(Token)match(input,OP_GENERAL,FOLLOW_OP_GENERAL_in_namespace_id3494); if (state.failed) return retval; 
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
                    // 494:5: -> ^( IDENT[$id] ( $ns)? )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:494:8: ^( IDENT[$id] ( $ns)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Ident(IDENT, id), root_1);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:494:28: ( $ns)?
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:497:1: tuple : LEFT_SQUARE_PAREN expr+= expression ( COMMA expr+= expression )* RIGHT_SQUARE_PAREN -> ^( TUPLE ( $expr)+ ) ;
    public final OmttParser.tuple_return tuple() throws RecognitionException {
        OmttParser.tuple_return retval = new OmttParser.tuple_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE_PAREN265=null;
        Token COMMA266=null;
        Token RIGHT_SQUARE_PAREN267=null;
        List list_expr=null;
        OmttParser.expression_return expr = null;
         expr = null;
        Object LEFT_SQUARE_PAREN265_tree=null;
        Object COMMA266_tree=null;
        Object RIGHT_SQUARE_PAREN267_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:498:2: ( LEFT_SQUARE_PAREN expr+= expression ( COMMA expr+= expression )* RIGHT_SQUARE_PAREN -> ^( TUPLE ( $expr)+ ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:498:4: LEFT_SQUARE_PAREN expr+= expression ( COMMA expr+= expression )* RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN265=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_tuple3524); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN265);

            pushFollow(FOLLOW_expression_in_tuple3528);
            expr=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expr.getTree());
            if (list_expr==null) list_expr=new ArrayList();
            list_expr.add(expr.getTree());

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:498:39: ( COMMA expr+= expression )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==COMMA) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:498:40: COMMA expr+= expression
            	    {
            	    COMMA266=(Token)match(input,COMMA,FOLLOW_COMMA_in_tuple3531); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA266);

            	    pushFollow(FOLLOW_expression_in_tuple3535);
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

            RIGHT_SQUARE_PAREN267=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_tuple3539); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN267);

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
            // 500:3: -> ^( TUPLE ( $expr)+ )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:500:6: ^( TUPLE ( $expr)+ )
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:502:1: record : LEFT_SQUARE_PAREN expr+= record_item ( COMMA expr+= record_item )* RIGHT_SQUARE_PAREN -> ^( RECORD ( $expr)* ) ;
    public final OmttParser.record_return record() throws RecognitionException {
        OmttParser.record_return retval = new OmttParser.record_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE_PAREN268=null;
        Token COMMA269=null;
        Token RIGHT_SQUARE_PAREN270=null;
        List list_expr=null;
        OmttParser.record_item_return expr = null;
         expr = null;
        Object LEFT_SQUARE_PAREN268_tree=null;
        Object COMMA269_tree=null;
        Object RIGHT_SQUARE_PAREN270_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_record_item=new RewriteRuleSubtreeStream(adaptor,"rule record_item");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:503:2: ( LEFT_SQUARE_PAREN expr+= record_item ( COMMA expr+= record_item )* RIGHT_SQUARE_PAREN -> ^( RECORD ( $expr)* ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:503:4: LEFT_SQUARE_PAREN expr+= record_item ( COMMA expr+= record_item )* RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN268=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_record3565); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN268);

            pushFollow(FOLLOW_record_item_in_record3569);
            expr=record_item();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_record_item.add(expr.getTree());
            if (list_expr==null) list_expr=new ArrayList();
            list_expr.add(expr.getTree());

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:503:40: ( COMMA expr+= record_item )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==COMMA) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:503:41: COMMA expr+= record_item
            	    {
            	    COMMA269=(Token)match(input,COMMA,FOLLOW_COMMA_in_record3572); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA269);

            	    pushFollow(FOLLOW_record_item_in_record3576);
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

            RIGHT_SQUARE_PAREN270=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_record3580); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN270);

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
            // 505:3: -> ^( RECORD ( $expr)* )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:505:6: ^( RECORD ( $expr)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RECORD, "RECORD"), root_1);

                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:505:15: ( $expr)*
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:507:10: fragment record_item : VAR_ID COLON expression ;
    public final OmttParser.record_item_return record_item() throws RecognitionException {
        OmttParser.record_item_return retval = new OmttParser.record_item_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID271=null;
        Token COLON272=null;
        OmttParser.expression_return expression273 = null;


        Object VAR_ID271_tree=null;
        Object COLON272_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:508:2: ( VAR_ID COLON expression )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:508:4: VAR_ID COLON expression
            {
            root_0 = (Object)adaptor.nil();

            VAR_ID271=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_record_item3607); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR_ID271_tree = (Object)adaptor.create(VAR_ID271);
            adaptor.addChild(root_0, VAR_ID271_tree);
            }
            COLON272=(Token)match(input,COLON,FOLLOW_COLON_in_record_item3609); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_record_item3612);
            expression273=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression273.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:511:1: sequence_expression : (expr= expression -> $expr) ( ( COMMA rexpr+= expression )+ -> ^( SEQUENCE $sequence_expression ( $rexpr)+ ) | -> $sequence_expression) ;
    public final OmttParser.sequence_expression_return sequence_expression() throws RecognitionException {
        OmttParser.sequence_expression_return retval = new OmttParser.sequence_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA274=null;
        List list_rexpr=null;
        OmttParser.expression_return expr = null;

        OmttParser.expression_return rexpr = null;
         rexpr = null;
        Object COMMA274_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:512:2: ( (expr= expression -> $expr) ( ( COMMA rexpr+= expression )+ -> ^( SEQUENCE $sequence_expression ( $rexpr)+ ) | -> $sequence_expression) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:512:4: (expr= expression -> $expr) ( ( COMMA rexpr+= expression )+ -> ^( SEQUENCE $sequence_expression ( $rexpr)+ ) | -> $sequence_expression)
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:512:4: (expr= expression -> $expr)
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:512:5: expr= expression
            {
            pushFollow(FOLLOW_expression_in_sequence_expression3626);
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
            // 512:21: -> $expr
            {
                adaptor.addChild(root_0, stream_expr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:513:3: ( ( COMMA rexpr+= expression )+ -> ^( SEQUENCE $sequence_expression ( $rexpr)+ ) | -> $sequence_expression)
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:513:5: ( COMMA rexpr+= expression )+
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:513:5: ( COMMA rexpr+= expression )+
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
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:513:6: COMMA rexpr+= expression
                    	    {
                    	    COMMA274=(Token)match(input,COMMA,FOLLOW_COMMA_in_sequence_expression3639); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA274);

                    	    pushFollow(FOLLOW_expression_in_sequence_expression3643);
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
                    // elements: sequence_expression, rexpr
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
                    // 514:4: -> ^( SEQUENCE $sequence_expression ( $rexpr)+ )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:514:7: ^( SEQUENCE $sequence_expression ( $rexpr)+ )
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:515:5: 
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
                    // 515:5: -> $sequence_expression
                    {
                        adaptor.addChild(root_0, stream_retval.nextTree());

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

        Token STRING_LITERAL276=null;
        Token NULL277=null;
        Token TILDE278=null;
        Token TRUE279=null;
        Token FALSE280=null;
        OmttParser.number_atom_return number_atom275 = null;


        Object STRING_LITERAL276_tree=null;
        Object NULL277_tree=null;
        Object TILDE278_tree=null;
        Object TRUE279_tree=null;
        Object FALSE280_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:521:3: ( number_atom | STRING_LITERAL | ( NULL | TILDE ) | ( TRUE | FALSE ) )
            int alt96=4;
            switch ( input.LA(1) ) {
            case INT_NUMBER:
            case REAL_NUMBER:
                {
                alt96=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt96=2;
                }
                break;
            case NULL:
            case TILDE:
                {
                alt96=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt96=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:521:5: number_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_atom_in_object_atom3690);
                    number_atom275=number_atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number_atom275.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:522:5: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL276=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_object_atom3696); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL276_tree = new Literal(STRING_LITERAL276) ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_LITERAL276_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:523:5: ( NULL | TILDE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:523:5: ( NULL | TILDE )
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==NULL) ) {
                        alt94=1;
                    }
                    else if ( (LA94_0==TILDE) ) {
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
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:523:6: NULL
                            {
                            NULL277=(Token)match(input,NULL,FOLLOW_NULL_in_object_atom3707); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NULL277_tree = new Literal(NULL277) ;
                            root_0 = (Object)adaptor.becomeRoot(NULL277_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:523:23: TILDE
                            {
                            TILDE278=(Token)match(input,TILDE,FOLLOW_TILDE_in_object_atom3715); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TILDE278_tree = new Literal(TILDE278) ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE278_tree, root_0);
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
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==TRUE) ) {
                        alt95=1;
                    }
                    else if ( (LA95_0==FALSE) ) {
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
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:524:6: TRUE
                            {
                            TRUE279=(Token)match(input,TRUE,FOLLOW_TRUE_in_object_atom3728); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TRUE279_tree = new Literal(TRUE279) ;
                            root_0 = (Object)adaptor.becomeRoot(TRUE279_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:524:23: FALSE
                            {
                            FALSE280=(Token)match(input,FALSE,FOLLOW_FALSE_in_object_atom3736); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            FALSE280_tree = new Literal(FALSE280) ;
                            root_0 = (Object)adaptor.becomeRoot(FALSE280_tree, root_0);
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

        Token INT_NUMBER281=null;
        Token REAL_NUMBER282=null;

        Object INT_NUMBER281_tree=null;
        Object REAL_NUMBER282_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:528:3: ( INT_NUMBER | REAL_NUMBER )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==INT_NUMBER) ) {
                alt97=1;
            }
            else if ( (LA97_0==REAL_NUMBER) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:528:5: INT_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    INT_NUMBER281=(Token)match(input,INT_NUMBER,FOLLOW_INT_NUMBER_in_number_atom3754); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT_NUMBER281_tree = new Literal(INT_NUMBER281) ;
                    root_0 = (Object)adaptor.becomeRoot(INT_NUMBER281_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:529:5: REAL_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    REAL_NUMBER282=(Token)match(input,REAL_NUMBER,FOLLOW_REAL_NUMBER_in_number_atom3764); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REAL_NUMBER282_tree = new Literal(REAL_NUMBER282) ;
                    root_0 = (Object)adaptor.becomeRoot(REAL_NUMBER282_tree, root_0);
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

    // $ANTLR start synpred31_OmttParser
    public final void synpred31_OmttParser_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:131:5: ( lambda_expression )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:131:5: lambda_expression
        {
        pushFollow(FOLLOW_lambda_expression_in_synpred31_OmttParser779);
        lambda_expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_OmttParser

    // $ANTLR start synpred101_OmttParser
    public final void synpred101_OmttParser_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:435:5: ( sequence_selectors )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:435:5: sequence_selectors
        {
        pushFollow(FOLLOW_sequence_selectors_in_synpred101_OmttParser3116);
        sequence_selectors();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_OmttParser

    // $ANTLR start synpred102_OmttParser
    public final void synpred102_OmttParser_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:442:5: ( sequence_selectors )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:442:5: sequence_selectors
        {
        pushFollow(FOLLOW_sequence_selectors_in_synpred102_OmttParser3162);
        sequence_selectors();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred102_OmttParser

    // $ANTLR start synpred103_OmttParser
    public final void synpred103_OmttParser_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:448:11: ( sequence_selectors )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:448:11: sequence_selectors
        {
        pushFollow(FOLLOW_sequence_selectors_in_synpred103_OmttParser3204);
        sequence_selectors();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred103_OmttParser

    // $ANTLR start synpred104_OmttParser
    public final void synpred104_OmttParser_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:451:18: ( sequence_selector )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:451:18: sequence_selector
        {
        pushFollow(FOLLOW_sequence_selector_in_synpred104_OmttParser3219);
        sequence_selector();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_OmttParser

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
    public final boolean synpred102_OmttParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_OmttParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_OmttParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_OmttParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_OmttParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_OmttParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA79 dfa79 = new DFA79(this);
    static final String DFA22_eotS =
        "\27\uffff";
    static final String DFA22_eofS =
        "\27\uffff";
    static final String DFA22_minS =
        "\1\35\5\uffff\2\0\2\uffff\3\0\12\uffff";
    static final String DFA22_maxS =
        "\1\154\5\uffff\2\0\2\uffff\3\0\12\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\7\uffff\1\6\11\uffff";
    static final String DFA22_specialS =
        "\6\uffff\1\0\1\1\2\uffff\1\2\1\3\1\4\12\uffff}>";
    static final String[] DFA22_transitionS = {
            "\3\15\3\uffff\1\15\17\uffff\1\1\2\uffff\1\2\4\uffff\1\3\1\15"+
            "\1\4\3\uffff\1\5\3\15\2\uffff\1\5\10\uffff\1\6\1\13\1\uffff"+
            "\1\14\2\uffff\1\15\13\uffff\1\15\3\uffff\1\12\3\uffff\1\7\1"+
            "\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
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
            ""
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
            return "126:1: expression : ( def_in_expression | if_expression | map_expression | match_expression | lambda_expression | context_expression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_6 = input.LA(1);

                         
                        int index22_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_OmttParser()) ) {s = 5;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index22_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_7 = input.LA(1);

                         
                        int index22_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_OmttParser()) ) {s = 5;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index22_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_10 = input.LA(1);

                         
                        int index22_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_OmttParser()) ) {s = 5;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index22_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_11 = input.LA(1);

                         
                        int index22_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_OmttParser()) ) {s = 5;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index22_11);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_12 = input.LA(1);

                         
                        int index22_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_OmttParser()) ) {s = 5;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index22_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA76_eotS =
        "\62\uffff";
    static final String DFA76_eofS =
        "\1\4\61\uffff";
    static final String DFA76_minS =
        "\1\35\2\0\57\uffff";
    static final String DFA76_maxS =
        "\1\152\2\0\57\uffff";
    static final String DFA76_acceptS =
        "\3\uffff\1\1\1\2\55\uffff";
    static final String DFA76_specialS =
        "\1\uffff\1\0\1\1\57\uffff}>";
    static final String[] DFA76_transitionS = {
            "\7\4\2\uffff\2\4\14\uffff\2\4\2\uffff\1\4\1\3\1\uffff\5\4\2"+
            "\uffff\3\4\2\uffff\1\4\2\uffff\2\4\1\1\1\uffff\5\4\1\2\13\4"+
            "\1\uffff\2\4\1\uffff\1\4\1\uffff\2\4\3\uffff\1\4",
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
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "435:3: ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_1 = input.LA(1);

                         
                        int index76_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_OmttParser()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_2 = input.LA(1);

                         
                        int index76_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_OmttParser()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA77_eotS =
        "\62\uffff";
    static final String DFA77_eofS =
        "\1\4\61\uffff";
    static final String DFA77_minS =
        "\1\35\2\0\57\uffff";
    static final String DFA77_maxS =
        "\1\152\2\0\57\uffff";
    static final String DFA77_acceptS =
        "\3\uffff\1\1\1\2\55\uffff";
    static final String DFA77_specialS =
        "\1\uffff\1\0\1\1\57\uffff}>";
    static final String[] DFA77_transitionS = {
            "\7\4\2\uffff\2\4\14\uffff\2\4\2\uffff\1\4\1\3\1\uffff\5\4\2"+
            "\uffff\3\4\2\uffff\1\4\2\uffff\2\4\1\1\1\uffff\5\4\1\2\13\4"+
            "\1\uffff\2\4\1\uffff\1\4\1\uffff\2\4\3\uffff\1\4",
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
            ""
    };

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "442:3: ( sequence_selectors -> ^( ATOM_SELECT object sequence_selectors ) | -> object )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_1 = input.LA(1);

                         
                        int index77_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_OmttParser()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA77_2 = input.LA(1);

                         
                        int index77_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_OmttParser()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index77_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\62\uffff";
    static final String DFA78_eofS =
        "\1\4\61\uffff";
    static final String DFA78_minS =
        "\1\35\2\0\57\uffff";
    static final String DFA78_maxS =
        "\1\152\2\0\57\uffff";
    static final String DFA78_acceptS =
        "\3\uffff\1\1\1\2\55\uffff";
    static final String DFA78_specialS =
        "\1\uffff\1\0\1\1\57\uffff}>";
    static final String[] DFA78_transitionS = {
            "\7\4\2\uffff\2\4\14\uffff\2\4\2\uffff\1\4\1\3\1\uffff\5\4\2"+
            "\uffff\3\4\2\uffff\1\4\2\uffff\2\4\1\1\1\uffff\5\4\1\2\13\4"+
            "\1\uffff\2\4\1\uffff\1\4\1\uffff\2\4\3\uffff\1\4",
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
            return "448:11: ( sequence_selectors )?";
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
                        if ( (synpred103_OmttParser()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index78_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA78_2 = input.LA(1);

                         
                        int index78_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_OmttParser()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
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
        "\1\2\62\uffff";
    static final String DFA79_minS =
        "\1\35\1\0\61\uffff";
    static final String DFA79_maxS =
        "\1\152\1\0\61\uffff";
    static final String DFA79_acceptS =
        "\2\uffff\1\2\57\uffff\1\1";
    static final String DFA79_specialS =
        "\1\uffff\1\0\61\uffff}>";
    static final String[] DFA79_transitionS = {
            "\7\2\2\uffff\2\2\14\uffff\2\2\2\uffff\2\2\1\uffff\5\2\2\uffff"+
            "\3\2\2\uffff\1\2\2\uffff\3\2\1\uffff\5\2\1\1\13\2\1\uffff\2"+
            "\2\1\uffff\1\2\1\uffff\2\2\3\uffff\1\2",
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
            return "451:18: ( sequence_selector )?";
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

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index79_1);
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
 

    public static final BitSet FOLLOW_header_in_program62 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_definitions_in_program64 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_declaration_in_header102 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_use_declarations_in_header109 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_import_declarations_in_header115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_module_declaration128 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_MODULE_in_module_declaration130 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_module_id_in_module_declaration132 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_module_declaration134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_use_declarations164 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_use_declaration_in_use_declarations167 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_use_declarations170 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_TAG_START_in_import_declarations202 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_import_declaration_in_import_declarations205 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_import_declarations208 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_declaration239 = new BitSet(new long[]{0x0000000000000000L,0x0000144000000000L});
    public static final BitSet FOLLOW_external_class_name_in_import_declaration243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_use_declaration272 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_module_id_in_use_declaration274 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_AS_in_use_declaration277 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_use_declaration279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_external_class_name320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_external_class_name322 = new BitSet(new long[]{0x0000000000000000L,0x0000144000000000L});
    public static final BitSet FOLLOW_set_in_external_class_name327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_module_id348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_module_id350 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_module_id355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_definition_in_definitions371 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_TAG_START_in_tag_definition394 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_DEF_in_tag_definition396 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_definition_signature_in_tag_definition398 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_tag_content_in_tag_definition404 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_tag_definition408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_signature439 = new BitSet(new long[]{0x0000000000000002L,0x0000040000090080L});
    public static final BitSet FOLLOW_definition_context_in_definition_signature441 = new BitSet(new long[]{0x0000000000000002L,0x0000040000010080L});
    public static final BitSet FOLLOW_definition_argument_in_definition_signature444 = new BitSet(new long[]{0x0000000000000002L,0x0000040000010080L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_definition_signature448 = new BitSet(new long[]{0x0000000000000000L,0x00001040000A0000L});
    public static final BitSet FOLLOW_type_in_definition_signature452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_definition_context496 = new BitSet(new long[]{0x0000000000000000L,0x00001040000A0000L});
    public static final BitSet FOLLOW_single_type_in_definition_context498 = new BitSet(new long[]{0x4000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_where_clause_in_definition_context500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_definition_context503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where_clause529 = new BitSet(new long[]{0x18480008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_safe_expression_in_where_clause532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_definition_argument546 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_argument551 = new BitSet(new long[]{0x0000000000000002L,0x0000000000801000L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_definition_argument553 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_definition_argument557 = new BitSet(new long[]{0x0000000000000000L,0x00001040000A0000L});
    public static final BitSet FOLLOW_type_in_definition_argument559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content605 = new BitSet(new long[]{0x0000002220000002L});
    public static final BitSet FOLLOW_data_body_atom_in_tag_content611 = new BitSet(new long[]{0x0000002220000002L});
    public static final BitSet FOLLOW_OP_DATA_IS_EXPRESSION_in_tag_content634 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content636 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_tag_content642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_data_body_atom663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_inside_data_in_data_body_atom673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_inside_data_in_data_body_atom679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_START_in_expression_inside_data694 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_expression_inside_data697 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EXPRESSION_END_in_expression_inside_data699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_tag_in_tag_inside_data715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_tag_in_tag_inside_data721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_tag_in_tag_inside_data727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_tag_in_tag_inside_data733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_apply_tag_in_tag_inside_data739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_expression_in_expression755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expression_in_expression761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_expression_in_expression767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expression_in_expression773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expression_in_expression779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_context_expression_in_expression785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safe_def_in_expression_in_safe_expression798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safe_if_expression_in_safe_expression804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safe_map_expression_in_safe_expression810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strict_expression_in_safe_expression816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_def_in_expression830 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression834 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_AND_in_def_in_expression841 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression845 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_expression853 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B049EL});
    public static final BitSet FOLLOW_COLON_in_def_in_expression855 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_def_in_expression860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_safe_def_in_expression892 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_safe_def_in_expression896 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_AND_in_safe_def_in_expression903 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_safe_def_in_expression907 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_IN_in_safe_def_in_expression915 = new BitSet(new long[]{0x18480008E0000000L,0x00000444004B041CL});
    public static final BitSet FOLLOW_COLON_in_safe_def_in_expression917 = new BitSet(new long[]{0x18480008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_safe_expression_in_safe_def_in_expression922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_expression954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_definition_inside_expression956 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_expression985 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_expression987 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag1025 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_DEF_in_def_in_tag1027 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag1031 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag1038 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_AND_in_def_in_tag1040 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag1044 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag1052 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_tag1054 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_tag_content_in_def_in_tag1058 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_def_in_tag1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_tag1096 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_tag_content_in_definition_inside_tag1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_tag1124 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_tag1126 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_definition_inside_tag1128 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_CONTENT_in_definition_inside_tag1131 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_definition_inside_tag1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAMBDA_in_lambda_expression1172 = new BitSet(new long[]{0x0000000000000000L,0x0000040000010400L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression1174 = new BitSet(new long[]{0x0000000000000000L,0x0000040000010400L});
    public static final BitSet FOLLOW_COLON_in_lambda_expression1177 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_lambda_expression1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression1207 = new BitSet(new long[]{0x0000000000000000L,0x0000040000010080L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_lambda_expression1210 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_lambda_expression1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_match_expression_in_lambda_expression1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_lambda_match_in_lambda_match_expression1252 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMICOLON_in_lambda_match_expression1255 = new BitSet(new long[]{0x0000000000000000L,0x00001440000B0082L});
    public static final BitSet FOLLOW_single_lambda_match_in_lambda_match_expression1257 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_single_type_in_single_lambda_match1285 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_where_clause_in_single_lambda_match1287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_single_lambda_match1290 = new BitSet(new long[]{0x18480008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_safe_expression_in_single_lambda_match1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_content_in_type1322 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_type1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_content_in_single_type1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_ID_in_type_content1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GENERAL_in_type_content1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_type_content1395 = new BitSet(new long[]{0x0000000000000000L,0x00001440000B0000L});
    public static final BitSet FOLLOW_argument_type_in_type_content1397 = new BitSet(new long[]{0x0000000000000000L,0x00001440000B0080L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_type_content1400 = new BitSet(new long[]{0x0000000000000000L,0x00001040000A0000L});
    public static final BitSet FOLLOW_type_in_type_content1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_type_content1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_type_content1424 = new BitSet(new long[]{0x0000000000000000L,0x00001040000A0000L});
    public static final BitSet FOLLOW_type_in_type_content1428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_type_content1431 = new BitSet(new long[]{0x0000000000000000L,0x00001040000A0000L});
    public static final BitSet FOLLOW_type_in_type_content1435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_type_content1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_type_content1462 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_record_item_type_in_type_content1466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_COMMA_in_type_content1469 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_record_item_type_in_type_content1473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_type_content1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_argument_type1506 = new BitSet(new long[]{0x0000000000000000L,0x00001440000A0000L});
    public static final BitSet FOLLOW_VAR_ID_in_argument_type1510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_argument_type1512 = new BitSet(new long[]{0x0000000000000000L,0x00001040000A0000L});
    public static final BitSet FOLLOW_type_in_argument_type1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_record_item_type1544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_record_item_type1546 = new BitSet(new long[]{0x0000000000000000L,0x00001040000A0000L});
    public static final BitSet FOLLOW_type_in_record_item_type1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_expression1564 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_context_expression_in_if_expression1568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_if_expression1570 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_if_expression1578 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_expression1584 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B049EL});
    public static final BitSet FOLLOW_COLON_in_if_expression1586 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_if_expression1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_safe_if_expression1629 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_context_expression_in_safe_if_expression1633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_safe_if_expression1635 = new BitSet(new long[]{0x18480008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_safe_expression_in_safe_if_expression1643 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ELSE_in_safe_if_expression1649 = new BitSet(new long[]{0x18480008E0000000L,0x00000444004B041CL});
    public static final BitSet FOLLOW_COLON_in_safe_if_expression1651 = new BitSet(new long[]{0x18480008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_safe_expression_in_safe_if_expression1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_if_tag1694 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_if_subtag_in_if_tag1700 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_if_tag1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_subtag1722 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_context_expression_in_if_subtag1726 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_tag_content_in_if_subtag1734 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_TAG_START_in_if_subtag1744 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_subtag1746 = new BitSet(new long[]{0x0040008100000000L});
    public static final BitSet FOLLOW_tag_content_in_if_subtag1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_subtag_in_if_subtag1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_map_expression1803 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_item_alias_in_map_expression1805 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_context_expression_in_map_expression1810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_map_expression1812 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_map_expression1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_safe_map_expression1854 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_item_alias_in_safe_map_expression1856 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_context_expression_in_safe_map_expression1861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_safe_map_expression1863 = new BitSet(new long[]{0x18480008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_safe_expression_in_safe_map_expression1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_map_tag1905 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_MAP_in_map_tag1907 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_item_alias_in_map_tag1909 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_context_expression_in_map_tag1914 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_tag_content_in_map_tag1922 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_map_tag1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_item_alias1964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OP_REVERSE_FOLLOW_in_item_alias1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_match_expression1988 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_context_expression_in_match_expression1992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_match_expression1994 = new BitSet(new long[]{0x0000000000000000L,0x00001440000B0082L});
    public static final BitSet FOLLOW_lambda_match_expression_in_match_expression2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strict_expression_in_context_expression2047 = new BitSet(new long[]{0xF800000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_op_apply_in_context_expression2059 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_atom_expression_in_context_expression2061 = new BitSet(new long[]{0xF8000008E0000000L,0x0000044C004B001CL});
    public static final BitSet FOLLOW_function_arguments_in_context_expression2065 = new BitSet(new long[]{0xF800000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_op_map_in_context_expression2103 = new BitSet(new long[]{0x18480008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_safe_expression_in_context_expression2107 = new BitSet(new long[]{0xF800000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_WHERE_in_context_expression2130 = new BitSet(new long[]{0x18480008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_safe_expression_in_context_expression2132 = new BitSet(new long[]{0xF800000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_ORDER_in_context_expression2161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_BY_in_context_expression2163 = new BitSet(new long[]{0x18480008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_safe_expression_in_context_expression2165 = new BitSet(new long[]{0xF800000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_MATCH_in_context_expression2194 = new BitSet(new long[]{0x0000000000000000L,0x00001440000B0082L});
    public static final BitSet FOLLOW_lambda_match_expression_in_context_expression2196 = new BitSet(new long[]{0xF800000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_OP_CONTEXT_in_op_apply2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_op_apply2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_op_map2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_apply_expression2277 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_atom_expression_in_apply_expression2279 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_function_arguments_in_apply_expression2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_apply_tag2326 = new BitSet(new long[]{0x18480008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_apply_expression_in_apply_tag2329 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_apply_tag2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concatence_expression_in_strict_expression2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_apply_expression_in_strict_expression2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_concatence_expression2365 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_OP_CONCAT_in_concatence_expression2379 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_boolean_expression_in_concatence_expression2383 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_boolean_binary_expression_in_boolean_expression2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression2426 = new BitSet(new long[]{0x0000000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_boolean_binary_operator_in_boolean_binary_expression2429 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression2432 = new BitSet(new long[]{0x0000000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_boolean_unary_operator_in_boolean_unary_expression2448 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_AND_in_boolean_binary_operator2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_OR_in_boolean_binary_operator2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_in_boolean_unary_operator2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression2517 = new BitSet(new long[]{0x0000000000000002L,0x000000007E000000L});
    public static final BitSet FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression2520 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression2523 = new BitSet(new long[]{0x0000000000000002L,0x000000007E000000L});
    public static final BitSet FOLLOW_OP_EQUAL_in_boolean_comparsion_operator2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LE_in_boolean_comparsion_operator2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LEQ_in_boolean_comparsion_operator2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GE_in_boolean_comparsion_operator2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GEQ_in_boolean_comparsion_operator2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2609 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_OP_PLUS_in_additive_expression2625 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_OP_MINUS_in_additive_expression2639 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2659 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression2679 = new BitSet(new long[]{0x0000000000000002L,0x0000000001808000L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_multiplicative_expression2689 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_SLASH_in_multiplicative_expression2703 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_OP_MODULO_in_multiplicative_expression2717 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression2737 = new BitSet(new long[]{0x0000000000000002L,0x0000000001808000L});
    public static final BitSet FOLLOW_OP_MINUS_in_negative_expression2756 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_functional_expression_in_negative_expression2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functional_expression_in_negative_expression2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_expression_in_functional_expression2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expression_in_call_expression2803 = new BitSet(new long[]{0x00000008E0000002L,0x00000444004B001CL});
    public static final BitSet FOLLOW_function_argument_in_call_expression2811 = new BitSet(new long[]{0x00000008E0000002L,0x00000444004B001CL});
    public static final BitSet FOLLOW_TAG_START_in_call_tag2871 = new BitSet(new long[]{0x0000000000000000L,0x0000044000000000L});
    public static final BitSet FOLLOW_namespace_id_in_call_tag2875 = new BitSet(new long[]{0x0000008DE0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_tag_content_in_call_tag2885 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_function_argument_in_call_tag2891 = new BitSet(new long[]{0x0000008DE0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_tag_content_in_call_tag2897 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_call_tag2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_argument_in_function_arguments2966 = new BitSet(new long[]{0x00000008E0000002L,0x00000444004B001CL});
    public static final BitSet FOLLOW_VAR_ID_in_function_argument2982 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_function_argument2984 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_atom_expression_in_function_argument2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_with_selectors_in_atom_expression3024 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_atom_expression3037 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_expression_select_in_atom_expression3041 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_atom_expression3068 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_property_select_in_atom_expression3072 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_atom_in_atom_with_selectors3110 = new BitSet(new long[]{0x0200000000000002L,0x0000000000081000L});
    public static final BitSet FOLLOW_sequence_selectors_in_atom_with_selectors3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_expression_select3156 = new BitSet(new long[]{0x0200000000000002L,0x0000000000081000L});
    public static final BitSet FOLLOW_sequence_selectors_in_expression_select3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_property_select3202 = new BitSet(new long[]{0x0200000000000002L,0x0000000000081000L});
    public static final BitSet FOLLOW_sequence_selectors_in_property_select3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_selector_in_sequence_selectors3217 = new BitSet(new long[]{0x0200000000000002L,0x0000000000081000L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors3219 = new BitSet(new long[]{0x0200000000000002L,0x0000000000081000L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors3228 = new BitSet(new long[]{0x0200000000000002L,0x0000000000081000L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_type_selector3249 = new BitSet(new long[]{0x0000000000000000L,0x00001040000A0000L});
    public static final BitSet FOLLOW_single_type_in_type_selector3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector3276 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_sequence_selector3278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_alias3304 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_alias3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_START_in_data_expression3328 = new BitSet(new long[]{0x0000003220000000L});
    public static final BitSet FOLLOW_data_body_atom_in_data_expression3330 = new BitSet(new long[]{0x0000003220000000L});
    public static final BitSet FOLLOW_DATA_END_in_data_expression3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectable_atom_in_atom3361 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOUBLE_DOT_in_atom3366 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_selectable_atom_in_atom3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_id_in_selectable_atom3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_selectable_atom3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_atom_in_object3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_expression_in_object3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tuple_in_object3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_record_in_object3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_object3428 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_sequence_expression_in_object3431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_object3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id3451 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_OP_VIEW_in_namespace_id3453 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id3486 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_OP_VIEW_in_namespace_id3488 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_OP_GENERAL_in_namespace_id3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_tuple3524 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_tuple3528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_COMMA_in_tuple3531 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_tuple3535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_tuple3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_record3565 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_record_item_in_record3569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_COMMA_in_record3572 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_record_item_in_record3576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_record3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_record_item3607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_record_item3609 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_record_item3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_sequence_expression3626 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_sequence_expression3639 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_sequence_expression3643 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_number_atom_in_object_atom3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_object_atom3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_object_atom3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_object_atom3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_object_atom3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_object_atom3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_NUMBER_in_number_atom3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_NUMBER_in_number_atom3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expression_in_synpred31_OmttParser779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selectors_in_synpred101_OmttParser3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selectors_in_synpred102_OmttParser3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selectors_in_synpred103_OmttParser3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selector_in_synpred104_OmttParser3219 = new BitSet(new long[]{0x0000000000000002L});

}