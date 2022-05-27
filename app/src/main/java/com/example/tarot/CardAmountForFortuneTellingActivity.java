package com.example.tarot;

import static com.example.tarot.ChooseCardForDescribeActivity.KEY_ACTIVITY;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CardAmountForFortuneTellingActivity extends AppCompatActivity {
    TextView tvBack, tvAmount, tvMinus, tvPlus, tvStart;
    public static final String KEY_AMOUNT = "amount";
    int amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_amount_for_fortune_telling);

        getSupportActionBar().hide();

        Intent MainActivityIntent = new Intent(this, MainActivity.class);
        Intent FortuneTellingActivityIntent = new Intent(this, com.example.tarot.FortuneTellingActivity.class);


        tvBack = findViewById(R.id.tvBack);
        tvAmount = findViewById(R.id.tvAmount);
        tvMinus = findViewById(R.id.tvMinus);
        tvPlus = findViewById(R.id.tvPlus);
        tvStart = findViewById(R.id.tvStart);
        amount = 1;


        tvBack.setOnClickListener(view -> {
            startActivity(MainActivityIntent);
        });


        tvMinus.setOnClickListener(view -> {
            if(amount > 1){
                amount --;
                tvAmount.setText(String.valueOf(amount));
            }
        });

        tvPlus.setOnClickListener(view -> {
            if(amount < 78){
                amount ++;
                tvAmount.setText(String.valueOf(amount));
            }
        });

        tvStart.setOnClickListener(view -> {
            FortuneTellingActivityIntent.putExtra(KEY_ACTIVITY, "CardAmountForFortuneTellingActivity");
            FortuneTellingActivityIntent.putExtra(KEY_AMOUNT, amount);
            startActivity(FortuneTellingActivityIntent);
        });

    }
}