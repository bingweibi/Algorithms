package LeetCode;

/**
 * @author bibingwei
 * 给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。
 *
 * 输入: 5
 * 输出: True
 * 解释:
 * 5的二进制数是: 101
 */
public class Num693 {
    public static void main(String[] args) {
        System.out.println(new Num693().hasAlternatingBits(3));
    }
    public boolean hasAlternatingBits(int n) {
        boolean flag = true;
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length-1;i++){
            if (chars[i] == chars[i+1]){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
