package LeetCode;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bibingwei
 *
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 *
 * 你可以重复使用键盘上同一字符。
 * 你可以假设输入的字符串将只包含字母
 */
public class Num500 {
    public static void main(String[] args) {
        String[] s = {"qz","wq","asdddafadsfa", "adfadfadfdassfawde"};
        System.out.println(Arrays.toString(new Num500().findWords(s)));
    }
    public String[] findWords(String[] words) {
        String[] result = new String[words.length];
        ArrayList<String> list = new ArrayList<>();
        list.add("qwertyuiop");
        list.add("asdfghjkl");
        list.add("zxcvbnm");
        boolean flag = true;
        int num = 0;
        for (int i=0;i<words.length;i++){
            char[] chars = words[i].toLowerCase().toCharArray();
            for (int j=0;j<chars.length;) {
                if (!list.get(0).contains(String.valueOf(chars[j]))){
                    flag = false;
                    break;
                }else {
                    j++;
                }
            }
            if (flag){
                result[num] = words[i];
                num++;
            }
            flag = true;
            for (int j=0;j<chars.length;) {
                if (!list.get(1).contains(String.valueOf(chars[j]))){
                    flag = false;
                    break;
                }else {
                    j++;
                }
            }
            if (flag){
                result[num] = words[i];
                num++;
            }
            flag = true;
            for (int j=0;j<chars.length;) {
                if (!list.get(2).contains(String.valueOf(chars[j]))){
                    flag = false;
                    break;
                }else {
                    j++;
                }
            }
            if (flag){
                result[num] = words[i];
                num++;
            }
            flag = true;
        }
        List<String> tmp = new ArrayList<String>();
        for(String str:result){
            if(str!=null && str.length()!=0){
                tmp.add(str);
            }
        }
        result = tmp.toArray(new String[0]);
        return result;
    }
}
