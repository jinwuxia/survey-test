package controller;


public class ScoringController extends BaseController {

    private static ScoringController scoringControllerInstance = null;
    private ScoringController() {

    }

    public static ScoringController getScoringControllerInstance() {
        if (scoringControllerInstance == null) {
            scoringControllerInstance = new ScoringController();
        }
        return scoringControllerInstance;
    }

}
