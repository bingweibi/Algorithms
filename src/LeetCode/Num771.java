package LeetCode;

import java.util.HashMap;

/**
 * @author bibingwei
 *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
 *  S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * 输入: J = "aA", S = "aAAbbbb"
 * 输出: 3
 * 输入: J = "z", S = "ZZ"
 * 输出: 0
 */

public class Num771 {
    public static void main(String[] args) {
        System.out.println(new Num771().numJewelsInStones("aA","aAAbbbb"));
    }
    public int numJewelsInStones(String J, String S) {
        int num = 0;
        char[] jChar = J.toCharArray();
        char[] sChar = S.toCharArray();
        HashMap<Character,Integer> sHashMap = new HashMap<>();
        for (char aSChar : sChar) {
            if (sHashMap.containsKey(aSChar)) {
                int temp = sHashMap.get(aSChar);
                sHashMap.put(aSChar, ++temp);
            }else {
                sHashMap.put(aSChar, 1);
            }
        }
        for (char aJChar : jChar) {
            if (sHashMap.containsKey(aJChar)) {
                num += sHashMap.get(aJChar);
            }
        }
        return num;
    }
}
