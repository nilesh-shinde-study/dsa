package test.data_structure.linkedlist;

public class DoublyLL {
	
	private class Node{
		int val;
		Node prev;
		Node next;
		
		public Node(int element) {
			this.val=element;
		}
	}
	
	Node currNode;
	
	public static void main(String[] args) {
		DoublyLL doublyLL = new DoublyLL();
		
		
	}
	
	private void addNode(int element) {
		Node node = new Node(element);
		if(currNode==null)
			currNode=node;
		else {
			Node newNode = currNode;
			while(newNode.next!=null)
				newNode = newNode.next;
			newNode.next = node;
		}
	}

}
