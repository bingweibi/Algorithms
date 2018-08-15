package ToOffer;

/**
 * @author bibingwei
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Num14 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        int temp = 0,count =0;
        ListNode node = head;
        while (node != null){
            count++;
            node = node.next;
        }
        while (head != null && temp + k != count){
            temp++;
            head = head.next;
        }

        return head;
    }
}
