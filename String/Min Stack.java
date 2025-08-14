import java.util.*;

class MinStack {
    private Stack<int[]> stack; // each int[] = {value, minSoFar}

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new int[]{val, val});
        } else {
            int currMin = stack.peek()[1];
            stack.push(new int[]{val, Math.min(val, currMin)});
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0]; // value
    }

    public int getMin() {
        return stack.peek()[1]; // min so far
    }

}
