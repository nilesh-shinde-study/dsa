package test.data_structure.array;

public class ArrayOperations {
	
	public static void main(String[] args) {
		Array array = new Array(5);
		array.insertElement(44);
		array.insertElement(45);
		array.insertElement(443);
		array.insertElement(42);
		array.insertElement(488);
		array.insertElement(557);
		
		array.printArray();
		System.out.println(array.removeElementByIndex(2));
		array.printArray();
		
	}

}
