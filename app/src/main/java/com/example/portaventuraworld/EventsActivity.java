package com.example.portaventuraworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class EventsActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    LinearLayout totsEvents, carnaval, halloween, nadal, setmanaSanta, estiu;
    ImageView returnBack;
    Button iCarnaval, iMaya, iHwFactory, iBubble, iXmasParade, iDestDance, iFiestAv;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        totsEvents = findViewById(R.id.totsEvents);
        carnaval = findViewById(R.id.eCarnaval);
        halloween = findViewById(R.id.eHalloween);
        nadal = findViewById(R.id.eNadal);
        setmanaSanta = findViewById(R.id.eSetmanaSanta);
        estiu = findViewById(R.id.eEstiu);

        returnBack = findViewById(R.id.IreturnEv);
        returnBack.setOnClickListener(this);

        iCarnaval = findViewById(R.id.iCarnaval);
        iCarnaval.setOnClickListener(this);

        iMaya = findViewById(R.id.iMaya);
        iMaya.setOnClickListener(this);

        iHwFactory = findViewById(R.id.iHwFactory);
        iHwFactory.setOnClickListener(this);

        iBubble = findViewById(R.id.iBubble);
        iBubble.setOnClickListener(this);

        iXmasParade = findViewById(R.id.iXmasParade);
        iXmasParade.setOnClickListener(this);

        iDestDance = findViewById(R.id.iDestDance);
        iDestDance.setOnClickListener(this);

        iFiestAv = findViewById(R.id.iFiestAv);
        iFiestAv.setOnClickListener(this);

        spinner = findViewById(R.id.spinnerEv);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tipus_event, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }
    public void onClick(View view) {
        if (view.getId()==R.id.IreturnH) {
            Intent intent = new Intent (this, MainActivity.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.iCarnaval) {
            Intent intent = new Intent(this, EventsPlus.class);

            TextView titol = findViewById(R.id.nombreCarnavalE);

            String desc, tag;

            tag = "Musical";

            desc = getString(R.string.eCarnaval_desc);

            Bundle sac = new Bundle();
            sac.putString("titolPlusE", titol.getText().toString());
            sac.putString("descPlusE", desc);
            sac.putString("tagPlusE", tag);

            intent.putExtras(sac);
            startActivity(intent);
        }

        if (view.getId()==R.id.iMaya) {
            Intent intent = new Intent(this, EventsPlus.class);

            TextView titol = findViewById(R.id.nombreMayaE);

            String desc, tag;

            tag = "Pasaje del terror";

            desc = getString(R.string.eMaya_desc);

            Bundle sac = new Bundle();
            sac.putString("titolPlusE", titol.getText().toString());
            sac.putString("descPlusE", desc);
            sac.putString("tagPlusE", tag);

            intent.putExtras(sac);
            startActivity(intent);
        }

        if (view.getId()==R.id.iHwFactory) {
            Intent intent = new Intent(this, EventsPlus.class);

            TextView titol = findViewById(R.id.nombreHwE);

            String desc, tag;

            tag = "Musical";

            desc = getString(R.string.eHwFactory_desc);

            Bundle sac = new Bundle();
            sac.putString("titolPlusE", titol.getText().toString());
            sac.putString("descPlusE", desc);
            sac.putString("tagPlusE", tag);

            intent.putExtras(sac);
            startActivity(intent);
        }

        if (view.getId()==R.id.iBubble) {
            Intent intent = new Intent(this, EventsPlus.class);

            TextView titol = findViewById(R.id.nombreBubbleE);

            String desc, tag;

            tag = "Didàctic";

            desc = getString(R.string.eBubble_desc);

            Bundle sac = new Bundle();
            sac.putString("titolPlusE", titol.getText().toString());
            sac.putString("descPlusE", desc);
            sac.putString("tagPlusE", tag);

            intent.putExtras(sac);
            startActivity(intent);
        }

        if (view.getId()==R.id.iXmasParade) {
            Intent intent = new Intent(this, EventsPlus.class);

            TextView titol = findViewById(R.id.nombreXmasParadeE);

            String desc, tag;

            tag = "Musical";

            desc = getString(R.string.eXmasParade_desc);

            Bundle sac = new Bundle();
            sac.putString("titolPlusE", titol.getText().toString());
            sac.putString("descPlusE", desc);
            sac.putString("tagPlusE", tag);

            intent.putExtras(sac);
            startActivity(intent);
        }

        if (view.getId()==R.id.iDestDance) {
            Intent intent = new Intent(this, EventsPlus.class);

            TextView titol = findViewById(R.id.nombreDestDance);

            String desc, tag;

            tag = "Balls";

            desc = getString(R.string.eDestDance_desc);

            Bundle sac = new Bundle();
            sac.putString("titolPlusE", titol.getText().toString());
            sac.putString("descPlusE", desc);
            sac.putString("tagPlusE", tag);

            intent.putExtras(sac);
            startActivity(intent);
        }

        if (view.getId()==R.id.iFiestAv) {
            Intent intent = new Intent(this, EventsPlus.class);

            TextView titol = findViewById(R.id.nombreFiestAvE);

            String desc, tag;

            tag = "Altres";

            desc = getString(R.string.eFiestAv_desc);

            Bundle sac = new Bundle();
            sac.putString("titolPlusE", titol.getText().toString());
            sac.putString("descPlusE", desc);
            sac.putString("tagPlusE", tag);

            intent.putExtras(sac);
            startActivity(intent);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedOption = parent.getItemAtPosition(position).toString();

        if ("Tots els events".equals(selectedOption)) {
            totsEvents.setVisibility(View.VISIBLE);
            nadal.setVisibility(View.VISIBLE);
            setmanaSanta.setVisibility(View.VISIBLE);
            estiu.setVisibility(View.VISIBLE);
            halloween.setVisibility(View.VISIBLE);
            carnaval.setVisibility(View.VISIBLE);
        } else if ("Nadal".equals(selectedOption)) {
            hideAllLayouts();
            nadal.setVisibility(View.VISIBLE);
        } else if ("Setmana Santa".equals(selectedOption)) {
            hideAllLayouts();
            setmanaSanta.setVisibility(View.VISIBLE);
        } else if ("Estiu".equals(selectedOption)) {
            hideAllLayouts();
            estiu.setVisibility(View.VISIBLE);
        } else if ("Halloween".equals(selectedOption)) {
            hideAllLayouts();
            halloween.setVisibility(View.VISIBLE);
        } else if ("Carnaval".equals(selectedOption)) {
            hideAllLayouts();
            carnaval.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void hideAllLayouts() {
        nadal.setVisibility(View.GONE);
        setmanaSanta.setVisibility(View.GONE);
        estiu.setVisibility(View.GONE);
        halloween.setVisibility(View.GONE);
        carnaval.setVisibility(View.GONE);
    }
}