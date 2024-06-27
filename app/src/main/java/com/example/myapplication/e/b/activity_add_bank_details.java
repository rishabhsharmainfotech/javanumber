package com.example.myapplication.e.b;

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
import static com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr;
import static com.example.myapplication.e.a.cf.myReceiver_rrrrr;
import java.util.HashMap;
import java.util.Map;
//ViRaj_imports

public class activity_add_bank_details extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_10
    private MaterialToolbar mToolbar_rrrrr;
    //ViRaj_fun_A_32
    private TextInputEditText mName_rrrrr, mAcNumber_rrrrr, mConfAcNumber_rrrrr, mIfscCode_rrrrr, mBankName_rrrrr, mBankAddress_rrrrr;
    //ViRaj_fun_A_29
    private ProgressBar mProgressBar_rrrrr;
    //ViRaj_fun_A_18
    private MaterialTextView mDataConText_rrrrr;
    //ViRaj_fun_A_45
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_14
    cf cf_rrrrr;
    //ViRaj_fun_A_34
    ca ca_rrrrr;
    //ViRaj_fun_A_17
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();
    //ViRaj_fun_A_01

    //ViRaj_fun_A_04 //ViRaj_fun_A_28 //ViRaj_fun_A_43 //ViRaj_fun_A_36 //ViRaj_fun_A_06 //ViRaj_fun_A_38 //ViRaj_fun_A_08
    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_bank_details);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.status_bar_color_rrrrr));
        intVariables(); //ViRaj_if_6

        algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr));
        ca_rrrrr = new ca(this);
        confiToolbar(); //ViRaj_if_5

        confiData(); //ViRaj_if_5


    }

    //ViRaj_fun_A_41 //ViRaj_fun_A_07 //ViRaj_fun_A_11 //ViRaj_fun_A_46
    private void confiData() {  //ViRaj_if_3


        if (ce.getBankObject_rrrrr(this, ce.KEY_BANK_USER_NAME_rrrrr)!=null) mName_rrrrr.setText(ce.getBankObject_rrrrr(this, ce.KEY_BANK_USER_NAME_rrrrr));else mName_rrrrr.setText("");
        if (ce.getBankObject_rrrrr(this, ce.KEY_B_AC_N_rrrrr)!=null) mAcNumber_rrrrr.setText(ce.getBankObject_rrrrr(this, ce.KEY_B_AC_N_rrrrr));else mAcNumber_rrrrr.setText("");
        if (ce.getBankObject_rrrrr(this, ce.KEY_B_AC_N_rrrrr)!=null) mConfAcNumber_rrrrr.setText(ce.getBankObject_rrrrr(this, ce.KEY_B_AC_N_rrrrr));else mConfAcNumber_rrrrr.setText("");
        if (ce.getBankObject_rrrrr(this, ce.KEY_B_IFSC_C_rrrrr)!=null) mIfscCode_rrrrr.setText(ce.getBankObject_rrrrr(this, ce.KEY_B_IFSC_C_rrrrr));else mIfscCode_rrrrr.setText("");
        if (ce.getBankObject_rrrrr(this, ce.KEY_B_N_rrrrr)!=null) mBankName_rrrrr.setText(ce.getBankObject_rrrrr(this, ce.KEY_B_N_rrrrr));else mBankName_rrrrr.setText("");
        if (ce.getBankObject_rrrrr(this, ce.KEY_BRANCH_ADDRESS_rrrrr)!=null) mBankAddress_rrrrr.setText(ce.getBankObject_rrrrr(this, ce.KEY_BRANCH_ADDRESS_rrrrr));else mBankAddress_rrrrr.setText("");
        cf_rrrrr = new cf(mDataConText_rrrrr);
        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);

    }

    //ViRaj_fun_A_50 //ViRaj_fun_A_23 //ViRaj_fun_A_05
    private void confiToolbar() {  //ViRaj_if_3

        mToolbar_rrrrr.setNavigationOnClickListener(v -> onBackPressed());
    }
    //ViRaj_fun_A_35 //ViRaj_fun_A_39 //ViRaj_fun_A_42
    public void submitInfo(View view) {  //ViRaj_if_3


        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        if (TextUtils.isEmpty(mName_rrrrr.getText().toString())) {  //ViRaj_if_4
        Snackbar.make(view, getString(R.string.bank_holder_name_rrrrr), 2000).show();return;}
        if (TextUtils.isEmpty(mAcNumber_rrrrr.getText().toString())) {  //ViRaj_if_4
        Snackbar.make(view, getString(R.string.bank_acc_num_rrrrr), 2000).show();return;}
        if (mAcNumber_rrrrr.getText().toString().length()<5) {  //ViRaj_if_4
        Snackbar.make(view, getString(R.string.valid_acc_num_rrrrr), 2000).show();return;}
        if (TextUtils.isEmpty(mConfAcNumber_rrrrr.getText().toString())) {  //ViRaj_if_4
        Snackbar.make(view, getString(R.string.conform_acc_num_rrrrr), 2000).show();return;}
        if (!mAcNumber_rrrrr.getText().toString().equals(mConfAcNumber_rrrrr.getText().toString())) {  //ViRaj_if_4
        Snackbar.make(view, getString(R.string.wrong_acc_rrrrr), 2000).show();return;}
        if (TextUtils.isEmpty(mIfscCode_rrrrr.getText().toString())) {  //ViRaj_if_4
        Snackbar.make(view, getString(R.string.ifsc_enter_rrrrr), 2000).show();return;}
        if (mIfscCode_rrrrr.getText().toString().length()<11) {  //ViRaj_if_4
        Snackbar.make(view, getString(R.string.valid_ifsc_rrrrr), 2000).show();return;}
        if (TextUtils.isEmpty(mBankName_rrrrr.getText().toString())) {  //ViRaj_if_4
        Snackbar.make(view, getString(R.string.banks_name_rrrrr), 2000).show();return;}
        if (TextUtils.isEmpty(mBankAddress_rrrrr.getText().toString())) {  //ViRaj_if_4
        Snackbar.make(view, getString(R.string.branchs_address_rrrrr), 2000).show();return;}
        if (cc.isOnline_rrrrr(this))
        bankInfoMethod(activity_add_bank_details.this, mName_rrrrr.getText().toString(), mAcNumber_rrrrr.getText().toString(), mIfscCode_rrrrr.getText().toString(), mBankName_rrrrr.getText().toString(), mBankAddress_rrrrr.getText().toString());
        else Toast.makeText(this, "Check Your Internet Connection", Toast.LENGTH_SHORT).show();

    }
    //ViRaj_fun_A_19
    private void bankInfoMethod(activity_add_bank_details activity_rrrrr, String holderName_rrrrr, String accountNumber_rrrrr, String ifscCode_rrrrr, String bankName_rrrrr, String bankAddress_rrrrr) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","update_bank_details");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("account_holder_name", holderName_rrrrr);
        payLoadClaims_rrrrr.put("account_no", accountNumber_rrrrr);
        payLoadClaims_rrrrr.put("ifsc_code", ifscCode_rrrrr);
        payLoadClaims_rrrrr.put("bank_name", bankName_rrrrr);
        payLoadClaims_rrrrr.put("branch_address", bankAddress_rrrrr);
        String token = JWT.create().withHeader(headerClaims_rrrrr).withPayload(payLoadClaims_rrrrr).sign(algorithmHS_rrrrr);
        mProgressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

        token = ca_rrrrr.appData_rrrrr(token);
        Call<wh> call = xa.getClient().upgradeBInfo(token);

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


                        ce.setBankInformation_rrrrr(activity_rrrrr, ce.KEY_BANK_USER_NAME_rrrrr, holderName_rrrrr);
                        ce.setBankInformation_rrrrr(activity_rrrrr, ce.KEY_B_AC_N_rrrrr, accountNumber_rrrrr);
                        ce.setBankInformation_rrrrr(activity_rrrrr, ce.KEY_B_IFSC_C_rrrrr, ifscCode_rrrrr);
                        ce.setBankInformation_rrrrr(activity_rrrrr, ce.KEY_B_N_rrrrr, bankName_rrrrr);
                        ce.setBankInformation_rrrrr(activity_rrrrr, ce.KEY_BRANCH_ADDRESS_rrrrr, bankAddress_rrrrr);
                        onBackPressed();

                    }else Toast.makeText(activity_rrrrr, wh.getMessage(), Toast.LENGTH_SHORT).show();
                    mProgressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                }else {  //ViRaj_if_5
                    Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();}
            }
            @Override public void onFailure(Call<wh> call, Throwable t) {  //ViRaj_if_3
    mProgressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2
    System.out.println("updateBankDetails error "+t); Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show(); }
        });
    }

    //ViRaj_fun_A_21
    @Override protected void onRestart() {  //ViRaj_if_3
    super.onRestart();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    //ViRaj_fun_A_20
    @Override protected void onPause() {  //ViRaj_if_3
    super.onPause();unregisterReceiver(myReceiver_rrrrr);}
    //ViRaj_fun_A_02
    @Override protected void onResume() {  //ViRaj_if_3
    super.onResume();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    //ViRaj_fun_A_44 //ViRaj_fun_A_24 //ViRaj_fun_A_12 //ViRaj_fun_A_48

    private void intVariables() {  //ViRaj_if_3
        mToolbar_rrrrr = findViewById(R.id.rrrrr_toolbar_rrrrr); //ViRaj_if_5
        mName_rrrrr = findViewById(R.id.rrrrr_name_rrrrr); //ViRaj_if_5
        mAcNumber_rrrrr = findViewById(R.id.rrrrr_acNumber_rrrrr);
        mConfAcNumber_rrrrr = findViewById(R.id.rrrrr_confAcNum_rrrrr);
        mIfscCode_rrrrr = findViewById(R.id.rrrrr_ifsc_code_rrrrr);
        mBankName_rrrrr = findViewById(R.id.rrrrr_bank_name_rrrrr);
        mBankAddress_rrrrr = findViewById(R.id.rrrrr_bank_address_rrrrr);
        mProgressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5
        mDataConText_rrrrr = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

    }
    //ViRaj_fun_A_40  //ViRaj_fun_A_15  //ViRaj_fun_A_13  //ViRaj_fun_A_31 //ViRaj_fun_A_33 //ViRaj_fun_A_26 //ViRaj_fun_A_47 //ViRaj_fun_A_37 //ViRaj_fun_A_49 //ViRaj_fun_A_30 //ViRaj_fun_A_09 //ViRaj_fun_A_16 //ViRaj_fun_A_25 //ViRaj_fun_A_03 //ViRaj_fun_A_22 //ViRaj_fun_A_27

}