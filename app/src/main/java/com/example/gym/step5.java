package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class step5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step5);
    }

    public void onClickPass(View v) {
        EditText qwe = (EditText) findViewById(R.id.editTextTextPersonName3);
        EditText asd = (EditText) findViewById(R.id.editTextTextPersonName4);

        if (qwe.getText().toString().equals(" ")) {
            if (asd.getText().toString().equals(" ")) {
                Intent intent2 = new Intent(step5.this, signin.class);
                startActivity(intent2);
            }

        } else {
            Toast.makeText(this, "Введиьте значение", Toast.LENGTH_SHORT).show();
        }
    }
}