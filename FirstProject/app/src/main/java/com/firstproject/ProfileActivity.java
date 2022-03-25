package com.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ProfileActivity extends AppCompatActivity {

    ImageButton openRegisterScreen, backScreen, homeScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        openRegisterScreen = findViewById(R.id.openRegisterButton);
        backScreen = findViewById(R.id.imageButtonProf);
        homeScreen = findViewById(R.id.homeButton1);

        openRegisterScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerScreen = new Intent(getApplicationContext(), RegisterScreen.class);
                startActivity(registerScreen);
            }
        });
        backScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backScreen = new Intent(getApplicationContext(), MenuScreen.class);
                startActivity(backScreen);
            }
        });
        homeScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeScreen = new Intent(getApplicationContext(), MenuScreen.class);
                startActivity(homeScreen);
            }
        });
    }
}