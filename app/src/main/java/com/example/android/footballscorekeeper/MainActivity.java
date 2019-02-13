package com.example.android.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //Track the score for Home Team
    int scoreHome = 0;
    //Track the score for Away Team
    int scoreAway = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.btn1);
    }

    /**
     * Increase the score for Home Team by 6 points.
     */
    public void addSixForHome(View v) {
        scoreHome = scoreHome + 6;
        displayHome(scoreHome);
        {
            Toast.makeText(this, "TouchDowns", Toast.LENGTH_LONG).show();
        }
    }
    /**
     * Increase the score for Home Team by 3 points.
     */
    public void addThreeForHome (View v) {
        scoreHome = scoreHome + 3;
        displayHome(scoreHome);
        {
            Toast.makeText(this, "Field Goals", Toast.LENGTH_LONG).show();
        }
    }
    /**
     * Increase the score for Home Team by 2 points.
     */
    public void addTwoForHome (View v) {
        scoreHome = scoreHome + 2;
        displayHome(scoreHome);
        {
            Toast.makeText(this, "Conversions", Toast.LENGTH_LONG).show();
        }
    }
    /**
     * Increase the score for Home Team by 2 points.
     */
    public void addOneForHome (View V) {
        scoreHome = scoreHome + 1;
        displayHome(scoreHome);
        {
            Toast.makeText(this, "Extra Points", Toast.LENGTH_LONG).show();
        }
    }
    /**
     * Decrease the score for Home Team by 2 points.
     */
    public void subtractTwoForHome (View v) {
        scoreHome = scoreHome - 2;
        displayHome(scoreHome);
        {
            Toast.makeText(this, "Safeties", Toast.LENGTH_LONG).show();
        }
    }
    /**
     * Increase the score for Away Team by 6 points.
     */
    public void addSixForAway (View v) {
        scoreAway = scoreAway + 6;
        displayAway(scoreAway);
        {
            Toast.makeText(this, "TouchDowns", Toast.LENGTH_LONG).show();
        }
    }
    /**
     * Increase the score for Away Team by 3 points.
     */
    public void addThreeForAway (View v) {
        scoreAway = scoreAway + 3;
        displayAway(scoreAway);
        {
            Toast.makeText(this, "Field Goals", Toast.LENGTH_LONG).show();
        }
    }
    /**
     * Increase the score for Away Team by 2 points.
     */
    public void addTwoForAWay (View v) {
        scoreAway = scoreAway + 2;
        displayAway(scoreAway);
        {
            Toast.makeText(this, "Conversions", Toast.LENGTH_LONG).show();
        }
    }
    /**
     * Increase the score for Away Team by 1 points.
     */
    public void addOneForAway (View v) {
        scoreAway = scoreAway + 1;
        displayAway(scoreAway);
        {
            Toast.makeText(this,"Extra Points",Toast.LENGTH_LONG).show();
        }
    }
    /**
     * Decrease the score for Away Team by 2 points.
     */
    public void subtractTwoForAway (View v) {
        scoreAway = scoreAway - 2;
        displayAway(scoreAway);
        {
            Toast.makeText(this,"Safeties",Toast.LENGTH_LONG).show();
        }
    }
    /**
     * Reset the score for both teams back to zero.
     */
    public void resetScore (View v){
        scoreHome = 0;
        scoreAway = 0;
        displayHome(scoreHome);
        displayAway(scoreAway);
        {
            Toast.makeText(this, "Reset", Toast.LENGTH_LONG).show();
        }
    }
    /**
     * Displays the given score for Home Team.
     */
    public void displayHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }
       /**
     * Displays the given score for Away Team.
     */
    public void displayAway(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_score);
        scoreView.setText(String.valueOf(score));
    }

}
