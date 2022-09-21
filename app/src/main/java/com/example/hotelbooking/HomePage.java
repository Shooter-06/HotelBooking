package com.example.hotelbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    TextView userText;

    Button info1, info2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        userText = findViewById(R.id.textView2);
        info1 = findViewById(R.id.button2);
        info2 = findViewById(R.id.button3);

        userText.setText(getIntent().getStringExtra("user"));

        info1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),
                        Hotel1Description.class);
               String loginID = "Admin";
                i.putExtra("user",loginID);
                startActivity(i);
            }
        });
    }
}