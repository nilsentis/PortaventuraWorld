package com.example.portaventuraworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

public class AtraccionsActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView returnBack, Imshambala;
    LinearLayout Lshambala;
    ImageButton Bshambalainfo;
    Boolean shambala = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atraccions);

        returnBack = findViewById(R.id.Ireturn);
        returnBack.setOnClickListener(this);

        //Shambala
        Imshambala = findViewById(R.id.Ishambala);
        String shambalaimage = "https://media.portaventuraworld.com/mediaManager/image/9f1dfe51fb72ac66e713e724ff962934ed830c94ad8d51828085f7b8c4f242bd.jpg?tx=ar_1.86,c_crop/w_335,h_180,c_fit";
        imatgeGlide(Imshambala ,shambalaimage);

        Bshambalainfo = findViewById(R.id.Ishambalainfo);
        Bshambalainfo.setOnClickListener(this);

        Lshambala = findViewById(R.id.Lshambalainfo);
        Lshambala.setVisibility(View.GONE);
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
        if (view.getId()==R.id.Ishambalainfo)
        {
            if (shambala)
            {
                Lshambala.setVisibility(View.GONE);
                shambala = false;
            }
            else
            {
                Lshambala.setVisibility(View.VISIBLE);
                shambala = true;
            }

        }

    }
}