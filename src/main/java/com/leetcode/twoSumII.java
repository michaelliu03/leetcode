package com.leetcode;

public class twoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length -1;
        int result[] = new int[2];
        while(start < end){
            int temp = numbers[start] + numbers[end];
            if (temp == target){
                result[0] = start +1;
                result[1] = end +1;
                return result;
            }else if (temp < target){
                int t = numbers[start];
                start++;
                while(numbers[start] == t){
                    start++;
                }
            }else{
                int t = numbers[end];
                end--;
                while(numbers[end] == t){
                    end--;
                }
            }
        }

        return result;

    }
}
