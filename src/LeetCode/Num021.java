package LeetCode;

public class Num021 {

    public static void main(String[] args) {
        //ListNode l1 = new ListNode()
    }

    /**
     * Definition for singly-linked list.
     * */
     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        ListNode l3 = null;
        if (l1.val <= l2.val){
            l3 = l1;
            l3.next = mergeTwoLists(l1.next,l2);
            return l3;
        }else {
            l3 = l2;
            l3.next = mergeTwoLists(l1,l2.next);
            return l3;
        }
    }
}
