package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Feedback extends AppCompatActivity {
    EditText name, email, comment;
    Button submit;
    int num;

    FirebaseDatabase node;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        name = findViewById(R.id.nameid);
        email = findViewById(R.id.emailid);
        comment = findViewById(R.id.commentid);
        submit = findViewById(R.id.submitid);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                node = FirebaseDatabase.getInstance();

                reference = node.getReference(String.valueOf(num));

                String Name = name.getText().toString();
                String Email = email.getText().toString();
                String Comment = comment.getText().toString();


                Inputfile inputfile = new Inputfile(Name,Email,Comment);
                reference.setValue(inputfile);
                name.setText ("");
                email.setText ("");
                comment.setText ("");
                num=num+1;
            }
        });


        }

    }