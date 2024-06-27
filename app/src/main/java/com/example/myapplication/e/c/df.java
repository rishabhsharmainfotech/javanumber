package com.example.myapplication.e.c;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;
//ViRaj_imports

public class df extends ViewPager {

    //ViRaj_int

    //ViRaj_fun_A_05 //ViRaj_fun_A_38 //ViRaj_fun_A_40 //ViRaj_fun_A_16 //ViRaj_fun_A_10 //ViRaj_fun_A_25 //ViRaj_fun_A_09 //ViRaj_fun_A_47 //ViRaj_fun_A_37 //ViRaj_fun_A_50 //ViRaj_fun_A_48 //ViRaj_fun_A_36 //ViRaj_fun_A_26 //ViRaj_fun_A_20 //ViRaj_fun_A_19 //ViRaj_fun_A_03 //ViRaj_fun_A_29
    //ViRaj_fun_A_27 //ViRaj_fun_A_08 //ViRaj_fun_A_44 //ViRaj_fun_A_02 //ViRaj_fun_A_04 //ViRaj_fun_A_11 //ViRaj_fun_A_21 //ViRaj_fun_A_06 //ViRaj_fun_A_42 //ViRaj_fun_A_23 //ViRaj_fun_A_22 //ViRaj_fun_A_43 //ViRaj_fun_A_31
    public df(Context context) {  //ViRaj_if_3
super(context);setMyScroller();}
    //ViRaj_fun_A_24  //ViRaj_fun_A_13 //ViRaj_fun_A_30 //ViRaj_fun_A_45 //ViRaj_fun_A_18 //ViRaj_fun_A_15
    public df(Context context, AttributeSet attrs) {  //ViRaj_if_3
super(context, attrs);setMyScroller();}
    @Override public boolean onInterceptTouchEvent(MotionEvent event) {  //ViRaj_if_3
return false;}
    //ViRaj_fun_A_46 //ViRaj_fun_A_12 //ViRaj_fun_A_07
    @Override public boolean onTouchEvent(MotionEvent event) {  //ViRaj_if_3
return false;}
    //ViRaj_fun_A_34 //ViRaj_fun_A_35 //ViRaj_fun_A_32 //ViRaj_fun_A_14 //ViRaj_fun_A_01
    private void setMyScroller() {  //ViRaj_if_3
try {Class<?> viewpager = ViewPager.class;Field scroller = viewpager.getDeclaredField("mScroller");scroller.setAccessible(true);scroller.set(this, new MyScroller(getContext())); } catch (Exception e) {  //ViRaj_if_3
 e.printStackTrace(); }}
    public class MyScroller extends Scroller { public MyScroller(Context context) {  //ViRaj_if_3
super(context, new DecelerateInterpolator());}     @Override public void startScroll(int startX, int startY, int dx, int dy, int duration) {  //ViRaj_if_3
super.startScroll(startX, startY, dx, dy, 350 /*1 secs*/);}}
    //ViRaj_fun_A_33 //ViRaj_fun_A_39 //ViRaj_fun_A_17 //ViRaj_fun_A_41 //ViRaj_fun_A_28 //ViRaj_fun_A_49
}