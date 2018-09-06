package ToOffer;

/**
 * @author bibingwei
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)
 */
public class Num43 {
    public static void main(String[] args) {
        System.out.println(new Num43().StrToInt("-2147483647"));
    }
    public int StrToInt(String str) {
        int len = str.length();
        boolean flag = true;
        String result = "";
        int temp = 0;
        if (len == 0){
            return 0;
        }
        if (str.charAt(0) == '+'){
            result = str.substring(1,len);
        }else if (str.charAt(0) == '-'){
            flag = false;
            result = str.substring(1,len);
        }else {
            result = str;
        }
        for (int i=0;i<result.length();i++){
            if (result.charAt(i) >58 || result.charAt(i) <48){
                return 0;
            }
        }
        char[] chars = result.toCharArray();
        for (char aChar : chars) {
            temp = temp * 10 + aChar - '0';
        }
        if (flag){
            return temp;
        }else{
            if (temp == -2147483648){
                return  temp;
            }else {
                return -1*temp;
            }
        }
    }
}
