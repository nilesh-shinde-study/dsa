package test.data_structure.queue;

public class PriorityQueue {
    private int[] heap;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public PriorityQueue() {
        this.heap = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public PriorityQueue(int initialCapacity) {
        if (initialCapacity <= 0) initialCapacity = DEFAULT_CAPACITY;
        this.heap = new int[initialCapacity];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public boolean offer(int value) {
        ensureCapacity(size + 1);
        heap[size] = value;
        heapifyUp(size);
        size++;
        return true;
    }

    public Integer peek() {
        if (size == 0) return null;
        return Integer.valueOf(heap[0]);
    }

    public Integer poll() {
        if (size == 0) return null;
        int result = heap[0];
        heap[0] = heap[size - 1];
        size--;
        if (size > 0) heapifyDown(0);
        return Integer.valueOf(result);
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity <= heap.length) return;
        int newCap = heap.length * 2;
        if (newCap < minCapacity) newCap = minCapacity;
        int[] newArr = new int[newCap];
        System.arraycopy(heap, 0, newArr, 0, size);
        heap = newArr;
    }

    private void heapifyUp(int idx) {
        int cur = heap[idx];
        while (idx > 0) {
            int parent = (idx - 1) >>> 1;
            if (cur >= heap[parent]) break;
            heap[idx] = heap[parent];
            idx = parent;
        }
        heap[idx] = cur;
    }

    private void heapifyDown(int idx) {
        int cur = heap[idx];
        int half = size >>> 1; // nodes with children
        while (idx < half) {
            int left = (idx << 1) + 1;
            int right = left + 1;
            int smaller = left;
            int smallerVal = heap[left];
            if (right < size && heap[right] < smallerVal) {
                smaller = right;
                smallerVal = heap[right];
            }
            if (cur <= smallerVal) break;
            heap[idx] = heap[smaller];
            idx = smaller;
        }
        heap[idx] = cur;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PriorityQueueSimple[");
        for (int i = 0; i < size; i++) {
            sb.append(heap[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    // Demo
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        int[] nums = {5, 1, 3, 2, 8, 0, 4};
        System.out.println("Offering numbers:");
        for (int n : nums) {
            pq.offer(n);
            System.out.println("offer(" + n + ") -> " + pq);
        }

        System.out.println("Polling all elements (ascending order):");
        while (!pq.isEmpty()) {
            System.out.println("poll() -> " + pq.poll() + " ; remaining: " + pq);
        }
    }
}