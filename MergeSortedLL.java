package com.vinay.practice.lc;

public class MergeSortedLL {

	
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode newHead = new ListNode();
        ListNode temp = newHead;

        if(list1 == null)
            return list2;

        if(list2 == null)
            return list1;

        while(list1 != null && list2 != null){

            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
                
            } else {
                temp.next = list2;
                list2 = list2.next; 
                temp = temp.next;
            }

        }

        
        if(list1 != null){
            temp.next = list1;
        }

        if(list2 != null){
            temp.next = list2;
        }

        return newHead.next;
    }
}
