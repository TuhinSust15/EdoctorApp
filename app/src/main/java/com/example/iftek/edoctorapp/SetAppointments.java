package com.example.iftek.edoctorapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;

/**
 * Created by iftek on 12-Dec-17.
 */

public class SetAppointments extends Fragment {
    View calendarViewD;
    Button btDateDoc ;
    EditText etSetTime;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.setappointment,container,false);
    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btDateDoc =(Button) view.findViewById(R.id.btDateDoc);
        calendarViewD = (CalendarView) view.findViewById(R.id.calendarViewD);
        etSetTime= (EditText) view.findViewById(R.id.etSetTime);

        btDateDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent timeSlot=new Intent(view.getContext(),ManageAppointment.class);
                SetAppointments.this.startActivity(timeSlot);
            }
        });
    }
}
