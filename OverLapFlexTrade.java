package com.vinay.practice.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverLapFlexTrade {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		List<List<Integer>> intervalList = new ArrayList<>();
		// intervalList.add(Collections.AsList({[1,3],[2,6],[8,10],[15,18]})
		int[] arr1 = new int[]{1,3};
		int[] arr2 = new int[]{2,6};
		int[] arr3 = new int[]{8,10};
		int[] arr4 = new int[]{15,18};
		intervalList.add(Arrays.asList(arr1));
		intervalList.add(Arrays.asList(arr2));
		intervalList.add(Arrays.asList(arr3));
		intervalList.add(Arrays.asList(arr4));
		List<List<Integer>> newList = overlap(intervalList);
		System.out.println(newList.toString());
	}
	
	public static List<List<Integer>> overlap(List<List<Integer>> intervalList){
  
      List<Integer> temp = new ArrayList<>();
      
      for(int i=0,j=i+1; i<intervalList.size() ; i++){
        
        List<Integer> obj1 = intervalList.get(i);
        List<Integer> obj2 = intervalList.get(j);
        
        if(obj1.get(obj1.size()-1) > obj2.get(0) && ((j-1) >= i)) {
          // merge list
          // temp.add(Collections.AsList(){obj1.get(0), obj2.get(obj2.size()-1)});
          int[] newObj = new int[]{obj1.get(0), obj2.get(obj2.size()-1)};
          temp.add(newObj);
        } else {
        	temp.add(obj.get(j));
          
        }
      }
    }

}
