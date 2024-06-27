package com.example.myapplication.e.b;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.myapplication.e.e.wg;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.d.xa;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.HashMap;
import java.util.Map;
//ViRaj_imports

public class activity_verifying extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_50 //ViRaj_fun_A_12
    private TextInputEditText mInPass_rrrrr, mInPC_rrrrr;
    private RelativeLayout rl_pass_rrrrr, rl_pin_rrrrr;
    private ShapeableImageView passToggle_rrrrr, passTogglePin_rrrrr;
    //ViRaj_fun_A_23 //ViRaj_fun_A_26 //ViRaj_fun_A_28
    private MaterialTextView mtv_activity_rrrrr;
    private String mobileNumber_rrrrr;
    private int code_rrrrr = 300;
    private ProgressBar progressBar_rrrrr;
    //ViRaj_fun_A_01 //ViRaj_fun_A_31 //ViRaj_fun_A_49 //ViRaj_fun_A_45 //ViRaj_fun_A_48 //ViRaj_fun_A_05
    private IntentFilter mIntentFilter_rrrrr;
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();
    ca ca_rrrrr;
    //ViRaj_fun_A_34 //ViRaj_fun_A_22 //ViRaj_fun_A_15 //ViRaj_fun_A_14 //ViRaj_fun_A_33 //ViRaj_fun_A_19 //ViRaj_fun_A_02 //ViRaj_fun_A_07 //ViRaj_fun_A_18 //ViRaj_fun_A_11 //ViRaj_fun_A_38 //ViRaj_fun_A_08 //ViRaj_fun_A_39

    //ViRaj_fun_A_09
    @Override  protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3
