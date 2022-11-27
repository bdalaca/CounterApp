package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView value;
    Button btnminus, btnplus, btnsetup;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value=(TextView) findViewById(R.id.value);
        btnminus=(Button) findViewById(R.id.btnminus);
        btnplus=(Button) findViewById(R.id.btnplus);
        btnsetup=(Button) findViewById(R.id.btnsetup);

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                value.setText(String.valueOf(counter));
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                value.setText(String.valueOf(counter));
            }
        });

        btnsetup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SetupActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public  boolean onKeyDown(int keyCode, KeyEvent event){
        if(keyCode== KeyEvent.KEYCODE_VOLUME_UP){
            counter+=5;
            value.setText(String.valueOf(counter));
        }else if(keyCode==KeyEvent.KEYCODE_VOLUME_DOWN){
            counter-=5;
            value.setText(String.valueOf(counter));
        }
    return true;
    }

}