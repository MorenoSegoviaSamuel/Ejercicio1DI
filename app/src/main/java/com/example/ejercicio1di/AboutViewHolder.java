package com.example.ejercicio1di;


import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AboutViewHolder extends RecyclerView.ViewHolder {

    protected ImageView image;
    protected TextView title;
    protected TextView subtitle;
    protected LinearLayout layout;

    public AboutViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.aboutImageView);
        title = itemView.findViewById(R.id.aboutTitle);
        subtitle = itemView.findViewById(R.id.subtitle);
        layout = itemView.findViewById(R.id.linear);
    }
}
