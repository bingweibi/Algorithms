package LeetCode;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Num402 {
    public static void main(String[] args) {
        System.out.println(new Num402().removeKdigits("10200",1));
    }
    public String removeKdigits(String num, int k) {

        while(true){
            int len = num.length();
            if(len <= k || len == 0){
                return "0";
            }
            if(k-- == 0){
                return num;
            }
            if(num.charAt(1) == '0'){
                int firstNotZero = 1;
                while(firstNotZero < num.length()  && num.charAt(firstNotZero) == '0'){
                    firstNotZero ++;
                }
                num=num.substring(firstNotZero);
            } else{
                int startIndex = 0;
                while(startIndex < num.length() - 1  && num.charAt(startIndex) <= num.charAt(startIndex + 1)){
                    startIndex ++;
                }
                num = num.substring(0,startIndex) + num.substring(startIndex+1);
            }
        }
    }
}
