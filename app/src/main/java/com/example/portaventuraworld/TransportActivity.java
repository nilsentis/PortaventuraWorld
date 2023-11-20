package com.example.portaventuraworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TransportActivity extends AppCompatActivity implements View.OnClickListener {

        ImageView returnBack;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_restaurants);

            returnBack = findViewById(R.id.Ireturn);
            returnBack.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (view.getId()==R.id.Ireturn)
            {
                Intent intent = new Intent (this, MainActivity.class);
                startActivity(intent);
            }
        }
    }