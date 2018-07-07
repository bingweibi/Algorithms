package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Num205 {
    public static void main(String[] args) {
        System.out.println(new Num205().isIsomorphic("ab","aa"));
    }
    public boolean isIsomorphic(String s, String t) {
        boolean flag = true;
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        if (chars.length != chars1.length){
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();
        for (int i=0,j=0;i<chars.length;i++,j++){
            if (!flag){
                break;
            }
            if (!map.containsKey(chars[i])&& !map2.containsKey(chars1[j])){
                map.put(chars[i],chars1[j]);
                map2.put(chars1[j],chars[i]);
            }else {
                if ((map.containsKey(chars[i]) && map.get(chars[i]) != chars1[j]) ||
                        (map2.containsKey(chars1[j]) && map2.get(chars1[j]) != chars[i])){
                    flag =  false;
                }
            }
        }
        return flag;
    }
}
