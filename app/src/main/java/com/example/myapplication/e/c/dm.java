package com.example.myapplication.e.c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.android.material.imageview.ShapeableImageView;
import com.example.myapplication.e.a.ce;
import com.example.myapplication.R;
//ViRaj_imports

public class dm extends PagerAdapter {

    //ViRaj_int

    //ViRaj_fun_A_34 //ViRaj_fun_A_40 //ViRaj_fun_A_12 //ViRaj_fun_A_46 //ViRaj_fun_A_38 //ViRaj_fun_A_28
    Context context;
    //ViRaj_fun_A_48 //ViRaj_fun_A_23 //ViRaj_fun_A_19 //ViRaj_fun_A_17 //ViRaj_fun_A_25 //ViRaj_fun_A_06 //ViRaj_fun_A_33
    private final String [] images;
    public dm(Context context, String[] images) {  //ViRaj_if_3
this.context = context;this.images = images;}
    //ViRaj_fun_A_18 //ViRaj_fun_A_45 //ViRaj_fun_A_29 //ViRaj_fun_A_02 //ViRaj_fun_A_08 //ViRaj_fun_A_43
    @Override public int getCount() {  //ViRaj_if_3
return images.length;}
    //ViRaj_fun_A_01 //ViRaj_fun_A_26 //ViRaj_fun_A_09 //ViRaj_fun_A_11 //ViRaj_fun_A_03 //ViRaj_fun_A_21
    @Override public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {  //ViRaj_if_3
return view==object;}
    @Override public void destroyItem(ViewGroup container, int position, Object object) {  //ViRaj_if_3
ViewPager vp = (ViewPager) container;View view = (View) object;vp.removeView(view);}
    //ViRaj_fun_A_04 //ViRaj_fun_A_05 //ViRaj_fun_A_07 //ViRaj_fun_A_20 //ViRaj_fun_A_30 //ViRaj_fun_A_47 //ViRaj_fun_A_44

    @NonNull @Override public Object instantiateItem(@NonNull ViewGroup container, final int position) {  //ViRaj_if_3

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.view_pager_layout, null);
        ShapeableImageView imageView = view.findViewById(R.id.rrrrr_viewPagerImage);
        Glide.with(context)
                .load(images[position])
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;
        double imageHeight = width*0.4;
        imageView.getLayoutParams().height= (int) imageHeight;
        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        view.setOnClickListener(view1 -> {
            if (!ce.getContactObject_rrrrr(
                    context,
                    ce.KEY_ADVERTISEMENT_LINK_rrrrr).equalsIgnoreCase("OFF")
              ) {  //ViRaj_if_3

                String url = (ce.getContactObject_rrrrr(context, ce.KEY_ADVERTISEMENT_LINK_rrrrr)) ;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                context.startActivity(i);

            }
        });
        return view;
    }
    //ViRaj_fun_A_35 //ViRaj_fun_A_41 //ViRaj_fun_A_49 //ViRaj_fun_A_13 //ViRaj_fun_A_39 //ViRaj_fun_A_16 //ViRaj_fun_A_32 //ViRaj_fun_A_14 //ViRaj_fun_A_36 //ViRaj_fun_A_24 //ViRaj_fun_A_37 //ViRaj_fun_A_31 //ViRaj_fun_A_27 //ViRaj_fun_A_15 //ViRaj_fun_A_50 //ViRaj_fun_A_22 //ViRaj_fun_A_10 //ViRaj_fun_A_42

}
