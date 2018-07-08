package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Num234 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean isPalindrome(ListNode head) {
        boolean temp = true;
        List<Integer> list = new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head = head.next;
        }
        int i=0,j=list.size()-1;
        while (i<=j){
            if (!list.get(i).equals(list.get(j))){
                temp =  false;
            }
            i++;j--;
        }
        return temp;
    }
}
