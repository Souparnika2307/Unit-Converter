package com.example.myappconverter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class speed1 extends AppCompatActivity {
    EditText input;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed1);
        Button button=findViewById(R.id.button);
        EditText input=findViewById(R.id.ans);
        TextView ans=findViewById(R.id.textView4);
        Button button1=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueEntered=input.getText().toString();
                double ms= Double.parseDouble(valueEntered);
                double kmph= ms*3.6;
                ans.setText(kmph+" kmph");
                Toast.makeText(speed1.this, "Converted successfully", Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueEntered=input.getText().toString();
                double ms= Double.parseDouble(valueEntered);
                double cms= ms*100;
                ans.setText(cms+" cm/s");
                Toast.makeText(speed1.this, "Converted successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }

}