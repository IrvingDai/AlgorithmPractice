package com.djk.leetcode.Normal;

/**
 * @author ：djk
 * @description：TODO
 * @date ：2021/11/3 20:20
 */
public class No24 {




     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode swapPairs(ListNode head) {

        if(head.next == null || head == null)
            return head;

        ListNode temp = new ListNode();
        temp.next = head;
        ListNode pre = temp;
//        ListNode node1 = head;
//        ListNode node2 = head.next;
//        pre.next = node1.next;
//        node1.next = node2.next;
//        node2.next = node1;
//        pre = node2;

        while(pre.next != null && pre.next.next != null){
            ListNode node1 = pre.next;
            ListNode node2 = pre.next.next;
            node1.next = node2.next;
            node2.next = node1;
            pre.next = node2;
            pre = node1;
        }

        return temp.next;
    }
}
