package algo.sort;

import utils.ArrayUtils;

/**
*
* @author khaitq on 25 août 2018
*/

public class QuickSort {

	public static void main(String[] args) {

		int[] arr  =  { 1, 12, 5, 26, 9,  14, 3, 7, 2 };
		
		ArrayUtils.printArray(arr);
		
		quickSort(arr, 0,  arr.length-1);
		
		ArrayUtils.printArray(arr);
		
	}
	
	public static void quickSort(int arr[], int i, int j) {
		
		if (i == j)
			return;
		
		int p = arr[(i+j)/2];
		
		System.out.println("pivot : " + p);
		
		int x = i; 
		int y = j;
		
		while (x <= y) {
			
			if (arr[x] >= p && p >= arr[y]) {
				swap(arr, x, y);
				x++;
				y--;
			}
			
			else if (arr[x] < p) {
				x ++;
			}
			
			else if (arr[y] > p) {
				y --;
			}
		}
		
		ArrayUtils.printArray(arr);

		if (x < j) 
			quickSort(arr, x, j);
		if (x > i)
			quickSort(arr, i, y);
		
	}
	
	public static void swap(int [] arr,int x, int y) {
		int t = arr[x];
		arr[x] = arr[y];
		arr[y] = t;
	}

}


