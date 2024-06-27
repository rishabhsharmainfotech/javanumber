package com.example.myapplication.e.e;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//ViRaj_imports

public class ws {

    //ViRaj_int

    //ViRaj_fun_A_38 //ViRaj_fun_A_19 //ViRaj_fun_A_26 //ViRaj_fun_A_08 //ViRaj_fun_A_50 //ViRaj_fun_A_22 //ViRaj_fun_A_35 //ViRaj_fun_A_09 //ViRaj_fun_A_12 //ViRaj_fun_A_17 //ViRaj_fun_A_39
    @Expose @SerializedName("message") String message;
    @Expose @SerializedName("code") String code;
    @Expose @SerializedName("status") String status;
    //ViRaj_fun_A_30 //ViRaj_fun_A_20 //ViRaj_fun_A_31 //ViRaj_fun_A_07 //ViRaj_fun_A_05 //ViRaj_fun_A_44 //ViRaj_fun_A_15 //ViRaj_fun_A_45 //ViRaj_fun_A_48 //ViRaj_fun_A_43 //ViRaj_fun_A_01 //ViRaj_fun_A_14
    @Expose @SerializedName("data") Data data;
    //ViRaj_fun_A_42 //ViRaj_fun_A_33 //ViRaj_fun_A_37 //ViRaj_fun_A_47 //ViRaj_fun_A_03 //ViRaj_fun_A_10 //ViRaj_fun_A_46 //ViRaj_fun_A_32 //ViRaj_fun_A_29 //ViRaj_fun_A_41

    public static class Data{

        @Expose @SerializedName("available_points") String availablePoints;
        @Expose @SerializedName("transfer") String transferPoint;
        @Expose @SerializedName("upi_payment_id") String upiPaymentId;
        @Expose @SerializedName("upi_name") String upiName;
        @Expose @SerializedName("payment_option_active") String paymentOptionActive;
        @Expose @SerializedName("upi_message") String upiMessage;
        @Expose @SerializedName("minimum_bid_amount") String minimumBidAmount;
        @Expose @SerializedName("maximum_bid_amount") String maximumBidAmount;
        @Expose @SerializedName("minimum_transfer") String minimumTransfer;
        @Expose @SerializedName("maximum_transfer") String maximumTransfer;
        @Expose @SerializedName("minimum_withdraw") String minimumWithdraw;
        @Expose @SerializedName("maximum_withdraw") String maximumWithdraw;
        @Expose @SerializedName("minimum_deposit") String minimumDeposit;
        @Expose @SerializedName("maximum_deposit") String maximumDeposit;

        public String getAvailablePoints() {  //ViRaj_if_3
return availablePoints;}
        public String getTransferPoint() {  //ViRaj_if_3
return transferPoint;}
        public String getUpiPaymentId() {  //ViRaj_if_3
return upiPaymentId;}
        public String getUpiName() {  //ViRaj_if_3
return upiName;}
        public String getMinimumBidAmount() {  //ViRaj_if_3
return minimumBidAmount;}
        public String getMaximumBidAmount() {  //ViRaj_if_3
return maximumBidAmount;}
        public String getMinimumTransfer() {  //ViRaj_if_3
return minimumTransfer;}
        public String getMaximumTransfer() {  //ViRaj_if_3
return maximumTransfer;}
        public String getMinimumWithdraw() {  //ViRaj_if_3
return minimumWithdraw;}
        public String getMaximumWithdraw() {  //ViRaj_if_3
return maximumWithdraw;}
        public String getMinimumDeposit() {  //ViRaj_if_3
return minimumDeposit;}
        public String getMaximumDeposit() {  //ViRaj_if_3
return maximumDeposit;}
        public String getPaymentOptionActive() {  //ViRaj_if_3
return paymentOptionActive;}
        public String getUpiMessage() {  //ViRaj_if_3
return upiMessage;}

    }
    //ViRaj_fun_A_02 //ViRaj_fun_A_23 //ViRaj_fun_A_18 //ViRaj_fun_A_36 //ViRaj_fun_A_24 //ViRaj_fun_A_49

    public String getMessage() {  //ViRaj_if_3
return message;}
    public String getCode() {  //ViRaj_if_3
return code;}
    //ViRaj_fun_A_34 //ViRaj_fun_A_11 //ViRaj_fun_A_21 //ViRaj_fun_A_04 //ViRaj_fun_A_25
    public String getStatus() {  //ViRaj_if_3
return status;}
    public Data getData() {  //ViRaj_if_3
return data;}
    //ViRaj_fun_A_13 //ViRaj_fun_A_06 //ViRaj_fun_A_27 //ViRaj_fun_A_40 //ViRaj_fun_A_28 //ViRaj_fun_A_16
    
}
