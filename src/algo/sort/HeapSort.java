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

		int arr[] =  {4, 10, 3 , 5 , 1, 90};
		
		ArrayUtils.printArray(arr);
		
		
		heapSort(arr);
		
		ArrayUtils.printArray(arr);
		
	}
	
	/*
	 * Sort an max heap array
	 */
	public static int[] heapSort(int [] arr) {
		
		int n = arr.length ;
		
		/*
		 * Build heap array
		 */
		for (int i = arr.length/2 - 1; i >= 0; i--) {
            heapifyV2(arr, i, arr.length);
		}
		
		ArrayUtils.printArray(arr);
		
		for (int i = 0; i < arr.length; i ++) {
			
			System.out.println("arrange : ");
			
			heapify(arr, 0, n);

			swap(arr, 0, n-1);
			
			n--;
			
			ArrayUtils.printArray(arr);

		}
		
		return arr;
	}
	
	
	public static void heapify(int arr[], int root, int n) {
		
		int l = 2 * root + 1;
		int r = 2 * root + 2;
		
		if (l <= n - 1 && arr[root] < arr[l] ) {
			swap(arr, root, l);
		}
		
		if (r <= n - 1 && arr[root] < arr[r] ) {
			swap(arr, root, r);
		}
		
		if (l <= n - 1) {
			heapify(arr, l, n);
		}
		
		if (r <= n - 1) {
			heapify(arr, r, n);
		}
		
		return;
	}
	
	public static void heapifyV2(int arr[],  int i , int n){
	    int max = i;  
	    int l = 2*i + 1; 
	    int r = 2*i + 2;
	 
	    if (l < n && arr[l] > arr[max])
	    		max = l;
	 
	    if (r < n && arr[r] > arr[max])
	    		max = r;
	 
	    if (max != i)
	    {
	        swap(arr,i, max);
	        heapifyV2(arr, max, n);
	    }
	}

	
	private static void swap(int []arr, int i, int j) {
		int tem = arr[i];
		arr[i] = arr[j];
		arr[j] = tem; 
	}

}


