package entity.question;

public class SubjectQuestion extends BaseQuestion {
    private String ansZone = "_______";

    public String getAnsZone() {
        return ansZone;
    }

    public SubjectQuestion() {

    }

    public SubjectQuestion(String title, float score, String candidateAns) {
        super(title,score);
        this.ansZone = candidateAns;
    }

    @Override
    public String toString() {

        return super.toString() + "\n" + ansZone + "\n";
    }
}
