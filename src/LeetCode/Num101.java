package LeetCode;

public class Num101 {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }

    public boolean isSymmetric(TreeNode root) {
          if (root == null){
              return true;
          }
          return checkSame(root.left,root.right);
    }

    private boolean checkSame(TreeNode left, TreeNode right) {
        if (left == null && right == null){
            return true;
        }
        if (left == null || right == null){
            return false;
        }
        if (left.val == right.val ){
            return checkSame(left.left,right.right)&&checkSame(left.right,right.left);
        }else {
            return false;
        }
    }
}
