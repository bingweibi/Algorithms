package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author bibingwei
 * 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。
 * 例如，"cab" 可以写成 "-.-.-....-"，(即 "-.-." + "-..." + ".-"字符串的结合)。
 * 我们将这样一个连接过程称作单词翻译。
 *
 * 例如:
 * 输入: words = ["gin", "zen", "gig", "msg"]
 * 输出: 2
 * 解释:
 * 各单词翻译如下:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 *
 * 共有 2 种不同翻译, "--...-." 和 "--...--.".
 */
public class Num804 {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(new Num804().uniqueMorseRepresentations(words));
    }
    public int uniqueMorseRepresentations(String[] words) {
        int nums;
        Set<String> set = new HashSet<>();
        for (int i=0;i<words.length;i++){
            char[] chars = words[i].toCharArray();
            String s = "";
            for (int j=0;j<chars.length;j++){
                switch (chars[j]){
                    case 'a':
                        s += ".-";
                        break;
                    case 'b':
                        s += "-...";
                        break;
                    case 'c':
                        s += "-.-.";
                        break;
                    case 'd':
                        s += "-..";
                        break;
                    case 'e':
                        s += ".";
                        break;
                    case 'f':
                        s += "..-.";
                        break;
                    case 'g':
                        s += "--.";
                        break;
                    case 'h':
                        s += "....";
                        break;
                    case 'i':
                        s += "..";
                        break;
                    case 'j':
                        s += ".---";
                        break;
                    case 'k':
                        s += "-.-";
                        break;
                    case 'l':
                        s += ".-..";
                        break;
                    case 'm':
                        s += "--";
                        break;
                    case 'n':
                        s += "-.";
                        break;
                    case 'o':
                        s += "---";
                        break;
                    case 'p':
                        s += ".--.";
                        break;
                    case 'q':
                        s += "--.-";
                        break;
                    case 'r':
                        s += ".-.";
                        break;
                    case 's':
                        s += "...";
                        break;
                    case 't':
                        s += "-";
                        break;
                    case 'u':
                        s += "..-";
                        break;
                    case 'v':
                        s += "...-";
                        break;
                    case 'w':
                        s += ".--";
                        break;
                    case 'x':
                        s += "-..-";
                        break;
                    case 'y':
                        s += "-.--";
                        break;
                    case 'z':
                        s += "--..";
                        break;
                        default:
                }
            }
            set.add(s);
        }
        nums = set.size();
        return  nums;
    }
}
