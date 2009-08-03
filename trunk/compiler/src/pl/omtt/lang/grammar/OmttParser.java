// $ANTLR 3.1.2 /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g 2009-08-03 11:20:48

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
            // elements: MODULE, module_id
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
            // elements: ec, IMPORT
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
            // elements: USE, VAR_ID, module_id
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
            // elements: definition_argument, definition_context, VAR_ID, ret_type
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:79:10: fragment definition_context : LEFT_SQUARE_PAREN single_type RIGHT_SQUARE_PAREN -> ^( ARGUMENT single_type ) ;
    public final OmttParser.definition_context_return definition_context() throws RecognitionException {
        OmttParser.definition_context_return retval = new OmttParser.definition_context_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE_PAREN37=null;
        Token RIGHT_SQUARE_PAREN39=null;
        OmttParser.single_type_return single_type38 = null;


        Object LEFT_SQUARE_PAREN37_tree=null;
        Object RIGHT_SQUARE_PAREN39_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:2: ( LEFT_SQUARE_PAREN single_type RIGHT_SQUARE_PAREN -> ^( ARGUMENT single_type ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:80:4: LEFT_SQUARE_PAREN single_type RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN37=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_definition_context496); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN37);

            pushFollow(FOLLOW_single_type_in_definition_context498);
            single_type38=single_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_single_type.add(single_type38.getTree());
            RIGHT_SQUARE_PAREN39=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_definition_context500); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN39);



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
            // 81:3: -> ^( ARGUMENT single_type )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:81:6: ^( ARGUMENT single_type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENT, "ARGUMENT"), root_1);

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
    // $ANTLR end "definition_context"

    public static class definition_argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition_argument"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:84:10: fragment definition_argument : ( TILDE )? id= VAR_ID ( OP_MULTIPLY )? ( DOT type )? -> ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? ) ;
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:85:3: ( ( TILDE )? id= VAR_ID ( OP_MULTIPLY )? ( DOT type )? -> ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:85:5: ( TILDE )? id= VAR_ID ( OP_MULTIPLY )? ( DOT type )?
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:85:5: ( TILDE )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==TILDE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: TILDE
                    {
                    TILDE40=(Token)match(input,TILDE,FOLLOW_TILDE_in_definition_argument524); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TILDE.add(TILDE40);


                    }
                    break;

            }

            id=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_argument529); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR_ID.add(id);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:85:22: ( OP_MULTIPLY )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==OP_MULTIPLY) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: OP_MULTIPLY
                    {
                    OP_MULTIPLY41=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_definition_argument531); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MULTIPLY.add(OP_MULTIPLY41);


                    }
                    break;

            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:85:35: ( DOT type )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==DOT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:85:36: DOT type
                    {
                    DOT42=(Token)match(input,DOT,FOLLOW_DOT_in_definition_argument535); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT42);

                    pushFollow(FOLLOW_type_in_definition_argument537);
                    type43=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type43.getTree());

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
            // 86:5: -> ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:86:8: ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TemplateArgument(ARGUMENT), root_1);

                adaptor.addChild(root_1, new Ident(IDENT, id));
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:86:55: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:86:61: ( TILDE )?
                if ( stream_TILDE.hasNext() ) {
                    adaptor.addChild(root_1, stream_TILDE.nextNode());

                }
                stream_TILDE.reset();
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:86:68: ( OP_MULTIPLY )?
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:92:1: tag_content : ( CONTENT ( data_body_atom )* -> ^( CONTENT ( data_body_atom )* ) | OP_DATA_IS_EXPRESSION CONTENT expression -> expression );
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:93:3: ( CONTENT ( data_body_atom )* -> ^( CONTENT ( data_body_atom )* ) | OP_DATA_IS_EXPRESSION CONTENT expression -> expression )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==CONTENT) ) {
                alt18=1;
            }
            else if ( (LA18_0==OP_DATA_IS_EXPRESSION) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:93:5: CONTENT ( data_body_atom )*
                    {
                    CONTENT44=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_tag_content583); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTENT.add(CONTENT44);

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:94:5: ( data_body_atom )*
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
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: data_body_atom
                    	    {
                    	    pushFollow(FOLLOW_data_body_atom_in_tag_content589);
                    	    data_body_atom45=data_body_atom();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_data_body_atom.add(data_body_atom45.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
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
                    // 95:5: -> ^( CONTENT ( data_body_atom )* )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:95:8: ^( CONTENT ( data_body_atom )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Data(stream_CONTENT.nextToken()), root_1);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:95:24: ( data_body_atom )*
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:96:5: OP_DATA_IS_EXPRESSION CONTENT expression
                    {
                    OP_DATA_IS_EXPRESSION46=(Token)match(input,OP_DATA_IS_EXPRESSION,FOLLOW_OP_DATA_IS_EXPRESSION_in_tag_content612); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DATA_IS_EXPRESSION.add(OP_DATA_IS_EXPRESSION46);

                    CONTENT47=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_tag_content614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTENT.add(CONTENT47);

                    pushFollow(FOLLOW_expression_in_tag_content620);
                    expression48=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression48.getTree());


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
                    // 98:5: -> expression
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:101:1: data_body_atom : ( STRING_LITERAL | expression_inside_data | tag_inside_data );
    public final OmttParser.data_body_atom_return data_body_atom() throws RecognitionException {
        OmttParser.data_body_atom_return retval = new OmttParser.data_body_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING_LITERAL49=null;
        OmttParser.expression_inside_data_return expression_inside_data50 = null;

        OmttParser.tag_inside_data_return tag_inside_data51 = null;


        Object STRING_LITERAL49_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:102:3: ( STRING_LITERAL | expression_inside_data | tag_inside_data )
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:102:5: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL49=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_data_body_atom641); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL49_tree = new Literal(STRING_LITERAL49) ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_LITERAL49_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:103:5: expression_inside_data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_inside_data_in_data_body_atom651);
                    expression_inside_data50=expression_inside_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_inside_data50.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:104:5: tag_inside_data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tag_inside_data_in_data_body_atom657);
                    tag_inside_data51=tag_inside_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tag_inside_data51.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:107:10: fragment expression_inside_data : EXPRESSION_START expression EXPRESSION_END ;
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:108:3: ( EXPRESSION_START expression EXPRESSION_END )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:108:5: EXPRESSION_START expression EXPRESSION_END
            {
            root_0 = (Object)adaptor.nil();

            EXPRESSION_START52=(Token)match(input,EXPRESSION_START,FOLLOW_EXPRESSION_START_in_expression_inside_data672); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_expression_inside_data675);
            expression53=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression53.getTree());
            EXPRESSION_END54=(Token)match(input,EXPRESSION_END,FOLLOW_EXPRESSION_END_in_expression_inside_data677); if (state.failed) return retval;

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:111:10: fragment tag_inside_data : ( def_in_tag | if_tag | call_tag | map_tag | apply_tag );
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:112:3: ( def_in_tag | if_tag | call_tag | map_tag | apply_tag )
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
                case APPLY:
                    {
                    alt20=5;
                    }
                    break;
                case IF:
                    {
                    alt20=2;
                    }
                    break;
                case OP_GENERAL:
                case VAR_ID:
                    {
                    alt20=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:112:5: def_in_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_def_in_tag_in_tag_inside_data693);
                    def_in_tag55=def_in_tag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, def_in_tag55.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:113:5: if_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_tag_in_tag_inside_data699);
                    if_tag56=if_tag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_tag56.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:114:5: call_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_tag_in_tag_inside_data705);
                    call_tag57=call_tag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call_tag57.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:115:5: map_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_tag_in_tag_inside_data711);
                    map_tag58=map_tag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_tag58.getTree());

                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:116:5: apply_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_apply_tag_in_tag_inside_data717);
                    apply_tag59=apply_tag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, apply_tag59.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:122:1: expression : ( def_in_expression | if_expression | map_expression | match_expression | lambda_expression | context_expression );
    public final OmttParser.expression_return expression() throws RecognitionException {
        OmttParser.expression_return retval = new OmttParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.def_in_expression_return def_in_expression60 = null;

        OmttParser.if_expression_return if_expression61 = null;

        OmttParser.map_expression_return map_expression62 = null;

        OmttParser.match_expression_return match_expression63 = null;

        OmttParser.lambda_expression_return lambda_expression64 = null;

        OmttParser.context_expression_return context_expression65 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:123:3: ( def_in_expression | if_expression | map_expression | match_expression | lambda_expression | context_expression )
            int alt21=6;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:123:5: def_in_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_def_in_expression_in_expression733);
                    def_in_expression60=def_in_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, def_in_expression60.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:124:5: if_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_expression_in_expression739);
                    if_expression61=if_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expression61.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:125:5: map_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_expression_in_expression745);
                    map_expression62=map_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_expression62.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:126:5: match_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_match_expression_in_expression751);
                    match_expression63=match_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, match_expression63.getTree());

                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:127:5: lambda_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expression_in_expression757);
                    lambda_expression64=lambda_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expression64.getTree());

                    }
                    break;
                case 6 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:128:5: context_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_context_expression_in_expression763);
                    context_expression65=context_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, context_expression65.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:131:1: safe_expression : ( safe_def_in_expression | safe_if_expression | safe_map_expression | strict_expression );
    public final OmttParser.safe_expression_return safe_expression() throws RecognitionException {
        OmttParser.safe_expression_return retval = new OmttParser.safe_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.safe_def_in_expression_return safe_def_in_expression66 = null;

        OmttParser.safe_if_expression_return safe_if_expression67 = null;

        OmttParser.safe_map_expression_return safe_map_expression68 = null;

        OmttParser.strict_expression_return strict_expression69 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:132:3: ( safe_def_in_expression | safe_if_expression | safe_map_expression | strict_expression )
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
            case LEFT_SQUARE_PAREN:
            case OP_MINUS:
            case OP_NOT:
            case OP_GENERAL:
            case VAR_ID:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:132:5: safe_def_in_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safe_def_in_expression_in_safe_expression776);
                    safe_def_in_expression66=safe_def_in_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safe_def_in_expression66.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:133:5: safe_if_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safe_if_expression_in_safe_expression782);
                    safe_if_expression67=safe_if_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safe_if_expression67.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:134:5: safe_map_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safe_map_expression_in_safe_expression788);
                    safe_map_expression68=safe_map_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safe_map_expression68.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:135:5: strict_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_strict_expression_in_safe_expression794);
                    strict_expression69=strict_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, strict_expression69.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:139:1: def_in_expression : DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.def_in_expression_return def_in_expression() throws RecognitionException {
        OmttParser.def_in_expression_return retval = new OmttParser.def_in_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEF70=null;
        Token AND71=null;
        Token IN72=null;
        Token COLON73=null;
        List list_definition=null;
        OmttParser.expression_return content = null;

        OmttParser.definition_inside_expression_return definition = null;
         definition = null;
        Object DEF70_tree=null;
        Object AND71_tree=null;
        Object IN72_tree=null;
        Object COLON73_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_inside_expression=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:140:3: ( DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:140:5: DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression
            {
            DEF70=(Token)match(input,DEF,FOLLOW_DEF_in_def_in_expression808); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEF.add(DEF70);

            pushFollow(FOLLOW_definition_inside_expression_in_def_in_expression812);
            definition=definition_inside_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_definition_inside_expression.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:141:5: ( AND definition+= definition_inside_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:141:6: AND definition+= definition_inside_expression
            	    {
            	    AND71=(Token)match(input,AND,FOLLOW_AND_in_def_in_expression819); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND71);

            	    pushFollow(FOLLOW_definition_inside_expression_in_def_in_expression823);
            	    definition=definition_inside_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_definition_inside_expression.add(definition.getTree());
            	    if (list_definition==null) list_definition=new ArrayList();
            	    list_definition.add(definition.getTree());


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            IN72=(Token)match(input,IN,FOLLOW_IN_in_def_in_expression831); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IN.add(IN72);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:142:8: ( COLON )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==COLON) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: COLON
                    {
                    COLON73=(Token)match(input,COLON,FOLLOW_COLON_in_def_in_expression833); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON73);


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_def_in_expression838);
            content=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(content.getTree());


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
            // 143:5: -> ^( BLOCK ( $definition)+ $content)
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:143:8: ^( BLOCK ( $definition)+ $content)
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:145:1: safe_def_in_expression : DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= safe_expression -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.safe_def_in_expression_return safe_def_in_expression() throws RecognitionException {
        OmttParser.safe_def_in_expression_return retval = new OmttParser.safe_def_in_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEF74=null;
        Token AND75=null;
        Token IN76=null;
        Token COLON77=null;
        List list_definition=null;
        OmttParser.safe_expression_return content = null;

        OmttParser.definition_inside_expression_return definition = null;
         definition = null;
        Object DEF74_tree=null;
        Object AND75_tree=null;
        Object IN76_tree=null;
        Object COLON77_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_safe_expression=new RewriteRuleSubtreeStream(adaptor,"rule safe_expression");
        RewriteRuleSubtreeStream stream_definition_inside_expression=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:146:3: ( DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= safe_expression -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:146:5: DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= safe_expression
            {
            DEF74=(Token)match(input,DEF,FOLLOW_DEF_in_safe_def_in_expression870); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEF.add(DEF74);

            pushFollow(FOLLOW_definition_inside_expression_in_safe_def_in_expression874);
            definition=definition_inside_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_definition_inside_expression.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:147:5: ( AND definition+= definition_inside_expression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==AND) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:147:6: AND definition+= definition_inside_expression
            	    {
            	    AND75=(Token)match(input,AND,FOLLOW_AND_in_safe_def_in_expression881); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND75);

            	    pushFollow(FOLLOW_definition_inside_expression_in_safe_def_in_expression885);
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

            IN76=(Token)match(input,IN,FOLLOW_IN_in_safe_def_in_expression893); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IN.add(IN76);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:148:8: ( COLON )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==COLON) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: COLON
                    {
                    COLON77=(Token)match(input,COLON,FOLLOW_COLON_in_safe_def_in_expression895); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON77);


                    }
                    break;

            }

            pushFollow(FOLLOW_safe_expression_in_safe_def_in_expression900);
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
            // 149:5: -> ^( BLOCK ( $definition)+ $content)
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:149:8: ^( BLOCK ( $definition)+ $content)
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:151:1: definition_inside_expression : ( definition_signature COLON expression -> ^( DEF definition_signature expression ) | VAR_ID OP_ASSIGN expression -> ^( DEF VAR_ID expression ) );
    public final OmttParser.definition_inside_expression_return definition_inside_expression() throws RecognitionException {
        OmttParser.definition_inside_expression_return retval = new OmttParser.definition_inside_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON79=null;
        Token VAR_ID81=null;
        Token OP_ASSIGN82=null;
        OmttParser.definition_signature_return definition_signature78 = null;

        OmttParser.expression_return expression80 = null;

        OmttParser.expression_return expression83 = null;


        Object COLON79_tree=null;
        Object VAR_ID81_tree=null;
        Object OP_ASSIGN82_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_signature=new RewriteRuleSubtreeStream(adaptor,"rule definition_signature");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:152:3: ( definition_signature COLON expression -> ^( DEF definition_signature expression ) | VAR_ID OP_ASSIGN expression -> ^( DEF VAR_ID expression ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==VAR_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==OP_ASSIGN) ) {
                    alt27=2;
                }
                else if ( (LA27_1==OP_FOLLOW||LA27_1==COLON||LA27_1==TILDE||LA27_1==LEFT_SQUARE_PAREN||LA27_1==VAR_ID) ) {
                    alt27=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:152:5: definition_signature COLON expression
                    {
                    pushFollow(FOLLOW_definition_signature_in_definition_inside_expression932);
                    definition_signature78=definition_signature();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_definition_signature.add(definition_signature78.getTree());
                    COLON79=(Token)match(input,COLON,FOLLOW_COLON_in_definition_inside_expression934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON79);

                    pushFollow(FOLLOW_expression_in_definition_inside_expression940);
                    expression80=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression80.getTree());


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
                    // 154:5: -> ^( DEF definition_signature expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:154:8: ^( DEF definition_signature expression )
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:155:5: VAR_ID OP_ASSIGN expression
                    {
                    VAR_ID81=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_inside_expression963); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID81);

                    OP_ASSIGN82=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_inside_expression965); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_ASSIGN.add(OP_ASSIGN82);

                    pushFollow(FOLLOW_expression_in_definition_inside_expression970);
                    expression83=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression83.getTree());


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
                    // 157:5: -> ^( DEF VAR_ID expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:157:8: ^( DEF VAR_ID expression )
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:160:1: def_in_tag : TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END -> ^( BLOCK ( $definition)+ $content) ;
    public final OmttParser.def_in_tag_return def_in_tag() throws RecognitionException {
        OmttParser.def_in_tag_return retval = new OmttParser.def_in_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START84=null;
        Token DEF85=null;
        Token TAG_START86=null;
        Token AND87=null;
        Token TAG_START88=null;
        Token IN89=null;
        Token TAG_END90=null;
        List list_definition=null;
        OmttParser.tag_content_return content = null;

        OmttParser.definition_inside_tag_return definition = null;
         definition = null;
        Object TAG_START84_tree=null;
        Object DEF85_tree=null;
        Object TAG_START86_tree=null;
        Object AND87_tree=null;
        Object TAG_START88_tree=null;
        Object IN89_tree=null;
        Object TAG_END90_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_definition_inside_tag=new RewriteRuleSubtreeStream(adaptor,"rule definition_inside_tag");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:161:3: ( TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:161:5: TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END
            {
            TAG_START84=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag1003); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START84);

            DEF85=(Token)match(input,DEF,FOLLOW_DEF_in_def_in_tag1005); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEF.add(DEF85);

            pushFollow(FOLLOW_definition_inside_tag_in_def_in_tag1009);
            definition=definition_inside_tag();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_definition_inside_tag.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:162:5: ( TAG_START AND definition+= definition_inside_tag )*
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
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:162:6: TAG_START AND definition+= definition_inside_tag
            	    {
            	    TAG_START86=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag1016); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START86);

            	    AND87=(Token)match(input,AND,FOLLOW_AND_in_def_in_tag1018); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND87);

            	    pushFollow(FOLLOW_definition_inside_tag_in_def_in_tag1022);
            	    definition=definition_inside_tag();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_definition_inside_tag.add(definition.getTree());
            	    if (list_definition==null) list_definition=new ArrayList();
            	    list_definition.add(definition.getTree());


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            TAG_START88=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_def_in_tag1030); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START88);

            IN89=(Token)match(input,IN,FOLLOW_IN_in_def_in_tag1032); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IN.add(IN89);

            pushFollow(FOLLOW_tag_content_in_def_in_tag1036);
            content=tag_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tag_content.add(content.getTree());
            TAG_END90=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_def_in_tag1042); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_END.add(TAG_END90);



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
            // 165:5: -> ^( BLOCK ( $definition)+ $content)
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:165:8: ^( BLOCK ( $definition)+ $content)
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:167:1: definition_inside_tag : ( definition_signature content= tag_content -> ^( DEF definition_signature $content) | VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )? -> ^( DEF VAR_ID expression ) );
    public final OmttParser.definition_inside_tag_return definition_inside_tag() throws RecognitionException {
        OmttParser.definition_inside_tag_return retval = new OmttParser.definition_inside_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID92=null;
        Token OP_ASSIGN93=null;
        Token CONTENT95=null;
        Token STRING_LITERAL96=null;
        OmttParser.tag_content_return content = null;

        OmttParser.definition_signature_return definition_signature91 = null;

        OmttParser.expression_return expression94 = null;


        Object VAR_ID92_tree=null;
        Object OP_ASSIGN93_tree=null;
        Object CONTENT95_tree=null;
        Object STRING_LITERAL96_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_CONTENT=new RewriteRuleTokenStream(adaptor,"token CONTENT");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_signature=new RewriteRuleSubtreeStream(adaptor,"rule definition_signature");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:168:3: ( definition_signature content= tag_content -> ^( DEF definition_signature $content) | VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )? -> ^( DEF VAR_ID expression ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==VAR_ID) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==OP_ASSIGN) ) {
                    alt31=2;
                }
                else if ( (LA31_1==CONTENT||LA31_1==OP_DATA_IS_EXPRESSION||LA31_1==OP_FOLLOW||LA31_1==TILDE||LA31_1==LEFT_SQUARE_PAREN||LA31_1==VAR_ID) ) {
                    alt31=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:168:5: definition_signature content= tag_content
                    {
                    pushFollow(FOLLOW_definition_signature_in_definition_inside_tag1074);
                    definition_signature91=definition_signature();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_definition_signature.add(definition_signature91.getTree());
                    pushFollow(FOLLOW_tag_content_in_definition_inside_tag1078);
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
                    // 169:5: -> ^( DEF definition_signature $content)
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:169:8: ^( DEF definition_signature $content)
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:170:5: VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )?
                    {
                    VAR_ID92=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_inside_tag1102); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID92);

                    OP_ASSIGN93=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_inside_tag1104); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_ASSIGN.add(OP_ASSIGN93);

                    pushFollow(FOLLOW_expression_in_definition_inside_tag1106);
                    expression94=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression94.getTree());
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:170:33: ( CONTENT ( STRING_LITERAL )? )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==CONTENT) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:170:34: CONTENT ( STRING_LITERAL )?
                            {
                            CONTENT95=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_definition_inside_tag1109); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_CONTENT.add(CONTENT95);

                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:170:42: ( STRING_LITERAL )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==STRING_LITERAL) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: STRING_LITERAL
                                    {
                                    STRING_LITERAL96=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_definition_inside_tag1111); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL96);


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
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 171:5: -> ^( DEF VAR_ID expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:171:8: ^( DEF VAR_ID expression )
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:177:1: lambda_expression : ( LAMBDA ( definition_argument )* COLON expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | ( definition_argument )* OP_FOLLOW expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | lambda_match_expression );
    public final OmttParser.lambda_expression_return lambda_expression() throws RecognitionException {
        OmttParser.lambda_expression_return retval = new OmttParser.lambda_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAMBDA97=null;
        Token COLON99=null;
        Token OP_FOLLOW102=null;
        OmttParser.definition_argument_return definition_argument98 = null;

        OmttParser.expression_return expression100 = null;

        OmttParser.definition_argument_return definition_argument101 = null;

        OmttParser.expression_return expression103 = null;

        OmttParser.lambda_match_expression_return lambda_match_expression104 = null;


        Object LAMBDA97_tree=null;
        Object COLON99_tree=null;
        Object OP_FOLLOW102_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_LAMBDA=new RewriteRuleTokenStream(adaptor,"token LAMBDA");
        RewriteRuleTokenStream stream_OP_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_FOLLOW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_argument=new RewriteRuleSubtreeStream(adaptor,"rule definition_argument");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:178:3: ( LAMBDA ( definition_argument )* COLON expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | ( definition_argument )* OP_FOLLOW expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | lambda_match_expression )
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
            case LEFT_PAREN:
            case LEFT_SQUARE_PAREN:
            case OP_GENERAL:
            case CLASS_ID:
                {
                alt34=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:178:5: LAMBDA ( definition_argument )* COLON expression
                    {
                    LAMBDA97=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambda_expression1150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LAMBDA.add(LAMBDA97);

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:178:12: ( definition_argument )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==TILDE||LA32_0==VAR_ID) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_lambda_expression1152);
                    	    definition_argument98=definition_argument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_definition_argument.add(definition_argument98.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    COLON99=(Token)match(input,COLON,FOLLOW_COLON_in_lambda_expression1155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON99);

                    pushFollow(FOLLOW_expression_in_lambda_expression1157);
                    expression100=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression100.getTree());


                    // AST REWRITE
                    // elements: LAMBDA, definition_argument, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 179:5: -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:179:8: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(stream_LAMBDA.nextToken()), root_1);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:179:35: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:179:47: ( definition_argument )*
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:180:5: ( definition_argument )* OP_FOLLOW expression
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:180:5: ( definition_argument )*
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
                    	    pushFollow(FOLLOW_definition_argument_in_lambda_expression1185);
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

                    OP_FOLLOW102=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_lambda_expression1188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_FOLLOW.add(OP_FOLLOW102);

                    pushFollow(FOLLOW_expression_in_lambda_expression1190);
                    expression103=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression103.getTree());


                    // AST REWRITE
                    // elements: expression, definition_argument
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 181:4: -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:181:7: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(LAMBDA), root_1);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:181:34: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:181:46: ( definition_argument )*
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:182:5: lambda_match_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lambda_match_expression_in_lambda_expression1217);
                    lambda_match_expression104=lambda_match_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_match_expression104.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:184:10: fragment lambda_match_expression : single_lambda_match ( SEMICOLON single_lambda_match )* -> ^( LAMBDA_MATCH ( single_lambda_match )+ ) ;
    public final OmttParser.lambda_match_expression_return lambda_match_expression() throws RecognitionException {
        OmttParser.lambda_match_expression_return retval = new OmttParser.lambda_match_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON106=null;
        OmttParser.single_lambda_match_return single_lambda_match105 = null;

        OmttParser.single_lambda_match_return single_lambda_match107 = null;


        Object SEMICOLON106_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_single_lambda_match=new RewriteRuleSubtreeStream(adaptor,"rule single_lambda_match");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:185:2: ( single_lambda_match ( SEMICOLON single_lambda_match )* -> ^( LAMBDA_MATCH ( single_lambda_match )+ ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:185:4: single_lambda_match ( SEMICOLON single_lambda_match )*
            {
            pushFollow(FOLLOW_single_lambda_match_in_lambda_match_expression1230);
            single_lambda_match105=single_lambda_match();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_single_lambda_match.add(single_lambda_match105.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:185:24: ( SEMICOLON single_lambda_match )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==SEMICOLON) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:185:25: SEMICOLON single_lambda_match
            	    {
            	    SEMICOLON106=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_lambda_match_expression1233); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON106);

            	    pushFollow(FOLLOW_single_lambda_match_in_lambda_match_expression1235);
            	    single_lambda_match107=single_lambda_match();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_single_lambda_match.add(single_lambda_match107.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
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
            // 186:3: -> ^( LAMBDA_MATCH ( single_lambda_match )+ )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:186:6: ^( LAMBDA_MATCH ( single_lambda_match )+ )
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:188:10: fragment single_lambda_match : single_type OP_FOLLOW safe_expression -> ^( ITEM single_type safe_expression ) ;
    public final OmttParser.single_lambda_match_return single_lambda_match() throws RecognitionException {
        OmttParser.single_lambda_match_return retval = new OmttParser.single_lambda_match_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_FOLLOW109=null;
        OmttParser.single_type_return single_type108 = null;

        OmttParser.safe_expression_return safe_expression110 = null;


        Object OP_FOLLOW109_tree=null;
        RewriteRuleTokenStream stream_OP_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_FOLLOW");
        RewriteRuleSubtreeStream stream_safe_expression=new RewriteRuleSubtreeStream(adaptor,"rule safe_expression");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:2: ( single_type OP_FOLLOW safe_expression -> ^( ITEM single_type safe_expression ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:189:4: single_type OP_FOLLOW safe_expression
            {
            pushFollow(FOLLOW_single_type_in_single_lambda_match1263);
            single_type108=single_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_single_type.add(single_type108.getTree());
            OP_FOLLOW109=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_single_lambda_match1265); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_FOLLOW.add(OP_FOLLOW109);

            pushFollow(FOLLOW_safe_expression_in_single_lambda_match1267);
            safe_expression110=safe_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_safe_expression.add(safe_expression110.getTree());


            // AST REWRITE
            // elements: single_type, safe_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 190:3: -> ^( ITEM single_type safe_expression )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:190:6: ^( ITEM single_type safe_expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new LambdaMatchItem(ITEM), root_1);

                adaptor.addChild(root_1, stream_single_type.nextTree());
                adaptor.addChild(root_1, stream_safe_expression.nextTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:193:1: type : type_content ( OP_MULTIPLY )? -> ^( TYPE type_content ( OP_MULTIPLY )? ) ;
    public final OmttParser.type_return type() throws RecognitionException {
        OmttParser.type_return retval = new OmttParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MULTIPLY112=null;
        OmttParser.type_content_return type_content111 = null;


        Object OP_MULTIPLY112_tree=null;
        RewriteRuleTokenStream stream_OP_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token OP_MULTIPLY");
        RewriteRuleSubtreeStream stream_type_content=new RewriteRuleSubtreeStream(adaptor,"rule type_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:194:3: ( type_content ( OP_MULTIPLY )? -> ^( TYPE type_content ( OP_MULTIPLY )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:194:5: type_content ( OP_MULTIPLY )?
            {
            pushFollow(FOLLOW_type_content_in_type1294);
            type_content111=type_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_content.add(type_content111.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:194:18: ( OP_MULTIPLY )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==OP_MULTIPLY) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: OP_MULTIPLY
                    {
                    OP_MULTIPLY112=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_type1296); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MULTIPLY.add(OP_MULTIPLY112);


                    }
                    break;

            }



            // AST REWRITE
            // elements: type_content, OP_MULTIPLY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 195:4: -> ^( TYPE type_content ( OP_MULTIPLY )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:195:7: ^( TYPE type_content ( OP_MULTIPLY )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TypeReference(TYPE), root_1);

                adaptor.addChild(root_1, stream_type_content.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:195:42: ( OP_MULTIPLY )?
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:197:1: single_type : type_content -> ^( TYPE type_content ) ;
    public final OmttParser.single_type_return single_type() throws RecognitionException {
        OmttParser.single_type_return retval = new OmttParser.single_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.type_content_return type_content113 = null;


        RewriteRuleSubtreeStream stream_type_content=new RewriteRuleSubtreeStream(adaptor,"rule type_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:198:3: ( type_content -> ^( TYPE type_content ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:198:5: type_content
            {
            pushFollow(FOLLOW_type_content_in_single_type1326);
            type_content113=type_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_content.add(type_content113.getTree());


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
            // 199:4: -> ^( TYPE type_content )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:199:7: ^( TYPE type_content )
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:201:10: fragment type_content : ( CLASS_ID | OP_GENERAL | LEFT_PAREN ( argument_type )+ OP_FOLLOW type RIGHT_PAREN -> ^( FUNCTION type ( argument_type )+ ) | LEFT_SQUARE_PAREN tuple_types+= type ( COMMA tuple_types+= type )+ RIGHT_SQUARE_PAREN -> ^( TUPLE ( $tuple_types)* ) | LEFT_SQUARE_PAREN record_types+= record_item_type ( COMMA record_types+= record_item_type )* RIGHT_SQUARE_PAREN -> ^( RECORD ( $record_types)* ) );
    public final OmttParser.type_content_return type_content() throws RecognitionException {
        OmttParser.type_content_return retval = new OmttParser.type_content_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS_ID114=null;
        Token OP_GENERAL115=null;
        Token LEFT_PAREN116=null;
        Token OP_FOLLOW118=null;
        Token RIGHT_PAREN120=null;
        Token LEFT_SQUARE_PAREN121=null;
        Token COMMA122=null;
        Token RIGHT_SQUARE_PAREN123=null;
        Token LEFT_SQUARE_PAREN124=null;
        Token COMMA125=null;
        Token RIGHT_SQUARE_PAREN126=null;
        List list_tuple_types=null;
        List list_record_types=null;
        OmttParser.argument_type_return argument_type117 = null;

        OmttParser.type_return type119 = null;

        OmttParser.type_return tuple_types = null;
         tuple_types = null;
        OmttParser.record_item_type_return record_types = null;
         record_types = null;
        Object CLASS_ID114_tree=null;
        Object OP_GENERAL115_tree=null;
        Object LEFT_PAREN116_tree=null;
        Object OP_FOLLOW118_tree=null;
        Object RIGHT_PAREN120_tree=null;
        Object LEFT_SQUARE_PAREN121_tree=null;
        Object COMMA122_tree=null;
        Object RIGHT_SQUARE_PAREN123_tree=null;
        Object LEFT_SQUARE_PAREN124_tree=null;
        Object COMMA125_tree=null;
        Object RIGHT_SQUARE_PAREN126_tree=null;
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:202:3: ( CLASS_ID | OP_GENERAL | LEFT_PAREN ( argument_type )+ OP_FOLLOW type RIGHT_PAREN -> ^( FUNCTION type ( argument_type )+ ) | LEFT_SQUARE_PAREN tuple_types+= type ( COMMA tuple_types+= type )+ RIGHT_SQUARE_PAREN -> ^( TUPLE ( $tuple_types)* ) | LEFT_SQUARE_PAREN record_types+= record_item_type ( COMMA record_types+= record_item_type )* RIGHT_SQUARE_PAREN -> ^( RECORD ( $record_types)* ) )
            int alt40=5;
            switch ( input.LA(1) ) {
            case CLASS_ID:
                {
                alt40=1;
                }
                break;
            case OP_GENERAL:
                {
                alt40=2;
                }
                break;
            case LEFT_PAREN:
                {
                alt40=3;
                }
                break;
            case LEFT_SQUARE_PAREN:
                {
                int LA40_4 = input.LA(2);

                if ( (LA40_4==LEFT_PAREN||LA40_4==LEFT_SQUARE_PAREN||LA40_4==OP_GENERAL||LA40_4==CLASS_ID) ) {
                    alt40=4;
                }
                else if ( (LA40_4==VAR_ID) ) {
                    alt40=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:202:5: CLASS_ID
                    {
                    root_0 = (Object)adaptor.nil();

                    CLASS_ID114=(Token)match(input,CLASS_ID,FOLLOW_CLASS_ID_in_type_content1354); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLASS_ID114_tree = (Object)adaptor.create(CLASS_ID114);
                    adaptor.addChild(root_0, CLASS_ID114_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:203:5: OP_GENERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GENERAL115=(Token)match(input,OP_GENERAL,FOLLOW_OP_GENERAL_in_type_content1360); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_GENERAL115_tree = (Object)adaptor.create(OP_GENERAL115);
                    adaptor.addChild(root_0, OP_GENERAL115_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:204:5: LEFT_PAREN ( argument_type )+ OP_FOLLOW type RIGHT_PAREN
                    {
                    LEFT_PAREN116=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_type_content1366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN116);

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:204:16: ( argument_type )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( ((LA37_0>=TILDE && LA37_0<=LEFT_PAREN)||LA37_0==LEFT_SQUARE_PAREN||LA37_0==OP_GENERAL||LA37_0==VAR_ID||LA37_0==CLASS_ID) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: argument_type
                    	    {
                    	    pushFollow(FOLLOW_argument_type_in_type_content1368);
                    	    argument_type117=argument_type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_argument_type.add(argument_type117.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);

                    OP_FOLLOW118=(Token)match(input,OP_FOLLOW,FOLLOW_OP_FOLLOW_in_type_content1371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_FOLLOW.add(OP_FOLLOW118);

                    pushFollow(FOLLOW_type_in_type_content1373);
                    type119=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type119.getTree());
                    RIGHT_PAREN120=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_type_content1375); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN120);



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
                    // 205:4: -> ^( FUNCTION type ( argument_type )+ )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:205:7: ^( FUNCTION type ( argument_type )+ )
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:206:5: LEFT_SQUARE_PAREN tuple_types+= type ( COMMA tuple_types+= type )+ RIGHT_SQUARE_PAREN
                    {
                    LEFT_SQUARE_PAREN121=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_type_content1395); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN121);

                    pushFollow(FOLLOW_type_in_type_content1399);
                    tuple_types=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(tuple_types.getTree());
                    if (list_tuple_types==null) list_tuple_types=new ArrayList();
                    list_tuple_types.add(tuple_types.getTree());

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:206:41: ( COMMA tuple_types+= type )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==COMMA) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:206:42: COMMA tuple_types+= type
                    	    {
                    	    COMMA122=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_content1402); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA122);

                    	    pushFollow(FOLLOW_type_in_type_content1406);
                    	    tuple_types=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_type.add(tuple_types.getTree());
                    	    if (list_tuple_types==null) list_tuple_types=new ArrayList();
                    	    list_tuple_types.add(tuple_types.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);

                    RIGHT_SQUARE_PAREN123=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_type_content1410); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN123);

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
                    // 208:4: -> ^( TUPLE ( $tuple_types)* )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:208:7: ^( TUPLE ( $tuple_types)* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TUPLE, "TUPLE"), root_1);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:208:15: ( $tuple_types)*
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:209:5: LEFT_SQUARE_PAREN record_types+= record_item_type ( COMMA record_types+= record_item_type )* RIGHT_SQUARE_PAREN
                    {
                    LEFT_SQUARE_PAREN124=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_type_content1433); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN124);

                    pushFollow(FOLLOW_record_item_type_in_type_content1437);
                    record_types=record_item_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_record_item_type.add(record_types.getTree());
                    if (list_record_types==null) list_record_types=new ArrayList();
                    list_record_types.add(record_types.getTree());

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:209:54: ( COMMA record_types+= record_item_type )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==COMMA) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:209:55: COMMA record_types+= record_item_type
                    	    {
                    	    COMMA125=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_content1440); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA125);

                    	    pushFollow(FOLLOW_record_item_type_in_type_content1444);
                    	    record_types=record_item_type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_record_item_type.add(record_types.getTree());
                    	    if (list_record_types==null) list_record_types=new ArrayList();
                    	    list_record_types.add(record_types.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    RIGHT_SQUARE_PAREN126=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_type_content1448); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN126);

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
                    // 211:4: -> ^( RECORD ( $record_types)* )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:211:7: ^( RECORD ( $record_types)* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RECORD, "RECORD"), root_1);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:211:16: ( $record_types)*
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:213:10: fragment argument_type : ( TILDE )? ( VAR_ID DOT )? type -> ^( ARGUMENT type ( VAR_ID )? ( TILDE )? ) ;
    public final OmttParser.argument_type_return argument_type() throws RecognitionException {
        OmttParser.argument_type_return retval = new OmttParser.argument_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TILDE127=null;
        Token VAR_ID128=null;
        Token DOT129=null;
        OmttParser.type_return type130 = null;


        Object TILDE127_tree=null;
        Object VAR_ID128_tree=null;
        Object DOT129_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_TILDE=new RewriteRuleTokenStream(adaptor,"token TILDE");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:2: ( ( TILDE )? ( VAR_ID DOT )? type -> ^( ARGUMENT type ( VAR_ID )? ( TILDE )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:4: ( TILDE )? ( VAR_ID DOT )? type
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:4: ( TILDE )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==TILDE) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: TILDE
                    {
                    TILDE127=(Token)match(input,TILDE,FOLLOW_TILDE_in_argument_type1477); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TILDE.add(TILDE127);


                    }
                    break;

            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:11: ( VAR_ID DOT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==VAR_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:214:12: VAR_ID DOT
                    {
                    VAR_ID128=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_argument_type1481); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID128);

                    DOT129=(Token)match(input,DOT,FOLLOW_DOT_in_argument_type1483); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT129);


                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_argument_type1487);
            type130=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type130.getTree());


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
            // 215:3: -> ^( ARGUMENT type ( VAR_ID )? ( TILDE )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:215:6: ^( ARGUMENT type ( VAR_ID )? ( TILDE )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENT, "ARGUMENT"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:215:22: ( VAR_ID )?
                if ( stream_VAR_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_VAR_ID.nextNode());

                }
                stream_VAR_ID.reset();
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:215:30: ( TILDE )?
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:217:10: fragment record_item_type : VAR_ID DOT type ;
    public final OmttParser.record_item_type_return record_item_type() throws RecognitionException {
        OmttParser.record_item_type_return retval = new OmttParser.record_item_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID131=null;
        Token DOT132=null;
        OmttParser.type_return type133 = null;


        Object VAR_ID131_tree=null;
        Object DOT132_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:218:2: ( VAR_ID DOT type )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:218:4: VAR_ID DOT type
            {
            root_0 = (Object)adaptor.nil();

            VAR_ID131=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_record_item_type1515); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR_ID131_tree = (Object)adaptor.create(VAR_ID131);
            adaptor.addChild(root_0, VAR_ID131_tree);
            }
            DOT132=(Token)match(input,DOT,FOLLOW_DOT_in_record_item_type1517); if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_record_item_type1520);
            type133=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type133.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:224:1: if_expression : IF condition= context_expression COLON part_if= expression ELSE ( COLON )? part_else= expression -> ^( IF_ELSE $condition $part_if $part_else) ;
    public final OmttParser.if_expression_return if_expression() throws RecognitionException {
        OmttParser.if_expression_return retval = new OmttParser.if_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF134=null;
        Token COLON135=null;
        Token ELSE136=null;
        Token COLON137=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.expression_return part_if = null;

        OmttParser.expression_return part_else = null;


        Object IF134_tree=null;
        Object COLON135_tree=null;
        Object ELSE136_tree=null;
        Object COLON137_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:225:3: ( IF condition= context_expression COLON part_if= expression ELSE ( COLON )? part_else= expression -> ^( IF_ELSE $condition $part_if $part_else) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:225:5: IF condition= context_expression COLON part_if= expression ELSE ( COLON )? part_else= expression
            {
            IF134=(Token)match(input,IF,FOLLOW_IF_in_if_expression1535); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF134);

            pushFollow(FOLLOW_context_expression_in_if_expression1539);
            condition=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(condition.getTree());
            COLON135=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1541); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON135);

            pushFollow(FOLLOW_expression_in_if_expression1549);
            part_if=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(part_if.getTree());
            ELSE136=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_expression1555); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(ELSE136);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:227:10: ( COLON )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==COLON) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: COLON
                    {
                    COLON137=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON137);


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_if_expression1566);
            part_else=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(part_else.getTree());


            // AST REWRITE
            // elements: part_else, condition, part_if
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
            // 229:5: -> ^( IF_ELSE $condition $part_if $part_else)
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:229:8: ^( IF_ELSE $condition $part_if $part_else)
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:231:1: safe_if_expression : IF condition= context_expression COLON part_if= safe_expression ELSE ( COLON )? part_else= safe_expression -> ^( IF_ELSE $condition $part_if $part_else) ;
    public final OmttParser.safe_if_expression_return safe_if_expression() throws RecognitionException {
        OmttParser.safe_if_expression_return retval = new OmttParser.safe_if_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF138=null;
        Token COLON139=null;
        Token ELSE140=null;
        Token COLON141=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.safe_expression_return part_if = null;

        OmttParser.safe_expression_return part_else = null;


        Object IF138_tree=null;
        Object COLON139_tree=null;
        Object ELSE140_tree=null;
        Object COLON141_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_safe_expression=new RewriteRuleSubtreeStream(adaptor,"rule safe_expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:232:3: ( IF condition= context_expression COLON part_if= safe_expression ELSE ( COLON )? part_else= safe_expression -> ^( IF_ELSE $condition $part_if $part_else) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:232:5: IF condition= context_expression COLON part_if= safe_expression ELSE ( COLON )? part_else= safe_expression
            {
            IF138=(Token)match(input,IF,FOLLOW_IF_in_safe_if_expression1600); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF138);

            pushFollow(FOLLOW_context_expression_in_safe_if_expression1604);
            condition=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(condition.getTree());
            COLON139=(Token)match(input,COLON,FOLLOW_COLON_in_safe_if_expression1606); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON139);

            pushFollow(FOLLOW_safe_expression_in_safe_if_expression1614);
            part_if=safe_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_safe_expression.add(part_if.getTree());
            ELSE140=(Token)match(input,ELSE,FOLLOW_ELSE_in_safe_if_expression1620); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(ELSE140);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:234:10: ( COLON )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==COLON) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: COLON
                    {
                    COLON141=(Token)match(input,COLON,FOLLOW_COLON_in_safe_if_expression1622); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON141);


                    }
                    break;

            }

            pushFollow(FOLLOW_safe_expression_in_safe_if_expression1631);
            part_else=safe_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_safe_expression.add(part_else.getTree());


            // AST REWRITE
            // elements: part_else, condition, part_if
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
            // 236:5: -> ^( IF_ELSE $condition $part_if $part_else)
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:236:8: ^( IF_ELSE $condition $part_if $part_else)
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:238:1: if_tag : TAG_START if_subtag TAG_END ;
    public final OmttParser.if_tag_return if_tag() throws RecognitionException {
        OmttParser.if_tag_return retval = new OmttParser.if_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START142=null;
        Token TAG_END144=null;
        OmttParser.if_subtag_return if_subtag143 = null;


        Object TAG_START142_tree=null;
        Object TAG_END144_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:239:3: ( TAG_START if_subtag TAG_END )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:239:5: TAG_START if_subtag TAG_END
            {
            root_0 = (Object)adaptor.nil();

            TAG_START142=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_tag1665); if (state.failed) return retval;
            pushFollow(FOLLOW_if_subtag_in_if_tag1671);
            if_subtag143=if_subtag();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, if_subtag143.getTree());
            TAG_END144=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_if_tag1677); if (state.failed) return retval;

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:243:10: fragment if_subtag : ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )? -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? ) ;
    public final OmttParser.if_subtag_return if_subtag() throws RecognitionException {
        OmttParser.if_subtag_return retval = new OmttParser.if_subtag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF145=null;
        Token TAG_START146=null;
        Token ELSE147=null;
        OmttParser.context_expression_return condition = null;

        OmttParser.tag_content_return part_if = null;

        OmttParser.tag_content_return part_else = null;

        OmttParser.if_subtag_return subtag = null;


        Object IF145_tree=null;
        Object TAG_START146_tree=null;
        Object ELSE147_tree=null;
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_if_subtag=new RewriteRuleSubtreeStream(adaptor,"rule if_subtag");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:244:2: ( ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )? -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:244:4: ( IF condition= context_expression part_if= tag_content ) ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )?
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:244:4: ( IF condition= context_expression part_if= tag_content )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:244:6: IF condition= context_expression part_if= tag_content
            {
            IF145=(Token)match(input,IF,FOLLOW_IF_in_if_subtag1693); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF145);

            pushFollow(FOLLOW_context_expression_in_if_subtag1697);
            condition=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(condition.getTree());
            pushFollow(FOLLOW_tag_content_in_if_subtag1705);
            part_if=tag_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tag_content.add(part_if.getTree());

            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:247:3: ( TAG_START ELSE (part_else= tag_content | subtag= if_subtag ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==TAG_START) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:247:5: TAG_START ELSE (part_else= tag_content | subtag= if_subtag )
                    {
                    TAG_START146=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_subtag1715); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START146);

                    ELSE147=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_subtag1717); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE147);

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:248:4: (part_else= tag_content | subtag= if_subtag )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==CONTENT||LA45_0==OP_DATA_IS_EXPRESSION) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==IF) ) {
                        alt45=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:248:5: part_else= tag_content
                            {
                            pushFollow(FOLLOW_tag_content_in_if_subtag1725);
                            part_else=tag_content();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tag_content.add(part_else.getTree());

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:248:29: subtag= if_subtag
                            {
                            pushFollow(FOLLOW_if_subtag_in_if_subtag1731);
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
            // elements: condition, subtag, part_else, part_if
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
            // 250:3: -> ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:250:6: ^( IF_ELSE $condition $part_if ( $part_else)? ( $subtag)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new IfElse(IF_ELSE), root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());
                adaptor.addChild(root_1, stream_part_if.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:250:44: ( $part_else)?
                if ( stream_part_else.hasNext() ) {
                    adaptor.addChild(root_1, stream_part_else.nextTree());

                }
                stream_part_else.reset();
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:250:56: ( $subtag)?
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:253:1: map_expression : MAP ( item_alias )? iter= context_expression COLON expr= expression -> ^( MAP $iter $expr ( item_alias )? ) ;
    public final OmttParser.map_expression_return map_expression() throws RecognitionException {
        OmttParser.map_expression_return retval = new OmttParser.map_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MAP148=null;
        Token COLON150=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.expression_return expr = null;

        OmttParser.item_alias_return item_alias149 = null;


        Object MAP148_tree=null;
        Object COLON150_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_item_alias=new RewriteRuleSubtreeStream(adaptor,"rule item_alias");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:254:3: ( MAP ( item_alias )? iter= context_expression COLON expr= expression -> ^( MAP $iter $expr ( item_alias )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:254:5: MAP ( item_alias )? iter= context_expression COLON expr= expression
            {
            MAP148=(Token)match(input,MAP,FOLLOW_MAP_in_map_expression1774); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MAP.add(MAP148);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:254:9: ( item_alias )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==VAR_ID) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==OP_REVERSE_FOLLOW) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: item_alias
                    {
                    pushFollow(FOLLOW_item_alias_in_map_expression1776);
                    item_alias149=item_alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_item_alias.add(item_alias149.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_context_expression_in_map_expression1781);
            iter=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(iter.getTree());
            COLON150=(Token)match(input,COLON,FOLLOW_COLON_in_map_expression1783); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON150);

            pushFollow(FOLLOW_expression_in_map_expression1791);
            expr=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expr.getTree());


            // AST REWRITE
            // elements: item_alias, iter, MAP, expr
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
            // 256:5: -> ^( MAP $iter $expr ( item_alias )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:256:8: ^( MAP $iter $expr ( item_alias )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_MAP.nextToken()), root_1);

                adaptor.addChild(root_1, stream_iter.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:256:42: ( item_alias )?
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:258:1: safe_map_expression : MAP ( item_alias )? iter= context_expression COLON expr= safe_expression -> ^( MAP $iter $expr ( item_alias )? ) ;
    public final OmttParser.safe_map_expression_return safe_map_expression() throws RecognitionException {
        OmttParser.safe_map_expression_return retval = new OmttParser.safe_map_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MAP151=null;
        Token COLON153=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.safe_expression_return expr = null;

        OmttParser.item_alias_return item_alias152 = null;


        Object MAP151_tree=null;
        Object COLON153_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_safe_expression=new RewriteRuleSubtreeStream(adaptor,"rule safe_expression");
        RewriteRuleSubtreeStream stream_item_alias=new RewriteRuleSubtreeStream(adaptor,"rule item_alias");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:259:3: ( MAP ( item_alias )? iter= context_expression COLON expr= safe_expression -> ^( MAP $iter $expr ( item_alias )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:259:5: MAP ( item_alias )? iter= context_expression COLON expr= safe_expression
            {
            MAP151=(Token)match(input,MAP,FOLLOW_MAP_in_safe_map_expression1825); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MAP.add(MAP151);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:259:9: ( item_alias )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==VAR_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==OP_REVERSE_FOLLOW) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: item_alias
                    {
                    pushFollow(FOLLOW_item_alias_in_safe_map_expression1827);
                    item_alias152=item_alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_item_alias.add(item_alias152.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_context_expression_in_safe_map_expression1832);
            iter=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(iter.getTree());
            COLON153=(Token)match(input,COLON,FOLLOW_COLON_in_safe_map_expression1834); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON153);

            pushFollow(FOLLOW_safe_expression_in_safe_map_expression1842);
            expr=safe_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_safe_expression.add(expr.getTree());


            // AST REWRITE
            // elements: iter, expr, MAP, item_alias
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
    // $ANTLR end "safe_map_expression"

    public static class map_tag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "map_tag"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:263:1: map_tag : TAG_START MAP ( item_alias )? iter= context_expression expr= tag_content TAG_END -> ^( MAP $iter $expr ( item_alias )? ) ;
    public final OmttParser.map_tag_return map_tag() throws RecognitionException {
        OmttParser.map_tag_return retval = new OmttParser.map_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START154=null;
        Token MAP155=null;
        Token TAG_END157=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.tag_content_return expr = null;

        OmttParser.item_alias_return item_alias156 = null;


        Object TAG_START154_tree=null;
        Object MAP155_tree=null;
        Object TAG_END157_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_item_alias=new RewriteRuleSubtreeStream(adaptor,"rule item_alias");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:264:3: ( TAG_START MAP ( item_alias )? iter= context_expression expr= tag_content TAG_END -> ^( MAP $iter $expr ( item_alias )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:264:5: TAG_START MAP ( item_alias )? iter= context_expression expr= tag_content TAG_END
            {
            TAG_START154=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_map_tag1876); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START154);

            MAP155=(Token)match(input,MAP,FOLLOW_MAP_in_map_tag1878); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MAP.add(MAP155);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:264:19: ( item_alias )?
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
                    pushFollow(FOLLOW_item_alias_in_map_tag1880);
                    item_alias156=item_alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_item_alias.add(item_alias156.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_context_expression_in_map_tag1885);
            iter=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(iter.getTree());
            pushFollow(FOLLOW_tag_content_in_map_tag1893);
            expr=tag_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tag_content.add(expr.getTree());
            TAG_END157=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_map_tag1899); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_END.add(TAG_END157);



            // AST REWRITE
            // elements: expr, iter, item_alias, MAP
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
            // 267:5: -> ^( MAP $iter $expr ( item_alias )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:267:8: ^( MAP $iter $expr ( item_alias )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Transformation(stream_MAP.nextToken()), root_1);

                adaptor.addChild(root_1, stream_iter.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:267:42: ( item_alias )?
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:270:10: fragment item_alias : VAR_ID OP_REVERSE_FOLLOW -> ^( AS VAR_ID ) ;
    public final OmttParser.item_alias_return item_alias() throws RecognitionException {
        OmttParser.item_alias_return retval = new OmttParser.item_alias_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID158=null;
        Token OP_REVERSE_FOLLOW159=null;

        Object VAR_ID158_tree=null;
        Object OP_REVERSE_FOLLOW159_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_REVERSE_FOLLOW=new RewriteRuleTokenStream(adaptor,"token OP_REVERSE_FOLLOW");

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:271:2: ( VAR_ID OP_REVERSE_FOLLOW -> ^( AS VAR_ID ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:271:4: VAR_ID OP_REVERSE_FOLLOW
            {
            VAR_ID158=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_item_alias1935); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID158);

            OP_REVERSE_FOLLOW159=(Token)match(input,OP_REVERSE_FOLLOW,FOLLOW_OP_REVERSE_FOLLOW_in_item_alias1937); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_REVERSE_FOLLOW.add(OP_REVERSE_FOLLOW159);



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
            // 272:3: -> ^( AS VAR_ID )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:272:6: ^( AS VAR_ID )
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:275:1: match_expression : MATCH iter= context_expression COLON expr= lambda_match_expression -> ^( CALL[true] $expr ^( ARGUMENT $iter) ) ;
    public final OmttParser.match_expression_return match_expression() throws RecognitionException {
        OmttParser.match_expression_return retval = new OmttParser.match_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MATCH160=null;
        Token COLON161=null;
        OmttParser.context_expression_return iter = null;

        OmttParser.lambda_match_expression_return expr = null;


        Object MATCH160_tree=null;
        Object COLON161_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MATCH=new RewriteRuleTokenStream(adaptor,"token MATCH");
        RewriteRuleSubtreeStream stream_lambda_match_expression=new RewriteRuleSubtreeStream(adaptor,"rule lambda_match_expression");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:276:3: ( MATCH iter= context_expression COLON expr= lambda_match_expression -> ^( CALL[true] $expr ^( ARGUMENT $iter) ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:276:5: MATCH iter= context_expression COLON expr= lambda_match_expression
            {
            MATCH160=(Token)match(input,MATCH,FOLLOW_MATCH_in_match_expression1959); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MATCH.add(MATCH160);

            pushFollow(FOLLOW_context_expression_in_match_expression1963);
            iter=context_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_context_expression.add(iter.getTree());
            COLON161=(Token)match(input,COLON,FOLLOW_COLON_in_match_expression1965); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON161);

            pushFollow(FOLLOW_lambda_match_expression_in_match_expression1973);
            expr=lambda_match_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_match_expression.add(expr.getTree());


            // AST REWRITE
            // elements: expr, iter
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
            // 278:5: -> ^( CALL[true] $expr ^( ARGUMENT $iter) )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:278:8: ^( CALL[true] $expr ^( ARGUMENT $iter) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:278:33: ^( ARGUMENT $iter)
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:283:1: context_expression : (base= strict_expression -> $base) ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_map ce= safe_expression -> ^( op_map $context_expression $ce) | WHERE safe_expression -> ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) ) | ORDER BY safe_expression -> ^( ORDER $context_expression safe_expression ) | MATCH lambda_match_expression -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) ) )* ;
    public final OmttParser.context_expression_return context_expression() throws RecognitionException {
        OmttParser.context_expression_return retval = new OmttParser.context_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHERE165=null;
        Token ORDER167=null;
        Token BY168=null;
        Token MATCH170=null;
        OmttParser.strict_expression_return base = null;

        OmttParser.function_arguments_return arguments = null;

        OmttParser.safe_expression_return ce = null;

        OmttParser.op_apply_return op_apply162 = null;

        OmttParser.atom_expression_return atom_expression163 = null;

        OmttParser.op_map_return op_map164 = null;

        OmttParser.safe_expression_return safe_expression166 = null;

        OmttParser.safe_expression_return safe_expression169 = null;

        OmttParser.lambda_match_expression_return lambda_match_expression171 = null;


        Object WHERE165_tree=null;
        Object ORDER167_tree=null;
        Object BY168_tree=null;
        Object MATCH170_tree=null;
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
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:284:3: ( (base= strict_expression -> $base) ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_map ce= safe_expression -> ^( op_map $context_expression $ce) | WHERE safe_expression -> ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) ) | ORDER BY safe_expression -> ^( ORDER $context_expression safe_expression ) | MATCH lambda_match_expression -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) ) )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:284:5: (base= strict_expression -> $base) ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_map ce= safe_expression -> ^( op_map $context_expression $ce) | WHERE safe_expression -> ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) ) | ORDER BY safe_expression -> ^( ORDER $context_expression safe_expression ) | MATCH lambda_match_expression -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) ) )*
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:284:5: (base= strict_expression -> $base)
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:284:6: base= strict_expression
            {
            pushFollow(FOLLOW_strict_expression_in_context_expression2018);
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
            // 284:29: -> $base
            {
                adaptor.addChild(root_0, stream_base.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:285:3: ( op_apply atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | op_map ce= safe_expression -> ^( op_map $context_expression $ce) | WHERE safe_expression -> ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) ) | ORDER BY safe_expression -> ^( ORDER $context_expression safe_expression ) | MATCH lambda_match_expression -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) ) )*
            loop50:
            do {
                int alt50=6;
                switch ( input.LA(1) ) {
                case APPLY:
                case OP_CONTEXT:
                    {
                    alt50=1;
                    }
                    break;
                case MAP:
                    {
                    alt50=2;
                    }
                    break;
                case WHERE:
                    {
                    alt50=3;
                    }
                    break;
                case ORDER:
                    {
                    alt50=4;
                    }
                    break;
                case MATCH:
                    {
                    alt50=5;
                    }
                    break;

                }

                switch (alt50) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:285:5: op_apply atom_expression arguments= function_arguments
            	    {
            	    pushFollow(FOLLOW_op_apply_in_context_expression2030);
            	    op_apply162=op_apply();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_op_apply.add(op_apply162.getTree());
            	    pushFollow(FOLLOW_atom_expression_in_context_expression2032);
            	    atom_expression163=atom_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_atom_expression.add(atom_expression163.getTree());
            	    pushFollow(FOLLOW_function_arguments_in_context_expression2036);
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
            	    // 286:7: -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? )
            	    {
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:286:10: ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

            	        adaptor.addChild(root_1, stream_atom_expression.nextTree());
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:286:45: ^( ARGUMENT $context_expression)
            	        {
            	        Object root_2 = (Object)adaptor.nil();
            	        root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:286:95: ( $arguments)?
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
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:287:5: op_map ce= safe_expression
            	    {
            	    pushFollow(FOLLOW_op_map_in_context_expression2074);
            	    op_map164=op_map();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_op_map.add(op_map164.getTree());
            	    pushFollow(FOLLOW_safe_expression_in_context_expression2078);
            	    ce=safe_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_safe_expression.add(ce.getTree());


            	    // AST REWRITE
            	    // elements: ce, op_map, context_expression
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
            	    // 288:6: -> ^( op_map $context_expression $ce)
            	    {
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:288:9: ^( op_map $context_expression $ce)
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
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:289:5: WHERE safe_expression
            	    {
            	    WHERE165=(Token)match(input,WHERE,FOLLOW_WHERE_in_context_expression2101); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_WHERE.add(WHERE165);

            	    pushFollow(FOLLOW_safe_expression_in_context_expression2103);
            	    safe_expression166=safe_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_safe_expression.add(safe_expression166.getTree());


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
            	    // 290:4: -> ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) )
            	    {
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:290:7: ^( ATOM_SELECT $context_expression ^( SEQUENCE_SELECT safe_expression ) )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new AtomSelect(ATOM_SELECT), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:290:53: ^( SEQUENCE_SELECT safe_expression )
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
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:291:7: ORDER BY safe_expression
            	    {
            	    ORDER167=(Token)match(input,ORDER,FOLLOW_ORDER_in_context_expression2132); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ORDER.add(ORDER167);

            	    BY168=(Token)match(input,BY,FOLLOW_BY_in_context_expression2134); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_BY.add(BY168);

            	    pushFollow(FOLLOW_safe_expression_in_context_expression2136);
            	    safe_expression169=safe_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_safe_expression.add(safe_expression169.getTree());
            	    if ( state.backtracking==0 ) {
            	       reportNotImplemented("order by operation"); 
            	    }


            	    // AST REWRITE
            	    // elements: ORDER, context_expression, safe_expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 293:6: -> ^( ORDER $context_expression safe_expression )
            	    {
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:293:9: ^( ORDER $context_expression safe_expression )
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
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:294:5: MATCH lambda_match_expression
            	    {
            	    MATCH170=(Token)match(input,MATCH,FOLLOW_MATCH_in_context_expression2165); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_MATCH.add(MATCH170);

            	    pushFollow(FOLLOW_lambda_match_expression_in_context_expression2167);
            	    lambda_match_expression171=lambda_match_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_lambda_match_expression.add(lambda_match_expression171.getTree());


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
            	    // 295:6: -> ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) )
            	    {
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:295:9: ^( CALL[true] lambda_match_expression ^( ARGUMENT $context_expression) )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

            	        adaptor.addChild(root_1, stream_lambda_match_expression.nextTree());
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:295:52: ^( ARGUMENT $context_expression)
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
            	    break loop50;
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:298:10: fragment op_apply : ( OP_CONTEXT | APPLY );
    public final OmttParser.op_apply_return op_apply() throws RecognitionException {
        OmttParser.op_apply_return retval = new OmttParser.op_apply_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_CONTEXT172=null;
        Token APPLY173=null;

        Object OP_CONTEXT172_tree=null;
        Object APPLY173_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:299:2: ( OP_CONTEXT | APPLY )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==OP_CONTEXT) ) {
                alt51=1;
            }
            else if ( (LA51_0==APPLY) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:299:4: OP_CONTEXT
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_CONTEXT172=(Token)match(input,OP_CONTEXT,FOLLOW_OP_CONTEXT_in_op_apply2214); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_CONTEXT172_tree = (Object)adaptor.create(OP_CONTEXT172);
                    root_0 = (Object)adaptor.becomeRoot(OP_CONTEXT172_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:300:4: APPLY
                    {
                    root_0 = (Object)adaptor.nil();

                    APPLY173=(Token)match(input,APPLY,FOLLOW_APPLY_in_op_apply2220); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    APPLY173_tree = (Object)adaptor.create(APPLY173);
                    root_0 = (Object)adaptor.becomeRoot(APPLY173_tree, root_0);
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:302:10: fragment op_map : MAP ;
    public final OmttParser.op_map_return op_map() throws RecognitionException {
        OmttParser.op_map_return retval = new OmttParser.op_map_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MAP174=null;

        Object MAP174_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:303:2: ( MAP )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:303:4: MAP
            {
            root_0 = (Object)adaptor.nil();

            MAP174=(Token)match(input,MAP,FOLLOW_MAP_in_op_map2233); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MAP174_tree = new Transformation(MAP174) ;
            root_0 = (Object)adaptor.becomeRoot(MAP174_tree, root_0);
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:306:1: apply_expression : APPLY atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT OP_GENERAL ) ( $arguments)? ) ;
    public final OmttParser.apply_expression_return apply_expression() throws RecognitionException {
        OmttParser.apply_expression_return retval = new OmttParser.apply_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token APPLY175=null;
        OmttParser.function_arguments_return arguments = null;

        OmttParser.atom_expression_return atom_expression176 = null;


        Object APPLY175_tree=null;
        RewriteRuleTokenStream stream_APPLY=new RewriteRuleTokenStream(adaptor,"token APPLY");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_function_arguments=new RewriteRuleSubtreeStream(adaptor,"rule function_arguments");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:307:2: ( APPLY atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT OP_GENERAL ) ( $arguments)? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:307:4: APPLY atom_expression arguments= function_arguments
            {
            APPLY175=(Token)match(input,APPLY,FOLLOW_APPLY_in_apply_expression2248); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_APPLY.add(APPLY175);

            pushFollow(FOLLOW_atom_expression_in_apply_expression2250);
            atom_expression176=atom_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom_expression.add(atom_expression176.getTree());
            pushFollow(FOLLOW_function_arguments_in_apply_expression2254);
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
            // 308:5: -> ^( CALL[true] atom_expression ^( ARGUMENT OP_GENERAL ) ( $arguments)? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:308:8: ^( CALL[true] atom_expression ^( ARGUMENT OP_GENERAL ) ( $arguments)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

                adaptor.addChild(root_1, stream_atom_expression.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:308:43: ^( ARGUMENT OP_GENERAL )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

                adaptor.addChild(root_2, new Ident(OP_GENERAL));

                adaptor.addChild(root_1, root_2);
                }
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:308:91: ( $arguments)?
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:311:1: apply_tag : TAG_START apply_expression TAG_END ;
    public final OmttParser.apply_tag_return apply_tag() throws RecognitionException {
        OmttParser.apply_tag_return retval = new OmttParser.apply_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START177=null;
        Token TAG_END179=null;
        OmttParser.apply_expression_return apply_expression178 = null;


        Object TAG_START177_tree=null;
        Object TAG_END179_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:312:2: ( TAG_START apply_expression TAG_END )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:312:4: TAG_START apply_expression TAG_END
            {
            root_0 = (Object)adaptor.nil();

            TAG_START177=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_apply_tag2297); if (state.failed) return retval;
            pushFollow(FOLLOW_apply_expression_in_apply_tag2300);
            apply_expression178=apply_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, apply_expression178.getTree());
            TAG_END179=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_apply_tag2302); if (state.failed) return retval;

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:317:1: strict_expression : ( concatence_expression | apply_expression );
    public final OmttParser.strict_expression_return strict_expression() throws RecognitionException {
        OmttParser.strict_expression_return retval = new OmttParser.strict_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.concatence_expression_return concatence_expression180 = null;

        OmttParser.apply_expression_return apply_expression181 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:318:2: ( concatence_expression | apply_expression )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=STRING_LITERAL && LA52_0<=REAL_NUMBER)||LA52_0==DATA_START||(LA52_0>=NULL && LA52_0<=FALSE)||(LA52_0>=TILDE && LA52_0<=LEFT_PAREN)||LA52_0==LEFT_SQUARE_PAREN||LA52_0==OP_MINUS||LA52_0==OP_NOT||LA52_0==OP_GENERAL||LA52_0==VAR_ID) ) {
                alt52=1;
            }
            else if ( (LA52_0==APPLY) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:318:4: concatence_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_concatence_expression_in_strict_expression2316);
                    concatence_expression180=concatence_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, concatence_expression180.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:319:4: apply_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_apply_expression_in_strict_expression2321);
                    apply_expression181=apply_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, apply_expression181.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:322:1: concatence_expression : (expr+= boolean_expression -> $expr) ( ( OP_CONCAT expr+= boolean_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )? ;
    public final OmttParser.concatence_expression_return concatence_expression() throws RecognitionException {
        OmttParser.concatence_expression_return retval = new OmttParser.concatence_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_CONCAT182=null;
        List list_expr=null;
        OmttParser.boolean_expression_return expr = null;
         expr = null;
        Object OP_CONCAT182_tree=null;
        RewriteRuleTokenStream stream_OP_CONCAT=new RewriteRuleTokenStream(adaptor,"token OP_CONCAT");
        RewriteRuleSubtreeStream stream_boolean_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:323:3: ( (expr+= boolean_expression -> $expr) ( ( OP_CONCAT expr+= boolean_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )? )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:323:5: (expr+= boolean_expression -> $expr) ( ( OP_CONCAT expr+= boolean_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )?
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:323:5: (expr+= boolean_expression -> $expr)
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:323:6: expr+= boolean_expression
            {
            pushFollow(FOLLOW_boolean_expression_in_concatence_expression2336);
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
            // 323:31: -> $expr
            {
                adaptor.addChild(root_0, stream_expr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:324:5: ( ( OP_CONCAT expr+= boolean_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==OP_CONCAT) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:324:6: ( OP_CONCAT expr+= boolean_expression )+
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:324:6: ( OP_CONCAT expr+= boolean_expression )+
                    int cnt53=0;
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==OP_CONCAT) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:324:7: OP_CONCAT expr+= boolean_expression
                    	    {
                    	    OP_CONCAT182=(Token)match(input,OP_CONCAT,FOLLOW_OP_CONCAT_in_concatence_expression2350); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_CONCAT.add(OP_CONCAT182);

                    	    pushFollow(FOLLOW_boolean_expression_in_concatence_expression2354);
                    	    expr=boolean_expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_boolean_expression.add(expr.getTree());
                    	    if (list_expr==null) list_expr=new ArrayList();
                    	    list_expr.add(expr.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt53 >= 1 ) break loop53;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(53, input);
                                throw eee;
                        }
                        cnt53++;
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
                    // 324:44: -> ^( OP_CONCAT ( $expr)+ )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:324:47: ^( OP_CONCAT ( $expr)+ )
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:328:1: boolean_expression : boolean_binary_expression ;
    public final OmttParser.boolean_expression_return boolean_expression() throws RecognitionException {
        OmttParser.boolean_expression_return retval = new OmttParser.boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_binary_expression_return boolean_binary_expression183 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:329:2: ( boolean_binary_expression )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:329:4: boolean_binary_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_binary_expression_in_boolean_expression2384);
            boolean_binary_expression183=boolean_binary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_binary_expression183.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:331:10: fragment boolean_binary_expression : boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )* ;
    public final OmttParser.boolean_binary_expression_return boolean_binary_expression() throws RecognitionException {
        OmttParser.boolean_binary_expression_return retval = new OmttParser.boolean_binary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_unary_expression_return boolean_unary_expression184 = null;

        OmttParser.boolean_binary_operator_return boolean_binary_operator185 = null;

        OmttParser.boolean_unary_expression_return boolean_unary_expression186 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:332:3: ( boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:332:5: boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression2397);
            boolean_unary_expression184=boolean_unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_unary_expression184.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:332:30: ( boolean_binary_operator boolean_unary_expression )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=OP_AND && LA55_0<=OP_OR)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:332:31: boolean_binary_operator boolean_unary_expression
            	    {
            	    pushFollow(FOLLOW_boolean_binary_operator_in_boolean_binary_expression2400);
            	    boolean_binary_operator185=boolean_binary_operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(boolean_binary_operator185.getTree(), root_0);
            	    pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression2403);
            	    boolean_unary_expression186=boolean_unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_unary_expression186.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:334:10: fragment boolean_unary_expression : ( boolean_unary_operator boolean_comparsion_expression | boolean_comparsion_expression );
    public final OmttParser.boolean_unary_expression_return boolean_unary_expression() throws RecognitionException {
        OmttParser.boolean_unary_expression_return retval = new OmttParser.boolean_unary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_unary_operator_return boolean_unary_operator187 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression188 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression189 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:335:3: ( boolean_unary_operator boolean_comparsion_expression | boolean_comparsion_expression )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==OP_NOT) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=STRING_LITERAL && LA56_0<=REAL_NUMBER)||LA56_0==DATA_START||(LA56_0>=NULL && LA56_0<=FALSE)||(LA56_0>=TILDE && LA56_0<=LEFT_PAREN)||LA56_0==LEFT_SQUARE_PAREN||LA56_0==OP_MINUS||LA56_0==OP_GENERAL||LA56_0==VAR_ID) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:335:5: boolean_unary_operator boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_unary_operator_in_boolean_unary_expression2419);
                    boolean_unary_operator187=boolean_unary_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(boolean_unary_operator187.getTree(), root_0);
                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression2422);
                    boolean_comparsion_expression188=boolean_comparsion_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_comparsion_expression188.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:336:5: boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression2428);
                    boolean_comparsion_expression189=boolean_comparsion_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_comparsion_expression189.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:339:10: fragment boolean_binary_operator : ( OP_AND | OP_OR );
    public final OmttParser.boolean_binary_operator_return boolean_binary_operator() throws RecognitionException {
        OmttParser.boolean_binary_operator_return retval = new OmttParser.boolean_binary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_AND190=null;
        Token OP_OR191=null;

        Object OP_AND190_tree=null;
        Object OP_OR191_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:340:3: ( OP_AND | OP_OR )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==OP_AND) ) {
                alt57=1;
            }
            else if ( (LA57_0==OP_OR) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:340:5: OP_AND
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_AND190=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_boolean_binary_operator2443); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_AND190_tree = new BooleanExpression(OP_AND190) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_AND190_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:341:5: OP_OR
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_OR191=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_boolean_binary_operator2453); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_OR191_tree = new BooleanExpression(OP_OR191) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_OR191_tree, root_0);
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:343:10: fragment boolean_unary_operator : OP_NOT ;
    public final OmttParser.boolean_unary_operator_return boolean_unary_operator() throws RecognitionException {
        OmttParser.boolean_unary_operator_return retval = new OmttParser.boolean_unary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_NOT192=null;

        Object OP_NOT192_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:344:3: ( OP_NOT )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:344:5: OP_NOT
            {
            root_0 = (Object)adaptor.nil();

            OP_NOT192=(Token)match(input,OP_NOT,FOLLOW_OP_NOT_in_boolean_unary_operator2471); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_NOT192_tree = new BooleanExpression(OP_NOT192) ;
            root_0 = (Object)adaptor.becomeRoot(OP_NOT192_tree, root_0);
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:347:1: boolean_comparsion_expression : additive_expression ( boolean_comparsion_operator additive_expression )* ;
    public final OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression() throws RecognitionException {
        OmttParser.boolean_comparsion_expression_return retval = new OmttParser.boolean_comparsion_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.additive_expression_return additive_expression193 = null;

        OmttParser.boolean_comparsion_operator_return boolean_comparsion_operator194 = null;

        OmttParser.additive_expression_return additive_expression195 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:348:3: ( additive_expression ( boolean_comparsion_operator additive_expression )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:348:5: additive_expression ( boolean_comparsion_operator additive_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression2488);
            additive_expression193=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression193.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:348:25: ( boolean_comparsion_operator additive_expression )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=OP_EQUAL && LA58_0<=OP_GE)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:348:26: boolean_comparsion_operator additive_expression
            	    {
            	    pushFollow(FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression2491);
            	    boolean_comparsion_operator194=boolean_comparsion_operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(boolean_comparsion_operator194.getTree(), root_0);
            	    pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression2494);
            	    additive_expression195=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression195.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:350:10: fragment boolean_comparsion_operator : ( OP_EQUAL | OP_NOT_EQUAL | OP_LE | OP_LEQ | OP_GE | OP_GEQ );
    public final OmttParser.boolean_comparsion_operator_return boolean_comparsion_operator() throws RecognitionException {
        OmttParser.boolean_comparsion_operator_return retval = new OmttParser.boolean_comparsion_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_EQUAL196=null;
        Token OP_NOT_EQUAL197=null;
        Token OP_LE198=null;
        Token OP_LEQ199=null;
        Token OP_GE200=null;
        Token OP_GEQ201=null;

        Object OP_EQUAL196_tree=null;
        Object OP_NOT_EQUAL197_tree=null;
        Object OP_LE198_tree=null;
        Object OP_LEQ199_tree=null;
        Object OP_GE200_tree=null;
        Object OP_GEQ201_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:351:3: ( OP_EQUAL | OP_NOT_EQUAL | OP_LE | OP_LEQ | OP_GE | OP_GEQ )
            int alt59=6;
            switch ( input.LA(1) ) {
            case OP_EQUAL:
                {
                alt59=1;
                }
                break;
            case OP_NOT_EQUAL:
                {
                alt59=2;
                }
                break;
            case OP_LE:
                {
                alt59=3;
                }
                break;
            case OP_LEQ:
                {
                alt59=4;
                }
                break;
            case OP_GE:
                {
                alt59=5;
                }
                break;
            case OP_GEQ:
                {
                alt59=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:351:5: OP_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_EQUAL196=(Token)match(input,OP_EQUAL,FOLLOW_OP_EQUAL_in_boolean_comparsion_operator2510); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_EQUAL196_tree = new BooleanExpression(OP_EQUAL196) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_EQUAL196_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:352:5: OP_NOT_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_NOT_EQUAL197=(Token)match(input,OP_NOT_EQUAL,FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator2520); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_NOT_EQUAL197_tree = new BooleanExpression(OP_NOT_EQUAL197) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_NOT_EQUAL197_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:353:5: OP_LE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LE198=(Token)match(input,OP_LE,FOLLOW_OP_LE_in_boolean_comparsion_operator2530); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_LE198_tree = new BooleanExpression(OP_LE198) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LE198_tree, root_0);
                    }

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:354:5: OP_LEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LEQ199=(Token)match(input,OP_LEQ,FOLLOW_OP_LEQ_in_boolean_comparsion_operator2540); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_LEQ199_tree = new BooleanExpression(OP_LEQ199) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LEQ199_tree, root_0);
                    }

                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:355:5: OP_GE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GE200=(Token)match(input,OP_GE,FOLLOW_OP_GE_in_boolean_comparsion_operator2550); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_GE200_tree = new BooleanExpression(OP_GE200) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GE200_tree, root_0);
                    }

                    }
                    break;
                case 6 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:356:5: OP_GEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GEQ201=(Token)match(input,OP_GEQ,FOLLOW_OP_GEQ_in_boolean_comparsion_operator2560); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_GEQ201_tree = new BooleanExpression(OP_GEQ201) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GEQ201_tree, root_0);
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:362:1: additive_expression : multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )* ;
    public final OmttParser.additive_expression_return additive_expression() throws RecognitionException {
        OmttParser.additive_expression_return retval = new OmttParser.additive_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_PLUS203=null;
        Token OP_MINUS204=null;
        OmttParser.multiplicative_expression_return multiplicative_expression202 = null;

        OmttParser.multiplicative_expression_return multiplicative_expression205 = null;


        Object OP_PLUS203_tree=null;
        Object OP_MINUS204_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:363:3: ( multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:363:5: multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2580);
            multiplicative_expression202=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression202.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:364:5: ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=OP_PLUS && LA61_0<=OP_MINUS)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:365:7: ( OP_PLUS | OP_MINUS ) multiplicative_expression
            	    {
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:365:7: ( OP_PLUS | OP_MINUS )
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==OP_PLUS) ) {
            	        alt60=1;
            	    }
            	    else if ( (LA60_0==OP_MINUS) ) {
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
            	            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:365:9: OP_PLUS
            	            {
            	            OP_PLUS203=(Token)match(input,OP_PLUS,FOLLOW_OP_PLUS_in_additive_expression2596); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            OP_PLUS203_tree = new ArithmeticExpression(OP_PLUS203) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_PLUS203_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:366:9: OP_MINUS
            	            {
            	            OP_MINUS204=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_additive_expression2610); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            OP_MINUS204_tree = new ArithmeticExpression(OP_MINUS204) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MINUS204_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2630);
            	    multiplicative_expression205=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression205.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:372:1: multiplicative_expression : negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )* ;
    public final OmttParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        OmttParser.multiplicative_expression_return retval = new OmttParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MULTIPLY207=null;
        Token SLASH208=null;
        Token OP_MODULO209=null;
        OmttParser.negative_expression_return negative_expression206 = null;

        OmttParser.negative_expression_return negative_expression210 = null;


        Object OP_MULTIPLY207_tree=null;
        Object SLASH208_tree=null;
        Object OP_MODULO209_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:373:3: ( negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:373:5: negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_negative_expression_in_multiplicative_expression2650);
            negative_expression206=negative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, negative_expression206.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:374:5: ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==SLASH||(LA63_0>=OP_MULTIPLY && LA63_0<=OP_MODULO)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:374:7: ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression
            	    {
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:374:7: ( OP_MULTIPLY | SLASH | OP_MODULO )
            	    int alt62=3;
            	    switch ( input.LA(1) ) {
            	    case OP_MULTIPLY:
            	        {
            	        alt62=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt62=2;
            	        }
            	        break;
            	    case OP_MODULO:
            	        {
            	        alt62=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 62, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt62) {
            	        case 1 :
            	            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:374:9: OP_MULTIPLY
            	            {
            	            OP_MULTIPLY207=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_multiplicative_expression2660); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            OP_MULTIPLY207_tree = new ArithmeticExpression(OP_MULTIPLY207) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MULTIPLY207_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:375:9: SLASH
            	            {
            	            SLASH208=(Token)match(input,SLASH,FOLLOW_SLASH_in_multiplicative_expression2674); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH208_tree = new ArithmeticExpression(SLASH208) ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH208_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:376:9: OP_MODULO
            	            {
            	            OP_MODULO209=(Token)match(input,OP_MODULO,FOLLOW_OP_MODULO_in_multiplicative_expression2688); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            OP_MODULO209_tree = new ArithmeticExpression(OP_MODULO209) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MODULO209_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_negative_expression_in_multiplicative_expression2708);
            	    negative_expression210=negative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, negative_expression210.getTree());

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
    // $ANTLR end "multiplicative_expression"

    public static class negative_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negative_expression"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:382:1: negative_expression : ( OP_MINUS functional_expression -> ^( OP_MINUS functional_expression ) | functional_expression );
    public final OmttParser.negative_expression_return negative_expression() throws RecognitionException {
        OmttParser.negative_expression_return retval = new OmttParser.negative_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MINUS211=null;
        OmttParser.functional_expression_return functional_expression212 = null;

        OmttParser.functional_expression_return functional_expression213 = null;


        Object OP_MINUS211_tree=null;
        RewriteRuleTokenStream stream_OP_MINUS=new RewriteRuleTokenStream(adaptor,"token OP_MINUS");
        RewriteRuleSubtreeStream stream_functional_expression=new RewriteRuleSubtreeStream(adaptor,"rule functional_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:383:2: ( OP_MINUS functional_expression -> ^( OP_MINUS functional_expression ) | functional_expression )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==OP_MINUS) ) {
                alt64=1;
            }
            else if ( ((LA64_0>=STRING_LITERAL && LA64_0<=REAL_NUMBER)||LA64_0==DATA_START||(LA64_0>=NULL && LA64_0<=FALSE)||(LA64_0>=TILDE && LA64_0<=LEFT_PAREN)||LA64_0==LEFT_SQUARE_PAREN||LA64_0==OP_GENERAL||LA64_0==VAR_ID) ) {
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:383:4: OP_MINUS functional_expression
                    {
                    OP_MINUS211=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_negative_expression2727); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MINUS.add(OP_MINUS211);

                    pushFollow(FOLLOW_functional_expression_in_negative_expression2729);
                    functional_expression212=functional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functional_expression.add(functional_expression212.getTree());


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
                    // 384:3: -> ^( OP_MINUS functional_expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:384:6: ^( OP_MINUS functional_expression )
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:385:4: functional_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functional_expression_in_negative_expression2747);
                    functional_expression213=functional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functional_expression213.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:390:1: functional_expression : call_expression ;
    public final OmttParser.functional_expression_return functional_expression() throws RecognitionException {
        OmttParser.functional_expression_return retval = new OmttParser.functional_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.call_expression_return call_expression214 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:391:3: ( call_expression )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:391:5: call_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_call_expression_in_functional_expression2761);
            call_expression214=call_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, call_expression214.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:394:1: call_expression : atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) ) ;
    public final OmttParser.call_expression_return call_expression() throws RecognitionException {
        OmttParser.call_expression_return retval = new OmttParser.call_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.atom_expression_return atom_expression215 = null;

        OmttParser.function_argument_return function_argument216 = null;


        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_function_argument=new RewriteRuleSubtreeStream(adaptor,"rule function_argument");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:395:3: ( atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:395:5: atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            {
            pushFollow(FOLLOW_atom_expression_in_call_expression2774);
            atom_expression215=atom_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom_expression.add(atom_expression215.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:396:5: ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=STRING_LITERAL && LA66_0<=REAL_NUMBER)||LA66_0==DATA_START||(LA66_0>=NULL && LA66_0<=FALSE)||(LA66_0>=TILDE && LA66_0<=LEFT_PAREN)||LA66_0==LEFT_SQUARE_PAREN||LA66_0==OP_GENERAL||LA66_0==VAR_ID) ) {
                alt66=1;
            }
            else if ( (LA66_0==EOF||(LA66_0>=CONTENT && LA66_0<=TAG_END)||(LA66_0>=EXPRESSION_END && LA66_0<=OP_DATA_IS_EXPRESSION)||(LA66_0>=AND && LA66_0<=IN)||LA66_0==ELSE||(LA66_0>=MAP && LA66_0<=ORDER)||(LA66_0>=COLON && LA66_0<=SEMICOLON)||(LA66_0>=COMMA && LA66_0<=SLASH)||LA66_0==RIGHT_PAREN||(LA66_0>=RIGHT_SQUARE_PAREN && LA66_0<=OP_GE)||(LA66_0>=OP_AND && LA66_0<=OP_OR)||LA66_0==OP_CONTEXT||LA66_0==OP_CONCAT) ) {
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:396:7: ( function_argument )+
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:396:7: ( function_argument )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( ((LA65_0>=STRING_LITERAL && LA65_0<=REAL_NUMBER)||LA65_0==DATA_START||(LA65_0>=NULL && LA65_0<=FALSE)||(LA65_0>=TILDE && LA65_0<=LEFT_PAREN)||LA65_0==LEFT_SQUARE_PAREN||LA65_0==OP_GENERAL||LA65_0==VAR_ID) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: function_argument
                    	    {
                    	    pushFollow(FOLLOW_function_argument_in_call_expression2782);
                    	    function_argument216=function_argument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_function_argument.add(function_argument216.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
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
                    // 397:7: -> ^( CALL[false] atom_expression ( function_argument )+ )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:397:10: ^( CALL[false] atom_expression ( function_argument )+ )
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:398:7: 
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
                    // 399:7: -> ^( atom_expression )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:399:10: ^( atom_expression )
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:402:1: call_tag : TAG_START ident= namespace_id ( (content= tag_content | (args+= function_argument )+ (content= tag_content )? ) -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* ) | -> $ident) TAG_END ;
    public final OmttParser.call_tag_return call_tag() throws RecognitionException {
        OmttParser.call_tag_return retval = new OmttParser.call_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START217=null;
        Token TAG_END218=null;
        List list_args=null;
        OmttParser.namespace_id_return ident = null;

        OmttParser.tag_content_return content = null;

        OmttParser.function_argument_return args = null;
         args = null;
        Object TAG_START217_tree=null;
        Object TAG_END218_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_function_argument=new RewriteRuleSubtreeStream(adaptor,"rule function_argument");
        RewriteRuleSubtreeStream stream_namespace_id=new RewriteRuleSubtreeStream(adaptor,"rule namespace_id");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:403:3: ( TAG_START ident= namespace_id ( (content= tag_content | (args+= function_argument )+ (content= tag_content )? ) -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* ) | -> $ident) TAG_END )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:403:5: TAG_START ident= namespace_id ( (content= tag_content | (args+= function_argument )+ (content= tag_content )? ) -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* ) | -> $ident) TAG_END
            {
            TAG_START217=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_call_tag2842); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_START.add(TAG_START217);

            pushFollow(FOLLOW_namespace_id_in_call_tag2846);
            ident=namespace_id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_namespace_id.add(ident.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:404:4: ( (content= tag_content | (args+= function_argument )+ (content= tag_content )? ) -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* ) | -> $ident)
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=STRING_LITERAL && LA70_0<=CONTENT)||LA70_0==DATA_START||LA70_0==OP_DATA_IS_EXPRESSION||(LA70_0>=NULL && LA70_0<=FALSE)||(LA70_0>=TILDE && LA70_0<=LEFT_PAREN)||LA70_0==LEFT_SQUARE_PAREN||LA70_0==OP_GENERAL||LA70_0==VAR_ID) ) {
                alt70=1;
            }
            else if ( (LA70_0==TAG_END) ) {
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:404:6: (content= tag_content | (args+= function_argument )+ (content= tag_content )? )
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:404:6: (content= tag_content | (args+= function_argument )+ (content= tag_content )? )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==CONTENT||LA69_0==OP_DATA_IS_EXPRESSION) ) {
                        alt69=1;
                    }
                    else if ( ((LA69_0>=STRING_LITERAL && LA69_0<=REAL_NUMBER)||LA69_0==DATA_START||(LA69_0>=NULL && LA69_0<=FALSE)||(LA69_0>=TILDE && LA69_0<=LEFT_PAREN)||LA69_0==LEFT_SQUARE_PAREN||LA69_0==OP_GENERAL||LA69_0==VAR_ID) ) {
                        alt69=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:404:7: content= tag_content
                            {
                            pushFollow(FOLLOW_tag_content_in_call_tag2856);
                            content=tag_content();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tag_content.add(content.getTree());

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:404:29: (args+= function_argument )+ (content= tag_content )?
                            {
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:404:33: (args+= function_argument )+
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
                            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: args+= function_argument
                            	    {
                            	    pushFollow(FOLLOW_function_argument_in_call_tag2862);
                            	    args=function_argument();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_function_argument.add(args.getTree());
                            	    if (list_args==null) list_args=new ArrayList();
                            	    list_args.add(args.getTree());


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

                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:404:54: (content= tag_content )?
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==CONTENT||LA68_0==OP_DATA_IS_EXPRESSION) ) {
                                alt68=1;
                            }
                            switch (alt68) {
                                case 1 :
                                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:404:55: content= tag_content
                                    {
                                    pushFollow(FOLLOW_tag_content_in_call_tag2868);
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
                    // elements: ident, content, args
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
                    // 405:4: -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:405:7: ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( $args)* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, false), root_1);

                        adaptor.addChild(root_1, stream_ident.nextTree());
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:405:34: ( ^( ARGUMENT $content) )?
                        if ( stream_content.hasNext() ) {
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:405:34: ^( ARGUMENT $content)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

                            adaptor.addChild(root_2, stream_content.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_content.reset();
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:405:74: ( $args)*
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:406:6: 
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
                    // 406:6: -> $ident
                    {
                        adaptor.addChild(root_0, stream_ident.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }

            TAG_END218=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_call_tag2923); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TAG_END.add(TAG_END218);


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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:410:10: fragment function_arguments : ( function_argument )* ;
    public final OmttParser.function_arguments_return function_arguments() throws RecognitionException {
        OmttParser.function_arguments_return retval = new OmttParser.function_arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.function_argument_return function_argument219 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:411:3: ( ( function_argument )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:411:5: ( function_argument )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:411:5: ( function_argument )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=STRING_LITERAL && LA71_0<=REAL_NUMBER)||LA71_0==DATA_START||(LA71_0>=NULL && LA71_0<=FALSE)||(LA71_0>=TILDE && LA71_0<=LEFT_PAREN)||LA71_0==LEFT_SQUARE_PAREN||LA71_0==OP_GENERAL||LA71_0==VAR_ID) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: function_argument
            	    {
            	    pushFollow(FOLLOW_function_argument_in_function_arguments2937);
            	    function_argument219=function_argument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_argument219.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:413:10: fragment function_argument : ( VAR_ID OP_ASSIGN )? atom_expression -> ^( ARGUMENT atom_expression ( VAR_ID )? ) ;
    public final OmttParser.function_argument_return function_argument() throws RecognitionException {
        OmttParser.function_argument_return retval = new OmttParser.function_argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID220=null;
        Token OP_ASSIGN221=null;
        OmttParser.atom_expression_return atom_expression222 = null;


        Object VAR_ID220_tree=null;
        Object OP_ASSIGN221_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:414:3: ( ( VAR_ID OP_ASSIGN )? atom_expression -> ^( ARGUMENT atom_expression ( VAR_ID )? ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:414:5: ( VAR_ID OP_ASSIGN )? atom_expression
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:414:5: ( VAR_ID OP_ASSIGN )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==VAR_ID) ) {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==OP_ASSIGN) ) {
                    alt72=1;
                }
            }
            switch (alt72) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:414:6: VAR_ID OP_ASSIGN
                    {
                    VAR_ID220=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_function_argument2953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID220);

                    OP_ASSIGN221=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_function_argument2955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_ASSIGN.add(OP_ASSIGN221);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_expression_in_function_argument2959);
            atom_expression222=atom_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom_expression.add(atom_expression222.getTree());


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
            // 415:5: -> ^( ARGUMENT atom_expression ( VAR_ID )? )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:415:8: ^( ARGUMENT atom_expression ( VAR_ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_1);

                adaptor.addChild(root_1, stream_atom_expression.nextTree());
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:415:53: ( VAR_ID )?
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:420:1: atom_expression : (a= atom_with_selectors -> $a) ( DOT es= expression_select -> ^( DOT $atom_expression $es) | DOT ps= property_select -> ^( DOT $atom_expression $ps) )* ;
    public final OmttParser.atom_expression_return atom_expression() throws RecognitionException {
        OmttParser.atom_expression_return retval = new OmttParser.atom_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT223=null;
        Token DOT224=null;
        OmttParser.atom_with_selectors_return a = null;

        OmttParser.expression_select_return es = null;

        OmttParser.property_select_return ps = null;


        Object DOT223_tree=null;
        Object DOT224_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_expression_select=new RewriteRuleSubtreeStream(adaptor,"rule expression_select");
        RewriteRuleSubtreeStream stream_property_select=new RewriteRuleSubtreeStream(adaptor,"rule property_select");
        RewriteRuleSubtreeStream stream_atom_with_selectors=new RewriteRuleSubtreeStream(adaptor,"rule atom_with_selectors");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:421:3: ( (a= atom_with_selectors -> $a) ( DOT es= expression_select -> ^( DOT $atom_expression $es) | DOT ps= property_select -> ^( DOT $atom_expression $ps) )* )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:421:5: (a= atom_with_selectors -> $a) ( DOT es= expression_select -> ^( DOT $atom_expression $es) | DOT ps= property_select -> ^( DOT $atom_expression $ps) )*
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:421:5: (a= atom_with_selectors -> $a)
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:421:6: a= atom_with_selectors
            {
            pushFollow(FOLLOW_atom_with_selectors_in_atom_expression2995);
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
            // 421:28: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:422:4: ( DOT es= expression_select -> ^( DOT $atom_expression $es) | DOT ps= property_select -> ^( DOT $atom_expression $ps) )*
            loop73:
            do {
                int alt73=3;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==DOT) ) {
                    int LA73_2 = input.LA(2);

                    if ( (LA73_2==VAR_ID) ) {
                        alt73=2;
                    }
                    else if ( ((LA73_2>=STRING_LITERAL && LA73_2<=REAL_NUMBER)||LA73_2==DATA_START||(LA73_2>=NULL && LA73_2<=FALSE)||(LA73_2>=TILDE && LA73_2<=LEFT_PAREN)||LA73_2==LEFT_SQUARE_PAREN) ) {
                        alt73=1;
                    }


                }


                switch (alt73) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:422:6: DOT es= expression_select
            	    {
            	    DOT223=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expression3008); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT223);

            	    pushFollow(FOLLOW_expression_select_in_atom_expression3012);
            	    es=expression_select();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression_select.add(es.getTree());


            	    // AST REWRITE
            	    // elements: atom_expression, es, DOT
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
            	    // 423:6: -> ^( DOT $atom_expression $es)
            	    {
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:423:9: ^( DOT $atom_expression $es)
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
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:424:6: DOT ps= property_select
            	    {
            	    DOT224=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expression3039); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT224);

            	    pushFollow(FOLLOW_property_select_in_atom_expression3043);
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
            	    // 425:5: -> ^( DOT $atom_expression $ps)
            	    {
            	        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:425:8: ^( DOT $atom_expression $ps)
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
    // $ANTLR end "atom_expression"

    public static class atom_with_selectors_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom_with_selectors"
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:428:10: fragment atom_with_selectors : atom ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom ) ;
    public final OmttParser.atom_with_selectors_return atom_with_selectors() throws RecognitionException {
        OmttParser.atom_with_selectors_return retval = new OmttParser.atom_with_selectors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.atom_return atom225 = null;

        OmttParser.sequence_selectors_return sequence_selectors226 = null;


        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_sequence_selectors=new RewriteRuleSubtreeStream(adaptor,"rule sequence_selectors");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:429:2: ( atom ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:429:4: atom ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom )
            {
            pushFollow(FOLLOW_atom_in_atom_with_selectors3081);
            atom225=atom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom.add(atom225.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:430:3: ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom )
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:430:5: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_atom_with_selectors3087);
                    sequence_selectors226=sequence_selectors();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sequence_selectors.add(sequence_selectors226.getTree());


                    // AST REWRITE
                    // elements: atom, sequence_selectors
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 431:4: -> ^( ATOM_SELECT atom sequence_selectors )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:431:7: ^( ATOM_SELECT atom sequence_selectors )
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:432:5: 
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
                    // 432:5: -> atom
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:435:10: fragment expression_select : object ( sequence_selectors -> ^( ATOM_SELECT object sequence_selectors ) | -> object ) ;
    public final OmttParser.expression_select_return expression_select() throws RecognitionException {
        OmttParser.expression_select_return retval = new OmttParser.expression_select_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.object_return object227 = null;

        OmttParser.sequence_selectors_return sequence_selectors228 = null;


        RewriteRuleSubtreeStream stream_sequence_selectors=new RewriteRuleSubtreeStream(adaptor,"rule sequence_selectors");
        RewriteRuleSubtreeStream stream_object=new RewriteRuleSubtreeStream(adaptor,"rule object");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:436:2: ( object ( sequence_selectors -> ^( ATOM_SELECT object sequence_selectors ) | -> object ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:436:4: object ( sequence_selectors -> ^( ATOM_SELECT object sequence_selectors ) | -> object )
            {
            pushFollow(FOLLOW_object_in_expression_select3127);
            object227=object();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_object.add(object227.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:437:3: ( sequence_selectors -> ^( ATOM_SELECT object sequence_selectors ) | -> object )
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:437:5: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_expression_select3133);
                    sequence_selectors228=sequence_selectors();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sequence_selectors.add(sequence_selectors228.getTree());


                    // AST REWRITE
                    // elements: object, sequence_selectors
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 438:4: -> ^( ATOM_SELECT object sequence_selectors )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:438:7: ^( ATOM_SELECT object sequence_selectors )
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:439:5: 
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
                    // 439:5: -> object
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:442:10: fragment property_select : VAR_ID ( sequence_selectors )? ;
    public final OmttParser.property_select_return property_select() throws RecognitionException {
        OmttParser.property_select_return retval = new OmttParser.property_select_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID229=null;
        OmttParser.sequence_selectors_return sequence_selectors230 = null;


        Object VAR_ID229_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:443:2: ( VAR_ID ( sequence_selectors )? )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:443:4: VAR_ID ( sequence_selectors )?
            {
            root_0 = (Object)adaptor.nil();

            VAR_ID229=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_property_select3173); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR_ID229_tree = (Object)adaptor.create(VAR_ID229);
            adaptor.addChild(root_0, VAR_ID229_tree);
            }
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:443:11: ( sequence_selectors )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_property_select3175);
                    sequence_selectors230=sequence_selectors();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence_selectors230.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:445:10: fragment sequence_selectors : ( type_selector ( sequence_selector )? ( alias )? | sequence_selector ( alias )? | alias );
    public final OmttParser.sequence_selectors_return sequence_selectors() throws RecognitionException {
        OmttParser.sequence_selectors_return retval = new OmttParser.sequence_selectors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.type_selector_return type_selector231 = null;

        OmttParser.sequence_selector_return sequence_selector232 = null;

        OmttParser.alias_return alias233 = null;

        OmttParser.sequence_selector_return sequence_selector234 = null;

        OmttParser.alias_return alias235 = null;

        OmttParser.alias_return alias236 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:446:2: ( type_selector ( sequence_selector )? ( alias )? | sequence_selector ( alias )? | alias )
            int alt80=3;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt80=1;
                }
                break;
            case LEFT_SQUARE_PAREN:
                {
                alt80=2;
                }
                break;
            case AS:
                {
                alt80=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:446:4: type_selector ( sequence_selector )? ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_selector_in_sequence_selectors3188);
                    type_selector231=type_selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_selector231.getTree());
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:446:18: ( sequence_selector )?
                    int alt77=2;
                    alt77 = dfa77.predict(input);
                    switch (alt77) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: sequence_selector
                            {
                            pushFollow(FOLLOW_sequence_selector_in_sequence_selectors3190);
                            sequence_selector232=sequence_selector();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence_selector232.getTree());

                            }
                            break;

                    }

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:446:37: ( alias )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==AS) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: alias
                            {
                            pushFollow(FOLLOW_alias_in_sequence_selectors3193);
                            alias233=alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, alias233.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:447:4: sequence_selector ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_sequence_selector_in_sequence_selectors3199);
                    sequence_selector234=sequence_selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence_selector234.getTree());
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:447:22: ( alias )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==AS) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: alias
                            {
                            pushFollow(FOLLOW_alias_in_sequence_selectors3201);
                            alias235=alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, alias235.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:448:4: alias
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alias_in_sequence_selectors3207);
                    alias236=alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alias236.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:450:10: fragment type_selector : DOT single_type -> ^( TYPE_SELECT single_type ) ;
    public final OmttParser.type_selector_return type_selector() throws RecognitionException {
        OmttParser.type_selector_return retval = new OmttParser.type_selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT237=null;
        OmttParser.single_type_return single_type238 = null;


        Object DOT237_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:451:3: ( DOT single_type -> ^( TYPE_SELECT single_type ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:451:5: DOT single_type
            {
            DOT237=(Token)match(input,DOT,FOLLOW_DOT_in_type_selector3220); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT237);

            pushFollow(FOLLOW_single_type_in_type_selector3222);
            single_type238=single_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_single_type.add(single_type238.getTree());


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
            // 452:4: -> ^( TYPE_SELECT single_type )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:452:7: ^( TYPE_SELECT single_type )
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:454:10: fragment sequence_selector : LEFT_SQUARE_PAREN expression RIGHT_SQUARE_PAREN -> ^( SEQUENCE_SELECT expression ) ;
    public final OmttParser.sequence_selector_return sequence_selector() throws RecognitionException {
        OmttParser.sequence_selector_return retval = new OmttParser.sequence_selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE_PAREN239=null;
        Token RIGHT_SQUARE_PAREN241=null;
        OmttParser.expression_return expression240 = null;


        Object LEFT_SQUARE_PAREN239_tree=null;
        Object RIGHT_SQUARE_PAREN241_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:455:3: ( LEFT_SQUARE_PAREN expression RIGHT_SQUARE_PAREN -> ^( SEQUENCE_SELECT expression ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:455:5: LEFT_SQUARE_PAREN expression RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN239=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector3247); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN239);

            pushFollow(FOLLOW_expression_in_sequence_selector3249);
            expression240=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression240.getTree());
            RIGHT_SQUARE_PAREN241=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector3251); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN241);



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
            // 456:4: -> ^( SEQUENCE_SELECT expression )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:456:7: ^( SEQUENCE_SELECT expression )
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:458:10: fragment alias : AS VAR_ID -> ^( AS VAR_ID ) ;
    public final OmttParser.alias_return alias() throws RecognitionException {
        OmttParser.alias_return retval = new OmttParser.alias_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AS242=null;
        Token VAR_ID243=null;

        Object AS242_tree=null;
        Object VAR_ID243_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:459:2: ( AS VAR_ID -> ^( AS VAR_ID ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:459:4: AS VAR_ID
            {
            AS242=(Token)match(input,AS,FOLLOW_AS_in_alias3275); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AS.add(AS242);

            VAR_ID243=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_alias3277); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID243);



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
            // 460:3: -> ^( AS VAR_ID )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:460:6: ^( AS VAR_ID )
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:463:1: data_expression : DATA_START ( data_body_atom )* DATA_END -> ^( DATA_START ( data_body_atom )* ) ;
    public final OmttParser.data_expression_return data_expression() throws RecognitionException {
        OmttParser.data_expression_return retval = new OmttParser.data_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DATA_START244=null;
        Token DATA_END246=null;
        OmttParser.data_body_atom_return data_body_atom245 = null;


        Object DATA_START244_tree=null;
        Object DATA_END246_tree=null;
        RewriteRuleTokenStream stream_DATA_END=new RewriteRuleTokenStream(adaptor,"token DATA_END");
        RewriteRuleTokenStream stream_DATA_START=new RewriteRuleTokenStream(adaptor,"token DATA_START");
        RewriteRuleSubtreeStream stream_data_body_atom=new RewriteRuleSubtreeStream(adaptor,"rule data_body_atom");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:464:3: ( DATA_START ( data_body_atom )* DATA_END -> ^( DATA_START ( data_body_atom )* ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:464:5: DATA_START ( data_body_atom )* DATA_END
            {
            DATA_START244=(Token)match(input,DATA_START,FOLLOW_DATA_START_in_data_expression3299); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DATA_START.add(DATA_START244);

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:464:16: ( data_body_atom )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==STRING_LITERAL||LA81_0==TAG_START||LA81_0==EXPRESSION_START) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:0:0: data_body_atom
            	    {
            	    pushFollow(FOLLOW_data_body_atom_in_data_expression3301);
            	    data_body_atom245=data_body_atom();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_data_body_atom.add(data_body_atom245.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            DATA_END246=(Token)match(input,DATA_END,FOLLOW_DATA_END_in_data_expression3304); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DATA_END.add(DATA_END246);



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
            // 465:5: -> ^( DATA_START ( data_body_atom )* )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:465:8: ^( DATA_START ( data_body_atom )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Data(stream_DATA_START.nextToken()), root_1);

                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:465:27: ( data_body_atom )*
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:468:1: atom : selectable_atom ( DOUBLE_DOT selectable_atom )? ;
    public final OmttParser.atom_return atom() throws RecognitionException {
        OmttParser.atom_return retval = new OmttParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_DOT248=null;
        OmttParser.selectable_atom_return selectable_atom247 = null;

        OmttParser.selectable_atom_return selectable_atom249 = null;


        Object DOUBLE_DOT248_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:469:2: ( selectable_atom ( DOUBLE_DOT selectable_atom )? )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:469:4: selectable_atom ( DOUBLE_DOT selectable_atom )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_selectable_atom_in_atom3332);
            selectable_atom247=selectable_atom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selectable_atom247.getTree());
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:470:3: ( DOUBLE_DOT selectable_atom )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==DOUBLE_DOT) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:470:4: DOUBLE_DOT selectable_atom
                    {
                    DOUBLE_DOT248=(Token)match(input,DOUBLE_DOT,FOLLOW_DOUBLE_DOT_in_atom3337); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_DOT248_tree = new Range(DOUBLE_DOT248) ;
                    root_0 = (Object)adaptor.becomeRoot(DOUBLE_DOT248_tree, root_0);
                    }
                    pushFollow(FOLLOW_selectable_atom_in_atom3343);
                    selectable_atom249=selectable_atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selectable_atom249.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:473:1: selectable_atom : ( namespace_id | object );
    public final OmttParser.selectable_atom_return selectable_atom() throws RecognitionException {
        OmttParser.selectable_atom_return retval = new OmttParser.selectable_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.namespace_id_return namespace_id250 = null;

        OmttParser.object_return object251 = null;



        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:474:3: ( namespace_id | object )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==OP_GENERAL||LA83_0==VAR_ID) ) {
                alt83=1;
            }
            else if ( ((LA83_0>=STRING_LITERAL && LA83_0<=REAL_NUMBER)||LA83_0==DATA_START||(LA83_0>=NULL && LA83_0<=FALSE)||(LA83_0>=TILDE && LA83_0<=LEFT_PAREN)||LA83_0==LEFT_SQUARE_PAREN) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:474:5: namespace_id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespace_id_in_selectable_atom3357);
                    namespace_id250=namespace_id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace_id250.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:475:5: object
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_object_in_selectable_atom3363);
                    object251=object();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, object251.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:477:10: fragment object : ( object_atom | data_expression | tuple | record | LEFT_PAREN sequence_expression RIGHT_PAREN );
    public final OmttParser.object_return object() throws RecognitionException {
        OmttParser.object_return retval = new OmttParser.object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN256=null;
        Token RIGHT_PAREN258=null;
        OmttParser.object_atom_return object_atom252 = null;

        OmttParser.data_expression_return data_expression253 = null;

        OmttParser.tuple_return tuple254 = null;

        OmttParser.record_return record255 = null;

        OmttParser.sequence_expression_return sequence_expression257 = null;


        Object LEFT_PAREN256_tree=null;
        Object RIGHT_PAREN258_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:478:2: ( object_atom | data_expression | tuple | record | LEFT_PAREN sequence_expression RIGHT_PAREN )
            int alt84=5;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
            case INT_NUMBER:
            case REAL_NUMBER:
            case NULL:
            case TRUE:
            case FALSE:
            case TILDE:
                {
                alt84=1;
                }
                break;
            case DATA_START:
                {
                alt84=2;
                }
                break;
            case LEFT_SQUARE_PAREN:
                {
                int LA84_3 = input.LA(2);

                if ( ((LA84_3>=STRING_LITERAL && LA84_3<=REAL_NUMBER)||LA84_3==DATA_START||LA84_3==DEF||LA84_3==IF||(LA84_3>=MAP && LA84_3<=MATCH)||(LA84_3>=LAMBDA && LA84_3<=FALSE)||LA84_3==OP_FOLLOW||(LA84_3>=TILDE && LA84_3<=LEFT_PAREN)||LA84_3==LEFT_SQUARE_PAREN||LA84_3==OP_MINUS||LA84_3==OP_NOT||LA84_3==OP_GENERAL||LA84_3==CLASS_ID) ) {
                    alt84=3;
                }
                else if ( (LA84_3==VAR_ID) ) {
                    int LA84_6 = input.LA(3);

                    if ( ((LA84_6>=STRING_LITERAL && LA84_6<=REAL_NUMBER)||LA84_6==DATA_START||LA84_6==AS||(LA84_6>=MAP && LA84_6<=ORDER)||(LA84_6>=NULL && LA84_6<=FALSE)||LA84_6==OP_FOLLOW||(LA84_6>=DOT && LA84_6<=LEFT_PAREN)||(LA84_6>=LEFT_SQUARE_PAREN && LA84_6<=OP_GE)||(LA84_6>=OP_AND && LA84_6<=OP_OR)||(LA84_6>=OP_CONTEXT && LA84_6<=OP_GENERAL)||LA84_6==VAR_ID) ) {
                        alt84=3;
                    }
                    else if ( (LA84_6==COLON) ) {
                        alt84=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 3, input);

                    throw nvae;
                }
                }
                break;
            case LEFT_PAREN:
                {
                alt84=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:478:4: object_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_object_atom_in_object3376);
                    object_atom252=object_atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, object_atom252.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:479:5: data_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_data_expression_in_object3382);
                    data_expression253=data_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_expression253.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:480:4: tuple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tuple_in_object3387);
                    tuple254=tuple();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tuple254.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:481:5: record
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_record_in_object3393);
                    record255=record();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, record255.getTree());

                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:482:5: LEFT_PAREN sequence_expression RIGHT_PAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LEFT_PAREN256=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_object3399); if (state.failed) return retval;
                    pushFollow(FOLLOW_sequence_expression_in_object3402);
                    sequence_expression257=sequence_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence_expression257.getTree());
                    RIGHT_PAREN258=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_object3404); if (state.failed) return retval;

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:485:10: fragment namespace_id : ( (ns= VAR_ID OP_VIEW )? id= VAR_ID -> ^( IDENT[$id] ( $ns)? ) | (ns= VAR_ID OP_VIEW )? id= OP_GENERAL -> ^( IDENT[$id] ( $ns)? ) );
    public final OmttParser.namespace_id_return namespace_id() throws RecognitionException {
        OmttParser.namespace_id_return retval = new OmttParser.namespace_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ns=null;
        Token id=null;
        Token OP_VIEW259=null;
        Token OP_VIEW260=null;

        Object ns_tree=null;
        Object id_tree=null;
        Object OP_VIEW259_tree=null;
        Object OP_VIEW260_tree=null;
        RewriteRuleTokenStream stream_OP_GENERAL=new RewriteRuleTokenStream(adaptor,"token OP_GENERAL");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_VIEW=new RewriteRuleTokenStream(adaptor,"token OP_VIEW");

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:486:3: ( (ns= VAR_ID OP_VIEW )? id= VAR_ID -> ^( IDENT[$id] ( $ns)? ) | (ns= VAR_ID OP_VIEW )? id= OP_GENERAL -> ^( IDENT[$id] ( $ns)? ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==VAR_ID) ) {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==OP_VIEW) ) {
                    int LA87_3 = input.LA(3);

                    if ( (LA87_3==OP_GENERAL) ) {
                        alt87=2;
                    }
                    else if ( (LA87_3==VAR_ID) ) {
                        alt87=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA87_1==EOF||(LA87_1>=STRING_LITERAL && LA87_1<=DATA_START)||(LA87_1>=EXPRESSION_END && LA87_1<=OP_DATA_IS_EXPRESSION)||(LA87_1>=AND && LA87_1<=IN)||(LA87_1>=ELSE && LA87_1<=AS)||(LA87_1>=MAP && LA87_1<=ORDER)||(LA87_1>=NULL && LA87_1<=FALSE)||(LA87_1>=COLON && LA87_1<=OP_GE)||(LA87_1>=OP_AND && LA87_1<=OP_OR)||LA87_1==OP_CONTEXT||(LA87_1>=OP_CONCAT && LA87_1<=OP_GENERAL)||LA87_1==VAR_ID) ) {
                    alt87=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA87_0==OP_GENERAL) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:486:5: (ns= VAR_ID OP_VIEW )? id= VAR_ID
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:486:5: (ns= VAR_ID OP_VIEW )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==VAR_ID) ) {
                        int LA85_1 = input.LA(2);

                        if ( (LA85_1==OP_VIEW) ) {
                            alt85=1;
                        }
                    }
                    switch (alt85) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:486:6: ns= VAR_ID OP_VIEW
                            {
                            ns=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id3422); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_VAR_ID.add(ns);

                            OP_VIEW259=(Token)match(input,OP_VIEW,FOLLOW_OP_VIEW_in_namespace_id3424); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_VIEW.add(OP_VIEW259);


                            }
                            break;

                    }

                    id=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id3430); if (state.failed) return retval; 
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
                    // 487:5: -> ^( IDENT[$id] ( $ns)? )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:487:8: ^( IDENT[$id] ( $ns)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Ident(IDENT, id), root_1);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:487:28: ( $ns)?
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:488:5: (ns= VAR_ID OP_VIEW )? id= OP_GENERAL
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:488:5: (ns= VAR_ID OP_VIEW )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==VAR_ID) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:488:6: ns= VAR_ID OP_VIEW
                            {
                            ns=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id3457); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_VAR_ID.add(ns);

                            OP_VIEW260=(Token)match(input,OP_VIEW,FOLLOW_OP_VIEW_in_namespace_id3459); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_VIEW.add(OP_VIEW260);


                            }
                            break;

                    }

                    id=(Token)match(input,OP_GENERAL,FOLLOW_OP_GENERAL_in_namespace_id3465); if (state.failed) return retval; 
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
                    // 489:5: -> ^( IDENT[$id] ( $ns)? )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:489:8: ^( IDENT[$id] ( $ns)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Ident(IDENT, id), root_1);

                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:489:28: ( $ns)?
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:492:1: tuple : LEFT_SQUARE_PAREN expr+= expression ( COMMA expr+= expression )* RIGHT_SQUARE_PAREN -> ^( TUPLE ( $expr)+ ) ;
    public final OmttParser.tuple_return tuple() throws RecognitionException {
        OmttParser.tuple_return retval = new OmttParser.tuple_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE_PAREN261=null;
        Token COMMA262=null;
        Token RIGHT_SQUARE_PAREN263=null;
        List list_expr=null;
        OmttParser.expression_return expr = null;
         expr = null;
        Object LEFT_SQUARE_PAREN261_tree=null;
        Object COMMA262_tree=null;
        Object RIGHT_SQUARE_PAREN263_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:493:2: ( LEFT_SQUARE_PAREN expr+= expression ( COMMA expr+= expression )* RIGHT_SQUARE_PAREN -> ^( TUPLE ( $expr)+ ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:493:4: LEFT_SQUARE_PAREN expr+= expression ( COMMA expr+= expression )* RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN261=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_tuple3495); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN261);

            pushFollow(FOLLOW_expression_in_tuple3499);
            expr=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expr.getTree());
            if (list_expr==null) list_expr=new ArrayList();
            list_expr.add(expr.getTree());

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:493:39: ( COMMA expr+= expression )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==COMMA) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:493:40: COMMA expr+= expression
            	    {
            	    COMMA262=(Token)match(input,COMMA,FOLLOW_COMMA_in_tuple3502); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA262);

            	    pushFollow(FOLLOW_expression_in_tuple3506);
            	    expr=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expr.getTree());
            	    if (list_expr==null) list_expr=new ArrayList();
            	    list_expr.add(expr.getTree());


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            RIGHT_SQUARE_PAREN263=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_tuple3510); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN263);

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
            // 495:3: -> ^( TUPLE ( $expr)+ )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:495:6: ^( TUPLE ( $expr)+ )
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:497:1: record : LEFT_SQUARE_PAREN expr+= record_item ( COMMA expr+= record_item )* RIGHT_SQUARE_PAREN -> ^( RECORD ( $expr)* ) ;
    public final OmttParser.record_return record() throws RecognitionException {
        OmttParser.record_return retval = new OmttParser.record_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE_PAREN264=null;
        Token COMMA265=null;
        Token RIGHT_SQUARE_PAREN266=null;
        List list_expr=null;
        OmttParser.record_item_return expr = null;
         expr = null;
        Object LEFT_SQUARE_PAREN264_tree=null;
        Object COMMA265_tree=null;
        Object RIGHT_SQUARE_PAREN266_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_record_item=new RewriteRuleSubtreeStream(adaptor,"rule record_item");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:498:2: ( LEFT_SQUARE_PAREN expr+= record_item ( COMMA expr+= record_item )* RIGHT_SQUARE_PAREN -> ^( RECORD ( $expr)* ) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:498:4: LEFT_SQUARE_PAREN expr+= record_item ( COMMA expr+= record_item )* RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN264=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_record3536); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN264);

            pushFollow(FOLLOW_record_item_in_record3540);
            expr=record_item();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_record_item.add(expr.getTree());
            if (list_expr==null) list_expr=new ArrayList();
            list_expr.add(expr.getTree());

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:498:40: ( COMMA expr+= record_item )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==COMMA) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:498:41: COMMA expr+= record_item
            	    {
            	    COMMA265=(Token)match(input,COMMA,FOLLOW_COMMA_in_record3543); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA265);

            	    pushFollow(FOLLOW_record_item_in_record3547);
            	    expr=record_item();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_record_item.add(expr.getTree());
            	    if (list_expr==null) list_expr=new ArrayList();
            	    list_expr.add(expr.getTree());


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            RIGHT_SQUARE_PAREN266=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_record3551); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN266);

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
            // 500:3: -> ^( RECORD ( $expr)* )
            {
                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:500:6: ^( RECORD ( $expr)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RECORD, "RECORD"), root_1);

                // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:500:15: ( $expr)*
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:502:10: fragment record_item : VAR_ID COLON expression ;
    public final OmttParser.record_item_return record_item() throws RecognitionException {
        OmttParser.record_item_return retval = new OmttParser.record_item_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID267=null;
        Token COLON268=null;
        OmttParser.expression_return expression269 = null;


        Object VAR_ID267_tree=null;
        Object COLON268_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:503:2: ( VAR_ID COLON expression )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:503:4: VAR_ID COLON expression
            {
            root_0 = (Object)adaptor.nil();

            VAR_ID267=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_record_item3578); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR_ID267_tree = (Object)adaptor.create(VAR_ID267);
            adaptor.addChild(root_0, VAR_ID267_tree);
            }
            COLON268=(Token)match(input,COLON,FOLLOW_COLON_in_record_item3580); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_record_item3583);
            expression269=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression269.getTree());

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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:506:1: sequence_expression : (expr= expression -> $expr) ( ( COMMA rexpr+= expression )+ -> ^( SEQUENCE $sequence_expression ( $rexpr)+ ) | -> $sequence_expression) ;
    public final OmttParser.sequence_expression_return sequence_expression() throws RecognitionException {
        OmttParser.sequence_expression_return retval = new OmttParser.sequence_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA270=null;
        List list_rexpr=null;
        OmttParser.expression_return expr = null;

        OmttParser.expression_return rexpr = null;
         rexpr = null;
        Object COMMA270_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:507:2: ( (expr= expression -> $expr) ( ( COMMA rexpr+= expression )+ -> ^( SEQUENCE $sequence_expression ( $rexpr)+ ) | -> $sequence_expression) )
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:507:4: (expr= expression -> $expr) ( ( COMMA rexpr+= expression )+ -> ^( SEQUENCE $sequence_expression ( $rexpr)+ ) | -> $sequence_expression)
            {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:507:4: (expr= expression -> $expr)
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:507:5: expr= expression
            {
            pushFollow(FOLLOW_expression_in_sequence_expression3597);
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
            // 507:21: -> $expr
            {
                adaptor.addChild(root_0, stream_expr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:508:3: ( ( COMMA rexpr+= expression )+ -> ^( SEQUENCE $sequence_expression ( $rexpr)+ ) | -> $sequence_expression)
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==COMMA) ) {
                alt91=1;
            }
            else if ( (LA91_0==RIGHT_PAREN) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:508:5: ( COMMA rexpr+= expression )+
                    {
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:508:5: ( COMMA rexpr+= expression )+
                    int cnt90=0;
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==COMMA) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:508:6: COMMA rexpr+= expression
                    	    {
                    	    COMMA270=(Token)match(input,COMMA,FOLLOW_COMMA_in_sequence_expression3610); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA270);

                    	    pushFollow(FOLLOW_expression_in_sequence_expression3614);
                    	    rexpr=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(rexpr.getTree());
                    	    if (list_rexpr==null) list_rexpr=new ArrayList();
                    	    list_rexpr.add(rexpr.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt90 >= 1 ) break loop90;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(90, input);
                                throw eee;
                        }
                        cnt90++;
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
                    // 509:4: -> ^( SEQUENCE $sequence_expression ( $rexpr)+ )
                    {
                        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:509:7: ^( SEQUENCE $sequence_expression ( $rexpr)+ )
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:510:5: 
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
                    // 510:5: -> $sequence_expression
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:515:1: object_atom : ( number_atom | STRING_LITERAL | ( NULL | TILDE ) | ( TRUE | FALSE ) );
    public final OmttParser.object_atom_return object_atom() throws RecognitionException {
        OmttParser.object_atom_return retval = new OmttParser.object_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING_LITERAL272=null;
        Token NULL273=null;
        Token TILDE274=null;
        Token TRUE275=null;
        Token FALSE276=null;
        OmttParser.number_atom_return number_atom271 = null;


        Object STRING_LITERAL272_tree=null;
        Object NULL273_tree=null;
        Object TILDE274_tree=null;
        Object TRUE275_tree=null;
        Object FALSE276_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:516:3: ( number_atom | STRING_LITERAL | ( NULL | TILDE ) | ( TRUE | FALSE ) )
            int alt94=4;
            switch ( input.LA(1) ) {
            case INT_NUMBER:
            case REAL_NUMBER:
                {
                alt94=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt94=2;
                }
                break;
            case NULL:
            case TILDE:
                {
                alt94=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt94=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:516:5: number_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_atom_in_object_atom3661);
                    number_atom271=number_atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number_atom271.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:517:5: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL272=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_object_atom3667); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL272_tree = new Literal(STRING_LITERAL272) ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_LITERAL272_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:518:5: ( NULL | TILDE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:518:5: ( NULL | TILDE )
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==NULL) ) {
                        alt92=1;
                    }
                    else if ( (LA92_0==TILDE) ) {
                        alt92=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 0, input);

                        throw nvae;
                    }
                    switch (alt92) {
                        case 1 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:518:6: NULL
                            {
                            NULL273=(Token)match(input,NULL,FOLLOW_NULL_in_object_atom3678); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NULL273_tree = new Literal(NULL273) ;
                            root_0 = (Object)adaptor.becomeRoot(NULL273_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:518:23: TILDE
                            {
                            TILDE274=(Token)match(input,TILDE,FOLLOW_TILDE_in_object_atom3686); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TILDE274_tree = new Literal(TILDE274) ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE274_tree, root_0);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:519:5: ( TRUE | FALSE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:519:5: ( TRUE | FALSE )
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==TRUE) ) {
                        alt93=1;
                    }
                    else if ( (LA93_0==FALSE) ) {
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
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:519:6: TRUE
                            {
                            TRUE275=(Token)match(input,TRUE,FOLLOW_TRUE_in_object_atom3699); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TRUE275_tree = new Literal(TRUE275) ;
                            root_0 = (Object)adaptor.becomeRoot(TRUE275_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:519:23: FALSE
                            {
                            FALSE276=(Token)match(input,FALSE,FOLLOW_FALSE_in_object_atom3707); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            FALSE276_tree = new Literal(FALSE276) ;
                            root_0 = (Object)adaptor.becomeRoot(FALSE276_tree, root_0);
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
    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:522:1: number_atom : ( INT_NUMBER | REAL_NUMBER );
    public final OmttParser.number_atom_return number_atom() throws RecognitionException {
        OmttParser.number_atom_return retval = new OmttParser.number_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_NUMBER277=null;
        Token REAL_NUMBER278=null;

        Object INT_NUMBER277_tree=null;
        Object REAL_NUMBER278_tree=null;

        try {
            // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:523:3: ( INT_NUMBER | REAL_NUMBER )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==INT_NUMBER) ) {
                alt95=1;
            }
            else if ( (LA95_0==REAL_NUMBER) ) {
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
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:523:5: INT_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    INT_NUMBER277=(Token)match(input,INT_NUMBER,FOLLOW_INT_NUMBER_in_number_atom3725); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT_NUMBER277_tree = new Literal(INT_NUMBER277) ;
                    root_0 = (Object)adaptor.becomeRoot(INT_NUMBER277_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:524:5: REAL_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    REAL_NUMBER278=(Token)match(input,REAL_NUMBER,FOLLOW_REAL_NUMBER_in_number_atom3735); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REAL_NUMBER278_tree = new Literal(REAL_NUMBER278) ;
                    root_0 = (Object)adaptor.becomeRoot(REAL_NUMBER278_tree, root_0);
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

    // $ANTLR start synpred30_OmttParser
    public final void synpred30_OmttParser_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:127:5: ( lambda_expression )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:127:5: lambda_expression
        {
        pushFollow(FOLLOW_lambda_expression_in_synpred30_OmttParser757);
        lambda_expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_OmttParser

    // $ANTLR start synpred99_OmttParser
    public final void synpred99_OmttParser_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:430:5: ( sequence_selectors )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:430:5: sequence_selectors
        {
        pushFollow(FOLLOW_sequence_selectors_in_synpred99_OmttParser3087);
        sequence_selectors();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred99_OmttParser

    // $ANTLR start synpred100_OmttParser
    public final void synpred100_OmttParser_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:437:5: ( sequence_selectors )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:437:5: sequence_selectors
        {
        pushFollow(FOLLOW_sequence_selectors_in_synpred100_OmttParser3133);
        sequence_selectors();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_OmttParser

    // $ANTLR start synpred101_OmttParser
    public final void synpred101_OmttParser_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:443:11: ( sequence_selectors )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:443:11: sequence_selectors
        {
        pushFollow(FOLLOW_sequence_selectors_in_synpred101_OmttParser3175);
        sequence_selectors();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_OmttParser

    // $ANTLR start synpred102_OmttParser
    public final void synpred102_OmttParser_fragment() throws RecognitionException {   
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:446:18: ( sequence_selector )
        // /home/endrju/.workspace/pl.omtt.compiler/src/pl/omtt/lang/grammar/OmttParser.g:446:18: sequence_selector
        {
        pushFollow(FOLLOW_sequence_selector_in_synpred102_OmttParser3190);
        sequence_selector();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred102_OmttParser

    // Delegated rules

    public final boolean synpred99_OmttParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_OmttParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_OmttParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_OmttParser_fragment(); // can never throw exception
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
    public final boolean synpred100_OmttParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_OmttParser_fragment(); // can never throw exception
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


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA77 dfa77 = new DFA77(this);
    static final String DFA21_eotS =
        "\27\uffff";
    static final String DFA21_eofS =
        "\27\uffff";
    static final String DFA21_minS =
        "\1\35\5\uffff\2\0\2\uffff\3\0\12\uffff";
    static final String DFA21_maxS =
        "\1\154\5\uffff\2\0\2\uffff\3\0\12\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\7\uffff\1\6\11\uffff";
    static final String DFA21_specialS =
        "\6\uffff\1\0\1\1\2\uffff\1\2\1\3\1\4\12\uffff}>";
    static final String[] DFA21_transitionS = {
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
            return "122:1: expression : ( def_in_expression | if_expression | map_expression | match_expression | lambda_expression | context_expression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_6 = input.LA(1);

                         
                        int index21_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_OmttParser()) ) {s = 5;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_7 = input.LA(1);

                         
                        int index21_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_OmttParser()) ) {s = 5;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_10 = input.LA(1);

                         
                        int index21_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_OmttParser()) ) {s = 5;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_11 = input.LA(1);

                         
                        int index21_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_OmttParser()) ) {s = 5;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_11);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_12 = input.LA(1);

                         
                        int index21_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_OmttParser()) ) {s = 5;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA74_eotS =
        "\61\uffff";
    static final String DFA74_eofS =
        "\1\4\60\uffff";
    static final String DFA74_minS =
        "\1\35\2\0\56\uffff";
    static final String DFA74_maxS =
        "\1\152\2\0\56\uffff";
    static final String DFA74_acceptS =
        "\3\uffff\1\1\1\2\54\uffff";
    static final String DFA74_specialS =
        "\1\uffff\1\0\1\1\56\uffff}>";
    static final String[] DFA74_transitionS = {
            "\7\4\2\uffff\2\4\14\uffff\2\4\2\uffff\1\4\1\3\1\uffff\5\4\2"+
            "\uffff\3\4\5\uffff\2\4\1\1\1\uffff\5\4\1\2\13\4\1\uffff\2\4"+
            "\1\uffff\1\4\1\uffff\2\4\3\uffff\1\4",
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
            ""
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "430:3: ( sequence_selectors -> ^( ATOM_SELECT atom sequence_selectors ) | -> atom )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_OmttParser()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_2 = input.LA(1);

                         
                        int index74_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_OmttParser()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index74_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA75_eotS =
        "\61\uffff";
    static final String DFA75_eofS =
        "\1\4\60\uffff";
    static final String DFA75_minS =
        "\1\35\2\0\56\uffff";
    static final String DFA75_maxS =
        "\1\152\2\0\56\uffff";
    static final String DFA75_acceptS =
        "\3\uffff\1\1\1\2\54\uffff";
    static final String DFA75_specialS =
        "\1\uffff\1\0\1\1\56\uffff}>";
    static final String[] DFA75_transitionS = {
            "\7\4\2\uffff\2\4\14\uffff\2\4\2\uffff\1\4\1\3\1\uffff\5\4\2"+
            "\uffff\3\4\5\uffff\2\4\1\1\1\uffff\5\4\1\2\13\4\1\uffff\2\4"+
            "\1\uffff\1\4\1\uffff\2\4\3\uffff\1\4",
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
            ""
    };

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "437:3: ( sequence_selectors -> ^( ATOM_SELECT object sequence_selectors ) | -> object )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_1 = input.LA(1);

                         
                        int index75_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_OmttParser()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index75_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA75_2 = input.LA(1);

                         
                        int index75_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_OmttParser()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index75_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 75, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA76_eotS =
        "\61\uffff";
    static final String DFA76_eofS =
        "\1\4\60\uffff";
    static final String DFA76_minS =
        "\1\35\2\0\56\uffff";
    static final String DFA76_maxS =
        "\1\152\2\0\56\uffff";
    static final String DFA76_acceptS =
        "\3\uffff\1\1\1\2\54\uffff";
    static final String DFA76_specialS =
        "\1\uffff\1\0\1\1\56\uffff}>";
    static final String[] DFA76_transitionS = {
            "\7\4\2\uffff\2\4\14\uffff\2\4\2\uffff\1\4\1\3\1\uffff\5\4\2"+
            "\uffff\3\4\5\uffff\2\4\1\1\1\uffff\5\4\1\2\13\4\1\uffff\2\4"+
            "\1\uffff\1\4\1\uffff\2\4\3\uffff\1\4",
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
            return "443:11: ( sequence_selectors )?";
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
        "\1\2\61\uffff";
    static final String DFA77_minS =
        "\1\35\1\0\60\uffff";
    static final String DFA77_maxS =
        "\1\152\1\0\60\uffff";
    static final String DFA77_acceptS =
        "\2\uffff\1\2\56\uffff\1\1";
    static final String DFA77_specialS =
        "\1\uffff\1\0\60\uffff}>";
    static final String[] DFA77_transitionS = {
            "\7\2\2\uffff\2\2\14\uffff\2\2\2\uffff\2\2\1\uffff\5\2\2\uffff"+
            "\3\2\5\uffff\3\2\1\uffff\5\2\1\1\13\2\1\uffff\2\2\1\uffff\1"+
            "\2\1\uffff\2\2\3\uffff\1\2",
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
            return "446:18: ( sequence_selector )?";
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
                        if ( (synpred102_OmttParser()) ) {s = 49;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index77_1);
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
    public static final BitSet FOLLOW_single_type_in_definition_context498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_definition_context500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_definition_argument524 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_argument529 = new BitSet(new long[]{0x0000000000000002L,0x0000000000801000L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_definition_argument531 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_definition_argument535 = new BitSet(new long[]{0x0000000000000000L,0x00001040000A0000L});
    public static final BitSet FOLLOW_type_in_definition_argument537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content583 = new BitSet(new long[]{0x0000002220000002L});
    public static final BitSet FOLLOW_data_body_atom_in_tag_content589 = new BitSet(new long[]{0x0000002220000002L});
    public static final BitSet FOLLOW_OP_DATA_IS_EXPRESSION_in_tag_content612 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content614 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_tag_content620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_data_body_atom641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_inside_data_in_data_body_atom651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_inside_data_in_data_body_atom657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_START_in_expression_inside_data672 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_expression_inside_data675 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EXPRESSION_END_in_expression_inside_data677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_tag_in_tag_inside_data693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_tag_in_tag_inside_data699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_tag_in_tag_inside_data705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_tag_in_tag_inside_data711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_apply_tag_in_tag_inside_data717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_expression_in_expression733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expression_in_expression739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_expression_in_expression745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expression_in_expression751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expression_in_expression757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_context_expression_in_expression763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safe_def_in_expression_in_safe_expression776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safe_if_expression_in_safe_expression782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safe_map_expression_in_safe_expression788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strict_expression_in_safe_expression794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_def_in_expression808 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression812 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_AND_in_def_in_expression819 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression823 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_expression831 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B049EL});
    public static final BitSet FOLLOW_COLON_in_def_in_expression833 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_def_in_expression838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_safe_def_in_expression870 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_safe_def_in_expression874 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_AND_in_safe_def_in_expression881 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_safe_def_in_expression885 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_IN_in_safe_def_in_expression893 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B049EL});
    public static final BitSet FOLLOW_COLON_in_safe_def_in_expression895 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B049EL});
    public static final BitSet FOLLOW_safe_expression_in_safe_def_in_expression900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_expression932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_definition_inside_expression934 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_expression963 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_expression965 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag1003 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_DEF_in_def_in_tag1005 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag1009 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag1016 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_AND_in_def_in_tag1018 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag1022 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag1030 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_tag1032 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_tag_content_in_def_in_tag1036 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_def_in_tag1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_tag1074 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_tag_content_in_definition_inside_tag1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_tag1102 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_tag1104 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_definition_inside_tag1106 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_CONTENT_in_definition_inside_tag1109 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_definition_inside_tag1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAMBDA_in_lambda_expression1150 = new BitSet(new long[]{0x0000000000000000L,0x0000040000010400L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression1152 = new BitSet(new long[]{0x0000000000000000L,0x0000040000010400L});
    public static final BitSet FOLLOW_COLON_in_lambda_expression1155 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_lambda_expression1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression1185 = new BitSet(new long[]{0x0000000000000000L,0x0000040000010080L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_lambda_expression1188 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_lambda_expression1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_match_expression_in_lambda_expression1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_lambda_match_in_lambda_match_expression1230 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMICOLON_in_lambda_match_expression1233 = new BitSet(new long[]{0x0000000000000000L,0x00001440000B0082L});
    public static final BitSet FOLLOW_single_lambda_match_in_lambda_match_expression1235 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_single_type_in_single_lambda_match1263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_single_lambda_match1265 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B049EL});
    public static final BitSet FOLLOW_safe_expression_in_single_lambda_match1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_content_in_type1294 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_type1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_content_in_single_type1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_ID_in_type_content1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GENERAL_in_type_content1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_type_content1366 = new BitSet(new long[]{0x0000000000000000L,0x00001440000B0000L});
    public static final BitSet FOLLOW_argument_type_in_type_content1368 = new BitSet(new long[]{0x0000000000000000L,0x00001440000B0080L});
    public static final BitSet FOLLOW_OP_FOLLOW_in_type_content1371 = new BitSet(new long[]{0x0000000000000000L,0x00001040000A0000L});
    public static final BitSet FOLLOW_type_in_type_content1373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_type_content1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_type_content1395 = new BitSet(new long[]{0x0000000000000000L,0x00001040000A0000L});
    public static final BitSet FOLLOW_type_in_type_content1399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_type_content1402 = new BitSet(new long[]{0x0000000000000000L,0x00001040000A0000L});
    public static final BitSet FOLLOW_type_in_type_content1406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_type_content1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_type_content1433 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_record_item_type_in_type_content1437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_COMMA_in_type_content1440 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_record_item_type_in_type_content1444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_type_content1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_argument_type1477 = new BitSet(new long[]{0x0000000000000000L,0x00001440000A0000L});
    public static final BitSet FOLLOW_VAR_ID_in_argument_type1481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_argument_type1483 = new BitSet(new long[]{0x0000000000000000L,0x00001040000A0000L});
    public static final BitSet FOLLOW_type_in_argument_type1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_record_item_type1515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_record_item_type1517 = new BitSet(new long[]{0x0000000000000000L,0x00001040000A0000L});
    public static final BitSet FOLLOW_type_in_record_item_type1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_expression1535 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_context_expression_in_if_expression1539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_if_expression1541 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_if_expression1549 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_expression1555 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B049EL});
    public static final BitSet FOLLOW_COLON_in_if_expression1557 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_if_expression1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_safe_if_expression1600 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_context_expression_in_safe_if_expression1604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_safe_if_expression1606 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B049EL});
    public static final BitSet FOLLOW_safe_expression_in_safe_if_expression1614 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ELSE_in_safe_if_expression1620 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B049EL});
    public static final BitSet FOLLOW_COLON_in_safe_if_expression1622 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B049EL});
    public static final BitSet FOLLOW_safe_expression_in_safe_if_expression1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_if_tag1665 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_if_subtag_in_if_tag1671 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_if_tag1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_subtag1693 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_context_expression_in_if_subtag1697 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_tag_content_in_if_subtag1705 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_TAG_START_in_if_subtag1715 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_subtag1717 = new BitSet(new long[]{0x0040008100000000L});
    public static final BitSet FOLLOW_tag_content_in_if_subtag1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_subtag_in_if_subtag1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_map_expression1774 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_item_alias_in_map_expression1776 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_context_expression_in_map_expression1781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_map_expression1783 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_map_expression1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_safe_map_expression1825 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_item_alias_in_safe_map_expression1827 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_context_expression_in_safe_map_expression1832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_safe_map_expression1834 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B049EL});
    public static final BitSet FOLLOW_safe_expression_in_safe_map_expression1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_map_tag1876 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_MAP_in_map_tag1878 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_item_alias_in_map_tag1880 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_context_expression_in_map_tag1885 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_tag_content_in_map_tag1893 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_map_tag1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_item_alias1935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OP_REVERSE_FOLLOW_in_item_alias1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_match_expression1959 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_context_expression_in_match_expression1963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_match_expression1965 = new BitSet(new long[]{0x0000000000000000L,0x00001440000B0082L});
    public static final BitSet FOLLOW_lambda_match_expression_in_match_expression1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strict_expression_in_context_expression2018 = new BitSet(new long[]{0xF800000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_op_apply_in_context_expression2030 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_atom_expression_in_context_expression2032 = new BitSet(new long[]{0xF8000008E0000000L,0x0000044C004B001CL});
    public static final BitSet FOLLOW_function_arguments_in_context_expression2036 = new BitSet(new long[]{0xF800000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_op_map_in_context_expression2074 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B049EL});
    public static final BitSet FOLLOW_safe_expression_in_context_expression2078 = new BitSet(new long[]{0xF800000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_WHERE_in_context_expression2101 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B049EL});
    public static final BitSet FOLLOW_safe_expression_in_context_expression2103 = new BitSet(new long[]{0xF800000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_ORDER_in_context_expression2132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_BY_in_context_expression2134 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B049EL});
    public static final BitSet FOLLOW_safe_expression_in_context_expression2136 = new BitSet(new long[]{0xF800000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_MATCH_in_context_expression2165 = new BitSet(new long[]{0x0000000000000000L,0x00001440000B0082L});
    public static final BitSet FOLLOW_lambda_match_expression_in_context_expression2167 = new BitSet(new long[]{0xF800000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_OP_CONTEXT_in_op_apply2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_op_apply2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_op_map2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_apply_expression2248 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_atom_expression_in_apply_expression2250 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_function_arguments_in_apply_expression2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_apply_tag2297 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_apply_expression_in_apply_tag2300 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_apply_tag2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concatence_expression_in_strict_expression2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_apply_expression_in_strict_expression2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_concatence_expression2336 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_OP_CONCAT_in_concatence_expression2350 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_boolean_expression_in_concatence_expression2354 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_boolean_binary_expression_in_boolean_expression2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression2397 = new BitSet(new long[]{0x0000000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_boolean_binary_operator_in_boolean_binary_expression2400 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression2403 = new BitSet(new long[]{0x0000000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_boolean_unary_operator_in_boolean_unary_expression2419 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_AND_in_boolean_binary_operator2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_OR_in_boolean_binary_operator2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_in_boolean_unary_operator2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression2488 = new BitSet(new long[]{0x0000000000000002L,0x000000007E000000L});
    public static final BitSet FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression2491 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression2494 = new BitSet(new long[]{0x0000000000000002L,0x000000007E000000L});
    public static final BitSet FOLLOW_OP_EQUAL_in_boolean_comparsion_operator2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LE_in_boolean_comparsion_operator2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LEQ_in_boolean_comparsion_operator2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GE_in_boolean_comparsion_operator2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GEQ_in_boolean_comparsion_operator2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2580 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_OP_PLUS_in_additive_expression2596 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_OP_MINUS_in_additive_expression2610 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2630 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression2650 = new BitSet(new long[]{0x0000000000000002L,0x0000000001808000L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_multiplicative_expression2660 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_SLASH_in_multiplicative_expression2674 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_OP_MODULO_in_multiplicative_expression2688 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression2708 = new BitSet(new long[]{0x0000000000000002L,0x0000000001808000L});
    public static final BitSet FOLLOW_OP_MINUS_in_negative_expression2727 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_functional_expression_in_negative_expression2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functional_expression_in_negative_expression2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_expression_in_functional_expression2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expression_in_call_expression2774 = new BitSet(new long[]{0x00000008E0000002L,0x00000444004B001CL});
    public static final BitSet FOLLOW_function_argument_in_call_expression2782 = new BitSet(new long[]{0x00000008E0000002L,0x00000444004B001CL});
    public static final BitSet FOLLOW_TAG_START_in_call_tag2842 = new BitSet(new long[]{0x0000000000000000L,0x0000044000000000L});
    public static final BitSet FOLLOW_namespace_id_in_call_tag2846 = new BitSet(new long[]{0x0000008DE0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_tag_content_in_call_tag2856 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_function_argument_in_call_tag2862 = new BitSet(new long[]{0x0000008DE0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_tag_content_in_call_tag2868 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TAG_END_in_call_tag2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_argument_in_function_arguments2937 = new BitSet(new long[]{0x00000008E0000002L,0x00000444004B001CL});
    public static final BitSet FOLLOW_VAR_ID_in_function_argument2953 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_function_argument2955 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_atom_expression_in_function_argument2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_with_selectors_in_atom_expression2995 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_atom_expression3008 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_expression_select_in_atom_expression3012 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_atom_expression3039 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_property_select_in_atom_expression3043 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_atom_in_atom_with_selectors3081 = new BitSet(new long[]{0x0200000000000002L,0x0000000000081000L});
    public static final BitSet FOLLOW_sequence_selectors_in_atom_with_selectors3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_expression_select3127 = new BitSet(new long[]{0x0200000000000002L,0x0000000000081000L});
    public static final BitSet FOLLOW_sequence_selectors_in_expression_select3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_property_select3173 = new BitSet(new long[]{0x0200000000000002L,0x0000000000081000L});
    public static final BitSet FOLLOW_sequence_selectors_in_property_select3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_selector_in_sequence_selectors3188 = new BitSet(new long[]{0x0200000000000002L,0x0000000000081000L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors3190 = new BitSet(new long[]{0x0200000000000002L,0x0000000000081000L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors3199 = new BitSet(new long[]{0x0200000000000002L,0x0000000000081000L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_type_selector3220 = new BitSet(new long[]{0x0000000000000000L,0x00001040000A0000L});
    public static final BitSet FOLLOW_single_type_in_type_selector3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector3247 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_sequence_selector3249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_alias3275 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_alias3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_START_in_data_expression3299 = new BitSet(new long[]{0x0000003220000000L});
    public static final BitSet FOLLOW_data_body_atom_in_data_expression3301 = new BitSet(new long[]{0x0000003220000000L});
    public static final BitSet FOLLOW_DATA_END_in_data_expression3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectable_atom_in_atom3332 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOUBLE_DOT_in_atom3337 = new BitSet(new long[]{0x00000008E0000000L,0x00000444004B001CL});
    public static final BitSet FOLLOW_selectable_atom_in_atom3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_id_in_selectable_atom3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_selectable_atom3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_atom_in_object3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_expression_in_object3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tuple_in_object3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_record_in_object3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_object3399 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_sequence_expression_in_object3402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_object3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id3422 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_OP_VIEW_in_namespace_id3424 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id3457 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_OP_VIEW_in_namespace_id3459 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_OP_GENERAL_in_namespace_id3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_tuple3495 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_tuple3499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_COMMA_in_tuple3502 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_tuple3506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_tuple3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_record3536 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_record_item_in_record3540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_COMMA_in_record3543 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_record_item_in_record3547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_record3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_record_item3578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_record_item3580 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_record_item3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_sequence_expression3597 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_sequence_expression3610 = new BitSet(new long[]{0x38480008E0000000L,0x00001444004B009EL});
    public static final BitSet FOLLOW_expression_in_sequence_expression3614 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_number_atom_in_object_atom3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_object_atom3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_object_atom3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_object_atom3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_object_atom3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_object_atom3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_NUMBER_in_number_atom3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_NUMBER_in_number_atom3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expression_in_synpred30_OmttParser757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selectors_in_synpred99_OmttParser3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selectors_in_synpred100_OmttParser3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selectors_in_synpred101_OmttParser3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selector_in_synpred102_OmttParser3190 = new BitSet(new long[]{0x0000000000000002L});

}