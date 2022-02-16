package com.example.studentdbapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudentActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton b1,b2;
    String getname,getrollno,getadmissionno,getcollege;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student_activiy);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.rollno);
        ed3=(EditText) findViewById(R.id.admisnno);
        ed4=(EditText) findViewById(R.id.clg);
        b1=(AppCompatButton)  findViewById(R.id.subbtn);
        b2=(AppCompatButton) findViewById(R.id.backtomenu);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getname=ed1.getText().toString();
                getrollno=ed2.getText().toString();
                getadmissionno=ed3.getText().toString();
                getcollege=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getname,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getrollno,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getadmissionno,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getcollege, Toast.LENGTH_SHORT).show();


            }
        });
    }
}