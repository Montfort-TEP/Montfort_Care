package com.devshah.montfortcare;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class select_level extends AppCompatActivity {
    TextView yeartext;
    TextView monthtext;
    int yearnum;
    int yearquater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_level);
        yeartext = findViewById(R.id.year_textview);
        monthtext = findViewById(R.id.months_txt);
        String yeartv_text = getIntent().getStringExtra("year");
        yeartext.setText(yeartv_text);
        String monthtv_text = getIntent().getStringExtra("month");
        monthtext.setText(monthtv_text);
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
//       yeartext.setText(" "+yearnum);
//       monthtext.setText(""+yearquater);
    }
}