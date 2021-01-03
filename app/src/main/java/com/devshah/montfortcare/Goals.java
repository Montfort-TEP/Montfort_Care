package com.devshah.montfortcare;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Goals extends AppCompatActivity {
    TextView goalLevel_tv;
    int year;
    int yearQuarter;
    int level;
    Button back;
    String month_string;
    String year_string;
    String levelString;
    TextView audition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);
        back = findViewById(R.id.back_goals_btn);
        year = getIntent().getIntExtra("year", 00);
        yearQuarter = getIntent().getIntExtra("month", 1);
        level = getIntent().getIntExtra("level", 0);
        month_string = getIntent().getStringExtra("month_string");
        year_string = getIntent().getStringExtra("year_string");
        goalLevel_tv = findViewById(R.id.goal_level_tv);
        Log.d("varMonth", "check");
        levelString = "Level " + level;
        goalLevel_tv.setText(levelString);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getBaseContext(), select_level.class);
                Log.d("varMonth", month_string + " is the message");
                Log.d("varYear", year_string+" is the message");
                intent5.putExtra("year", year_string);
                intent5.putExtra("month", month_string);
                startActivity(intent5);
            }
        });
}}