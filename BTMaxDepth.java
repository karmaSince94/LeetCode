package com.vinay.practice.lc;

import com.vinay.practice.lc.BTLevelOrder.TreeNode;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/


public class BTMaxDepth {

	public int maxDepth(TreeNode root) {
		if(root == null)
            return 0;

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
