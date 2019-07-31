package entity.answer;

import java.util.ArrayList;
import java.util.List;

public class RankAnswer extends ObjectAnswer {
    private List<String> ans = new ArrayList<>();

    public List<String> getAns() {
        return ans;
    }

    public void setAns(List<String> ans) {
        this.ans = ans;
    }

    @Override
    public boolean equals(BaseAnswer obj) {
        List<String> objAns = ((RankAnswer) obj).getAns();
        if (objAns.size() != this.ans.size()) {
            return false;
        }
        for (Integer index = 0; index < objAns.size(); index ++)  {
            if (!ans.get(index).equals(objAns.get(index))) {
                return false;
            }
        }

        return true;
    }
    @Override
    public String toString() {
        return "standard answer: " + ans.toString();
    }
}
