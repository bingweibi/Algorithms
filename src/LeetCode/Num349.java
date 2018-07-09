package LeetCode;

import java.util.*;

public class Num349 {
    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {1,1};
        System.out.println(Arrays.toString(new Num349().intersection(num1, num2)));
    }
    public int[] intersection(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int aNums1 : nums1) {
            for (int aNums2 : nums2) {
                if (aNums1 == aNums2) {
                    Object object = map.put(aNums1, aNums1);
                    if (object == null) {
                        list.add(map.get(aNums1));
                    }
                }
            }
        }
        int[] num = new int[list.size()];
        for (int i=0;i<num.length;i++){
            num[i] = list.get(i);
        }
        return num;
    }
}
