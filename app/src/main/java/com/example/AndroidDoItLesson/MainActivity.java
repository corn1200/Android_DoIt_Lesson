package com.example.AndroidDoItLesson;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
//        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);

        recyclerView.setLayoutManager(layoutManager);

        PersonAdapter adapter = new PersonAdapter();

        adapter.addItem(new Person("김민수", "010-1000-1000"));
        adapter.addItem(new Person("김현승", "010-1000-1000"));
        adapter.addItem(new Person("엄준식", "010-1000-1000"));

        recyclerView.setAdapter(adapter);

    }
}