package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class SetupActivity extends AppCompatActivity {

    int upLimit=20;
    int lowLimit=20;

    Button setupplus,setupminus,lowplus,lowminus;
    EditText upValue,lowValue;

    CheckBox upTit,upSes,lowTit,lowSes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        setupplus=(Button) findViewById(R.id.setupplus);
        setupminus=(Button) findViewById(R.id.setupminus);
        upValue=(EditText) findViewById(R.id.upperLimit);

        lowplus=(Button) findViewById(R.id.lowPlus);
        lowminus=(Button) findViewById(R.id.lowMinus);
        lowValue=(EditText) findViewById(R.id.lowLimit);

        upTit = (CheckBox) findViewById(R.id.uptit);
        upSes = (CheckBox) findViewById(R.id.upSes);
        lowTit = (CheckBox) findViewById(R.id.lowTit);
        lowSes = (CheckBox) findViewById(R.id.lowSes);

        upValue.setText(String.valueOf(upLimit));
        lowValue.setText(String.valueOf(lowLimit));

        setupplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upLimit++;
                upValue.setText(String.valueOf(upLimit));
            }
        });

        setupminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upLimit--;
                upValue.setText(String.valueOf(upLimit));
            }
        });

        lowplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lowLimit++;
                lowValue.setText(String.valueOf(lowLimit));
            }
        });

        lowminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lowLimit--;
                lowValue.setText(String.valueOf(lowLimit));
            }
        });
    }
}