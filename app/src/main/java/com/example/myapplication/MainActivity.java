package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        public Button mapbutton;
        public Button infobutton;
        public Button aboutbutton;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            mapbutton = (Button) findViewById(R.id.mapbtn);
            infobutton = (Button) findViewById(R.id.infobtn);
            aboutbutton = (Button) findViewById(R.id.aboutbtn);


            aboutbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this,About.class);
                    startActivity(intent);
                }
            });

            infobutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this,Info.class);
                    startActivity(intent);
                }
            });

            mapbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Map.class);
                startActivity(intent);
            }
        });

    }
}