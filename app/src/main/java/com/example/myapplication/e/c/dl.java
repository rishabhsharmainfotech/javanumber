package com.example.myapplication.e.c;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.example.myapplication.e.b.activity_result_chart;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.e.e.we;
import com.example.myapplication.R;
import com.google.android.material.textview.MaterialTextView;
import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

import java.util.ArrayList;
//ViRaj_imports

public class dl extends RecyclerView.Adapter<dl.ViewHolder>{

    //ViRaj_int

    //ViRaj_fun_A_02 //ViRaj_fun_A_36 //ViRaj_fun_A_05 //ViRaj_fun_A_30 //ViRaj_fun_A_31 //ViRaj_fun_A_21 //ViRaj_fun_A_32
    public interface OnItemClickListener{ void onItemClick(we.Data data, View itemView);}
    Context context;
    //ViRaj_fun_A_50 //ViRaj_fun_A_04 //ViRaj_fun_A_26 //ViRaj_fun_A_47 //ViRaj_fun_A_49 //ViRaj_fun_A_33 //ViRaj_fun_A_23
    private final ArrayList<we.Data> datalArrayList;
    //ViRaj_fun_A_16 //ViRaj_fun_A_42 //ViRaj_fun_A_27 //ViRaj_fun_A_35 //ViRaj_fun_A_43 //ViRaj_fun_A_29
    private final OnItemClickListener listener;
    //ViRaj_fun_A_15 //ViRaj_fun_A_39 //ViRaj_fun_A_48 //ViRaj_fun_A_45 //ViRaj_fun_A_28 //ViRaj_fun_A_10 //ViRaj_fun_A_44 //ViRaj_fun_A_34

