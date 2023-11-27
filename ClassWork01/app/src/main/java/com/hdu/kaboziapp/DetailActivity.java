package com.hdu.kaboziapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView detailTitle;
    private TextView detailContent;
    private ImageView detailImg;
    private Button backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailTitle = findViewById(R.id.detailTitle);
        detailContent = findViewById(R.id.detailContent);
        detailImg = findViewById(R.id.detailImg);
        backBtn = findViewById(R.id.backBtn);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        int imgId = intent.getIntExtra("imgId",0);
        String content = intent.getStringExtra("content");

        detailTitle.setText(title);
        detailContent.setText(content);
        detailImg.setImageResource(imgId);

        backBtn.setOnClickListener(view -> finish());
    }
}