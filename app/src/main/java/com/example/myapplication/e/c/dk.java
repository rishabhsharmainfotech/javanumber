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
import com.example.myapplication.e.e.wp;
import com.example.myapplication.R;
import java.util.List;
//ViRaj_imports

public class dk extends RecyclerView.Adapter<dk.ViewHolder> {

    //ViRaj_int

    //ViRaj_fun_A_50 //ViRaj_fun_A_45 //ViRaj_fun_A_37 //ViRaj_fun_A_12 //ViRaj_fun_A_19 //ViRaj_fun_A_42 //ViRaj_fun_A_20 //ViRaj_fun_A_38 //ViRaj_fun_A_43 //ViRaj_fun_A_16 //ViRaj_fun_A_49 //ViRaj_fun_A_35 //ViRaj_fun_A_08 //ViRaj_fun_A_17 //ViRaj_fun_A_28 //ViRaj_fun_A_30 //ViRaj_fun_A_07
    Context context;
    private final List<wp.Data> dataList;
    //ViRaj_fun_A_23  //ViRaj_fun_A_02 //ViRaj_fun_A_47 //ViRaj_fun_A_18 //ViRaj_fun_A_29 //ViRaj_fun_A_13
    public dk(Context context, List<wp.Data> dataList) {  //ViRaj_if_3
this.context = context;this.dataList = dataList;}
    @NonNull @Override public dk.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {  //ViRaj_if_3
LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());View view = layoutInflater.inflate(R.layout.win_history_layout, parent, false);return new ViewHolder(view);}
    //ViRaj_fun_A_10 //ViRaj_fun_A_01 //ViRaj_fun_A_21 //ViRaj_fun_A_46 //ViRaj_fun_A_11 //ViRaj_fun_A_31
    @Override public void onBindViewHolder(@NonNull dk.ViewHolder holder, int position) {  //ViRaj_if_3
wp.Data data = dataList.get(position);holder.bind(data);}
    @Override public int getItemCount() {  //ViRaj_if_3

        return dataList.size();
    }
    //ViRaj_fun_A_44 //ViRaj_fun_A_39 //ViRaj_fun_A_36 //ViRaj_fun_A_03 //ViRaj_fun_A_40 //ViRaj_fun_A_41 //ViRaj_fun_A_25 //ViRaj_fun_A_27 //ViRaj_fun_A_24 //ViRaj_fun_A_05

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final MaterialTextView gameName;
        private final MaterialTextView gameDate;
        private final MaterialTextView bidPoints;
        private final MaterialTextView winPoints;
        private final MaterialTextView gameNumberOpen;
        private final LinearLayout ll_bid_history;

        public ViewHolder(@NonNull View itemView) {  //ViRaj_if_3

            super(itemView);

            gameName = itemView.findViewById(R.id.rrrrr_gameName);
            gameDate = itemView.findViewById(R.id.rrrrr_gameDate);
            bidPoints = itemView.findViewById(R.id.rrrrr_bidPoints);
            winPoints = itemView.findViewById(R.id.rrrrr_winPoints);
            MaterialTextView session = itemView.findViewById(R.id.rrrrr_gameSession);
            gameNumberOpen = itemView.findViewById(R.id.rrrrr_gameNumberOpen);
            MaterialTextView gameNumberClose = itemView.findViewById(R.id.rrrrr_gameNumberClose);
            ll_bid_history = itemView.findViewById(R.id.rrrrr_ll_bid_history);
            winPoints.setVisibility(View.GONE);  //ViRaj_if_2

            gameNumberClose.setVisibility(View.GONE);  //ViRaj_if_2

            session.setVisibility(View.GONE);  //ViRaj_if_2


        }

        public void bind(wp.Data data) {  //ViRaj_if_3

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


                case "single_digit": gameName.setText(gameNameStr+"\n(Single Digit)");gameNumberOpen.setText("Game Number : "+data.getDigit());break;
                case "single_panna": gameName.setText(gameNameStr+"\n(Single Panna)");gameNumberOpen.setText("Game Number : "+data.getPanna());break;
                case "double_panna": gameName.setText(gameNameStr+"\n(Double Panna)");gameNumberOpen.setText("Game Number : "+data.getPanna());break;
                case "triple_panna": gameName.setText(gameNameStr+"\n(Triple Panna)");gameNumberOpen.setText("Game Number : "+data.getPanna());break;

            }
        }
    }
    //ViRaj_fun_A_26 //ViRaj_fun_A_33 //ViRaj_fun_A_06 //ViRaj_fun_A_14 //ViRaj_fun_A_34 //ViRaj_fun_A_22 //ViRaj_fun_A_32 //ViRaj_fun_A_04 //ViRaj_fun_A_15 //ViRaj_fun_A_09 //ViRaj_fun_A_48
}