super.onCreate(savedInstanceState);setContentView(R.layout.activity_verifying);intVariables(); //ViRaj_if_6

        algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr));
        ca_rrrrr = new ca(this);loadData(); //ViRaj_if_6
}
    private void loadData() {  //ViRaj_if_3

        mIntentFilter_rrrrr.addAction(cf.BroadCastStringForAction_rrrrr);Intent serviceIntent = new Intent(this, cc.class);startService(serviceIntent);}
    //ViRaj_fun_A_16
    @Override protected void onRestart() {  //ViRaj_if_3
super.onRestart();registerReceiver(cf.myReceiver_rrrrr, mIntentFilter_rrrrr);}
    @Override protected void onPause() {  //ViRaj_if_3
super.onPause();unregisterReceiver(cf.myReceiver_rrrrr);}
    //ViRaj_fun_A_46 //ViRaj_fun_A_41 //ViRaj_fun_A_44
    private void intVariables() {  //ViRaj_if_3


        mInPC_rrrrr = findViewById(R.id.rrrrr_in_pc_rrrrr);
        passTogglePin_rrrrr = findViewById(R.id.rrrrr_pass_tpc_rrrrr);
        mInPass_rrrrr = findViewById(R.id.rrrrr_in_pass_rrrrr);
        passToggle_rrrrr = findViewById(R.id.rrrrr_pass_toggle_rrrrr);
        mtv_activity_rrrrr = findViewById(R.id.rrrrr_mtv_activity_rrrrr);
        progressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5

        rl_pin_rrrrr = findViewById(R.id.rrrrr_rl_pin_rrrrr);
        rl_pass_rrrrr = findViewById(R.id.rrrrr_rl_pass_rrrrr);
        mobileNumber_rrrrr = getIntent().getStringExtra(getString(R.string.phone_number_rrrrr));
        code_rrrrr = getIntent().getIntExtra(getString(R.string.verification_rrrrr),300);
        MaterialTextView dataConText = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

        cf cf = new cf(dataConText);
        mIntentFilter_rrrrr = new IntentFilter();

        switch (code_rrrrr) {  //ViRaj_if_4

            case 300:
                rl_pass_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

                rl_pin_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                mtv_activity_rrrrr.setText("Forgot Password");
                break;
            case 400:
                rl_pass_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                rl_pin_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

                mtv_activity_rrrrr.setText("Forgot Pin");
                break;
        }
    }
    //ViRaj_fun_A_32 //ViRaj_fun_A_36 //ViRaj_fun_A_43

    @Override
    protected void onResume() {  //ViRaj_if_3

        super.onResume();
        registerReceiver(cf.myReceiver_rrrrr, mIntentFilter_rrrrr);
    }
    //ViRaj_fun_A_47 //ViRaj_fun_A_17
    public void passTogglePin(View view) {  //ViRaj_if_3

        if (mInPC_rrrrr.getTransformationMethod().getClass().getSimpleName() .equals("PasswordTransformationMethod")) {  //ViRaj_if_3

            mInPC_rrrrr.setTransformationMethod(new SingleLineTransformationMethod());
            passTogglePin_rrrrr.setImageResource(R.drawable.ic_baseline_visibility_off_24);
        }
        else {  //ViRaj_if_5

            mInPC_rrrrr.setTransformationMethod(new PasswordTransformationMethod());
            passTogglePin_rrrrr.setImageResource(R.drawable.ic_baseline_visibility_24);
        }
        mInPC_rrrrr.setSelection(mInPC_rrrrr.getText().length());
    }
    //ViRaj_fun_A_20 //ViRaj_fun_A_03

    public void passToggle(View view) {  //ViRaj_if_3

        if (mInPass_rrrrr.getTransformationMethod().getClass().getSimpleName() .equals("PasswordTransformationMethod")) {  //ViRaj_if_3

            mInPass_rrrrr.setTransformationMethod(new SingleLineTransformationMethod());
            passToggle_rrrrr.setImageResource(R.drawable.ic_baseline_visibility_off_24);
        }
        else {  //ViRaj_if_5

            mInPass_rrrrr.setTransformationMethod(new PasswordTransformationMethod());
            passToggle_rrrrr.setImageResource(R.drawable.ic_baseline_visibility_24);
        }

        mInPass_rrrrr.setSelection(mInPass_rrrrr.getText().length());
    }
    //ViRaj_fun_A_30 //ViRaj_fun_A_10 //ViRaj_fun_A_06

    public void submit(View view) {  //ViRaj_if_3

        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        if(code_rrrrr ==300) {  //ViRaj_if_4

            if (TextUtils.isEmpty(mInPass_rrrrr.getText().toString())) {  //ViRaj_if_4

                Snackbar.make(view, getString(R.string.enter_pass_rrrrr),2000).show();
                return;
            }
            if (mInPass_rrrrr.getText().toString().length()<4) {  //ViRaj_if_4

                Snackbar.make(view, getString(R.string.four_pass_rrrrr),2000).show();
                return;
            }
            if (cc.isOnline_rrrrr(this)) createPassword(ce.getLoginInToken_rrrrr(this), mobileNumber_rrrrr, mInPass_rrrrr.getText().toString().trim(),"mobile_token");
            else Toast.makeText(this, getString(R.string.check_net_rrrrr), Toast.LENGTH_SHORT).show();

        }else {  //ViRaj_if_2

            if (TextUtils.isEmpty(mInPC_rrrrr.getText().toString())) {  //ViRaj_if_4

                Snackbar.make(view, getString(R.string.pin_enter_rrrrr),2000).show();
                return;
            }
            if (mInPC_rrrrr.getText().toString().length()<4) {  //ViRaj_if_4

                Snackbar.make(view, getString(R.string.four_pin_rrrrr),2000).show();
                return;
            }
            if (cc.isOnline_rrrrr(this)) createPin(ce.getLoginInToken_rrrrr(this), mobileNumber_rrrrr, mInPC_rrrrr.getText().toString().trim(),"mobile_token");
            else Toast.makeText(this, getString(R.string.check_net_rrrrr), Toast.LENGTH_SHORT).show();

        }

    }
    //ViRaj_fun_A_24 //ViRaj_fun_A_40 //ViRaj_fun_A_27 //ViRaj_fun_A_04

    private void createPin(String loginInToken, String mobileNumber, String pin, String mobile_token) {  //ViRaj_if_3

        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","create_pin");
        headerClaims_rrrrr.put("token",loginInToken);
        payLoadClaims_rrrrr.put("mobile",mobileNumber);
        payLoadClaims_rrrrr.put("mobile_token","firebase_token");
        payLoadClaims_rrrrr.put("pin",pin);
        String token = JWT.create()
                .withHeader(headerClaims_rrrrr)
                .withPayload(payLoadClaims_rrrrr)
                .sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

        Call<wg> call = xa.getClient().newPin(token);
        call.enqueue(new Callback<wg>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wg> call, Response<wg> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_3

                    wg wg = response.body();
                    if (wg.getStatus().equals("success")) {  //ViRaj_if_3

                        ce.setSigninTkn_rrrrr(activity_verifying.this, wg.getData().getToken());
                        ce.setSigninSuccess_rrrrr(activity_verifying.this, true);
                        Intent intent = new Intent(activity_verifying.this, activity_dashboard.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        finish();
                    }
                    Toast.makeText(activity_verifying.this, wg.getMessage(), Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(activity_verifying.this, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }

            @Override
            public void onFailure(Call<wg> call, Throwable t) {  //ViRaj_if_3

                System.out.println("verifyUser " + t);
                Toast.makeText(activity_verifying.this, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });
    }
    //ViRaj_fun_A_35 //ViRaj_fun_A_42

    private void createPassword(String loginInToken, String mobileNumber, String pass, String mobile_token) {  //ViRaj_if_3

        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","forgot_password_verify");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("mobile",mobileNumber);
        payLoadClaims_rrrrr.put("mobile_token","firebase_token");
        payLoadClaims_rrrrr.put("password",pass);
        String token = JWT.create()
                .withHeader(headerClaims_rrrrr)
                .withPayload(payLoadClaims_rrrrr)
                .sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

        Call<wg> call = xa.getClient().newPassword(token);
        call.enqueue(new Callback<wg>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wg> call, Response<wg> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_3

                    wg wg = response.body();
                    if (wg.getStatus().equals("success")) {  //ViRaj_if_3

                        ce.setSigninTkn_rrrrr(activity_verifying.this, wg.getData().getToken());
                        ce.setSigninSuccess_rrrrr(activity_verifying.this, true);
                        Intent intent = new Intent(activity_verifying.this, activity_security_pin.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        finish();
                    }
                    Toast.makeText(activity_verifying.this, wg.getMessage(), Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(activity_verifying.this, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }

            @Override
            public void onFailure(Call<wg> call, Throwable t) {  //ViRaj_if_3

                System.out.println("verifyUser " + t);
                Toast.makeText(activity_verifying.this, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });
    }
    //ViRaj_fun_A_37 //ViRaj_fun_A_21 //ViRaj_fun_A_25 //ViRaj_fun_A_29 //ViRaj_fun_A_13
}