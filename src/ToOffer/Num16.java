package ToOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author bibingwei
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 */
public class Num16 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode Merge(ListNode list1,ListNode list2) {
        List<Integer> list = new ArrayList<>();
        while (list1 != null){
            list.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null){
            list.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(list);
        ListNode node = new ListNode(0),result = node;
        for (Integer aList : list) {
            node.next = new ListNode(aList);
            node = node.next;
        }
        return result.next;
    }
}
