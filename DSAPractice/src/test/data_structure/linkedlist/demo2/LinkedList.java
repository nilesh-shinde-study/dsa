package test.data_structure.linkedlist.demo2;

public class LinkedList {
	
	private class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val=val;
		}
	}
	
	private Node first;
	private Node last;
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addLast(55);
		linkedList.addLast(59);
		linkedList.addFirst(870);
		linkedList.addLast(80);
		linkedList.printLinkedList();
		
	}
	
	private void addLast(int val) {
		Node node = new Node(val);
		if(first==null)
			first=last=node;
		else {
			last.next=node;
			last=node;
		}		
	}
	
	private void addFirst(int val) {
		Node node = new Node(val);
		if(first==null)
			first=last=node;
		else {
			node.next=first;
			first=node;
		}
	}
	
	private void printLinkedList() {
		do {
			System.out.print(first.val+" ");
			first=first.next;
		} while(first!=null);
	}
}
