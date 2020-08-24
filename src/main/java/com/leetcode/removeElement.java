package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class removeElement {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<Integer>(); //将数据暂时存放在list中
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val)
                list.add(nums[i]);
        }

        if(list.size() != 0){
            for (int i = 0; i < list.size(); i++) { //再将list中的数据写回数组中
                nums[i] = list.get(i);
            }
        }

        return list.size() ; //返回数组length
    }
}
