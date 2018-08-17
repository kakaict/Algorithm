package algo.sort;


/**
*
* @author khaitq on 17 août 2018
* 
*  MergeSort(arr[], l,  r)
   If r > l
     1. Find the middle point to divide the array into two halves:  
             middle m = (l+r)/2
     2. Call mergeSort for first half:   
             Call mergeSort(arr, l, m)
     3. Call mergeSort for second half:
             Call mergeSort(arr, m+1, r)
     4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, l, m, r)
*/

public class MergeSort {

	public static void main(String[] args) {

		int[] arr  =  { 12, 11, 13, 5, 6 };
		
		ArrayUtils.printArray(arr);
		
		
		ArrayUtils.printArray(sort(arr, 0, arr.length - 1));
		
	}
	
	public static int[] sort(int [] arr, int l, int r) {
		
		if (l < r) {
			
			int m = (l+r)/2;

			sort(arr, l, m);
			
			sort(arr, m +1, r);
			
			merge(arr, l, r, m);
		}
		
		return arr;
	}
	
	//12, 11, 13, 5, 6 //
	
	public static int [] merge(int [] arr, int l, int r, int m) {
		
		int N1 = m - l + 1;
		int N2 = r - m;
		int [] a1 = new int[N1];
		
		int [] a2 = new int[N2];
		
		for (int i = 0 ; i < N1; i ++) {
			a1[i] = arr[l + i];
		}
		
		for (int i = 0 ; i < N2; i ++) {
			a2[i] = arr[m + 1 + i];
		}
		
		int i = 0;
		
		int j = 0;
		
		int k = l;
		
		while (i < N1 && j  < N2) {
			if (a1[i] >= a2[j]) {
				
				arr[k] = a2[j];
				j++;
				
			} else {
				arr[k] = a1[i];
				i++;
			}
			k++;
		}
		
		while (i < N1) {
			arr[k] = a1[i];
			i++;
			k++;
		}
		
		while (j < N2) {
			arr[k] = a2[j];
			j++;
			k++;
		}
		return arr;
	}

}


