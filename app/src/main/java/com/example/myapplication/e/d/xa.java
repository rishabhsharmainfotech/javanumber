package com.example.myapplication.e.d;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
//ViRaj_imports

public class xa {

    //ViRaj_int

    //ViRaj_fun_A_06 //ViRaj_fun_A_12 //ViRaj_fun_A_35 //ViRaj_fun_A_28 //ViRaj_fun_A_41 //ViRaj_fun_A_21 //ViRaj_fun_A_36 //ViRaj_fun_A_18 //ViRaj_fun_A_23 //ViRaj_fun_A_49 //ViRaj_fun_A_05 //ViRaj_fun_A_38 //ViRaj_fun_A_43 //ViRaj_fun_A_19 //ViRaj_fun_A_11 //ViRaj_fun_A_37 //ViRaj_fun_A_31 //ViRaj_fun_A_44
    private static xb retrofit_rrrrr;
    //ViRaj_fun_A_01 //ViRaj_fun_A_39 //ViRaj_fun_A_13 //ViRaj_fun_A_24 //ViRaj_fun_A_17 //ViRaj_fun_A_03 //ViRaj_fun_A_46 //ViRaj_fun_A_07
    private static final OkHttpClient.Builder builder_rrrrr = new OkHttpClient.Builder();
    //ViRaj_fun_A_04 //ViRaj_fun_A_50 //ViRaj_fun_A_32 //ViRaj_fun_A_47 //ViRaj_fun_A_34 //ViRaj_fun_A_08 //ViRaj_fun_A_29 //ViRaj_fun_A_02 //ViRaj_fun_A_09
    private static final HttpLoggingInterceptor interceptor_rrrrr = new HttpLoggingInterceptor();
    //ViRaj_fun_A_40 //ViRaj_fun_A_25 //ViRaj_fun_A_10 //ViRaj_fun_A_42 //ViRaj_fun_A_48 //ViRaj_fun_A_45 //ViRaj_fun_A_22
    public static xb getClient() {  //ViRaj_if_3

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        interceptor_rrrrr.level(HttpLoggingInterceptor.Level.BODY);
        builder_rrrrr.addInterceptor(interceptor_rrrrr);
        if(retrofit_rrrrr ==null) {  //ViRaj_if_4

            retrofit_rrrrr = new Retrofit.Builder()
                    .baseUrl(xc.string3_rrrrr)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(builder_rrrrr.build())
                    .build().create(xb.class);
        }
        return retrofit_rrrrr;
    }
    //ViRaj_fun_A_30 //ViRaj_fun_A_33 //ViRaj_fun_A_20 //ViRaj_fun_A_16 //ViRaj_fun_A_26 //ViRaj_fun_A_27 //ViRaj_fun_A_15 //ViRaj_fun_A_14
}
