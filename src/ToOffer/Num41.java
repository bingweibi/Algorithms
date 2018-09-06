package ToOffer;

/**
 * @author bibingwei
 * ReverseSentence
 */
public class Num41 {
    public String ReverseSentence(String str) {
        String temp = "";
        if (str==null||str.length()==0||str.trim().length()==0){
            return str;
        }
        String[] s = str.split(" ");
        for (int i = s.length-1;i>=0;i--){
            temp += s[i] + " ";
        }
        return temp.substring(0,temp.length()-1);
    }
}
