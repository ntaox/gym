package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class step31 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step31);
    }
    public void onClickStep31 (View v) {

        Intent intent2 = new Intent(step31.this, step4.class);
        startActivity(intent2);
    }
}