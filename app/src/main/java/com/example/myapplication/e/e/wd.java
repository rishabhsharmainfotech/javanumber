package com.example.myapplication.e.e;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
//ViRaj_imports

public class wd {

    //ViRaj_int

    //ViRaj_fun_A_34 //ViRaj_fun_A_17 //ViRaj_fun_A_49 //ViRaj_fun_A_39 //ViRaj_fun_A_05 //ViRaj_fun_A_38 //ViRaj_fun_A_16 //ViRaj_fun_A_10 //ViRaj_fun_A_03 //ViRaj_fun_A_40 //ViRaj_fun_A_43 //ViRaj_fun_A_31 //ViRaj_fun_A_22 //ViRaj_fun_A_01

    @Expose @SerializedName("message") String message_rrrrr;
    @Expose @SerializedName("code") String code_rrrrr;
    @Expose @SerializedName("status") String status_rrrrr;
    //ViRaj_fun_A_47 //ViRaj_fun_A_25 //ViRaj_fun_A_12 //ViRaj_fun_A_33 //ViRaj_fun_A_15 //ViRaj_fun_A_27 //ViRaj_fun_A_50 //ViRaj_fun_A_28 //ViRaj_fun_A_13 //ViRaj_fun_A_07
    @Expose @SerializedName("data") private List<Data> data_rrrrr;
    //ViRaj_fun_A_29 //ViRaj_fun_A_48 //ViRaj_fun_A_32 //ViRaj_fun_A_23 //ViRaj_fun_A_19 //ViRaj_fun_A_26 //ViRaj_fun_A_08 //ViRaj_fun_A_24 //ViRaj_fun_A_21 //ViRaj_fun_A_37 //ViRaj_fun_A_30

    public static class Data{

        @SerializedName("game_id") @Expose private String gameId_rrrrr;
        @SerializedName("game_type") @Expose private String gameType_rrrrr;
        @SerializedName("left_digit") @Expose private String left_digit_rrrrr;
        @SerializedName("right_digit") @Expose private String right_digit_rrrrr;
        @SerializedName("win_points") @Expose private String winPoints_rrrrr;
        @SerializedName("bid_points") @Expose private String bidPoints_rrrrr;
        @SerializedName("bidded_at") @Expose private String biddedAt_rrrrr;
        @SerializedName("won_at") @Expose private String wonAt_rrrrr;
        @SerializedName("game_name") @Expose private String gameName_rrrrr;

        public String getGameId_rrrrr() {  //ViRaj_if_3
return gameId_rrrrr;}
        public String getGameType_rrrrr() {  //ViRaj_if_3
return gameType_rrrrr;}
        public String getLeft_digit_rrrrr() {  //ViRaj_if_3
return left_digit_rrrrr;}
        public String getRight_digit_rrrrr() {  //ViRaj_if_3
return right_digit_rrrrr;}
        public String getWinPoints_rrrrr() {  //ViRaj_if_3
return winPoints_rrrrr;}
        public String getBidPoints_rrrrr() {  //ViRaj_if_3
return bidPoints_rrrrr;}
        public String getBiddedAt_rrrrr() {  //ViRaj_if_3
return biddedAt_rrrrr;}
        public String getWonAt_rrrrr() {  //ViRaj_if_3
return wonAt_rrrrr;}
        public String getGameName_rrrrr() {  //ViRaj_if_3
return gameName_rrrrr;}

    }
    //ViRaj_fun_A_14 //ViRaj_fun_A_41 //ViRaj_fun_A_18 //ViRaj_fun_A_09 //ViRaj_fun_A_42

    public String getMessage_rrrrr() {  //ViRaj_if_3
return message_rrrrr;}
    //ViRaj_fun_A_04 //ViRaj_fun_A_46 //ViRaj_fun_A_44
    public String getCode_rrrrr() {  //ViRaj_if_3
return code_rrrrr;}
    public String getStatus_rrrrr() {  //ViRaj_if_3
return status_rrrrr;}
    public List<Data> getData_rrrrr() {  //ViRaj_if_3
return data_rrrrr;}
    //ViRaj_fun_A_35 //ViRaj_fun_A_11 //ViRaj_fun_A_06 //ViRaj_fun_A_20 //ViRaj_fun_A_45 //ViRaj_fun_A_02 //ViRaj_fun_A_36

}
