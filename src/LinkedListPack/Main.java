package LinkedListPack;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
       // System.out.println(6>>1);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.print();

        myLinkedList.add(1, 2);
        myLinkedList.print();

        myLinkedList.deleteByIndex(1);
        myLinkedList.print();

        myLinkedList.deleteByElement(4);
        myLinkedList.print();

        myLinkedList.findByElement(5);

        myLinkedList.findByIndex(1);

    }


}
