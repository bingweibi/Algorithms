package ForInterViewbb.ListNode;

/**
 * @author bibingwei
 */
public class LeetCodeNum083 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode listNode = head;
        if (head == null || head.next == null){
            return head;
        }
        while (head.val == head.next.val && head.next.next != null){
            head.next = head.next.next;
            head = head.next;
        }
        return listNode;
    }
}