    public dl(Context context, ArrayList<we.Data> datalArrayList, OnItemClickListener listener) {  //ViRaj_if_3
this.context = context;this.datalArrayList = datalArrayList;this.listener = listener;}
    //ViRaj_fun_A_11 //ViRaj_fun_A_09 //ViRaj_fun_A_17 //ViRaj_fun_A_13
    @NonNull @Override public dl.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {  //ViRaj_if_3
LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());View view = layoutInflater.inflate(R.layout.turnament_layout, parent, false);return new ViewHolder(view);}
    //ViRaj_fun_A_22 //ViRaj_fun_A_14 //ViRaj_fun_A_46 //ViRaj_fun_A_40
    @Override public void onBindViewHolder(@NonNull dl.ViewHolder holder, int position) {  //ViRaj_if_3
holder.attach(datalArrayList.get(position), listener, context);}
    @Override public int getItemCount() {  //ViRaj_if_3
return datalArrayList.size();}
    //ViRaj_fun_A_38 //ViRaj_fun_A_37 //ViRaj_fun_A_41 //ViRaj_fun_A_19 //ViRaj_fun_A_18 //ViRaj_fun_A_12
    public class ViewHolder extends RecyclerView.ViewHolder {

        private final MaterialTextView eventNumber;
        private final MaterialTextView openingTime;
        private final MaterialTextView closingTime;
        private final MaterialTextView marketOpen;
        private final ShapeableImageView chartTable;
        private final ShapeableImageView eventStatus;
        private final ShimmerTextView eventType;

        public ViewHolder(@NonNull View itemView) {  //ViRaj_if_3

            super(itemView);

            eventType = itemView.findViewById(R.id.rrrrr_eventType);
            eventNumber = itemView.findViewById(R.id.rrrrr_eventNumber);
            eventStatus = itemView.findViewById(R.id.rrrrr_eventStatus);
            openingTime = itemView.findViewById(R.id.rrrrr_openingTime);
            closingTime = itemView.findViewById(R.id.rrrrr_closingTime);
            chartTable = itemView.findViewById(R.id.rrrrr_chartTable);
            marketOpen = itemView.findViewById(R.id.rrrrr_marketOpen);

            Shimmer shimmer = new Shimmer();
            shimmer.start(eventType);
        }

        public void attach(we.Data data, OnItemClickListener listener, Context context) {  //ViRaj_if_3

            if (!ce.getLiveUser_rrrrr(context)) {  //ViRaj_if_4

                eventStatus.setImageResource(R.drawable.chart_icon);
                eventStatus.setOnClickListener(v -> {
                    Intent intent = new Intent(context, activity_result_chart.class);
                    intent.putExtra(context.getString(R.string.chart_rrrrr), data.getChart_url_rrrrr());
                    context.startActivity(intent);
                });
                marketOpen.setVisibility(View.GONE);  //ViRaj_if_2


            }else {  //ViRaj_if_5

                marketOpen.setVisibility(View.VISIBLE);  //ViRaj_if_1

                if (data.isMarket_open_rrrrr() && data.isPlay_rrrrr()) {  //ViRaj_if_4

                    //Animation  rotate = AnimationUtils.loadAnimation(context, R.anim.rotate);
                    //eventStatus.startAnimation(rotate);
                    eventStatus.setImageResource(R.drawable.play_icon);
                    marketOpen.setText("Running");
                    //marketOpen.setBackgroundColor(ContextCompat.getColor(context, R.color.white_rrrrr));
                    marketOpen.setTextColor(ContextCompat.getColor(context, R.color.green_rrrrr));

                }else {  //ViRaj_if_5


                    eventStatus.setImageResource(R.drawable.close_icon);
                    marketOpen.setText("Closed");
                    //marketOpen.setBackgroundColor(ContextCompat.getColor(context, R.color.white_rrrrr));
                    marketOpen.setTextColor(ContextCompat.getColor(context, R.color.red_rrrrr));

                }
                userDataMethod(data);
            }

            eventType.setText(data.getName_rrrrr());
            openingTime.setText(data.getOpen_time_rrrrr());
            closingTime.setText(data.getClose_time_rrrrr());
            eventNumber.setText(data.getResult_rrrrr());
            itemView.setOnClickListener(v ->{if(ce.getLiveUser_rrrrr(context)) {  //ViRaj_if_4
listener.onItemClick(data, v);}});
            chartTable.setOnClickListener(v -> {Intent intent = new Intent(context, activity_result_chart.class);intent.putExtra(context.getString(R.string.chart_rrrrr), data.getChart_url_rrrrr());context.startActivity(intent);});

        }

        private void userDataMethod(we.Data data) {  //ViRaj_if_3


            eventType.setText(data.getName_rrrrr());
            openingTime.setText(data.getOpen_time_rrrrr());
            closingTime.setText(data.getClose_time_rrrrr());
            eventNumber.setText(data.getResult_rrrrr());

            if (data.isMarket_open_rrrrr() && data.isPlay_rrrrr()) {  //ViRaj_if_4

                //Animation  rotate = AnimationUtils.loadAnimation(context, R.anim.rotate);

                //eventStatus.startAnimation(rotate);
                eventStatus.setImageResource(R.drawable.play_icon);
                marketOpen.setText("Running");
                //marketOpen.setBackgroundColor(ContextCompat.getColor(context, R.color.white_rrrrr));
                marketOpen.setTextColor(ContextCompat.getColor(context, R.color.green_rrrrr));

            }else {  //ViRaj_if_5


                eventStatus.setImageResource(R.drawable.close_icon);
                marketOpen.setText("Closed");
                //marketOpen.setBackgroundColor(ContextCompat.getColor(context, R.color.white_rrrrr));
                marketOpen.setTextColor(ContextCompat.getColor(context, R.color.red_rrrrr));

            }
            Animation  animation = AnimationUtils.loadAnimation(context, R.anim.move);
            eventNumber.setAnimation(animation);
        }
    }
    //ViRaj_fun_A_07 //ViRaj_fun_A_03 //ViRaj_fun_A_01 //ViRaj_fun_A_24 //ViRaj_fun_A_08 //ViRaj_fun_A_20 //ViRaj_fun_A_25 //ViRaj_fun_A_06
}
