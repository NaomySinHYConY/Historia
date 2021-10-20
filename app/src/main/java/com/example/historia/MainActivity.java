package com.example.historia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button goEsc, goCaf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goEsc = findViewById(R.id.goEscuela);
        goCaf = findViewById(R.id.goCafeteria);

        goEsc.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), MainActivityEscuela.class);
            startActivity(i);
        });

        goCaf.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), MainActivityCafeteria.class);
            startActivity(i);
        });
    }
}