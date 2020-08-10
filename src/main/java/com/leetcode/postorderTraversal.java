package com.leetcode;

import com.leetcode.lib.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class postorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> recList = new ArrayList<Integer>();
        if (root == null){
            return recList;
        }
        helper(recList,root);

        return recList;

    }

    public void helper(List<Integer> recList, TreeNode root){
        if(root ==null){
            return ;
        }
        helper(recList,root.left);
        helper(recList,root.right);
        recList.add(root.val);

    }
}
