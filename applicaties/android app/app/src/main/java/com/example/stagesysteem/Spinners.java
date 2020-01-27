package com.example.stagesysteem;

import android.annotation.SuppressLint;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("Registered")
public class Spinners extends AppCompatActivity {

    public void createSpinner(String[] data, Spinner view) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, data);
        view.setAdapter(adapter);
    }

}
