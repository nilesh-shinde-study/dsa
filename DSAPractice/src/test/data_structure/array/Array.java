package test.data_structure.array;

public class Array {
	
	int arr[];
	
	public Array(int size) {
		this.arr = new int[size];
	}
	
	public void insertElement(int e) {
		if(isArrayFull()) {
			int newArr[]=new int[arr.length + arr.length];
			for(int i=0;i<arr.length;i++) 
				newArr[i]=arr[i];
			newArr[arr.length]=e;
			arr = newArr;
		} else {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==0) {
					arr[i]=e;
					break;
				}				
			}
		}
	}
	
	private boolean isArrayFull() {
		int counter=0;
		for(int i=0;i<arr.length;i++) 
			if(arr[i]==0)
				counter++;
		if(counter==0)
			return true;
		else //if(counter==arr.length) 
			return false;
	}
	
	public void printArray() {
		System.out.print("Array[");
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1)
				System.out.print(arr[i]);	
			else
				System.out.print(arr[i]+", ");	
		}
		System.out.print("]\n");
	}
	
	public int removeElementByIndex(int index){
		int element=arr[index];
		if(index<arr.length) {
			for(int i=index;i<arr.length;i++) {
				if(i==arr.length-1)
					arr[i]=0;
				else 
					arr[i]=arr[i+1];
			}
			return element;
		} else {
			return -1;
		}
	}

}
