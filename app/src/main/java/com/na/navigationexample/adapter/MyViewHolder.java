package com.na.navigationexample.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.na.navigationexample.R;
import com.na.navigationexample.model.Hero;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    TextView hero_name;
    TextView power;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.tv_name);
        hero_name = itemView.findViewById(R.id.tv_hero_name);
        power = itemView.findViewById(R.id.tv_power);
    }

    public void bind(Hero hero) {
        name.setText(hero.getName());
        hero_name.setText(hero.getHero_name());
        power.setText(hero.getPower());
    }
}
