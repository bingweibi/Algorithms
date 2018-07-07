package LeetCode;

/**
 * @author bibingwei
 *  *
 */
public class Num028 {

    public static void main(String[] args) {
        String haystack = "mississippi" ;
        String needle ="issip";
        System.out.println(new Num028().strStr(haystack,needle));
    }
    public int strStr(String haystack, String needle) {
        if ("".equals(needle)){
            return 0;
        }
        if (needle.length()>haystack.length()){
            return -1;
        }
        char[] hay = haystack.toCharArray();
        char[] need = needle.toCharArray();
        int num = 0,i=0,flag =-1;
        for (;i<hay.length;i++){
            if (need[num] == hay[i]){
                num++;
            }
            if (num != need.length){
                i = i-num;
            }else {
                flag = i-num;
            }

        }
        return flag;
    }
}
