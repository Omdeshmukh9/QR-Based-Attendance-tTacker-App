package com.kazimasum.qrdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button scanbtn;
    Button button;
    Button button1;
    public static TextView scantext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scantext=(TextView)findViewById(R.id.scantext);
        scanbtn=(Button) findViewById(R.id.scanbtn);
        button=(Button)findViewById(R.id.button1);
        button1=(Button)findViewById(R.id.button2);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i  = new Intent(MainActivity.this, AttendanceListView.class);
                    startActivity(i);

                }

            });
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent j  = new Intent(MainActivity.this, QRC.class);
                    startActivity(j);

                }
            });
            scanbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    startActivity(new Intent(getApplicationContext(),scannerView.class));
                }


            });
    }
}