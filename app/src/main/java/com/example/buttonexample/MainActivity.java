package com.example.buttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Declare data initialize
    Button simpleButton1, simpleButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set value for Button
        simpleButton1 = (Button) findViewById(R.id.simpleButton1);
        simpleButton2 = (Button) findViewById(R.id.simpleButton2);

        // Events setting of Button
        // Events of button 1
        simpleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                    getApplicationContext(),
                    "Simple Button 1",
                    Toast.LENGTH_LONG
                ).show();
            }
        });
        // Button 1 Ending

        // Events of button 2

        // Button 2 Ending
        simpleButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                    getApplicationContext(),
                    "Simple Button 2",
                    Toast.LENGTH_SHORT
                ).show();
            }
        });
        // Button Events ending.
    }
}