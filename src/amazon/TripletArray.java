package amazon;

import java.util.Arrays;

import utils.ArrayUtils;

/**
*
* @author khaitq on 19 août 2018
* 
* Given an array of integers, write a function that find all  
* triplet (a, b, c) that satisfies a + b + c =  v .
* 
* Solution 1: O(n3)
* 
* Solution 2: O(n2) : sort and search
*/

public class TripletArray {

	public static void main(String[] args) {
		
		int[] arr  =  { 130, 11, 13, 5, 6, 20, 9, 100, 1, 3 , 10 , 0 };
		int  v = 23;
		
		System.out.print(isTripletArray(arr, v));
	}
	
	public static boolean isTripletArray(int[] arr, int v) {
		
		boolean result = false; 
		Arrays.sort(arr);
		
		ArrayUtils.printArray(arr);
		
		int i = 0; 
		int j = arr.length - 1;
		
		while (i + 1 < j) {
			
			if (arr[i] + arr[j] < v) {
				
				boolean f = false;
				
				for (int k = i + 1; k < j; k++) {
					
					if (arr[j] + arr[i] + arr[k] == v) {
						System.out.println(arr[i] + " - " +   arr[k] + " - " + arr[j]);
						f = true;
						result = true;
					}
				}
				
				if (f) {
					j--;
				} else {
					i ++;
				}
				
			} else {
				j --;
			}
		}
		
		return result;
	}

}


