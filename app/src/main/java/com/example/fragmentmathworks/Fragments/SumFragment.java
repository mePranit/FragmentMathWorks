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
public class SumFragment extends Fragment implements View.OnClickListener {


    EditText txtFirst,txtSecond;
    Button btnAdd;

    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sum, container, false);
        txtFirst=view.findViewById(R.id.txtFirst);
        txtSecond=view.findViewById(R.id.txtSecond);
        btnAdd=view.findViewById(R.id.btnSum);

        btnAdd.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        int first=Integer.parseInt(txtFirst.getText().toString());
        int second=Integer.parseInt(txtSecond.getText().toString());
        int result=first+second;

        Toast.makeText(getActivity(), "Sum is"+result, Toast.LENGTH_SHORT).show();

    }
}
