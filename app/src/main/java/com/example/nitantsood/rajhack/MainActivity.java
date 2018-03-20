package com.example.nitantsood.rajhack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String urlString="http://192.168.43.189:5000/lightturnedon";
                String urlString = "";
                myTask myTask=new myTask(getApplicationContext(), new myTask.onSpecificStateChangeListener() {
                    @Override
                    public void onStateChanged(String string) {
                        Toast.makeText(MainActivity.this,string, Toast.LENGTH_SHORT).show();
                    }
                });
                myTask.execute(urlString);
            }
        });
    }
}
