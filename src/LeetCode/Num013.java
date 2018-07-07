package LeetCode;

public class Num013 {
    public static void main(String[] args) {
        System.out.println(new Num013().romanToInt("MCMXCIV"));
    }
    public int romanToInt(String s) {
        int temp = 0,i;
        char[] chars = s.toCharArray();
        for (i=0;i<chars.length;){
            if (chars[i] == 'I'&& (i+1)<chars.length && chars[i+1] =='V' ){
                temp =temp + 4;
                i=i+2;
            }else if (chars[i] == 'I'&& (i+1)<chars.length && chars[i+1] == 'X'){
                temp =temp + 9;
                i=i+2;
            }else if (chars[i] == 'X'&& (i+1)<chars.length && chars[i+1] == 'L'){
                temp = temp+40;
                i=i+2;
            }else if (chars[i] == 'X'&& (i+1)<chars.length && chars[i+1] == 'C'){
                temp = temp + 90;
                i=i+2;
            }else if (chars[i] == 'C'&& (i+1)<chars.length && chars[i+1] == 'D'){
                temp = temp + 400;
                i = i+2;
            }else if (chars[i] == 'C'&& (i+1)<chars.length && chars[i+1] == 'M'){
                temp = temp + 900;
                i = i+2;
            }else if (chars[i] == 'I'){
                temp = temp+1;
                i++;
            }else if (chars[i] == 'V'){
                temp = temp+5;
                i++;
            }else if (chars[i] == 'X'){
                temp = temp+10;
                i++;
            }else if (chars[i] == 'L'){
                temp = temp+50;
                i++;
            }else if (chars[i] == 'C'){
                temp = temp+100;
                i++;
            }else if (chars[i] == 'D'){
                temp = temp+500;
                i++;
            }else if (chars[i] == 'M'){
                temp = temp+1000;
                i++;
            }
        }
        return temp;
    }
}
