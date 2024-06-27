package com.example.myapplication.e.a;

import android.content.Context;
import android.content.SharedPreferences;
//ViRaj_imports

public class ce {

    //ViRaj_int

    //ViRaj_fun_A_42
    public static String KEY_RAZORPAY_LIVE_KEY_rrrrr = "reachusEmail";
    //ViRaj_fun_A_11
    public static String KEY_MIN_OFFER_SUM_rrrrr = "minoffersumAmount";
    //ViRaj_fun_A_24
    public static String KEY_ADD_COINS_BHIM_NAME_rrrrr = "addcoinsUpiName";
    //ViRaj_fun_A_27
    public static boolean getSharedBooleanStatus_rrrrr(Context context_rrrrr, String KEY_rrrrr) {  //ViRaj_if_4
SharedPreferences sharedPreferences_rrrrr = getshrprefMthd_rrrrr(context_rrrrr);return sharedPreferences_rrrrr.getBoolean(KEY_rrrrr, false);}
    //ViRaj_fun_A_01
    public static String getPosterImage_rrrrr(Context context_rrrrr, String KEY_rrrrr) {  //ViRaj_if_4
SharedPreferences sharedPreferences = getshrprefMthd_rrrrr(context_rrrrr);return sharedPreferences.getString(KEY_rrrrr, null);}
    //ViRaj_fun_A_29
    public static void setBinalData_rrrrr(Context context_rrrrr, String KEY_rrrrr, boolean data) {  //ViRaj_if_4
SharedPreferences.Editor editor_rrrrr = getshrprefMthd_rrrrr(context_rrrrr).edit(); editor_rrrrr.putBoolean(KEY_rrrrr, data); editor_rrrrr.apply();}
    //ViRaj_fun_A_26
    public static String KEY_POSTER_IMAGES3_rrrrr = "posterImages3";
    //ViRaj_fun_A_13
    public static String getLoginInToken_rrrrr(Context context_rrrrr) {  //ViRaj_if_4
SharedPreferences sharedPreferences_rrrrr = getshrprefMthd_rrrrr(context_rrrrr);return sharedPreferences_rrrrr.getString(KEY_SIGNIN_TOKEN_rrrrr, null);}
    //ViRaj_fun_A_30
    public static String KEY_B_N_rrrrr = "bName";
    //ViRaj_fun_A_09
    public static String KEY_BANK_USER_NAME_rrrrr = "bUserName";
    //ViRaj_fun_A_39
    public static String KEY_MAX_EXTRACT_COINS_rrrrr = "maxextractcoins";
    //ViRaj_fun_A_33
    public static boolean getBinalObject_rrrrr(Context context_rrrrr, String KEY_rrrrr, boolean defaultValue_rrrrr) {  //ViRaj_if_4
SharedPreferences sharedPreferences_rrrrr = getshrprefMthd_rrrrr(context_rrrrr);return sharedPreferences_rrrrr.getBoolean(KEY_rrrrr, defaultValue_rrrrr);}
    //ViRaj_fun_A_49
    public static void setMaxMinData_rrrrr(Context context_rrrrr, String KEY_rrrrr, String data_rrrrr) {  //ViRaj_if_4
SharedPreferences.Editor editor_rrrrr = getshrprefMthd_rrrrr(context_rrrrr).edit();editor_rrrrr.putString(KEY_rrrrr, data_rrrrr);editor_rrrrr.apply();}
    //ViRaj_fun_A_03
    public static void setAddAmountUPI_rrrrr(Context context_rrrrr, String KEY_rrrrr, String upi_rrrrr) {  //ViRaj_if_4
SharedPreferences.Editor editor_rrrrr = getshrprefMthd_rrrrr(context_rrrrr).edit(); editor_rrrrr.putString(KEY_rrrrr, upi_rrrrr); editor_rrrrr.apply();}
    //ViRaj_fun_A_08
    public static String getContactObject_rrrrr(Context context_rrrrr, String KEY_rrrrr) {  //ViRaj_if_4
SharedPreferences sharedPreferences_rrrrr = getshrprefMthd_rrrrr(context_rrrrr);return sharedPreferences_rrrrr.getString(KEY_rrrrr, null);}
    //ViRaj_fun_A_19
    public static String KEY_PHONE_NUMBER1_rrrrr = "phoneNumber1";
    //ViRaj_fun_A_02
    public static String KEY_PHONE_NUMBER_rrrrr = "phoneNumber";
    //ViRaj_fun_A_18
    public static String KEY_MAX_TRANSMIT_COINS_rrrrr = "maxTransferPoints";
    //ViRaj_fun_A_23
    public static String KEY_G_PAY_UPI_ID_rrrrr = "gPayUPIId";
    //ViRaj_fun_A_21
    public static String KEY_MAX_OFFER_SUM_rrrrr = "maxoffersumAmount";
    //ViRaj_fun_A_34
    public static String KEY_PP_UPI_ID_rrrrr = "ppUPIId";
    public static String KEY_USER_NAME_rrrrr = "userName";
    public static String KEY_MAR_TXT_rrrrr = "marTxt";
    public static String KEY_WHATSAP_NUMBER_rrrrr = "whtappNumber";
    public static void setLiveUser_rrrrr(Context context_rrrrr, boolean status) {  //ViRaj_if_4
SharedPreferences.Editor editor_rrrrr = getshrprefMthd_rrrrr(context_rrrrr).edit(); editor_rrrrr.putBoolean(KEY_LIVE_USER_rrrrr, status); editor_rrrrr.apply();}
    //ViRaj_fun_A_46
    public static String KEY_UPI_MESSAGE_rrrrr = "addCoinUpiMessage";
    public static String KEY_B_AC_N_rrrrr = "bAccountNumber";
    static String KEY_SIGNIN_SUCCESS_rrrrr = "signinSuccess";
    public static String getAddAmountUpiId_rrrrr(Context context_rrrrr, String KEY_rrrrr) {  //ViRaj_if_4
SharedPreferences sharedPreferences_rrrrr = getshrprefMthd_rrrrr(context_rrrrr);return sharedPreferences_rrrrr.getString(KEY_rrrrr, "");}
    public static String KEY_DEVELOPER_MODE_rrrrr = "developerMode";
    //ViRaj_fun_A_38
    public static SharedPreferences getshrprefMthd_rrrrr(Context context_rrrrr) {  //ViRaj_if_4
 return context_rrrrr.getSharedPreferences(SHARED_PREF_NAME_rrrrr, Context.MODE_PRIVATE);}
    static String KEY_TRANSMIT_COINS_rrrrr = "transmitcoins";
    public static String KEY_B_IFSC_C_rrrrr = "bIfscCode";
    //ViRaj_fun_A_07
    public static String SHARED_PREF_NAME_rrrrr = "appName";
    public static String getMaxMinObject_rrrrr(Context context_rrrrr, String KEY_rrrrr) {  //ViRaj_if_4
SharedPreferences sharedPreferences_rrrrr = getshrprefMthd_rrrrr(context_rrrrr);return sharedPreferences_rrrrr.getString(KEY_rrrrr, null);}
    public static String getBankObject_rrrrr(Context context_rrrrr, String KEY_rrrrr) {  //ViRaj_if_4
SharedPreferences sharedPreferences_rrrrr = getshrprefMthd_rrrrr(context_rrrrr);return sharedPreferences_rrrrr.getString(KEY_rrrrr, null);}
    public static String KEY_ADD_COINS_BHIM_ID_rrrrr = "addcoinsUpiID";
    //ViRaj_fun_A_22
    //ViRaj_fun_A_17
    static String KEY_SIGNIN_TOKEN_rrrrr = "SignInToken";
    public static String KEY_FIREBSE_ALLOW_rrrrr = "firebaseAllow";
    public static void setBankInformation_rrrrr(Context context_rrrrr, String KEY_rrrrr, String details_rrrrr) {  //ViRaj_if_4
SharedPreferences.Editor editor_rrrrr = getshrprefMthd_rrrrr(context_rrrrr).edit(); editor_rrrrr.putString(KEY_rrrrr, details_rrrrr); editor_rrrrr.apply();}
    public static String KEY_PAYMENT_OPTION_rrrrr = "avaPaymentOption";
    //ViRaj_fun_A_32 //ViRaj_fun_A_35
    public static String KEY_MIN_ADD_AMOUNT_COINS_rrrrr = "minAddamountPoints";
    public static void setTransmitCoins_rrrrr(Context context_rrrrr, boolean status) {  //ViRaj_if_4
SharedPreferences.Editor editor_rrrrr = getshrprefMthd_rrrrr(context_rrrrr).edit(); editor_rrrrr.putBoolean(KEY_TRANSMIT_COINS_rrrrr, status); editor_rrrrr.apply();}
    public static String getRegistrationObject_rrrrr(Context context_rrrrr, String KEY_rrrrr) {  //ViRaj_if_4
SharedPreferences sharedPreferences_rrrrr = getshrprefMthd_rrrrr(context_rrrrr);return sharedPreferences_rrrrr.getString(KEY_rrrrr, null);}
    public static String getPrfrnceinfo_rrrrr(Context context_rrrrr, String KEY_rrrrr) {  //ViRaj_if_4
SharedPreferences sharedPreferences_rrrrr = getshrprefMthd_rrrrr(context_rrrrr); return sharedPreferences_rrrrr.getString(KEY_rrrrr, null);}
    //ViRaj_fun_A_16
    public static boolean getTransmitCoins_rrrrr(Context context_rrrrr) {  //ViRaj_if_4
SharedPreferences sharedPreferences_rrrrr = getshrprefMthd_rrrrr(context_rrrrr);return sharedPreferences_rrrrr.getBoolean(KEY_TRANSMIT_COINS_rrrrr, false);}
    //ViRaj_fun_A_50 //ViRaj_fun_A_10 //ViRaj_fun_A_12 //ViRaj_fun_A_20
    public static boolean getsignInSuccess_rrrrr(Context context_rrrrr) {  //ViRaj_if_4
SharedPreferences sharedPreferences_rrrrr = getshrprefMthd_rrrrr(context_rrrrr);return sharedPreferences_rrrrr.getBoolean(KEY_SIGNIN_SUCCESS_rrrrr,false);}
    public static void setPosterImages_rrrrr(Context context_rrrrr, String KEY_rrrrr, String imageUrl_rrrrr) {  //ViRaj_if_4
SharedPreferences.Editor editor_rrrrr = getshrprefMthd_rrrrr(context_rrrrr).edit(); editor_rrrrr.putString(KEY_rrrrr, imageUrl_rrrrr); editor_rrrrr.apply();}
    public static void setSigninSuccess_rrrrr(Context context_rrrrr, boolean status) {  //ViRaj_if_4
SharedPreferences.Editor editor_rrrrr = getshrprefMthd_rrrrr(context_rrrrr).edit(); editor_rrrrr.putBoolean(KEY_SIGNIN_SUCCESS_rrrrr, status); editor_rrrrr.apply();}
    public static void setContactUsInfo_rrrrr(Context context_rrrrr, String KEY_rrrrr, String details_rrrrr) {  //ViRaj_if_4
SharedPreferences.Editor editor_rrrrr = getshrprefMthd_rrrrr(context_rrrrr).edit(); editor_rrrrr.putString(KEY_rrrrr, details_rrrrr); editor_rrrrr.apply();}
    //ViRaj_fun_A_41
    public static String KEY_CLIENT_EMAIL_rrrrr = "ClientMail";
    public static void setSigninTkn_rrrrr(Context context_rrrrr, String token_rrrrr) {  //ViRaj_if_4
SharedPreferences.Editor editor_rrrrr = getshrprefMthd_rrrrr(context_rrrrr).edit(); editor_rrrrr.putString(KEY_SIGNIN_TOKEN_rrrrr, token_rrrrr); editor_rrrrr.apply();}
    //ViRaj_fun_A_31 //ViRaj_fun_A_37 //ViRaj_fun_A_45 //ViRaj_fun_A_15
    static String KEY_CUSTOMER_COINS_rrrrr = "customercoins";
    public static boolean getLiveUser_rrrrr(Context context_rrrrr) {  //ViRaj_if_4
SharedPreferences sharedPreferences_rrrrr = getshrprefMthd_rrrrr(context_rrrrr);return sharedPreferences_rrrrr.getBoolean(KEY_LIVE_USER_rrrrr, false);}
    public static void setUserCoins_rrrrr(Context context_rrrrr, String points_rrrrr) {  //ViRaj_if_4
SharedPreferences.Editor editor_rrrrr = getshrprefMthd_rrrrr(context_rrrrr).edit(); editor_rrrrr.putString(KEY_CUSTOMER_COINS_rrrrr, points_rrrrr); editor_rrrrr.apply();}
    //ViRaj_fun_A_40
    public static String KEY_POSTER_IMAGES1_rrrrr = "posterImages1";
    //ViRaj_fun_A_05 //ViRaj_fun_A_44 //ViRaj_fun_A_04
    public static String KEY_POSTER_IMAGES2_rrrrr = "posterImages2";
    public static String KEY_MAX_ADD_AMOUNT_COINS_rrrrr = "maxAddamountPoints";
    public static void setSharedBooleanStatus_rrrrr(Context context_rrrrr, String KEY_rrrrr, boolean status_rrrrr) {  //ViRaj_if_4
SharedPreferences.Editor editor_rrrrr = getshrprefMthd_rrrrr(context_rrrrr).edit(); editor_rrrrr.putBoolean(KEY_rrrrr, status_rrrrr); editor_rrrrr.apply();}
    //ViRaj_fun_A_25
    static String KEY_LIVE_USER_rrrrr = "liveUser";
    public static String KEY_BRANCH_ADDRESS_rrrrr = "branchAddress";
    public static String KEY_MIN_EXTRACT_COINS_rrrrr = "minextractcoins";
    public static void setPrefrenceStrngData_rrrrr(Context context_rrrrr, String KEY_rrrrr, String data_rrrrr) {  //ViRaj_if_4
SharedPreferences.Editor editor_rrrrr = getshrprefMthd_rrrrr(context_rrrrr).edit(); editor_rrrrr.putString(KEY_rrrrr, data_rrrrr); editor_rrrrr.apply();}
    //ViRaj_fun_A_43
    public static String KEY_MIN_TRANSMIT_COINS_rrrrr = "minTransmitPoints";
    public static String KEY_ADVERTISEMENT_LINK_rrrrr = "phoneNumber2";
    public static String KEY_P_UPI_ID_rrrrr = "pUPIId";
    public static void setRegisterData_rrrrr(Context context_rrrrr, String KEY_rrrrr, String data_rrrrr) {  //ViRaj_if_4
SharedPreferences.Editor editor_rrrrr = getshrprefMthd_rrrrr(context_rrrrr).edit(); editor_rrrrr.putString(KEY_rrrrr, data_rrrrr); editor_rrrrr.apply();}
    public static String getCustomerCoins_rrrrr(Context context_rrrrr) {  //ViRaj_if_4
SharedPreferences sharedPreferences_rrrrr = getshrprefMthd_rrrrr(context_rrrrr);return sharedPreferences_rrrrr.getString(KEY_CUSTOMER_COINS_rrrrr, "0");}
    //ViRaj_fun_A_14
    public static void setCleaninfo_rrrrr(Context context_rrrrr) {  //ViRaj_if_4
SharedPreferences.Editor editor_rrrrr = getshrprefMthd_rrrrr(context_rrrrr).edit(); editor_rrrrr.remove(KEY_SIGNIN_TOKEN_rrrrr); editor_rrrrr.remove(KEY_SIGNIN_SUCCESS_rrrrr); editor_rrrrr.apply();}
    //ViRaj_fun_A_36 //ViRaj_fun_A_28 //ViRaj_fun_A_06 //ViRaj_fun_A_47


}
