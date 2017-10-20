package com.example.jayesh123.abhiwyakti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        setTitle("Events");
    }
    public void button1(View view)
    {
        Intent i1=new Intent(Events.this,Day1.class);
        startActivity(i1);
    }
    public void button2(View view)
    {
        Intent i1=new Intent(Events.this,Day2.class);
        startActivity(i1);
    }
    public void button3(View view)
    {
        Intent i1=new Intent(Events.this,Day2.class);
        startActivity(i1);
    }
}
