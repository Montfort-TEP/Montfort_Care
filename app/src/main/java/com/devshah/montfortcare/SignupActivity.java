package com.devshah.montfortcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;


public class  SignupActivity extends AppCompatActivity {

    OkHttpClient client = new OkHttpClient();

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

                if(cName!="" && pName!="" && contact!="" && address!="" && pwd!="" && pwd2.equals(pwd)){
                    String url="http://192.168.1.15:8080/signup?cName="+cName+"&pName="+pName+"&contact="+contact+"&address="+address+"&pwd="+pwd;
                    //run query
                    Request request = new Request.Builder()
                            .url(url)
                            .build();

                    client.newCall(request).enqueue(new Callback() {
                        @Override
                        public void onFailure(Request request, IOException e) {
                            e.printStackTrace();
                        }

                        @Override
                        public void onResponse(Response response) throws IOException {
                            if(!response.isSuccessful()){
                                throw new IOException("Unexpected code " + response);
                            }
                            else{
                                System.out.println(response.body().string());
//                                response.body().
                            }
                        }
                    });

                }
                else{
                    System.out.println(pwd);
                    System.out.println(pwd2);
                    System.out.println(cName);
                    System.out.println(pName);
                    System.out.println(contact);
                    System.out.println(address);

                    System.out.println("Error");
                }
            }
        });
    }
}
