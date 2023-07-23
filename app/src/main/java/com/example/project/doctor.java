package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class doctor extends AppCompatActivity {


    String nameOne = "";
    String emailOne = "";
    String fieldOne = "";
    String phoneOne = "";


    String nameTwo = "";
    String emailTwo = "";
    String fieldTwo = "";
    String phoneTwo = "";


    String nameThree = "";
    String emailThree = "";
    String fieldThree = "";
    String phoneThree = "";


    String nameFour = "";
    String emailFour = "";
    String fieldFour = "";
    String phoneFour = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
        ImageView doc1 = (ImageView) findViewById(R.id.doc1);
        TextView doc1Name = findViewById(R.id.doc1name);


        FirebaseFirestore firestore = FirebaseFirestore.getInstance();
        FirebaseStorage storage = FirebaseStorage.getInstance();
        StorageReference ref = storage.getReference();



        ref.child("photos/one.jpg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                doc1.setImageURI(uri);
            }
        }).addOnFailureListener(taskException->{
            Toast.makeText(this, taskException.getMessage(), Toast.LENGTH_SHORT).show();
            System.out.println(taskException);
        });


        firestore.collection("doctor")
                .document("one")
                .get().addOnSuccessListener(task ->{

                    nameOne = task.getString("name");
                    emailOne = task.getString("email");
                    fieldOne = task.getString("field");
                    phoneOne = task.getString("phone");
                    doc1Name.setText(task.getString("name"));
                });

        doc1.setOnClickListener(v->{
//            startActivity(new Intent(doctor.this ,doctor1.class));
            Intent intent = new Intent(doctor.this,doctor1.class);
            intent.putExtra("id","one");
            intent.putExtra("name",nameOne);
            intent.putExtra("email",emailOne);
            intent.putExtra("field",fieldOne);
            intent.putExtra("phone",phoneOne);
            startActivity(intent);
        });

        doc2.setOnClickListener(v->{
//            startActivity(new Intent(doctor.this ,doctor2.class));
            Intent intent = new Intent(doctor.this,doctor1.class);
            intent.putExtra("id","two");
            intent.putExtra("name",nameTwo);
            intent.putExtra("email",emailTwo);
            intent.putExtra("field",fieldTwo);
            intent.putExtra("phone",phoneTwo);
            startActivity(intent);
        });


        doc3.setOnClickListener(v->{
//            startActivity(new Intent(doctor.this ,doctor3.class));
            Intent intent = new Intent(doctor.this,doctor1.class);
            intent.putExtra("id","three");
            intent.putExtra("name",nameThree);
            intent.putExtra("email",emailThree);
            intent.putExtra("field",fieldThree);
            intent.putExtra("phone",phoneThree);
            startActivity(intent);
        });

        doc4.setOnClickListener(v->{
//            startActivity(new Intent(doctor.this ,doctor4.class));
            Intent intent = new Intent(doctor.this,doctor1.class);
            intent.putExtra("id","four");
            intent.putExtra("name",nameFour);
            intent.putExtra("email",emailFour);
            intent.putExtra("field",fieldFour);
            intent.putExtra("phone",phoneFour);
            startActivity(intent);
        });

    }
}