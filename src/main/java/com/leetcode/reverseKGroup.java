package com.leetcode;


import com.leetcode.lib.ListNode;

public class reverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode  currentNode = head;
        if (currentNode == null || k < 0){
            return head;
        }
        int count = 0;
        while(currentNode != null && count < k){
            currentNode = currentNode.next;
            count++;
        }
        if(count == k){
            currentNode = reverseKGroup(currentNode,k);
            while(count-- > 0){
                ListNode temp = head.next;
                head.next = currentNode;
                currentNode = head;
                head = temp;
            }
            head  = currentNode;
        }
        return head;
    }
}
