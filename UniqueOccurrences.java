package com.vinay.practice.lc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {1,2,2,1,1,3};
		uniqueOccurrences(arr);

	}
	
	public static boolean uniqueOccurrences(int[] arr) {
        
		Map<Integer, Integer> countMap = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<arr.length; i++) {
			countMap.put(arr[i], countMap.getOrDefault(arr[i],0)+1);
		}
		
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			Integer val = entry.getValue();
			
			if(!set.contains(val))
				set.add(val);
			else
				return false;
			
		}
		
		return true;
		
    }

}
