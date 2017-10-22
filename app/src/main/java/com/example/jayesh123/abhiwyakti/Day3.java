package com.example.jayesh123.abhiwyakti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Day3 extends AppCompatActivity {
    ImageButton ib11,ib12,ib13,ib14,ib15,ib16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day3);
        setTitle("Day3");
        ib11=(ImageButton)findViewById(R.id.ib11);
        ib12=(ImageButton)findViewById(R.id.ib12);
        ib13=(ImageButton)findViewById(R.id.ib13);
        ib14=(ImageButton)findViewById(R.id.ib14);
        ib15=(ImageButton)findViewById(R.id.ib15);
        ib16=(ImageButton)findViewById(R.id.ib16);


    }

    public void ib11(View view)
    {
        String val = "5";
        Intent i1=new Intent(Day3.this,Details.class);
        startActivity(i1);
    }
    public void ib12(View view)
    {
        String val = "11";
        Intent i1=new Intent(Day3.this,Details.class);
        startActivity(i1);
    }
    public void ib13(View view)
    {
        String val = "6";
        Intent i1=new Intent(Day3.this,Details.class);
        startActivity(i1);
    }
    public void ib14(View view)
    {
        String val = "7";
        Intent i1=new Intent(Day3.this,Details.class);
        startActivity(i1);
    }
    public void ib15(View view)
    {
        String val = "8";
        Intent i1=new Intent(Day3.this,Details.class);
        startActivity(i1);
    }
    public void ib16(View view)
    {
        String val = "2";
        Intent i1=new Intent(Day3.this,Details.class);
        startActivity(i1);
    }
}
