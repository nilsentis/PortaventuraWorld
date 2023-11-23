package com.example.portaventuraworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RestaurantsPlusRacoDeMar extends AppCompatActivity implements View.OnClickListener{

    ImageButton trip;
    Button enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants_plus_raco_de_mar);

        trip = findViewById(R.id.trip);
        trip.setOnClickListener(this);

        enviar = findViewById(R.id.Benviar);
        enviar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.trip)
        {
            String url = "https://www.tripadvisor.es/Restaurant_Review-g1007885-d6868817-Reviews-Raco_del_Mar-Vila_Seca_Costa_Dorada_Province_of_Tarragona_Catalonia.html";
            openWebPage(url);
        }
        if (view.getId()==R.id.Benviar)
        {
            Intent intent = new Intent(this,RestaurantsActivity.class); // obrim l'activitat 2 desde un intent
            startActivity(intent);
        }
    }

    private void openWebPage(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}