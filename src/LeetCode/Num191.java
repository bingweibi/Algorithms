package LeetCode;

public class Num191 {
    public static void main(String[] args) {
        System.out.println(new Num191().hammingWeight(1));
    }
    public int hammingWeight(int n) {
        char[] chars = Integer.toBinaryString(n).toCharArray();
        int length = chars.length,count = 0;
        for (int i=0;i<length;i++){
            if (chars[i] == 49){
                ++count;
            }
        }
        return count;
    }
}
