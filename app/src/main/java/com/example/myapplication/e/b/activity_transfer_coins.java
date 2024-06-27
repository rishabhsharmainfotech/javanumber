package com.example.myapplication.e.b;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.d.xa;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.a.cd;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.e.e.wh;
import com.example.myapplication.e.e.wn;
import com.example.myapplication.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.HashMap;
import java.util.Map;
//ViRaj_imports

public class activity_transfer_coins extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_03 //ViRaj_fun_A_31 //ViRaj_fun_A_08 //ViRaj_fun_A_14
    private TextInputEditText inputCoins_rrrrr, uNumb_rrrrr;
    private int coins_rrrrr =0, ava_coins_rrrrr =0;
    private InputMethodManager inputMethodManager_rrrrr;
    //ViRaj_fun_A_05 //ViRaj_fun_A_10 //ViRaj_fun_A_35
    private MaterialToolbar toolbar_rrrrr;
    private ProgressBar progressBar_rrrrr;
    private MenuItem itemCoins_rrrrr;
    private MaterialTextView coinText_rrrrr, userN_rrrrr;
    //ViRaj_fun_A_38 //ViRaj_fun_A_46 //ViRaj_fun_A_11 //ViRaj_fun_A_15 //ViRaj_fun_A_47 //ViRaj_fun_A_07
    private MaterialButton subBtn_rrrrr, veBtn_rrrrr;
    private MaterialTextView dataConText_rrrrr;
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_40 //ViRaj_fun_A_20 //ViRaj_fun_A_09 //ViRaj_fun_A_36 //ViRaj_fun_A_45 //ViRaj_fun_A_39 //ViRaj_fun_A_29
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();
    ca ca_rrrrr;
    //ViRaj_fun_A_50 //ViRaj_fun_A_24 //ViRaj_fun_A_12 //ViRaj_fun_A_22 //ViRaj_fun_A_44
    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_coins);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.status_bar_color_rrrrr));
        intVariabless();
        algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr));
        ca_rrrrr = new ca(this);
        loadData(); //ViRaj_if_6

        ToolbarMethod();
    }
    //ViRaj_fun_A_41
    private void loadData() {  //ViRaj_if_3

        cf cf = new cf(dataConText_rrrrr);
        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);
        itemCoins_rrrrr.setVisible(true);  //ViRaj_if_2

        ava_coins_rrrrr = Integer.parseInt(ce.getCustomerCoins_rrrrr(activity_transfer_coins.this));
        setToolBar(ava_coins_rrrrr);
        veBtn_rrrrr.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
    }
    //ViRaj_fun_A_34
    private void ToolbarMethod() {  //ViRaj_if_3

        toolbar_rrrrr.setNavigationOnClickListener(v -> onBackPressed());
        uNumb_rrrrr.addTextChangedListener(new TextWatcher() {  //ViRaj_if_3

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {  //ViRaj_if_3

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {  //ViRaj_if_3

                if (s.length()<10) {  //ViRaj_if_4


                    veBtn_rrrrr.setEnabled(false);
                    veBtn_rrrrr.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                    coinText_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                    inputCoins_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                    subBtn_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                    userN_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2


                }else {  //ViRaj_if_5

                    veBtn_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

                    veBtn_rrrrr.setEnabled(true);
                    veBtn_rrrrr.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor( activity_transfer_coins.this, R.color.button_color1_rrrrr)));
                }
            }
            @Override
            public void afterTextChanged(Editable s) {  //ViRaj_if_3

            }
        });
    }
    //ViRaj_fun_A_43 //ViRaj_fun_A_25 //ViRaj_fun_A_37
    public void submitCoins(View view) {  //ViRaj_if_3

        inputMethodManager_rrrrr = (InputMethodManager)getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager_rrrrr.hideSoftInputFromWindow(view.getWindowToken(), 0);
        String s = inputCoins_rrrrr.getText().toString();

        if (s.length()>0) {  //ViRaj_if_4
 coins_rrrrr = Integer.parseInt(s);}
        if (TextUtils.isEmpty(s) || coins_rrrrr <1) {  //ViRaj_if_4
Snackbar.make(view, getString(R.string.enter_point_rrrrr), 2000).show();return;}
        if (coins_rrrrr <Integer.parseInt(ce.getMaxMinObject_rrrrr(this, ce.KEY_MIN_TRANSMIT_COINS_rrrrr))) {  //ViRaj_if_4
Snackbar.make(view,getString(R.string.min_amt_rrrrr)+ ce.getMaxMinObject_rrrrr(this, ce.KEY_MIN_TRANSMIT_COINS_rrrrr), 2000).show();return;}
        if (coins_rrrrr >Integer.parseInt(ce.getMaxMinObject_rrrrr(this, ce.KEY_MAX_TRANSMIT_COINS_rrrrr))) {  //ViRaj_if_4
Snackbar.make(view, getString( R.string.max_amt_rrrrr)+ ce.getMaxMinObject_rrrrr(this, ce.KEY_MAX_TRANSMIT_COINS_rrrrr), 2000).show();return;}
        if (coins_rrrrr > ava_coins_rrrrr) {  //ViRaj_if_4
Snackbar.make(view, "Insufficient Points", 2000).show();return;}
        if (cc.isOnline_rrrrr(this)) transferDialog();else Toast.makeText(this, getString(R.string.check_net_rrrrr), Toast.LENGTH_SHORT).show();

    }
    //ViRaj_fun_A_49 //ViRaj_fun_A_30 //ViRaj_fun_A_02 //ViRaj_fun_A_16
    private void transferCoints(activity_transfer_coins activity_rrrrr) {  //ViRaj_if_3

        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();

        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","transfer_points");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("points", inputCoins_rrrrr.getText().toString());
        payLoadClaims_rrrrr.put("user_number", uNumb_rrrrr.getText().toString());

        String token = JWT.create()
                .withHeader(headerClaims_rrrrr)
                .withPayload(payLoadClaims_rrrrr)
                .sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

        Call<wh> call = xa.getClient().transmitCoins(token);
        call.enqueue(new Callback<wh>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wh> call, Response<wh> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4

                    wh wh = response.body();
                    if (wh.getCode().equalsIgnoreCase("505")) {  //ViRaj_if_4

                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, wh.getMessage(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }
                    if (wh.getStatus().equalsIgnoreCase(getString(R.string.success_rrrrr))) {  //ViRaj_if_4

                        inputCoins_rrrrr.setText("");
                        uNumb_rrrrr.setText("");
                        ce.setUserCoins_rrrrr(activity_rrrrr,String.valueOf(ava_coins_rrrrr - coins_rrrrr));
                        setToolBar(ava_coins_rrrrr - coins_rrrrr);
                        veBtn_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


                    }
                    Toast.makeText(activity_transfer_coins.this, wh.getMessage(), Toast.LENGTH_SHORT).show();
                }else {  //ViRaj_if_5

                    Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }

            @Override
            public void onFailure(Call<wh> call, Throwable t) {  //ViRaj_if_3

                System.out.println("transferPoints Error "+t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });
    }
    //ViRaj_fun_A_48 //ViRaj_fun_A_04
    private void verifyMethod(activity_transfer_coins activity_rrrrr) {  //ViRaj_if_3

        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();

        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","transfer_verify");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("user_number", uNumb_rrrrr.getText().toString());

        String token = JWT.create()
                .withHeader(headerClaims_rrrrr)
                .withPayload(payLoadClaims_rrrrr)
                .sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

        Call<wn> call = xa.getClient().transmitVerify(token);
        call.enqueue(new Callback<wn>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wn> call, Response<wn> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4

                    wn verifyModel = response.body();
                    if (verifyModel.getCode().equalsIgnoreCase("505")) {  //ViRaj_if_4

                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, verifyModel.getMessage(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }
                    if (verifyModel.getStatus().equalsIgnoreCase(getString(R.string.success_rrrrr))) {  //ViRaj_if_4


                        coinText_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

                        inputCoins_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

                        subBtn_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

                        veBtn_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                        userN_rrrrr.setText(verifyModel.getData().getName());
                        userN_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

                        inputCoins_rrrrr.requestFocus();

                    }
                    Toast.makeText(activity_transfer_coins.this, verifyModel.getMessage(), Toast.LENGTH_SHORT).show();
                }else {  //ViRaj_if_5

                    Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
            @Override
            public void onFailure(Call<wn> call, Throwable t) {  //ViRaj_if_3

                System.out.println("transferVerify Error "+t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });
    }
    //ViRaj_fun_A_32 //ViRaj_fun_A_21 //ViRaj_fun_A_26
    private void intVariabless() {  //ViRaj_if_3


        toolbar_rrrrr = findViewById(R.id.rrrrr_toolbar_rrrrr); //ViRaj_if_5

        inputCoins_rrrrr = findViewById(R.id.rrrrr_inputCoins_rrrrr);
        progressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5

        uNumb_rrrrr = findViewById(R.id.rrrrr_user_num_rrrrr);
        veBtn_rrrrr = findViewById(R.id.rrrrr_verifyText_rrrrr);
        coinText_rrrrr = findViewById(R.id.rrrrr_coin_txt_rrrrr);
        userN_rrrrr = findViewById(R.id.rrrrr_userN_rrrrr);
        subBtn_rrrrr = findViewById(R.id.rrrrr_suBtn_rrrrr);
        dataConText_rrrrr = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

        itemCoins_rrrrr = toolbar_rrrrr.getMenu().findItem(R.id.rrrrr_coins_rrrrr);

    }

    private void setToolBar(int i) {  //ViRaj_if_3
 SpannableString s = new SpannableString(String.valueOf(i)); s.setSpan(new ForegroundColorSpan(Color.WHITE), 0, s.length(), 0); s.setSpan(new RelativeSizeSpan(1.50f),0,s.length(),0); s.setSpan(new StyleSpan(Typeface.BOLD),0,s.length(),0); itemCoins_rrrrr.setTitle(s);}
    //ViRaj_fun_A_19 //ViRaj_fun_A_28 //ViRaj_fun_A_13 //ViRaj_fun_A_33 //ViRaj_fun_A_06
    public void btnVerify(View view) {  //ViRaj_if_3

        inputMethodManager_rrrrr = (InputMethodManager)getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager_rrrrr.hideSoftInputFromWindow(view.getWindowToken(), 0);if (cc.isOnline_rrrrr(this)) verifyMethod(activity_transfer_coins.this); else Toast.makeText(this, getString(R.string.check_net_rrrrr), Toast.LENGTH_SHORT).show();}
    private void transferDialog() {  //ViRaj_if_3
cd cd = new cd(() -> transferCoints(activity_transfer_coins.this));cd.show(getSupportFragmentManager(),getString(R.string.bottom_sheet_rrrrr));cd.setCancelable(false);}
    @Override protected void onRestart() {  //ViRaj_if_3
super.onRestart();registerReceiver(cf.myReceiver_rrrrr, mIntentFilter_rrrrr);}
    @Override protected void onResume() {  //ViRaj_if_3
super.onResume();registerReceiver(cf.myReceiver_rrrrr, mIntentFilter_rrrrr);}
    //ViRaj_fun_A_27 //ViRaj_fun_A_17 //ViRaj_fun_A_18
    @Override protected void onPause() {  //ViRaj_if_3
super.onPause();unregisterReceiver(cf.myReceiver_rrrrr);}
    //ViRaj_fun_A_01 //ViRaj_fun_A_42 //ViRaj_fun_A_23

}