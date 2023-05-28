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

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Aksam extends AppCompatActivity {


    DatabaseReference db;

    Button butonhamburger, butonpizza, butonetsis, butonsushi, butonsosisli, butontavuk;
    ImageView imagehamburger, imagesushi, imagepizza, imageetsis, imagesosisli, imagetavuk;
    TextView texthamburger, textpizza, textetsis, textsushi, textsosisli, texttavuk;

    Button butonaksamgeri;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aksam);

        db = FirebaseDatabase.getInstance().getReference().child("Kullanıcı");


        butonhamburger = findViewById(R.id.butonhamburger);
        butonpizza = findViewById(R.id.butonpizza);
        butonetsis = findViewById(R.id.butonetsis);
        butonsushi = findViewById(R.id.butonsushi);
        butonsosisli = findViewById(R.id.butonsosisli);
        butontavuk = findViewById(R.id.butontavuk);
        imagehamburger = findViewById(R.id.imagehamburger);
        imagepizza = findViewById(R.id.imagepizza);
        imageetsis = findViewById(R.id.imageetsis);
        imagesushi = findViewById(R.id.imagesushi);
        imagesosisli = findViewById(R.id.imagesosisli);
        imagetavuk = findViewById(R.id.imagetavuk);
        texthamburger = findViewById(R.id.texthamburger);
        textpizza = findViewById(R.id.textpizza);
        textetsis = findViewById(R.id.textetsis);
        textsushi = findViewById(R.id.textsushi);
        textsosisli = findViewById(R.id.textsosisli);
        texttavuk = findViewById(R.id.texttavuk);
        butonaksamgeri = findViewById(R.id.butonaksamgeri);


        butonhamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Aksam.this, "Hamburger Eklendi", Toast.LENGTH_SHORT).show();

            }
        });
        butonsosisli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Aksam.this, "Sosisli Eklendi", Toast.LENGTH_SHORT).show();

            }
        });
        butonetsis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Aksam.this, "Et Şiş Eklendi", Toast.LENGTH_SHORT).show();

            }
        });
        butonpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Aksam.this, "Pizza Eklendi", Toast.LENGTH_SHORT).show();

            }
        });
        butonsushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Aksam.this, "Sushi Eklendi", Toast.LENGTH_SHORT).show();

            }
        });
        butontavuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Aksam.this, "Tavuk Eklendi", Toast.LENGTH_SHORT).show();

            }
        });
        butonaksamgeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geri = new Intent(Aksam.this,Secim.class);
                startActivity(geri);
            }
        });
    }
}