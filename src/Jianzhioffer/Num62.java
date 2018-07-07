package Jianzhioffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 */

public class Num62 {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println(new Num62().GetMedian());
    }

    public void Insert(Integer num) {
        list.add(num);
        Collections.sort(list);
    }

    public Double GetMedian() {
        if (list.size() % 2 !=0){
            double temp = list.get((list.size()/2));
            return temp;
        }else {
            double first = list.get(list.size() / 2);
            double last = list.get((list.size() / 2) - 1);
            return  ((first+last) / 2);
        }
    }
}
