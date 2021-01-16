package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Information extends AppCompatActivity {
    public Button btn, btn1,btn2,btn3, btn4 , btn5, btn6, btn7,btn8, btn9, btn10,btn11,btn12,btn13,btn14,btn15,btn16;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        btn =(Button) findViewById(R.id.button);
        btn1 =(Button) findViewById(R.id.button1);
        btn2 =(Button) findViewById(R.id.button2);
        btn3 =(Button) findViewById(R.id.button3);
        btn4 =(Button) findViewById(R.id.button4);
        btn5 =(Button) findViewById(R.id.button5);
        btn6 =(Button) findViewById(R.id.button6);
        btn7 =(Button) findViewById(R.id.button7);
        btn8 =(Button) findViewById(R.id.button8);
        btn9 =(Button) findViewById(R.id.button9);
        btn10 =(Button) findViewById(R.id.button10);
        btn11 =(Button) findViewById(R.id.button11);
        btn12 =(Button) findViewById(R.id.button12);
        btn13 =(Button) findViewById(R.id.button13);
        btn14 =(Button) findViewById(R.id.button14);
        btn15 =(Button) findViewById(R.id.button15);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Information.this,Mathematics.class);
                startActivity(intent);
            }
        });




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Information.this,Pharmacy.class);
                startActivity(intent);
            }
        });



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Information.this,Biology.class);
                startActivity(intent);
            }
        });



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Information.this,Chemical.class);
                startActivity(intent);
            }
        });



        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Information.this,Computer.class);
                startActivity(intent);
            }
        });



        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Information.this,Physics.class);
                startActivity(intent);
            }
        });



        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Information.this,DistanceEdu.class);
                startActivity(intent);
            }
        });



        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Information.this,EduScience.class);
                startActivity(intent);
            }
        });



        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Information.this,HBP.class);
                startActivity(intent);
            }
        });



        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Information.this,IndusTech.class);
                startActivity(intent);
            }
        });



        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Information.this,Management.class);
                startActivity(intent);
            }
        });



        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Information.this,Communication.class);
                startActivity(intent);
            }
        });


        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Information.this,Arts.class);
                startActivity(intent);
            }
        });


        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Information.this,Humanities.class);
                startActivity(intent);
            }
        });


        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Information.this,Language.class);
                startActivity(intent);
            }
        });


        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Information.this,Socialscience.class);
                startActivity(intent);
            }
        });


    }
}