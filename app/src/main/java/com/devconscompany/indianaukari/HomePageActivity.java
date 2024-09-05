package com.devconscompany.indianaukari;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set HomeFragment as the default fragment when the activity starts
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.nav_host_fragment, new HomeFragment())
                    .commit();
        }

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch (item.getItemId()) {
                    case R.id.nav_homeFragment:
                        selectedFragment = new HomeFragment();
                        break;
                    case R.id.nav_StarFragment:  // Ensure this matches your actual ID
                        selectedFragment = new StarFragment();
                        break;
                    case R.id.nav_Locationfragment:  // Ensure this matches your actual ID
                        selectedFragment = new LocationFragment();
                        break;
                    case R.id.nav_Educationfragment:  // Ensure this matches your actual ID
                        selectedFragment = new EducationFragment();
                        break;
                    case R.id.nav_SearchFragment:  // Ensure this matches your actual ID
                        selectedFragment = new SearchFragment();
                        break;
                    default:
                        return false;
                }

                // Replace the currently displayed fragment
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.nav_host_fragment, selectedFragment)
                        .commit();
                return true;
            }
        });
    }
}
