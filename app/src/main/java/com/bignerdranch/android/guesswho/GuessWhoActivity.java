package com.bignerdranch.android.guesswho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GuessWhoActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, nextButton;
    ImageView quizImage;
    int mCurrentIndex;
    QuizQuestion questionList[] = {
            new QuizQuestion(R.drawable.jimenonamonanona, R.string.Wrong11,R.string.Wrong12,R.string.Wrong13 , R.string.Correct1 ,R.string.Correct1),
            new QuizQuestion(R.drawable.badluckbrian, R.string.Wrong21,R.string.Wrong22,R.string.Wrong23 , R.string.Correct2 ,R.string.Correct2),
            new QuizQuestion(R.drawable.boromir, R.string.Wrong31,R.string.Wrong32,R.string.Wrong33 , R.string.Correct3 ,R.string.Correct3),
            new QuizQuestion(R.drawable.gabenewell, R.string.Wrong41,R.string.Wrong42,R.string.Wrong43 , R.string.Correct4 ,R.string.Correct4),
            new QuizQuestion(R.drawable.kevenhart, R.string.Wrong51,R.string.Wrong52,R.string.Wrong53 , R.string.Correct5 ,R.string.Correct5),
            new QuizQuestion(R.drawable.mrbean, R.string.Wrong61,R.string.Wrong62,R.string.Wrong63 , R.string.Correct6 ,R.string.Correct6)
    };

//Hello
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_who);
        quizImage = (ImageView) findViewById(R.id.imageView1);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        setResources();

        nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                updateQuestion();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                quizImage.setImageResource(R.drawable.mrbean);
            }
        });

    }

    public void updateQuestion() {
        mCurrentIndex = (mCurrentIndex + 1) % questionList.length;
        setResources();
    }
    public void setResources() {
        quizImage.setImageResource(questionList[mCurrentIndex].getImageResId());
        button1.setText(questionList[mCurrentIndex].getButtResId1());
        button2.setText(questionList[mCurrentIndex].getButtResId2());
        button3.setText(questionList[mCurrentIndex].getButtResId3());
        button4.setText(questionList[mCurrentIndex].getButtResId4());
    }

}
