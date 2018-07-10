package LeetCode;

import java.util.Arrays;

public class Num389 {
    public char findTheDifference(String s, String t) {
        char res = 0,res1 = 0;
        for(char c : s.toCharArray()) {
            res+=c;
        }
        for(char c : t.toCharArray()) {
            res1+=c;
        }
        return (char) (res1-res);
    }
}
