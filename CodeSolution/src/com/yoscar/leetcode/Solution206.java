package com.yoscar.leetcode;

import com.yoscar.util.ListNode;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * 反转链表
 */
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tmpNode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = tmpNode;
        }
        return curr;
    }
}
