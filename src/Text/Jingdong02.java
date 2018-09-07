package Text;

import java.util.ArrayList;
import java.util.Scanner;

public class Jingdong02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = 500000,temp = 0;
        ArrayList<Integer> list = new ArrayList<>();
        String string = s.nextLine();
        for (int i=0;i<10;i++){
            list.add(Integer.parseInt(string.split(" ")[i]));
        }
        for (int i=0;i<list.size();i++){
            for (int j=0;j<list.size();j++){
                for (int z=0;z < list.size();z++){
                    if (i== z || z==j || i==j){
                        continue;
                    }
                    temp = list.get(i)*list.get(i)+list.get(i)*list.get(j)-list.get(j)*list.get(j)+list.get(z);
                    if (temp<min){
                        min = temp;
                    }
                }
            }
        }
        System.out.println(min);
    }
}
