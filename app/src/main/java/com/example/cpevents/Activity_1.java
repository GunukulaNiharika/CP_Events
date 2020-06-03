package com.example.cpevents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity_1 extends AppCompatActivity {
   TextView hiract,hirup,conup,conact,hackact,hackup,dsqact,dsqup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        hiract=findViewById(R.id.hiract);
        hirup=findViewById(R.id.hirup);
        conact=findViewById(R.id.conact);
        conup=findViewById(R.id.conup);
        hackact=findViewById(R.id.hackact);
        hackup=findViewById(R.id.hackup);
        dsqact=findViewById(R.id.dsqact);
        dsqup=findViewById(R.id.dsqup);

        hiract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              startActivity(new Intent(Activity_1.this,hiring1.class));
            }
        });
        hirup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity_1.this,hiring2.class));
            }
        });
        conact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity_1.this, contest1.class));
            }
        });
        conup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity_1.this, contest2.class));
            }
        });
        hackact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity_1.this, hackathon1.class));
            }
        });
        hackup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity_1.this, hackathon2.class));
            }
        });
        dsqact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity_1.this, dsq1.class));
            }
        });
        dsqup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity_1.this, dsq2.class));
            }
        });
    }
}
