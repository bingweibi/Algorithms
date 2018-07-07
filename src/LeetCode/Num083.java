package LeetCode;

public class Num083 {

    public Num021.ListNode deleteDuplicates(Num021.ListNode head) {
        if (head == null|| head.next == null){
            return head;
        }
        Num021.ListNode temp = head;
        while(temp.next != null){
            if (temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return head;
    }
}
