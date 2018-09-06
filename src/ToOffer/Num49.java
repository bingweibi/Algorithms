package ToOffer;

import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author bibingwei
 * 之字形层序输出二叉树
 */
public class Num49 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        int temp = 1;
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        if (pRoot == null){
            return resultList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();

            for (int i=0;i<size;i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
            if (temp %2 != 0){
                resultList.add(list);
            }else {
                Collections.reverse(list);
                resultList.add(list);
            }
            temp++;
        }
        return resultList;
    }
}
