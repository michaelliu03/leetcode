package com.leetcode;

public class maxArea {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int res = 0;
        while(i < j){
            int area = (j - i) * Math.min(height[i],height[j]);  //面积为底乘以高
            res = Math.max(res,area);  //选出大的面积
            if(height[i] <= height[j]){
                i++;
            }else{
                j--;
            }
        }
        return res;
    }
}
