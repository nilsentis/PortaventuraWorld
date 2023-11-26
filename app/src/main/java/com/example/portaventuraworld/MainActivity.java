package com.example.portaventuraworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.Inegocis);
        b1.setOnClickListener(this);

        b2 = findViewById(R.id.Itransport);
        b2.setOnClickListener(this);

        b3 = findViewById(R.id.Ihotels);
        b3.setOnClickListener(this);

        b4 = findViewById(R.id.Ievent);
        b4.setOnClickListener(this);

        b5 = findViewById(R.id.Irestaurants);
        b5.setOnClickListener(this);

        b6 = findViewById(R.id.Iatraccions);
        b6.setOnClickListener(this);
    }
    // per crear noves pestanyes java -> com.examples.portaventuraworld -> click dret -> Activity -> seleccionar
    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.Inegocis)
        {
            Intent intent = new Intent (this, BusinessActivity.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.Itransport)
        {
            Intent intent = new Intent (this, TransportActivity.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.Ihotels)
        {
            Intent intent = new Intent (this, HotelsActivity.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.Ievent)
        {
            Intent intent = new Intent (this, EventsActivity.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.Irestaurants)
        {
            Intent intent = new Intent (this, RestaurantsActivity.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.Iatraccions)
        {
            Intent intent = new Intent (this, AtraccionsActivity.class);
            startActivity(intent);
        }
    }
}