package Jianzhioffer;

import java.util.ArrayList;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 * @author bibingwei
 */
public class Num21 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={4,3,5,1,2};
        boolean temp = new Num21().IsPopOrder(a,b);
    }
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        boolean flag = false;

        ArrayList<Integer> list = new ArrayList<Integer>(pushA.length);
        for (int i=0;i<pushA.length;i++){
            list.add(pushA[i]);
        }

        int i=0,j=0;
        while (list.size() !=0 && i< list.size()){
            if (list.get(i) == popA[j]){
                list.remove(i);
                i--;
                j++;
            }else {
                i++;
            }
        }

        if (list.size() == 0){
            flag = true;
        }

        return flag;
    }
}
