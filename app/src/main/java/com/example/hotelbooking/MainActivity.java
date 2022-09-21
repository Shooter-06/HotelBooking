package com.example.hotelbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // my login id = admin1234
    // my password = pass1234

    Button login;
    EditText userName, userPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   //     login = findViewById(R.id.button);
        userName = findViewById(R.id.editTextTextPersonName);
        userPassword = findViewById(R.id.editTextTextPersonName2);

//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String loginID = "admin1234";
//                String loginPassword = "pass1234";
//                if(userName.getText().toString().equals(loginID) &&
//                userPassword.getText().toString().equals(loginPassword)) {
//                    Intent i  = new Intent(getApplicationContext(), HomePage.class);
//                    loginID = "Admin";
//                    i.putExtra("user",loginID);
//                    startActivity(i);
//
//                } else {
//
//                    Toast.makeText(getApplicationContext(), "please enter the valid username and password",
//                            Toast.LENGTH_LONG).show();
//                }
//            }
//        });
    }

    public void connect(View view) {
        String loginID = "admin1234";
        String loginPassword = "pass1234";
        userName = findViewById(R.id.editTextTextPersonName);
        userPassword = findViewById(R.id.editTextTextPersonName2);
        if(userName.getText().toString().equals(loginID) &&
                userPassword.getText().toString().equals(loginPassword)) {
            Intent i  = new Intent(getApplicationContext(), HomePage.class);
            loginID = "Admin";
            i.putExtra("user",loginID);
            startActivity(i);

        } else {

            Toast.makeText(getApplicationContext(), "please enter the valid username and password",
                    Toast.LENGTH_LONG).show();
        }
    }
}