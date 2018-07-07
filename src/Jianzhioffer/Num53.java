package Jianzhioffer;

/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */
public class Num53 {
    public static void main(String[] args) {
        char[] chars = {'1','0','0'};
        System.out.println(new Num53().isNumeric(chars));
    }
    public boolean isNumeric(char[] str) {
        try {
            String s = new String(str);
            double i = Double.parseDouble(s);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
