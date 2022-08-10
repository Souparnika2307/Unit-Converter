package com.example.myappconverter2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class length extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        CardView cm=findViewById(R.id.centi);
        CardView m=findViewById(R.id.m);
        CardView km=findViewById(R.id.kilom);
        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(length.this,length1.class);
                startActivity(intent);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(length.this,length2.class);
                startActivity(intent);
            }
        });
        km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(length.this,length3.class);
                startActivity(intent);
            }
        });
    }
}