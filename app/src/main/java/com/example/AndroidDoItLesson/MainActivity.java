package com.example.AndroidDoItLesson;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListFragment mainFragment;
    MenuFragment menuFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = (ListFragment) getSupportFragmentManager().findFragmentById(R.id.mainFragment);
        menuFragment = new MenuFragment();
    }

    public void onFragmentChanged(int i) {
        if (i == 0) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();
        } else if (i == 1) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, menuFragment).commit();
        }
    }
}