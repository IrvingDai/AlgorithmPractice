package com.djk.leetcode.Top100;

/**
 * @author ：djk
 * @description：TODO
 * @date ：2021/10/31 14:48
 */
public class No141 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {

        ListNode right = head, left = head;

        if(right == null || right.next == null)
            return false;

        while(right != null && right.next != null){

            right = right.next.next;
            left = left.next;
            if(right == left){
                return true;
            }

        }
        return false;

    }

}
