package entity.question;


import java.util.List;

public class ChoiceQuestion extends ObjectQuestion {

    public ChoiceQuestion(String title, float score, List<String> candidateItems) {
        super(title, score, candidateItems);
    }

    @Override
    public String toString() {
        String str = "choice Question:\n";
        str += super.toString();
        return str;
    }
}
