// $ANTLR 3.1.2 /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g 2009-07-14 06:02:08

package pl.omtt.lang.grammar;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

import pl.omtt.lang.model.nodes.*;

@SuppressWarnings("all")
public class OmttParser extends AbstractOmttParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "HEADER", "USE", "USES", "IMPORT", "IMPORTS", "CLASS", "IDENT", "ATOM_SELECT", "PROPERTY_SELECT", "TYPE_SELECT", "SEQUENCE_SELECT", "ITERATE", "ARGUMENTS", "ARGUMENT", "RETURNS", "BLOCK", "IF_ELSE", "CALL", "CAST", "SEQUENCE", "STRING_LITERAL", "INT_NUMBER", "REAL_NUMBER", "CONTENT", "TAG_START", "TAG_END", "DATA_START", "DATA_END", "EXPRESSION_START", "EXPRESSION_END", "OP_DATA_IS_EXPRESSION", "IT", "ITEM", "COMMENT_SINGLE_LINE", "COMMENT_MULTI_LINE", "WS", "NEWLINE", "ACTION_ON_NEWLINE", "OP_DATA_IS_RAW", "STRING_PARENS", "MODE_LEFT_PAREN", "MODE_RIGHT_PAREN", "MODULE", "DEF", "AND", "IN", "IF", "THEN", "ELSE", "MATCH", "CASE", "DEFAULT", "AS", "IS", "MAP", "TO", "NULL", "LAMBDA", "TRUE", "FALSE", "INNER_TAG_KEYWORD", "SINGLE_TAG_KEYWORD", "OP_FUNCTION_DEFINITION", "COLON", "SEMICOLON", "DOT", "COMA", "SLASH", "TILDE", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_SQUARE_PAREN", "RIGHT_SQUARE_PAREN", "OP_PLUS", "OP_MINUS", "OP_MULTIPLY", "OP_MODULO", "OP_EQUAL", "OP_NOT_EQUAL", "OP_LEQ", "OP_LE", "OP_GEQ", "OP_GE", "OP_ASSIGN", "OP_AND", "OP_OR", "OP_XOR", "OP_NOT", "OP_CONTEXT", "OP_EXPRESSION_CONTEXT", "OP_VIEW", "OP_CONCAT", "SMALL_LETTER", "NAMECHAR", "VAR_ID", "BIG_LETTER", "CLASS_ID", "DIGIT", "INT_OR_REAL_NUMBER", "LETTER", "NOT_NAME"
    };
    public static final int CAST=23;
    public static final int OP_LE=85;
    public static final int INT_NUMBER=26;
    public static final int OP_AND=89;
    public static final int INT_OR_REAL_NUMBER=103;
    public static final int LETTER=104;
    public static final int OP_GEQ=86;
    public static final int CASE=55;
    public static final int OP_GE=87;
    public static final int EOF=-1;
    public static final int IMPORT=8;
    public static final int STRING_LITERAL=25;
    public static final int MODE_LEFT_PAREN=45;
    public static final int OP_MINUS=79;
    public static final int OP_NOT_EQUAL=83;
    public static final int SEQUENCE_SELECT=15;
    public static final int OP_EXPRESSION_CONTEXT=94;
    public static final int VAR_ID=99;
    public static final int ARGUMENTS=17;
    public static final int NULL=61;
    public static final int ELSE=53;
    public static final int MATCH=54;
    public static final int SEMICOLON=69;
    public static final int SINGLE_TAG_KEYWORD=66;
    public static final int MODE_RIGHT_PAREN=46;
    public static final int CONTENT=28;
    public static final int OP_FUNCTION_DEFINITION=67;
    public static final int DATA_START=31;
    public static final int EXPRESSION_START=33;
    public static final int NAMECHAR=98;
    public static final int SEQUENCE=24;
    public static final int INNER_TAG_KEYWORD=65;
    public static final int WS=40;
    public static final int USES=7;
    public static final int REAL_NUMBER=27;
    public static final int LEFT_PAREN=74;
    public static final int OP_EQUAL=82;
    public static final int IMPORTS=9;
    public static final int CALL=22;
    public static final int USE=6;
    public static final int OP_DATA_IS_EXPRESSION=35;
    public static final int FALSE=64;
    public static final int STRING_PARENS=44;
    public static final int COMMENT_SINGLE_LINE=38;
    public static final int CLASS_ID=101;
    public static final int OP_CONCAT=96;
    public static final int SMALL_LETTER=97;
    public static final int CLASS=10;
    public static final int DEF=48;
    public static final int OP_ASSIGN=88;
    public static final int EXPRESSION_END=34;
    public static final int OP_OR=90;
    public static final int TYPE_SELECT=14;
    public static final int AND=49;
    public static final int DATA_END=32;
    public static final int IF_ELSE=21;
    public static final int IF=51;
    public static final int COMMENT_MULTI_LINE=39;
    public static final int AS=57;
    public static final int RIGHT_PAREN=75;
    public static final int BIG_LETTER=100;
    public static final int SLASH=72;
    public static final int IN=50;
    public static final int THEN=52;
    public static final int LEFT_SQUARE_PAREN=76;
    public static final int IS=58;
    public static final int IT=36;
    public static final int TAG_START=29;
    public static final int ARGUMENT=18;
    public static final int RIGHT_SQUARE_PAREN=77;
    public static final int TILDE=73;
    public static final int IDENT=11;
    public static final int OP_NOT=92;
    public static final int DIGIT=102;
    public static final int LAMBDA=62;
    public static final int HEADER=5;
    public static final int DOT=70;
    public static final int NOT_NAME=105;
    public static final int OP_MULTIPLY=80;
    public static final int RETURNS=19;
    public static final int ITEM=37;
    public static final int OP_PLUS=78;
    public static final int TO=60;
    public static final int DEFAULT=56;
    public static final int ATOM_SELECT=12;
    public static final int MODULE=47;
    public static final int COMA=71;
    public static final int OP_VIEW=95;
    public static final int TRUE=63;
    public static final int OP_MODULO=81;
    public static final int COLON=68;
    public static final int OP_DATA_IS_RAW=43;
    public static final int ITERATE=16;
    public static final int TAG_END=30;
    public static final int NEWLINE=41;
    public static final int BLOCK=20;
    public static final int MAP=59;
    public static final int PROPERTY_SELECT=13;
    public static final int OP_XOR=91;
    public static final int OP_CONTEXT=93;
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
    public String getGrammarFileName() { return "/home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:16:1: program : header ( definitions )? EOF -> ^( PROGRAM ( header )? ( definitions )? ) ;
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
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:17:3: ( header ( definitions )? EOF -> ^( PROGRAM ( header )? ( definitions )? ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:17:5: header ( definitions )? EOF
            {
            pushFollow(FOLLOW_header_in_program53);
            header1=header();

            state._fsp--;

            stream_header.add(header1.getTree());
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:17:12: ( definitions )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==TAG_START) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:17:12: definitions
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
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:18:8: ^( PROGRAM ( header )? ( definitions )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Program(PROGRAM), root_1);

                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:18:27: ( header )?
                if ( stream_header.hasNext() ) {
                    adaptor.addChild(root_1, stream_header.nextTree());

                }
                stream_header.reset();
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:18:35: ( definitions )?
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:24:1: header : ( module_declaration )? use_declarations import_declarations ;
    public final OmttParser.header_return header() throws RecognitionException {
        OmttParser.header_return retval = new OmttParser.header_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.module_declaration_return module_declaration4 = null;

        OmttParser.use_declarations_return use_declarations5 = null;

        OmttParser.import_declarations_return import_declarations6 = null;



        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:25:3: ( ( module_declaration )? use_declarations import_declarations )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:25:5: ( module_declaration )? use_declarations import_declarations
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:25:5: ( module_declaration )?
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:25:5: module_declaration
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:30:1: module_declaration : TAG_START MODULE module_id TAG_END -> ^( MODULE[$MODULE] module_id ) ;
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
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:31:3: ( TAG_START MODULE module_id TAG_END -> ^( MODULE[$MODULE] module_id ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:31:5: TAG_START MODULE module_id TAG_END
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
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:32:8: ^( MODULE[$MODULE] module_id )
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:34:1: use_declarations : ( ( TAG_START ( use_declaration ) TAG_END )+ )? -> ( ^( USES ( use_declaration )+ ) )? ;
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
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:35:3: ( ( ( TAG_START ( use_declaration ) TAG_END )+ )? -> ( ^( USES ( use_declaration )+ ) )? )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:35:5: ( ( TAG_START ( use_declaration ) TAG_END )+ )?
            {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:35:5: ( ( TAG_START ( use_declaration ) TAG_END )+ )?
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:35:6: ( TAG_START ( use_declaration ) TAG_END )+
                    {
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:35:6: ( TAG_START ( use_declaration ) TAG_END )+
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
                    	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:35:7: TAG_START ( use_declaration ) TAG_END
                    	    {
                    	    TAG_START11=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_use_declarations155);  
                    	    stream_TAG_START.add(TAG_START11);

                    	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:35:17: ( use_declaration )
                    	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:35:18: use_declaration
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
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:36:8: ( ^( USES ( use_declaration )+ ) )?
                if ( stream_use_declaration.hasNext() ) {
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:36:8: ^( USES ( use_declaration )+ )
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:38:1: import_declarations : ( ( TAG_START ( import_declaration ) TAG_END )+ )? -> ( ^( IMPORTS ( import_declaration )+ ) )? ;
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
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:39:3: ( ( ( TAG_START ( import_declaration ) TAG_END )+ )? -> ( ^( IMPORTS ( import_declaration )+ ) )? )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:39:5: ( ( TAG_START ( import_declaration ) TAG_END )+ )?
            {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:39:5: ( ( TAG_START ( import_declaration ) TAG_END )+ )?
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:39:6: ( TAG_START ( import_declaration ) TAG_END )+
                    {
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:39:6: ( TAG_START ( import_declaration ) TAG_END )+
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
                    	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:39:7: TAG_START ( import_declaration ) TAG_END
                    	    {
                    	    TAG_START14=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_import_declarations193);  
                    	    stream_TAG_START.add(TAG_START14);

                    	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:39:17: ( import_declaration )
                    	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:39:18: import_declaration
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
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:40:8: ( ^( IMPORTS ( import_declaration )+ ) )?
                if ( stream_import_declaration.hasNext() ) {
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:40:8: ^( IMPORTS ( import_declaration )+ )
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:43:1: import_declaration : IMPORT ec= external_class_name -> ^( IMPORT[$IMPORT] $ec) ;
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
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:44:3: ( IMPORT ec= external_class_name -> ^( IMPORT[$IMPORT] $ec) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:44:5: IMPORT ec= external_class_name
            {
            IMPORT17=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_declaration231);  
            stream_IMPORT.add(IMPORT17);

            pushFollow(FOLLOW_external_class_name_in_import_declaration235);
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
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:45:8: ^( IMPORT[$IMPORT] $ec)
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:47:1: use_declaration : USE module_id AS VAR_ID -> ^( USE[$USE, $VAR_ID] module_id ) ;
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
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:48:3: ( USE module_id AS VAR_ID -> ^( USE[$USE, $VAR_ID] module_id ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:48:5: USE module_id AS VAR_ID
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
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:49:8: ^( USE[$USE, $VAR_ID] module_id )
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:52:10: fragment external_class_name : ( VAR_ID DOT )* ( CLASS_ID | OP_MULTIPLY ) ;
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
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:53:3: ( ( VAR_ID DOT )* ( CLASS_ID | OP_MULTIPLY ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:53:5: ( VAR_ID DOT )* ( CLASS_ID | OP_MULTIPLY )
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:53:5: ( VAR_ID DOT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==VAR_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:53:6: VAR_ID DOT
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
            if ( input.LA(1)==OP_MULTIPLY||input.LA(1)==CLASS_ID ) {
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:55:10: fragment module_id : ( VAR_ID DOT )* VAR_ID ;
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
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:56:3: ( ( VAR_ID DOT )* VAR_ID )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:56:5: ( VAR_ID DOT )* VAR_ID
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:56:5: ( VAR_ID DOT )*
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
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:56:6: VAR_ID DOT
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:62:1: definitions : ( tag_definition )+ -> ( tag_definition )+ ;
    public final OmttParser.definitions_return definitions() throws RecognitionException {
        OmttParser.definitions_return retval = new OmttParser.definitions_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.tag_definition_return tag_definition28 = null;


        RewriteRuleSubtreeStream stream_tag_definition=new RewriteRuleSubtreeStream(adaptor,"rule tag_definition");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:63:3: ( ( tag_definition )+ -> ( tag_definition )+ )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:63:5: ( tag_definition )+
            {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:63:5: ( tag_definition )+
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
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:63:5: tag_definition
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:67:1: tag_definition : TAG_START DEF definition_signature content= tag_content TAG_END -> ^( DEF definition_signature $content) ;
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
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:67:16: ( TAG_START DEF definition_signature content= tag_content TAG_END -> ^( DEF definition_signature $content) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:68:3: TAG_START DEF definition_signature content= tag_content TAG_END
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
            // elements: DEF, definition_signature, content
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
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:71:6: ^( DEF definition_signature $content)
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:74:10: fragment definition_signature : ( VAR_ID | DEFAULT ) ( OP_LE it= single_type OP_GE )? ( definition_argument )* ( OP_FUNCTION_DEFINITION ret_type= type )? -> ( VAR_ID )? ( DEFAULT )? ( $it)? ^( ARGUMENTS ( definition_argument )* ) ^( RETURNS ( $ret_type)? ) ;
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
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:75:3: ( ( VAR_ID | DEFAULT ) ( OP_LE it= single_type OP_GE )? ( definition_argument )* ( OP_FUNCTION_DEFINITION ret_type= type )? -> ( VAR_ID )? ( DEFAULT )? ( $it)? ^( ARGUMENTS ( definition_argument )* ) ^( RETURNS ( $ret_type)? ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:75:5: ( VAR_ID | DEFAULT ) ( OP_LE it= single_type OP_GE )? ( definition_argument )* ( OP_FUNCTION_DEFINITION ret_type= type )?
            {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:75:5: ( VAR_ID | DEFAULT )
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:75:6: VAR_ID
                    {
                    VAR_ID33=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_signature422);  
                    stream_VAR_ID.add(VAR_ID33);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:75:13: DEFAULT
                    {
                    DEFAULT34=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_definition_signature424);  
                    stream_DEFAULT.add(DEFAULT34);


                    }
                    break;

            }

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:75:22: ( OP_LE it= single_type OP_GE )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==OP_LE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:75:23: OP_LE it= single_type OP_GE
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

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:75:52: ( definition_argument )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==TILDE||LA12_0==VAR_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:75:52: definition_argument
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

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:75:73: ( OP_FUNCTION_DEFINITION ret_type= type )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==OP_FUNCTION_DEFINITION) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:75:74: OP_FUNCTION_DEFINITION ret_type= type
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
            // elements: VAR_ID, ret_type, definition_argument, it, DEFAULT
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
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:76:8: ( VAR_ID )?
                if ( stream_VAR_ID.hasNext() ) {
                    adaptor.addChild(root_0, new Ident(stream_VAR_ID.nextToken()));

                }
                stream_VAR_ID.reset();
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:76:23: ( DEFAULT )?
                if ( stream_DEFAULT.hasNext() ) {
                    adaptor.addChild(root_0, new Ident(stream_DEFAULT.nextToken()));

                }
                stream_DEFAULT.reset();
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:76:39: ( $it)?
                if ( stream_it.hasNext() ) {
                    adaptor.addChild(root_0, stream_it.nextTree());

                }
                stream_it.reset();
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:76:44: ^( ARGUMENTS ( definition_argument )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:76:56: ( definition_argument )*
                while ( stream_definition_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_definition_argument.nextTree());

                }
                stream_definition_argument.reset();

                adaptor.addChild(root_0, root_1);
                }
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:76:78: ^( RETURNS ( $ret_type)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURNS, "RETURNS"), root_1);

                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:76:88: ( $ret_type)?
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:79:10: fragment definition_argument : ( TILDE )? id= VAR_ID ( OP_ASSIGN type | OP_MULTIPLY )? -> ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? ) ;
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
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:80:3: ( ( TILDE )? id= VAR_ID ( OP_ASSIGN type | OP_MULTIPLY )? -> ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:80:5: ( TILDE )? id= VAR_ID ( OP_ASSIGN type | OP_MULTIPLY )?
            {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:80:5: ( TILDE )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==TILDE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:80:5: TILDE
                    {
                    TILDE39=(Token)match(input,TILDE,FOLLOW_TILDE_in_definition_argument500);  
                    stream_TILDE.add(TILDE39);


                    }
                    break;

            }

            id=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_argument505);  
            stream_VAR_ID.add(id);

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:80:22: ( OP_ASSIGN type | OP_MULTIPLY )?
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:80:23: OP_ASSIGN type
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:80:40: OP_MULTIPLY
                    {
                    OP_MULTIPLY42=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_definition_argument514);  
                    stream_OP_MULTIPLY.add(OP_MULTIPLY42);


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
            // 81:5: -> ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? )
            {
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:81:8: ^( ARGUMENT IDENT[$id] ( type )? ( TILDE )? ( OP_MULTIPLY )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TemplateArgument(ARGUMENT), root_1);

                adaptor.addChild(root_1, new Ident(IDENT, id));
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:81:55: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:81:61: ( TILDE )?
                if ( stream_TILDE.hasNext() ) {
                    adaptor.addChild(root_1, stream_TILDE.nextNode());

                }
                stream_TILDE.reset();
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:81:68: ( OP_MULTIPLY )?
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:87:1: tag_content : ( CONTENT ( data_body_atom )* -> ^( CONTENT ( data_body_atom )* ) | OP_DATA_IS_EXPRESSION CONTENT expression -> expression );
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
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:88:3: ( CONTENT ( data_body_atom )* -> ^( CONTENT ( data_body_atom )* ) | OP_DATA_IS_EXPRESSION CONTENT expression -> expression )
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:88:5: CONTENT ( data_body_atom )*
                    {
                    CONTENT43=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_tag_content560);  
                    stream_CONTENT.add(CONTENT43);

                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:89:5: ( data_body_atom )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==TAG_START) ) {
                            int LA16_2 = input.LA(2);

                            if ( (LA16_2==DEF||LA16_2==IF||LA16_2==MAP||LA16_2==VAR_ID) ) {
                                alt16=1;
                            }


                        }
                        else if ( (LA16_0==STRING_LITERAL||LA16_0==EXPRESSION_START) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:89:5: data_body_atom
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
                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:90:8: ^( CONTENT ( data_body_atom )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Data(stream_CONTENT.nextToken()), root_1);

                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:90:24: ( data_body_atom )*
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:91:5: OP_DATA_IS_EXPRESSION CONTENT expression
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:96:1: data_body_atom : ( STRING_LITERAL | expression_inside_data | tag_inside_data );
    public final OmttParser.data_body_atom_return data_body_atom() throws RecognitionException {
        OmttParser.data_body_atom_return retval = new OmttParser.data_body_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING_LITERAL48=null;
        OmttParser.expression_inside_data_return expression_inside_data49 = null;

        OmttParser.tag_inside_data_return tag_inside_data50 = null;


        Object STRING_LITERAL48_tree=null;

        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:97:3: ( STRING_LITERAL | expression_inside_data | tag_inside_data )
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:97:5: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL48=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_data_body_atom618); 
                    STRING_LITERAL48_tree = new Literal(STRING_LITERAL48) ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_LITERAL48_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:98:5: expression_inside_data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_inside_data_in_data_body_atom628);
                    expression_inside_data49=expression_inside_data();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_inside_data49.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:99:5: tag_inside_data
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:102:10: fragment expression_inside_data : EXPRESSION_START expression EXPRESSION_END ;
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
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:103:3: ( EXPRESSION_START expression EXPRESSION_END )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:103:5: EXPRESSION_START expression EXPRESSION_END
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:106:10: fragment tag_inside_data : ( def_in_tag | if_tag | call_tag | map_tag );
    public final OmttParser.tag_inside_data_return tag_inside_data() throws RecognitionException {
        OmttParser.tag_inside_data_return retval = new OmttParser.tag_inside_data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.def_in_tag_return def_in_tag54 = null;

        OmttParser.if_tag_return if_tag55 = null;

        OmttParser.call_tag_return call_tag56 = null;

        OmttParser.map_tag_return map_tag57 = null;



        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:107:3: ( def_in_tag | if_tag | call_tag | map_tag )
            int alt19=4;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==TAG_START) ) {
                switch ( input.LA(2) ) {
                case DEF:
                    {
                    alt19=1;
                    }
                    break;
                case IF:
                    {
                    alt19=2;
                    }
                    break;
                case MAP:
                    {
                    alt19=4;
                    }
                    break;
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:107:5: def_in_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_def_in_tag_in_tag_inside_data670);
                    def_in_tag54=def_in_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, def_in_tag54.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:108:5: if_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_tag_in_tag_inside_data676);
                    if_tag55=if_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, if_tag55.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:109:5: call_tag
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_tag_in_tag_inside_data682);
                    call_tag56=call_tag();

                    state._fsp--;

                    adaptor.addChild(root_0, call_tag56.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:110:5: map_tag
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:116:1: expression : ( lambda_expression | def_in_expression | concatence_expression );
    public final OmttParser.expression_return expression() throws RecognitionException {
        OmttParser.expression_return retval = new OmttParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.lambda_expression_return lambda_expression58 = null;

        OmttParser.def_in_expression_return def_in_expression59 = null;

        OmttParser.concatence_expression_return concatence_expression60 = null;



        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:117:3: ( lambda_expression | def_in_expression | concatence_expression )
            int alt20=3;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:117:5: lambda_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expression_in_expression704);
                    lambda_expression58=lambda_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, lambda_expression58.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:118:5: def_in_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_def_in_expression_in_expression710);
                    def_in_expression59=def_in_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, def_in_expression59.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:119:5: concatence_expression
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:124:1: def_in_expression : DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression -> ^( BLOCK ( $definition)+ $content) ;
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
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:125:3: ( DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:125:5: DEF definition+= definition_inside_expression ( AND definition+= definition_inside_expression )* IN ( COLON )? content= expression
            {
            DEF61=(Token)match(input,DEF,FOLLOW_DEF_in_def_in_expression731);  
            stream_DEF.add(DEF61);

            pushFollow(FOLLOW_definition_inside_expression_in_def_in_expression735);
            definition=definition_inside_expression();

            state._fsp--;

            stream_definition_inside_expression.add(definition.getTree());
            if (list_definition==null) list_definition=new ArrayList();
            list_definition.add(definition.getTree());

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:126:5: ( AND definition+= definition_inside_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==AND) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:126:6: AND definition+= definition_inside_expression
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

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:127:8: ( COLON )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==COLON) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:127:8: COLON
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
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:128:8: ^( BLOCK ( $definition)+ $content)
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:130:1: definition_inside_expression : ( definition_signature COLON expression -> ^( DEF definition_signature expression ) | VAR_ID OP_ASSIGN expression -> ^( DEF VAR_ID expression ) );
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
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:131:3: ( definition_signature COLON expression -> ^( DEF definition_signature expression ) | VAR_ID OP_ASSIGN expression -> ^( DEF VAR_ID expression ) )
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:131:5: definition_signature COLON expression
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
                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:133:8: ^( DEF definition_signature expression )
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:134:5: VAR_ID OP_ASSIGN expression
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
                    // elements: expression, VAR_ID
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
                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:136:8: ^( DEF VAR_ID expression )
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:139:1: def_in_tag : TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END -> ^( BLOCK ( $definition)+ $content) ;
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
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:140:3: ( TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END -> ^( BLOCK ( $definition)+ $content) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:140:5: TAG_START DEF definition+= definition_inside_tag ( TAG_START AND definition+= definition_inside_tag )* TAG_START IN content= tag_content TAG_END
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

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:141:5: ( TAG_START AND definition+= definition_inside_tag )*
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
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:141:6: TAG_START AND definition+= definition_inside_tag
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
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:144:8: ^( BLOCK ( $definition)+ $content)
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:146:1: definition_inside_tag : ( definition_signature content= tag_content -> ^( DEF definition_signature $content) | VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )? -> ^( DEF VAR_ID expression ) );
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
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:147:3: ( definition_signature content= tag_content -> ^( DEF definition_signature $content) | VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )? -> ^( DEF VAR_ID expression ) )
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:147:5: definition_signature content= tag_content
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
                    // 148:5: -> ^( DEF definition_signature $content)
                    {
                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:148:8: ^( DEF definition_signature $content)
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:149:5: VAR_ID OP_ASSIGN expression ( CONTENT ( STRING_LITERAL )? )?
                    {
                    VAR_ID79=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_definition_inside_tag963);  
                    stream_VAR_ID.add(VAR_ID79);

                    OP_ASSIGN80=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_definition_inside_tag965);  
                    stream_OP_ASSIGN.add(OP_ASSIGN80);

                    pushFollow(FOLLOW_expression_in_definition_inside_tag967);
                    expression81=expression();

                    state._fsp--;

                    stream_expression.add(expression81.getTree());
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:149:33: ( CONTENT ( STRING_LITERAL )? )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==CONTENT) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:149:34: CONTENT ( STRING_LITERAL )?
                            {
                            CONTENT82=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_definition_inside_tag970);  
                            stream_CONTENT.add(CONTENT82);

                            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:149:42: ( STRING_LITERAL )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==STRING_LITERAL) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:149:42: STRING_LITERAL
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
                    // elements: expression, VAR_ID
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
                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:150:8: ^( DEF VAR_ID expression )
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:156:1: lambda_expression : ( LAMBDA ( definition_argument )* COLON expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | ( definition_argument )* OP_FUNCTION_DEFINITION expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) );
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


        Object LAMBDA84_tree=null;
        Object COLON86_tree=null;
        Object OP_FUNCTION_DEFINITION89_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_LAMBDA=new RewriteRuleTokenStream(adaptor,"token LAMBDA");
        RewriteRuleTokenStream stream_OP_FUNCTION_DEFINITION=new RewriteRuleTokenStream(adaptor,"token OP_FUNCTION_DEFINITION");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_definition_argument=new RewriteRuleSubtreeStream(adaptor,"rule definition_argument");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:157:3: ( LAMBDA ( definition_argument )* COLON expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) | ( definition_argument )* OP_FUNCTION_DEFINITION expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==LAMBDA) ) {
                alt30=1;
            }
            else if ( (LA30_0==OP_FUNCTION_DEFINITION||LA30_0==TILDE||LA30_0==VAR_ID) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:157:5: LAMBDA ( definition_argument )* COLON expression
                    {
                    LAMBDA84=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambda_expression1011);  
                    stream_LAMBDA.add(LAMBDA84);

                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:157:12: ( definition_argument )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==TILDE||LA28_0==VAR_ID) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:157:12: definition_argument
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
                    // elements: definition_argument, expression, LAMBDA
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
                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:158:8: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(stream_LAMBDA.nextToken()), root_1);

                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:158:35: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:158:47: ( definition_argument )*
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:159:5: ( definition_argument )* OP_FUNCTION_DEFINITION expression
                    {
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:159:5: ( definition_argument )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==TILDE||LA29_0==VAR_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:159:5: definition_argument
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
                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:160:7: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(LAMBDA), root_1);

                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:160:34: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:160:46: ( definition_argument )*
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

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class lambda_expression_no_context_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lambda_expression_no_context"
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:162:1: lambda_expression_no_context : ( LAMBDA definition_argument COLON atom_expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression ) | ( definition_argument )* OP_FUNCTION_DEFINITION atom_expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression ) );
    public final OmttParser.lambda_expression_no_context_return lambda_expression_no_context() throws RecognitionException {
        OmttParser.lambda_expression_no_context_return retval = new OmttParser.lambda_expression_no_context_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAMBDA91=null;
        Token COLON93=null;
        Token OP_FUNCTION_DEFINITION96=null;
        OmttParser.definition_argument_return definition_argument92 = null;

        OmttParser.atom_expression_return atom_expression94 = null;

        OmttParser.definition_argument_return definition_argument95 = null;

        OmttParser.atom_expression_return atom_expression97 = null;


        Object LAMBDA91_tree=null;
        Object COLON93_tree=null;
        Object OP_FUNCTION_DEFINITION96_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_LAMBDA=new RewriteRuleTokenStream(adaptor,"token LAMBDA");
        RewriteRuleTokenStream stream_OP_FUNCTION_DEFINITION=new RewriteRuleTokenStream(adaptor,"token OP_FUNCTION_DEFINITION");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_definition_argument=new RewriteRuleSubtreeStream(adaptor,"rule definition_argument");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:163:3: ( LAMBDA definition_argument COLON atom_expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression ) | ( definition_argument )* OP_FUNCTION_DEFINITION atom_expression -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==LAMBDA) ) {
                alt32=1;
            }
            else if ( (LA32_0==OP_FUNCTION_DEFINITION||LA32_0==TILDE||LA32_0==VAR_ID) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:163:5: LAMBDA definition_argument COLON atom_expression
                    {
                    LAMBDA91=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambda_expression_no_context1084);  
                    stream_LAMBDA.add(LAMBDA91);

                    pushFollow(FOLLOW_definition_argument_in_lambda_expression_no_context1086);
                    definition_argument92=definition_argument();

                    state._fsp--;

                    stream_definition_argument.add(definition_argument92.getTree());
                    COLON93=(Token)match(input,COLON,FOLLOW_COLON_in_lambda_expression_no_context1088);  
                    stream_COLON.add(COLON93);

                    pushFollow(FOLLOW_atom_expression_in_lambda_expression_no_context1090);
                    atom_expression94=atom_expression();

                    state._fsp--;

                    stream_atom_expression.add(atom_expression94.getTree());


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
                    // 164:4: -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression )
                    {
                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:164:7: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(stream_LAMBDA.nextToken()), root_1);

                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:164:34: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:164:46: ( definition_argument )*
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:165:5: ( definition_argument )* OP_FUNCTION_DEFINITION atom_expression
                    {
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:165:5: ( definition_argument )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==TILDE||LA31_0==VAR_ID) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:165:5: definition_argument
                    	    {
                    	    pushFollow(FOLLOW_definition_argument_in_lambda_expression_no_context1117);
                    	    definition_argument95=definition_argument();

                    	    state._fsp--;

                    	    stream_definition_argument.add(definition_argument95.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    OP_FUNCTION_DEFINITION96=(Token)match(input,OP_FUNCTION_DEFINITION,FOLLOW_OP_FUNCTION_DEFINITION_in_lambda_expression_no_context1120);  
                    stream_OP_FUNCTION_DEFINITION.add(OP_FUNCTION_DEFINITION96);

                    pushFollow(FOLLOW_atom_expression_in_lambda_expression_no_context1122);
                    atom_expression97=atom_expression();

                    state._fsp--;

                    stream_atom_expression.add(atom_expression97.getTree());


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
                    // 166:4: -> ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression )
                    {
                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:166:7: ^( LAMBDA ^( ARGUMENTS ( definition_argument )* ) atom_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new LambdaExpression(LAMBDA), root_1);

                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:166:34: ^( ARGUMENTS ( definition_argument )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:166:46: ( definition_argument )*
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:169:10: fragment type : CLASS_ID ( OP_MULTIPLY )? -> ^( CLASS_ID ( OP_MULTIPLY )? ) ;
    public final OmttParser.type_return type() throws RecognitionException {
        OmttParser.type_return retval = new OmttParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS_ID98=null;
        Token OP_MULTIPLY99=null;

        Object CLASS_ID98_tree=null;
        Object OP_MULTIPLY99_tree=null;
        RewriteRuleTokenStream stream_OP_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token OP_MULTIPLY");
        RewriteRuleTokenStream stream_CLASS_ID=new RewriteRuleTokenStream(adaptor,"token CLASS_ID");

        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:170:3: ( CLASS_ID ( OP_MULTIPLY )? -> ^( CLASS_ID ( OP_MULTIPLY )? ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:170:5: CLASS_ID ( OP_MULTIPLY )?
            {
            CLASS_ID98=(Token)match(input,CLASS_ID,FOLLOW_CLASS_ID_in_type1158);  
            stream_CLASS_ID.add(CLASS_ID98);

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:170:14: ( OP_MULTIPLY )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==OP_MULTIPLY) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:170:14: OP_MULTIPLY
                    {
                    OP_MULTIPLY99=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_type1160);  
                    stream_OP_MULTIPLY.add(OP_MULTIPLY99);


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
            // 171:4: -> ^( CLASS_ID ( OP_MULTIPLY )? )
            {
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:171:7: ^( CLASS_ID ( OP_MULTIPLY )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new TypeReference(stream_CLASS_ID.nextToken()), root_1);

                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:171:33: ( OP_MULTIPLY )?
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:173:10: fragment single_type : CLASS_ID -> ^( CLASS_ID ) ;
    public final OmttParser.single_type_return single_type() throws RecognitionException {
        OmttParser.single_type_return retval = new OmttParser.single_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS_ID100=null;

        Object CLASS_ID100_tree=null;
        RewriteRuleTokenStream stream_CLASS_ID=new RewriteRuleTokenStream(adaptor,"token CLASS_ID");

        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:174:3: ( CLASS_ID -> ^( CLASS_ID ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:174:5: CLASS_ID
            {
            CLASS_ID100=(Token)match(input,CLASS_ID,FOLLOW_CLASS_ID_in_single_type1190);  
            stream_CLASS_ID.add(CLASS_ID100);



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
            // 175:4: -> ^( CLASS_ID )
            {
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:175:7: ^( CLASS_ID )
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:180:1: concatence_expression : (expr+= control_expression -> $expr) ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )? ;
    public final OmttParser.concatence_expression_return concatence_expression() throws RecognitionException {
        OmttParser.concatence_expression_return retval = new OmttParser.concatence_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_CONCAT101=null;
        List list_expr=null;
        OmttParser.control_expression_return expr = null;
         expr = null;
        Object OP_CONCAT101_tree=null;
        RewriteRuleTokenStream stream_OP_CONCAT=new RewriteRuleTokenStream(adaptor,"token OP_CONCAT");
        RewriteRuleSubtreeStream stream_control_expression=new RewriteRuleSubtreeStream(adaptor,"rule control_expression");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:181:3: ( (expr+= control_expression -> $expr) ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )? )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:181:5: (expr+= control_expression -> $expr) ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )?
            {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:181:5: (expr+= control_expression -> $expr)
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:181:6: expr+= control_expression
            {
            pushFollow(FOLLOW_control_expression_in_concatence_expression1219);
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
            // 181:31: -> $expr
            {
                adaptor.addChild(root_0, stream_expr.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:182:5: ( ( OP_CONCAT expr+= control_expression )+ -> ^( OP_CONCAT ( $expr)+ ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==OP_CONCAT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:182:6: ( OP_CONCAT expr+= control_expression )+
                    {
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:182:6: ( OP_CONCAT expr+= control_expression )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==OP_CONCAT) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:182:7: OP_CONCAT expr+= control_expression
                    	    {
                    	    OP_CONCAT101=(Token)match(input,OP_CONCAT,FOLLOW_OP_CONCAT_in_concatence_expression1233);  
                    	    stream_OP_CONCAT.add(OP_CONCAT101);

                    	    pushFollow(FOLLOW_control_expression_in_concatence_expression1237);
                    	    expr=control_expression();

                    	    state._fsp--;

                    	    stream_control_expression.add(expr.getTree());
                    	    if (list_expr==null) list_expr=new ArrayList();
                    	    list_expr.add(expr.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
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
                    // 182:44: -> ^( OP_CONCAT ( $expr)+ )
                    {
                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:182:47: ^( OP_CONCAT ( $expr)+ )
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:185:1: control_expression : ( if_expression | map_expression | boolean_expression );
    public final OmttParser.control_expression_return control_expression() throws RecognitionException {
        OmttParser.control_expression_return retval = new OmttParser.control_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.if_expression_return if_expression102 = null;

        OmttParser.map_expression_return map_expression103 = null;

        OmttParser.boolean_expression_return boolean_expression104 = null;



        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:186:3: ( if_expression | map_expression | boolean_expression )
            int alt36=3;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt36=1;
                }
                break;
            case MAP:
                {
                alt36=2;
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
            case VAR_ID:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:186:5: if_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_expression_in_control_expression1267);
                    if_expression102=if_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, if_expression102.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:187:5: map_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_expression_in_control_expression1273);
                    map_expression103=map_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, map_expression103.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:188:5: boolean_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_expression_in_control_expression1279);
                    boolean_expression104=boolean_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_expression104.getTree());

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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:191:1: if_expression : IF condition= boolean_expression COLON part_if= control_expression ELSE ( COLON )? part_else= control_expression -> ^( IF_ELSE $condition $part_if $part_else) ;
    public final OmttParser.if_expression_return if_expression() throws RecognitionException {
        OmttParser.if_expression_return retval = new OmttParser.if_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF105=null;
        Token COLON106=null;
        Token ELSE107=null;
        Token COLON108=null;
        OmttParser.boolean_expression_return condition = null;

        OmttParser.control_expression_return part_if = null;

        OmttParser.control_expression_return part_else = null;


        Object IF105_tree=null;
        Object COLON106_tree=null;
        Object ELSE107_tree=null;
        Object COLON108_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_control_expression=new RewriteRuleSubtreeStream(adaptor,"rule control_expression");
        RewriteRuleSubtreeStream stream_boolean_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expression");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:192:3: ( IF condition= boolean_expression COLON part_if= control_expression ELSE ( COLON )? part_else= control_expression -> ^( IF_ELSE $condition $part_if $part_else) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:192:5: IF condition= boolean_expression COLON part_if= control_expression ELSE ( COLON )? part_else= control_expression
            {
            IF105=(Token)match(input,IF,FOLLOW_IF_in_if_expression1292);  
            stream_IF.add(IF105);

            pushFollow(FOLLOW_boolean_expression_in_if_expression1296);
            condition=boolean_expression();

            state._fsp--;

            stream_boolean_expression.add(condition.getTree());
            COLON106=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1298);  
            stream_COLON.add(COLON106);

            pushFollow(FOLLOW_control_expression_in_if_expression1306);
            part_if=control_expression();

            state._fsp--;

            stream_control_expression.add(part_if.getTree());
            ELSE107=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_expression1312);  
            stream_ELSE.add(ELSE107);

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:194:10: ( COLON )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==COLON) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:194:10: COLON
                    {
                    COLON108=(Token)match(input,COLON,FOLLOW_COLON_in_if_expression1314);  
                    stream_COLON.add(COLON108);


                    }
                    break;

            }

            pushFollow(FOLLOW_control_expression_in_if_expression1323);
            part_else=control_expression();

            state._fsp--;

            stream_control_expression.add(part_else.getTree());


            // AST REWRITE
            // elements: part_if, part_else, condition
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
            // 196:5: -> ^( IF_ELSE $condition $part_if $part_else)
            {
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:196:8: ^( IF_ELSE $condition $part_if $part_else)
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:198:1: if_tag : TAG_START IF condition= boolean_expression part_if= tag_content ( TAG_START ELSE part_else= tag_content )? TAG_END -> ^( IF_ELSE $condition $part_if ( $part_else)? ) ;
    public final OmttParser.if_tag_return if_tag() throws RecognitionException {
        OmttParser.if_tag_return retval = new OmttParser.if_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START109=null;
        Token IF110=null;
        Token TAG_START111=null;
        Token ELSE112=null;
        Token TAG_END113=null;
        OmttParser.boolean_expression_return condition = null;

        OmttParser.tag_content_return part_if = null;

        OmttParser.tag_content_return part_else = null;


        Object TAG_START109_tree=null;
        Object IF110_tree=null;
        Object TAG_START111_tree=null;
        Object ELSE112_tree=null;
        Object TAG_END113_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_boolean_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expression");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:199:3: ( TAG_START IF condition= boolean_expression part_if= tag_content ( TAG_START ELSE part_else= tag_content )? TAG_END -> ^( IF_ELSE $condition $part_if ( $part_else)? ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:199:5: TAG_START IF condition= boolean_expression part_if= tag_content ( TAG_START ELSE part_else= tag_content )? TAG_END
            {
            TAG_START109=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_tag1357);  
            stream_TAG_START.add(TAG_START109);

            IF110=(Token)match(input,IF,FOLLOW_IF_in_if_tag1359);  
            stream_IF.add(IF110);

            pushFollow(FOLLOW_boolean_expression_in_if_tag1363);
            condition=boolean_expression();

            state._fsp--;

            stream_boolean_expression.add(condition.getTree());
            pushFollow(FOLLOW_tag_content_in_if_tag1371);
            part_if=tag_content();

            state._fsp--;

            stream_tag_content.add(part_if.getTree());
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:201:5: ( TAG_START ELSE part_else= tag_content )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==TAG_START) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:201:7: TAG_START ELSE part_else= tag_content
                    {
                    TAG_START111=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_if_tag1379);  
                    stream_TAG_START.add(TAG_START111);

                    ELSE112=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_tag1381);  
                    stream_ELSE.add(ELSE112);

                    pushFollow(FOLLOW_tag_content_in_if_tag1391);
                    part_else=tag_content();

                    state._fsp--;

                    stream_tag_content.add(part_else.getTree());

                    }
                    break;

            }

            TAG_END113=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_if_tag1404);  
            stream_TAG_END.add(TAG_END113);



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
            // 205:5: -> ^( IF_ELSE $condition $part_if ( $part_else)? )
            {
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:205:8: ^( IF_ELSE $condition $part_if ( $part_else)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new IfElse(IF_ELSE), root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());
                adaptor.addChild(root_1, stream_part_if.nextTree());
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:205:46: ( $part_else)?
                if ( stream_part_else.hasNext() ) {
                    adaptor.addChild(root_1, stream_part_else.nextTree());

                }
                stream_part_else.reset();

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
    // $ANTLR end "if_tag"

    public static class map_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "map_expression"
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:208:1: map_expression : MAP iter= boolean_expression COLON expr= control_expression -> ^( MAP $iter $expr) ;
    public final OmttParser.map_expression_return map_expression() throws RecognitionException {
        OmttParser.map_expression_return retval = new OmttParser.map_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MAP114=null;
        Token COLON115=null;
        OmttParser.boolean_expression_return iter = null;

        OmttParser.control_expression_return expr = null;


        Object MAP114_tree=null;
        Object COLON115_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_control_expression=new RewriteRuleSubtreeStream(adaptor,"rule control_expression");
        RewriteRuleSubtreeStream stream_boolean_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expression");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:209:3: ( MAP iter= boolean_expression COLON expr= control_expression -> ^( MAP $iter $expr) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:209:5: MAP iter= boolean_expression COLON expr= control_expression
            {
            MAP114=(Token)match(input,MAP,FOLLOW_MAP_in_map_expression1440);  
            stream_MAP.add(MAP114);

            pushFollow(FOLLOW_boolean_expression_in_map_expression1444);
            iter=boolean_expression();

            state._fsp--;

            stream_boolean_expression.add(iter.getTree());
            COLON115=(Token)match(input,COLON,FOLLOW_COLON_in_map_expression1446);  
            stream_COLON.add(COLON115);

            pushFollow(FOLLOW_control_expression_in_map_expression1454);
            expr=control_expression();

            state._fsp--;

            stream_control_expression.add(expr.getTree());


            // AST REWRITE
            // elements: expr, MAP, iter
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
            // 211:5: -> ^( MAP $iter $expr)
            {
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:211:8: ^( MAP $iter $expr)
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:213:1: map_tag : TAG_START MAP iter= expression expr= tag_content TAG_END -> ^( MAP $iter $expr) ;
    public final OmttParser.map_tag_return map_tag() throws RecognitionException {
        OmttParser.map_tag_return retval = new OmttParser.map_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START116=null;
        Token MAP117=null;
        Token TAG_END118=null;
        OmttParser.expression_return iter = null;

        OmttParser.tag_content_return expr = null;


        Object TAG_START116_tree=null;
        Object MAP117_tree=null;
        Object TAG_END118_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:214:3: ( TAG_START MAP iter= expression expr= tag_content TAG_END -> ^( MAP $iter $expr) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:214:5: TAG_START MAP iter= expression expr= tag_content TAG_END
            {
            TAG_START116=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_map_tag1485);  
            stream_TAG_START.add(TAG_START116);

            MAP117=(Token)match(input,MAP,FOLLOW_MAP_in_map_tag1487);  
            stream_MAP.add(MAP117);

            pushFollow(FOLLOW_expression_in_map_tag1491);
            iter=expression();

            state._fsp--;

            stream_expression.add(iter.getTree());
            pushFollow(FOLLOW_tag_content_in_map_tag1499);
            expr=tag_content();

            state._fsp--;

            stream_tag_content.add(expr.getTree());
            TAG_END118=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_map_tag1505);  
            stream_TAG_END.add(TAG_END118);



            // AST REWRITE
            // elements: expr, MAP, iter
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
            // 217:5: -> ^( MAP $iter $expr)
            {
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:217:8: ^( MAP $iter $expr)
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

    public static class boolean_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_expression"
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:221:1: boolean_expression : boolean_binary_expression ;
    public final OmttParser.boolean_expression_return boolean_expression() throws RecognitionException {
        OmttParser.boolean_expression_return retval = new OmttParser.boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_binary_expression_return boolean_binary_expression119 = null;



        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:222:2: ( boolean_binary_expression )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:222:4: boolean_binary_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_binary_expression_in_boolean_expression1537);
            boolean_binary_expression119=boolean_binary_expression();

            state._fsp--;

            adaptor.addChild(root_0, boolean_binary_expression119.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:224:10: fragment boolean_binary_expression : boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )* ;
    public final OmttParser.boolean_binary_expression_return boolean_binary_expression() throws RecognitionException {
        OmttParser.boolean_binary_expression_return retval = new OmttParser.boolean_binary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_unary_expression_return boolean_unary_expression120 = null;

        OmttParser.boolean_binary_operator_return boolean_binary_operator121 = null;

        OmttParser.boolean_unary_expression_return boolean_unary_expression122 = null;



        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:225:3: ( boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )* )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:225:5: boolean_unary_expression ( boolean_binary_operator boolean_unary_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression1550);
            boolean_unary_expression120=boolean_unary_expression();

            state._fsp--;

            adaptor.addChild(root_0, boolean_unary_expression120.getTree());
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:225:30: ( boolean_binary_operator boolean_unary_expression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=OP_AND && LA39_0<=OP_XOR)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:225:31: boolean_binary_operator boolean_unary_expression
            	    {
            	    pushFollow(FOLLOW_boolean_binary_operator_in_boolean_binary_expression1553);
            	    boolean_binary_operator121=boolean_binary_operator();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(boolean_binary_operator121.getTree(), root_0);
            	    pushFollow(FOLLOW_boolean_unary_expression_in_boolean_binary_expression1556);
            	    boolean_unary_expression122=boolean_unary_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolean_unary_expression122.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:227:10: fragment boolean_unary_expression : ( boolean_unary_operator boolean_comparsion_expression | boolean_comparsion_expression );
    public final OmttParser.boolean_unary_expression_return boolean_unary_expression() throws RecognitionException {
        OmttParser.boolean_unary_expression_return retval = new OmttParser.boolean_unary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.boolean_unary_operator_return boolean_unary_operator123 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression124 = null;

        OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression125 = null;



        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:228:3: ( boolean_unary_operator boolean_comparsion_expression | boolean_comparsion_expression )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==OP_NOT) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=STRING_LITERAL && LA40_0<=REAL_NUMBER)||LA40_0==DATA_START||LA40_0==NULL||(LA40_0>=TRUE && LA40_0<=FALSE)||(LA40_0>=TILDE && LA40_0<=LEFT_PAREN)||LA40_0==OP_MINUS||LA40_0==VAR_ID) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:228:5: boolean_unary_operator boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_unary_operator_in_boolean_unary_expression1572);
                    boolean_unary_operator123=boolean_unary_operator();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(boolean_unary_operator123.getTree(), root_0);
                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1575);
                    boolean_comparsion_expression124=boolean_comparsion_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_comparsion_expression124.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:229:5: boolean_comparsion_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1581);
                    boolean_comparsion_expression125=boolean_comparsion_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_comparsion_expression125.getTree());

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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:232:10: fragment boolean_binary_operator : ( OP_AND | OP_OR | OP_XOR );
    public final OmttParser.boolean_binary_operator_return boolean_binary_operator() throws RecognitionException {
        OmttParser.boolean_binary_operator_return retval = new OmttParser.boolean_binary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_AND126=null;
        Token OP_OR127=null;
        Token OP_XOR128=null;

        Object OP_AND126_tree=null;
        Object OP_OR127_tree=null;
        Object OP_XOR128_tree=null;

        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:233:3: ( OP_AND | OP_OR | OP_XOR )
            int alt41=3;
            switch ( input.LA(1) ) {
            case OP_AND:
                {
                alt41=1;
                }
                break;
            case OP_OR:
                {
                alt41=2;
                }
                break;
            case OP_XOR:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:233:5: OP_AND
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_AND126=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_boolean_binary_operator1596); 
                    OP_AND126_tree = new BooleanExpression(OP_AND126) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_AND126_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:234:5: OP_OR
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_OR127=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_boolean_binary_operator1606); 
                    OP_OR127_tree = new BooleanExpression(OP_OR127) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_OR127_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:235:5: OP_XOR
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_XOR128=(Token)match(input,OP_XOR,FOLLOW_OP_XOR_in_boolean_binary_operator1616); 
                    OP_XOR128_tree = new BooleanExpression(OP_XOR128) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_XOR128_tree, root_0);


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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:237:10: fragment boolean_unary_operator : OP_NOT ;
    public final OmttParser.boolean_unary_operator_return boolean_unary_operator() throws RecognitionException {
        OmttParser.boolean_unary_operator_return retval = new OmttParser.boolean_unary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_NOT129=null;

        Object OP_NOT129_tree=null;

        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:238:3: ( OP_NOT )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:238:5: OP_NOT
            {
            root_0 = (Object)adaptor.nil();

            OP_NOT129=(Token)match(input,OP_NOT,FOLLOW_OP_NOT_in_boolean_unary_operator1634); 
            OP_NOT129_tree = new BooleanExpression(OP_NOT129) ;
            root_0 = (Object)adaptor.becomeRoot(OP_NOT129_tree, root_0);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:241:1: boolean_comparsion_expression : additive_expression ( boolean_comparsion_operator additive_expression )* ;
    public final OmttParser.boolean_comparsion_expression_return boolean_comparsion_expression() throws RecognitionException {
        OmttParser.boolean_comparsion_expression_return retval = new OmttParser.boolean_comparsion_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.additive_expression_return additive_expression130 = null;

        OmttParser.boolean_comparsion_operator_return boolean_comparsion_operator131 = null;

        OmttParser.additive_expression_return additive_expression132 = null;



        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:242:3: ( additive_expression ( boolean_comparsion_operator additive_expression )* )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:242:5: additive_expression ( boolean_comparsion_operator additive_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression1651);
            additive_expression130=additive_expression();

            state._fsp--;

            adaptor.addChild(root_0, additive_expression130.getTree());
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:242:25: ( boolean_comparsion_operator additive_expression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=OP_EQUAL && LA42_0<=OP_GE)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:242:26: boolean_comparsion_operator additive_expression
            	    {
            	    pushFollow(FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression1654);
            	    boolean_comparsion_operator131=boolean_comparsion_operator();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(boolean_comparsion_operator131.getTree(), root_0);
            	    pushFollow(FOLLOW_additive_expression_in_boolean_comparsion_expression1657);
            	    additive_expression132=additive_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, additive_expression132.getTree());

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
    // $ANTLR end "boolean_comparsion_expression"

    public static class boolean_comparsion_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_comparsion_operator"
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:244:10: fragment boolean_comparsion_operator : ( OP_EQUAL | OP_NOT_EQUAL | OP_LE | OP_LEQ | OP_GE | OP_GEQ );
    public final OmttParser.boolean_comparsion_operator_return boolean_comparsion_operator() throws RecognitionException {
        OmttParser.boolean_comparsion_operator_return retval = new OmttParser.boolean_comparsion_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_EQUAL133=null;
        Token OP_NOT_EQUAL134=null;
        Token OP_LE135=null;
        Token OP_LEQ136=null;
        Token OP_GE137=null;
        Token OP_GEQ138=null;

        Object OP_EQUAL133_tree=null;
        Object OP_NOT_EQUAL134_tree=null;
        Object OP_LE135_tree=null;
        Object OP_LEQ136_tree=null;
        Object OP_GE137_tree=null;
        Object OP_GEQ138_tree=null;

        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:245:3: ( OP_EQUAL | OP_NOT_EQUAL | OP_LE | OP_LEQ | OP_GE | OP_GEQ )
            int alt43=6;
            switch ( input.LA(1) ) {
            case OP_EQUAL:
                {
                alt43=1;
                }
                break;
            case OP_NOT_EQUAL:
                {
                alt43=2;
                }
                break;
            case OP_LE:
                {
                alt43=3;
                }
                break;
            case OP_LEQ:
                {
                alt43=4;
                }
                break;
            case OP_GE:
                {
                alt43=5;
                }
                break;
            case OP_GEQ:
                {
                alt43=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:245:5: OP_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_EQUAL133=(Token)match(input,OP_EQUAL,FOLLOW_OP_EQUAL_in_boolean_comparsion_operator1673); 
                    OP_EQUAL133_tree = new BooleanExpression(OP_EQUAL133) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_EQUAL133_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:246:5: OP_NOT_EQUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_NOT_EQUAL134=(Token)match(input,OP_NOT_EQUAL,FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator1683); 
                    OP_NOT_EQUAL134_tree = new BooleanExpression(OP_NOT_EQUAL134) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_NOT_EQUAL134_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:247:5: OP_LE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LE135=(Token)match(input,OP_LE,FOLLOW_OP_LE_in_boolean_comparsion_operator1693); 
                    OP_LE135_tree = new BooleanExpression(OP_LE135) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LE135_tree, root_0);


                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:248:5: OP_LEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_LEQ136=(Token)match(input,OP_LEQ,FOLLOW_OP_LEQ_in_boolean_comparsion_operator1703); 
                    OP_LEQ136_tree = new BooleanExpression(OP_LEQ136) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_LEQ136_tree, root_0);


                    }
                    break;
                case 5 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:249:5: OP_GE
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GE137=(Token)match(input,OP_GE,FOLLOW_OP_GE_in_boolean_comparsion_operator1713); 
                    OP_GE137_tree = new BooleanExpression(OP_GE137) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GE137_tree, root_0);


                    }
                    break;
                case 6 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:250:5: OP_GEQ
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_GEQ138=(Token)match(input,OP_GEQ,FOLLOW_OP_GEQ_in_boolean_comparsion_operator1723); 
                    OP_GEQ138_tree = new BooleanExpression(OP_GEQ138) ;
                    root_0 = (Object)adaptor.becomeRoot(OP_GEQ138_tree, root_0);


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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:256:1: additive_expression : multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )* ;
    public final OmttParser.additive_expression_return additive_expression() throws RecognitionException {
        OmttParser.additive_expression_return retval = new OmttParser.additive_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_PLUS140=null;
        Token OP_MINUS141=null;
        OmttParser.multiplicative_expression_return multiplicative_expression139 = null;

        OmttParser.multiplicative_expression_return multiplicative_expression142 = null;


        Object OP_PLUS140_tree=null;
        Object OP_MINUS141_tree=null;

        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:257:3: ( multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )* )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:257:5: multiplicative_expression ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1743);
            multiplicative_expression139=multiplicative_expression();

            state._fsp--;

            adaptor.addChild(root_0, multiplicative_expression139.getTree());
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:258:5: ( ( OP_PLUS | OP_MINUS ) multiplicative_expression )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=OP_PLUS && LA45_0<=OP_MINUS)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:259:7: ( OP_PLUS | OP_MINUS ) multiplicative_expression
            	    {
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:259:7: ( OP_PLUS | OP_MINUS )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==OP_PLUS) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==OP_MINUS) ) {
            	        alt44=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:259:9: OP_PLUS
            	            {
            	            OP_PLUS140=(Token)match(input,OP_PLUS,FOLLOW_OP_PLUS_in_additive_expression1759); 
            	            OP_PLUS140_tree = new ArithmeticExpression(OP_PLUS140) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_PLUS140_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:260:9: OP_MINUS
            	            {
            	            OP_MINUS141=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_additive_expression1773); 
            	            OP_MINUS141_tree = new ArithmeticExpression(OP_MINUS141) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MINUS141_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1793);
            	    multiplicative_expression142=multiplicative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicative_expression142.getTree());

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
    // $ANTLR end "additive_expression"

    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicative_expression"
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:266:1: multiplicative_expression : negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )* ;
    public final OmttParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        OmttParser.multiplicative_expression_return retval = new OmttParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MULTIPLY144=null;
        Token SLASH145=null;
        Token OP_MODULO146=null;
        OmttParser.negative_expression_return negative_expression143 = null;

        OmttParser.negative_expression_return negative_expression147 = null;


        Object OP_MULTIPLY144_tree=null;
        Object SLASH145_tree=null;
        Object OP_MODULO146_tree=null;

        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:267:3: ( negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )* )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:267:5: negative_expression ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_negative_expression_in_multiplicative_expression1813);
            negative_expression143=negative_expression();

            state._fsp--;

            adaptor.addChild(root_0, negative_expression143.getTree());
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:268:5: ( ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==SLASH||(LA47_0>=OP_MULTIPLY && LA47_0<=OP_MODULO)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:268:7: ( OP_MULTIPLY | SLASH | OP_MODULO ) negative_expression
            	    {
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:268:7: ( OP_MULTIPLY | SLASH | OP_MODULO )
            	    int alt46=3;
            	    switch ( input.LA(1) ) {
            	    case OP_MULTIPLY:
            	        {
            	        alt46=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt46=2;
            	        }
            	        break;
            	    case OP_MODULO:
            	        {
            	        alt46=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 46, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt46) {
            	        case 1 :
            	            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:268:9: OP_MULTIPLY
            	            {
            	            OP_MULTIPLY144=(Token)match(input,OP_MULTIPLY,FOLLOW_OP_MULTIPLY_in_multiplicative_expression1823); 
            	            OP_MULTIPLY144_tree = new ArithmeticExpression(OP_MULTIPLY144) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MULTIPLY144_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:269:9: SLASH
            	            {
            	            SLASH145=(Token)match(input,SLASH,FOLLOW_SLASH_in_multiplicative_expression1837); 
            	            SLASH145_tree = new ArithmeticExpression(SLASH145) ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH145_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:270:9: OP_MODULO
            	            {
            	            OP_MODULO146=(Token)match(input,OP_MODULO,FOLLOW_OP_MODULO_in_multiplicative_expression1851); 
            	            OP_MODULO146_tree = new ArithmeticExpression(OP_MODULO146) ;
            	            root_0 = (Object)adaptor.becomeRoot(OP_MODULO146_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_negative_expression_in_multiplicative_expression1871);
            	    negative_expression147=negative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, negative_expression147.getTree());

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
    // $ANTLR end "multiplicative_expression"

    public static class negative_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negative_expression"
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:276:1: negative_expression : ( OP_MINUS context_expression -> ^( OP_MINUS context_expression ) | context_expression );
    public final OmttParser.negative_expression_return negative_expression() throws RecognitionException {
        OmttParser.negative_expression_return retval = new OmttParser.negative_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MINUS148=null;
        OmttParser.context_expression_return context_expression149 = null;

        OmttParser.context_expression_return context_expression150 = null;


        Object OP_MINUS148_tree=null;
        RewriteRuleTokenStream stream_OP_MINUS=new RewriteRuleTokenStream(adaptor,"token OP_MINUS");
        RewriteRuleSubtreeStream stream_context_expression=new RewriteRuleSubtreeStream(adaptor,"rule context_expression");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:277:2: ( OP_MINUS context_expression -> ^( OP_MINUS context_expression ) | context_expression )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==OP_MINUS) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=STRING_LITERAL && LA48_0<=REAL_NUMBER)||LA48_0==DATA_START||LA48_0==NULL||(LA48_0>=TRUE && LA48_0<=FALSE)||(LA48_0>=TILDE && LA48_0<=LEFT_PAREN)||LA48_0==VAR_ID) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:277:4: OP_MINUS context_expression
                    {
                    OP_MINUS148=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_negative_expression1890);  
                    stream_OP_MINUS.add(OP_MINUS148);

                    pushFollow(FOLLOW_context_expression_in_negative_expression1892);
                    context_expression149=context_expression();

                    state._fsp--;

                    stream_context_expression.add(context_expression149.getTree());


                    // AST REWRITE
                    // elements: OP_MINUS, context_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 278:3: -> ^( OP_MINUS context_expression )
                    {
                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:278:6: ^( OP_MINUS context_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ArithmeticMinus(stream_OP_MINUS.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_context_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:279:4: context_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_context_expression_in_negative_expression1910);
                    context_expression150=context_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, context_expression150.getTree());

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

    public static class context_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "context_expression"
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:284:1: context_expression : (fe= functional_expression -> $fe) ( OP_CONTEXT atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | OP_CONTEXT lambda_expression_no_context -> ^( CALL[true] lambda_expression_no_context ^( ARGUMENT $context_expression) ) | OP_CONTEXT single_type -> ^( CAST single_type $context_expression) | OP_EXPRESSION_CONTEXT ce= functional_expression -> ^( OP_EXPRESSION_CONTEXT $context_expression $ce) )* ;
    public final OmttParser.context_expression_return context_expression() throws RecognitionException {
        OmttParser.context_expression_return retval = new OmttParser.context_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_CONTEXT151=null;
        Token OP_CONTEXT153=null;
        Token OP_CONTEXT155=null;
        Token OP_EXPRESSION_CONTEXT157=null;
        OmttParser.functional_expression_return fe = null;

        OmttParser.function_arguments_return arguments = null;

        OmttParser.functional_expression_return ce = null;

        OmttParser.atom_expression_return atom_expression152 = null;

        OmttParser.lambda_expression_no_context_return lambda_expression_no_context154 = null;

        OmttParser.single_type_return single_type156 = null;


        Object OP_CONTEXT151_tree=null;
        Object OP_CONTEXT153_tree=null;
        Object OP_CONTEXT155_tree=null;
        Object OP_EXPRESSION_CONTEXT157_tree=null;
        RewriteRuleTokenStream stream_OP_CONTEXT=new RewriteRuleTokenStream(adaptor,"token OP_CONTEXT");
        RewriteRuleTokenStream stream_OP_EXPRESSION_CONTEXT=new RewriteRuleTokenStream(adaptor,"token OP_EXPRESSION_CONTEXT");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_lambda_expression_no_context=new RewriteRuleSubtreeStream(adaptor,"rule lambda_expression_no_context");
        RewriteRuleSubtreeStream stream_functional_expression=new RewriteRuleSubtreeStream(adaptor,"rule functional_expression");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        RewriteRuleSubtreeStream stream_function_arguments=new RewriteRuleSubtreeStream(adaptor,"rule function_arguments");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:285:3: ( (fe= functional_expression -> $fe) ( OP_CONTEXT atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | OP_CONTEXT lambda_expression_no_context -> ^( CALL[true] lambda_expression_no_context ^( ARGUMENT $context_expression) ) | OP_CONTEXT single_type -> ^( CAST single_type $context_expression) | OP_EXPRESSION_CONTEXT ce= functional_expression -> ^( OP_EXPRESSION_CONTEXT $context_expression $ce) )* )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:285:5: (fe= functional_expression -> $fe) ( OP_CONTEXT atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | OP_CONTEXT lambda_expression_no_context -> ^( CALL[true] lambda_expression_no_context ^( ARGUMENT $context_expression) ) | OP_CONTEXT single_type -> ^( CAST single_type $context_expression) | OP_EXPRESSION_CONTEXT ce= functional_expression -> ^( OP_EXPRESSION_CONTEXT $context_expression $ce) )*
            {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:285:5: (fe= functional_expression -> $fe)
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:285:6: fe= functional_expression
            {
            pushFollow(FOLLOW_functional_expression_in_context_expression1927);
            fe=functional_expression();

            state._fsp--;

            stream_functional_expression.add(fe.getTree());


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
            // 285:31: -> $fe
            {
                adaptor.addChild(root_0, stream_fe.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:286:5: ( OP_CONTEXT atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | OP_CONTEXT lambda_expression_no_context -> ^( CALL[true] lambda_expression_no_context ^( ARGUMENT $context_expression) ) | OP_CONTEXT single_type -> ^( CAST single_type $context_expression) | OP_EXPRESSION_CONTEXT ce= functional_expression -> ^( OP_EXPRESSION_CONTEXT $context_expression $ce) )*
            loop49:
            do {
                int alt49=5;
                alt49 = dfa49.predict(input);
                switch (alt49) {
            	case 1 :
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:286:7: OP_CONTEXT atom_expression arguments= function_arguments
            	    {
            	    OP_CONTEXT151=(Token)match(input,OP_CONTEXT,FOLLOW_OP_CONTEXT_in_context_expression1941);  
            	    stream_OP_CONTEXT.add(OP_CONTEXT151);

            	    pushFollow(FOLLOW_atom_expression_in_context_expression1943);
            	    atom_expression152=atom_expression();

            	    state._fsp--;

            	    stream_atom_expression.add(atom_expression152.getTree());
            	    pushFollow(FOLLOW_function_arguments_in_context_expression1947);
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
            	    // 287:7: -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? )
            	    {
            	        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:287:10: ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

            	        adaptor.addChild(root_1, stream_atom_expression.nextTree());
            	        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:287:45: ^( ARGUMENT $context_expression)
            	        {
            	        Object root_2 = (Object)adaptor.nil();
            	        root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:287:95: ( $arguments)?
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
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:288:7: OP_CONTEXT lambda_expression_no_context
            	    {
            	    OP_CONTEXT153=(Token)match(input,OP_CONTEXT,FOLLOW_OP_CONTEXT_in_context_expression1987);  
            	    stream_OP_CONTEXT.add(OP_CONTEXT153);

            	    pushFollow(FOLLOW_lambda_expression_no_context_in_context_expression1989);
            	    lambda_expression_no_context154=lambda_expression_no_context();

            	    state._fsp--;

            	    stream_lambda_expression_no_context.add(lambda_expression_no_context154.getTree());


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
            	    // 289:7: -> ^( CALL[true] lambda_expression_no_context ^( ARGUMENT $context_expression) )
            	    {
            	        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:289:10: ^( CALL[true] lambda_expression_no_context ^( ARGUMENT $context_expression) )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Call(CALL, true), root_1);

            	        adaptor.addChild(root_1, stream_lambda_expression_no_context.nextTree());
            	        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:289:58: ^( ARGUMENT $context_expression)
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
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:290:7: OP_CONTEXT single_type
            	    {
            	    OP_CONTEXT155=(Token)match(input,OP_CONTEXT,FOLLOW_OP_CONTEXT_in_context_expression2025);  
            	    stream_OP_CONTEXT.add(OP_CONTEXT155);

            	    pushFollow(FOLLOW_single_type_in_context_expression2027);
            	    single_type156=single_type();

            	    state._fsp--;

            	    stream_single_type.add(single_type156.getTree());


            	    // AST REWRITE
            	    // elements: single_type, context_expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 291:7: -> ^( CAST single_type $context_expression)
            	    {
            	        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:291:10: ^( CAST single_type $context_expression)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(new Cast(CAST), root_1);

            	        adaptor.addChild(root_1, stream_single_type.nextTree());
            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 4 :
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:292:7: OP_EXPRESSION_CONTEXT ce= functional_expression
            	    {
            	    OP_EXPRESSION_CONTEXT157=(Token)match(input,OP_EXPRESSION_CONTEXT,FOLLOW_OP_EXPRESSION_CONTEXT_in_context_expression2055);  
            	    stream_OP_EXPRESSION_CONTEXT.add(OP_EXPRESSION_CONTEXT157);

            	    pushFollow(FOLLOW_functional_expression_in_context_expression2059);
            	    ce=functional_expression();

            	    state._fsp--;

            	    stream_functional_expression.add(ce.getTree());


            	    // AST REWRITE
            	    // elements: OP_EXPRESSION_CONTEXT, context_expression, ce
            	    // token labels: 
            	    // rule labels: retval, ce
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_ce=new RewriteRuleSubtreeStream(adaptor,"rule ce",ce!=null?ce.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 293:6: -> ^( OP_EXPRESSION_CONTEXT $context_expression $ce)
            	    {
            	        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:293:9: ^( OP_EXPRESSION_CONTEXT $context_expression $ce)
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
            	    break loop49;
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

    public static class functional_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functional_expression"
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:299:1: functional_expression : call_expression ;
    public final OmttParser.functional_expression_return functional_expression() throws RecognitionException {
        OmttParser.functional_expression_return retval = new OmttParser.functional_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.call_expression_return call_expression158 = null;



        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:300:3: ( call_expression )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:300:5: call_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_call_expression_in_functional_expression2101);
            call_expression158=call_expression();

            state._fsp--;

            adaptor.addChild(root_0, call_expression158.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:303:1: call_expression : atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) ) ;
    public final OmttParser.call_expression_return call_expression() throws RecognitionException {
        OmttParser.call_expression_return retval = new OmttParser.call_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.atom_expression_return atom_expression159 = null;

        OmttParser.function_argument_return function_argument160 = null;


        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_function_argument=new RewriteRuleSubtreeStream(adaptor,"rule function_argument");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:304:3: ( atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:304:5: atom_expression ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            {
            pushFollow(FOLLOW_atom_expression_in_call_expression2114);
            atom_expression159=atom_expression();

            state._fsp--;

            stream_atom_expression.add(atom_expression159.getTree());
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:305:5: ( ( function_argument )+ -> ^( CALL[false] atom_expression ( function_argument )+ ) | -> ^( atom_expression ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=STRING_LITERAL && LA51_0<=REAL_NUMBER)||LA51_0==DATA_START||LA51_0==NULL||(LA51_0>=TRUE && LA51_0<=FALSE)||(LA51_0>=TILDE && LA51_0<=LEFT_PAREN)||LA51_0==VAR_ID) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=CONTENT && LA51_0<=TAG_END)||(LA51_0>=EXPRESSION_END && LA51_0<=OP_DATA_IS_EXPRESSION)||(LA51_0>=AND && LA51_0<=IN)||LA51_0==ELSE||LA51_0==COLON||LA51_0==SLASH||LA51_0==RIGHT_PAREN||(LA51_0>=RIGHT_SQUARE_PAREN && LA51_0<=OP_GE)||(LA51_0>=OP_AND && LA51_0<=OP_XOR)||(LA51_0>=OP_CONTEXT && LA51_0<=OP_EXPRESSION_CONTEXT)||LA51_0==OP_CONCAT) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:305:7: ( function_argument )+
                    {
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:305:7: ( function_argument )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( ((LA50_0>=STRING_LITERAL && LA50_0<=REAL_NUMBER)||LA50_0==DATA_START||LA50_0==NULL||(LA50_0>=TRUE && LA50_0<=FALSE)||(LA50_0>=TILDE && LA50_0<=LEFT_PAREN)||LA50_0==VAR_ID) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:305:7: function_argument
                    	    {
                    	    pushFollow(FOLLOW_function_argument_in_call_expression2122);
                    	    function_argument160=function_argument();

                    	    state._fsp--;

                    	    stream_function_argument.add(function_argument160.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt50 >= 1 ) break loop50;
                                EarlyExitException eee =
                                    new EarlyExitException(50, input);
                                throw eee;
                        }
                        cnt50++;
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
                    // 306:7: -> ^( CALL[false] atom_expression ( function_argument )+ )
                    {
                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:306:10: ^( CALL[false] atom_expression ( function_argument )+ )
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:307:7: 
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
                    // 308:7: -> ^( atom_expression )
                    {
                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:308:10: ^( atom_expression )
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:311:1: call_tag : TAG_START ident= namespace_id function_arguments (content= tag_content )? TAG_END -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( function_arguments )? ) ;
    public final OmttParser.call_tag_return call_tag() throws RecognitionException {
        OmttParser.call_tag_return retval = new OmttParser.call_tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAG_START161=null;
        Token TAG_END163=null;
        OmttParser.namespace_id_return ident = null;

        OmttParser.tag_content_return content = null;

        OmttParser.function_arguments_return function_arguments162 = null;


        Object TAG_START161_tree=null;
        Object TAG_END163_tree=null;
        RewriteRuleTokenStream stream_TAG_END=new RewriteRuleTokenStream(adaptor,"token TAG_END");
        RewriteRuleTokenStream stream_TAG_START=new RewriteRuleTokenStream(adaptor,"token TAG_START");
        RewriteRuleSubtreeStream stream_namespace_id=new RewriteRuleSubtreeStream(adaptor,"rule namespace_id");
        RewriteRuleSubtreeStream stream_function_arguments=new RewriteRuleSubtreeStream(adaptor,"rule function_arguments");
        RewriteRuleSubtreeStream stream_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule tag_content");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:312:3: ( TAG_START ident= namespace_id function_arguments (content= tag_content )? TAG_END -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( function_arguments )? ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:312:5: TAG_START ident= namespace_id function_arguments (content= tag_content )? TAG_END
            {
            TAG_START161=(Token)match(input,TAG_START,FOLLOW_TAG_START_in_call_tag2182);  
            stream_TAG_START.add(TAG_START161);

            pushFollow(FOLLOW_namespace_id_in_call_tag2186);
            ident=namespace_id();

            state._fsp--;

            stream_namespace_id.add(ident.getTree());
            pushFollow(FOLLOW_function_arguments_in_call_tag2188);
            function_arguments162=function_arguments();

            state._fsp--;

            stream_function_arguments.add(function_arguments162.getTree());
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:313:5: (content= tag_content )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==CONTENT||LA52_0==OP_DATA_IS_EXPRESSION) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:313:6: content= tag_content
                    {
                    pushFollow(FOLLOW_tag_content_in_call_tag2197);
                    content=tag_content();

                    state._fsp--;

                    stream_tag_content.add(content.getTree());

                    }
                    break;

            }

            TAG_END163=(Token)match(input,TAG_END,FOLLOW_TAG_END_in_call_tag2205);  
            stream_TAG_END.add(TAG_END163);



            // AST REWRITE
            // elements: ident, function_arguments, content
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
            // 315:5: -> ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( function_arguments )? )
            {
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:315:8: ^( CALL[false] $ident ( ^( ARGUMENT $content) )? ( function_arguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Call(CALL, false), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:315:35: ( ^( ARGUMENT $content) )?
                if ( stream_content.hasNext() ) {
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:315:35: ^( ARGUMENT $content)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_2);

                    adaptor.addChild(root_2, stream_content.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_content.reset();
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:315:75: ( function_arguments )?
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:317:10: fragment function_arguments : ( function_argument )* ;
    public final OmttParser.function_arguments_return function_arguments() throws RecognitionException {
        OmttParser.function_arguments_return retval = new OmttParser.function_arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.function_argument_return function_argument164 = null;



        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:318:3: ( ( function_argument )* )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:318:5: ( function_argument )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:318:5: ( function_argument )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=STRING_LITERAL && LA53_0<=REAL_NUMBER)||LA53_0==DATA_START||LA53_0==NULL||(LA53_0>=TRUE && LA53_0<=FALSE)||(LA53_0>=TILDE && LA53_0<=LEFT_PAREN)||LA53_0==VAR_ID) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:318:5: function_argument
            	    {
            	    pushFollow(FOLLOW_function_argument_in_function_arguments2250);
            	    function_argument164=function_argument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function_argument164.getTree());

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
    // $ANTLR end "function_arguments"

    public static class function_argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_argument"
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:320:10: fragment function_argument : ( VAR_ID OP_ASSIGN )? atom_expression -> ^( ARGUMENT atom_expression ( VAR_ID )? ) ;
    public final OmttParser.function_argument_return function_argument() throws RecognitionException {
        OmttParser.function_argument_return retval = new OmttParser.function_argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR_ID165=null;
        Token OP_ASSIGN166=null;
        OmttParser.atom_expression_return atom_expression167 = null;


        Object VAR_ID165_tree=null;
        Object OP_ASSIGN166_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OP_ASSIGN");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:321:3: ( ( VAR_ID OP_ASSIGN )? atom_expression -> ^( ARGUMENT atom_expression ( VAR_ID )? ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:321:5: ( VAR_ID OP_ASSIGN )? atom_expression
            {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:321:5: ( VAR_ID OP_ASSIGN )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==VAR_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==OP_ASSIGN) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:321:6: VAR_ID OP_ASSIGN
                    {
                    VAR_ID165=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_function_argument2266);  
                    stream_VAR_ID.add(VAR_ID165);

                    OP_ASSIGN166=(Token)match(input,OP_ASSIGN,FOLLOW_OP_ASSIGN_in_function_argument2268);  
                    stream_OP_ASSIGN.add(OP_ASSIGN166);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_expression_in_function_argument2272);
            atom_expression167=atom_expression();

            state._fsp--;

            stream_atom_expression.add(atom_expression167.getTree());


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
            // 322:5: -> ^( ARGUMENT atom_expression ( VAR_ID )? )
            {
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:322:8: ^( ARGUMENT atom_expression ( VAR_ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionArgument(ARGUMENT), root_1);

                adaptor.addChild(root_1, stream_atom_expression.nextTree());
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:322:53: ( VAR_ID )?
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:327:1: atom_expression : (atom= atom_with_properties -> $atom) ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )? ;
    public final OmttParser.atom_expression_return atom_expression() throws RecognitionException {
        OmttParser.atom_expression_return retval = new OmttParser.atom_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMA168=null;
        OmttParser.atom_with_properties_return atom = null;

        OmttParser.atom_with_properties_return atom_with_properties169 = null;


        Object COMA168_tree=null;
        RewriteRuleTokenStream stream_COMA=new RewriteRuleTokenStream(adaptor,"token COMA");
        RewriteRuleSubtreeStream stream_atom_with_properties=new RewriteRuleSubtreeStream(adaptor,"rule atom_with_properties");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:328:2: ( (atom= atom_with_properties -> $atom) ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )? )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:328:4: (atom= atom_with_properties -> $atom) ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )?
            {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:328:4: (atom= atom_with_properties -> $atom)
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:328:5: atom= atom_with_properties
            {
            pushFollow(FOLLOW_atom_with_properties_in_atom_expression2307);
            atom=atom_with_properties();

            state._fsp--;

            stream_atom_with_properties.add(atom.getTree());


            // AST REWRITE
            // elements: atom
            // token labels: 
            // rule labels: atom, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom",atom!=null?atom.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 328:31: -> $atom
            {
                adaptor.addChild(root_0, stream_atom.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:329:4: ( ( COMA atom_with_properties )+ -> ^( SEQUENCE ( atom_with_properties )+ ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==COMA) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:329:5: ( COMA atom_with_properties )+
                    {
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:329:5: ( COMA atom_with_properties )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==COMA) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:329:6: COMA atom_with_properties
                    	    {
                    	    COMA168=(Token)match(input,COMA,FOLLOW_COMA_in_atom_expression2320);  
                    	    stream_COMA.add(COMA168);

                    	    pushFollow(FOLLOW_atom_with_properties_in_atom_expression2322);
                    	    atom_with_properties169=atom_with_properties();

                    	    state._fsp--;

                    	    stream_atom_with_properties.add(atom_with_properties169.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt55 >= 1 ) break loop55;
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
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
                    // 329:34: -> ^( SEQUENCE ( atom_with_properties )+ )
                    {
                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:329:37: ^( SEQUENCE ( atom_with_properties )+ )
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:332:1: atom_with_properties : (atom= atom_with_selectors -> $atom) (ps= property_selector -> ^( PROPERTY_SELECT $atom_with_properties $ps) )* ;
    public final OmttParser.atom_with_properties_return atom_with_properties() throws RecognitionException {
        OmttParser.atom_with_properties_return retval = new OmttParser.atom_with_properties_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.atom_with_selectors_return atom = null;

        OmttParser.property_selector_return ps = null;


        RewriteRuleSubtreeStream stream_atom_with_selectors=new RewriteRuleSubtreeStream(adaptor,"rule atom_with_selectors");
        RewriteRuleSubtreeStream stream_property_selector=new RewriteRuleSubtreeStream(adaptor,"rule property_selector");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:333:3: ( (atom= atom_with_selectors -> $atom) (ps= property_selector -> ^( PROPERTY_SELECT $atom_with_properties $ps) )* )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:333:5: (atom= atom_with_selectors -> $atom) (ps= property_selector -> ^( PROPERTY_SELECT $atom_with_properties $ps) )*
            {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:333:5: (atom= atom_with_selectors -> $atom)
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:333:6: atom= atom_with_selectors
            {
            pushFollow(FOLLOW_atom_with_selectors_in_atom_with_properties2354);
            atom=atom_with_selectors();

            state._fsp--;

            stream_atom_with_selectors.add(atom.getTree());


            // AST REWRITE
            // elements: atom
            // token labels: 
            // rule labels: atom, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom",atom!=null?atom.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 333:31: -> $atom
            {
                adaptor.addChild(root_0, stream_atom.nextTree());

            }

            retval.tree = root_0;
            }

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:334:4: (ps= property_selector -> ^( PROPERTY_SELECT $atom_with_properties $ps) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==DOT) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:334:6: ps= property_selector
            	    {
            	    pushFollow(FOLLOW_property_selector_in_atom_with_properties2369);
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
            	    // 335:6: -> ^( PROPERTY_SELECT $atom_with_properties $ps)
            	    {
            	        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:335:9: ^( PROPERTY_SELECT $atom_with_properties $ps)
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
    // $ANTLR end "atom_with_properties"

    public static class atom_with_selectors_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom_with_selectors"
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:338:10: fragment atom_with_selectors : selectable_atom ( sequence_selectors -> ^( ATOM_SELECT selectable_atom ( sequence_selectors )? ) | -> selectable_atom ) ;
    public final OmttParser.atom_with_selectors_return atom_with_selectors() throws RecognitionException {
        OmttParser.atom_with_selectors_return retval = new OmttParser.atom_with_selectors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.selectable_atom_return selectable_atom170 = null;

        OmttParser.sequence_selectors_return sequence_selectors171 = null;


        RewriteRuleSubtreeStream stream_selectable_atom=new RewriteRuleSubtreeStream(adaptor,"rule selectable_atom");
        RewriteRuleSubtreeStream stream_sequence_selectors=new RewriteRuleSubtreeStream(adaptor,"rule sequence_selectors");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:339:2: ( selectable_atom ( sequence_selectors -> ^( ATOM_SELECT selectable_atom ( sequence_selectors )? ) | -> selectable_atom ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:339:4: selectable_atom ( sequence_selectors -> ^( ATOM_SELECT selectable_atom ( sequence_selectors )? ) | -> selectable_atom )
            {
            pushFollow(FOLLOW_selectable_atom_in_atom_with_selectors2408);
            selectable_atom170=selectable_atom();

            state._fsp--;

            stream_selectable_atom.add(selectable_atom170.getTree());
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:340:3: ( sequence_selectors -> ^( ATOM_SELECT selectable_atom ( sequence_selectors )? ) | -> selectable_atom )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==AS||LA58_0==LEFT_SQUARE_PAREN) ) {
                alt58=1;
            }
            else if ( ((LA58_0>=STRING_LITERAL && LA58_0<=DATA_START)||(LA58_0>=EXPRESSION_END && LA58_0<=OP_DATA_IS_EXPRESSION)||(LA58_0>=AND && LA58_0<=IN)||LA58_0==ELSE||LA58_0==NULL||(LA58_0>=TRUE && LA58_0<=FALSE)||LA58_0==COLON||(LA58_0>=DOT && LA58_0<=RIGHT_PAREN)||(LA58_0>=RIGHT_SQUARE_PAREN && LA58_0<=OP_GE)||(LA58_0>=OP_AND && LA58_0<=OP_XOR)||(LA58_0>=OP_CONTEXT && LA58_0<=OP_EXPRESSION_CONTEXT)||LA58_0==OP_CONCAT||LA58_0==VAR_ID) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:340:5: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_atom_with_selectors2414);
                    sequence_selectors171=sequence_selectors();

                    state._fsp--;

                    stream_sequence_selectors.add(sequence_selectors171.getTree());


                    // AST REWRITE
                    // elements: selectable_atom, sequence_selectors
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 341:4: -> ^( ATOM_SELECT selectable_atom ( sequence_selectors )? )
                    {
                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:341:7: ^( ATOM_SELECT selectable_atom ( sequence_selectors )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new AtomSelect(ATOM_SELECT), root_1);

                        adaptor.addChild(root_1, stream_selectable_atom.nextTree());
                        // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:341:49: ( sequence_selectors )?
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
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:342:5: 
                    {

                    // AST REWRITE
                    // elements: selectable_atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 342:5: -> selectable_atom
                    {
                        adaptor.addChild(root_0, stream_selectable_atom.nextTree());

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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:345:10: fragment property_selector : DOT VAR_ID ( sequence_selectors )? ;
    public final OmttParser.property_selector_return property_selector() throws RecognitionException {
        OmttParser.property_selector_return retval = new OmttParser.property_selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT172=null;
        Token VAR_ID173=null;
        OmttParser.sequence_selectors_return sequence_selectors174 = null;


        Object DOT172_tree=null;
        Object VAR_ID173_tree=null;

        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:346:3: ( DOT VAR_ID ( sequence_selectors )? )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:346:5: DOT VAR_ID ( sequence_selectors )?
            {
            root_0 = (Object)adaptor.nil();

            DOT172=(Token)match(input,DOT,FOLLOW_DOT_in_property_selector2456); 
            VAR_ID173=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_property_selector2459); 
            VAR_ID173_tree = (Object)adaptor.create(VAR_ID173);
            adaptor.addChild(root_0, VAR_ID173_tree);

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:346:17: ( sequence_selectors )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==AS||LA59_0==LEFT_SQUARE_PAREN) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:346:17: sequence_selectors
                    {
                    pushFollow(FOLLOW_sequence_selectors_in_property_selector2461);
                    sequence_selectors174=sequence_selectors();

                    state._fsp--;

                    adaptor.addChild(root_0, sequence_selectors174.getTree());

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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:348:10: fragment sequence_selectors : ( type_selector ( sequence_selector )? ( alias )? | sequence_selector ( alias )? | alias );
    public final OmttParser.sequence_selectors_return sequence_selectors() throws RecognitionException {
        OmttParser.sequence_selectors_return retval = new OmttParser.sequence_selectors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OmttParser.type_selector_return type_selector175 = null;

        OmttParser.sequence_selector_return sequence_selector176 = null;

        OmttParser.alias_return alias177 = null;

        OmttParser.sequence_selector_return sequence_selector178 = null;

        OmttParser.alias_return alias179 = null;

        OmttParser.alias_return alias180 = null;



        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:349:2: ( type_selector ( sequence_selector )? ( alias )? | sequence_selector ( alias )? | alias )
            int alt63=3;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==LEFT_SQUARE_PAREN) ) {
                int LA63_1 = input.LA(2);

                if ( ((LA63_1>=STRING_LITERAL && LA63_1<=REAL_NUMBER)||LA63_1==DATA_START||LA63_1==NULL||(LA63_1>=TRUE && LA63_1<=FALSE)||(LA63_1>=TILDE && LA63_1<=LEFT_PAREN)||LA63_1==OP_MINUS||LA63_1==OP_NOT||LA63_1==VAR_ID) ) {
                    alt63=2;
                }
                else if ( (LA63_1==CLASS_ID) ) {
                    alt63=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA63_0==AS) ) {
                alt63=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:349:4: type_selector ( sequence_selector )? ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_selector_in_sequence_selectors2475);
                    type_selector175=type_selector();

                    state._fsp--;

                    adaptor.addChild(root_0, type_selector175.getTree());
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:349:18: ( sequence_selector )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==LEFT_SQUARE_PAREN) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:349:18: sequence_selector
                            {
                            pushFollow(FOLLOW_sequence_selector_in_sequence_selectors2477);
                            sequence_selector176=sequence_selector();

                            state._fsp--;

                            adaptor.addChild(root_0, sequence_selector176.getTree());

                            }
                            break;

                    }

                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:349:37: ( alias )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==AS) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:349:37: alias
                            {
                            pushFollow(FOLLOW_alias_in_sequence_selectors2480);
                            alias177=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias177.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:350:4: sequence_selector ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_sequence_selector_in_sequence_selectors2486);
                    sequence_selector178=sequence_selector();

                    state._fsp--;

                    adaptor.addChild(root_0, sequence_selector178.getTree());
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:350:22: ( alias )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==AS) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:350:22: alias
                            {
                            pushFollow(FOLLOW_alias_in_sequence_selectors2488);
                            alias179=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias179.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:351:4: alias
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alias_in_sequence_selectors2494);
                    alias180=alias();

                    state._fsp--;

                    adaptor.addChild(root_0, alias180.getTree());

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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:353:10: fragment type_selector : LEFT_SQUARE_PAREN type RIGHT_SQUARE_PAREN -> ^( TYPE_SELECT type ) ;
    public final OmttParser.type_selector_return type_selector() throws RecognitionException {
        OmttParser.type_selector_return retval = new OmttParser.type_selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE_PAREN181=null;
        Token RIGHT_SQUARE_PAREN183=null;
        OmttParser.type_return type182 = null;


        Object LEFT_SQUARE_PAREN181_tree=null;
        Object RIGHT_SQUARE_PAREN183_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:354:3: ( LEFT_SQUARE_PAREN type RIGHT_SQUARE_PAREN -> ^( TYPE_SELECT type ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:354:5: LEFT_SQUARE_PAREN type RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN181=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_type_selector2507);  
            stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN181);

            pushFollow(FOLLOW_type_in_type_selector2509);
            type182=type();

            state._fsp--;

            stream_type.add(type182.getTree());
            RIGHT_SQUARE_PAREN183=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_type_selector2511);  
            stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN183);



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
            // 355:4: -> ^( TYPE_SELECT type )
            {
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:355:7: ^( TYPE_SELECT type )
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:357:10: fragment sequence_selector : LEFT_SQUARE_PAREN boolean_expression RIGHT_SQUARE_PAREN -> ^( SEQUENCE_SELECT boolean_expression ) ;
    public final OmttParser.sequence_selector_return sequence_selector() throws RecognitionException {
        OmttParser.sequence_selector_return retval = new OmttParser.sequence_selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE_PAREN184=null;
        Token RIGHT_SQUARE_PAREN186=null;
        OmttParser.boolean_expression_return boolean_expression185 = null;


        Object LEFT_SQUARE_PAREN184_tree=null;
        Object RIGHT_SQUARE_PAREN186_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_SQUARE_PAREN");
        RewriteRuleTokenStream stream_RIGHT_SQUARE_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQUARE_PAREN");
        RewriteRuleSubtreeStream stream_boolean_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expression");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:358:3: ( LEFT_SQUARE_PAREN boolean_expression RIGHT_SQUARE_PAREN -> ^( SEQUENCE_SELECT boolean_expression ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:358:5: LEFT_SQUARE_PAREN boolean_expression RIGHT_SQUARE_PAREN
            {
            LEFT_SQUARE_PAREN184=(Token)match(input,LEFT_SQUARE_PAREN,FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector2536);  
            stream_LEFT_SQUARE_PAREN.add(LEFT_SQUARE_PAREN184);

            pushFollow(FOLLOW_boolean_expression_in_sequence_selector2538);
            boolean_expression185=boolean_expression();

            state._fsp--;

            stream_boolean_expression.add(boolean_expression185.getTree());
            RIGHT_SQUARE_PAREN186=(Token)match(input,RIGHT_SQUARE_PAREN,FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector2540);  
            stream_RIGHT_SQUARE_PAREN.add(RIGHT_SQUARE_PAREN186);



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
            // 359:4: -> ^( SEQUENCE_SELECT boolean_expression )
            {
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:359:7: ^( SEQUENCE_SELECT boolean_expression )
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:361:10: fragment alias : AS VAR_ID -> ^( AS VAR_ID ) ;
    public final OmttParser.alias_return alias() throws RecognitionException {
        OmttParser.alias_return retval = new OmttParser.alias_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AS187=null;
        Token VAR_ID188=null;

        Object AS187_tree=null;
        Object VAR_ID188_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");

        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:362:2: ( AS VAR_ID -> ^( AS VAR_ID ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:362:4: AS VAR_ID
            {
            AS187=(Token)match(input,AS,FOLLOW_AS_in_alias2564);  
            stream_AS.add(AS187);

            VAR_ID188=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_alias2566);  
            stream_VAR_ID.add(VAR_ID188);



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
            // 363:3: -> ^( AS VAR_ID )
            {
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:363:6: ^( AS VAR_ID )
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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:366:1: data_expression : DATA_START ( data_body_atom )* DATA_END -> ^( DATA_START ( data_body_atom )* ) ;
    public final OmttParser.data_expression_return data_expression() throws RecognitionException {
        OmttParser.data_expression_return retval = new OmttParser.data_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DATA_START189=null;
        Token DATA_END191=null;
        OmttParser.data_body_atom_return data_body_atom190 = null;


        Object DATA_START189_tree=null;
        Object DATA_END191_tree=null;
        RewriteRuleTokenStream stream_DATA_END=new RewriteRuleTokenStream(adaptor,"token DATA_END");
        RewriteRuleTokenStream stream_DATA_START=new RewriteRuleTokenStream(adaptor,"token DATA_START");
        RewriteRuleSubtreeStream stream_data_body_atom=new RewriteRuleSubtreeStream(adaptor,"rule data_body_atom");
        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:367:3: ( DATA_START ( data_body_atom )* DATA_END -> ^( DATA_START ( data_body_atom )* ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:367:5: DATA_START ( data_body_atom )* DATA_END
            {
            DATA_START189=(Token)match(input,DATA_START,FOLLOW_DATA_START_in_data_expression2588);  
            stream_DATA_START.add(DATA_START189);

            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:367:16: ( data_body_atom )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==STRING_LITERAL||LA64_0==TAG_START||LA64_0==EXPRESSION_START) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:367:16: data_body_atom
            	    {
            	    pushFollow(FOLLOW_data_body_atom_in_data_expression2590);
            	    data_body_atom190=data_body_atom();

            	    state._fsp--;

            	    stream_data_body_atom.add(data_body_atom190.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            DATA_END191=(Token)match(input,DATA_END,FOLLOW_DATA_END_in_data_expression2593);  
            stream_DATA_END.add(DATA_END191);



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
            // 368:5: -> ^( DATA_START ( data_body_atom )* )
            {
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:368:8: ^( DATA_START ( data_body_atom )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Data(stream_DATA_START.nextToken()), root_1);

                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:368:27: ( data_body_atom )*
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

    public static class selectable_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selectable_atom"
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:371:10: fragment selectable_atom : ( object_atom | data_expression | namespace_id | LEFT_PAREN expression RIGHT_PAREN );
    public final OmttParser.selectable_atom_return selectable_atom() throws RecognitionException {
        OmttParser.selectable_atom_return retval = new OmttParser.selectable_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN195=null;
        Token RIGHT_PAREN197=null;
        OmttParser.object_atom_return object_atom192 = null;

        OmttParser.data_expression_return data_expression193 = null;

        OmttParser.namespace_id_return namespace_id194 = null;

        OmttParser.expression_return expression196 = null;


        Object LEFT_PAREN195_tree=null;
        Object RIGHT_PAREN197_tree=null;

        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:372:3: ( object_atom | data_expression | namespace_id | LEFT_PAREN expression RIGHT_PAREN )
            int alt65=4;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
            case INT_NUMBER:
            case REAL_NUMBER:
            case NULL:
            case TRUE:
            case FALSE:
            case TILDE:
                {
                alt65=1;
                }
                break;
            case DATA_START:
                {
                alt65=2;
                }
                break;
            case VAR_ID:
                {
                alt65=3;
                }
                break;
            case LEFT_PAREN:
                {
                alt65=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:372:5: object_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_object_atom_in_selectable_atom2624);
                    object_atom192=object_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, object_atom192.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:373:5: data_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_data_expression_in_selectable_atom2630);
                    data_expression193=data_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, data_expression193.getTree());

                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:374:5: namespace_id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespace_id_in_selectable_atom2636);
                    namespace_id194=namespace_id();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace_id194.getTree());

                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:375:5: LEFT_PAREN expression RIGHT_PAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LEFT_PAREN195=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_selectable_atom2642); 
                    pushFollow(FOLLOW_expression_in_selectable_atom2645);
                    expression196=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression196.getTree());
                    RIGHT_PAREN197=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_selectable_atom2647); 

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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:377:10: fragment namespace_id : (ns= VAR_ID OP_VIEW )? id= VAR_ID -> ^( IDENT[$id] ( $ns)? ) ;
    public final OmttParser.namespace_id_return namespace_id() throws RecognitionException {
        OmttParser.namespace_id_return retval = new OmttParser.namespace_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ns=null;
        Token id=null;
        Token OP_VIEW198=null;

        Object ns_tree=null;
        Object id_tree=null;
        Object OP_VIEW198_tree=null;
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_OP_VIEW=new RewriteRuleTokenStream(adaptor,"token OP_VIEW");

        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:378:3: ( (ns= VAR_ID OP_VIEW )? id= VAR_ID -> ^( IDENT[$id] ( $ns)? ) )
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:378:5: (ns= VAR_ID OP_VIEW )? id= VAR_ID
            {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:378:5: (ns= VAR_ID OP_VIEW )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==VAR_ID) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==OP_VIEW) ) {
                    alt66=1;
                }
            }
            switch (alt66) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:378:6: ns= VAR_ID OP_VIEW
                    {
                    ns=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id2665);  
                    stream_VAR_ID.add(ns);

                    OP_VIEW198=(Token)match(input,OP_VIEW,FOLLOW_OP_VIEW_in_namespace_id2667);  
                    stream_OP_VIEW.add(OP_VIEW198);


                    }
                    break;

            }

            id=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_namespace_id2673);  
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
            // 379:5: -> ^( IDENT[$id] ( $ns)? )
            {
                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:379:8: ^( IDENT[$id] ( $ns)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new Ident(IDENT, id), root_1);

                // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:379:28: ( $ns)?
                if ( stream_ns.hasNext() ) {
                    adaptor.addChild(root_1, stream_ns.nextNode());

                }
                stream_ns.reset();

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
    // $ANTLR end "namespace_id"

    public static class object_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "object_atom"
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:383:1: object_atom : ( number_atom | STRING_LITERAL | ( NULL | TILDE ) | ( TRUE | FALSE ) );
    public final OmttParser.object_atom_return object_atom() throws RecognitionException {
        OmttParser.object_atom_return retval = new OmttParser.object_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING_LITERAL200=null;
        Token NULL201=null;
        Token TILDE202=null;
        Token TRUE203=null;
        Token FALSE204=null;
        OmttParser.number_atom_return number_atom199 = null;


        Object STRING_LITERAL200_tree=null;
        Object NULL201_tree=null;
        Object TILDE202_tree=null;
        Object TRUE203_tree=null;
        Object FALSE204_tree=null;

        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:384:3: ( number_atom | STRING_LITERAL | ( NULL | TILDE ) | ( TRUE | FALSE ) )
            int alt69=4;
            switch ( input.LA(1) ) {
            case INT_NUMBER:
            case REAL_NUMBER:
                {
                alt69=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt69=2;
                }
                break;
            case NULL:
            case TILDE:
                {
                alt69=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt69=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:384:5: number_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_atom_in_object_atom2705);
                    number_atom199=number_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, number_atom199.getTree());

                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:385:5: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL200=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_object_atom2711); 
                    STRING_LITERAL200_tree = new Literal(STRING_LITERAL200) ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_LITERAL200_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:386:5: ( NULL | TILDE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:386:5: ( NULL | TILDE )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==NULL) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==TILDE) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:386:6: NULL
                            {
                            NULL201=(Token)match(input,NULL,FOLLOW_NULL_in_object_atom2722); 
                            NULL201_tree = new Literal(NULL201) ;
                            root_0 = (Object)adaptor.becomeRoot(NULL201_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:386:23: TILDE
                            {
                            TILDE202=(Token)match(input,TILDE,FOLLOW_TILDE_in_object_atom2730); 
                            TILDE202_tree = new Literal(TILDE202) ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE202_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:387:5: ( TRUE | FALSE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:387:5: ( TRUE | FALSE )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==TRUE) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==FALSE) ) {
                        alt68=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:387:6: TRUE
                            {
                            TRUE203=(Token)match(input,TRUE,FOLLOW_TRUE_in_object_atom2743); 
                            TRUE203_tree = new Literal(TRUE203) ;
                            root_0 = (Object)adaptor.becomeRoot(TRUE203_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:387:23: FALSE
                            {
                            FALSE204=(Token)match(input,FALSE,FOLLOW_FALSE_in_object_atom2751); 
                            FALSE204_tree = new Literal(FALSE204) ;
                            root_0 = (Object)adaptor.becomeRoot(FALSE204_tree, root_0);


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
    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:390:1: number_atom : ( INT_NUMBER | REAL_NUMBER );
    public final OmttParser.number_atom_return number_atom() throws RecognitionException {
        OmttParser.number_atom_return retval = new OmttParser.number_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_NUMBER205=null;
        Token REAL_NUMBER206=null;

        Object INT_NUMBER205_tree=null;
        Object REAL_NUMBER206_tree=null;

        try {
            // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:391:3: ( INT_NUMBER | REAL_NUMBER )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==INT_NUMBER) ) {
                alt70=1;
            }
            else if ( (LA70_0==REAL_NUMBER) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:391:5: INT_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    INT_NUMBER205=(Token)match(input,INT_NUMBER,FOLLOW_INT_NUMBER_in_number_atom2769); 
                    INT_NUMBER205_tree = new Literal(INT_NUMBER205) ;
                    root_0 = (Object)adaptor.becomeRoot(INT_NUMBER205_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/endrju/.workspace/ObjectTemplates Compiler/src/org/ot/lang/grammar/ObjectTemplatesParser.g:392:5: REAL_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    REAL_NUMBER206=(Token)match(input,REAL_NUMBER,FOLLOW_REAL_NUMBER_in_number_atom2779); 
                    REAL_NUMBER206_tree = new Literal(REAL_NUMBER206) ;
                    root_0 = (Object)adaptor.becomeRoot(REAL_NUMBER206_tree, root_0);


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
    protected DFA49 dfa49 = new DFA49(this);
    static final String DFA20_eotS =
        "\17\uffff";
    static final String DFA20_eofS =
        "\17\uffff";
    static final String DFA20_minS =
        "\1\31\1\uffff\2\31\2\uffff\11\31";
    static final String DFA20_maxS =
        "\1\143\1\uffff\2\143\2\uffff\3\143\1\145\4\143\1\145";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\11\uffff";
    static final String DFA20_specialS =
        "\17\uffff}>";
    static final String[] DFA20_transitionS = {
            "\3\5\3\uffff\1\5\20\uffff\1\4\2\uffff\1\5\7\uffff\1\5\1\uffff"+
            "\1\5\1\1\2\5\2\uffff\1\1\5\uffff\1\2\1\5\4\uffff\1\5\14\uffff"+
            "\1\5\6\uffff\1\3",
            "",
            "\7\5\2\uffff\2\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\5\uffff\7\5\1\uffff\12\5\1\uffff\3\5\1\uffff\2\5\1\uffff"+
            "\1\5\2\uffff\1\6",
            "\7\5\2\uffff\2\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\2\uffff\1\1\2\uffff\3\5\1\7\3\5\1\uffff\2\5\1\10\7\5\1"+
            "\1\3\5\1\uffff\4\5\2\uffff\1\6",
            "",
            "",
            "\7\5\2\uffff\2\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\2\uffff\1\1\2\uffff\3\5\1\7\3\5\1\uffff\2\5\1\10\7\5\1"+
            "\11\3\5\1\uffff\4\5\2\uffff\1\6",
            "\7\5\2\uffff\2\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\5\uffff\7\5\1\uffff\12\5\1\uffff\3\5\1\uffff\2\5\1\uffff"+
            "\1\5\2\uffff\1\6",
            "\3\5\3\uffff\1\5\35\uffff\1\5\1\uffff\2\5\2\uffff\1\1\5\uffff"+
            "\1\12\1\5\4\uffff\1\5\23\uffff\1\13",
            "\3\5\3\uffff\1\5\35\uffff\1\5\1\uffff\2\5\10\uffff\2\5\30\uffff"+
            "\1\5\1\uffff\1\1",
            "\7\5\2\uffff\2\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\5\uffff\7\5\1\uffff\12\5\1\uffff\3\5\1\uffff\2\5\1\uffff"+
            "\1\5\2\uffff\1\14",
            "\7\5\2\uffff\2\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\2\uffff\1\1\2\uffff\3\5\1\15\3\5\1\uffff\2\5\1\10\7\5\1"+
            "\1\3\5\1\uffff\4\5\2\uffff\1\14",
            "\7\5\2\uffff\2\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\2\uffff\1\1\2\uffff\3\5\1\15\3\5\1\uffff\2\5\1\10\7\5\1"+
            "\16\3\5\1\uffff\4\5\2\uffff\1\14",
            "\7\5\2\uffff\2\5\15\uffff\2\5\6\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\2\5\5\uffff\7\5\1\uffff\12\5\1\uffff\3\5\1\uffff\2\5\1\uffff"+
            "\1\5\2\uffff\1\14",
            "\3\5\3\uffff\1\5\35\uffff\1\5\1\uffff\2\5\10\uffff\2\5\30\uffff"+
            "\1\5\1\uffff\1\1"
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
    static final String DFA49_eotS =
        "\22\uffff";
    static final String DFA49_eofS =
        "\22\uffff";
    static final String DFA49_minS =
        "\1\34\1\uffff\1\31\2\uffff\2\31\2\uffff\11\31";
    static final String DFA49_maxS =
        "\1\140\1\uffff\1\145\2\uffff\2\143\2\uffff\3\143\1\145\4\143\1\145";
    static final String DFA49_acceptS =
        "\1\uffff\1\5\1\uffff\1\4\1\1\2\uffff\1\2\1\3\11\uffff";
    static final String DFA49_specialS =
        "\22\uffff}>";
    static final String[] DFA49_transitionS = {
            "\3\1\3\uffff\2\1\15\uffff\2\1\2\uffff\1\1\16\uffff\1\1\3\uffff"+
            "\1\1\2\uffff\1\1\1\uffff\13\1\1\uffff\3\1\1\uffff\1\2\1\3\1"+
            "\uffff\1\1",
            "",
            "\3\4\3\uffff\1\4\35\uffff\1\4\1\7\2\4\2\uffff\1\7\5\uffff\1"+
            "\5\1\4\30\uffff\1\6\1\uffff\1\10",
            "",
            "",
            "\7\4\2\uffff\2\4\15\uffff\2\4\2\uffff\1\4\3\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\3\uffff\1\4\1\uffff\22\4\1\uffff\3\4\1\uffff"+
            "\2\4\1\uffff\1\4\2\uffff\1\11",
            "\7\4\2\uffff\2\4\15\uffff\2\4\2\uffff\1\4\3\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\2\uffff\1\7\1\4\1\uffff\3\4\1\12\6\4\1\13\7"+
            "\4\1\7\3\4\1\uffff\4\4\2\uffff\1\11",
            "",
            "",
            "\7\4\2\uffff\2\4\15\uffff\2\4\2\uffff\1\4\3\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\2\uffff\1\7\1\4\1\uffff\3\4\1\12\6\4\1\13\7"+
            "\4\1\14\3\4\1\uffff\4\4\2\uffff\1\11",
            "\7\4\2\uffff\2\4\15\uffff\2\4\2\uffff\1\4\3\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\3\uffff\1\4\1\uffff\22\4\1\uffff\3\4\1\uffff"+
            "\2\4\1\uffff\1\4\2\uffff\1\11",
            "\3\4\3\uffff\1\4\35\uffff\1\4\1\uffff\2\4\2\uffff\1\7\5\uffff"+
            "\1\15\1\4\4\uffff\1\4\23\uffff\1\16",
            "\3\4\3\uffff\1\4\35\uffff\1\4\1\uffff\2\4\10\uffff\2\4\30\uffff"+
            "\1\4\1\uffff\1\7",
            "\7\4\2\uffff\2\4\15\uffff\2\4\2\uffff\1\4\3\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\3\uffff\1\4\1\uffff\22\4\1\uffff\3\4\1\uffff"+
            "\2\4\1\uffff\1\4\2\uffff\1\17",
            "\7\4\2\uffff\2\4\15\uffff\2\4\2\uffff\1\4\3\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\2\uffff\1\7\1\4\1\uffff\3\4\1\20\6\4\1\13\7"+
            "\4\1\7\3\4\1\uffff\4\4\2\uffff\1\17",
            "\7\4\2\uffff\2\4\15\uffff\2\4\2\uffff\1\4\3\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\2\uffff\1\7\1\4\1\uffff\3\4\1\20\6\4\1\13\7"+
            "\4\1\21\3\4\1\uffff\4\4\2\uffff\1\17",
            "\7\4\2\uffff\2\4\15\uffff\2\4\2\uffff\1\4\3\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\3\uffff\1\4\1\uffff\22\4\1\uffff\3\4\1\uffff"+
            "\2\4\1\uffff\1\4\2\uffff\1\17",
            "\3\4\3\uffff\1\4\35\uffff\1\4\1\uffff\2\4\10\uffff\2\4\30\uffff"+
            "\1\4\1\uffff\1\7"
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "()* loopback of 286:5: ( OP_CONTEXT atom_expression arguments= function_arguments -> ^( CALL[true] atom_expression ^( ARGUMENT $context_expression) ( $arguments)? ) | OP_CONTEXT lambda_expression_no_context -> ^( CALL[true] lambda_expression_no_context ^( ARGUMENT $context_expression) ) | OP_CONTEXT single_type -> ^( CAST single_type $context_expression) | OP_EXPRESSION_CONTEXT ce= functional_expression -> ^( OP_EXPRESSION_CONTEXT $context_expression $ce) )*";
        }
    }
 

    public static final BitSet FOLLOW_header_in_program53 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_definitions_in_program55 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_declaration_in_header93 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_use_declarations_in_header100 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_import_declarations_in_header106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_module_declaration119 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_MODULE_in_module_declaration121 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_module_id_in_module_declaration123 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_module_declaration125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_use_declarations155 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_use_declaration_in_use_declarations158 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_use_declarations161 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TAG_START_in_import_declarations193 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_import_declaration_in_import_declarations196 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_import_declarations199 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_declaration231 = new BitSet(new long[]{0x0000000000000000L,0x0000002800010000L});
    public static final BitSet FOLLOW_external_class_name_in_import_declaration235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_use_declaration264 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_module_id_in_use_declaration266 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_AS_in_use_declaration268 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_VAR_ID_in_use_declaration270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_external_class_name302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_DOT_in_external_class_name304 = new BitSet(new long[]{0x0000000000000000L,0x0000002800010000L});
    public static final BitSet FOLLOW_set_in_external_class_name309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_module_id330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_DOT_in_module_id332 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_VAR_ID_in_module_id337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_definition_in_definitions353 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TAG_START_in_tag_definition376 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_DEF_in_tag_definition378 = new BitSet(new long[]{0x0100000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_definition_signature_in_tag_definition380 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_tag_definition386 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_tag_definition390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_signature422 = new BitSet(new long[]{0x0000000000000002L,0x0000000800200208L});
    public static final BitSet FOLLOW_DEFAULT_in_definition_signature424 = new BitSet(new long[]{0x0000000000000002L,0x0000000800200208L});
    public static final BitSet FOLLOW_OP_LE_in_definition_signature428 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_single_type_in_definition_signature432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_OP_GE_in_definition_signature434 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000208L});
    public static final BitSet FOLLOW_definition_argument_in_definition_signature438 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000208L});
    public static final BitSet FOLLOW_OP_FUNCTION_DEFINITION_in_definition_signature442 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_type_in_definition_signature446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_definition_argument500 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_argument505 = new BitSet(new long[]{0x0000000000000002L,0x0000000001010000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_argument508 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_type_in_definition_argument510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_definition_argument514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content560 = new BitSet(new long[]{0x0000000222000002L});
    public static final BitSet FOLLOW_data_body_atom_in_tag_content566 = new BitSet(new long[]{0x0000000222000002L});
    public static final BitSet FOLLOW_OP_DATA_IS_EXPRESSION_in_tag_content589 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CONTENT_in_tag_content591 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_expression_in_tag_content597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_data_body_atom618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_inside_data_in_data_body_atom628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_inside_data_in_data_body_atom634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_START_in_expression_inside_data649 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_expression_in_expression_inside_data652 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_EXPRESSION_END_in_expression_inside_data654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_tag_in_tag_inside_data670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_tag_in_tag_inside_data676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_tag_in_tag_inside_data682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_tag_in_tag_inside_data688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expression_in_expression704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_expression_in_expression710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concatence_expression_in_expression716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_def_in_expression731 = new BitSet(new long[]{0x0100000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression735 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_AND_in_def_in_expression742 = new BitSet(new long[]{0x0100000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_definition_inside_expression_in_def_in_expression746 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_expression754 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008619L});
    public static final BitSet FOLLOW_COLON_in_def_in_expression756 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_expression_in_def_in_expression761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_expression793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_definition_inside_expression795 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_expression824 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_expression826 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_expression_in_definition_inside_expression831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag864 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_DEF_in_def_in_tag866 = new BitSet(new long[]{0x0100000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag870 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag877 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_AND_in_def_in_tag879 = new BitSet(new long[]{0x0100000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_definition_inside_tag_in_def_in_tag883 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_TAG_START_in_def_in_tag891 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_IN_in_def_in_tag893 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_def_in_tag897 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_def_in_tag903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_signature_in_definition_inside_tag935 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_definition_inside_tag939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_definition_inside_tag963 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_definition_inside_tag965 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_expression_in_definition_inside_tag967 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_CONTENT_in_definition_inside_tag970 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_definition_inside_tag972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAMBDA_in_lambda_expression1011 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000210L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression1013 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000210L});
    public static final BitSet FOLLOW_COLON_in_lambda_expression1016 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_expression_in_lambda_expression1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression1046 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000208L});
    public static final BitSet FOLLOW_OP_FUNCTION_DEFINITION_in_lambda_expression1049 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_expression_in_lambda_expression1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAMBDA_in_lambda_expression_no_context1084 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000200L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression_no_context1086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_lambda_expression_no_context1088 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_atom_expression_in_lambda_expression_no_context1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_argument_in_lambda_expression_no_context1117 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000208L});
    public static final BitSet FOLLOW_OP_FUNCTION_DEFINITION_in_lambda_expression_no_context1120 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_atom_expression_in_lambda_expression_no_context1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_ID_in_type1158 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_type1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_ID_in_single_type1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expression_in_concatence_expression1219 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OP_CONCAT_in_concatence_expression1233 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_control_expression_in_concatence_expression1237 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_if_expression_in_control_expression1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_expression_in_control_expression1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_control_expression1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_expression1292 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_boolean_expression_in_if_expression1296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_if_expression1298 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_control_expression_in_if_expression1306 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_expression1312 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008619L});
    public static final BitSet FOLLOW_COLON_in_if_expression1314 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_control_expression_in_if_expression1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_if_tag1357 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_IF_in_if_tag1359 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_boolean_expression_in_if_tag1363 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_if_tag1371 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_TAG_START_in_if_tag1379 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ELSE_in_if_tag1381 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_if_tag1391 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_if_tag1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_map_expression1440 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_boolean_expression_in_map_expression1444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_map_expression1446 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_control_expression_in_map_expression1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_in_map_tag1485 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_MAP_in_map_tag1487 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_expression_in_map_tag1491 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_tag_content_in_map_tag1499 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_map_tag1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_binary_expression_in_boolean_expression1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression1550 = new BitSet(new long[]{0x0000000000000002L,0x000000000E000000L});
    public static final BitSet FOLLOW_boolean_binary_operator_in_boolean_binary_expression1553 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_boolean_unary_expression_in_boolean_binary_expression1556 = new BitSet(new long[]{0x0000000000000002L,0x000000000E000000L});
    public static final BitSet FOLLOW_boolean_unary_operator_in_boolean_unary_expression1572 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_comparsion_expression_in_boolean_unary_expression1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_AND_in_boolean_binary_operator1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_OR_in_boolean_binary_operator1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_XOR_in_boolean_binary_operator1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_in_boolean_unary_operator1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression1651 = new BitSet(new long[]{0x0000000000000002L,0x0000000000FC0000L});
    public static final BitSet FOLLOW_boolean_comparsion_operator_in_boolean_comparsion_expression1654 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_additive_expression_in_boolean_comparsion_expression1657 = new BitSet(new long[]{0x0000000000000002L,0x0000000000FC0000L});
    public static final BitSet FOLLOW_OP_EQUAL_in_boolean_comparsion_operator1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_EQUAL_in_boolean_comparsion_operator1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LE_in_boolean_comparsion_operator1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LEQ_in_boolean_comparsion_operator1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GE_in_boolean_comparsion_operator1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GEQ_in_boolean_comparsion_operator1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1743 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_OP_PLUS_in_additive_expression1759 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_OP_MINUS_in_additive_expression1773 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1793 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression1813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030100L});
    public static final BitSet FOLLOW_OP_MULTIPLY_in_multiplicative_expression1823 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_SLASH_in_multiplicative_expression1837 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_OP_MODULO_in_multiplicative_expression1851 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_negative_expression_in_multiplicative_expression1871 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030100L});
    public static final BitSet FOLLOW_OP_MINUS_in_negative_expression1890 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_context_expression_in_negative_expression1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_context_expression_in_negative_expression1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functional_expression_in_context_expression1927 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_OP_CONTEXT_in_context_expression1941 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_atom_expression_in_context_expression1943 = new BitSet(new long[]{0xE80900008E000000L,0x0000000870008609L});
    public static final BitSet FOLLOW_function_arguments_in_context_expression1947 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_OP_CONTEXT_in_context_expression1987 = new BitSet(new long[]{0x4000000000000000L,0x0000000800000208L});
    public static final BitSet FOLLOW_lambda_expression_no_context_in_context_expression1989 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_OP_CONTEXT_in_context_expression2025 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_single_type_in_context_expression2027 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_OP_EXPRESSION_CONTEXT_in_context_expression2055 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_functional_expression_in_context_expression2059 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_call_expression_in_functional_expression2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expression_in_call_expression2114 = new BitSet(new long[]{0xE80900008E000002L,0x0000000810008609L});
    public static final BitSet FOLLOW_function_argument_in_call_expression2122 = new BitSet(new long[]{0xE80900008E000002L,0x0000000810008609L});
    public static final BitSet FOLLOW_TAG_START_in_call_tag2182 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_namespace_id_in_call_tag2186 = new BitSet(new long[]{0xE8090008DE000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_function_arguments_in_call_tag2188 = new BitSet(new long[]{0x0000000850000000L});
    public static final BitSet FOLLOW_tag_content_in_call_tag2197 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TAG_END_in_call_tag2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_argument_in_function_arguments2250 = new BitSet(new long[]{0xE80900008E000002L,0x0000000810008609L});
    public static final BitSet FOLLOW_VAR_ID_in_function_argument2266 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_OP_ASSIGN_in_function_argument2268 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_atom_expression_in_function_argument2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_with_properties_in_atom_expression2307 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMA_in_atom_expression2320 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_atom_with_properties_in_atom_expression2322 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_atom_with_selectors_in_atom_with_properties2354 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_property_selector_in_atom_with_properties2369 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_selectable_atom_in_atom_with_selectors2408 = new BitSet(new long[]{0x0200000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_sequence_selectors_in_atom_with_selectors2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_property_selector2456 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_VAR_ID_in_property_selector2459 = new BitSet(new long[]{0x0200000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_sequence_selectors_in_property_selector2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_selector_in_sequence_selectors2475 = new BitSet(new long[]{0x0200000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors2477 = new BitSet(new long[]{0x0200000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_selector_in_sequence_selectors2486 = new BitSet(new long[]{0x0200000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alias_in_sequence_selectors2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_type_selector2507 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_type_in_type_selector2509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_type_selector2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_PAREN_in_sequence_selector2536 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_boolean_expression_in_sequence_selector2538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_PAREN_in_sequence_selector2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_alias2564 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_VAR_ID_in_alias2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_START_in_data_expression2588 = new BitSet(new long[]{0x0000000322000000L});
    public static final BitSet FOLLOW_data_body_atom_in_data_expression2590 = new BitSet(new long[]{0x0000000322000000L});
    public static final BitSet FOLLOW_DATA_END_in_data_expression2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_atom_in_selectable_atom2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_expression_in_selectable_atom2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_id_in_selectable_atom2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_selectable_atom2642 = new BitSet(new long[]{0xE80900008E000000L,0x0000000810008609L});
    public static final BitSet FOLLOW_expression_in_selectable_atom2645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_selectable_atom2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id2665 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_OP_VIEW_in_namespace_id2667 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_VAR_ID_in_namespace_id2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_atom_in_object_atom2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_object_atom2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_object_atom2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_object_atom2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_object_atom2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_object_atom2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_NUMBER_in_number_atom2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_NUMBER_in_number_atom2779 = new BitSet(new long[]{0x0000000000000002L});

}