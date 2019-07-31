package controller;


import entity.question.*;
import constant.ConstantMgt;
import util.StringFormater;

/**
 * control survey
 */
public class ObserverController extends BaseController {
    private static  ObserverController observerControllerInstance = null;

    private ObserverController() {

    }
    public static ObserverController getObserverControllerInstance() {
        if (observerControllerInstance == null) {
            observerControllerInstance = new ObserverController();
        }
        return observerControllerInstance;
    }


    public void createBlankSurveyEntry() {
        repoInstance.createBlankSurvey();
    }




    public void addQuestionEntry(int surveyID, String questionType, String title, float score, String candidateAnswer) {
        BaseQuestion question = null;
        if (questionType.equals(ConstantMgt.CHOICE_QUESTION)) {
            question = new ChoiceQuestion(title, score, StringFormater.changeStrToList(candidateAnswer));
            System.out.println("debug: " + question);
        }
        else if (questionType.equals(ConstantMgt.ESSAY_QUESTION)) {
            question = new ShortEssayQuestion(title,score, candidateAnswer);
        }
        else if (questionType.equals(ConstantMgt.FILLUP_QUESTION)) {
            question = new FillupQuestion(title,score,candidateAnswer);
        }
        else if (questionType.equals(ConstantMgt.MATCH_QUESTION)) {

            question = new MatchQuestion(title, score, StringFormater.getLeftList(candidateAnswer), StringFormater.getRightList(candidateAnswer));
        }
        else if (questionType.equals(ConstantMgt.MTF_QUESTION)) {

        }
        else if (questionType.equals(ConstantMgt.RANK_QUESTION)) {

        }
        repoInstance.addQuestion(surveyID, question);
    }

    public void addStandardAnswerEntry(int surveyID, String candidateAnswer) {

    }

    public String  displayBlankSurveyEntry(int surveyID) {
        return repoInstance.getBlankSurveyById(surveyID).toString();
    }
}
