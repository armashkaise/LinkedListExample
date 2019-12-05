package LinkedListPack;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyLinkedList {
    MyNode first;
    MyNode last;
    int count;

    public void add(int i) {
        MyNode l = last;
        MyNode f = first;
        MyNode newNode = new MyNode(f, i, l);
        if (last != null)
            last.next = newNode;
        last = newNode;
        count++;
    }

    public void print(){


        for (int i = 0; i < count; i++) {

                MyNode predNod = last.prev;
                MyNode nextNod = last.next;

            int item = last.item;
            if (predNod != null) System.out.print("[" +  predNod.item + "] ");
            else System.out.print("[null] ");

            System.out.print(item);
            if (nextNod != null) System.out.print(" [" +  nextNod.item + "] ");
            else System.out.print(" [null]");

            System.out.println();

            if (predNod != null) last = predNod;

        }
    }



}

class MyNode{
    MyNode prev;
    MyNode next;
    int item;

    MyNode(MyNode first, int i, MyNode last){
        this.prev = last;
        this.item = i;
        this.next = first;
    }
}


