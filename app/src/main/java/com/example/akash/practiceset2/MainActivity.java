package com.example.akash.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int finalScoreforA = 0;
    int finalScoreforB = 0;
    public void increase3A(View view){
        finalScoreforA = finalScoreforA+3;
        TextView score=(TextView) findViewById(R.id.socreA_text_view);
        score.setText(""+finalScoreforA);
    }

    public void increase2A(View view){
        finalScoreforA = finalScoreforA+2;
        TextView score=(TextView) findViewById(R.id.socreA_text_view);
        score.setText(""+finalScoreforA);
    }

    public void freethrowA(View view){
        finalScoreforA = finalScoreforA+1;
        TextView score=(TextView) findViewById(R.id.socreA_text_view);
        score.setText(""+finalScoreforA);
    }

    public void increase3B(View view){
        finalScoreforB = finalScoreforB+3;
        TextView score=(TextView) findViewById(R.id.socreB_text_view);
        score.setText(""+finalScoreforB);
    }

    public void increase2B(View view){
        finalScoreforB = finalScoreforB+2;
        TextView score=(TextView) findViewById(R.id.socreB_text_view);
        score.setText(""+finalScoreforB);
    }

    public void freethrowB(View view){
        finalScoreforB = finalScoreforB+1;
        TextView score=(TextView) findViewById(R.id.socreB_text_view);
        score.setText(""+finalScoreforB);
    }

    public void reset(View view){
        finalScoreforB = 0;
        TextView score=(TextView) findViewById(R.id.socreB_text_view);
        score.setText(""+finalScoreforB);
        finalScoreforA = 0;
        TextView scoreA=(TextView) findViewById(R.id.socreA_text_view);
        scoreA.setText(""+finalScoreforA);
    }
}
