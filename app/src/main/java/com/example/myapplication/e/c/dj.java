package com.example.myapplication.e.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.e.e.wq;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.R;

import java.util.List;
//ViRaj_imports

public class dj extends RecyclerView.Adapter<dj.ViewHolder> {

    //ViRaj_int

    //ViRaj_fun_A_39 //ViRaj_fun_A_08 //ViRaj_fun_A_31 //ViRaj_fun_A_19 //ViRaj_fun_A_24 //ViRaj_fun_A_42
    public interface OnItemClickListener {
        void onItemClick(wq.Data.StarlineGame starlineGame, View itemView);
    }

    Context context;
    //ViRaj_fun_A_50 //ViRaj_fun_A_18 //ViRaj_fun_A_22 //ViRaj_fun_A_41 //ViRaj_fun_A_30 //ViRaj_fun_A_02 //ViRaj_fun_A_45 //ViRaj_fun_A_13 //ViRaj_fun_A_47 //ViRaj_fun_A_33
    private final List<wq.Data.StarlineGame> starlineGameList;
    private final OnItemClickListener listener;

    //ViRaj_fun_A_12 //ViRaj_fun_A_16 //ViRaj_fun_A_17 //ViRaj_fun_A_44 //ViRaj_fun_A_32 //ViRaj_fun_A_34 //ViRaj_fun_A_43 //ViRaj_fun_A_21 //ViRaj_fun_A_14 //ViRaj_fun_A_07
    public dj(Context context, List<wq.Data.StarlineGame> starlineGameList, OnItemClickListener listener) {  //ViRaj_if_3
        this.context = context;
        this.starlineGameList = starlineGameList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public dj.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {  //ViRaj_if_3
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.starline_turnament_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dj.ViewHolder holder, int position) {  //ViRaj_if_3
        holder.bind(starlineGameList.get(position), listener, context, position);
    }

    //ViRaj_fun_A_06 //ViRaj_fun_A_38 //ViRaj_fun_A_40 //ViRaj_fun_A_20 //ViRaj_fun_A_15 //ViRaj_fun_A_11
    @Override
    public int getItemCount() {  //ViRaj_if_3
        return starlineGameList.size();
    }
    //ViRaj_fun_A_10 //ViRaj_fun_A_49 //ViRaj_fun_A_25 //ViRaj_fun_A_46 //ViRaj_fun_A_36 //ViRaj_fun_A_48 //ViRaj_fun_A_09

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final MaterialTextView gameName;
        private final MaterialTextView gameResult;
        private final ShapeableImageView gamePlay;

        public ViewHolder(@NonNull View itemView) {  //ViRaj_if_3

            super(itemView);

            gameName = itemView.findViewById(R.id.rrrrr_gameName);
            gameResult = itemView.findViewById(R.id.rrrrr_gameResult);
            gamePlay = itemView.findViewById(R.id.rrrrr_gamePlay);

        }

        public void bind(wq.Data.StarlineGame starlineGame, OnItemClickListener listener, Context context, int position) {  //ViRaj_if_3

            gameName.setText(starlineGame.getName());
            gameResult.setText(starlineGame.getResult());
            if (starlineGame.isPlay()) {  //ViRaj_if_3
                //Animation rotate = AnimationUtils.loadAnimation(context, R.anim.rotate);
                //gamePlay.startAnimation(rotate);
                gamePlay.setImageResource(R.drawable.play_icon);
            } else gamePlay.setImageResource(R.drawable.close_icon);
            Animation animation = AnimationUtils.loadAnimation(context, R.anim.move);
            gameResult.setAnimation(animation);
            itemView.setOnClickListener(v -> {
                listener.onItemClick(starlineGame, v);
            });
        }
    }
    //ViRaj_fun_A_27 //ViRaj_fun_A_26 //ViRaj_fun_A_28 //ViRaj_fun_A_35 //ViRaj_fun_A_37 //ViRaj_fun_A_01 //ViRaj_fun_A_05 //ViRaj_fun_A_03 //ViRaj_fun_A_04 //ViRaj_fun_A_29 //ViRaj_fun_A_23
}
