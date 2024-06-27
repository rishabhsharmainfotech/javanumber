package com.example.myapplication.e.e;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//ViRaj_imports

import java.util.List;

public class wq {

    //ViRaj_int

    //ViRaj_fun_A_30 //ViRaj_fun_A_34 //ViRaj_fun_A_42 //ViRaj_fun_A_16 //ViRaj_fun_A_43 //ViRaj_fun_A_50 //ViRaj_fun_A_15 //ViRaj_fun_A_26 //ViRaj_fun_A_25 //ViRaj_fun_A_18
    @Expose @SerializedName("message") String message;
    @Expose @SerializedName("code") String code;
    @Expose @SerializedName("status") String status;
    @Expose @SerializedName("data") Data data;
    //ViRaj_fun_A_29 //ViRaj_fun_A_24 //ViRaj_fun_A_27 //ViRaj_fun_A_02 //ViRaj_fun_A_45 //ViRaj_fun_A_32 //ViRaj_fun_A_28 //ViRaj_fun_A_17 //ViRaj_fun_A_13 //ViRaj_fun_A_04

    public static class Data{

        @Expose @SerializedName("starline_chart") String starlineChart;
        @Expose @SerializedName("starline_rates") List<StarlineRates> starlineRates;
        @Expose @SerializedName("starline_game") List<StarlineGame> starlineGame;

        public class StarlineRates{

            @Expose @SerializedName("cost_amount") String cost_amount;
            @Expose @SerializedName("name") String name;
            @Expose @SerializedName("earning_amount") String earning_amount;

            public String getCost_amount() {  //ViRaj_if_3
return cost_amount;}
            public String getName() {  //ViRaj_if_3
return name;}
            public String getEarning_amount() {  //ViRaj_if_3
return earning_amount;}

        }
        public class StarlineGame{

            @Expose @SerializedName("id") String id;
            @Expose @SerializedName("name") String name;
            @Expose @SerializedName("result") String result;
            @Expose @SerializedName("play") boolean play;

            public String getId() {  //ViRaj_if_3
return id;}
            public String getName() {  //ViRaj_if_3
return name;}
            public String getResult() {  //ViRaj_if_3
return result;}
            public boolean isPlay() {  //ViRaj_if_3
return play;}

        }

        public String getStarlineChart() {  //ViRaj_if_3
return starlineChart;}
        public List<StarlineRates> getStarlineRates() {  //ViRaj_if_3
return starlineRates;}
        public List<StarlineGame> getStarlineGame() {  //ViRaj_if_3
return starlineGame;}

    }
    //ViRaj_fun_A_11 //ViRaj_fun_A_40 //ViRaj_fun_A_20 //ViRaj_fun_A_07 //ViRaj_fun_A_47 //ViRaj_fun_A_08 //ViRaj_fun_A_14 //ViRaj_fun_A_05 //ViRaj_fun_A_31 //ViRaj_fun_A_10 //ViRaj_fun_A_09 //ViRaj_fun_A_36

    public String getMessage() {  //ViRaj_if_3
return message;}
    //ViRaj_fun_A_39 //ViRaj_fun_A_06 //ViRaj_fun_A_49 //ViRaj_fun_A_48 //ViRaj_fun_A_33 //ViRaj_fun_A_23 //ViRaj_fun_A_38
    public String getCode() {  //ViRaj_if_3
return code;}
    //ViRaj_fun_A_19 //ViRaj_fun_A_22 //ViRaj_fun_A_41 //ViRaj_fun_A_21 //ViRaj_fun_A_46 //ViRaj_fun_A_44
    public String getStatus() {  //ViRaj_if_3
return status;}
    public Data getData() {  //ViRaj_if_3
return data;}
    //ViRaj_fun_A_35 //ViRaj_fun_A_03 //ViRaj_fun_A_01 //ViRaj_fun_A_37 //ViRaj_fun_A_12

}
