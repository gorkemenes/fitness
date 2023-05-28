package com.example.fitnessuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Login extends AppCompatActivity {

    TextView Fitlife,yaFityaFat,textView;
    Button butongiris,butonkayit;
    EditText mailText, passText;
    ImageView tarti,kosubandi,halter;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference db;
    private FirebaseAuth mAuth;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Fitlife = findViewById(R.id.Fitlife);
        yaFityaFat = findViewById(R.id.yaFityaFat);
        textView = findViewById(R.id.textView);
        butongiris = findViewById(R.id.butongiris);
        butonkayit = findViewById(R.id.butonkayit);
        mailText = findViewById(R.id.mailText);
        passText = findViewById(R.id.passText);
        tarti = findViewById(R.id.tarti);
        kosubandi = findViewById(R.id.kosubandi);
        halter = findViewById(R.id.halter);

        mAuth = FirebaseAuth.getInstance();

        butongiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                  Intent i = new Intent(Login.this, Secim.class);
                  startActivity(i);
              }

    });



        butonkayit.setOnClickListener(v -> {
            Intent kayit = new Intent(Login.this, Kayit.class);
            startActivity(kayit);
        });


    }
}