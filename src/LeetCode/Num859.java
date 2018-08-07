package LeetCode;

public class Num859 {
    public static void main(String[] args) {
        System.out.println(new Num859().buddyStrings("ab","ab"));
    }
    public boolean buddyStrings(String A, String B) {
        int lenA  = A.length();
        int lenB  = B.length();
        if(lenA!=lenB) {
            return false;
        }
        StringBuilder a = new StringBuilder(A);
        StringBuilder b = new StringBuilder(B);
        int flag=1;
        for(int i=0;i<lenA;i++) {
            if(a.charAt(i)!=b.charAt(i) && flag==1) {
                for (int j = i + 1; j < lenA; j++) {
                    if (b.charAt(i) == a.charAt(j) ) {
                        flag = 0;
                        char tmp = a.charAt(i);
                        a.setCharAt(i, a.charAt(j));
                        a.setCharAt(j, tmp);
                        break;
                    }
                }
            }else if(a.charAt(i)!=b.charAt(i)) {
                return false;
            }
        }

        if(flag==1){
            for(int i=0;i<lenA;i++){
                for(int j=i+1;j<lenA;j++){
                    if(a.charAt(i)==a.charAt(j)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
