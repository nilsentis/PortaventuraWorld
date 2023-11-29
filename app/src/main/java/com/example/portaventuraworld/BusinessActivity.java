package com.example.portaventuraworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class BusinessActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView returnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);

        Spinner spinner = findViewById(R.id.spinner);
        String[] elementos = {"Tenda PortAventura", "Tenda Caribe", "Tenda Ferrari"};

        returnBack = findViewById(R.id.Ireturn);
        returnBack.setOnClickListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, elementos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }
        @Override
        public void onClick(View view) {

            if (view.getId()==R.id.Ireturn) {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }
    }
}