package entity.answer;

import java.util.HashSet;
import java.util.Set;

public class ChoiceAnswer extends ObjectAnswer {
    private Set<String>  ans = new HashSet<>();

    public Set<String> getAns() {
        return ans;
    }

    public void setAns(Set<String> ans) {
        this.ans = ans;
    }
    public ChoiceAnswer(Set<String> ans) {
        this.ans = ans;
    }

    @Override
    public boolean equals(BaseAnswer obj) {
        Set<String> objAns = ((ChoiceAnswer) obj).getAns();
        if (objAns.size() != ans.size()) {
            return false;
        }
        return objAns.containsAll(ans);

    }

    @Override
    public String toString() {
        return "standard answer: " + ans.toString();
    }
}
