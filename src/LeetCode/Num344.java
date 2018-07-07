package LeetCode;

/**
 * @author bibingwei
 * 反转字符串
 * 输入：s = "hello"
 * 返回："olleh"
 */
public class Num344 {
    public static void main(String[] args) {
        System.out.println(new Num344().reverseString("hello"));
    }
    public String reverseString(String s) {
        StringBuilder s1 = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i=chars.length-1;i>=0;i--){
            s1.append(chars[i]);
        }
        return String.valueOf(s1);
    }
}
