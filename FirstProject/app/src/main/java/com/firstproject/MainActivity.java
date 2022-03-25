package com.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button openMenuScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openMenuScreen = findViewById(R.id.teste);
        LoadingAnimation loadingAnimation = new LoadingAnimation(MainActivity.this);

        openMenuScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuScreen = new Intent(getApplicationContext(), MenuScreen.class);
                startActivity(menuScreen);
                loadingAnimation.startLoadingAnimation();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loadingAnimation.stopAnimation();
                    }
                }, 5000);
            }
        });
    }
}