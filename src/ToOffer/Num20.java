package ToOffer;

import java.util.Stack;

/**
 * @author bibingwei
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class Num20 {
    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        if (minStack.empty()) {
            minStack.push(node);
        } else if (node <= min()) {
            minStack.push(node);
        }
        dataStack.push(node);
    }

    public void pop() {
        int value = dataStack.pop();
        if (value == min()) {
            minStack.pop();
        }
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
