package Jianzhioffer;

/**
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0
 */

public class Num49 {
    public static void main(String[] args) {
        System.out.println(new Num49().StrToInt("123"));
    }
    public int StrToInt(String str) {
        if (str.equals("") || str.length() == 0) {
            return 0;
        }
        char[] chars = str.trim().toCharArray();
        int length = chars.length-1;
        int flag = 0,result = 0;
        boolean temp = true;
        if (chars[0] ==43){

        }else if (chars[0] == 45){
            temp = false;
        }else if (48<=chars[0]&&chars[0]<=57){
            result =  (int) (result + (chars[0]-48)*Math.pow(10,length));
        }else {
            return 0;
        }
        for (int i=length;i>0;i--){
            if (temp ==false){
                if (48<=chars[i]&&chars[i]<=57){
                    result -= (chars[i]-48)*Math.pow(10,flag);
                }else {
                    return 0;
                }
                flag++;
            }else {
                if (48<=chars[i]&&chars[i]<=57){
                    result += (chars[i]-48)*Math.pow(10,flag);
                }else {
                    return 0;
                }
                flag++;
            }

        }
        return result;
    }
}
