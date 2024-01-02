package com.vinay.practice.lc;



// https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class RemoveDupLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode deleteDuplicates(ListNode head) {
	        
		ListNode dummy = new ListNode();
	    dummy.next = head;
	    ListNode prev = dummy;
	    
	    while(head != null){
	        
	        while(head.next != null && head.val == head.next.val)
	            head = head.next;
	        
	        if(prev.next == head)
	            prev = prev.next;
	        else
	            prev.next = head.next;
	
	        head = head.next;
	        
	    }
	    return dummy.next;


    }

}
