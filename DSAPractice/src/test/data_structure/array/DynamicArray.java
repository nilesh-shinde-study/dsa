package test.data_structure.array;

import java.util.ArrayList;

public class DynamicArray {
	
	public static void main(String args[]) {
		
//		Comparing Array and ArrayList
		//Array
		int array[] = new int[] {11,11,2,3,4};
		for(int i=0;i<array.length;i++) 
			System.out.println("Array : "+array[i]);
				
//		ArrayList
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(11);
		arrList.add(11);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		System.out.println("Arraylist : "+arrList);
		
		//Adding element at perticular index
		array[3]=777;
		System.out.println("Array[3]: "+array[3]);
		arrList.add(3, 777);
		System.out.println("Arraylist[3] : "+arrList.get(3));
		
		// Restriction of array - can only store element upto given size
		// ArrayList is dynamic and can store as many elements as we want
//		array[5]=888; // AIOOBE
//		array[6]=999; // AIOOBE
		arrList.add(888);
		arrList.add(999);

		System.out.println("Arraylist : "+arrList);
		
		// Adding predefined array in other array
		int array2[] = new int[array.length];
		System.out.print("Array2 : ");
		for(int i=0;i<array.length;i++) {
			array2[i]=array[i];
			System.out.print(array2[i]+" ");
		}
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>(arrList);		
		System.out.println("ArrayList2 : "+arrayList2);
		
		// searching by element (Search if element 11,300 present or not	
		boolean isPresent=false;
		for(int i=0;i<array.length;i++)
			if(array[i]==11) //300
				isPresent=true;
			System.out.println("Element 1 present in array? "+isPresent);
		
		System.out.println("Element 1 present in arraylist? "+arrayList2.contains(11));//300
		
		
		// get index of element
		int index = -1;
		for(int i=0;i<array.length;i++) 
			if(array[i]==11)
				index=i;
		System.out.println("Element 1 present at index: "+index);// returns index of last element if duplicates found
		System.out.println("Element 1 present at index: "+arrList.indexOf(11));// returns index of first element if duplicates found
		System.out.println("Element 1 present at index: "+arrList.lastIndexOf(11));// returns index of last element if duplicates found
		
		// Remove element from 2nd index
		// We cannot reduce the space of array physically from the memory but we can do it logically
		for(int i=2;i<array.length-1;i++) 
			array[i]=array[i+1];
		for(int i=0;i<array.length-1;i++) 
			System.out.println("Array : "+array[i]); // we logically ignore last position but can't physically shrink array size
		
		arrList.remove(2);
		System.out.println("Arraylist: "+arrList);// returns index of first element if duplicates found
		
		
		//update element by index
		array[1]=339;
		System.out.println("Array[1]: "+array[1]);
		arrList.set(1, 339);
		System.out.println("ArrayList[1]: "+arrList.get(1));
		
		
		
	}
	
}
