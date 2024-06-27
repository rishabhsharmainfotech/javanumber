package com.example.myapplication.e.b;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.R;
import static com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr;
import static com.example.myapplication.e.a.cf.myReceiver_rrrrr;
//ViRaj_imports

public class activity_result_chart extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_43 //ViRaj_fun_A_31 //ViRaj_fun_A_44 //ViRaj_fun_A_19 //ViRaj_fun_A_23 //ViRaj_fun_A_24 //ViRaj_fun_A_28 //ViRaj_fun_A_22
    private WebView webView_rrrrr;
    //ViRaj_fun_A_14 //ViRaj_fun_A_49
    private ProgressBar progressBar_rrrrr;
    //ViRaj_fun_A_47 //ViRaj_fun_A_33
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_08 //ViRaj_fun_A_18
    private MaterialTextView dataConText_rrrrr;
    private String cUrl_rrrrr;
    private MaterialToolbar toolbar_rrrrr;
    //ViRaj_fun_A_11 //ViRaj_fun_A_04

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_chart);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.status_bar_color_rrrrr));
        intVariables(); //ViRaj_if_6

        loadData(); //ViRaj_if_6

        listeners();
    }
    //ViRaj_fun_A_50 //ViRaj_fun_A_01 //ViRaj_fun_A_41 //ViRaj_fun_A_48 //ViRaj_fun_A_03 //ViRaj_fun_A_13 //ViRaj_fun_A_30

    private void listeners() {  //ViRaj_if_3

        toolbar_rrrrr.setNavigationOnClickListener(v -> onBackPressed());
        webView_rrrrr.setWebChromeClient(new WebChromeClient() {  //ViRaj_if_3

            public void onProgressChanged(WebView view, int progress) {  //ViRaj_if_3

                if (progress == 100) {  //ViRaj_if_3

                    progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                }
            }
        });
    }
    //ViRaj_fun_A_09 //ViRaj_fun_A_05 //ViRaj_fun_A_10 //ViRaj_fun_A_38

    private void loadData() {  //ViRaj_if_3

        cf cf = new cf(dataConText_rrrrr);
        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);

        webView_rrrrr.setWebViewClient(new WebViewClint());
        webView_rrrrr.getSettings().setJavaScriptEnabled(true);
        webView_rrrrr.getSettings().setUseWideViewPort(true);
        webView_rrrrr.setWebChromeClient(new WebChromeClient());
        webView_rrrrr.getSettings().setUserAgentString("Mozilla/5.0 (Linux; Win64; x64; rv:46.0) Gecko/20100101 Firefox/68.0");
        webView_rrrrr.getSettings().setGeolocationEnabled(true);
        webView_rrrrr.getSettings().setDomStorageEnabled(true);
        webView_rrrrr.getSettings().setDatabaseEnabled(true);
        webView_rrrrr.getSettings().setSupportMultipleWindows(true);
        webView_rrrrr.getSettings().setNeedInitialFocus(true);
        webView_rrrrr.getSettings().setLoadWithOverviewMode(true);
        webView_rrrrr.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView_rrrrr.setInitialScale(100);
        webView_rrrrr.loadUrl(cUrl_rrrrr);

    }
    //ViRaj_fun_A_07 //ViRaj_fun_A_27 //ViRaj_fun_A_42 //ViRaj_fun_A_16

    @SuppressLint("SetJavaScriptEnabled")
    private void intVariables() {  //ViRaj_if_3


        toolbar_rrrrr = findViewById(R.id.rrrrr_toolbar_rrrrr); //ViRaj_if_5

        progressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5

        webView_rrrrr = findViewById(R.id.rrrrr_web_view);
        dataConText_rrrrr = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

        cUrl_rrrrr = getIntent().getStringExtra(getString(R.string.chart_rrrrr));

    }
    //ViRaj_fun_A_21 //ViRaj_fun_A_15 //ViRaj_fun_A_17 //ViRaj_fun_A_37 //ViRaj_fun_A_02

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {  //ViRaj_if_3

        if (event.getAction() == KeyEvent.ACTION_DOWN) {  //ViRaj_if_3

            if (keyCode == KeyEvent.KEYCODE_BACK) {  //ViRaj_if_3

                if (webView_rrrrr.canGoBack()) {  //ViRaj_if_3

                    webView_rrrrr.goBack();
                } else {  //ViRaj_if_5

                    finish();
                }
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
    //ViRaj_fun_A_36 //ViRaj_fun_A_20 //ViRaj_fun_A_12 //ViRaj_fun_A_25 //ViRaj_fun_A_34 //ViRaj_fun_A_46
    private static class WebViewClint extends WebViewClient { @Override public boolean shouldOverrideUrlLoading(WebView view, String url) {  //ViRaj_if_4
view.loadUrl(url);return true;}}
    @Override protected void onRestart() {  //ViRaj_if_3
super.onRestart();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    //ViRaj_fun_A_26 //ViRaj_fun_A_32
    @Override protected void onResume() {  //ViRaj_if_3
super.onResume();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    @Override protected void onPause() {  //ViRaj_if_3
super.onPause();unregisterReceiver(myReceiver_rrrrr);}
    //ViRaj_fun_A_39 //ViRaj_fun_A_29 //ViRaj_fun_A_06 //ViRaj_fun_A_35 //ViRaj_fun_A_45 //ViRaj_fun_A_40
}