import java.util.Scanner;

/**
 * @author bibingwei
 */
public class XieCheng2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        int flag = 0;
        for (int i=0;i<line.length();i++){
            if (line.charAt(i) == '@'){
                flag = i ;
                break;
            }
            s1.append(line.charAt(i));
        }
        for (int i=flag + 1;i<line.length();i++){
            s2.append(line.charAt(i));
        }

        int i=0,j=0;
        char[] chars = s2.toString().toCharArray();
        for (;j<chars.length;){
            if (i == s1.length()){
                chars[j] = '0';
                j++;
            }else {
                if (s1.charAt(i) == chars[j]){
                    chars[j] = 49;
                    i++;j++;
                }else {
                    chars[j] = 48;
                    j++;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        if (i==s1.length()){
            for (char aChar : chars) {
                result.append(aChar);
            }
        }else {
            for (char aChar : chars) {
                result.append(0);
            }
        }

        System.out.println(result);
    }
}
