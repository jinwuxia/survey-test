package ui;

import controller.ObservedController;
import controller.ObserverController;

import java.util.Scanner;

public class CommandUI {
    private static ObserverController observerController = ObserverController.getObserverControllerInstance();
    private static ObservedController observedController = ObservedController.getObservedControllerInstance();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        printUI();

        while(true) {
            System.out.println("input the menu number: ");
            int menuType = Integer.valueOf(scanner.nextLine());
            switch (menuType) {
                case 0:
                    System.exit(0);
                case 1:
                    observerController.createBlankSurveyEntry();
                    break;

                case 2:
                    System.out.println("surveyId: ");
                    int surveyID = Integer.valueOf(scanner.nextLine());
                    System.out.println("question type: ");
                    String questionType = scanner.nextLine();
                    System.out.println("question title: ");
                    String title = scanner.nextLine();
                    System.out.println("question score: ");
                    float score = Float.valueOf(scanner.nextLine());
                    System.out.println("question candidate answer:");
                    String candidateAnswer = scanner.nextLine();

                    observerController.addQuestionEntry(surveyID, questionType, title, score, candidateAnswer);
                    break;
                case 3:
                    surveyID = scanner.nextInt();
                    candidateAnswer = scanner.nextLine();

                    observerController.addStandardAnswerEntry(surveyID, candidateAnswer);
                    break;

                case 4:
                    surveyID = scanner.nextInt();

                    observedController.createFinishedSurveyEntry(surveyID);
                    break;

                case 5:
                    int blankSurveyId = scanner.nextInt();
                    surveyID = scanner.nextInt();
                    int questionId = scanner.nextInt();
                    String userAnswer = scanner.nextLine();

                    observedController.addAnswerEntry(blankSurveyId, surveyID, questionId, userAnswer);
                    break;

                case 6:
                    int finishedSurveyId = scanner.nextInt();
                    questionId = scanner.nextInt();
                    userAnswer = scanner.nextLine();

                    observedController.modifyUserAnswerEntry(finishedSurveyId, questionId, userAnswer);
                    break;

                case 7:
                    surveyID = scanner.nextInt();

                    String str = observerController.displayBlankSurveyEntry(surveyID);
                    System.out.println(str);
                    break;

                case 8:
                    finishedSurveyId = scanner.nextInt();
                    str = observedController.displayFinishedSurveyEntry(finishedSurveyId);
                    System.out.println(str);
                    break;

            }
        }


    }

    private static void printUI() {
        System.out.println("0 exit");
        //for observer, i.e, teacher
        System.out.println("1 create BlankSurvey");
        System.out.println("2 add question in  BlankSurvey");
        System.out.println("3 add standard answer in  BlankSurvey");

        //for observed, i.e., student
        System.out.println("4 create FinishedSurvey");
        System.out.println("5 add user answer in finishedSurvey");
        System.out.println("6 modify user answers in FinishedSurvey");

        //for observer, i.e, teacher
        System.out.println("7 show a Blank Survey");

        //for observed, i.e., student
        System.out.println("8 show a finished Survey");

    }
}
