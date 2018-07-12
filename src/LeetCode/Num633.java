package LeetCode;

public class Num633 {
    public static void main(String[] args) {
        System.out.println(new Num633().judgeSquareSum(2));
    }
    public boolean judgeSquareSum(int c) {
        boolean flag = false;
        int temp = (int)Math.sqrt(c);
        for (int i=0,j=temp;i<=j;){
            if ((i*i+j*j) == c){
                flag = true;
                break;
            }else if (i*i+j*j > c){
                j--;
            }else if (i*i+j*j < c){
                i++;
            }
        }
        return flag;
    }
}
