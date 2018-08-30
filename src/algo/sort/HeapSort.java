package algo.sort;

import utils.ArrayUtils;

/**
* @author khaitq on 28 août 2018
*/

/*
 * Build a Heap structure then Sort
 */
public class HeapSort {

	public static void main(String[] args) {

		int arr[] =  {4, 10, 3 , 5 , 1};
		
		ArrayUtils.printArray(arr);
		
		heapify(arr, 0);
		
		heapSort(arr);
		
		ArrayUtils.printArray(arr);
		
	}
	
	/*
	 * Sort an max heap array
	 */
	public static int[] heapSort(int [] arr) {
		
		return arr;
	}
	
	
	/*
	 * Heapify to build a max heap tree from an array
	 * Arrange an array in heap tree structure : a node'value is greater than its left and right nodes
	 */
	public static void heapify(int arr[], int root) {
		
		int l = 2 * root + 1;
		int r = 2 * root + 2;
		
		if (l <= arr.length - 1 && arr[root] < arr[l] ) {
			swap(arr, root, l);
		}
		
		if (r <= arr.length - 1 && arr[root] < arr[r] ) {
			swap(arr, root, r);
		}
		
		if (l <= arr.length - 1) {
			heapify(arr, l);
		}
		
		if (r <= arr.length - 1) {
			heapify(arr, r);
		}
		
		return;
	}
	
	private static void swap(int []arr, int i, int j) {
		int tem = arr[i];
		arr[i] = arr[j];
		arr[j] = tem; 
	}

}


