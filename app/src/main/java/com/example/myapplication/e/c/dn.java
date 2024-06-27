package com.example.myapplication.e.c;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;
//ViRaj_imports

public class dn extends FragmentPagerAdapter {

    //ViRaj_int

    //ViRaj_fun_A_50 //ViRaj_fun_A_15 //ViRaj_fun_A_39 //ViRaj_fun_A_45 //ViRaj_fun_A_20 //ViRaj_fun_A_47 //ViRaj_fun_A_05 //ViRaj_fun_A_17
    List<String> tabTitle = new ArrayList<>();
    //ViRaj_fun_A_42 //ViRaj_fun_A_38 //ViRaj_fun_A_01 //ViRaj_fun_A_35 //ViRaj_fun_A_14 //ViRaj_fun_A_29 //ViRaj_fun_A_09 //ViRaj_fun_A_11 //ViRaj_fun_A_26
    private Boolean disable = false;
    public dn(@NonNull FragmentManager fm) {  //ViRaj_if_3
super(fm);}
    //ViRaj_fun_A_22 //ViRaj_fun_A_31 //ViRaj_fun_A_04 //ViRaj_fun_A_40 //ViRaj_fun_A_30 //ViRaj_fun_A_02 //ViRaj_fun_A_23 //ViRaj_fun_A_10 //ViRaj_fun_A_46 //ViRaj_fun_A_12 //ViRaj_fun_A_16 //ViRaj_fun_A_37
    public void add(Fragment fragment,String title) {  //ViRaj_if_3
fragments.add(fragment);tabTitle.add(title);}
    @NonNull @Override public Fragment getItem(int position) {  //ViRaj_if_3
return fragments.get(position);}
    List<Fragment> fragments = new ArrayList<>();
    //ViRaj_fun_A_21 //ViRaj_fun_A_06 //ViRaj_fun_A_08 //ViRaj_fun_A_48 //ViRaj_fun_A_27 //ViRaj_fun_A_18 //ViRaj_fun_A_34 //ViRaj_fun_A_43 //ViRaj_fun_A_33
    @Override public int getCount() {  //ViRaj_if_3
return fragments.size();}
    @Nullable @Override public CharSequence getPageTitle(int position) {  //ViRaj_if_3
return tabTitle.get(position);}
    //ViRaj_fun_A_44 //ViRaj_fun_A_32 //ViRaj_fun_A_19 //ViRaj_fun_A_36 //ViRaj_fun_A_49 //ViRaj_fun_A_41 //ViRaj_fun_A_13 //ViRaj_fun_A_07 //ViRaj_fun_A_25 //ViRaj_fun_A_24 //ViRaj_fun_A_03 //ViRaj_fun_A_28
}
