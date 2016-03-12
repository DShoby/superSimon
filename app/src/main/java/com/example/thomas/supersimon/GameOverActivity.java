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

    private TextView numScoreF;
    private TextView numScoreM;
    private TextView numScoreD;

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


        Intent intentF = getIntent();
        int scoreF = intentF.getIntExtra(FacileActivity.EXTRA_GAME_OVER, 1);
        numScoreF = (TextView) findViewById(R.id.numScoreGOF);
        numScoreF.setText(String.valueOf(scoreF));

    }

    public void retour(View v) {
        Intent intentMS = new Intent(this, MainActivity.class);
        startActivity(intentMS);
    }

}
