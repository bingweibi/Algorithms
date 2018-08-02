package LeetCode;

public class Num028 {
    public static void main(String[] args) {
        System.out.println(new Num028().strStr("mississippi","issip"));
    }
    public int strStr(String haystack, String needle) {
        int len1=haystack.length(),len2 = needle.length();
        if ("".equals(needle)){
            return 0;
        }
        if (!haystack.contains(needle)){
            return -1;
        }
        for (int i=0;i<len1;i++){
            if (haystack.substring(i,i+len2).equals(needle)){
                return i;
            }
        }
        return 0;
    }
}
