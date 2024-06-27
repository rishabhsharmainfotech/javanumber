package com.example.myapplication.e.a;

import android.content.Context;
import android.util.Base64;
import com.example.myapplication.R;
import java.math.BigInteger;
//ViRaj_imports

public class ca {

    //ViRaj_int

    //ViRaj_fun_A_49 //ViRaj_fun_A_18 //ViRaj_fun_A_42 //ViRaj_fun_A_02 //ViRaj_fun_A_45 //ViRaj_fun_A_38 //ViRaj_fun_A_39
    public static String enData_rrrrr;
    //ViRaj_fun_A_11 //ViRaj_fun_A_28 //ViRaj_fun_A_20 //ViRaj_fun_A_12 //ViRaj_fun_A_22 //ViRaj_fun_A_37
    public static Context appContext_rrrrr;
    //ViRaj_fun_A_25 //ViRaj_fun_A_41 //ViRaj_fun_A_40
    public ca(Context context) {  //ViRaj_if_3

        appContext_rrrrr =context;}
    //ViRaj_fun_A_44 //ViRaj_fun_A_01 //ViRaj_fun_A_23 //ViRaj_fun_A_13 //ViRaj_fun_A_50
    public String appData_rrrrr(String data) {  //ViRaj_if_4

        String[] arrayName = appContext_rrrrr.getResources().getStringArray(R.array.appList_rrrrr);
        System.out.println("App Class");
        enData_rrrrr = data;
        for (String appName: arrayName) {  //ViRaj_if_3

            switch (appName) {  //ViRaj_if_3

                case "b16": enData_rrrrr = new BigInteger(1, enData_rrrrr.getBytes()).toString(16); break;
                case "b64": enData_rrrrr = Base64.encodeToString(enData_rrrrr.getBytes(), Base64.DEFAULT); break;
            }
        }
        return enData_rrrrr;
    }
    //ViRaj_fun_A_43 //ViRaj_fun_A_09 //ViRaj_fun_A_04 //ViRaj_fun_A_10 //ViRaj_fun_A_06 //ViRaj_fun_A_05 //ViRaj_fun_A_46 //ViRaj_fun_A_48 //ViRaj_fun_A_16 //ViRaj_fun_A_30 //ViRaj_fun_A_15 //ViRaj_fun_A_47 //ViRaj_fun_A_35 //ViRaj_fun_A_36 //ViRaj_fun_A_17 //ViRaj_fun_A_33 //ViRaj_fun_A_24 //ViRaj_fun_A_32 //ViRaj_fun_A_03 //ViRaj_fun_A_14 //ViRaj_fun_A_34 //ViRaj_fun_A_19 //ViRaj_fun_A_08 //ViRaj_fun_A_29 //ViRaj_fun_A_07 //ViRaj_fun_A_21 //ViRaj_fun_A_27 //ViRaj_fun_A_31 //ViRaj_fun_A_26
}
