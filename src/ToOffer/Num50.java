package ToOffer;

import java.util.ArrayList;

/**
 * @author bibingwei
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。
 * 例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 */
public class Num50 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k<=0){
            return null;
        }
        ArrayList<TreeNode> list = new ArrayList<>();
        minOrder(pRoot,list);
        if (k>list.size()){
            return null;
        }else {
            return list.get(k-1);
        }
    }

    private void minOrder(TreeNode pRoot, ArrayList<TreeNode> list) {
        if (pRoot == null){
            return;
        }
        minOrder(pRoot.left,list);
        list.add(pRoot);
        minOrder(pRoot.right,list);
    }
}
