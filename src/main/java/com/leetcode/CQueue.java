package com.leetcode;

import java.util.LinkedList;

public class CQueue {
    LinkedList<Integer> A,B;

    public CQueue() {
        A = new LinkedList<>();
        B = new LinkedList<>();
    }

    public void appendTail(int value) {
        A.add(value);
    }

    public int deleteHead() {
        if(!B.isEmpty()){
            return B.remove();
        }
        if(A.isEmpty()){
            return -1;
        }
        while (!A.isEmpty()){
            B.add(A.remove());
        }

        return B.remove();
    }
}
