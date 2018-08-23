package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author bibingwei
 */
public class Num791 {
    public static void main(String[] args) {
        System.out.println(new Num791().customSortString("cba","abccd"));
    }
    public String customSortString(String S, String T) {
        List<Character> list = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        for (int i=0;i< T.length();i++){
            list.add(T.charAt(i));
        }
        for (int i=0;i< S.length();i++){
            for (int j=list.size()-1;j>=0;j--){
                if (list.get(j) == S.charAt(i)){
                    result.append(S.charAt(i));
                    list.remove(j);
                }
            }
        }
        for (Character aList : list) {
            result.append(aList);
        }
        return result.toString();
    }
}
