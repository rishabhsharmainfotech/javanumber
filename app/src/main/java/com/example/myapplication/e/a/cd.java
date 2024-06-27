package com.example.myapplication.e.a;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.R;
//ViRaj_imports

public class cd extends BottomSheetDialogFragment {

    //ViRaj_int

    //ViRaj_fun_A_36 //ViRaj_fun_A_21 //ViRaj_fun_A_40 //ViRaj_fun_A_45 //ViRaj_fun_A_37 //ViRaj_fun_A_04 //ViRaj_fun_A_09 //ViRaj_fun_A_26
    public interface OnConformClick_rrrrr { void onConformClick();}
    //ViRaj_fun_A_34 //ViRaj_fun_A_16 //ViRaj_fun_A_19 //ViRaj_fun_A_12 //ViRaj_fun_A_27 //ViRaj_fun_A_48 //ViRaj_fun_A_25 //ViRaj_fun_A_10
    private View view_rrrrr;
    //ViRaj_fun_A_01 //ViRaj_fun_A_33 //ViRaj_fun_A_31 //ViRaj_fun_A_29 //ViRaj_fun_A_13
    private MaterialButton cancel_rrrrr, conform_rrrrr;
    //ViRaj_fun_A_35 //ViRaj_fun_A_06 //ViRaj_fun_A_15 //ViRaj_fun_A_44 //ViRaj_fun_A_05 //ViRaj_fun_A_39
    private BottomSheetDialog bottomSheetDialog_rrrrr;
    //ViRaj_fun_A_18 //ViRaj_fun_A_38 //ViRaj_fun_A_42 //ViRaj_fun_A_11 //ViRaj_fun_A_49 //ViRaj_fun_A_28
    private final OnConformClick_rrrrr conformClick_rrrrr;
    //ViRaj_fun_A_46 //ViRaj_fun_A_47
    public cd(OnConformClick_rrrrr conformClick_rrrrr) {  //ViRaj_if_3
this.conformClick_rrrrr = conformClick_rrrrr;}
    //ViRaj_fun_A_30 //ViRaj_fun_A_23
    @NonNull @Override public Dialog onCreateDialog(Bundle savedInstanceState) {  //ViRaj_if_3
 Dialog dialog = super.onCreateDialog(savedInstanceState);dialog.setOnShowListener(dialogInterface -> bottomSheetDialog_rrrrr = (BottomSheetDialog) dialogInterface);return  dialog;}
    //ViRaj_fun_A_43 //ViRaj_fun_A_07
    @Nullable @Override  public View onCreateView(LayoutInflater inflater,  @Nullable ViewGroup container,  @Nullable Bundle savedInstanceState) {  //ViRaj_if_3
 view_rrrrr = inflater.inflate(R.layout.bid_confirmation, container, false); intVariables_rrrrr(); listeners_rrrrr();return view_rrrrr;}
    //ViRaj_fun_A_03 //ViRaj_fun_A_17
    private void listeners_rrrrr() {  //ViRaj_if_3
 cancel_rrrrr.setOnClickListener(v -> bottomSheetDialog_rrrrr.dismiss()); conform_rrrrr.setOnClickListener(v -> { conformClick_rrrrr.onConformClick(); bottomSheetDialog_rrrrr.dismiss(); });}
    //ViRaj_fun_A_20
    private void intVariables_rrrrr() {  //ViRaj_if_3


        cancel_rrrrr = view_rrrrr.findViewById(R.id.rrrrr_cancel_rrrrr);
        conform_rrrrr = view_rrrrr.findViewById(R.id.rrrrr_conform_rrrrr);
        //ViRaj_fun_A_50 //ViRaj_fun_A_32 //ViRaj_fun_A_22 //ViRaj_fun_A_24 //ViRaj_fun_A_41 //ViRaj_fun_A_08 //ViRaj_fun_A_14
        MaterialTextView mtv_bottom_msg_rrrrr = view_rrrrr.findViewById(R.id.rrrrr_mtv_bottom_msg_rrrrr);
        mtv_bottom_msg_rrrrr.setText(R.string.conf_trans_point_rrrrr);

    }
    //ViRaj_fun_A_02
}
