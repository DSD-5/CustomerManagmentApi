//package com.telefonica.CustomerManagement.commons;
package com.tutiempolibro.customermanagement.commons;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ErrorConstant {
	public static final String GENERIC = "0000";
	public static final String BE_1000 = "1000";
	public static final String BE_1001 = "1001";

	public static final String SVC1003_CODE = "SVC1003";
	public static final String SVC1003_EXCEPTION = "Invalid requested Operation";
	public static final String SVC1003_DESCRIPTION = "Requested operation does not exist";
	public static final String SVC1003_TEXT = "Requested HTTP Method Operation does not exist";

	public static final String SVC1000_CODE = "SVC1000";
	public static final String SVC1000_EXCEPTION = "Missing mandatory parameter";
	public static final String SVC1000_DESCRIPTION = "API Request withour mandatory field";
	public static final String SVC1000_TEXT = "Missing mandatory parameter: ";

	public static final String SVC1001_CODE = "SVC1001";
	public static final String SVC1001_EXCEPTION = "Invalid parameter";
	public static final String SVC1001_DESCRIPTION = "API Request with an element not conforming to swagger definitions or to a list a allowed Query Parameters";
	public static final String SVC1001_TEXT = "Invalid parameter: ";

	public static final String SVR1000_CODE = "SVR1000";
	public static final String SVR1000_EXCEPTION = "Generic Server Fault";
	public static final String SVR1000_DESCRIPTION = "There was a problem in the Service Providers network that prevented to carry out the request";
	public static final String SVR1000_TEXT = "Generic Server Error";

	public static final String SVC1006_CODE = "SVC1006";
	public static final String SVC1006_EXCEPTION = "Not existing Resource Id";
	public static final String SVC1006_DESCRIPTION = "Reference to a resource {0} identifier wich does not exist";
	public static final String SVC1006_TEXT = "Resource does not exist";

	public static final String HREF_PRODUCT_INSTANCE_TYPE = "/productInventory/v2/products/";
	public static final String HREF_BILLING_ACCOUNT = "/accounts/v3/accounts/";
	public static final String HREF_PRODUCT_OFFERING = "/productCatalog/v2/offerings/";
	public static final String HREF_REALIZING_RESOURCE = "/resourceInventoryManagement/v2/";

	public static final String MOBILE_QUOTA_VOICE = "Voz";
	public static final String MOBILE_QUOTA_DATA = "Datos";
	public static final String MOBILE_QUOTA_SMS = "SMS";

	public static final String BILLINGACCOUNT_NAME_ALDM_FINANCIAL = "Financial Account";
	public static final String BILLINGACCOUNT_NAME_STC_FINANCIAL = "Cuenta Corporativa";
	public static final String BILLINGACCOUNT_NAME_MOBILE_BILLINGCUSTOMER = "Billing Customer";
	public static final String BILLINGACCOUNT_NAME_BILLINGARRANGEMENT = "Billing Arrangement";

	public static final String INDICADOR_PLAN = "1";

	public static final String FORMAT_DATETIME = "yyyy-MM-dd'T'HH:mm:ss";

	public static final String SHARINGDATACONSUMER_VALUE = "Sharing Data Consumer";
	public static final String SHARINGDATAOWNER_VALUE = "Sharing Data Owner";

	public static final String SHARINGDATACONSUMER_NAME = "SharingDataConsumer";
	public static final String SHARINGDATAOWNER_NAME = "SharingDataOwner";

	public static final String APPSILIMITADA_PRODUCTTYPE_SVA = "sva";

	public static final String PRODUCTPRICE_DESCRIPTION = "Plan";
	public static final String PRODUCTPRICE_TAXTINCLUDED = "true";
	public static final String PRODUCTPRICE_TAXID = "1";
	public static final String COMPONENT_ENTITYTYPE = "WRLS";
	public static final String COMPONENT_REFERREDTYPE = "Movil";

	public static final List<String> LST_ATTRIB_PLANS = Collections
			.unmodifiableList(Arrays.asList("LimitedeConsumoAdicional", "BeneficiosdelPlan", "Duos", "PLANDAYSDURATION",
					"AppsIlimitadas", "CantidaddeDatostipoO"));

	public static final String PRODUCTTYPE_MOBILE = "mobile";

	public static final String PLACE_ENTITYTYPE = "address";

	public static final String PRINCIPALCOMPONENT_ISCUSTOMERVISIBLE = "true";

	public static final String CARACTERISTICA_ORIGEN_AMDOCS = "AMDOCS";
	public static final String CARACTERISTICA_INDICADORMT_0 = "0";
	public static final String CARACTERISTICA_INDICADORMT_1 = "1";

	public static final String BOATTRIBUTESLIST_NOMBREDEPLAN = "NombredelPlan";

	public static final String ORIGEN_ALDM = "ALDM";
	public static final String ORIGEN_STC = "STC";

	public static final String TIPOCLIENTE_BD_EMPRESAS = "Corporativo";
	public static final String TIPOCLIENTE_EMPRESAS = "Empresas";
}
