package com.vinay.practice.lc;

// https://leetcode.com/problems/diameter-of-binary-tree/submissions/1158754653/

import com.vinay.practice.lc.BTLevelOrder.TreeNode;

public class BTDiameter {

	int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return diameter;
    }

    public int getHeight(TreeNode node){

        if(node == null)
            return 0;

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        int dia = leftHeight + rightHeight;
        diameter = Math.max(diameter, dia);

        return Math.max(leftHeight, rightHeight) + 1;


    }
}
