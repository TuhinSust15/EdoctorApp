package com.example.iftek.edoctorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuccessBook extends AppCompatActivity {

    Button btConfirmed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_book);

        btConfirmed =(Button) findViewById(R.id.btConfirmed);

        btConfirmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back2Home= new Intent(SuccessBook.this,HomePat.class);
                SuccessBook.this.startActivity(back2Home);
               // github/sarafinmahtab
            }
        });
    }
}
