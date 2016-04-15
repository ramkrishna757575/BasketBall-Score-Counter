package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0, scoreTeamB = 0;
    final int SCORE_THREE_POINTS = 3;
    final int SCORE_TWO_POINTS = 2;
    final int SCORE_ONE_POINT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void increment3Points(View view)
    {
        if(view.getId()==R.id.teamA_three_points){
            displayForTeamA(scoreTeamA += SCORE_THREE_POINTS);
        }else{
            displayForTeamB(scoreTeamB += SCORE_THREE_POINTS);
        }
    }

    public void increment2Points(View view)
    {
        if(view.getId()==R.id.teamA_two_points){
            displayForTeamA(scoreTeamA += SCORE_TWO_POINTS);
        }else{
            displayForTeamB(scoreTeamB += SCORE_TWO_POINTS);
        }
    }

    public void increment1Point(View view)
    {
        if(view.getId()==R.id.teamA_one_point){
            displayForTeamA(scoreTeamA += SCORE_ONE_POINT);
        }else{
            displayForTeamB(scoreTeamB += SCORE_ONE_POINT);
        }
    }

    public void resetScores(View view)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
