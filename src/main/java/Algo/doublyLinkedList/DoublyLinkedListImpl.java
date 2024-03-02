package Algo.doublyLinkedList;

import java.util.List;

public class DoublyLinkedListImpl {

    private ListNode head;
    private ListNode tail;

    private int length;

    public DoublyLinkedListImpl() {
        this.tail = null;
        this.head = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }


    public static class ListNode {

        private int data;
        private ListNode previous;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }


    }


    public static void printNode(ListNode head) {

        if (head == null) {

            return;
        }
        System.out.print("null-->");
        ListNode temp=head;
        while (temp != null) {


            System.out.print(temp.data + "-->");
            temp = temp.next;
        }

        System.out.print("null");
    }


    public void insertAtBegining( int num) {
        ListNode current= head;
        ListNode temp=new ListNode(num);
        if (isEmpty()) {
            head=temp;
            tail=temp;


        } else {
            temp.next=head;

        }
        head.previous=temp;
        length++;
        head=temp;

    }


    public static void main(String[] args) {

        DoublyLinkedListImpl dbl = new DoublyLinkedListImpl();
//        dbl.head = new ListNode(1);
//        dbl.length++;
//
//        ListNode secondNode = new ListNode(10);
//        secondNode.previous = dbl.head;
//        dbl.head.next = secondNode;
//        dbl.tail = secondNode;
//        dbl.length++;
//
//        System.out.println("Length of List :" + dbl.length());
       printNode(dbl.head);
        System.out.println("---------");
        dbl.insertAtBegining(40);

        printNode(dbl.head);


    }
}
