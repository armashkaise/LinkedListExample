package LinkedListPack;

public class MyLinkedList {
    private MyNode first;
    private MyNode last;
    private int count;

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
        MyNode l = null;
        MyNode pred= null;
        for (int j = 0; j < count ; j++) {
            if (j == index){
                if (f != null) l = f;
                if (f.prev != null) pred = f.prev;
                MyNode newNode = new MyNode(l, i,pred);
                f.prev = newNode;
                if (index == 0) {
                    first = newNode;
                }
                else {
                    pred.next = newNode;
                }
                count++;
                break;
            }
            f = f.next;
        }
    }

    public void delete(){
        first = null;
    }

    public void delete(int i){
        MyNode f = first;
        MyNode prev = null;
        MyNode next = null;
        for (int j = 0; j < count; j++){
            if (f.item == i){
                if (f.prev != null)
                    prev = f.prev;
                if (f.next != null)
                    next = f.next;
                MyNode newNode = new MyNode(next.next, next.item, prev);
                if (newNode != null) prev.next = newNode;
                count--;
            }
            f = f.next;
        }
    }

    public void print(){
        System.out.println("****************************************");
        MyNode f = first;
        if (first == null){
            System.out.println("Значения не найдены");
            return;
        }
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
        System.out.println("****************************************");
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


