package com.vinay.practice.lc;

// https://leetcode.com/problems/validate-binary-search-tree/


import com.vinay.practice.lc.BTLevelOrder.TreeNode;

public class BTValidBST {

	public boolean isValidBST(TreeNode root) {
        return checkValid(root, null, null);
    }

    public boolean checkValid(TreeNode node, Integer low, Integer high){

        if(node == null){
            return true;
        }
        if(low != null && node.val <= low){
            return false;
        }

        if(high != null && node.val >= high){
            return false;
        }

        boolean leftTree = checkValid(node.left, low, node.val);
        boolean rightTree = checkValid(node.right, node.val, high);

        return leftTree && rightTree;

    }

}
