package Jianzhioffer;

import java.util.HashMap;

/**
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
 * 今天测试组开完会后,他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
 * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 你会不会被他忽悠住？(子向量的长度至少是1)
 */

public class Num30 {

    HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
    public int FindGreatestSumOfSubArray(int[] array) {
        HashMap<Integer,Integer> map1 = new HashMap<Integer, Integer>();
        int result = -100;
        map1 = findMax(array,array.length,0);
        for (int i=0;i<array.length;i++){
            if (map1.get(i) > result){
                result = map1.get(i);
            }
        }
        return result;
    }

    private HashMap<Integer, Integer> findMax(int[] array, int length, int start) {

        int temp = 0,result = -100;
        if (start>=length){
            return map;
        }
        for (int i = start;i<length;i++){
            temp += array[i];
            if (temp > result){
                result = temp;
            }
        }
        map.put(start,result);

        findMax(array,length,++start);
        return map;
    }
}
