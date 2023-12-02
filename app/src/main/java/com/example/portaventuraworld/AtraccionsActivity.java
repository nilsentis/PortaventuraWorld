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
    ImageView returnBack, Imshambala, Imfurius, Imkhan, Imtutuki;
    LinearLayout Lshambala, Lfurius, Lkhan, Ltutuki;
    ImageButton Bshambalainfo, Bfuriusinfo, Bkhaninfo, Btutukiinfo;
    Boolean shambala = false, furius = false, khan = false, tutuki = false;

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

        //Dragon Khan
        Imkhan = findViewById(R.id.Ikhan);
        String khanimage = "https://media.portaventuraworld.com/mediaManager/image/76a4bcaad2744c2f6bb3484156f09ef5d62db53ef85bdba0da689befb76f611b.jpg?tx=ar_1.86,c_crop/w_335,h_180,c_fit";
        imatgeGlide(Imkhan,khanimage);

        Bkhaninfo = findViewById(R.id.Ikhaninfo);
        Bkhaninfo.setOnClickListener(this);

        Lkhan = findViewById(R.id.Lkhaninfo);
        Lkhan.setVisibility(View.GONE);

        //Tutuki Splash
        Imtutuki = findViewById(R.id.Itutuki);
        String tutukiimage = "https://media.portaventuraworld.com/mediaManager/image/1470f75b4a69212ec510a0305d67a8005853a3b9bae2634b8606d857acc42ee8.jpg?tx=ar_1.86,c_crop/w_335,h_180,c_fit";
        imatgeGlide(Imtutuki,tutukiimage);

        Btutukiinfo = findViewById(R.id.Itutukiinfo);
        Btutukiinfo.setOnClickListener(this);

        Ltutuki = findViewById(R.id.Ltutukiinfo);
        Ltutuki.setVisibility(View.GONE);
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
                Bshambalainfo.setImageResource(R.drawable.plus_icon);
            }
            else
            {
                Lshambala.setVisibility(View.VISIBLE);
                shambala = true;
                Bshambalainfo.setImageResource(R.drawable.rest_icon);
            }
        }

        if (view.getId()==R.id.Ifuriusinfo)
        {
            if (furius)
            {
                Lfurius.setVisibility(View.GONE);
                furius = false;
                Bfuriusinfo.setImageResource(R.drawable.plus_icon);
            }
            else
            {
                Lfurius.setVisibility(View.VISIBLE);
                furius = true;
                Bfuriusinfo.setImageResource(R.drawable.rest_icon);
            }
        }

        if (view.getId()==R.id.Ikhaninfo)
        {
            if (khan)
            {
                Lkhan.setVisibility(View.GONE);
                khan = false;
                Bkhaninfo.setImageResource(R.drawable.plus_icon);
            }
            else
            {
                Lkhan.setVisibility(View.VISIBLE);
                khan = true;
                Bkhaninfo.setImageResource(R.drawable.rest_icon);
            }
        }

        if (view.getId()==R.id.Itutukiinfo)
        {
            if (tutuki)
            {
                Ltutuki.setVisibility(View.GONE);
                tutuki = false;
                Btutukiinfo.setImageResource(R.drawable.plus_icon);
            }
            else
            {
                Ltutuki.setVisibility(View.VISIBLE);
                tutuki = true;
                Btutukiinfo.setImageResource(R.drawable.rest_icon);
            }
        }
    }
}