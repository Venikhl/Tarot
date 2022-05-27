package com.example.tarot;

import static com.example.tarot.ChooseCardForDescribeActivity.KEY_ACTIVITY;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ChooseSingActionActivity extends AppCompatActivity {
    TextView tvAllSigns, tvCompatibility, tvBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_sing_action);
        getSupportActionBar().hide();

        Intent AllSingsActivityIntent = new Intent(this, AllSignsActivity.class);
        Intent MainActivityIntent = new Intent(this, MainActivity.class);

        tvAllSigns = findViewById(R.id.tvAllSigns);
        tvCompatibility = findViewById(R.id.tvCompatibility);
        tvBack = findViewById(R.id.tvBack);

        tvBack.setOnClickListener(view -> {
            startActivity(MainActivityIntent);
        });

        tvAllSigns.setOnClickListener(view -> {
            AllSingsActivityIntent.putExtra(KEY_ACTIVITY, "SignUnitActivity");
            startActivity(AllSingsActivityIntent);
        });
        tvCompatibility.setOnClickListener(view -> {
            AllSingsActivityIntent.putExtra(KEY_ACTIVITY, "SingCompatibilityActivity");
            startActivity(AllSingsActivityIntent);
        });
    }
}