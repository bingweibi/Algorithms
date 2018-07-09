package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Num387 {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                map.put(aChar, map.get(aChar) + 1);
            } else {
                map.put(aChar, 1);
            }
        }
        for (int i=0;i<chars.length;i++){
            if (map.get(chars[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}
