package com.example.myapplication.e.b;

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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import com.google.gson.Gson;
import com.example.myapplication.e.c.di;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.d.xa;
import com.example.myapplication.e.a.cb;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.e.e.wh;
import com.example.myapplication.e.e.wr;
import com.example.myapplication.R;
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

public class activity_starline_bid_place extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_20
    private int TuranPro_rrrrr =0;
    //ViRaj_fun_A_02
    private int totalCoins_rrrrr = 0;
    //ViRaj_fun_A_15
    private int currentCoins_rrrrr = 0;
    //ViRaj_fun_A_13
    private String turnamentID_rrrrr;
    //ViRaj_fun_A_22
    private MaterialToolbar toolbar_rrrrr;
    //ViRaj_fun_A_50
    private MaterialTextView mtotalCoins_rrrrr;
    //ViRaj_fun_A_17
    private MaterialAutoCompleteTextView inD_rrrrr;
    //ViRaj_fun_A_01
    private LinearLayout ll_b_b_rrrrr;
    //ViRaj_fun_A_43
    private TextInputEditText inputCoins_rrrrr;
    //ViRaj_fun_A_40
    private ArrayList<String> digits_rrrrr;
    //ViRaj_fun_A_37
    private RecyclerView recyclerView_rrrrr;
    //ViRaj_fun_A_38
    private final List<wr> wrList_rrrrr = new ArrayList<>();
    private di di_rrrrr;
    //ViRaj_fun_A_36
    private MenuItem coins_rrrrr;
    private ProgressBar progressBar_rrrrr;
    //ViRaj_fun_A_35
    private MaterialTextView dataConText_rrrrr;
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_07
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();
    ca ca_rrrrr;
    //ViRaj_fun_A_31 //ViRaj_fun_A_41 //ViRaj_fun_A_19 //ViRaj_fun_A_30 //ViRaj_fun_A_48

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starline_bid_place);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.status_bar_color_rrrrr));

        intVariables(); //ViRaj_if_6

        algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr));
        ca_rrrrr = new ca(this);
        confToolbar();
        confRecycler();
        loadData(); //ViRaj_if_6


    }
    //ViRaj_fun_A_03 //ViRaj_fun_A_49 //ViRaj_fun_A_06
    private void loadData() {  //ViRaj_if_3

        cf cf = new cf(dataConText_rrrrr);
        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);
    }
    //ViRaj_fun_A_45 //ViRaj_fun_A_08 //ViRaj_fun_A_04 //ViRaj_fun_A_05
    private void intVariables() {  //ViRaj_if_3


        toolbar_rrrrr = findViewById(R.id.rrrrr_toolbar_rrrrr); //ViRaj_if_5

        MaterialTextView chooseDate = findViewById(R.id.rrrrr_choose_date_rrrrr);
        inD_rrrrr = findViewById(R.id.rrrrr_input_d_rrrrr);
        inputCoins_rrrrr = findViewById(R.id.rrrrr_inputCoins_rrrrr);
        MaterialTextView digText = findViewById(R.id.rrrrr_digText_rrrrr);
        mtotalCoins_rrrrr = findViewById(R.id.rrrrr_mtv_total_coins_rrrrr);
        MaterialButton proceedConform = findViewById(R.id.rrrrr_pro_conf_rrrrr);
        MaterialButton btn_proceed = findViewById(R.id.rrrrr_btn_proceed_rrrrr);
        recyclerView_rrrrr = findViewById(R.id.rrrrr_recyclerView_rrrrr);
        ll_b_b_rrrrr = findViewById(R.id.rrrrr_ll_bid_bottom_rrrrr);
        progressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5

        dataConText_rrrrr = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

        TuranPro_rrrrr = getIntent().getIntExtra(getString(R.string.game_name_rrrrr), 8);
        turnamentID_rrrrr = getIntent().getStringExtra("games");
        currentCoins_rrrrr = Integer.parseInt(ce.getCustomerCoins_rrrrr(activity_starline_bid_place.this));
        digits_rrrrr = new ArrayList<>();

        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("EEE dd-MMM-yyyy", Locale.getDefault());
        String formattedDate = df.format(c);
        chooseDate.setText(formattedDate);
        btn_proceed.setOnClickListener(v -> proceed(v));
    }
    //ViRaj_fun_A_16 //ViRaj_fun_A_33
    private void confRecycler() {  //ViRaj_if_3

        GridLayoutManager layoutManager = new GridLayoutManager(this, 1);
        recyclerView_rrrrr.setLayoutManager(layoutManager);
        di_rrrrr = new di(this, wrList_rrrrr, position -> {
            int index = position;
            int size = wrList_rrrrr.size();
            if(position-size>=0) {  //ViRaj_if_4

                index = size-1;
            }
            int bid_points = Integer.parseInt(wrList_rrrrr.get(index).getBid_points());
            totalCoins_rrrrr = totalCoins_rrrrr - bid_points;
            mtotalCoins_rrrrr.setText("Total Points : "+ totalCoins_rrrrr);
            wrList_rrrrr.remove(index);
            if(wrList_rrrrr.size()==0) ll_b_b_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            di_rrrrr.notifyItemRemoved(position);
            setToolBarTitle(currentCoins_rrrrr - totalCoins_rrrrr);
        });
        recyclerView_rrrrr.setAdapter(di_rrrrr);
    }
    //ViRaj_fun_A_28 //ViRaj_fun_A_14 //ViRaj_fun_A_21 //ViRaj_fun_A_27
    private void confToolbar() {  //ViRaj_if_3

        setSupportActionBar(toolbar_rrrrr);
        ActionBar actionbar = getSupportActionBar();
        assert actionbar != null;
        toolbar_rrrrr.setTitleTextColor(Color.WHITE);
        toolbar_rrrrr.setNavigationOnClickListener(new View.OnClickListener() {  //ViRaj_if_3

            @Override
            public void onClick(View v) {  //ViRaj_if_3

                onBackPressed();
            }
        });
        switch (TuranPro_rrrrr) {  //ViRaj_if_4

            case 8:
                actionbar.setTitle(getString(R.string.single_digit_rrrrr));
                for (int i = 0; i <= 9; i++) {  //ViRaj_if_3

                    digits_rrrrr.add(String.valueOf(i));
                }
                break;
            case 9:
                actionbar.setTitle(getString(R.string.single_pana_rrrrr));
                for (int a =1 ; a<=9; a++) {  //ViRaj_if_4

                    for (int b = 1;b<=9;b++) {  //ViRaj_if_4

                        for (int c = 0;c<=9;c++) {  //ViRaj_if_4

                            if(a!=b && a!=c && b!=c) {  //ViRaj_if_4

                                if (a < b && b<c||c==0&& a<b) {  //ViRaj_if_4

                                    digits_rrrrr.add(String.valueOf(a)+String.valueOf(b)+String.valueOf(c));
                                }
                            }
                        }
                    }
                }
                break;
            case 10:
                actionbar.setTitle(getString(R.string.double_pana_rrrrr));
                for (int a =1 ; a<=9; a++) {  //ViRaj_if_4

                    for (int b = 0;b<=9;b++) {  //ViRaj_if_4

                        for (int c = 0;c<=9;c++) {  //ViRaj_if_4

                            if(a == b && b < c || b == 0 && c == 0 || a == b && c == 0||a<b && b==c) {  //ViRaj_if_4

                                digits_rrrrr.add(String.valueOf(a)+String.valueOf(b)+String.valueOf(c));
                            }
                        }
                    }
                }
                break;
            case 11:
                actionbar.setTitle(getString(R.string.triple_pana_rrrrr));
                for (int a =0 ; a<=9; a++) {  //ViRaj_if_4

                    for (int b = 0;b<=9;b++) {  //ViRaj_if_4

                        for (int c = 0;c<=9;c++) {  //ViRaj_if_4

                            if(a == b && b == c ) {  //ViRaj_if_4

                                digits_rrrrr.add(String.valueOf(a)+String.valueOf(b)+String.valueOf(c));
                            }
                        }
                    }
                }
                break;
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, digits_rrrrr);
        inD_rrrrr.setThreshold(1);//will start working from first character
        inD_rrrrr.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        int maxLength = digits_rrrrr.get(0).length() ;
        InputFilter[] fArray = new InputFilter[1];
        fArray[0] = new InputFilter.LengthFilter(maxLength);
        inD_rrrrr.setFilters(fArray);

    }

    //ViRaj_fun_A_23 //ViRaj_fun_A_39 //ViRaj_fun_A_47 //ViRaj_fun_A_42
    @Override public boolean onCreateOptionsMenu(Menu menu) {  //ViRaj_if_3

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_right_wallet_menu, menu);
        coins_rrrrr = menu.findItem(R.id.rrrrr_coins_rrrrr);
        MenuItem wallet = menu.findItem(R.id.rrrrr_purse_rrrrr);
        coins_rrrrr.setEnabled(false);
        wallet.setEnabled(false);
        coins_rrrrr.setVisible(true);  //ViRaj_if_2

        SpannableString s = new SpannableString(String.valueOf(currentCoins_rrrrr));
        s.setSpan(new ForegroundColorSpan(Color.WHITE), 0, s.length(), 0);
        s.setSpan(new RelativeSizeSpan(1.50f),0,s.length(),0);
        s.setSpan(new StyleSpan(Typeface.BOLD),0,s.length(),0);
        coins_rrrrr.setTitle(s);
        return super.onCreateOptionsMenu(menu);
    }
    //ViRaj_fun_A_32 //ViRaj_fun_A_26 //ViRaj_fun_A_09
    public void proceed(View view) {  //ViRaj_if_3

        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        if (TextUtils.isEmpty(inD_rrrrr.getText().toString())) {  //ViRaj_if_4

            snackbar(getString(R.string.enter_digit_rrrrr),view);
            return;
        }
        if (!digits_rrrrr.contains(inD_rrrrr.getText().toString())) {  //ViRaj_if_4

            snackbar(getString(R.string.valid_digit_rrrrr), view);
            return;
        }
        if (TextUtils.isEmpty(inputCoins_rrrrr.getText().toString().trim())) {  //ViRaj_if_4

            snackbar(getString(R.string.enter_point_rrrrr),view);
            return;
        }
        if (Integer.parseInt(inputCoins_rrrrr.getText().toString().trim())<Integer.parseInt(ce.getMaxMinObject_rrrrr(this, ce.KEY_MIN_OFFER_SUM_rrrrr))
                ||Integer.parseInt(inputCoins_rrrrr.getText().toString().trim())>Integer.parseInt(ce.getMaxMinObject_rrrrr(this, ce.KEY_MAX_OFFER_SUM_rrrrr))) {  //ViRaj_if_4

            snackbar("Minimum Bid Points "+ ce.getMaxMinObject_rrrrr(this, ce.KEY_MIN_OFFER_SUM_rrrrr)+" and Maximum Bid Points "+ ce.getMaxMinObject_rrrrr(this, ce.KEY_MAX_OFFER_SUM_rrrrr),view);
            return;
        }
        setRecycleData(TuranPro_rrrrr,view);

    }
    //ViRaj_fun_A_44 //ViRaj_fun_A_24 //ViRaj_fun_A_10 //ViRaj_fun_A_12
    private void setRecycleData(int gameProceed, View view) {  //ViRaj_if_3

        String openNum = inD_rrrrr.getText().toString();
        String points = inputCoins_rrrrr.getText().toString();
        totalCoins_rrrrr += Integer.parseInt(points);
        if(totalCoins_rrrrr > currentCoins_rrrrr) {  //ViRaj_if_4

            snackbar("Insufficient Points",view);
            totalCoins_rrrrr = totalCoins_rrrrr - Integer.parseInt(points);
            return;
        }
        setToolBarTitle(currentCoins_rrrrr - totalCoins_rrrrr);
        switch (gameProceed) {  //ViRaj_if_4

            case 8:
                wrList_rrrrr.add(new wr(turnamentID_rrrrr,"single_digit",points,openNum,""));
                break;
            case 9:
                wrList_rrrrr.add(new wr(turnamentID_rrrrr,"single_panna",points,"",openNum));
                break;
            case 10:
                wrList_rrrrr.add(new wr(turnamentID_rrrrr,"double_panna",points,"",openNum));
                break;
            case 11:
                wrList_rrrrr.add(new wr(turnamentID_rrrrr,"triple_panna",points,"",openNum));
                break;
        }
        inD_rrrrr.setText("");
        inputCoins_rrrrr.setText("");
        recyclerView_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

        ll_b_b_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

        mtotalCoins_rrrrr.setText("Total Points : "+ totalCoins_rrrrr);
        di_rrrrr.notifyDataSetChanged();
    }
    //ViRaj_fun_A_18
    private void setToolBarTitle(int i) {  //ViRaj_if_3

        SpannableString s = new SpannableString(String.valueOf(i));
        s.setSpan(new ForegroundColorSpan(Color.WHITE), 0, s.length(), 0);
        s.setSpan(new RelativeSizeSpan(1.50f),0,s.length(),0);
        s.setSpan(new StyleSpan(Typeface.BOLD),0,s.length(),0);
        coins_rrrrr.setTitle(s);
    }
    //ViRaj_fun_A_11
    private void snackbar(String messaage, View view) {  //ViRaj_if_3

        Snackbar.make(view,messaage, 2000).show();
    }
    //ViRaj_fun_A_34
    public void proceedConformBtn(View view) {  //ViRaj_if_3


        String gsonData = new Gson().toJson(wrList_rrrrr);
        String serverData_rrrrr = getString(R.string.bids_api_open_rrrrr)+gsonData+getString(R.string.bids_api_close_rrrrr);

        cb cb = new cb(new com.example.myapplication.e.a.cb.OnConformClick_rrrrr() {  //ViRaj_if_3

            @Override
            public void onConformClick_rrrrr() {  //ViRaj_if_3

                if (cc.isOnline_rrrrr(activity_starline_bid_place.this))
                    conformDialog(activity_starline_bid_place.this, serverData_rrrrr);
                else
                    Toast.makeText(activity_starline_bid_place.this, getString(R.string.check_net_rrrrr), Toast.LENGTH_SHORT).show();
            }
        });
        cb.show(getSupportFragmentManager(),getString(R.string.bottom_sheet_rrrrr));
        cb.setCancelable(false);
    }
    //ViRaj_fun_A_29
    AlertDialog dialog_rrrrr;
    private void conformDialog(activity_starline_bid_place activity_rrrrr, String serverData) {  //ViRaj_if_3

        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","starline_place_bid");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("game_bids",serverData);
        String token = JWT.create()
                .withHeader(headerClaims_rrrrr)
                .withPayload(payLoadClaims_rrrrr)
                .sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

        Call<wh> call = xa.getClient().starlinePlaceBid(token);
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

                        ce.setUserCoins_rrrrr(activity_starline_bid_place.this, coins_rrrrr.getTitle().toString());
                        wrList_rrrrr.clear();
                        di_rrrrr.notifyDataSetChanged();
                        ll_b_b_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                        AlertDialog.Builder builder = new AlertDialog.Builder(activity_starline_bid_place.this);
                        LayoutInflater inflater = LayoutInflater.from(activity_starline_bid_place.this);
                        View view = inflater.inflate(R.layout.bid_completed, null);
                        builder.setView(view);
                        dialog_rrrrr = builder.create();
                        dialog_rrrrr.show();
                        dialog_rrrrr.getWindow().setBackgroundDrawableResource(R.drawable.rounded_corner_white);
                        dialog_rrrrr.getWindow().setLayout(700,LinearLayout.LayoutParams.WRAP_CONTENT);
                    }

                }else {  //ViRaj_if_5

                    Toast.makeText(activity_starline_bid_place.this, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
            @Override
            public void onFailure(Call<wh> call, Throwable t) {  //ViRaj_if_3

                Toast.makeText(getApplicationContext(), getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_LONG).show();
                System.out.println("starlinePlaceBid OnFailure "+t);
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });

    }

    public void playAgainBtn(View view) {  //ViRaj_if_3

        dialog_rrrrr.dismiss();
    }
    @Override protected void onRestart() {  //ViRaj_if_3
super.onRestart();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    @Override protected void onPause() {  //ViRaj_if_3
super.onPause();unregisterReceiver(myReceiver_rrrrr);}
    @Override protected void onResume() {  //ViRaj_if_3
super.onResume();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    //ViRaj_fun_A_25
    //ViRaj_fun_A_46

}