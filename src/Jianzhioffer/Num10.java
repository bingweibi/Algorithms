package Jianzhioffer;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * @author bibingwei
 */
public class Num10 {
    public int RectCover(int target) {
        int f1 = 1,f2 = 2,sum = 0;
        if (target ==0){
            return 0;
        }else if (target == 1){
            return 1;
        }else if (target == 2){
            return 2;
        }
        for(int i=target;i>2;i--){
            sum = f1+f2;
            f1=f2;
            f2=sum;
        }
        return sum;
    }
}
