package test.data_structure.queue;

public class Queue {
	
	public static void main(String args[]) {
		Queue queue = new Queue(); 
		queue.enQueue(4); 
        System.out.println("Queue Elements: "+ queue.toString());; 
        System.out.println("DeQueue: "+ queue.deQueue());; 
        queue.enQueue(5);
        queue.enQueue(6); 
        queue.enQueue(7); 
        System.out.println("Queue Elements: "+ queue.toString());; 
        System.out.println("DeQueue: "+ queue.deQueue());; 
        System.out.println("DeQueue: "+ queue.deQueue());; 
        queue.enQueue(15); 
        System.out.println("Queue Elements: "+ queue.toString());; 
        System.out.println("DeQueue: "+ queue.deQueue());; 
        queue.enQueue(8); 
        queue.enQueue(9); 
        queue.enQueue(10); 
        queue.enQueue(45); 
        System.out.println("Queue Elements: "+ queue.toString());; 

	}
	
    private int[] A; 
    private int size, front, rear; 
    private static final int CAPACITY = 8; 
 
    public Queue (){ 
        A = new int [CAPACITY]; 
        size  = 0; front = 0; rear  = 0;   
    } 
 
    public Queue (int cap){ 
        A = new int [ cap]; 
        size  = 0; front = 0; rear  = 0; 
    } 
 
    public void enQueue (int data) {   
        if (size == CAPACITY) 
            throw new IllegalStateException ("Queue is full: Overflow"); 
        else { 
            size++; 
            A[rear] = data; 
            rear = (rear+1) % CAPACITY; 
        } 
    } 
 
    public int deQueue () throws IllegalStateException{ 
        if (size == 0) 
            throw new IllegalStateException ("Queue is empty: Underflow"); 
        else { 
            size--; 
            int data = A [(front%CAPACITY)]; 
            A [front] = Integer.MIN_VALUE; 
            front = (front+1) % CAPACITY; 
            return data; 
        } 
    } 
    
    public boolean isEmpty(){  
        return (size == 0);  
    } 
 
    public boolean isFull(){  
        return (size == CAPACITY);  
    } 
 
    public int size() { 
        return size; 
    } 
 
    public String toString(){ 
        String result = "["; 
        for (int i = 0; i < size; i++){ 
            result += Integer.toString(A[(front+i) % CAPACITY]); 
            if (i < (size-1))  
                result += ", "; 
            
        }
        result += "]"; 
        return result; 
    } 


}
