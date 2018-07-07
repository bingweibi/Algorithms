package Jianzhioffer;

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */

public class Num48 {
    public int Add(int num1,int num2) {
        int sum = 0;
        while (num1 !=0){
            ++sum;
            num1--;
        }
        while (num2 !=0){
            ++sum;
            num2--;
        }
        return sum;
    }
}
