package LeetCode;

/**
 * @author bibingwei
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 */
public class Num557 {
    public static void main(String[] args) {
        System.out.println(new Num557().reverseWords("Let's take LeetCode contes"));
    }
    public String reverseWords(String s) {
        String s2 = new String();
        String[] s1 = s.split(" ");
        for (int i=0;i<s1.length;i++){
            s2 += reverseString(s1[i]) + " ";
        }
        return s2.substring(0,s2.length()-1);
    }

    private String reverseString(String s1) {
        StringBuilder s = new StringBuilder();
        char[] chars = s1.toCharArray();
        for (int i=chars.length-1;i>=0;i--){
            s.append(chars[i]);
        }
        return String.valueOf(s);
    }
}
