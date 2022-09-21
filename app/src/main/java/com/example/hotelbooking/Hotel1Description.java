package com.example.hotelbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Hotel1Description extends AppCompatActivity {

    TextView userId;
    EditText noOfNights;
    Button book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel1_description);

        userId = findViewById(R.id.textView3);
        noOfNights = findViewById(R.id.editTextTextPersonName3);
        book = findViewById(R.id.button4);

        userId.setText(getIntent().getStringExtra("user"));

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), LastPage.class);
                String nights = noOfNights.getText().toString();
                int total = Integer.parseInt(nights) * 200;
                String value = String.valueOf(total);
                i.putExtra("total",value);
                startActivity(i);
            }
        });


    }
}