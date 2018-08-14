package ToOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author bibingwei
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class Num03 {

     public class ListNode {
         int val;
         ListNode next = null;

         ListNode(int val) {
             this.val = val;
         }
     }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null){
            return list;
        }
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}
