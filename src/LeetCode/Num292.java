package LeetCode;

import java.awt.geom.FlatteningPathIterator;

public class Num292 {

    public static void main(String[] args) {
        System.out.println(new Num292().canWinNim(5));
    }


    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
