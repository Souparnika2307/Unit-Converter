package com.example.myappconverter2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class temperature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        CardView cel =findViewById(R.id.cel);
        CardView fah=findViewById(R.id.fah);
        CardView kev=findViewById(R.id.kev);
        cel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(temperature.this,temp1.class);
                startActivity(intent);
            }
        });
        fah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(temperature.this,temp2.class);
                startActivity(intent);
            }
        });
        kev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(temperature.this,temp3.class);
                startActivity(intent);
            }
        });
    }
}