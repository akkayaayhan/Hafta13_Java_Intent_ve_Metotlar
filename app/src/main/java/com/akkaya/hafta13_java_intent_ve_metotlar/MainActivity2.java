package com.akkaya.hafta13_java_intent_ve_metotlar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txtKullaniciSifre;
    ImageView image;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtKullaniciSifre=findViewById(R.id.txtKullaniciSifre);
        image=findViewById(R.id.imageView3);

        Intent intent=getIntent();
        String gelenKullanici=intent.getStringExtra("kullanici");
        txtKullaniciSifre.setText("Kullanıcı Adı : "+gelenKullanici);
        if(gelenKullanici.equals("ayhan")){
            image.setImageResource(R.drawable.ayhan);
        }


    }

    public void anaEkran(View view){
        Intent intent=new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);

    }
}