package com.devconscompany.indianaukari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button skipButton, btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnNext = findViewById(R.id.btnNext);
        skipButton = findViewById(R.id.skip_button);

        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action on skip
                // Toast.makeText(MainActivity.this, "Skipped", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, HomePageActivity.class);
                startActivity(intent);
            }
        });

        // Set an OnClickListener for the button
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start ThirdPageActivity
                Intent intent = new Intent(MainActivity.this, SecondPageActivity.class);
                startActivity(intent);
            }
        });
    }
}