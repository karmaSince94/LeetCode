package com.vinay.practice.lc;

// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/submissions/1157086727/
import java.util.List;


public class PopulateNextRightPointers {

	//Definition for a Node.
	class Node {
		 public int val;
		 public Node left;
		 public Node right;
		 public Node next;
		
		 public Node() {}
		 
		 public Node(int _val) {
		     val = _val;
		 }
		
		 public Node(int _val, Node _left, Node _right, Node _next) {
		     val = _val;
		     left = _left;
		     right = _right;
		     next = _next;
		 }
	};
	
	public Node connect(Node root) {
		
		if(root == null)
			return root;
		
		Node leftmost = root;
		
		while(leftmost.left != null) {
			
			Node current = leftmost;
			while(current!= null) {
				current.left.next = current.right;
				if(current.next != null) {
					current.right.next = current.next.left;
				}
				current = current.next;
				
			}
			leftmost = leftmost.left;
			
		}
		
		return root;
		
		
	}
	
}
