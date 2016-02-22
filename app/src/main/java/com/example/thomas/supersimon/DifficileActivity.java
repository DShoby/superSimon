package com.example.thomas.supersimon;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class DifficileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficile);

        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

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


        System.out.println("DifficileActivity.onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("DifficileActivity.onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("DifficileActivity.onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("DifficileActivity.onRestart");
    }

    @Override
    protected void onPause() {
        System.out.println("DifficileActivity.onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        System.out.println("DifficileActivity.onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        System.out.println("MainActivity.onDestroy");
        super.onDestroy();
    }

    public void retour(View v) {
        finish();
    }

    public void rejouer(View v) {
        finish();
    }

}
