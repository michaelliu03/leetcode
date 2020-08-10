package com.leetcode;

import com.leetcode.lib.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class preorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result  = new ArrayList<>();//List<>();
        if(root == null){
            return result;

        }
        helper(result,root);

        return result;
    }

    public void helper(List<Integer> resList, TreeNode root){
        if(root == null)
            return ;
        resList.add(root.val);
        helper(resList,root.left);
        helper(resList,root.right);
    }
}
