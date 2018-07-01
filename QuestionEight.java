package com.example.android.myquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionEight extends AppCompatActivity {
    int scoreCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_eight);
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
                            Toast.makeText(QuestionEight.this,
                                    "Correct Answer!", Toast.LENGTH_SHORT).show();
                            scoreCounter = scoreCounter + 1;
                        }
                }
                Intent optionAIntent = new Intent(QuestionEight.this, QuestionNine.class);
                startActivity(optionAIntent);
            }
        });
        TextView optionB = (TextView) findViewById(R.id.option_B);
        //set a clickListener for option B on the view
        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QuestionEight.this,
                        "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent optionBIntent = new Intent(QuestionEight.this, QuestionNine.class);
                startActivity(optionBIntent);
            }
        });
        TextView optionC = (TextView) findViewById(R.id.option_C);
        //set a clickListener for option C on the view
        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QuestionEight.this,
                        "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent optionCIntent = new Intent(QuestionEight.this, QuestionNine.class);
                startActivity(optionCIntent);
            }
        });
        TextView optionD = (TextView) findViewById(R.id.option_D);
        //set a clickListener for option D on the view
        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QuestionEight.this,
                        "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent optionDIntent = new Intent(QuestionEight.this, QuestionNine.class);
                startActivity(optionDIntent);
            }
        });
    }
}
