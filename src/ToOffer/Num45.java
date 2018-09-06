package ToOffer;

/**
 * @author bibingwei
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null
 */
public class Num45 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode EntryNodeOfLoop(ListNode pHead) {

        if(pHead==null|| pHead.next==null|| pHead.next.next==null){
            return null;
        }

        ListNode fast=pHead.next.next;
        ListNode slow=pHead.next;

        while(fast!=slow){
            if(fast.next!=null&& fast.next.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }else{
                return null;
            }
        }

        //循环出来的话就是有环，且此时fast==slow.
        fast=pHead;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
