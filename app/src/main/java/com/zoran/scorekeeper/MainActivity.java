package com.zoran.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button left1 ;
    Button left3;
    Button left2 ;
    Button right3;
    Button right2 ;
    Button right1;
    TextView lScore_text_view;
    TextView rScore_text_view ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void assignView(){
        left3 = (Button) findViewById(R.id.lthree_btn);
        left2 = (Button) findViewById(R.id.ltwo_btn);
        left1 = (Button) findViewById(R.id.lft_btn);
        right3 = (Button) findViewById(R.id.rthree_btn);
        right2 = (Button) findViewById(R.id.rtwo_btn);
        right1 = (Button) findViewById(R.id.rft_btn);
        lScore_text_view = (TextView) findViewById(R.id.lscore_text_view);
        rScore_text_view = (TextView) findViewById(R.id.rscore_text_view);
    }

    public void resetBtn(View view){
            lScore_text_view.setText("0");
            rScore_text_view.setText("0");
    }

    public void addScoreButton(View view){
        addScoreBtn(view);
    }

    private void addScoreBtn(View view){
        assignView();
        if (view == left1){
            addScore(1,"left");
        }

        if (view == left2){
            addScore(2,"left");
        }

        if (view == left3){
            addScore(3,"left");
        }
        if (view == right1){
            addScore(1,"right");
        }

        if (view == right2){
            addScore(2,"right");
        }

        if (view == right3){
            addScore(3,"right");
        }

    }

    private void addScore(int num,String rightOrLeft){
        assignView();
        int lScore=0,rScore=0;


        if (num == 1 && rightOrLeft == "left"){
           lScore = Integer.parseInt(lScore_text_view.getText().toString());
            lScore++;
            lScore_text_view.setText(Integer.toString(lScore));
        }

        if (num == 2 && rightOrLeft == "left"){
            lScore = Integer.parseInt(lScore_text_view.getText().toString());
            lScore+=2;
            lScore_text_view.setText(Integer.toString(lScore));
        }

        if (num == 3 && rightOrLeft == "left"){
            lScore = Integer.parseInt(lScore_text_view.getText().toString());
            lScore+=3;
            lScore_text_view.setText(Integer.toString(lScore));
        }


        if (num == 1 && rightOrLeft == "right"){
            rScore = Integer.parseInt(rScore_text_view.getText().toString());
            rScore++;
            rScore_text_view.setText(Integer.toString(rScore));
        }

        if (num == 2 && rightOrLeft == "right"){
            rScore = Integer.parseInt(rScore_text_view.getText().toString());
            rScore+=2;
            rScore_text_view.setText(Integer.toString(rScore));
        }

        if (num == 3 && rightOrLeft == "right"){
            rScore = Integer.parseInt(rScore_text_view.getText().toString());
            rScore+=3;
            rScore_text_view.setText(Integer.toString(rScore));
        }

    }
}
