package LinkedListPack;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(3);
        myLinkedList.add(5);
        myLinkedList.add(7);

        myLinkedList.add(1, 2);


       myLinkedList.print();

////
////        myLinkedList.print();

       LinkedList linkedList = new LinkedList();
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(1, 3);

    }


}
