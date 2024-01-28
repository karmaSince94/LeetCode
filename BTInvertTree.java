package com.vinay.practice.lc;

// https://leetcode.com/problems/invert-binary-tree/

import com.vinay.practice.lc.BTLevelOrder.TreeNode;

public class BTInvertTree {

	
	public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;

    }
}
