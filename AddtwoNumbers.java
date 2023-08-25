package com.vinay.practice.lc;


/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, 
 * and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddtwoNumbers {

	
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        // System.out.println(temp.val);
        int sum = 0;
        while (l1 != null || l2 != null || sum > 0){
            
            if(l1 != null){
                sum = sum + l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum = sum + l2.val;
                l2 = l2.next;
            }

            temp.next = new ListNode(sum % 10);
            System.out.println(temp.val + " " + sum);
            sum = sum / 10;
            temp = temp.next;
            
        }
        return result.next;
    }

}
