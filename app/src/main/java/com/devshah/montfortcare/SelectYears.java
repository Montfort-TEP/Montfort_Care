package com.devshah.montfortcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SelectYears extends AppCompatActivity {
    TextView maintext;
    Button button1;
    Button button2;
    Button button3;
    int flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_years);
        maintext = findViewById(R.id.stage_identified);
        button1 = findViewById(R.id.selectyear_bt1);
        button2 = findViewById(R.id.selectyear_bt2);
        button3 = findViewById(R.id.selectyear_bt3);
        int stage = getIntent().getIntExtra("identified_early", 0);
        if(stage==1){
            flag=1;
            maintext.setText(R.string.early_identified);
            button1.setText(R.string.first_year);
            button2.setText(R.string.second_year);
            button3.setText(R.string.third_year);
        }
        else if(stage==0){
            flag = 0;
            maintext.setText(R.string.late_identified);
            button1.setText(R.string.fourth_year);
            button2.setText(R.string.fifth_year);
            button3.setText(R.string.sixth_year);
        }
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getBaseContext(), Select_Month.class);
                if(flag==1){
                    intent3.putExtra("sel_year", "First Year");
                    startActivity(intent3);
                }
                else{
                    intent3.putExtra("sel_year", "Fourth Year");
                    startActivity(intent3);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getBaseContext(), Select_Month.class);
                if (flag==1){
                    intent4.putExtra("sel_year", "Second Year");
                    startActivity(intent4);
                }
                else{
                    intent4.putExtra("sel_year", "Fifth Year");
                    startActivity(intent4);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getBaseContext(), Select_Month.class);
                if (flag==1){
                    intent5.putExtra("sel_year", "Third Year");
                    startActivity(intent5);
                }
                else{
                    intent5.putExtra("sel_year", "Sixth Year");
                    startActivity(intent5);
                }
            }
        });
    }
}