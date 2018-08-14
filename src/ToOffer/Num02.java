package ToOffer;

/**
 * @author bibingwei
 * 请实现一个函数，把字符串中的每个空格替换成"%20"，
 * 例如“We are happy.”，则输出“We%20are%20happy.”。
 */
public class Num02 {
    public static void main(String[] args) {
        System.out.println(new Num02().replaceSpace(new StringBuffer(" ")));
    }
    public String replaceSpace(StringBuffer str) {
        int len = str.length();
        if (len ==1 && str.charAt(0) == ' '){
            return "%20%20%20";
        }
        for (int i=0;i<len;i++){
            if (str.charAt(i) == ' '){
                str.replace(i,i+1,"%20");
            }
        }
        return String.valueOf(str);
    }
}
