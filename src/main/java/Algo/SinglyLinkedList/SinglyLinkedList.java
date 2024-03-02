package Algo.SinglyLinkedList;

public class SinglyLinkedList {

    private ListNode head;
    
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;

        }


    }

    private void printNode(ListNode head) {

        ListNode current = head;

        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");

    }

    private int Length() {

        if (head == null)
            return 0;
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;

    }

    private void insertAtBegining(int num) {

        ListNode newNode = new ListNode(num);
        newNode.next = head;
        head = newNode;


    }

    public void insertAtEnd(int num) {

        ListNode newNode = new ListNode(num);
        ListNode current = head;

        if (head == null) {
            head = newNode;
            return;
        }
        while (current.next != null) {

            current = current.next;
        }
        current.next = newNode;


    }

    /*Insert Node at any given position */
    private void insert(int num, int position) {

        ListNode newNode = new ListNode(num);
        if (head == null) {
            head = newNode;
            return;
        }
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            int count = 1;
            ListNode previous = head;
            while (count < position - 1) {

                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;


        }


    }


    /*Delete a node from first*/

    public ListNode deletAtFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        //temp.next=head;
        head = head.next;
        temp.next = null;
        return temp;


    }

    public ListNode deleteAtEnd() {

        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        ListNode temp = current;
        System.out.println(temp.data);
        previous.next = null;

        return temp;

    }

    public void deleteAtAnyPosition(int position) {

        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;

            }
            ListNode temp = previous.next;
            previous.next = temp.next;
            // temp=null;
            //return temp;
        }


    }

    public boolean seaarh(int num) {

        ListNode current = head;
        int count = 0;
        while (current != null) {

            if (current.data == num) {
                return true;

            }
            current = current.next;
            count++;
        }
        return false;
    }




    public ListNode middleofNode() {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;

    }


    public ListNode reverse() {
        ListNode current = head;
        ListNode next = null;
        ListNode previous = null;

        while (current != null) {


            next = current.next;
            current.next = previous;
            previous = current;
            current = next;


        }
        return previous;


    }


    public ListNode insertInSortedLinkedList()
    {
        ListNode current= head;
        ListNode previous=null;
        ListNode temp=new ListNode(11);
        while(current!=null && current.data<temp.data){

            previous= current;
            current=current.next;


        }
        temp.next=current;
        previous.next=temp;

        return head;
    }


    public void removeByKey(int num) {

        //1,8,10,11,16
        //11
        ListNode current=head;
        ListNode previous=null;

        if(current!=null && current.data==num )
        {
            head=current.next;
            return;
        }

        while(current!=null && current.data!=num) {
            previous = current;
            current=current.next;
        }
        //ListNode temp=current;
        if(current==null) return;

        previous.next=current.next;





       // return head;
    }






    public static void main(String[] args) {

        SinglyLinkedList sgl = new SinglyLinkedList();
        sgl.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        ListNode fifth = new ListNode(15);
        ListNode six = new ListNode(81);
        ListNode seven = new ListNode(111);
        ListNode eight = new ListNode(41);
        ListNode nine = new ListNode(89);
        ListNode ten = new ListNode(211);
        sgl.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = seven;
        seven.next = eight;
        eight.next = nine;
        sgl.printNode(sgl.head);
        int len = sgl.Length();
        System.out.println(len);
        sgl.insertAtBegining(60);
        sgl.printNode(sgl.head);
        sgl.printNode(sgl.head);
        sgl.insertAtEnd(90);
        sgl.printNode(sgl.head);
        sgl.insert(33, 4);
        sgl.printNode(sgl.head);
        sgl.insert(44, 8);
        sgl.printNode(sgl.head);
        ListNode node = sgl.deletAtFirst();
        System.out.println("Deleted Node:" + node.data);
        sgl.printNode(sgl.head);
        sgl.deleteAtEnd();
        sgl.printNode(sgl.head);

        sgl.deleteAtAnyPosition(3);
        sgl.printNode(sgl.head);
        System.out.println("Found  :" + sgl.seaarh(90));
        System.out.println("Found  :" + sgl.seaarh(44));
        System.out.println(sgl.middleofNode().data);
        ListNode head = sgl.reverse();
        sgl.printNode(head);


    }
}
