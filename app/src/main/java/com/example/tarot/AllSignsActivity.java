package com.example.tarot;

import static com.example.tarot.ChooseCardForDescribeActivity.KEY_ACTIVITY;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.List;

public class AllSignsActivity extends AppCompatActivity {
    TextView tvName, tvBack, tvScorpio, tvAries, tvTaurus, tvGemini, tvCancer, tvLeo, tvVirgo, tvLibra, tvSagittarius, tvCapricorn, tvAquarius, tvPisces;
    private List<Sign> signs;
    public static final String KEY_SIGN = "sign";
    Intent SignUnitActivityIntent;
    Intent SingCompatibilityActivityIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_signs);

        getSupportActionBar().hide();

        Bundle arguments = getIntent().getExtras();

        String chosen_activity = (String) arguments.getSerializable(KEY_ACTIVITY);

        Intent ChooseSingActionActivityIntent = new Intent(this, com.example.tarot.ChooseSingActionActivity.class);
        SignUnitActivityIntent = new Intent(this, com.example.tarot.SignUnitActivity.class);
        SingCompatibilityActivityIntent = new Intent(this, com.example.tarot.SingCompatibilityActivity.class);

        tvBack = findViewById(R.id.tvBack);
        tvAries = findViewById(R.id.tvAries);
        tvTaurus = findViewById(R.id.tvTaurus);
        tvGemini = findViewById(R.id.tvGemini);
        tvCancer = findViewById(R.id.tvCancer);
        tvLeo = findViewById(R.id.tvLeo);
        tvVirgo = findViewById(R.id.tvVirgo);
        tvLibra = findViewById(R.id.tvLibra);
        tvScorpio = findViewById(R.id.tvScorpio);
        tvSagittarius = findViewById(R.id.tvSagittarius);
        tvCapricorn = findViewById(R.id.tvCapricorn);
        tvAquarius = findViewById(R.id.tvAquarius );
        tvPisces = findViewById(R.id.tvPisces);
        tvName = findViewById(R.id.tvName);
        signs = App.getInstance().getDatabase().signDao().getAll();


        if(chosen_activity.contains("SignUnitActivity")) {
            tvName.setText("Description");
        }
        if(chosen_activity.contains("SingCompatibilityActivity")) {
            tvName.setText("Sympathy");
        }

        tvBack.setOnClickListener(view -> {
            startActivity(ChooseSingActionActivityIntent);
        });

        tvAries.setOnClickListener(view -> {
            getSing("Aries", chosen_activity);
        });
        tvTaurus.setOnClickListener(view -> {
            getSing("Taurus", chosen_activity);
        });
        tvGemini.setOnClickListener(view -> {
            getSing("Gemini", chosen_activity);
        });
        tvCancer.setOnClickListener(view -> {
            getSing("Cancer", chosen_activity);
        });
        tvLeo.setOnClickListener(view -> {
            getSing("Leo", chosen_activity);
        });
        tvVirgo.setOnClickListener(view -> {
            getSing("Virgo", chosen_activity);
        });
        tvLibra.setOnClickListener(view -> {
            getSing("Libra", chosen_activity);
        });
        tvScorpio.setOnClickListener(view -> {
            getSing("Scorpio", chosen_activity);
        });
        tvSagittarius.setOnClickListener(view -> {
            getSing("Sagittarius", chosen_activity);
        });
        tvCapricorn.setOnClickListener(view -> {
            getSing("Capricorn", chosen_activity);
        });
        tvAquarius.setOnClickListener(view -> {
            getSing("Aquarius", chosen_activity);
        });
        tvPisces.setOnClickListener(view -> {
            getSing("Pisces", chosen_activity);
        });
    }

    public void getSing(String sing_name, String chosen_activity){
        for (Sign s : signs) {
            if (s.getName().contains(sing_name)) {
                if(chosen_activity.contains("SignUnitActivity")){
                    SignUnitActivityIntent.putExtra(KEY_SIGN, s);
                    startActivity(SignUnitActivityIntent);
                }
                if(chosen_activity.contains("SingCompatibilityActivity")){
                    SingCompatibilityActivityIntent.putExtra(KEY_SIGN, s);
                    startActivity(SingCompatibilityActivityIntent);
                }
            }
        }
    }
}