package com.example.stagesysteem;

import androidx.annotation.ContentView;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        setContentView(R.layout.hoofdpagina_student);

        //login class
        //final Person person = new Person();
        final Spinners spinner = new Spinners();
        //eventlistener
/*        findViewById(R.id.loginBtn).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText email = findViewById(R.id.emailField);
                        EditText password = findViewById(R.id.passwordField);
                        person.login(email.getText().toString(), password.getText().toString());
                    }
                }
        ); */
        Spinner s = findViewById(R.id.kilometers);
        String[] test = new String[]{"10 km", "15 km", "20 km"};
        spinner.createSpinner(test, s);


    }
}
