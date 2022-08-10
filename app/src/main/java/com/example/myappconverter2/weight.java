package com.example.myappconverter2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class weight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        CardView kilogram = findViewById(R.id.kilo);
        CardView pounds =findViewById(R.id.card2);
        CardView grams=findViewById(R.id.gram);
        kilogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(weight.this,weight2.class);
                startActivity(intent);
            }
        });
        pounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(weight.this,weight1.class);
                startActivity(intent);
            }
        });
        grams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(weight.this,weight3.class);
                startActivity(intent);
            }
        });

    }
}