package com.vinay.practice.lc;

public class ReverseLinkedList {

	
public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr; //prev = prev.next;
            curr = temp;
        }

        return prev;

    }
}
