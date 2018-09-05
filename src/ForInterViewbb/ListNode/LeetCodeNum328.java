package ForInterViewbb.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bibingwei
 */
public class LeetCodeNum328 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode oddEvenList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int count = 1;
        while (head != null){
            if (count %2 ==0){
                list2.add(head.val);
                count++;
                head = head.next;
            }else {
                list.add(head.val);
                count++;
                head = head.next;
            }
        }
        ListNode node = new ListNode(0),node1 = node;
        for (Integer aList : list) {
            node.next = new ListNode(aList);
            node = node.next;
        }
        for (Integer aList : list2) {
            node.next = new ListNode(aList);
            node = node.next;
        }
        return node1.next;
    }
}
