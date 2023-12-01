package com.example.portaventuraworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BuisnessPlus extends AppCompatActivity implements View.OnClickListener {

    String titol, webpage, telefon, ubicacio;

    ImageView web, tel, ubi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buisnessplus);

        web = findViewById(R.id.icoWebB);
        web.setOnClickListener(this);

        tel = findViewById(R.id.icoTelB);
        tel.setOnClickListener(this);

        ubi = findViewById(R.id.icoUbiB);
        ubi.setOnClickListener(this);

        Bundle sacRebut = getIntent().getExtras();

        if (sacRebut != null) {
            titol = sacRebut.getString("titolPlusB");
            webpage = sacRebut.getString("webPlusB");
            telefon = sacRebut.getString("telPlusB");
            ubicacio = sacRebut.getString("ubiPlusB");

            TextView titolPlus = findViewById(R.id.titolPlusB);
            titolPlus.setText(titol);
        }
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.icoWebB) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webpage));
            startActivity(intent);
        }

        if (view.getId() == R.id.icoTelB) {
            String telef = "tel:" + telefon;
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(telef));
            startActivity(intent);
        }

        if (view.getId() == R.id.icoUbiB) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(ubicacio));
            startActivity(intent);
        }
    }
}
