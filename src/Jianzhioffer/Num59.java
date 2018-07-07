package Jianzhioffer;

import java.util.*;

/**
 * 请实现一个函数按照之字形打印二叉树，
 * 即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，
 * 第三行按照从左到右的顺序打印，其他行以此类推。
 */

public class Num59 {
//    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
//        int temp = 0;
//        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
//        if(pRoot==null){
//            return result;
//        }
//        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        queue.offer(pRoot);
//        while(queue.size()!=0){
//            int cur=0;
//            int size = queue.size();
//            ArrayList<Integer> list = new ArrayList<>();
//            Iterator<TreeNode> it = queue.iterator();
//            while(it.hasNext()){
//                list.add(it.next().val);
//            }
//            if (temp%2 != 0){
//                Collections.reverse(list);
//            }
//            result.add(new ArrayList<>(list));
//            while(cur<size){
//                TreeNode node = queue.poll();
//                if(node.left!=null){
//                    queue.offer(node.left);
//                }
//                if(node.right!=null){
//                    queue.offer(node.right);
//                }
//                cur++;
//            }
//            temp++;
//        }
//        return result;
//    }
}
