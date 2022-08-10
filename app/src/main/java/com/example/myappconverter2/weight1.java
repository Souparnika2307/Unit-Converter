package com.example.myappconverter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class weight1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight1);
        EditText input=findViewById(R.id.ans);
        Button button=findViewById(R.id.button);
        Button button1=findViewById(R.id.button2);
        TextView ans=findViewById(R.id.textView4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueEntered=input.getText().toString();
                double pounds= Double.parseDouble(valueEntered);
                double g= pounds*450;
                ans.setText(g+ " grams");
                Toast.makeText(weight1.this, "Converted successfully", Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueEntered=input.getText().toString();
                double pounds= Double.parseDouble(valueEntered);
                double kg= pounds*0.45;
                ans.setText(kg +" kg");
                Toast.makeText(weight1.this, "Converted successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}