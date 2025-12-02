package test.data_structure.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class QueuePredefined {
	public static void main(String[] args) {
		Deque<Integer> queue = new ArrayDeque<Integer>();
		queue.add(11);
		queue.add(12);
		queue.add(133);
		queue.add(14);
		queue.add(15);

		System.out.println("Queue sizze : "+queue.size());
		while(queue.size()>0)
			System.out.print(queue.pop()+" ");
		System.out.println("Queue sizze : "+queue.size());

		queue.add(555);
		queue.add(585);
		queue.add(505);
		queue.add(565);
		queue.add(555);
		queue.addFirst(999);
		queue.addLast(777);
		System.out.println("\nAdding --- ");
		System.out.println("Queue sizze : "+queue.size());
//		for(int i=0;i<queue.size();i++)	// why this loop executed 4 times only when there are 7 elements in a queue
//			System.out.print(queue.pop()+" - ");
		while(queue.size()>0)
			System.out.print(queue.pop()+" ");
		
		System.out.println("\n555 exist in queue? "+queue.contains(999)); // pop is emptying the queue so here element not found... comment pop and this will work
		
		System.out.println("Queue sizze : "+queue.size() +"\n");
		queue.add(5505);
		queue.add(5858);
		queue.add(5056);
		queue.add(5655);
		queue.add(5553);
		queue.addFirst(3999);
		queue.addLast(3777);
		Iterator<Integer> iterator = queue.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next()+" ");
		
	}
}
