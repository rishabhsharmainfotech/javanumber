package com.example.myapplication.e.b;

import static com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr;
import static com.example.myapplication.e.a.cf.myReceiver_rrrrr;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.e.e.wa;
import com.example.myapplication.e.e.wk;
import com.example.myapplication.R;
import com.example.myapplication.e.d.xa;
import java.util.HashMap;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
//ViRaj_imports

public class activity_welcome extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_49 //ViRaj_fun_A_30 //ViRaj_fun_A_28 //ViRaj_fun_A_50 //ViRaj_fun_A_48 //ViRaj_fun_A_35
    ProgressBar progressBar_rrrrr;
    private MaterialTextView dataConText_rrrrr;
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_27 //ViRaj_fun_A_37 //ViRaj_fun_A_38 //ViRaj_fun_A_36 //ViRaj_fun_A_42
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();
    cf cf_rrrrr;
    ca ca_rrrrr;
    //ViRaj_fun_A_25 //ViRaj_fun_A_14 //ViRaj_fun_A_40 //ViRaj_fun_A_44 //ViRaj_fun_A_39

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3

        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_welcome);

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.status_bar_color_rrrrr));

        progressBar_rrrrr = findViewById(R.id.rrrrr_progress_bar_rrrrr);
        dataConText_rrrrr = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5


        cf_rrrrr = new cf(dataConText_rrrrr);
        ca_rrrrr = new ca(this);
        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);
        algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr));
        getAppInfoMethod(activity_welcome.this);
    }
    //ViRaj_fun_A_04 //ViRaj_fun_A_15 //ViRaj_fun_A_41 //ViRaj_fun_A_12 //ViRaj_fun_A_47

    private void method() {  //ViRaj_if_3


        if (ce.getsignInSuccess_rrrrr(activity_welcome.this)) {  //ViRaj_if_4

            System.out.println(ce.getsignInSuccess_rrrrr(activity_welcome.this));
            ce.setSharedBooleanStatus_rrrrr(activity_welcome.this, ce.KEY_DEVELOPER_MODE_rrrrr, false);
            Intent intent = new Intent(activity_welcome.this, activity_dashboard.class);
            startActivity(intent);
            finish();
        } else {  //ViRaj_if_5

            if (cc.isOnline_rrrrr(activity_welcome.this))
                AppLiveStatusFun(activity_welcome.this);
            else Toast.makeText(activity_welcome.this, getString(R.string.check_net_rrrrr), Toast.LENGTH_SHORT).show();
        }

    }

    //ViRaj_fun_A_02 //ViRaj_fun_A_05 //ViRaj_fun_A_33 //ViRaj_fun_A_16

    private void AppLiveStatusFun(activity_welcome activity_rrrrr) {  //ViRaj_if_3

        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","app_live_status");
        payLoadClaims_rrrrr.put("string","NK");
        String token = JWT.create()
                .withHeader(headerClaims_rrrrr)
                .withPayload(payLoadClaims_rrrrr)
                .sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

        Call<wk> call = xa.getClient().appLiveStatus(token);
        call.enqueue(new Callback<wk>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wk> call, Response<wk> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4

                    wk liveModel = response.body();
                    assert liveModel != null;
                    System.out.println(liveModel.getCode());
                    if (liveModel.getCode().equals("100")) {  //ViRaj_if_4

                        ce.setSharedBooleanStatus_rrrrr(activity_rrrrr, ce.KEY_DEVELOPER_MODE_rrrrr, false);
                        Intent i = new Intent(activity_welcome.this, activity_registration.class);
                        startActivity(i);
                        finish();
                    }else {  //ViRaj_if_2

                        ce.setSigninTkn_rrrrr(activity_rrrrr, liveModel.getData());
                        ce.setSharedBooleanStatus_rrrrr(activity_rrrrr, ce.KEY_DEVELOPER_MODE_rrrrr, true);
                        Intent intent = new Intent(activity_rrrrr, activity_dashboard.class);
                        startActivity(intent);
                        finish();
                    }
                }
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }

            @Override
            public void onFailure(Call<wk> call, Throwable t) {  //ViRaj_if_3

                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });
    }
    //ViRaj_fun_A_34 //ViRaj_fun_A_45 //ViRaj_fun_A_03 //ViRaj_fun_A_08

    private void getAppInfoMethod(activity_welcome activity_rrrrr) {  //ViRaj_if_3

        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","app_details");
        payLoadClaims_rrrrr.put("string","NK");
        String token = JWT.create()
                .withHeader(headerClaims_rrrrr)
                .withPayload(payLoadClaims_rrrrr)
                .sign(algorithmHS_rrrrr);
        String enData = ca_rrrrr.appData_rrrrr(token);
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

        Call<wa> call = xa.getClient().getAppInfo(enData);
        call.enqueue(new Callback<wa>() {  //ViRaj_if_3

            @Override
            public void onResponse(@NonNull Call<wa> call, @NonNull Response<wa> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_3

                    wa wa = response.body();
                    if (wa.getStatus_rrrrr().equalsIgnoreCase(getString(R.string.success_rrrrr))) {  //ViRaj_if_3


                        ce.setPrefrenceStrngData_rrrrr(activity_rrrrr, ce.KEY_MAR_TXT_rrrrr, wa.getData_rrrrr().getBanner_marquee_rrrrr());
                        ce.setContactUsInfo_rrrrr(activity_rrrrr, ce.KEY_PHONE_NUMBER1_rrrrr, "+91" + wa.getData_rrrrr().getContact_details_rrrrr().getMobile_no_1_rrrrr());
                        ce.setContactUsInfo_rrrrr(activity_rrrrr, ce.KEY_ADVERTISEMENT_LINK_rrrrr,   wa.getData_rrrrr().getContact_details_rrrrr().getTelegram_channel_link_rrrrr());
                        ce.setContactUsInfo_rrrrr(activity_rrrrr, ce.KEY_WHATSAP_NUMBER_rrrrr, "+91" + wa.getData_rrrrr().getContact_details_rrrrr().getWhatsapp_no_rrrrr());
                        ce.setContactUsInfo_rrrrr(activity_rrrrr, ce.KEY_RAZORPAY_LIVE_KEY_rrrrr, wa.getData_rrrrr().getContact_details_rrrrr().getEmail_1_rrrrr());
                        ce.setPosterImages_rrrrr(activity_rrrrr, ce.KEY_POSTER_IMAGES1_rrrrr, wa.getData_rrrrr().getBanner_image_rrrrr().getBanner_img_1_rrrrr());
                        ce.setPosterImages_rrrrr(activity_rrrrr, ce.KEY_POSTER_IMAGES2_rrrrr, wa.getData_rrrrr().getBanner_image_rrrrr().getBanner_img_2_rrrrr());
                        ce.setPosterImages_rrrrr(activity_rrrrr, ce.KEY_POSTER_IMAGES3_rrrrr, wa.getData_rrrrr().getBanner_image_rrrrr().getBanner_img_3_rrrrr());

                    } else
                        Toast.makeText(activity_rrrrr, wa.getMessage_rrrrr(), Toast.LENGTH_SHORT).show();
                } else {  //ViRaj_if_5

                    Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                method();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
            @Override
            public void onFailure(Call<wa> call, Throwable t) {  //ViRaj_if_3

                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                System.out.println("getAppDetails error " + t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
            }
        });
    }

    //ViRaj_fun_A_19 //ViRaj_fun_A_32 //ViRaj_fun_A_11 //ViRaj_fun_A_10 //ViRaj_fun_A_06 //ViRaj_fun_A_18 //ViRaj_fun_A_43

    @Override
    protected void onRestart() {  //ViRaj_if_3

        super.onRestart();
        registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);
    }
    //ViRaj_fun_A_22 //ViRaj_fun_A_29 //ViRaj_fun_A_21 //ViRaj_fun_A_17 //ViRaj_fun_A_01 //ViRaj_fun_A_23

    @Override
    protected void onPause() {  //ViRaj_if_3

        super.onPause();
        unregisterReceiver(myReceiver_rrrrr);
    }

    @Override
    protected void onResume() {  //ViRaj_if_3

        super.onResume();
        registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);
    }
    //ViRaj_fun_A_26 //ViRaj_fun_A_07 //ViRaj_fun_A_24 //ViRaj_fun_A_09 //ViRaj_fun_A_46 //ViRaj_fun_A_20 //ViRaj_fun_A_31 //ViRaj_fun_A_13

}