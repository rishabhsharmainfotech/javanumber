package com.example.myapplication.e.b;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.myapplication.e.e.wm;
import com.example.myapplication.e.c.dh;
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
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
//ViRaj_imports

public class activity_withdraw extends AppCompatActivity {

    //ViRaj_int

    private MaterialToolbar toolbar_rrrrr;
    private ProgressBar progressBar_rrrrr;
    private dh dh_rrrrr;
    //ViRaj_fun_A_17 //ViRaj_fun_A_14 //ViRaj_fun_A_19 //ViRaj_fun_A_03 //ViRaj_fun_A_42 //ViRaj_fun_A_46
    private List<wm.Data.Statement> modelWalletArrayList_rrrrr = new ArrayList<>();
    private MenuItem coin_rrrrr, purse_rrrrr;
    private SwipeRefreshLayout swipeRefreshLayout_rrrrr;
    private RecyclerView recyclerView_rrrrr;
    private int currentCoins_rrrrr = 0;
    private TextInputEditText inWithdCoins_rrrrr;
    private int points_rrrrr;
    private MaterialTextView sPayMethod_rrrrr;
    private MaterialTextView mDataConText_rrrrr;
    private IntentFilter mIntentFilter_rrrrr;
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();
    ca ca_rrrrr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.status_bar_color_rrrrr));
        intVariables(); //ViRaj_if_6

        algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr) + getString(R.string.history_activity_rrrrr) + getString(R.string.game_data_rrrrr));
        ca_rrrrr = new ca(this);
        loadData(); //ViRaj_if_6

        toolbarMethod();
        withdSMethod(activity_withdraw.this);
    }
    //ViRaj_fun_A_31 //ViRaj_fun_A_20

    private void loadData() {  //ViRaj_if_3

        cf cf = new cf(mDataConText_rrrrr);
        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);
        coin_rrrrr.setEnabled(false);
        purse_rrrrr.setEnabled(false);
        coin_rrrrr.setVisible(true);  //ViRaj_if_2

        coin_rrrrr.setTitle(ce.getCustomerCoins_rrrrr(activity_withdraw.this));
        SpannableString s = new SpannableString(coin_rrrrr.getTitle());
        s.setSpan(new ForegroundColorSpan(Color.WHITE), 0, s.length(), 0);
        s.setSpan(new RelativeSizeSpan(1.50f), 0, s.length(), 0);
        s.setSpan(new StyleSpan(Typeface.BOLD), 0, s.length(), 0);
        coin_rrrrr.setTitle(s);
    }

    //ViRaj_fun_A_44 //ViRaj_fun_A_29 //ViRaj_fun_A_13
    private void withdSMethod(activity_withdraw activity_rrrrr) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method", "withdraw_statement");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("string", "string");
        swipeRefreshLayout_rrrrr.setRefreshing(true);

        String token = JWT.create()
                .withHeader(headerClaims_rrrrr)
                .withPayload(payLoadClaims_rrrrr)
                .sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        Call<wm> call = xa.getClient().withdSatment(token);
        call.enqueue(new Callback<wm>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wm> call, Response<wm> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_3

                    wm wm = response.body();
                    if (wm.getCode().equalsIgnoreCase("505")) {  //ViRaj_if_3

                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, wm.getMessage(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }
                    if (wm.getStatus().equalsIgnoreCase(getString(R.string.success_rrrrr))) {  //ViRaj_if_3

                        if (wm.getData() != null && !wm.getData().getStatement().isEmpty()) {  //ViRaj_if_4

                            modelWalletArrayList_rrrrr = wm.getData().getStatement();
                            LinearLayoutManager layoutManager = new LinearLayoutManager(activity_rrrrr);
                            recyclerView_rrrrr.setLayoutManager(layoutManager);
                            dh_rrrrr = new dh(activity_rrrrr, modelWalletArrayList_rrrrr);
                            recyclerView_rrrrr.setAdapter(dh_rrrrr);
                        }
                    }
                    Toast.makeText(activity_rrrrr, wm.getMessage(), Toast.LENGTH_SHORT).show();
                } else {  //ViRaj_if_5

                    Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                swipeRefreshLayout_rrrrr.setRefreshing(false);
            }

            @Override
            public void onFailure(Call<wm> call, Throwable t) {  //ViRaj_if_3

                swipeRefreshLayout_rrrrr.setRefreshing(false);
                System.out.println("walletStatement error " + t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
            }
        });
    }

    //ViRaj_fun_A_43 //ViRaj_fun_A_39
    public void btnWithdCoins(View view) {  //ViRaj_if_3

        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        String s = inWithdCoins_rrrrr.getText().toString();

        if (s.length() > 0) {  //ViRaj_if_4

            points_rrrrr = Integer.parseInt(s);
        }
        if (TextUtils.isEmpty(inWithdCoins_rrrrr.getText().toString())) {  //ViRaj_if_4
            Snackbar.make(view, getString(R.string.enter_points_rrrrr), 2000).show();
            return;
        }
        if (points_rrrrr < Integer.parseInt(ce.getMaxMinObject_rrrrr(this, ce.KEY_MIN_EXTRACT_COINS_rrrrr))) {  //ViRaj_if_4
            Snackbar.make(view, getString(R.string.min_amt_rrrrr) + " " + ce.getMaxMinObject_rrrrr(this, ce.KEY_MIN_EXTRACT_COINS_rrrrr), 2000).show();
            return;
        }
        if (points_rrrrr > Integer.parseInt(ce.getMaxMinObject_rrrrr(this, ce.KEY_MAX_EXTRACT_COINS_rrrrr))) {  //ViRaj_if_4
            Snackbar.make(view, getString(R.string.max_amt_rrrrr) + " " + ce.getMaxMinObject_rrrrr(this, ce.KEY_MAX_EXTRACT_COINS_rrrrr), 2000).show();
            return;
        }
        if (sPayMethod_rrrrr.getText().toString().equals(getString(R.string.select_withdraw_method_rrrrr))) {  //ViRaj_if_4
            Snackbar.make(view, getString(R.string.pay_method_rrrrr), 2000).show();
            return;
        }
        if (cc.isOnline_rrrrr(this))
            withdCoinsM(activity_withdraw.this, inWithdCoins_rrrrr.getText().toString(), sPayMethod_rrrrr.getText().toString());
        else Toast.makeText(this, getString(R.string.check_net_rrrrr), Toast.LENGTH_SHORT).show();

    }
    //ViRaj_fun_A_34 //ViRaj_fun_A_41

    private void withdCoinsM(activity_withdraw activity_rrrrr, String points, String method) {  //ViRaj_if_3

        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

        String methodStr = null;
        if (method.contains("Account number")) {  //ViRaj_if_4

            methodStr = "bank_name";
        } else if (method.contains("PayTM")) {  //ViRaj_if_4

            methodStr = "paytm_mobile_no";
        } else if (method.contains("PhonePe")) {  //ViRaj_if_4

            methodStr = "phonepe_mobile_no";
        } else if (method.contains("GooglePay")) {  //ViRaj_if_4

            methodStr = "gpay_mobile_no";
        }
        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method", "withdraw");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("points", points);
        payLoadClaims_rrrrr.put("method", methodStr);
        String token = JWT.create()
                .withHeader(headerClaims_rrrrr)
                .withPayload(payLoadClaims_rrrrr)
                .sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        Call<wh> call = xa.getClient().RetrieveAmnt(token);
        call.enqueue(new Callback<wh>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wh> call, Response<wh> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4

                    wh wh = response.body();
                    assert wh != null;
                    if (wh.getCode().equalsIgnoreCase("505")) {  //ViRaj_if_4

                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, wh.getMessage(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }
                    if (wh.getStatus().equalsIgnoreCase(getString(R.string.success_rrrrr))) {  //ViRaj_if_4

                        currentCoins_rrrrr = Integer.parseInt(ce.getCustomerCoins_rrrrr(activity_rrrrr)) - Integer.parseInt(points);
                        coin_rrrrr.setTitle(String.valueOf(currentCoins_rrrrr));
                        setToolBarTitle(currentCoins_rrrrr);
                        ce.setUserCoins_rrrrr(activity_withdraw.this, String.valueOf(currentCoins_rrrrr));
                        withdSMethod(activity_rrrrr);
                    }
                    Toast.makeText(activity_withdraw.this, wh.getMessage(), Toast.LENGTH_SHORT).show();

                } else {  //ViRaj_if_5

                    Toast.makeText(activity_withdraw.this, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }

            @Override
            public void onFailure(Call<wh> call, Throwable t) {  //ViRaj_if_3

                System.out.println("withdrawPoints Error " + t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });
    }
    //ViRaj_fun_A_32 //ViRaj_fun_A_05 //ViRaj_fun_A_24 //ViRaj_fun_A_48

    private void setToolBarTitle(int i) {  //ViRaj_if_3

        SpannableString s = new SpannableString(String.valueOf(i));
        s.setSpan(new ForegroundColorSpan(Color.WHITE), 0, s.length(), 0);
        s.setSpan(new RelativeSizeSpan(1.50f), 0, s.length(), 0);
        s.setSpan(new StyleSpan(Typeface.BOLD), 0, s.length(), 0);
        coin_rrrrr.setTitle(s);
    }

    //ViRaj_fun_A_01 //ViRaj_fun_A_37
    private PopupWindow popupWindow_rrrrr;
    //ViRaj_fun_A_06
    private MaterialTextView bInfo_rrrrr, pUpi_rrrrr, pPeUpi_rrrrr, gPUpi_rrrrr;

    //ViRaj_fun_A_47 //ViRaj_fun_A_23 //ViRaj_fun_A_09 //ViRaj_fun_A_11
    public void sPayMethod(View view) {  //ViRaj_if_3

        View popupView = LayoutInflater.from(this).inflate(R.layout.select_pay_method, null);
        bInfo_rrrrr = popupView.findViewById(R.id.rrrrr_bankDetails);
        pPeUpi_rrrrr = popupView.findViewById(R.id.rrrrr_phonePeUpi);
        gPUpi_rrrrr = popupView.findViewById(R.id.rrrrr_googlePayUpi);
        pUpi_rrrrr = popupView.findViewById(R.id.rrrrr_paytmUpi);
        popupWindow_rrrrr = new PopupWindow(popupView, 900, LinearLayout.LayoutParams.WRAP_CONTENT, true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {  //ViRaj_if_3

            popupWindow_rrrrr.setElevation(20);
        }
        popupWindow_rrrrr.setOutsideTouchable(true);
        popupWindow_rrrrr.showAsDropDown(view, 0, -135);

        if (ce.getBankObject_rrrrr(this, ce.KEY_B_AC_N_rrrrr) != null && !ce.getBankObject_rrrrr(this, ce.KEY_B_AC_N_rrrrr).equals("")) {  //ViRaj_if_4

            bInfo_rrrrr.setText("Account number ( " + ce.getBankObject_rrrrr(this, ce.KEY_B_AC_N_rrrrr) + " )");
            bInfo_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1
        }
        if (ce.getPrfrnceinfo_rrrrr(this, ce.KEY_P_UPI_ID_rrrrr) != null && !ce.getPrfrnceinfo_rrrrr(this, ce.KEY_P_UPI_ID_rrrrr).equals("")) {  //ViRaj_if_4

            pUpi_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            pUpi_rrrrr.setText("PayTM ( " + ce.getPrfrnceinfo_rrrrr(this, ce.KEY_P_UPI_ID_rrrrr) + " )");
        }
        if (ce.getPrfrnceinfo_rrrrr(this, ce.KEY_PP_UPI_ID_rrrrr) != null && !ce.getPrfrnceinfo_rrrrr(this, ce.KEY_PP_UPI_ID_rrrrr).equals("")) {  //ViRaj_if_4

            pPeUpi_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            pPeUpi_rrrrr.setText("PhonePe ( " + ce.getPrfrnceinfo_rrrrr(this, ce.KEY_PP_UPI_ID_rrrrr) + " )");
        }
        if (ce.getPrfrnceinfo_rrrrr(this, ce.KEY_G_PAY_UPI_ID_rrrrr) != null && !ce.getPrfrnceinfo_rrrrr(this, ce.KEY_G_PAY_UPI_ID_rrrrr).equals("")) {  //ViRaj_if_4

            gPUpi_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            gPUpi_rrrrr.setText("GooglePay ( " + ce.getPrfrnceinfo_rrrrr(this, ce.KEY_G_PAY_UPI_ID_rrrrr) + " )");
        }

    }

    //ViRaj_fun_A_49 //ViRaj_fun_A_38 //ViRaj_fun_A_26
    private void intVariables() {  //ViRaj_if_3


        sPayMethod_rrrrr = findViewById(R.id.rrrrr_selectPayMethod);
        progressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5

        toolbar_rrrrr = findViewById(R.id.rrrrr_toolbar_rrrrr); //ViRaj_if_5

        inWithdCoins_rrrrr = findViewById(R.id.rrrrr_inputWithdrawPoints);
        swipeRefreshLayout_rrrrr = findViewById(R.id.rrrrr_swipe_ref_lyt_rrrrr);
        recyclerView_rrrrr = findViewById(R.id.rrrrr_recyclerView_rrrrr);
        mDataConText_rrrrr = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

        purse_rrrrr = toolbar_rrrrr.getMenu().findItem(R.id.rrrrr_purse_rrrrr);
        coin_rrrrr = toolbar_rrrrr.getMenu().findItem(R.id.rrrrr_coins_rrrrr);

    }

    //ViRaj_fun_A_45
    @Override
    protected void onPause() {  //ViRaj_if_3
        super.onPause();
        unregisterReceiver(cf.myReceiver_rrrrr);
    }

    //ViRaj_fun_A_25 //ViRaj_fun_A_36 //ViRaj_fun_A_30
    public void googlepayUpi(View view) {  //ViRaj_if_3

        sPayMethod_rrrrr.setText(gPUpi_rrrrr.getText().toString());
        popupWindow_rrrrr.dismiss();
    }

    //ViRaj_fun_A_27 //ViRaj_fun_A_16 //ViRaj_fun_A_02
    public void payTmUpi(View view) {  //ViRaj_if_3

        sPayMethod_rrrrr.setText(pUpi_rrrrr.getText().toString());
        popupWindow_rrrrr.dismiss();
    }

    //ViRaj_fun_A_35 //ViRaj_fun_A_22 //ViRaj_fun_A_40
    @Override
    protected void onRestart() {  //ViRaj_if_3
        super.onRestart();
        registerReceiver(cf.myReceiver_rrrrr, mIntentFilter_rrrrr);
    }

    //ViRaj_fun_A_07 //ViRaj_fun_A_12
    @Override
    protected void onResume() {  //ViRaj_if_3
        super.onResume();
        registerReceiver(cf.myReceiver_rrrrr, mIntentFilter_rrrrr);
    }

    //ViRaj_fun_A_50
    public void phonePeUpi(View view) {  //ViRaj_if_3

        sPayMethod_rrrrr.setText(pPeUpi_rrrrr.getText().toString());
        popupWindow_rrrrr.dismiss();
    }

    //ViRaj_fun_A_04
    public void Bank(View view) {  //ViRaj_if_3
        Intent intent = new Intent(this, activity_add_bank_details.class);
        startActivity(intent);
    }

    //ViRaj_fun_A_21 //ViRaj_fun_A_28 //ViRaj_fun_A_33
    public void paytm(View view) {  //ViRaj_if_3
        Intent intent = new Intent(this, activity_upi_details.class);
        intent.putExtra(getString(R.string.upi_rrrrr), 1);
        startActivity(intent);
    }

    public void phonePe(View view) {  //ViRaj_if_3
        Intent intent = new Intent(this, activity_upi_details.class);
        intent.putExtra(getString(R.string.upi_rrrrr), 2);
        startActivity(intent);
    }

    public void gPay(View view) {  //ViRaj_if_3
        Intent intent = new Intent(this, activity_upi_details.class);
        intent.putExtra(getString(R.string.upi_rrrrr), 3);
        startActivity(intent);
    }

    private void toolbarMethod() {  //ViRaj_if_3

        toolbar_rrrrr.setNavigationOnClickListener(v -> onBackPressed());
        swipeRefreshLayout_rrrrr.setOnRefreshListener(() -> withdSMethod(activity_withdraw.this));
    }
    //ViRaj_fun_A_15 //ViRaj_fun_A_10 //ViRaj_fun_A_18 //ViRaj_fun_A_08
}