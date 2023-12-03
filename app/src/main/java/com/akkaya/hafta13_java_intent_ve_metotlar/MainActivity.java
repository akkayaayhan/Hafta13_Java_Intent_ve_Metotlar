package com.akkaya.hafta13_java_intent_ve_metotlar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etKullanici,etSifre;
    String kullanici;
    String sifre;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etKullanici=findViewById(R.id.etKullanici);
        etSifre=findViewById(R.id.etSifre);
    }

    public void sayfaGec(View view){

        login(kullanici,sifre);

    }

    public void login(String kullanici,String sifre)
    {

        kullanici=etKullanici.getText().toString();
        sifre=etSifre.getText().toString();

        if(kullanici.equals("ayhan") && sifre.equals("2023")){

            Intent intent=new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("kullanici",kullanici);
            intent.putExtra("sifre",sifre);
            startActivity(intent);

        }

        else{
            Toast.makeText(MainActivity.this,"Hatalı Kullanıcı Adı veya Şifre",Toast.LENGTH_LONG).show();
        }

    }
}