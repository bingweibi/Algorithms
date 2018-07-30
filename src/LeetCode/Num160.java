package LeetCode;

public class Num160 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        ListNode l1 = headA,l2 = headB;
        while (true){
            if (l1 == l2){
                return l1;
            }
            l1 = l1.next;
            l2 = l2.next;
            if (l1== l2){
                return l1;
            }
            if (l1 == null){
                l1= headB;
            }
            if (l2 == null){
                l2 = headA;
            }
        }
    }
}
