package LeetCode;

import java.util.Stack;

public class Num232 {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack1 = new Stack<>();

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int temp;
        while (!stack.empty()){
            stack1.push(stack.pop());
        }
        temp = stack1.pop();
        while (!stack1.empty()){
            stack.push(stack1.pop());
        }
        return temp;
    }

    /** Get the front element. */
    public int peek() {
        int temp;
        while (!stack.empty()){
            stack1.push(stack.pop());
        }
        temp = stack1.peek();
        while (!stack1.empty()){
            stack.push(stack1.pop());
        }
        return temp;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.empty();
    }
}
