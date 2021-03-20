package com.example.practiceactvity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        BottomNavigationView bottomNavView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        NavController navController = (NavController) Navigation.findNavController(this, R.id.fragment);

        NavigationUI.setupWithNavController(bottomNavView, navController);
    }
}