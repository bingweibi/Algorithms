package LeetCode;

import java.util.*;

public class Num088 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,5,6};
        int m = 3,n=3;
        new Num088().merge(nums1,m,nums2,n);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        List<Integer> list = new ArrayList<>(m+n);
        while (i<m && j<n){
            if (nums1[i] <= nums2[j]){
                list.add(nums1[i]);
                i++;
            }else {
                list.add(nums2[j]);
                j++;
            }
        }
        if (i==m && j<n){
            for (;j<n;j++){
                list.add(nums2[j]);
            }
        }
        if (j==n && i<m){
            for (;i<m;i++){
                list.add(nums1[i]);
            }
        }
        for (int k=0;k<list.size();k++){
            nums1[k] = list.get(k);
        }
        for (Integer aList : list) {
            System.out.print(aList);
        }
    }
}
