package com.vinay.practice.lc;

// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/submissions/1157046697/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.vinay.practice.lc.BTLevelOrder.TreeNode;

public class BTLevelOrderII {

public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
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
	            levelList.add(0, level);
	
	        }
	
	        return levelList;

    }
    
}
