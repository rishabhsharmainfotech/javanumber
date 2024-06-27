package com.example.myapplication.e.b;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
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
import com.example.myapplication.e.e.wh;
import com.example.myapplication.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.HashMap;
import java.util.Map;
//ViRaj_imports

public class activity_upi_details extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_04 //ViRaj_fun_A_18 //ViRaj_fun_A_49 //ViRaj_fun_A_33 //ViRaj_fun_A_16 //ViRaj_fun_A_07 //ViRaj_fun_A_23
    private TextInputEditText setTextUPI_rrrrr;
    private MaterialToolbar toolbar_rrrrr;
    private int anInt_rrrrr = 0;
    //ViRaj_fun_A_34 //ViRaj_fun_A_38 //ViRaj_fun_A_06 //ViRaj_fun_A_36
    private Call<wh> call_rrrrr;
    private ProgressBar progressBar_rrrrr;
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_37 //ViRaj_fun_A_42 //ViRaj_fun_A_20 //ViRaj_fun_A_22 //ViRaj_fun_A_27 //ViRaj_fun_A_48
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();
    ca ca_rrrrr;

    //ViRaj_fun_A_01 //ViRaj_fun_A_47 //ViRaj_fun_A_13 //ViRaj_fun_A_19 //ViRaj_fun_A_46

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upi_details);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.status_bar_color_rrrrr));
        algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr));
        ca_rrrrr = new ca(this);
        intVariables(); //ViRaj_if_6

        loadData(); //ViRaj_if_6

        ToolbarMethod();
    }
    //ViRaj_fun_A_21 //ViRaj_fun_A_43 //ViRaj_fun_A_50
    private void loadData() {  //ViRaj_if_3

        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(cf.BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);
        anInt_rrrrr = getIntent().getIntExtra(getString(R.string.upi_rrrrr),0);
        switch (anInt_rrrrr) {  //ViRaj_if_4


            case 1: setTextUPI_rrrrr.setText(ce.getPrfrnceinfo_rrrrr(this, ce.KEY_P_UPI_ID_rrrrr));break;
            case 2: setTextUPI_rrrrr.setText(ce.getPrfrnceinfo_rrrrr(this, ce.KEY_PP_UPI_ID_rrrrr));break;
            case 3: setTextUPI_rrrrr.setText(ce.getPrfrnceinfo_rrrrr(this, ce.KEY_G_PAY_UPI_ID_rrrrr));break;

        }
    }
    //ViRaj_fun_A_40 //ViRaj_fun_A_17 //ViRaj_fun_A_02
    private void intVariables() {  //ViRaj_if_3


        MaterialTextView dataConText = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

        cf cf = new cf(dataConText);
        setTextUPI_rrrrr = findViewById(R.id.rrrrr_in_txt_upi);
        toolbar_rrrrr = findViewById(R.id.rrrrr_toolbar_rrrrr); //ViRaj_if_5

        progressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5


    }
    //ViRaj_fun_A_39 //ViRaj_fun_A_11 //ViRaj_fun_A_26 //ViRaj_fun_A_08 //ViRaj_fun_A_24 //ViRaj_fun_A_10 //ViRaj_fun_A_32 //ViRaj_fun_A_03 //ViRaj_fun_A_45
    public void sUp(View view) {  //ViRaj_if_3

        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);

        if (TextUtils.isEmpty(setTextUPI_rrrrr.getText().toString())) {  //ViRaj_if_4
 Snackbar.make(view, getString(R.string.enter_valid_number_rrrrr), 2000).show(); return; }
        if (setTextUPI_rrrrr.getText().toString().length()<10) {  //ViRaj_if_4
 Snackbar.make(view, getString(R.string.enter_valid_number_rrrrr), 2000).show(); return; }
        if (cc.isOnline_rrrrr(this))  UpiUpMethod(); else Toast.makeText(this, getString(R.string.check_net_rrrrr), Toast.LENGTH_SHORT).show();

    }
    //ViRaj_fun_A_35 //ViRaj_fun_A_28 //ViRaj_fun_A_05
    private void UpiUpMethod() {  //ViRaj_if_3

        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

        switch (anInt_rrrrr) {  //ViRaj_if_4

            case 1:
                headerClaims_rrrrr.clear();
                payLoadClaims_rrrrr.clear();

                headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
                headerClaims_rrrrr.put("method","update_paytm");
                headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
                payLoadClaims_rrrrr.put("paytm", setTextUPI_rrrrr.getText().toString());

                String token0 = JWT.create()
                        .withHeader(headerClaims_rrrrr)
                        .withPayload(payLoadClaims_rrrrr)
                        .sign(algorithmHS_rrrrr);
                token0 = ca_rrrrr.appData_rrrrr(token0);
                call_rrrrr = xa.getClient().UpgrdePytm(token0);
                break;
            case 2:
                headerClaims_rrrrr.clear();
                payLoadClaims_rrrrr.clear();

                headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
                headerClaims_rrrrr.put("method","update_phonepe");
                headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
                payLoadClaims_rrrrr.put("phonepe", setTextUPI_rrrrr.getText().toString());

                String token1 = JWT.create()
                        .withHeader(headerClaims_rrrrr)
                        .withPayload(payLoadClaims_rrrrr)
                        .sign(algorithmHS_rrrrr);
                token1 = ca_rrrrr.appData_rrrrr(token1);
                call_rrrrr = xa.getClient().UpgradePhnePe(token1);
                break;
            case 3:
                headerClaims_rrrrr.clear();
                payLoadClaims_rrrrr.clear();

                headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
                headerClaims_rrrrr.put("method","update_gpay");
                headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
                payLoadClaims_rrrrr.put("gpay", setTextUPI_rrrrr.getText().toString());

                String token2 = JWT.create()
                        .withHeader(headerClaims_rrrrr)
                        .withPayload(payLoadClaims_rrrrr)
                        .sign(algorithmHS_rrrrr);
                token2 = ca_rrrrr.appData_rrrrr(token2);
                call_rrrrr = xa.getClient().upgradeGpay(token2);
                break;
        }
        call_rrrrr.enqueue(new Callback<wh>() {  //ViRaj_if_3

            @Override
            public void onResponse(@NonNull Call<wh> call, @NonNull Response<wh> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4

                    wh wh = response.body();
                    if (wh.getCode().equalsIgnoreCase("505")) {  //ViRaj_if_4

                        ce.setCleaninfo_rrrrr(activity_upi_details.this);
                        Toast.makeText(activity_upi_details.this, wh.getMessage(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_upi_details.this, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }
                    if (wh.getStatus().equalsIgnoreCase(getString(R.string.success_rrrrr))) {  //ViRaj_if_4

                        progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                        switch (anInt_rrrrr) {  //ViRaj_if_4

                            case 1:
                                ce.setPrefrenceStrngData_rrrrr(activity_upi_details.this, ce.KEY_P_UPI_ID_rrrrr, setTextUPI_rrrrr.getText().toString());
                                break;
                            case 2:
                                ce.setPrefrenceStrngData_rrrrr(activity_upi_details.this, ce.KEY_PP_UPI_ID_rrrrr, setTextUPI_rrrrr.getText().toString());
                                break;
                            case 3:
                                ce.setPrefrenceStrngData_rrrrr(activity_upi_details.this, ce.KEY_G_PAY_UPI_ID_rrrrr, setTextUPI_rrrrr.getText().toString());
                                break;
                        }
                        onBackPressed();
                    }
                    Toast.makeText(activity_upi_details.this, wh.getMessage(), Toast.LENGTH_SHORT).show();
                }else {  //ViRaj_if_5

                    Toast.makeText(activity_upi_details.this, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onFailure(@NonNull Call<wh> call, @NonNull Throwable t) {  //ViRaj_if_3

                System.out.println("UPI Update Error "+t);
                Toast.makeText(activity_upi_details.this, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });
    }
    //ViRaj_fun_A_44 //ViRaj_fun_A_25 //ViRaj_fun_A_30 //ViRaj_fun_A_29 //ViRaj_fun_A_41
    private void ToolbarMethod() {  //ViRaj_if_3

        toolbar_rrrrr.setNavigationOnClickListener(v -> onBackPressed());}
    @Override protected void onRestart() {  //ViRaj_if_3
super.onRestart();registerReceiver(cf.myReceiver_rrrrr, mIntentFilter_rrrrr);}
    @Override protected void onResume() {  //ViRaj_if_3
super.onResume();registerReceiver(cf.myReceiver_rrrrr, mIntentFilter_rrrrr);}
    @Override protected void onPause() {  //ViRaj_if_3
super.onPause();unregisterReceiver(cf.myReceiver_rrrrr);}
    //ViRaj_fun_A_15 //ViRaj_fun_A_31 //ViRaj_fun_A_14 //ViRaj_fun_A_12 //ViRaj_fun_A_09

}