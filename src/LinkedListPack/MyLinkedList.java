package LinkedListPack;

public class MyLinkedList {
    private MyNode first;
    private MyNode last;
    private int count;

    public void add(int value) {
        MyNode localLast = last;
        //MyNode f = first;
        MyNode newNode = new MyNode(null, value, localLast);
        last = newNode;
        if (localLast == null){
            first = newNode;
        }
        else {
            localLast.next = newNode;
        }
        count++;
    }

    public void add(int index, int value) {
        if (index > count-1) {
            System.out.println("Заданый номер ячейки превышает количество имеющихся элементов");
            return;
        }
        MyNode localFirst = first;
        MyNode localLast = null;
        MyNode predNode= null;
        for (int j = 0; j < count ; j++) {
            if (j == index){
                if (localFirst != null) localLast = localFirst;
                if (localFirst.prev != null) predNode = localFirst.prev;
                MyNode newNode = new MyNode(localLast, value,predNode);
                localFirst.prev = newNode;
                if (index == 0) {
                    first = newNode;
                }
                else {
                    predNode.next = newNode;
                }
                count++;
                break;
            }
            localFirst = localFirst.next;

        }
    }

    public void delete(){
        first = null;
    }

    public void delete(int value){
        MyNode localFirst = first;
        MyNode prevNode = null;
        MyNode nextNode = null;
        for (int j = 0; j < count; j++){
            if (localFirst.item == value){
                if (localFirst.prev != null)
                    prevNode = localFirst.prev;
                if (localFirst.next != null)
                    nextNode = localFirst.next;
                MyNode newNode = new MyNode(nextNode.next, nextNode.item, prevNode);
                if (newNode != null) prevNode.next = newNode;
                count--;
            }
            localFirst = localFirst.next;
        }
    }

    public void print(){
        System.out.println("****************************************");
        MyNode localFirst = first;
        if (first == null){
            System.out.println("Значения не найдены");
            return;
        }
        for (int i = 0; i < count; i++) {
                MyNode predNod = localFirst.prev;
                MyNode nextNod = localFirst.next;
                int item = localFirst.item;
            if (predNod != null) System.out.print("[" +  predNod.item + "] ");
            else System.out.print("[null] ");
            System.out.print(item);
            if (nextNod != null) System.out.print(" [" +  nextNod.item + "] ");
            else System.out.print(" [null]");
            System.out.println();
            if (nextNod != null) localFirst = nextNod;
        }
        System.out.println("****************************************");
    }
}

class MyNode{
    MyNode prev;
    MyNode next;
    int item;

    MyNode(MyNode last , int value, MyNode first){

        this.prev = first;
        this.item = value;
        this.next = last;
    }
}


