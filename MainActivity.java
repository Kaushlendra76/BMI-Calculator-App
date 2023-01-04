package com.kaushlendra.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnclick;
        TextView txtresult;
        EditText txtheightft, txtweightkg, txtheightinches;

        btnclick = findViewById(R.id.btnclk);
        txtresult = findViewById(R.id.textView);
        txtheightft = findViewById(R.id.txtheightft);
        txtheightinches = findViewById(R.id.txtheightinches);
        txtweightkg = findViewById(R.id.txt1weight);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int weight = Integer.parseInt( txtweightkg.getText().toString() );
               int ft = Integer.parseInt( txtheightft.getText().toString());
               int in = Integer.parseInt( txtheightinches.getText().toString());

               int totalin = ft*12 + in;
               double totalcm = totalin * 2.53;
               double totalM = totalcm/100;
               double bmi = weight/(totalM*totalM);

               if (bmi>25){
                   txtresult.setText("You are Overweight");
               }else if (bmi<18){
                   txtresult.setText("You are Under Weight");
               }else {
                   txtresult.setText("You are Healthy ");

               }

            }

        });
    }



}