import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = 0;
        List<int[]> sum = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        for(int i = 0;i<n;++i){
            int[] time = new int[2];
            time[0] = sc.nextInt();
            time[1] = sc.nextInt();
            sum.add(time);
        }
        for(int i = 0;i<n;i++){
            int[] index = sum.get(i);
            sum.remove(i);
            if(NoError(sum)){
                s.append(i + 1).append(" ");
                m++;
            }
            sum.add(i,index);
        }
        System.out.println(m);
        System.out.println(s);
    }

    private static boolean NoError(List<int[]> list) {
        int size = list.size();
        for(int i = 0;i<size;++i){
            for(int j = size-1; j>i; --j){
                if(list.get(i)[1] <= list.get(j)[0] || list.get(j)[1] <= list.get(i)[0]){
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}


