package com.vinay.practice.lc;

public class MiddleNodeLL {

	
	public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(slow != null && slow.next != null){
            slow = slow.next.next;
            fast = fast.next;
        }
        return fast;

    }
}
