package entity.question;


public class BaseQuestion {
    private String title;
    private float score;

    public BaseQuestion(String title, float score) {
        this.title = title;
        this.score = score;
    }

    public BaseQuestion() {

    }

    public void setScore(float score) {
        this.score = score;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getScore() {
        return score;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        String str = "";
        str += title + "\n";
        str +=  "(score: " + Float.toString(score) + ")\n";
        return str;
    }
}
