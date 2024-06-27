package com.example.myapplication.e.d;

import com.example.myapplication.e.e.wa;
import com.example.myapplication.e.e.wc;
import com.example.myapplication.e.e.wd;
import com.example.myapplication.e.e.we;
import com.example.myapplication.e.e.wg;
import com.example.myapplication.e.e.wh;
import com.example.myapplication.e.e.wk;
import com.example.myapplication.e.e.ws;
import com.example.myapplication.e.e.wq;
import com.example.myapplication.e.e.wp;
import com.example.myapplication.e.e.wo;
import com.example.myapplication.e.e.wn;
import com.example.myapplication.e.e.wm;
import com.example.myapplication.e.e.wl;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface xb {

    @FormUrlEncoded @POST("AppApi") Call<wk> appLiveStatus(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wh> getRegisterMethod(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wh> resendOtp(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wg> verifyOtp(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wh> forgotPassword(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wh> forgotPin(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wg> newPassword(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wg> newPin(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wg> verifyCustomer(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wg> getSignIn(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wg> signInPin(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<ws> Customer_status(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wg> forgotPassVerify(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wh> UpgradePhnePe(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wh> upgradeBInfo(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wh> upgradeGpay(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wh> UpgrdePytm(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wg> UpgrdeUserInfo(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wg> GetUserInfo(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wa> getAppInfo(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wh> AddCoins(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wh> transmitCoins(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wn> transmitVerify(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wk> howToLearn(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<we> MainTournamentList(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wh> makeoffer(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wo> tournamentValueList(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wh> RetrieveAmnt(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wl> HistoryOfBids(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wl> HistoryOfWins(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wm> purseStatement(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wm> withdSatment(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wq> slTurnament(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wh> starlinePlaceBid(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wp> starLineBidHistory(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wp> HistorySLBids(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wd> desawarWinHistory(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wc> GaliDesawarMethod(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wd> deasawarBidHistory(@Field("data") String data);
    @FormUrlEncoded @POST("AppApi") Call<wh> galiDesawarPlaceBid(@Field("data") String data);

}
