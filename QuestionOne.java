package com.example.android.myquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionOne extends AppCompatActivity {
    int scoreCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);
        TextView optionA = (TextView) findViewById(R.id.option_A);
        //set a clickListener for option A on the view
        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked = ((RadioButton) view).isChecked();
                // Check which radio button was clicked
                switch (view.getId()) {
                    case R.id.option_A:
                        if (checked) {
                            Toast.makeText(QuestionOne.this,
                                    "Correct Answer!", Toast.LENGTH_SHORT).show();
                            scoreCounter = scoreCounter + 1;
                        }
                }
                Intent optionAIntent = new Intent(QuestionOne.this, QuestionTwo.class);
                startActivity(optionAIntent);
            }
        });
        TextView optionB = (TextView) findViewById(R.id.option_B);
        //set a clickListener for option B on the view
        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QuestionOne.this,
                        "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent optionBIntent = new Intent(QuestionOne.this, QuestionTwo.class);
                startActivity(optionBIntent);
            }
        });
        TextView optionC = (TextView) findViewById(R.id.option_C);
        //set a clickListener for option C on the view
        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QuestionOne.this,
                        "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent optionCIntent = new Intent(QuestionOne.this, QuestionTwo.class);
                startActivity(optionCIntent);
            }
        });
        TextView optionD = (TextView) findViewById(R.id.option_D);
        //set a clickListener for option D on the view
        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QuestionOne.this,
                        "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent optionDIntent = new Intent(QuestionOne.this, QuestionTwo.class);
                startActivity(optionDIntent);
            }
        });
    }
}