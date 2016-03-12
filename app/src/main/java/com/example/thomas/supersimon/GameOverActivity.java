package com.example.thomas.supersimon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    private TextView numScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        final Button btnMenuPrincipal = (Button) findViewById(R.id.idButtonMenuPrincipal);
        btnMenuPrincipal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                retour(v);
            }
        });

        final Button btnRejouer = (Button) findViewById(R.id.idButtonRejouer);
        btnRejouer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                rejouer(v);
            }
        });


        Intent intent = getIntent();
        int score = intent.getIntExtra(FacileActivity.EXTRA_GAME_OVER, 1);
        numScore = (TextView) findViewById(R.id.numScoreGO);
        numScore.setText(String.valueOf(score));

    }

    public void retour(View v) {
        Intent intentMS = new Intent(this, MainActivity.class);
        startActivity(intentMS);
    }

    public void rejouer(View v) {
        finish();
    }

}
