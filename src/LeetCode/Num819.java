package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Num819 {
    HashMap<String, Integer> map = new HashMap<>();
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("['?!,; .]+", " ");//去符号操作
        paragraph = paragraph.toLowerCase();
        System.out.println(paragraph);
        String[] str = paragraph.split(" ");
        int[] count = new int[str.length];
        for(int i=0;i<str.length;i++){
            if(!map.containsKey(str[i])){
                map.put(str[i], i);
                count[i]++;
            }else{
                int tm = map.get(str[i]);
                count[tm]++;
            }
        }
        int[] help = new int[count.length];
        for(int i=0;i<help.length;i++){
            help[i] = i;
        }
        for(int i=0;i<count.length-1;i++){
            for(int j=i+1;j<count.length;j++){
                if(count[i]<count[j]){
                    int tem = count[i];
                    count[i] = count[j];
                    count[j] = tem;
                    int met = help[i];
                    help[i] = help[j];
                    help[j] = met;
                }
            }
        }
        for(int i=0;i<count.length;i++){
            String le = str[help[i]];
            System.out.println("le is "+le);
            boolean issame = false;
            for (String aBanned : banned) {
                if (le.equals(aBanned)) {
                    issame = true;
                    break;
                }
            }
            if(!issame){
                return le;
            }
        }
        return "";
    }
}
