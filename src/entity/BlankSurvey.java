package entity;

import entity.answer.BaseAnswer;
import entity.question.BaseQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * a survey created by teacher
 * add/remove/modify a question or an answer
 */
public class BlankSurvey {

    private int id = -1;
    private List<BaseQuestion> questionList = new ArrayList<>();
    private List<BaseAnswer> standardAnswerList = new ArrayList<>();

    public BlankSurvey(int id) {
        this.id = id;
    }
    public List<BaseQuestion> getQuestionList() {
        return questionList;
    }

    public List<BaseAnswer> getStandardAnswerList() {
        return standardAnswerList;
    }

    public void addOneQuestion(BaseQuestion question) {
        questionList.add(question);
    }
    public void removeOneQuestion(int index) {
        questionList.remove(index);
    }
    public void modifyOneQuestion(int index, BaseQuestion question) {
        questionList.set(index, question);
    }


    public void addOneStandardAnswer(BaseAnswer answer) {
        standardAnswerList.add(answer);
    }
    public void removeOneStandardAnswer(int index) {

    }
    public void modifyOneStandardAnswer(int index, BaseAnswer answer) {

    }

    @Override
    public String toString() {
        String str = "A blank survey created by the observer";
        int size = questionList.size();
        for (int index = 0; index < size; index ++) {
            str += (Integer.toString(index) + ": ");
            str += questionList.get(index).toString();
            str += standardAnswerList.get(index).toString();
        }
        return str;
    }
}
