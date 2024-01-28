package com.vinay.practice.lc;

import com.vinay.practice.lc.BTLevelOrder.TreeNode;

// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/


public class BTFlattenToLL {
	
	public void flatten(TreeNode root) {
		TreeNode current = root;

        while(current != null){

            if(current.left != null){

                TreeNode temp = current.left;
                while(temp.right != null){
                    temp = temp.right;
                }    
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;


        }
    }
}
