package com.example.tarot;

import static com.example.tarot.ChooseCardForDescribeActivity.KEY_ACTIVITY;
import static com.example.tarot.ChooseCardForDescribeActivity.KEY_CARD;
import static com.example.tarot.ChooseCardForDescribeActivity.KEY_CARD_NAME;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.List;

public class CardAdapter extends ArrayAdapter<String> {
    public static final String KEY_CARDS_NAMES = "cards names";
    private LayoutInflater layoutInflater;
    private Context context;
    private int resource;
    private List<String> cards_names;

    public CardAdapter(@NonNull Context context, int resource, @NonNull List<String> cards_names) {
        super(context, resource, cards_names);
        this.context = context;
        this.resource = resource;
        this.cards_names = cards_names;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = layoutInflater.inflate(this.resource, parent, false);

        String card_name = cards_names.get(position);

        Intent CardDescriptionActivityIntent = new Intent(context, CardDescriptionActivity.class);

        ImageView imgvFortuneTellingCard = view.findViewById(R.id.imgvFortuneTellingCard);

        if(card_name.contains("fool")) {
            imgvFortuneTellingCard.setImageResource(R.drawable.fool);
        }else if(card_name.contains("magician")){
            imgvFortuneTellingCard.setImageResource(R.drawable.magician);
        }else if(card_name.contains("high_priestess")){
            imgvFortuneTellingCard.setImageResource(R.drawable.high_priestess);
        }else if(card_name.contains("empress")){
            imgvFortuneTellingCard.setImageResource(R.drawable.empress);
        }else if(card_name.contains("emperor")){
            imgvFortuneTellingCard.setImageResource(R.drawable.emperor);
        }else if(card_name.contains("pope")){
            imgvFortuneTellingCard.setImageResource(R.drawable.pope);
        }else if(card_name.contains("lovers")){
            imgvFortuneTellingCard.setImageResource(R.drawable.lovers);
        }else if(card_name.contains("chariot")){
            imgvFortuneTellingCard.setImageResource(R.drawable.chariot);
        }else if(card_name.contains("justice")){
            imgvFortuneTellingCard.setImageResource(R.drawable.justice);
        }else if(card_name.contains("hermit")){
            imgvFortuneTellingCard.setImageResource(R.drawable.hermit);
        }else if(card_name.contains("wheel_of_fortune")){
            imgvFortuneTellingCard.setImageResource(R.drawable.wheel_of_fortune);
        }else if(card_name.contains("force")){
            imgvFortuneTellingCard.setImageResource(R.drawable.force);
        }else if(card_name.contains("hanged_man")){
            imgvFortuneTellingCard.setImageResource(R.drawable.hanged_man);
        }else if(card_name.contains("death")){
            imgvFortuneTellingCard.setImageResource(R.drawable.death);
        }else if(card_name.contains("temperance")){
            imgvFortuneTellingCard.setImageResource(R.drawable.temperance);
        }else if(card_name.contains("devil")){
            imgvFortuneTellingCard.setImageResource(R.drawable.devil);
        }else if(card_name.contains("tower")){
            imgvFortuneTellingCard.setImageResource(R.drawable.tower);
        }else if(card_name.contains("star")){
            imgvFortuneTellingCard.setImageResource(R.drawable.star);
        }else if(card_name.contains("moon")){
            imgvFortuneTellingCard.setImageResource(R.drawable.moon);
        }else if(card_name.contains("sun")){
            imgvFortuneTellingCard.setImageResource(R.drawable.sun);
        }else if(card_name.contains("judgement")){
            imgvFortuneTellingCard.setImageResource(R.drawable.judgement);
        }else if(card_name.contains("world")){
            imgvFortuneTellingCard.setImageResource(R.drawable.world);
        }else if(card_name.contains("king_of_wands")){
            imgvFortuneTellingCard.setImageResource(R.drawable.king_of_wands);
        }else if(card_name.contains("lady_of_wands")){
            imgvFortuneTellingCard.setImageResource(R.drawable.lady_of_wands);
        }else if(card_name.contains("knight_of_wands")){
            imgvFortuneTellingCard.setImageResource(R.drawable.knight_of_wands);
        }else if(card_name.contains("knave_of_wands")){
            imgvFortuneTellingCard.setImageResource(R.drawable.knave_of_wands);
        }else if(card_name.contains("ten_of_wands")){
            imgvFortuneTellingCard.setImageResource(R.drawable.ten_of_wands);
        }else if(card_name.contains("nine_of_wands")){
            imgvFortuneTellingCard.setImageResource(R.drawable.nine_of_wands);
        }else if(card_name.contains("eight_of_wands")){
            imgvFortuneTellingCard.setImageResource(R.drawable.eight_of_wands);
        }else if(card_name.contains("seven_of_wands")){
            imgvFortuneTellingCard.setImageResource(R.drawable.seven_of_wands);
        }else if(card_name.contains("six_of_wands")){
            imgvFortuneTellingCard.setImageResource(R.drawable.six_of_wands);
        }else if(card_name.contains("five_of_wands")){
            imgvFortuneTellingCard.setImageResource(R.drawable.five_of_wands);
        }else if(card_name.contains("four_of_wands")){
            imgvFortuneTellingCard.setImageResource(R.drawable.four_of_wands);
        }else if(card_name.contains("three_of_wands")){
            imgvFortuneTellingCard.setImageResource(R.drawable.three_of_wands);
        }else if(card_name.contains("two_of_wands")){
            imgvFortuneTellingCard.setImageResource(R.drawable.two_of_wands);
        }else if(card_name.contains("ace_of_wands")){
            imgvFortuneTellingCard.setImageResource(R.drawable.ace_of_wands);
        }else if(card_name.contains("king_of_cups")){
            imgvFortuneTellingCard.setImageResource(R.drawable.king_of_cups);
        }else if(card_name.contains("lady_of_cups")){
            imgvFortuneTellingCard.setImageResource(R.drawable.lady_of_cups);
        }else if(card_name.contains("knight_of_cups")){
            imgvFortuneTellingCard.setImageResource(R.drawable.knight_of_cups);
        }else if(card_name.contains("knave_of_cups")){
            imgvFortuneTellingCard.setImageResource(R.drawable.knave_of_cups);
        }else if(card_name.contains("ten_of_cups")){
            imgvFortuneTellingCard.setImageResource(R.drawable.ten_of_cups);
        }else if(card_name.contains("nine_of_cups")){
            imgvFortuneTellingCard.setImageResource(R.drawable.nine_of_cups);
        }else if(card_name.contains("eight_of_cups")){
            imgvFortuneTellingCard.setImageResource(R.drawable.eight_of_cups);
        }else if(card_name.contains("seven_of_cups")){
            imgvFortuneTellingCard.setImageResource(R.drawable.seven_of_cups);
        }else if(card_name.contains("six_of_cups")){
            imgvFortuneTellingCard.setImageResource(R.drawable.six_of_cups);
        }else if(card_name.contains("five_of_cups")){
            imgvFortuneTellingCard.setImageResource(R.drawable.five_of_cups);
        }else if(card_name.contains("four_of_cups")){
            imgvFortuneTellingCard.setImageResource(R.drawable.four_of_cups);
        }else if(card_name.contains("three_of")){
            imgvFortuneTellingCard.setImageResource(R.drawable.three_of_cups);
        }else if(card_name.contains("two_of_cups")){
            imgvFortuneTellingCard.setImageResource(R.drawable.two_of_cups);
        }else if(card_name.contains("ace_of_cups")){
            imgvFortuneTellingCard.setImageResource(R.drawable.ace_of_cups);
        }else if(card_name.contains("king_of_swords")){
            imgvFortuneTellingCard.setImageResource(R.drawable.king_of_swords);
        }else if(card_name.contains("lady_of_swords")){
            imgvFortuneTellingCard.setImageResource(R.drawable.lady_of_swords);
        }else if(card_name.contains("knight_of_swords")){
            imgvFortuneTellingCard.setImageResource(R.drawable.knight_of_swords);
        }else if(card_name.contains("knave_of_swords")){
            imgvFortuneTellingCard.setImageResource(R.drawable.knave_of_swords);
        }else if(card_name.contains("ten_of_swords")){
            imgvFortuneTellingCard.setImageResource(R.drawable.ten_of_swords);
        }else if(card_name.contains("nine_of_swords")){
            imgvFortuneTellingCard.setImageResource(R.drawable.nine_of_swords);
        }else if(card_name.contains("eight_of_swords")){
            imgvFortuneTellingCard.setImageResource(R.drawable.eight_of_swords);
        }else if(card_name.contains("seven_of_swords")){
            imgvFortuneTellingCard.setImageResource(R.drawable.seven_of_swords);
        }else if(card_name.contains("six_of_swords")){
            imgvFortuneTellingCard.setImageResource(R.drawable.six_of_swords);
        }else if(card_name.contains("five_of_swords")){
            imgvFortuneTellingCard.setImageResource(R.drawable.five_of_swords);
        }else if(card_name.contains("four_of_swords")){
            imgvFortuneTellingCard.setImageResource(R.drawable.four_of_swords);
        }else if(card_name.contains("three_of_swords")){
            imgvFortuneTellingCard.setImageResource(R.drawable.three_of_swords);
        }else if(card_name.contains("two_of_swords")){
            imgvFortuneTellingCard.setImageResource(R.drawable.two_of_swords);
        }else if(card_name.contains("ace_of_swords")){
            imgvFortuneTellingCard.setImageResource(R.drawable.ace_of_swords);
        }else if(card_name.contains("king_of_pentacles")){
            imgvFortuneTellingCard.setImageResource(R.drawable.king_of_pentacles);
        }else if(card_name.contains("lady_of_pentacles")){
            imgvFortuneTellingCard.setImageResource(R.drawable.lady_of_pentacles);
        }else if(card_name.contains("knight_of_pentacles")){
            imgvFortuneTellingCard.setImageResource(R.drawable.knight_of_pentacles);
        }else if(card_name.contains("knave_of_pentacles")){
            imgvFortuneTellingCard.setImageResource(R.drawable.knave_of_pentacles);
        }else if(card_name.contains("ten_of_pentacles")){
            imgvFortuneTellingCard.setImageResource(R.drawable.ten_of_pentacles);
        }else if(card_name.contains("nine_of_pentacles")){
            imgvFortuneTellingCard.setImageResource(R.drawable.nine_of_pentacles);
        }else if(card_name.contains("eight_of_pentacles")){
            imgvFortuneTellingCard.setImageResource(R.drawable.eight_of_pentacles);
        }else if(card_name.contains("seven_of_pentacles")){
            imgvFortuneTellingCard.setImageResource(R.drawable.seven_of_pentacles);
        }else if(card_name.contains("six_of_pentacles")){
            imgvFortuneTellingCard.setImageResource(R.drawable.six_of_pentacles);
        }else if(card_name.contains("five_of_pentacles")){
            imgvFortuneTellingCard.setImageResource(R.drawable.five_of_pentacles);
        }else if(card_name.contains("four_of_pentacles")){
            imgvFortuneTellingCard.setImageResource(R.drawable.four_of_pentacles);
        }else if(card_name.contains("three_of_pentacles")){
            imgvFortuneTellingCard.setImageResource(R.drawable.three_of_pentacles);
        }else if(card_name.contains("two_of_pentacles")){
            imgvFortuneTellingCard.setImageResource(R.drawable.two_of_pentacles);
        }else if(card_name.contains("ace_of_pentacles")){
            imgvFortuneTellingCard.setImageResource(R.drawable.ace_of_pentacles);
        }

        imgvFortuneTellingCard.setOnClickListener(view1 -> {
            CardDescriptionActivityIntent.putExtra(KEY_CARD_NAME, card_name);
            CardDescriptionActivityIntent.putExtra(KEY_CARDS_NAMES, (Serializable) cards_names);
            CardDescriptionActivityIntent.putExtra(KEY_ACTIVITY, "CardAdapter");

            List<Card> cards = App.getInstance().getDatabase().cardDao().getAll();
            for (Card c : cards) {
                Log.d("api", c.toString());
                if (c.getName().contains(card_name)) {
                    CardDescriptionActivityIntent.putExtra(KEY_CARD, c);
                }
            }
            context.startActivity(CardDescriptionActivityIntent);
        });

        return view;
    }
}
