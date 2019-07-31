package entity.answer;

public class SubjectAnswer extends BaseAnswer {
    private String text;

    public SubjectAnswer(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(BaseAnswer obj) {
        return text.equals( ((SubjectAnswer)obj).getText());
    }

    @Override
    public String toString() {
        String str = "Standard Answer: ";
        str += (text + "\n");
        return str;
    }
}
