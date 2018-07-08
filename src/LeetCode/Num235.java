package LeetCode;

public class Num235 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root.val == p.val && root.right.val == q.val){
            return root;
        }else if ((root.val > p.val)&&(root.val > q.val)){
            return lowestCommonAncestor(root.left,p,q);
        }else if ((root.val < p.val)&&(root.val < q.val)){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}
