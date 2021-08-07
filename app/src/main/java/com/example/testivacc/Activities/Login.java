package com.example.testivacc.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.testivacc.R;

public class Login extends AppCompatActivity {
    private EditText USERNAME;
    private EditText PASSWORD;
    private TextView INFO;
    private TextView INF;
    private Button Login;
    private Button SIGN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        USERNAME = findViewById(R.id.etUSERNAME);
        PASSWORD = findViewById(R.id.etPASSWORD);
        INFO = findViewById(R.id.tvINFO);
        INFO.setText("IF YOU DONT HAVE AN ACCOUNT,");
        INFO.setText("");
        SIGN = findViewById(R.id.btnSIGN);
        Login = findViewById(R.id.btnLogin);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = USERNAME.getText().toString().trim();
                String sPA = PASSWORD.getText().toString().trim();

                if (val.equals("") && sPA.equals("")) {

                    Toast.makeText(getApplicationContext(),
                            "Enter both Username and Password", Toast.LENGTH_SHORT).show();

                } else {
                    Intent tent = new Intent(Login.this,Fourth.class);
                    startActivity(tent);

                }
            }

        });

        SIGN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Login.this, Signin.class);
                startActivity(i);
                finish();
            }
  });
            }

            private boolean validate(String sUSERNAME, String sPASSWORD) {

                String val = USERNAME.getText().toString().trim();

                if (val.isEmpty()) {
                    USERNAME.setError("Field cant be empty");
                    return false;
                } else {
                    USERNAME.setError(null);
                    return true;
                }
            }

            private boolean validatepassa() {

                String sPA = PASSWORD.getText().toString().trim();
                if (sPA.isEmpty()) {
                    PASSWORD.setError("Insert password");
                    return false;
                } else {
                    PASSWORD.setError(null);
                    return true;
                }
            }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){

        }
        else if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){

        }
    }
}