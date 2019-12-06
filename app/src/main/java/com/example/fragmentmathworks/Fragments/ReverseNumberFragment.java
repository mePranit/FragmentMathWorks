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
public class ReverseNumberFragment extends Fragment implements View.OnClickListener{


    Button btnReverse;
    EditText number;
    public ReverseNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reverse_number, container, false);
        number=view.findViewById(R.id.txtReverseNumber);
        btnReverse=view.findViewById(R.id.btnReverseNum);
        btnReverse.setOnClickListener(this);
        return  view;
    }

    @Override
    public void onClick(View v) {
        int first=Integer.parseInt(number.getText().toString());
        int reversed = 0;
        while (first != 0) {
            int digit = first % 10;
            reversed = reversed * 10 + digit;
            first /= 10;
        }
        Toast.makeText(getActivity(), "Reversed number is"+reversed, Toast.LENGTH_SHORT).show();

    }
}
