package LeetCode;

public class Num066 {
    public static void main(String[] args) {
        int[] digits ={9};
        System.out.println(new Num066().plusOne(digits));
    }
    public int[] plusOne(int[] digits) {
        boolean flag =false;
        int i = digits.length-1;
        if (digits[i] !=9){
            digits[i] = digits[i] + 1;
        }
        for (int j = 0;j<digits.length;j++){
            if (digits[i] == 9){
                flag = true;
            }
        }
        if (flag){
            int[] temp = new int[i+2];
            for (int k=0;k<temp.length;k++){
                if (k==0){
                    temp[k]=1;
                }else {
                    temp[k]=0;
                }
            }
            return temp;
        }
        while (digits[i] == 9) {
            digits[i] = 0;
            digits[i - 1] = digits[i - 1] + 1;
            i--;
        }
        return digits;
    }
}
