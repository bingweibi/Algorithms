package Jianzhioffer;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * @author bibingwei
 */
public class Num12 {
    public static void main(String[] args) {
        System.out.println(""+new Num12().Power(2.0,-3));
    }
    private double Power(double base, int exponent) {
        if (Math.abs(exponent) == 0 ){
            return 1.0;
        }else if (exponent < 0){
            return 1.0/(Math.pow(base,Math.abs(exponent))) ;
        }else {
            return Math.pow(base,exponent);
        }
    }
}

