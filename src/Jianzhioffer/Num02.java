package Jianzhioffer;

import javax.management.relation.Relation;
import java.util.Scanner;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author bibingwei
 */
public class Num02 {
    public String replaceSpace(StringBuffer str) {
        return(str.toString().replaceAll(" ","%20"));
    }
}
