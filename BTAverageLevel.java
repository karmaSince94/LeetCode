package com.vinay.practice.lc;


// https://leetcode.com/problems/average-of-levels-in-binary-tree/


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.vinay.practice.lc.BTLevelOrder.TreeNode;

public class BTAverageLevel {

	public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averageList = new ArrayList<Double>();
	       
	        if(root == null)
	            return averageList;
	
	        Queue<TreeNode> queueList = new LinkedList<>();
	        queueList.offer(root);
	
	        while(!queueList.isEmpty()) {
	
	            int levelSize = queueList.size();
	            Double average = 0.0;
	
	            for(int i=0; i<levelSize; i++){
	                
	                TreeNode node = queueList.poll();
	                average += node.val;
	                if(node.left != null){
	                    queueList.offer(node.left);
	                }
	                if(node.right != null){
	                    queueList.offer(node.right);
	                }
	
	            }
                average = average / levelSize;
	            averageList.add(average);
	
	        }
	
	        return averageList;
	
	    }
	
}
