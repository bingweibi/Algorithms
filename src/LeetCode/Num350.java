package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Num350 {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int aNums1 : nums1) {
            if (!map.containsKey(aNums1)) {
                map.put(aNums1, 1);
            } else {
                map.put(aNums1, 1 + map.get(aNums1));
            }
        }
        List<Integer> resultList = new ArrayList<>();
        for (int aNums2 : nums2) {
            if (map.containsKey(aNums2)) {
                if (map.get(aNums2) > 0) {
                    resultList.add(aNums2);
                    map.put(aNums2, map.get(aNums2)-1);
                }
            }
        }
        int[] result = new int[resultList.size()];
        for(int i=0;i<resultList.size();i++) {
            result[i]=resultList.get(i);
        }
        return result;
    }
}
