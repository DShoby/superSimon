package com.example.thomas.supersimon;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MeilleurScoreActivity extends AppCompatActivity {

    public final static String MEILLEUR_SCORE_FACILE = "MEILLEUR_SCORE_FACILE";
    public final static String MEILLEUR_SCORE_MOYEN = "MEILLEUR_SCORE_MOYEN";
    public final static String MEILLEUR_SCORE_DIFFICILE = "MEILLEUR_SCORE_DIFFICILE";
    public int meilleurScoreFacile = 0;
    public int meilleurScoreMoyen = 0;
    public int meilleurScoreDifficile = 0;

    private TextView numMeilleurFacile;
    private TextView numMeilleurMoyen;
    private TextView numMeilleurDifficile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meilleur_score);

        System.out.println("MeilleurScoreActivity.onCreate");

        numMeilleurFacile = (TextView) findViewById(R.id.numMeilleurFacile);
        if (savedInstanceState != null) {
            meilleurScoreFacile = savedInstanceState.getInt(MEILLEUR_SCORE_FACILE);
            numMeilleurFacile.setText(meilleurScoreFacile);
        }

        numMeilleurMoyen = (TextView) findViewById(R.id.numMeilleurMoyen);
        if (savedInstanceState != null) {
            meilleurScoreMoyen = savedInstanceState.getInt(MEILLEUR_SCORE_MOYEN);
            numMeilleurMoyen.setText(meilleurScoreMoyen);
        }

        numMeilleurDifficile = (TextView) findViewById(R.id.numMeilleurDifficile);
        if (savedInstanceState != null) {
            meilleurScoreDifficile = savedInstanceState.getInt(MEILLEUR_SCORE_DIFFICILE);
            numMeilleurDifficile.setText(meilleurScoreDifficile);
        }

        final Button btnMenuPrincipal = (Button) findViewById(R.id.idButtonMenuPrincipal);
        btnMenuPrincipal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                retour(v);
            }
        });

        final Button btnclique = (Button) findViewById(R.id.idButtonRejouer);
        btnclique.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                test(v);
            }
        });

    }

    @Override
    protected void onSaveInstanceState (Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(MEILLEUR_SCORE_FACILE, meilleurScoreFacile);
        outState.putInt(MEILLEUR_SCORE_MOYEN, meilleurScoreMoyen);
        outState.putInt(MEILLEUR_SCORE_DIFFICILE, meilleurScoreDifficile);
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("MeilleurScoreActivity.onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("MeilleurScoreActivity.onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("MeilleurScoreActivity.onRestart");
    }

    @Override
    protected void onPause() {
        System.out.println("MeilleurScoreActivity.onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        System.out.println("MeilleurScoreActivity.onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        System.out.println("MeilleurScoreActivity.onDestroy");
        super.onDestroy();
    }

    public void retour(View v) {
        finish();
    }

    public void test(View v){
        meilleurScoreFacile += 1;
        numMeilleurFacile.setText(String.valueOf(meilleurScoreFacile));
    }

}
