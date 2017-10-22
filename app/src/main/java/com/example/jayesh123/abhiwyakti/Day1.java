package com.example.jayesh123.abhiwyakti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Day1 extends AppCompatActivity {
    ImageButton ib1,ib2,ib3,ib4,ib5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1);
        setTitle("Day1");
        ib1=(ImageButton)findViewById(R.id.ib1);
        ib2=(ImageButton)findViewById(R.id.ib2);
        ib3=(ImageButton)findViewById(R.id.ib3);
        ib4=(ImageButton)findViewById(R.id.ib4);
        ib5=(ImageButton)findViewById(R.id.ib5);
    }


    public void ib1(View view)
    {
        String val = "2";
        Intent i1=new Intent(Day1.this,Details.class);
        i1.putExtra("jayesh",val);
        startActivity(i1);
    }
    public void ib2(View view)
    {
        String val = "3";

        Intent i1=new Intent(Day1.this,Details.class);
        startActivity(i1);
    }
    public void ib3(View view)
    {
        String val = "4";
        Intent i1=new Intent(Day1.this,Details.class);
        startActivity(i1);
    }
    public void ib4(View view)
    {
        String val = "5";
        Intent i1=new Intent(Day1.this,Details.class);
        startActivity(i1);
    }
    public void ib5(View view)
    {
        String val="1";
        Intent i1=new Intent(Day1.this,Details.class);

        startActivity(i1);
    }
}
