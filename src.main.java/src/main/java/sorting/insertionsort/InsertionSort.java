package src.main.java.sorting.insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6};
	    insertionSort(arr);
	    
	    printArray(arr);
	}
	
	/**
	 * @param arr
	 */
	private static void insertionSort(int[] arr) {
		int i, j;
		for(i=1; i<arr.length;i++) {
			int key = arr[i];
			j= i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
