package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class step1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step1);
    }
    public void onClickStep1 (View v) {

        Intent intent2 = new Intent(step1.this, step2.class);
        startActivity(intent2);
    }
}