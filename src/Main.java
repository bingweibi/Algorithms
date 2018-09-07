import java.util.Scanner;

/**
 * @author bibingwei
 */
public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int line  = sc.nextInt(),cur =0,result = 1;
        boolean flag = false;
        if (line == 1){
            System.out.println(1);
       }
        int[][]  temp = new int[line][2];
        for (int i=0;i<line;i++){
            temp[i][0] = sc.nextInt();
            temp[i][1] = sc.nextInt();
        }
        for (int j=1;j<line;j++){
            while (cur<j){
                if (temp[j][1] >= temp[cur][1] && temp[j][0] <= temp[cur][0]){
                    result--;
                }else {
                    flag = true;
                }
                cur++;
            }
            if (flag){
                result ++;
            }
            flag = false;
            cur = 0;
        }
        System.out.println("" + result);
    }
}


