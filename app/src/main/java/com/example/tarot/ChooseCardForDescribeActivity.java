package com.example.tarot;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ChooseCardForDescribeActivity extends AppCompatActivity {
    TextView tvBack, tvStart;
    Spinner spCart;
    public static final String KEY_CARD_NAME = "card_name";
    public static final String KEY_CARD = "card";
    public static final String KEY_ACTIVITY = "activity";
    private List<Card> cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_card_for_describe);

        getSupportActionBar().hide();

        Intent MainActivityIntent = new Intent(this, MainActivity.class);
        Intent CardDescriptionActivityIntent = new Intent(this, com.example.tarot.CardDescriptionActivity.class);

        tvBack = findViewById(R.id.tvBack);
        tvStart = findViewById(R.id.tvStart);
        spCart = findViewById(R.id.spCart);

        tvBack.setOnClickListener(view -> {
            startActivity(MainActivityIntent);
        });

        tvStart.setOnClickListener(view -> {
            String card_name = String.valueOf(spCart.getSelectedItem());

            CardDescriptionActivityIntent.putExtra(KEY_CARD_NAME, card_name);

             cards = App.getInstance().getDatabase().cardDao().getAll();
             for (Card c : cards) {
                 Log.d("api", c.toString());
                 if (c.getName().contains(card_name)) {
                     CardDescriptionActivityIntent.putExtra(KEY_CARD, c);
                 }
             }
             CardDescriptionActivityIntent.putExtra(KEY_ACTIVITY, "ChooseCardForDescribeActivity");
             startActivity(CardDescriptionActivityIntent);
        });

    }
}