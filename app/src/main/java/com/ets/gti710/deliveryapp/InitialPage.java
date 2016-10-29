package com.ets.gti710.deliveryapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ets.gti710.deliveryapp.utils.ApiHttpCall;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class InitialPage extends AppCompatActivity {

    private static Button command_button;
    private TextView uiUpdate;
    private Intent intent;
    private  String Content;
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_page);

    }

    public void getCommand(View view)
    {
        intent = new Intent(InitialPage.this, commandList.class);
        new obtenirListCommande().execute();
    }

    private class obtenirListCommande extends AsyncTask<Void, Integer, Void> {

        String url = String.format("https://api.ipify.org?format=json");

        private String Error = null;
        private ProgressDialog Dialog = new ProgressDialog(InitialPage.this);

        @Override
        protected Void doInBackground(Void... params) {
            ApiHttpCall util = new ApiHttpCall();
            Content = util.requestContent(url);
            return null;
        }

        protected void onPreExecute() {
            // NOTE: You can call UI Element here.
            //Start Progress Dialog (Message)
            Dialog.setMessage("Please wait..");
            Dialog.show();
        }

        // Call after onPreExecute method


        protected void onPostExecute(Void unused) {
            // NOTE: You can call UI Element here.
            // Close progress dialog

            Dialog.dismiss();

            if (Error != null) {

                uiUpdate.setText("Output : "+Error);

            } else {

                // Show Response Json On Screen (activity)
                intent.putExtra("messageEnvoye",Content);
                startActivity(intent);
            }
        }
    }

}
