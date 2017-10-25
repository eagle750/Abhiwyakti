package com.example.jayesh123.abhiwyakti;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class Details extends AppCompatActivity {

    String vari;
    private  WebView wv;
    private String TAG = MainActivity.class.getSimpleName();
    private ListView lv;
    int result;
    Button register;
    String id,name,intro,rules,structure,contac,venue;
    TextView name1,intro1,rules1,struct1,contact1,venue1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        setTitle("Details");
        vari= getIntent().getStringExtra("jayesh");
        result = Integer.parseInt(vari);
        name1=(TextView)findViewById(R.id.name);
        intro1=(TextView)findViewById(R.id.intro);
        rules1=(TextView)findViewById(R.id.rules);
        struct1=(TextView)findViewById(R.id.struct);
        contact1=(TextView)findViewById(R.id.contact);
        venue1=(TextView)findViewById(R.id.venue);
        register=(Button)findViewById(R.id.register);
        new GetContacts().execute();
    }
    private class GetContacts extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(Details.this,"Json Data is downloading",Toast.LENGTH_LONG).show();
        }

        @Override
        protected Void doInBackground(Void... arg0)
        {
            HttpHandler sh = new HttpHandler();
            // Making a request to url and getting response
            String url = "http://divyabitp.in/jayesh/";
            String jsonStr = sh.makeServiceCall(url);

            Log.e(TAG, "Response from url: " + jsonStr);
            if (jsonStr != null) {
                try {
                    JSONObject jsonObj = new JSONObject(jsonStr);

                    // Getting JSON Array node
                    JSONArray contacts = jsonObj.getJSONArray("kitten");

                    // looping through All Contacts
                    //  for (int i = 0; i < contacts.length(); i++)
                    JSONObject c = contacts.getJSONObject(result);
                    id = c.getString("id");
                    name = c.getString("name");
                    intro = c.getString("intro");
                    rules = c.getString("rules");
                    structure = c.getString("structure");
                    venue=c.getString("venue");
                    contac = c.getString("contacts");

//                        // Phone node is JSON Object
//                        JSONObject phone = c.getJSONObject("phone");
//                        String mobile = phone.getString("mobile");
//                        String home = phone.getString("home");
//                        String office = phone.getString("office");

                    // tmp hash map for single contact
                        /*HashMap<String, String> contact = new HashMap<>();

                        // adding each child node to HashMap key => value
                        contact.put("id", id);
                        contact.put("name", name);
                        contact.put("intro", intro);


                        // adding contact to contact list
                        contactList.add(contact);*/
                } catch (final JSONException e) {
                    Log.e(TAG, "Json parsing error: " + e.getMessage());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplicationContext(),
                                    "Json parsing error: " + e.getMessage(),
                                    Toast.LENGTH_LONG).show();
                        }
                    });

                }

            } else {
                Log.e(TAG, "Couldn't get json from server.");
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),
                                "Couldn't get json from server. Check LogCat for possible errors!",
                                Toast.LENGTH_LONG).show();
                    }
                });
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
//            ListAdapter adapter = new SimpleAdapter(MainActivity.this, contactList,
//                    R.layout.list_item, new String[]{ "name","intro"},
//                    new int[]{R.id.email, R.id.mobile});
//            lv.setAdapter(adapter);
            name1.setText(name);
            intro1.setText(intro);
            rules1.setText(rules);
            struct1.setText(structure);
            contact1.setText(contac);
            venue1.setText(venue);
        }
    }
    public void register(View view)
    {
        wv = (WebView) findViewById(R.id.webview);
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        wv.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdfR3__7IurlxgAiBvNq5vAvVB7JBlvqgWOPWy1TDAeurJUTQ/viewform");
        wv.setWebViewClient(new WebViewClient());
    }
}
