package LeetCode;

import Jianzhioffer.Num40;

import java.util.HashMap;
import java.util.Map;

public class Num409 {
    public static void main(String[] args) {
        System.out.println(new Num409().longestPalindrome("abccccdd"));
    }
    public int longestPalindrome(String s) {
        int count = 0;
        boolean flag = false;
        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                map.put(aChar, map.get(aChar) + 1);
            } else {
                map.put(aChar, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue()%2 == 0){
                count += entry.getValue();
            }else if (entry.getValue()%2 != 0 && entry.getValue()>=1){
                count += entry.getValue()-1;
                flag = true;
            }
        }

        return flag ? count+1 : count;
    }
}
