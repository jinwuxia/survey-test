package entity.question;

public class ShortEssayQuestion extends SubjectQuestion {

    public ShortEssayQuestion(String title, float score, String candidateAns) {
        super(title,score,candidateAns);

    }
    @Override
    public String toString() {
        return "ShortEssay Question: \n" + super.toString();
    }
}
