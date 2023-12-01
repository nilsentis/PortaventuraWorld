package com.example.portaventuraworld;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HotelsPlus extends AppCompatActivity implements View.OnClickListener {

    String titol, desc, webpage, telefon, ubicacio;

    ImageView web, tel, ubi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels_plus);

        web = findViewById(R.id.icoWebH);
        web.setOnClickListener(this);

        tel = findViewById(R.id.icoTelH);
        tel.setOnClickListener(this);

        ubi = findViewById(R.id.icoUbiH);
        ubi.setOnClickListener(this);

        Bundle sacRebut = getIntent().getExtras();

        if (!sacRebut.isEmpty()) {
            titol = sacRebut.getString("titolPlusH");
            desc = sacRebut.getString("descPlusH");
            webpage = sacRebut.getString("webPlusH");
            telefon = sacRebut.getString("telPlusH");
            ubicacio = sacRebut.getString("ubiPlusH");

            TextView titolPlus = findViewById(R.id.titolPlusH);
            titolPlus.setText(titol);
            TextView descPlus = findViewById(R.id.descPlusH);
            descPlus.setText(desc);
        }
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.icoWebH) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webpage));
            startActivity(intent);
        }

        if (view.getId() == R.id.icoTelH) {
            String telef = "tel:" + telefon;
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(telef));
            startActivity(intent);
        }

        if (view.getId() == R.id.icoUbiH) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse(ubicacio));
            startActivity(intent);
        }
    }
}