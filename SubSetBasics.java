package com.vinay.practice.lc;

import java.util.ArrayList;

public class SubSetBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		subsets("", s);
		
		System.out.println(subsetsList("", s));

	}
	
	public static void subsets(String p, String up) {
		
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		subsets(p+ch, up.substring(1));
		subsets(p, up.substring(1));
		
		
	}
	
	public static ArrayList<String> subsetsList(String p, String up) {
		
		if(up.isEmpty()) {
			System.out.println(p);
			ArrayList<String> list = new ArrayList<>();
			if(!p.isEmpty()) 
				list.add(p);
			return list;
		}
		
		ArrayList<String> temp = new ArrayList<>();
		
		char ch = up.charAt(0);
		
		temp.addAll(subsetsList(p+ch, up.substring(1)));
		temp.addAll(subsetsList(p, up.substring(1)));
		
		return temp;
	}

}
