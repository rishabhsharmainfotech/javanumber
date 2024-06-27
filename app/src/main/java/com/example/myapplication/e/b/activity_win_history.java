package com.example.myapplication.e.b;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.DatePicker;
import android.widget.Toast;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.google.android.material.imageview.ShapeableImageView;
import com.example.myapplication.e.c.db;
import com.example.myapplication.e.c.dk;
import com.example.myapplication.e.c.dp;
import com.example.myapplication.e.e.wd;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.d.xa;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.e.e.wp;
import com.example.myapplication.e.e.wl;
import com.example.myapplication.R;
import com.google.android.material.appbar.MaterialToolbar;
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

public class activity_win_history extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_24 //ViRaj_fun_A_11 //ViRaj_fun_A_39 //ViRaj_fun_A_23
    private MaterialToolbar toolbar_rrrrr;
    private MaterialTextView from_date_rrrrr, to_date_rrrrr;
    private Date f_date_rrrrr, t_date_rrrrr;
    private final SimpleDateFormat userSF_rrrrr = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
    private final SimpleDateFormat serverSF_rrrrr = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
    private final Calendar fromCalender_rrrrr = Calendar.getInstance();
    private final Calendar toCalendar_rrrrr = Calendar.getInstance();
    private final Calendar todayCalwndar_rrrrr = Calendar.getInstance();
    private ShapeableImageView emptyImage_rrrrr;
    private int his_rrrrr =0;
    private RecyclerView recyclerView_rrrrr;
    private dp dp_rrrrr;
    private dk dk_rrrrr;
    private db db_rrrrr;
    private List<wl.Data> dataArrayList_rrrrr = new ArrayList<>();
    private List<wp.Data> slWonModelList_rrrrr = new ArrayList<>();
    private List<wd.Data> disaWonModelList_rrrrr = new ArrayList<>();
    private SwipeRefreshLayout swipeRefreshLayout_rrrrr;
    private Call<wl> call_rrrrr;
    private Call<wp> sLCall_rrrrr;
    private Call<wd> disaCall_rrrrr;
    private IntentFilter mIntentFilter_rrrrr;
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();
    ca ca_rrrrr;

    //ViRaj_fun_A_34 //ViRaj_fun_A_48 //ViRaj_fun_A_18 //ViRaj_fun_A_40 //ViRaj_fun_A_49 //ViRaj_fun_A_22 //ViRaj_fun_A_42 //ViRaj_fun_A_50 //ViRaj_fun_A_28 //ViRaj_fun_A_07

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_history);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.status_bar_color_rrrrr));
        intVariables(); //ViRaj_if_6

        algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr));
        ca_rrrrr = new ca(this);
        loadData(); //ViRaj_if_6

        toolbarMethod();
    }
    //ViRaj_fun_A_25
    private void loadData() {  //ViRaj_if_3

        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);
        f_date_rrrrr = Calendar.getInstance().getTime();
        t_date_rrrrr = Calendar.getInstance().getTime();
        from_date_rrrrr.setText(userSF_rrrrr.format(f_date_rrrrr));
        to_date_rrrrr.setText(userSF_rrrrr.format(t_date_rrrrr));
        his_rrrrr = getIntent().getIntExtra(getString(R.string.history_rrrrr), 0);
        if (his_rrrrr ==100 || his_rrrrr ==200) {  //ViRaj_if_4

            historyMethod(activity_win_history.this, f_date_rrrrr, t_date_rrrrr);
        }
        if (his_rrrrr ==300 || his_rrrrr ==400) {  //ViRaj_if_4

            winHistoryHistoryMethod(activity_win_history.this, f_date_rrrrr, t_date_rrrrr);
        }
        if (his_rrrrr ==500|| his_rrrrr ==600) {  //ViRaj_if_4

            desawarHistoryMethod(activity_win_history.this, f_date_rrrrr, t_date_rrrrr);
        }
    }
    //ViRaj_fun_A_29
    private void intVariables() {  //ViRaj_if_3

        toolbar_rrrrr = findViewById(R.id.rrrrr_toolbar_rrrrr); //ViRaj_if_5

        from_date_rrrrr = findViewById(R.id.rrrrr_fromDate_rrrrr);
        to_date_rrrrr = findViewById(R.id.rrrrr_toDate_rrrrr);
        recyclerView_rrrrr = findViewById(R.id.rrrrr_recyclerView_rrrrr);
        emptyImage_rrrrr = findViewById(R.id.rrrrr_emptyImage_rrrrr);
        swipeRefreshLayout_rrrrr = findViewById(R.id.rrrrr_swipe_ref_lyt_rrrrr);
        MaterialTextView dataConText = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

        cf cf = new cf(dataConText);

    }
    //ViRaj_fun_A_10
    DatePickerDialog.OnDateSetListener toDatePicker_rrrrr = new DatePickerDialog.OnDateSetListener() {  //ViRaj_if_3

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {  //ViRaj_if_3

            toCalendar_rrrrr.set(Calendar.YEAR, year);
            toCalendar_rrrrr.set(Calendar.MONTH, monthOfYear);
            toCalendar_rrrrr.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            if(toCalendar_rrrrr.getTimeInMillis()< fromCalender_rrrrr.getTimeInMillis()) {  //ViRaj_if_4

                Toast.makeText(activity_win_history.this, "To Date can't be smaller then From Date", Toast.LENGTH_SHORT).show();
                return;
            }
            t_date_rrrrr = toCalendar_rrrrr.getTime();
            to_date_rrrrr.setText(userSF_rrrrr.format(t_date_rrrrr));
        }
    };
    //ViRaj_fun_A_35
    DatePickerDialog.OnDateSetListener fromDatePicker_rrrrr = new DatePickerDialog.OnDateSetListener() {  //ViRaj_if_3

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {  //ViRaj_if_3

            fromCalender_rrrrr.set(Calendar.YEAR, year);
            fromCalender_rrrrr.set(Calendar.MONTH, monthOfYear);
            fromCalender_rrrrr.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            f_date_rrrrr = fromCalender_rrrrr.getTime();
            from_date_rrrrr.setText(userSF_rrrrr.format(f_date_rrrrr));
        }
    };
    //ViRaj_fun_A_13

    private void toolbarMethod() {  //ViRaj_if_3

        if (his_rrrrr ==100) {  //ViRaj_if_4

            toolbar_rrrrr.setTitle(getString(R.string.win_his_rrrrr));
        }else {  //ViRaj_if_5

            toolbar_rrrrr.setTitle(getString(R.string.bid_his_rrrrr));
        }

        toolbar_rrrrr.setNavigationOnClickListener(v -> onBackPressed());
        swipeRefreshLayout_rrrrr.setOnRefreshListener(() -> {
            if (his_rrrrr ==100 || his_rrrrr ==200) {  //ViRaj_if_4

                historyMethod(activity_win_history.this, f_date_rrrrr, t_date_rrrrr);
            }
            if (his_rrrrr ==300 || his_rrrrr ==400) {  //ViRaj_if_4

                winHistoryHistoryMethod(activity_win_history.this, f_date_rrrrr, t_date_rrrrr);
            }
        });
    }
    //ViRaj_fun_A_45
    public void fromDate(View view) {  //ViRaj_if_3

        DatePickerDialog datePickerDialog=  new DatePickerDialog(this,android.R.style.Theme_Holo_Light_Panel, fromDatePicker_rrrrr, fromCalender_rrrrr
                .get(Calendar.YEAR), fromCalender_rrrrr.get(Calendar.MONTH), fromCalender_rrrrr.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
        long maxDate = todayCalwndar_rrrrr.getTime().getTime() ;
        datePickerDialog.getDatePicker().setMaxDate(maxDate);
        datePickerDialog.setCanceledOnTouchOutside(true);
        datePickerDialog.getDatePicker().setBackgroundColor(getResources().getColor(R.color.white_rrrrr));
        datePickerDialog.show();
    }
    //ViRaj_fun_A_09 //ViRaj_fun_A_03 //ViRaj_fun_A_16
    public void toDate(View view) {  //ViRaj_if_3

        DatePickerDialog datePickerDialog=  new DatePickerDialog(this,android.R.style.Theme_Holo_Light_Panel, toDatePicker_rrrrr, toCalendar_rrrrr
                .get(Calendar.YEAR), toCalendar_rrrrr.get(Calendar.MONTH), toCalendar_rrrrr.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
        long maxDate = todayCalwndar_rrrrr.getTime().getTime() ;
        datePickerDialog.getDatePicker().setMaxDate(maxDate);
        datePickerDialog.setCanceledOnTouchOutside(true);
        datePickerDialog.getDatePicker().setBackgroundColor(getResources().getColor(R.color.white_rrrrr));
        datePickerDialog.show();
    }


    //ViRaj_fun_A_37 //ViRaj_fun_A_02 //ViRaj_fun_A_12 //ViRaj_fun_A_15 //ViRaj_fun_A_06
    public void submitWinHistory(View view) {  //ViRaj_if_3

        if (his_rrrrr ==100 || his_rrrrr ==200) {  //ViRaj_if_4

            historyMethod(activity_win_history.this, f_date_rrrrr, t_date_rrrrr);
        }
        if (his_rrrrr ==300 || his_rrrrr ==400) {  //ViRaj_if_4

            winHistoryHistoryMethod(activity_win_history.this, f_date_rrrrr, t_date_rrrrr);
        }
    }
    //ViRaj_fun_A_38 //ViRaj_fun_A_47 //ViRaj_fun_A_33 //ViRaj_fun_A_36 //ViRaj_fun_A_04 //ViRaj_fun_A_43
    private void winHistoryHistoryMethod(activity_win_history activity_rrrrr, Date fDate, Date tDate) {  //ViRaj_if_3

        String fromDate = serverSF_rrrrr.format(fDate) + " 00:00:00";
        String toDate = serverSF_rrrrr.format(tDate) + " 23:59:59";
        swipeRefreshLayout_rrrrr.setRefreshing(true);
        switch (his_rrrrr) {  //ViRaj_if_4

            case 300:
                headerClaims_rrrrr.clear();
                payLoadClaims_rrrrr.clear();
                headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
                headerClaims_rrrrr.put("method","starline_win_history");
                headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
                payLoadClaims_rrrrr.put("from_date",fromDate);
                payLoadClaims_rrrrr.put("to_date",toDate);
                String token0 = JWT.create()
                        .withHeader(headerClaims_rrrrr)
                        .withPayload(payLoadClaims_rrrrr)
                        .sign(algorithmHS_rrrrr);
                token0 = ca_rrrrr.appData_rrrrr(token0);
                sLCall_rrrrr = xa.getClient().HistorySLBids(token0);
                break;
            case 400:
                headerClaims_rrrrr.clear();
                payLoadClaims_rrrrr.clear();
                headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
                headerClaims_rrrrr.put("method","starline_bid_history");
                headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
                payLoadClaims_rrrrr.put("from_date",fromDate);
                payLoadClaims_rrrrr.put("to_date",toDate);
                String token = JWT.create()
                        .withHeader(headerClaims_rrrrr)
                        .withPayload(payLoadClaims_rrrrr)
                        .sign(algorithmHS_rrrrr);
                token = ca_rrrrr.appData_rrrrr(token);
                sLCall_rrrrr = xa.getClient().starLineBidHistory(token);
                break;
        }

        sLCall_rrrrr.enqueue(new Callback<wp>() {  //ViRaj_if_3

            @Override
            public void onResponse(@NonNull Call<wp> call, @NonNull Response<wp> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4

                    wp wp = response.body();
                    if (wp.getCode().equalsIgnoreCase("505")) {  //ViRaj_if_4

                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, wp.getMessage(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }
                    if (wp.getStatus().equalsIgnoreCase(getString(R.string.success_rrrrr))) {  //ViRaj_if_4

                        LinearLayoutManager layoutManager = new LinearLayoutManager(activity_rrrrr);

                        slWonModelList_rrrrr = wp.getData();
                        recyclerView_rrrrr.setLayoutManager(layoutManager);
                        dk_rrrrr = new dk(activity_rrrrr, slWonModelList_rrrrr);
                        recyclerView_rrrrr.setAdapter(dk_rrrrr);
                        emptyImage_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                    }else {  //ViRaj_if_5

                        emptyImage_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

                    }
                    Toast.makeText(activity_rrrrr, wp.getMessage(), Toast.LENGTH_SHORT).show();
                }else {  //ViRaj_if_5

                    Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                swipeRefreshLayout_rrrrr.setRefreshing(false);
            }

            @Override
            public void onFailure(Call<wp> call, Throwable t) {  //ViRaj_if_3

                swipeRefreshLayout_rrrrr.setRefreshing(false);
                System.out.println("bidHistory error "+t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();

            }
        });
    }
    //ViRaj_fun_A_17 //ViRaj_fun_A_30 //ViRaj_fun_A_32 //ViRaj_fun_A_20 //ViRaj_fun_A_41 //ViRaj_fun_A_21
    private void historyMethod(activity_win_history activity_rrrrr, Date fDate, Date tDate) {  //ViRaj_if_3

        String fromDate = serverSF_rrrrr.format(fDate) + " 00:00:00";
        String toDate = serverSF_rrrrr.format(tDate) + " 23:59:59";
        swipeRefreshLayout_rrrrr.setRefreshing(true);
        switch (his_rrrrr) {  //ViRaj_if_4

            case 100:
                headerClaims_rrrrr.clear();
                payLoadClaims_rrrrr.clear();
                headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
                headerClaims_rrrrr.put("method","win_history");
                headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
                payLoadClaims_rrrrr.put("from_date",fromDate);
                payLoadClaims_rrrrr.put("to_date",toDate);
                String token = JWT.create()
                        .withHeader(headerClaims_rrrrr)
                        .withPayload(payLoadClaims_rrrrr)
                        .sign(algorithmHS_rrrrr);
                token = ca_rrrrr.appData_rrrrr(token);
                call_rrrrr = xa.getClient().HistoryOfWins(token);
                break;
            case 200:
                headerClaims_rrrrr.clear();
                payLoadClaims_rrrrr.clear();
                headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
                headerClaims_rrrrr.put("method","bid_history");
                headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
                payLoadClaims_rrrrr.put("from_date",fromDate);
                payLoadClaims_rrrrr.put("to_date",toDate);
                String token0 = JWT.create()
                        .withHeader(headerClaims_rrrrr)
                        .withPayload(payLoadClaims_rrrrr)
                        .sign(algorithmHS_rrrrr);
                token0 = ca_rrrrr.appData_rrrrr(token0);
                call_rrrrr = xa.getClient().HistoryOfBids(token0);
                break;
        }

        call_rrrrr.enqueue(new Callback<wl>() {  //ViRaj_if_3

            @Override
            public void onResponse(@NonNull Call<wl> call, @NonNull Response<wl> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4

                    wl wl = response.body();
                    if (wl.getCode().equalsIgnoreCase("505")) {  //ViRaj_if_4

                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, wl.getMessage(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }
                    System.out.println("winModel.getStatus() "+ wl.getStatus());
                    if (wl.getStatus().equalsIgnoreCase(getString(R.string.success_rrrrr))) {  //ViRaj_if_4

                        LinearLayoutManager layoutManager = new LinearLayoutManager(activity_rrrrr);

                        dataArrayList_rrrrr = wl.getData();
                        recyclerView_rrrrr.setLayoutManager(layoutManager);
                        dp_rrrrr = new dp(activity_rrrrr, dataArrayList_rrrrr);
                        recyclerView_rrrrr.setAdapter(dp_rrrrr);
                        System.out.println("winModelArrayList.size() "+ dataArrayList_rrrrr.size());
                        emptyImage_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2


                    }else {  //ViRaj_if_5

                        emptyImage_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

                    }
                    Toast.makeText(activity_rrrrr, wl.getMessage(), Toast.LENGTH_SHORT).show();
                }else {  //ViRaj_if_5

                    Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                swipeRefreshLayout_rrrrr.setRefreshing(false);
            }
            @Override
            public void onFailure(Call<wl> call, Throwable t) {  //ViRaj_if_3

                swipeRefreshLayout_rrrrr.setRefreshing(false);
                System.out.println("bidHistory error "+t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();

            }
        });

    }
    //ViRaj_fun_A_31 //ViRaj_fun_A_44 //ViRaj_fun_A_27 //ViRaj_fun_A_05 //ViRaj_fun_A_26 //ViRaj_fun_A_19
    private void desawarHistoryMethod(activity_win_history activity_rrrrr, Date fDate, Date tDate) {  //ViRaj_if_3

        String fromDate = serverSF_rrrrr.format(fDate) + " 00:00:00";
        String toDate = serverSF_rrrrr.format(tDate) + " 23:59:59";
        swipeRefreshLayout_rrrrr.setRefreshing(true);
        switch (his_rrrrr) {  //ViRaj_if_4

            case 500:
                headerClaims_rrrrr.clear();
                payLoadClaims_rrrrr.clear();
                headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
                headerClaims_rrrrr.put("method","gali_disawar_bid_history");
                headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
                payLoadClaims_rrrrr.put("from_date",fromDate);
                payLoadClaims_rrrrr.put("to_date",toDate);
                String token0 = JWT.create()
                        .withHeader(headerClaims_rrrrr)
                        .withPayload(payLoadClaims_rrrrr)
                        .sign(algorithmHS_rrrrr);
                token0 = ca_rrrrr.appData_rrrrr(token0);
                disaCall_rrrrr = xa.getClient().deasawarBidHistory(token0);
                break;
            case 600:
                headerClaims_rrrrr.clear();
                payLoadClaims_rrrrr.clear();
                headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
                headerClaims_rrrrr.put("method","gali_disawar_win_history");
                headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
                payLoadClaims_rrrrr.put("from_date",fromDate);
                payLoadClaims_rrrrr.put("to_date",toDate);
                String token = JWT.create()
                        .withHeader(headerClaims_rrrrr)
                        .withPayload(payLoadClaims_rrrrr)
                        .sign(algorithmHS_rrrrr);
                token = ca_rrrrr.appData_rrrrr(token);
                disaCall_rrrrr = xa.getClient().desawarWinHistory(token);
                break;
        }

        disaCall_rrrrr.enqueue(new Callback<wd>() {  //ViRaj_if_3

            @Override
            public void onResponse(@NonNull Call<wd> call, @NonNull Response<wd> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4

                    wd wd = response.body();
                    if (wd.getCode_rrrrr().equalsIgnoreCase("505")) {  //ViRaj_if_4

                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, wd.getMessage_rrrrr(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }
                    if (wd.getStatus_rrrrr().equalsIgnoreCase(getString(R.string.success_rrrrr))) {  //ViRaj_if_4

                        LinearLayoutManager layoutManager = new LinearLayoutManager(activity_rrrrr);
                        disaWonModelList_rrrrr = wd.getData_rrrrr();

                        recyclerView_rrrrr.setLayoutManager(layoutManager);
                        db_rrrrr = new db(activity_rrrrr, disaWonModelList_rrrrr);
                        recyclerView_rrrrr.setAdapter(db_rrrrr);
                        emptyImage_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                    }else {  //ViRaj_if_5

                        recyclerView_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                        emptyImage_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

                    }
                    Toast.makeText(activity_rrrrr, wd.getMessage_rrrrr(), Toast.LENGTH_SHORT).show();
                }else {  //ViRaj_if_5

                    Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                swipeRefreshLayout_rrrrr.setRefreshing(false);
            }
            @Override
            public void onFailure(Call<wd> call, Throwable t) {  //ViRaj_if_3

                swipeRefreshLayout_rrrrr.setRefreshing(false);
                System.out.println("bidHistory error "+t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
            }
        });
    }
    //ViRaj_fun_A_46 //ViRaj_fun_A_08
    @Override protected void onRestart() {  //ViRaj_if_3
super.onRestart();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    //ViRaj_fun_A_14
    @Override protected void onResume() {  //ViRaj_if_3
super.onResume();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    @Override protected void onPause() {  //ViRaj_if_3
super.onPause();unregisterReceiver(myReceiver_rrrrr);}
    //ViRaj_fun_A_01
}