package LeetCode;

public class Num066 {
    public static void main(String[] args) {
        int[] digits ={1,9};
        new Num066().plusOne(digits);
    }
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        boolean flag = true;
        for (int i=len-1;i>=0;i--){
            if (digits[i] != 9){
                flag = false;
                break;
            }
        }
        if (flag){
            int[] result = new int[++len];
            for (int i=1;i<len;i++){
                result[i] = 0;
            }
            result[0] =1;
            return result;
        }else {
            if (digits[len-1] == 9){
                int i=len-1;
                while (digits[i] == 9){
                    i--;
                }
                digits[i]++;
                for (int j=i+1;j<len;j++){
                    digits[j] =0;
                }
            }else {
                digits[len-1]++;
            }
        }
        return digits;
    }
}
