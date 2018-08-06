package src.main.java.sorting.bubblesort;

/**
 * @Desc Swap elements until they appear in a correct order
 * @author amit
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] bubbleSortArr = {5,1,4,2,8};
		sort(bubbleSortArr);
		printArray(bubbleSortArr);
	}

	private static void  sort(int[] bubbleSortArr) {
		for(int i = 0; i<bubbleSortArr.length-1; i++) {
			boolean isSwapped=false;
			for(int j=0; j<bubbleSortArr.length-i-1;j++) {
				if(bubbleSortArr[j]>bubbleSortArr[j+1]) {
					int temp = bubbleSortArr[j];
					bubbleSortArr[j] = bubbleSortArr[j+1];
					bubbleSortArr[j+1]=temp;
					isSwapped=true;
				}
			}
			if(!isSwapped) break;
		}
	}
	
	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
