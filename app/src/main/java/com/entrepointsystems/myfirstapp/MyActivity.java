package com.entrepointsystems.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MyActivity extends Activity {
    public final static String EXTRA_MESSAGE = "com.entrepointsystems.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
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

    public void confirmNewCustomer(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText customer_firstname = (EditText) findViewById(R.id.customer_firstname);
        String message_customer_firstname = customer_firstname.getText().toString();

        EditText customer_surname = (EditText) findViewById(R.id.customer_surname);
        String message_customer_surname = customer_surname.getText().toString();

        Bundle customer_acknowledgment = new Bundle();
        customer_acknowledgment.putString("customer_firstname", message_customer_firstname);
        customer_acknowledgment.putString("customer_surname", message_customer_surname);

        intent.putExtras(customer_acknowledgment);
        startActivity(intent);
    }
}
