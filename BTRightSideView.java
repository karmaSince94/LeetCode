package com.vinay.practice.lc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.vinay.practice.lc.BTLevelOrder.TreeNode;

public class BTRightSideView {

	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
	       
        if(root == null)
            return list;

        Queue<TreeNode> queueList = new LinkedList<>();
        queueList.offer(root);

        while(!queueList.isEmpty()) {

            int levelSize = queueList.size();

            for(int i=0; i<levelSize; i++){
                
                TreeNode node = queueList.poll();

                if(node.left != null){
                    queueList.offer(node.left);
                }
                if(node.right != null){
                    queueList.offer(node.right);
                }
                if(i == levelSize-1) {
                	list.add(node.val);
                }
            }
        }
        return list;

    }
    
}
