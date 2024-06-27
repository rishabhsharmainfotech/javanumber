package com.example.myapplication.e.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.material.textview.MaterialTextView;
//ViRaj_imports

public class cf {

    //ViRaj_int

    //ViRaj_fun_A_20 //ViRaj_fun_A_13 //ViRaj_fun_A_49 //ViRaj_fun_A_27 //ViRaj_fun_A_09  //ViRaj_fun_A_34 //ViRaj_fun_A_32 //ViRaj_fun_A_28  //ViRaj_fun_A_24  //ViRaj_fun_A_23 //ViRaj_fun_A_46
    //ViRaj_fun_A_40 //ViRaj_fun_A_01 //ViRaj_fun_A_16 //ViRaj_fun_A_50 //ViRaj_fun_A_17 //ViRaj_fun_A_18 //ViRaj_fun_A_44 //ViRaj_fun_A_43 //ViRaj_fun_A_22
    public static final String BroadCastStringForAction_rrrrr ="checkingInternet";
    //ViRaj_fun_A_48 //ViRaj_fun_A_45 //ViRaj_fun_A_02 //ViRaj_fun_A_03 //ViRaj_fun_A_41 //ViRaj_fun_A_39 //ViRaj_fun_A_36 //ViRaj_fun_A_14 //ViRaj_fun_A_10 //ViRaj_fun_A_26 //ViRaj_fun_A_38
    public static MaterialTextView status_rrrrr;
    //ViRaj_fun_A_08 //ViRaj_fun_A_12 //ViRaj_fun_A_42 //ViRaj_fun_A_47 //ViRaj_fun_A_06 //ViRaj_fun_A_33 //ViRaj_fun_A_19
    public cf(MaterialTextView status_rrrrr) {  //ViRaj_if_3
 cf.status_rrrrr = status_rrrrr;}
    //ViRaj_fun_A_07 //ViRaj_fun_A_11 //ViRaj_fun_A_04 //ViRaj_fun_A_29 //ViRaj_fun_A_05 //ViRaj_fun_A_30 //ViRaj_fun_A_31
    public static BroadcastReceiver myReceiver_rrrrr = new BroadcastReceiver() {  //ViRaj_if_3
 @Override public void onReceive(Context context_rrrrr, Intent intent_rrrrr) {  //ViRaj_if_3
 if (intent_rrrrr.getAction().equals(BroadCastStringForAction_rrrrr)) {  //ViRaj_if_3
if (intent_rrrrr.getStringExtra("online_status").equals("true")) {  //ViRaj_if_4
 status_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2
} else status_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1
}}};
    //ViRaj_fun_A_37 //ViRaj_fun_A_25 //ViRaj_fun_A_21 //ViRaj_fun_A_15 //ViRaj_fun_A_35

}
