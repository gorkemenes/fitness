package com.example.fitnessuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Secim extends AppCompatActivity {

    Button butonsabahsec,butonaksamsec,butongeridön;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secim);

        butonsabahsec = findViewById(R.id.butonsabahsec);
        butonaksamsec = findViewById(R.id.butonaksamsec);
        butongeridön =  findViewById(R.id.butongeridon);


        butonsabahsec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sabah = new Intent(Secim.this,Kahvalti.class);
                startActivity(sabah);
            }
        });
        butonaksamsec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aksam = new Intent(Secim.this,Aksam.class);
                startActivity(aksam);
            }
        });
        butongeridön.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geri = new Intent(Secim.this,Login.class);
                startActivity(geri);
            }
        });

    }

}