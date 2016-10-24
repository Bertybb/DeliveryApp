package com.ets.gti710.deliveryapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.ProgressDialog;
import android.util.Log;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private static EditText username;
    private static EditText password;
    private static TextView attempt;
    private static Button login_button;
    int attempt_counter=5;

    private static final String TAG = "LoginActivity";
    private static final int REQUEST_SIGNUP = 0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginButton();
    }

        public void LoginButton(){
        username = (EditText)findViewById(R.id.input_email);
        password = (EditText)findViewById(R.id.input_password);
        login_button = (Button)findViewById(R.id.btn_login);

        login_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (username.getText().toString().equals("user") &&
                                password.getText().toString().equals("pass")){
                            Toast.makeText(Login.this,"Username and password is correct",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Login.this,InitialPage.class);
                            startActivity(intent);

                        }
                        else {
                            Toast.makeText(Login.this,"Username and password is NOT correct",
                                    Toast.LENGTH_SHORT).show();
                                login_button.setEnabled(true);
                        }
                    }
                }
        );
    }


}
