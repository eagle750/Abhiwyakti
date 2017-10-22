package com.example.jayesh123.abhiwyakti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Day2 extends AppCompatActivity {
    ImageButton ib6,ib7,ib8,ib9,ib10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2);
        setTitle("Day2");
        ib6=(ImageButton)findViewById(R.id.ib6);
        ib7=(ImageButton)findViewById(R.id.ib7);
        ib8=(ImageButton)findViewById(R.id.ib8);
        ib9=(ImageButton)findViewById(R.id.ib9);
        ib10=(ImageButton)findViewById(R.id.ib10);
    }

    public void ib6(View view)
    {
        String val = "10";
        Intent i1=new Intent(Day2.this,Details.class);
        startActivity(i1);
    }
    public void ib7(View view)
    {
        String val = "9";
        Intent i1=new Intent(Day2.this,Details.class);
        startActivity(i1);
    }
    public void ib8(View view)
    {
        String val = "6";
        Intent i1=new Intent(Day2.this,Details.class);
        startActivity(i1);
    }
    public void ib9(View view)
    {
        String val = "7";
        Intent i1=new Intent(Day2.this,Details.class);
        startActivity(i1);
    }
    public void ib10(View view)
    {
        String val = "8";
        Intent i1=new Intent(Day2.this,Details.class);
        startActivity(i1);
    }
}
