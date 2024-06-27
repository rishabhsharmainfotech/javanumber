package com.example.myapplication.e.e;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//ViRaj_imports

public class wa {

    //ViRaj_int

    //ViRaj_fun_A_50 //ViRaj_fun_A_33 //ViRaj_fun_A_30 //ViRaj_fun_A_18 //ViRaj_fun_A_36 //ViRaj_fun_A_09 //ViRaj_fun_A_42 //ViRaj_fun_A_29 //ViRaj_fun_A_24 //ViRaj_fun_A_04 //ViRaj_fun_A_49
    @Expose @SerializedName("message") String message_rrrrr;
    @Expose @SerializedName("code") String code_rrrrr;
    //ViRaj_fun_A_13 //ViRaj_fun_A_25 //ViRaj_fun_A_48 //ViRaj_fun_A_19 //ViRaj_fun_A_46 //ViRaj_fun_A_03 //ViRaj_fun_A_07 //ViRaj_fun_A_12 //ViRaj_fun_A_02 //ViRaj_fun_A_23
    @Expose @SerializedName("status") String status_rrrrr;
    @Expose @SerializedName("data") Data data_rrrrr;
    //ViRaj_fun_A_39 //ViRaj_fun_A_43 //ViRaj_fun_A_06 //ViRaj_fun_A_45 //ViRaj_fun_A_10 //ViRaj_fun_A_44 //ViRaj_fun_A_11 //ViRaj_fun_A_28

    public static class Data{

        @Expose @SerializedName("banner_marquee") String banner_marquee_rrrrr;
        @Expose @SerializedName("contact_details") ContactDetails contact_details_rrrrr;
        @Expose @SerializedName("banner_image") BannerImages banner_image_rrrrr;

        public static class ContactDetails{

            @Expose @SerializedName("whatsapp_no") String whatsapp_no_rrrrr;
            @Expose @SerializedName("mobile_no_1") String mobile_no_1_rrrrr;
            @Expose @SerializedName("telegram_no") String telegram_channel_link_rrrrr;
            @Expose @SerializedName("email_1") String email_1_rrrrr;

            public String getWhatsapp_no_rrrrr() {  //ViRaj_if_3
return whatsapp_no_rrrrr;}
            public String getMobile_no_1_rrrrr() {  //ViRaj_if_3
return mobile_no_1_rrrrr;}
            public String getTelegram_channel_link_rrrrr() {  //ViRaj_if_3
return telegram_channel_link_rrrrr;}
            public String getEmail_1_rrrrr() {  //ViRaj_if_3
return email_1_rrrrr;}

        }

        public static class BannerImages{

            @Expose @SerializedName("banner_img_1") String banner_img_1_rrrrr;
            @Expose @SerializedName("banner_img_2") String banner_img_2_rrrrr;
            @Expose @SerializedName("banner_img_3") String banner_img_3_rrrrr;

            public String getBanner_img_1_rrrrr() {  //ViRaj_if_3
return banner_img_1_rrrrr;}
            public String getBanner_img_2_rrrrr() {  //ViRaj_if_3
return banner_img_2_rrrrr;}
            public String getBanner_img_3_rrrrr() {  //ViRaj_if_3
return banner_img_3_rrrrr;}

        }

        public String getBanner_marquee_rrrrr() {  //ViRaj_if_3
return banner_marquee_rrrrr;}
        public ContactDetails getContact_details_rrrrr() {  //ViRaj_if_3
return contact_details_rrrrr;}
        public BannerImages getBanner_image_rrrrr() {  //ViRaj_if_3
return banner_image_rrrrr;}

    }
    //ViRaj_fun_A_21 //ViRaj_fun_A_35 //ViRaj_fun_A_26 //ViRaj_fun_A_08 //ViRaj_fun_A_32 //ViRaj_fun_A_34

    public String getMessage_rrrrr() {  //ViRaj_if_3
return message_rrrrr;}
    //ViRaj_fun_A_20 //ViRaj_fun_A_40 //ViRaj_fun_A_17 //ViRaj_fun_A_47
    public String getCode_rrrrr() {  //ViRaj_if_3
return code_rrrrr;}
    //ViRaj_fun_A_15 //ViRaj_fun_A_37 //ViRaj_fun_A_27
    public String getStatus_rrrrr() {  //ViRaj_if_3
return status_rrrrr;}
    public Data getData_rrrrr() {  //ViRaj_if_3
return data_rrrrr;}
    //ViRaj_fun_A_41 //ViRaj_fun_A_31 //ViRaj_fun_A_38 //ViRaj_fun_A_01 //ViRaj_fun_A_05 //ViRaj_fun_A_14 //ViRaj_fun_A_22 //ViRaj_fun_A_16

}
