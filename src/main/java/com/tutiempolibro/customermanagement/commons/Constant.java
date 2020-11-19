package com.tutiempolibro.customermanagement.commons;

public class Constant {
	
	/**
     * Valores Fijos
     */
	final static public String REASONSUBREASON = "-";
	final static public String ASSESOR_TYPE = "agent";
	final static public String USERCALLER_ID = "unknown";
	final static public String USERCALLER_TYPE = "caller";
	final static public String ANI_KEY = "ANI";
	final static public String TYPEPRODUCT_KEY = "tipoProducto";
	final static public String RESPONSE_STATUS_OK = "OK";
	final static public String STATUS_KEY = "estadoAvería";
	final static public String SVC100_ERROR = "SVC100";
	final static public String SVC100_MOREINFO = "API Request with an element not conforming to Swagger definitions or to a list of allowed Query Parameters.";
	final static public String SVC100_USERMESSAGE = "Invalid parameter";
	
	
    /**
     * Gestión de Log y entornos.
     */
    public static final String NEW_LINE		      = System.getProperty("line.separator");
    public static final String CLASS_LOG_LABEL	      = "[Class]: ";
    public static final String METHOD_LOG_LABEL	      = "[Method]: ";
    public static final String PARAMETERS_LOG_LABEL   = "(...)";
    public static final String INPUT_PARAMETERS_LABEL = "[Input Params]: ";
    public static final String INPUT_PARAMETER_LABEL  = "[Input]: ";
    public static final String OUTPUT_LABEL	      = "[Output]: ";
    public static final String SEPARATOR	      = "===================================================================================================================================================================================";
    public static final String EXCEPTION_WAS_THROWN   = "-> An exception was thrown by method: ";
    public static final String PARSE_JSON_RESPONSE    = "[No se pudo analizar el JSON del response del método (Verificar el Log)]";
    public static final String DEV_ENVIRONMENT	      = "dev";
	
    /**
     * Formato de Fecha
     */
    public static final String DATE_TIME = "dd/MM/yy ' ' HH:mm:ss";
    public static final String TIME	 = "HH:mm:ss";
    
}
