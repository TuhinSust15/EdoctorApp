package com.example.iftek.edoctorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoctorDesignation extends AppCompatActivity {
    Button btProceed2Doc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_designation);
        btProceed2Doc= (Button) findViewById(R.id.btProceed2Doc);
        btProceed2Doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent docSlot= new Intent(DoctorDesignation.this,DoctorSlots.class);
                DoctorDesignation.this.startActivity(docSlot);
            }
        });

    }
}
