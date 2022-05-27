package com.example.tarot;

import static com.example.tarot.AllSignsActivity.KEY_SIGN;
import static com.example.tarot.ChooseCardForDescribeActivity.KEY_ACTIVITY;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignUnitActivity extends AppCompatActivity {
    TextView tvBack, tvSingName, tvSingDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_unit);

        getSupportActionBar().hide();

        Bundle arguments = getIntent().getExtras();

        Intent AllSingsActivityIntent = new Intent(this, AllSignsActivity.class);

        Sign sign = (Sign) arguments.getSerializable(KEY_SIGN);


        tvBack = findViewById(R.id.tvBack);
        tvSingName = findViewById(R.id.tvSignName);
        tvSingDescription = findViewById(R.id.tvSignDescription);

        tvSingName.setText(sign.getName());
        tvSingDescription.setText(sign.getDescription());

        tvBack.setOnClickListener(view -> {
            AllSingsActivityIntent.putExtra(KEY_ACTIVITY, "SignUnitActivity");
            startActivity(AllSingsActivityIntent);
        });
    }
}