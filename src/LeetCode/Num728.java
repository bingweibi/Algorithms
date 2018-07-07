package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bibingwei
 * 自除数 是指可以被它包含的每一位数除尽的数。
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * 还有，自除数不允许包含 0 。
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 *
 * 输入：
 * 上边界left = 1, 下边界right = 22
 * 输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 */
public class Num728 {
    public static void main(String[] args) {
        System.out.println(new Num728().selfDividingNumbers(13,22));
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=left;i<=right;i++){
            if (self(i)){
                list.add(i);
            }
        }
        return list;
    }

    private boolean self(int i) {
        boolean flag = false;
        int temp;
        char[] chars = String.valueOf(i).toCharArray();
        for (char aChar : chars) {
            if (aChar == '0'){
                flag = false;
                break;
            }
            temp = i % (aChar-48);
            if ( temp == 0) {
                flag = true;
            }else {
                flag = false;
            }
            if (!flag) {
                break;
            }
        }
        return flag;
    }
}
