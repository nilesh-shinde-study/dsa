package test.algorithms.sorting;

public class BubbleSort {
	
	static int arr[] = {10,4,2,44,56,1,57,8,9,0,33};
	
	public static void main(String[] args) {
//		int temp=0;
		int i=0;
		while(i<arr.length) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}				
			}
			i++;
		}
		for(int ele: arr)
			System.out.print(ele+" ");
	}

}
