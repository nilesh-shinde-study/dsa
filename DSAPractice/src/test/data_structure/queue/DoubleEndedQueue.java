package test.data_structure.queue;

public class DoubleEndedQueue {
    private static class Node {
        int val;
        Node prev;
        Node next;
        Node(int v) { val = v; }
    }

    private Node head; // front
    private Node tail; // back
    private int size;

    public DoubleEndedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(int item) {
        Node node = new Node(item);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void addLast(int item) {
        Node node = new Node(item);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public Integer removeFirst() {
        if (head == null) return null;
        int val = head.val;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;
        size--;
        return Integer.valueOf(val);
    }

    public Integer removeLast() {
        if (tail == null) return null;
        int val = tail.val;
        tail = tail.prev;
        if (tail != null) tail.next = null;
        else head = null;
        size--;
        return Integer.valueOf(val);
    }

    public Integer peekFirst() {
        return head == null ? null : Integer.valueOf(head.val);
    }

    public Integer peekLast() {
        return tail == null ? null : Integer.valueOf(tail.val);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deque[");
        Node cur = head;
        while (cur != null) {
            sb.append(cur.val);
            if (cur.next != null) sb.append(", ");
            cur = cur.next;
        }
        sb.append("]");
        return sb.toString();
    }

    // Demo
    public static void main(String[] args) {
    	DoubleEndedQueue dq = new DoubleEndedQueue();
        System.out.println("AddFirst 2, AddLast 3, AddFirst 1");
        dq.addFirst(2);
        dq.addLast(3);
        dq.addFirst(1);
        System.out.println(dq); // Deque[1, 2, 3]
        System.out.println("peekFirst=" + dq.peekFirst() + ", peekLast=" + dq.peekLast());
        System.out.println("removeFirst=" + dq.removeFirst()); // 1
        System.out.println("removeLast=" + dq.removeLast());   // 3
        System.out.println("After removes: " + dq);            // Deque[2]
        System.out.println("size=" + dq.size());
    }
}