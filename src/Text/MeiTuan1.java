package Text;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author bibingwei
 * 小明拿到了一个数列a1 , a2 , ... an ，小明想知道存在多少个区间[l,r]同时满足下列两个条件：
 * 1、r-l+1=k;
 * 2、在a l , a l+1,...ar中，存在一个数至少出现了 t 次。
 * 输出满足条件的区间个数。
 * 输入第一行三个整数n,k,t
 * 第二行 n 个整数，a1 , a2 , ... an
 */
public class MeiTuan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ,k ,t ,count = 0;
        String[] line1 = sc.nextLine().split(" ");
         n = Integer.parseInt(line1[0]);//数列N
         k = Integer.parseInt(line1[1]);//区间长度
         t = Integer.parseInt(line1[2]);//出现次数

        String[] line2 = sc.nextLine().split(" ");
        int[] arrays = new int[n];//待检测数组
        for (int i=0;i<n;i++){
            arrays[i] = Integer.parseInt(line2[i]);
        }
        int l = 0,r = l+k;
        Map<Integer,Integer> map = new HashMap<>();
        while (r <= n){
            for (int i=l;i<r;i++){
                map.put(arrays[i],map.getOrDefault(arrays[i],0)+1);
            }
            for (Map.Entry<Integer,Integer> entry:map.entrySet()){
                if (entry.getValue() >= t){
                    count++;
                    break;
                }
            }
            map.clear();
            r++;l++;
        }
        System.out.println(count);
    }
}
