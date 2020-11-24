package com.devshah.montfortcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Select_Month extends AppCompatActivity {
    TextView selected_year;
    Button button1_month;
    Button button2_month;
    Button button3_month;
    Button button4_month;
    String year2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__month);
        year2 = getIntent().getStringExtra("sel_year");
        selected_year = findViewById(R.id.year_txt_month);
        selected_year.setText(year2);
        button1_month = findViewById(R.id.selectmonth_bt1);
        button2_month = findViewById(R.id.selectmonth_bt2);
        button3_month = findViewById(R.id.selectmonth_bt3);
        button4_month = findViewById(R.id.selectmonth_bt4);

        button1_month.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getBaseContext(), select_level.class);
                intent4.putExtra("year", year2);
                intent4.putExtra("month", "0-3 Months");
                startActivity(intent4);
            }
        });
        button2_month.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getBaseContext(), select_level.class);
                intent4.putExtra("year", year2);
                intent4.putExtra("month", "3-6 Months");
                startActivity(intent4);
            }
        });
        button3_month.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getBaseContext(), select_level.class);
                intent4.putExtra("year", year2);
                intent4.putExtra("month", "6-9 Months");
                startActivity(intent4);
            }
        });
        button4_month.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getBaseContext(), select_level.class);
                intent4.putExtra("year", year2);
                intent4.putExtra("month", "9-12 Months");
                startActivity(intent4);
            }
        });

   }
}