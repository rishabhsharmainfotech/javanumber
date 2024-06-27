package com.example.myapplication.e.e;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//ViRaj_imports

import java.util.List;

public class wm {

    //ViRaj_int

    @Expose @SerializedName("message") String message;
    @Expose @SerializedName("code") String code;
    @Expose @SerializedName("status") String status;
    @SerializedName("data") @Expose private Data data;

    //ViRaj_fun_A_30 //ViRaj_fun_A_19 //ViRaj_fun_A_26 //ViRaj_fun_A_04 //ViRaj_fun_A_07 //ViRaj_fun_A_50 //ViRaj_fun_A_44 //ViRaj_fun_A_34 //ViRaj_fun_A_33 //ViRaj_fun_A_39 //ViRaj_fun_A_35 //ViRaj_fun_A_31 //ViRaj_fun_A_38

    public String getMessage() {  //ViRaj_if_3
return message;}
    //ViRaj_fun_A_40 //ViRaj_fun_A_12 //ViRaj_fun_A_16 //ViRaj_fun_A_08 //ViRaj_fun_A_23 //ViRaj_fun_A_49 //ViRaj_fun_A_36 //ViRaj_fun_A_22 //ViRaj_fun_A_05 //ViRaj_fun_A_27
    public String getCode() {  //ViRaj_if_3
return code;}
    public String getStatus() {  //ViRaj_if_3
return status;}
    public Data getData() {  //ViRaj_if_3
return data;}
    //ViRaj_fun_A_03 //ViRaj_fun_A_37 //ViRaj_fun_A_09 //ViRaj_fun_A_47 //ViRaj_fun_A_28 //ViRaj_fun_A_48 //ViRaj_fun_A_18 //ViRaj_fun_A_21

    public static class Data {

        @SerializedName("available_points") @Expose private String availablePoints;
        @SerializedName("withdraw_open_time") @Expose private String withdrawOpenTime;
        @SerializedName("withdraw_close_time") @Expose private String withdrawCloseTime;
        @SerializedName("statement") @Expose private final List<Statement> statement = null;

        public String getAvailablePoints() {  //ViRaj_if_3
return availablePoints;}
        public String getWithdrawOpenTime() {  //ViRaj_if_3
return withdrawOpenTime;}
        public String getWithdrawCloseTime() {  //ViRaj_if_3
return withdrawCloseTime;}
        public List<Statement> getStatement() {  //ViRaj_if_3
return statement;}

        public static class Statement{

            @SerializedName("points") @Expose private String points;
            @SerializedName("trans_type") @Expose private String transType;
            @SerializedName("trans_det") @Expose private String transDet;
            @SerializedName("trans_status") @Expose private String transStatus;@SerializedName("created_at")
            @Expose private String createdAt;
            @SerializedName("trans_msg") @Expose private String transMsg;

            public String getPoints() {  //ViRaj_if_3
return points;}
            public String getTransType() {  //ViRaj_if_3
return transType;}
            public String getTransDet() {  //ViRaj_if_3
return transDet;}
            public String getTransStatus() {  //ViRaj_if_3
return transStatus;}
            public String getCreatedAt() {  //ViRaj_if_3
return createdAt;}
            public String getTransMsg() {  //ViRaj_if_3
return transMsg;}

        }
    }
    //ViRaj_fun_A_29 //ViRaj_fun_A_46 //ViRaj_fun_A_20 //ViRaj_fun_A_06 //ViRaj_fun_A_13 //ViRaj_fun_A_32 //ViRaj_fun_A_45 //ViRaj_fun_A_10 //ViRaj_fun_A_01 //ViRaj_fun_A_24 //ViRaj_fun_A_11 //ViRaj_fun_A_25 //ViRaj_fun_A_43 //ViRaj_fun_A_02 //ViRaj_fun_A_15 //ViRaj_fun_A_14 //ViRaj_fun_A_41 //ViRaj_fun_A_17 //ViRaj_fun_A_42


}
