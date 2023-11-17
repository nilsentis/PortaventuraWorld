package com.example.portaventuraworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RestaurantsActivity extends AppCompatActivity implements View.OnClickListener {

    Button breturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        breturn = findViewById(R.id.bReturn);
        breturn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.bReturn)
        {
            Intent intent = new Intent (this, MainActivity.class);
            startActivity(intent);
        }
    }
}