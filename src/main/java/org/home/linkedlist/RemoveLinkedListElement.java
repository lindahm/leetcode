package org.home.linkedlist;

public class RemoveLinkedListElement {
    public ListNode removeElements(ListNode head, int val) {
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            if (current.val == val) {

                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
            } else {
                previous = current;
            }
            current = current.next;
        }

        return head;
    }

    public ListNode removeElements_withDummyNode(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode currentNode = dummy;
        while (currentNode != null) {

            if (currentNode.next != null && currentNode.next.val == val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

        return dummy.next;
    }
}
