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
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.myapplication.e.e.wg;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.R;
import com.example.myapplication.e.d.xa;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import java.util.HashMap;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
//ViRaj_imports

public class activity_sign_in extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_24 //ViRaj_fun_A_01 //ViRaj_fun_A_03 //ViRaj_fun_A_47 //ViRaj_fun_A_02 //ViRaj_fun_A_33
    private TextInputEditText inNum_rrrrr, inPass_rrrrr;
    //ViRaj_fun_A_14
    private ShapeableImageView pToggle_rrrrr;
    //ViRaj_fun_A_15
    private ProgressBar progressBar_rrrrr;
    //ViRaj_fun_A_22 //ViRaj_fun_A_34
    private MaterialTextView mDataConText_rrrrr;
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_49 //ViRaj_fun_A_18
    cf cf_rrrrr;
    ca ca_rrrrr;
    //ViRaj_fun_A_27 //ViRaj_fun_A_07 //ViRaj_fun_A_35 //ViRaj_fun_A_13 //ViRaj_fun_A_28
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();

    //ViRaj_fun_A_26 //ViRaj_fun_A_08 //ViRaj_fun_A_11 //ViRaj_fun_A_48 //ViRaj_fun_A_20
    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        intVariables(); //ViRaj_if_6

        algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr));
        ca_rrrrr = new ca(this);
        loadData(); //ViRaj_if_6

    }
    //ViRaj_fun_A_05 //ViRaj_fun_A_21
    private void loadData() {  //ViRaj_if_3

        cf_rrrrr = new cf(mDataConText_rrrrr);
        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);
    }
    //ViRaj_fun_A_50 //ViRaj_fun_A_43 //ViRaj_fun_A_12
    public void SignInBtn(View view) {  //ViRaj_if_3

        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        String number = inNum_rrrrr.getText().toString();
        String password = inPass_rrrrr.getText().toString();

        if (TextUtils.isEmpty(number)) {  //ViRaj_if_4
 Snackbar.make(view, getString(R.string.mo_num_rrrrr),2000).show();return; }
        if (number.length()!=10) {  //ViRaj_if_4
 Snackbar.make(view, getString(R.string.valid_mo_num_rrrrr),2000).show(); return;}
        if (TextUtils.isEmpty(password)) {  //ViRaj_if_4
 Snackbar.make(view, getString(R.string.enter_pass_rrrrr),2000).show(); return;}
        if (password.length()<4) {  //ViRaj_if_4
 Snackbar.make(view, getString(R.string.four_pass_rrrrr),2000).show(); return; }
        if (cc.isOnline_rrrrr(this))  signInMethod(number,password); else Toast.makeText(this, getString(R.string.check_net_rrrrr), Toast.LENGTH_SHORT).show();

    }
    //ViRaj_fun_A_40 //ViRaj_fun_A_46 //ViRaj_fun_A_38
    private void signInMethod(String number_rrrrr, String password) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","login");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("mobile", number_rrrrr);
        payLoadClaims_rrrrr.put("password",password);
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        String token = JWT.create() .withHeader(headerClaims_rrrrr) .withPayload(payLoadClaims_rrrrr) .sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        Call<wg> call = xa.getClient().getSignIn(token);
        call.enqueue(new Callback<wg>() {  //ViRaj_if_3

            @Override
            public void onResponse(@NonNull Call<wg> call, @NonNull Response<wg> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4

                    wg wg = response.body();
                    assert wg != null;
                    if (wg.getStatus().equals("success")) {  //ViRaj_if_4

                        ce.setSigninTkn_rrrrr(activity_sign_in.this, wg.getData().getToken());
                        Intent intent = new Intent(activity_sign_in.this, activity_security_pin.class);
                        intent.putExtra(getString(R.string.phone_number_rrrrr), number_rrrrr);
                        intent.putExtra(getString(R.string.pin_reset_rrrrr), 200);
                        startActivity(intent);
                    }else {  //ViRaj_if_2

                        Toast.makeText(activity_sign_in.this, wg.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                }else {  //ViRaj_if_5

                    Toast.makeText(activity_sign_in.this, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
            @Override
            public void onFailure(Call<wg> call, Throwable t) {  //ViRaj_if_3

                Toast.makeText(getApplicationContext(), getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_LONG).show();
                System.out.println("getSignUp OnFailure "+t);
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });
    }
    //ViRaj_fun_A_06 //ViRaj_fun_A_32
    public void passToggle(View view) {  //ViRaj_if_3

        if (inPass_rrrrr.getTransformationMethod().getClass().getSimpleName() .equals("PasswordTransformationMethod")) {  //ViRaj_if_3

            inPass_rrrrr.setTransformationMethod(new SingleLineTransformationMethod());
            pToggle_rrrrr.setImageResource(R.drawable.ic_baseline_visibility_off_24);
        }
        else {  //ViRaj_if_5

            inPass_rrrrr.setTransformationMethod(new PasswordTransformationMethod());
            pToggle_rrrrr.setImageResource(R.drawable.ic_baseline_visibility_24);
        }
        inPass_rrrrr.setSelection(inPass_rrrrr.getText().length());
    }
    //ViRaj_fun_A_17 //ViRaj_fun_A_09
    public void forPass(View view) {  //ViRaj_if_3

        Intent intent = new Intent(this, activity_forget_password.class);
        if (!TextUtils.isEmpty(inNum_rrrrr.getText().toString())) {  //ViRaj_if_4

            intent.putExtra(getString(R.string.phone_number_rrrrr), inNum_rrrrr.getText().toString());
        }
        startActivity(intent);
    }
    //ViRaj_fun_A_30 //ViRaj_fun_A_45 //ViRaj_fun_A_42
    private void intVariables() {  //ViRaj_if_3


        inNum_rrrrr = findViewById(R.id.rrrrr_phone_num_rrrrr);
        inPass_rrrrr = findViewById(R.id.rrrrr_in_pass_rrrrr);
        pToggle_rrrrr = findViewById(R.id.rrrrr_pass_toggle_rrrrr);
        progressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5

        mDataConText_rrrrr = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5


    }

    //ViRaj_fun_A_10
    @Override protected void onRestart() {  //ViRaj_if_3
super.onRestart();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    //ViRaj_fun_A_04 //ViRaj_fun_A_37 //ViRaj_fun_A_29
    @Override protected void onPause() {  //ViRaj_if_3
super.onPause();unregisterReceiver(myReceiver_rrrrr); }
    //ViRaj_fun_A_41 //ViRaj_fun_A_36
    @Override protected void onResume() {  //ViRaj_if_3
 super.onResume(); registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr); }
    //ViRaj_fun_A_23 //ViRaj_fun_A_16
    public void registerClick(View view) {  //ViRaj_if_3
 Intent intent = new Intent(this, activity_registration.class); startActivity(intent); }
    //ViRaj_fun_A_25 //ViRaj_fun_A_44 //ViRaj_fun_A_31
    @Override public void onBackPressed() {  //ViRaj_if_3
finishAffinity();}
    //ViRaj_fun_A_19 //ViRaj_fun_A_39

}