package com.example.myapplication.e.e;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//ViRaj_imports

public class wg {

    //ViRaj_int

    //ViRaj_fun_A_49 //ViRaj_fun_A_26 //ViRaj_fun_A_43 //ViRaj_fun_A_44 //ViRaj_fun_A_17 //ViRaj_fun_A_41 //ViRaj_fun_A_28 //ViRaj_fun_A_10 //ViRaj_fun_A_48 //ViRaj_fun_A_16 //ViRaj_fun_A_22
    @Expose @SerializedName("message") String message;
    @Expose @SerializedName("code") String code;
    @Expose @SerializedName("status") String status;
    //ViRaj_fun_A_09 //ViRaj_fun_A_14 //ViRaj_fun_A_40 //ViRaj_fun_A_30 //ViRaj_fun_A_46 //ViRaj_fun_A_07 //ViRaj_fun_A_34 //ViRaj_fun_A_50 //ViRaj_fun_A_11
    @Expose @SerializedName("data") Data data;
    //ViRaj_fun_A_19 //ViRaj_fun_A_06 //ViRaj_fun_A_01 //ViRaj_fun_A_32 //ViRaj_fun_A_21 //ViRaj_fun_A_42 //ViRaj_fun_A_20 //ViRaj_fun_A_24 //ViRaj_fun_A_23 //ViRaj_fun_A_33

    public static class Data{

        @Expose @SerializedName("token") String token;
        @Expose @SerializedName("username") String username;
        @Expose @SerializedName("mobile") String mobile;
        @Expose @SerializedName("email") String email;
        @Expose @SerializedName("bank_name") String bank_name;
        @Expose @SerializedName("account_holder_name") String account_holder_name;
        @Expose @SerializedName("ifsc_code") String ifsc_code;
        @Expose @SerializedName("branch_address") String branch_address;
        @Expose @SerializedName("bank_account_no") String bank_account_no;
        @Expose @SerializedName("paytm_mobile_no") String paytm_mobile_no;
        @Expose @SerializedName("phonepe_mobile_no") String phonepe_mobile_no;
        @Expose @SerializedName("gpay_mobile_no") String gpay_mobile_no;

        public String getToken() {  //ViRaj_if_3
return token;}
        public String getUsername() {  //ViRaj_if_3
return username;}
        public String getMobile() {  //ViRaj_if_3
return mobile;}
        public String getEmail() {  //ViRaj_if_3
return email;}
        public String getBank_name() {  //ViRaj_if_3
return bank_name;}
        public String getAccount_holder_name() {  //ViRaj_if_3
return account_holder_name;}
        public String getIfsc_code() {  //ViRaj_if_3
return ifsc_code;}
        public String getBranch_address() {  //ViRaj_if_3
return branch_address;}
        public String getBank_account_no() {  //ViRaj_if_3
return bank_account_no;}
        public String getPaytm_mobile_no() {  //ViRaj_if_3
return paytm_mobile_no;}
        public String getPhonepe_mobile_no() {  //ViRaj_if_3
return phonepe_mobile_no;}
        public String getGpay_mobile_no() {  //ViRaj_if_3
return gpay_mobile_no;}

    }
    //ViRaj_fun_A_15 //ViRaj_fun_A_37  //ViRaj_fun_A_02 //ViRaj_fun_A_36 //ViRaj_fun_A_03 //ViRaj_fun_A_12 //ViRaj_fun_A_45 //ViRaj_fun_A_18 //ViRaj_fun_A_25
    public String getMessage() {  //ViRaj_if_3
return message;}
    public String getCode() {  //ViRaj_if_3
return code;}
    //ViRaj_fun_A_35 //ViRaj_fun_A_13 //ViRaj_fun_A_39 //ViRaj_fun_A_47 //ViRaj_fun_A_29 //ViRaj_fun_A_27 //ViRaj_fun_A_08
    public String getStatus() {  //ViRaj_if_3
return status;}
    public Data getData() {  //ViRaj_if_3
return data;}
    //ViRaj_fun_A_05 //ViRaj_fun_A_38 //ViRaj_fun_A_31 //ViRaj_fun_A_04
}
