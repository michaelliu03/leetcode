package com.leetcode;

import com.leetcode.lib.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 *
 * 1.链表判空
 *
 * 2.定义虚拟头结点root，用于存储删除元素后的链表，最终返回root.next即可
 *
 * 3.定义指针cur，从root开始用于遍历root所存储的链表，cur其实也算是root的尾指针
 *
 * 4.head后移，直到head为空为止
 *
 * 5.在4循环中，如果head当前节点的值不等于指定值val，将该节点尾插法到root下；否则跳过该节点
 *
 * 6.为了避免cur与原链表还有关联，将cur的下一跳制空
 *
 * 7.返回root.next即为删除元素后的链表
 *
 */

public class removeElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head ==null){
            return null;
        }
        ListNode root = new ListNode(0);

        ListNode cur = root;
        while(head != null){
            if(head.val != val){
                cur.next = head;
                cur = cur.next;
            }
            head = head.next;

        }
        cur.next = null;

        return root.next;


    }
}
