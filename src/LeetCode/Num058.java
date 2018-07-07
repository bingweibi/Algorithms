package LeetCode;

public class Num058 {
    public static void main(String[] args) {
        System.out.println(new Num058().lengthOfLastWord(""));
    }
    public int lengthOfLastWord(String s) {
        int num = 0;
        char[] chars = s.trim().toCharArray();
        if ("".equals(s)){
            return 0;
        }
        for (int i = chars.length-1;i>=0;i--){
            if (chars[i] == ' '){
                break;
            }else {
                ++num;
            }
        }
        return num;
    }
}
