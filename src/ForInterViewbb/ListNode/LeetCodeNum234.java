package ForInterViewbb.ListNode;

import javax.swing.*;

/**
 * @author bibingwei
 */
public class LeetCodeNum234 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverse(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = newHead;
            newHead = head;
            head = tmp;
        }
        return newHead;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }
        ListNode snake = head;
        int len = 0;
        // 计算长度，用时为O(n)
        while (snake != null) {
            len++;
            snake = snake.next;
        }
        snake = head;  // 为了下一步的重新遍历
        for (int i = 0; i < len / 2 - 1; i++) {
            snake = snake.next;
        }
        // 对于1-2-3-4-4-3-2-1，此时snake到第一个4
        // 对于1-2-3-2-1，此时snake到3
        // 将后半部分进行反转，用时为O(n/2)
        snake.next = reverse(snake.next);
        ListNode snake2 = head;
        snake = snake.next;
        // 对未反转的前半部分和经过反转的后半部分进行逐个比较，用时为O(n/2)
        for (int i = 0; i < len / 2; i++) {
            if (snake2.val != snake.val) {
                return false;
            } else {
                snake = snake.next;
                snake2 = snake2.next;
            }
        }
        return true;
    }
}
