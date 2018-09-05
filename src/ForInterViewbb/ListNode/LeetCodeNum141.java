package ForInterViewbb.ListNode;

/**
 * @author bibingwei
 */
public class LeetCodeNum141 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null|| head.next.next == null){
            return false;
        }
        ListNode faster = head.next.next,lower = head.next;
        while (faster != null && faster.next != null){
            if (faster == lower){
                return true;
            }else {
                faster = faster.next.next;
                lower = lower.next;
            }
        }
        return false;
    }
}
