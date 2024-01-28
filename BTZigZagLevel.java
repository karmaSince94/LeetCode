package com.vinay.practice.lc;


// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import com.vinay.practice.lc.BTLevelOrder.TreeNode;

public class BTZigZagLevel {

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> levelList = new ArrayList<List<Integer>>();
	       
        if(root == null)
            return levelList;

        Deque<TreeNode> queueList = new LinkedList<>();
        queueList.offer(root);
        boolean reverse = false;

        while(!queueList.isEmpty()) {

            int levelSize = queueList.size();
            List<Integer> level = new ArrayList<Integer>(levelSize);

            for(int i=0; i<levelSize; i++) {
                
                if(!reverse){
                    TreeNode node = queueList.pollFirst();
                    level.add(node.val);
                    if(node.left != null){
                        queueList.addLast(node.left);
                    }
                    if(node.right != null){
                        queueList.addLast(node.right);
                    }
                } else {
                    TreeNode node = queueList.pollLast();
                    level.add(node.val);
                    if(node.right != null){
                        queueList.addFirst(node.right);
                    }
                    if(node.left != null){
                        queueList.addFirst(node.left);
                    }
                    
                }
            }
            reverse = !reverse;
            levelList.add(level);
        }
        return levelList;}
	
}
