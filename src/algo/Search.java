package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Search<T> {

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


