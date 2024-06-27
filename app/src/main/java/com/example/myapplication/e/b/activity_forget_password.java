package com.example.myapplication.e.b;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.e.wh;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.d.xa;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import static com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr;
import static com.example.myapplication.e.a.cf.myReceiver_rrrrr;
import java.util.HashMap;
import java.util.Map;
//ViRaj_imports

public class activity_forget_password extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_33 //ViRaj_fun_A_17 //ViRaj_fun_A_02 //ViRaj_fun_A_28 //ViRaj_fun_A_20 //ViRaj_fun_A_21 //ViRaj_fun_A_10
    private ProgressBar progressBar_rrrrr;
    //ViRaj_fun_A_27
    private TextInputEditText phone_num_rrrrr;
    //ViRaj_fun_A_01 //ViRaj_fun_A_45 //ViRaj_fun_A_41 //ViRaj_fun_A_30 //ViRaj_fun_A_03 //ViRaj_fun_A_14 //ViRaj_fun_A_31 //ViRaj_fun_A_23
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_25
    cf cf_rrrrr;
    //ViRaj_fun_A_16
    ca ca_rrrrr;
    //ViRaj_fun_A_29
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();
    //ViRaj_fun_A_42

    @Override protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3
 super.onCreate(savedInstanceState); setContentView(R.layout.activity_forget_password); intVariables(); //ViRaj_if_6
 algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr)); ca_rrrrr = new ca(this); }
    //ViRaj_fun_A_37
    private void intVariables() {  //ViRaj_if_3


        progressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5

        MaterialTextView mDataConText = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

        phone_num_rrrrr = findViewById(R.id.rrrrr_phone_num_rrrrr);
        cf_rrrrr = new cf(mDataConText);
        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);

    }
    //ViRaj_fun_A_46 //ViRaj_fun_A_43 //ViRaj_fun_A_12 //ViRaj_fun_A_11
    public void backToLogin(View view) {  //ViRaj_if_3
Intent intent = new Intent(this, activity_sign_in.class);startActivity(intent); finish();}
    //ViRaj_fun_A_26 //ViRaj_fun_A_39 //ViRaj_fun_A_50 //ViRaj_fun_A_24 //ViRaj_fun_A_40 //ViRaj_fun_A_07 //ViRaj_fun_A_36 //ViRaj_fun_A_15 //ViRaj_fun_A_18
    @Override protected void onRestart() {  //ViRaj_if_3
super.onRestart();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    //ViRaj_fun_A_19 //ViRaj_fun_A_05 //ViRaj_fun_A_49
    @Override protected void onPause() {  //ViRaj_if_3
super.onPause(); unregisterReceiver(myReceiver_rrrrr);}
    //ViRaj_fun_A_09 //ViRaj_fun_A_04 //ViRaj_fun_A_32
    @Override protected void onResume() {  //ViRaj_if_3
super.onResume(); registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr); }
    //ViRaj_fun_A_08 //ViRaj_fun_A_13
    public void sendOTP(View view) {  //ViRaj_if_3

        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);

        if (TextUtils.isEmpty(phone_num_rrrrr.getText().toString())) {  //ViRaj_if_4
 Snackbar.make(view, "Please Enter Mobile Number",2000).show();return;}
        if (phone_num_rrrrr.getText().toString().length()<10) {  //ViRaj_if_4
Snackbar.make(view, "Please Enter a valid Mobile Number",2000).show();return; }
        if (cc.isOnline_rrrrr(this)) {  //ViRaj_if_4
forgotPassword(this , phone_num_rrrrr.getText().toString().trim());} else Toast.makeText(this, getString(R.string.check_net_rrrrr), Toast.LENGTH_SHORT).show();

    }
    //ViRaj_fun_A_48 //ViRaj_fun_A_44 //ViRaj_fun_A_34 //ViRaj_fun_A_06 //ViRaj_fun_A_22
    private void forgotPassword(activity_forget_password activity_forget_password, String mobileNumber_rrrrr) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","forgot_password");
        payLoadClaims_rrrrr.put("mobile", mobileNumber_rrrrr);
        String token = JWT.create().withHeader(headerClaims_rrrrr).withPayload(payLoadClaims_rrrrr).sign(algorithmHS_rrrrr);token = ca_rrrrr.appData_rrrrr(token);
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        Call<wh> call = xa.getClient().forgotPassword(token);
        call.enqueue(new Callback<wh>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wh> call, Response<wh> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_3

                    wh data = response.body();
                    if (data.getStatus().equals("success")) {  //ViRaj_if_3

                        Intent intent = new Intent(activity_forget_password, activity_verify_otp.class);
                        intent.putExtra(getString(R.string.verification_rrrrr), 300);
                        intent.putExtra(getString(R.string.phone_number_rrrrr), mobileNumber_rrrrr);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                    }
                    Toast.makeText(activity_forget_password, data.getMessage(), Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(activity_forget_password, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
            @Override
            public void onFailure(Call<wh> call, Throwable t) {  //ViRaj_if_3

                System.out.println("verifyUser " + t);
                Toast.makeText(activity_forget_password, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });
    }
    //ViRaj_fun_A_38 //ViRaj_fun_A_35 //ViRaj_fun_A_47
}