package ForInterViewbb.ListNode;

import java.lang.annotation.ElementType;

/**
 * @author bibingwei
 */
public class LeetCodeNum203 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode(0),temp = result;
        result.next = head;
        while (head != null){
            if (head.val == val ){
                result.next = head.next;
            }else {
                result = result.next;
            }
            head = head.next;
        }
        return temp.next;
    }
}
