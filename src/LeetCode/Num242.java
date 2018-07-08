package LeetCode;

import java.util.Arrays;

/**
 * @author bibingwei
 *  没看懂意思
 */
public class Num242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars1);
        return String.valueOf(chars).equals(String.valueOf(chars1));
    }
}
