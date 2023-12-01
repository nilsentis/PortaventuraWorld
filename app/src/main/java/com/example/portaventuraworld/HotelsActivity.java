package com.example.portaventuraworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.EnumSet;

public class HotelsActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    RelativeLayout totsHotels, estrelles5, estrelles4;
    ImageView returnBack;
    ImageButton iCreek, iRiver, iLucy, iPort, iCaribe, iPaso, iVila, iPiramide;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        totsHotels = findViewById(R.id.totsHotels);
        estrelles4 = findViewById(R.id.hotels4estrelles);
        estrelles5 = findViewById(R.id.hotels5estrelles);

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

            String desc, ubi, web, tel;

            web = "https://www.portaventuraworld.com/hoteles/colorado-creek";
            tel = "977 77 90 90";

            String coor = "41.0931769,1.1542495,17";
            String nomUbi = "PortAventura Hotel Creek";

            ubi = "geo:" + coor + "?q=" + Uri.encode(nomUbi);

            desc = getString(R.string.hCreek_desc);

            Bundle sac = new Bundle();
            sac.putString("titolPlusH", titol.getText().toString());
            sac.putString("descPlusH", desc);
            sac.putString("webPlusH", web);
            sac.putString("telPlusH", tel);
            sac.putString("ubiPlusH", ubi);

            intent.putExtras(sac);
            startActivity(intent);
        }

        if (view.getId()==R.id.infoRiver) {
            Intent intent = new Intent(this, HotelsPlus.class);

            TextView titol = findViewById(R.id.nombreHotelRiver);

            String desc, ubi, web, tel;

            web = "https://www.portaventuraworld.com/hoteles/gold-river";
            tel = "977 77 90 90";

            String coor = "41.092005,1.1512031,17";
            String nomUbi = "PortAventura Hotel Golden River";

            ubi = "geo:" + coor + "?q=" + Uri.encode(nomUbi);

            desc = getString(R.string.hRiver_desc);

            Bundle sac = new Bundle();
            sac.putString("titolPlusH", titol.getText().toString());
            sac.putString("descPlusH", desc);
            sac.putString("webPlusH", web);
            sac.putString("telPlusH", tel);
            sac.putString("ubiPlusH", ubi);

            intent.putExtras(sac);
            startActivity(intent);
        }

        if (view.getId()==R.id.infoLucy) {
            Intent intent = new Intent(this, HotelsPlus.class);

            TextView titol = findViewById(R.id.nombreHotelMansionLucy);

            String desc, ubi, web, tel;

            web = "https://www.portaventuraworld.com/hoteles/mansion-de-lucy";
            tel = "977 77 90 90";

            String coor = "41.0922248,1.1517877,17";
            String nomUbi = "PortAventura Hotel Mansion de Lucy";

            ubi = "geo:" + coor + "?q=" + Uri.encode(nomUbi);

            desc = getString(R.string.hLucy_desc);

            Bundle sac = new Bundle();
            sac.putString("titolPlusH", titol.getText().toString());
            sac.putString("descPlusH", desc);
            sac.putString("webPlusH", web);
            sac.putString("telPlusH", tel);
            sac.putString("ubiPlusH", ubi);

            intent.putExtras(sac);
            startActivity(intent);
        }

        if (view.getId()==R.id.infoPort) {
            Intent intent = new Intent(this, HotelsPlus.class);

            TextView titol = findViewById(R.id.nombreHotelPortAventura);

            String desc, ubi, web, tel;

            web = "https://www.portaventuraworld.com/hoteles/port-aventura";
            tel = "977 77 90 90";

            String coor = "41.0880485,1.1491941,16";
            String nomUbi = "PortAventura Hotel PortAventura";

            ubi = "geo:" + coor + "?q=" + Uri.encode(nomUbi);

            desc = getString(R.string.hPort_desc);

            Bundle sac = new Bundle();
            sac.putString("titolPlusH", titol.getText().toString());
            sac.putString("descPlusH", desc);
            sac.putString("webPlusH", web);
            sac.putString("telPlusH", tel);
            sac.putString("ubiPlusH", ubi);

            intent.putExtras(sac);
            startActivity(intent);
        }

        if (view.getId()==R.id.infoCaribe) {
            Intent intent = new Intent(this, HotelsPlus.class);

            TextView titol = findViewById(R.id.nombreHotelCaribe);

            String desc, ubi, web, tel;

            web = "https://www.portaventuraworld.com/hoteles/caribe";
            tel = "977 77 90 90";

            String coor = "41.082844,1.1437086,17";
            String nomUbi = "PortAventura Hotel Caribe";

            ubi = "geo:" + coor + "?q=" + Uri.encode(nomUbi);

            desc = getString(R.string.hCaribe_desc);

            Bundle sac = new Bundle();
            sac.putString("titolPlusH", titol.getText().toString());
            sac.putString("descPlusH", desc);
            sac.putString("webPlusH", web);
            sac.putString("telPlusH", tel);
            sac.putString("ubiPlusH", ubi);

            intent.putExtras(sac);
            startActivity(intent);
        }

        if (view.getId()==R.id.infoPaso) {
            Intent intent = new Intent(this, HotelsPlus.class);

            TextView titol = findViewById(R.id.nombreHotelPaso);

            String desc, ubi, web, tel;

            web = "https://www.portaventuraworld.com/hoteles/el-paso";
            tel = "977 77 90 90";

            String coor = "41.0867458,1.1431032,17";
            String nomUbi = "PortAventura Hotel el Paso";

            ubi = "geo:" + coor + "?q=" + Uri.encode(nomUbi);

            desc = getString(R.string.hPaso_desc);

            Bundle sac = new Bundle();
            sac.putString("titolPlusH", titol.getText().toString());
            sac.putString("descPlusH", desc);
            sac.putString("webPlusH", web);
            sac.putString("telPlusH", tel);
            sac.putString("ubiPlusH", ubi);

            intent.putExtras(sac);
            startActivity(intent);
        }

        if (view.getId()==R.id.infoVila) {
            Intent intent = new Intent(this, HotelsPlus.class);

            TextView titol = findViewById(R.id.nombreHotelVila);

            String desc, ubi, web, tel;

            web = "https://www.portaventuraworld.com/hoteles/vila-centric";
            tel = "977 77 90 90";

            String coor = "41.1078503,1.1448422,17";
            String nomUbi = "PortAventura Hotel el Vila Centric";

            ubi = "geo:" + coor + "?q=" + Uri.encode(nomUbi);

            desc = getString(R.string.hVila_desc);

            Bundle sac = new Bundle();
            sac.putString("titolPlusH", titol.getText().toString());
            sac.putString("descPlusH", desc);
            sac.putString("webPlusH", web);
            sac.putString("telPlusH", tel);
            sac.putString("ubiPlusH", ubi);

            intent.putExtras(sac);
            startActivity(intent);
        }

        if (view.getId()==R.id.infoPiramide) {
            Intent intent = new Intent(this, HotelsPlus.class);

            TextView titol = findViewById(R.id.nombreHotelPiramide);

            String desc, ubi, web, tel;

            web = "https://www.portaventuraworld.com/hoteles/piramide-salou";
            tel = "977 77 90 90";

            String coor = "41.0752202,1.1463888,17";
            String nomUbi = "Hotel Piramide Salou";

            ubi = "geo:" + coor + "?q=" + Uri.encode(nomUbi);

            desc = getString(R.string.hPiramide);

            Bundle sac = new Bundle();
            sac.putString("titolPlusH", titol.getText().toString());
            sac.putString("descPlusH", desc);
            sac.putString("webPlusH", web);
            sac.putString("telPlusH", tel);
            sac.putString("ubiPlusH", ubi);

            intent.putExtras(sac);
            startActivity(intent);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedOption = parent.getItemAtPosition(position).toString();

        if ("Tots els hotels".equals(selectedOption)) {
            totsHotels.setVisibility(View.VISIBLE);
            estrelles4.setVisibility(View.VISIBLE);
            estrelles5.setVisibility(View.VISIBLE);
        } else if ("4 estrelles".equals(selectedOption)) {
            hideAllLayouts();
            estrelles4.setVisibility(View.VISIBLE);
        } else if ("5 estrelles".equals(selectedOption)) {
            hideAllLayouts();
            estrelles5.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void hideAllLayouts() {
        estrelles5.setVisibility(View.GONE);
        estrelles4.setVisibility(View.GONE);
    }
}