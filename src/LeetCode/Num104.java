package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author bibingwei
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数
 */
public class Num104 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return findDepth(root);
    }

    private int findDepth(TreeNode root) {
        int depthL = 1,depthR = 1;
        if (root.left != null){
            depthL = depthL + findDepth(root.left)  ;
        }
        if (root.right != null){
            depthR = depthR + findDepth(root.right);
        }
        return depthL > depthR ? depthL:depthR;
    }
}
