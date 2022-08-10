package com.example.myappconverter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class length2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length2);
        EditText input=findViewById(R.id.ans);
        Button button=findViewById(R.id.button);
        Button button1=findViewById(R.id.button2);
        TextView ans=findViewById(R.id.textView4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueEntered=input.getText().toString();
                double m= Double.parseDouble(valueEntered);
                double cm= m*100;
                ans.setText(cm+ " centimeters");
                Toast.makeText(length2.this, "Converted successfully", Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueEntered=input.getText().toString();
                double m= Double.parseDouble(valueEntered);
                double km= m*0.001;
                ans.setText(km+" kms");
                Toast.makeText(length2.this, "Converted successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}