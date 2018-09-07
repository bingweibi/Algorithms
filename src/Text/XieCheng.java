package Text;

import java.util.Scanner;

/**
 * @author bibingwei
 */
public class XieCheng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        int flag = 0;
        for (int i=0;i<line.length();i++){
            if (line.charAt(i) == ' '){
                flag = i;
                break;
            }else {
                s1.append(line.charAt(i));
            }
        }
        for (int i= flag+1;i <line.length();i++){
            if (line.charAt(i) == ' '){
            }else {
                s2.append(line.charAt(i));
            }
        }
        System.out.println(addBinary(s1.toString(), s2.toString()));
    }
    public static String addBinary(String a, String b) {
        int lena = a.length();
        int lenb = b.length();
        int i =0, carry = 0;
        StringBuilder res = new StringBuilder();
        while(i<lena || i<lenb || carry!=0){
            int x = (i<lena) ? Character.getNumericValue(a.charAt(lena - 1 - i)) : 0;
            int y = (i<lenb) ? Character.getNumericValue(b.charAt(lenb - 1 - i)) : 0;
            res.insert(0, (x + y + carry) % 2);
            carry = (x + y + carry)/2;
            i++;
        }
        return res.toString();
    }
}
