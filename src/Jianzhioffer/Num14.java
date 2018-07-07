//import java.util.Stack;
//
///**
// * 输入一个链表，输出该链表中倒数第k个结点。
// * @author bibingwei
// */
//public class Num14 {
//    public ListNode FindKthToTail(ListNode head,int k) {
//
//        ListNode node = new ListNode(0);
//        if (head == null || k<0){
//            return null;
//        }
//        Stack<ListNode> stack = new Stack<ListNode>();
//        int count = 0;
//        while(head != null){
//            stack.push(head);
//            count++;
//            head= head.next;
//        }
//        if (k>count || k==0){
//            return null;
//        }
//
//        for (int i=1;i <= count;i++){
//            node = stack.pop();
//            if (i == k){
//                break;
//            }
//        }
//        return node;
//    }
//}
