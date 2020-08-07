package com.leetcode;

import com.leetcode.lib.ListNode;

public class reverseList {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

        public ListNode reverseList(ListNode head) {
            ListNode newhead = new ListNode(-1);

            if(head == null || head.next ==null){
                return head;
            }
            else{

                newhead = reverseList(head.next);
                head.next.next = head;
                head.next = null;
            }
            return newhead;

        }

}
