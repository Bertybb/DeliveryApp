package com.ets.gti710.deliveryapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.ets.gti710.deliveryapp.utils.ApiHttpCall;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class commandList extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_list);
        Intent intent = getIntent();
        String message = intent.getStringExtra("messageEnvoye");
        TextView textView = (TextView) findViewById(R.id.edit_message);
        textView.setText(message);


    }
}
