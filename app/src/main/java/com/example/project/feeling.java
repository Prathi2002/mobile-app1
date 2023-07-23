package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class feeling extends AppCompatActivity {
    Button sad;
    Button depressed;
    Button lonely;
    Button badday;
    Button motivation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeling);

        sad = findViewById(R.id.button1);
        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity
                Intent intent = new Intent(getApplicationContext(),sad.class);
                startActivity(intent);
            }
        });

        depressed = findViewById(R.id.button2);
        depressed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity
                Intent intent = new Intent(getApplicationContext(),depressed.class);
                startActivity(intent);
            }
        });


        lonely = findViewById(R.id.button3);
        lonely.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity
                Intent intent = new Intent(getApplicationContext(),lonely.class);
                startActivity(intent);
            }
        });

        badday = findViewById(R.id.button1);
        badday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity
                Intent intent = new Intent(getApplicationContext(),badday.class);
                startActivity(intent);
            }
        });

        depressed = findViewById(R.id.button1);
        depressed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity
                Intent intent = new Intent(getApplicationContext(),depressed.class);
                startActivity(intent);
            }
        });
    }

}