package com.viking.trinity.vikingquiz;

/**
 * Created by trinity on 1/25/16.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private int mInfoResId;

    public Question(int textResId, int infoResId, boolean answerTrue) {
        mTextResId = textResId;
        mInfoResId = infoResId;
        mAnswerTrue = answerTrue;
    }

    public int getInfoResId() {
        return mInfoResId;
    }

    public void setInfoResId(int infoResId) {
        mInfoResId = infoResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }


}
