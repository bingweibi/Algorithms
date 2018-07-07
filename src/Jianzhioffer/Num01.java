package Jianzhioffer;

import javax.xml.transform.Result;
import java.util.Scanner;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *  解法：左下或者右上开始
 *
 * @author bibingwei*/
public class Num01 {

    public boolean Find(int target, int [][] array) {

        int high = array.length;
        int width = array[0].length;
        int i = high-1,j=0;

        for (;j< width && i>=0;){
            if (array[i][j] > target){
                i--;
            }else if (array[i][j] < target){
                j++;
            }else if (array[i][j] == target){
                return true;
            }
        }
        return false;
    }

}
