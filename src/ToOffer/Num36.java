package ToOffer;

/**
 * @author bibingwei
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class Num36 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    boolean flag = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        int l = IsBalanced(root);
        return flag;
    }
    public int IsBalanced(TreeNode root) {
        if (root == null ){
            return 0;
        }
        int l = IsBalanced(root.left);
        int r = IsBalanced(root.right);
        if (Math.abs(l-r) >1){
            flag = false;
        }
        return l>r?l+1:r+1;
    }
}
