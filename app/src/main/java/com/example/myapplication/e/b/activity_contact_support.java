package com.example.myapplication.e.b;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textview.MaterialTextView;
import static com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr;
import static com.example.myapplication.e.a.cf.myReceiver_rrrrr;
//ViRaj_imports

public class activity_contact_support extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_19 //ViRaj_fun_A_23 //ViRaj_fun_A_24 //ViRaj_fun_A_38
    private MaterialTextView mn1_rrrrr, whatsAN_rrrrr;
    private MaterialToolbar toolbar_rrrrr;
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_48 //ViRaj_fun_A_36 //ViRaj_fun_A_42 //ViRaj_fun_A_12 //ViRaj_fun_A_20 //ViRaj_fun_A_39 //ViRaj_fun_A_45 //ViRaj_fun_A_40

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_support);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.status_bar_color_rrrrr));
        intVariables(); //ViRaj_if_6

        loadData(); //ViRaj_if_6

        toolbar_rrrrr.setNavigationOnClickListener(v -> onBackPressed());
    }
    //ViRaj_fun_A_37 //ViRaj_fun_A_47 //ViRaj_fun_A_22 //ViRaj_fun_A_50 //ViRaj_fun_A_04 //ViRaj_fun_A_32 //ViRaj_fun_A_11 //ViRaj_fun_A_33 //ViRaj_fun_A_07 //ViRaj_fun_A_09

    private void loadData() {  //ViRaj_if_3
 mIntentFilter_rrrrr = new IntentFilter(); mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr); Intent serviceIntent = new Intent(this, cc.class); startService(serviceIntent); mn1_rrrrr.setText(ce.getContactObject_rrrrr(this, ce.KEY_PHONE_NUMBER1_rrrrr)); whatsAN_rrrrr.setText(ce.getContactObject_rrrrr(this, ce.KEY_WHATSAP_NUMBER_rrrrr));}
    //ViRaj_fun_A_29 //ViRaj_fun_A_27 //ViRaj_fun_A_25 //ViRaj_fun_A_31 //ViRaj_fun_A_06 //ViRaj_fun_A_02 //ViRaj_fun_A_05
    public void phoneNum1(View view) {  //ViRaj_if_3
setClipboard(this, mn1_rrrrr.getText().toString());}
    //ViRaj_fun_A_01 //ViRaj_fun_A_26 //ViRaj_fun_A_46 //ViRaj_fun_A_44
    private void setClipboard(Context context, String text) {  //ViRaj_if_3
android.content.ClipboardManager clipboard = (android.content.ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);android.content.ClipData clip = android.content.ClipData.newPlainText("Copied Text", text);clipboard.setPrimaryClip(clip);Toast.makeText(context, "Mobile Number Copied to Clipboard", Toast.LENGTH_SHORT).show();}
    //ViRaj_fun_A_16 //ViRaj_fun_A_15 //ViRaj_fun_A_35 //ViRaj_fun_A_49 //ViRaj_fun_A_13
    public void whatsAppBtn(View view) {  //ViRaj_if_3
String url = "https://api.whatsapp.com/send?phone="+ whatsAN_rrrrr.getText();Intent i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url));startActivity(i);}
    //ViRaj_fun_A_28 //ViRaj_fun_A_03 //ViRaj_fun_A_17 //ViRaj_fun_A_21 //ViRaj_fun_A_14
    @Override protected void onRestart() {  //ViRaj_if_3
super.onRestart();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    //ViRaj_fun_A_41 //ViRaj_fun_A_30 //ViRaj_fun_A_43 //ViRaj_fun_A_18
    @Override protected void onResume() {  //ViRaj_if_3
super.onResume();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    @Override protected void onPause() {  //ViRaj_if_3
super.onPause();unregisterReceiver(myReceiver_rrrrr);}
    private void intVariables() {  //ViRaj_if_3

        toolbar_rrrrr = findViewById(R.id.rrrrr_toolbar_rrrrr); //ViRaj_if_5

        mn1_rrrrr = findViewById(R.id.rrrrr_phone_num_1_rrrrr);
        whatsAN_rrrrr = findViewById(R.id.rrrrr_whats_app_num_rrrrr);}
    //ViRaj_fun_A_10 //ViRaj_fun_A_34 //ViRaj_fun_A_08
}