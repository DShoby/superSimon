package com.example.thomas.supersimon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class FacileActivity extends AppCompatActivity {

    //boutons de couleur
    private Button btnVert;
    private Button btnRouge;
    private Button btnJaune;
    private Button btnBleu;

    private boolean en_jeu = true;
    private boolean bienRepondu = false;
    private int nbTours = 0;
    private ArrayList<Button> tabBtns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facile);

        final Button btnRetour = (Button) findViewById(R.id.idButtonRetour);
        btnRetour.setOnClickListener(new View.OnClickListener() {
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

        //boutons de couleurs
        btnVert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //btnVert.setBackgroundColor(vertClique);
            }
        });

        btnRouge.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                retour(v);
            }
        });

        btnJaune.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                retour(v);
            }
        });

        btnBleu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                retour(v);
            }
        });


        btnVert = (Button) findViewById(R.id.idButtonNiv1_1);
        btnRouge = (Button) findViewById(R.id.idButtonNiv1_2);
        btnJaune = (Button) findViewById(R.id.idButtonNiv1_3);
        btnBleu = (Button) findViewById(R.id.idButtonNiv1_4);


        //jouer
        tabBtns = new ArrayList<Button>();
        jouerFacile();

        System.out.println("FacileActivity.onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
            System.out.println("FacileActivity.onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
            System.out.println("FacileActivity.onResume");
        }

        @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("FacileActivity.onRestart");
        }

    @Override
    protected void onPause() {
        System.out.println("FacileActivity.onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        System.out.println("FacileActivity.onStop");
        super.onStop();
    }

        @Override
    protected void onDestroy() {
        System.out.println("FacileActivity.onDestroy");
        super.onDestroy();
    }

    public void retour(View v) {
        finish();
    }

    public void rejouer(View v) {
        finish();
    }

    //jouer
    public void jouerFacile(){
        boutonSupplementaire();
    }

    public void boutonSupplementaire(){
        //random
        Random rand = new Random();
        int num = rand.nextInt(3);

        if(num==0){
            //bouton Vert
            btnVert.setText(String.valueOf(nbTours+1));
            tabBtns.add(btnVert);
        }
        else if(num==1){
            //bouton Rouge
            btnRouge.setText(String.valueOf(nbTours+1));
            tabBtns.add(btnRouge);
        }
        else if(num==2){
            //bouton Jaune
            btnJaune.setText(String.valueOf(nbTours+1));
            tabBtns.add(btnJaune);
        }
        else if(num==3){
            //bouton Bleu
            btnBleu.setText(String.valueOf(nbTours+1));
            tabBtns.add(btnBleu);
        }

        nbTours++;
    }

    //fin
    public void fin(){
        Intent intentMS = new Intent(this, GameOverActivity.class);
        startActivity(intentMS);
    }

}
