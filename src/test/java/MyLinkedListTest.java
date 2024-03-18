import org.home.leetcode.hashmapset.*;
import org.home.linkedlist.MyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

    @Test
    public void test() {
        // ["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get","get",
        // "deleteAtIndex","deleteAtIndex","get","deleteAtIndex","get"]
        //[[],[1],[3],[1,2],[1],[1], [1],[3], [3],[0], [0],[0],[0]]
        //[null,null,null,null,2,null, 3,-1 ,null,null, 3,null,-1]

        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2);
        Assertions.assertEquals(2, list.get(1));
        list.deleteAtIndex(1);
        Assertions.assertEquals(3, list.get(1));
        Assertions.assertEquals(-1, list.get(3));
        list.deleteAtIndex(3);
        list.deleteAtIndex(0);
        System.out.println(list);
        Assertions.assertEquals(3, list.get(0));
        list.deleteAtIndex(0);
        System.out.println(list);
        Assertions.assertEquals(-1, list.get(0));

    }

}
