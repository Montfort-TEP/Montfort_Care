package com.devshah.montfortcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerlayout;
    NavigationView navigationView;
    Toolbar tool;
    Button signup;
    CardView early;
    CardView late;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerlayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        tool = findViewById(R.id.toolbar);
        navigationView.bringToFront();
        setSupportActionBar(tool);
        navigationView.bringToFront(); //place the nav view in front of the cardviews
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerlayout, tool, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        navigationView.bringToFront();
        drawerlayout.addDrawerListener(toggle);
        navigationView.bringToFront();
        toggle.syncState();
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        early = findViewById(R.id.early_identified);
        late = findViewById(R.id.late_identified);
        early.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), SelectYears.class);
                intent.putExtra("identified_early", 1);
                startActivity(intent);
            }
        });
        late.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getBaseContext(), SelectYears.class);
                intent2.putExtra("identified_early", 0);
                startActivity(intent2);
            }
        });

    }

    @Override
    public void onBackPressed() {
        if(drawerlayout.isDrawerOpen(GravityCompat.START)){
            drawerlayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
    }
}




//        signup = (Button) findViewById(R.i
//        signup = (Button) findViewById(R.id.signup);
//        signup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent= new Intent(MainActivity.this, SignupActivity.class);
//                startActivity(intent);
//            }
//        });