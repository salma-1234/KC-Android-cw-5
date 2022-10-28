package com.example.nameageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView nameTxt = findViewById(R.id.textView5);
        TextView ageTxt = findViewById(R.id.textView7);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("key1");
        String age = bundle.getString("key2");

        nameTxt.setText(name);
        ageTxt.setText(age);

    }
}