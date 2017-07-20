package org.codeclan;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sam on 20/07/2017.
 */
public class LinkedListTest {

    @Test
    public void WhenCreated_SizeIsZero(){
        LinkedList list = new LinkedList();
        assertEquals(0, list.getSize());
    }

    @Test
    public void testSizeIs1() {
        Node node = new Node();
        LinkedList list = new LinkedList(node);
        assertEquals(1, list.getSize());
    }

    @Test
    public void testInsertFront() {
        Node node = new Node();
        Node node1 = new Node();
        LinkedList list = new LinkedList(node);
        list.insertFront(node1);
        assertEquals(2, list.getSize());
    }


}
