package com.hdu.classtest01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);

        Intent intent = getIntent();
        String phone = intent.getStringExtra("phone");
        String password = intent.getStringExtra("password");
        String gender = intent.getStringExtra("gender");
        String hobby = intent.getStringExtra("hobby");
        String city = intent.getStringExtra("city");

        TextView textPhone = findViewById(R.id.text_phone);
        textPhone.setText(textPhone.getText().toString() + phone);

        TextView textPassword = findViewById(R.id.text_password);
        textPassword.setText(textPassword.getText().toString() + password);

        TextView textGender = findViewById(R.id.text_gender);
        textGender.setText(textGender.getText().toString() + gender);

        TextView textHobby = findViewById(R.id.text_hobby);
        textHobby.setText(textHobby.getText().toString() + hobby);

        TextView textCity = findViewById(R.id.text_city);
        textCity.setText(textCity.getText().toString() + city);
    }
}