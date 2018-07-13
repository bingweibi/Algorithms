package LeetCode;

public class Num686 {
    public static void main(String[] args) {
        System.out.println(new Num686().repeatedStringMatch("a","aa"));
    }
    public int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int lenA = A.length();
        int lenB = B.length();
        for(int i=0;i<lenB/lenA + 2;i++){
            String str = sb.append(A).toString();
            if(str.contains(B)) {
                return i+1;
            }
        }
        return -1;
    }
}
