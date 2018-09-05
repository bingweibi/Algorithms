package ForInterViewbb.ListNode;

/**
 * @author bibingwei
 */
public class LeetCodeNum876 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode middleNode(ListNode head) {
        ListNode  fast  = head,lower = head;
        while (fast.next != null){
            if (fast.next.next == null){
                fast = fast.next;
            }else {
                fast = fast.next.next;
            }
            lower = lower.next;
        }
        return lower;
    }
}
