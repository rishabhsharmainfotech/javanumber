package com.example.myapplication.e.b;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.d.xa;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.e.e.wh;
import com.example.myapplication.R;
import com.razorpay.Checkout;
import com.razorpay.PaymentData;
import com.razorpay.PaymentResultWithDataListener;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import dev.shreyaspatil.easyupipayment.EasyUpiPayment;
import dev.shreyaspatil.easyupipayment.listener.PaymentStatusListener;
import dev.shreyaspatil.easyupipayment.model.PaymentApp;
import dev.shreyaspatil.easyupipayment.model.TransactionDetails;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr;
import static com.example.myapplication.e.a.cf.myReceiver_rrrrr;

import java.util.HashMap;
import java.util.Map;
//ViRaj_imports

public class activity_add_funds extends AppCompatActivity implements PaymentStatusListener, PaymentResultWithDataListener {

    //ViRaj_int

    //ViRaj_fun_A_15 //ViRaj_fun_A_43
    private static final String TAG_rrrrr = "AddCoin";
    //ViRaj_fun_A_14 //ViRaj_fun_A_06
    private TextInputEditText mInputCoins_rrrrr;
    private int mCoins_rrrrr;
    private MaterialToolbar mToolbar_rrrrr;
    //ViRaj_fun_A_19 //ViRaj_fun_A_44
    private ProgressBar mProgressBar_rrrrr;
    //ViRaj_fun_A_22 //ViRaj_fun_A_30
    private RadioGroup mRadioGroup_rrrrr;
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_11 //ViRaj_fun_A_28
    MaterialTextView select_gateway_rrrrr, mtv_upi_msg_rrrrr, materialTextView2_rrrrr, mtrltxt2_rrrrr;
    TextView txtvw1_rrrrr;
    //ViRaj_fun_A_18 //ViRaj_fun_A_02
    LinearLayout ll_3_btns_rrrrr, ll_2_btns_rrrrr;
    cf cf_rrrrr;
    ca ca_rrrrr;
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();

