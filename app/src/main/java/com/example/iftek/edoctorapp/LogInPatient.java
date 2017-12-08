package com.example.iftek.edoctorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogInPatient extends AppCompatActivity {
    EditText etPatEmailL;
    EditText etPatPassL;
    Button btPatL;
    TextView tvShowP;
    TextView tvPatRegdHereL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_patient);

        etPatEmailL=(EditText) findViewById(R.id.etPatEmailL);
        etPatPassL=(EditText) findViewById(R.id.etPatPassL);
        btPatL=(Button) findViewById(R.id.btPatL);
        tvShowP=(TextView) findViewById(R.id.tvShowP);
        tvPatRegdHereL= (TextView) findViewById(R.id.tvPatRegdHereL);

        btPatL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomepgPat= new Intent(LogInPatient.this,HomePat.class);
                LogInPatient.this.startActivity(HomepgPat);
            }
        });
        tvPatRegdHereL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntentP= new Intent(LogInPatient.this,RegistrationPatient.class);
                LogInPatient.this.startActivity(registerIntentP);
            }
        });
    }
}