package com.example.myapplication.e.b;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.c.dh;
import com.example.myapplication.e.e.wm;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.a.ce;
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

public class activity_wallet_statement extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_01 //ViRaj_fun_A_50
    private static RecyclerView recyclerView_rrrrr;
    //ViRaj_fun_A_06 //ViRaj_fun_A_10 //ViRaj_fun_A_20
    private static dh dh_rrrrr;
    //ViRaj_fun_A_17
    public static List<wm.Data.Statement> modelWalletArrayList_rrrrr = new ArrayList<>();
    //ViRaj_fun_A_32
    public static MaterialTextView coins_rrrrr, mMinWithdCoins_rrrrr, mWithdOT_rrrrr, mWithdCT_rrrrr;
    //ViRaj_fun_A_44 //ViRaj_fun_A_43 //ViRaj_fun_A_28
    private SwipeRefreshLayout refreshLayout_rrrrr;
    //ViRaj_fun_A_07 //ViRaj_fun_A_16 //ViRaj_fun_A_19 //ViRaj_fun_A_46 //ViRaj_fun_A_25 //ViRaj_fun_A_45 //ViRaj_fun_A_15 //ViRaj_fun_A_12 //ViRaj_fun_A_14 //ViRaj_fun_A_33 //ViRaj_fun_A_29 //ViRaj_fun_A_31 //ViRaj_fun_A_03
    private RelativeLayout withDBtn_rrrrr, addCoins_rrrrr;
    //ViRaj_fun_A_26 //ViRaj_fun_A_47
    private MaterialToolbar mToolbar_rrrrr;
    private LinearLayout addwithdraw_1_rrrrr;
    //ViRaj_fun_A_41 //ViRaj_fun_A_18
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();
    ca ca_rrrrr;
    //ViRaj_fun_A_42 //ViRaj_fun_A_23 //ViRaj_fun_A_35 //ViRaj_fun_A_09 //ViRaj_fun_A_22

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet_statement);
        intVariables(); //ViRaj_if_6

        algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr));
        ca_rrrrr = new ca(this);
        purseStatementMethod(activity_wallet_statement.this);
        laodData();
        confRecycler();
        clickListeners();
    }
    //ViRaj_fun_A_27 //ViRaj_fun_A_24
    public void confRecycler() {  //ViRaj_if_3
LinearLayoutManager layoutManager = new LinearLayoutManager(activity_wallet_statement.this);
        recyclerView_rrrrr.setLayoutManager(layoutManager);
        dh_rrrrr = new dh(activity_wallet_statement.this, modelWalletArrayList_rrrrr);
        recyclerView_rrrrr.setAdapter(dh_rrrrr);}
    //ViRaj_fun_A_02 //ViRaj_fun_A_08 //ViRaj_fun_A_13
    private void laodData( ) {  //ViRaj_if_3
 coins_rrrrr.setText(ce.getCustomerCoins_rrrrr(activity_wallet_statement.this)); mMinWithdCoins_rrrrr.setText("Minimum withdrawal points are "+ ce.getMaxMinObject_rrrrr(activity_wallet_statement.this, ce.KEY_MIN_EXTRACT_COINS_rrrrr) + ".");}
    //ViRaj_fun_A_05 //ViRaj_fun_A_37
    private void clickListeners( ) {  //ViRaj_if_3


        addCoins_rrrrr.setOnClickListener(v -> {Intent intent = new Intent(activity_wallet_statement.this, activity_add_funds.class);startActivity(intent);});
        withDBtn_rrrrr.setOnClickListener(v -> {Intent intent = new Intent(activity_wallet_statement.this, activity_security_pin_for_withdraw.class);startActivity(intent);});
        mToolbar_rrrrr.setNavigationOnClickListener(v -> onBackPressed());
        refreshLayout_rrrrr.setOnRefreshListener(() -> {purseStatementMethod(activity_wallet_statement.this);laodData();confRecycler();});

    }
    //ViRaj_fun_A_04 //ViRaj_fun_A_34 //ViRaj_fun_A_49
    private void intVariables() {  //ViRaj_if_3


        recyclerView_rrrrr = findViewById(R.id.rrrrr_recyclerViewWallet_rrrrr);
        coins_rrrrr = findViewById(R.id.rrrrr_coins_rrrrr);
        mMinWithdCoins_rrrrr = findViewById(R.id.rrrrr_minWithdCoins);
        mWithdOT_rrrrr = findViewById(R.id.rrrrr_withd_ot_rrrrr);
        mWithdCT_rrrrr = findViewById(R.id.rrrrr_withd_ct_rrrrr);
        addwithdraw_1_rrrrr = findViewById(R.id.rrrrr_add_withdraw1);
        refreshLayout_rrrrr = findViewById(R.id.rrrrr_swipe_ref_lyt_rrrrr);
        addCoins_rrrrr = findViewById(R.id.rrrrr_addpoints_item1);
        withDBtn_rrrrr = findViewById(R.id.rrrrr_withdraw_item1);
        mToolbar_rrrrr = findViewById(R.id.rrrrr_toolbar_rrrrr); //ViRaj_if_5


        if (ce.getTransmitCoins_rrrrr(activity_wallet_statement.this)) {  //ViRaj_if_4


            mMinWithdCoins_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            mWithdOT_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            mWithdCT_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            addwithdraw_1_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        } else {  //ViRaj_if_5


            mMinWithdCoins_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            mWithdOT_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            mWithdCT_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            addwithdraw_1_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2


        }
        String minWitrh = ce.getMaxMinObject_rrrrr(activity_wallet_statement.this, ce.KEY_MIN_EXTRACT_COINS_rrrrr);
        mMinWithdCoins_rrrrr.setText("Minimum withdrawal points are "+minWitrh +".");
    }
    //ViRaj_fun_A_11 //ViRaj_fun_A_39 //ViRaj_fun_A_48
    private void purseStatementMethod(activity_wallet_statement activity_rrrrr) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","wallet_statement");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("string","string");
        refreshLayout_rrrrr.setRefreshing(true);

        String token = JWT.create()
                .withHeader(headerClaims_rrrrr)
                .withPayload(payLoadClaims_rrrrr)
                .sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        Call<wm> call = xa.getClient().purseStatement(token);
        call.enqueue(new Callback<wm>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wm> call, Response<wm> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4

                    wm wm = response.body();
                    if (wm.getCode().equalsIgnoreCase("505")) {  //ViRaj_if_4

                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, wm.getMessage(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }
                    if (wm.getStatus().equalsIgnoreCase(getString(R.string.success_rrrrr))) {  //ViRaj_if_4

                        ce.setUserCoins_rrrrr(activity_rrrrr, wm.getData().getAvailablePoints());
                        coins_rrrrr.setText(wm.getData().getAvailablePoints());
                        mWithdOT_rrrrr.setText("Withdraw Open time is "+ wm.getData().getWithdrawOpenTime() + ".");
                        mWithdCT_rrrrr.setText("Withdraw Close time is "+ wm.getData().getWithdrawCloseTime() + ".");
                        modelWalletArrayList_rrrrr = wm.getData().getStatement();
                        confRecycler();
                    }
                }else {  //ViRaj_if_5

                    Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                refreshLayout_rrrrr.setRefreshing(false);
            }
            @Override
            public void onFailure(Call<wm> call, Throwable t) {  //ViRaj_if_3

                refreshLayout_rrrrr.setRefreshing(false);
                System.out.println("walletStatement error "+t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
            }
        });
    }
    //ViRaj_fun_A_21 //ViRaj_fun_A_40 //ViRaj_fun_A_38 //ViRaj_fun_A_30 //ViRaj_fun_A_36
}