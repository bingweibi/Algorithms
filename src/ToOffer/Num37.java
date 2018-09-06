package ToOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bibingwei
 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。
 * 请写程序找出这两个只出现一次的数字。
 */
public class Num37 {
    public static void main(String[] args) {
        int[] num = {2,4,3,6,3,2,5,5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        new Num37().FindNumsAppearOnce(num,num1,num2);
    }
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] temp = new int[2];
        int i=0;
        for (int anArray : array) {
            map.put(anArray, map.getOrDefault(anArray, 0)+1);
        }

        for (Map.Entry<Integer,Integer> mmp : map.entrySet()){
            if (mmp.getValue() == 1){
                temp[i] = mmp.getKey();
                i++;
            }
        }
        num1[0] = temp[0];
        num2[0] = temp[1];
    }
}
