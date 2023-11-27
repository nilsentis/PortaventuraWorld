package com.example.portaventuraworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class HotelsActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    ImageView returnBack;

    ImageButton iCreek, iRiver, iLucy, iPort, iCaribe, iPaso, iVila, iPiramide;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        returnBack = findViewById(R.id.IreturnH);
        returnBack.setOnClickListener(this);

        spinner = findViewById(R.id.spinnerH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.estrellas_hotels, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        iCreek = findViewById(R.id.infoCreek);
        iCreek.setOnClickListener(this);

        iRiver = findViewById(R.id.infoRiver);
        iRiver.setOnClickListener(this);

        iLucy = findViewById(R.id.infoLucy);
        iLucy.setOnClickListener(this);

        iPort = findViewById(R.id.infoPort);
        iPort.setOnClickListener(this);

        iCaribe = findViewById(R.id.infoCaribe);
        iCaribe.setOnClickListener(this);

        iPaso = findViewById(R.id.infoPaso);
        iPaso.setOnClickListener(this);

        iVila = findViewById(R.id.infoVila);
        iVila.setOnClickListener(this);

        iPiramide = findViewById(R.id.infoPiramide);
        iPiramide.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.IreturnH) {
            Intent intent = new Intent (this, MainActivity.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.infoCreek) {
            Intent intent = new Intent(this, HotelsPlus.class);

            TextView titol = findViewById(R.id.nombreHotelCreek);

            String desc, img;

            desc = getString(R.string.hCreek_desc);

            Bundle sac = new Bundle();
            sac.putString("titolPlusH", titol.getText().toString());
            sac.putString("descPlusH", desc);

            intent.putExtras(sac);
            startActivity(intent);
        }

        if (view.getId()==R.id.infoRiver) {

        }

        if (view.getId()==R.id.infoLucy) {

        }

        if (view.getId()==R.id.infoPort) {

        }

        if (view.getId()==R.id.infoCaribe) {

        }

        if (view.getId()==R.id.infoPaso) {

        }

        if (view.getId()==R.id.infoVila) {

        }

        if (view.getId()==R.id.infoPiramide) {

        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}