package com.example.portaventuraworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class BusinessActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    ImageView returnBack;
    ImageView b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);

        Spinner spinner = findViewById(R.id.spinner);
        String[] elementos = {"Tenda PortAventura", "Tenda Caribe", "Tenda Ferrari"};

        returnBack = findViewById(R.id.Ireturn);
        returnBack.setOnClickListener(this);

        b1 = findViewById(R.id.InfoUncharted);
        b1.setOnClickListener(this);

        b2 = findViewById(R.id.InfoBotigueta);
        b3 = findViewById(R.id.InfoCarmel); // Corregido aquí, debería ser b3 = findViewById(R.id.InfoCarmel);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this); // Añadido aquí para asignar el listener a InfoCarmel

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, elementos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.Ireturn) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.InfoUncharted) {
            Intent intent = new Intent(this, BuisnessPlus.class);

            String titol = "Uncharted";

            String web, tel, ubi;

            web = "https://www.portaventuraworld.com/hoteles/gold-river";
            tel = "977 77 90 90";

            String coor = "41.092005,1.1512031,17";
            String nomUbi = "PortAventura Hotel Golden River";

            ubi = "geo:" + coor + "?q=" + Uri.encode(nomUbi);

            Bundle sac = new Bundle();
            sac.putString("titolPlusB", titol);
            sac.putString("webPlusB", web);
            sac.putString("telPlusB", tel);
            sac.putString("ubiPlusB", ubi);

            intent.putExtras(sac);
            startActivity(intent);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // Implementación de la selección del spinner
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Implementación de caso donde no se selecciona nada en el spinner
    }
}
