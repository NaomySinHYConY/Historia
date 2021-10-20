package com.example.historia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivitySalon extends AppCompatActivity {

    private Button goCas2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_salon);

        goCas2 = findViewById(R.id.goCasa2);

        goCas2.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        });
    }
}