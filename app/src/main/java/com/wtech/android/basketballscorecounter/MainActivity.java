package com.wtech.android.basketballscorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int team_a_score = 0;
    int team_b_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adds 1 point to the score counter for Team A
     */
    public void onePointer_teamA(View view) {
        team_a_score++;
        displayForTeamA(team_a_score);
    }

    /**
     * Adds 1 point to the score counter for Team A
     */
    public void twoPointer_teamA(View view) {
        team_a_score+=2;
        displayForTeamA(team_a_score);
    }

    /**
     * Adds 1 point to the score counter for Team A
     */
    public void threePointer_teamA(View view) {
        team_a_score+=3;
        displayForTeamA(team_a_score);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /* TEAM B */

    /**
     * Adds 1 point to the score counter for Team B
     */
    public void onePointer_teamB(View view) {
        team_b_score++;
        displayForTeamB(team_b_score);
    }

    /**
     * Adds 1 point to the score counter for Team B
     */
    public void twoPointer_teamB(View view) {
        team_b_score+=2;
        displayForTeamB(team_b_score);
    }

    /**
     * Adds 1 point to the score counter for Team B
     */
    public void threePointer_teamB(View view) {
        team_b_score+=3;
        displayForTeamB(team_b_score);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset all the fields to 0
     */
    public void reset(View view) {
        team_a_score = 0;
        team_b_score = 0;
        displayForTeamA(team_a_score);
        displayForTeamB(team_b_score);
    }
}
