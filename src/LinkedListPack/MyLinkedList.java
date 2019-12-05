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

    public void add(int cell, int i) {
        if (cell > count-1) {
            System.out.println("Заданый номер ячейки превышает количество имеющихся элементов");
            return;
        }
        MyNode l = last;
        for (int j = count-1; j > 0 ; j--) {

            if (j == cell){
                //***************************************


                //***************************************
            }

            MyNode predNod = l.prev;

            if (predNod != null) l = predNod;

        }

    }

    public void print(){

        MyNode l = last;
        for (int i = 0; i < count; i++) {

                MyNode predNod = l.prev;
                MyNode nextNod = l.next;

            int item = l.item;
            if (predNod != null) System.out.print("[" +  predNod.item + "] ");
            else System.out.print("[null] ");

            System.out.print(item);
            if (nextNod != null) System.out.print(" [" +  nextNod.item + "] ");
            else System.out.print(" [null]");

            System.out.println();

            if (predNod != null) l = predNod;

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


