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
import android.widget.Spinner;
import android.widget.TextView;

import com.bumptech.glide.Glide;
// després d'instalar Glide fem un File -> Sync Gradle Files

public class RestaurantsActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    private static final int PERMISSION_REQUEST_CALL_PHONE = 1;

    ImageView returnBack,Imracodelmar,Imvinosfera;
    Spinner spinner;
    ImageButton webracodemar, telefracodemar, ubiracodemar, plusracodemar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        Imracodelmar = findViewById(R.id.Iracodelmar);
        String racodelmarimage = "https://media.portaventuraworld.com/mediaManager/image/1d5665c85b963a7affd4073c935af15764f9339e11dd27bc8ac682ab5edf600b.jpg?tx=ar_1.86,c_crop/w_503,h_270,c_fit";
        imatgeGlide(Imracodelmar ,racodelmarimage);

        Imvinosfera = findViewById(R.id.Ivinosfera);
        String vinosferaimage = "https://media.portaventuraworld.com/mediaManager/image/2bcd96f1c091e17eed669fe0fb50640d8f2dab5dfa0dfbdcf2a486c430a1f388.jpg?tx=ar_1.86,c_crop/w_503,h_270,c_fit";
        imatgeGlide(Imvinosfera ,vinosferaimage);


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

        plusracodemar = findViewById(R.id.plusracodemar);
        plusracodemar.setOnClickListener(this);
    }

    private void imatgeGlide(ImageView im, String url) {
        // Càrrega d'imatge amb Glide
        Glide.with(this)
                .load(url)
                .into(im);
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
        if (view.getId()==R.id.plusracodemar)
        {
            Intent intent = new Intent(this, RestaurantsPlus.class); // obrim l'activitat 2 desde un intent

            TextView titol = findViewById(R.id.titolRacodemar);
            String descripcio, url;

            descripcio = "Cuina mediterrània: amanides, arròs, pizzes i pasta.";
            url = "https://www.tripadvisor.es/Restaurant_Review-g1007885-d6868817-Reviews-Raco_del_Mar-Vila_Seca_Costa_Dorada_Province_of_Tarragona_Catalonia.html";

            Bundle sac = new Bundle();
            sac.putString("titol",titol.getText().toString());
            sac.putString("descripcio",descripcio);
            sac.putString("url",url);

            intent.putExtras(sac);
            startActivity(intent);
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