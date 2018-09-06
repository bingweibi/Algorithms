package ToOffer;

/**
 * @author bibingwei
 * 镜像二叉树
 */
public class Num48 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    boolean isSymmetrical(TreeNode pRoot){
        if(pRoot == null){
            return true;
        }

        return isSame(pRoot.left,pRoot.right);
    }

    private boolean isSame(TreeNode left, TreeNode right) {
        if (left == null && right == null){
            return true;
        }
        while (left != null && right != null){
            return left.val == right.val && isSame(left.left,right.right)&&isSame(left.right,right.left);
        }
        return false;
    }
}
