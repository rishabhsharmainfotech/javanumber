package com.example.myapplication.e.b;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.d.xa;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.e.e.wo;
import com.example.myapplication.e.e.wk;
import com.example.myapplication.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import static com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr;
import static com.example.myapplication.e.a.cf.myReceiver_rrrrr;
//ViRaj_imports

public class activity_game_rates_and_information extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_37
    private MaterialToolbar mToolbar_rrrrr;
    //ViRaj_fun_A_02
    private FrameLayout mSingle_rrrrr, mJodi_rrrrr, mSingleP_rrrrr, mDoubleD_rrrrr, mTripleD_rrrrr, mHalfS_rrrrr, mFullS_rrrrr;
    //ViRaj_fun_A_14
    private MaterialTextView mSingleDValue_rrrrr, mJodiDValue_rrrrr, mSinglePValue_rrrrr, mDoubleDValue_rrrrr, mTripleDValue_rrrrr, mHalfSValue_rrrrr, mFullSValue_rrrrr;
    //ViRaj_fun_A_44
    private int activity_rrrrr =0;
    //ViRaj_fun_A_48
    private MaterialCardView images_rrrrr;
    //ViRaj_fun_A_09
    private MaterialCardView mHowToLearn_rrrrr;
    //ViRaj_fun_A_46
    private MaterialTextView mHowToLarnText_rrrrr;
    //ViRaj_fun_A_49
    private ProgressBar mProgressBar_rrrrr;
    //ViRaj_fun_A_01
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_45
    cf cf_rrrrr;
    //ViRaj_fun_A_32
    ca ca_rrrrr;
    //ViRaj_fun_A_16
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();
    List<MaterialTextView> mDigitValue_rrrrr = new ArrayList<>();

    //ViRaj_fun_A_34 //ViRaj_fun_A_03 //ViRaj_fun_A_35 //ViRaj_fun_A_10 //ViRaj_fun_A_29

    @Override protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_rates_and_information);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.status_bar_color_rrrrr));
        intVariables(); //ViRaj_if_6

        algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr));
        ca_rrrrr = new ca(this);
        LoadDataMethod();

    }
    //ViRaj_fun_A_41 //ViRaj_fun_A_04 //ViRaj_fun_A_18 //ViRaj_fun_A_31
    private void intVariables() {  //ViRaj_if_3


        mToolbar_rrrrr = findViewById(R.id.rrrrr_toolbar_rrrrr); //ViRaj_if_5

        mSingle_rrrrr = findViewById(R.id.rrrrr_singleD_rrrrr);
        mSingleDValue_rrrrr = findViewById(R.id.rrrrr_single_d_v_rrrrr);
        mJodi_rrrrr = findViewById(R.id.rrrrr_jodi_d_rrrrr);
        mJodiDValue_rrrrr = findViewById(R.id.rrrrr_jodi_d_value_rrrrr);
        mSingleP_rrrrr = findViewById(R.id.rrrrr_single_p_rrrrr);
        mSinglePValue_rrrrr = findViewById(R.id.rrrrr_single_p_v_rrrrr);
        mDoubleD_rrrrr = findViewById(R.id.rrrrr_double_d_rrrrr);
        mDoubleDValue_rrrrr = findViewById(R.id.rrrrr_double_d_v_rrrrr);
        mTripleD_rrrrr = findViewById(R.id.rrrrr_triple_d_rrrrr);
        mTripleDValue_rrrrr = findViewById(R.id.rrrrr_triple_d_v_rrrrr);
        mHalfS_rrrrr = findViewById(R.id.rrrrr_half_s_rrrrr);
        mHalfSValue_rrrrr = findViewById(R.id.rrrrr_half_s_v_rrrrr);
        mFullS_rrrrr = findViewById(R.id.rrrrr_full_s_rrrrr);
        mFullSValue_rrrrr = findViewById(R.id.rrrrr_full_s_v_rrrrr);
        mHowToLarnText_rrrrr = findViewById(R.id.rrrrr_howToPlayText_rrrrr);
        mProgressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5

        images_rrrrr = findViewById(R.id.rrrrr_icon_rrrrr);
        mHowToLearn_rrrrr = findViewById(R.id.rrrrr_how_to_learn_card_rrrrr);
        MaterialTextView mDataConText = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

        cf_rrrrr = new cf(mDataConText);
        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);
        activity_rrrrr = getIntent().getIntExtra(getString(R.string.main_activity_rrrrr), 0);

    }
    //ViRaj_fun_A_11 //ViRaj_fun_A_06 //ViRaj_fun_A_08 //ViRaj_fun_A_17 //ViRaj_fun_A_07
    private void LoadDataMethod() {  //ViRaj_if_3

        if (activity_rrrrr ==1) {  //ViRaj_if_4


            mToolbar_rrrrr.setTitle(getString(R.string.rates_rrrrr));
            mSingle_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            mJodi_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            mSingleP_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            mDoubleD_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            mTripleD_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            mHalfS_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            mFullS_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            gameValuesMethod(activity_game_rates_and_information.this);

        }else if (activity_rrrrr ==2) {  //ViRaj_if_4


            mToolbar_rrrrr.setTitle(getString(R.string.how_play_rrrrr));
            images_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            mHowToLearn_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            getHowToLearnMethod(activity_game_rates_and_information.this);

        }

        mDigitValue_rrrrr.add(mSingleDValue_rrrrr);
        mDigitValue_rrrrr.add(mJodiDValue_rrrrr);
        mDigitValue_rrrrr.add(mSinglePValue_rrrrr);
        mDigitValue_rrrrr.add(mDoubleDValue_rrrrr);
        mDigitValue_rrrrr.add(mTripleDValue_rrrrr);
        mDigitValue_rrrrr.add(mHalfSValue_rrrrr);
        mDigitValue_rrrrr.add(mFullSValue_rrrrr);
        mToolbar_rrrrr.setNavigationOnClickListener(v -> onBackPressed());

    }
    //ViRaj_fun_A_43 //ViRaj_fun_A_33 //ViRaj_fun_A_28 //ViRaj_fun_A_38
    private void gameValuesMethod(activity_game_rates_and_information activity_rrrrr) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","game_rate_list");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("string","string");
        mProgressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        String token = JWT.create().withHeader(headerClaims_rrrrr).withPayload(payLoadClaims_rrrrr).sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        Call<wo> call = xa.getClient().tournamentValueList(token);
        call.enqueue(new Callback<wo>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wo> call, Response<wo> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4

                    wo wo = response.body();
                    if (wo.getCode().equalsIgnoreCase("505")) {  //ViRaj_if_4

                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, wo.getMessage(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }
                    if(wo.getStatus().equalsIgnoreCase("success")) {  //ViRaj_if_3

                        List<wo.Data> gameRateData = wo.getData();
                        for (int i = 0; i < gameRateData.size(); i++) {  //ViRaj_if_3

                            String value = gameRateData.get(i).getCost_amount() + "-" + gameRateData.get(i).getEarning_amount();
                            mDigitValue_rrrrr.get(i).setText(value);
                        }
                    }
                }else {  //ViRaj_if_5

                    Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                mProgressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
            @Override
            public void onFailure(Call<wo> call, Throwable t) {  //ViRaj_if_3

                System.out.println("gameRateList Error "+t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
                mProgressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });
    }
    //ViRaj_fun_A_23 //ViRaj_fun_A_19 //ViRaj_fun_A_30 //ViRaj_fun_A_36
    private void getHowToLearnMethod(activity_game_rates_and_information activity_rrrrr) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","how_to_play");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("string","string");
        mProgressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        String token = JWT.create().withHeader(headerClaims_rrrrr) .withPayload(payLoadClaims_rrrrr).sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        Call<wk> call = xa.getClient().howToLearn(token);
        call.enqueue(new Callback<wk>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wk> call, Response<wk> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4

                    wk howToPlayModel = response.body();
                    if (howToPlayModel.getCode().equalsIgnoreCase("505")) {  //ViRaj_if_4

                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, howToPlayModel.getMessage(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }
                    if (howToPlayModel.getStatus().equals(getString(R.string.success_rrrrr)))
                        mHowToLarnText_rrrrr.setText(howToPlayModel.getData());
                }else {  //ViRaj_if_5

                    Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                mProgressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
            @Override
            public void onFailure(Call<wk> call, Throwable t) {  //ViRaj_if_3

                System.out.println("howToPlay Error "+t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
                mProgressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });
    }
    //ViRaj_fun_A_40 //ViRaj_fun_A_15 //ViRaj_fun_A_26
    @Override protected void onRestart() {  //ViRaj_if_3
super.onRestart();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    //ViRaj_fun_A_21 //ViRaj_fun_A_05 //ViRaj_fun_A_50 //ViRaj_fun_A_25
    @Override protected void onResume() {  //ViRaj_if_3
super.onResume();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    //ViRaj_fun_A_39 //ViRaj_fun_A_13 //ViRaj_fun_A_27
    @Override protected void onPause() {  //ViRaj_if_3
super.onPause();unregisterReceiver(myReceiver_rrrrr); }
    //ViRaj_fun_A_12 //ViRaj_fun_A_47 //ViRaj_fun_A_22 //ViRaj_fun_A_20 //ViRaj_fun_A_24 //ViRaj_fun_A_42

}