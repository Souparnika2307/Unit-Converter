package com.example.myappconverter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class temp1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp1);
        EditText input=findViewById(R.id.ans);
        Button button=findViewById(R.id.button);
        Button button1=findViewById(R.id.button2);
        TextView ans=findViewById(R.id.textView4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueEntered=input.getText().toString();
                double c= Double.parseDouble(valueEntered);
                double f= c*1.8+32;
                ans.setText(""+f);
                Toast.makeText(temp1.this, "Converted successfully", Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueEntered=input.getText().toString();
                double c= Double.parseDouble(valueEntered);
                if(c>=-273.16){
                     double k= c+273;
                     ans.setText(""+k);
                     Toast.makeText(temp1.this, "Converted successfully", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(temp1.this, "Invalid entry", Toast.LENGTH_SHORT).show();
            }
        });
    }
}