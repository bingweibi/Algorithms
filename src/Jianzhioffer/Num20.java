package Jianzhioffer;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * @author bibingwei
 */
public class Num20 {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public void push(int node) {

        if (stack2.empty()){
            stack2.push(node);
        } else if (node <= min()){
            stack2.push(node);
        }
        stack1.push(node);
    }

    public void pop() {
        int value = stack1.pop();
        if (value == min()) {
            stack2.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
