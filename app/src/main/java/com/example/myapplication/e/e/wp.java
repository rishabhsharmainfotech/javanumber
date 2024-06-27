package com.example.myapplication.e.e;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//ViRaj_imports

import java.util.List;

public class wp {

    //ViRaj_int

    //ViRaj_fun_A_02 //ViRaj_fun_A_16 //ViRaj_fun_A_35 //ViRaj_fun_A_37 //ViRaj_fun_A_05 //ViRaj_fun_A_46 //ViRaj_fun_A_31 //ViRaj_fun_A_28 //ViRaj_fun_A_22 //ViRaj_fun_A_08 //ViRaj_fun_A_13
    @Expose @SerializedName("message") String message;
    @Expose @SerializedName("code") String code;
    @Expose @SerializedName("status") String status;
    @Expose @SerializedName("data") private List<Data> data;
    //ViRaj_fun_A_45 //ViRaj_fun_A_06 //ViRaj_fun_A_03 //ViRaj_fun_A_11 //ViRaj_fun_A_15 //ViRaj_fun_A_18 //ViRaj_fun_A_50 //ViRaj_fun_A_44 //ViRaj_fun_A_23

    public static class Data{

        @SerializedName("game_id") @Expose private String gameId;
        @SerializedName("game_type") @Expose private String gameType;
        @SerializedName("digit") @Expose private String digit;
        @SerializedName("panna") @Expose private String panna;
        @SerializedName("win_points") @Expose private String winPoints;
        @SerializedName("bid_points") @Expose private String bidPoints;
        @SerializedName("bidded_at") @Expose private String biddedAt;
        @SerializedName("won_at") @Expose private String wonAt;
        @SerializedName("game_name") @Expose private String gameName;

        public String getGameId() {  //ViRaj_if_3
return gameId;}
        public String getGameType() {  //ViRaj_if_3
return gameType;}
        public String getDigit() {  //ViRaj_if_3
return digit;}
        public String getPanna() {  //ViRaj_if_3
return panna;}
        public String getWinPoints() {  //ViRaj_if_3
return winPoints;}
        public String getBidPoints() {  //ViRaj_if_3
return bidPoints;}
        public String getBiddedAt() {  //ViRaj_if_3
return biddedAt;}
        public String getWonAt() {  //ViRaj_if_3
return wonAt;}
        public String getGameName() {  //ViRaj_if_3
return gameName;}

    }

    //ViRaj_fun_A_42 //ViRaj_fun_A_19 //ViRaj_fun_A_04 //ViRaj_fun_A_27 //ViRaj_fun_A_17 //ViRaj_fun_A_12 //ViRaj_fun_A_21 //ViRaj_fun_A_07 //ViRaj_fun_A_49 //ViRaj_fun_A_24
    public String getMessage() {  //ViRaj_if_3
return message;}
    public String getCode() {  //ViRaj_if_3
return code;}
    public String getStatus() {  //ViRaj_if_3
return status;}
    //ViRaj_fun_A_48 //ViRaj_fun_A_39 //ViRaj_fun_A_38 //ViRaj_fun_A_41 //ViRaj_fun_A_33 //ViRaj_fun_A_14 //ViRaj_fun_A_32 //ViRaj_fun_A_34 //ViRaj_fun_A_29 //ViRaj_fun_A_10 //ViRaj_fun_A_40
    public List<Data> getData() {  //ViRaj_if_3
return data;}
    //ViRaj_fun_A_30 //ViRaj_fun_A_09 //ViRaj_fun_A_20 //ViRaj_fun_A_25 //ViRaj_fun_A_01 //ViRaj_fun_A_36 //ViRaj_fun_A_43 //ViRaj_fun_A_47 //ViRaj_fun_A_26
}
