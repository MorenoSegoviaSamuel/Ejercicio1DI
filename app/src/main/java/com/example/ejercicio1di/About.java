package com.example.ejercicio1di;



import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class About extends AppCompatActivity {

    private final List<Integer> images = List.of(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8
    );

    private final List<String> names = List.of("María Mata", "Antonio Sanz", "Carlos", "Berta", "Héctor Campos", "Ismael", "Juan Carlos", "Isabel");
    private final List<String> years = List.of("2014", "1890", "967", "945", "879", "678", "669", "420");

    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        recyclerView = findViewById(R.id.RecyclerView2);

        AboutAdapter adapter = new AboutAdapter(images, names, years, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}
