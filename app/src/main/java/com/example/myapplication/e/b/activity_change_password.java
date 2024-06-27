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
import android.widget.Toast;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.d.xa;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.e.e.wg;
import com.example.myapplication.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import static com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr;
import static com.example.myapplication.e.a.cf.myReceiver_rrrrr;
import java.util.HashMap;
import java.util.Map;
//ViRaj_imports

public class activity_change_password extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_03
    private TextInputEditText mINewPass_rrrrr, mIConfPass_rrrrr;
    //ViRaj_fun_A_37 //ViRaj_fun_A_24
    private ShapeableImageView mBackIcon_rrrrr, mPassToggle_rrrrr, mPassToggleConf_rrrrr;
    private ProgressBar mProgressBar_rrrrr;
    //ViRaj_fun_A_07 //ViRaj_fun_A_15 //ViRaj_fun_A_04 //ViRaj_fun_A_31 //ViRaj_fun_A_09
    private IntentFilter mIntentFilter_rrrrr;
    private int changePassword_rrrrr =0;
    private String[] mMNumber_rrrrr = null;
    cf cf_rrrrr;
    ca ca_rrrrr;
    //ViRaj_fun_A_32 //ViRaj_fun_A_05 //ViRaj_fun_A_12 //ViRaj_fun_A_47
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();

    //ViRaj_fun_A_20 //ViRaj_fun_A_50 //ViRaj_fun_A_35

    @Override  protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3
