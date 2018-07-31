package LeetCode;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.List;

public class Num098 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        boolean flag = true;
        List<Integer> list = bst(root);
        for (int i=1;i<list.size();i++){
            if (list.get(i)<=list.get(i-1)){
                flag = false;
                break;
            }
        }
        return flag;
    }

    private List<Integer> bst(TreeNode root) {
        if (root == null){
            return list;
        }
        if (root.left != null){
            bst(root.left);
        }
        list.add(root.val);
        if (root.right != null){
            bst(root.right);
        }
        return list;
    }
}
