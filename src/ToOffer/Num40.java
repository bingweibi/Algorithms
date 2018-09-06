package ToOffer;

/**
 * @author bibingwei
 * 字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
 */
public class Num40 {
    public static void main(String[] args) {
        System.out.println(new Num40().LeftRotateString("abcdefg",2));
    }
    public String LeftRotateString(String str,int n) {

        int len = str.length();
        if (n<0 || n>len){
            return str;
        }
        String s1 = str.substring(0,n);
        String s2 = str.substring(n,len);
        return s2+s1;
    }
}
