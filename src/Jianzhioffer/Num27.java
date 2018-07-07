package Jianzhioffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 * @author bibingwei
 */
public class Num27 {
    ArrayList<String> list = new ArrayList<String>();
    public static void main(String[] args) {
        String a = "";
        System.out.println(new Num27().Permutation(a));
    }
    public ArrayList<String> Permutation(String str) {

        char[] array = str.toCharArray();
        return allChange(array,0,array.length);
    }

    private ArrayList<String> allChange(char[] array, int start, int length) {

        if (start == length-1 && !list.contains(new String(array))) {
            list.add(new String(array));
        }else{
            for (int i= start;i<length;i++){

                swap(array,start,i);
                allChange(array,start+1,length);
                swap(array,start,i);
            }
        }
        Collections.sort(list);
        return list;
    }

    private void swap(char[] array,int i,int  j) {
        char temp = array[i];
        array[i]= array[j];
        array[j] = temp;
    }
}
