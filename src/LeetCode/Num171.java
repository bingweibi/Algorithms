package LeetCode;

public class Num171 {
    public static void main(String[] args) {
        System.out.println(new Num171().titleToNumber("ZY"));
    }
    public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length-1,result = 0;
        for (int i = length,j=0;i>=0;i--,j++){
            result += (chars[i]-64)* Math.pow(26,j);
        }
        return result;
    }
}
