package algo;

import java.util.Collections;
import java.util.List;

public class Search {

		
	public boolean searchBinary(List<Integer> list, Integer value){
		
		return Collections.binarySearch(list, value) > 0;
		
	}
}
