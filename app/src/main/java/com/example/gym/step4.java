package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class step4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step4);
    }
    public void onClickStep4 (View v) {

        Intent intent2 = new Intent(step4.this, step5.class);
        startActivity(intent2);
    }
}