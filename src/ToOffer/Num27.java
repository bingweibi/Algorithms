package ToOffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author bibingwei
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4
 */
public class Num27 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(input);
        if(k > input.length){
            return list;
        }else{
            for (int i=0;i<k;i++){
                list.add(input[i]);
            }
        }
        return list;
    }
}
