package com.example.ejercicio1di;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class GenerosViewHolder extends RecyclerView.ViewHolder{
    protected TextView text;
    public GenerosViewHolder(@NonNull View itemView) {
        super(itemView);
        text = itemView.findViewById(R.id.viewHolderText);
    }
}