package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Num599 {
    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Burger King", "KFC", "Tapioca Express"};
        String[] list2 = { "Burger King" ,"KFC","Shogun"};
        System.out.println(new Num599().findRestaurant(list1,list2));
    }
    public String[] findRestaurant(String[] list1, String[] list2) {
        int len = list1.length,len1 = list2.length,min = Integer.MAX_VALUE,j=0;
        List<String> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for (int i=0;i<len1;i++){
            map.put(list2[i],i);
        }
        for (int i=0;i<len;i++){
            if (map.containsKey(list1[i]) && map.get(list1[i]) + i < min){
                min = map.get(list1[i]) + i;
                list.add(list1[i]);
                continue;
            }
            if (map.containsKey(list1[i]) && map.get(list1[i]) + i == min){
                min = map.get(list1[i]) + i;
                list.add(list1[i]);
                j++;
            }
        }
        String[] temp = new String[list.size()];
        for (int i=0;i<list.size();i++){
            temp[i] = list.get(i);
        }
        return temp;
    }
}
