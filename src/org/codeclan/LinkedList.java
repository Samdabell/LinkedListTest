package org.codeclan;

/**
 * Created by Sam on 20/07/2017.
 */
public class LinkedList {

    Node head;

    public LinkedList(Node node) {
        this.head = node;
    }

    public LinkedList() {
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        if (getHead() == null) {
            return 0;
        } else {
            Node currentNode = getHead();
            int counter = 1;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
                counter++;
            }
            return counter;
        }
    }

    public void insertFront(Node newHead) {
        newHead.setNext(getHead());
        setHead(newHead);
    }
}
