package com.devshah.montfortcare;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Goals extends AppCompatActivity {
    TextView goalLevel_tv;
    int year;
    int yearQuarter;
    int level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        year = getIntent().getIntExtra("year", 00);
        yearQuarter = getIntent().getIntExtra("month", 1);
        level = getIntent().getIntExtra("level", 0);
        setContentView(R.layout.activity_goals);
        goalLevel_tv = findViewById(R.id.goal_level_tv);
        String levelString = "Level " + level;
        goalLevel_tv.setText(levelString);
    }
}