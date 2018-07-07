package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author bibingwei
 *
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 *
 * 输入: x = 1, y = 4
 *
 * 输出: 2
 *
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 *
 * 上面的箭头指出了对应二进制位不同的位置。
 */
public class Num461 {
    public static void main(String[] args) {
        System.out.println(new Num461().hammingDistance(1,4));
    }
    public int hammingDistance(int x, int y) {
        int nums = 0;
        char[] xToBinaryChar = Integer.toBinaryString(x).toCharArray();
        char[] yToBinaryChar = Integer.toBinaryString(y).toCharArray();
        int length = Math.max(xToBinaryChar.length,yToBinaryChar.length);
        ArrayList<Long> xToBinaryList = new ArrayList<>(length);
        ArrayList<Long> yToBinaryList = new ArrayList<>(length);

        for (int i = 0;i<xToBinaryChar.length;i++){
            xToBinaryList.add((long) xToBinaryChar[i]);
        }
        Collections.reverse(xToBinaryList);
        if (length > xToBinaryChar.length){
            for (int i = xToBinaryChar.length;i<length;i++){
                xToBinaryList.add((long) 48);
            }
        }
        for (int i = 0;i<yToBinaryChar.length;i++){
            yToBinaryList.add((long) yToBinaryChar[i]);
        }
        Collections.reverse(yToBinaryList);
        if (length > yToBinaryChar.length){
            for (int i = yToBinaryChar.length;i<length;i++){
                yToBinaryList.add((long) 48);
            }
        }
        for (int i=0;i<length;i++){
            if (!xToBinaryList.get(i).equals(yToBinaryList.get(i))){
                ++nums;
            }
        }
        return nums;
    }
}
