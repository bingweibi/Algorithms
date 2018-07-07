package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Num118 {
    public static void main(String[] args) {
        System.out.println(new Num118().generate(4));
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if (numRows == 0){
            return list;
        }
        temp.add(0,1);
        list.add(0,temp);
        if (numRows == 1){
            return list;
        }
        List<Integer> temp1 = new ArrayList<>();
        temp1.add(0,1);
        temp1.add(1,1);
        list.add(1,temp1);
        if (numRows ==2 ){
            return list;
        }
        for (int i=2;i<numRows;i++){
            List<Integer> list1 = new ArrayList<>();
            list1.add(0,1);
            for (int j=1;j<i;j++){
                list1.add(j,list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            list1.add(i,1);
            list.add(list1);
        }

        return list;
    }
}
