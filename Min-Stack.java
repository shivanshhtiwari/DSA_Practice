import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    // Constructor
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element onto the stack
    public void push(int val) {
        stack.push(val);
        // Push to minStack only if it's the new min
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    // Pop element from the stack
    public void pop() {
        int removed = stack.pop();
        // If popped element is current minimum, pop from minStack as well
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    // Return top element
    public int top() {
        return stack.peek();
    }

    // Return current minimum
    public int getMin() {
        return minStack.peek();
    }
}
