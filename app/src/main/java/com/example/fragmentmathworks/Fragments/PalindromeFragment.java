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
public class PalindromeFragment extends Fragment implements View.OnClickListener{


    EditText number;
    Button Calculate;
    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_palindrome, container, false);
        number=view.findViewById(R.id.txtPalindrome);
        Calculate=view.findViewById(R.id.btnPalindrome);
        Calculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        int first=Integer.parseInt(number.getText().toString());
        int a=first;

        int reversed = 0;
        while (first != 0) {
            int digit = first % 10;
            reversed = reversed * 10 + digit;
            first /= 10;
        }
        // palindrome if orignalInteger and reversedInteger are equal
        if (a == reversed)
            Toast.makeText(getActivity(), "This is palindrome", Toast.LENGTH_SHORT).show();

        else
            Toast.makeText(getActivity(), "This is not Palindrome", Toast.LENGTH_SHORT).show();
        //Toast.makeText(getActivity(), "This is"+result, Toast.LENGTH_SHORT).show();
    }
}
