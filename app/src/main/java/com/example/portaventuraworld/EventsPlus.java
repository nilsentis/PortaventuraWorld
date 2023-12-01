package com.example.portaventuraworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class EventsPlus extends AppCompatActivity {

    String titol, desc, tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_plus);

        Bundle sacRebut = getIntent().getExtras();

        if (!sacRebut.isEmpty()) {
            titol = sacRebut.getString("titolPlusE");
            desc = sacRebut.getString("descPlusE");
            tag = sacRebut.getString("tagPlusE");

            TextView titolPlus = findViewById(R.id.titolPlusE);
            titolPlus.setText(titol);
            TextView descPlus = findViewById(R.id.descPlusE);
            descPlus.setText(desc);
            TextView tagPlus = findViewById(R.id.tagsPlusE);
            tagPlus.setText(tag);
        }
    }
}