package com.example.myapplication.e.b;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.myapplication.R;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.c.dj;
import com.example.myapplication.e.d.xa;
import com.example.myapplication.e.e.wq;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
//ViRaj_imports

public class activity_starline_home extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_48 //ViRaj_fun_A_24 //ViRaj_fun_A_40 //ViRaj_fun_A_21
    private static RecyclerView recSL_rrrrr;
    private static dj dj_rrrrr;
    public static MaterialTextView sinDV_rrrrr, sinPV_rrrrr, dobPV_rrrrr, triPV_rrrrr;
    public static String stringURL_rrrrr = "";
    //ViRaj_fun_A_27
    //ViRaj_fun_A_13
    public static List<wq.Data.StarlineGame> starlineGameList_rrrrr = new ArrayList<>();
    //ViRaj_fun_A_39 //ViRaj_fun_A_43 //ViRaj_fun_A_02 //ViRaj_fun_A_04 //ViRaj_fun_A_36 //ViRaj_fun_A_31 //ViRaj_fun_A_20 //ViRaj_fun_A_25 //ViRaj_fun_A_32 //ViRaj_fun_A_15 //ViRaj_fun_A_38 //ViRaj_fun_A_11 //ViRaj_fun_A_30 //ViRaj_fun_A_17 //ViRaj_fun_A_28
    public static List<wq.Data.StarlineRates> starlineRatesList_rrrrr;
    private static Vibrator mVibe_rrrrr;
    private MaterialButton chartTableBtn_rrrrr;
    //ViRaj_fun_A_33 //ViRaj_fun_A_46
    TextView wHisBtn_rrrrr, bHisBtn_rrrrr;
    private MaterialToolbar mToolbar_rrrrr;
    private SwipeRefreshLayout refreshLayout_rrrrr;
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();
    ca ca_rrrrr;

    //ViRaj_fun_A_35 //ViRaj_fun_A_26 //ViRaj_fun_A_22

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starline_home);
        intVariables(); //ViRaj_if_6

        algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr));
        ca_rrrrr = new ca(this);
        getTurnamentList(activity_starline_home.this);
        confRecycler();
        clickListeners();
    }
    //ViRaj_fun_A_45 //ViRaj_fun_A_23 //ViRaj_fun_A_44
    private void intVariables() {  //ViRaj_if_3


        starlineRatesList_rrrrr = new ArrayList<>();
        recSL_rrrrr = findViewById(R.id.rrrrr_recy_s_l_rrrrr);
        sinDV_rrrrr = findViewById(R.id.rrrrr_single_d_v_rrrrr);
        sinPV_rrrrr = findViewById(R.id.rrrrr_single_p_v_rrrrr);
        dobPV_rrrrr = findViewById(R.id.rrrrr_double_p_v);
        triPV_rrrrr = findViewById(R.id.rrrrr_triple_p_v);
        mVibe_rrrrr = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
        bHisBtn_rrrrr = findViewById(R.id.rrrrr_bHisBtn_rrrrr);
        wHisBtn_rrrrr = findViewById(R.id.rrrrr_wHisBtn_rrrrr);
        chartTableBtn_rrrrr = findViewById(R.id.rrrrr_chartTableBtn_rrrrr);
        mToolbar_rrrrr = findViewById(R.id.rrrrr_toolbar_rrrrr); //ViRaj_if_5

        refreshLayout_rrrrr = findViewById(R.id.rrrrr_swipe_ref_lyt_rrrrr);

    }
    //ViRaj_fun_A_14 //ViRaj_fun_A_18 //ViRaj_fun_A_19 //ViRaj_fun_A_34 //ViRaj_fun_A_03 //ViRaj_fun_A_16 //ViRaj_fun_A_10
    private void clickListeners( ) {  //ViRaj_if_3


        bHisBtn_rrrrr.setOnClickListener(v -> {Intent bidHistory = new Intent(activity_starline_home.this, activity_win_history.class);bidHistory.putExtra(getString(R.string.history_rrrrr), 400);startActivity(bidHistory);});
        wHisBtn_rrrrr.setOnClickListener(v -> {Intent winHistory = new Intent(activity_starline_home.this, activity_win_history.class);winHistory.putExtra(getString(R.string.history_rrrrr), 300);startActivity(winHistory);});
        chartTableBtn_rrrrr.setOnClickListener(v -> {Intent intent = new Intent(activity_starline_home.this, activity_result_chart.class);intent.putExtra(getString(R.string.chart_rrrrr), stringURL_rrrrr);startActivity(intent);});
        mToolbar_rrrrr.setNavigationOnClickListener(v -> onBackPressed());
        refreshLayout_rrrrr.setOnRefreshListener(() -> {getTurnamentList(activity_starline_home.this);confRecycler();});

    }
    //ViRaj_fun_A_07 //ViRaj_fun_A_50 //ViRaj_fun_A_01

    public void confRecycler() {  //ViRaj_if_3

        dj_rrrrr = new dj(activity_starline_home.this, starlineGameList_rrrrr, (starlineGame, itemView) -> {
            if (!starlineGame.isPlay()) {  //ViRaj_if_4

                ObjectAnimator
                        .ofFloat(itemView, "translationX", 0, 25, -25, 25, -25,15, -15, 6, -6, 0)
                        .setDuration(700)
                        .start();
                mVibe_rrrrr.vibrate(500);
            }else {  //ViRaj_if_5

                Intent intent = new Intent(activity_starline_home.this, activity_starline_turnament.class);
                intent.putExtra(getString(R.string.game_rrrrr), starlineGame.getId());
                startActivity(intent);
            }
        });
        LinearLayoutManager layoutManager = new LinearLayoutManager(activity_starline_home.this);
        recSL_rrrrr.setLayoutManager(layoutManager);
        recSL_rrrrr.setAdapter(dj_rrrrr);
    }
    //ViRaj_fun_A_06 //ViRaj_fun_A_29 //ViRaj_fun_A_42
    private void getTurnamentList(activity_starline_home activity_rrrrr) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","starline_game");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("string","string");
        refreshLayout_rrrrr.setRefreshing(true);

        String token = JWT.create()
                .withHeader(headerClaims_rrrrr)
                .withPayload(payLoadClaims_rrrrr)
                .sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        Call<wq> call = xa.getClient().slTurnament(token);
        call.enqueue(new Callback<wq>() {  //ViRaj_if_3

            @Override
            public void onResponse(@NonNull Call<wq> call, @NonNull Response<wq> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_3

                    wq wq = response.body();
                    assert wq != null;
                    if (wq.getCode().equalsIgnoreCase("505")) {  //ViRaj_if_3

                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, wq.getMessage(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }
                    if (wq.getStatus().equalsIgnoreCase("success")) {  //ViRaj_if_3

                        wq.Data data = wq.getData();
                        stringURL_rrrrr = data.getStarlineChart();
                        starlineRatesList_rrrrr = data.getStarlineRates();
                        for (int i = 0; i < starlineRatesList_rrrrr.size(); i++) {  //ViRaj_if_3

                            String value = starlineRatesList_rrrrr.get(i).getCost_amount() + "-" + starlineRatesList_rrrrr.get(i).getEarning_amount();

                            if(i==0) sinDV_rrrrr.setText(value);
                            if(i==1) sinPV_rrrrr.setText(value);
                            if(i==2) dobPV_rrrrr.setText(value);
                            if(i==3) triPV_rrrrr.setText(value);

                        }
                        starlineGameList_rrrrr = data.getStarlineGame();
                        confRecycler();
                    }
                }else {  //ViRaj_if_5

                    Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                refreshLayout_rrrrr.setRefreshing(false);
            }
            @Override
            public void onFailure(@NonNull Call<wq> call, @NonNull Throwable t) {  //ViRaj_if_3

                refreshLayout_rrrrr.setRefreshing(false);
                System.out.println("game list Error "+t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
            }
        });
    }
    //ViRaj_fun_A_41 //ViRaj_fun_A_47 //ViRaj_fun_A_37 //ViRaj_fun_A_12 //ViRaj_fun_A_05 //ViRaj_fun_A_49 //ViRaj_fun_A_08 //ViRaj_fun_A_09
}