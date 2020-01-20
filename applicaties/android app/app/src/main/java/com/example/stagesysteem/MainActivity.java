package com.example.stagesysteem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Spinner radius = findViewById(R.id.kilometers);
        String[] kilometers = new String[]{"5 km", "15 km", "25 km", "40 km", "50 km"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, kilometers);
//        radius.setAdapter(adapter);

    }
}
