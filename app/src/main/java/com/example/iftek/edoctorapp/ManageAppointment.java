package com.example.iftek.edoctorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManageAppointment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_appointment);


        Button btB2HomeD= (Button) findViewById(R.id.btB2HomeD);

        btB2HomeD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b2Home= new Intent(ManageAppointment.this,Main3Activity.class);
                startActivity(b2Home);
            }
        });

    }
}
