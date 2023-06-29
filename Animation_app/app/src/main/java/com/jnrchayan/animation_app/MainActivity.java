package com.jnrchayan.animation_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView texxt;
        Button bt,bta,btr,sc;
        bt = findViewById(R.id.btt);
        bta = findViewById(R.id.bta);
        btr = findViewById(R.id.btr);
        texxt = findViewById(R.id.tex);
        sc = findViewById(R.id.bts);
        Animation move = AnimationUtils.loadAnimation(this,R.anim.move);
        Animation alph = AnimationUtils.loadAnimation(this,R.anim.alpha);
        Animation rote = AnimationUtils.loadAnimation(this,R.anim.rote);
        Animation scal = AnimationUtils.loadAnimation(this,R.anim.scal);
        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texxt.startAnimation(scal);
            }
        });
        btr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texxt.startAnimation(rote);
            }
        });
        bta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texxt.startAnimation(alph);
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texxt.startAnimation(move);


            }
        });

    }
}