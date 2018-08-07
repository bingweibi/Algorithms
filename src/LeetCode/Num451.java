package LeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Num451 {
    public String frequencySort(String s) {
        int[][] count=new int[128][2];
        char[] ch=s.toCharArray();
        for(char c :ch){
            count[c][0]=c;
            count[c][1]++;
        }
        Arrays.sort(count, (a, b) -> b[1]-a[1]);
        StringBuilder ret=new StringBuilder();
        for(int i=0;i<128;i++){
            for(int j=0;j<count[i][1];j++){
                ret.append((char)count[i][0]);
            }
        }
        return ret.toString();
    }
}
