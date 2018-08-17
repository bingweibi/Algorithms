package ToOffer;

import java.util.ArrayList;

/**
 * @author bibingwei
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Num30 {
    public int GetUglyNumber_Solution(int index) {
        if (index == 0){
            return 0;
        }

        ArrayList<Integer> uglyNumbers = new ArrayList<Integer>();
        uglyNumbers.add(1);
        int s2=0;
        int s3=0;
        int s5=0;
        for (int i= 0;i<index;i++){
            int min = Math.min(uglyNumbers.get(s2)*2, Math.min(uglyNumbers.get(s3)*3,uglyNumbers.get(s5)*5));
            uglyNumbers.add(min);
            if (min == uglyNumbers.get(s2)*2){
                s2++;
            }
            if (min == uglyNumbers.get(s3)*3){
                s3++;
            }
            if (min == uglyNumbers.get(s5)*5){
                s5++;
            }
        }
        return uglyNumbers.get(uglyNumbers.size()-2);
    }
}
