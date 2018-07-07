package LeetCode;

/**
 * @author bibingwei
 *  技巧:从5开始for循环，每次循环都给加上5，然后计数器加1。同时如果该整数还能被25整除，计数器还应该再加上1
 */
public class Num172 {
    public static void main(String[] args) {
        System.out.println(new Num172().trailingZeroes(13));
    }
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 1) {
            count += (n /= 5);
        }
        return count;
    }
}
