package com.djk.leetcode.Top100;

/**
 * @author ：djk
 * @description：TODO
 * @date ：2021/12/15 20:16
 */
public class No19 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast, slow;

        fast = head;
        slow = head;
        while(n > 1){
            fast = fast.next;
            n--;
        }
        if(fast.next == null){
            return head.next;
        }
        fast = fast.next;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;

    }

}
