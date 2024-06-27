package com.example.myapplication.e.b;


import static com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr;
import static com.example.myapplication.e.a.cf.myReceiver_rrrrr;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.e.a.cf;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textview.MaterialTextView;
//ViRaj_imports

public class activity_desawar_turnament extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_20 //ViRaj_fun_A_09 //ViRaj_fun_A_30 //ViRaj_fun_A_31 //ViRaj_fun_A_2 //ViRaj_fun_A_34 //ViRaj_fun_A_21
    private Intent intent_rrrrr;
    //ViRaj_fun_A_33 //ViRaj_fun_A_39 //ViRaj_fun_A_37 //ViRaj_fun_A_27 //ViRaj_fun_A_08 //ViRaj_fun_A_50 //ViRaj_fun_A_26 //ViRaj_fun_A_48
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_25 //ViRaj_fun_A_12 //ViRaj_fun_A_16 //ViRaj_fun_A_04
    private MaterialToolbar toolbar_rrrrr;
    //ViRaj_fun_A_10

    //ViRaj_fun_A_29 //ViRaj_fun_A_03 //ViRaj_fun_A_40 //ViRaj_fun_A_43 //ViRaj_fun_A_18
    @Override protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3
 super.onCreate(savedInstanceState); setContentView(R.layout.activity_desawar_turnament); intVariables(); //ViRaj_if_6
 loadData(); //ViRaj_if_6
 }
    //ViRaj_fun_A_35 //ViRaj_fun_A_44 //ViRaj_fun_A_19 //ViRaj_fun_A_11
    private void loadData() {  //ViRaj_if_3
 mIntentFilter_rrrrr = new IntentFilter(); mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr); Intent serviceIntent = new Intent(this, cc.class); startService(serviceIntent); toolbar_rrrrr.setNavigationOnClickListener(v -> onBackPressed()); }
    //ViRaj_fun_A_41
    private void intVariables() {  //ViRaj_if_3
MaterialTextView dataConText = findViewById(R.id.rrrrr_internet_text_rrrrr); toolbar_rrrrr = findViewById(R.id.rrrrr_tool_bar_rrrrr); cf cf = new cf(dataConText); String games = getIntent().getStringExtra(getString(R.string.game_rrrrr)); intent_rrrrr = new Intent(this, activity_desawar_bid_place.class); intent_rrrrr.putExtra("games", games); }
    //ViRaj_fun_A_47
    public void leftDigit(View view) {  //ViRaj_if_3
 intent_rrrrr.putExtra(getString(R.string.game_name_rrrrr), 12); startActivity(intent_rrrrr); }
    //ViRaj_fun_A_42
    public void rightDigit(View view) {  //ViRaj_if_3
 intent_rrrrr.putExtra(getString(R.string.game_name_rrrrr), 13); startActivity(intent_rrrrr); }
    //ViRaj_fun_A_24 //ViRaj_fun_A_14 //ViRaj_fun_A_05 //ViRaj_fun_A_06
    public void jodiDigit(View view) {  //ViRaj_if_3
 intent_rrrrr.putExtra(getString(R.string.game_name_rrrrr), 14); startActivity(intent_rrrrr); }
    //ViRaj_fun_A_01 //ViRaj_fun_A_13
    @Override  protected void onRestart() {  //ViRaj_if_3
 super.onRestart(); registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr); }
    //ViRaj_fun_A_28 //ViRaj_fun_A_15 //ViRaj_fun_A_46 //ViRaj_fun_A_45
    @Override  protected void onPause() {  //ViRaj_if_3
 super.onPause(); unregisterReceiver(myReceiver_rrrrr); }
    //ViRaj_fun_A_17 //ViRaj_fun_A_02
    @Override  protected void onResume() {  //ViRaj_if_3
 super.onResume(); registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr); }
    //ViRaj_fun_A_07  //ViRaj_fun_A_36 //ViRaj_fun_A_23 //ViRaj_fun_A_38 //ViRaj_fun_A_32 //ViRaj_fun_A_49

}