package com.example.iftek.edoctorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgFirstPage;
    RadioButton patient,doctor;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgFirstPage= (RadioGroup) findViewById(R.id.rgFirstPage);
        patient = (RadioButton) findViewById(R.id.rbPatient);
        button =(Button) findViewById(R.id.button);

        myListener();
    }
    public void myListener(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer rgId=rgFirstPage.getCheckedRadioButtonId();////bujtesina.....

                if(rgId.equals(R.id.rbDoctor)){
                    Intent regdIntentD= new Intent(MainActivity.this,RegistrationDoctor.class);
                    startActivity(regdIntentD);
                }
                if(rgId.equals(R.id.rbPatient)){
                    Intent regdIntentP= new Intent(MainActivity.this,RegistrationPatient.class);
                    startActivity(regdIntentP);
                }


            }
        });
    }
}

