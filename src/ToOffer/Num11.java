package ToOffer;

/**
 * @author bibingwei
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Num11 {
    public int NumberOf1(int n) {
        String temp = Integer.toBinaryString(n);
        int len = temp.length(),count = 0;
        for (int i=0;i<len;i++){
            if (temp.charAt(i) - 49 ==0){
                count++;
            }
        }
        return count;
    }
}
