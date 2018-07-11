package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Num830 {
    public static void main(String[] args) {
        System.out.println(new Num830().largeGroupPositions("aaa"));
    }
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list;
        for (int i=0,j=0;j<S.length();){
            if (S.charAt(i) == S.charAt(j)){
                if (j == S.length()-1&& j-i>=2){
                    list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    lists.add(list);
                }
                j++;
            }else if (j-i>2){
                list = new ArrayList<>();
                list.add(i);
                list.add(j-1);
                lists.add(list);
                i=j;
            }else {
                i=j;
            }
        }
        return lists;
    }
}
