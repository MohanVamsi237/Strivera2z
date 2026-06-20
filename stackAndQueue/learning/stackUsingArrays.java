package stackAndQueue.learning;

class ArrayStack {
    private final int[] arr;
    private int top;

    public ArrayStack() {
        arr = new int[100];
        top = -1;
    }

    public void push(int x) {
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return arr[top--];
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}