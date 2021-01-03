package com.devshah.montfortcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class select_level extends AppCompatActivity {
    TextView yeartext;
    TextView monthtext;
    int yearnum;
    int yearquater;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_level);
        yeartext = findViewById(R.id.year_textview);
        monthtext = findViewById(R.id.months_txt);
        final String yeartv_text = getIntent().getStringExtra("year");
        yeartext.setText(yeartv_text);
        final String monthtv_text = getIntent().getStringExtra("month");
        monthtext.setText(monthtv_text);
        button1 = findViewById(R.id.selectlevel_bt1);
        button2 = findViewById(R.id.selectlevel_bt2);
        button3 = findViewById(R.id.selectlevel_bt3);
        button4 = findViewById(R.id.selectlevel_bt4);
       switch (yeartv_text){
           case "First Year":
               yearnum = 1;
               break;
           case "Second Year":
               yearnum = 2;
               break;
           case "Third Year":
               yearnum = 3;
               break;
           case "Fourth Year":
               yearnum = 4;
               break;
           case "Fifth Year":
               yearnum = 5;
               break;
           case "Sixth Year":
               yearnum = 6;
               break;
           default:
               yearnum = 99;
       }
       switch (monthtv_text){
           case "0-3 Months":
               yearquater = 1;
               break;
           case "3-6 Months":
               yearquater = 2;
               break;
           case "6-9 Months":
               yearquater = 3;
               break;
           case "9-12 Months":
               yearquater = 4;
               break;
           default:
               yearquater = 99;
               break;
       }
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getBaseContext(), Goals.class);
                intent5.putExtra("year", yearnum);
                intent5.putExtra("month", yearquater);
                intent5.putExtra("level", 1);
                intent5.putExtra("month_string", monthtv_text);
                intent5.putExtra("year_string", yeartv_text);
                startActivity(intent5);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getBaseContext(), Goals.class);
                intent5.putExtra("year", yearnum);
                intent5.putExtra("month", yearquater);
                intent5.putExtra("level", 2);
                intent5.putExtra("month_string", monthtv_text);
                intent5.putExtra("year_string", yeartv_text);
                startActivity(intent5);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getBaseContext(), Goals.class);
                intent5.putExtra("year", yearnum);
                intent5.putExtra("month", yearquater);
                intent5.putExtra("level", 3);
                intent5.putExtra("month_string", monthtv_text);
                intent5.putExtra("year_string", yeartv_text);
                startActivity(intent5);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getBaseContext(), Goals.class);
                intent5.putExtra("year", yearnum);
                intent5.putExtra("month", yearquater);
                intent5.putExtra("level", 4);
                intent5.putExtra("month_string", monthtv_text);
                intent5.putExtra("year_string", yeartv_text);
                startActivity(intent5);
            }
        });
    }
}