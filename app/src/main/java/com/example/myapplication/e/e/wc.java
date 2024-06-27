package com.example.myapplication.e.e;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
//ViRaj_imports

public class wc {

    //ViRaj_int

    //ViRaj_fun_A_23 //ViRaj_fun_A_39 //ViRaj_fun_A_41 //ViRaj_fun_A_45 //ViRaj_fun_A_26 //ViRaj_fun_A_12 //ViRaj_fun_A_48 //ViRaj_fun_A_03 //ViRaj_fun_A_42 //ViRaj_fun_A_18 //ViRaj_fun_A_28 //ViRaj_fun_A_50 //ViRaj_fun_A_21

    @Expose @SerializedName("message") String message_rrrrr;
    @Expose @SerializedName("code") String code_rrrrr;
    @Expose @SerializedName("status") String status_rrrrr;
    @Expose @SerializedName("data") Data data_rrrrr;
    //ViRaj_fun_A_43 //ViRaj_fun_A_16 //ViRaj_fun_A_14 //ViRaj_fun_A_10 //ViRaj_fun_A_40 //ViRaj_fun_A_32 //ViRaj_fun_A_31 //ViRaj_fun_A_17 //ViRaj_fun_A_47 //ViRaj_fun_A_38 //ViRaj_fun_A_27 //ViRaj_fun_A_36

    public static class Data{

        @Expose @SerializedName("gali_disawar_chart") String gali_disawar_chart_rrrrr;
        @Expose @SerializedName("gali_disawar_rates") List<GalidesawarRates> galidesawarRates_rrrrr;
        @Expose @SerializedName("gali_disawar_game") List<GaliDesawarGame> galiDesawarGame_rrrrr;

        public static class GalidesawarRates {

            @Expose @SerializedName("cost_amount") String cost_amount_rrrrr;
            @Expose @SerializedName("name") String name_rrrrr;
            @Expose @SerializedName("earning_amount") String earning_amount_rrrrr;

            public String getCost_amount_rrrrr() {  //ViRaj_if_3
return cost_amount_rrrrr;}
            public String getName_rrrrr() {  //ViRaj_if_3
return name_rrrrr;}
            public String getEarning_amount_rrrrr() {  //ViRaj_if_3
return earning_amount_rrrrr;}

        }

        public class GaliDesawarGame {

            @Expose @SerializedName("id") String id_rrrrr;
            @Expose @SerializedName("name") String name_rrrrr;
            @Expose @SerializedName("time") String time_rrrrr;
            @Expose @SerializedName("result") String result_rrrrr;
            @Expose @SerializedName("play") boolean play_rrrrr;

            public String getId_rrrrr() {  //ViRaj_if_3
return id_rrrrr;}
            public String getName_rrrrr() {  //ViRaj_if_3
return name_rrrrr;}
            public String getResult_rrrrr() {  //ViRaj_if_3
return result_rrrrr;}
            public boolean isPlay_rrrrr() {  //ViRaj_if_3
return play_rrrrr;}
            public String getTime_rrrrr() {  //ViRaj_if_3
return time_rrrrr;}

        }

        public String getGali_disawar_chart_rrrrr() {  //ViRaj_if_3
return gali_disawar_chart_rrrrr;}
        public List<GalidesawarRates> getGalidesawarRates_rrrrr() {  //ViRaj_if_3
return galidesawarRates_rrrrr;}
        public List<GaliDesawarGame> getGaliDesawarGame_rrrrr() {  //ViRaj_if_3
return galiDesawarGame_rrrrr;}

    }
    //ViRaj_fun_A_24 //ViRaj_fun_A_19 //ViRaj_fun_A_20 //ViRaj_fun_A_11 //ViRaj_fun_A_05 //ViRaj_fun_A_30 //ViRaj_fun_A_34

    public String getMessage_rrrrr() {  //ViRaj_if_3
return message_rrrrr;}
    //ViRaj_fun_A_44 //ViRaj_fun_A_04 //ViRaj_fun_A_07 //ViRaj_fun_A_01 //ViRaj_fun_A_25 //ViRaj_fun_A_29
    public String getCode_rrrrr() {  //ViRaj_if_3
return code_rrrrr;}
    public String getStatus_rrrrr() {  //ViRaj_if_3
return status_rrrrr;}
    public Data getData_rrrrr() {  //ViRaj_if_3
return data_rrrrr;}
    //ViRaj_fun_A_06  //ViRaj_fun_A_33 //ViRaj_fun_A_49 //ViRaj_fun_A_37 //ViRaj_fun_A_13 //ViRaj_fun_A_15 //ViRaj_fun_A_22 //ViRaj_fun_A_08 //ViRaj_fun_A_35 //ViRaj_fun_A_02 //ViRaj_fun_A_09 //ViRaj_fun_A_46

}
