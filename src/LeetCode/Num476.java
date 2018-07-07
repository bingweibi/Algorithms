package LeetCode;

/**
 * @author bibingwei
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反
 *
 * 输入: 5
 * 输出: 2
 * 解释: 5的二进制表示为101（没有前导零位），其补数为010。所以你需要输出2。
 *
 * 输入: 1
 * 输出: 0
 * 解释: 1的二进制表示为1（没有前导零位），其补数为0。所以你需要输出0。
 */
public class Num476 {
    public static void main(String[] args) {
        System.out.println(new Num476().findComplement(1));
    }
    public int findComplement(int num) {
        char[] chars = Integer.toBinaryString(num).toCharArray();
        for (int i=0;i<chars.length;i++){
            if (chars[i] == 48){
                chars[i] = 49;
            }else {
                chars[i] = 48;
            }
        }
        int result = 0;
        for (int i=chars.length-1,j=0;i>=0;i--,j++){
            if (chars[i] == 48){
                result += 0 * Math.pow(j,2);
            }else {
                result += 1 * Math.pow(2,j);
            }
        }
        return result;
    }
}
