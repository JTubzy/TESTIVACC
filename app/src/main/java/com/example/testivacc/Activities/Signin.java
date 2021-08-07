package com.example.testivacc.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.testivacc.R;
import com.example.testivacc.SplashScreen;

public class Signin extends AppCompatActivity {
    private EditText Lname;
    private EditText password;
    private TextView Fname;

    private EditText phone;
    private EditText Email;
    private Button Sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        Lname =  findViewById(R.id.etLname);
        password = findViewById(R.id.etPassword);
        Fname =  findViewById(R.id.etFname);
        phone =  findViewById(R.id.etPhone);
        Email = findViewById(R.id.etEmail);
        Sign =  findViewById(R.id.btnSign);

        Sign.setOnClickListener(new View.OnClickListener() {


//            private void validate(String Lname,String Fname, String password,String Email,String phone) {
//                if ((Fname == "") && (Lname == "") && (password == "") && (phone == "") && (Email == "")) {
//                    Intent intent = new Intent(Signin.this, Login.class);
//                   startActivity(intent);
//                    Sign.setEnabled(true);
//                } else {
//                    Sign.setEnabled(false);
//                }}
            @Override
            public void onClick(View v) {

                Lname.setText("");
                Fname.setText("");
                phone.setText("" );
                Email.setText("");
                password.setText("");
                String sLname=Lname.getText().toString().trim();
                String sFname =Fname.getText().toString().trim();
                String sphone =phone.getText().toString().trim();
                String sEmail= Email.getText().toString().trim();
                String spassword= password.getText().toString().trim();


                if (sLname.equals("") && sFname.equals("") && sphone.equals("") && sEmail.equals("") && spassword.equals("")) {
                    Intent intent = new Intent(Signin.this, Login.class);
                    startActivity(intent);
                    Sign.setEnabled(true);
                } else

                    Toast.makeText(getApplicationContext(),
                            "Enter All details", Toast.LENGTH_SHORT).show();
                            Sign.setEnabled(false);


            }
        });

    }}




