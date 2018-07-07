package LeetCode;

/**
 * @author bibingwei
 *  *
 */
public class Num190 {
    public static void main(String[] args) {
        //System.out.println(new Num190().reverseBits(4294967295));
    }
    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        char[] chars = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int length = chars.length;
        String s = "";
        char[] charArray = Integer.toBinaryString(n).toCharArray();
        for (int i=charArray.length-1,j=length-1;i>0;--i,--j){
            chars[j] = charArray[i];
        }

        for (int i=0,j = length-1;i<length/2;++i,--j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        for (int i=0;i<length;++i){
            if (chars[i] == 0){
                s += 0;
            }else {
                s += chars[i]-48;
            }
        }
        return Integer.valueOf(s,2);
    }
}
