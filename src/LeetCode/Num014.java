package LeetCode;

public class Num014 {
    public static void main(String[] args) {
        String[] strs = {"a","a"};
        System.out.println(new Num014().longestCommonPrefix(strs));
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++){
            for (String s : strs){
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i)){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
