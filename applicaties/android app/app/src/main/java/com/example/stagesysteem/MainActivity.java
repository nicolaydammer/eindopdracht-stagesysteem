package com.example.stagesysteem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        //login class
        final Person person = new Person();
        //eventlistener
        findViewById(R.id.loginBtn).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText email = findViewById(R.id.emailField);
                        EditText password = findViewById(R.id.passwordField);
                        person.login(email.getText().toString(), password.getText().toString());
                    }
                }
        );

        /*Spinner radius = findViewById(R.id.kilometers);
        String[] kilometers = new String[]{"5 km", "15 km", "25 km", "40 km", "50 km"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, kilometers);
        radius.setAdapter(adapter);

        Spinner zoeker = findViewById(R.id.opties);
        String[] opties = new String[]{"studenten", "bedrijven", "docenten"};
        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, opties);
        zoeker.setAdapter(adapt); */

    }
}
