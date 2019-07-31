package entity;

import entity.answer.BaseAnswer;

import java.util.ArrayList;
import java.util.List;

/**
 * student fill up one survey with answers
 */
public class FinishedSurvey {
    private int id;
    private int blankSurveyId;
    private List<BaseAnswer> finishedAnswerList = new ArrayList<>();

    public FinishedSurvey(int id, int blankSurveyId) {
        this.id = id;
        this.blankSurveyId =  blankSurveyId;
    }

    public void addAnswer(BaseAnswer answer) {
        finishedAnswerList.add(answer);
    }
    public void modifyAnswer(int index, BaseAnswer answer) {
        finishedAnswerList.set(index, answer);
    }

    public List<BaseAnswer> getFinishedAnswerList() {
        return finishedAnswerList;
    }

    @Override
    public String toString() {
        String str = "blank survey Id:" ;
        for (int index = 0; index < finishedAnswerList.size(); index ++) {
            BaseAnswer baseAnswer = finishedAnswerList.get(index);
            str += baseAnswer.toString();
        }
        return str;

    }


}
