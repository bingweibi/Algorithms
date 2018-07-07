package LeetCode;

public class Num007 {
    public static void main(String[] args) {
        System.out.println(new Num007().reverse(1534236469));
    }

    public int reverse(int x) {
        String s = "" + x;
        int length = s.length();
        char[] ch = s.toCharArray();
        long res = 0;
        if(length<=1){
            return x;
        }
        StringBuilder sBuilder = new StringBuilder();
        for( int i=length-1;i>0;i--){
            sBuilder.append(ch[i]);
        }
        res=Long.parseLong(sBuilder.toString());
        if(ch[0] == '-'){
            res =- res;
        }else{
            res = res*10+(s.charAt(0)-48);
        }

        if(Math.abs(res) > 2147483647){
            res = 0;
        }
        return (int)res;
    }
}
