package com.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RegisterScreen extends AppCompatActivity {

    ImageButton backProfileScreen, homeScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);

        backProfileScreen = findViewById(R.id.imageButtonReg);
        homeScreen = findViewById(R.id.homeButton1);

        backProfileScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lastScreen = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(lastScreen);
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