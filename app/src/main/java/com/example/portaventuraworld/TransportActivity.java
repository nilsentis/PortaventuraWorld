package com.example.portaventuraworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TransportActivity extends AppCompatActivity implements View.OnClickListener {

        ImageView returnBack;
        Button botonBus,botonTren,botonTaxi;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_transport);

            returnBack = findViewById(R.id.Ireturn);
            returnBack.setOnClickListener(this);

            botonBus = findViewById(R.id.BtBus);
            botonBus.setOnClickListener(this);

            botonTren = findViewById(R.id.Bttren);
            botonTren.setOnClickListener(this);

            botonTaxi = findViewById(R.id.BtTaxi);
            botonTaxi.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

                if (view.getId()==R.id.Ireturn) {
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);
                }
                if (view.getId()==R.id.BtBus) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.empresaplana.cat/"));
                    startActivity(intent);
                }
                if (view.getId()==R.id.Bttren) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.renfe.com/es/es/cercanias/rodalies-catalunya/ofertas-mas-populares/billete-combinado-portaventura"));
                    startActivity(intent);
                }
                if (view.getId()==R.id.BtTaxi) {
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:977 38 50 50"));
                    startActivity(intent);


            }
        }
    }