package LinkedListPack;

import java.util.ArrayList;

public class MyLinkedList {
    private MyNode first;
    private MyNode last;
    private int count;
//    private ArrayList<MyNode> list = new ArrayList<MyNode>();

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
        //list.add(newNode);
        count++;
    }

    public void add(int index, int value) {
        if (index == count) {
            add(value);
            print();
            return;
        }
        if (index > (count-1)) {
            System.out.println("Заданый индекс ячейки превышает размер максимального индекса списка");
            return;
        }
        if (index < 0) {
            System.out.println("Заданый индекс ячейки не соответствует списку");
            return;
        }
        int def = count / 2;

        if (index <= def){
            MyNode localFirst = first;
            MyNode predNode = null;
            MyNode nextNode = null;
            for (int i = 0; i <= def; i++) {
                if (i == index){
                    break;
                }
                else localFirst = localFirst.next;
            }
            if (localFirst != null){
                predNode = localFirst.prev;
                nextNode = localFirst.next;
            }
            MyNode newNode = new MyNode(nextNode.prev, value,predNode);
            if (index == 0){
                localFirst.prev = newNode;
                first = newNode;
            }
            else {
                predNode.next = newNode;
                localFirst.prev = newNode;
            }
            count++;
        }
        if (index > def){
            MyNode localLast = last;
            MyNode predNode = null;
            MyNode nextNode = null;
            for (int i = count-1; i >= 0; i--) {
                if (i == index){
                    break;
                }
            localLast = localLast.prev;
            }
            if (localLast != null){
                predNode = localLast.prev;
                nextNode = localLast;
            }


            MyNode newNode = new MyNode(nextNode, value,predNode);
            if (index == (count-1)){
                predNode.next = newNode;
                newNode.next = localLast;
                localLast.prev = newNode;
                last = nextNode;
            }
            else {
                predNode.next = newNode;
                localLast.prev = newNode;
            }
            count++;
        }
        print();
    }


    public void deleteByIndex(int index){
        if (index > (count-1)) {
            System.out.println("Заданый индекс ячейки превышает размер максимального индекса списка");
            return;
        }
        if (index < 0) {
            System.out.println("Заданый индекс ячейки не соответствует списку");
            return;
        }
        int def = count / 2;

        if (index <= def) {
            MyNode localFirst = first;
            MyNode predNode = null;
            MyNode nextNode = null;
            for (int i = 0; i <= def; i++) {
                if (i == index) {
                    break;
                } else localFirst = localFirst.next;
            }
            if (localFirst != null) {
               predNode = localFirst.prev;
               nextNode = localFirst.next;

               if (predNode != null) predNode.next = nextNode;
               if (nextNode != null) nextNode.prev = predNode;
            }
        }
        if (index > def) {
            MyNode localLast = last;
            MyNode predNode = null;
            MyNode nextNode = null;
            for (int i = count - 1; i >= 0; i--) {
                if (i == index) {
                    break;
                }
                localLast = localLast.prev;
            }
            if (localLast != null) {
                predNode = localLast.next;
                nextNode = localLast.prev;

                predNode.next = nextNode;
                nextNode.prev = predNode;
            }
        }
        print();
//        if (index < 0 || index >= list.size()){
//            System.out.println("Значение индекса вне диапазона");
//            return;
//        }
//
//        MyNode node = findNodeByIndex(index);
//        MyNode predNode = null;
//        if (index == list.size()-1){
//            predNode = list.get(index-1);
//            predNode.next = null;
//        }
//        else if (index == 0){
//            predNode = node.next;
//            predNode.prev = null;
//
//        }
//        else   {
//            predNode = list.get(index-1);
//            MyNode someNode = node.next;
//            predNode.next = someNode;
//            someNode.prev = predNode;
//        }
//        System.out.println("Удаление объекта под индерсом "+ index + " завершено!");
//
//        list.remove(index);

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
        MyNode localFirst = first;
        if (localFirst == null){
            System.out.println("Значения не найдены");
            return;
        }
        System.out.println("****************************************");
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

    public void findByElement(int value){
        //MyLinkedList myLinkedList = new MyLinkedList();
//        MyNode node = findNodeByElement(value);
//
//        if (list.contains(node)){
//
//            System.out.println("Объект " + value + " найден на позиции " + list.indexOf(node));
//            return;
//        }
//
//        System.out.println("Элемент не был найден");
    }

//    public void findByIndex(int index){
//        System.out.println("На позиции " + index + " найдено значение " + findNodeByIndex(index).item);
//    }

//    private MyNode findNodeByIndex(int index){
//     //   return list.get(index);
//    }

//    private MyNode findNodeByElement(int value){
////        MyNode node = null;
////        for (MyNode someNode : list){
////            if (value == someNode.item){
////                node = someNode;
////                break;
////            }
////        }
////        return node;
//    }


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


