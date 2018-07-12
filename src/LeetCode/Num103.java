package LeetCode;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Num103 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null){
            return result;
        }
        queue.add(root);
        while (queue.size() >0){
            List<Integer> list1 = new ArrayList<>();
            int size = queue.size();
            for ( int i=0;i<size;i++){
                TreeNode node = queue.poll();
                list1.add(node.val);
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
            result.add(list1);
        }
        for (int i=1;i<result.size();i=i+2){
            Collections.reverse(result.get(i));
        }
        return result;
    }
}
