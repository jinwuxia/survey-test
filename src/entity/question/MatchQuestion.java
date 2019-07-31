package entity.question;

import java.util.ArrayList;
import java.util.List;

public class MatchQuestion extends ObjectQuestion {
    private List<String> leftSide = new ArrayList<>();
    private List<String> rightSide = new ArrayList<>();

    public MatchQuestion(String title, float score, List<String> leftSide, List<String> rightSide) {
        this.setTitle(title);
        this.setScore(score);
        this.setLeftSide(leftSide);
        this.setRightSide(rightSide);
    }
    public void addItem(String location, String item) {
        if (location.equals("left")) {
            leftSide.add(item);
        }
        else{
            rightSide.add(item);
        }
    }

    public void setLeftSide(List<String> leftSide) {
        this.leftSide = leftSide;
    }

    public void setRightSide(List<String> rightSide) {
        this.rightSide = rightSide;
    }

    public void modifyItem(String location, int index, String item) {

    }
    public void removeItem(String location, int index) {

    }


    @Override
    public String toString() {
        String str = "";
        str +=  "match Question: \n" + super.toString() + "\n";
        str += "leftside: " + leftSide.toString() + "\n";
        str += "rightside: " + rightSide.toString() + "\n";
        return str;

    }
}
