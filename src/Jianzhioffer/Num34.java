package Jianzhioffer;

import java.util.HashMap;

/**
 * 在一个字符串(1<=字符串长度<=10000，
 * 全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 */

public class Num34 {
    public static void main(String[] args) {
        System.out.println(new Num34().FirstNotRepeatingChar(new String("")));
    }
    public int FirstNotRepeatingChar(String str) {

        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int temp = 0;
        for (int i=0;i<length;i++){
            map.put(charArray[i],i);
        }
        if (str.length() == 0){
            temp =  -1;
        }else {
            for (int i=0;i<charArray.length;i++){
                if (map.get(charArray[i]) == null){
                    continue;
                }
                if (i == map.get(charArray[i])) {
                    temp = i;
                    break;
                }else {
                    map.remove(charArray[i]);
                }
            }
        }

        return temp;
    }
}
