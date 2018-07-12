package LeetCode;

public class Num717 {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        boolean flag = false;
        for (int i=0;i<len;){
            if (bits[i] ==1){
                i=i+2;
            }else {
                if (i==len-1){
                    flag = true;
                }
                i++;
            }
        }
        return flag;
    }
}
