package com.example.historia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivityEscuela extends AppCompatActivity {

    private Button goCas, goCaf2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_casa);

        goCas = findViewById(R.id.goCasa);
        goCaf2 = findViewById(R.id.goCafeteria2);

        goCas.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        });

        goCaf2.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), MainActivityCafeteria.class);
            startActivity(i);
        });

    }
}