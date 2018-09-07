package Text;

import java.util.*;

public class HaoWeiLai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String[] chars = sc.nextLine().split(" ");
        for (String aChar : chars) {
            list.add(Integer.parseInt(aChar));
        }
        int max = 0,currentMax = Integer.MIN_VALUE;
        for (int j=0;j<list.size();j++){

        }
        System.out.println(max);
    }
}
