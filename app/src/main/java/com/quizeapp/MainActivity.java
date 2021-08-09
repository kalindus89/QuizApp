package com.quizeapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AnswersSelectionClass [] questionBank = new AnswersSelectionClass[]{
            new AnswersSelectionClass(R.string.question_1,R.string.question1_A,R.string.question1_B,R.string.question1_C,R.string.question1_D,R.string.answer_1),
            new AnswersSelectionClass(R.string.question_2,R.string.question_2A,R.string.question_2B,R.string.question_2C,R.string.question_2D,R.string.answer_2),
            new AnswersSelectionClass(R.string.question_3,R.string.question_3A,R.string.question_3B,R.string.question_3C,R.string.question_3D,R.string.answer_3),
            new AnswersSelectionClass(R.string.question_4,R.string.question_4A,R.string.question_4B,R.string.question_4C,R.string.question_4D,R.string.answer_4),
            new AnswersSelectionClass(R.string.question_5,R.string.question_5A,R.string.question_5B,R.string.question_5C,R.string.question_5D,R.string.answer_5),
            new AnswersSelectionClass(R.string.question_6,R.string.question_6A,R.string.question_6B,R.string.question_6C,R.string.question_6D,R.string.answer_6),
            new AnswersSelectionClass(R.string.question_7,R.string.question_7A,R.string.question_7B,R.string.question_7C,R.string.question_7D,R.string.answer_7),
            new AnswersSelectionClass(R.string.question_8,R.string.question_8A,R.string.question_8B,R.string.question_8C,R.string.question_8D,R.string.answer_8),
    };

    private TextView optionA,optionB,optionC,optionD;
    private TextView questionnumber,question,score;
    private TextView chechkout1,checkout2;
    ProgressBar progressBar;
    int currentIndex;
    int mScore=0;
    int qn=1;// question numner

    final int PROGRESS_BAR=(int)Math.ceil(100/questionBank.length);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        optionA=findViewById(R.id.optionA);
        optionB=findViewById(R.id.optionB);
        optionC=findViewById(R.id.optionC);
        optionD=findViewById(R.id.optionD);

        questionnumber=findViewById(R.id.QuestionNumber);
        question = findViewById(R.id.question);
        score=findViewById(R.id.score);

        chechkout1=findViewById(R.id.selectOption);
        checkout2=findViewById(R.id.correctAnswer);
        progressBar=findViewById(R.id.progress_bar);

        question.setText(questionBank[currentIndex].getQuestionId());
        optionA.setText(questionBank[currentIndex].getOptionA());
        optionB.setText(questionBank[currentIndex].getOptionB());
        optionC.setText(questionBank[currentIndex].getOptionC());
        optionD.setText(questionBank[currentIndex].getOptionD());

        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                checkAnswer(questionBank[currentIndex].getOptionA());
                updateQuestion();

            }
        });

        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                checkAnswer(questionBank[currentIndex].getOptionB());
                updateQuestion();

            }
        });

        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                checkAnswer(questionBank[currentIndex].getOptionC());
                updateQuestion();

            }
        });

        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                checkAnswer(questionBank[currentIndex].getOptionD());
                updateQuestion();

            }
        });



    }

    private void checkAnswer(int userSelection) {

        chechkout1.setText(userSelection);
        checkout2.setText(questionBank[currentIndex].getAnswerId());

        if(chechkout1.getText().toString().trim().equals(checkout2.getText().toString().trim()))
        {
            Toast.makeText(getApplicationContext(),"Right",Toast.LENGTH_SHORT).show();
            mScore=mScore+1;
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Wrong",Toast.LENGTH_SHORT).show();
        }
    }

    private void updateQuestion() {

        currentIndex=(currentIndex+1)%questionBank.length; // when currrentIndex reach to 8 then it become zero again. so no need to add if else
        if(currentIndex==0){
            AlertDialog.Builder alert=new AlertDialog.Builder(this);
            alert.setTitle("Game Over");
            alert.setCancelable(false);
            alert.setMessage("Your Score" + mScore +"points");

            alert.setPositiveButton("Close Application", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    finish();

                }
            });

            alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    mScore=0;
                    qn=1;
                    progressBar.setProgress(0);
                    score.setText("Score" + mScore +"/" +questionBank.length);
                    questionnumber.setText(qn + "/" + questionBank.length +"Question");
                }
            });

            alert.show();

        }
        question.setText(questionBank[currentIndex].getQuestionId());
        optionA.setText(questionBank[currentIndex].getOptionA());
        optionB.setText(questionBank[currentIndex].getOptionB());
        optionC.setText(questionBank[currentIndex].getOptionC());
        optionD.setText(questionBank[currentIndex].getOptionD());

        qn=qn+1;

        if(qn<=questionBank.length)

        {
            questionnumber.setText(qn + "/" + questionBank.length +"Question");
        }
        score.setText("Score" + mScore +"/" +questionBank.length);
        progressBar.incrementProgressBy(PROGRESS_BAR);
    }

}