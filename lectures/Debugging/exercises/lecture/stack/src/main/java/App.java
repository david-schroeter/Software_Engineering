import java.util.*;

/**
 * Exercise: Add code to IntStack to catch bugs early and fix any bugs you find.
 *           Keep in mind that users of IntStack must be able to check any preconditions themselves.
 *           Add any public or private methods you need.
 */
public class App {
    /** A stack of integers, with a maximum size. */
    static final class IntStack {
        private int top;
        private final int[] values;

        /** Creates an empty stack with the given max size; it is forbidden to push more items than that. */
        public IntStack(int maxSize) {
            if (maxSize < 0)
                throw new IllegalArgumentException("The max size should be greater thatn 0");
            top = -1;
            values = new int[maxSize];
        }

        /** Returns and pops the top of the stack, or returns null if the stack is empty. */
        public Integer pop() {
            Integer value = top >= 0 ? values[top] : null;
            top--;
            return value;
        }

        /** Pushes the given value on the stack. */
        public void push(int value) {
            top++;
            if (top >= values.length)
                throw new UnsupportedOperationException("Cannot push more than the max size of the stack");
            values[top] = value;
        }
    }

    public static void main(String[] args) {
        useStack(new IntStack(4));
    }

    // IntStack usage example
    private static void useStack(IntStack stack) {
        Objects.requireNonNull(stack, "The stack cannot be null");

        stack.push(1);
        stack.pop();
        stack.pop();
    }
}
