package stackAndQueue.learning;

class ArrayQueue {
    private final int[] A;
    private int front;
    private int rear;

    public ArrayQueue() {
        A = new int[100];
        front = 0;
        rear = -1;
    }

    public void push(int x) {
        A[++rear] = x;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return A[front++];
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return A[front];
    }

    public boolean isEmpty() {
        return front > rear;
    }
}