package test.data_structure.queue;

public class QueueOperations {

	public static void main(String args[]) {
		
		QueueOperations queue = new QueueOperations();
		queue.enQueue(9);
		System.out.println("size of queue: "+queue.sizeOfQueue());
		queue.enQueue(7);
		System.out.println("size of queue: "+queue.sizeOfQueue());
		System.out.println("deQueue: "+queue.deQueue());
		System.out.println("size of queue: "+queue.sizeOfQueue());
		queue.enQueue(3);
		queue.enQueue(44);
		queue.enQueue(22);
		System.out.println("size of queue: "+queue.sizeOfQueue());
		
		System.out.println("Queue elements : ");
		for(int i=0;i<queue.A.length;i++) {
			if(queue.A[i]!=0 && queue.A[i]!=-1)
				System.out.print(" "+queue.A[i]);
		}
	}
	
	int A[];
	int front, rear, size;
	int capacity=10;
	
	public QueueOperations() {
		A=new int[capacity];
		front=0;
		rear=0;
		size=0;
	}
	
	public QueueOperations(int capacity) {
		front=0;
		rear=0;
		size=0;
		A=new int[capacity];
	}
	
	// insert elements in queue
	private void enQueue(int element) {
		if(size==capacity)
			System.out.println("Queue is full");
		else {
			A[rear]=element;
			rear=(rear+1)%capacity;
			size++;
		}
	}
	
	private int deQueue() {
		if(size==0)
			System.out.println("Queue is empty");
		else {
			size--;
			int element=A[(front+1)%capacity];
			A[front]=-1;
			front=(front+1)%capacity;
			return element;
		}
		return 0;
	}
	
	private int sizeOfQueue() {
		return size;
	}
	
	private boolean isFull() {
		return size==capacity;
	}
	
	private boolean isEmpty() {
		return size==0;
	}
	
	//test change
	
}
