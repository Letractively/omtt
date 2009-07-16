package pl.omtt.eclipse.ui.scanners;

public interface ITokens {
	public final static String PREFIX = "__Ot_Token_";

	// Tags
	public static final String TAG_DEFAULT = PREFIX+"Tag_Default";
	public static final String TAG_OPEN_CHAR = PREFIX+"Tag_Open_Char";
	public static final String TAG_OUTPUT_MODIFIER = PREFIX+"Tag_Output_Modifier";
	public static final String TAG_NAME = PREFIX+"Tag_Name";

	public static final String TAG_PARAM_DEFAULT = PREFIX+"Tag_Param_Default";
	public static final String TAG_PARAM_OPEN_CHAR = PREFIX+"Tag_Param_Open_Char";
	public static final String TAG_PARAM_NAME = PREFIX+"Tag_Param_Name";
	
	// Expressions
	public final static String EXPR_DEFAULT = PREFIX+"Expr_Default";
	public final static String EXPR_KEYWORD = PREFIX+"Expr_Keyword";
	public final static String EXPR_KEYWORD_IT = PREFIX+"Expr_Keyword_It";
	public final static String EXPR_CLASS = PREFIX+"Expr_Class";
	public final static String EXPR_NUMBER = PREFIX+"Expr_Number";
	public final static String EXPR_IDENT = PREFIX+"Expr_Ident";

	// Comments
	public final static String COMMENT = PREFIX+"Comment";
	public final static String COMMENT_JAVADOC = PREFIX+"Comment_Javadoc";

	// Data
	public static final String DATA_DEFAULT = PREFIX+"Data_Default";
	public static final String DATA_STRING = PREFIX+"Data_String";
	public static final String DATA_XML_TAG_NAME = PREFIX+"Data_Xml_Tag_Name";
	public static final String DATA_EXPR_BRACKET = PREFIX+"Data_Expr_Bracket";
}
