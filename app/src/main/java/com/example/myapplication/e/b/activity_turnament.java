package com.example.myapplication.e.b;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.e.a.cf;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
//ViRaj_imports

public class activity_turnament extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_25 //ViRaj_fun_A_19 //ViRaj_fun_A_22
    private MaterialToolbar toolbar_rrrrr;
    //ViRaj_fun_A_45 //ViRaj_fun_A_15 //ViRaj_fun_A_38
    private ShapeableImageView sinD_rrrrr, jodD_rrrrr, sinP_rrrrr, douP_rrrrr, triP_rrrrr, haS_rrrrr, fuS_rrrrr;
    private Intent intent_rrrrr;
    //ViRaj_fun_A_27 //ViRaj_fun_A_24 //ViRaj_fun_A_46 //ViRaj_fun_A_03 //ViRaj_fun_A_39 //ViRaj_fun_A_23 //ViRaj_fun_A_48 //ViRaj_fun_A_35 //ViRaj_fun_A_01 //ViRaj_fun_A_34 //ViRaj_fun_A_29 //ViRaj_fun_A_40
    private MaterialTextView mDataConText_rrrrr;
    //ViRaj_fun_A_05 //ViRaj_fun_A_11 //ViRaj_fun_A_41
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_50 //ViRaj_fun_A_09 //ViRaj_fun_A_08 //ViRaj_fun_A_02
    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turnament);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.status_bar_color_rrrrr));
        intVariables(); //ViRaj_if_6

        loadData(); //ViRaj_if_6

        toolbar_rrrrr.setNavigationOnClickListener(v -> onBackPressed());
    }
    //ViRaj_fun_A_42 //ViRaj_fun_A_32

    private void loadData() {  //ViRaj_if_3

        String games = getIntent().getStringExtra(getString(R.string.game_rrrrr));
        Boolean open = getIntent().getBooleanExtra("open", false);
        intent_rrrrr = new Intent(this, activity_bid_place.class);
        intent_rrrrr.putExtra("open", open);
        intent_rrrrr.putExtra("games", games);
        if(!open) {  //ViRaj_if_4


            sinD_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            jodD_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            sinP_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            douP_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            triP_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            haS_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            fuS_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2


        }
        cf cf = new cf(mDataConText_rrrrr);
        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);
    }

    //ViRaj_fun_A_30 //ViRaj_fun_A_18
    private void intVariables() {  //ViRaj_if_3


        toolbar_rrrrr = findViewById(R.id.rrrrr_toolbar_rrrrr); //ViRaj_if_5

        sinD_rrrrr = findViewById(R.id.rrrrr_singleD_rrrrr);
        sinP_rrrrr = findViewById(R.id.rrrrr_single_p_rrrrr);
        jodD_rrrrr = findViewById(R.id.rrrrr_jodi_d_rrrrr);
        douP_rrrrr = findViewById(R.id.rrrrr_doP_rrrrr);
        haS_rrrrr = findViewById(R.id.rrrrr_half_s_rrrrr);
        triP_rrrrr = findViewById(R.id.rrrrr_tri_p_rrrrr);
        fuS_rrrrr = findViewById(R.id.rrrrr_full_s_rrrrr);
        mDataConText_rrrrr = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5


    }
    //ViRaj_fun_A_49

    public void singleDigit(View view) {  //ViRaj_if_3

        intent_rrrrr.putExtra(getString(R.string.game_name_rrrrr), 1);startActivity(intent_rrrrr);}
    //ViRaj_fun_A_47 //ViRaj_fun_A_33 //ViRaj_fun_A_17
    public void jodiDigit(View view) {  //ViRaj_if_3

        intent_rrrrr.putExtra(getString(R.string.game_name_rrrrr), 2);startActivity(intent_rrrrr);}
    //ViRaj_fun_A_44 //ViRaj_fun_A_13 //ViRaj_fun_A_37
    public void singlePana(View view) {  //ViRaj_if_3

        intent_rrrrr.putExtra(getString(R.string.game_name_rrrrr), 3);startActivity(intent_rrrrr);}
    //ViRaj_fun_A_20 //ViRaj_fun_A_04 //ViRaj_fun_A_12
    public void doublePana(View view) {  //ViRaj_if_3

        intent_rrrrr.putExtra(getString(R.string.game_name_rrrrr), 4);startActivity(intent_rrrrr);}
    //ViRaj_fun_A_16 //ViRaj_fun_A_07 //ViRaj_fun_A_06 //ViRaj_fun_A_36
    public void triplePana(View view) {  //ViRaj_if_3

        intent_rrrrr.putExtra(getString(R.string.game_name_rrrrr), 5);startActivity(intent_rrrrr);}
    public void halfSangam(View view) {  //ViRaj_if_3

        intent_rrrrr.putExtra(getString(R.string.game_name_rrrrr), 6);startActivity(intent_rrrrr);}
    public void fullSangam(View view) {  //ViRaj_if_3

        intent_rrrrr.putExtra(getString(R.string.game_name_rrrrr), 7);startActivity(intent_rrrrr);}
    @Override protected void onRestart() {  //ViRaj_if_3
super.onRestart();registerReceiver(cf.myReceiver_rrrrr, mIntentFilter_rrrrr);}
    @Override protected void onResume() {  //ViRaj_if_3
super.onResume();registerReceiver(cf.myReceiver_rrrrr, mIntentFilter_rrrrr);}
    //ViRaj_fun_A_31 //ViRaj_fun_A_10 //ViRaj_fun_A_21 //ViRaj_fun_A_14 //ViRaj_fun_A_26 //ViRaj_fun_A_28
    @Override protected void onPause() {  //ViRaj_if_3
super.onPause();unregisterReceiver(cf.myReceiver_rrrrr);}
    //ViRaj_fun_A_43

}