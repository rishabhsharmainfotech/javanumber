package com.example.myapplication.e.b;

import androidx.annotation.NonNull;
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
import com.example.myapplication.e.e.wa;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.d.xa;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.e.e.wh;
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

public class activity_registration extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_02 //ViRaj_fun_A_15 //ViRaj_fun_A_19 //ViRaj_fun_A_23 //ViRaj_fun_A_21 //ViRaj_fun_A_11
    private TextInputEditText mInName_rrrrr, mIMobNum_rrrrr, mInPass_rrrrr, mInPC_rrrrr;
    //ViRaj_fun_A_29 //ViRaj_fun_A_14
    private ShapeableImageView passToggle_rrrrr, passTogglePin_rrrrr;
    //ViRaj_fun_A_12 //ViRaj_fun_A_27
    private ProgressBar progressBar_rrrrr;
    //ViRaj_fun_A_32 //ViRaj_fun_A_22
    private MaterialTextView dataConText_rrrrr;
    //ViRaj_fun_A_40 //ViRaj_fun_A_43
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_28 //ViRaj_fun_A_30 //ViRaj_fun_A_36
    cf cf_rrrrr;
    ca ca_rrrrr;
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();

    //ViRaj_fun_A_09 //ViRaj_fun_A_41 //ViRaj_fun_A_47
    @Override  protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3
 super.onCreate(savedInstanceState); setContentView(R.layout.activity_registration); intVariables(); //ViRaj_if_6
 algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr)); loadData(); //ViRaj_if_6
 }
    //ViRaj_fun_A_18
    private void loadData() {  //ViRaj_if_3
 cf_rrrrr = new cf(dataConText_rrrrr); ca_rrrrr = new ca(this); mIntentFilter_rrrrr = new IntentFilter(); mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr); Intent serviceIntent = new Intent(this, cc.class); startService(serviceIntent); }
    //ViRaj_fun_A_13
    private void intVariables() {  //ViRaj_if_3


        mInName_rrrrr = findViewById(R.id.rrrrr_user_name_rrrrr);
        mIMobNum_rrrrr = findViewById(R.id.rrrrr_phone_num_rrrrr);
        mInPass_rrrrr = findViewById(R.id.rrrrr_in_pass_rrrrr);
        passToggle_rrrrr = findViewById(R.id.rrrrr_pass_toggle_rrrrr);
        mInPC_rrrrr = findViewById(R.id.rrrrr_in_pc_rrrrr);
        passTogglePin_rrrrr = findViewById(R.id.rrrrr_pass_tpc_rrrrr);
        progressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5

        dataConText_rrrrr = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5


    }
    //ViRaj_fun_A_31 //ViRaj_fun_A_25 //ViRaj_fun_A_16 //ViRaj_fun_A_38
    public void signUp(View view) {  //ViRaj_if_3

        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);

        if (TextUtils.isEmpty(mInName_rrrrr.getText().toString())) {  //ViRaj_if_4
 Snackbar.make(view, getString(R.string.enter_name__rrrrr),2000).show(); return; }
        if (TextUtils.isEmpty(mIMobNum_rrrrr.getText().toString())) {  //ViRaj_if_4
 Snackbar.make(view, getString(R.string.mo_num_rrrrr),2000).show(); return; }
        if (mIMobNum_rrrrr.getText().toString().length()<10) {  //ViRaj_if_4
 Snackbar.make(view, getString(R.string.valid_mo_num_rrrrr),2000).show(); return; }
        if (TextUtils.isEmpty(mInPass_rrrrr.getText().toString())) {  //ViRaj_if_4
 Snackbar.make(view, getString(R.string.enter_pass_rrrrr),2000).show(); return; }
        if (mInPass_rrrrr.getText().toString().length()<4) {  //ViRaj_if_4
 Snackbar.make(view, getString(R.string.four_pass_rrrrr),2000).show(); return; }
        if (TextUtils.isEmpty(mInPC_rrrrr.getText().toString())) {  //ViRaj_if_4
 Snackbar.make(view, getString(R.string.pin_enter_rrrrr),2000).show(); return; }
        if (mInPC_rrrrr.getText().toString().length()<4) {  //ViRaj_if_4
 Snackbar.make(view, getString(R.string.four_pin_rrrrr),2000).show(); return; }
        if (cc.isOnline_rrrrr(this))  SignUpMethod(this , mInName_rrrrr.getText().toString().trim(), mIMobNum_rrrrr.getText().toString().trim(), mInPass_rrrrr.getText().toString().trim(), mInPC_rrrrr.getText().toString().trim()); else Toast.makeText(this, getString(R.string.check_net_rrrrr), Toast.LENGTH_SHORT).show();

    }
    //ViRaj_fun_A_49 //ViRaj_fun_A_26 //ViRaj_fun_A_48
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
    //ViRaj_fun_A_01 //ViRaj_fun_A_37 //ViRaj_fun_A_50 //ViRaj_fun_A_17
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

    //ViRaj_fun_A_05 //ViRaj_fun_A_44 //ViRaj_fun_A_04 //ViRaj_fun_A_06
    private void SignUpMethod(activity_registration activity_rrrrr, String personName_rrrrr, String mobileNumber_rrrrr, String password, String pinCode) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","signup");
        payLoadClaims_rrrrr.put("full_name", personName_rrrrr);
        payLoadClaims_rrrrr.put("mobile", mobileNumber_rrrrr);
        payLoadClaims_rrrrr.put("pin",pinCode);
        payLoadClaims_rrrrr.put("password",password);
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        String token = JWT.create() .withHeader(headerClaims_rrrrr) .withPayload(payLoadClaims_rrrrr) .sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        Call<wh> call = xa.getClient().getRegisterMethod(token);
        call.enqueue(new Callback<wh>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wh> call, Response<wh> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4

                    wh wh = response.body();
                    assert wh != null;
                    if (wh.getStatus().equals("success")) {  //ViRaj_if_4

                        getAppInfoMethod(activity_rrrrr);
                        Intent intent = new Intent(activity_registration.this, activity_verify_otp.class);
                        ce.setRegisterData_rrrrr(activity_registration.this, ce.KEY_USER_NAME_rrrrr, personName_rrrrr);
                        ce.setRegisterData_rrrrr(activity_registration.this, ce.KEY_PHONE_NUMBER_rrrrr, mobileNumber_rrrrr);
                        intent.putExtra(getString(R.string.verification_rrrrr), 200);
                        intent.putExtra(getString(R.string.phone_number_rrrrr), mobileNumber_rrrrr);
                        startActivity(intent);
                    }else
                        Toast.makeText(activity_registration.this, wh.getMessage(), Toast.LENGTH_SHORT).show();

                }
                else Toast.makeText(activity_registration.this, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
            @Override
            public void onFailure(Call<wh> call, Throwable t) {  //ViRaj_if_3

                Toast.makeText(getApplicationContext(), getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_LONG).show();
                System.out.println("getSignUp OnFailure "+t);
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });
    }
    //ViRaj_fun_A_39
    @Override
    protected void onRestart() {  //ViRaj_if_3

        super.onRestart();
        registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);
    }
    //ViRaj_fun_A_24 //ViRaj_fun_A_08
    @Override protected void onResume() {  //ViRaj_if_3
 super.onResume(); registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr); }
    public void AlreadyRegistered(View view) {  //ViRaj_if_3
 Intent intent = new Intent(this, activity_sign_in.class); startActivity(intent); }
    //ViRaj_fun_A_07 //ViRaj_fun_A_33
    @Override protected void onPause() {  //ViRaj_if_3
 super.onPause(); unregisterReceiver(myReceiver_rrrrr); }
    @Override public void onBackPressed() {  //ViRaj_if_3

        finishAffinity();
    }
    //ViRaj_fun_A_20 //ViRaj_fun_A_42 //ViRaj_fun_A_35 //ViRaj_fun_A_34
    private void getAppInfoMethod(activity_registration activity_rrrrr) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","app_details");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("string","string");
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        String token = JWT.create().withHeader(headerClaims_rrrrr).withPayload(payLoadClaims_rrrrr).sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        Call<wa> call = xa.getClient().getAppInfo(token);
        call.enqueue(new Callback<wa>() {  //ViRaj_if_3

            @Override
            public void onResponse(@NonNull Call<wa> call, @NonNull Response<wa> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_3

                    wa wa = response.body();
                    if (wa.getCode_rrrrr().equalsIgnoreCase("505")) {  //ViRaj_if_3

                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, wa.getMessage_rrrrr(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }

                    if (wa.getStatus_rrrrr().equalsIgnoreCase(getString(R.string.success_rrrrr))) {  //ViRaj_if_3


                        ce.setPrefrenceStrngData_rrrrr(activity_rrrrr, ce.KEY_MAR_TXT_rrrrr, wa.getData_rrrrr().getBanner_marquee_rrrrr());
                        ce.setContactUsInfo_rrrrr(activity_rrrrr, ce.KEY_PHONE_NUMBER1_rrrrr, "+91" + wa.getData_rrrrr().getContact_details_rrrrr().getMobile_no_1_rrrrr());
                        ce.setContactUsInfo_rrrrr(activity_rrrrr, ce.KEY_ADVERTISEMENT_LINK_rrrrr,  wa.getData_rrrrr().getContact_details_rrrrr().getTelegram_channel_link_rrrrr());
                        ce.setContactUsInfo_rrrrr(activity_rrrrr, ce.KEY_WHATSAP_NUMBER_rrrrr, "+91" + wa.getData_rrrrr().getContact_details_rrrrr().getWhatsapp_no_rrrrr());
                        ce.setContactUsInfo_rrrrr(activity_rrrrr, ce.KEY_RAZORPAY_LIVE_KEY_rrrrr, wa.getData_rrrrr().getContact_details_rrrrr().getEmail_1_rrrrr());
                        ce.setPosterImages_rrrrr(activity_rrrrr, ce.KEY_POSTER_IMAGES1_rrrrr, wa.getData_rrrrr().getBanner_image_rrrrr().getBanner_img_1_rrrrr());
                        ce.setPosterImages_rrrrr(activity_rrrrr, ce.KEY_POSTER_IMAGES2_rrrrr, wa.getData_rrrrr().getBanner_image_rrrrr().getBanner_img_2_rrrrr());
                        ce.setPosterImages_rrrrr(activity_rrrrr, ce.KEY_POSTER_IMAGES3_rrrrr, wa.getData_rrrrr().getBanner_image_rrrrr().getBanner_img_3_rrrrr());

                    } else Toast.makeText(activity_rrrrr, wa.getMessage_rrrrr(), Toast.LENGTH_SHORT).show();
                } else {  //ViRaj_if_5
Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();}
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
            @Override
            public void onFailure(Call<wa> call, Throwable t) {  //ViRaj_if_3

                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                System.out.println("getAppDetails error " + t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
            }
        });

    }
    //ViRaj_fun_A_10 //ViRaj_fun_A_03 //ViRaj_fun_A_46 //ViRaj_fun_A_45

}