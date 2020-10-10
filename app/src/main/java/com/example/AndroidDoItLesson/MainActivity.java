package com.example.AndroidDoItLesson;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Layout1 layout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1 = findViewById(R.id.layout1);
        layout1.setImage(R.drawable.ic_launcher_background);
        layout1.setName("김현승");
        layout1.setMobile("010-1000-1000");

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout1.setImage(R.drawable.ic_launcher_foreground);
            }
        });
    }
}