package ForInterViewbb.ListNode;

/**
 * @author bibingwei
 */
public class LeetCodeNum206 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next ==null){
            return head;
        }
        ListNode current = head.next;
        ListNode node = reverseList(current);
        head.next = null;
        current.next = head;
        return node;
    }
}
