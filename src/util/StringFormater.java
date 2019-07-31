package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringFormater {

    public static Set<String> changeStrToSet(String userAnswer) {
        Set<String> ans  = new HashSet<>();
        return ans;
    }

    public static List<String> changeStrToList(String candidateAnswer) {
        List<String> ans = new ArrayList<>();
        String[] tmp =candidateAnswer.split(";");
        for (String str: tmp) {
            ans.add(str);
        }
        return ans;
    }

    public static List<String> getLeftList(String candidateAnswer) {
        List<String> ans = new ArrayList<>();
        return ans;
    }

    public static List<String> getRightList(String candidateAnswer) {
        List<String> ans = new ArrayList<>();
        return ans;
    }
}
