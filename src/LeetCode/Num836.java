package LeetCode;

public class Num836 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2){
        // overlap bottom x
        int olbx = Math.max(rec1[0], rec2[0]);

        // overlap top x
        int oltx = Math.min(rec1[2], rec2[2]);

        // overlap bottom y
        int olby = Math.max(rec1[1], rec2[1]);

        // overlap top y
        int olty = Math.min(rec1[3], rec2[3]);

        return (olbx < oltx) && (olby < olty);
    }
}
