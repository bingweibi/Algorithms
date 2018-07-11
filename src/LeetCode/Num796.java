package LeetCode;

public class Num796 {
    public static void main(String[] args) {
        System.out.println(new Num796().rotateString("abcde",
                "abced"));
    }
    public boolean rotateString(String A, String B) {
        boolean flag = false;
        if(A.length()==0 && B.length() == 0){
            return true;
        }
        if(A.length() != B.length()){
            return false;
        }
        int len = A.length();
        StringBuilder ABuilder = new StringBuilder(A);
        for (int i = 0; i<len*2; i++){
            ABuilder.append(ABuilder.charAt(i));
            if (ABuilder.substring(i+1, ABuilder.length()).equals(B)){
                flag = true;
                break;
            }
        }
        A = ABuilder.toString();
        return flag;
    }
}
