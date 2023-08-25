package com.vinay.practice.lc;


// https://leetcode.com/problems/linked-list-cycle/description/
	
	
public class LinkedListCycle {

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
	    public boolean hasCycle(ListNode head) {

	        if(head == null)
	            return false;

	        ListNode first = head;
	        ListNode sec = head.next;

	        while(sec != null && sec.next != null){
	            if(first == sec){
	                return true;
	            }
	            first = first.next;
	            sec = sec.next.next;
	        }
	        return false;
	    }
	}
	
}
