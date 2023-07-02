package com.jnrchayan.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listv;
Spinner sp;
AutoCompleteTextView my;
ArrayList<String> arrname = new ArrayList<>();
ArrayList<String> arrsp = new ArrayList<>();
ArrayList<String> arrauto = new ArrayList<>();

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View ID Find

        sp = findViewById(R.id.sp);
        listv = findViewById(R.id.listv);
        my = findViewById(R.id.autolisst);

        //List View Arrlist item

        arrname.add("Ram");
        arrname.add("Sam") ;
        arrname.add("Gam"); arrname.add("Ram");
        arrname.add("Sam") ;
        arrname.add("Gam"); arrname.add("Ram");
        arrname.add("Sam") ;
        arrname.add("Gam"); arrname.add("Ram");
        arrname.add("Sam") ;
        arrname.add("Gam"); arrname.add("Ram");
        arrname.add("Sam") ;
        arrname.add("Gam"); arrname.add("Ram");


        ArrayAdapter<String> adapter =new ArrayAdapter<> (getApplicationContext(), android.R.layout.simple_list_item_1,arrname);

        listv.setAdapter(adapter);

        // list item click code

        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Toast.makeText(MainActivity.this, "click 1 number itme", Toast.LENGTH_SHORT).show();
                }
                if(i==3)
                {
                    Toast.makeText(MainActivity.this, "click 3 number itme", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Spinner Code

        arrsp.add("chayan");
        arrsp.add("jnr");
        arrsp.add("roy");

        ArrayAdapter<String> spad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrsp);

        sp.setAdapter(spad);

        // Auto complete TextView
        arrauto.add("chayan");
        arrauto.add("roy");
        arrauto.add("jnr");
        arrauto.add("JNRroy");

        ArrayAdapter<String>  autolist = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrauto);

        my.setAdapter(autolist);


    }
}