super.onCreate(savedInstanceState); setContentView(R.layout.activity_change_password); intVariables(); //ViRaj_if_6
 algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr)); ca_rrrrr = new ca(this); loadData(); //ViRaj_if_6
 }
    //ViRaj_fun_A_28 //ViRaj_fun_A_16 //ViRaj_fun_A_40 //ViRaj_fun_A_45 //ViRaj_fun_A_46 //ViRaj_fun_A_41 //ViRaj_fun_A_49 //ViRaj_fun_A_30
    private void loadData() {  //ViRaj_if_3


        if (changePassword_rrrrr ==1) {  //ViRaj_if_4
 mBackIcon_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1
}else {  //ViRaj_if_5

            mBackIcon_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2
}
        MaterialTextView mDataConText = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

        cf_rrrrr = new cf(mDataConText);
        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr);

        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);
    }
    //ViRaj_fun_A_27 //ViRaj_fun_A_43 //ViRaj_fun_A_39 //ViRaj_fun_A_33
    private void intVariables() {  //ViRaj_if_3


        mBackIcon_rrrrr = findViewById(R.id.rrrrr_backIcon_rrrrr);
        mINewPass_rrrrr = findViewById(R.id.rrrrr_inputNewPass_rrrrr);
        mPassToggle_rrrrr = findViewById(R.id.rrrrr_pass_toggle_rrrrr);
        mIConfPass_rrrrr = findViewById(R.id.rrrrr_inputConformPass_rrrrr);
        mPassToggleConf_rrrrr = findViewById(R.id.rrrrr_passToggleEyeConf_rrrrr);
        mProgressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5

        changePassword_rrrrr = getIntent().getIntExtra(getString(R.string.changePassword_rrrrr), 0);
        mMNumber_rrrrr = getIntent().getStringArrayExtra(getString(R.string.phone_number_rrrrr));

    }
    //ViRaj_fun_A_36 //ViRaj_fun_A_22 //ViRaj_fun_A_11 //ViRaj_fun_A_44
    public void GoChangePassBtn(View view) {  //ViRaj_if_3

        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);

        if (TextUtils.isEmpty(mINewPass_rrrrr.getText().toString())) {  //ViRaj_if_4
 Snackbar.make(view,getString( R.string.new_pass_rrrrr), 2000).show(); return; }
        if (mINewPass_rrrrr.getText().toString().length()<4) {  //ViRaj_if_4
 Snackbar.make(view, getString(R.string.four_char_rrrrr), 2000).show(); return; }
        if (TextUtils.isEmpty(mIConfPass_rrrrr.getText().toString())) {  //ViRaj_if_4
 Snackbar.make(view, getString(R.string.conf_pass_rrrrr), 2000).show(); return; }
        if (!mIConfPass_rrrrr.getText().toString().trim().equals(mINewPass_rrrrr.getText().toString().trim())) {  //ViRaj_if_4
Snackbar.make(view, getString(R.string.pass_not_match_rrrrr), 2000).show(); return; }
        if (cc.isOnline_rrrrr(this))  changePassMethod(mMNumber_rrrrr[0], mMNumber_rrrrr[1], mIConfPass_rrrrr.getText().toString()); else Toast.makeText(this, getString(R.string.check_net_rrrrr), Toast.LENGTH_SHORT).show();

    }
    //ViRaj_fun_A_19 //ViRaj_fun_A_18 //ViRaj_fun_A_13
    private void changePassMethod(String mobile, String mobileToken, String inputConformPass) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","forgot_password_verify");
        headerClaims_rrrrr.put("token",mobileToken);
        payLoadClaims_rrrrr.put("mobile",mobile);
        payLoadClaims_rrrrr.put("mobile_token","phone_token");
        payLoadClaims_rrrrr.put("password",inputConformPass);
        mProgressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        String token = JWT.create().withHeader(headerClaims_rrrrr).withPayload(payLoadClaims_rrrrr).sign(algorithmHS_rrrrr); token = ca_rrrrr.appData_rrrrr(token);
        Call<wg> call = xa.getClient().forgotPassVerify(token);
        call.enqueue(new Callback<wg>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wg> call, Response<wg> response) {  //ViRaj_if_3

                wg wg = response.body();
                if (response.isSuccessful()) {  //ViRaj_if_3

                    if (wg.getStatus().equals("success")) {  //ViRaj_if_3


                        if (wg.getCode().equalsIgnoreCase("505")) {  //ViRaj_if_3
 ce.setCleaninfo_rrrrr(activity_change_password.this); Toast.makeText(activity_change_password.this, wg.getMessage(), Toast.LENGTH_SHORT).show(); Intent intent = new Intent(activity_change_password.this, activity_sign_in.class); startActivity(intent); finish(); }
                        if (changePassword_rrrrr == 1) {  //ViRaj_if_3
 ce.setSigninTkn_rrrrr(activity_change_password.this, wg.getData().getToken()); Intent intent = new Intent(activity_change_password.this, activity_dashboard.class); intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK); startActivity(intent); finish(); }
                        if (changePassword_rrrrr == 2) {  //ViRaj_if_3
 ce.setSigninTkn_rrrrr(activity_change_password.this, wg.getData().getToken()); Intent intent = new Intent(activity_change_password.this, activity_sign_in.class); intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK); startActivity(intent); finish(); }

                    }
                    Toast.makeText(activity_change_password.this, wg.getMessage(), Toast.LENGTH_SHORT).show();
                }else {  //ViRaj_if_5

                    Toast.makeText(activity_change_password.this, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                mProgressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
            @Override
            public void onFailure(Call<wg> call, Throwable t) {  //ViRaj_if_3

                System.out.println("forgotPasswordVerify "+t);
                Toast.makeText(activity_change_password.this, "An error has occurred", Toast.LENGTH_SHORT).show();
                mProgressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2


            }
        });
    }
    //ViRaj_fun_A_02 //ViRaj_fun_A_29 //ViRaj_fun_A_01 //ViRaj_fun_A_21
    public void passToggleConf(View view) {  //ViRaj_if_3

        if (mIConfPass_rrrrr.getTransformationMethod().getClass().getSimpleName() .equals("PasswordTransformationMethod")) {  //ViRaj_if_3

            mIConfPass_rrrrr.setTransformationMethod(new SingleLineTransformationMethod());
            mPassToggleConf_rrrrr.setImageResource(R.drawable.ic_baseline_visibility_off_24);
        }
        else {  //ViRaj_if_5

            mIConfPass_rrrrr.setTransformationMethod(new PasswordTransformationMethod());
            mPassToggleConf_rrrrr.setImageResource(R.drawable.ic_baseline_visibility_24);
        }
        mIConfPass_rrrrr.setSelection(mIConfPass_rrrrr.getText().length());
    }
    //ViRaj_fun_A_42 //ViRaj_fun_A_23 //ViRaj_fun_A_14
    public void passToggle(View view) {  //ViRaj_if_3

        if (mINewPass_rrrrr.getTransformationMethod().getClass().getSimpleName() .equals("PasswordTransformationMethod")) {  //ViRaj_if_3

            mINewPass_rrrrr.setTransformationMethod(new SingleLineTransformationMethod());
            mPassToggle_rrrrr.setImageResource(R.drawable.ic_baseline_visibility_off_24);
        }
        else {  //ViRaj_if_5

            mINewPass_rrrrr.setTransformationMethod(new PasswordTransformationMethod());
            mPassToggle_rrrrr.setImageResource(R.drawable.ic_baseline_visibility_24);
        }

        mINewPass_rrrrr.setSelection(mINewPass_rrrrr.getText().length());
    }
    //ViRaj_fun_A_17 //ViRaj_fun_A_08
    @Override protected void onRestart() {  //ViRaj_if_3
 super.onRestart(); registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr); }
    //ViRaj_fun_A_38
    @Override protected void onPause() {  //ViRaj_if_3
super.onPause();unregisterReceiver(myReceiver_rrrrr);}
    //ViRaj_fun_A_48
    //ViRaj_fun_A_26
    public void backBtn(View view) {  //ViRaj_if_3
onBackPressed();}
    @Override protected void onResume() {  //ViRaj_if_3
super.onResume(); registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr); }
    //ViRaj_fun_A_34 //ViRaj_fun_A_25 //ViRaj_fun_A_10 //ViRaj_fun_A_06

}