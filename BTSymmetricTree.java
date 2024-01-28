package com.vinay.practice.lc;

// https://leetcode.com/problems/symmetric-tree/submissions/1158723844/

import java.util.LinkedList;
import java.util.Queue;

import com.vinay.practice.lc.BTLevelOrder.TreeNode;

public class BTSymmetricTree {

	public boolean isSymmetric(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while(!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if(left == null && right == null)
                continue;
            
            if(left == null || right == null)
                return false;

            if(left.val != right.val)
                return false;
            
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }

        return true;

    }
}
