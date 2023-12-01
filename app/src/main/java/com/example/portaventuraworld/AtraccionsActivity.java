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
    ImageView returnBack, Imshambala, Imfurius;
    LinearLayout Lshambala, Lfurius;
    ImageButton Bshambalainfo, Bfuriusinfo;
    Boolean shambala = false, furius = false;

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


        //Furius Baco
        Imfurius = findViewById(R.id.Ifurius);
        String furiusimage = "https://media.portaventuraworld.com/mediaManager/image/25a4e9eaf9356a9fbf62eff283ac2a7e3f40485cc6ff3402c4cbfb92de40b79f.jpg?tx=ar_1.86,c_crop/w_335,h_180,c_fit";
        imatgeGlide(Imfurius,furiusimage);

        Bfuriusinfo = findViewById(R.id.Ifuriusinfo);
        Bfuriusinfo.setOnClickListener(this);

        Lfurius = findViewById(R.id.Lfuriusinfo);
        Lfurius.setVisibility(View.GONE);
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
        if (view.getId()==R.id.Ifuriusinfo)
        {
            if (furius)
            {
                Lfurius.setVisibility(View.GONE);
                furius = false;
            }
            else
            {
                Lfurius.setVisibility(View.VISIBLE);
                furius = true;
            }
        }

    }
}