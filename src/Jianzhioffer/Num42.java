package Jianzhioffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class Num42 {
    public static void main(String[] args) {
        int[] array={1,2,4,7,11,15};
        System.out.println(new Num42().FindNumbersWithSum(array,15));
    }
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        int length = array.length;
        if (array.length==0||sum < array[0] || sum>(array[length-1]+array[length-2])){
            return result;
        }
        for (int i=0;i<length;i++){
            for (int j=i+1;j<length;j++){
                if (array[i] + array[j] == sum){
                    result.add(array[i]*array[j]);
                    map.put(array[i]*array[j],""+array[i]+array[j]);
                    break;
                }
            }
        }
        if (result.size() == 0){
            return result;
        }
        Collections.sort(result);
        int temp = result.get(0);
        result.clear();
        String s = map.get(temp).trim();
        result.add(Integer.valueOf(s.substring(0,1)));
        result.add(Integer.valueOf(s.substring(1,s.length())));
        return result;
    }
}
