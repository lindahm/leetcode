package org.home.linkedlist;

public class RemoveNthElementFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int nthIndex = 0;
        int endIndex = 0;
        ListNode nthPrevNode = head;
        ListNode currentNode = head;

        while (currentNode.next != null) {
            if (endIndex > n - 1) {
                nthIndex++;
                nthPrevNode = nthPrevNode.next;
            }
            endIndex++;
            currentNode = currentNode.next;
        }

        int listSize = endIndex + 1;
        // If We Remove the Head Node
        if (nthPrevNode == head && n == listSize) {
            head = nthPrevNode.next;
        } else {
            nthPrevNode.next = nthPrevNode.next.next;
        }

        return head;
    }
}
