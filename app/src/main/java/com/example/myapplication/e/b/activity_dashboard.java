package com.example.myapplication.e.b;

import static com.example.myapplication.e.a.cf.BroadCastStringForAction_rrrrr;
import static com.example.myapplication.e.a.cf.myReceiver_rrrrr;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.BuildConfig;
import com.example.myapplication.e.c.dl;
import com.example.myapplication.e.c.dm;
import com.example.myapplication.e.c.dn;
import com.example.myapplication.e.e.we;
import com.example.myapplication.e.e.wg;
import com.example.myapplication.e.e.ws;
import com.example.myapplication.e.a.ca;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.a.cf;
import com.example.myapplication.e.a.cc;
import com.example.myapplication.R;
import com.example.myapplication.e.d.xa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
//ViRaj_imports

public class activity_dashboard extends AppCompatActivity {

    //ViRaj_int

    //ViRaj_fun_A_01
    private MaterialToolbar mToolbar_rrrrr;
    //ViRaj_fun_A_22
    private NavigationView mNaviView_rrrrr;
    //ViRaj_fun_A_11
    private DrawerLayout mDrawerLayout_rrrrr;
    //ViRaj_fun_A_03
    public static MaterialTextView userName_rrrrr, mMobileNum_rrrrr;
    //ViRaj_fun_A_29
    private MenuItem mAddFunds_rrrrr, mWithdrawFunds_rrrrr, mWalletStatement_rrrrr, mTransferFunds_rrrrr, mWinHistory_rrrrr, mBidHistory_rrrrr, mpurseMenu_rrrrr, howToLearn_rrrrr, mGameValues_rrrrr, mCoins_rrrrr, profile_rrrrr, contactUs_rrrrr, changePassword_rrrrr, logout_rrrrr;
    //ViRaj_fun_A_19
    private ProgressBar mProgressBar_rrrrr;
    //ViRaj_fun_A_13
    private SwipeRefreshLayout refreshLayout_rrrrr;
    //ViRaj_fun_A_31
    private int mAvaPoints_rrrrr = 0;
    //ViRaj_fun_A_30
    private SwitchMaterial mNotiSwitchBtn_rrrrr;
    //ViRaj_fun_A_07
    private MaterialTextView mDataConText_rrrrr;
    //ViRaj_fun_A_06
    private IntentFilter mIntentFilter_rrrrr;
    //ViRaj_fun_A_39
    private TabLayout tabLayout_rrrrr;
    //ViRaj_fun_A_44
    public static MaterialTextView marqueText_rrrrr;
    //ViRaj_fun_A_21
    ViewPager mViewPager_rrrrr;
    //ViRaj_fun_A_36
    dm mDm_rrrrr;
    //ViRaj_fun_A_49
    static FrameLayout mViewPagFrame_rrrrr;
    //ViRaj_fun_A_27
    static FrameLayout stripLayout_rrrrr;
    //ViRaj_fun_A_02
    static LinearLayout aaa_rrrrr;
    private static RecyclerView recyView_rrrrr;
    //ViRaj_fun_A_40
    private static dl dl;
    //ViRaj_fun_A_04
    public static List<we.Data> mDataList_rrrrr = new ArrayList<>();
    //ViRaj_fun_A_47
    private static Vibrator mVibe_rrrrr;
    //ViRaj_fun_A_05
    int mCurrentPage_rrrrr = 0;
    //ViRaj_fun_A_14
    long DELAY_MS_rrrrr = 1000;
    //ViRaj_fun_A_33
    long PERIOD_MS_rrrrr = 2000;
    //ViRaj_fun_A_09
    private String[] mImages_rrrrr;
    //ViRaj_fun_A_23
    private LinearLayout whatsapp_item_rrrrr;
    //ViRaj_fun_A_35
    private static LinearLayout addpoints_item_rrrrr;
    //ViRaj_fun_A_37
    private static LinearLayout starline_item_rrrrr;
    //ViRaj_fun_A_41
    private static LinearLayout galli_diswar_item_rrrrr;
    //ViRaj_fun_A_20
    Algorithm algorithmHS_rrrrr;
    Map<String, Object> headerClaims_rrrrr = new HashMap();
    Map<String, Object> payLoadClaims_rrrrr = new HashMap();
    ca ca_rrrrr;
    //ViRaj_fun_A_10

