package test.data_structure.linkedlist;

public class Node {
	
	int value;
//	Node prev;
	Node next;
	
	public Node(int element) {
		this.value = element;
	}
	
	@Override
	public String toString() {
		return "Node: [value-"+value+", next-"+next+"]";
	}

}
