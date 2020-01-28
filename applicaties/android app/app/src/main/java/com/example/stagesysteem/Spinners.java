package com.example.stagesysteem;

import android.annotation.SuppressLint;
import android.app.Application;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

class Spinners {

    void createSpinner(String[] data, Spinner view) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>( view.getContext(),android.R.layout.simple_spinner_dropdown_item, data);
        view.setAdapter(adapter);
    }

}
