package algo.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/*
 * Binary search : sort a value in a sorted array
 * int arr[] = {2, 3, 4, 10, 40};
 * 
 * Solution1:  rescusive function : risk of getting StackOverFlow error
 * 
 * Solution2: loop function
 * 
 * Solution2: use  java api
 */

public class BinarySearch<T> {

	
	public static void main(String args[]) {
		
		int arr[] = {2, 3, 4, 10, 40};
		int v = 40;
		
		System.out.println(binarySearchRescusive(v, arr, 0, arr.length - 1));
		
		System.out.println(binarySearchLoop(v, arr));

	}
	
	public static int binarySearchRescusive(int v, int[] arr, int l, int r) {
		
		int m =  (l+r)%2 ==0 ?  (r+l)/2 : (r+1+l)/2;
		if (v == arr[m]) {
			return m;
		} else if (v < arr[m]) {
			return binarySearchRescusive(v, arr, l, m );
		} else {
			return binarySearchRescusive(v, arr, m, r );
		}
	}
	
	public static int binarySearchLoop(int v, int [] arr) {
		
		int l = 0;
		int r = arr.length - 1;
		
		int m = r%2 ==0 ?  r/2 : (r+1)/2;
		
		while (m  >= 0) {
			
			if (v == arr[m]) {
				return m;
			}
			else if (v > arr[m]) {
				l = m;
			} else {
				r = m;
			}
			
			m =  (l+r)%2 ==0 ?  (r+l)/2 : (r+1+l)/2;
		}
		
		return -1;
	}
	
	public static int binarySearchUsingApi(int v, int [] arr) {
		
		return Arrays.binarySearch(arr, v);
	}
	
	public boolean searchBinary(List<T> list, T key, Comparator<T> c){
			return Collections.binarySearch(list, key, c) > 0;
	}
	
	public boolean searchBinary(List<? extends Comparable<? super T>> list, T key){
		return Collections.binarySearch(list, key) > 0;
	}

	public boolean arraySearch(T[] array, T key) {
		if (array == null || array.length == 0 || key == null) {
			return false;
		}
		return Arrays.asList(array).contains(key);
	}
	
	
}


