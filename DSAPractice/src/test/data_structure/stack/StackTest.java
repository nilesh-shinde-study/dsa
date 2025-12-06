package test.data_structure.stack;

import java.util.Arrays;

public class StackTest {
	int size=5;
	int[] arr=new int[size];
	
	public static void main(String[] args) {
		StackTest stack = new StackTest();
		stack.push(7);
		stack.push(5);
		stack.push(4);
		stack.push(2);
		stack.push(1);
		stack.push(9);
		stack.push(99);
		stack.push(33);
		stack.push(23);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.showStack();
		System.out.println("Peek: "+stack.peek());
		System.out.println("isEmpty: "+stack.isEmpty());
		
	}
	private int push(int element) {
		if(hasSpace()) 
			add(element);
		else {
			increaseSize();
			add(element);
		}
		return element;
	}
	
	private int pop() {
		int element=0;
		if(isEmpty())
			throw new IllegalArgumentException();
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				element=arr[i];
				arr[i]=0;
				break;
			}
		}
		return element;
	}
	
	private int peek() {
		int element=0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				element=arr[i];
				break;
			}
		}
		return element;
	}
	
	private boolean isEmpty() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0)
				return false;
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	private void add(int element) {
		for(int i=0;i<arr.length;i++) 
			if(arr[i]==0) {
				arr[i]=element;	
				break;
			}
	}
	
	private boolean hasSpace() {
		int zeros=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				zeros++;
		}
		boolean hasSpace=zeros>=1 ? true : false;
		return hasSpace;
	}
	
	private void increaseSize() {
		int newArr[] = new int[arr.length+arr.length];
		for(int i=0;i<arr.length;i++)
			newArr[i]=arr[i];
		arr=newArr;
	}
	
	private void showStack() {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) 
				sb.append(arr[i]+", ");		            
		}
		sb.deleteCharAt(sb.length() - 2);
		sb.append("]");
		System.out.println(sb);
	}
}
