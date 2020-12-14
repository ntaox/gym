package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }

    public void onClickPass(View v) {
        EditText qwe = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText asd = (EditText) findViewById(R.id.editTextTextPassword);

        if (qwe.getText().toString().equals("serk")) {
            if (asd.getText().toString().equals("123")) {
                Intent intent2 = new Intent(signin.this, signup.class);
                startActivity(intent2);
            }

        } else {
            Toast.makeText(this, "Неправильный пароль или логин", Toast.LENGTH_SHORT).show();
        }
    }
}