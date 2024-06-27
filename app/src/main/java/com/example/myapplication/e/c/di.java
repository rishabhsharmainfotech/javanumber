package com.example.myapplication.e.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.e.wr;
import com.example.myapplication.R;
import java.util.List;
//ViRaj_imports

public class di extends RecyclerView.Adapter<di.ViewHolder> {

    //ViRaj_int

    //ViRaj_fun_A_42 //ViRaj_fun_A_25 //ViRaj_fun_A_19 //ViRaj_fun_A_05 //ViRaj_fun_A_37 //ViRaj_fun_A_01 //ViRaj_fun_A_04 //ViRaj_fun_A_07 //ViRaj_fun_A_31
    public interface OnItemClickListener{ void onItemClick(int position);}
    Context context;
    //ViRaj_fun_A_23 //ViRaj_fun_A_02 //ViRaj_fun_A_30 //ViRaj_fun_A_32 //ViRaj_fun_A_35 //ViRaj_fun_A_46
    private final List<wr> wrList;
    //ViRaj_fun_A_27 //ViRaj_fun_A_20 //ViRaj_fun_A_34 //ViRaj_fun_A_06 //ViRaj_fun_A_50 //ViRaj_fun_A_40 //ViRaj_fun_A_11
    private final OnItemClickListener listener;
    //ViRaj_fun_A_12 //ViRaj_fun_A_17 //ViRaj_fun_A_28
    public di(Context context, List<wr> wrList, OnItemClickListener listener) {  //ViRaj_if_3
this.context = context;this.wrList = wrList;this.listener = listener;}
    @NonNull @Override public di.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {  //ViRaj_if_3
LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());View view = layoutInflater.inflate(R.layout.starline_playing_layout, parent, false);return new ViewHolder(view);}
    //ViRaj_fun_A_14 //ViRaj_fun_A_36 //ViRaj_fun_A_24 //ViRaj_fun_A_38
    @Override public void onBindViewHolder(@NonNull di.ViewHolder holder, int position) {  //ViRaj_if_3
holder.bind(wrList.get(position),position, listener);}
    @Override public int getItemCount() {  //ViRaj_if_3
return wrList.size();}
    //ViRaj_fun_A_03 //ViRaj_fun_A_18 //ViRaj_fun_A_10 //ViRaj_fun_A_49 //ViRaj_fun_A_21 //ViRaj_fun_A_26 //ViRaj_fun_A_13

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final MaterialTextView digit;
        private final MaterialTextView points;
        private final MaterialTextView digitsText;
        private final ShapeableImageView crossBtn;

        public ViewHolder(@NonNull View itemView) {  //ViRaj_if_3

            super(itemView);

            digit = itemView.findViewById(R.id.rrrrr_digit);
            points = itemView.findViewById(R.id.rrrrr_points);
            digitsText = itemView.findViewById(R.id.rrrrr_digitsText);
            crossBtn = itemView.findViewById(R.id.rrrrr_crossBtn);

        }

        public void bind(wr wr, int position, OnItemClickListener listener) {  //ViRaj_if_3

            points.setText(wr.getBid_points());
            switch (wr.getGame_type()) {  //ViRaj_if_4


                case "single_digit": digitsText.setText("Single Digit");digit.setText(wr.getDigit());break;
                case "single_panna": digitsText.setText("Single Panna");digit.setText(wr.getPanna());break;
                case "double_panna": digitsText.setText("Double Panna");digit.setText(wr.getPanna());break;
                case "triple_panna": digitsText.setText("Triple Panna");digit.setText(wr.getPanna());break;

            }
            crossBtn.setOnClickListener(v -> listener.onItemClick(position));
        }
    }
    //ViRaj_fun_A_16 //ViRaj_fun_A_09 //ViRaj_fun_A_44 //ViRaj_fun_A_39 //ViRaj_fun_A_41 //ViRaj_fun_A_45 //ViRaj_fun_A_08 //ViRaj_fun_A_29 //ViRaj_fun_A_47 //ViRaj_fun_A_33 //ViRaj_fun_A_15 //ViRaj_fun_A_22 //ViRaj_fun_A_48 //ViRaj_fun_A_43
}
