package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Num762 {
    public int countPrimeSetBits(int L, int R) {
        List<String> list = new ArrayList<>();
        for (int i=L;i<=R;i++){
            list.add(Integer.toBinaryString(i));
        }
        return count(list);
    }

    private int count(List<String> list) {
        int count = 0,result = 0;
        for (String aList : list) {
            char[] chars = aList.toCharArray();
            for (char aChar : chars) {
                if (aChar - 48 == 1) {
                    count++;
                }
            }
            if (isPrime(count)){
                result++;
            }
            count = 0;
        }

        return result;
    }

    private boolean isPrime(int count) {
        boolean flag = true;
        if (count < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(count); i++) {
                if (count % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
