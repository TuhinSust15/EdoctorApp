package com.example.iftek.edoctorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class HomeDoc extends AppCompatActivity {

    Button btgoApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_doc);

        btgoApp=(Button) findViewById(R.id.btgoApp);

        Intent TabbedActP=new Intent(HomeDoc.this,Main3Activity.class);
        HomeDoc.this.startActivity(TabbedActP);
    }
}
