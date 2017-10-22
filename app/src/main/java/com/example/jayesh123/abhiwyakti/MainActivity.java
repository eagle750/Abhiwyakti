package com.example.jayesh123.abhiwyakti;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
        Timer timer=new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(),2000,3000);

    }

    //mycode
    public class MyTimerTask extends TimerTask{

        @Override
        public void run() {

            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(viewPager.getCurrentItem()==0){
                        viewPager.setCurrentItem(1);
                    }
                    else
                    if(viewPager.getCurrentItem()==1){
                        viewPager.setCurrentItem(2);
                    }
                    else
                    if(viewPager.getCurrentItem()==2){
                        viewPager.setCurrentItem(3);
                    }
                    else
                    if(viewPager.getCurrentItem()==3){
                        viewPager.setCurrentItem(4);
                    }
                    else
                    if(viewPager.getCurrentItem()==4){
                        viewPager.setCurrentItem(5);
                    }
                    else
                    if(viewPager.getCurrentItem()==5){
                        viewPager.setCurrentItem(6);
                    }
                    else
                    if(viewPager.getCurrentItem()==6){
                        viewPager.setCurrentItem(7);
                    }
                    else
                    if(viewPager.getCurrentItem()==7){
                        viewPager.setCurrentItem(8);
                    }
                    else
                        viewPager.setCurrentItem(0);
                }
            });
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.register) {
            return true;
         //   String li;
          //  li=getIntent().getStringExtra("new_variable_name");
            //wv = (WebView) findViewById(R.id.web);
           // WebSettings ws = wv.getSettings();
          //  ws.setJavaScriptEnabled(true);
           // wv.loadUrl(li);
          //  wv.setWebViewClient(new WebViewClient());

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {
            Intent i1 = new Intent(MainActivity.this, MainActivity.class);
            startActivity(i1);

        } else if (id == R.id.Event) {
            Intent i1 = new Intent(MainActivity.this, Events.class);
            startActivity(i1);

        } else if (id == R.id.Gallery) {

        } else if (id == R.id.Contact) {
            Intent i1 = new Intent(MainActivity.this, Contact.class);
            startActivity(i1);

        } else if (id == R.id.nav_share) {

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
