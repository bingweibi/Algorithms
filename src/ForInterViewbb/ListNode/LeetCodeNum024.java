package ForInterViewbb.ListNode;

/**
 * @author bibingwei
 */
public class LeetCodeNum024 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode node = head.next;
        head.next = swapPairs(node.next);
        node.next = head;
        return node;
    }
}
