package LeetCode;

import java.util.Stack;

public class Num155 {private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    /** initialize your data structure here. */
//    public MinStack() {
//    }

    public void push(int x) {
        //如果压入栈顶的元素比最小值小，那么最小值栈压入当前值，否则压入最小值栈顶元素。
        if (minStack.isEmpty() || x <= minStack.peek())
            minStack.push(x);
        else
            minStack.push(minStack.peek());
        stack.push(x);
    }

    public void pop() {
        //同时删除最小值栈顶元素
        minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();

    }
}
