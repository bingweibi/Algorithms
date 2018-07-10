package LeetCode;

public class Num415 {
    public static void main(String[] args) {
        System.out.println(new Num415().addStrings("9", "99"));
    }
    public String addStrings(String num1, String num2) {
        int length = num1.length()-1,length1 = num2.length()-1,sum = 0;
        String s ="";
        while (length>=0 || length1>=0){
            if (length >= 0){
                sum += num1.charAt(length)-'0' ;
                length--;
            }
            if (length1 >= 0){
                sum += num2.charAt(length1)-'0';
                length1--;
            }

            s = Integer.toString(sum % 10) + s;
            sum /=10;
        }
        return sum ==1 ? "1"+s : s;
    }
}
