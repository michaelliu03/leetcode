package com.leetcode;

import com.leetcode.lib.TreeNode;

public class diameterOfBinaryTree {
    int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        findDepth(root);
        return max == Integer.MIN_VALUE?0:max-1;
    }

    private int findDepth(TreeNode root){
        if(root ==null) {
            return 0;
        }
        if(root.left == null && root.right ==null) {
            return 1;
        }

        int ld = findDepth(root.left);
        int rd = findDepth(root.right);
        max = Math.max(ld +rd +1,max);
        return Math.max(ld,rd) +1;
    }
}
