package com.jnrchayan.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtresult;
        EditText edtweight,edthightft,edthightin;
        Button cal;


        edtweight = findViewById(R.id.eweight);
        edthightft=findViewById(R.id.ehightft);
        edthightin = findViewById(R.id.ehightin);
        cal = findViewById(R.id.button);
        txtresult = findViewById(R.id.result);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             int wt  = Integer.parseInt(edtweight.getText().toString());
             int hft = Integer.parseInt(edthightin.getText().toString());
             int hin = Integer.parseInt(edthightft.getText().toString());

             int totalin = hft*12 + hin;
             double totalcm = totalin*2.53;
             double totaln=totalcm/100;
             double bmi= wt/(totaln*totaln);

             if (bmi>25)
             {
                 txtresult.setText("You are overhight");
             } else if (bmi <18) {
                 txtresult.setText("You are underweight");

             }
             else
             {
                 txtresult.setText("You are helthty");
             }
            }

        });

    }
}