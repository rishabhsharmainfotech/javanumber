package com.example.myapplication.e.a;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.util.Log;

import androidx.annotation.Nullable;

import static com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr;
//ViRaj_imports

public class cc extends Service {

    //ViRaj_int

    //ViRaj_fun_A_14 //ViRaj_fun_A_22 //ViRaj_fun_A_33 //ViRaj_fun_A_09 //ViRaj_fun_A_48 //ViRaj_fun_A_16 //ViRaj_fun_A_29 //ViRaj_fun_A_19
    @Override
    public void onCreate() {  //ViRaj_if_3
        super.onCreate();
        Log.d("", "");
    }

    //ViRaj_fun_A_05 //ViRaj_fun_A_25 //ViRaj_fun_A_15 //ViRaj_fun_A_37 //ViRaj_fun_A_47 //ViRaj_fun_A_26 //ViRaj_fun_A_44 //ViRaj_fun_A_08 //ViRaj_fun_A_13 //ViRaj_fun_A_27 //ViRaj_fun_A_41
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {  //ViRaj_if_3
        throw new UnsupportedOperationException("not yet implement");
    }

    //ViRaj_fun_A_20 //ViRaj_fun_A_36 //ViRaj_fun_A_42 //ViRaj_fun_A_31 //ViRaj_fun_A_49 //ViRaj_fun_A_38 //ViRaj_fun_A_12
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {  //ViRaj_if_3
        handler_rrrrr.post(priodicUpdate_rrrrr);
        return START_STICKY;
    }

    //ViRaj_fun_A_35 //ViRaj_fun_A_02 //ViRaj_fun_A_30 //ViRaj_fun_A_24 //ViRaj_fun_A_17 //ViRaj_fun_A_01 //ViRaj_fun_A_10 //ViRaj_fun_A_28 //ViRaj_fun_A_46 //ViRaj_fun_A_39
    public static boolean isOnline_rrrrr(Context c) {  //ViRaj_if_4
        ConnectivityManager cm = (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo ni = cm.getActiveNetworkInfo();
        return ni != null && ni.isConnectedOrConnecting();
    }

    //ViRaj_fun_A_32 //ViRaj_fun_A_04 //ViRaj_fun_A_23 //ViRaj_fun_A_03 //ViRaj_fun_A_40 //ViRaj_fun_A_43
    Handler handler_rrrrr = new Handler();
    //ViRaj_fun_A_50 //ViRaj_fun_A_21 //ViRaj_fun_A_07
    private final Runnable priodicUpdate_rrrrr = new Runnable() {  //ViRaj_if_3
        @Override
        public void run() {  //ViRaj_if_3

            handler_rrrrr.postDelayed(priodicUpdate_rrrrr, 1000 - SystemClock.elapsedRealtime() % 1000);
            Intent broadCastIntent = new Intent();
            broadCastIntent.setAction(BroadCastStringForAction_rrrrr);
            broadCastIntent.putExtra("online_status", "" + isOnline_rrrrr(cc.this));
            sendBroadcast(broadCastIntent);
        }
    };
    //ViRaj_fun_A_11  //ViRaj_fun_A_06 //ViRaj_fun_A_45 //ViRaj_fun_A_18 //ViRaj_fun_A_34

}