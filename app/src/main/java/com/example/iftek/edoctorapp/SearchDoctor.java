package com.example.iftek.edoctorapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by iftek on 08-Dec-17.
 */

public class SearchDoctor extends Fragment {
    Button btSearchDoctor;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.searchdoctor,container,false);

        return view;
    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        final Spinner spDisease = (Spinner) view.findViewById(R.id.spDisease);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.DiseaseName, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spDisease.setAdapter(adapter);

        Spinner spCity = (Spinner) view.findViewById(R.id.spCity);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(getContext(),
                R.array.CityName, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spCity.setAdapter(adapter2);

        Spinner spSex = (Spinner) view.findViewById(R.id.spSex);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(getContext(),
                R.array.Sex, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spSex.setAdapter(adapter3);

        btSearchDoctor= (Button) view.findViewById(R.id.btSearchDoctor);

        btSearchDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doclist;
                doclist = new Intent(view.getContext(), DoctorList.class);
                DoctorList.setD(spDisease.getSelectedItem().toString());
                startActivity(doclist);
            }
        });

    }
}
