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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
// després d'instalar Glide fem un File -> Sync Gradle Files

public class RestaurantsActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    private static final int PERMISSION_REQUEST_CALL_PHONE = 1;

    // Inicialització layouts

    RelativeLayout layoutMediterrania,layoutPolynesia,layoutSesamoAventura,layoutXina,layoutMexic,layoutFarWest;
    ScrollView layoutTotsElRestaurants;

    ImageView returnBack,Imracodelmar,Imvinosfera,Imborabora,Imcaptainsrefuge,Imcocinaepi,Imcanton,Imsichuan,Imcantina,Imironhorse;
    Spinner spinner;
    ImageButton webracodemar, telefracodemar, ubiracodemar, plusracodemar;
    ImageButton webvinosfera, telefvinosfera, ubivinosfera, plusvinosfera;
    ImageButton webborabora, telefborabora, ubiborabora, plusborabora;
    ImageButton webcaptainsrefuge, telefcaptainsrefuge, ubicaptainsrefuge, pluscaptainsrefuge;
    ImageButton webepi, telefepi, ubiepi, plusepi;
    ImageButton webcanton, telefcanton, ubicanton, pluscanton;
    ImageButton websichuan, telefsichuan, ubisichuan, plussichuan;
    ImageButton webcantina, telefcantina, ubicantina, pluscantina;
    ImageButton webironhorse, telefironhorse, ubiironhorse, plusironhorse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        layoutTotsElRestaurants = findViewById(R.id.totsRestaurants);
        layoutMediterrania = findViewById(R.id.mediterrania);
        layoutPolynesia = findViewById(R.id.polynesia);
        layoutSesamoAventura = findViewById(R.id.sesamoAventura);
        layoutXina = findViewById(R.id.china);
        layoutMexic = findViewById(R.id.mexico);
        layoutFarWest = findViewById(R.id.farwest);

        returnBack = findViewById(R.id.Ireturn);
        returnBack.setOnClickListener(this);

        spinner = findViewById(R.id.spinner_restaurants);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tipus_restaurants, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        // Raco del mar
        Imracodelmar = findViewById(R.id.Iracodelmar);
        String racodelmarimage = "https://media.portaventuraworld.com/mediaManager/image/1d5665c85b963a7affd4073c935af15764f9339e11dd27bc8ac682ab5edf600b.jpg?tx=ar_1.86,c_crop/w_503,h_270,c_fit";
        imatgeGlide(Imracodelmar ,racodelmarimage);

        webracodemar = findViewById(R.id.webracodemar);
        webracodemar.setOnClickListener(this);

        telefracodemar = findViewById(R.id.telefracodemar);
        telefracodemar.setOnClickListener(this);

        ubiracodemar = findViewById(R.id.ubiracodemar);
        ubiracodemar.setOnClickListener(this);

        plusracodemar = findViewById(R.id.plusracodemar);
        plusracodemar.setOnClickListener(this);


        //Vinosfera
        Imvinosfera = findViewById(R.id.Ivinosfera);
        String vinosferaimage = "https://media.portaventuraworld.com/mediaManager/image/2bcd96f1c091e17eed669fe0fb50640d8f2dab5dfa0dfbdcf2a486c430a1f388.jpg?tx=ar_1.86,c_crop/w_503,h_270,c_fit";
        imatgeGlide(Imvinosfera ,vinosferaimage);

        webvinosfera = findViewById(R.id.webvinosfera);
        webvinosfera.setOnClickListener(this);

        telefvinosfera = findViewById(R.id.telefvinosfera);
        telefvinosfera.setOnClickListener(this);

        ubivinosfera = findViewById(R.id.ubivinosfera);
        ubivinosfera.setOnClickListener(this);

        plusvinosfera = findViewById(R.id.plusvinosfera);
        plusvinosfera.setOnClickListener(this);


        //Bora Bora
        Imborabora = findViewById(R.id.IBoraBora);
        String boraboraimage = "https://media.portaventuraworld.com/mediaManager/image/b91d6bb6ce5d6f78b32ec267edb339fb59db0e4e691bcccd692443e57521323a.jpg?tx=ar_1.86,c_crop/w_503,h_270,c_fit";
        imatgeGlide(Imborabora ,boraboraimage);

        webborabora = findViewById(R.id.webborabora);
        webborabora.setOnClickListener(this);

        telefborabora = findViewById(R.id.telefborabora);
        telefborabora.setOnClickListener(this);

        ubiborabora = findViewById(R.id.ubiborabora);
        ubiborabora.setOnClickListener(this);

        plusborabora = findViewById(R.id.plusborabora);
        plusborabora.setOnClickListener(this);


        //Captain's Refuge
        Imcaptainsrefuge = findViewById(R.id.Icaptainrefuge);
        String captainsrefugeimage = "https://media.portaventuraworld.com/mediaManager/image/18b0b0277cfefa7cc8c487f3d463825d8a727fdb4b1249efa865677ce17f9209.jpg?tx=ar_1.86,c_crop/w_503,h_270,c_fit";
        imatgeGlide(Imcaptainsrefuge ,captainsrefugeimage);

        webcaptainsrefuge = findViewById(R.id.webcaptainrefuge);
        webcaptainsrefuge.setOnClickListener(this);

        telefcaptainsrefuge = findViewById(R.id.telefcaptainrefuge);
        telefcaptainsrefuge.setOnClickListener(this);

        ubicaptainsrefuge = findViewById(R.id.ubicaptainrefuge);
        ubicaptainsrefuge.setOnClickListener(this);

        pluscaptainsrefuge = findViewById(R.id.pluscaptainrefuge);
        pluscaptainsrefuge.setOnClickListener(this);


        //Cocina Epi
        Imcocinaepi = findViewById(R.id.ICocinaEpi);
        String cocinaepiimage = "https://media.portaventuraworld.com/mediaManager/image/7c3f9259566d4ab9ade62b14e40aa54b3e5907999c8807b8dad4e69167ccb880.jpg?tx=ar_1.86,c_crop/w_503,h_270,c_fit";
        imatgeGlide(Imcocinaepi ,cocinaepiimage);

        webepi = findViewById(R.id.webcocinaepi);
        webepi.setOnClickListener(this);

        telefepi = findViewById(R.id.telefcocinaepi);
        telefepi.setOnClickListener(this);

        ubiepi = findViewById(R.id.ubicocinaepi);
        ubiepi.setOnClickListener(this);

        plusepi = findViewById(R.id.pluscocinaepi);
        plusepi.setOnClickListener(this);


        //Canton
        Imcanton = findViewById(R.id.ICanton);
        String cantonimage = "https://media.portaventuraworld.com/mediaManager/image/582a164557f60b717f96b16f37135d7cb71031e7ac93a99e76f4793d9b660c5c.jpg?tx=ar_1.86,c_crop/w_503,h_270,c_fit";
        imatgeGlide(Imcanton ,cantonimage);

        webcanton = findViewById(R.id.webcanton);
        webcanton.setOnClickListener(this);

        telefcanton = findViewById(R.id.telefcanton);
        telefcanton.setOnClickListener(this);

        ubicanton = findViewById(R.id.ubicanton);
        ubicanton.setOnClickListener(this);

        pluscanton = findViewById(R.id.pluscanton);
        pluscanton.setOnClickListener(this);


        //Sichuan
        Imsichuan = findViewById(R.id.ISichuan);
        String sichuanimage = "https://media.portaventuraworld.com/mediaManager/image/69ca7bc78fb5f2a89a85933e3f33924b8957949335dec95a7fb9c3b4ddaba2b7.jpg?tx=ar_1.86,c_crop/w_503,h_270,c_fit";
        imatgeGlide(Imsichuan ,sichuanimage);

        websichuan = findViewById(R.id.websichuan);
        websichuan.setOnClickListener(this);

        telefsichuan = findViewById(R.id.telefsichuan);
        telefsichuan.setOnClickListener(this);

        ubisichuan = findViewById(R.id.ubisichuan);
        ubisichuan.setOnClickListener(this);

        plussichuan = findViewById(R.id.plussichuan);
        plussichuan.setOnClickListener(this);


        //Cantina
        Imcantina = findViewById(R.id.ICantina);
        String cantinaimage = "https://media.portaventuraworld.com/mediaManager/image/879b22103d19e6b811abf4ddf58a0a0929cde2ac0b4136c63cbacba7d514a1db.jpg?tx=ar_1.86,c_crop/w_503,h_270,c_fit";
        imatgeGlide(Imcantina ,cantinaimage);

        webcantina = findViewById(R.id.webcantina);
        webcantina.setOnClickListener(this);

        telefcantina = findViewById(R.id.telefcantina);
        telefcantina.setOnClickListener(this);

        ubicantina = findViewById(R.id.ubicantina);
        ubicantina.setOnClickListener(this);

        pluscantina = findViewById(R.id.pluscantina);
        pluscantina.setOnClickListener(this);

        //Ironhorse
        Imironhorse = findViewById(R.id.IIronhorse);
        String ironhorseimage = "https://media.portaventuraworld.com/mediaManager/image/1e123cb1ac5d6c7202258d36e63742e999d243e50cd04d9c5802c81ed8916a54.jpg?tx=ar_1.86,c_crop/w_503,h_270,c_fit";
        imatgeGlide(Imironhorse ,ironhorseimage);

        webironhorse = findViewById(R.id.webironhorse);
        webironhorse.setOnClickListener(this);

        telefironhorse = findViewById(R.id.telefironhorse);
        telefironhorse.setOnClickListener(this);

        ubiironhorse = findViewById(R.id.ubiironhorse);
        ubiironhorse.setOnClickListener(this);

        plusironhorse = findViewById(R.id.plusironhorse);
        plusironhorse.setOnClickListener(this);
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

        //Raco de Mar
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
            String ubi = "41.0850334,1.1525974,17";
            String nomUbi = "Racó de mar Portaventura";

            openMaps(ubi,nomUbi);
        }
        if (view.getId()==R.id.plusracodemar)
        {
            Intent intent = new Intent(this, RestaurantsPlus.class); // obrim l'activitat desde un intent

            TextView titol = findViewById(R.id.titolRacodemar);
            String descripcio, url;

            descripcio = "Cuina mediterrània: amanides, arròs, pizzes i pasta.";  // podriem posar tots els string al strings.xml
            url = "https://www.tripadvisor.es/Restaurant_Review-g1007885-d6868817-Reviews-Raco_del_Mar-Vila_Seca_Costa_Dorada_Province_of_Tarragona_Catalonia.html";

            Bundle sac = new Bundle();
            sac.putString("titolPlus",titol.getText().toString());
            sac.putString("descripcio",descripcio);
            sac.putString("url",url);

            intent.putExtras(sac);
            startActivity(intent);
        }

        //Vinosfera
        if (view.getId()==R.id.webvinosfera)
        {
            String url = "https://www.portaventuraworld.com/ca/restaurants/vinosfera-tapes-i-vins";
            openWebPage(url);
        }
        if (view.getId()==R.id.telefvinosfera)
        {
            String num = "977 77 90 90";
            callNumber(num);
        }
        if (view.getId()==R.id.ubivinosfera)
        {
            String ubi = "41.0850334,1.1525974,17";
            String nomUbi = "Vinosfera Portaventura";

            openMaps(ubi,nomUbi);
        }
        if (view.getId()==R.id.plusvinosfera)
        {
            Intent intent = new Intent(this, RestaurantsPlus.class); // obrim l'activitat desde un intent

            TextView titol = findViewById(R.id.titolVinosfera);
            String descripcio, url;

            descripcio = "Tapes i vins mediterrànis.";
            url = "https://www.tripadvisor.es/Restaurant_Review-g562814-d3372028-Reviews-Vinosfera_Tapes_i_Vins-Salou_Costa_Dorada_Province_of_Tarragona_Catalonia.html";

            Bundle sac = new Bundle();
            sac.putString("titolPlus",titol.getText().toString());
            sac.putString("descripcio",descripcio);
            sac.putString("url",url);

            intent.putExtras(sac);
            startActivity(intent);
        }

        // Bora Bora
        if (view.getId()==R.id.webborabora)
        {
            String url = "https://www.portaventuraworld.com/ca/restaurants/bora-bora";
            openWebPage(url);
        }
        if (view.getId()==R.id.telefborabora)
        {
            String num = "977 77 90 90";
            callNumber(num);
        }
        if (view.getId()==R.id.ubiborabora)
        {
            String ubi = "41.0850334,1.1525974,17";
            String nomUbi = "Bora Bora Portaventura";

            openMaps(ubi,nomUbi);
        }
        if (view.getId()==R.id.plusborabora)
        {
            Intent intent = new Intent(this, RestaurantsPlus.class); // obrim l'activitat desde un intent i li passsem en un Bundle l'informació del restaurant seleccionat

            TextView titol = findViewById(R.id.titolBoraBora);
            String descripcio, url;

            descripcio = "Poke bowls , amanides, opcions vegetarianes i flexivegetarianes.";
            url = "https://www.tripadvisor.es/Attraction_Review-g659969-d6685802-Reviews-Bora_Bora-Calafell_Costa_Dorada_Province_of_Tarragona_Catalonia.html";

            Bundle sac = new Bundle();
            sac.putString("titolPlus",titol.getText().toString());
            sac.putString("descripcio",descripcio);
            sac.putString("url",url);

            intent.putExtras(sac);
            startActivity(intent);
        }

        // Captain's refuge
        if (view.getId()==R.id.webcaptainrefuge)
        {
            String url = "https://www.portaventuraworld.com/ca/restaurants/punts-d-alimentacio-polynesia";
            openWebPage(url);
        }
        if (view.getId()==R.id.telefcaptainrefuge)
        {
            String num = "977 77 90 90";
            callNumber(num);
        }
        if (view.getId()==R.id.ubicaptainrefuge)
        {
            String ubi = "41.0850334,1.1525974,17";
            String nomUbi = "Bora Bora Portaventura"; //Subtenda

            openMaps(ubi,nomUbi);
        }
        if (view.getId()==R.id.pluscaptainrefuge)
        {
            Intent intent = new Intent(this, RestaurantsPlus.class); // obrim l'activitat desde un intent i li passsem en un Bundle l'informació del restaurant seleccionat

            TextView titol = findViewById(R.id.titolCaptainrefuge);
            String descripcio, url;

            descripcio = "Fruita, granissats, refrescos i cafès.";
            url = "https://www.tripadvisor.es/Attraction_Review-g659969-d6685802-Reviews-Bora_Bora-Calafell_Costa_Dorada_Province_of_Tarragona_Catalonia.html"; // subtenda

            Bundle sac = new Bundle();
            sac.putString("titolPlus",titol.getText().toString());
            sac.putString("descripcio",descripcio);
            sac.putString("url",url);

            intent.putExtras(sac);
            startActivity(intent);
        }

        // Cocina de Epi
        if (view.getId()==R.id.webcocinaepi)
        {
            String url = "https://www.portaventuraworld.com/ca/restaurants/la-cocina-de-epi";
            openWebPage(url);
        }
        if (view.getId()==R.id.telefcocinaepi)
        {
            String num = "977 77 90 90";
            callNumber(num);
        }
        if (view.getId()==R.id.ubicocinaepi)
        {
            String ubi = "41.0850334,1.1525974,17";
            String nomUbi = "La Cocina de Epi Portaventura"; //Subtenda

            openMaps(ubi,nomUbi);
        }
        if (view.getId()==R.id.pluscocinaepi)
        {
            Intent intent = new Intent(this, RestaurantsPlus.class); // obrim l'activitat desde un intent i li passsem en un Bundle l'informació del restaurant seleccionat

            TextView titol = findViewById(R.id.titolCocinaEpi);
            String descripcio, url;

            descripcio = "Pizzes, pasta, hamburgueses, pollastre i amanides pels més menuts de SésamoAventura.";
            url = "https://www.tripadvisor.es/Restaurant_Review-g652134-d8417530-Reviews-La_Cuina_De_l_Epi-Platja_d_Aro_Castell_Platja_d_Aro_Costa_Brava_Province_of_Giron.html";

            Bundle sac = new Bundle();
            sac.putString("titolPlus",titol.getText().toString());
            sac.putString("descripcio",descripcio);
            sac.putString("url",url);

            intent.putExtras(sac);
            startActivity(intent);
        }

        // Canton
        if (view.getId()==R.id.webcanton)
        {
            String url = "https://www.portaventuraworld.com/ca/restaurants/canton";
            openWebPage(url);
        }
        if (view.getId()==R.id.telefcanton)
        {
            String num = "977 77 90 90";
            callNumber(num);
        }
        if (view.getId()==R.id.ubicanton)
        {
            String ubi = "41.0850334,1.1525974,17";
            String nomUbi = "Canton Portaventura";

            openMaps(ubi,nomUbi);
        }
        if (view.getId()==R.id.pluscanton)
        {
            Intent intent = new Intent(this, RestaurantsPlus.class); // obrim l'activitat desde un intent i li passsem en un Bundle l'informació del restaurant seleccionat

            TextView titol = findViewById(R.id.titolCanton);
            String descripcio, url;

            descripcio = "Wok showcooking asiàtic: rotlles de primavera, fideus xinesos, amanides i postres.";
            url = "https://www.tripadvisor.es/Restaurant_Review-g562814-d4241781-Reviews-Sichuan_Restaurant_Portaventura-Salou_Costa_Dorada_Province_of_Tarragona_Cataloni.html"; //Subtenda

            Bundle sac = new Bundle();
            sac.putString("titolPlus", titol.getText().toString());
            sac.putString("descripcio", descripcio);
            sac.putString("url", url);

            intent.putExtras(sac);
            startActivity(intent);
        }


        // Sichuan
        if (view.getId()==R.id.websichuan)
        {
            String url = "https://www.portaventuraworld.com/ca/restaurants/sichuan";
            openWebPage(url);
        }
        if (view.getId()==R.id.telefsichuan)
        {
            String num = "977 77 90 90";
            callNumber(num);
        }
        if (view.getId()==R.id.ubisichuan)
        {
            String ubi = "41.0850334,1.1525974,17";
            String nomUbi = "Sichuan Portaventura";

            openMaps(ubi,nomUbi);
        }
        if (view.getId()==R.id.plussichuan)
        {
            Intent intent = new Intent(this, RestaurantsPlus.class); // obrim l'activitat desde un intent i li passsem en un Bundle l'informació del restaurant seleccionat

            TextView titol = findViewById(R.id.titolSichuan);
            String descripcio, url;

            descripcio = "Cuina asiàtica, amanides i postres.";
            url = "https://www.tripadvisor.es/Restaurant_Review-g562814-d4241781-Reviews-Sichuan_Restaurant_Portaventura-Salou_Costa_Dorada_Province_of_Tarragona_Cataloni.html";

            Bundle sac = new Bundle();
            sac.putString("titolPlus", titol.getText().toString());
            sac.putString("descripcio", descripcio);
            sac.putString("url", url);

            intent.putExtras(sac);
            startActivity(intent);
        }


        // Cantina
        if (view.getId()==R.id.webcantina)
        {
            String url = "https://www.portaventuraworld.com/ca/restaurants/la-cantina";
            openWebPage(url);
        }
        if (view.getId()==R.id.telefcantina)
        {
            String num = "977 77 90 90";
            callNumber(num);
        }
        if (view.getId()==R.id.ubicantina)
        {
            String ubi = "41.0850334,1.1525974,17";
            String nomUbi = "Cantina Portaventura";

            openMaps(ubi,nomUbi);
        }
        if (view.getId()==R.id.pluscantina)
        {
            Intent intent = new Intent(this, RestaurantsPlus.class); // obrim l'activitat desde un intent i li passsem en un Bundle l'informació del restaurant seleccionat

            TextView titol = findViewById(R.id.titolCantina);
            String descripcio, url;

            descripcio = "Cuina mexicana: amanides, postres, burritos i xili amb carn.";
            url = "https://www.tripadvisor.es/Restaurant_Review-g1007885-d8758015-Reviews-La_Cantina-Vila_Seca_Costa_Dorada_Province_of_Tarragona_Catalonia.html";

            Bundle sac = new Bundle();
            sac.putString("titolPlus", titol.getText().toString());
            sac.putString("descripcio", descripcio);
            sac.putString("url", url);

            intent.putExtras(sac);
            startActivity(intent);
        }


        // Ironhorse
        if (view.getId()==R.id.webironhorse)
        {
            String url = "https://www.portaventuraworld.com/ca/restaurants/the-iron-horse";
            openWebPage(url);
        }
        if (view.getId()==R.id.telefironhorse)
        {
            String num = "977 77 90 90";
            callNumber(num);
        }
        if (view.getId()==R.id.ubiironhorse)
        {
            String ubi = "41.0850334,1.1525974,17";
            String nomUbi = "The Iron Horse Portaventura";

            openMaps(ubi,nomUbi);
        }
        if (view.getId()==R.id.plusironhorse)
        {
            Intent intent = new Intent(this, RestaurantsPlus.class); // obrim l'activitat desde un intent i li passsem en un Bundle l'informació del restaurant seleccionat

            TextView titol = findViewById(R.id.titolIronhorse);
            String descripcio, url;

            descripcio = "Cuina americana: amanida Cèsar, hamburgueses, costelles de porc i steaks.";
            url = "https://www.tripadvisor.es/Restaurant_Review-g562814-d4601997-Reviews-The_Iron_Horse_Hotel-Salou_Costa_Dorada_Province_of_Tarragona_Catalonia.html";

            Bundle sac = new Bundle();
            sac.putString("titolPlus", titol.getText().toString());
            sac.putString("descripcio", descripcio);
            sac.putString("url", url);

            intent.putExtras(sac);
            startActivity(intent);
        }
    }

    private void openMaps(String ubi, String nomLloc) {
        String uri = "geo:" + ubi + "?q=" + Uri.encode(nomLloc);
        Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse(uri));
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

        String selectedOption = parent.getItemAtPosition(position).toString();

        if ("Tots els restaurants".equals(selectedOption)) {
            layoutTotsElRestaurants.setVisibility(View.VISIBLE);
        } else if ("Mediterrània".equals(selectedOption)) {
            hideAllLayouts();
            layoutMediterrania.setVisibility(View.VISIBLE);
        } else if ("Polynesia".equals(selectedOption)) {
            hideAllLayouts();
            layoutPolynesia.setVisibility(View.VISIBLE);
        } else if ("SésamoAventura".equals(selectedOption)) {
            hideAllLayouts();
            layoutSesamoAventura.setVisibility(View.VISIBLE);
        } else if ("Xina".equals(selectedOption)) {
            hideAllLayouts();
            layoutXina.setVisibility(View.VISIBLE);
        } else if ("Mèxic".equals(selectedOption)) {
            hideAllLayouts();
            layoutMexic.setVisibility(View.VISIBLE);
        } else if ("Far West".equals(selectedOption)) {
            hideAllLayouts();
            layoutFarWest.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void hideAllLayouts() {
        layoutMediterrania.setVisibility(View.GONE);
        layoutPolynesia.setVisibility(View.GONE);
        layoutSesamoAventura.setVisibility(View.GONE);
        layoutXina.setVisibility(View.GONE);
        layoutMexic.setVisibility(View.GONE);
        layoutFarWest.setVisibility(View.GONE);
    }

}