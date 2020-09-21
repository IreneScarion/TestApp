package com.test.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class Eighthactivity extends AppCompatActivity {
    Button meme8,meme9,meme10,meme11,meme31;
    public AppCompatActivity packageContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighthactivity);
        meme8=findViewById(R.id.meme8);
        meme9=findViewById(R.id.meme8);
        meme10=findViewById(R.id.meme10);
        meme11=findViewById(R.id.meme11);
        meme31=findViewById(R.id.meme31);
        meme8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Eighthactivity.this,Football.class);
                startActivity(intent);
            }
        });
        meme9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Eighthactivity.this,Basketball.class);
                startActivity(intent);
            }
        });
        meme10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Eighthactivity.this,Badminton.class);
                startActivity(intent);
            }
        });
        meme11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Eighthactivity.this,Swimming.class);
                startActivity(intent);
            }
        });
        meme31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Eighthactivity.this,Foursquare.class);
                startActivity(intent);
            }
        });
    }
}