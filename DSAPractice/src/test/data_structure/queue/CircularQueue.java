package test.data_structure.queue;

public class CircularQueue {
    private final int[] data;
    private int head;       // index to dequeue from
    private int tail;       // index to enqueue into
    private int size;       // current number of elements
    private final int capacity;

    public CircularQueue(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be > 0");
        this.capacity = capacity;
        this.data = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public boolean enqueue(int item) {
        if (isFull()) return false;
        data[tail] = item;
        tail = (tail + 1) % capacity;
        size++;
        return true;
    }

    public int dequeue() {
        if (isEmpty()) return -1;
        int item = data[head];
        data[head] = -1; 
        head = (head + 1) % capacity;
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) return -1;
        return data[head];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CircularQueue[");
        for (int i = 0; i < size; i++) {
            int idx = (head + i) % capacity;
            sb.append(data[idx]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    // Small demo
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        System.out.println("Enqueue 1..5");
        for (int i = 1; i <= 5; i++) {
            boolean ok = q.enqueue(i);
            System.out.println("enqueue(" + i + ") -> " + ok + " ; " + q);
        }

        System.out.println("Attempt enqueue 6 (should fail - full): " + q.enqueue(6));
        System.out.println("Dequeue two elements:");
        System.out.println("dequeue() -> " + q.dequeue() + " ; " + q);
        System.out.println("dequeue() -> " + q.dequeue() + " ; " + q);

        System.out.println("Enqueue 6 and 7 to demonstrate wrap-around:");
        System.out.println("enqueue(6) -> " + q.enqueue(6) + " ; " + q);
        System.out.println("enqueue(7) -> " + q.enqueue(7) + " ; " + q);

        System.out.println("Final queue: " + q);
        System.out.println("Dequeue all:");
        while (!q.isEmpty()) {
            System.out.println("dequeue() -> " + q.dequeue() + " ; " + q);
        }
    }
}