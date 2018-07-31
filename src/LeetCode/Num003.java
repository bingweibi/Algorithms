package LeetCode;

/**
 * 提交s = ""; 长度为1？？？？，不理解
 */
public class Num003 {
    public static void main(String[] args) {
        System.out.println(new Num003().lengthOfLongestSubstring(""));
    }
    public int lengthOfLongestSubstring(String s) {
        if (s == ""){
            return 0;
        }
        StringBuilder temp = new StringBuilder();
        int max = 1,flag = 0,i=0;
        if (s == ""){
            max =  0;
        }
        for (;i<s.length();i++){
            for (int j=0;j<temp.length();j++){
                if (temp.charAt(j) == s.charAt(i)){
                    max = max > temp.length() ? max : temp.length();
                    temp = new StringBuilder();
                    flag++;
                    i = flag;
                    break;
                }
            }
            temp.append(s.charAt(i));

        }
        return max;
    }
}
