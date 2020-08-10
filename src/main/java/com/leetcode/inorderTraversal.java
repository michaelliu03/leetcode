package com.leetcode;

import com.leetcode.lib.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> recList = new ArrayList<>();
        if(root ==null){
            return recList;
        }

        helper(recList,root);
        return recList;
    }

    public void helper(List<Integer> recList, TreeNode root){
        if(root ==null)
            return ;
        helper(recList,root.left);
        recList.add(root.val);
        helper(recList, root.right);
    }
}
