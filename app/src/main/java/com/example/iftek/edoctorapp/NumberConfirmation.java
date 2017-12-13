package com.example.iftek.edoctorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NumberConfirmation extends AppCompatActivity {

 //EditText etConfirmNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_confirmation);

        Button  btNumConfirm=(Button)findViewById(R.id.btNumConfirm);

        btNumConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent numConfirmed= new Intent(NumberConfirmation.this,SuccessBook.class);
                NumberConfirmation.this.startActivity(numConfirmed);
            }
        });
    }
}
