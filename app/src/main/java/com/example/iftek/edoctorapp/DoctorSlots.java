package com.example.iftek.edoctorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoctorSlots extends AppCompatActivity {

    Button btTestslot1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_slots);

        btTestslot1=(Button) findViewById(R.id.btTestslot1);

        btTestslot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numberConf= new Intent(DoctorSlots.this,NumberConfirmation.class);
                DoctorSlots.this.startActivity(numberConf);
            }
        });

    }
}
