package ToOffer;

import java.util.Stack;

/**
 * @author bibingwei
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Num15 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode ReverseList(ListNode head) {
        ListNode node = new ListNode(0),result = node;
        if (head == null){
            return head;
        }
        Stack<Integer> stack = new Stack<>();
        while (head != null){
            stack.push(head.val);
            head = head.next;
        }
        while (!stack.empty()){
            node.next = new ListNode(stack.pop());
            node = node.next;
        }
        return result.next;
    }
}
