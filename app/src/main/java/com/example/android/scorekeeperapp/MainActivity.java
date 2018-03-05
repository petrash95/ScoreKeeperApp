package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {
   private int quantityA = 0;
    private int quantityB = 0;
    private int quantityC = 0;
    private int sumA = 0;
    private int sumB = 0;
    private int sumC = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Add one for a team
    public void addOneForTeamA(View view) {
        quantityA = quantityA + 1;
        displayForTeamA(quantityA);
    }

    public void addOneForTeamB(View view) {
        quantityB = quantityB + 1;
        displayForTeamB(quantityB);
    }

    public void addOneForTeamC(View view) {
        quantityC = quantityC + 1;
        displayForTeamC(quantityC);
    }

    //Minus one for a team

    public void minusOneTeamA(View view) {
        quantityA = quantityA - 1;
        displayForTeamA(quantityA);
    }

    public void minusOneTeamB(View view) {
        quantityB = quantityB - 1;
        displayForTeamB(quantityB);
    }

    public void minusOneTeamC(View view) {
        quantityC = quantityC - 1;
        displayForTeamC(quantityC);
    }
//Revealing the winner

    public void winnerA(View view) {
        String quantityA = "WINNER";
        String quantityB = "X";
        String quantityC = "X";
        revealForTeamA(quantityA);
        revealForTeamB(quantityB);
        revealForTeamC(quantityC);
        sumA = sumA + 1;
        summerizeA(sumA);
    }

    public void winnerB(View view) {
        String quantityA = "X";
        String quantityB = "WINNER";
        String quantityC = "X";
        revealForTeamA(quantityA);
        revealForTeamB(quantityB);
        revealForTeamC(quantityC);
        sumB = sumB + 1;
        summerizeB(sumB);
    }

    public void winnerC(View view) {
        String quantityA = "X";
        String quantityB = "X";
        String quantityC = "WINNER";
        revealForTeamA(quantityA);
        revealForTeamB(quantityB);
        revealForTeamC(quantityC);
        sumC = sumC + 1;
        summerizeC(sumC);
    }

    public void reset(View view) {
        quantityA = 0;
        quantityB = 0;
        quantityC = 0;
        displayForTeamA(quantityA);
        displayForTeamB(quantityA);
        displayForTeamC(quantityA);
    }




    public void revealForTeamA(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void revealForTeamB(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void revealForTeamC(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_c_score);
        scoreView.setText(String.valueOf(score));
    }








    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamC(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_c_score);
        scoreView.setText(String.valueOf(score));
    }

// Amount of win

    public void summerizeA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_sum);
        scoreView.setText(String.valueOf(score));
    }

    public void summerizeB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_sum);
        scoreView.setText(String.valueOf(score));
    }

    public void summerizeC(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_c_sum);
        scoreView.setText(String.valueOf(score));
    }


}
