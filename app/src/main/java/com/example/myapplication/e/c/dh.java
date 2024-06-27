package com.example.myapplication.e.c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.e.e.wm;
import com.example.myapplication.R;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
//ViRaj_imports

public class dh extends RecyclerView.Adapter<dh.ViewHolder> {

    //ViRaj_int

    //ViRaj_fun_A_48 //ViRaj_fun_A_47 //ViRaj_fun_A_18 //ViRaj_fun_A_33 //ViRaj_fun_A_10 //ViRaj_fun_A_21 //ViRaj_fun_A_19 //ViRaj_fun_A_43 //ViRaj_fun_A_42
    Context context;
    private final List<wm.Data.Statement> modelWalletArrayList;
    //ViRaj_fun_A_34 //ViRaj_fun_A_20 //ViRaj_fun_A_25 //ViRaj_fun_A_22
    public dh(Context context, List<wm.Data.Statement> modelWalletArrayList) {  //ViRaj_if_3
this.context = context;this.modelWalletArrayList = modelWalletArrayList;}
    @NonNull @Override public dh.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {  //ViRaj_if_3
LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());View view = layoutInflater.inflate(R.layout.purse_layout, parent, false);return new ViewHolder(view);}
    //ViRaj_fun_A_04 //ViRaj_fun_A_27 //ViRaj_fun_A_49 //ViRaj_fun_A_32 //ViRaj_fun_A_41
    @Override public void onBindViewHolder(@NonNull dh.ViewHolder holder, int position) {  //ViRaj_if_3
wm.Data.Statement statement = modelWalletArrayList.get(position);holder.attach(statement);}
    //ViRaj_fun_A_08 //ViRaj_fun_A_03 //ViRaj_fun_A_29 //ViRaj_fun_A_23 //ViRaj_fun_A_17 //ViRaj_fun_A_50 //ViRaj_fun_A_30 //ViRaj_fun_A_40 //ViRaj_fun_A_14 //ViRaj_fun_A_01 //ViRaj_fun_A_35
    @Override public int getItemCount() {  //ViRaj_if_3
return modelWalletArrayList.size();}
    //ViRaj_fun_A_38 //ViRaj_fun_A_07 //ViRaj_fun_A_12 //ViRaj_fun_A_02 //ViRaj_fun_A_31 //ViRaj_fun_A_46 //ViRaj_fun_A_26 //ViRaj_fun_A_39
    public class ViewHolder extends RecyclerView.ViewHolder {

        private final MaterialTextView bonusName;
        private final MaterialTextView amount;
        private final MaterialTextView dateTime;
        private final MaterialTextView tranStatus;
        private final LinearLayout ll_wallet;

        public ViewHolder(@NonNull View itemView) {  //ViRaj_if_3

            super(itemView);

            bonusName = itemView.findViewById(R.id.rrrrr_bonusName);
            amount = itemView.findViewById(R.id.rrrrr_coins_rrrrr);
            dateTime = itemView.findViewById(R.id.rrrrr_dateTime);
            ll_wallet = itemView.findViewById(R.id.rrrrr_ll_wallet);
            tranStatus = itemView.findViewById(R.id.rrrrr_tranStatus);

        }

        public void attach(wm.Data.Statement recyclerModelWallet) {  //ViRaj_if_3

            bonusName.setText(recyclerModelWallet.getTransMsg());
            tranStatus.setText(recyclerModelWallet.getTransStatus());
            if (recyclerModelWallet.getTransStatus().equalsIgnoreCase("pending")) {  //ViRaj_if_4

                tranStatus.setTextColor(ContextCompat.getColor(context, R.color.yellow_rrrrr));
                ll_wallet.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(context,R.color.yellow_rrrrr)));
            }else if(recyclerModelWallet.getTransStatus().equalsIgnoreCase("successful") || recyclerModelWallet.getTransStatus().equalsIgnoreCase("successfull")) {  //ViRaj_if_4

                tranStatus.setTextColor(ContextCompat.getColor(context, R.color.green_rrrrr));
                ll_wallet.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(context,R.color.green_rrrrr)));
            }else {  //ViRaj_if_2

                tranStatus.setTextColor(ContextCompat.getColor(context, R.color.red_rrrrr));
                ll_wallet.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(context,R.color.red_rrrrr)));
            }
            String amountStr = null;
            if (recyclerModelWallet.getTransType().equalsIgnoreCase("credit")) {  //ViRaj_if_4

                amountStr = "+";
                amount.setTextColor(ContextCompat.getColor(context, R.color.green_rrrrr));
                }else if (recyclerModelWallet.getTransType().equalsIgnoreCase("debit")) {  //ViRaj_if_4

                amountStr = "-";
                amount.setTextColor(ContextCompat.getColor(context, R.color.red_rrrrr));
            }
            amount.setText(amountStr+recyclerModelWallet.getPoints());
            dateTime.setText(recyclerModelWallet.getCreatedAt());
        }
    }
    //ViRaj_fun_A_45 //ViRaj_fun_A_16 //ViRaj_fun_A_44 //ViRaj_fun_A_37 //ViRaj_fun_A_28 //ViRaj_fun_A_11 //ViRaj_fun_A_05 //ViRaj_fun_A_15 //ViRaj_fun_A_36 //ViRaj_fun_A_09 //ViRaj_fun_A_24 //ViRaj_fun_A_06 //ViRaj_fun_A_13
}
