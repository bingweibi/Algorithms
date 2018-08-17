package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bibingwei
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 * 输入: "the sky is blue",
 * 输出: "blue is sky the".
 */
public class Num151 {
    public static void main(String[] args) {
        System.out.println(new Num151().reverseWords("1    2 "));
    }
    public String reverseWords(String s) {
        if(s.length() == 0){
            return "";
        }
        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = array.length - 1; i >= 0; i--){
            if(!"".equals(array[i])) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(array[i]);
            }
        }
        return sb.toString();

    }
}
