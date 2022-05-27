package com.example.tarot;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionsActivity extends AppCompatActivity {
    TextView tvBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        getSupportActionBar().hide();

        Intent MainActivityIntent = new Intent(this, MainActivity.class);

        tvBack = findViewById(R.id.tvBack);

        tvBack.setOnClickListener(view -> {
            startActivity(MainActivityIntent);
        });
    }
}