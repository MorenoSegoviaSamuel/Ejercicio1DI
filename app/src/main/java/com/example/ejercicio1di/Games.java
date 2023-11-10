package com.example.ejercicio1di;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Games extends AppCompatActivity {

     CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7;
     FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        checkBox1 = findViewById(R.id.checkBox2);
        checkBox2 = findViewById(R.id.checkBox3);
        checkBox3 = findViewById(R.id.checkBox4);
        checkBox4 = findViewById(R.id.checkBox5);
        checkBox5 = findViewById(R.id.checkBox6);
        checkBox6 = findViewById(R.id.checkBox7);
        checkBox7 = findViewById(R.id.checkBox8);
        fab = findViewById(R.id.floatingActionButton2);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder selectedGames = new StringBuilder();

                if (checkBox1.isChecked()) {
                    selectedGames.append("Angry Bird ");
                }
                if (checkBox2.isChecked()) {
                    selectedGames.append("Dragon Fly ");
                }
                if (checkBox3.isChecked()) {
                    selectedGames.append("Hill Climbing Racing ");
                }
                if (checkBox4.isChecked()) {
                    selectedGames.append("Radiant defense ");
                }
                if (checkBox5.isChecked()) {
                    selectedGames.append("Pocket Soccer ");
                }
                if (checkBox6.isChecked()) {
                    selectedGames.append("Ninja Jump");
                }
                if (checkBox7.isChecked()) {
                    selectedGames.append("Air controler");
                }

                if (selectedGames.length() > 0) {
                    showToast("Has seleccionado:\n" + selectedGames.toString());
                } else {
                    showToast("No has seleccionado ningún juego");
                }
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
