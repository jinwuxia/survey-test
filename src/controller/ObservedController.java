package controller;

import entity.answer.BaseAnswer;
import entity.answer.ChoiceAnswer;
import entity.answer.SubjectAnswer;
import entity.question.SubjectQuestion;
import util.StringFormater;

import java.util.Set;

/**
 * control all finishedSurvey.
 */
public class ObservedController extends BaseController {
    private static ObservedController observedControllerInstance = null;



    private ObservedController() {

    }

    public static ObservedController getObservedControllerInstance() {
        if (observedControllerInstance == null) {
            observedControllerInstance = new ObservedController();
        }
        return observedControllerInstance;
    }

    public void createFinishedSurveyEntry(int blankSurveyId) {
        repoInstance.createFinishedSurvey(blankSurveyId);
    }


    public String displayFinishedSurveyEntry(int finishedSurveyId) {
        return repoInstance.getFinishedSurveyById(finishedSurveyId).toString();
    }

    public void modifyUserAnswerEntry(int finishedSurveyId, int questionId, String userAnswer) {
        BaseAnswer answer = null;
        if (repoInstance.getAnswerById(finishedSurveyId, questionId) instanceof SubjectAnswer) {
            answer = new SubjectAnswer(userAnswer);
        }
        else if (repoInstance.getAnswerById(finishedSurveyId, questionId)instanceof ChoiceAnswer) {
            //change string to set
            Set<String> ans = StringFormater.changeStrToSet(userAnswer);
            answer = new ChoiceAnswer(ans);
        }

        repoInstance.modifyAnswer(finishedSurveyId, questionId, answer);
    }


    /**
     * @param blankSurveyId
     * @param finishedSurveyId
     * @param quesionId
     * @param userAnswer
     */
    public void addAnswerEntry(int blankSurveyId, int finishedSurveyId, int quesionId, String userAnswer) {
        BaseAnswer answer = null;
        if (repoInstance.getQuestionById(blankSurveyId, quesionId) instanceof SubjectQuestion) {
            answer = new SubjectAnswer(userAnswer);
        }
        else if (repoInstance.getQuestionById(blankSurveyId, quesionId) instanceof CharSequence) {
            //change string to set
            Set<String> ans = StringFormater.changeStrToSet(userAnswer);
            answer = new ChoiceAnswer(ans);
        }

        repoInstance.addAnswer(finishedSurveyId, answer);

    }



}
