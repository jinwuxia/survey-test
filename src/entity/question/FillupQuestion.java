package entity.question;

public class FillupQuestion extends SubjectQuestion {
    public FillupQuestion(String title, float score, String candidateAns) {
        super(title,score,candidateAns);

    }
    @Override
    public String toString() {
        return "Fillup Question: \n" + super.toString();
    }
}
