package com.example.ejercicio1di;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     Button newPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newPlayer= findViewById(R.id.button2);
        newPlayer.setOnClickListener(this::lanzarNewPlayer);
    }

    public void lanzarNewPlayer(View view) {
        Intent intent = new Intent();
        intent.setClass(this,NewPlayer.class);
        startActivity(intent);
    }
}

