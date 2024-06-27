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
import android.widget.TextView;
import android.widget.Toast;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.myapplication.e.e.wg;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.d.xa;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.R;
import com.google.android.material.appbar.MaterialToolbar;
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

public class activity_user_profile extends AppCompatActivity {

    //ViRaj_int

    private MaterialToolbar toolbar_rrrrr;
    private TextView materialButton_rrrrr;
    //ViRaj_fun_A_07 //ViRaj_fun_A_26 //ViRaj_fun_A_19 //ViRaj_fun_A_41
    private ProgressBar progressBar_rrrrr;
    private TextInputEditText editTextName_rrrrr, editTextNumbar_rrrrr, editTextEmail_rrrrr;
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_09 //ViRaj_fun_A_50 //ViRaj_fun_A_05 //ViRaj_fun_A_47
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();
    ca ca_rrrrr;

    //ViRaj_fun_A_23 //ViRaj_fun_A_30 //ViRaj_fun_A_24
    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        intVariables(); //ViRaj_if_6

        algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr));
        ca_rrrrr = new ca(this);
        loadData(); //ViRaj_if_6

        toolbarMethod();
    }
    //ViRaj_fun_A_20 //ViRaj_fun_A_49 //ViRaj_fun_A_35 //ViRaj_fun_A_01 //ViRaj_fun_A_16

    private void loadData() {  //ViRaj_if_3

        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);
        editTextName_rrrrr.setText(ce.getRegistrationObject_rrrrr(this, ce.KEY_USER_NAME_rrrrr));
        editTextNumbar_rrrrr.setText(ce.getRegistrationObject_rrrrr(this, ce.KEY_PHONE_NUMBER_rrrrr));
        editTextEmail_rrrrr.setText(ce.getPrfrnceinfo_rrrrr(this, ce.KEY_CLIENT_EMAIL_rrrrr));
        editTextName_rrrrr.setSelection(editTextName_rrrrr.getText().length());
    }
    //ViRaj_fun_A_11 //ViRaj_fun_A_40 //ViRaj_fun_A_42 //ViRaj_fun_A_27 //ViRaj_fun_A_12

    private void intVariables() {  //ViRaj_if_3


        toolbar_rrrrr = findViewById(R.id.rrrrr_toolbar_rrrrr); //ViRaj_if_5

        editTextName_rrrrr = findViewById(R.id.rrrrr_user_name_rrrrr);
        editTextEmail_rrrrr = findViewById(R.id.rrrrr_edit_txt_email);
        editTextNumbar_rrrrr = findViewById(R.id.rrrrr_phone_num_rrrrr);
        materialButton_rrrrr = findViewById(R.id.rrrrr_suBtn_rrrrr);
        progressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5

        MaterialTextView mDataConText = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

        cf cf = new cf(mDataConText);

    }
    //ViRaj_fun_A_48 //ViRaj_fun_A_14 //ViRaj_fun_A_36 //ViRaj_fun_A_22 //ViRaj_fun_A_21

    public void updatBtn(View view) {  //ViRaj_if_3

        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);

        if (TextUtils.isEmpty(editTextName_rrrrr.getText().toString())) {  //ViRaj_if_4
 Snackbar.make(view, getString(R.string.enter_name__rrrrr), 2000).show(); return;}
        if (TextUtils.isEmpty(editTextEmail_rrrrr.getText().toString())) {  //ViRaj_if_4
 Snackbar.make(view, getString(R.string.enter_mail_rrrrr), 2000).show(); return;}
        if (!isValidEmail(editTextEmail_rrrrr.getText())) {  //ViRaj_if_4
Snackbar.make(view, getString(R.string.valid_mail_rrrrr), 2000).show();return;}
        if (cc.isOnline_rrrrr(this)) updateInfoMethod(activity_user_profile.this, editTextEmail_rrrrr.getText().toString(), editTextName_rrrrr.getText().toString());else Toast.makeText(this, getString(R.string.check_net_rrrrr), Toast.LENGTH_SHORT).show();

    }
    //ViRaj_fun_A_43 //ViRaj_fun_A_08 //ViRaj_fun_A_03 //ViRaj_fun_A_28 //ViRaj_fun_A_06

    private void updateInfoMethod(activity_user_profile activity_rrrrr, String email, String name) {  //ViRaj_if_3

        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();

        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","update_profile");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("email",email);
        payLoadClaims_rrrrr.put("name",name);

        String token = JWT.create()
                .withHeader(headerClaims_rrrrr)
                .withPayload(payLoadClaims_rrrrr)
                .sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

        Call<wg> call = xa.getClient().UpgrdeUserInfo(token);
        call.enqueue(new Callback<wg>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wg> call, Response<wg> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4

                    wg wg = response.body();
                    if (wg.getCode().equalsIgnoreCase("505")) {  //ViRaj_if_4

                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, wg.getMessage(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }
                    if (wg.getStatus().equalsIgnoreCase(getString(R.string.success_rrrrr))) {  //ViRaj_if_4

                        materialButton_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                        editTextName_rrrrr.setEnabled(false);
                        editTextEmail_rrrrr.setEnabled(false);
                        activity_dashboard.userName_rrrrr.setText(name);
                        ce.setRegisterData_rrrrr(activity_rrrrr, ce.KEY_USER_NAME_rrrrr, wg.getData().getUsername());
                        ce.setPrefrenceStrngData_rrrrr(activity_rrrrr, ce.KEY_CLIENT_EMAIL_rrrrr, wg.getData().getEmail());
                    }
                    Toast.makeText(activity_user_profile.this, wg.getMessage(), Toast.LENGTH_SHORT).show();
                }else
                Toast.makeText(activity_user_profile.this, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
            @Override
            public void onFailure(Call<wg> call, Throwable t) {  //ViRaj_if_3

                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                System.out.println("updateProfile error "+t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
            }
        });
    }
    //ViRaj_fun_A_45 //ViRaj_fun_A_02 //ViRaj_fun_A_15

    boolean isValidEmail(CharSequence email) {  //ViRaj_if_3
return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();}
    private void toolbarMethod() {  //ViRaj_if_3

        toolbar_rrrrr.setNavigationOnClickListener(v -> onBackPressed());}
    //ViRaj_fun_A_34 //ViRaj_fun_A_29 //ViRaj_fun_A_37
    public void editBtn(View view) {  //ViRaj_if_3

        materialButton_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

        editTextName_rrrrr.setEnabled(true);
        editTextEmail_rrrrr.setEnabled(true);
        editTextName_rrrrr.requestFocus();}
    @Override protected void onRestart() {  //ViRaj_if_3
super.onRestart();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    //ViRaj_fun_A_44 //ViRaj_fun_A_32 //ViRaj_fun_A_17 //ViRaj_fun_A_39 //ViRaj_fun_A_31
    @Override protected void onResume() {  //ViRaj_if_3
super.onResume();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    @Override protected void onPause() {  //ViRaj_if_3
super.onPause();unregisterReceiver(myReceiver_rrrrr);}
    //ViRaj_fun_A_46 //ViRaj_fun_A_10 //ViRaj_fun_A_33 //ViRaj_fun_A_13 //ViRaj_fun_A_04 //ViRaj_fun_A_25 //ViRaj_fun_A_38 //ViRaj_fun_A_18
}