package ForInterViewbb.ListNode;

/**
 * @author bibingwei
 */
public class LeetCodeNum021 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resultListNode = new ListNode(0),result = resultListNode;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                resultListNode.next = new ListNode(l1.val);
                l1 = l1.next;
            }else {
                resultListNode.next  = new ListNode(l2.val);
                l2 = l2.next;
            }
            resultListNode = resultListNode.next;
        }
        if (l1 == null){
            resultListNode.next = l2;
        }else {
            resultListNode.next = l1;
        }
        return result.next;
    }
}
