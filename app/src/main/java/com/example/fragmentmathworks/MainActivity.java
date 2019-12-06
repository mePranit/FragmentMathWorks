package com.example.fragmentmathworks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentmathworks.Fragments.AreaFragment;
import com.example.fragmentmathworks.Fragments.AutomorphicFragment;
import com.example.fragmentmathworks.Fragments.PalindromeFragment;
import com.example.fragmentmathworks.Fragments.ReverseNumberFragment;
import com.example.fragmentmathworks.Fragments.ReverseStringFragment;
import com.example.fragmentmathworks.Fragments.SumFragment;

public class MainActivity extends AppCompatActivity {

    Button btnAdd,btnArea,btnPalindrome,btnReverseString,btnReverseNumber,btnAutomorphic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = findViewById(R.id.btnAdd);
        btnArea = findViewById(R.id.btnArea);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnReverseString = findViewById(R.id.btnReverseString);
        btnReverseNumber = findViewById(R.id.btnReverseNumber);
        btnAutomorphic = findViewById(R.id.btnAutomorphic);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                SumFragment addFragment=new SumFragment();
                fragmentTransaction.replace(R.id.container,addFragment);
                fragmentTransaction.commit();

            }
        });
        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                AreaFragment areaFragment=new AreaFragment();
                fragmentTransaction.replace(R.id.container,areaFragment);
                fragmentTransaction.commit();

            }
        });
        btnPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                PalindromeFragment palindromeFragment=new PalindromeFragment();
                fragmentTransaction.replace(R.id.container,palindromeFragment);
                fragmentTransaction.commit();
            }
        });
        btnReverseString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                ReverseStringFragment reverseStringFragment=new ReverseStringFragment();
                fragmentTransaction.replace(R.id.container,reverseStringFragment);
                fragmentTransaction.commit();
            }
        });
        btnReverseNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                ReverseNumberFragment reverseNumberFragment=new ReverseNumberFragment();
                fragmentTransaction.replace(R.id.container,reverseNumberFragment);
                fragmentTransaction.commit();
            }
        });
        btnAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                AutomorphicFragment automorphicFragment=new AutomorphicFragment();
                fragmentTransaction.replace(R.id.container,automorphicFragment);
                fragmentTransaction.commit();
            }
        });
        
    }
}
