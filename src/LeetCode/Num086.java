package LeetCode;

public class Num086 {
    static public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode node1 = new ListNode(0), node2 = new ListNode(0);
        ListNode p1 = node1, p2 = node2;
        while (head != null) {
            if (head.val < x) {
                p1.next = head;
                p1 = head;
            } else {
                p2.next = head;
                p2 = head;
            }
            head = head.next;
        }
        p2.next = null;
        p1.next = node2.next;
        return node1.next;
    }
}
