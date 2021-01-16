package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformationDesa extends AppCompatActivity {
    public Button Aman,Bakti,Cahaya,Fajar,Indah,Restu,Saujana,Tekun;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_desa);

        Aman =(Button) findViewById(R.id.aman);
        Bakti =(Button) findViewById(R.id.bakti);
        Cahaya =(Button) findViewById(R.id.cahaya);
        Fajar =(Button) findViewById(R.id.fajar);
        Indah =(Button) findViewById(R.id.indah);
        Restu =(Button) findViewById(R.id.restu);
        Saujana =(Button) findViewById(R.id.saujana);
        Tekun =(Button) findViewById(R.id.tekun);


        Aman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (InformationDesa.this,AmanDamai.class);
                startActivity(intent);
            }
        });

        Bakti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (InformationDesa.this,Baktipermai.class);
                startActivity(intent);
            }
        });

        Cahaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (InformationDesa.this,CahayaGemilang.class);
                startActivity(intent);
            }
        });

        Fajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (InformationDesa.this,Fajar.class);
                startActivity(intent);
            }
        });

        Indah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (InformationDesa.this,Indah.class);
                startActivity(intent);
            }
        });

        Restu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (InformationDesa.this,Restu.class);
                startActivity(intent);
            }
        });

        Saujana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (InformationDesa.this,Saujana.class);
                startActivity(intent);
            }
        });

        Tekun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (InformationDesa.this,Tekun.class);
                startActivity(intent);
            }
        });







    }
}