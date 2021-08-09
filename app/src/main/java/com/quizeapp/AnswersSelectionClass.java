package com.quizeapp;

public class AnswersSelectionClass{

    public int optionA,optionB,optionC,optionD,questionId,answerId;

    public AnswersSelectionClass(int questionId, int optionA, int optionB, int optionC, int optionD, int answerId){
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.questionId = questionId;
        this.answerId = answerId;
    }

    public int getOptionA(){
        return optionA;
    }

    public int getOptionB(){
        return optionB;
    }

    public int getOptionC(){
        return optionC;
    }

    public int getOptionD(){
        return optionD;
    }

    public int getQuestionId(){
        return questionId;
    }

    public int getAnswerId(){
        return answerId;
    }
}
