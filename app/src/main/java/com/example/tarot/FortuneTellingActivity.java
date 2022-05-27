package com.example.tarot;

import static com.example.tarot.CardAdapter.KEY_CARDS_NAMES;
import static com.example.tarot.CardAmountForFortuneTellingActivity.KEY_AMOUNT;
import static com.example.tarot.ChooseCardForDescribeActivity.KEY_ACTIVITY;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class FortuneTellingActivity extends AppCompatActivity {

    TextView tvBack;
    ListView lvFortuneTellingCards;
    private CardAdapter adapter;
    private List<Card> cards;
    int amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortune_telling);

        getSupportActionBar().hide();

        Intent CardAmountForFortuneTellingActivityIntent = new Intent(this, CardAmountForFortuneTellingActivity.class);

        Bundle arguments = getIntent().getExtras();

        String activity_name = (String) arguments.getSerializable(KEY_ACTIVITY);

        if(activity_name.contains("CardAmountForFortuneTellingActivity")){
            amount = (int) arguments.getSerializable(KEY_AMOUNT);
        }

        tvBack = findViewById(R.id.tvBack);
        lvFortuneTellingCards = findViewById(R.id.lvFortuneTellingCards);

        cards = App.getInstance().getDatabase().cardDao().getAll();

        List<String> cards_names;

        if (activity_name.contains("CardAmountForFortuneTellingActivity")){
            cards_names = null;
        }
        else{
            cards_names = (List<String>) arguments.getSerializable(KEY_CARDS_NAMES);
        }

        if(activity_name.contains("CardAmountForFortuneTellingActivity")){
            List<String> cards_luck = new ArrayList<>();
            List<String> cards_already_was = new ArrayList<>();
            String card_name;
            for (int i = 0; i < amount; i++){
                int index = (int)Math. floor(Math. random() * cards.size());
                card_name = cards.get(index).getShort_name();
                if(!cards_already_was.contains(card_name)){
                    cards_luck.add(card_name);
                    cards_already_was.add(card_name);
                }
                else{
                    amount+=1;
                }
            }
            adapter = new CardAdapter(FortuneTellingActivity.this, R.layout.card_unit, cards_luck);
        }else{
            adapter = new CardAdapter(FortuneTellingActivity.this, R.layout.card_unit, cards_names);
        }
        lvFortuneTellingCards.setAdapter(adapter);

        tvBack.setOnClickListener(view -> {
            startActivity(CardAmountForFortuneTellingActivityIntent);
        });
    }
}