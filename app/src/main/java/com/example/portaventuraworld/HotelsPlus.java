package com.example.portaventuraworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HotelsPlus extends AppCompatActivity {

    String titol, desc, img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels_plus);

        Bundle sacRebut = getIntent().getExtras();

        if (!sacRebut.isEmpty()) {
            titol = sacRebut.getString("titolPlusH");
            desc = sacRebut.getString("descPlusH");
            img = sacRebut.getString("imgPlusH");

            TextView titolPlus = findViewById(R.id.titolPlusH);
            titolPlus.setText(titol);
            TextView descPlus = findViewById(R.id.descPlusH);
            descPlus.setText(desc);
            ImageView imgPlus = findViewById(R.id.imgPlusH);
            imgPlus.setImageResource(R.drawable.hotel_colorado_creek);

        }
    }
}