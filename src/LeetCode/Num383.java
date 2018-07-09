package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num383 {
    public static void main(String[] args) {
        System.out.println(new Num383().canConstruct("aa","aab"));
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] chars = ransomNote.toCharArray();
        char[] chars1 = magazine.toCharArray();
        List<Character> list = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for (char aChars1 : chars1) {
            list.add(aChars1);
        }
        for (char aChar : chars) {
            for (int j = 0; j < list.size(); j++) {
                if (aChar == list.get(j)) {
                    list2.add(list.get(j));
                    list.remove(j);
                    break;
                }
            }
        }
        StringBuilder s= new StringBuilder();
        for (Character aList2 : list2) {
            s.append(aList2);
        }
        return ransomNote.contentEquals(s);
    }
}
