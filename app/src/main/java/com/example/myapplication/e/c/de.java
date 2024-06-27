package com.example.myapplication.e.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.example.myapplication.e.e.wc;
import com.example.myapplication.R;
import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

import java.util.List;
//ViRaj_imports

public class de extends RecyclerView.Adapter<de.ViewHolder> {

    //ViRaj_int

    //ViRaj_fun_A_14 //ViRaj_fun_A_16 //ViRaj_fun_A_29 //ViRaj_fun_A_43 //ViRaj_fun_A_07 //ViRaj_fun_A_05 //ViRaj_fun_A_45 //ViRaj_fun_A_42
    public interface OnItemClickListener {
        void onItemClick(wc.Data.GaliDesawarGame starlineGame, View itemView);
    }

    Context context;
    //ViRaj_fun_A_15 //ViRaj_fun_A_50 //ViRaj_fun_A_09 //ViRaj_fun_A_32 //ViRaj_fun_A_04 //ViRaj_fun_A_33 //ViRaj_fun_A_03
    private final List<wc.Data.GaliDesawarGame> galiDesawarGameList;
    private final OnItemClickListener listener;

    //ViRaj_fun_A_30 //ViRaj_fun_A_28 //ViRaj_fun_A_25 //ViRaj_fun_A_10 //ViRaj_fun_A_06 //ViRaj_fun_A_02
    public de(Context context, List<wc.Data.GaliDesawarGame> galiDesawarGameList, OnItemClickListener listener) {  //ViRaj_if_3
        this.context = context;
        this.galiDesawarGameList = galiDesawarGameList;
        this.listener = listener;
    }

    //ViRaj_fun_A_38 //ViRaj_fun_A_41 //ViRaj_fun_A_19 //ViRaj_fun_A_23 //ViRaj_fun_A_48 //ViRaj_fun_A_37
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {  //ViRaj_if_3
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.disawar_turnament_layout, parent, false);
        return new ViewHolder(view);
    }

    //ViRaj_fun_A_47 //ViRaj_fun_A_13 //ViRaj_fun_A_44 //ViRaj_fun_A_12 //ViRaj_fun_A_11 //ViRaj_fun_A_49 //ViRaj_fun_A_18
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {  //ViRaj_if_3
        holder.bind(galiDesawarGameList.get(position), listener, context, position);
    }

    @Override
    public int getItemCount() {  //ViRaj_if_3
        return galiDesawarGameList.size();
    }

    //ViRaj_fun_A_17 //ViRaj_fun_A_35 //ViRaj_fun_A_27 //ViRaj_fun_A_36 //ViRaj_fun_A_46 //ViRaj_fun_A_40 //ViRaj_fun_A_39 //ViRaj_fun_A_22 //ViRaj_fun_A_24
    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ShimmerTextView gameName;
        private final ShimmerTextView marketOpen;
        private final MaterialTextView gameResult;
        private final MaterialTextView closeTime;
        private final ShapeableImageView gamePlay;

        public ViewHolder(@NonNull View itemView) {  //ViRaj_if_3

            super(itemView);

            gameName = itemView.findViewById(R.id.rrrrr_gameName);
            gameResult = itemView.findViewById(R.id.rrrrr_gameResult);
            gamePlay = itemView.findViewById(R.id.rrrrr_gamePlay);
            closeTime = itemView.findViewById(R.id.rrrrr_closeTime);
            marketOpen = itemView.findViewById(R.id.rrrrr_marketOpen);

            Shimmer shimmer = new Shimmer();
            shimmer.start(gameName);
            shimmer.start(marketOpen);
        }

        public void bind(wc.Data.GaliDesawarGame galiDesawarGame, OnItemClickListener listener, Context context, int position) {  //ViRaj_if_3


            closeTime.setText("Close : " + galiDesawarGame.getTime_rrrrr());
            gameName.setText(galiDesawarGame.getName_rrrrr());
            gameResult.setText(galiDesawarGame.getResult_rrrrr());

            if (galiDesawarGame.isPlay_rrrrr()) {  //ViRaj_if_3

                //Animation  rotate = AnimationUtils.loadAnimation(context, R.anim.rotate);
                //gamePlay.startAnimation(rotate);
                gamePlay.setImageResource(R.drawable.play_icon);
                marketOpen.setText("Running");
                marketOpen.setTextColor(ContextCompat.getColor(context, R.color.green_rrrrr));
            } else {  //ViRaj_if_5

                gamePlay.setImageResource(R.drawable.close_icon);
                marketOpen.setText("Closed");
                marketOpen.setTextColor(ContextCompat.getColor(context, R.color.red_rrrrr));
            }
            Animation animation = AnimationUtils.loadAnimation(context, R.anim.run);
            gameResult.setAnimation(animation);
            itemView.setOnClickListener(v -> {
                listener.onItemClick(galiDesawarGame, v);
            });
        }
    }
    //ViRaj_fun_A_08 //ViRaj_fun_A_01 //ViRaj_fun_A_26 //ViRaj_fun_A_20 //ViRaj_fun_A_34 //ViRaj_fun_A_31 //ViRaj_fun_A_21
}
