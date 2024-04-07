package org.home.linkedlist;

public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode lastNode = head;

        while (lastNode != null && lastNode.next != null) {
            ListNode newHead = lastNode.next;

            lastNode.next = newHead.next;
            newHead.next = head;
            head = newHead;
       }
       return head;
    }

    public ListNode reverseList_recursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList_recursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
