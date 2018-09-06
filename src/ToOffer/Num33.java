package ToOffer;

import java.util.HashMap;

/**
 * @author bibingwei
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class Num33 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        while (pHead1 != null){
            map.put(pHead1.val,0);
            pHead1 = pHead1.next;
        }
        while (pHead2 != null){
            if (map.containsKey(pHead2.val)){
                return pHead2;
            }else {
                pHead2 = pHead2.next;
            }
        }
        return null;
    }
}
