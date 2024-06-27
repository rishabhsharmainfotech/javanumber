package com.example.myapplication.e.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.e.wj;
import com.example.myapplication.R;
import java.util.List;
//ViRaj_imports

public class dg extends RecyclerView.Adapter<dg.ViewHolder> {

    //ViRaj_int

    //ViRaj_fun_A_22 //ViRaj_fun_A_14 //ViRaj_fun_A_23 //ViRaj_fun_A_42 //ViRaj_fun_A_15 //ViRaj_fun_A_18
    public interface OnItemClickListener{ void onItemClick(int position);}
    public Context context;
    //ViRaj_fun_A_32 //ViRaj_fun_A_25 //ViRaj_fun_A_29 //ViRaj_fun_A_27 //ViRaj_fun_A_06 //ViRaj_fun_A_08 //ViRaj_fun_A_49 //ViRaj_fun_A_10
    private final List<wj> wjList;
    private final OnItemClickListener listener;
    //ViRaj_fun_A_33 //ViRaj_fun_A_38 //ViRaj_fun_A_24 //ViRaj_fun_A_44 //ViRaj_fun_A_03 //ViRaj_fun_A_45
    public dg(Context context, List<wj> wjList, OnItemClickListener listener) {  //ViRaj_if_3
this.context = context;this.wjList = wjList;this.listener = listener;}
    //ViRaj_fun_A_41 //ViRaj_fun_A_50 //ViRaj_fun_A_30 //ViRaj_fun_A_28 //ViRaj_fun_A_02 //ViRaj_fun_A_13
    @NonNull @Override public dg.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {  //ViRaj_if_3
LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());View view = layoutInflater.inflate(R.layout.playing_layout, parent, false);return new ViewHolder(view);}
    //ViRaj_fun_A_01 //ViRaj_fun_A_26 //ViRaj_fun_A_12 //ViRaj_fun_A_20 //ViRaj_fun_A_19 //ViRaj_fun_A_46 //ViRaj_fun_A_05
    @Override public void onBindViewHolder(@NonNull dg.ViewHolder holder, int position) {  //ViRaj_if_3
holder.bind(wjList.get(position),position, listener);}
    //ViRaj_fun_A_17 //ViRaj_fun_A_04 //ViRaj_fun_A_34 //ViRaj_fun_A_43 //ViRaj_fun_A_48
    @Override public int getItemCount() {  //ViRaj_if_3
return wjList.size();}
    //ViRaj_fun_A_39 //ViRaj_fun_A_31 //ViRaj_fun_A_36 //ViRaj_fun_A_37 //ViRaj_fun_A_47 //ViRaj_fun_A_21 //ViRaj_fun_A_11

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final MaterialTextView digit;
        private final MaterialTextView panna;
        private final MaterialTextView points;
        private final MaterialTextView session;
        private final MaterialTextView digitsText;
        private final MaterialTextView pannaText;
        private final LinearLayout ll_panna;
        private final LinearLayout ll_session;
        private final ShapeableImageView crossBtn;
        private final View viewSession;

        public ViewHolder(@NonNull View itemView) {  //ViRaj_if_3

            super(itemView);

            panna = itemView.findViewById(R.id.rrrrr_panna);
            digit = itemView.findViewById(R.id.rrrrr_digit);
            crossBtn = itemView.findViewById(R.id.rrrrr_crossBtn);
            session = itemView.findViewById(R.id.rrrrr_session);
            points = itemView.findViewById(R.id.rrrrr_points);
            viewSession = itemView.findViewById(R.id.rrrrr_viewSession);
            ll_session = itemView.findViewById(R.id.rrrrr_ll_session);
            pannaText = itemView.findViewById(R.id.rrrrr_pannaText);
            digitsText = itemView.findViewById(R.id.rrrrr_digitsText);
            ll_panna = itemView.findViewById(R.id.rrrrr_ll_panna);

        }

        public void bind(wj wj, int position, OnItemClickListener listener) {  //ViRaj_if_3

            points.setText(wj.getBid_points());
            session.setText(wj.getSession());
            switch (wj.getGame_type()) {  //ViRaj_if_4


                case "single_digit":  ll_panna.setVisibility(View.GONE);  //ViRaj_if_2
digitsText.setText("Single Digit"); if(wj.getSession().equalsIgnoreCase("open")) {  //ViRaj_if_4
digit.setText(wj.getOpen_digit());} else {  //ViRaj_if_2
digit.setText(wj.getClose_digit());}break;
                case "jodi_digit": ll_panna.setVisibility(View.GONE);  //ViRaj_if_2
viewSession.setVisibility(View.GONE);  //ViRaj_if_2
ll_session.setVisibility(View.GONE);  //ViRaj_if_2
digitsText.setText("Jodi Digit");String jodi = wj.getOpen_digit()+""+ wj.getClose_digit();digit.setText(jodi);break;
                case "single_panna": digitsText.setText("Single Panna");ll_panna.setVisibility(View.GONE);  //ViRaj_if_2
if(wj.getSession().equalsIgnoreCase("open")) {  //ViRaj_if_4
digit.setText(wj.getOpen_panna());} else {  //ViRaj_if_2
digit.setText(wj.getClose_panna());}break;
                case "double_panna": digitsText.setText("Double Panna");ll_panna.setVisibility(View.GONE);  //ViRaj_if_2
if(wj.getSession().equalsIgnoreCase("open")) {  //ViRaj_if_4
digit.setText(wj.getOpen_panna());} else {  //ViRaj_if_2
digit.setText(wj.getClose_panna());}break;
                case "triple_panna": digitsText.setText("Triple Panna");ll_panna.setVisibility(View.GONE);  //ViRaj_if_2
if(wj.getSession().equalsIgnoreCase("open")) {  //ViRaj_if_4
digit.setText(wj.getOpen_panna());} else {  //ViRaj_if_2
digit.setText(wj.getClose_panna());}break;
                case "half_sangam": if(wj.getSession().equalsIgnoreCase("open")) {  //ViRaj_if_4
digit.setText(wj.getOpen_digit());panna.setText(wj.getClose_panna());digitsText.setText("Open Digit");pannaText.setText("Close Panna");} else {  //ViRaj_if_2
digit.setText(wj.getOpen_panna());panna.setText(wj.getClose_digit());digitsText.setText("Open Panna");pannaText.setText("Close Digit");}break;
                case "full_sangam": digitsText.setText("Open Panna");pannaText.setText("Close Panna");viewSession.setVisibility(View.GONE);  //ViRaj_if_2
ll_session.setVisibility(View.GONE);  //ViRaj_if_2
digit.setText(wj.getOpen_panna());panna.setText(wj.getClose_panna());break;

            }
            crossBtn.setOnClickListener(v -> listener.onItemClick(position));
        }
    }
    //ViRaj_fun_A_07 //ViRaj_fun_A_16 //ViRaj_fun_A_09 //ViRaj_fun_A_40 //ViRaj_fun_A_35
}
