package com.vinay.practice.lc;


// https://leetcode.com/problems/linked-list-cycle-ii/description/


import java.util.HashSet;

public class LinkedListCycle2 {

	
	 // Definition for singly-linked list.
	  class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 
	public class Solution {
	    public ListNode detectCycle(ListNode head) {
	        HashSet<ListNode> existingNodes = new HashSet<>();

	        while(head != null){
	            if(!existingNodes.contains(head)){
	                existingNodes.add(head);
	                head = head.next;
	            } else {
	                return head;
	            }
	            
	        }
	        return null;

	    }
	}
}
