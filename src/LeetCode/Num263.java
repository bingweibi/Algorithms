package LeetCode;

import java.awt.geom.FlatteningPathIterator;

public class Num263 {
    public static void main(String[] args) {
        System.out.println(new Num263().isUgly(8));
    }
    public boolean isUgly(int num) {
        if (num==1){
            return true;
        }
        if (num <=0){
            return false;
        }
        boolean flag = true;
        while (num != 1){
            if (num %2 == 0){
                num = num/2;
            }else if (num%3 == 0){
                num = num/3;
            }else if (num%5 == 0){
                num = num/5;
            }else {
                flag = false;
                num =1;
            }
        }
        return flag;
    }
}
