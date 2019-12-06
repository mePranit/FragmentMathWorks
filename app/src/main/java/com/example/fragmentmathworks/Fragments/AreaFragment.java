package com.example.fragmentmathworks.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragmentmathworks.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreaFragment extends Fragment implements View.OnClickListener{

    EditText length,breath;
    Button area;

    public AreaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_area, container, false);

        length=view.findViewById(R.id.txtLength);
        breath=view.findViewById(R.id.txtBreath);
        area=view.findViewById(R.id.btnArea);
        area.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int first=Integer.parseInt(length.getText().toString());
        int second=Integer.parseInt(breath.getText().toString());
        int result=first*second;

        Toast.makeText(getActivity(), "Area is"+result, Toast.LENGTH_SHORT).show();


    }
}
