package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Num290 {
    public boolean wordPattern(String pattern, String str) {
        String[] strArray = str.split(" ");
        char[] chars = pattern.toCharArray();
        int length = chars.length,length2 = strArray.length;
        if (length != length2){
            return false;
        }
        boolean flag = true;
        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();
        for (int i=0;i<length;i++){
            map1.put(chars[i],strArray[i]);
        }
        for (int i=0;i<length2;i++){
            map2.put(strArray[i],chars[i]);
        }
        for (int i=0;i<length;i++){
            if (chars[i] == map2.get(strArray[i]) && strArray[i].equals(map1.get(chars[i]))){

            }else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
