package com.example.tarot;

import static com.example.tarot.AllSignsActivity.KEY_SIGN;
import static com.example.tarot.ChooseCardForDescribeActivity.KEY_ACTIVITY;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SingCompatibilityActivity extends AppCompatActivity {
    TextView tvBack, tvSingName, tvSignCompatibility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_compatibility);

        getSupportActionBar().hide();

        Bundle arguments = getIntent().getExtras();

        Intent AllSingsActivityIntent = new Intent(this, AllSignsActivity.class);

        Sign sign = (Sign) arguments.getSerializable(KEY_SIGN);


        tvBack = findViewById(R.id.tvBack);
        tvSingName = findViewById(R.id.tvSignName);
        tvSignCompatibility = findViewById(R.id.tvSignCompatibility);

        tvSingName.setText(sign.getName());
        tvSignCompatibility.setText(sign.getCompatibility());

        tvBack.setOnClickListener(view -> {
            AllSingsActivityIntent.putExtra(KEY_ACTIVITY, "SingCompatibilityActivity");
            startActivity(AllSingsActivityIntent);
        });

    }
}