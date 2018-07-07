package Jianzhioffer;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * @author bibingwei
 */
public class Num26 {

//    TreeNode leftRootNode;
//    TreeNode rightRootNode;
//
//    public TreeNode Convert(TreeNode pRootOfTree) {
//
//        if (pRootOfTree == null ){
//            return null;
//        }
//
//        Convert(pRootOfTree.left);
//        if (leftRootNode == null){
//            leftRootNode = pRootOfTree;
//            rightRootNode = pRootOfTree;
//        }else {
//            rightRootNode.right = pRootOfTree;
//            pRootOfTree.left = rightRootNode;
//            rightRootNode = pRootOfTree;
//        }
//
//        Convert(pRootOfTree.right);
//        return leftRootNode;
//    }
}
