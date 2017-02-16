package com.bignerdranch.android.guesswho;

/**
 * Created by Chris on 2/9/2017.
 */

public class QuizQuestion {
//Image res ID
    //Strings of four trial answer
    //Correct answer gussed

    private int mImageResId;
    private int mButtResId1, mButtResId2, mButtResId3, mButtResId4;
    private int mCorrectguessResId;

    QuizQuestion(int _imageRedId, int _guess1, int _guess2, int _guess3, int _guess4, int _correctguess) {
        mImageResId = _imageRedId;
        mCorrectguessResId = _correctguess;
        mButtResId1 = _guess1;
        mButtResId2 = _guess2;
        mButtResId3 = _guess3;
        mButtResId4 = _guess4;
    }

    public int getImageResId() {
        return mImageResId;
    }

    public void setImageResId(int imageResId) {
        mImageResId = imageResId;
    }

    public int getButtResId1() {
        return mButtResId1;
    }

    public void setButtResId1(int buttResId1) {
        mButtResId1 = buttResId1;
    }

    public int getButtResId2() {
        return mButtResId2;
    }

    public void setButtResId2(int buttResId2) {
        mButtResId2 = buttResId2;
    }

    public int getButtResId3() {
        return mButtResId3;
    }

    public void setButtResId3(int buttResId3) {
        mButtResId3 = buttResId3;
    }

    public int getButtResId4() {
        return mButtResId4;
    }

    public void setButtResId4(int buttResId4) {
        mButtResId4 = buttResId4;
    }

    public int getCorrectguessResId() {
        return mCorrectguessResId;
    }

    public void setCorrectguessResId(int correctguessResId) {
        mCorrectguessResId = correctguessResId;
    }
}