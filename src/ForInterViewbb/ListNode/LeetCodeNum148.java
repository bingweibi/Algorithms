package ForInterViewbb.ListNode;

import java.util.List;

/**
 * @author bibingwei
 */
public class LeetCodeNum148 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode faster = head,slower = head;
        ListNode secondList = null;
        while (faster != null && faster.next != null){
            secondList = slower;
            faster = faster.next.next;
            slower = slower.next;
        }

        secondList.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slower);
        return merage(l1,l2);
    }

    private ListNode merage(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0),temp = result;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                result.next = l1;
                l1 = l1.next;
            }else {
                result.next = l2;
                l2 = l2.next;
            }
            result = result.next;
        }
        if (l1 == null){
            result.next = l2;
        }
        if (l2 == null){
            result.next = l1;
        }
        return temp.next;
    }
}
