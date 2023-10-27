package com.example.ejercicio1di;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

