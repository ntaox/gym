package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch);
        Timer Timer = new Timer();
        TimerTask task = new TimerTask(){
            public void run(){
                Intent intent2 = new Intent(MainActivity.this, step1.class);
                startActivity(intent2);
                finish();
            }
        };
        Timer.schedule(task,3000L);
    }
}