package com.leetcode;

import com.leetcode.lib.ListNode;

public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode p3=new ListNode(0);
        ListNode p=p3;
        while(true){
            if(p1==null&&p2==null){
                break;
            }else if(p1!=null&&p2==null){
                p.next=p1;
                break;
            }else if(p1==null&&p2!=null){
                p.next=p2;
                break;
            }else if(p1.val<=p2.val){
                p.next=p1;
                p1=p1.next;
            }else{
                p.next=p2;
                p2=p2.next;
            }
            p=p.next;
        }

        return p3.next;

    }
}
