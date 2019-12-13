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
        myLinkedList.add(7);
        myLinkedList.print();

        myLinkedList.add(1, 20);
        myLinkedList.print();

        myLinkedList.deleteByIndex(0);
        myLinkedList.print();

        myLinkedList.getCountElement();


    }


}
