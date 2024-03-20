package org.home.linkedlist;

public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        ListNode cycleHead = null;
        boolean hasCycle = false;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null && !hasCycle) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                hasCycle = true;
            }
        }

        if (hasCycle) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            cycleHead = slow;
        }

        return cycleHead;
    }
}
