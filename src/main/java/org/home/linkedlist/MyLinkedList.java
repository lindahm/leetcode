package org.home.linkedlist;

public class MyLinkedList {

        private static class Node {
            Node prev;
            int val;
            Node next;

            public Node(Node prev, int val, Node next) {
                this.prev = prev;
                this.val = val;
                this.next = next;
            }
        }

        Node head = null;
        int length = 0;

        public MyLinkedList() {

        }

        public int get(int index) {
            Node nodeAtIndex = getNodeAtIndex(index);

            return nodeAtIndex != null ? nodeAtIndex.val : -1;
        }

        public void addAtHead(int val) {
            Node newHead = new Node(null, val, head);

            if (head != null) {
                head.prev = newHead;
            }
            this.head = newHead;
            this.length++;
        }

        public void addAtTail(int val) {
            if (head == null) {
                head = new Node(null, val, null);
            } else {
                Node tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                Node newTail = new Node(tail, val, null);
                tail.next = newTail;
            }
            this.length++;
        }

        public void addAtIndex(int index, int val) {
            if (index == 0) {
                addAtHead(val);

            } else if (index == this.length) {
                addAtTail(val);

            } else if (index > 0 && index < length) {
                Node nodeAtIndex = getNodeAtIndex(index);
                Node newNode = new Node(nodeAtIndex.prev, val, nodeAtIndex);
                nodeAtIndex.prev.next = newNode;
                nodeAtIndex.prev = newNode;
                this.length++;
            }

        }

        public void deleteAtIndex(int index) {
            Node nodeAtIndex = getNodeAtIndex(index);

            if (nodeAtIndex != null) {
                // If head
                if (nodeAtIndex.prev == null) {
                    head = nodeAtIndex.next;
                    if (head != null) {
                        head.prev = null;
                    }
                    // If tail
                } else if (nodeAtIndex.next == null) {
                    nodeAtIndex.prev.next = null;
                } else {
                    nodeAtIndex.prev.next = nodeAtIndex.next;
                    nodeAtIndex.next.prev = nodeAtIndex.prev;
                }
                this.length--;
            }
        }

        private Node getNodeAtIndex(int index) {
            Node nodeAtIndex = null;

            if (index >= 0 && index < length) {
                nodeAtIndex = head;
                for (int i = 0; i < index; i++) {
                    nodeAtIndex = nodeAtIndex.next;
                }
            }
            return nodeAtIndex;
        }

        public String toString() {
            Node currentNode = head;
            StringBuilder sb = new StringBuilder();
            while (currentNode != null) {
                sb.append(currentNode.val).append(" - ");
                currentNode = currentNode.next;
            }
            return sb.toString();
        }
}
