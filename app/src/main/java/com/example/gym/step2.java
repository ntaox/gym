package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class step2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);
    }
    public void onClickStep2 (View v) {

        Intent intent2 = new Intent(step2.this, step31.class);
        startActivity(intent2);
    }
    public void onClickStep21 (View v) {

        Intent intent2 = new Intent(step2.this, step3.class);
        startActivity(intent2);
    }
}