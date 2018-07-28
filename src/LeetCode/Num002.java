package LeetCode;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Num002 {

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }

        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode l1 = stringToListNode(line);
            line = in.readLine();
            ListNode l2 = stringToListNode(line);

            ListNode ret = new Num002().addTwoNumbers(l1, l2);

            String out = listNodeToString(ret);

            System.out.print(out);
        }
    }

    static public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int i = 0,len1 = 0,len2 = 0,len;

        ListNode node = new ListNode(0);
        ListNode temp = node,templ1 = l1,templ2 = l2;
        while (l1 !=null){
            len1++;
            l1 = l1.next;
        }
        while (l2 !=null){
            len2++;
            l2 = l2.next;
        }
        len = Math.max(len1,len2);
        List<Integer> sum = new ArrayList<>(len);
        if (len1>len2){
            while (templ1 != null){
                sum.add(i,templ1.val);
                i++;
                templ1 = templ1.next;
            }
            i=0;
            while (templ2 != null){
                sum.set(i,sum.get(i)+templ2.val);
                i++;
                templ2 = templ2.next;
            }
        }else {
            while (templ2 != null){
                sum.add(i,templ2.val);
                i++;
                templ2 = templ2.next;
            }
            i=0;
            while (templ1 != null){
                sum.set(i,sum.get(i)+templ1.val);
                i++;
                templ1 = templ1.next;
            }
        }

        for (int j=0;j<sum.size();){
            if (sum.get(j)>=10){
                node.val = sum.get(j)%10;
                if (j != sum.size()-1){
                    sum.set(j+1,sum.get(j+1)+1);
                }else {
                    sum.add(1);
                }
            }else {
                node.val = sum.get(j);
            }
            ++j;
            if (j<sum.size()){
                node.next = new ListNode(0);
                node = node.next;
            }
        }
        return temp;
    }
}
