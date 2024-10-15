package com.basementgarbage.movid;

import android.content.Intent;
import android.graphics.Movie;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button vidbinge;
    Button movieweb;
    Button notmovieweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        vidbinge = findViewById(R.id.vidbinge);
        movieweb = findViewById(R.id.movieweb);
        notmovieweb = findViewById(R.id.notmovieweb);

        vidbinge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent VidBinge = new Intent(MainActivity.this, VidBinge.class);
                startActivity(VidBinge);
            }
        });

       movieweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MovieWeb = new Intent(MainActivity.this, MovieWeb.class);
                startActivity(MovieWeb);
            }
        });

        notmovieweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent notMovieWeb = new Intent(MainActivity.this, notMovieWeb.class);
                startActivity(notMovieWeb);
            }
        });
    }
}