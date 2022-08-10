package com.example.myappconverter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class speed2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed2);
        Button button=findViewById(R.id.button);
        EditText input=findViewById(R.id.ans);
        TextView ans=findViewById(R.id.textView4);
        Button button1=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueEntered=input.getText().toString();
                double kmph= Double.parseDouble(valueEntered);
                double ms= kmph*0.278;
                ans.setText(ms+"m/s");
                Toast.makeText(speed2.this, "Converted successfully", Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueEntered=input.getText().toString();
                double kmph= Double.parseDouble(valueEntered);
                double cms= kmph*27.8;
                ans.setText(cms+ "cm/s");
                Toast.makeText(speed2.this, "Converted successfully", Toast.LENGTH_SHORT).show();
            }
        });

    }
}