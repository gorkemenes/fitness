package com.example.fitnessuygulamasi;

import static kotlinx.coroutines.internal.LocalAtomics_commonKt.setValue;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Kayit extends AppCompatActivity {

    DatabaseReference DBRef = FirebaseDatabase.getInstance().getReferenceFromUrl("https://fitness-uygulamasi-7beaf-default-rtdb.firebaseio.com/");


    TextView textViewFitlife;
    Button butongeri,butonkayitol;
    EditText editTextAdSoyad, editTextPass;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit);

        textViewFitlife = findViewById(R.id.textViewFitlife);
        butongeri = findViewById(R.id.butongeri);
        butonkayitol = findViewById(R.id.butonkayitol);
        editTextAdSoyad = findViewById(R.id.editTextAdSoyad);
        editTextPass = findViewById(R.id.editTextPass);



        DBRef = FirebaseDatabase.getInstance().getReference().child("Kullanıcılar");
        butonkayitol.setOnClickListener(v ->

                DBRef.child("Kullanıcılar").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String name = editTextAdSoyad.getText().toString();
                        String pass = editTextPass.getText().toString();
                        if (snapshot.hasChild(name)){
                            Toast.makeText(Kayit.this, "Kullanıcı Zaten Kayıtlı", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            DBRef.child("Giriş Bilgileri").child(name).child("name").setValue(name);
                            DBRef.child("Giriş Bilgileri").child(name).child("pass").setValue(pass);
                            Toast.makeText(Kayit.this, "Kayıt Başarılı", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                }));
        butongeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Kayit.this,Login.class);
                startActivity(i);
            }
        });
    }
}


