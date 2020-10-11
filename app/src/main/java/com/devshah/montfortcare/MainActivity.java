package com.devshah.montfortcare;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerlayout;
    NavigationView navigationView;
    Toolbar tool;
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerlayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        tool = findViewById(R.id.toolbar);
        navigationView.bringToFront();
        setSupportActionBar(tool);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerlayout, tool, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        navigationView.bringToFront();
        drawerlayout.addDrawerListener(toggle);
        navigationView.bringToFront();
        toggle.syncState();
        navigationView.bringToFront();
    }
}



//        signup = (Button) findViewById(R.id.signup);
//        signup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent= new Intent(MainActivity.this, SignupActivity.class);
//                startActivity(intent);
//            }
//        });