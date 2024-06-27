package com.example.myapplication.e.b;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.myapplication.e.e.wa;
import com.example.myapplication.e.e.wg;
import com.example.myapplication.e.e.wh;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.d.xa;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.R;
import com.google.android.material.textview.MaterialTextView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import static com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr;
import static com.example.myapplication.e.a.cf.myReceiver_rrrrr;
import java.util.HashMap;
import java.util.Map;
//ViRaj_imports

public class activity_security_pin extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_31
    private AppCompatCheckBox cB1_rrrrr, cB2_rrrrr, cB3_rrrrr, cB4_rrrrr;
    //ViRaj_fun_A_32
    private LinearLayout btnCr_rrrrr, cBLay_rrrrr;
    //ViRaj_fun_A_14
    private Animation mShake_rrrrr;
    //ViRaj_fun_A_24
    private ProgressBar progressBar_rrrrr;
    //ViRaj_fun_A_40
    private MaterialTextView txtCr_rrrrr;
    //ViRaj_fun_A_49
    //ViRaj_fun_A_04
    //ViRaj_fun_A_29
    private Vibrator mVibrator_rrrrr;
    private MaterialTextView mDataConText_rrrrr;
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_22 //ViRaj_fun_A_46 //ViRaj_fun_A_48
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();
    ca ca_rrrrr;
    //ViRaj_fun_A_17 //ViRaj_fun_A_06 //ViRaj_fun_A_44

    @Override protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3
 super.onCreate(savedInstanceState); setContentView(R.layout.activity_security_pin); intVariables(); //ViRaj_if_6
 algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr)+getString(R.string.history_activity_rrrrr)+getString(R.string.game_data_rrrrr)); ca_rrrrr = new ca(this); loadData(); //ViRaj_if_6
 }

    //ViRaj_fun_A_15
    private void loadData() {  //ViRaj_if_3

        cf cf = new cf(mDataConText_rrrrr);
        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);
        getAppInfoMethod(this);
    }
    //ViRaj_fun_A_38
    //ViRaj_fun_A_23

    private void intVariables() {  //ViRaj_if_3


        progressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5

        cB3_rrrrr = findViewById(R.id.rrrrr_checkBox3_rrrrr);
        cB4_rrrrr = findViewById(R.id.rrrrr_checkBox4_rrrrr);
        cB1_rrrrr = findViewById(R.id.rrrrr_checkBox1_rrrrr);
        cB2_rrrrr = findViewById(R.id.rrrrr_checkBox2_rrrrr);
        btnCr_rrrrr = findViewById(R.id.rrrrr_btnClear_rrrrr);
        txtCr_rrrrr = findViewById(R.id.rrrrr_textClear_rrrrr);
        cBLay_rrrrr = findViewById(R.id.rrrrr_checkBoxLay_rrrrr);
        mDataConText_rrrrr = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

        mVibrator_rrrrr = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;

    }
    //ViRaj_fun_A_13
    public void button1(View view) {  //ViRaj_if_3
checkBoxFun("1");}
    public void button2(View view) {  //ViRaj_if_3
checkBoxFun("2");}
    //ViRaj_fun_A_09
    public void button3(View view) {  //ViRaj_if_3
checkBoxFun("3");}
    //ViRaj_fun_A_42
    public void button4(View view) {  //ViRaj_if_3
checkBoxFun("4");}
    //ViRaj_fun_A_26
    public void button5(View view) {  //ViRaj_if_3
checkBoxFun("5");}
    //ViRaj_fun_A_02
    //ViRaj_fun_A_10
    public void button6(View view) {  //ViRaj_if_3
checkBoxFun("6");}
    public void button7(View view) {  //ViRaj_if_3
checkBoxFun("7");}
    //ViRaj_fun_A_39
    public void button8(View view) {  //ViRaj_if_3
checkBoxFun("8");}
    //ViRaj_fun_A_16
    public void button9(View view) {  //ViRaj_if_3
checkBoxFun("9");}
    //ViRaj_fun_A_11 //ViRaj_fun_A_47 //ViRaj_fun_A_25 //ViRaj_fun_A_50
    public void button0(View view) {  //ViRaj_if_3
checkBoxFun("0");}
    //ViRaj_fun_A_19
    public void btnDlt(View view) {  //ViRaj_if_3

        if (cB1_rrrrr.isChecked()&& cB2_rrrrr.isChecked()&& cB3_rrrrr.isChecked()&& cB4_rrrrr.isChecked()) {  //ViRaj_if_4

            cB4_rrrrr.setChecked(false);
        }else if (cB1_rrrrr.isChecked() && cB2_rrrrr.isChecked()&& cB3_rrrrr.isChecked()&& !cB4_rrrrr.isChecked()) {  //ViRaj_if_4

            cB3_rrrrr.setChecked(false);
        }else if (cB1_rrrrr.isChecked() && cB2_rrrrr.isChecked() && !cB3_rrrrr.isChecked()&& !cB4_rrrrr.isChecked()) {  //ViRaj_if_4

            cB2_rrrrr.setChecked(false);
        }else if (cB1_rrrrr.isChecked() && !cB2_rrrrr.isChecked()&&!cB3_rrrrr.isChecked()&& !cB4_rrrrr.isChecked()) {  //ViRaj_if_4

            cB1_rrrrr.setChecked(false);
            btnCr_rrrrr.setVisibility(View.INVISIBLE);
            txtCr_rrrrr.setVisibility(View.INVISIBLE);
        }
    }
    //ViRaj_fun_A_30 //ViRaj_fun_A_37 //ViRaj_fun_A_03
    public void btnClr(View view) {  //ViRaj_if_3


        cB1_rrrrr.setChecked(false);
        cB2_rrrrr.setChecked(false);
        cB3_rrrrr.setChecked(false);
        cB4_rrrrr.setChecked(false);
        btnCr_rrrrr.setVisibility(View.INVISIBLE);
        txtCr_rrrrr.setVisibility(View.INVISIBLE);

    }
    //ViRaj_fun_A_01 //ViRaj_fun_A_28 //ViRaj_fun_A_18
    String pin1_rrrrr, pin2_rrrrr, pin3_rrrrr, pin4_rrrrr;
    public void checkBoxFun(String pin) {  //ViRaj_if_4

        if (!cB1_rrrrr.isChecked()&& !cB2_rrrrr.isChecked()&& !cB3_rrrrr.isChecked()&& !cB4_rrrrr.isChecked()) {  //ViRaj_if_4

            cB1_rrrrr.setChecked(true);
            btnCr_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            txtCr_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            pin1_rrrrr = pin;
        }else if (cB1_rrrrr.isChecked() && !cB2_rrrrr.isChecked()&& !cB3_rrrrr.isChecked()&& !cB4_rrrrr.isChecked()) {  //ViRaj_if_4

            cB2_rrrrr.setChecked(true);
            pin2_rrrrr = pin;
        }else if (cB1_rrrrr.isChecked() && cB2_rrrrr.isChecked() && !cB3_rrrrr.isChecked()&& !cB4_rrrrr.isChecked()) {  //ViRaj_if_4

            cB3_rrrrr.setChecked(true);
            pin3_rrrrr = pin;
        }else if (cB1_rrrrr.isChecked() && cB2_rrrrr.isChecked()&& cB3_rrrrr.isChecked()&& !cB4_rrrrr.isChecked()) {  //ViRaj_if_4

            cB4_rrrrr.setChecked(true);
            pin4_rrrrr = pin;
            sPinVerifyMethod(activity_security_pin.this, pin1_rrrrr + pin2_rrrrr + pin3_rrrrr + pin4_rrrrr);
        }
    }
    //ViRaj_fun_A_43
    private void sPinVerifyMethod(activity_security_pin activity_rrrrr, String pin) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","login_pin");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("pin",pin);
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        String token = JWT.create().withHeader(headerClaims_rrrrr).withPayload(payLoadClaims_rrrrr).sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        Call<wg> call = xa.getClient().signInPin(token);
        call.enqueue(new Callback<wg>() {  //ViRaj_if_3

            @Override
            public void onResponse(@NonNull Call<wg> call, @NonNull Response<wg> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4

                    wg wg = response.body();
                    if (wg.getCode().equalsIgnoreCase("505")) {  //ViRaj_if_4

                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, wg.getMessage(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }
                    if (wg.getStatus().equals(getString(R.string.success_rrrrr))) {  //ViRaj_if_4

                        ce.setSigninTkn_rrrrr(activity_rrrrr, wg.getData().getToken());
                        ce.setSigninSuccess_rrrrr(activity_rrrrr, true);
                        Intent intent = new Intent(activity_rrrrr, activity_dashboard.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        finish();
                    }else {  //ViRaj_if_5


                        cB1_rrrrr.setChecked(false);
                        cB2_rrrrr.setChecked(false);
                        cB3_rrrrr.setChecked(false);
                        cB4_rrrrr.setChecked(false);
                        mVibrator_rrrrr.vibrate(500);

                        mShake_rrrrr = AnimationUtils.loadAnimation(activity_rrrrr, R.anim.shake);
                        cBLay_rrrrr.startAnimation(mShake_rrrrr);
                        System.out.println("apigets "+ wg.getMessage());
                    }
                    progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2


                }else {  //ViRaj_if_5

                    Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NonNull Call<wg> call, @NonNull Throwable t) {  //ViRaj_if_3

                System.out.println("security pin Error "+t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });

    }


    //ViRaj_fun_A_20
    public void resetPin(View view) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","forgot_pin");
        payLoadClaims_rrrrr.put("mobile", ce.getRegistrationObject_rrrrr(activity_security_pin.this, ce.KEY_PHONE_NUMBER_rrrrr));
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        String token = JWT.create().withHeader(headerClaims_rrrrr).withPayload(payLoadClaims_rrrrr).sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        Call<wh> call = xa.getClient().forgotPin(token);
        call.enqueue(new Callback<wh>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wh> call, Response<wh> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_3

                    wh data = response.body();
                    Toast.makeText(activity_security_pin.this, data.getMessage(), Toast.LENGTH_SHORT).show();
                    if (data.getStatus().equals("success")) {  //ViRaj_if_3

                        Intent intent = new Intent(activity_security_pin.this, activity_verify_otp.class);
                        intent.putExtra(getString(R.string.verification_rrrrr), 400);
                        intent.putExtra(getString(R.string.phone_number_rrrrr), ce.getRegistrationObject_rrrrr(activity_security_pin.this, ce.KEY_PHONE_NUMBER_rrrrr));
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                    }
                } else
                    Toast.makeText(activity_security_pin.this, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }

            @Override
            public void onFailure(Call<wh> call, Throwable t) {  //ViRaj_if_3

                System.out.println("verifyUser " + t);
                Toast.makeText(activity_security_pin.this, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
        });
    }
    //ViRaj_fun_A_21 //ViRaj_fun_A_45 //ViRaj_fun_A_08
    @Override protected void onRestart() {  //ViRaj_if_3
super.onRestart();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    //ViRaj_fun_A_35
    @Override protected void onPause() {  //ViRaj_if_3
super.onPause();unregisterReceiver(myReceiver_rrrrr);}
    //ViRaj_fun_A_05
    @Override protected void onResume() {  //ViRaj_if_3
super.onResume();registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);}
    //ViRaj_fun_A_33 //ViRaj_fun_A_41 //ViRaj_fun_A_07 //ViRaj_fun_A_12
    private void getAppInfoMethod(activity_security_pin activity_rrrrr) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method","app_details");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("string","string");
        progressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        String token = JWT.create().withHeader(headerClaims_rrrrr).withPayload(payLoadClaims_rrrrr).sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        Call<wa> call = xa.getClient().getAppInfo(token);
        call.enqueue(new Callback<wa>() {  //ViRaj_if_3

            @Override
            public void onResponse(@NonNull Call<wa> call, @NonNull Response<wa> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_3

                    wa wa = response.body();
                    if (wa.getCode_rrrrr().equalsIgnoreCase("505")) {  //ViRaj_if_3

                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, wa.getMessage_rrrrr(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }
                    if (wa.getStatus_rrrrr().equalsIgnoreCase(getString(R.string.success_rrrrr))) {  //ViRaj_if_3


                        ce.setPrefrenceStrngData_rrrrr(activity_rrrrr, ce.KEY_MAR_TXT_rrrrr, wa.getData_rrrrr().getBanner_marquee_rrrrr());
                        ce.setContactUsInfo_rrrrr(activity_rrrrr, ce.KEY_PHONE_NUMBER1_rrrrr, "+91" + wa.getData_rrrrr().getContact_details_rrrrr().getMobile_no_1_rrrrr());
                        ce.setContactUsInfo_rrrrr(activity_rrrrr, ce.KEY_ADVERTISEMENT_LINK_rrrrr,   wa.getData_rrrrr().getContact_details_rrrrr().getTelegram_channel_link_rrrrr());
                        ce.setContactUsInfo_rrrrr(activity_rrrrr, ce.KEY_WHATSAP_NUMBER_rrrrr, "+91" + wa.getData_rrrrr().getContact_details_rrrrr().getWhatsapp_no_rrrrr());
                        ce.setContactUsInfo_rrrrr(activity_rrrrr, ce.KEY_RAZORPAY_LIVE_KEY_rrrrr, wa.getData_rrrrr().getContact_details_rrrrr().getEmail_1_rrrrr());
                        ce.setPosterImages_rrrrr(activity_rrrrr, ce.KEY_POSTER_IMAGES1_rrrrr, wa.getData_rrrrr().getBanner_image_rrrrr().getBanner_img_1_rrrrr());
                        ce.setPosterImages_rrrrr(activity_rrrrr, ce.KEY_POSTER_IMAGES2_rrrrr, wa.getData_rrrrr().getBanner_image_rrrrr().getBanner_img_2_rrrrr());
                        ce.setPosterImages_rrrrr(activity_rrrrr, ce.KEY_POSTER_IMAGES3_rrrrr, wa.getData_rrrrr().getBanner_image_rrrrr().getBanner_img_3_rrrrr());

                    } else
                        Toast.makeText(activity_rrrrr, wa.getMessage_rrrrr(), Toast.LENGTH_SHORT).show();
                } else {  //ViRaj_if_5

                    Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }
            @Override
            public void onFailure(Call<wa> call, Throwable t) {  //ViRaj_if_3

                progressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                System.out.println("getAppDetails error " + t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
            }
        });
    }
    //ViRaj_fun_A_27 //ViRaj_fun_A_36 //ViRaj_fun_A_34
}