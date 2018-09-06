package ToOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bibingwei
 * 返回数组中第一个重复的数字
 */
public class Num44 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean flag = false;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<length;i++){
            if (map.containsKey(numbers[i])) {
                duplication[0] = numbers[i];
                flag = true;
                break;
            }else {
                map.put(numbers[i],0);

            }
        }
        return flag;
    }
}
