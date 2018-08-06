package src.main.java.sorting.selectionsort;

/**
 * @Desc The selection sort algorithm sorts an array by repeatedly finding element with min value
 *  and keep it at first place. It maintains 2 array. 
 * @author amit
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] selectionSortArr = {5,1,4,2,8};
		selectionSort(selectionSortArr);
		printArray(selectionSortArr);
	}

	/**
	 * @param arr
	 */
	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}

	/**
	 * @param arr
	 */
	private static void selectionSort(int[] arr) {

		for(int outerIndex = 0; outerIndex < arr.length-1; outerIndex++) {
			int minIndex = outerIndex;
			for(int innerIndex = outerIndex+1; innerIndex < arr.length; innerIndex++) {
				if(arr[innerIndex] < arr[minIndex]) {
					minIndex = innerIndex;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[outerIndex];
			arr[outerIndex] = temp;
		}
	}
	
}
