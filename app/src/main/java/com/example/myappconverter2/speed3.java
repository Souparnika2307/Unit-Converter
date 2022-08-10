package com.example.myappconverter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class speed3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed3);
        Button button=findViewById(R.id.button);
        EditText input=findViewById(R.id.ans);
        TextView ans=findViewById(R.id.textView4);
        Button button1=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueEntered=input.getText().toString();
                double cms= Double.parseDouble(valueEntered);
                double ms= cms*0.01;
                ans.setText(ms+" m/s");
                Toast.makeText(speed3.this, "Converted successfully", Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueEntered=input.getText().toString();
                double cms= Double.parseDouble(valueEntered);
                double kmph= cms*0.036;
                ans.setText(kmph+" kmph");
                Toast.makeText(speed3.this, "Converted successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}