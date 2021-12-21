package com.djk.leetcode.Top100;

/**
 * @author ：djk
 * @description：TODO
 * @date ：2021/10/31 15:01
 */
public class No142 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {

        ListNode fast = head, slow = head;

        if(fast == null || fast.next == null)
            return null;

        while(fast != null && fast.next != null){

            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode temp = head;
                while(temp != slow){
                    temp = temp.next;
                    slow = slow.next;
                }
                return slow;
            }

        }
        return null;

    }

}
