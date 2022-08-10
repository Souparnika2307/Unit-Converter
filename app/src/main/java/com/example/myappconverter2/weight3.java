package com.example.myappconverter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class weight3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight3);
        EditText input=findViewById(R.id.ans);
        Button button=findViewById(R.id.button);
        Button button1=findViewById(R.id.button2);
        TextView ans=findViewById(R.id.textView4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueEntered=input.getText().toString();
                double g= Double.parseDouble(valueEntered);
                double kg= g*0.001;
                ans.setText(kg+" kg");
                Toast.makeText(weight3.this, "Converted successfully", Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueEntered=input.getText().toString();
                double g= Double.parseDouble(valueEntered);
                double pounds= g*0.0022;
                ans.setText(pounds+"pounds");
                Toast.makeText(weight3.this, "Converted successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}