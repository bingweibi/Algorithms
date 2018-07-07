package Jianzhioffer;

import java.util.ArrayList;

/**
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * @author bibingwei
 */
public class Num24 {

    public ArrayList<ArrayList<Integer>> FindPath(TreeNodes root, int target) {
        ArrayList<ArrayList<Integer>> path = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null){
            return path;
        }
        list.add(root.val);
        target -= root.val;

        FindPath(root.left,target);
        FindPath(root.right,target);

        if (target ==0 && root.left==null && root.right == null){
            path.add(new ArrayList<Integer>(list));
        }

        list.remove(list.size()-1);
        return path;
    }
}
