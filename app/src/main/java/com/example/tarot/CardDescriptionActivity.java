package com.example.tarot;

import static com.example.tarot.CardAdapter.KEY_CARDS_NAMES;
import static com.example.tarot.ChooseCardForDescribeActivity.KEY_ACTIVITY;
import static com.example.tarot.ChooseCardForDescribeActivity.KEY_CARD;
import static com.example.tarot.ChooseCardForDescribeActivity.KEY_CARD_NAME;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class CardDescriptionActivity extends AppCompatActivity {
    ImageView imgvCard;
    TextView tvBack, tvCardDescription, tvCardName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_description);
        Log.d("api", "CardDescriptionActivity");

        getSupportActionBar().hide();

        Bundle arguments = getIntent().getExtras();

        Intent ChooseCardForDescribeActivityIntent = new Intent(this, ChooseCardForDescribeActivity.class);
        Intent FortuneTellingActivityIntent = new Intent(this, FortuneTellingActivity.class);

        String activity_name = (String) arguments.getSerializable(KEY_ACTIVITY);
        Card card;
        String name;

        List<String> cards_names;

        if (activity_name.contains("ChooseCardForDescribeActivity")) {
            card = (Card) arguments.getSerializable(KEY_CARD);
        }
        else{
            card = null;
        }

        name = (String) arguments.getSerializable(KEY_CARD_NAME);

        if (activity_name.contains("CardAdapter")){
            cards_names = (List<String>) arguments.getSerializable(KEY_CARDS_NAMES);
        }
        else{
            cards_names = null;
        }

        imgvCard = findViewById(R.id.imgvCard);
        tvBack = findViewById(R.id.tvBack);
        tvCardName = findViewById(R.id.tvCardName);
        tvCardDescription = findViewById(R.id.tvCardDescription);

        String short_name;
        if (activity_name.contains("ChooseCardForDescribeActivity")) {
            short_name = card.getShort_name();
        }else{
            short_name = name;
        }

        if(short_name.contains("fool")) {
            imgvCard.setImageResource(R.drawable.fool);
        }else if(short_name.contains("magician")){
            imgvCard.setImageResource(R.drawable.magician);
        }else if(short_name.contains("high_priestess")){
            imgvCard.setImageResource(R.drawable.high_priestess);
        }else if(short_name.contains("empress")){
            imgvCard.setImageResource(R.drawable.empress);
        }else if(short_name.contains("emperor")){
            imgvCard.setImageResource(R.drawable.emperor);
        }else if(short_name.contains("pope")){
            imgvCard.setImageResource(R.drawable.pope);
        }else if(short_name.contains("lovers")){
            imgvCard.setImageResource(R.drawable.lovers);
        }else if(short_name.contains("chariot")){
            imgvCard.setImageResource(R.drawable.chariot);
        }else if(short_name.contains("justice")){
            imgvCard.setImageResource(R.drawable.justice);
        }else if(short_name.contains("hermit")){
            imgvCard.setImageResource(R.drawable.hermit);
        }else if(short_name.contains("wheel_of_fortune")){
            imgvCard.setImageResource(R.drawable.wheel_of_fortune);
        }else if(short_name.contains("force")){
            imgvCard.setImageResource(R.drawable.force);
        }else if(short_name.contains("hanged_man")){
            imgvCard.setImageResource(R.drawable.hanged_man);
        }else if(short_name.contains("death")){
            imgvCard.setImageResource(R.drawable.death);
        }else if(short_name.contains("temperance")){
            imgvCard.setImageResource(R.drawable.temperance);
        }else if(short_name.contains("devil")){
            imgvCard.setImageResource(R.drawable.devil);
        }else if(short_name.contains("tower")){
            imgvCard.setImageResource(R.drawable.tower);
        }else if(short_name.contains("star")){
            imgvCard.setImageResource(R.drawable.star);
        }else if(short_name.contains("moon")){
            imgvCard.setImageResource(R.drawable.moon);
        }else if(short_name.contains("sun")){
            imgvCard.setImageResource(R.drawable.sun);
        }else if(short_name.contains("judgement")){
            imgvCard.setImageResource(R.drawable.judgement);
        }else if(short_name.contains("world")){
            imgvCard.setImageResource(R.drawable.world);
        }else if(short_name.contains("king_of_wands")){
            imgvCard.setImageResource(R.drawable.king_of_wands);
        }else if(short_name.contains("lady_of_wands")){
            imgvCard.setImageResource(R.drawable.lady_of_wands);
        }else if(short_name.contains("knight_of_wands")){
            imgvCard.setImageResource(R.drawable.knight_of_wands);
        }else if(short_name.contains("knave_of_wands")){
            imgvCard.setImageResource(R.drawable.knave_of_wands);
        }else if(short_name.contains("ten_of_wands")){
            imgvCard.setImageResource(R.drawable.ten_of_wands);
        }else if(short_name.contains("nine_of_wands")){
            imgvCard.setImageResource(R.drawable.nine_of_wands);
        }else if(short_name.contains("eight_of_wands")){
            imgvCard.setImageResource(R.drawable.eight_of_wands);
        }else if(short_name.contains("seven_of_wands")){
            imgvCard.setImageResource(R.drawable.seven_of_wands);
        }else if(short_name.contains("six_of_wands")){
            imgvCard.setImageResource(R.drawable.six_of_wands);
        }else if(short_name.contains("five_of_wands")){
            imgvCard.setImageResource(R.drawable.five_of_wands);
        }else if(short_name.contains("four_of_wands")){
            imgvCard.setImageResource(R.drawable.four_of_wands);
        }else if(short_name.contains("three_of_wands")){
            imgvCard.setImageResource(R.drawable.three_of_wands);
        }else if(short_name.contains("two_of_wands")){
            imgvCard.setImageResource(R.drawable.two_of_wands);
        }else if(short_name.contains("ace_of_wands")){
            imgvCard.setImageResource(R.drawable.ace_of_wands);
        }else if(short_name.contains("king_of_cups")){
            imgvCard.setImageResource(R.drawable.king_of_cups);
        }else if(short_name.contains("lady_of_cups")){
            imgvCard.setImageResource(R.drawable.lady_of_cups);
        }else if(short_name.contains("knight_of_cups")){
            imgvCard.setImageResource(R.drawable.knight_of_cups);
        }else if(short_name.contains("knave_of_cups")){
            imgvCard.setImageResource(R.drawable.knave_of_cups);
        }else if(short_name.contains("ten_of_cups")){
            imgvCard.setImageResource(R.drawable.ten_of_cups);
        }else if(short_name.contains("nine_of_cups")){
            imgvCard.setImageResource(R.drawable.nine_of_cups);
        }else if(short_name.contains("eight_of_cups")){
            imgvCard.setImageResource(R.drawable.eight_of_cups);
        }else if(short_name.contains("seven_of_cups")){
            imgvCard.setImageResource(R.drawable.seven_of_cups);
        }else if(short_name.contains("six_of_cups")){
            imgvCard.setImageResource(R.drawable.six_of_cups);
        }else if(short_name.contains("five_of_cups")){
            imgvCard.setImageResource(R.drawable.five_of_cups);
        }else if(short_name.contains("four_of_cups")){
            imgvCard.setImageResource(R.drawable.four_of_cups);
        }else if(short_name.contains("three_of")){
            imgvCard.setImageResource(R.drawable.three_of_cups);
        }else if(short_name.contains("two_of_cups")){
            imgvCard.setImageResource(R.drawable.two_of_cups);
        }else if(short_name.contains("ace_of_cups")){
            imgvCard.setImageResource(R.drawable.ace_of_cups);
        }else if(short_name.contains("king_of_swords")){
            imgvCard.setImageResource(R.drawable.king_of_swords);
        }else if(short_name.contains("lady_of_swords")){
            imgvCard.setImageResource(R.drawable.lady_of_swords);
        }else if(short_name.contains("knight_of_swords")){
            imgvCard.setImageResource(R.drawable.knight_of_swords);
        }else if(short_name.contains("knave_of_swords")){
            imgvCard.setImageResource(R.drawable.knave_of_swords);
        }else if(short_name.contains("ten_of_swords")){
            imgvCard.setImageResource(R.drawable.ten_of_swords);
        }else if(short_name.contains("nine_of_swords")){
            imgvCard.setImageResource(R.drawable.nine_of_swords);
        }else if(short_name.contains("eight_of_swords")){
            imgvCard.setImageResource(R.drawable.eight_of_swords);
        }else if(short_name.contains("seven_of_swords")){
            imgvCard.setImageResource(R.drawable.seven_of_swords);
        }else if(short_name.contains("six_of_swords")){
            imgvCard.setImageResource(R.drawable.six_of_swords);
        }else if(short_name.contains("five_of_swords")){
            imgvCard.setImageResource(R.drawable.five_of_swords);
        }else if(short_name.contains("four_of_swords")){
            imgvCard.setImageResource(R.drawable.four_of_swords);
        }else if(short_name.contains("three_of_swords")){
            imgvCard.setImageResource(R.drawable.three_of_swords);
        }else if(short_name.contains("two_of_swords")){
            imgvCard.setImageResource(R.drawable.two_of_swords);
        }else if(short_name.contains("ace_of_swords")){
            imgvCard.setImageResource(R.drawable.ace_of_swords);
        }else if(short_name.contains("king_of_pentacles")){
            imgvCard.setImageResource(R.drawable.king_of_pentacles);
        }else if(short_name.contains("lady_of_pentacles")){
            imgvCard.setImageResource(R.drawable.lady_of_pentacles);
        }else if(short_name.contains("knight_of_pentacles")){
            imgvCard.setImageResource(R.drawable.knight_of_pentacles);
        }else if(short_name.contains("knave_of_pentacles")){
            imgvCard.setImageResource(R.drawable.knave_of_pentacles);
        }else if(short_name.contains("ten_of_pentacles")){
            imgvCard.setImageResource(R.drawable.ten_of_pentacles);
        }else if(short_name.contains("nine_of_pentacles")){
            imgvCard.setImageResource(R.drawable.nine_of_pentacles);
        }else if(short_name.contains("eight_of_pentacles")){
            imgvCard.setImageResource(R.drawable.eight_of_pentacles);
        }else if(short_name.contains("seven_of_pentacles")){
            imgvCard.setImageResource(R.drawable.seven_of_pentacles);
        }else if(short_name.contains("six_of_pentacles")){
            imgvCard.setImageResource(R.drawable.six_of_pentacles);
        }else if(short_name.contains("five_of_pentacles")){
            imgvCard.setImageResource(R.drawable.five_of_pentacles);
        }else if(short_name.contains("four_of_pentacles")){
            imgvCard.setImageResource(R.drawable.four_of_pentacles);
        }else if(short_name.contains("three_of_pentacles")){
            imgvCard.setImageResource(R.drawable.three_of_pentacles);
        }else if(short_name.contains("two_of_pentacles")){
            imgvCard.setImageResource(R.drawable.two_of_pentacles);
        }else if(short_name.contains("ace_of_pentacles")){
            imgvCard.setImageResource(R.drawable.ace_of_pentacles);
        }

        if(activity_name.contains("CardAdapter")){
            List<Card> cards = App.getInstance().getDatabase().cardDao().getAll();
            for (Card c :
                    cards) {
                if (c.getShort_name().contains(short_name)) {
                    card = c;
                }
            }
        }

        if (activity_name.contains("ChooseCardForDescribeActivity")) {
            tvCardName.setText(name);
        }
        else{
            tvCardName.setText(card.getName());
        }
        tvCardDescription.setText(card.getDescription());

        tvBack.setOnClickListener(view -> {
            if(activity_name.contains("ChooseCardForDescribeActivity")){
                startActivity(ChooseCardForDescribeActivityIntent);
            }
            if(activity_name.contains("CardAdapter")){
                FortuneTellingActivityIntent.putExtra(KEY_ACTIVITY, "CardDescriptionActivity");
                FortuneTellingActivityIntent.putExtra(KEY_CARDS_NAMES, (Serializable) cards_names);
                startActivity(FortuneTellingActivityIntent);
            }
        });
    }
}