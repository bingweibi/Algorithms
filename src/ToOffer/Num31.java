package ToOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bibingwei
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */
public class Num31 {
    public static void main(String[] args) {
        System.out.println(new Num31().FirstNotRepeatingChar("googgle"));
    }
    public int FirstNotRepeatingChar(String str) {
        int start = 0, len = str.length(),end = len-1;
        char[] array = str.toCharArray();
        while (start <= end){
            if (array[start] == '0'){
                start++;
                end = len-1;
                continue;
            }
            if (array[start] != array[end]){
                end--;
                if (start == end){
                    break;
                }
            }else {
                for (int i=0;i<len;i++){
                    if (array[i] == array[end]){
                        array[i] = '0';
                    }
                }
                array[end] = '0';
                start++;
                end = len-1;
            }
        }
        if (start == end){
            return start;
        }else {
            return -1;
        }
    }
}
