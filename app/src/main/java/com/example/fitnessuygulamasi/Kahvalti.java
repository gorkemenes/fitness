package com.example.fitnessuygulamasi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;


public class Kahvalti extends AppCompatActivity {


    Button butonyumurta,butonpatates,butonzeytin,butonkasar,butondomates,butonekmek;
    ImageView imageyumurta,imagepatates,imagezeytin,imagedomates,imagekasar,imageekmek;
    TextView textyumurta,textkasar,textpatates,textzeytin,textdomates,textekmek;
    Button butonsabahgeri;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kahvalti);
        butondomates = findViewById(R.id.butondomates);
        butonkasar = findViewById(R.id.butonkasar);
        butonekmek = findViewById(R.id.butonekmek);
        butonyumurta = findViewById(R.id.butonyumurta);
        butonpatates = findViewById(R.id.butonpatates);
        butonzeytin = findViewById(R.id.butonzeytin);
        imageyumurta=findViewById(R.id.imageyumurta);
        imagepatates= findViewById(R.id.imagepatates);
        imagezeytin = findViewById(R.id.imagezeytin);
        imagedomates=findViewById(R.id.imagedomates);
        imagekasar=findViewById(R.id.imagekasar);
        imageekmek=findViewById(R.id.imageekmek);
        textyumurta=findViewById(R.id.textyumurta);
        textkasar=findViewById(R.id.textkasar);
        textpatates=findViewById(R.id.textpatates);
        textzeytin=findViewById(R.id.textzeytin);
        textdomates=findViewById(R.id.textdomates);
        textekmek=findViewById(R.id.textekmek);
        butonsabahgeri = findViewById(R.id.butonsabahgeri);


        butonyumurta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Kahvalti.this, "Yumurta Eklendi", Toast.LENGTH_SHORT).show();
            }
        });
        butonpatates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Kahvalti.this, "Patates Kızartması Eklendi", Toast.LENGTH_SHORT).show();
            }
        });

        butonzeytin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Kahvalti.this, "Zeytin Eklendi", Toast.LENGTH_SHORT).show();
            }
        });

        butonekmek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Kahvalti.this, "Ekmek Eklendi", Toast.LENGTH_SHORT).show();
            }
        });

        butondomates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Kahvalti.this, "Domates Eklendi", Toast.LENGTH_SHORT).show();
            }
        });

        butonkasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Kahvalti.this, "Kaşar Peyniri Eklendi", Toast.LENGTH_SHORT).show();
            }
        });
        butonsabahgeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geri = new Intent(Kahvalti.this,Secim.class);
                startActivity(geri);
            }
        });





    }
}