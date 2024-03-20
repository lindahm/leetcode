package org.home.linkedlist;

public class LinkedListCycle {

    public boolean detectCycle(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       while (fast != null && fast.next != null) {
           slow = slow.next;
           fast = fast.next.next;
           if (fast == slow) {
               return true;
           }
       }
       return false;
    }

}
