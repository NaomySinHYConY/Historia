package com.example.historia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivityCafeteria extends AppCompatActivity {

    Button goCin, goSal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cafeteria);

        goCin = findViewById(R.id.goCine);
        goSal = findViewById(R.id.goSalon);

        goCin.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), MainActivityCine.class);
            startActivity(i);
        });

        goSal.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), MainActivitySalon.class);
            startActivity(i);
        });

    }
}