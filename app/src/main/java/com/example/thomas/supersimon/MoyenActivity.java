package com.example.thomas.supersimon;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class MoyenActivity extends AppCompatActivity {

    //game over
    public final static String EXTRA_GAME_OVER = "EXTRA_GAME_OVER";
    public final static int NUMBER_OF_LAUNCHES_REQUEST = 0;

    //boutons de couleur
    public Button btnVert;
    public Button btnRouge;
    public Button btnJaune;
    public Button btnBleu;
    public Button btnTurquoise;
    public Button btnViolet;

    private boolean en_jeu = true;
    private boolean bienRepondu = false;
    private int nbClic = 0;
    private int nbTours = 0;
    private ArrayList<Button> tabBtns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moyen);

        final Button btnRetour = (Button) findViewById(R.id.idButtonRetour);
        btnRetour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                retour(v);
            }
        });

        final Button btnJouer = (Button) findViewById(R.id.idButtonJouer);
        btnJouer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                jouer();
            }
        });

        //boutons de couleurs
        btnVert = (Button) findViewById(R.id.idButtonNiv1_1);
        btnRouge = (Button) findViewById(R.id.idButtonNiv1_2);
        btnJaune = (Button) findViewById(R.id.idButtonNiv1_3);
        btnBleu = (Button) findViewById(R.id.idButtonNiv1_4);
        btnTurquoise = (Button) findViewById(R.id.idButtonNiv2_1);
        btnViolet = (Button) findViewById(R.id.idButtonNiv2_2);

        btnVert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clignoter(btnVert);

                if(en_jeu){
                    //verif
                    verif(btnVert);
                }
            }
        });

        btnRouge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clignoter(btnRouge);

                if(en_jeu){
                    //verif
                    verif(btnRouge);
                }
            }
        });

        btnJaune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clignoter(btnJaune);

                if(en_jeu){
                    //verif
                    verif(btnJaune);
                }
            }
        });

        btnBleu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clignoter(btnBleu);

                if(en_jeu){
                    //verif
                    verif(btnBleu);
                }
            }
        });

        btnTurquoise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clignoter(btnTurquoise);

                if(en_jeu){
                    //verif
                    verif(btnTurquoise);
                }
            }
        });

        btnViolet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clignoter(btnViolet);

                if(en_jeu){
                    //verif
                    verif(btnViolet);
                };
            }
        });


        tabBtns = new ArrayList<Button>();//on créé l'arraylist contenant les boutons

        System.out.println("MoyenActivity.onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("MoyenActivity.onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("MoyenActivity.onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("MoyenActivity.onRestart");
    }

    @Override
    protected void onPause() {
        System.out.println("MoyenActivity.onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        System.out.println("MoyenActivity.onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        System.out.println("MoyenActivity.onDestroy");
        super.onDestroy();
    }

    public void retour(View v) {
        finish();
    }

    //jouer
    public void jouer(){
        en_jeu  = true;
        boutonSupplementaire();
    }

    //clignotement d'un bouton
    public void clignoter(Button btn){
        if(btn == btnVert){
            btnVert.setBackgroundColor(getResources().getColor(R.color.vertClique));
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btnVert.setBackgroundColor(getResources().getColor(R.color.vert));
                }
            }, 100);
        }
        else if(btn == btnRouge){
            btnRouge.setBackgroundColor(getResources().getColor(R.color.rougeClique));
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btnRouge.setBackgroundColor(getResources().getColor(R.color.rouge));
                }
            }, 100);
        }
        else if(btn == btnJaune){
            btnJaune.setBackgroundColor(getResources().getColor(R.color.jauneClique));
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btnJaune.setBackgroundColor(getResources().getColor(R.color.jaune));
                }
            }, 100);
        }
        else if(btn == btnBleu){
            btnBleu.setBackgroundColor(getResources().getColor(R.color.bleuClique));
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btnBleu.setBackgroundColor(getResources().getColor(R.color.bleu));
                }
            }, 100);
        }
        else if(btn == btnTurquoise){
            btnTurquoise.setBackgroundColor(getResources().getColor(R.color.turquoiseClique));
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btnTurquoise.setBackgroundColor(getResources().getColor(R.color.turquoise));
                }
            }, 100);
        }
        else if(btn == btnViolet){
            btnViolet.setBackgroundColor(getResources().getColor(R.color.violetClique));
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btnViolet.setBackgroundColor(getResources().getColor(R.color.violet));
                }
            }, 100);
        }
    }

    //ajouter un bouton dans l'arraylist
    public void boutonSupplementaire(){
        //random
        Random rand = new Random();
        int num = rand.nextInt(6);

        if(num==0){
            //bouton Vert
            clignoter(btnVert);
            tabBtns.add(btnVert);
        }
        else if(num==1){
            //bouton Rouge
            clignoter(btnRouge);
            tabBtns.add(btnRouge);
        }
        else if(num==2){
            //bouton Jaune
            clignoter(btnJaune);
            tabBtns.add(btnJaune);
        }
        else if(num==3){
            //bouton Bleu
            clignoter(btnBleu);
            tabBtns.add(btnBleu);
        }
        else if(num==4){
            //bouton Turquoise
            clignoter(btnTurquoise);
            tabBtns.add(btnTurquoise);
        }
        else if(num==5){
            //bouton Violet
            clignoter(btnViolet);
            tabBtns.add(btnViolet);
        }

        nbTours++;
    }

    //verif du boutons cliqués
    public void verif(Button btn){
        if(nbClic == tabBtns.size()-1){
            if(btn == tabBtns.get(nbClic)) {
                bienRepondu = true;
                nbClic = 0;
            }
            else{
                fin();
            }
            boutonSupplementaire();
        }
        else if(btn == tabBtns.get(nbClic)){
            bienRepondu = true;
            nbClic ++;
        }
        else{
            fin();
        }
    }

    //fin
    public void fin(){
        /*Intent intentMS = new Intent(this, GameOverActivity.class);
        startActivity(intentMS);*/

        Intent intent = new Intent(this, GameOverActivity.class);
        intent.putExtra(EXTRA_GAME_OVER, nbTours);
        startActivityForResult(intent, NUMBER_OF_LAUNCHES_REQUEST);
    }

}
