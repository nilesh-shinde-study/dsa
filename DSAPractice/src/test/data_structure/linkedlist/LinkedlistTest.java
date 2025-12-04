package test.data_structure.linkedlist;

public class LinkedlistTest {
	
	private static Node node;
	
	public static void main(String[] args) {
		LinkedlistTest linkedList = new LinkedlistTest();
		
		linkedList.addNode(4);
		linkedList.addNode(55);
		linkedList.addNode(9);
		linkedList.addNode(998);
		
		while(node!=null) {
			System.out.println("Current data: "+node.value);
			node=node.next;
		}
	}
	
	public void addNode(int element) {
		Node node1 = new Node(element);
		if(node==null) 
			node=node1;
		else {
            Node current = node;
            while (current.next != null) {
                current = current.next; 
            }
            current.next = node1; 
        }
	}
}
