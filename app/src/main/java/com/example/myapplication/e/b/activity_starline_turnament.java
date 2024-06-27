package com.example.myapplication.e.b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.R;

import static com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr;
import static com.example.myapplication.e.a.cf.myReceiver_rrrrr;
//ViRaj_imports

public class activity_starline_turnament extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_42 //ViRaj_fun_A_26 //ViRaj_fun_A_13 //ViRaj_fun_A_39 //ViRaj_fun_A_07
    private Intent intent_rrrrr;
    //ViRaj_fun_A_31 //ViRaj_fun_A_18
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_50 //ViRaj_fun_A_35 //ViRaj_fun_A_28
    private MaterialToolbar toolbar_rrrrr;
    //ViRaj_fun_A_04 //ViRaj_fun_A_45 //ViRaj_fun_A_46

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starline_turnament);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.status_bar_color_rrrrr));
        intVariables(); //ViRaj_if_6

        loadData(); //ViRaj_if_6

    }
    //ViRaj_fun_A_20 //ViRaj_fun_A_24 //ViRaj_fun_A_17 //ViRaj_fun_A_48 //ViRaj_fun_A_47 //ViRaj_fun_A_37
    private void loadData() {  //ViRaj_if_3

        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);
        toolbar_rrrrr.setNavigationOnClickListener(v -> onBackPressed());
    }
    //ViRaj_fun_A_22 //ViRaj_fun_A_16 //ViRaj_fun_A_08 //ViRaj_fun_A_15

    private void intVariables() {  //ViRaj_if_3

        MaterialTextView dataConText = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

        toolbar_rrrrr = findViewById(R.id.rrrrr_toolbar_rrrrr); //ViRaj_if_5

        cf cf = new cf(dataConText);
        String games = getIntent().getStringExtra(getString(R.string.game_rrrrr));
        intent_rrrrr = new Intent(this, activity_starline_bid_place.class);
        intent_rrrrr.putExtra("games", games);
    }
    //ViRaj_fun_A_43 //ViRaj_fun_A_01 //ViRaj_fun_A_44 //ViRaj_fun_A_29

    public void singleDigit(View view) {  //ViRaj_if_3

        intent_rrrrr.putExtra(getString(R.string.game_name_rrrrr), 8);
        startActivity(intent_rrrrr);
    }
    //ViRaj_fun_A_02 //ViRaj_fun_A_27 //ViRaj_fun_A_25 //ViRaj_fun_A_12
    public void singlePana(View view) {  //ViRaj_if_3

        intent_rrrrr.putExtra(getString(R.string.game_name_rrrrr), 9);
        startActivity(intent_rrrrr);
    }
    //ViRaj_fun_A_10 //ViRaj_fun_A_49 //ViRaj_fun_A_19
    public void doublePana(View view) {  //ViRaj_if_3

        intent_rrrrr.putExtra(getString(R.string.game_name_rrrrr), 10);
        startActivity(intent_rrrrr);
    }
    //ViRaj_fun_A_34 //ViRaj_fun_A_33

    public void triplePana(View view) {  //ViRaj_if_3

        intent_rrrrr.putExtra(getString(R.string.game_name_rrrrr), 11);
        startActivity(intent_rrrrr);
    }
    //ViRaj_fun_A_30
    @Override
    protected void onRestart() {  //ViRaj_if_3

        super.onRestart();
        registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);
    }
    //ViRaj_fun_A_36
    @Override
    protected void onPause() {  //ViRaj_if_3

        super.onPause();
        unregisterReceiver(myReceiver_rrrrr);
    }
    //ViRaj_fun_A_21 //ViRaj_fun_A_09 //ViRaj_fun_A_06 //ViRaj_fun_A_05
    @Override
    protected void onResume() {  //ViRaj_if_3

        super.onResume();
        registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);
    }
    //ViRaj_fun_A_40 //ViRaj_fun_A_41 //ViRaj_fun_A_11 //ViRaj_fun_A_38 //ViRaj_fun_A_32 //ViRaj_fun_A_03 //ViRaj_fun_A_23 //ViRaj_fun_A_14

}