package com.example.android.chesscount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double scorePlayerWhite = 0;
    double scorePlayerBlack= 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scoreGetPawnByWhite(View view){
        scorePlayerWhite++;
        this.displayScorePlayerWhite();

    }

    public void scoreGeBishopByWhite(View view){
        scorePlayerWhite = scorePlayerWhite + 3.0;
        this.displayScorePlayerWhite();

    }

    public void scoreGetKnightByWhite(View view){
        scorePlayerWhite = scorePlayerWhite + 3.5;
        this.displayScorePlayerWhite();

    }

    public void scoreGetRookByWhite(View view){
        scorePlayerWhite = scorePlayerWhite + 5;
        this.displayScorePlayerWhite();

    }

    public void scoreGetQueenByWhite(View view){
        scorePlayerWhite = scorePlayerWhite + 10;
        this.displayScorePlayerWhite();

    }

    public void scoreGetKingByWhite(View view){

        this.displayWinByWhiter();

    }

    public void displayScorePlayerWhite(){
        TextView scoreView = (TextView) findViewById(R.id.team_w_score);
        scoreView.setText(String.valueOf(scorePlayerWhite));
    }

    public void displayWinByWhiter(){
        TextView scoreView = (TextView) findViewById(R.id.team_w_score);
        scoreView.setText("Winner by Player White !!!");

    }


    public void scoreGetPawnByBlack(View view){
        scorePlayerWhite++;
        this.displayScorePlayerBlack();

    }

    public void scoreGeBishopByBlack(View view){
        scorePlayerWhite = scorePlayerWhite + 3.0;
        this.displayScorePlayerBlack();

    }

    public void scoreGetKnightByBlack(View view){
        scorePlayerWhite = scorePlayerWhite + 3.5;
        this.displayScorePlayerBlack();

    }

    public void scoreGetRookByBlack(View view){
        scorePlayerWhite = scorePlayerWhite + 5;
        this.displayScorePlayerBlack();

    }

    public void scoreGetQueenByBlack(View view){
        scorePlayerWhite = scorePlayerWhite + 10;
        this.displayScorePlayerBlack();

    }

    public void scoreGetKingByBlack(View view){
        this.displayWinByBlack();

    }

    public void displayScorePlayerBlack(){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scorePlayerWhite));

    }

    public void displayWinByBlack(){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText("Winner by Player Black !!!");

    }


    public void reset(View view){
        ((TextView) findViewById(R.id.team_w_score)).setText("0.0");
        ((TextView) findViewById(R.id.team_b_score)).setText("0.0");
        scorePlayerWhite = 0;
        scorePlayerBlack= 0;


    }


}
