package com.ayusma.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsForTeamA(View view) {
        int score = 3;
        scoreTeamA = scoreTeamA + score;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointsForTeamA(View view) {
        int score = 2;
        scoreTeamA = scoreTeamA + score;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrowForTeamA(View view) {
        int score = 1;
        scoreTeamA = scoreTeamA + score;
        displayForTeamA(scoreTeamA);
    }

    private void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsForTeamB(View view) {
        int score = 3;
        scoreTeamB = scoreTeamB + score;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointsForTeamB(View view) {
        int score = 2;
        scoreTeamB = scoreTeamB + score;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowForTeamB(View view) {
        int score = 1;
        scoreTeamB = scoreTeamB + score;
        displayForTeamB(scoreTeamB);
    }

    public void DisplayresetScore(int score) {
        TextView scoreViewB = findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));

        TextView scoreViewA = findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(score));
    }

    public void resetButtton(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        DisplayresetScore(scoreTeamA);
        DisplayresetScore(scoreTeamB);
    }

}
