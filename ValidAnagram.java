package com.vinay.practice.lc;

import java.util.HashMap;

// https://leetcode.com/problems/valid-anagram/

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "anagram";
		String t = "nagaram";
		
		if((s.length() != t.length()))
            System.out.println("False");

        HashMap<Character, Integer> countS = new HashMap<Character, Integer>();
        HashMap<Character, Integer> countT = new HashMap<Character, Integer>();

        for(int i=0; i<s.length(); i++){
            // string s count
            Character cs = s.charAt(i);
            if (countS.containsKey(cs)){
                countS.put(cs, countS.get(cs)+1);

            } else{
                countS.put(cs, 1);
            }


            // string t count
            Character ct = t.charAt(i);
            if (countT.containsKey(ct)){
                countT.put(ct, countT.get(ct)+1);

            } else{
                countT.put(ct, 1);
            }
        }

        if(countS.equals(countT)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
	}

}
