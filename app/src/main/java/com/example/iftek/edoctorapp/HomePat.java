package com.example.iftek.edoctorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class HomePat extends AppCompatActivity {

    Button btgo4DocP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_pat);

        btgo4DocP=(Button) findViewById(R.id.btgo4DocP);

        Intent TabbedActP=new Intent(HomePat.this,Main2ActivityP.class);
        HomePat.this.startActivity(TabbedActP);
    }
}