    @SuppressLint("SimpleDateFormat")
    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ViRaj_if_3


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.status_bar_color_rrrrr));
        intVariables(); //ViRaj_if_6

        algorithmHS_rrrrr = Algorithm.HMAC256(getString(R.string.full_name_rrrrr) + getString(R.string.history_activity_rrrrr) + getString(R.string.game_data_rrrrr));
        ca_rrrrr = new ca(this);
        updateUserStatus();
        confToolbar();
        confiData(); //ViRaj_if_5

        clickListener();
        confiViewPager(mImages_rrrrr);
        cf cf = new cf(mDataConText_rrrrr);
        mIntentFilter_rrrrr = new IntentFilter();
        mIntentFilter_rrrrr.addAction(BroadCastStringForAction_rrrrr);
        Intent serviceIntent = new Intent(this, cc.class);
        startService(serviceIntent);

    }

    //ViRaj_fun_A_28
    private void confiViewPager(String[] images) {  //ViRaj_if_3


        WindowManager windowManager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;
        double imageHeight = width * 0.40;
        mViewPagFrame_rrrrr.getLayoutParams().height = (int) imageHeight;
        mDm_rrrrr = new dm(this, images);
        mViewPager_rrrrr.setAdapter(mDm_rrrrr);
        final Handler handler_rrrrr = new Handler();
        final Runnable Update_rrrrr = () -> {
            if (mCurrentPage_rrrrr == 3) {  //ViRaj_if_3

                mCurrentPage_rrrrr = 0;
            }
            mViewPager_rrrrr.setCurrentItem(mCurrentPage_rrrrr++, true);
        };
        Timer mTimer = new Timer();
        mTimer.schedule(new TimerTask() {  //ViRaj_if_3
            @Override
            public void run() {  //ViRaj_if_3

                handler_rrrrr.post(Update_rrrrr);
            }
        }, DELAY_MS_rrrrr, PERIOD_MS_rrrrr);

    }

    //ViRaj_fun_A_24
    private void clickListener() {  //ViRaj_if_3


        refreshLayout_rrrrr.setOnRefreshListener(() -> {
            if (cc.isOnline_rrrrr(activity_dashboard.this)) {  //ViRaj_if_4
                checkUserStatusMethod();
                getGameListMethod(activity_dashboard.this);
                getUserInfoMethod(activity_dashboard.this, ce.getLoginInToken_rrrrr(activity_dashboard.this));
            } else
                Toast.makeText(activity_dashboard.this, "Check Your Internet Connection", Toast.LENGTH_SHORT).show();
        });
        mNotiSwitchBtn_rrrrr.setOnCheckedChangeListener((buttonView, isChecked) -> ce.setBinalData_rrrrr(activity_dashboard.this, ce.KEY_FIREBSE_ALLOW_rrrrr, isChecked));
        mToolbar_rrrrr.setOnMenuItemClickListener(item -> {
            if (item.getItemId() == R.id.rrrrr_purse_rrrrr || item.getItemId() == R.id.rrrrr_coins_rrrrr) {  //ViRaj_if_4
                Intent intent = new Intent(this, activity_wallet_statement.class);
                startActivity(intent);
            }
            return false;
        });
        whatsapp_item_rrrrr.setOnClickListener(v -> {
            String msg = "Hello Sir !!\n\nMy Name is " + ce.getPrfrnceinfo_rrrrr(activity_dashboard.this, ce.KEY_USER_NAME_rrrrr) + ".\nMy Mobile Number is " + ce.getPrfrnceinfo_rrrrr(activity_dashboard.this, ce.KEY_PHONE_NUMBER_rrrrr) + ".";
            String url = "https://api.whatsapp.com/send?phone=" + ce.getContactObject_rrrrr(activity_dashboard.this, ce.KEY_WHATSAP_NUMBER_rrrrr) + "&text=" + msg;
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
        starline_item_rrrrr.setOnClickListener(view -> {
            Intent intent = new Intent(activity_dashboard.this, activity_starline_home.class);
            startActivity(intent);
        });
        addpoints_item_rrrrr.setOnClickListener(view -> {
            Intent intent0 = new Intent(activity_dashboard.this, activity_add_funds.class);
            startActivity(intent0);
        });
        galli_diswar_item_rrrrr.setOnClickListener(view -> {
            Intent intent = new Intent(activity_dashboard.this, activity_security_pin_for_withdraw.class);
            startActivity(intent);
        });

    }

    //ViRaj_fun_A_43
    private void confiData() {  //ViRaj_if_3
        if (cc.isOnline_rrrrr(this)) {  //ViRaj_if_4
            checkUserStatusMethod();
            getGameListMethod(activity_dashboard.this);
            getUserInfoMethod(activity_dashboard.this, ce.getLoginInToken_rrrrr(activity_dashboard.this));
        } else Toast.makeText(this, "Check Your Internet Connection", Toast.LENGTH_SHORT).show();
    }

    //ViRaj_fun_A_32
    private void intVariables() {  //ViRaj_if_3


        mDrawerLayout_rrrrr = findViewById(R.id.rrrrr_drawerLayout_rrrrr);
        mToolbar_rrrrr = findViewById(R.id.rrrrr_toolbar_rrrrr); //ViRaj_if_5

        mNaviView_rrrrr = findViewById(R.id.rrrrr_navigationView_rrrrr);
        refreshLayout_rrrrr = findViewById(R.id.rrrrr_swipe_ref_lyt_rrrrr);
        mProgressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5

        mDataConText_rrrrr = findViewById(R.id.rrrrr_dataConText_rrrrr); //ViRaj_if_5

        tabLayout_rrrrr = findViewById(R.id.rrrrr_tabs_rrrrr);
        dn dn = new dn(getSupportFragmentManager());
        mNaviView_rrrrr.setItemIconTintList(null);
        userName_rrrrr = mNaviView_rrrrr.getHeaderView(0).findViewById(R.id.rrrrr_userDName_rrrrr);
        mMobileNum_rrrrr = mNaviView_rrrrr.getHeaderView(0).findViewById(R.id.rrrrr_mobile_nav_num_rrrrr);
        mNotiSwitchBtn_rrrrr = mNaviView_rrrrr.getHeaderView(0).findViewById(R.id.rrrrr_notiSwitchBtn_rrrrr);
        mAddFunds_rrrrr = mNaviView_rrrrr.getMenu().findItem(R.id.rrrrr_addFunds_rrrrr);
        mWithdrawFunds_rrrrr = mNaviView_rrrrr.getMenu().findItem(R.id.rrrrr_withdrawPoints_rrrrr);
        mWalletStatement_rrrrr = mNaviView_rrrrr.getMenu().findItem(R.id.rrrrr_walletStatement_rrrrr);
        mTransferFunds_rrrrr = mNaviView_rrrrr.getMenu().findItem(R.id.rrrrr_transferPoints_rrrrr);
        mWinHistory_rrrrr = mNaviView_rrrrr.getMenu().findItem(R.id.rrrrr_winHistory_rrrrr);
        mBidHistory_rrrrr = mNaviView_rrrrr.getMenu().findItem(R.id.rrrrr_bidHistory_rrrrr);
        mpurseMenu_rrrrr = mToolbar_rrrrr.getMenu().findItem(R.id.rrrrr_purse_rrrrr);
        mCoins_rrrrr = mToolbar_rrrrr.getMenu().findItem(R.id.rrrrr_coins_rrrrr);
        howToLearn_rrrrr = mNaviView_rrrrr.getMenu().findItem(R.id.rrrrr_how_to_learn_rrrrr);
        mGameValues_rrrrr = mNaviView_rrrrr.getMenu().findItem(R.id.rrrrr_game_values_rrrrr);
        userName_rrrrr.setText(ce.getRegistrationObject_rrrrr(this, ce.KEY_USER_NAME_rrrrr));
        mMobileNum_rrrrr.setText(ce.getRegistrationObject_rrrrr(this, ce.KEY_PHONE_NUMBER_rrrrr));
        mNotiSwitchBtn_rrrrr.setChecked(ce.getBinalObject_rrrrr(this, ce.KEY_FIREBSE_ALLOW_rrrrr, true));
        profile_rrrrr = mNaviView_rrrrr.getMenu().findItem(R.id.rrrrr_seeFullProfile_rrrrr);
        contactUs_rrrrr = mNaviView_rrrrr.getMenu().findItem(R.id.rrrrr_contactUs_rrrrr);
        changePassword_rrrrr = mNaviView_rrrrr.getMenu().findItem(R.id.rrrrr_changePassword_rrrrr);
        logout_rrrrr = mNaviView_rrrrr.getMenu().findItem(R.id.rrrrr_logout_rrrrr);
        mViewPager_rrrrr = findViewById(R.id.rrrrr_mViewPager_rrrrr);
        mViewPagFrame_rrrrr = findViewById(R.id.rrrrr_mViewPagerFrame_rrrrr);
        recyView_rrrrr = findViewById(R.id.rrrrr_recyclerView_rrrrr);
        marqueText_rrrrr = findViewById(R.id.rrrrr_text_marque_rrrrr);
        mProgressBar_rrrrr = findViewById(R.id.rrrrr_progressBar_rrrrr); //ViRaj_if_5

        stripLayout_rrrrr = findViewById(R.id.rrrrr_stripLayout_rrrrr);
        whatsapp_item_rrrrr = findViewById(R.id.rrrrr_whatsapp_item_rrrrr);
        addpoints_item_rrrrr = findViewById(R.id.rrrrr_addpoints_item_rrrrr);
        starline_item_rrrrr = findViewById(R.id.rrrrr_starline_item_rrrrr);
        galli_diswar_item_rrrrr = findViewById(R.id.rrrrr_galli_item_rrrrr);
        aaa_rrrrr = findViewById(R.id.rrrrr_aaa_rrrrr);
        marqueText_rrrrr.setText(ce.getPrfrnceinfo_rrrrr(activity_dashboard.this, ce.KEY_MAR_TXT_rrrrr));
        marqueText_rrrrr.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        marqueText_rrrrr.setSelected(true);
        marqueText_rrrrr.setSingleLine(true);
        marqueText_rrrrr.setMarqueeRepeatLimit(-1);
        mVibe_rrrrr = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        mImages_rrrrr = new String[]{ce.getPosterImage_rrrrr(activity_dashboard.this, ce.KEY_POSTER_IMAGES1_rrrrr), ce.getPosterImage_rrrrr(activity_dashboard.this, ce.KEY_POSTER_IMAGES2_rrrrr), ce.getPosterImage_rrrrr(activity_dashboard.this, ce.KEY_POSTER_IMAGES3_rrrrr)};

        if (ce.getSharedBooleanStatus_rrrrr(this, ce.KEY_DEVELOPER_MODE_rrrrr)) {  //ViRaj_if_4


            mToolbar_rrrrr.setTitleCentered(true);  //ViRaj_if_2

            mToolbar_rrrrr.setTitle(getString(R.string.app_name_rrrrr));
            profile_rrrrr.setVisible(false); //ViRaj_if_1

            contactUs_rrrrr.setVisible(false); //ViRaj_if_1

            changePassword_rrrrr.setVisible(false); //ViRaj_if_1

            logout_rrrrr.setTitle("Exit App");
            userName_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            mMobileNum_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2


        } else {  //ViRaj_if_5


            mToolbar_rrrrr.setTitleCentered(false);
            profile_rrrrr.setVisible(true);  //ViRaj_if_2

            contactUs_rrrrr.setVisible(true);  //ViRaj_if_2

            changePassword_rrrrr.setVisible(true);  //ViRaj_if_2

            logout_rrrrr.setTitle(getString(R.string.signout_rrrrr));
            userName_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            mMobileNum_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        }
    }

    //ViRaj_fun_A_12
    @Override
    protected void onResume() {  //ViRaj_if_3
        super.onResume();
        registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);
        checkUserStatusMethod();
    }

    //ViRaj_fun_A_45
    private void checkUserStatusMethod() {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method", "user_status");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("string", "string");
        String token = JWT.create().withHeader(headerClaims_rrrrr).withPayload(payLoadClaims_rrrrr).sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        refreshLayout_rrrrr.setRefreshing(true);

        Call<ws> call = xa.getClient().Customer_status(token);
        call.enqueue(new Callback<ws>() {  //ViRaj_if_3

            @Override
            public void onResponse(@NonNull Call<ws> call, @NonNull Response<ws> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4

                    ws ws = response.body();
                    if (ws.getCode().equalsIgnoreCase("505")) {  //ViRaj_if_4


                        ce.setCleaninfo_rrrrr(activity_dashboard.this);
                        Toast.makeText(activity_dashboard.this, ws.getMessage(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_dashboard.this, activity_sign_in.class);
                        startActivity(intent);
                        finish();

                    }
                    if (ws.getStatus().equalsIgnoreCase(getString(R.string.success_rrrrr))) {  //ViRaj_if_4


                        ce.setUserCoins_rrrrr(activity_dashboard.this, ws.getData().getAvailablePoints());
                        ce.setTransmitCoins_rrrrr(activity_dashboard.this, ws.getData().getTransferPoint().equalsIgnoreCase("1"));
                        ce.setAddAmountUPI_rrrrr(activity_dashboard.this, ce.KEY_ADD_COINS_BHIM_ID_rrrrr, ws.getData().getUpiPaymentId());
                        ce.setAddAmountUPI_rrrrr(activity_dashboard.this, ce.KEY_ADD_COINS_BHIM_NAME_rrrrr, ws.getData().getUpiName());
                        ce.setAddAmountUPI_rrrrr(activity_dashboard.this, ce.KEY_PAYMENT_OPTION_rrrrr, ws.getData().getPaymentOptionActive());
                        ce.setAddAmountUPI_rrrrr(activity_dashboard.this, ce.KEY_UPI_MESSAGE_rrrrr, ws.getData().getUpiMessage());
                        ce.setMaxMinData_rrrrr(activity_dashboard.this, ce.KEY_MAX_ADD_AMOUNT_COINS_rrrrr, ws.getData().getMaximumDeposit());
                        ce.setMaxMinData_rrrrr(activity_dashboard.this, ce.KEY_MIN_ADD_AMOUNT_COINS_rrrrr, ws.getData().getMinimumDeposit());
                        ce.setMaxMinData_rrrrr(activity_dashboard.this, ce.KEY_MAX_EXTRACT_COINS_rrrrr, ws.getData().getMaximumWithdraw());
                        ce.setMaxMinData_rrrrr(activity_dashboard.this, ce.KEY_MIN_EXTRACT_COINS_rrrrr, ws.getData().getMinimumWithdraw());
                        ce.setMaxMinData_rrrrr(activity_dashboard.this, ce.KEY_MAX_OFFER_SUM_rrrrr, ws.getData().getMaximumBidAmount());
                        ce.setMaxMinData_rrrrr(activity_dashboard.this, ce.KEY_MIN_OFFER_SUM_rrrrr, ws.getData().getMinimumBidAmount());
                        ce.setMaxMinData_rrrrr(activity_dashboard.this, ce.KEY_MAX_TRANSMIT_COINS_rrrrr, ws.getData().getMaximumTransfer());
                        ce.setMaxMinData_rrrrr(activity_dashboard.this, ce.KEY_MIN_TRANSMIT_COINS_rrrrr, ws.getData().getMinimumTransfer());
                        mAvaPoints_rrrrr = Integer.parseInt(ws.getData().getAvailablePoints());
                        setToolBarTitle(mAvaPoints_rrrrr);

                    }
                    ce.setLiveUser_rrrrr(activity_dashboard.this, ws.getStatus().equalsIgnoreCase("success"));
                    updateUserStatus();
                } else {  //ViRaj_if_5

                    Toast.makeText(activity_dashboard.this, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                refreshLayout_rrrrr.setRefreshing(false);
            }

            @Override
            public void onFailure(Call<ws> call, Throwable t) {  //ViRaj_if_3


                Toast.makeText(activity_dashboard.this, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();
                System.out.println("user_status error " + t);
                refreshLayout_rrrrr.setRefreshing(false);

            }
        });
    }

    //ViRaj_fun_A_16
    private void updateUserStatus() {  //ViRaj_if_3

        if (!ce.getLiveUser_rrrrr(this)) {  //ViRaj_if_4


            mAddFunds_rrrrr.setVisible(false); //ViRaj_if_1

            mWithdrawFunds_rrrrr.setVisible(false); //ViRaj_if_1

            mWalletStatement_rrrrr.setVisible(false); //ViRaj_if_1

            mTransferFunds_rrrrr.setVisible(false); //ViRaj_if_1

            mWinHistory_rrrrr.setVisible(false); //ViRaj_if_1

            mBidHistory_rrrrr.setVisible(false); //ViRaj_if_1

            mCoins_rrrrr.setVisible(false); //ViRaj_if_1

            mpurseMenu_rrrrr.setVisible(false); //ViRaj_if_1

            howToLearn_rrrrr.setVisible(false); //ViRaj_if_1

            mGameValues_rrrrr.setVisible(false); //ViRaj_if_1

            tabLayout_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            addpoints_item_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            galli_diswar_item_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            starline_item_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2


        } else {  //ViRaj_if_5


            if (ce.getTransmitCoins_rrrrr(activity_dashboard.this)) {  //ViRaj_if_4

                addpoints_item_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1
            } else {  //ViRaj_if_5

                addpoints_item_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2
            }
            mAddFunds_rrrrr.setVisible(ce.getTransmitCoins_rrrrr(activity_dashboard.this));
            mWithdrawFunds_rrrrr.setVisible(ce.getTransmitCoins_rrrrr(activity_dashboard.this));
            mWalletStatement_rrrrr.setVisible(true);  //ViRaj_if_2

            mWinHistory_rrrrr.setVisible(true);  //ViRaj_if_2

            mBidHistory_rrrrr.setVisible(true);  //ViRaj_if_2

            mCoins_rrrrr.setVisible(true);  //ViRaj_if_2

            mpurseMenu_rrrrr.setVisible(true);  //ViRaj_if_2

            howToLearn_rrrrr.setVisible(true);  //ViRaj_if_2

            mGameValues_rrrrr.setVisible(true);  //ViRaj_if_2

            galli_diswar_item_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            starline_item_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            tabLayout_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2


        }
        if (ce.getSharedBooleanStatus_rrrrr(this, ce.KEY_DEVELOPER_MODE_rrrrr)) {  //ViRaj_if_4


            mViewPagFrame_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            stripLayout_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            aaa_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2


        } else {  //ViRaj_if_5


            aaa_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            mViewPagFrame_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1

            stripLayout_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        }
    }

    //ViRaj_fun_A_50
    private void confToolbar() {  //ViRaj_if_3

        mToolbar_rrrrr.setNavigationOnClickListener(v -> mDrawerLayout_rrrrr.openDrawer(GravityCompat.START));
        mNaviView_rrrrr.setNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {  //ViRaj_if_4


                case R.id.rrrrr_home:
                    mDrawerLayout_rrrrr.closeDrawers();
                    break;
                case R.id.rrrrr_seeFullProfile_rrrrr:
                    Intent profile = new Intent(activity_dashboard.this, activity_user_profile.class);
                    startActivity(profile);
                    break;
                case R.id.rrrrr_addFunds_rrrrr:
                    Intent addfund = new Intent(activity_dashboard.this, activity_add_funds.class);
                    startActivity(addfund);
                    break;
                case R.id.rrrrr_withdrawPoints_rrrrr:
                    Intent withdrawPoints = new Intent(activity_dashboard.this, activity_security_pin_for_withdraw.class);
                    startActivity(withdrawPoints);
                    break;
                case R.id.rrrrr_walletStatement_rrrrr:
                    Intent intent = new Intent(activity_dashboard.this, activity_wallet_statement.class);
                    startActivity(intent);
                    break;
                case R.id.rrrrr_transferPoints_rrrrr:
                    if (ce.getTransmitCoins_rrrrr(activity_dashboard.this)) {  //ViRaj_if_4
                        Intent transferPoints = new Intent(activity_dashboard.this, activity_transfer_coins.class);
                        startActivity(transferPoints);
                    } else {  //ViRaj_if_5
                        Toast.makeText(activity_dashboard.this, "Transfer is not enable in your account", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.rrrrr_winHistory_rrrrr:
                    Intent winHistory = new Intent(activity_dashboard.this, activity_win_history.class);
                    winHistory.putExtra(getString(R.string.history_rrrrr), 100);
                    startActivity(winHistory);
                    break;
                case R.id.rrrrr_bidHistory_rrrrr:
                    Intent bidHistory = new Intent(activity_dashboard.this, activity_win_history.class);
                    bidHistory.putExtra(getString(R.string.history_rrrrr), 200);
                    startActivity(bidHistory);
                    break;
                case R.id.rrrrr_game_values_rrrrr:
                    Intent gameRates = new Intent(activity_dashboard.this, activity_game_rates_and_information.class);
                    gameRates.putExtra(getString(R.string.main_activity_rrrrr), 1);
                    startActivity(gameRates);
                    break;
                case R.id.rrrrr_how_to_learn_rrrrr:
                    Intent howToPlay = new Intent(activity_dashboard.this, activity_game_rates_and_information.class);
                    howToPlay.putExtra(getString(R.string.main_activity_rrrrr), 2);
                    startActivity(howToPlay);
                    break;
                case R.id.rrrrr_contactUs_rrrrr:
                    Intent contactUs = new Intent(activity_dashboard.this, activity_contact_support.class);
                    startActivity(contactUs);
                    break;
                case R.id.rrrrr_shareWithFriends:
                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra(Intent.EXTRA_TEXT, "Hello there !!\n\nCheck out this amazing and most trusted Matka App at:\n\nhttps://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID);
                    sendIntent.setType("text/plain");
                    startActivity(sendIntent);
                    break;
                case R.id.rrrrr_rateApp:
                    String url = "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID;
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                    break;
                case R.id.rrrrr_changePassword_rrrrr:
                    String[] arrayStrings = new String[]{ce.getRegistrationObject_rrrrr(activity_dashboard.this, ce.KEY_PHONE_NUMBER_rrrrr), ce.getLoginInToken_rrrrr(activity_dashboard.this)};
                    Intent changePassword = new Intent(activity_dashboard.this, activity_change_password.class);
                    changePassword.putExtra(getString(R.string.changePassword_rrrrr), 1);
                    changePassword.putExtra(getString(R.string.phone_number_rrrrr), arrayStrings);
                    startActivity(changePassword);
                    break;
                case R.id.rrrrr_logout_rrrrr:
                    LogOutDialog();
                    mDrawerLayout_rrrrr.closeDrawers();
                    break;

            }
            mDrawerLayout_rrrrr.closeDrawers();
            return true;
        });
    }

    //ViRaj_fun_A_26
    private void LogOutDialog() {  //ViRaj_if_3

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.exit_application_rrrrr));
        builder.setMessage(getString(R.string.conf_exit_rrrrr));
        builder.setNegativeButton("YES", (dialog, which) -> {
            if (ce.getSharedBooleanStatus_rrrrr(activity_dashboard.this, ce.KEY_DEVELOPER_MODE_rrrrr)) {  //ViRaj_if_4
                finishAffinity();
            } else {  //ViRaj_if_5
                Intent logOut = new Intent(activity_dashboard.this, activity_sign_in.class);
                startActivity(logOut);
                ce.setSigninSuccess_rrrrr(activity_dashboard.this, false);
            }
        });
        builder.setPositiveButton("NO", (dialog, which) -> {
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE).setTextColor(Color.BLACK);
        alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE).setTypeface(Typeface.DEFAULT_BOLD);
        alertDialog.getButton(DialogInterface.BUTTON_POSITIVE).setTextColor(Color.BLACK);
        alertDialog.getButton(DialogInterface.BUTTON_POSITIVE).setTypeface(Typeface.DEFAULT_BOLD);
        alertDialog.getWindow().setBackgroundDrawable(ContextCompat.getDrawable(activity_dashboard.this, R.drawable.rounded_corner_white));
        alertDialog.getWindow().setLayout(900, LinearLayout.LayoutParams.WRAP_CONTENT);

    }

    //ViRaj_fun_A_48 //ViRaj_fun_A_17 //ViRaj_fun_A_38
    private void getUserInfoMethod(activity_dashboard activity_rrrrr, String token) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method", "get_user_details");
        headerClaims_rrrrr.put("token", token);
        payLoadClaims_rrrrr.put("string", "");
        String token0 = JWT.create().withHeader(headerClaims_rrrrr).withPayload(payLoadClaims_rrrrr).sign(algorithmHS_rrrrr);
        token0 = ca_rrrrr.appData_rrrrr(token0);
        mProgressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        Call<wg> call = xa.getClient().GetUserInfo(token0);
        call.enqueue(new Callback<wg>() {  //ViRaj_if_3

            @Override
            public void onResponse(Call<wg> call, Response<wg> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4

                    wg wg = response.body();
                    if (wg.getCode().equalsIgnoreCase("505")) {  //ViRaj_if_4


                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, wg.getMessage(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();

                    }
                    if (wg.getStatus().equalsIgnoreCase(getString(R.string.success_rrrrr))) {  //ViRaj_if_4


                        ce.setRegisterData_rrrrr(activity_rrrrr, ce.KEY_USER_NAME_rrrrr, wg.getData().getUsername());
                        ce.setRegisterData_rrrrr(activity_rrrrr, ce.KEY_PHONE_NUMBER_rrrrr, wg.getData().getMobile());
                        ce.setPrefrenceStrngData_rrrrr(activity_rrrrr, ce.KEY_CLIENT_EMAIL_rrrrr, wg.getData().getEmail());
                        ce.setBankInformation_rrrrr(activity_rrrrr, ce.KEY_BANK_USER_NAME_rrrrr, wg.getData().getAccount_holder_name());
                        ce.setBankInformation_rrrrr(activity_rrrrr, ce.KEY_B_AC_N_rrrrr, wg.getData().getBank_account_no());
                        ce.setBankInformation_rrrrr(activity_rrrrr, ce.KEY_B_IFSC_C_rrrrr, wg.getData().getIfsc_code());
                        ce.setBankInformation_rrrrr(activity_rrrrr, ce.KEY_B_N_rrrrr, wg.getData().getBank_name());
                        ce.setBankInformation_rrrrr(activity_rrrrr, ce.KEY_BRANCH_ADDRESS_rrrrr, wg.getData().getBranch_address());
                        ce.setPrefrenceStrngData_rrrrr(activity_rrrrr, ce.KEY_P_UPI_ID_rrrrr, wg.getData().getPaytm_mobile_no());
                        ce.setPrefrenceStrngData_rrrrr(activity_rrrrr, ce.KEY_PP_UPI_ID_rrrrr, wg.getData().getPhonepe_mobile_no());
                        ce.setPrefrenceStrngData_rrrrr(activity_rrrrr, ce.KEY_G_PAY_UPI_ID_rrrrr, wg.getData().getGpay_mobile_no());
                        userName_rrrrr.setText(wg.getData().getUsername());
                        mMobileNum_rrrrr.setText(wg.getData().getMobile());


                    } else
                        Toast.makeText(activity_rrrrr, wg.getMessage(), Toast.LENGTH_SHORT).show();
                } else {  //ViRaj_if_5
                    Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                mProgressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }

            @Override
            public void onFailure(Call<wg> call, Throwable t) {  //ViRaj_if_3


                mProgressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                System.out.println("getUserDetails error " + t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();

            }
        });
    }

    //ViRaj_fun_A_18
    private void setToolBarTitle(int i) {  //ViRaj_if_3


        SpannableString s = new SpannableString(String.valueOf(i));
        s.setSpan(new ForegroundColorSpan(Color.WHITE), 0, s.length(), 0);
        s.setSpan(new RelativeSizeSpan(1.50f), 0, s.length(), 0);
        s.setSpan(new StyleSpan(Typeface.BOLD), 0, s.length(), 0);
        mCoins_rrrrr.setTitle(s);

    }

    //ViRaj_fun_A_42
    @Override
    protected void onRestart() {  //ViRaj_if_3
        super.onRestart();
        registerReceiver(myReceiver_rrrrr, mIntentFilter_rrrrr);
    }

    //ViRaj_fun_A_15
    @Override
    protected void onPause() {  //ViRaj_if_3
        super.onPause();
        unregisterReceiver(myReceiver_rrrrr);
    }

    //ViRaj_fun_A_08
    @Override
    public void onBackPressed() {  //ViRaj_if_3
        if (mDrawerLayout_rrrrr.isDrawerOpen(mNaviView_rrrrr)) {  //ViRaj_if_4

            mDrawerLayout_rrrrr.closeDrawers();
            return;
        }
        finishAffinity();
    }

    //ViRaj_fun_A_34
    private void getGameListMethod(activity_dashboard activity_rrrrr) {  //ViRaj_if_3


        headerClaims_rrrrr.clear();
        payLoadClaims_rrrrr.clear();
        headerClaims_rrrrr.put("owner", getString(R.string.app_name_rrrrr));
        headerClaims_rrrrr.put("method", "main_game_list");
        headerClaims_rrrrr.put("token", ce.getLoginInToken_rrrrr(this));
        payLoadClaims_rrrrr.put("string", "string");
        String token = JWT.create().withHeader(headerClaims_rrrrr).withPayload(payLoadClaims_rrrrr).sign(algorithmHS_rrrrr);
        token = ca_rrrrr.appData_rrrrr(token);
        mProgressBar_rrrrr.setVisibility(View.VISIBLE);  //ViRaj_if_1


        Call<we> call = xa.getClient().MainTournamentList(token);
        call.enqueue(new Callback<we>() {  //ViRaj_if_3

            @Override
            public void onResponse(@NonNull Call<we> call, @NonNull Response<we> response) {  //ViRaj_if_3

                if (response.isSuccessful()) {  //ViRaj_if_4
                    we we = response.body();
                    assert we != null;

                    if (we.getCode_rrrrr().equalsIgnoreCase("505")) {  //ViRaj_if_4
                        ce.setCleaninfo_rrrrr(activity_rrrrr);
                        Toast.makeText(activity_rrrrr, we.getMessage_rrrrr(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(activity_rrrrr, activity_sign_in.class);
                        startActivity(intent);
                        finish();
                    }
                    if (we.getStatus_rrrrr().equalsIgnoreCase("success")) {  //ViRaj_if_4

                        mDataList_rrrrr = we.getData_rrrrr();
                        confRecyView(activity_rrrrr);
                    }
                    if (tabLayout_rrrrr.getSelectedTabPosition() == 0) {  //ViRaj_if_4
                    }

                } else {  //ViRaj_if_5
                    Toast.makeText(activity_rrrrr, getString(R.string.response_error_rrrrr), Toast.LENGTH_SHORT).show();
                }
                mProgressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

            }

            @Override
            public void onFailure(@NonNull Call<we> call, @NonNull Throwable t) {  //ViRaj_if_3


                mProgressBar_rrrrr.setVisibility(View.GONE);  //ViRaj_if_2

                System.out.println("game list Error " + t);
                Toast.makeText(activity_rrrrr, getString(R.string.on_api_failure_rrrrr), Toast.LENGTH_SHORT).show();

            }
        });
    }

    //ViRaj_fun_A_25
    public static void confRecyView(Context activity_rrrrr) {  //ViRaj_if_3

        dl = new dl(activity_rrrrr, (ArrayList<we.Data>) mDataList_rrrrr, (data, itemView) -> {
            if (!data.isPlay_rrrrr()) {  //ViRaj_if_4

                ObjectAnimator
                        .ofFloat(itemView, "translationX", 0, 25, -25, 25, -25, 15, -15, 6, -6, 0)
                        .setDuration(700)
                        .start();
                mVibe_rrrrr.vibrate(500);
            } else {  //ViRaj_if_5
                Intent intent = new Intent(activity_rrrrr, activity_turnament.class);
                intent.putExtra(activity_rrrrr.getString(R.string.game_rrrrr), data.getId_rrrrr());
                intent.putExtra("open", data.isOpen_rrrrr());
                activity_rrrrr.startActivity(intent);
            }
        });
        LinearLayoutManager layoutManager = new LinearLayoutManager(activity_rrrrr);
        recyView_rrrrr.setLayoutManager(layoutManager);
        recyView_rrrrr.setAdapter(dl);
    }
    //ViRaj_fun_A_46

}