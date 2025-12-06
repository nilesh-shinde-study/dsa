package test.data_structure.linkedlist;

import java.util.Arrays;

public class LinkedlistTest {
	
	private Node first;
	private Integer nodeCount=0;
	
	public static void main(String[] args) {
		LinkedlistTest linkedList = new LinkedlistTest();
		
		linkedList.addNode(4);
		linkedList.addNode(55);
		linkedList.addNode(9);
		linkedList.addNode(998);
		linkedList.addFirst(77);
		linkedList.addFirst(90);
		linkedList.addNode(98);
		
		System.out.println("Index of 998: "+linkedList.getIndexOf(998));
		System.out.println("Index of 500: "+linkedList.getIndexOf(500));
		System.out.println("Total Nodes "+linkedList.getNodeCount());
		
		linkedList.showLL(linkedList.first);
		
		System.out.println("Contains 50 "+linkedList.contains(50));
		System.out.println("Contains 77 "+linkedList.contains(77));

		System.out.println("Remove first : "+linkedList.removeFirst());
		linkedList.showLL(linkedList.first);
		System.out.println("Total Nodes "+linkedList.getNodeCount());
		
		System.out.println("Remove last: "+linkedList.removeLast());
		linkedList.showLL(linkedList.first);

		System.out.println("Total Nodes "+linkedList.getNodeCount());
		System.out.println("LinkedList to Array: "+Arrays.toString(linkedList.linkedListToArray()));
		
		System.out.println("Element at index 1: "+linkedList.getNodeByIndex(1));
		linkedList.showLL(linkedList.reverseLinkedList());
		linkedList.showLL(linkedList.first);
		
	}
	
	public void addNode(int element) {
		Node node1 = new Node(element);
		if(first==null) 
			first=node1;
		else {
            Node current = first;
            while (current.next != null) {
                current = current.next; 
            }
            current.next = node1; 
        }
		nodeCount++;
	}
	
	public void addFirst(int element) {
		Node node = new Node(element);
		if(first==null)
			first=node;
		else {
			node.next=first;
			first=node;
		}	
		nodeCount++;
	}
	
	public Integer getIndexOf(Integer element) {
		Integer index=1;
		Boolean isExist=false;
		Node node = first;
		if(node==null)
			return -1;
		else {
			while(node!=null) {
				if(node.value==element)
					isExist=true;
				else index++;
				node=node.next;
			}
		}
		return isExist? index: -1;
	}
	
	public Integer getNodeCount() {
		Integer nodes = nodeCount == 0? -1: nodeCount;
		return nodes;
	}
	
	public Boolean contains(Integer element) {
		Node node = first;
		while(node!=null) {
			if(node.value==element)
				return true;
			else node=node.next;
		}
		return false;
	}
	
	public Integer removeFirst() {
		Integer element = 0;
		if(first==null)
			return -1;
		else {
			element=first.value;
			first=first.next;
		}
		nodeCount--;
		return element;
	}
	
	public Integer removeLast() {
		if(first==null)
			return -1;
		else {
			Integer prevIndex = getIndexOf(getLast()) - 1;
			Integer index=1;
			Node node = first;
			while(node!=null) {
				if(index==prevIndex) {
					node.next=null;
					nodeCount--;
					return node.value;
				}
				node=node.next;
				index++;	
			}
		}
		nodeCount--;
		return 0;
	}
	
	public Integer getFirst() {
		if(first==null)
			return -1;
		else return first.value;
	}
	
	public Integer getLast() {
		if(first==null)
			return -1;
		else {
			Node node = first;
			while(node.next!=null) 
				node=node.next;
			return node.value;
		}
	}
	
	private void showLL(Node node) {
//		Node node = first;
		while(node!=null) {
			System.out.print(" "+node.value);
			node=node.next;
		}
		System.out.println();
	}
	
	public int[] linkedListToArray() {
		int[] elements = new int[nodeCount];
		int count=0;
		Node node = first;
		while(node!=null) {
			elements[count]=node.value;
			node=node.next;
			count++;
		}
		return elements;
	}
	
	public Node reverseLinkedList() {
		int nodeIndex=nodeCount;
		LinkedlistTest ll=new LinkedlistTest();
		while(nodeIndex>0) {
			ll.addNode(getNodeByIndex(nodeIndex));
			nodeIndex--;
		}
		return ll.first;
	}
	
	public Integer getNodeByIndex(int index) {
		Node node = first;
		Integer element=0;
		Integer counter=1;
		while(node!=null) {
			if(counter==index) {
				element=node.value;
				break;
			}
			node=node.next;
			counter++;
		}
		return element;
	}
	
}
