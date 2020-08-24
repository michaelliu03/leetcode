package com.leetcode;

import com.leetcode.lib.ListNode;

public class partition {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode cur1 = dummy1;
        ListNode cur2 = dummy2;
        while(head != null){
            if(head.val < x){
                cur1.next = head;
                cur1 = head;
            }else{
                cur2.next = head;
                cur2 = head;
            }
            head = head.next;
        }
        cur2.next = null;
        cur1.next = dummy2.next;
        return dummy1.next;
    }
}
