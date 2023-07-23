package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class doctor1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor1);
        ImageView imageView = findViewById(R.id.profile);
        TextView name = findViewById(R.id.name);
        TextView email = findViewById(R.id.email);
        TextView phone = findViewById(R.id.phone);
        TextView field = findViewById(R.id.field);

        FirebaseStorage storage = FirebaseStorage.getInstance();
        StorageReference ref = storage.getReference();

//        Glide.with(getApplicationContext()).load(ref.child(String.format("photos/%s/download.jpg",getIntent().getStringExtra("id"))).getDownloadUrl().getResult()).into(imageView);

        ref.child(String.format("photos/%s.jpg",getIntent().getStringExtra("id"))).getDownloadUrl().addOnSuccessListener(taskUri->{
            imageView.setImageURI(Uri.parse(taskUri.toString()));
        }).addOnFailureListener(taskException->{
            Toast.makeText(this, taskException.getMessage(), Toast.LENGTH_SHORT).show();
            System.out.println(taskException);
        });

        name.setText(getIntent().getStringExtra("name"));
        email.setText(getIntent().getStringExtra("email"));
        phone.setText(getIntent().getStringExtra("phone"));
        field.setText(getIntent().getStringExtra("field"));

    }
}