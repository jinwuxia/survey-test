package entity.answer;

import entity.Pair;

import java.util.HashSet;
import java.util.Set;


public class MatchAnswer extends ObjectAnswer {

    private Set<Pair> ans  = new HashSet<>();

    public Set<Pair> getAns() {
        return ans;
    }

    public void setAns(Set<Pair> ans) {
        this.ans = ans;
    }

    @Override
    public boolean equals(BaseAnswer obj) {
        Set<Pair> objAns = ((MatchAnswer) obj).getAns();
        if (objAns.size() != ans.size()) {
            return false;
        }
        return objAns.containsAll(ans);

    }

    @Override
    public String toString() {
        String str = "standard answer:";
        str += ans.toString();
        return str;
    }
}
