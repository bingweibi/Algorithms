package Jianzhioffer;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）（未全明白）
 * @author bibingwei
 */
public class Num17 {
    public boolean HasSubtree(TreeNodes root1, TreeNodes root2) {

        if (root2 == null || root1 ==null ){
            return false;
        }
        return isSameTree(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }

    private boolean isSameTree(TreeNodes root1, TreeNodes root2) {
        if (root2 == null){
            return true;
        }
        if (root1 == null){
            return false;
        }
        return root1.val == root2.val && isSameTree(root1.left,root2.left)&& isSameTree(root1.right,root2.right);
    }
}
