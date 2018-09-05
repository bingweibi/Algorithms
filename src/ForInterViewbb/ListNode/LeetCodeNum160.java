package ForInterViewbb.ListNode;

/**
 * @author bibingwei
 */
public class LeetCodeNum160 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode p1 = headA,p2 = headB;
        int count1 = 0,count2 = 0;
        while (p1 != null){
            count1++;
            p1 = p1.next;
        }
        while (p2 != null){
            count2++;
            p2 = p2.next;
        }
        int cha = Math.abs(count1-count2);
        if (count1 >= count2){
            for (int i = 0;i<cha;i++){
                headA = headA.next;
            }
        }else {
            for (int i = 0;i<cha;i++){
                headB = headB.next;
            }
        }
        while (headA != null){
            if (headA == headB){
                return headA;
            }else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
}
