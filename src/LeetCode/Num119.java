package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Num119 {
    public static void main(String[] args) {
        System.out.println(new Num119().getRow(33));
    }
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        temp.add(0,1);
        list.add(0,temp);
        if (rowIndex == 0){
            return list.get(0);
        }
        List<Integer> temp1 = new ArrayList<>();
        temp1.add(0,1);
        temp1.add(1,1);
        list.add(1,temp1);
        if (rowIndex ==1 ){
            return list.get(1);
        }
        for (int i=2;i<=rowIndex;i++){
            List<Integer> list1 = new ArrayList<>();
            list1.add(0,1);
            for (int j=1;j<i;j++){
                list1.add(j,list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            list1.add(i,1);
            list.add(list1);
        }

        return list.get(rowIndex);
    }
}
