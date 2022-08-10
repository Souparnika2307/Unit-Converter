package com.example.myappconverter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class temp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp2);
        EditText input=findViewById(R.id.ans);
        Button button=findViewById(R.id.button);
        Button button1=findViewById(R.id.button2);
        TextView ans=findViewById(R.id.textView4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueEntered=input.getText().toString();
                double f= Double.parseDouble(valueEntered);
                double c= (f-32)*0.55;
                ans.setText(""+c);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String valueEntered=input.getText().toString();
                double f= Double.parseDouble(valueEntered);
                double k= (f-32)*0.55+273;
                ans.setText(""+k);

            }
        });
    }
}