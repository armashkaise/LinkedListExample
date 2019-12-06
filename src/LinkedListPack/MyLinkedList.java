package LinkedListPack;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyLinkedList {
    private MyNode first;
    private MyNode last;
    private int count;
    //ArrayList list = new ArrayList();

    public void add(int i) {
        MyNode l = last;
        MyNode f = first;

        MyNode newNode = new MyNode(null, i, l);
        last = newNode;
        if (l == null){
            first = newNode;
        }
        else {
            l.next = newNode;
        }

        count++;
    }



    public void add(int index, int i) {
        if (index > count-1) {
            System.out.println("Заданый номер ячейки превышает количество имеющихся элементов");
            return;
        }




        MyNode f = first;

        for (int j = 0; j < count-1 ; j++) {

            if (j == index){
                //***************************************

                MyNode l = f;
                //MyNode f = f.prev;
                MyNode newNode = new MyNode(l, i, f.prev);
                f.next = newNode;
                break;

                //***************************************
            }
            //print();

            f = f.next;

            //if (predNod != null) l = predNod;

        }

    }

    public void print(){

        MyNode f = first;
        for (int i = 0; i < count; i++) {

                MyNode predNod = f.prev;
                MyNode nextNod = f.next;
                int item = f.item;

            if (predNod != null) System.out.print("[" +  predNod.item + "] ");
            else System.out.print("[null] ");
            System.out.print(item);
            if (nextNod != null) System.out.print(" [" +  nextNod.item + "] ");
            else System.out.print(" [null]");

            System.out.println();

            if (nextNod != null) f = nextNod;

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


