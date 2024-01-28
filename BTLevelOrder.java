package com.vinay.practice.lc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/binary-tree-level-order-traversal/


public class BTLevelOrder {
	
	 // Definition for a binary tree node.
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	
	public List<List<Integer>> levelOrder(TreeNode root) {
	        
	        List<List<Integer>> levelList = new ArrayList<List<Integer>>();
	       
	        if(root == null)
	            return levelList;
	
	        Queue<TreeNode> queueList = new LinkedList<>();
	        queueList.offer(root);
	
	        while(!queueList.isEmpty()) {
	
	            int levelSize = queueList.size();
	            List<Integer> level = new ArrayList<Integer>(levelSize);
	
	            for(int i=0; i<levelSize; i++){
	                
	                TreeNode node = queueList.poll();
	                level.add(node.val);
	                if(node.left != null){
	                    queueList.offer(node.left);
	                }
	                if(node.right != null){
	                    queueList.offer(node.right);
	                }
	
	            }
	            levelList.add(level);
	
	        }
	
	        return levelList;
	
	    }
}
