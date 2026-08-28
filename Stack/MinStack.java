/**
 * 155. Min Stack
 * Difficulty: Medium | Tags: Stack, Design
 * https://leetcode.com/problems/min-stack/
 *
 * Pattern: Auxiliary Stack
 * Key insight: Maintain a second stack to store minimums, pushing a value onto it only if it's less than or equal to the current minimum, and popping from it when the main stack's popped element is the current minimum.
 *
 * Time Complexity: O(1) - All stack operations are constant time.
 * Space Complexity: O(N) - Two stacks store up to N elements.
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class MinStack {
    Stack<Integer> input;
    Stack<Integer> min;

    public MinStack() {
        this.input = new Stack<>();
        this.min = new Stack<>();
    }

    public void push(int value) {
        input.push(value);
        if (min.isEmpty() || min.peek() >= value) {
            min.push(value);
        }
    }

    public void pop() {
        if (input.peek().equals(min.peek())) {
            min.pop();
        }
        input.pop();
    }

    public int top() {
        return input.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
