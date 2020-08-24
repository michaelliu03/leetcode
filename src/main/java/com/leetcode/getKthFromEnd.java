package com.leetcode;

import com.leetcode.lib.ListNode;

public class getKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p1 = head;
        ListNode p2 = head;
        int count = 1;
        while (count <= k) {
            p2 = p2.next;
            ++count;
        }
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
