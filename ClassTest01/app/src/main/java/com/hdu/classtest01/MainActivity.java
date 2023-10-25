package com.hdu.classtest01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText etPhone;
    private EditText etPassword;
    private RadioGroup sexGroup;
    private CheckBox cbReading;
    private CheckBox cbSports;
    private CheckBox cbMusic;
    private Spinner spinnerCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etPhone = findViewById(R.id.etPhone);
        etPassword = findViewById(R.id.etPassword);
        sexGroup = findViewById(R.id.sexGroup);
        cbReading = findViewById(R.id.cbReading);
        cbSports = findViewById(R.id.cbSports);
        cbMusic = findViewById(R.id.cbMusic);
        spinnerCity = findViewById(R.id.spinnerCity);
    }

    public void onClickSubmit(View view) {
        String phone = etPhone.getText().toString();
        String password = etPassword.getText().toString();

        int selectedId = sexGroup.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedId);
        String gender = selectedRadioButton.getText().toString();

        String hobby = "";
        if (cbReading.isChecked()) hobby = cbReading.getText().toString();
        if (cbSports.isChecked()) hobby += cbSports.getText().toString();
        if (cbMusic.isChecked()) hobby += cbMusic.getText().toString();

        String city = spinnerCity.getSelectedItem().toString();
        if (phone.isEmpty() || password.isEmpty() || gender.isEmpty() || hobby.isEmpty() || city.isEmpty()) {
            Toast.makeText(this, "请填写所有字段", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(MainActivity.this, ReceiveActivity.class);
            intent.putExtra("phone", phone);
            intent.putExtra("password", password);
            intent.putExtra("gender", gender);
            intent.putExtra("hobby", hobby);
            intent.putExtra("city", city);
            startActivity(intent);
        }

    }
}