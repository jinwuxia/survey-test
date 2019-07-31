package entity.question;

import java.util.ArrayList;
import java.util.List;

public class ObjectQuestion extends BaseQuestion {


    private List<String> candidateItems = new ArrayList<>();

    public ObjectQuestion() {

    }

    public ObjectQuestion(String title, float score, List<String> candidateItems) {
        super(title,score);
        this.candidateItems = candidateItems;
    }

    public void addItem(String item) {
        candidateItems.add(item);
    }

    public void removeItem(int index ) {
        candidateItems.remove(index);
    }

    public void modifyItem(int index, String item) {
        candidateItems.set(index, item);
    }

    public List<String> getCandidateItems() {
        return candidateItems;
    }

    public void setCandidateItems(List<String> candidateItems) {
        this.candidateItems = candidateItems;
    }

    @Override
    public String toString() {
        String str = "";
        str += super.toString() + candidateItems.toString() + "\n";
        return str;
    }
}
