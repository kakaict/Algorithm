package algo.sort;

import utils.ArrayUtils;

/*
 *  From  i= 1 -> n, insert a[i] to sorted array before i.
 *  a sorted array : a [0 ->i]
 */


public class InsertionSort {
	
	
	public static void main(String[] args) {

		int[] arr  =  { 12, 11, 13, 5, 6 };
		
		ArrayUtils.printArray((arr));
		sort(arr);
	}
	
	
	// 12, 11, 13, 5, 6
	public static int[] sort(int [] arr) {
		
		for (int i = 1; i < arr.length ; i++) {
			
			int valueToInsert = arr[i];
			
			for (int j = i-1; j >= 0; j--) {
				
				if (valueToInsert < arr[j] ) {
					
					int temp 	= arr[j];
					arr[j] 		= valueToInsert;
					arr[j+1] 	= temp;
				}
			}
			ArrayUtils.printArray((arr));
		}
		return arr;
	}
	

}
