package ToOffer;

import java.util.ArrayList;

/**
 * @author bibingwei
 * 找出所有和为S的连续正数序列
 */
public class Num38 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (sum <= 2){
            return result;
        }
        int low =1, high = 2;
        while (low < high){
            int temp = 0;
            for (int i=low;i<=high;i++){
                temp += i;
            }
            if (temp < sum ){
                high++;
            }else if(temp > sum) {
                low++;
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                for (int j = low;j<=high;j++){
                    list.add(j);
                }
                result.add(list);
                low++;
            }
        }
        return result;
    }
}
