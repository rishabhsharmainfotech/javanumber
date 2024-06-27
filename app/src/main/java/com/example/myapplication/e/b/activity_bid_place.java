package com.example.myapplication.e.b;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.InputFilter;
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
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.google.gson.Gson;
import com.example.myapplication.e.c.dg;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.d.xa;
import com.example.myapplication.e.a.cb;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.e.e.wh;
import com.example.myapplication.e.e.wj;
import com.example.myapplication.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import static com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr;
import static com.example.myapplication.e.a.cf.myReceiver_rrrrr;
//ViRaj_imports

public class activity_bid_place extends AppCompatActivity {

    //ViRaj_int


    private dg dg_rrrrr;
    private MenuItem mCoins_rrrrr;
    private String mGameID_rrrrr;
    //ViRaj_fun_A_07
    //ViRaj_fun_A_20
    //ViRaj_fun_A_39
    //ViRaj_fun_A_14
    private int mProceed_rrrrr =0;
    private MaterialRadioButton mOpen_rrrrr, mClose_rrrrr;
    //ViRaj_fun_A_22
    //ViRaj_fun_A_08
    private int mCurrentCoins_rrrrr = 0;
    private MaterialToolbar mToolbar_rrrrr;
    //ViRaj_fun_A_28
    //ViRaj_fun_A_31
    private RadioGroup mRadioGroup_rrrrr;
    //ViRaj_fun_A_19
    //ViRaj_fun_A_49
    //ViRaj_fun_A_38
    //ViRaj_fun_A_02
    //ViRaj_fun_A_24
    //ViRaj_fun_A_18
    private RecyclerView mRecyclerView_rrrrr;
    //ViRaj_fun_A_11
    //ViRaj_fun_A_12
    //ViRaj_fun_A_27
    private MaterialButton btnProceed_rrrrr;
    private TextInputEditText mInputCoins_rrrrr;
    //ViRaj_fun_A_32
    //ViRaj_fun_A_33
    private int mTotalCoins_rrrrr = 0;
    //ViRaj_fun_A_03
    private ArrayList<String> mNumbers_rrrrr, mNumbers2_rrrrr;
    private ProgressBar mProgressBar_rrrrr;
    //ViRaj_fun_A_21
    private MaterialTextView mChooseDate_rrrrr, mChooseSes_rrrrr, mOpenCDigit_rrrrr, mDigText_rrrrr, mtvTotalCoins_rrrrr;
    //ViRaj_fun_A_29
    private IntentFilter mIntentFilter_rrrrr;
    private final List<wj> wjList_rrrrr = new ArrayList<>();
    //ViRaj_fun_A_45
    private MaterialTextView mDataConText_rrrrr;
    //ViRaj_fun_A_42
    //ViRaj_fun_A_26
    private MaterialAutoCompleteTextView mInputD_rrrrr, mInpCloseD_rrrrr;
    //ViRaj_fun_A_34
    private LinearLayout llBidBottom_rrrrr;
    cf cf;
    ca ca_rrrrr;
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();
    //ViRaj_fun_A_17
    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bid_place);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.status_bar_color_rrrrr));

        intVariables(); //ViRaj_if_6

        algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr));
        ca_rrrrr = new ca(this);
        loadData(); //ViRaj_if_6

        confToolbar();
        confRecycler();

    }
    //ViRaj_fun_A_36
    private void loadData() {  //ViRaj_if_3


        cf = new cf(mDataConText_rrrrr);
        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);
        mProceed_rrrrr = getIntent().getIntExtra(getString(R.string.game_name_rrrrr), 0);
        mGameID_rrrrr = getIntent().getStringExtra("games");
        boolean isOpen = getIntent().getBooleanExtra("open", false);
        mCurrentCoins_rrrrr = Integer.parseInt(ce.getCustomerCoins_rrrrr(activity_bid_place.this));
        mNumbers_rrrrr = new ArrayList<String>();
        mNumbers2_rrrrr = new ArrayList<String>();
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("EEE dd-MMM-yyyy", Locale.getDefault());
        String formattedDate = df.format(c);
        mChooseDate_rrrrr.setText(formattedDate);
        mOpen_rrrrr.setEnabled(isOpen);
        mClose_rrrrr.setChecked(!isOpen);
        setToolBarTitle(mCurrentCoins_rrrrr);

        if (mProceed_rrrrr ==6) {  //ViRaj_if_4


            mOpen_rrrrr.setChecked(true);
            mOpenCDigit_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            mInpCloseD_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            mDigText_rrrrr.setText(R.string.open_digit_rrrrr);
            mOpenCDigit_rrrrr.setText(R.string.close_pana_rrrrr);

        }
        mRadioGroup_rrrrr.setOnCheckedChangeListener((group, checkedId) -> { if (mProceed_rrrrr ==6) confToolbar(); });
    }

    //ViRaj_fun_A_35
    private void intVariables() {  //ViRaj_if_3


        mToolbar_rrrrr = findViewById(R.id.rrrrr_toolbar_rrrrr); //ViRaj_if_5

        mCoins_rrrrr = mToolbar_rrrrr.getMenu().findItem(R.id.rrrrr_coins_rrrrr);
        mCoins_rrrrr.setVisible(true);  //ViRaj_if_2

        MenuItem mPurse = mToolbar_rrrrr.getMenu().findItem(R.id.rrrrr_purse_rrrrr);
        mPurse.setEnabled(false);
        mChooseDate_rrrrr = findViewById(R.id.rrrrr_choose_date_rrrrr);
        mChooseSes_rrrrr = findViewById(R.id.rrrrr_chooseSession_rrrrr);
        mRadioGroup_rrrrr = findViewById(R.id.rrrrr_radioGroup_rrrrr);
        mInputD_rrrrr = findViewById(R.id.rrrrr_input_d_rrrrr);
        mInputCoins_rrrrr = findViewById(R.id.rrrrr_inputCoins_rrrrr);
        mOpenCDigit_rrrrr = findViewById(R.id.rrrrr_openCD_rrrrr);
        mInpCloseD_rrrrr = findViewById(R.id.rrrrr_inputCD_rrrrr);
        mDigText_rrrrr = findViewById(R.id.rrrrr_digText_rrrrr);
        mtvTotalCoins_rrrrr = findViewById(R.id.rrrrr_mtv_total_coins_rrrrr);
        mOpen_rrrrr = findViewById(R.id.rrrrr_open_rrrrr);
        mClose_rrrrr = findViewById(R.id.rrrrr_close_rrrrr);
        MaterialButton mProConform = findViewById(R.id.rrrrr_pro_conf_rrrrr);
        btnProceed_rrrrr = findViewById(R.id.rrrrr_btn_proceed_rrrrr);
        mRecyclerView_rrrrr = findViewById(R.id.rrrrr_recyclerView_rrrrr);
        llBidBottom_rrrrr = findViewById(R.id.rrrrr_ll_bid_bottom_rrrrr);
        mProgressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5

        mDataConText_rrrrr = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

        btnProceed_rrrrr.setOnClickListener(v -> proceedBtn(v));
        mToolbar_rrrrr.setTitleTextColor(Color.WHITE);
        mToolbar_rrrrr.setNavigationOnClickListener(v -> onBackPressed());

    }
    //ViRaj_fun_A_30 //ViRaj_fun_A_15 //ViRaj_fun_A_47
    private void confToolbar() {  //ViRaj_if_3

        mNumbers_rrrrr.clear();
        mNumbers2_rrrrr.clear();

        switch (mProceed_rrrrr) {  //ViRaj_if_4

            case 1:
                mToolbar_rrrrr.setTitle(getString(R.string.single_digit_rrrrr));
                for (int i = 0; i <= 9; i++) {  //ViRaj_if_3

                    mNumbers_rrrrr.add(String.valueOf(i));
                }
                break;
            case 2:
                mToolbar_rrrrr.setTitle(getString(R.string.jodi_digit_rrrrr));
                mChooseSes_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                mRadioGroup_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                mOpen_rrrrr.setChecked(true);
                for (int i = 0; i <= 9; i++) {  //ViRaj_if_3

                    for (int j = 0; j<=9; j++) {  //ViRaj_if_4

                        mNumbers_rrrrr.add(String.valueOf(i)+String.valueOf(j));
                    }
                }
                break;
            case 3:
                mToolbar_rrrrr.setTitle(getString(R.string.single_pana_rrrrr));
                for (int a =1 ; a<=9; a++) {  //ViRaj_if_4

                    for (int b = 1;b<=9;b++) {  //ViRaj_if_4

                        for (int c = 0;c<=9;c++) {  //ViRaj_if_4

                            if(a!=b && a!=c && b!=c) {  //ViRaj_if_4

                                if (a < b && b<c||c==0&& a<b) {  //ViRaj_if_4

                                    mNumbers_rrrrr.add(String.valueOf(a)+String.valueOf(b)+String.valueOf(c));
                                }
                            }
                        }
                    }
                }
                break;
            case 4:
                mToolbar_rrrrr.setTitle(getString(R.string.double_pana_rrrrr));
                for (int a =1 ; a<=9; a++) {  //ViRaj_if_4

                    for (int b = 0;b<=9;b++) {  //ViRaj_if_4

                        for (int c = 0;c<=9;c++) {  //ViRaj_if_4

                            if(a == b && b < c || b == 0 && c == 0 || a == b && c == 0||a<b && b==c) {  //ViRaj_if_4

                                mNumbers_rrrrr.add(String.valueOf(a)+String.valueOf(b)+String.valueOf(c));
                            }
                        }
                    }
                }
                break;
            case 5:
                mToolbar_rrrrr.setTitle(getString(R.string.triple_pana_rrrrr));
                for (int a =0 ; a<=9; a++) {  //ViRaj_if_4

                    for (int b = 0;b<=9;b++) {  //ViRaj_if_4

                        for (int c = 0;c<=9;c++) {  //ViRaj_if_4

                            if(a == b && b == c ) {  //ViRaj_if_4

                                mNumbers_rrrrr.add(String.valueOf(a)+String.valueOf(b)+String.valueOf(c));
                            }
                        }
                    }
                }
                break;
            case 6:
                mToolbar_rrrrr.setTitle(getString(R.string.half_sangam_rrrrr));
                if (mOpen_rrrrr.isChecked()) {  //ViRaj_if_4

                    mDigText_rrrrr.setText(R.string.open_digit_rrrrr);
                    mOpenCDigit_rrrrr.setText(R.string.close_pana_rrrrr);
                    for (int a =0 ; a<=9; a++) {  //ViRaj_if_4

                        mNumbers_rrrrr.add(String.valueOf(a));
                    }
                    for (int a =0 ; a<=9; a++) {  //ViRaj_if_4

                        for (int b = 0;b<=9;b++) {  //ViRaj_if_4

                            for (int c = 0;c<=9;c++) {  //ViRaj_if_4

                                if(a > 0 && a <= b && b <= c || b == 0 && c == 0 || c == 0 && a <= b &&a!=0) {  //ViRaj_if_4

                                    mNumbers2_rrrrr.add(String.valueOf(a)+String.valueOf(b)+String.valueOf(c));
                                }
                            }
                        }
                    }
                }else if (mClose_rrrrr.isChecked()) {  //ViRaj_if_4

                    mDigText_rrrrr.setText(R.string.open_pana_rrrrr);
                    mOpenCDigit_rrrrr.setText(R.string.close_digit_rrrrr);
                    for (int a =0 ; a<=9; a++) {  //ViRaj_if_4

                        for (int b = 0;b<=9;b++) {  //ViRaj_if_4

                            for (int c = 0;c<=9;c++) {  //ViRaj_if_4

                                if(a > 0 && a <= b && b <= c || b == 0 && c == 0 || c == 0 && a <= b &&a!=0) {  //ViRaj_if_4

                                    mNumbers_rrrrr.add(String.valueOf(a)+String.valueOf(b)+String.valueOf(c));
                                }
                            }
                        }
                    }
                    for (int a =0 ; a<=9; a++) {  //ViRaj_if_4

                        mNumbers2_rrrrr.add(String.valueOf(a));
                    }
                }
                break;
            case 7:


                mChooseSes_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                mRadioGroup_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                mOpenCDigit_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

                mInpCloseD_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

                mDigText_rrrrr.setText(R.string.open_pana_rrrrr);
                mOpenCDigit_rrrrr.setText(R.string.close_pana_rrrrr);
                mToolbar_rrrrr.setTitle(getString(R.string.full_sangam_rrrrr));


                for (int a =0 ; a<=9; a++) {  //ViRaj_if_4

                    for (int b = 0;b<=9;b++) {  //ViRaj_if_4

                        for (int c = 0;c<=9;c++) {  //ViRaj_if_4

                            if(a > 0 && a <= b && b <= c || b == 0 && c == 0 || c == 0 && a <= b &&a!=0) {  //ViRaj_if_4

                                mNumbers_rrrrr.add(String.valueOf(a)+ b + c);
                                mNumbers2_rrrrr.add(a +String.valueOf(b)+ c);
                            }
                        }
                    }
                }

                break;
        }

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, mNumbers_rrrrr);
        ArrayAdapter<String> mAdapter2 = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, mNumbers2_rrrrr);

        mInputD_rrrrr.setThreshold(1);//will start working from first character
        mInputD_rrrrr.setAdapter(mAdapter);//setting the adapter data into the AutoCompleteTextView
        mInpCloseD_rrrrr.setThreshold(1);
        mInpCloseD_rrrrr.setAdapter(mAdapter2);

        if (mProceed_rrrrr !=6) {  //ViRaj_if_4

            int maxLength = mNumbers_rrrrr.get(0).length() ;
            InputFilter[] fArray = new InputFilter[1];
            fArray[0] = new InputFilter.LengthFilter(maxLength);
            mInputD_rrrrr.setFilters(fArray);
            int maxLength2 = 3 ;
            InputFilter[] fArray2 = new InputFilter[1];
            fArray2[0] = new InputFilter.LengthFilter(maxLength2);
            mInpCloseD_rrrrr.setFilters(fArray2);
        }else {  //ViRaj_if_5

            int maxLength = 3 ;
            InputFilter[] fArray = new InputFilter[1];
            fArray[0] = new InputFilter.LengthFilter(maxLength);
            mInputD_rrrrr.setFilters(fArray);
            mInpCloseD_rrrrr.setFilters(fArray);
        }
    }
    //ViRaj_fun_A_16
    public void proceedBtn(View view) {  //ViRaj_if_3

        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        if (TextUtils.isEmpty(mInputD_rrrrr.getText().toString())) {  //ViRaj_if_4

            snackbar(getString(R.string.enter_digit_rrrrr),view);
            return;
        }
        switch (mProceed_rrrrr) {  //ViRaj_if_4


            case 1:
            case 2:
            case 3:
            case 4:

            case 5:

                if(!mOpen_rrrrr.isChecked() && !mClose_rrrrr.isChecked()) {  //ViRaj_if_4
 snackbar("Please select session", view); return; }
                if (!mNumbers_rrrrr.contains(mInputD_rrrrr.getText().toString())) {  //ViRaj_if_4
 snackbar(getString(R.string.valid_digit_rrrrr), view); return; }
                if (TextUtils.isEmpty(mInputCoins_rrrrr.getText().toString().trim())) {  //ViRaj_if_4
 snackbar(getString(R.string.enter_point_rrrrr),view); return; }
                if (Integer.parseInt(mInputCoins_rrrrr.getText().toString().trim())<Integer.parseInt(ce.getMaxMinObject_rrrrr(this, ce.KEY_MIN_OFFER_SUM_rrrrr))  ||Integer.parseInt(mInputCoins_rrrrr.getText().toString().trim())>Integer.parseInt(ce.getMaxMinObject_rrrrr(this, ce.KEY_MAX_OFFER_SUM_rrrrr))) {  //ViRaj_if_4
 snackbar("Minimum Bid Points "+ ce.getMaxMinObject_rrrrr(this, ce.KEY_MIN_OFFER_SUM_rrrrr)+" and Maximum Bid Points "+ ce.getMaxMinObject_rrrrr(this, ce.KEY_MAX_OFFER_SUM_rrrrr),view); return;}
                setRecycleViewData(mProceed_rrrrr,view);

                break;
            case 6:
                if(!mOpen_rrrrr.isChecked() && !mClose_rrrrr.isChecked()) {  //ViRaj_if_4

                    snackbar("Please select session", view);
                    return;
                }
                if (mOpen_rrrrr.isChecked()) {  //ViRaj_if_4


                    if (!mNumbers_rrrrr.contains(mInputD_rrrrr.getText().toString())) {  //ViRaj_if_4
 snackbar(getString(R.string.valid_open_digits_rrrrr), view); return; }
                    if (TextUtils.isEmpty(mInpCloseD_rrrrr.getText().toString().trim())) {  //ViRaj_if_4
 snackbar(getString(R.string.close_pana_enter_rrrrr), view); return; }
                    if (!mNumbers2_rrrrr.contains(mInpCloseD_rrrrr.getText().toString())) {  //ViRaj_if_4
 snackbar(getString(R.string.valid_close_pana_rrrrr), view); return; }

                }else {  //ViRaj_if_5


                    if (!mNumbers_rrrrr.contains(mInputD_rrrrr.getText().toString())) {  //ViRaj_if_4
 snackbar(getString(R.string.valid_open_pana_rrrrr), view); return; }
                    if (TextUtils.isEmpty(mInpCloseD_rrrrr.getText().toString().trim())) {  //ViRaj_if_4
 snackbar(getString(R.string.close_digits_rrrrr), view); return; }
                    if (!mNumbers2_rrrrr.contains(mInpCloseD_rrrrr.getText().toString())) {  //ViRaj_if_4
 snackbar(getString(R.string.valid_close_digits_rrrrr), view); return; }

                }
                if (TextUtils.isEmpty(mInputCoins_rrrrr.getText().toString().trim())) {  //ViRaj_if_4

                    snackbar(getString(R.string.enter_point_rrrrr),view);
                    return;
                }
                if (Integer.parseInt(mInputCoins_rrrrr.getText().toString().trim())<Integer.parseInt(ce.getMaxMinObject_rrrrr(this, ce.KEY_MIN_OFFER_SUM_rrrrr))
                        ||Integer.parseInt(mInputCoins_rrrrr.getText().toString().trim())>Integer.parseInt(ce.getMaxMinObject_rrrrr(this, ce.KEY_MAX_OFFER_SUM_rrrrr))) {  //ViRaj_if_4

                    snackbar("Minimum Bid Points "+ ce.getMaxMinObject_rrrrr(this, ce.KEY_MIN_OFFER_SUM_rrrrr)+" and Maximum Bid Points "+ ce.getMaxMinObject_rrrrr(this, ce.KEY_MAX_OFFER_SUM_rrrrr),view);
                    return;
                }
                setRecycleViewData(mProceed_rrrrr,view);
                break;
            case 7:

                if (!mNumbers_rrrrr.contains(mInputD_rrrrr.getText().toString())) {  //ViRaj_if_4
 snackbar(getString(R.string.valid_open_pana_rrrrr), view); return; }
                if (TextUtils.isEmpty(mInpCloseD_rrrrr.getText().toString().trim())) {  //ViRaj_if_4
 snackbar(getString(R.string.close_pana_enter_rrrrr), view); return; }
                if (!mNumbers2_rrrrr.contains(mInpCloseD_rrrrr.getText().toString())) {  //ViRaj_if_4
 snackbar(getString(R.string.valid_close_pana_rrrrr), view); return; }
                if (TextUtils.isEmpty(mInputCoins_rrrrr.getText().toString().trim())) {  //ViRaj_if_4
 snackbar(getString(R.string.enter_point_rrrrr),view); return; }
                if (Integer.parseInt(mInputCoins_rrrrr.getText().toString().trim())<Integer.parseInt(ce.getMaxMinObject_rrrrr(this, ce.KEY_MIN_OFFER_SUM_rrrrr))  ||Integer.parseInt(mInputCoins_rrrrr.getText().toString().trim())>Integer.parseInt(ce.getMaxMinObject_rrrrr(this, ce.KEY_MAX_OFFER_SUM_rrrrr))) {  //ViRaj_if_4
 snackbar("Minimum Bid Points "+ ce.getMaxMinObject_rrrrr(this, ce.KEY_MIN_OFFER_SUM_rrrrr)+" and Maximum Bid Points "+ ce.getMaxMinObject_rrrrr(this, ce.KEY_MAX_OFFER_SUM_rrrrr),view); return; }
                setRecycleViewData(mProceed_rrrrr,view);

                break;
        }

    }
    //ViRaj_fun_A_05 //ViRaj_fun_A_46 //ViRaj_fun_A_48
    private void setRecycleViewData(int gameProceed, View view) {  //ViRaj_if_3

        String openNum = mInputD_rrrrr.getText().toString();
        String closeNum = mInpCloseD_rrrrr.getText().toString();
        String points = mInputCoins_rrrrr.getText().toString();
        mTotalCoins_rrrrr += Integer.parseInt(points);
        if(mTotalCoins_rrrrr > mCurrentCoins_rrrrr) {  //ViRaj_if_4

            snackbar("Insufficient Points",view);
            mTotalCoins_rrrrr = mTotalCoins_rrrrr - Integer.parseInt(points);
            return;
        }
        setToolBarTitle(mCurrentCoins_rrrrr - mTotalCoins_rrrrr);
        switch (gameProceed) {  //ViRaj_if_4


            case 1:  if(mOpen_rrrrr.isChecked()) {  //ViRaj_if_4
 wjList_rrrrr.add(new wj(mGameID_rrrrr,"single_digit","Open",points,openNum,"","","")); }  else {  //ViRaj_if_2
 wjList_rrrrr.add(new wj(mGameID_rrrrr,"single_digit","Close",points,"",openNum,"","")); } break;
            case 2:  String open_digit = openNum.substring(0,1); String close_digit = openNum.substring(1,2); wjList_rrrrr.add(new wj(mGameID_rrrrr,"jodi_digit","Open",points,open_digit,close_digit,"","")); break;
            case 3:  if(mOpen_rrrrr.isChecked()) {  //ViRaj_if_4
 wjList_rrrrr.add(new wj(mGameID_rrrrr,"single_panna","Open",points,"","",openNum,"")); }  else {  //ViRaj_if_2
 wjList_rrrrr.add(new wj(mGameID_rrrrr,"single_panna","Close",points,"","","",openNum)); } break;
            case 4:  if(mOpen_rrrrr.isChecked()) {  //ViRaj_if_4
 wjList_rrrrr.add(new wj(mGameID_rrrrr,"double_panna","Open",points,"","",openNum,"")); }  else {  //ViRaj_if_2
 wjList_rrrrr.add(new wj(mGameID_rrrrr,"double_panna","Close",points,"","","",openNum)); } break;
            case 5:  if(mOpen_rrrrr.isChecked()) {  //ViRaj_if_4
 wjList_rrrrr.add(new wj(mGameID_rrrrr,"triple_panna","Open",points,"","",openNum,""));} else {  //ViRaj_if_2
 wjList_rrrrr.add(new wj(mGameID_rrrrr,"triple_panna","Close",points,"","","",openNum));} break;
            case 6:  if(mOpen_rrrrr.isChecked()) {  //ViRaj_if_4
 wjList_rrrrr.add(new wj(mGameID_rrrrr,"half_sangam","Open",points,openNum,"","",closeNum));} else {  //ViRaj_if_2
 wjList_rrrrr.add(new wj(mGameID_rrrrr,"half_sangam","Close",points,"",closeNum,openNum,""));}break;
            case 7:  wjList_rrrrr.add(new wj(mGameID_rrrrr,"full_sangam","Open",points,"","",openNum,closeNum)); break;

        }
        mInpCloseD_rrrrr.setText("");
        mInputD_rrrrr.setText("");
        mInputCoins_rrrrr.setText("");
        if(gameProceed!=2) mRadioGroup_rrrrr.clearCheck();
        mRecyclerView_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

        llBidBottom_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

        mtvTotalCoins_rrrrr.setText("Total Points : "+ mTotalCoins_rrrrr);
        confRecycler();
        dg_rrrrr.notifyDataSetChanged();
    }
    //ViRaj_fun_A_06
    private void setToolBarTitle(int i) {  //ViRaj_if_3

        SpannableString s = new SpannableString(String.valueOf(i));
        s.setSpan(new ForegroundColorSpan(Color.WHITE), 0, s.length(), 0);
        s.setSpan(new RelativeSizeSpan(1.50f),0,s.length(),0);
        s.setSpan(new StyleSpan(Typeface.BOLD),0,s.length(),0);
        mCoins_rrrrr.setTitle(s);
    }
    //ViRaj_fun_A_10
    private void snackbar(String messaage, View view) {  //ViRaj_if_3

        Snackbar.make(view,messaage, 2000).show();
    }
    public void proceedConformBtn(View view) {  //ViRaj_if_3

        String gsonData = new Gson().toJson(wjList_rrrrr);
        String serverData = getString(R.string.bids_api_open_rrrrr)+gsonData+getString(R.string.bids_api_close_rrrrr);
        cb cb = new cb(() -> {
            if (cc.isOnline_rrrrr(activity_bid_place.this))  conDiaMethod(activity_bid_place.this, serverData);
            else Toast.makeText(activity_bid_place.this, getString(R.string.check_net_rrrrr), Toast.LENGTH_SHORT).show();
        });
        cb.show(getSupportFragmentManager(),getString(R.string.bottom_sheet_rrrrr));
        cb.setCancelable(false);
    }
    //ViRaj_fun_A_43 //ViRaj_fun_A_09 //ViRaj_fun_A_04
    AlertDialog dialog_rrrrr;
    private void conDiaMethod(activity_bid_place activity_rrrrr, String serverData) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","place_bid");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("game_bids",serverData);
        mProgressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        String token = JWT.create().withHeader(headerClaims_rrrrr).withPayload(payLoadClaims_rrrrr).sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        Call<wh> call = xa.getClient().makeoffer(token);
        call.enqueue(new Callback<wh>() {  //ViRaj_if_3

            @Override
            public void onResponse(@NonNull Call<wh> call, @NonNull Response<wh> response) {  //ViRaj_if_3

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
                    if (wh.getStatus().equals("success")) {  //ViRaj_if_4

                        ce.setUserCoins_rrrrr(activity_bid_place.this, mCoins_rrrrr.getTitle().toString());
                        wjList_rrrrr.clear();
                        dg_rrrrr.notifyDataSetChanged();
                        llBidBottom_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                        AlertDialog.Builder builder = new AlertDialog.Builder(activity_bid_place.this);
                        LayoutInflater inflater = LayoutInflater.from(activity_bid_place.this);
                        View view = inflater.inflate(R.layout.bid_completed, null);
                        builder.setView(view);
                        dialog_rrrrr = builder.create();
                        dialog_rrrrr.show();
                        dialog_rrrrr.getWindow().setBackgroundDrawableResource(R.drawable.rounded_corner_white);
                        dialog_rrrrr.getWindow().setLayout(700,LinearLayout.LayoutParams.WRAP_CONTENT);
                    }

                }else {  //ViRaj_if_5

                    Toast.makeText(activity_bid_place.this, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                mProgressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
            @Override
            public void onFailure(Call<wh> call, Throwable t) {  //ViRaj_if_3

                Toast.makeText(getApplicationContext(), getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_LONG).show();
                System.out.println("Placed Bid OnFailure "+t);
                mProgressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });

    }
    //ViRaj_fun_A_50
    private void confRecycler() {  //ViRaj_if_3

        GridLayoutManager layoutManager = new GridLayoutManager(this, 1);
        mRecyclerView_rrrrr.setLayoutManager(layoutManager);
        dg_rrrrr = new dg(this, wjList_rrrrr, position -> {
            int index = position;
            int size = wjList_rrrrr.size();
            if(position-size>=0) {  //ViRaj_if_4

                index = size-1; }
            int bid_points = Integer.parseInt(wjList_rrrrr.get(index).getBid_points());
            mTotalCoins_rrrrr = mTotalCoins_rrrrr - bid_points;
            mtvTotalCoins_rrrrr.setText("Total Points : "+ mTotalCoins_rrrrr);
            wjList_rrrrr.remove(index);
            if(wjList_rrrrr.size()==0) llBidBottom_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            dg_rrrrr.notifyItemRemoved(position);
            setToolBarTitle(mCurrentCoins_rrrrr - mTotalCoins_rrrrr);
        });
        mRecyclerView_rrrrr.setAdapter(dg_rrrrr);
    }
    //ViRaj_fun_A_13
    @Override  protected void onPause() {  //ViRaj_if_3
 super.onPause(); unregisterReceiver(myReceiver_rrrrr); }
    //ViRaj_fun_A_01 //ViRaj_fun_A_23
    public void playAgainBtn(View view) {  //ViRaj_if_3

        dialog_rrrrr.dismiss();}
    @Override protected void onRestart() {  //ViRaj_if_3
 super.onRestart(); registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr); }
    //ViRaj_fun_A_41 //ViRaj_fun_A_40 //ViRaj_fun_A_44
    @Override  protected void onResume() {  //ViRaj_if_3
 super.onResume(); registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr); }
    //ViRaj_fun_A_37 //ViRaj_fun_A_25
}