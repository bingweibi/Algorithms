package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num844 {
    public static void main(String[] args) {
        System.out.println(new Num844().backspaceCompare("y#fo##f",
                "y#f#o##f"));
    }
    public boolean backspaceCompare(String S, String T) {
        return ver(S).equals(ver(T));
    }

    private String ver(String s) {
        List<Character> list = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == '#'&&list.size()>0){
                list.remove(list.size()-1);

            }else if (s.charAt(i) == '#'&&list.size()==0){

            }else {
                list.add(s.charAt(i));
            }
        }
        return list.toString();
    }
}
