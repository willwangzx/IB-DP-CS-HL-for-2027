/**
 * 基于数组的简单队列实现（循环队列）。
 */
class Queue {
    private final int[] data;
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    Queue(int capacity) {
        this.data = new int[capacity];
    }

    public void enqueue(int value) {
        if (size == data.length) {
            throw new IllegalStateException("Queue is full");
        }
        data[tail] = value;
        tail = (tail + 1) % data.length;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int frontValue = data[head];
        head = (head + 1) % data.length;
        size--;
        return frontValue;
    }

    public int front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return data[head];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class myqueue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.front());   // 10
        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.front());   // 20
    }
}
