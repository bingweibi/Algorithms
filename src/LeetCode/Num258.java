package LeetCode;

import Jianzhioffer.Num25;

public class Num258 {
    public static void main(String[] args) {
        System.out.println(new Num258().addDigits(112));
    }

    public int addDigits(int num) {

        if (num<10){
            return num;
        }
        num = num/10+num%10;
        return addDigits(num);
    }
}
