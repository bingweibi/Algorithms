package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Num142 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        while (head != null) {
            if (visited.contains(head)) {
                return head;
            } else {
                visited.add(head);
            }
            head = head.next;
        }
        return null;
    }
}
