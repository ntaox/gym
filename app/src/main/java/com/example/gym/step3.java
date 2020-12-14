package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class step3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step3);
    }
    public void onClickStep3 (View v) {

        Intent intent2 = new Intent(step3.this, step4.class);
        startActivity(intent2);
    }

}