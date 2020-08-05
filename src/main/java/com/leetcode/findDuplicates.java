package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findDuplicates {

        public List<Integer> findDuplicates(int[] nums) {
            HashSet<Integer> copySet = new HashSet<>();
            List<Integer> resList = new ArrayList<>();

            for(int i : nums){
                if(!copySet.add(i)){
                    resList.add(i);
                }
            }
            return resList;
        }

}
