package com.example.myapplication.e.c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.e.wl;
import com.example.myapplication.R;
import java.util.List;
//ViRaj_imports

public class dp extends RecyclerView.Adapter<dp.ViewHolder> {

    //ViRaj_int

    //ViRaj_fun_A_19 //ViRaj_fun_A_47 //ViRaj_fun_A_11 //ViRaj_fun_A_03 //ViRaj_fun_A_32 //ViRaj_fun_A_12 //ViRaj_fun_A_46 //ViRaj_fun_A_14 //ViRaj_fun_A_10 //ViRaj_fun_A_38 //ViRaj_fun_A_18 //ViRaj_fun_A_37 //ViRaj_fun_A_21 //ViRaj_fun_A_26
    Context context;
    private final List<wl.Data> dataList;
    //ViRaj_fun_A_42 //ViRaj_fun_A_09 //ViRaj_fun_A_50 //ViRaj_fun_A_49 //ViRaj_fun_A_15 //ViRaj_fun_A_25 //ViRaj_fun_A_30 //ViRaj_fun_A_29 //ViRaj_fun_A_06 //ViRaj_fun_A_44 //ViRaj_fun_A_16
    public dp(Context context, List<wl.Data> dataList) {  //ViRaj_if_3
this.context = context;this.dataList = dataList;}
    @NonNull @Override public dp.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {  //ViRaj_if_3
LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());View view = layoutInflater.inflate(R.layout.win_history_layout, parent, false);return new ViewHolder(view);}
    //ViRaj_fun_A_01 //ViRaj_fun_A_08 //ViRaj_fun_A_07 //ViRaj_fun_A_23 //ViRaj_fun_A_24
    @Override public void onBindViewHolder(@NonNull dp.ViewHolder holder, int position) {  //ViRaj_if_3
wl.Data data = dataList.get(position);holder.attach(data);}
    //ViRaj_fun_A_48 //ViRaj_fun_A_20 //ViRaj_fun_A_40 //ViRaj_fun_A_43 //ViRaj_fun_A_05 //ViRaj_fun_A_39 //ViRaj_fun_A_31
    @Override public int getItemCount() {  //ViRaj_if_3
return dataList.size();}
    //ViRaj_fun_A_13 //ViRaj_fun_A_36 //ViRaj_fun_A_27 //ViRaj_fun_A_28 //ViRaj_fun_A_02 //ViRaj_fun_A_22 //ViRaj_fun_A_34

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final MaterialTextView gameName;
        private final MaterialTextView gameSession;
        private final MaterialTextView gameNumberOpen;
        private final MaterialTextView gameDate;
        private final MaterialTextView bidPoints;
        private final MaterialTextView winPoints;
        private final MaterialTextView gameNumberClose;
        private final LinearLayout ll_bid_history;

        public ViewHolder(@NonNull View itemView) {  //ViRaj_if_3

            super(itemView);

            gameName = itemView.findViewById(R.id.rrrrr_gameName);
            gameSession = itemView.findViewById(R.id.rrrrr_gameSession);
            gameNumberOpen = itemView.findViewById(R.id.rrrrr_gameNumberOpen);
            gameDate = itemView.findViewById(R.id.rrrrr_gameDate);
            bidPoints = itemView.findViewById(R.id.rrrrr_bidPoints);
            winPoints = itemView.findViewById(R.id.rrrrr_winPoints);
            gameNumberClose = itemView.findViewById(R.id.rrrrr_gameNumberClose);
            ll_bid_history = itemView.findViewById(R.id.rrrrr_ll_bid_history);
            winPoints.setVisibility(View.GONE);  //ViRaj_if_2

            gameNumberClose.setVisibility(View.GONE);  //ViRaj_if_2


        }

        public void attach(wl.Data data) {  //ViRaj_if_3

            String gameNameStr = data.getGameName();
            bidPoints.setText(data.getBidPoints()+" Points");
            gameDate.setText(data.getBiddedAt());
            ll_bid_history.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(context,R.color.teal_200_rrrrr)));
            if(!TextUtils.isEmpty(data.getWinPoints())) {  //ViRaj_if_4

                ll_bid_history.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(context,R.color.green_rrrrr)));
                winPoints.setText(data.getWinPoints()+" Points");
                winPoints.setVisibility(View.VISIBLE);  //ViRaj_if_1

                gameDate.setText(data.getWonAt());
            }
            switch (data.getGameType()) {  //ViRaj_if_4


                case "single_digit":  gameName.setText(gameNameStr+"\n(Single Digit)");gameNumberClose.setVisibility(View.GONE);  //ViRaj_if_2
if(data.getSession().equalsIgnoreCase("open")) {  //ViRaj_if_4
gameSession.setText("Session : OPEN");gameNumberOpen.setText("Open Digit : "+data.getOpenDigit());} else {  //ViRaj_if_2
gameSession.setText("Session : CLOSE");gameNumberOpen.setText("Close Digit : "+data.getCloseDigit()); } break;
                case "jodi_digit": gameNumberClose.setVisibility(View.GONE);  //ViRaj_if_2
gameName.setText(gameNameStr+"\n(Jodi Digit)");gameSession.setText("Session : OPEN");String jodi = "Jodi Digit : "+data.getOpenDigit()+""+data.getCloseDigit();gameNumberOpen.setText(jodi);break;
                case "single_panna": gameNumberClose.setVisibility(View.GONE);  //ViRaj_if_2
gameName.setText(gameNameStr+"\n(Single Panna)");if(data.getSession().equalsIgnoreCase("open")) {  //ViRaj_if_4
gameSession.setText("Session : OPEN");gameNumberOpen.setText("Open Panna : "+data.getOpenPanna());} else {  //ViRaj_if_2
gameSession.setText("Session : CLOSE");gameNumberOpen.setText("Close Panna : "+data.getClosePanna());}break;
                case "double_panna":  gameName.setText(gameNameStr+"\n(Double Panna)");gameNumberClose.setVisibility(View.GONE);  //ViRaj_if_2
if(data.getSession().equalsIgnoreCase("open")) {  //ViRaj_if_4
gameSession.setText("Session : OPEN");gameNumberOpen.setText("Open Panna : "+data.getOpenPanna());} else {  //ViRaj_if_2
gameSession.setText("Session : CLOSE");gameNumberOpen.setText("Close Panna : "+data.getClosePanna());}break;
                case "triple_panna": gameName.setText(gameNameStr+"\n(Triple Panna)");gameNumberClose.setVisibility(View.GONE);  //ViRaj_if_2
if(data.getSession().equalsIgnoreCase("open")) {  //ViRaj_if_4
gameSession.setText("Session : OPEN");gameNumberOpen.setText("Open Panna : "+data.getOpenPanna());} else {  //ViRaj_if_2
gameSession.setText("Session : CLOSE");gameNumberOpen.setText("Close Panna : "+data.getClosePanna());}break;
                case "half_sangam": gameName.setText(gameNameStr+"\n(Half Sangam)");if(data.getSession().equalsIgnoreCase("open")) {  //ViRaj_if_4
gameSession.setText("Session : OPEN");gameNumberOpen.setText("Open Digit : "+data.getOpenDigit());gameNumberClose.setText("Close Panna : "+data.getClosePanna());gameNumberClose.setVisibility(View.VISIBLE);  //ViRaj_if_1
} else {  //ViRaj_if_2
gameSession.setText("Session : Close");gameNumberOpen.setText("Open Panna : "+data.getOpenPanna());gameNumberClose.setText("Close Digit : "+data.getCloseDigit());gameNumberClose.setVisibility(View.VISIBLE);  //ViRaj_if_1
}break;
                case "full_sangam": gameName.setText(gameNameStr+"\n(Full Sangam)");gameSession.setText("Session : OPEN");gameNumberOpen.setText("Open Panna : "+data.getOpenPanna());gameNumberClose.setText("Close Panna : "+data.getClosePanna());gameNumberClose.setVisibility(View.VISIBLE);  //ViRaj_if_1
break;

            }
        }
    }
    //ViRaj_fun_A_33 //ViRaj_fun_A_04 //ViRaj_fun_A_17 //ViRaj_fun_A_41 //ViRaj_fun_A_45 //ViRaj_fun_A_35
}
