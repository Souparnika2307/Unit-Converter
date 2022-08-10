package com.example.myappconverter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class weight2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight2);
        Button button=findViewById(R.id.button);
        EditText input=findViewById(R.id.ans);
        TextView ans=findViewById(R.id.textView4);
        Button button1=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueEntered=input.getText().toString();
                double kg= Double.parseDouble(valueEntered);
                double g= kg*1000;
                ans.setText(g+" grams");
                Toast.makeText(weight2.this, "Converted successfully", Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueEntered=input.getText().toString();
                double kg= Double.parseDouble(valueEntered);
                double pounds= kg*2.2;
                ans.setText(pounds+" pounds");
                Toast.makeText(weight2.this, "Converted successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}