    //ViRaj_fun_A_03 //ViRaj_fun_A_05 //ViRaj_fun_A_32 //ViRaj_fun_A_12
    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_funds);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.status_bar_color_rrrrr));
        intVeriables();
        algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr) + getString(R.string.history_activity_rrrrr) + getString(R.string.game_data_rrrrr));
        ca_rrrrr = new ca(this);
        confiToolbar(); //ViRaj_if_5

        RelativeLayout btn = findViewById(R.id.rrrrr_amount500_rrrrr);
        btn.setOnClickListener(view -> {
            mInputCoins_rrrrr.setText("500");
            submitCoins(view);
        });
        RelativeLayout btn1 = findViewById(R.id.rrrrr_amount1000_rrrrr);
        btn1.setOnClickListener(view -> {
            mInputCoins_rrrrr.setText("1000");
            submitCoins(view);
        });
        RelativeLayout btn2 = findViewById(R.id.rrrrr_amount2000_rrrrr);
        btn2.setOnClickListener(view -> {
            mInputCoins_rrrrr.setText("2000");
            submitCoins(view);
        });
        RelativeLayout btn4 = findViewById(R.id.rrrrr_amount5000_rrrrr);
        btn4.setOnClickListener(view -> {
            mInputCoins_rrrrr.setText("5000");
            submitCoins(view);
        });
        RelativeLayout btn5 = findViewById(R.id.rrrrr_amount10000_rrrrr);
        btn5.setOnClickListener(view -> {
            mInputCoins_rrrrr.setText("10000");
            submitCoins(view);
        });

    }

    //ViRaj_fun_A_36 //ViRaj_fun_A_04
    String amountPaid_rrrrr = "0.0";

    //ViRaj_fun_A_47 //ViRaj_fun_A_45
    private void confiToolbar() {  //ViRaj_if_3

        mToolbar_rrrrr.setNavigationOnClickListener(v -> onBackPressed());
    }

    //ViRaj_fun_A_39 //ViRaj_fun_A_29
    private void payDialog() {  //ViRaj_if_3


        String transactionId = "TID" + System.currentTimeMillis();
        String amount = mInputCoins_rrrrr.getText().toString() + ".0";
        EasyUpiPayment.Builder easyBuilder = new EasyUpiPayment.Builder(this).with(PaymentApp.ALL).setPayeeVpa(ce.getAddAmountUpiId_rrrrr(this, ce.KEY_ADD_COINS_BHIM_ID_rrrrr)).setPayeeName(ce.getAddAmountUpiId_rrrrr(this, ce.KEY_ADD_COINS_BHIM_NAME_rrrrr)).setTransactionId(transactionId).setTransactionRefId(transactionId).setPayeeMerchantCode("").setDescription(getString(R.string.app_name_rrrrr)).setAmount(amount);
        try {
            EasyUpiPayment easyUpiPayment = easyBuilder.build();
            easyUpiPayment.setPaymentStatusListener(this);
            easyUpiPayment.startPayment();
        } catch (Exception exception) {  //ViRaj_if_3
            exception.printStackTrace();
            System.out.println("Error " + exception.getMessage());
        }

    }

    //ViRaj_fun_A_27 //ViRaj_fun_A_21 //ViRaj_fun_A_23
    private void addCoinMethod(activity_add_funds activity_rrrrr, String amount, String orderID) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method", "add_fund");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(activity_rrrrr));
        payLoadClaims_rrrrr.put("points", amount);
        payLoadClaims_rrrrr.put("trans_status", "Successful");
        payLoadClaims_rrrrr.put("trans_id", orderID);
        mProgressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        String token = JWT.create().withHeader(headerClaims_rrrrr).withPayload(payLoadClaims_rrrrr).sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        Call<wh> call = xa.getClient().AddCoins(token);
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
                        Toast.makeText(activity_add_funds.this, wh.getMessage(), Toast.LENGTH_SHORT).show();
                        mInputCoins_rrrrr.setText("");
                    }
                    Toast.makeText(activity_add_funds.this, wh.getMessage(), Toast.LENGTH_SHORT).show();

                } else {  //ViRaj_if_5
                    Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                mProgressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }

            @Override
            public void onFailure(Call<wh> call, Throwable t) {  //ViRaj_if_3
                System.out.println("addFund Error " + t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
                mProgressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2
            }
        });
    }

    //ViRaj_fun_A_49 //ViRaj_fun_A_13 //ViRaj_fun_A_46 //ViRaj_fun_A_08
    @Override
    public void onTransactionCompleted(@NotNull TransactionDetails transactionDetails) {  //ViRaj_if_3

        switch (transactionDetails.getTransactionStatus()) {  //ViRaj_if_3


            case SUCCESS:
                onTransactionSuccess(transactionDetails);
                break;
            case FAILURE:
                onTransactionFailed();
                break;
            case SUBMITTED:
                onTransactionSubmitted();
                break;

        }
    }
    //ViRaj_fun_A_35 //ViRaj_fun_A_34 //ViRaj_fun_A_07 //ViRaj_fun_A_16

    @Override
    public void onTransactionCancelled() {  //ViRaj_if_3
        toast("Cancelled by user");
    }

    //ViRaj_fun_A_33 //ViRaj_fun_A_40 //ViRaj_fun_A_10
    private void onTransactionSuccess(TransactionDetails transactionDetails) {  //ViRaj_if_3


        toast("Success");
        System.out.println(" getAmount " + transactionDetails.getAmount());
        System.out.println(" getTransactionId " + transactionDetails.getTransactionId());
        System.out.println(" getTransactionStatus " + transactionDetails.getTransactionStatus());
        System.out.println(" getTransactionRefId " + transactionDetails.getTransactionRefId());
        System.out.println(" component1 " + transactionDetails.component1());
        System.out.println(" component2 " + transactionDetails.component2());
        System.out.println(" component3 " + transactionDetails.component3());
        System.out.println(" component4 " + transactionDetails.component4());
        System.out.println(" component5 " + transactionDetails.component5());
        System.out.println(" component6 " + transactionDetails.component6());
        System.out.println(" getApprovalRefNo " + transactionDetails.getApprovalRefNo());
        System.out.println(" getResponseCode " + transactionDetails.getResponseCode());
        addCoinMethod(this, transactionDetails.getAmount(), "paid with upi");

    }
    //ViRaj_fun_A_31 //ViRaj_fun_A_24 //ViRaj_fun_A_42

    private void onTransactionSubmitted() {  //ViRaj_if_3
        toast("Pending | Submitted");
    }

    private void onTransactionFailed() {  //ViRaj_if_3
        toast("Failed");
    }

    private void toast(String message) {  //ViRaj_if_3
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void intVeriables() {  //ViRaj_if_3


        mToolbar_rrrrr = findViewById(R.id.rrrrr_toolbar_rrrrr); //ViRaj_if_5

        mInputCoins_rrrrr = findViewById(R.id.rrrrr_inputCoins_rrrrr);
        materialTextView2_rrrrr = findViewById(R.id.rrrrr_materialTextView2_rrrrr);
        mtrltxt2_rrrrr = findViewById(R.id.rrrrr_mtrltxt2_rrrrr);
        txtvw1_rrrrr = findViewById(R.id.rrrrr_txtvw1_rrrrr);
        ll_3_btns_rrrrr = findViewById(R.id.rrrrr_ll_3_btns_rrrrr);
        ll_2_btns_rrrrr = findViewById(R.id.rrrrr_ll_2_btns_rrrrr);
        mProgressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5

        mtv_upi_msg_rrrrr = findViewById(R.id.rrrrr_mtv_upi_msg_rrrrr);
        mRadioGroup_rrrrr = findViewById(R.id.rrrrr_radioGroup_rrrrr);
        RadioButton razorPay = findViewById(R.id.rrrrr_razorPay_rrrrr);
        select_gateway_rrrrr = findViewById(R.id.rrrrr_materialTextView1_rrrrr);
        RadioButton others = findViewById(R.id.rrrrr_others_rrrrr);
        MaterialTextView mDataConText = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

        cf_rrrrr = new cf(mDataConText);
        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);

        if (ce.getTransmitCoins_rrrrr(activity_add_funds.this)) {  //ViRaj_if_4


            mtv_upi_msg_rrrrr.setText(ce.getAddAmountUpiId_rrrrr(this, ce.KEY_UPI_MESSAGE_rrrrr));
            if (ce.getAddAmountUpiId_rrrrr(this, ce.KEY_UPI_MESSAGE_rrrrr).isEmpty()) {  //ViRaj_if_4

                mtv_upi_msg_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2
            }
            mInputCoins_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            materialTextView2_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            mtrltxt2_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            txtvw1_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            ll_3_btns_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            ll_2_btns_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


            switch (ce.getAddAmountUpiId_rrrrr(activity_add_funds.this, ce.KEY_PAYMENT_OPTION_rrrrr)) {  //ViRaj_if_4


                case "1":
                    select_gateway_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1
                    mRadioGroup_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1
                    others.setChecked(true);
                    break;
                case "2":
                    select_gateway_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2
                    razorPay.setChecked(true);
                    mRadioGroup_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2
                    break;
                case "3":
                    select_gateway_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2
                    others.setChecked(true);
                    mRadioGroup_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2
                    break;
                case "4":
                    select_gateway_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2
                    mRadioGroup_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2


            }
        } else {  //ViRaj_if_5


            select_gateway_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            razorPay.setVisibility(View.GONE);  //ViRaj_if_2

            others.setVisibility(View.GONE);  //ViRaj_if_2

            mInputCoins_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            materialTextView2_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            mtrltxt2_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            txtvw1_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            ll_3_btns_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            ll_2_btns_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2


        }
    }


    @Override
    protected void onRestart() {  //ViRaj_if_3
        super.onRestart();
        registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);
    }

    //ViRaj_fun_A_38
    @Override
    protected void onPause() {  //ViRaj_if_3
        super.onPause();
        unregisterReceiver(myReceiver_rrrrr);
    }

    //ViRaj_fun_A_01
    @Override
    protected void onResume() {  //ViRaj_if_3
        super.onResume();
        registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);
    }

    //ViRaj_fun_A_48
    @Override
    public void onPaymentSuccess(String s, PaymentData paymentData) {  //ViRaj_if_3
        toast("Successful");
        addCoinMethod(this, amountPaid_rrrrr, s);
    }

    //ViRaj_fun_A_20
    @Override
    public void onPaymentError(int i, String s, PaymentData paymentData) {  //ViRaj_if_3
        System.out.println("RazorPay " + i + " " + s + " " + paymentData);
        toast("Failed");
    }

    //ViRaj_fun_A_41
    public void submitCoins(View view) {  //ViRaj_if_3


        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        String mString = mInputCoins_rrrrr.getText().toString();
        if (mString.length() > 0) {  //ViRaj_if_4

            mCoins_rrrrr = Integer.parseInt(mString);
        }
        if (TextUtils.isEmpty(mString)) {  //ViRaj_if_4
            Snackbar.make(view, getString(R.string.enter_point_rrrrr), 2000).show();
            return;
        }
        if (mCoins_rrrrr < Integer.parseInt(ce.getMaxMinObject_rrrrr(this, ce.KEY_MIN_ADD_AMOUNT_COINS_rrrrr))) {  //ViRaj_if_4
            Snackbar.make(view, getString(R.string.min_amt_rrrrr) + " " + ce.getMaxMinObject_rrrrr(this, ce.KEY_MIN_ADD_AMOUNT_COINS_rrrrr), 2000).show();
            return;
        }
        if (mCoins_rrrrr > Integer.parseInt(ce.getMaxMinObject_rrrrr(this, ce.KEY_MAX_ADD_AMOUNT_COINS_rrrrr))) {  //ViRaj_if_4
            Snackbar.make(view, getString(R.string.max_amt_rrrrr) + " " + ce.getMaxMinObject_rrrrr(this, ce.KEY_MAX_ADD_AMOUNT_COINS_rrrrr), 2000).show();
            return;
        }
        if (mRadioGroup_rrrrr.getCheckedRadioButtonId() == -1) {  //ViRaj_if_4
            Snackbar.make(view, "Please Select Payment Method", 2000).show();
            return;
        }

        if (cc.isOnline_rrrrr(this)) {  //ViRaj_if_4

            if (ce.getAddAmountUpiId_rrrrr(activity_add_funds.this, ce.KEY_PAYMENT_OPTION_rrrrr).equalsIgnoreCase("4")) {  //ViRaj_if_4


                String msg = "Hello Sir !!\n\nMy Name is " + ce.getPrfrnceinfo_rrrrr(activity_add_funds.this, ce.KEY_USER_NAME_rrrrr) + ".\nMy Number Mobile is " + ce.getPrfrnceinfo_rrrrr(activity_add_funds.this, ce.KEY_PHONE_NUMBER_rrrrr) + ".\n\nPlease add " + mString + " points in my account.";
                String url = "https://api.whatsapp.com/send?phone=" + ce.getContactObject_rrrrr(activity_add_funds.this, ce.KEY_WHATSAP_NUMBER_rrrrr) + "&text=" + msg;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            } else {  //ViRaj_if_5
                if (mRadioGroup_rrrrr.getCheckedRadioButtonId() == R.id.rrrrr_razorPay_rrrrr)
                    startPayment();
                else payDialog();
            }
        } else Toast.makeText(this, getString(R.string.check_net_rrrrr), Toast.LENGTH_SHORT).show();
    }

    //ViRaj_fun_A_25
    public void startPayment() {

        Checkout checkout = new Checkout();
        checkout.setKeyID(ce.getPrfrnceinfo_rrrrr(this, ce.KEY_RAZORPAY_LIVE_KEY_rrrrr));
        checkout.setImage(R.drawable.logo);
        String desc = (ce.getPrfrnceinfo_rrrrr(this, ce.KEY_USER_NAME_rrrrr)) + "  " + ce.getRegistrationObject_rrrrr(this, ce.KEY_PHONE_NUMBER_rrrrr) + "  " + System.currentTimeMillis();
        String amountRequested = mInputCoins_rrrrr.getText().toString() + "00";
        amountPaid_rrrrr = mInputCoins_rrrrr.getText().toString() + ".0";
        final Activity activity = this;


        try {

            JSONObject options = new JSONObject();
            options.put("name", (ce.getAddAmountUpiId_rrrrr(this, ce.KEY_ADD_COINS_BHIM_NAME_rrrrr)));
            options.put("description", desc);
            options.put("image", "https://s3.amazonaws.com/rzp-mobile/images/rzp.png");
            options.put("theme.color", "#3399cc");
            options.put("currency", "INR");
            options.put("amount", amountRequested);
            options.put("prefill.email", "userapk@example.com");
            options.put("prefill.contact", "+91" + ce.getRegistrationObject_rrrrr(this, ce.KEY_PHONE_NUMBER_rrrrr));
            JSONObject retryObj = new JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            options.put("retry", retryObj);
            checkout.open(activity, options);

        } catch (Exception e) {  //ViRaj_if_3
            Log.e(TAG_rrrrr, "Error in starting Razorpay Checkout", e);
        }
    }
    //ViRaj_fun_A_09 //ViRaj_fun_A_26 //ViRaj_fun_A_50 //ViRaj_fun_A_37 //ViRaj_fun_A_17
}