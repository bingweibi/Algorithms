package Jianzhioffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

/**
 *从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */

public class Num60 {
//    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
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
//        }
//        return result;
//    }
}
