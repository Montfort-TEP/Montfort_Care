package com.devshah.montfortcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class  SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button next =  findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText x=findViewById(R.id.cNamee);
                String cName=x.getText().toString();

                x=findViewById(R.id.pName);
                String pName=x.getText().toString();

                x=findViewById(R.id.contact);
                String contact=x.getText().toString();

                x=findViewById(R.id.address);
                String address=x.getText().toString();

                x=findViewById(R.id.pwd);
                String pwd=x.getText().toString();

                x=findViewById(R.id.pwd2);
                String pwd2=x.getText().toString();

                if(cName!="" && pName!="" && contact!="" && address!="" && pwd!="" && pwd2==pwd){
                    //run query
                }
            }
        });
    }
}
