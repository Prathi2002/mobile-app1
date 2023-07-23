package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        ImageView mood_deduct = findViewById(R.id.deduct_mood);
        ImageView consult = findViewById(R.id.consult);
        mood_deduct.setOnClickListener(v->{
            startActivity(new Intent(options.this,feeling.class));
        });
        consult.setOnClickListener(v->{
            startActivity(new Intent(options.this,doctor.class));
        });

    }
}