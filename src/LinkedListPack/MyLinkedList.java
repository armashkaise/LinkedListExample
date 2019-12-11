package LinkedListPack;

import java.util.ArrayList;

public class MyLinkedList {
    private MyNode first;
    private MyNode last;
    private int count;
    private ArrayList<MyNode> list = new ArrayList<MyNode>();

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
        list.add(newNode);
        count++;
    }

    public void add(int index, int value) {
        if (index > (list.size() - 1)) {
            System.out.println("Заданый номер ячейки превышает количество имеющихся элементов");
            return;
        }
        MyNode predNode = null;
        MyNode node = list.get(index);
        MyNode predNodeNext = null;
        if (index > 0) {
            predNode = list.get(index-1);
            predNodeNext = predNode.next;
        }
        else{
        }
        MyNode newNode = new MyNode(predNodeNext, value,node.prev);
        if (index == 0){
            newNode.next = node;
            node.prev = newNode;
            first = newNode;
        }
        else {
            predNode.next = newNode;
            node.prev = newNode;
        }
        list.add(index, newNode);

    }

    public void delete(){
        first = null;
    }

    public void deleteByElement(int value){

        MyNode node;
        node = findNodeByElement(value);
         if (node != null){
             MyNode prevNode = node.prev;
             MyNode nextNode = node.next;
             prevNode.next = nextNode;
             nextNode.prev = prevNode;
             if (list.contains(node)){
                 list.remove(node);
                 System.out.println("Удаление объекта "+ node.item + " завершено!");
             }
         }
    }

    public void deleteByIndex(int index){
        if (index < 0 || index >= list.size()){
            System.out.println("Значение индекса вне диапазона");
            return;
        }

        MyNode node = findNodeByIndex(index);
        MyNode predNode = null;
        if (index == list.size()-1){
            predNode = list.get(index-1);
            predNode.next = null;
        }
        else if (index == 0){
            predNode = node.next;
            predNode.prev = null;

        }
        else   {
            predNode = list.get(index-1);
            MyNode someNode = node.next;
            predNode.next = someNode;
            someNode.prev = predNode;
        }
        System.out.println("Удаление объекта под индерсом "+ index + " завершено!");

        list.remove(index);

    }

    public void delete(int value){


//        MyNode localFirst = first;
//        MyNode prevNode = null;
//        MyNode nextNode = null;
//        for (int j = 0; j < count; j++){
//            if (localFirst.item == value){
//                if (localFirst.prev != null)
//                    prevNode = localFirst.prev;
//                if (localFirst.next != null)
//                    nextNode = localFirst.next;
//                MyNode newNode = new MyNode(nextNode.next, nextNode.item, prevNode);
//                if (newNode != null) prevNode.next = newNode;
//                count--;
//            }
//            localFirst = localFirst.next;
//        }
    }

    public void print(){
        if (list.size() == 0){
            System.out.println("Значения не найдены");
            return;
        }
        System.out.println("****************************************");
        for (int i = 0; i < list.size(); i ++){
            MyNode nod = list.get(i);

            MyNode predNod = nod.prev;
            MyNode nextNod = nod.next;
            int item = nod.item;

            if (predNod != null) System.out.print("[" +  predNod.item + "] ");
            else System.out.print("[null] ");
            System.out.print(item);
            if (nextNod != null) System.out.print(" [" +  nextNod.item + "] ");
            else System.out.print(" [null]");
            System.out.println();
        }
//        MyNode localFirst = first;
//        if (first == null){
//            System.out.println("Значения не найдены");
//            return;
//        }
//        for (int i = 0; i < count; i++) {
//                MyNode predNod = localFirst.prev;
//                MyNode nextNod = localFirst.next;
//                int item = localFirst.item;
//            if (predNod != null) System.out.print("[" +  predNod.item + "] ");
//            else System.out.print("[null] ");
//            System.out.print(item);
//            if (nextNod != null) System.out.print(" [" +  nextNod.item + "] ");
//            else System.out.print(" [null]");
//            System.out.println();
//            if (nextNod != null) localFirst = nextNod;
//        }
        System.out.println("****************************************");
    }

    public void findByElement(int value){
        //MyLinkedList myLinkedList = new MyLinkedList();
        MyNode node = findNodeByElement(value);

        if (list.contains(node)){

            System.out.println("Объект " + value + " найден на позиции " + list.indexOf(node));
            return;
        }

        System.out.println("Элемент не был найден");
    }

    public void findByIndex(int index){
        System.out.println("На позиции " + index + " найдено значение " + findNodeByIndex(index).item);
    }

    private MyNode findNodeByIndex(int index){
        return list.get(index);
    }

    private MyNode findNodeByElement(int value){
        MyNode node = null;
        for (MyNode someNode : list){
            if (value == someNode.item){
                node = someNode;
                break;
            }
        }
        return node;
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


