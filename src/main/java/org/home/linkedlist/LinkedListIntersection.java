package org.home.linkedlist;

public class LinkedListIntersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode listA = headA;
        ListNode listB = headB;

        while (listA != listB) {
            listA = listA == null ? headB : listA.next;
            listB = listB == null ? headA : listB.next;
        }

        return listA;
    }
}
