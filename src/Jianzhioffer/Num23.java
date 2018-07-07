package Jianzhioffer;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。
 * 假设输入的数组的任意两个数字都互不相同。
 * @author bibingwei
 */
public class Num23 {

    public static void main(String[] args) {
        int[] test = {4,8,6,12,16,14,10};
        boolean temp = new Num23().VerifySquenceOfBST(test);
        System.out.println(temp);
    }
    public boolean VerifySquenceOfBST(int [] sequence) {

        if (sequence.length ==0){
            return false;
        }

        boolean temp = false;
        int root = sequence[sequence.length-1],flag = 0;
        for (int i=0;i <= sequence.length-1;i++){
            if (sequence[i] >= root){
                flag = i;
                break;
            }
        }

        int i=0,j=flag;
        while (i < flag && sequence[i] <= root ){
            i++;
        }
        while (j < sequence.length && sequence[j] > root){
            j++;
        }
        if (i== flag && j==sequence.length-1){
            temp = true;
        }
        return temp;
    }
}
