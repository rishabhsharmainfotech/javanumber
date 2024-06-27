package com.example.myapplication.e.b;

import static com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr;
import static com.example.myapplication.e.a.cf.myReceiver_rrrrr;
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
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.myapplication.e.e.wg;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.e.e.wh;
import com.example.myapplication.R;
import com.example.myapplication.e.d.xa;
import java.util.HashMap;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
//ViRaj_imports

public class activity_verify_otp extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_09 //ViRaj_fun_A_41
    private TextInputEditText mInPC_rrrrr, phone_num_rrrrr;
    //ViRaj_fun_A_33 //ViRaj_fun_A_03 //ViRaj_fun_A_11
    private ShapeableImageView passTogglePin_rrrrr;
    //ViRaj_fun_A_05
    private ProgressBar progressBar_rrrrr;
    //ViRaj_fun_A_37
    private MaterialTextView dataConText_rrrrr, mtv_activity_rrrrr;
    //ViRaj_fun_A_01
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_28
    int code_rrrrr = 200;
    //ViRaj_fun_A_46
    String mobileNumber_rrrrr = "";
    //ViRaj_fun_A_06
    cf cf_rrrrr;
    ca ca_rrrrr;
    //ViRaj_fun_A_45
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();

    //ViRaj_fun_A_24 //ViRaj_fun_A_26 //ViRaj_fun_A_30 //ViRaj_fun_A_48
    @Override protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3
 super.onCreate(savedInstanceState); setContentView(R.layout.activity_verify_otp); intVariables(); //ViRaj_if_6
 algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr)); loadData(); //ViRaj_if_6
 }
    private void loadData() {  //ViRaj_if_3

        cf_rrrrr = new cf(dataConText_rrrrr);
        ca_rrrrr = new ca(this);
        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);
    }

    //ViRaj_fun_A_32 //ViRaj_fun_A_20 //ViRaj_fun_A_15
    private void intVariables() {  //ViRaj_if_3


        mInPC_rrrrr = findViewById(R.id.rrrrr_in_pc_rrrrr);
        phone_num_rrrrr = findViewById(R.id.rrrrr_phone_num_rrrrr);
        passTogglePin_rrrrr = findViewById(R.id.rrrrr_pass_tpc_rrrrr);
        progressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5

        dataConText_rrrrr = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

        mtv_activity_rrrrr = findViewById(R.id.rrrrr_mtv_activity_rrrrr);
        code_rrrrr = getIntent().getIntExtra(getString(R.string.verification_rrrrr),200);
        mobileNumber_rrrrr = getIntent().getStringExtra(getString(R.string.phone_number_rrrrr));
        phone_num_rrrrr.setText(mobileNumber_rrrrr);

        switch (code_rrrrr) {  //ViRaj_if_4


            case 200:  mtv_activity_rrrrr.setText("Registration"); break;
            case 300:  mtv_activity_rrrrr.setText("Forgot Password"); break;
            case 400:  mtv_activity_rrrrr.setText("Forgot Pin"); break;

        }
    }
    //ViRaj_fun_A_16 //ViRaj_fun_A_49 //ViRaj_fun_A_13 //ViRaj_fun_A_42
    public void verifyOtp(View view) {  //ViRaj_if_3

        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        if (TextUtils.isEmpty(mInPC_rrrrr.getText().toString())) {  //ViRaj_if_4

            Snackbar.make(view, "Please Enter OTP",2000).show();
            return;
        }
        if (mInPC_rrrrr.getText().toString().length()<4) {  //ViRaj_if_4

            Snackbar.make(view, "Please Enter a valid OTP",2000).show();
            return;
        }
        if (cc.isOnline_rrrrr(this)) {  //ViRaj_if_4

            switch (code_rrrrr) {  //ViRaj_if_4

                case 200:
                    verifyUserMethod(this , ce.getRegistrationObject_rrrrr(activity_verify_otp.this, ce.KEY_PHONE_NUMBER_rrrrr), "mobile_token", mInPC_rrrrr.getText().toString().trim());
                    break;
                case 300:
                case 400:
                    verifyOTP(this, mobileNumber_rrrrr, mInPC_rrrrr.getText().toString().trim());
                    break;
            }
        }
        else Toast.makeText(this, getString(R.string.check_net_rrrrr), Toast.LENGTH_SHORT).show();
    }
    //ViRaj_fun_A_35 //ViRaj_fun_A_23 //ViRaj_fun_A_40
    private void verifyOTP(activity_verify_otp activity_verify_otp, String mobileNumber, String otp) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","verify_otp");
        payLoadClaims_rrrrr.put("mobile",mobileNumber);
        payLoadClaims_rrrrr.put("otp",otp);
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        String token = JWT.create().withHeader(headerClaims_rrrrr).withPayload(payLoadClaims_rrrrr) .sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        Call<wg> call = xa.getClient().verifyOtp(token);
        call.enqueue(new Callback<wg>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wg> call, Response<wg> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_3

                    wg wg = response.body();
                    if (wg.getStatus().equals("success")) {  //ViRaj_if_3

                        ce.setSigninTkn_rrrrr(activity_verify_otp, wg.getData().getToken());
                        Intent intent = new Intent(activity_verify_otp, activity_verifying.class);
                        intent.putExtra(getString(R.string.verification_rrrrr), code_rrrrr);
                        intent.putExtra(getString(R.string.phone_number_rrrrr),mobileNumber);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        finish();
                    }
                    Toast.makeText(activity_verify_otp, wg.getMessage(), Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(activity_verify_otp, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
            @Override
            public void onFailure(Call<wg> call, Throwable t) {  //ViRaj_if_3

                System.out.println("verifyUser " + t);
                Toast.makeText(activity_verify_otp, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });
    }
    //ViRaj_fun_A_22 //ViRaj_fun_A_43 //ViRaj_fun_A_27
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
    //ViRaj_fun_A_50 //ViRaj_fun_A_25 //ViRaj_fun_A_21
    private void verifyUserMethod(activity_verify_otp activity_verify_otp, String mobileNumber, String mobile_token, String otp) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","verify_user");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("mobile",mobileNumber);
        payLoadClaims_rrrrr.put("mobile_token",mobile_token);
        payLoadClaims_rrrrr.put("otp",otp);
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        String token = JWT.create().withHeader(headerClaims_rrrrr).withPayload(payLoadClaims_rrrrr).sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        Call<wg> call = xa.getClient().verifyCustomer(token);
        call.enqueue(new Callback<wg>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wg> call, Response<wg> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_3

                    wg wg = response.body();
                    if (wg.getStatus().equals("success")) {  //ViRaj_if_3

                        ce.setSigninTkn_rrrrr(activity_verify_otp, wg.getData().getToken());
                        ce.setSigninSuccess_rrrrr(activity_verify_otp, true);
                        Intent intent = new Intent(activity_verify_otp, activity_dashboard.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        finish();
                    }
                    Toast.makeText(activity_verify_otp, wg.getMessage(), Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(activity_verify_otp, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
            @Override
            public void onFailure(Call<wg> call, Throwable t) {  //ViRaj_if_3

                System.out.println("verifyUser " + t);
                Toast.makeText(activity_verify_otp, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });
    }
    //ViRaj_fun_A_08 //ViRaj_fun_A_31 //ViRaj_fun_A_07 //ViRaj_fun_A_36
    @Override  protected void onRestart() {  //ViRaj_if_3
 super.onRestart(); registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr); }
    //ViRaj_fun_A_38
    @Override protected void onResume() {  //ViRaj_if_3
 super.onResume(); registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr); }
    //ViRaj_fun_A_02
    @Override  protected void onPause() {  //ViRaj_if_3
 super.onPause(); unregisterReceiver(myReceiver_rrrrr); }
    //ViRaj_fun_A_14
    @Override  public void onBackPressed() {  //ViRaj_if_3

        finishAffinity();
    }
    //ViRaj_fun_A_04
    //ViRaj_fun_A_17
    public void resendOtp(View view) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","resend_otp");
        payLoadClaims_rrrrr.put("mobile", mobileNumber_rrrrr);
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        String token = JWT.create() .withHeader(headerClaims_rrrrr) .withPayload(payLoadClaims_rrrrr) .sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        Call<wh> call = xa.getClient().resendOtp(token);
        call.enqueue(new Callback<wh>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wh> call, Response<wh> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_3

                    wh modelSignIn = response.body();
                    Toast.makeText(activity_verify_otp.this, modelSignIn.getMessage(), Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(activity_verify_otp.this, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
            @Override
            public void onFailure(Call<wh> call, Throwable t) {  //ViRaj_if_3

                System.out.println("verifyUser " + t);
                Toast.makeText(activity_verify_otp.this, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });
    }
    //ViRaj_fun_A_19 //ViRaj_fun_A_18 //ViRaj_fun_A_39 //ViRaj_fun_A_47 //ViRaj_fun_A_10 //ViRaj_fun_A_34 //ViRaj_fun_A_29 //ViRaj_fun_A_12 //ViRaj_fun_A_44
}