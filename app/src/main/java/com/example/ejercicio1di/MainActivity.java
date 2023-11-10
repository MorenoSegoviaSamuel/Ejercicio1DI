package com.example.ejercicio1di;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     Button newPlayer;
     Button preferences;

     Button games;

     ImageButton opciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newPlayer= findViewById(R.id.newPlayer);
        newPlayer.setOnClickListener(this::lanzarNewPlayer);

        preferences = findViewById(R.id.preferences);
        preferences.setOnClickListener(this::lanzarPreferences);

        games = findViewById(R.id.play);
        games.setOnClickListener(this::lanzarGames);

        opciones = findViewById(R.id.opciones);
        opciones.setOnClickListener(this::lanzarOpciones);



    }

    public void lanzarNewPlayer(View view) {
        Intent intent = new Intent();
        intent.setClass(this,NewPlayer.class);
        startActivity(intent);
    }
    public void lanzarOpciones(View view) {
        Intent intent = new Intent();
        intent.setClass(this, Opciones.class);
        startActivity(intent);
    }

    public void lanzarGames(View view) {
        Intent intent = new Intent();
        intent.setClass(this, Games.class);
        startActivity(intent);
    }

    public void lanzarPreferences(View view) {
        Intent intent = new Intent();
        intent.setClass(this, Preferences.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelection(MenuItem item){
      int id = item.getItemId();
      if (id == R.id.action_buscar){
          Toast.makeText(this,"Búsqueda",Toast.LENGTH_LONG).show();
          return true;
      }
      return super.onOptionsItemSelected(item);
    }
}

