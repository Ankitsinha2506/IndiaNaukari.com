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

public class ThirdPageActivity extends AppCompatActivity {
    Button btnNext,btnSkip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);

        btnNext = findViewById(R.id.btnNext);
        btnSkip = findViewById(R.id.btnSkip);

        // Set an OnClickListener for the SKIP button
        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action on skip
                // Toast.makeText(ThirdPageActivity.this, "Skipped", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ThirdPageActivity.this, HomePageActivity.class);
                startActivity(intent);
            }
        });

        // Set an OnClickListener for the NEXT button
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start ThirdPageActivity
                Intent intent = new Intent(ThirdPageActivity.this, HomePageActivity.class);
                startActivity(intent);
            }
        });

    }
}