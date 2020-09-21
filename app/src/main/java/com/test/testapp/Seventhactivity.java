package com.test.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class Seventhactivity extends AppCompatActivity {
    Button meme13,meme14,meme15,meme16,meme17;
    private AppCompatActivity packageContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventhactivity);
        meme13=findViewById(R.id.meme13);
        meme14=findViewById(R.id.meme14);
        meme15=findViewById(R.id.meme15);
        meme16=findViewById(R.id.meme16);
        meme17=findViewById(R.id.meme17);
        meme13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Seventhactivity.this,Yoga.class);
                startActivity(intent);
            }
        });
        meme14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Seventhactivity.this,Darts.class);
                startActivity(intent);
            }
        });
        meme15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Seventhactivity.this,Chess.class);
                startActivity(intent);
            }
        });
        meme16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Seventhactivity.this,Hollahooping.class);
                startActivity(intent);
            }
        });
        meme17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Seventhactivity.this,Jigsawpuzzle.class);
                startActivity(intent);
            }
        });
    }
}