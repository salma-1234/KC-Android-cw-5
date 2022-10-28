package com.example.nameageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameTxt = findViewById(R.id.editTextTextPersonName);
        EditText ageTxt = findViewById(R.id.editTextTextPersonName2);
        Button enter = findViewById(R.id.button);


        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name, age;

                name = nameTxt.getText().toString();
                age = ageTxt.getText().toString();


                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("key1", name);
                intent.putExtra("key2", age);
                startActivity(intent);


            }

        });
    }}
