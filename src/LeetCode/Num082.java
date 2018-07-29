package LeetCode;

import java.util.HashMap;

public class Num082 {
    static public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        while (head != null && head.next != null) {
            ListNode temp = head.next;
            if (temp.val == head.val) {
                while (temp.val == head.val) {
                    temp = temp.next;
                    if (temp == null) {
                        return null;
                    }
                }
                head = temp;
            } else {
                break;
            }
        }
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head.next;
        ListNode last = head;
        while (temp.next != null) {
            if (temp.val != temp.next.val) {
                last.next = temp;
                temp = temp.next;
                last=last.next;
                continue;
            }
            int tmp=temp.val;
            while(temp.val==tmp){
                temp=temp.next;
                if (temp == null){
                    last.next=null;
                    return head;
                }
            }
        }
        last.next=temp;
        return head;
    }
}
