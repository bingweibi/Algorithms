package ForInterViewbb.ListNode;

import java.util.List;

/**
 * @author bibingwei
 */
public class LeetCodeNum147 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummyHead = new ListNode(0), p = head;
        dummyHead.next = head;
        while(p.next != null) {
            //p 的值不小于下一节点
            if(p.val <= p.next.val) {
                p = p.next;
            } else {
                ListNode temp = p.next, q = dummyHead;
                p.next = p.next.next;
                //找到第一个大于该节点的前一节点
                while(q.next.val < temp.val) {
                    q = q.next;
                }
                //将 temp 节点插入
                temp.next = q.next;
                q.next = temp;
            }
        }
        return dummyHead.next;
    }
}
