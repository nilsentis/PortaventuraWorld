package com.example.portaventuraworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class RestaurantsActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    private static final int PERMISSION_REQUEST_CALL_PHONE = 1;

    ImageView returnBack;
    Spinner spinner;
    TextView webracodemar, telefracodemar, ubiracodemar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        returnBack = findViewById(R.id.Ireturn);
        returnBack.setOnClickListener(this);

        spinner = findViewById(R.id.spinner_restaurants);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tipus_restaurants, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        webracodemar = findViewById(R.id.webracodemar);
        webracodemar.setOnClickListener(this);

        telefracodemar = findViewById(R.id.telefracodemar);
        telefracodemar.setOnClickListener(this);

        ubiracodemar = findViewById(R.id.ubiracodemar);
        ubiracodemar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.Ireturn)
        {
            Intent intent = new Intent (this, MainActivity.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.webracodemar)
        {
            String url = "https://www.portaventuraworld.com/ca/restaurants/raco-de-mar";
            openWebPage(url);
        }
        if (view.getId()==R.id.telefracodemar)
        {
            String num = "977 77 90 90";
            callNumber(num);
        }
        if (view.getId()==R.id.ubiracodemar)
        {
            String ubi = "geo:41.0850334,1.1525974,17";
            openMaps(ubi);
        }

    }

    private void openMaps(String ubi) {
        Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse(ubi));
        startActivity(intent);
    }

    private void callNumber(String num) {
        String uri = "tel:" + num;
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(uri));
        startActivity(intent);
    }

    private void openWebPage(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}