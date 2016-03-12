package com.example.thomas.supersimon;

import java.util.Timer;
import java.util.TimerTask;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final static int EXTRA_LEVEL_FACILE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnFacile = (Button) findViewById(R.id.idButtonNiv1);
        btnFacile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                levelFacile(v);
            }
        });

        final Button btnMoyen = (Button) findViewById(R.id.idButtonNiv2);
        btnMoyen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                levelMoyen(v);
            }
        });

        final Button btnDifficile = (Button) findViewById(R.id.idButtonNiv3);
        btnDifficile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                levelDifficile(v);
            }
        });

        /*final Button btnMeilleurScore = (Button) findViewById(R.id.idButtonMeilleurScore);
        btnMeilleurScore.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                meilleurScore(v);
            }
        });*/

        System.out.println("MainActivity.onCreate");
    }


    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("MainActivity.onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("MainActivity.onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("MainActivity.onRestart");
    }

    @Override
    protected void onPause() {
        System.out.println("MainActivity.onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        System.out.println("MainActivity.onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        System.out.println("MainActivity.onDestroy");
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void levelFacile(View v){
        Intent intentFacile = new Intent(this, FacileActivity.class);
        startActivity(intentFacile);
    }

    public void levelMoyen(View v){
        Intent intentMoyen = new Intent(this, MoyenActivity.class);
        startActivity(intentMoyen);
    }

    public void levelDifficile(View v){
        Intent intentDifficile = new Intent(this, DifficileActivity.class);
        startActivity(intentDifficile);
    }

    /*public void meilleurScore(View v){
        Intent intentMS = new Intent(this, MeilleurScoreActivity.class);
        startActivity(intentMS);
    }*/
}
