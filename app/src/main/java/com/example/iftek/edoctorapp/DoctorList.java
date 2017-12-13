package com.example.iftek.edoctorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DoctorList extends AppCompatActivity {

    Button btTestDoclist;
    static String d;

    public static void setD(String d) {
        DoctorList.d = d;

    }
    TextView disease;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_list);
        btTestDoclist =(Button) findViewById(R.id.btTestDoclist);
        disease = (TextView) findViewById(R.id.tvDiseaseName);
        disease.setText(d);

        btTestDoclist.setOnClickListener(new View.OnClickListener() {//Just For Testing
            @Override
            public void onClick(View v) {
                //Toast.makeText(DoctorList.this,d,Toast.LENGTH_LONG).show();
                Intent docDesignation=new Intent(DoctorList.this,DoctorDesignation.class);
                DoctorList.this.startActivity(docDesignation);
            }
        });


    }
}
