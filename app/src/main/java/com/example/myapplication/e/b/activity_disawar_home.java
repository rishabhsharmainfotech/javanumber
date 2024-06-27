package com.example.myapplication.e.b;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.e.c.de;
import com.example.myapplication.e.e.wc;
import com.example.myapplication.R;
import com.example.myapplication.e.d.xa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
//ViRaj_imports

public class activity_disawar_home extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_23 //ViRaj_fun_A_40 //ViRaj_fun_A_44 //ViRaj_fun_A_30 //ViRaj_fun_A_06
    private static RecyclerView recSL_rrrrr;
    //ViRaj_fun_A_36 //ViRaj_fun_A_45 //ViRaj_fun_A_28
    private static de de_rrrrr;
    //ViRaj_fun_A_02 //ViRaj_fun_A_47 //ViRaj_fun_A_35 //ViRaj_fun_A_11
    public static MaterialTextView sinDV_rrrrr, sinPV_rrrrr, dobPV_rrrrr;
    //ViRaj_fun_A_20 //ViRaj_fun_A_04 //ViRaj_fun_A_24 //ViRaj_fun_A_27
    public static String stringURL_rrrrr = "";
    //ViRaj_fun_A_31 //ViRaj_fun_A_13 //ViRaj_fun_A_01 //ViRaj_fun_A_42
    public static List<wc.Data.GaliDesawarGame> galiDesawarGameList_rrrrr = new ArrayList<>();
    //ViRaj_fun_A_03 //ViRaj_fun_A_49 //ViRaj_fun_A_18 //ViRaj_fun_A_37
    public static List<wc.Data.GalidesawarRates> galidesawarRates_rrrrr;
    //ViRaj_fun_A_34 //ViRaj_fun_A_38 //ViRaj_fun_A_10
    private static Vibrator mVibe_rrrrr;
    //ViRaj_fun_A_33 //ViRaj_fun_A_17 //ViRaj_fun_A_29
    private MaterialButton wHisBtn_rrrrr, bHisBtn_rrrrr, chartTableBtn_rrrrr;
    //ViRaj_fun_A_26 //ViRaj_fun_A_46 //ViRaj_fun_A_19
    private SwipeRefreshLayout refreshLayout_rrrrr;
    //ViRaj_fun_A_05
    private MaterialTextView mDataConText_rrrrr;
    //ViRaj_fun_A_32
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_08
    private MaterialToolbar tool_bar_rrrrr;
    //ViRaj_fun_A_25
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();
    ca ca_rrrrr;
    //ViRaj_fun_A_14

    @Override protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disawar_home);
        intVariables(); //ViRaj_if_6

        algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr));
        ca_rrrrr = new ca(this);
        confRecycler(this);
        clickListeners(this);
        getTurnamentList(this);
        cf cf = new cf(mDataConText_rrrrr);
        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);

    }

    //ViRaj_fun_A_09

    private void intVariables() {  //ViRaj_if_3


        galidesawarRates_rrrrr = new ArrayList<>();
        recSL_rrrrr = findViewById(R.id.rrrrr_recy_s_l_rrrrr);
        sinDV_rrrrr = findViewById(R.id.rrrrr_left_d_v_rrrrr);
        sinPV_rrrrr = findViewById(R.id.rrrrr_right_d_v_rrrrr);
        dobPV_rrrrr = findViewById(R.id.rrrrr_jodi_d_v_rrrrr);
        mVibe_rrrrr = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
        bHisBtn_rrrrr = findViewById(R.id.rrrrr_bHisBtn_rrrrr);
        wHisBtn_rrrrr = findViewById(R.id.rrrrr_wHisBtn_rrrrr);
        chartTableBtn_rrrrr = findViewById(R.id.rrrrr_chartTableBtn_rrrrr);
        refreshLayout_rrrrr = findViewById(R.id.rrrrr_swipe_ref_lyt_rrrrr);
        mDataConText_rrrrr = findViewById(R.id.rrrrr_internet_text_rrrrr);
        tool_bar_rrrrr = findViewById(R.id.rrrrr_tool_bar_rrrrr);

    }

    //ViRaj_fun_A_48

    private void clickListeners(activity_disawar_home context_rrrrr) {  //ViRaj_if_3


        tool_bar_rrrrr.setNavigationOnClickListener(v -> onBackPressed());
        bHisBtn_rrrrr.setOnClickListener(v -> {Intent bidHistory = new Intent(context_rrrrr, activity_win_history.class);bidHistory.putExtra(context_rrrrr.getString(R.string.history_rrrrr), 500);startActivity(bidHistory); });
        wHisBtn_rrrrr.setOnClickListener(v -> {Intent winHistory = new Intent(context_rrrrr, activity_win_history.class);winHistory.putExtra(context_rrrrr.getString(R.string.history_rrrrr), 600);startActivity(winHistory);});
        chartTableBtn_rrrrr.setOnClickListener(v -> {Intent intent = new Intent(context_rrrrr, activity_result_chart.class);intent.putExtra(context_rrrrr.getString(R.string.chart_rrrrr), stringURL_rrrrr);startActivity(intent);});
        refreshLayout_rrrrr.setOnRefreshListener(() -> getTurnamentList(context_rrrrr));

    }

    //ViRaj_fun_A_07

    public static void confRecycler(Context context_rrrrr) {  //ViRaj_if_3

        de_rrrrr = new de(context_rrrrr, galiDesawarGameList_rrrrr, (galiDesawarGame, itemView) -> {
            if (!galiDesawarGame.isPlay_rrrrr()) {  //ViRaj_if_4

                ObjectAnimator
                        .ofFloat(itemView, "translationX", 0, 25, -25, 25, -25,15, -15, 6, -6, 0)
                        .setDuration(700)
                        .start();
                mVibe_rrrrr.vibrate(500);
            }else {  //ViRaj_if_5

                Intent intent = new Intent(context_rrrrr, activity_desawar_turnament.class);
                intent.putExtra(context_rrrrr.getString(R.string.game_rrrrr), galiDesawarGame.getId_rrrrr());
                context_rrrrr.startActivity(intent);
            }
        });
        LinearLayoutManager layoutManager = new LinearLayoutManager(context_rrrrr);
        recSL_rrrrr.setLayoutManager(layoutManager);
        recSL_rrrrr.setAdapter(de_rrrrr);
    }

    //ViRaj_fun_A_22

    private void getTurnamentList(activity_disawar_home activity_rrrrr) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","gali_disawar_game");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("string","string");
        String token = JWT.create() .withHeader(headerClaims_rrrrr) .withPayload(payLoadClaims_rrrrr) .sign(algorithmHS_rrrrr); token = ca_rrrrr.appData_rrrrr(token);
        refreshLayout_rrrrr.setRefreshing(true);

        Call<wc> call = xa.getClient().GaliDesawarMethod(token);
        call.enqueue(new Callback<wc>() {  //ViRaj_if_3

            @Override
            public void onResponse(@NonNull Call<wc> call, @NonNull Response<wc> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_3

                    wc wc = response.body();
                    assert wc != null;
                    if (wc.getCode_rrrrr().equalsIgnoreCase("505")) {  //ViRaj_if_3

                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, wc.getMessage_rrrrr(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }
                    if (wc.getStatus_rrrrr().equalsIgnoreCase("success")) {  //ViRaj_if_3

                        wc.Data data = wc.getData_rrrrr();
                        stringURL_rrrrr = data.getGali_disawar_chart_rrrrr();
                        galidesawarRates_rrrrr = data.getGalidesawarRates_rrrrr();
                        for (int i = 0; i < galidesawarRates_rrrrr.size(); i++) {  //ViRaj_if_3
 String value = galidesawarRates_rrrrr.get(i).getCost_amount_rrrrr() + "-" + galidesawarRates_rrrrr.get(i).getEarning_amount_rrrrr();

                            if(i==0) sinDV_rrrrr.setText(value);
                            if(i==1) sinPV_rrrrr.setText(value);
                            if(i==2) dobPV_rrrrr.setText(value);

                        }
                        galiDesawarGameList_rrrrr = data.getGaliDesawarGame_rrrrr();
                        confRecycler(activity_rrrrr);
                    }
                }else {  //ViRaj_if_5

                    Toast.makeText(activity_rrrrr, activity_rrrrr.getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                refreshLayout_rrrrr.setRefreshing(false);
            }
            @Override
            public void onFailure(@NonNull Call<wc> call, @NonNull Throwable t) {  //ViRaj_if_3

                refreshLayout_rrrrr.setRefreshing(false);
                System.out.println("game list Error "+t);
                Toast.makeText(activity_rrrrr, activity_rrrrr.getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
            }
        });

    }

    //ViRaj_fun_A_16

    @Override  protected void onRestart() {  //ViRaj_if_3
 super.onRestart(); registerReceiver(cf.myReceiver_rrrrr, mIntentFilter_rrrrr); }
    //ViRaj_fun_A_39
    @Override  protected void onResume() {  //ViRaj_if_3
super.onResume();registerReceiver(cf.myReceiver_rrrrr, mIntentFilter_rrrrr); }
    //ViRaj_fun_A_43 //ViRaj_fun_A_41 //ViRaj_fun_A_15
    @Override  protected void onPause() {  //ViRaj_if_3
super.onPause();unregisterReceiver(cf.myReceiver_rrrrr);}
    //ViRaj_fun_A_21
    //ViRaj_fun_A_50
    //ViRaj_fun_A_12
}