package datarepo;

import entity.BlankSurvey;
import entity.FinishedSurvey;
import entity.answer.BaseAnswer;
import entity.question.BaseQuestion;

import java.util.ArrayList;
import java.util.List;

public class Repo {
    private static Repo repoInstance = null;
    private List<FinishedSurvey> finishedSurveyList = new ArrayList<>();
    private List<BlankSurvey> blankSurveyList = new ArrayList<>();

    private Repo() {

    }

    public static Repo getRepoInstance() {
        if (repoInstance == null) {
            repoInstance = new Repo();
        }
        return repoInstance;
    }

    public List<BlankSurvey> getBlankSurveyList() {
        return blankSurveyList;
    }

    public List<FinishedSurvey> getFinishedSurveyList() {
        return finishedSurveyList;
    }




    public void createBlankSurvey() {
        int id = blankSurveyList.size();
        BlankSurvey blankSurvey = new BlankSurvey(id);
        blankSurveyList.add(blankSurvey);
    }
    public BlankSurvey getBlankSurveyById(int id) {
        return blankSurveyList.get(id);
    }



    public void createFinishedSurvey(int blankSurveyId) {
        int id = finishedSurveyList.size();
        FinishedSurvey finishedSurvey = new FinishedSurvey(id, blankSurveyId);
        finishedSurveyList.add(finishedSurvey);
    }

    public FinishedSurvey getFinishedSurveyById(int id) {
        return finishedSurveyList.get(id);
    }






    public void addStandardAnswer(int surveyId, BaseAnswer baseAnswer) {
        blankSurveyList.get(surveyId).addOneStandardAnswer(baseAnswer);
    }
    public void removeStandardAnswer(int surveyId, int ansId) {


    }
    public void modifyStandardAnswer(int surveyId, int ansId, BaseAnswer baseAnswer) {

    }



    public BaseQuestion getQuestionById(int surveyId, int questionId) {
        return blankSurveyList.get(surveyId).getQuestionList().get(questionId);
    }
    public void addQuestion(int surveyId, BaseQuestion baseQuestion) {
        blankSurveyList.get(surveyId).addOneQuestion(baseQuestion);
    }
    public void removeQuestion(int surveyId, int questionIndex) {
        blankSurveyList.get(surveyId).removeOneQuestion(questionIndex);
    }
    public void modifyQuestion(int surveyId, int questionIndex, BaseQuestion baseQuestion) {
        blankSurveyList.get(surveyId).modifyOneQuestion(questionIndex, baseQuestion);
    }





    public BaseAnswer getAnswerById(int finishedSurveyId, int index) {
        return finishedSurveyList.get(finishedSurveyId).getFinishedAnswerList().get(index);
    }

    public void addAnswer(int finishedSurveyId, BaseAnswer answer) {
        finishedSurveyList.get(finishedSurveyId).addAnswer(answer);
    }
    public void modifyAnswer(int finishedSurveyId, int index, BaseAnswer answer) {
        finishedSurveyList.get(finishedSurveyId).modifyAnswer(index, answer);
    }
}
