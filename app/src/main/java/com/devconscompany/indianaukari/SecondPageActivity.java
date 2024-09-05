package com.devconscompany.indianaukari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        Button skipButton = findViewById(R.id.skip_button);
        Button nextButton = findViewById(R.id.next_button);

        // Set an OnClickListener for the SKIP button
        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action on skip
                // Toast.makeText(SecondPageActivity.this, "Skipped", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondPageActivity.this, HomePageActivity.class);
                startActivity(intent);
            }
        });

        // Set an OnClickListener for the NEXT button
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start ThirdPageActivity
                Intent intent = new Intent(SecondPageActivity.this, ThirdPageActivity.class);
                startActivity(intent);
            }
        });


    }
}