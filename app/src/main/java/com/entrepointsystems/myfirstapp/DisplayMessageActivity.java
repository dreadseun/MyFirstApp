package com.entrepointsystems.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;

import com.entrepointsystems.myfirstapp.R;

public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Bundle customer_acknowledgment = getIntent().getExtras();
        String customer_firstname = customer_acknowledgment.getString("customer_firstname");
        String customer_surname = customer_acknowledgment.getString("customer_surname");

        TextView textView_firstname = new TextView(this);
        textView_firstname.setTextSize(40);
        textView_firstname.setText(customer_firstname);

        TextView textView_surname = new TextView(this);
        textView_surname.setTextSize(40);
        textView_surname.setText(customer_surname);


        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView_firstname);
        layout.addView(textView_surname);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.display_message, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
