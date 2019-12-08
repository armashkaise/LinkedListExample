package LinkedListPack;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.print();

        myLinkedList.add(1, 2);
        myLinkedList.print();

        myLinkedList.delete(3);
        myLinkedList.print();

        myLinkedList.delete();
        myLinkedList.print();


    }


}
