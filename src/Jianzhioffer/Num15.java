//import java.util.Stack;
//
///**
// * 输入一个链表，反转链表后，输出链表的所有元素。
// * @author bibingwei
// */
//public class Num15 {
//    public ListNode ReverseList(ListNode head) {
//        ListNode node = new ListNode(0);
//        ListNode head1 = node;
//        ListNode p ; ///new ListNode(0);
//        if (head == null){
//            return null;
//        }
//        Stack<ListNode> stack = new Stack<ListNode>();
//        while (head.next != null){
//            stack.push(head);
//            head = head.next;
//        }
//        stack.push(head);
//        while (!stack.empty()){
//            p = stack.pop();
//            node.next = p;
//            node = node.next;
//        }
//        node.next = null;
//        return head1.next;
//    }
//}
