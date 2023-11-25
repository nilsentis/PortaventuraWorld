package com.example.portaventuraworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class RestaurantsPlus extends AppCompatActivity implements View.OnClickListener{

    ImageButton trip;
    Button enviar;

    String desc, url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants_plus);

        Bundle sacRebut = getIntent().getExtras(); // recuperem el intent enviat amb les dades en un sac

        if (!sacRebut.isEmpty())
        {
            String titol = sacRebut.getString("titolPlus");
            desc = sacRebut.getString("descripcio");
            url = sacRebut.getString("url");

            TextView titolPlus = findViewById(R.id.titolPlus);
            titolPlus.setText(titol);
            TextView descrPlus = findViewById(R.id.descripcioPlus);
            descrPlus.setText(desc);
        }

        trip = findViewById(R.id.trip);
        trip.setOnClickListener(this);

        enviar = findViewById(R.id.Benviar);
        enviar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.trip)
        {
            openWebPage(url);
        }
        if (view.getId()==R.id.Benviar)
        {
            Intent intent = new Intent(this,RestaurantsActivity.class); // obrim l'activitat 2 desde un intent
            startActivity(intent);
            //dialog.dismiss();
        }
    }

    private void openWebPage(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}