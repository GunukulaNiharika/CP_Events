package com.example.cpevents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Cont_url extends AppCompatActivity {
EditText Url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cont_url);
        Url=findViewById(R.id.url);
        Url.setText(getIntent().getStringExtra("url"));
    }
}
