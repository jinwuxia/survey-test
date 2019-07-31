package entity.answer;


public class MtfAnswer extends ObjectAnswer {
    private boolean ans;

    public void setAns(boolean ans) {
        this.ans = ans;
    }
    public boolean getAns() {
        return ans;
    }

    @Override
    public boolean equals(BaseAnswer obj) {
        if ( ((MtfAnswer) obj).getAns() == this.ans) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "standard answer: " + Boolean.toString(ans);
    }
}
