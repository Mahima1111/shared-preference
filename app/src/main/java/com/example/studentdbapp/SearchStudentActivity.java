package com.example.studentdbapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SearchStudentActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton b1,b2;
    String getadmissionno,getname,getrollno,getcollege;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_student);
        ed1=(EditText) findViewById(R.id.admissionno);
        ed2=(EditText) findViewById(R.id.name);
        ed3=(EditText) findViewById(R.id.rollno);
        ed4=(EditText) findViewById(R.id.college);
        b1=(AppCompatButton) findViewById(R.id.sear);
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
                getadmissionno=ed1.getText().toString();
                Toast.makeText(getApplicationContext(),getadmissionno,Toast.LENGTH_LONG).show();
            }
        });
    }
}