//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Stack;
//
///**
// * 输入一个链表，从尾到头打印链表每个节点的值。
// * @author bibingwei
// */
//
///**
// *    public class ListNode {
// *        int val;
// *        ListNode next = null;
// *
// *        ListNode(int val) {
// *            this.val = val;
// *        }
// *    }
// *
// */
//
//public class Num003 {
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        ListNode head = listNode;
//        if (listNode == null){
//            return null;
//        }
//        Stack stack = new Stack();
//        while (head != null){
//            stack.push(head.val);
//            head = head.next;
//        }
//        while (!stack.empty()){
//            list.add((Integer) stack.pop());
//        }
//        return list;
//    }
//}