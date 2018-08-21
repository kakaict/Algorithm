package algo.search;

import algo.sort.MergeSort;

public class JumpSearch {

	public static void main(String[] args) {
		
		int arr[] = { 0,  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };
		int v = 55;
		
		System.out.println(jumpSearch(v, arr));
	}

	private static int jumpSearch(int v, int[] arr) {

		int result = -1;
		
		MergeSort.sort(arr, 0, arr.length - 1);
		
		// => worst case  n/m steps => T =  (m-1) + N/m comparisons
		// => T min => m + 1 + N/m min => 1 - N/m2 = 0 => N = m2 => m= sqrt(N)
		
		int m = (int) Math.sqrt(arr.length);
		
		int i = 0;
		while (arr[i] < v ) {
			i = i+m;
			if (i >= arr.length - 1)
				i = arr.length -1;
		}
		
		for (int j = i-m; j <= i; j++) {
			if (arr[j] == v) {
				result =  j;
				break;
			}
		}

		return result;
	}

}
