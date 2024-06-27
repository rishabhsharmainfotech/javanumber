package com.example.myapplication.e.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.e.wb;
import com.example.myapplication.R;

import java.util.List;
//ViRaj_imports

public class da extends RecyclerView.Adapter<da.ViewHolder> {

    //ViRaj_int

    //ViRaj_fun_A_09 //ViRaj_fun_A_19 //ViRaj_fun_A_40 //ViRaj_fun_A_05 //ViRaj_fun_A_28
    public interface OnItemClickListener{ void onItemClick(int position);}
    //ViRaj_fun_A_13 //ViRaj_fun_A_31 //ViRaj_fun_A_44 //ViRaj_fun_A_41
    private final List<wb> wbList;
    private final OnItemClickListener listener;
    //ViRaj_fun_A_33 //ViRaj_fun_A_21 //ViRaj_fun_A_02 //ViRaj_fun_A_26 //ViRaj_fun_A_43
    public da(Context context, List<wb> wbList, OnItemClickListener listener) {  //ViRaj_if_3
this.context = context;this.wbList = wbList;this.listener = listener; }
    Context context;
    //ViRaj_fun_A_45 //ViRaj_fun_A_29 //ViRaj_fun_A_27 //ViRaj_fun_A_42 //ViRaj_fun_A_50 //ViRaj_fun_A_47
    @NonNull @Override public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {  //ViRaj_if_3
LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());View view = layoutInflater.inflate(R.layout.starline_playing_layout, parent, false);return new ViewHolder(view);}
    //ViRaj_fun_A_07 //ViRaj_fun_A_20
    @Override public void onBindViewHolder(@NonNull ViewHolder holder, int position) {  //ViRaj_if_3
holder.bind(wbList.get(position),position, listener);}
    //ViRaj_fun_A_46 //ViRaj_fun_A_16 //ViRaj_fun_A_04 //ViRaj_fun_A_35
    @Override public int getItemCount() {  //ViRaj_if_3

        return wbList.size();
    }
    //ViRaj_fun_A_10 //ViRaj_fun_A_12 //ViRaj_fun_A_22 //ViRaj_fun_A_38 //ViRaj_fun_A_03 //ViRaj_fun_A_32 //ViRaj_fun_A_48

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final MaterialTextView digit;
        private final MaterialTextView points;
        private final MaterialTextView digitsText;
        private final ShapeableImageView crossBtn;
        public ViewHolder(@NonNull View itemView) {  //ViRaj_if_3
super(itemView);digit = itemView.findViewById(R.id.rrrrr_digit);points = itemView.findViewById(R.id.rrrrr_points);digitsText = itemView.findViewById(R.id.rrrrr_digitsText);crossBtn = itemView.findViewById(R.id.rrrrr_crossBtn);}

        public void bind(wb wb, int position, OnItemClickListener listener) {  //ViRaj_if_3

            points.setText(wb.getBid_points());
            switch (wb.getGame_type()) {  //ViRaj_if_4

                case "left_digit":
                    digitsText.setText("Left Digit");
                    digit.setText(wb.getLeft_digit());

                    break;
                case "right_digit":
                    digitsText.setText("Right Digit");
                    digit.setText(wb.getRight_digit());

                    break;
                case "jodi_digit":
                    digitsText.setText("Jodi Digit");
                    digit.setText(wb.getLeft_digit()+ wb.getRight_digit());

                    break;
            }
            crossBtn.setOnClickListener(v -> listener.onItemClick(position));
        }
    }
    //ViRaj_fun_A_11 //ViRaj_fun_A_01 //ViRaj_fun_A_14 //ViRaj_fun_A_36 //ViRaj_fun_A_18 //ViRaj_fun_A_15 //ViRaj_fun_A_37 //ViRaj_fun_A_06 //ViRaj_fun_A_30 //ViRaj_fun_A_39 //ViRaj_fun_A_25 //ViRaj_fun_A_49 //ViRaj_fun_A_34 //ViRaj_fun_A_17 //ViRaj_fun_A_23 //ViRaj_fun_A_24 //ViRaj_fun_A_08
}
